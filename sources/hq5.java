// default package

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hq5 implements iq5 {
    public final InputContentInfo a;

    public hq5(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // iq5
    public final Uri e() {
        return this.a.getContentUri();
    }

    @Override // iq5
    public final void g() {
        this.a.requestPermission();
    }

    @Override // iq5
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override // iq5
    public final Uri h() {
        return this.a.getLinkUri();
    }

    @Override // iq5
    public final Object j() {
        return this.a;
    }

    @Override // iq5
    public final void n() {
        this.a.releasePermission();
    }

    public hq5(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
