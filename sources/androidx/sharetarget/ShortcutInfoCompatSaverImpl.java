package androidx.sharetarget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ShortcutInfoCompatSaverImpl extends sia {
    public static final Object h = new Object();
    public static volatile ShortcutInfoCompatSaverImpl i;
    public final Context a;
    public final qt b = new qt(0);
    public final qt c = new qt(0);
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
        threadPoolExecutor.submit(new tnd((Object) this, (Object) file, false, (byte) 10));
    }

    public static void f(File file) {
        if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
            file.mkdirs();
        }
    }

    public static ShortcutInfoCompatSaverImpl getInstance(Context context) {
        if (i == null) {
            synchronized (h) {
                if (i == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    i = new ShortcutInfoCompatSaverImpl(context, new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20L, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        return i;
    }

    @Override // sia
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qia qiaVar = (qia) it.next();
            qia qiaVar2 = new qia();
            qiaVar2.a = qiaVar.a;
            qiaVar2.b = qiaVar.b;
            Intent[] intentArr = qiaVar.c;
            qiaVar2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            qiaVar2.d = qiaVar.d;
            qiaVar2.e = qiaVar.e;
            qiaVar2.f = qiaVar.f;
            qiaVar2.g = qiaVar.g;
            qiaVar2.h = qiaVar.h;
            qiaVar2.k = qiaVar.k;
            qiaVar2.l = qiaVar.l;
            qiaVar2.m = qiaVar.m;
            n58[] n58VarArr = qiaVar.i;
            if (n58VarArr != null) {
                qiaVar2.i = (n58[]) Arrays.copyOf(n58VarArr, n58VarArr.length);
            }
            if (qiaVar.j != null) {
                qiaVar2.j = new HashSet(qiaVar.j);
            }
            PersistableBundle persistableBundle = qiaVar.n;
            if (persistableBundle != null) {
                qiaVar2.n = persistableBundle;
            }
            if (TextUtils.isEmpty(qiaVar2.e)) {
                u36.j("Shortcut must have a non-empty label");
                return null;
            }
            Intent[] intentArr2 = qiaVar2.c;
            if (intentArr2 == null || intentArr2.length == 0) {
                u36.j("Shortcut must have an intent");
                return null;
            }
            arrayList.add(qiaVar2);
        }
        ec9 ec9Var = new ec9();
        this.d.submit(new tia(this, arrayList, ec9Var, (byte) 1));
        return ec9Var;
    }

    @Override // sia
    public final List b() {
        return (List) this.d.submit(new mg7(this, (byte) 1)).get();
    }

    @Override // sia
    public final Object c() {
        ec9 ec9Var = new ec9();
        this.d.submit(new us4(this, ec9Var, false, (byte) 13));
        return ec9Var;
    }

    @Override // sia
    public final Object d(List list) {
        ArrayList arrayList = new ArrayList(list);
        ec9 ec9Var = new ec9();
        this.d.submit(new tia(this, arrayList, ec9Var, (byte) 0));
        return ec9Var;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            wia wiaVar = (wia) obj;
            if (!TextUtils.isEmpty(wiaVar.b)) {
                arrayList2.add(wiaVar.b);
            }
        }
        for (File file : this.g.listFiles()) {
            if (!arrayList2.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public final IconCompat g(String str) {
        int i2;
        Context context = this.a;
        wia wiaVar = (wia) this.d.submit(new uia(this, str)).get();
        if (wiaVar == null) {
            return null;
        }
        String str2 = wiaVar.a;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i2 = context.getResources().getIdentifier(str2, null, null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 != 0) {
                return IconCompat.d(context, i2);
            }
        }
        if (TextUtils.isEmpty(wiaVar.b)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.e.submit(new mg7(wiaVar, (byte) 2)).get();
        if (bitmap != null) {
            return IconCompat.c(bitmap);
        }
        return null;
    }

    public final void h(ec9 ec9Var) {
        tnd tndVar = new tnd((Object) this, (Object) new ArrayList(this.b.values()), false, (byte) 9);
        ec9 ec9Var2 = new ec9();
        this.e.submit(new us4((Object) ec9Var2, (Object) tndVar, (byte) 14));
        ec9Var2.b(new us4((Object) ec9Var2, (Object) ec9Var, (byte) 12), this.d);
    }
}
