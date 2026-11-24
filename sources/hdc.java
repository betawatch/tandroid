// default package

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class hdc {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static hv2 b(View view, hv2 hv2Var) {
        ContentInfo e = hv2Var.a.e();
        Objects.requireNonNull(e);
        ContentInfo performReceiveContent = view.performReceiveContent(e);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == e ? hv2Var : new hv2(new fv2(performReceiveContent));
    }
}
