package jb;

import android.net.Uri;
import java.net.URL;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f {
    public final gb.b a;
    public final id.h b;

    public f(gb.b appInfo, id.h blockingDispatcher) {
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        this.a = appInfo;
        this.b = blockingDispatcher;
    }

    public static final URL a(f fVar) {
        fVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        gb.b bVar = fVar.a;
        Uri.Builder appendPath2 = appendPath.appendPath(bVar.a).appendPath("settings");
        gb.a aVar = bVar.b;
        return new URL(appendPath2.appendQueryParameter("build_version", aVar.c).appendQueryParameter("display_version", aVar.b).build().toString());
    }
}
