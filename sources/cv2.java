// default package

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cv2 implements dv2 {
    public final ContentInfo.Builder a;

    public cv2(ClipData clipData, int i) {
        this.a = bv2.a(clipData, i);
    }

    @Override // dv2
    public final hv2 build() {
        return new hv2(new fv2(this.a.build()));
    }

    @Override // dv2
    public final void c(Uri uri) {
        this.a.setLinkUri(uri);
    }

    @Override // dv2
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override // dv2
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }
}
