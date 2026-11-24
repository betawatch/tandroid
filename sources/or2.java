// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class or2 implements nv8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ or2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // nv8
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xq2 xq2Var = (xq2) obj;
                return xq2Var.f.X(new sm2(xq2Var, (pr2) obj2));
            case 1:
                return new rf5((Context) obj2, (String) obj);
            default:
                li4 li4Var = (li4) obj2;
                Context context = (Context) obj;
                String d = li4Var.d();
                j73 j73Var = new j73();
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    context = i >= 24 ? ki0.d(context) : null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:".concat(d), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                j73Var.a = z;
                return j73Var;
        }
    }
}
