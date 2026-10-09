package mf;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import n6.t;
import sc.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final String b;

    public g(int i10, String str, String str2) {
        switch (i10) {
            case 1:
                n6.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
                this.a = str;
                this.b = (str2 == null || str2.length() <= 0) ? null : str2;
                break;
            default:
                this.a = str;
                this.b = str2;
                break;
        }
    }

    public g(t tVar) {
        Context context = (Context) tVar.b;
        int e7 = w9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e7 != 0) {
            this.a = "Unity";
            String string = context.getResources().getString(e7);
            this.b = string;
            String i10 = v.i("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i10, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.a = "Flutter";
                this.b = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.a = null;
        this.b = null;
    }
}
