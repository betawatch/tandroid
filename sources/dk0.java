// default package

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dk0 {
    public final Context a;

    public dk0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static d33 a(dk0 dk0Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return dk0Var.b();
        }
        if (obj instanceof xu4) {
            Iterator it = ((xu4) obj).a.iterator();
            while (it.hasNext()) {
                if (((c33) it.next()) instanceof zu4) {
                    return dk0Var.b();
                }
            }
        }
        Context context = dk0Var.a;
        context.getClass();
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return dk0Var.b();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            r33 r33Var = new r33(context);
            r33 r33Var2 = r33Var.isAvailableOnDevice() ? r33Var : null;
            return r33Var2 == null ? dk0Var.b() : r33Var2;
        }
        if (i <= 33) {
            return dk0Var.b();
        }
        return null;
    }

    public final d33 b() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), nm7.P1);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List k = km2.k(arrayList);
        if (k.isEmpty()) {
            return null;
        }
        Iterator it = k.iterator();
        d33 d33Var = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                d33 d33Var2 = (d33) newInstance;
                if (!d33Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (d33Var != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    d33Var = d33Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return d33Var;
    }
}
