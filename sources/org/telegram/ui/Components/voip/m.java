package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m extends FrameLayout {
    public final k2 a;
    public final h b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final k f;
    public TLRPC.User h;
    public boolean n;
    public long r;

    public m(Context context) {
        super(context);
        this.n = false;
        this.r = SystemClock.elapsedRealtime();
        setBackgroundColor(-14999773);
        k2 k2Var = new k2(context, false, true, false, false);
        this.a = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        j2Var.setEnableHardwareScaler(true);
        j2Var.setRotateTextureWithScreen(true);
        k2Var.a0 = 1;
        j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = k2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(k2Var, ha.c(-1.0f, -1));
        h hVar = new h(context);
        this.b = hVar;
        addView(hVar, ha.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, TLObject.FLAG_31);
        addView(textView, ha.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(-1275068417);
        textView2.setTextSize(1, 11.0f);
        textView2.setSingleLine();
        textView2.setGravity(1);
        textView2.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, TLObject.FLAG_31);
        textView2.setVisibility(8);
        addView(textView2, ha.d(-1, -2.0f, 49, 32.0f, 8.0f, 32.0f, 0.0f));
        k kVar = new k(context);
        this.f = kVar;
        addView(kVar, ha.c(-1.0f, -1));
        kVar.a();
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(m6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
        addView(imageView, ha.d(28, 28.0f, 51, 6.0f, 6.0f, 0.0f, 0.0f));
    }

    public static boolean a(VoIPService voIPService) {
        return voIPService != null && voIPService.getRemoteVideoState() == 2;
    }

    public final void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.User user = sharedInstance.getUser();
        TextView textView = this.c;
        h hVar = this.b;
        if (user != null && user != this.h) {
            this.h = user;
            sharedInstance.getAccount();
            hVar.a(user);
            textView.setText(t10.p(user));
        }
        boolean a10 = a(sharedInstance);
        boolean z9 = true;
        k2 k2Var = this.a;
        boolean z10 = a10 && !k2Var.d.isFirstFrameRendered() && SystemClock.elapsedRealtime() - this.r < 1200;
        if (!a10 || (!k2Var.d.isFirstFrameRendered() && !z10)) {
            z9 = false;
        }
        if (this.n != z9) {
            this.n = z9;
            hVar.setVisibility(z9 ? 8 : 0);
            textView.setVisibility(z9 ? 8 : 0);
        }
        this.e.setImageResource(sharedInstance.isMicMute() ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        this.f.c();
        int callState = sharedInstance.getCallState();
        TextView textView2 = this.d;
        if (callState == 5) {
            textView2.setText(id.M0(2131743253, null));
            textView2.setVisibility(0);
        } else if (callState == 3) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(id.M0(2131743419, null));
            textView2.setVisibility(0);
        }
    }
}
