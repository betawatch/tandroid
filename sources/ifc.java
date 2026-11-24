// default package

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ifc {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static rw2 b(View view, rw2 rw2Var) {
        ContentInfo e = rw2Var.a.e();
        Objects.requireNonNull(e);
        ContentInfo performReceiveContent = view.performReceiveContent(e);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == e ? rw2Var : new rw2(new pw2(performReceiveContent));
    }
}
