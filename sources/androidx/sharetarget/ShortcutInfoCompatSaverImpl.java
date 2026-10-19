package androidx.sharetarget;

import a0.f;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c0.m;
import c5.y;
import e0.m0;
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
import s9.i;
import u4.g;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        threadPoolExecutor.submit(new i(3, this, file));
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
            m0[] m0VarArr = cVar.i;
            if (m0VarArr != null) {
                cVar2.i = (m0[]) Arrays.copyOf(m0VarArr, m0VarArr.length);
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
        m mVar = new m();
        this.d.submit(new u4.e(this, arrayList, mVar, 1));
        return mVar;
    }

    @Override // g0.e
    public final List b() {
        return (List) this.d.submit(new y(this, 3)).get();
    }

    @Override // g0.e
    public final Object c() {
        m mVar = new m();
        this.d.submit(new i(4, this, mVar));
        return mVar;
    }

    @Override // g0.e
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        m mVar = new m();
        this.d.submit(new u4.e(this, arrayList, mVar, 0));
        return mVar;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g gVar = (g) obj;
            if (!TextUtils.isEmpty(gVar.b)) {
                arrayList2.add(gVar.b);
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
        g gVar = (g) this.d.submit(new u4.f(0, this, str)).get();
        if (gVar == null) {
            return null;
        }
        String str2 = gVar.a;
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
        if (TextUtils.isEmpty(gVar.b)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.e.submit(new y(gVar, 4)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(m mVar) {
        i iVar = new i(1, this, new ArrayList(this.b.values()));
        m mVar2 = new m();
        this.e.submit(new i(5, mVar2, iVar));
        mVar2.a(new i(mVar2, mVar), this.d);
    }
}
