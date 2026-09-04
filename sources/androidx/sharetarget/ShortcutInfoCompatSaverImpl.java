package androidx.sharetarget;

import a0.f;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c0.l;
import c5.x;
import e0.p0;
import g0.c;
import g0.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u4.g;
import u4.h;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class ShortcutInfoCompatSaverImpl extends e {
    public static final Object h = new Object();
    public static volatile ShortcutInfoCompatSaverImpl i;
    public final Context a;
    public final f b = new f(0);
    public final f c = new f(0);
    public final ThreadPoolExecutor d;
    public final ThreadPoolExecutor e;
    public final File f;
    public final File g;

    public ShortcutInfoCompatSaverImpl(Context context, ThreadPoolExecutor threadPoolExecutor, ThreadPoolExecutor threadPoolExecutor2) {
        this.a = context.getApplicationContext();
        this.d = threadPoolExecutor;
        this.e = threadPoolExecutor2;
        File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.g = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.f = new File(file, "targets.xml");
        threadPoolExecutor.submit(new u4.e(2, this, file));
    }

    public static void f(File file) {
        if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
            file.mkdirs();
        }
    }

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (i == null) {
            synchronized (h) {
                try {
                    if (i == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        i = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return i;
    }

    @Override // g0.e
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            c cVar2 = new c();
            cVar2.a = cVar.a;
            cVar2.b = cVar.b;
            Intent[] intentArr = cVar.c;
            cVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            cVar2.d = cVar.d;
            cVar2.e = cVar.e;
            cVar2.f = cVar.f;
            cVar2.g = cVar.g;
            cVar2.h = cVar.h;
            cVar2.k = cVar.k;
            cVar2.l = cVar.l;
            cVar2.m = cVar.m;
            p0[] p0VarArr = cVar.i;
            if (p0VarArr != null) {
                cVar2.i = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
            }
            if (cVar.j != null) {
                cVar2.j = new HashSet(cVar.j);
            }
            PersistableBundle persistableBundle = cVar.n;
            if (persistableBundle != null) {
                cVar2.n = persistableBundle;
            }
            if (TextUtils.isEmpty(cVar2.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr2 = cVar2.c;
            if (intentArr2 == null || intentArr2.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            arrayList.add(cVar2);
        }
        l lVar = new l();
        this.d.submit(new u4.f(this, arrayList, lVar, 1));
        return lVar;
    }

    @Override // g0.e
    public final List b() {
        return (List) this.d.submit(new x(this, 3)).get();
    }

    @Override // g0.e
    public final Object c() {
        l lVar = new l();
        this.d.submit(new u4.e(3, this, lVar));
        return lVar;
    }

    @Override // g0.e
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        l lVar = new l();
        this.d.submit(new u4.f(this, arrayList, lVar, 0));
        return lVar;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h hVar = (h) obj;
            if (!TextUtils.isEmpty(hVar.b)) {
                arrayList2.add(hVar.b);
            }
        }
        for (File file : this.g.listFiles()) {
            if (!arrayList2.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public final IconCompat g(String str) {
        int i10;
        Context context = this.a;
        h hVar = (h) this.d.submit(new g(0, this, str)).get();
        if (hVar == null) {
            return null;
        }
        String str2 = hVar.a;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i10 = context.getResources().getIdentifier(str2, null, null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 != 0) {
                return IconCompat.d(context, i10);
            }
        }
        if (TextUtils.isEmpty(hVar.b)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.e.submit(new x(hVar, 4)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(l lVar) {
        u4.e eVar = new u4.e(0, this, new ArrayList(this.b.values()));
        l lVar2 = new l();
        this.e.submit(new u4.e(lVar2, eVar, false, 4));
        lVar2.a(new u4.e(lVar2, lVar, false, 1), this.d);
    }
}
