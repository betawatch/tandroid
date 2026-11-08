package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k extends ViewGroup {
    public final j D;
    public final FrameLayout a;
    public final k2 b;
    public final int c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public float n;
    public volatile long r;
    public volatile int s;
    public volatile int w;
    public volatile boolean x;
    public final i y;

    public k(Context context) {
        super(context);
        this.c = org.telegram.messenger.g0.L(6.0f);
        this.d = org.telegram.messenger.g0.L(6.0f);
        this.h = true;
        this.y = new i(this, 0);
        this.D = new j(this, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setBackgroundColor(-14999773);
        frameLayout.setOutlineProvider(new fh.a(this, 6));
        frameLayout.setClipToOutline(true);
        frameLayout.setElevation(org.telegram.messenger.g0.L(2.0f));
        k2 k2Var = new k2(context, false, true, false, false);
        this.b = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        j2Var.setEnableHardwareScaler(true);
        j2Var.setMirror(true);
        k2Var.a0 = 0;
        View view = k2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        frameLayout.addView(k2Var);
        frameLayout.setAlpha(0.0f);
        frameLayout.setScaleX(0.6f);
        frameLayout.setScaleY(0.6f);
        frameLayout.setVisibility(4);
        addView(frameLayout);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.addExtraLocalSink(this.D);
        }
        c();
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraLocalSink(this.D);
            }
            org.telegram.messenger.g0.r(this.y);
            this.x = false;
            this.b.d.release();
        }
    }

    public final void c() {
        if (this.e) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            boolean z9 = (sharedInstance == null || sharedInstance.getVideoState(false) != 2 || sharedInstance.isScreencast()) ? false : true;
            boolean z10 = SystemClock.elapsedRealtime() - this.r < 1000;
            if (sharedInstance != null && this.h != sharedInstance.isFrontFaceCamera()) {
                boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
                this.h = isFrontFaceCamera;
                this.b.d.setMirror(isFrontFaceCamera);
            }
            int i7 = this.s;
            int i10 = this.w;
            float f10 = (i7 <= 0 || i10 <= 0) ? 0.0f : i7 / i10;
            if (f10 > 0.0f && Math.abs(f10 - this.n) > 0.01f) {
                this.n = f10;
                requestLayout();
            }
            boolean z11 = z9 && z10;
            FrameLayout frameLayout = this.a;
            if (this.f == z11) {
                return;
            }
            this.f = z11;
            frameLayout.animate().cancel();
            if (!z11) {
                frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setDuration(180L).setInterpolator(xq.g).withEndAction(new i(this, 1)).start();
            } else {
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(xq.h).withEndAction(null).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.c;
        int i14 = (i11 - i7) - i13;
        FrameLayout frameLayout = this.a;
        frameLayout.layout(i14 - frameLayout.getMeasuredWidth(), i13, i14, frameLayout.getMeasuredHeight() + i13);
        frameLayout.setPivotX(frameLayout.getMeasuredWidth());
        frameLayout.setPivotY(0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        float f10 = this.n;
        if (f10 <= 0.0f) {
            f10 = 0.75f;
        }
        float sqrt = (float) Math.sqrt(((0.1f * r6) * r7) / f10);
        float f11 = f10 * sqrt;
        float min = Math.min(1.0f, Math.min((size * 0.42f) / Math.max(1.0f, f11), (size2 * 0.42f) / Math.max(1.0f, sqrt)));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(f11 * min)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(sqrt * min)), TLObject.FLAG_30));
    }
}
