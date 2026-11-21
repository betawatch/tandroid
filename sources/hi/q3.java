package hi;

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
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class q3 extends FrameLayout implements RendererCommon.RendererEvents, fs {
    public boolean E;
    public int a;
    public final p3 b;
    public final SurfaceViewRenderer c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.q9 e;
    public final TextureView f;
    public View h;
    public Runnable n;
    public boolean r;
    public long s;
    public fi.y3 w;
    public boolean x;
    public float y;

    public q3(Context context, int i7) {
        super(context);
        this.a = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.e = q9Var;
        q9Var.setAlpha(0.75f);
        addView(q9Var, c8.ma.e(-1, -1, ks.E1));
        TextureView textureView = new TextureView(context);
        this.f = textureView;
        addView(textureView, c8.ma.e(-1, -1, ks.E1));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, c8.ma.e(-1, -1, ks.E1));
        textureViewRenderer.setAlpha(1.0f);
        this.c = null;
        p3 p3Var = new p3(context);
        this.b = p3Var;
        p3Var.setAlpha(0.0f);
        p3Var.setVisibility(8);
        addView(p3Var, c8.ma.e(-1, -1, ks.E1));
    }

    public final void a(Runnable runnable, boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        p3 p3Var = this.b;
        p3Var.setVisibility(0);
        e eVar = (e) p3Var.d;
        p3Var.animate().alpha(this.E ? 1.0f : 0.0f).setInterpolator(nr.h).setDuration(320L).withEndAction(new ch.k(6, this, z10)).start();
        eVar.setVisibility((!z10 || runnable == null) ? 8 : 0);
        eVar.setOnClickListener(runnable == null ? null : new bi.d0(3, runnable));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j3, fi.y3 y3Var) {
        int i7;
        fi.w0 w0Var;
        fi.c1 c1Var;
        fi.c1 c1Var2;
        TextureViewRenderer textureViewRenderer;
        int L;
        int width;
        if (y3Var == null) {
            long j10 = this.s;
            if (j10 != 0 && this.r && (textureViewRenderer = this.d) != null) {
                File file = new File(org.telegram.messenger.w7.z(4), p5.c.j(j10, "live", ".jpg"));
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = org.telegram.messenger.g0.L(100.0f);
                        i7 = 4;
                        L = (int) ((bitmap.getHeight() / bitmap.getWidth()) * org.telegram.messenger.g0.L(100.0f));
                    } else {
                        i7 = 4;
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
                    if (this.s != j3) {
                        org.telegram.ui.Components.q9 q9Var = this.e;
                        if (j3 == 0) {
                            q9Var.b();
                        } else {
                            String absolutePath = new File(org.telegram.messenger.w7.z(i7), p5.c.j(j3, "live", ".jpg")).getAbsolutePath();
                            if (j3 > 0) {
                                TLRPC.User c22 = mp.u1(this.a).c2(Long.valueOf(j3));
                                fc l10 = fc.l(this.a, 1, c22);
                                int d = c22 != null ? org.telegram.ui.Components.b9.d(c22.id) : i0.a.f(0.2f, -16777216, -1);
                                q9Var.getImageReceiver().u0(fc.g(absolutePath), "500_500_nocache", l10, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), 0L, null, c22, 0);
                            } else {
                                TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(-j3));
                                fc a10 = fc.a(1, O0);
                                int d2 = O0 != null ? org.telegram.ui.Components.b9.d(O0.id) : i0.a.f(0.2f, -16777216, -1);
                                q9Var.getImageReceiver().u0(fc.g(absolutePath), "500_500_nocache", a10, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d2, -16777216), i0.a.f(0.4f, d2, -16777216)}), 0L, null, O0, 0);
                            }
                        }
                    }
                    this.s = j3;
                    this.w = y3Var;
                    if (this.r && y3Var != null && !y3Var.a) {
                        y3Var.a = true;
                        y3Var.b();
                    }
                    boolean z10 = y3Var == null && (c1Var2 = (fi.c1) y3Var.b) != null && c1Var2.n();
                    if (y3Var == null && (c1Var = (fi.c1) y3Var.b) != null && c1Var.a()) {
                        fi.c1 c1Var3 = (fi.c1) y3Var.b;
                        Objects.requireNonNull(c1Var3);
                        w0Var = new fi.w0(c1Var3, 12);
                    } else {
                        w0Var = null;
                    }
                    a(w0Var, z10);
                }
            }
        }
        i7 = 4;
        if (this.s != j3) {
        }
        this.s = j3;
        this.w = y3Var;
        if (this.r) {
            y3Var.a = true;
            y3Var.b();
        }
        if (y3Var == null) {
        }
        if (y3Var == null) {
        }
        w0Var = null;
        a(w0Var, z10);
    }

    public final void c(boolean z10, boolean z11) {
        if (z10 || !z11) {
            if (z11) {
                n10.o(getTextureView().animate().alpha(z10 ? 1.0f : 0.0f), nr.h, 320L);
            } else {
                getTextureView().animate().cancel();
                getTextureView().setAlpha(z10 ? 1.0f : 0.0f);
            }
        }
    }

    public final void d() {
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.c1 c1Var;
        fi.w0 w0Var;
        if (i7 == ks.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            fi.y3 y3Var = this.w;
            if (y3Var == null || (c1Var = (fi.c1) y3Var.b) == null || c1Var.g() != longValue) {
                return;
            }
            boolean n10 = ((fi.c1) this.w.b).n();
            if (((fi.c1) this.w.b).a()) {
                fi.c1 c1Var2 = (fi.c1) this.w.b;
                Objects.requireNonNull(c1Var2);
                w0Var = new fi.w0(c1Var2, 12);
            } else {
                w0Var = null;
            }
            a(w0Var, n10);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
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
        return super.drawChild(canvas, view, j3);
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
            addView(view, c8.ma.g());
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
        ks.f(this.a).c(this, ks.G2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = false;
        c(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        ks.f(this.a).n(this, ks.G2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        if (!this.r) {
            fi.y3 y3Var = this.w;
            if (y3Var != null && !y3Var.a) {
                y3Var.a = true;
                y3Var.b();
            }
            this.r = true;
        }
        c(true, true);
        Runnable runnable = this.n;
        if (runnable != null) {
            runnable.run();
            this.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
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
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.x = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.x = false;
        super.onMeasure(i7, i10);
        View view = textureViewRenderer != null ? textureViewRenderer : this.c;
        TextureView textureView = this.f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i7, i10);
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

    public void setAccount(int i7) {
        if (this.a == i7) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.a = i7;
            return;
        }
        ks f10 = ks.f(this.a);
        int i10 = ks.G2;
        f10.n(this, i10);
        this.a = i7;
        ks.f(i7).c(this, i10);
    }

    public void setKeyboardOffset(float f10) {
        this.y = f10;
        d();
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
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
