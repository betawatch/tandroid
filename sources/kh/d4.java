package kh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d4 extends FrameLayout implements RendererCommon.RendererEvents, NotificationCenter.NotificationCenterDelegate {
    public int a;
    public final c4 b;
    public final SurfaceViewRenderer c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.o9 e;
    public final TextureView f;
    public View h;
    public Runnable n;
    public boolean r;
    public long s;
    public ih.h4 v;
    public boolean w;
    public float x;
    public boolean y;

    public d4(Context context, int i9) {
        super(context);
        this.a = i9;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.e = o9Var;
        o9Var.setAlpha(0.75f);
        addView(o9Var, g7.e6.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f = textureView;
        addView(textureView, g7.e6.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, g7.e6.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.c = null;
        c4 c4Var = new c4(context);
        this.b = c4Var;
        c4Var.setAlpha(0.0f);
        c4Var.setVisibility(8);
        addView(c4Var, g7.e6.e(-1, -1, 119));
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
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        c4 c4Var = this.b;
        c4Var.setVisibility(0);
        d dVar = c4Var.b;
        c4Var.animate().alpha(this.y ? 1.0f : 0.0f).setInterpolator(gr.h).setDuration(320L).withEndAction(new eh.f(8, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 0);
        dVar.setOnClickListener(runnable == null ? null : new dg.w(4, runnable));
    }

    public final void d(long j10, ih.h4 h4Var) {
        ih.a1 a1Var;
        ih.f1 f1Var;
        ih.f1 f1Var2;
        TextureViewRenderer textureViewRenderer;
        int dp;
        int width;
        if (h4Var == null) {
            long j11 = this.s;
            if (j11 != 0 && this.r && (textureViewRenderer = this.d) != null) {
                File file = new File(FileLoader.getDirectory(4), aa.d.n(j11, "live", ".jpg"));
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = AndroidUtilities.dp(100.0f);
                        dp = (int) ((bitmap.getHeight() / bitmap.getWidth()) * AndroidUtilities.dp(100.0f));
                    } else {
                        dp = AndroidUtilities.dp(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * AndroidUtilities.dp(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, dp, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, AndroidUtilities.dp(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
        }
        if (this.s != j10) {
            org.telegram.ui.Components.o9 o9Var = this.e;
            if (j10 == 0) {
                o9Var.b();
            } else {
                String absolutePath = new File(FileLoader.getDirectory(4), aa.d.n(j10, "live", ".jpg")).getAbsolutePath();
                if (j10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.a).getUser(Long.valueOf(j10));
                    ImageLocation forUser = ImageLocation.getForUser(this.a, user, 1);
                    int d = user != null ? org.telegram.ui.Components.z8.d(user.id) : i0.a.d(0.2f, -16777216, -1);
                    o9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forUser, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), 0L, null, user, 0);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.a).getChat(Long.valueOf(-j10));
                    ImageLocation forChat = ImageLocation.getForChat(this.a, chat, 1);
                    int d9 = chat != null ? org.telegram.ui.Components.z8.d(chat.id) : i0.a.d(0.2f, -16777216, -1);
                    o9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forChat, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d9, -16777216), i0.a.d(0.4f, d9, -16777216)}), 0L, null, chat, 0);
                }
            }
        }
        this.s = j10;
        this.v = h4Var;
        if (this.r && h4Var != null && !h4Var.f) {
            h4Var.f = true;
            h4Var.a();
        }
        boolean z10 = (h4Var == null || (f1Var2 = h4Var.a) == null || !f1Var2.n()) ? false : true;
        if (h4Var == null || (f1Var = h4Var.a) == null || !f1Var.a()) {
            a1Var = null;
        } else {
            ih.f1 f1Var3 = h4Var.a;
            Objects.requireNonNull(f1Var3);
            a1Var = new ih.a1(f1Var3, 12);
        }
        c(a1Var, z10);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ih.f1 f1Var;
        ih.a1 a1Var;
        if (i9 == NotificationCenter.liveStoryUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            ih.h4 h4Var = this.v;
            if (h4Var == null || (f1Var = h4Var.a) == null || f1Var.g() != longValue) {
                return;
            }
            boolean n10 = this.v.a.n();
            if (this.v.a.a()) {
                ih.f1 f1Var2 = this.v.a;
                Objects.requireNonNull(f1Var2);
                a1Var = new ih.a1(f1Var2, 12);
            } else {
                a1Var = null;
            }
            c(a1Var, n10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!AndroidUtilities.makingGlobalBlurBitmap) {
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
        if (AndroidUtilities.makingGlobalBlurBitmap) {
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
                ll.r(getTextureView().animate().alpha(z10 ? 1.0f : 0.0f), gr.h, 320L);
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
        textureView.setTranslationY(((f12 - (f13 * max)) / 2.0f) - (this.x / 2.0f));
        float measuredWidth3 = view.getMeasuredWidth();
        float measuredHeight3 = view.getMeasuredHeight();
        float max2 = Math.max(measuredWidth3 / f10, measuredHeight3 / f12);
        view.setScaleX(max2);
        view.setScaleY(max2);
        view.setTranslationX((f10 - (measuredWidth3 * max2)) / 2.0f);
        view.setTranslationY(((f12 - (measuredHeight3 * max2)) / 2.0f) - (this.x / 2.0f));
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
            addView(view, g7.e6.g());
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
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.liveStoryUpdated);
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
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        if (!this.r) {
            ih.h4 h4Var = this.v;
            if (h4Var != null && !h4Var.f) {
                h4Var.f = true;
                h4Var.a();
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
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
    public final void onMeasure(int i9, int i10) {
        this.w = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.w = false;
        super.onMeasure(i9, i10);
        View view = textureViewRenderer != null ? textureViewRenderer : this.c;
        TextureView textureView = this.f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i9, i10);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i9) {
        if (this.a == i9) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.a = i9;
            return;
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.a);
        int i10 = NotificationCenter.liveStoryUpdated;
        notificationCenter.removeObserver(this, i10);
        this.a = i9;
        NotificationCenter.getInstance(i9).addObserver(this, i10);
    }

    public void setKeyboardOffset(float f10) {
        this.x = f10;
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
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
