package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import b8.mf;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r3 extends FrameLayout implements RendererCommon.RendererEvents, cs {
    public boolean E;
    public int a;
    public final q3 b;
    public final SurfaceViewRenderer c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.k9 e;
    public final TextureView f;
    public View h;
    public Runnable n;
    public boolean r;
    public long s;
    public ei.i4 w;
    public boolean x;
    public float y;

    public r3(Context context, int i3) {
        super(context);
        this.a = i3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.e = k9Var;
        k9Var.setAlpha(0.75f);
        addView(k9Var, mf.e(-1, -1, hs.E1));
        TextureView textureView = new TextureView(context);
        this.f = textureView;
        addView(textureView, mf.e(-1, -1, hs.E1));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, mf.e(-1, -1, hs.E1));
        textureViewRenderer.setAlpha(1.0f);
        this.c = null;
        q3 q3Var = new q3(context);
        this.b = q3Var;
        q3Var.setAlpha(0.0f);
        q3Var.setVisibility(8);
        addView(q3Var, mf.e(-1, -1, hs.E1));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        return textureViewRenderer != null ? textureViewRenderer.isAvailable() : this.c != null;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        q3 q3Var = this.b;
        q3Var.setVisibility(0);
        d dVar = (d) q3Var.d;
        q3Var.animate().alpha(this.E ? 1.0f : 0.0f).setInterpolator(xq.h).setDuration(320L).withEndAction(new ci.e1(6, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 0);
        dVar.setOnClickListener(runnable == null ? null : new ai.j0(3, runnable));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j10, ei.i4 i4Var) {
        int i3;
        ei.a1 a1Var;
        ei.g1 g1Var;
        ei.g1 g1Var2;
        TextureViewRenderer textureViewRenderer;
        int L;
        int width;
        if (i4Var == null) {
            long j11 = this.s;
            if (j11 != 0 && this.r && (textureViewRenderer = this.d) != null) {
                File file = new File(org.telegram.messenger.w7.z(4), t4.c.e(j11, "live", ".jpg"));
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = org.telegram.messenger.g0.L(100.0f);
                        i3 = 4;
                        L = (int) ((bitmap.getHeight() / bitmap.getWidth()) * org.telegram.messenger.g0.L(100.0f));
                    } else {
                        i3 = 4;
                        L = org.telegram.messenger.g0.L(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * org.telegram.messenger.g0.L(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, L, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, org.telegram.messenger.g0.L(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (this.s != j10) {
                        org.telegram.ui.Components.k9 k9Var = this.e;
                        if (j10 == 0) {
                            k9Var.b();
                        } else {
                            String absolutePath = new File(org.telegram.messenger.w7.z(i3), t4.c.e(j10, "live", ".jpg")).getAbsolutePath();
                            if (j10 > 0) {
                                TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(j10));
                                ac l10 = ac.l(this.a, 1, a22);
                                int d = a22 != null ? org.telegram.ui.Components.u8.d(a22.id) : i0.a.f(0.2f, -16777216, -1);
                                k9Var.getImageReceiver().u0(ac.g(absolutePath), "500_500_nocache", l10, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), 0L, null, a22, 0);
                            } else {
                                TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-j10));
                                ac a10 = ac.a(1, M0);
                                int d10 = M0 != null ? org.telegram.ui.Components.u8.d(M0.id) : i0.a.f(0.2f, -16777216, -1);
                                k9Var.getImageReceiver().u0(ac.g(absolutePath), "500_500_nocache", a10, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d10, -16777216), i0.a.f(0.4f, d10, -16777216)}), 0L, null, M0, 0);
                            }
                        }
                    }
                    this.s = j10;
                    this.w = i4Var;
                    if (this.r && i4Var != null && !i4Var.a) {
                        i4Var.a = true;
                        i4Var.b();
                    }
                    boolean z10 = i4Var == null && (g1Var2 = (ei.g1) i4Var.b) != null && g1Var2.n();
                    if (i4Var == null && (g1Var = (ei.g1) i4Var.b) != null && g1Var.a()) {
                        ei.g1 g1Var3 = (ei.g1) i4Var.b;
                        Objects.requireNonNull(g1Var3);
                        a1Var = new ei.a1(g1Var3, 12);
                    } else {
                        a1Var = null;
                    }
                    c(a1Var, z10);
                }
            }
        }
        i3 = 4;
        if (this.s != j10) {
        }
        this.s = j10;
        this.w = i4Var;
        if (this.r) {
            i4Var.a = true;
            i4Var.b();
        }
        if (i4Var == null) {
        }
        if (i4Var == null) {
        }
        a1Var = null;
        c(a1Var, z10);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ei.g1 g1Var;
        ei.a1 a1Var;
        if (i3 == hs.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            ei.i4 i4Var = this.w;
            if (i4Var == null || (g1Var = (ei.g1) i4Var.b) == null || g1Var.g() != longValue) {
                return;
            }
            boolean n4 = ((ei.g1) this.w.b).n();
            if (((ei.g1) this.w.b).a()) {
                ei.g1 g1Var2 = (ei.g1) this.w.b;
                Objects.requireNonNull(g1Var2);
                a1Var = new ei.a1(g1Var2, 12);
            } else {
                a1Var = null;
            }
            c(a1Var, n4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!org.telegram.messenger.g0.m0) {
            super.draw(canvas);
            return;
        }
        TextureView textureView = this.f;
        if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        canvas.save();
        canvas.translate(textureView.getX(), textureView.getY());
        canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (org.telegram.messenger.g0.m0) {
            TextureViewRenderer textureViewRenderer = this.d;
            if (view == textureViewRenderer) {
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(textureViewRenderer.getX(), textureViewRenderer.getY());
                    canvas.scale((textureViewRenderer.getScaleX() * textureViewRenderer.getWidth()) / bitmap.getWidth(), (textureViewRenderer.getScaleY() * textureViewRenderer.getHeight()) / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
            TextureView textureView = this.f;
            if (view == textureView) {
                Bitmap bitmap2 = textureView.getBitmap();
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(textureView.getX(), textureView.getY());
                    canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap2.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10, boolean z11) {
        if (z10 || !z11) {
            if (z11) {
                org.telegram.messenger.camera.q.l(getTextureView().animate().alpha(z10 ? 1.0f : 0.0f), xq.h, 320L);
            } else {
                getTextureView().animate().cancel();
                getTextureView().setAlpha(z10 ? 1.0f : 0.0f);
            }
        }
    }

    public final void f() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!isAttachedToWindow() || measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        View view = this.d;
        if (view == null) {
            view = this.c;
        }
        TextureView textureView = this.f;
        int measuredWidth2 = textureView.getMeasuredWidth();
        int measuredHeight2 = textureView.getMeasuredHeight();
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        float f10 = measuredWidth;
        float f11 = measuredWidth2;
        float f12 = measuredHeight;
        float f13 = measuredHeight2;
        float max = Math.max(f10 / f11, f12 / f13);
        textureView.setScaleX(max);
        textureView.setScaleY(max);
        textureView.setTranslationX((f10 - (f11 * max)) / 2.0f);
        textureView.setTranslationY(((f12 - (f13 * max)) / 2.0f) - (this.y / 2.0f));
        float measuredWidth3 = view.getMeasuredWidth();
        float measuredHeight3 = view.getMeasuredHeight();
        float max2 = Math.max(measuredWidth3 / f10, measuredHeight3 / f12);
        view.setScaleX(max2);
        view.setScaleY(max2);
        view.setTranslationX((f10 - (measuredWidth3 * max2)) / 2.0f);
        view.setTranslationY(((f12 - (measuredHeight3 * max2)) / 2.0f) - (this.y / 2.0f));
    }

    public Bitmap getBitmap() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.getBitmap();
        }
        return null;
    }

    public View getPlaceholderView() {
        if (this.h == null) {
            View view = new View(getContext());
            this.h = view;
            addView(view, mf.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f);
        }
        hs.f(this.a).c(this, hs.G2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        hs.f(this.a).n(this, hs.G2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        if (!this.r) {
            ei.i4 i4Var = this.w;
            if (i4Var != null && !i4Var.a) {
                i4Var.a = true;
                i4Var.b();
            }
            this.r = true;
        }
        e(true, true);
        Runnable runnable = this.n;
        if (runnable != null) {
            runnable.run();
            this.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        this.e.layout(0, 0, i13, i14);
        this.b.layout(0, 0, i13, i14);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i13, i14);
        }
        TextureView textureView = this.f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.x = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.x = false;
        super.onMeasure(i3, i10);
        View view = textureViewRenderer != null ? textureViewRenderer : this.c;
        TextureView textureView = this.f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i3, i10);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i3) {
        if (this.a == i3) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.a = i3;
            return;
        }
        hs f10 = hs.f(this.a);
        int i10 = hs.G2;
        f10.n(this, i10);
        this.a = i3;
        hs.f(i3).c(this, i10);
    }

    public void setKeyboardOffset(float f10) {
        this.y = f10;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
