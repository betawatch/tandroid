// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class no9 implements vp9 {
    public final /* synthetic */ oo9 a;

    public no9(oo9 oo9Var) {
        this.a = oo9Var;
    }

    @Override // vp9
    public final void onRejoinRequested() {
        gm.c3(new kf9(this, (byte) 11));
    }

    @Override // vp9
    public final void onStreamChannels(ArrayList arrayList) {
        gm.c3(new il9(this, arrayList, (byte) 9));
    }
}
