package f5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import sg.i0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a {
    public String a;
    public String b;

    public /* synthetic */ a(String str, String str2, boolean z9) {
        this.a = str;
        this.b = str2;
    }

    public o a() {
        if ("first_party".equals(this.b)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.a == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.b != null) {
            return new o(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public a(String str, String str2) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public a(i0 i0Var) {
        Context context = (Context) i0Var.b;
        int e10 = aa.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.a = "Unity";
            String string = context.getResources().getString(e10);
            this.b = string;
            String i7 = rf.b.i("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", i7, null);
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
