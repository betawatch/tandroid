package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public a1(Context context, e eVar) {
        this.f = new ArrayList();
        this.g = new androidx.mediarouter.app.h(this, 2);
        this.h = new androidx.activity.i(this, 8);
        this.b = context;
        this.c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public static void a(a1 a1Var, l3.g gVar) {
        if (!a1Var.a || gVar.equals((l3.g) a1Var.h)) {
            return;
        }
        a1Var.h = gVar;
        l3.k0 k0Var = (l3.k0) ((gg.f) a1Var.c).b;
        h5.a.i(k0Var.f0 == Looper.myLooper());
        if (gVar.equals(k0Var.f())) {
            return;
        }
        k0Var.w = gVar;
        l3.t tVar = k0Var.r;
        if (tVar != null) {
            tVar.r();
        }
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((e2.d) this.c).m0();
            return null;
        }
    }

    public void c(int i10, Serializable serializable) {
        ((Executor) this.b).execute(new ah.a(this, i10, serializable, 3));
    }

    public void d() {
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
                boolean z4 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((d0.c == null ? false : d0.c().f()) && !arrayList2.isEmpty()) {
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
                        ComponentName componentName = ((z0) arrayList.get(i13)).r;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 < 0) {
                        z0 z0Var = new z0((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        z0Var.C = new a1.c(this, z0Var);
                        if (!z0Var.w) {
                            z0Var.w = true;
                            z0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, z0Var);
                        eVar.a(z0Var, false);
                    } else if (i13 >= i11) {
                        z0 z0Var2 = (z0) arrayList.get(i13);
                        if (!z0Var2.w) {
                            z0Var2.w = true;
                            z0Var2.r();
                        }
                        if (z0Var2.y == null) {
                            if (!z0Var2.w || (((o) z0Var2.h) == null && z0Var2.v.isEmpty())) {
                                z4 = false;
                            }
                            if (z4) {
                                z0Var2.q();
                                z0Var2.n();
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
                    z0 z0Var3 = (z0) arrayList.get(size3);
                    a0 d = eVar.d(z0Var3);
                    if (d != null) {
                        z0Var3.getClass();
                        d0.b();
                        z0Var3.f = null;
                        z0Var3.h(null);
                        eVar.m(d, null);
                        eVar.a.b(514, d);
                        eVar.l.remove(d);
                    }
                    arrayList.remove(z0Var3);
                    z0Var3.C = null;
                    if (z0Var3.w) {
                        z0Var3.w = false;
                        z0Var3.r();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a1(Context context, gg.f fVar) {
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = fVar;
        int i10 = h5.d0.a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.d = handler;
        int i11 = h5.d0.a;
        this.e = i11 >= 23 ? new l3.i(this) : null;
        this.f = i11 >= 21 ? new androidx.mediarouter.app.h(this, 7) : null;
        l3.g gVar = l3.g.c;
        if (i11 >= 17) {
            String str = h5.d0.c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                uri = Settings.Global.getUriFor("external_surround_sound_enabled");
                this.g = uri != null ? new l3.j(this, handler, applicationContext.getContentResolver(), uri) : null;
            }
        }
        uri = null;
        this.g = uri != null ? new l3.j(this, handler, applicationContext.getContentResolver(), uri) : null;
    }

    public a1(AssetManager assetManager, Executor executor, e2.d dVar, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = dVar;
        this.f = str;
        this.e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
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
