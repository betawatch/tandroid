package androidx.sharetarget;

import a0.f;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.biometric.k;
import androidx.core.graphics.drawable.IconCompat;
import c0.l;
import e0.o0;
import g0.c;
import g0.e;
import h2.g;
import h2.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        threadPoolExecutor.submit(new k(13, this, file));
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
            o0[] o0VarArr = cVar.i;
            if (o0VarArr != null) {
                cVar2.i = (o0[]) Arrays.copyOf(o0VarArr, o0VarArr.length);
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
        this.d.submit(new h2.e(this, arrayList, lVar, 1));
        return lVar;
    }

    @Override // g0.e
    public final List b() {
        return (List) this.d.submit(new h2.f(this, 0)).get();
    }

    @Override // g0.e
    public final Object c() {
        l lVar = new l();
        this.d.submit(new k(14, this, lVar));
        return lVar;
    }

    @Override // g0.e
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        l lVar = new l();
        this.d.submit(new h2.e(this, arrayList, lVar, 0));
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
        Bitmap bitmap = (Bitmap) this.e.submit(new h2.f(hVar, 1)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(l lVar) {
        k kVar = new k(11, this, new ArrayList(this.b.values()));
        l lVar2 = new l();
        this.e.submit(new k(lVar2, kVar, false, 15));
        lVar2.c(new k(lVar2, lVar, false, 12), this.d);
    }
}
