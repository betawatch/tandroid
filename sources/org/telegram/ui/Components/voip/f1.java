package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.et;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f1 extends FrameLayout {
    public final k2 a;
    public boolean b;
    public boolean c;
    public final long d;
    public final et e;
    public final /* synthetic */ g1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, Context context) {
        super(context);
        this.f = g1Var;
        this.c = true;
        this.d = SystemClock.elapsedRealtime();
        this.e = new et(this, 21);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, ha.c(-1.0f, -1));
        k2 k2Var = new k2(context, false, false, false, false);
        this.a = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        k2Var.a0 = 0;
        j2Var.setRotateTextureWithScreen(true);
        j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = k2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(k2Var, ha.c(-1.0f, -1));
        r3 d = g1.d();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (d == null || sharedInstance == null || sharedInstance.getChat() == null) {
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
        k2 k2Var = this.a;
        k2Var.animate().cancel();
        org.telegram.messenger.camera.q.k(k2Var.animate(), a10 ? 1.0f : 0.0f, 200L);
    }
}
