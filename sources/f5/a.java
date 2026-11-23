package f5;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import sg.h0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class a {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public /* synthetic */ a() {
        this.a = 1;
    }

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
            case 3:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(int i7, String str, String str2) {
        this.a = i7;
        this.b = str;
        this.c = str2;
    }

    public a(h0 h0Var) {
        this.a = 5;
        Context context = (Context) h0Var.b;
        int e10 = aa.g.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e10 != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(e10);
            this.c = string;
            String k10 = p5.c.k("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", k10, null);
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
