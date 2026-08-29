package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class r extends m {
    public static final int[] M1 = {21600, 43200, 86400, 172800};
    public float A1;
    public float B1;
    public final org.telegram.ui.Components.d6 C1;
    public final org.telegram.ui.Components.d6 D1;
    public final org.telegram.ui.Components.d6 E1;
    public final org.telegram.ui.Components.d6 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public final n L1;
    public final ImageView O0;
    public final ImageView P0;
    public final l Q0;
    public j70 R0;
    public boolean S0;
    public int T0;
    public Drawable U0;
    public boolean V0;
    public final q W0;
    public final org.telegram.ui.Components.n6 X0;
    public float Y0;
    public float Z0;
    public long a1;
    public final Paint b1;
    public final Paint c1;
    public final org.telegram.ui.Components.y9 d1;
    public final org.telegram.ui.Components.y9 e1;
    public final Drawable f1;
    public float g1;
    public final org.telegram.ui.Components.d6 h1;
    public final Path i1;
    public final Path j1;
    public final Paint k1;
    public final Paint l1;
    public final Paint m1;
    public final Paint n1;
    public final org.telegram.ui.Components.d6 o1;
    public final RectF p1;
    public final RectF q1;
    public final RectF r1;
    public final Path s1;
    public zz0 t1;
    public Path u1;
    public Paint v1;
    public zz0 w1;
    public Utilities.Callback x1;
    public Utilities.Callback y1;
    public p z1;

    public r(Context context, FrameLayout frameLayout, hv0 hv0Var, FrameLayout frameLayout2, lh.b bVar, org.telegram.ui.Components.ga gaVar) {
        super(context, frameLayout, hv0Var, frameLayout2, bVar, gaVar);
        this.S0 = true;
        this.T0 = 0;
        wa waVar = (wa) this;
        this.W0 = new q(waVar, waVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.X0 = n6Var;
        jr jrVar = jr.f;
        n6Var.k(0.16f, 50L, jrVar);
        n6Var.t(AndroidUtilities.dp(15.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.q("0:00.0", true, true);
        n6Var.r(-1);
        Paint paint = new Paint(1);
        this.b1 = paint;
        Paint paint2 = new Paint(1);
        this.c1 = paint2;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(11, LiteMode.FLAGS_CHAT);
        this.d1 = y9Var;
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(12, LiteMode.FLAGS_CHAT);
        this.e1 = y9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        y9Var.a = AndroidUtilities.dp(47.0f);
        y9Var.b = AndroidUtilities.dp(55.0f);
        y9Var.b();
        y9Var2.a = AndroidUtilities.dp(47.0f);
        y9Var2.b = AndroidUtilities.dp(55.0f);
        y9Var2.b();
        this.f1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.h1 = new org.telegram.ui.Components.d6(new n(waVar, 0), 200L, jrVar, 0);
        this.i1 = new Path();
        this.j1 = new Path();
        this.k1 = new Paint(1);
        this.l1 = new Paint(1);
        this.m1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.n1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(waVar, 0);
        jr jrVar2 = jr.h;
        this.o1 = new org.telegram.ui.Components.d6(nVar, 350L, jrVar2);
        this.p1 = new RectF();
        this.q1 = new RectF();
        this.r1 = new RectF();
        this.s1 = new Path();
        this.C1 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar2);
        this.D1 = new org.telegram.ui.Components.d6(new n(waVar, 0), 420L, jrVar2, 0);
        this.E1 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar2);
        this.F1 = new org.telegram.ui.Components.d6(new n(waVar, 0), 350L, jrVar2, 0);
        this.L1 = new n(waVar, 1);
        ImageView imageView = new ImageView(context);
        this.O0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, i7.f6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new mh.n(waVar, 2));
        ImageView imageView2 = new ImageView(context);
        this.P0 = imageView2;
        l lVar = new l(5);
        this.Q0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, i7.f6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new bg.q(waVar, frameLayout, bVar, 14));
    }

    public final void A(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                i11 = 2;
                break;
            } else if (M1[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (this.T0 == i11) {
            return;
        }
        this.T0 = i11;
        this.Q0.d(i10 / 3600, false, z10);
    }

    public final void B() {
        if (this.V0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new l4.s0(this, 12));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q7, this.a));
            }
        }
    }

    @Override // nh.m
    public final int b() {
        return 36;
    }

    @Override // nh.m
    public final void c(boolean z10) {
        int i10 = (z10 || !this.S0) ? 8 : 0;
        ImageView imageView = this.P0;
        imageView.setVisibility(i10);
        this.O0.setVisibility(z10 ? 8 : 0);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override // nh.m
    public final void d(boolean z10) {
        if (z10) {
            return;
        }
        this.P0.setVisibility(this.S0 ? 0 : 8);
        this.O0.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r10.J1 == false) goto L67;
     */
    @Override // nh.m, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p pVar;
        Drawable drawable;
        if (this.K1 && (pVar = this.z1) != null && pVar.a != null && (drawable = this.U0) != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(drawable.getBounds());
            rectF.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
            int i10 = 0;
            while (true) {
                if (i10 >= motionEvent.getPointerCount()) {
                    break;
                }
                if (!AndroidUtilities.rectTmp.contains(motionEvent.getX(i10), motionEvent.getY(i10))) {
                    i10++;
                } else if (motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5) {
                    this.z1.a.switchCamera();
                    Drawable drawable2 = this.U0;
                    if (drawable2 instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable2).start();
                    }
                }
            }
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        ImageView imageView = this.O0;
        rectF2.set(imageView.getX(), imageView.getY(), imageView.getX() + imageView.getMeasuredWidth(), imageView.getY() + imageView.getMeasuredHeight());
        if (!this.J1 && (this.V0 || this.l0 || !rectF2.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.K1 && this.I1) {
                if (this.q1.contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, true);
                    this.J1 = false;
                    return true;
                }
            }
            if (this.K1) {
                if (this.p1.contains(motionEvent.getX(), motionEvent.getY()) || getBounds().contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, false);
                    this.J1 = false;
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        q qVar = this.W0;
        n nVar = this.L1;
        if (action != 0) {
            if (motionEvent.getAction() == 2) {
                if (!this.G1) {
                    this.Y0 = Utilities.clamp((this.A1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                    float clamp = Utilities.clamp((this.B1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                    this.Z0 = clamp;
                    boolean z10 = this.I1;
                    if (!z10 && !this.G1 && this.Y0 >= 1.0f) {
                        this.G1 = true;
                        this.K1 = false;
                        imageView.setVisibility(4);
                        this.P0.setVisibility(4);
                        qVar.g = true;
                        xi0 xi0Var = qVar.h;
                        xi0Var.Q(0.0f, true);
                        if (qVar.f) {
                            xi0Var.start();
                        }
                        p pVar2 = this.z1;
                        if (pVar2 != null) {
                            pVar2.x = true;
                            AndroidUtilities.cancelRunOnUIThread(pVar2.h);
                            CameraController.getInstance().stopVideoRecording(pVar2.a.getCameraSessionRecording(), false, false);
                            pVar2.a(false);
                        }
                        AndroidUtilities.runOnUIThread(nVar, 800L);
                    } else if (!z10 && !this.G1 && clamp >= 1.0f && this.Y0 < 0.4f) {
                        this.I1 = true;
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    invalidate();
                    n();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!this.G1 && !this.I1) {
                    z(false, false);
                }
                this.J1 = false;
            }
            return this.J1;
        }
        if (this.K1) {
            this.J1 = false;
            z(false, false);
            return true;
        }
        this.J1 = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        wa waVar = (wa) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        gb gbVar = waVar.O1;
        if (!isCameraAllowed ? false : gb.d(gbVar)) {
            AndroidUtilities.cancelRunOnUIThread(nVar);
            this.A1 = motionEvent.getX();
            this.B1 = motionEvent.getY();
            this.g1 = 0.0f;
            this.Y0 = 0.0f;
            this.C1.d(0.0f, true);
            this.D1.d(0.0f, true);
            this.G1 = false;
            this.H1 = false;
            this.I1 = false;
            qVar.g = false;
            xi0 xi0Var2 = qVar.h;
            xi0Var2.stop();
            xi0Var2.Q(0.0f, true);
            this.K1 = true;
            this.a1 = System.currentTimeMillis();
            this.G0 = true;
            this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            p pVar3 = new p(this, getContext());
            this.z1 = pVar3;
            p pVar4 = gbVar.m1;
            if (pVar4 != null) {
                pVar4.a(true);
            }
            va vaVar = gbVar.T0;
            if (vaVar != null) {
                vaVar.K = true;
                vaVar.c();
                va vaVar2 = gbVar.T0;
                vaVar2.m(0L);
                qb qbVar = vaVar2.B;
                if (qbVar != null) {
                    qbVar.setProgress(0L);
                }
            }
            pVar3.n = new lh.z(1, waVar, pVar3);
            pVar3.r = new n(waVar, 2);
            ta taVar = gbVar.d0;
            gbVar.m1 = pVar3;
            taVar.addView(pVar3, i7.f6.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // nh.m
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault;
    }

    @Override // nh.m
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // nh.m
    public final void j(Canvas canvas, RectF rectF) {
        float f9;
        Paint paint;
        float f10;
        float f11;
        float f12;
        float f13;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.z1 != null) {
            float e10 = this.C1.e(this.G1);
            float e11 = this.E1.e(this.I1);
            if (this.a1 <= 0) {
                this.a1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin(((System.currentTimeMillis() - this.a1) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            q qVar = this.W0;
            qVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            qVar.draw(canvas3);
            int dp3 = (int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e10));
            int dp4 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f));
            int dp5 = (int) (rectF.left + AndroidUtilities.dp(133.3f));
            int dp6 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.n6 n6Var = this.X0;
            n6Var.setBounds(dp3, dp4, dp5, dp6);
            long b10 = this.z1.b();
            int i10 = (int) (b10 / 1000);
            int i11 = (int) ((b10 - (i10 * MediaDataController.MAX_STYLE_RUNS_COUNT)) / 100);
            int i12 = i10 / 60;
            int i13 = i10 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(":");
            sb2.append(i13 < 10 ? "0" : "");
            sb2.append(i13);
            sb2.append(".");
            sb2.append(i11);
            n6Var.q(sb2.toString(), true, true);
            n6Var.w = (int) ((1.0f - e10) * 255.0f);
            n6Var.draw(canvas3);
            float f14 = 1.0f - e11;
            float f15 = (1.0f - this.Y0) * f14;
            Paint c3 = this.L.c(1.0f);
            if (c3 != null) {
                f9 = f15;
                paint = c3;
                f10 = 10.0f;
                f11 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f9 = f15;
                paint = c3;
                f10 = 10.0f;
                f11 = 12.0f;
            }
            if (f9 > 0.0f) {
                if (this.t1 == null) {
                    this.t1 = new zz0(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.u1 == null) {
                    Path path = new Path();
                    this.u1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.u1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.u1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f10));
                    Paint paint2 = new Paint(1);
                    this.v1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.v1.setStrokeCap(Paint.Cap.ROUND);
                    this.v1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.v1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.t1.p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - n6Var.d());
                float b11 = th.b(1.0f, this.Y0, AndroidUtilities.dp(6.0f) * sin, (rectF.centerX() - ((this.t1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.Y0, 1.0f, e11) * (rectF.width() / 6.0f)));
                int l1 = org.telegram.ui.ActionBar.g6.l1(f9, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(b11, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.v1.setColor(l1);
                canvas3.drawPath(this.u1, this.v1);
                canvas3.restore();
                f12 = 15.0f;
                f13 = 0.0f;
                this.t1.c(b11 + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f12 = 15.0f;
                f13 = 0.0f;
            }
            if (e11 > f13) {
                if (this.w1 == null) {
                    this.w1 = new zz0(LocaleController.getString(R.string.CancelRound), f12, AndroidUtilities.bold());
                }
                this.w1.p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - n6Var.d());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.w1.l() / 2.0f));
                canvas2 = canvas;
                this.w1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.g6.l1(e11, paint != null ? -1 : -2130706433), canvas2);
                this.q1.set(width - AndroidUtilities.dp(f11), rectF.top, this.w1.l() + width + AndroidUtilities.dp(f11), rectF.bottom);
            } else {
                canvas2 = canvas;
            }
            if (paint != null) {
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
            }
            invalidate();
        }
    }

    @Override // nh.m
    public final void k(Canvas canvas, RectF rectF, float f9) {
        float f10;
        float f11;
        float f12;
        if (f9 <= 0.0f) {
            return;
        }
        boolean z10 = this.G1;
        org.telegram.ui.Components.d6 d6Var = this.D1;
        float e10 = d6Var.e(z10);
        boolean z11 = this.I1;
        org.telegram.ui.Components.d6 d6Var2 = this.F1;
        float e11 = d6Var2.e(z11);
        float d = this.h1.d(this.g1, false);
        float f13 = 1.0f - e10;
        float z12 = com.google.android.recaptcha.internal.a.z(1.0f, this.Y0, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f)) * f13 * f9;
        float lerp = AndroidUtilities.lerp(th.b(1.0f, e11, getWidth() * 0.35f * this.Y0, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e10);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
        Paint paint = this.c1;
        if (isEnabled) {
            float dp2 = AndroidUtilities.dp(47.0f);
            org.telegram.ui.Components.y9 y9Var = this.d1;
            y9Var.a = dp2;
            Paint paint2 = y9Var.d;
            f12 = 0.0f;
            y9Var.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            float dp3 = AndroidUtilities.dp(50.0f);
            f10 = e11;
            org.telegram.ui.Components.y9 y9Var2 = this.e1;
            y9Var2.a = dp3;
            Paint paint3 = y9Var2.d;
            f11 = f13;
            y9Var2.b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            y9Var2.e(d, 1.01f);
            y9Var.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f * f9, paint.getColor()));
            canvas.save();
            float f14 = z12 / y9Var2.a;
            canvas.scale(f14, f14, lerp, dp);
            y9Var2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f * f9, paint.getColor()));
            canvas.save();
            float f15 = z12 / y9Var.a;
            canvas.scale(f15, f15, lerp, dp);
            y9Var.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f10 = e11;
            f11 = f13;
            f12 = 0.0f;
        }
        float min = Math.min(z12, AndroidUtilities.dp(55.0f));
        float f16 = f9 * 255.0f;
        paint.setAlpha((int) f16);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.i1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f1;
        drawable.setBounds((int) (lerp - (((drawable.getIntrinsicWidth() / 2.0f) * f11) * (this.H1 ? f9 : 1.0f))), (int) (dp - (((drawable.getIntrinsicHeight() / 2.0f) * f11) * (this.H1 ? f9 : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f11 * (this.H1 ? f9 : 1.0f)) + lerp), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f11 * (this.H1 ? f9 : 1.0f)) + dp));
        drawable.setAlpha((int) (f11 * 255.0f * (this.H1 ? f9 : 1.0f)));
        drawable.draw(canvas);
        if (f10 > f12) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f10 * f9;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.b1);
        }
        canvas.restore();
        float f17 = d6Var.c;
        float f18 = d6Var2.c;
        float y8 = org.telegram.messenger.x3.y(1.0f, f17, AndroidUtilities.lerp(this.o1.e(this.Y0 < 0.4f), 0.0f, f18), f9);
        float dp4 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f18) * y8) / 2.0f;
        float f19 = 1.0f - f18;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.Z0) * f19), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - y8);
        float dp5 = (AndroidUtilities.dp(36.0f) * y8) / 2.0f;
        RectF rectF3 = this.p1;
        rectF3.set(dp4 - dp5, lerp3 - lerp2, dp5 + dp4, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f18);
        float dp6 = AndroidUtilities.dp(1.0f);
        float dp7 = AndroidUtilities.dp(0.66f);
        int l1 = org.telegram.ui.ActionBar.g6.l1(y8, TLObject.FLAG_29);
        Paint paint4 = this.l1;
        paint4.setShadowLayer(dp6, 0.0f, dp7, l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c3 = this.N.c(y8);
        if (c3 == null) {
            Paint paint5 = this.k1;
            paint5.setColor(TLObject.FLAG_30);
            paint5.setAlpha((int) (64.0f * y8));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c3);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * y8));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(y8, y8, dp4, lerp3);
        int l12 = org.telegram.ui.ActionBar.g6.l1(y8, -1);
        Paint paint7 = this.m1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.g6.l1(y8 * f19, -1);
        Paint paint8 = this.n1;
        paint8.setColor(l13);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f18);
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f18);
        float dp8 = (AndroidUtilities.dp(4.0f) * f19) + lerp3;
        canvas.rotate(this.Z0 * 12.0f * f19, dp4, dp8);
        float f20 = lerp5 / 2.0f;
        float f21 = lerp6 / 2.0f;
        float f22 = dp8 - f21;
        RectF rectF4 = this.r1;
        rectF4.set(dp4 - f20, f22, f20 + dp4, dp8 + f21);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f18 < 1.0f) {
            canvas.save();
            canvas.rotate(this.Z0 * 12.0f * f19, dp4, f22);
            canvas.translate(0.0f, f21 * f18);
            canvas.scale(f19, f19, dp4, f22);
            Path path2 = this.s1;
            path2.rewind();
            float dp9 = AndroidUtilities.dp(4.33f);
            float dp10 = f22 - AndroidUtilities.dp(3.66f);
            float f23 = dp4 + dp9;
            path2.moveTo(f23, AndroidUtilities.dp(3.66f) + dp10);
            path2.lineTo(f23, dp10);
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f24 = dp4 - dp9;
            rectF5.set(f24, dp10 - dp9, f23, dp9 + dp10);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f24, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.Z0), 1.0f, f18) * AndroidUtilities.dp(3.66f)) + dp10);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.G1) {
            ImageView imageView = this.O0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.d6 d6Var3 = this.I0;
            ImageView imageView2 = this.P0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || d6Var3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.k0) * 255.0f), 31);
                Path path3 = this.j1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || d6Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || d6Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.U0 == null) {
            this.U0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.U0.setAlpha((int) (f16 * f11));
        float timelineHeight = getTimelineHeight();
        this.U0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.U0.draw(canvas);
    }

    @Override // nh.m, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q qVar = this.W0;
        xi0 xi0Var = qVar.h;
        qVar.f = true;
        if (qVar.g) {
            xi0Var.start();
        }
        xi0Var.r0 = qVar.i;
    }

    @Override // nh.m, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.W0;
        qVar.f = false;
        xi0 xi0Var = qVar.h;
        xi0Var.stop();
        xi0Var.r0 = null;
    }

    public void setAmplitude(double d) {
        this.g1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i10 = z10 ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.O0;
        imageView.setImageResource(i10);
        imageView.setContentDescription(LocaleController.getString(z10 ? R.string.AccDescrRemoveRoundVideo : R.string.AccDescrVideoMessage));
        this.V0 = z10;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.x1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.y1 = callback;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z10) {
        this.S0 = z10;
        this.P0.setVisibility((!z10 || this.l0) ? 8 : 0);
    }

    @Override // nh.m
    public final void u(float f9) {
        float f10 = 1.0f - f9;
        this.P0.setAlpha(f10);
        this.O0.setAlpha(f10);
    }

    public final void z(boolean z10, boolean z11) {
        AndroidUtilities.cancelRunOnUIThread(this.L1);
        this.H1 = true;
        this.K1 = false;
        int dp = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.Y0));
        this.G0 = false;
        this.H0 = dp;
        invalidate();
        p pVar = this.z1;
        if (pVar != null) {
            if (!z10) {
                if (z11) {
                    pVar.x = true;
                    AndroidUtilities.cancelRunOnUIThread(pVar.h);
                    CameraController.getInstance().stopVideoRecording(pVar.a.getCameraSessionRecording(), false, false);
                    pVar.a(false);
                } else {
                    pVar.c();
                }
            }
            this.z1 = null;
        }
        n();
    }
}
