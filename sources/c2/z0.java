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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public Object g;
    public Object h;

    public z0(Context context, e eVar) {
        this.f = new ArrayList();
        this.g = new androidx.mediarouter.app.f(this, 1);
        this.h = new a8.b(this, 8);
        this.b = context;
        this.c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e9) {
            String message = e9.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((e2.c) this.c).m();
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        ((Executor) this.b).execute(new d5.i(this, i10, serializable, 1));
    }

    public void c() {
        int i10;
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
            int i11 = 0;
            while (true) {
                boolean z10 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((b0.c == null ? false : b0.c().f()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size2) {
                            i13 = -1;
                            break;
                        }
                        ComponentName componentName = ((y0) arrayList.get(i13)).r;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 < 0) {
                        y0 y0Var = new y0((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        y0Var.B = new a1.c(this, y0Var);
                        if (!y0Var.w) {
                            y0Var.w = true;
                            y0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, y0Var);
                        eVar.a(y0Var, false);
                    } else if (i13 >= i11) {
                        y0 y0Var2 = (y0) arrayList.get(i13);
                        if (!y0Var2.w) {
                            y0Var2.w = true;
                            y0Var2.r();
                        }
                        if (y0Var2.y == null) {
                            if (!y0Var2.w || (((o) y0Var2.h) == null && y0Var2.v.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                y0Var2.q();
                                y0Var2.n();
                            }
                        }
                        i10 = i11 + 1;
                        Collections.swap(arrayList, i13, i11);
                    }
                    i11 = i10;
                }
            }
            if (i11 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i11; size3--) {
                    y0 y0Var3 = (y0) arrayList.get(size3);
                    y d = eVar.d(y0Var3);
                    if (d != null) {
                        y0Var3.getClass();
                        b0.b();
                        y0Var3.f = null;
                        y0Var3.h(null);
                        eVar.m(d, null);
                        eVar.a.b(514, d);
                        eVar.l.remove(d);
                    }
                    arrayList.remove(y0Var3);
                    y0Var3.B = null;
                    if (y0Var3.w) {
                        y0Var3.w = false;
                        y0Var3.r();
                    }
                }
            }
        }
    }

    public z0(AssetManager assetManager, Executor executor, e2.c cVar, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = cVar;
        this.f = str;
        this.e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = e2.d.h;
                    break;
                case 26:
                    bArr = e2.d.g;
                    break;
                case 27:
                    bArr = e2.d.f;
                    break;
                case 28:
                case 29:
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    bArr = e2.d.e;
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                case 32:
                case 33:
                case 34:
                    bArr = e2.d.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
