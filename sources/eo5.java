// default package

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class eo5 implements fo5 {
    public final InputContentInfo a;

    public eo5(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // fo5
    public final Uri f() {
        return this.a.getContentUri();
    }

    @Override // fo5
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override // fo5
    public final void h() {
        this.a.requestPermission();
    }

    @Override // fo5
    public final Uri i() {
        return this.a.getLinkUri();
    }

    @Override // fo5
    public final Object l() {
        return this.a;
    }

    @Override // fo5
    public final void n() {
        this.a.releasePermission();
    }

    public eo5(Object obj) {
        this.a = (InputContentInfo) obj;
    }
}
