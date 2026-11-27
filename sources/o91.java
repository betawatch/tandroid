// default package

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o91 extends ViewGroup {
    public final n91 E;
    public final FrameLayout a;
    public final hmc b;
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
    public final m91 y;

    public o91(LaunchActivity launchActivity) {
        super(launchActivity);
        this.c = hl.L(6.0f);
        this.d = hl.L(6.0f);
        this.h = true;
        this.y = new m91(this, (byte) 0);
        this.E = new n91(this, (byte) 0);
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.a = frameLayout;
        frameLayout.setBackgroundColor(-14999773);
        frameLayout.setOutlineProvider(new dl0(this, (byte) 2));
        frameLayout.setClipToOutline(true);
        frameLayout.setElevation(hl.L(2.0f));
        hmc hmcVar = new hmc(launchActivity, false, true, false, false);
        this.b = hmcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        gmc gmcVar = hmcVar.d;
        gmcVar.setScalingType(scalingType);
        gmcVar.setEnableHardwareScaler(true);
        gmcVar.setMirror(true);
        hmcVar.b0 = (byte) 0;
        View view = hmcVar.h;
        if (view != null) {
            view.setVisibility(8);
        }
        frameLayout.addView(hmcVar);
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
        this.b.d.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.addExtraLocalSink(this.E);
        }
        c();
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.removeExtraLocalSink(this.E);
            }
            hl.r(this.y);
            this.x = false;
            this.b.d.e();
        }
    }

    public final void c() {
        if (this.e) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            boolean z = (sharedInstance == null || sharedInstance.getVideoState(false) != 2 || sharedInstance.isScreencast()) ? false : true;
            boolean z2 = SystemClock.elapsedRealtime() - this.r < 1000;
            if (sharedInstance != null && this.h != sharedInstance.isFrontFaceCamera()) {
                boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
                this.h = isFrontFaceCamera;
                this.b.d.setMirror(isFrontFaceCamera);
            }
            int i = this.s;
            int i2 = this.w;
            float f = (i <= 0 || i2 <= 0) ? 0.0f : i / i2;
            if (f > 0.0f && Math.abs(f - this.n) > 0.01f) {
                this.n = f;
                requestLayout();
            }
            boolean z3 = z && z2;
            FrameLayout frameLayout = this.a;
            if (this.f == z3) {
                return;
            }
            this.f = z3;
            frameLayout.animate().cancel();
            if (!z3) {
                frameLayout.animate().alpha(0.0f).scaleX(0.6f).scaleY(0.6f).setDuration(180L).setInterpolator(k43.g).withEndAction(new m91(this, (byte) 1)).start();
            } else {
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(k43.h).withEndAction(null).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.c;
        int i6 = (i3 - i) - i5;
        FrameLayout frameLayout = this.a;
        frameLayout.layout(i6 - frameLayout.getMeasuredWidth(), i5, i6, frameLayout.getMeasuredHeight() + i5);
        frameLayout.setPivotX(frameLayout.getMeasuredWidth());
        frameLayout.setPivotY(0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        float f = this.n;
        if (f <= 0.0f) {
            f = 0.75f;
        }
        float sqrt = (float) Math.sqrt(((0.1f * r6) * r7) / f);
        float f2 = f * sqrt;
        float min = Math.min(1.0f, Math.min((size * 0.42f) / Math.max(1.0f, f2), (size2 * 0.42f) / Math.max(1.0f, sqrt)));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(f2 * min)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round(sqrt * min)), TLObject.FLAG_30));
    }
}
