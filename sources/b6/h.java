package b6;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public /* synthetic */ h() {
        this.a = 3;
    }

    public p2.q a() {
        if ("first_party".equals(this.c)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.b == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (this.c != null) {
            return new p2.q(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h(int i10, String str, String str2) {
        this.a = i10;
        this.b = str;
        this.c = str2;
    }

    public h(String str, String str2) {
        this.a = 0;
        m.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public h(f7.b bVar) {
        this.a = 1;
        Context context = (Context) bVar.b;
        int e = i9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(e);
            this.c = string;
            String e6 = w2.e("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", e6, null);
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
