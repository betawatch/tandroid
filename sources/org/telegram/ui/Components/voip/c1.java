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
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.j5;
import bi.kc;
import bi.ld;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.gc1;
import org.telegram.ui.si1;
import org.telegram.ui.vo;
import org.telegram.ui.zi1;
import org.webrtc.RendererCommon;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class c1 extends FrameLayout implements VoIPService.StateListener {
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
    public final com.google.firebase.messaging.n P;
    public final com.google.firebase.messaging.n Q;
    public final lc0 R;
    public final lc0 S;
    public final GestureDetector T;
    public ValueAnimator U;
    public boolean a;
    public final ld b;
    public final a1 c;
    public final gc1 d;
    public final x2[] e;
    public final r2 f;
    public int h;
    public boolean n;
    public final org.telegram.ui.ActionBar.l r;
    public float s;
    public int v;
    public int w;
    public int x;
    public float y;

    public c1(Context context, float f7, float f10) {
        super(context);
        this.h = 1;
        this.x = -1;
        this.y = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.K = new Path();
        this.L = new Camera();
        this.M = new Matrix();
        this.N = new Matrix();
        this.P = new com.google.firebase.messaging.n(80, 80);
        this.Q = new com.google.firebase.messaging.n(80, 80);
        this.R = new lc0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.S = new lc0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.I = f7;
        this.J = f10;
        int i10 = 3;
        this.e = new x2[3];
        si1 si1Var = (si1) this;
        this.T = new GestureDetector(context, new z0(si1Var));
        ld ldVar = new ld(si1Var, context, 21);
        this.b = ldVar;
        ldVar.setClickable(true);
        addView(ldVar, a6.c(-1.0f, -1));
        r2 r2Var = new r2(context, false, false);
        this.f = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        q2 q2Var = r2Var.d;
        q2Var.setScalingType(scalingType);
        r2Var.a0 = 1;
        r2Var.c0 = true;
        q2Var.setAlpha(0.0f);
        q2Var.setRotateTextureWithScreen(true);
        q2Var.setUseCameraRotation(true);
        addView(r2Var, a6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        this.r = lVar;
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        lVar.setBackgroundColor(0);
        lVar.C(j6.w0(null, j6.hg, false), false);
        lVar.setOccupyStatusBar(true);
        lVar.setActionBarMenuOnItemClick(new vo(si1Var, 15));
        addView(lVar);
        a1 a1Var = new a1(si1Var, getContext());
        this.c = a1Var;
        a1Var.setMaxLines(1);
        a1Var.setEllipsize(null);
        a1Var.setMinWidth(AndroidUtilities.dp(64.0f));
        a1Var.setTag(-1);
        a1Var.setTextSize(1, 14.0f);
        int i11 = j6.ng;
        a1Var.setTextColor(j6.w0(null, i11, false));
        a1Var.setGravity(17);
        a1Var.setTypeface(AndroidUtilities.bold());
        a1Var.getPaint().setTextAlign(Paint.Align.CENTER);
        a1Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(8.0f);
            int k10 = i0.a.k(j6.w0(null, i11, false), 76);
            a1Var.setForeground(j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        a1Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        a1Var.setOnClickListener(new ai.u(si1Var, 28));
        addView(a1Var, a6.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        gc1 gc1Var = new gc1(si1Var, context, 12);
        this.d = gc1Var;
        gc1Var.setClipChildren(false);
        addView(gc1Var, a6.e(-1, 64, 80));
        int i12 = 0;
        while (i12 < this.e.length) {
            String string = i12 == 0 ? LocaleController.getString(R.string.VoipPhoneScreen) : i12 == 1 ? LocaleController.getString(R.string.VoipFrontCamera) : LocaleController.getString(R.string.VoipBackCamera);
            this.e[i12] = new x2(context, string);
            this.e[i12].setContentDescription(string);
            this.e[i12].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.e[i12], a6.n(-2, -1));
            this.e[i12].setOnClickListener(new j5(si1Var, i12, 16));
            i12++;
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new b1());
            sharedInstance.setLocalSink(this.f.d, false);
        }
        ld ldVar2 = this.b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new lc0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, a6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.a2.q(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, a6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        ldVar2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        ldVar2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new kc(si1Var, f7, f10, i10));
        ofFloat.addListener(new zn0(si1Var, 25));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ai.a(si1Var, 17));
        wr wrVar = wr.f;
        ofFloat.setInterpolator(wrVar);
        long j3 = 320;
        ofFloat.setDuration(j3);
        ofFloat.start();
        ofFloat2.setInterpolator(wrVar);
        ofFloat2.setDuration(j3);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.c.setTranslationX((f7 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.c.animate().translationY(0.0f).translationX(0.0f).setDuration(j3).start();
        this.O = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.a || this.y != 1.0f) {
            return;
        }
        si1 si1Var = (si1) this;
        int i10 = 0;
        si1Var.V.v.S = false;
        si1Var.V.v.invalidate();
        int i11 = 1;
        this.a = true;
        b();
        zi1 zi1Var = si1Var.V;
        zi1Var.o0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        zi1Var.u0.setLockOnScreen(false);
        int i12 = 2;
        if (z11) {
            zi1Var.n0 = true;
            if (sharedInstance != null && !z10) {
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.switchToSpeaker();
            }
            if (sharedInstance != null) {
                zi1Var.v(zi1Var.f, sharedInstance, true);
            }
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        zi1Var.q0 = zi1Var.p0;
        zi1Var.H();
        if (si1Var.V.m0 && z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new x0(this, i10));
            ofFloat.setInterpolator(wr.f);
            ofFloat.setStartDelay(60L);
            ofFloat.setDuration(350L);
            ofFloat.addListener(new y0(this, 2));
            ofFloat.start();
            this.c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
        } else if (z11) {
            animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(wr.f).setListener(new y0(this, 0));
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new x0(this, i11));
            ofFloat2.addListener(new y0(this, 1));
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new x0(this, i12));
            wr wrVar = wr.f;
            ofFloat2.setInterpolator(wrVar);
            long j3 = 320;
            ofFloat2.setDuration(j3);
            ofFloat2.start();
            ofFloat3.setInterpolator(wrVar);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            this.d.setAlpha(1.0f);
            this.d.setScaleY(1.0f);
            this.d.setScaleX(1.0f);
            this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
            float f7 = 320;
            this.c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.I - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration((long) (0.6f * f7)).start();
            animate().alpha(0.0f).setDuration((long) (0.25f * f7)).setStartDelay((long) (f7 * 0.75f)).start();
        }
        invalidate();
    }

    public final void b() {
        r2 r2Var = this.f;
        if (this.n) {
            try {
                Bitmap bitmap = r2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), r2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.h + ".jpg"));
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
        if (this.v == i10 || (i11 = this.w) == i10) {
            return;
        }
        r2 r2Var = this.f;
        if (!z10) {
            this.w = i10;
            this.v = i10;
            this.s = 0.0f;
            e();
            r2Var.setVisibility(0);
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
                r2Var.animate().alpha(1.0f).setDuration(250L).start();
            }
        } else if (i10 == 0) {
            this.b.findViewWithTag("screencast_stub").setVisibility(0);
            b();
            d(false, false);
            r2Var.animate().alpha(0.0f).setDuration(250L).start();
        } else {
            b();
            this.h = i10;
            this.n = false;
            d(true, false);
            r2Var.animate().alpha(0.0f).setDuration(250L).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().switchCamera();
            }
        }
        int i12 = this.w;
        if (i10 > i12) {
            this.x = i12;
            this.w = i12 + 1;
            this.U = ValueAnimator.ofFloat(0.1f, 1.0f);
        } else {
            this.x = i12;
            this.w = i12 - 1;
            this.v = i10;
            this.U = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.U.addUpdateListener(new x0(this, 3));
        this.U.addListener(new di.y2(this, i10, 11));
        this.U.setInterpolator(wr.f);
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
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.h + ".jpg").getAbsolutePath());
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
        float f7 = this.y;
        Path path = this.K;
        if (f7 < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.y);
            path.reset();
            float dp2 = this.I + AndroidUtilities.dp(33.5f);
            float dp3 = this.J + AndroidUtilities.dp(26.6f);
            float dp4 = AndroidUtilities.dp(26.0f);
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(dp2, dp3, dp4, direction);
            int dp5 = AndroidUtilities.dp(52.0f);
            int dp6 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp5, i10, this.y);
            int lerp2 = AndroidUtilities.lerp(dp6, i11, this.y);
            float dp7 = this.G - ((1.0f - this.y) * AndroidUtilities.dp(20.0f));
            float dp8 = this.H - ((1.0f - this.y) * AndroidUtilities.dp(51.0f));
            path.addRoundRect(dp7, dp8, lerp + dp7, dp8 + lerp2, dp, dp, direction);
            canvas.clipPath(path);
        }
        if (this.F > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f10 = this.F;
            int i12 = (int) (floatingViewLocation[0] * f10);
            int i13 = (int) (floatingViewLocation[1] * f10);
            int i14 = floatingViewLocation[2];
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, r3 - i14, i14) / AndroidUtilities.displaySize.x;
            path.reset();
            path.addRoundRect(0.0f, 0.0f, getWidth() * z10, getHeight() * z10, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.translate(i12, i13);
            canvas.clipPath(path);
            canvas.scale(z10, z10);
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10 = this.v;
        x2[] x2VarArr = this.e;
        x2 x2Var = x2VarArr[i10];
        x2 x2Var2 = i10 < x2VarArr.length - 1 ? x2VarArr[i10 + 1] : null;
        float measuredWidth = (x2Var.getMeasuredWidth() / 2) + x2Var.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (x2Var2 != null) {
            measuredWidth2 -= (((x2Var2.getMeasuredWidth() / 2) + x2Var2.getLeft()) - measuredWidth) * this.s;
        }
        int i11 = 0;
        while (true) {
            float f7 = 0.7f;
            if (i11 >= x2VarArr.length) {
                break;
            }
            int i12 = this.v;
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
            x2VarArr[i11].setAlpha(f7);
            x2VarArr[i11].setScaleX(f10);
            x2VarArr[i11].setScaleY(f10);
            x2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.c.invalidate();
        if (this.w == 0) {
            x2VarArr[2].setAlpha(this.s * 0.7f);
        }
        if (this.w == 2) {
            float f13 = this.s;
            if (f13 > 0.0f) {
                x2VarArr[0].setAlpha((1.0f - f13) * 0.7f);
            } else {
                x2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.w == 1) {
            if (this.x == 0) {
                x2VarArr[2].setAlpha(this.s * 0.7f);
            }
            if (this.x == 2) {
                x2VarArr[0].setAlpha((1.0f - this.s) * 0.7f);
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
        org.telegram.messenger.voip.x0.a(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
        if (this.n) {
            return;
        }
        this.n = true;
        if (this.w != 0) {
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
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.x0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.x0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.x0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i10) {
        org.telegram.messenger.voip.x0.g(this, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.x0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
