package c5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public p a() {
        if ("first_party".equals(this.c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.b == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.c != null) {
            return new p(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i10, String str, String str2) {
        this.a = i10;
        this.b = str;
        this.c = str2;
    }

    public a(String str, String str2) {
        this.a = 3;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.b = str;
            this.c = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public a(u9.b bVar) {
        this.a = 5;
        Context context = (Context) bVar.b;
        int e = x9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(e);
            this.c = string;
            String h = sc.e.h("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", h, null);
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
