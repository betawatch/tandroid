package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.d5;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.ar;
import org.telegram.ui.be1;
import org.telegram.ui.s9;
import org.telegram.ui.u71;
import org.telegram.ui.ud1;
import org.webrtc.RendererCommon;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class l0 extends FrameLayout implements VoIPService.StateListener {
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public final float I;
    public final float J;
    public final Path K;
    public final Camera L;
    public final Matrix M;
    public final Matrix N;
    public final boolean O;
    public final j2.f P;
    public final j2.f Q;
    public final jb0 R;
    public final jb0 S;
    public final GestureDetector T;
    public ValueAnimator U;
    public boolean a;
    public final i0 b;
    public final j0 c;
    public final u71 d;
    public final d2[] e;
    public final y1 f;
    public int h;
    public boolean n;
    public final org.telegram.ui.ActionBar.l r;
    public float s;
    public int w;
    public int x;
    public int y;

    public l0(Context context, float f7, float f10) {
        super(context);
        this.h = 1;
        this.y = -1;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.K = new Path();
        this.L = new Camera();
        this.M = new Matrix();
        this.N = new Matrix();
        this.P = new j2.f(80, 80);
        this.Q = new j2.f(80, 80);
        this.R = new jb0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.S = new jb0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.I = f7;
        this.J = f10;
        int i10 = 3;
        this.e = new d2[3];
        ud1 ud1Var = (ud1) this;
        this.T = new GestureDetector(context, new h0(ud1Var));
        i0 i0Var = new i0(ud1Var, context, 0);
        this.b = i0Var;
        i0Var.setClickable(true);
        addView(i0Var, b6.c(-1.0f, -1));
        y1 y1Var = new y1(context, false, false);
        this.f = y1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        x1 x1Var = y1Var.d;
        x1Var.setScalingType(scalingType);
        y1Var.a0 = 1;
        y1Var.c0 = true;
        x1Var.setAlpha(0.0f);
        x1Var.setRotateTextureWithScreen(true);
        x1Var.setUseCameraRotation(true);
        addView(y1Var, b6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        this.r = lVar;
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        lVar.setBackgroundColor(0);
        a7.m(lVar, 1, t6.Vg, null);
        lVar.setOccupyStatusBar(true);
        lVar.setActionBarMenuOnItemClick(new ar(ud1Var, 11));
        addView(lVar);
        j0 j0Var = new j0(ud1Var, getContext());
        this.c = j0Var;
        j0Var.setMaxLines(1);
        j0Var.setEllipsize(null);
        j0Var.setMinWidth(org.telegram.messenger.i0.L(64.0f));
        j0Var.setTag(-1);
        j0Var.setTextSize(1, 14.0f);
        int i11 = t6.bh;
        a7.V(j0Var, i11, null);
        j0Var.setGravity(17);
        j0Var.setTypeface(org.telegram.messenger.i0.o());
        j0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        j0Var.setContentDescription(cd.L0(2131743266, null));
        int L = org.telegram.messenger.i0.L(8.0f);
        int o10 = i0.b.o(t6.x0(null, i11, false), 76);
        j0Var.setForeground(t6.k0(L, L, L, L, 0, o10, o10));
        j0Var.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
        j0Var.setOnClickListener(new ag.g(ud1Var, 22));
        addView(j0Var, b6.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        u71 u71Var = new u71(ud1Var, context, 13);
        this.d = u71Var;
        u71Var.setClipChildren(false);
        addView(u71Var, b6.e(-1, 64, 80));
        int i12 = 0;
        while (i12 < this.e.length) {
            String L0 = i12 == 0 ? cd.L0(2131743285, null) : i12 == 1 ? cd.L0(2131743431, null) : cd.L0(2131743519, null);
            this.e[i12] = new d2(context, L0);
            this.e[i12].setContentDescription(L0);
            this.e[i12].setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            this.d.addView(this.e[i12], b6.o(-2, -1));
            this.e[i12].setOnClickListener(new bh.f(ud1Var, i12, 16));
            i12++;
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new k0());
            sharedInstance.setLocalSink(this.f.d, false);
        }
        i0 i0Var2 = this.b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new jb0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, b6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(cd.L0(2131743249, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(textView, b6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        i0Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        i0Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new fe.c(ud1Var, f7, f10, i10));
        ofFloat.addListener(new s9(ud1Var, 24));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new bg.k(ud1Var, 21));
        gr grVar = gr.f;
        ofFloat.setInterpolator(grVar);
        long j10 = zs.r5;
        ofFloat.setDuration(j10);
        ofFloat.start();
        ofFloat2.setInterpolator(grVar);
        ofFloat2.setDuration(j10);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.c.setTranslationY(org.telegram.messenger.i0.L(53.0f));
        this.c.setTranslationX((f7 - (org.telegram.messenger.i0.q.x / 2.0f)) + org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(26.0f));
        this.c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.O = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.a || this.D != 1.0f) {
            return;
        }
        ud1 ud1Var = (ud1) this;
        int i10 = 0;
        ud1Var.V.w.S = false;
        ud1Var.V.w.invalidate();
        int i11 = 1;
        this.a = true;
        b();
        be1 be1Var = ud1Var.V;
        be1Var.o0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        be1Var.u0.setLockOnScreen(false);
        int i12 = 2;
        if (z11) {
            be1Var.n0 = true;
            if (sharedInstance != null && !z10) {
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.switchToSpeaker();
            }
            if (sharedInstance != null) {
                be1Var.u(be1Var.f, sharedInstance, true);
            }
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        be1Var.q0 = be1Var.p0;
        be1Var.G();
        if (ud1Var.V.m0 && z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new f0(this, i10));
            ofFloat.setInterpolator(gr.f);
            ofFloat.setStartDelay(60L);
            ofFloat.setDuration(350L);
            ofFloat.addListener(new g0(this, 2));
            ofFloat.start();
            this.c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
        } else if (z11) {
            animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(gr.f).setListener(new g0(this, 0));
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new f0(this, i11));
            ofFloat2.addListener(new g0(this, 1));
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new f0(this, i12));
            gr grVar = gr.f;
            ofFloat2.setInterpolator(grVar);
            long j10 = zs.r5;
            ofFloat2.setDuration(j10);
            ofFloat2.start();
            ofFloat3.setInterpolator(grVar);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            this.d.setAlpha(1.0f);
            this.d.setScaleY(1.0f);
            this.d.setScaleX(1.0f);
            this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
            ViewPropertyAnimator translationX = this.c.animate().translationY(org.telegram.messenger.i0.L(53.0f)).translationX((this.I - (org.telegram.messenger.i0.q.x / 2.0f)) + org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(26.0f));
            float f7 = zs.r5;
            translationX.setDuration((long) (0.6f * f7)).start();
            animate().alpha(0.0f).setDuration((long) (0.25f * f7)).setStartDelay((long) (f7 * 0.75f)).start();
        }
        invalidate();
    }

    public final void b() {
        y1 y1Var = this.f;
        if (this.n) {
            try {
                Bitmap bitmap = y1Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), y1Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "cthumb" + this.h + ".jpg"));
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                        View findViewWithTag = this.b.findViewWithTag("image_stab");
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void c(int i10, boolean z10) {
        int i11;
        if (this.w == i10 || (i11 = this.x) == i10) {
            return;
        }
        y1 y1Var = this.f;
        if (!z10) {
            this.x = i10;
            this.w = i10;
            this.s = 0.0f;
            e();
            y1Var.setVisibility(0);
            this.n = false;
            this.h = 1;
            d(true, false);
            return;
        }
        if (i11 == 0) {
            if (this.h != i10) {
                this.h = i10;
                this.n = false;
                d(true, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().switchCamera();
                }
            } else {
                d(false, false);
                y1Var.animate().alpha(1.0f).setDuration(250L).start();
            }
        } else if (i10 == 0) {
            this.b.findViewWithTag("screencast_stub").setVisibility(0);
            b();
            d(false, false);
            y1Var.animate().alpha(0.0f).setDuration(250L).start();
        } else {
            b();
            this.h = i10;
            this.n = false;
            d(true, false);
            y1Var.animate().alpha(0.0f).setDuration(250L).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().switchCamera();
            }
        }
        int i12 = this.x;
        if (i10 > i12) {
            this.y = i12;
            this.x = i12 + 1;
            this.U = ValueAnimator.ofFloat(0.1f, 1.0f);
        } else {
            this.y = i12;
            this.x = i12 - 1;
            this.w = i10;
            this.U = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.U.addUpdateListener(new f0(this, 3));
        this.U.addListener(new d5(this, i10, 13));
        this.U.setInterpolator(gr.f);
        this.U.setDuration(350L);
        this.U.start();
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.b.findViewWithTag("image_stab");
        if (!z10) {
            imageView.setVisibility(8);
            return;
        }
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "cthumb" + this.h + ".jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            imageView.setImageResource(R.drawable.icplaceholder);
        } else {
            imageView.setImageBitmap(bitmap);
        }
        if (!z11) {
            imageView.setAlpha(1.0f);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(250L).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7 = this.D;
        Path path = this.K;
        if (f7 < 1.0f) {
            Point point = org.telegram.messenger.i0.q;
            int i10 = point.x;
            int i11 = point.y + org.telegram.messenger.i0.m + org.telegram.messenger.i0.n;
            float L = org.telegram.messenger.i0.L(28.0f) - (org.telegram.messenger.i0.L(28.0f) * this.D);
            path.reset();
            float L2 = this.I + org.telegram.messenger.i0.L(33.5f);
            float L3 = this.J + org.telegram.messenger.i0.L(26.6f);
            float L4 = org.telegram.messenger.i0.L(26.0f);
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(L2, L3, L4, direction);
            int L5 = org.telegram.messenger.i0.L(52.0f);
            int L6 = org.telegram.messenger.i0.L(52.0f);
            int W1 = org.telegram.messenger.i0.W1(this.D, L5, i10);
            int W12 = org.telegram.messenger.i0.W1(this.D, L6, i11);
            float L7 = this.G - ((1.0f - this.D) * org.telegram.messenger.i0.L(20.0f));
            float L8 = this.H - ((1.0f - this.D) * org.telegram.messenger.i0.L(51.0f));
            path.addRoundRect(L7, L8, W1 + L7, L8 + W12, L, L, direction);
            canvas.clipPath(path);
        }
        if (this.F > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f10 = this.F;
            int i12 = (int) (floatingViewLocation[0] * f10);
            int i13 = (int) (floatingViewLocation[1] * f10);
            int i14 = floatingViewLocation[2];
            float z10 = c3.i0.z(1.0f, f10, r4 - i14, i14) / org.telegram.messenger.i0.q.x;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z10, getHeight() * z10, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
            canvas.translate(i12, i13);
            canvas.clipPath(path);
            canvas.scale(z10, z10);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10 = this.w;
        d2[] d2VarArr = this.e;
        d2 d2Var = d2VarArr[i10];
        d2 d2Var2 = i10 < d2VarArr.length - 1 ? d2VarArr[i10 + 1] : null;
        float measuredWidth = (d2Var.getMeasuredWidth() / 2) + d2Var.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (d2Var2 != null) {
            measuredWidth2 -= (((d2Var2.getMeasuredWidth() / 2) + d2Var2.getLeft()) - measuredWidth) * this.s;
        }
        int i11 = 0;
        while (true) {
            float f7 = 0.7f;
            if (i11 >= d2VarArr.length) {
                break;
            }
            int i12 = this.w;
            float f10 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.s;
                    f7 = 1.0f - (0.3f * f11);
                    f10 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.s;
                    f7 = 0.7f + (0.3f * f12);
                    f10 = 0.9f + (f12 * 0.1f);
                }
            }
            d2VarArr[i11].setAlpha(f7);
            d2VarArr[i11].setScaleX(f10);
            d2VarArr[i11].setScaleY(f10);
            d2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.c.invalidate();
        if (this.x == 0) {
            d2VarArr[2].setAlpha(this.s * 0.7f);
        }
        if (this.x == 2) {
            float f13 = this.s;
            if (f13 > 0.0f) {
                d2VarArr[0].setAlpha((1.0f - f13) * 0.7f);
            } else {
                d2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.x == 1) {
            if (this.y == 0) {
                d2VarArr[2].setAlpha(this.s * 0.7f);
            }
            if (this.y == 2) {
                d2VarArr[0].setAlpha((1.0f - this.s) * 0.7f);
            }
        }
    }

    public int[] getFloatingViewLocation() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onAudioSettingsChanged() {
        org.telegram.messenger.voip.y0.a(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
        if (this.n) {
            return;
        }
        this.n = true;
        if (this.x != 0) {
            this.f.animate().alpha(1.0f).setDuration(250L).start();
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z10) {
        if (VoIPService.getSharedInstance() != null) {
            this.f.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i10) {
        org.telegram.messenger.voip.y0.g(this, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
