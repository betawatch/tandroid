package n9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import b8.ke;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ta.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // ta.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                h hVar = (h) this.c;
                Context context = (Context) this.b;
                String d = hVar.d();
                ya.a aVar = new ya.a();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 24) {
                    context = i3 >= 24 ? f0.a.a(context) : null;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.a = z10;
                return aVar;
            case 1:
                return new ra.i((Context) this.b, (String) this.c);
            default:
                t9.g gVar = (t9.g) this.c;
                t9.a aVar2 = (t9.a) this.b;
                return aVar2.f.q1(new ke(aVar2, gVar));
        }
    }

    public /* synthetic */ d(Context context, String str) {
        this.a = 1;
        this.b = context;
        this.c = str;
    }
}
