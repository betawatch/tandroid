package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.m10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.rc;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j1 extends FrameLayout {
    public final o2 a;
    public boolean b;
    public boolean c;
    public final long d;
    public final rc e;
    public final /* synthetic */ k1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, Context context) {
        super(context);
        this.f = k1Var;
        this.c = true;
        this.d = SystemClock.elapsedRealtime();
        this.e = new rc(this, 27);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, na.c(-1.0f, -1));
        o2 o2Var = new o2(context, false, false, false, false);
        this.a = o2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        n2 n2Var = o2Var.d;
        n2Var.setScalingType(scalingType);
        o2Var.b0 = 0;
        n2Var.setRotateTextureWithScreen(true);
        n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = o2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(o2Var, na.c(-1.0f, -1));
        t3 d = k1.d();
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
        o2 o2Var = this.a;
        o2Var.animate().cancel();
        m10.n(o2Var.animate(), a10 ? 1.0f : 0.0f, 200L);
    }
}
