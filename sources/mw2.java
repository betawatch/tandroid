// default package

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mw2 implements nw2 {
    public final ContentInfo.Builder a;

    public mw2(ClipData clipData, int i) {
        this.a = lw2.a(clipData, i);
    }

    @Override // nw2
    public final rw2 build() {
        return new rw2(new pw2(this.a.build()));
    }

    @Override // nw2
    public final void c(Uri uri) {
        this.a.setLinkUri(uri);
    }

    @Override // nw2
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override // nw2
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }
}
