package di;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public abstract class r extends m {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public f01 A1;
    public Utilities.Callback B1;
    public Utilities.Callback C1;
    public p D1;
    public float E1;
    public float F1;
    public final org.telegram.ui.Components.e6 G1;
    public final org.telegram.ui.Components.e6 H1;
    public final org.telegram.ui.Components.e6 I1;
    public final org.telegram.ui.Components.e6 J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final n P1;
    public final ImageView S0;
    public final ImageView T0;
    public final l U0;
    public n70 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final q a1;
    public final org.telegram.ui.Components.p6 b1;
    public float c1;
    public float d1;
    public long e1;
    public final Paint f1;
    public final Paint g1;
    public final org.telegram.ui.Components.ca h1;
    public final org.telegram.ui.Components.ca i1;
    public final Drawable j1;
    public float k1;
    public final org.telegram.ui.Components.e6 l1;
    public final Path m1;
    public final Path n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final Paint r1;
    public final org.telegram.ui.Components.e6 s1;
    public final RectF t1;
    public final RectF u1;
    public final RectF v1;
    public final Path w1;
    public f01 x1;
    public Path y1;
    public Paint z1;

    public r(Context context, FrameLayout frameLayout, ov0 ov0Var, FrameLayout frameLayout2, bi.b bVar, org.telegram.ui.Components.ja jaVar) {
        super(context, frameLayout, ov0Var, frameLayout2, bVar, jaVar);
        this.W0 = true;
        this.X0 = 0;
        fc fcVar = (fc) this;
        this.a1 = new q(fcVar, fcVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.b1 = p6Var;
        pr prVar = pr.f;
        p6Var.k(0.16f, 50L, prVar);
        p6Var.t(AndroidUtilities.dp(15.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.q("0:00.0", true, true);
        p6Var.r(-1);
        Paint paint = new Paint(1);
        this.f1 = paint;
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(11, LiteMode.FLAGS_CHAT);
        this.h1 = caVar;
        org.telegram.ui.Components.ca caVar2 = new org.telegram.ui.Components.ca(12, LiteMode.FLAGS_CHAT);
        this.i1 = caVar2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        caVar.a = AndroidUtilities.dp(47.0f);
        caVar.b = AndroidUtilities.dp(55.0f);
        caVar.b();
        caVar2.a = AndroidUtilities.dp(47.0f);
        caVar2.b = AndroidUtilities.dp(55.0f);
        caVar2.b();
        this.j1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.l1 = new org.telegram.ui.Components.e6(new n(fcVar, 0), 200L, prVar, 0);
        this.m1 = new Path();
        this.n1 = new Path();
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        this.q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(fcVar, 0);
        pr prVar2 = pr.h;
        this.s1 = new org.telegram.ui.Components.e6(nVar, 350L, prVar2);
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new RectF();
        this.w1 = new Path();
        this.G1 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar2);
        this.H1 = new org.telegram.ui.Components.e6(new n(fcVar, 0), 420L, prVar2, 0);
        this.I1 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar2);
        this.J1 = new org.telegram.ui.Components.e6(new n(fcVar, 0), 350L, prVar2, 0);
        this.P1 = new n(fcVar, 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, w7.x5.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ah.h0(fcVar, 9));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        l lVar = new l(5);
        this.U0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, w7.x5.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new bi.x(fcVar, frameLayout, bVar, 4));
    }

    public final void A(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 >= 4) {
                i11 = 2;
                break;
            } else if (Q1[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (this.X0 == i11) {
            return;
        }
        this.X0 = i11;
        this.U0.d(i10 / 3600, false, z10);
    }

    public final void B() {
        if (this.Z0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1.c(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.a));
            }
        }
    }

    @Override // di.m
    public final int b() {
        return 36;
    }

    @Override // di.m
    public final void c(boolean z10) {
        int i10 = (z10 || !this.W0) ? 8 : 0;
        ImageView imageView = this.T0;
        imageView.setVisibility(i10);
        this.S0.setVisibility(z10 ? 8 : 0);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override // di.m
    public final void d(boolean z10) {
        if (z10) {
            return;
        }
        this.T0.setVisibility(this.W0 ? 0 : 8);
        this.S0.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r10.N1 == false) goto L67;
     */
    @Override // di.m, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p pVar;
        Drawable drawable;
        if (this.O1 && (pVar = this.D1) != null && pVar.a != null && (drawable = this.Y0) != null) {
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
                    this.D1.a.switchCamera();
                    Drawable drawable2 = this.Y0;
                    if (drawable2 instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable2).start();
                    }
                }
            }
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        ImageView imageView = this.S0;
        rectF2.set(imageView.getX(), imageView.getY(), imageView.getX() + imageView.getMeasuredWidth(), imageView.getY() + imageView.getMeasuredHeight());
        if (!this.N1 && (this.Z0 || this.p0 || !rectF2.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.O1 && this.M1) {
                if (this.u1.contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, true);
                    this.N1 = false;
                    return true;
                }
            }
            if (this.O1) {
                if (this.t1.contains(motionEvent.getX(), motionEvent.getY()) || getBounds().contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, false);
                    this.N1 = false;
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        q qVar = this.a1;
        n nVar = this.P1;
        if (action != 0) {
            if (motionEvent.getAction() == 2) {
                if (!this.K1) {
                    this.c1 = Utilities.clamp((this.E1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                    float clamp = Utilities.clamp((this.F1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                    this.d1 = clamp;
                    boolean z10 = this.M1;
                    if (!z10 && !this.K1 && this.c1 >= 1.0f) {
                        this.K1 = true;
                        this.O1 = false;
                        imageView.setVisibility(4);
                        this.T0.setVisibility(4);
                        qVar.g = true;
                        xi0 xi0Var = qVar.h;
                        xi0Var.Q(0.0f, true);
                        if (qVar.f) {
                            xi0Var.start();
                        }
                        p pVar2 = this.D1;
                        if (pVar2 != null) {
                            pVar2.x = true;
                            AndroidUtilities.cancelRunOnUIThread(pVar2.h);
                            CameraController.getInstance().stopVideoRecording(pVar2.a.getCameraSessionRecording(), false, false);
                            pVar2.a(false);
                        }
                        AndroidUtilities.runOnUIThread(nVar, 800L);
                    } else if (!z10 && !this.K1 && clamp >= 1.0f && this.c1 < 0.4f) {
                        this.M1 = true;
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    invalidate();
                    n();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!this.K1 && !this.M1) {
                    z(false, false);
                }
                this.N1 = false;
            }
            return this.N1;
        }
        if (this.O1) {
            this.N1 = false;
            z(false, false);
            return true;
        }
        this.N1 = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        fc fcVar = (fc) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        pc pcVar = fcVar.S1;
        if (!isCameraAllowed ? false : pc.d(pcVar)) {
            AndroidUtilities.cancelRunOnUIThread(nVar);
            this.E1 = motionEvent.getX();
            this.F1 = motionEvent.getY();
            this.k1 = 0.0f;
            this.c1 = 0.0f;
            this.G1.d(0.0f, true);
            this.H1.d(0.0f, true);
            this.K1 = false;
            this.L1 = false;
            this.M1 = false;
            qVar.g = false;
            xi0 xi0Var2 = qVar.h;
            xi0Var2.stop();
            xi0Var2.Q(0.0f, true);
            this.O1 = true;
            this.e1 = System.currentTimeMillis();
            this.K0 = true;
            this.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            p pVar3 = new p(this, getContext());
            this.D1 = pVar3;
            p pVar4 = pcVar.q1;
            if (pVar4 != null) {
                pVar4.a(true);
            }
            dc dcVar = pcVar.X0;
            if (dcVar != null) {
                dcVar.O = true;
                dcVar.c();
                dc dcVar2 = pcVar.X0;
                dcVar2.m(0L);
                zc zcVar = dcVar2.F;
                if (zcVar != null) {
                    zcVar.setProgress(0L);
                }
            }
            pVar3.n = new bi.j0(1, fcVar, pVar3);
            pVar3.r = new n(fcVar, 2);
            bc bcVar = pcVar.h0;
            pcVar.q1 = pVar3;
            bcVar.addView(pVar3, w7.x5.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // di.m
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault;
    }

    @Override // di.m
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // di.m
    public final void j(Canvas canvas, RectF rectF) {
        float f7;
        Paint paint;
        float f10;
        float f11;
        float f12;
        float f13;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.D1 != null) {
            float e7 = this.G1.e(this.K1);
            float e10 = this.I1.e(this.M1);
            if (this.e1 <= 0) {
                this.e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin(((System.currentTimeMillis() - this.e1) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            q qVar = this.a1;
            qVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            qVar.draw(canvas3);
            int dp3 = (int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e7));
            int dp4 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f));
            int dp5 = (int) (rectF.left + AndroidUtilities.dp(133.3f));
            int dp6 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.p6 p6Var = this.b1;
            p6Var.setBounds(dp3, dp4, dp5, dp6);
            long b10 = this.D1.b();
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
            p6Var.q(sb2.toString(), true, true);
            p6Var.w = (int) ((1.0f - e7) * 255.0f);
            p6Var.draw(canvas3);
            float f14 = 1.0f - e10;
            float f15 = (1.0f - this.c1) * f14;
            Paint c10 = this.P.c(1.0f);
            if (c10 != null) {
                f7 = f15;
                paint = c10;
                f10 = 10.0f;
                f11 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f7 = f15;
                paint = c10;
                f10 = 10.0f;
                f11 = 12.0f;
            }
            if (f7 > 0.0f) {
                if (this.x1 == null) {
                    this.x1 = new f01(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.y1 == null) {
                    Path path = new Path();
                    this.y1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.y1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.y1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f10));
                    Paint paint2 = new Paint(1);
                    this.z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.z1.setStrokeCap(Paint.Cap.ROUND);
                    this.z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.z1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.x1.p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - p6Var.d());
                float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, this.c1, AndroidUtilities.dp(6.0f) * sin, (rectF.centerX() - ((this.x1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.c1, 1.0f, e10) * (rectF.width() / 6.0f)));
                int l1 = org.telegram.ui.ActionBar.j6.l1(f7, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(b11, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.z1.setColor(l1);
                canvas3.drawPath(this.y1, this.z1);
                canvas3.restore();
                f12 = 15.0f;
                f13 = 0.0f;
                this.x1.c(b11 + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f12 = 15.0f;
                f13 = 0.0f;
            }
            if (e10 > f13) {
                if (this.A1 == null) {
                    this.A1 = new f01(LocaleController.getString(R.string.CancelRound), f12, AndroidUtilities.bold());
                }
                this.A1.p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - p6Var.d());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.A1.l() / 2.0f));
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.j6.l1(e10, paint != null ? -1 : -2130706433), canvas2);
                this.u1.set(width - AndroidUtilities.dp(f11), rectF.top, this.A1.l() + width + AndroidUtilities.dp(f11), rectF.bottom);
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

    @Override // di.m
    public final void k(Canvas canvas, RectF rectF, float f7) {
        float f10;
        float f11;
        float f12;
        if (f7 <= 0.0f) {
            return;
        }
        boolean z10 = this.K1;
        org.telegram.ui.Components.e6 e6Var = this.H1;
        float e7 = e6Var.e(z10);
        boolean z11 = this.M1;
        org.telegram.ui.Components.e6 e6Var2 = this.J1;
        float e10 = e6Var2.e(z11);
        float d = this.l1.d(this.k1, false);
        float f13 = 1.0f - e7;
        float z12 = com.google.android.gms.internal.vision.e2.z(1.0f, this.c1, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f)) * f13 * f7;
        float lerp = AndroidUtilities.lerp(com.google.android.gms.internal.vision.e2.b(1.0f, e10, getWidth() * 0.35f * this.c1, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e7);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
        Paint paint = this.g1;
        if (isEnabled) {
            float dp2 = AndroidUtilities.dp(47.0f);
            org.telegram.ui.Components.ca caVar = this.h1;
            caVar.a = dp2;
            Paint paint2 = caVar.d;
            f12 = 0.0f;
            caVar.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            float dp3 = AndroidUtilities.dp(50.0f);
            f10 = e10;
            org.telegram.ui.Components.ca caVar2 = this.i1;
            caVar2.a = dp3;
            Paint paint3 = caVar2.d;
            f11 = f13;
            caVar2.b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            caVar2.e(d, 1.01f);
            caVar.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.j6.l1(0.15f * f7, paint.getColor()));
            canvas.save();
            float f14 = z12 / caVar2.a;
            canvas.scale(f14, f14, lerp, dp);
            caVar2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f * f7, paint.getColor()));
            canvas.save();
            float f15 = z12 / caVar.a;
            canvas.scale(f15, f15, lerp, dp);
            caVar.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f10 = e10;
            f11 = f13;
            f12 = 0.0f;
        }
        float min = Math.min(z12, AndroidUtilities.dp(55.0f));
        float f16 = f7 * 255.0f;
        paint.setAlpha((int) f16);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.j1;
        drawable.setBounds((int) (lerp - (((drawable.getIntrinsicWidth() / 2.0f) * f11) * (this.L1 ? f7 : 1.0f))), (int) (dp - (((drawable.getIntrinsicHeight() / 2.0f) * f11) * (this.L1 ? f7 : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f11 * (this.L1 ? f7 : 1.0f)) + lerp), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f11 * (this.L1 ? f7 : 1.0f)) + dp));
        drawable.setAlpha((int) (f11 * 255.0f * (this.L1 ? f7 : 1.0f)));
        drawable.draw(canvas);
        if (f10 > f12) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f10 * f7;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.f1);
        }
        canvas.restore();
        float f17 = e6Var.c;
        float f18 = e6Var2.c;
        float A = org.telegram.messenger.w1.A(1.0f, f17, AndroidUtilities.lerp(this.s1.e(this.c1 < 0.4f), 0.0f, f18), f7);
        float dp4 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f18) * A) / 2.0f;
        float f19 = 1.0f - f18;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.d1) * f19), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - A);
        float dp5 = (AndroidUtilities.dp(36.0f) * A) / 2.0f;
        RectF rectF3 = this.t1;
        rectF3.set(dp4 - dp5, lerp3 - lerp2, dp5 + dp4, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f18);
        float dp6 = AndroidUtilities.dp(1.0f);
        float dp7 = AndroidUtilities.dp(0.66f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(A, TLObject.FLAG_29);
        Paint paint4 = this.p1;
        paint4.setShadowLayer(dp6, 0.0f, dp7, l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c10 = this.R.c(A);
        if (c10 == null) {
            Paint paint5 = this.o1;
            paint5.setColor(TLObject.FLAG_30);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c10);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(A, A, dp4, lerp3);
        int l12 = org.telegram.ui.ActionBar.j6.l1(A, -1);
        Paint paint7 = this.q1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.j6.l1(A * f19, -1);
        Paint paint8 = this.r1;
        paint8.setColor(l13);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f18);
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f18);
        float dp8 = (AndroidUtilities.dp(4.0f) * f19) + lerp3;
        canvas.rotate(this.d1 * 12.0f * f19, dp4, dp8);
        float f20 = lerp5 / 2.0f;
        float f21 = lerp6 / 2.0f;
        float f22 = dp8 - f21;
        RectF rectF4 = this.v1;
        rectF4.set(dp4 - f20, f22, f20 + dp4, dp8 + f21);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f18 < 1.0f) {
            canvas.save();
            canvas.rotate(this.d1 * 12.0f * f19, dp4, f22);
            canvas.translate(0.0f, f21 * f18);
            canvas.scale(f19, f19, dp4, f22);
            Path path2 = this.w1;
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
            path2.lineTo(f24, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.d1), 1.0f, f18) * AndroidUtilities.dp(3.66f)) + dp10);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.e6 e6Var3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || e6Var3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.o0) * 255.0f), 31);
                Path path3 = this.n1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || e6Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || e6Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.Y0 == null) {
            this.Y0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.Y0.setAlpha((int) (f16 * f11));
        float timelineHeight = getTimelineHeight();
        this.Y0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override // di.m, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q qVar = this.a1;
        xi0 xi0Var = qVar.h;
        qVar.f = true;
        if (qVar.g) {
            xi0Var.start();
        }
        xi0Var.v0 = qVar.i;
    }

    @Override // di.m, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.a1;
        qVar.f = false;
        xi0 xi0Var = qVar.h;
        xi0Var.stop();
        xi0Var.v0 = null;
    }

    public void setAmplitude(double d) {
        this.k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i10 = z10 ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.S0;
        imageView.setImageResource(i10);
        imageView.setContentDescription(LocaleController.getString(z10 ? R.string.AccDescrRemoveRoundVideo : R.string.AccDescrVideoMessage));
        this.Z0 = z10;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.B1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.C1 = callback;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z10) {
        this.W0 = z10;
        this.T0.setVisibility((!z10 || this.p0) ? 8 : 0);
    }

    @Override // di.m
    public final void u(float f7) {
        float f10 = 1.0f - f7;
        this.T0.setAlpha(f10);
        this.S0.setAlpha(f10);
    }

    public final void z(boolean z10, boolean z11) {
        AndroidUtilities.cancelRunOnUIThread(this.P1);
        this.L1 = true;
        this.O1 = false;
        int dp = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.c1));
        this.K0 = false;
        this.L0 = dp;
        invalidate();
        p pVar = this.D1;
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
            this.D1 = null;
        }
        n();
    }
}
