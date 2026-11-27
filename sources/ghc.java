// default package

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
