package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.i20;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.zj;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j1 extends FrameLayout {
    public final o2 a;
    public boolean b;
    public boolean c;
    public final long d;
    public final zj e;
    public final /* synthetic */ k1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, Context context) {
        super(context);
        this.f = k1Var;
        this.c = true;
        this.d = SystemClock.elapsedRealtime();
        this.e = new zj(this, 24);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, ja.c(-1.0f, -1));
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
        addView(o2Var, ja.c(-1.0f, -1));
        r3 g10 = k1.g();
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
        o2 o2Var = this.a;
        o2Var.animate().cancel();
        i20.m(o2Var.animate(), a10 ? 1.0f : 0.0f, 200L);
    }
}
