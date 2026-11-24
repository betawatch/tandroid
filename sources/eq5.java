// default package

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class eq5 implements fq5 {
    public final InputContentInfo a;

    public eq5(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // fq5
    public final Uri e() {
        return this.a.getContentUri();
    }

    @Override // fq5
    public final void g() {
        this.a.requestPermission();
    }

    @Override // fq5
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override // fq5
    public final Uri h() {
        return this.a.getLinkUri();
    }

    @Override // fq5
    public final Object k() {
        return this.a;
    }

    @Override // fq5
    public final void n() {
        this.a.releasePermission();
    }

    public eq5(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
