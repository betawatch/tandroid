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
import i7.f6;
import java.io.File;
import java.io.FileOutputStream;
import lh.d5;
import nh.v9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.z51;
import org.telegram.ui.hh1;
import org.telegram.ui.oh1;
import org.telegram.ui.ua1;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class b1 extends FrameLayout implements VoIPService.StateListener {
    public float A;
    public float B;
    public float C;
    public float D;
    public final float E;
    public final float F;
    public final Path G;
    public final Camera H;
    public final Matrix I;
    public final Matrix J;
    public final boolean K;
    public final bg.c2 L;
    public final bg.c2 M;
    public final yb0 N;
    public final yb0 O;
    public final GestureDetector P;
    public ValueAnimator Q;
    public boolean a;
    public final z51 b;
    public final z0 c;
    public final ua1 d;
    public final z2[] e;
    public final u2 f;
    public int h;
    public boolean n;
    public final org.telegram.ui.ActionBar.l r;
    public float s;
    public int v;
    public int w;
    public int x;
    public float y;

    public b1(Context context, float f9, float f10) {
        super(context);
        this.h = 1;
        this.x = -1;
        this.y = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.G = new Path();
        this.H = new Camera();
        this.I = new Matrix();
        this.J = new Matrix();
        this.L = new bg.c2(80, 80);
        this.M = new bg.c2(80, 80);
        this.N = new yb0(-10497967, -16730994, -5649306, -10833593, false, 0, true);
        this.O = new yb0(-16735258, -14061833, -15151390, -12602625, false, 0, true);
        this.E = f9;
        this.F = f10;
        this.e = new z2[3];
        hh1 hh1Var = (hh1) this;
        this.P = new GestureDetector(context, new y0(hh1Var));
        z51 z51Var = new z51(hh1Var, context, 1);
        this.b = z51Var;
        z51Var.setClickable(true);
        addView(z51Var, f6.c(-1.0f, -1));
        u2 u2Var = new u2(context, false, false);
        this.f = u2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        t2 t2Var = u2Var.d;
        t2Var.setScalingType(scalingType);
        u2Var.T = 1;
        u2Var.V = true;
        t2Var.setAlpha(0.0f);
        t2Var.setRotateTextureWithScreen(true);
        t2Var.setUseCameraRotation(true);
        addView(u2Var, f6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        this.r = lVar;
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        lVar.setBackgroundColor(0);
        lVar.C(g6.w0(null, g6.hg, false), false);
        lVar.setOccupyStatusBar(true);
        int i10 = 2;
        lVar.setActionBarMenuOnItemClick(new m51(hh1Var, i10));
        addView(lVar);
        z0 z0Var = new z0(hh1Var, getContext());
        this.c = z0Var;
        z0Var.setMaxLines(1);
        z0Var.setEllipsize(null);
        z0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        z0Var.setTag(-1);
        z0Var.setTextSize(1, 14.0f);
        int i11 = g6.ng;
        z0Var.setTextColor(g6.w0(null, i11, false));
        int i12 = 17;
        z0Var.setGravity(17);
        z0Var.setTypeface(AndroidUtilities.bold());
        z0Var.getPaint().setTextAlign(Paint.Align.CENTER);
        z0Var.setContentDescription(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(8.0f);
            int k9 = i0.a.k(g6.w0(null, i11, false), 76);
            z0Var.setForeground(g6.i0(dp, dp, dp, dp, 0, k9, k9));
        }
        z0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        z0Var.setOnClickListener(new mh.n(hh1Var, 9));
        addView(z0Var, f6.d(52, 52.0f, 81, 0.0f, 0.0f, 0.0f, 80.0f));
        ua1 ua1Var = new ua1(hh1Var, context, 14);
        this.d = ua1Var;
        ua1Var.setClipChildren(false);
        addView(ua1Var, f6.e(-1, 64, 80));
        int i13 = 0;
        while (i13 < this.e.length) {
            String string = i13 == 0 ? LocaleController.getString(R.string.VoipPhoneScreen) : i13 == 1 ? LocaleController.getString(R.string.VoipFrontCamera) : LocaleController.getString(R.string.VoipBackCamera);
            this.e[i13] = new z2(context, string);
            this.e[i13].setContentDescription(string);
            this.e[i13].setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.d.addView(this.e[i13], f6.n(-2, -1));
            this.e[i13].setOnClickListener(new jh.y0(hh1Var, i13, 15));
            i13++;
        }
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.f.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new a1());
            sharedInstance.setLocalSink(this.f.d, false);
        }
        z51 z51Var2 = this.b;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackground(new yb0(true, -14602694, -13935795, -14395293, -14203560));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView, f6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        textView.setText(LocaleController.getString(R.string.VoipVideoPrivateScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        x3.t(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, f6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        frameLayout.setTag("screencast_stub");
        frameLayout.setVisibility(8);
        z51Var2.addView(frameLayout);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setTag("image_stab");
        imageView2.setImageResource(R.drawable.icplaceholder);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        z51Var2.addView(imageView2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new v9(hh1Var, f9, f10, i10));
        ofFloat.addListener(new p11(hh1Var, 13));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new d5(hh1Var, i12));
        jr jrVar = jr.f;
        ofFloat.setInterpolator(jrVar);
        long j10 = 320;
        ofFloat.setDuration(j10);
        ofFloat.start();
        ofFloat2.setInterpolator(jrVar);
        ofFloat2.setDuration(j10);
        ofFloat2.setStartDelay(32);
        ofFloat2.start();
        this.d.setAlpha(0.0f);
        this.d.setScaleY(0.8f);
        this.d.setScaleX(0.8f);
        this.d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay(120L).setDuration(250L).start();
        this.c.setTranslationY(AndroidUtilities.dp(53.0f));
        this.c.setTranslationX((f9 - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f));
        this.c.animate().translationY(0.0f).translationX(0.0f).setDuration(j10).start();
        this.K = true;
        c(1, false);
    }

    public final void a(boolean z10, boolean z11) {
        if (this.a || this.y != 1.0f) {
            return;
        }
        hh1 hh1Var = (hh1) this;
        int i10 = 0;
        hh1Var.R.v.O = false;
        hh1Var.R.v.invalidate();
        int i11 = 1;
        this.a = true;
        b();
        oh1 oh1Var = hh1Var.R;
        oh1Var.k0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        oh1Var.q0.setLockOnScreen(false);
        int i12 = 2;
        if (z11) {
            oh1Var.j0 = true;
            if (sharedInstance != null && !z10) {
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.switchToSpeaker();
            }
            if (sharedInstance != null) {
                oh1Var.v(oh1Var.f, sharedInstance, true);
            }
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        oh1Var.m0 = oh1Var.l0;
        oh1Var.H();
        if (hh1Var.R.i0 && z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new w0(this, i10));
            ofFloat.setInterpolator(jr.f);
            ofFloat.setStartDelay(60L);
            ofFloat.setDuration(350L);
            ofFloat.addListener(new x0(this, 2));
            ofFloat.start();
            this.c.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.r.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
            this.d.animate().setStartDelay(60L).alpha(0.0f).setDuration(100L).start();
        } else if (z11) {
            animate().setStartDelay(60L).alpha(0.0f).setDuration(350L).setInterpolator(jr.f).setListener(new x0(this, 0));
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new w0(this, i11));
            ofFloat2.addListener(new x0(this, 1));
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.addUpdateListener(new w0(this, i12));
            jr jrVar = jr.f;
            ofFloat2.setInterpolator(jrVar);
            long j10 = 320;
            ofFloat2.setDuration(j10);
            ofFloat2.start();
            ofFloat3.setInterpolator(jrVar);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            this.d.setAlpha(1.0f);
            this.d.setScaleY(1.0f);
            this.d.setScaleX(1.0f);
            this.d.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
            float f9 = 320;
            this.c.animate().translationY(AndroidUtilities.dp(53.0f)).translationX((this.E - (AndroidUtilities.displaySize.x / 2.0f)) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(26.0f)).setDuration((long) (0.6f * f9)).start();
            animate().alpha(0.0f).setDuration((long) (0.25f * f9)).setStartDelay((long) (f9 * 0.75f)).start();
        }
        invalidate();
    }

    public final void b() {
        u2 u2Var = this.f;
        if (this.n) {
            try {
                Bitmap bitmap = u2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), u2Var.d.getMatrix(), true);
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
        u2 u2Var = this.f;
        if (!z10) {
            this.w = i10;
            this.v = i10;
            this.s = 0.0f;
            e();
            u2Var.setVisibility(0);
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
                u2Var.animate().alpha(1.0f).setDuration(250L).start();
            }
        } else if (i10 == 0) {
            this.b.findViewWithTag("screencast_stub").setVisibility(0);
            b();
            d(false, false);
            u2Var.animate().alpha(0.0f).setDuration(250L).start();
        } else {
            b();
            this.h = i10;
            this.n = false;
            d(true, false);
            u2Var.animate().alpha(0.0f).setDuration(250L).start();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().switchCamera();
            }
        }
        int i12 = this.w;
        if (i10 > i12) {
            this.x = i12;
            this.w = i12 + 1;
            this.Q = ValueAnimator.ofFloat(0.1f, 1.0f);
        } else {
            this.x = i12;
            this.w = i12 - 1;
            this.v = i10;
            this.Q = ValueAnimator.ofFloat(1.0f, 0.0f);
        }
        this.Q.addUpdateListener(new w0(this, 3));
        this.Q.addListener(new z3(this, i10, 8));
        this.Q.setInterpolator(jr.f);
        this.Q.setDuration(350L);
        this.Q.start();
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
        float f9 = this.y;
        Path path = this.G;
        if (f9 < 1.0f) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight;
            float dp = AndroidUtilities.dp(28.0f) - (AndroidUtilities.dp(28.0f) * this.y);
            path.reset();
            float dp2 = this.E + AndroidUtilities.dp(33.5f);
            float dp3 = this.F + AndroidUtilities.dp(26.6f);
            float dp4 = AndroidUtilities.dp(26.0f);
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(dp2, dp3, dp4, direction);
            int dp5 = AndroidUtilities.dp(52.0f);
            int dp6 = AndroidUtilities.dp(52.0f);
            int lerp = AndroidUtilities.lerp(dp5, i10, this.y);
            int lerp2 = AndroidUtilities.lerp(dp6, i11, this.y);
            float dp7 = this.C - ((1.0f - this.y) * AndroidUtilities.dp(20.0f));
            float dp8 = this.D - ((1.0f - this.y) * AndroidUtilities.dp(51.0f));
            path.addRoundRect(dp7, dp8, lerp + dp7, dp8 + lerp2, dp, dp, direction);
            canvas.clipPath(path);
        }
        if (this.B > 0.0f) {
            int[] floatingViewLocation = getFloatingViewLocation();
            float f10 = this.B;
            int i12 = (int) (floatingViewLocation[0] * f10);
            int i13 = (int) (floatingViewLocation[1] * f10);
            int i14 = floatingViewLocation[2];
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, f10, r3 - i14, i14) / AndroidUtilities.displaySize.x;
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
        z2[] z2VarArr = this.e;
        z2 z2Var = z2VarArr[i10];
        z2 z2Var2 = i10 < z2VarArr.length - 1 ? z2VarArr[i10 + 1] : null;
        float measuredWidth = (z2Var.getMeasuredWidth() / 2) + z2Var.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (z2Var2 != null) {
            measuredWidth2 -= (((z2Var2.getMeasuredWidth() / 2) + z2Var2.getLeft()) - measuredWidth) * this.s;
        }
        int i11 = 0;
        while (true) {
            float f9 = 0.7f;
            if (i11 >= z2VarArr.length) {
                break;
            }
            int i12 = this.v;
            float f10 = 0.9f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.s;
                    f9 = 1.0f - (0.3f * f11);
                    f10 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.s;
                    f9 = 0.7f + (0.3f * f12);
                    f10 = 0.9f + (f12 * 0.1f);
                }
            }
            z2VarArr[i11].setAlpha(f9);
            z2VarArr[i11].setScaleX(f10);
            z2VarArr[i11].setScaleY(f10);
            z2VarArr[i11].setTranslationX(measuredWidth2);
            i11++;
        }
        this.c.invalidate();
        if (this.w == 0) {
            z2VarArr[2].setAlpha(this.s * 0.7f);
        }
        if (this.w == 2) {
            float f13 = this.s;
            if (f13 > 0.0f) {
                z2VarArr[0].setAlpha((1.0f - f13) * 0.7f);
            } else {
                z2VarArr[0].setAlpha(0.0f);
            }
        }
        if (this.w == 1) {
            if (this.x == 0) {
                z2VarArr[2].setAlpha(this.s * 0.7f);
            }
            if (this.x == 2) {
                z2VarArr[0].setAlpha((1.0f - this.s) * 0.7f);
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
        org.telegram.messenger.voip.u0.a(this);
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
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i10) {
        org.telegram.messenger.voip.u0.g(this, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(80.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
    }
}
