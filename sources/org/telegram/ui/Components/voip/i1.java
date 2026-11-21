package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.ik;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i1 extends FrameLayout {
    public final n2 a;
    public boolean b;
    public boolean c;
    public final long d;
    public final ik e;
    public final /* synthetic */ j1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, Context context) {
        super(context);
        this.f = j1Var;
        this.c = true;
        this.d = SystemClock.elapsedRealtime();
        this.e = new ik(this, 24);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, ma.c(-1.0f, -1));
        n2 n2Var = new n2(context, false, false, false, false);
        this.a = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        n2Var.b0 = 0;
        m2Var.setRotateTextureWithScreen(true);
        m2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = n2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(n2Var, ma.c(-1.0f, -1));
        t3 g10 = j1.g();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (g10 == null || sharedInstance == null || sharedInstance.getChat() == null) {
            return;
        }
        sharedInstance.getAccount();
        hVar.a(sharedInstance.getChat());
    }

    public final void a() {
        boolean a10 = this.f.b.a(this.d);
        if (this.c == a10) {
            return;
        }
        this.c = a10;
        n2 n2Var = this.a;
        n2Var.animate().cancel();
        n10.n(n2Var.animate(), a10 ? 1.0f : 0.0f, 200L);
    }
}
