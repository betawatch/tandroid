// default package

import java.util.ArrayList;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e85 implements RendererCommon.RendererEvents {
    public final /* synthetic */ h85 a;

    public e85(h85 h85Var) {
        this.a = h85Var;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        ArrayList arrayList = this.a.m0;
        for (int i = 0; i < arrayList.size(); i++) {
            gl.r((Runnable) arrayList.get(i));
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
