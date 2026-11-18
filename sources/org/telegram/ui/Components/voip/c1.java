package org.telegram.ui.Components.voip;

import a8.b8;
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
import c8.ma;
import hi.j9;
import hi.k3;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.w01;
import org.telegram.ui.bc1;
import org.telegram.ui.d61;
import org.telegram.ui.hc1;
import org.telegram.ui.x7;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class c1 extends FrameLayout implements VoIPService.StateListener {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public final float J;
    public final float K;
    public final Path L;
    public final Camera M;
    public final Matrix N;
    public final Matrix O;
    public final boolean P;
    public final b8 Q;
    public final b8 R;
    public final bb0 S;
    public final bb0 T;
    public final GestureDetector U;
    public ValueAnimator V;
    public boolean a;
    public final w01 b;
    public final a1 c;
    public final d61 d;
    public final s2[] e;
    public final n2 f;
    public int h;
    public boolean n;
    public final org.telegram.ui.ActionBar.k r;
    public float s;
    public int w;
    public int x;
    public int y;

    public c1(Context context, float f10, float f11) {
        super(context);
        this.h = 1;
        this.y = -1;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.L = new Path();
        this.M = new Camera();
        this.N = new Matrix();
        this.O = new Matrix();
        this.Q = new b8(80, 80);
        this.R = new b8(80, 80);
        this.S = new bb0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.T = new bb0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.J = f10;
        this.K = f11;
        this.e = new s2[3];
        bc1 bc1Var = (bc1) this;
        this.U = new GestureDetector(context, new z0(bc1Var));
        w01 w01Var = new w01(2, context, bc1Var);
        this.b = w01Var;
        w01Var.setClickable(true);
        addView(w01Var, ma.c(-1.0f, -1));
        n2 n2Var = new n2(context, false, false);
        this.f = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        n2Var.b0 = 1;
        n2Var.d0 = true;
        m2Var.setAlpha(0.0f);
        m2Var.setRotateTextureWithScreen(true);
        m2Var.setUseCameraRotation(true);
        addView(n2Var, ma.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        this.r = kVar;
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        kVar.setBackgroundColor(0);
        u6.l(kVar, 1, n6.Yg, null);
        kVar.setOccupyStatusBar(true);
        int i7 = 23;
        kVar.setActionBarMenuOnItemClick(new x7(bc1Var, i7));
        addView(kVar);
        a1 a1Var = new a1(bc1Var, getContext());
        this.c = a1Var;
        a1Var.setMaxLines(1);
        a1Var.setEllipsize(null);
        a1Var.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        a1Var.setTag(-1);
        a1Var.setTextSize(1, 14.0f);
        int i10 = n6.eh;
        u6.U(a1Var, i10, null);
        a1Var.setGravity(17);
        a1Var.setTypeface(org.telegram.messenger.g0.o());
        a1Var.getPaint().setTextAlign(Paint.Align.CENTER);
        a1Var.setContentDescription(gd.M0(2131743003, null));
        int L = org.telegram.messenger.g0.L(8.0f);
        int o4 = i0.a.o(n6.x0(null, i10, false), 76);
        a1Var.setForeground(n6.k0(L, L, L, L, 0, o4, o4));
        a1Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        a1Var.setOnClickListener(new hi.o0(bc1Var, 27));
        addView(a1Var, ma.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        d61 d61Var = new d61(18, context, bc1Var);
        this.d = d61Var;
        d61Var.setClipChildren(false);
        addView(d61Var, ma.e(-1, 64, 80));
        int i11 = 0;
        while (i11 < this.e.length) {
            String M0 = i11 == 0 ? gd.M0(2131743022, null) : i11 == 1 ? gd.M0(2131743168, null) : gd.M0(2131743256, null);
            this.e[i11] = new s2(context, M0);
            this.e[i11].setContentDescription(M0);
            this.e[i11].setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.d.addView(this.e[i11], ma.o(-2, -1));
            this.e[i11].setOnClickListener(new ci.q(bc1Var, i11, i7));
            i11++;
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new b1());
            sharedInstance.setLocalSink(this.f.d, false);
        }
        w01 w01Var2 = this.b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new bb0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, ma.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(gd.M0(2131742986, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, ma.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        w01Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        w01Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new j9(bc1Var, f10, f11, 2));
        ofFloat.addListener(new x9(bc1Var, 14));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new k3(bc1Var, 19));
        lr lrVar = lr.f;
        ofFloat.setInterpolator(lrVar);
        long j3 = ks.r5;
        ofFloat.setDuration(j3);
        ofFloat.start();
        ofFloat2.setInterpolator(lrVar);
        ofFloat2.setDuration(j3);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.c.setTranslationY(org.telegram.messenger.g0.L(53.0f));
        this.c.setTranslationX((f10 - (org.telegram.messenger.g0.q.x / 2.0f)) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(26.0f));
        this.c.animate().translationY(0.0f).translationX(0.0f).setDuration(j3).start();
        this.P = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.a || this.E != 1.0f) {
            return;
        }
        bc1 bc1Var = (bc1) this;
        int i7 = 0;
        bc1Var.W.w.T = false;
        bc1Var.W.w.invalidate();
        int i10 = 1;
        this.a = true;
        b();
        hc1 hc1Var = bc1Var.W;
        hc1Var.o0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        hc1Var.u0.setLockOnScreen(false);
        int i11 = 2;
        if (z11) {
            hc1Var.n0 = true;
            if (sharedInstance != null && !z10) {
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.switchToSpeaker();
            }
            if (sharedInstance != null) {
                hc1Var.m(hc1Var.f, sharedInstance, true);
            }
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        hc1Var.q0 = hc1Var.p0;
        hc1Var.y();
        if (bc1Var.W.m0 && z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x0(this, i7));
            ofFloat.setInterpolator(lr.f);
            ofFloat.setStartDelay(60L);
            ofFloat.setDuration(350L);
            ofFloat.addListener(new y0(this, 2));
            ofFloat.start();
            this.c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
        } else if (z11) {
            animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(lr.f).setListener(new y0(this, 0));
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new x0(this, i10));
            ofFloat2.addListener(new y0(this, 1));
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new x0(this, i11));
            lr lrVar = lr.f;
            ofFloat2.setInterpolator(lrVar);
            long j3 = ks.r5;
            ofFloat2.setDuration(j3);
            ofFloat2.start();
            ofFloat3.setInterpolator(lrVar);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            this.d.setAlpha(1.0f);
            this.d.setScaleY(1.0f);
            this.d.setScaleX(1.0f);
            this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
            ViewPropertyAnimator translationX = this.c.animate().translationY(org.telegram.messenger.g0.L(53.0f)).translationX((this.J - (org.telegram.messenger.g0.q.x / 2.0f)) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(26.0f));
            float f10 = ks.r5;
            translationX.setDuration((long) (0.6f * f10)).start();
            animate().alpha(0.0f).setDuration((long) (0.25f * f10)).setStartDelay((long) (f10 * 0.75f)).start();
        }
        invalidate();
    }

    public final void b() {
        n2 n2Var = this.f;
        if (this.n) {
            try {
                Bitmap bitmap = n2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), n2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb" + this.h + ".jpg"));
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

    public final void c(int i7, boolean z10) {
        int i10;
        if (this.w == i7 || (i10 = this.x) == i7) {
            return;
        }
        n2 n2Var = this.f;
        if (!z10) {
            this.x = i7;
            this.w = i7;
            this.s = 0.0f;
            e();
            n2Var.setVisibility(0);
            this.n = false;
            this.h = 1;
            d(true, false);
            return;
        }
        if (i10 == 0) {
            if (this.h != i7) {
                this.h = i7;
                this.n = false;
                d(true, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().switchCamera();
                }
            } else {
                d(false, false);
                n2Var.animate().alpha(1.0f).setDuration(250L).start();
            }
        } else if (i7 == 0) {
            this.b.findViewWithTag("screencast_stub").setVisibility(0);
            b();
            d(false, false);
            n2Var.animate().alpha(0.0f).setDuration(250L).start();
        } else {
            b();
            this.h = i7;
            this.n = false;
            d(true, false);
            n2Var.animate().alpha(0.0f).setDuration(250L).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().switchCamera();
            }
        }
        int i11 = this.x;
        if (i7 > i11) {
            this.y = i11;
            this.x = i11 + 1;
            this.V = ValueAnimator.ofFloat(0.1f, 1.0f);
        } else {
            this.y = i11;
            this.x = i11 - 1;
            this.w = i7;
            this.V = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.V.addUpdateListener(new x0(this, 3));
        this.V.addListener(new ki.f2(this, i7, 14));
        this.V.setInterpolator(lr.f);
        this.V.setDuration(350L);
        this.V.start();
    }

    public final void d(boolean z10, boolean z11) {
        Bitmap bitmap;
        ImageView imageView = (ImageView) this.b.findViewWithTag("image_stab");
        if (!z10) {
            imageView.setVisibility(8);
            return;
        }
        try {
            bitmap = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "cthumb" + this.h + ".jpg").getAbsolutePath());
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
        float f10 = this.E;
        Path path = this.L;
        if (f10 < 1.0f) {
            Point point = org.telegram.messenger.g0.q;
            int i7 = point.x;
            int i10 = point.y + org.telegram.messenger.g0.m + org.telegram.messenger.g0.n;
            float L = org.telegram.messenger.g0.L(28.0f) - (org.telegram.messenger.g0.L(28.0f) * this.E);
            path.reset();
            float L2 = this.J + org.telegram.messenger.g0.L(33.5f);
            float L3 = this.K + org.telegram.messenger.g0.L(26.6f);
            float L4 = org.telegram.messenger.g0.L(26.0f);
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(L2, L3, L4, direction);
            int L5 = org.telegram.messenger.g0.L(52.0f);
            int L6 = org.telegram.messenger.g0.L(52.0f);
            int W1 = org.telegram.messenger.g0.W1(this.E, L5, i7);
            int W12 = org.telegram.messenger.g0.W1(this.E, L6, i10);
            float L7 = this.H - ((1.0f - this.E) * org.telegram.messenger.g0.L(20.0f));
            float L8 = this.I - ((1.0f - this.E) * org.telegram.messenger.g0.L(51.0f));
            path.addRoundRect(L7, L8, W1 + L7, L8 + W12, L, L, direction);
            canvas.clipPath(path);
        }
        if (this.G > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f11 = this.G;
            int i11 = (int) (floatingViewLocation[0] * f11);
            int i12 = (int) (floatingViewLocation[1] * f11);
            int i13 = floatingViewLocation[2];
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f11, r4 - i13, i13) / org.telegram.messenger.g0.q.x;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z10, getHeight() * z10, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
            canvas.translate(i11, i12);
            canvas.clipPath(path);
            canvas.scale(z10, z10);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i7 = this.w;
        s2[] s2VarArr = this.e;
        s2 s2Var = s2VarArr[i7];
        s2 s2Var2 = i7 < s2VarArr.length - 1 ? s2VarArr[i7 + 1] : null;
        float measuredWidth = (s2Var.getMeasuredWidth() / 2) + s2Var.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (s2Var2 != null) {
            measuredWidth2 -= (((s2Var2.getMeasuredWidth() / 2) + s2Var2.getLeft()) - measuredWidth) * this.s;
        }
        int i10 = 0;
        while (true) {
            float f10 = 0.7f;
            if (i10 >= s2VarArr.length) {
                break;
            }
            int i11 = this.w;
            float f11 = 0.9f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.s;
                    f10 = 1.0f - (0.3f * f12);
                    f11 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.s;
                    f10 = 0.7f + (0.3f * f13);
                    f11 = 0.9f + (f13 * 0.1f);
                }
            }
            s2VarArr[i10].setAlpha(f10);
            s2VarArr[i10].setScaleX(f11);
            s2VarArr[i10].setScaleY(f11);
            s2VarArr[i10].setTranslationX(measuredWidth2);
            i10++;
        }
        this.c.invalidate();
        if (this.x == 0) {
            s2VarArr[2].setAlpha(this.s * 0.7f);
        }
        if (this.x == 2) {
            float f14 = this.s;
            if (f14 > 0.0f) {
                s2VarArr[0].setAlpha((1.0f - f14) * 0.7f);
            } else {
                s2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.x == 1) {
            if (this.y == 0) {
                s2VarArr[2].setAlpha(this.s * 0.7f);
            }
            if (this.y == 2) {
                s2VarArr[0].setAlpha((1.0f - this.s) * 0.7f);
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
        org.telegram.messenger.voip.t0.a(this);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i7) {
        org.telegram.messenger.voip.t0.g(this, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public void setBottomPadding(int i7) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(80.0f) + i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i7;
    }
}
