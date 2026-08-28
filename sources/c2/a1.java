package c2;

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
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public Object g;
    public Object h;

    public a1(Context context, e eVar) {
        this.f = new ArrayList();
        this.g = new androidx.mediarouter.app.h(this, 1);
        this.h = new androidx.activity.i(this, 10);
        this.b = context;
        this.c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((e2.d) this.c).e();
            return null;
        }
    }

    public void b(int i9, Serializable serializable) {
        ((Executor) this.b).execute(new d5.i(this, i9, serializable, 1));
    }

    public void c() {
        int i9;
        e eVar = (e) this.c;
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
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((c0.c == null ? false : c0.c().f()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        ComponentName componentName = ((z0) arrayList.get(i12)).r;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (i12 < 0) {
                        z0 z0Var = new z0((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        z0Var.B = new a1.c(this, z0Var);
                        if (!z0Var.w) {
                            z0Var.w = true;
                            z0Var.r();
                        }
                        i9 = i10 + 1;
                        arrayList.add(i10, z0Var);
                        eVar.a(z0Var, false);
                    } else if (i12 >= i10) {
                        z0 z0Var2 = (z0) arrayList.get(i12);
                        if (!z0Var2.w) {
                            z0Var2.w = true;
                            z0Var2.r();
                        }
                        if (z0Var2.y == null) {
                            if (!z0Var2.w || (((o) z0Var2.h) == null && z0Var2.v.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                z0Var2.q();
                                z0Var2.n();
                            }
                        }
                        i9 = i10 + 1;
                        Collections.swap(arrayList, i12, i10);
                    }
                    i10 = i9;
                }
            }
            if (i10 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i10; size3--) {
                    z0 z0Var3 = (z0) arrayList.get(size3);
                    z d = eVar.d(z0Var3);
                    if (d != null) {
                        z0Var3.getClass();
                        c0.b();
                        z0Var3.f = null;
                        z0Var3.h(null);
                        eVar.m(d, null);
                        eVar.a.b(514, d);
                        eVar.l.remove(d);
                    }
                    arrayList.remove(z0Var3);
                    z0Var3.B = null;
                    if (z0Var3.w) {
                        z0Var3.w = false;
                        z0Var3.r();
                    }
                }
            }
        }
    }

    public a1(AssetManager assetManager, Executor executor, e2.d dVar, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = dVar;
        this.f = str;
        this.e = file;
        int i9 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i9 >= 24 && i9 <= 34) {
            switch (i9) {
                case 24:
                case 25:
                    bArr = e2.e.h;
                    break;
                case 26:
                    bArr = e2.e.g;
                    break;
                case 27:
                    bArr = e2.e.f;
                    break;
                case 28:
                case 29:
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    bArr = e2.e.e;
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                case 32:
                case 33:
                case 34:
                    bArr = e2.e.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
