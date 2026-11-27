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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ej0 implements i4d {
    public final Context a;

    public ej0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            case 2:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static k23 b(ej0 ej0Var, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return ej0Var.c();
        }
        if (obj instanceof av4) {
            Iterator it = ((av4) obj).a.iterator();
            while (it.hasNext()) {
                if (((j23) it.next()) instanceof cv4) {
                    return ej0Var.c();
                }
            }
        }
        Context context = ej0Var.a;
        context.getClass();
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return ej0Var.c();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            y23 y23Var = new y23(context);
            y23 y23Var2 = y23Var.isAvailableOnDevice() ? y23Var : null;
            return y23Var2 == null ? ej0Var.c() : y23Var2;
        }
        if (i <= 33) {
            return ej0Var.c();
        }
        return null;
    }

    @Override // m4d
    public final Object a() {
        return this.a;
    }

    public final k23 c() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), jn7.P1);
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
        List k = sl2.k(arrayList);
        if (k.isEmpty()) {
            return null;
        }
        Iterator it = k.iterator();
        k23 k23Var = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                newInstance.getClass();
                k23 k23Var2 = (k23) newInstance;
                if (!k23Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (k23Var != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    k23Var = k23Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return k23Var;
    }
}
