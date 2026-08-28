package b9;

import android.content.Context;
import android.util.Log;
import e9.h;
import java.io.IOException;
import java.io.InputStream;
import n2.o;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public /* synthetic */ c() {
        this.a = 2;
    }

    public o a() {
        if ("first_party".equals(this.c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.b == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.c != null) {
            return new o(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(int i9, String str, String str2) {
        this.a = i9;
        this.b = str;
        this.c = str2;
    }

    public c(String str, String str2) {
        this.a = 5;
        l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public c(we.b bVar) {
        this.a = 0;
        Context context = (Context) bVar.b;
        int e10 = h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(e10);
            this.c = string;
            String d = ta.b.d("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", d, null);
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
                this.b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }
}
