package m2;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t {
    public final /* synthetic */ int a = 0;
    public final String b;
    public final String c;

    public t(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public t(m4.c cVar) {
        Context context = (Context) cVar.b;
        int e = y9.h.e(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (e != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(e);
            this.c = string;
            String j10 = b10.j("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", j10, null);
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
