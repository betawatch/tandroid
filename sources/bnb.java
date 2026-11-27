// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.OrientationHelper;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.EglBase;
import org.webrtc.Logging;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class bnb extends TextureView implements TextureView.SurfaceTextureListener, VideoSink, RendererCommon.RendererEvents {
    public boolean E;
    public int F;
    public zmb G;
    public int H;
    public VideoSink I;
    public Runnable J;
    public int K;
    public boolean L;
    public final String a;
    public final pmc b;
    public final anb c;
    public RendererCommon.RendererEvents d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public int s;
    public int w;
    public boolean x;
    public boolean y;

    public bnb(Context context) {
        super(context);
        pmc pmcVar = new pmc();
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_BALANCED;
        pmcVar.a = pmc.a(scalingType);
        pmcVar.b = pmc.a(scalingType);
        this.b = pmcVar;
        String resourceName = getResourceName();
        this.a = resourceName;
        this.c = new anb(resourceName);
        setSurfaceTextureListener(this);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public final void a() {
        anb anbVar = this.c;
        synchronized (anbVar.c) {
            d1 d1Var = anbVar.d;
            if (d1Var != null) {
                d1Var.postAtFrontOfQueue(new ojc(anbVar, (byte) 1));
            }
        }
        anbVar.a = false;
        this.c.P = false;
    }

    public final void b(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        c(context, rendererEvents, EglBase.CONFIG_PLAIN, new nkc());
    }

    public final void c(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, nkc nkcVar) {
        ThreadUtils.checkIsOnMainThread();
        this.d = rendererEvents;
        this.e = 0;
        this.f = 0;
        anb anbVar = this.c;
        anbVar.getClass();
        ThreadUtils.checkIsOnMainThread();
        anbVar.M = this;
        synchronized (anbVar.N) {
            anbVar.P = false;
            anbVar.Q = 0;
            anbVar.R = 0;
            anbVar.S = 0;
        }
        anbVar.b(context, iArr, nkcVar);
    }

    public final void d() {
        int i;
        int i2 = this.L ? OrientationHelper.cameraOrientation : 0;
        boolean z = this.y;
        if (z) {
            i2 = 360 - i2;
        }
        int i3 = -i2;
        if (this.L) {
            int i4 = this.F;
            if (i4 == 1) {
                i = z ? 90 : -90;
            } else if (i4 == 3) {
                i = z ? jn7.s4 : -270;
            }
            i3 += i;
        }
        this.c.i(i3);
        this.c.h(this.y);
    }

    public final void e() {
        anb anbVar = this.c;
        anbVar.c("Releasing.");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (anbVar.c) {
            d1 d1Var = anbVar.d;
            if (d1Var == null) {
                anbVar.c("Already released");
            } else {
                d1Var.postAtFrontOfQueue(new g9c(anbVar, countDownLatch, (byte) 24));
                anbVar.d.post(new g9c(anbVar, anbVar.d.getLooper(), (byte) 25));
                anbVar.d = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (anbVar.y) {
                    VideoFrame videoFrame = anbVar.E;
                    if (videoFrame != null) {
                        videoFrame.release();
                        anbVar.E = null;
                    }
                }
                anbVar.c("Releasing done.");
            }
        }
        zmb zmbVar = this.G;
        if (zmbVar != null) {
            zmbVar.stop();
        }
    }

    public final void f() {
        View view;
        float f;
        float f2;
        if (this.G == null || this.e == 0 || this.f == 0 || (view = (View) getParent()) == null) {
            return;
        }
        int orientation = this.G.getOrientation();
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float measuredWidth2 = view.getMeasuredWidth();
        float measuredHeight2 = view.getMeasuredHeight();
        if (orientation == 90 || orientation == 270) {
            f = measuredWidth;
            f2 = measuredHeight;
        } else {
            f2 = measuredWidth;
            f = measuredHeight;
        }
        float f3 = f2 / measuredWidth;
        float f4 = f / measuredHeight;
        float max = f2 < f ? Math.max(f3, f4) : Math.min(f3, f4);
        float f5 = f2 * max;
        float f6 = f * max;
        if (Math.abs((f5 / f6) - (measuredWidth2 / measuredHeight2)) < 0.1f) {
            max *= Math.max(measuredWidth2 / f5, measuredHeight2 / f6);
        }
        if (orientation == 270) {
            orientation = -90;
        }
        animate().scaleX(max).scaleY(max).rotation(-orientation).setDuration(180L).start();
    }

    public final void g() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.r || this.e == 0 || this.f == 0 || getWidth() == 0 || getHeight() == 0) {
            this.w = 0;
            this.s = 0;
            return;
        }
        float width = getWidth() / getHeight();
        int i = this.e;
        int i2 = this.f;
        if (i / i2 > width) {
            i = (int) (i2 * width);
        } else {
            i2 = (int) (i2 / width);
        }
        int min = Math.min(getWidth(), i);
        int min2 = Math.min(getHeight(), i2);
        StringBuilder sb = new StringBuilder("updateSurfaceSize. Layout size: ");
        sb.append(getWidth());
        sb.append("x");
        sb.append(getHeight());
        sb.append(", frame size: ");
        sb.append(this.e);
        sb.append("x");
        bs2.w(sb, this.f, ", requested surface size: ", min, "x");
        sb.append(min2);
        sb.append(", old surface size: ");
        sb.append(this.s);
        sb.append("x");
        sb.append(this.w);
        Logging.d("TextureViewRenderer", this.a + ": " + sb.toString());
        if (min == this.s && min2 == this.w) {
            return;
        }
        this.s = min;
        this.w = min2;
    }

    public final void h() {
        int i;
        int i2 = this.n;
        if (i2 == 0 || (i = this.h) == 0) {
            return;
        }
        if (!this.E) {
            int i3 = this.K - OrientationHelper.cameraOrientation;
            i = (i3 == 0 || i3 == 180 || i3 == -180) ? this.h : this.n;
            i2 = (i3 == 0 || i3 == 180 || i3 == -180) ? this.n : this.h;
        } else if (!this.L) {
            int i4 = this.K;
            int i5 = (i4 == 0 || i4 == 180 || i4 == -180) ? i : i2;
            if (i4 != 0 && i4 != 180 && i4 != -180) {
                i2 = i;
            }
            i = i5;
        } else if (this.F == 0) {
            i = i2;
            i2 = i;
        }
        if (this.e == i && this.f == i2) {
            return;
        }
        synchronized (this.c.N) {
            Runnable runnable = this.J;
            if (runnable != null) {
                hl.r(runnable);
            }
            bt btVar = new bt((Object) this, i, i2, (byte) 16);
            this.J = btVar;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                btVar.run();
            } else {
                hl.c3(btVar);
            }
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.d;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        this.c.onFrame(videoFrame);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0034, code lost:
    
        if (r11 != (-180)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0051, code lost:
    
        if (r11 != (-180)) goto L36;
     */
    @Override // org.webrtc.RendererCommon.RendererEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        int i4;
        int i5;
        RendererCommon.RendererEvents rendererEvents = this.d;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i, i2, i3);
        }
        this.K = i3;
        boolean z = this.E;
        boolean z2 = this.x;
        if (z) {
            if (z2) {
                d();
            }
            if (!this.L) {
                int i6 = this.K;
                i4 = (i6 == 0 || i6 == 180 || i6 == -180) ? i : i2;
                if (i6 != 0) {
                    if (i6 != 180) {
                    }
                }
            } else if (this.F == 0) {
                i5 = i;
                i4 = i2;
            } else {
                i4 = i;
            }
            i5 = i2;
        } else {
            if (z2) {
                this.c.i(-OrientationHelper.cameraRotation);
            }
            int i7 = i3 - OrientationHelper.cameraOrientation;
            i4 = (i7 == 0 || i7 == 180 || i7 == -180) ? i : i2;
            if (i7 != 0) {
                if (i7 != 180) {
                }
            }
            i5 = i2;
        }
        int i8 = i5;
        int i9 = i4;
        synchronized (this.c.N) {
            Runnable runnable = this.J;
            if (runnable != null) {
                hl.r(runnable);
            }
            ie7 ie7Var = new ie7(this, i, i2, i9, i8, (byte) 1);
            this.J = ie7Var;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                ie7Var.run();
            } else {
                hl.c3(ie7Var);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        if (!this.x && this.E) {
            h();
        }
        int i3 = this.H;
        pmc pmcVar = this.b;
        boolean z = this.x;
        Point b = i3 > 0 ? pmcVar.b(z, View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.min(this.H, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)), this.e, this.f) : pmcVar.b(z, i, i2, this.e, this.f);
        setMeasuredDimension(b.x, b.y);
        if (this.e != 0 && this.f != 0) {
            anb anbVar = this.c;
            float measuredWidth = getMeasuredWidth() / getMeasuredHeight();
            if (anbVar.G != measuredWidth) {
                synchronized (anbVar.F) {
                    anbVar.G = measuredWidth;
                }
            }
        }
        g();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        this.w = 0;
        this.s = 0;
        g();
        this.c.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        VideoSink videoSink = this.I;
        if (videoSink instanceof VoIPService.ProxyVideoSink) {
            VoIPService.ProxyVideoSink proxyVideoSink = (VoIPService.ProxyVideoSink) videoSink;
            proxyVideoSink.removeTarget(this);
            proxyVideoSink.removeBackground(this);
        }
        this.c.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.s = i;
        this.w = i2;
        this.c.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.c.getClass();
    }

    public void setBackgroundRenderer(TextureView textureView) {
        if (i86.e(512)) {
            if (textureView != null) {
                textureView.setSurfaceTextureListener(new wr5(this, (byte) 4));
            } else {
                ThreadUtils.checkIsOnMainThread();
                this.c.f(null, true);
            }
        }
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.r = z;
        g();
    }

    public void setFpsReduction(float f) {
        this.c.g(f);
    }

    public void setIsCamera(boolean z) {
        this.x = z;
        if (z) {
            return;
        }
        zmb zmbVar = new zmb(this);
        this.G = zmbVar;
        zmbVar.start();
    }

    public void setMaxTextureSize(int i) {
        this.H = i;
    }

    public void setMirror(boolean z) {
        if (this.y != z) {
            this.y = z;
            if (this.E) {
                d();
            } else {
                this.c.h(z);
            }
            g();
            requestLayout();
        }
    }

    public void setParentSink(VideoSink videoSink) {
        this.I = videoSink;
    }

    public void setRotateTextureWithScreen(boolean z) {
        if (this.E != z) {
            this.E = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setRotation(float f) {
        super.setRotation(f);
    }

    @Override // android.view.View
    public void setRotationX(float f) {
        super.setRotationX(f);
    }

    @Override // android.view.View
    public void setRotationY(float f) {
        super.setRotationY(f);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        pmc pmcVar = this.b;
        pmcVar.getClass();
        pmcVar.a = pmc.a(scalingType);
        pmcVar.b = pmc.a(scalingType);
        requestLayout();
    }

    public void setScreenRotation(int i) {
        this.F = i;
        d();
        h();
    }

    public void setUseCameraRotation(boolean z) {
        if (this.L != z) {
            this.L = z;
            d();
            h();
        }
    }
}
