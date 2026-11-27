// default package

import android.net.Uri;
import java.net.URL;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ca9 {
    public final tr a;
    public final mx2 b;

    public ca9(tr trVar, mx2 mx2Var) {
        trVar.getClass();
        mx2Var.getClass();
        this.a = trVar;
        this.b = mx2Var;
    }

    public final URL a() {
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        tr trVar = this.a;
        Uri.Builder appendPath2 = appendPath.appendPath(trVar.a).appendPath("settings");
        yj yjVar = trVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", yjVar.c).appendQueryParameter("display_version", yjVar.b).build().toString());
    }
}
