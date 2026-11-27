// default package

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class ghc {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static bw2 b(View view, bw2 bw2Var) {
        ContentInfo e = bw2Var.a.e();
        Objects.requireNonNull(e);
        ContentInfo performReceiveContent = view.performReceiveContent(e);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == e ? bw2Var : new bw2(new zv2(performReceiveContent));
    }
}
