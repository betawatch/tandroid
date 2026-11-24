// default package

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
