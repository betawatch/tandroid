// default package

import java.util.ArrayList;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ha5 implements RendererCommon.RendererEvents {
    public final /* synthetic */ ka5 a;

    public ha5(ka5 ka5Var) {
        this.a = ka5Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ArrayList arrayList = this.a.m0;
        for (int i = 0; i < arrayList.size(); i++) {
            hl.r((Runnable) arrayList.get(i));
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
