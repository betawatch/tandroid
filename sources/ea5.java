// default package

import java.util.ArrayList;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ea5 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ha5 a;

    public ea5(ha5 ha5Var) {
        this.a = ha5Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ArrayList arrayList = this.a.m0;
        for (int i = 0; i < arrayList.size(); i++) {
            gm.r((Runnable) arrayList.get(i));
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
