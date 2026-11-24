// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ee3 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Serializable f;
    public final Object g;
    public Object h;

    public ee3(AssetManager assetManager, Executor executor, cr8 cr8Var, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = cr8Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = icd.e;
                    break;
                case 26:
                    bArr = icd.d;
                    break;
                case 27:
                    bArr = icd.c;
                    break;
                case 28:
                case 29:
                case kk7.S /* 30 */:
                    bArr = icd.b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = icd.a;
                    break;
            }
        }
        this.d = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((cr8) this.c).C();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        ((Executor) this.b).execute(new o94((Object) this, i, (Object) serializable, (byte) 1));
    }

    public final void c() {
        int i;
        ux4 ux4Var = (ux4) this.c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((gu6.c == null ? false : gu6.c().f()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = ((s59) arrayList.get(i4)).r;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 < 0) {
                        s59 s59Var = new s59((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        s59Var.G = new k88(this, s59Var);
                        if (!s59Var.x) {
                            s59Var.x = true;
                            s59Var.r();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, s59Var);
                        ux4Var.a(s59Var, false);
                    } else if (i4 >= i2) {
                        s59 s59Var2 = (s59) arrayList.get(i4);
                        if (!s59Var2.x) {
                            s59Var2.x = true;
                            s59Var2.r();
                        }
                        if (s59Var2.E == null && s59Var2.x && (((bt6) s59Var2.h) != null || !s59Var2.w.isEmpty())) {
                            s59Var2.q();
                            s59Var2.n();
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i4, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i2; size3--) {
                    s59 s59Var3 = (s59) arrayList.get(size3);
                    du6 d = ux4Var.d(s59Var3);
                    if (d != null) {
                        s59Var3.getClass();
                        gu6.b();
                        s59Var3.f = null;
                        s59Var3.h(null);
                        ux4Var.m(d, null);
                        ux4Var.a.b(514, d);
                        ux4Var.l.remove(d);
                    }
                    arrayList.remove(s59Var3);
                    s59Var3.G = null;
                    if (s59Var3.x) {
                        s59Var3.x = false;
                        s59Var3.r();
                    }
                }
            }
        }
    }

    public ee3(Context context, ux4 ux4Var) {
        this.f = new ArrayList();
        this.g = new zj(this, (byte) 11);
        this.h = new bg7(this, (byte) 15);
        this.b = context;
        this.c = ux4Var;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }
}
