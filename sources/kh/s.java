package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class s extends m {
    public static final int[] M1 = {21600, 43200, 86400, 172800};
    public float A1;
    public float B1;
    public final org.telegram.ui.Components.y5 C1;
    public final org.telegram.ui.Components.y5 D1;
    public final org.telegram.ui.Components.y5 E1;
    public final org.telegram.ui.Components.y5 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public final n L1;
    public final ImageView O0;
    public final ImageView P0;
    public final l Q0;
    public x60 R0;
    public boolean S0;
    public int T0;
    public Drawable U0;
    public boolean V0;
    public final r W0;
    public final org.telegram.ui.Components.i6 X0;
    public float Y0;
    public float Z0;
    public long a1;
    public final Paint b1;
    public final Paint c1;
    public final org.telegram.ui.Components.t9 d1;
    public final org.telegram.ui.Components.t9 e1;
    public final Drawable f1;
    public float g1;
    public final org.telegram.ui.Components.y5 h1;
    public final Path i1;
    public final Path j1;
    public final Paint k1;
    public final Paint l1;
    public final Paint m1;
    public final Paint n1;
    public final org.telegram.ui.Components.y5 o1;
    public final RectF p1;
    public final RectF q1;
    public final RectF r1;
    public final Path s1;
    public nz0 t1;
    public Path u1;
    public Paint v1;
    public nz0 w1;
    public Utilities.Callback x1;
    public Utilities.Callback y1;
    public q z1;

    public s(Context context, FrameLayout frameLayout, xu0 xu0Var, FrameLayout frameLayout2, ih.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context, frameLayout, xu0Var, frameLayout2, bVar, baVar);
        this.S0 = true;
        this.T0 = 0;
        mb mbVar = (mb) this;
        this.W0 = new r(mbVar, mbVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.X0 = i6Var;
        gr grVar = gr.f;
        i6Var.k(0.16f, 50L, grVar);
        i6Var.t(AndroidUtilities.dp(15.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.q("0:00.0", true, true);
        i6Var.r(-1);
        Paint paint = new Paint(1);
        this.b1 = paint;
        Paint paint2 = new Paint(1);
        this.c1 = paint2;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(11, LiteMode.FLAGS_CHAT);
        this.d1 = t9Var;
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(12, LiteMode.FLAGS_CHAT);
        this.e1 = t9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        t9Var.a = AndroidUtilities.dp(47.0f);
        t9Var.b = AndroidUtilities.dp(55.0f);
        t9Var.b();
        t9Var2.a = AndroidUtilities.dp(47.0f);
        t9Var2.b = AndroidUtilities.dp(55.0f);
        t9Var2.b();
        this.f1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.h1 = new org.telegram.ui.Components.y5(new n(mbVar, 0), 200L, grVar, 0);
        this.i1 = new Path();
        this.j1 = new Path();
        this.k1 = new Paint(1);
        this.l1 = new Paint(1);
        this.m1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.n1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(mbVar, 0);
        gr grVar2 = gr.h;
        this.o1 = new org.telegram.ui.Components.y5(nVar, 350L, grVar2);
        this.p1 = new RectF();
        this.q1 = new RectF();
        this.r1 = new RectF();
        this.s1 = new Path();
        this.C1 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar2);
        this.D1 = new org.telegram.ui.Components.y5(new n(mbVar, 0), 420L, grVar2, 0);
        this.E1 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar2);
        this.F1 = new org.telegram.ui.Components.y5(new n(mbVar, 0), 350L, grVar2, 0);
        this.L1 = new n(mbVar, 1);
        ImageView imageView = new ImageView(context);
        this.O0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, g7.e6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(mbVar, 26));
        ImageView imageView2 = new ImageView(context);
        this.P0 = imageView2;
        l lVar = new l(5);
        this.Q0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, g7.e6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new fg.f(mbVar, frameLayout, bVar, 13));
    }

    public final void A(int i9, boolean z10) {
        int i10 = 0;
        while (true) {
            if (i10 >= 4) {
                i10 = 2;
                break;
            } else if (M1[i10] == i9) {
                break;
            } else {
                i10++;
            }
        }
        if (this.T0 == i10) {
            return;
        }
        this.T0 = i10;
        this.Q0.d(i9 / 3600, false, z10);
    }

    public final void B() {
        if (this.V0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.a);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new p(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, this.a));
            }
        }
    }

    @Override // kh.m
    public final int b() {
        return 36;
    }

    @Override // kh.m
    public final void c(boolean z10) {
        int i9 = (z10 || !this.S0) ? 8 : 0;
        ImageView imageView = this.P0;
        imageView.setVisibility(i9);
        this.O0.setVisibility(z10 ? 8 : 0);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override // kh.m
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
    @Override // kh.m, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        q qVar;
        Drawable drawable;
        if (this.K1 && (qVar = this.z1) != null && qVar.a != null && (drawable = this.U0) != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(drawable.getBounds());
            rectF.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
            int i9 = 0;
            while (true) {
                if (i9 >= motionEvent.getPointerCount()) {
                    break;
                }
                if (!AndroidUtilities.rectTmp.contains(motionEvent.getX(i9), motionEvent.getY(i9))) {
                    i9++;
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
        r rVar = this.W0;
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
                        rVar.g = true;
                        mi0 mi0Var = rVar.h;
                        mi0Var.Q(0.0f, true);
                        if (rVar.f) {
                            mi0Var.start();
                        }
                        q qVar2 = this.z1;
                        if (qVar2 != null) {
                            qVar2.x = true;
                            AndroidUtilities.cancelRunOnUIThread(qVar2.h);
                            CameraController.getInstance().stopVideoRecording(qVar2.a.getCameraSessionRecording(), false, false);
                            qVar2.a(false);
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
        mb mbVar = (mb) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        wb wbVar = mbVar.O1;
        if (!isCameraAllowed ? false : wb.d(wbVar)) {
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
            rVar.g = false;
            mi0 mi0Var2 = rVar.h;
            mi0Var2.stop();
            mi0Var2.Q(0.0f, true);
            this.K1 = true;
            this.a1 = System.currentTimeMillis();
            this.G0 = true;
            this.H0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            q qVar3 = new q(this, getContext());
            this.z1 = qVar3;
            q qVar4 = wbVar.m1;
            if (qVar4 != null) {
                qVar4.a(true);
            }
            kb kbVar = wbVar.T0;
            if (kbVar != null) {
                kbVar.K = true;
                kbVar.c();
                kb kbVar2 = wbVar.T0;
                kbVar2.m(0L);
                gc gcVar = kbVar2.B;
                if (gcVar != null) {
                    gcVar.setProgress(0L);
                }
            }
            qVar3.n = new ih.b0(1, mbVar, qVar3);
            qVar3.r = new n(mbVar, 2);
            ib ibVar = wbVar.d0;
            wbVar.m1 = qVar3;
            ibVar.addView(qVar3, g7.e6.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // kh.m
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault;
    }

    @Override // kh.m
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // kh.m
    public final void j(Canvas canvas, RectF rectF) {
        float f10;
        Paint paint;
        float f11;
        float f12;
        float f13;
        float f14;
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
            r rVar = this.W0;
            rVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            rVar.draw(canvas3);
            int dp3 = (int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e10));
            int dp4 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f));
            int dp5 = (int) (rectF.left + AndroidUtilities.dp(133.3f));
            int dp6 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.i6 i6Var = this.X0;
            i6Var.setBounds(dp3, dp4, dp5, dp6);
            long b10 = this.z1.b();
            int i9 = (int) (b10 / 1000);
            int i10 = (int) ((b10 - (i9 * MediaDataController.MAX_STYLE_RUNS_COUNT)) / 100);
            int i11 = i9 / 60;
            int i12 = i9 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(":");
            sb2.append(i12 < 10 ? "0" : "");
            sb2.append(i12);
            sb2.append(".");
            sb2.append(i10);
            i6Var.q(sb2.toString(), true, true);
            i6Var.w = (int) ((1.0f - e10) * 255.0f);
            i6Var.draw(canvas3);
            float f15 = 1.0f - e11;
            float f16 = (1.0f - this.Y0) * f15;
            Paint c10 = this.L.c(1.0f);
            if (c10 != null) {
                f10 = f16;
                paint = c10;
                f11 = 10.0f;
                f12 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f10 = f16;
                paint = c10;
                f11 = 10.0f;
                f12 = 12.0f;
            }
            if (f10 > 0.0f) {
                if (this.t1 == null) {
                    this.t1 = new nz0(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.u1 == null) {
                    Path path = new Path();
                    this.u1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.u1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.u1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f11));
                    Paint paint2 = new Paint(1);
                    this.v1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.v1.setStrokeCap(Paint.Cap.ROUND);
                    this.v1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.v1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.t1.p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - i6Var.d());
                float C = j3.r0.C(1.0f, this.Y0, AndroidUtilities.dp(6.0f) * sin, (rectF.centerX() - ((this.t1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.Y0, 1.0f, e11) * (rectF.width() / 6.0f)));
                int l1 = org.telegram.ui.ActionBar.f6.l1(f10, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(C, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.v1.setColor(l1);
                canvas3.drawPath(this.u1, this.v1);
                canvas3.restore();
                f13 = 15.0f;
                f14 = 0.0f;
                this.t1.c(C + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f13 = 15.0f;
                f14 = 0.0f;
            }
            if (e11 > f14) {
                if (this.w1 == null) {
                    this.w1 = new nz0(LocaleController.getString(R.string.CancelRound), f13, AndroidUtilities.bold());
                }
                this.w1.p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - i6Var.d());
                float width = ((rectF.width() / 4.0f) * f15) + (rectF.centerX() - (this.w1.l() / 2.0f));
                canvas2 = canvas;
                this.w1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.f6.l1(e11, paint != null ? -1 : -2130706433), canvas2);
                this.q1.set(width - AndroidUtilities.dp(f12), rectF.top, this.w1.l() + width + AndroidUtilities.dp(f12), rectF.bottom);
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

    @Override // kh.m
    public final void k(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        if (f10 <= 0.0f) {
            return;
        }
        boolean z10 = this.G1;
        org.telegram.ui.Components.y5 y5Var = this.D1;
        float e10 = y5Var.e(z10);
        boolean z11 = this.I1;
        org.telegram.ui.Components.y5 y5Var2 = this.F1;
        float e11 = y5Var2.e(z11);
        float d = this.h1.d(this.g1, false);
        float f14 = 1.0f - e10;
        float z12 = e2.c.z(1.0f, this.Y0, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f)) * f14 * f10;
        float lerp = AndroidUtilities.lerp(j3.r0.C(1.0f, e11, getWidth() * 0.35f * this.Y0, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e10);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
        Paint paint = this.c1;
        if (isEnabled) {
            float dp2 = AndroidUtilities.dp(47.0f);
            org.telegram.ui.Components.t9 t9Var = this.d1;
            t9Var.a = dp2;
            Paint paint2 = t9Var.d;
            f13 = 0.0f;
            t9Var.b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            float dp3 = AndroidUtilities.dp(50.0f);
            f11 = e11;
            org.telegram.ui.Components.t9 t9Var2 = this.e1;
            t9Var2.a = dp3;
            Paint paint3 = t9Var2.d;
            f12 = f14;
            t9Var2.b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            t9Var2.e(d, 1.01f);
            t9Var.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.f6.l1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f15 = z12 / t9Var2.a;
            canvas.scale(f15, f15, lerp, dp);
            t9Var2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.f6.l1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f16 = z12 / t9Var.a;
            canvas.scale(f16, f16, lerp, dp);
            t9Var.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f11 = e11;
            f12 = f14;
            f13 = 0.0f;
        }
        float min = Math.min(z12, AndroidUtilities.dp(55.0f));
        float f17 = f10 * 255.0f;
        paint.setAlpha((int) f17);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.i1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f1;
        drawable.setBounds((int) (lerp - (((drawable.getIntrinsicWidth() / 2.0f) * f12) * (this.H1 ? f10 : 1.0f))), (int) (dp - (((drawable.getIntrinsicHeight() / 2.0f) * f12) * (this.H1 ? f10 : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f12 * (this.H1 ? f10 : 1.0f)) + lerp), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f12 * (this.H1 ? f10 : 1.0f)) + dp));
        drawable.setAlpha((int) (f12 * 255.0f * (this.H1 ? f10 : 1.0f)));
        drawable.draw(canvas);
        if (f11 > f13) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f11 * f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.b1);
        }
        canvas.restore();
        float f18 = y5Var.c;
        float f19 = y5Var2.c;
        float y10 = org.telegram.messenger.l0.y(1.0f, f18, AndroidUtilities.lerp(this.o1.e(this.Y0 < 0.4f), 0.0f, f19), f10);
        float dp4 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f19) * y10) / 2.0f;
        float f20 = 1.0f - f19;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.Z0) * f20), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - y10);
        float dp5 = (AndroidUtilities.dp(36.0f) * y10) / 2.0f;
        RectF rectF3 = this.p1;
        rectF3.set(dp4 - dp5, lerp3 - lerp2, dp5 + dp4, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f19);
        float dp6 = AndroidUtilities.dp(1.0f);
        float dp7 = AndroidUtilities.dp(0.66f);
        int l1 = org.telegram.ui.ActionBar.f6.l1(y10, TLObject.FLAG_29);
        Paint paint4 = this.l1;
        paint4.setShadowLayer(dp6, 0.0f, dp7, l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c10 = this.N.c(y10);
        if (c10 == null) {
            Paint paint5 = this.k1;
            paint5.setColor(TLObject.FLAG_30);
            paint5.setAlpha((int) (64.0f * y10));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c10);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * y10));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(y10, y10, dp4, lerp3);
        int l12 = org.telegram.ui.ActionBar.f6.l1(y10, -1);
        Paint paint7 = this.m1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.f6.l1(y10 * f20, -1);
        Paint paint8 = this.n1;
        paint8.setColor(l13);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f19);
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f19);
        float dp8 = (AndroidUtilities.dp(4.0f) * f20) + lerp3;
        canvas.rotate(this.Z0 * 12.0f * f20, dp4, dp8);
        float f21 = lerp5 / 2.0f;
        float f22 = lerp6 / 2.0f;
        float f23 = dp8 - f22;
        RectF rectF4 = this.r1;
        rectF4.set(dp4 - f21, f23, f21 + dp4, dp8 + f22);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f19 < 1.0f) {
            canvas.save();
            canvas.rotate(this.Z0 * 12.0f * f20, dp4, f23);
            canvas.translate(0.0f, f22 * f19);
            canvas.scale(f20, f20, dp4, f23);
            Path path2 = this.s1;
            path2.rewind();
            float dp9 = AndroidUtilities.dp(4.33f);
            float dp10 = f23 - AndroidUtilities.dp(3.66f);
            float f24 = dp4 + dp9;
            path2.moveTo(f24, AndroidUtilities.dp(3.66f) + dp10);
            path2.lineTo(f24, dp10);
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f25 = dp4 - dp9;
            rectF5.set(f25, dp10 - dp9, f24, dp9 + dp10);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f25, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.Z0), 1.0f, f19) * AndroidUtilities.dp(3.66f)) + dp10);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.G1) {
            ImageView imageView = this.O0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.y5 y5Var3 = this.I0;
            ImageView imageView2 = this.P0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || y5Var3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.k0) * 255.0f), 31);
                Path path3 = this.j1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || y5Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || y5Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.U0 == null) {
            this.U0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.U0.setAlpha((int) (f17 * f12));
        float timelineHeight = getTimelineHeight();
        this.U0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.U0.draw(canvas);
    }

    @Override // kh.m, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r rVar = this.W0;
        mi0 mi0Var = rVar.h;
        rVar.f = true;
        if (rVar.g) {
            mi0Var.start();
        }
        mi0Var.r0 = rVar.i;
    }

    @Override // kh.m, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r rVar = this.W0;
        rVar.f = false;
        mi0 mi0Var = rVar.h;
        mi0Var.stop();
        mi0Var.r0 = null;
    }

    public void setAmplitude(double d) {
        this.g1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i9 = z10 ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.O0;
        imageView.setImageResource(i9);
        imageView.setContentDescription(LocaleController.getString(z10 ? R.string.AccDescrRemoveRoundVideo : R.string.AccDescrVideoMessage));
        this.V0 = z10;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.x1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.y1 = callback;
    }

    public void setPeriod(int i9) {
        A(i9, true);
    }

    public void setPeriodVisible(boolean z10) {
        this.S0 = z10;
        this.P0.setVisibility((!z10 || this.l0) ? 8 : 0);
    }

    @Override // kh.m
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.P0.setAlpha(f11);
        this.O0.setAlpha(f11);
    }

    public final void z(boolean z10, boolean z11) {
        AndroidUtilities.cancelRunOnUIThread(this.L1);
        this.H1 = true;
        this.K1 = false;
        int dp = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.Y0));
        this.G0 = false;
        this.H0 = dp;
        invalidate();
        q qVar = this.z1;
        if (qVar != null) {
            if (!z10) {
                if (z11) {
                    qVar.x = true;
                    AndroidUtilities.cancelRunOnUIThread(qVar.h);
                    CameraController.getInstance().stopVideoRecording(qVar.a.getCameraSessionRecording(), false, false);
                    qVar.a(false);
                } else {
                    qVar.c();
                }
            }
            this.z1 = null;
        }
        n();
    }
}
