// default package

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
