package fi;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class r extends m {
    public static final int[] P1 = {21600, 43200, 86400, 172800};
    public c20 A1;
    public c20 B1;
    public p C1;
    public float D1;
    public float E1;
    public final org.telegram.ui.Components.w5 F1;
    public final org.telegram.ui.Components.w5 G1;
    public final org.telegram.ui.Components.w5 H1;
    public final org.telegram.ui.Components.w5 I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public final n O1;
    public final ImageView R0;
    public final ImageView S0;
    public final l T0;
    public k60 U0;
    public boolean V0;
    public int W0;
    public Drawable X0;
    public boolean Y0;
    public final q Z0;
    public final org.telegram.ui.Components.i6 a1;
    public float b1;
    public float c1;
    public long d1;
    public final Paint e1;
    public final Paint f1;
    public final org.telegram.ui.Components.r9 g1;
    public final org.telegram.ui.Components.r9 h1;
    public final Drawable i1;
    public float j1;
    public final org.telegram.ui.Components.w5 k1;
    public final Path l1;
    public final Path m1;
    public final Paint n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final org.telegram.ui.Components.w5 r1;
    public final RectF s1;
    public final RectF t1;
    public final RectF u1;
    public final Path v1;
    public ly0 w1;
    public Path x1;
    public Paint y1;
    public ly0 z1;

    public r(Context context, FrameLayout frameLayout, rt0 rt0Var, FrameLayout frameLayout2, di.b bVar, org.telegram.ui.Components.y9 y9Var) {
        super(context, frameLayout, rt0Var, frameLayout2, bVar, y9Var);
        this.V0 = true;
        int i7 = 0;
        this.W0 = 0;
        la laVar = (la) this;
        this.Z0 = new q(laVar, laVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.a1 = i6Var;
        xq xqVar = xq.f;
        i6Var.n(0.16f, 50L, xqVar);
        i6Var.w(org.telegram.messenger.g0.L(15.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.t("0:00.0", true, true);
        i6Var.u(-1);
        Paint paint = new Paint(1);
        this.e1 = paint;
        Paint paint2 = new Paint(1);
        this.f1 = paint2;
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9(11, 360928);
        this.g1 = r9Var;
        org.telegram.ui.Components.r9 r9Var2 = new org.telegram.ui.Components.r9(12, 360928);
        this.h1 = r9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        r9Var.a = org.telegram.messenger.g0.L(47.0f);
        r9Var.b = org.telegram.messenger.g0.L(55.0f);
        r9Var.b();
        r9Var2.a = org.telegram.messenger.g0.L(47.0f);
        r9Var2.b = org.telegram.messenger.g0.L(55.0f);
        r9Var2.b();
        this.i1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.k1 = new org.telegram.ui.Components.w5(new n(laVar, i7), 200L, xqVar, 0);
        this.l1 = new Path();
        this.m1 = new Path();
        this.n1 = new Paint(1);
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.q1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(laVar, i7);
        xq xqVar2 = xq.h;
        this.r1 = new org.telegram.ui.Components.w5(nVar, 350L, xqVar2);
        this.s1 = new RectF();
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new Path();
        this.F1 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar2);
        this.G1 = new org.telegram.ui.Components.w5(new n(laVar, i7), 420L, xqVar2, 0);
        this.H1 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar2);
        this.I1 = new org.telegram.ui.Components.w5(new n(laVar, i7), 350L, xqVar2, 0);
        this.O1 = new n(laVar, 1);
        ImageView imageView = new ImageView(context);
        this.R0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(hd.M0(2131754736, null));
        addView(imageView, c8.ha.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ah.d(laVar, 21));
        ImageView imageView2 = new ImageView(context);
        this.S0 = imageView2;
        l lVar = new l(5);
        this.T0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(hd.M0(2131744591, null));
        A(86400, false);
        addView(imageView2, c8.ha.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new ah.g(laVar, frameLayout, bVar, 8));
    }

    public final void A(int i7, boolean z9) {
        int i10 = 0;
        while (true) {
            if (i10 >= 4) {
                i10 = 2;
                break;
            } else if (P1[i10] == i7) {
                break;
            } else {
                i10++;
            }
        }
        if (this.W0 == i10) {
            return;
        }
        this.W0 = i10;
        this.T0.d(i7 / 3600, false, z9);
    }

    public final void B() {
        if (this.Y0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
            String M0 = hd.M0(2131744499, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = hd.M0(2131744500, null);
            alertDialog$Builder.k(hd.M0(2131746320, null), new di.q4(this, 9));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, this.a);
            }
        }
    }

    @Override // fi.m
    public final int b() {
        return 36;
    }

    @Override // fi.m
    public final void c(boolean z9) {
        int i7 = (z9 || !this.V0) ? 8 : 0;
        ImageView imageView = this.S0;
        imageView.setVisibility(i7);
        this.R0.setVisibility(z9 ? 8 : 0);
        if (z9) {
            imageView.setVisibility(8);
        }
    }

    @Override // fi.m
    public final void d(boolean z9) {
        if (z9) {
            return;
        }
        this.S0.setVisibility(this.V0 ? 0 : 8);
        this.R0.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r10.M1 == false) goto L67;
     */
    @Override // fi.m, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p pVar;
        Drawable drawable;
        if (this.N1 && (pVar = this.C1) != null && pVar.a != null && (drawable = this.X0) != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(drawable.getBounds());
            rectF.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(12.0f));
            int i7 = 0;
            while (true) {
                if (i7 >= motionEvent.getPointerCount()) {
                    break;
                }
                if (!org.telegram.messenger.g0.P.contains(motionEvent.getX(i7), motionEvent.getY(i7))) {
                    i7++;
                } else if (motionEvent.getAction() == 0 || motionEvent.getActionMasked() == 5) {
                    this.C1.a.switchCamera();
                    Drawable drawable2 = this.X0;
                    if (drawable2 instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable2).start();
                    }
                }
            }
        }
        RectF rectF2 = org.telegram.messenger.g0.P;
        ImageView imageView = this.R0;
        rectF2.set(imageView.getX(), imageView.getY(), imageView.getX() + imageView.getMeasuredWidth(), imageView.getY() + imageView.getMeasuredHeight());
        if (!this.M1 && (this.Y0 || this.o0 || !rectF2.contains(motionEvent.getX(), motionEvent.getY()))) {
            if (this.N1 && this.L1) {
                if (this.t1.contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, true);
                    this.M1 = false;
                    return true;
                }
            }
            if (this.N1) {
                if (this.s1.contains(motionEvent.getX(), motionEvent.getY()) || getBounds().contains(motionEvent.getX(), motionEvent.getY())) {
                    z(false, false);
                    this.M1 = false;
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        q qVar = this.Z0;
        n nVar = this.O1;
        if (action != 0) {
            if (motionEvent.getAction() == 2) {
                if (!this.J1) {
                    this.b1 = Utilities.i((this.D1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                    float i10 = Utilities.i((this.E1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                    this.c1 = i10;
                    boolean z9 = this.L1;
                    if (!z9 && !this.J1 && this.b1 >= 1.0f) {
                        this.J1 = true;
                        this.N1 = false;
                        imageView.setVisibility(4);
                        this.S0.setVisibility(4);
                        qVar.g = true;
                        zg0 zg0Var = qVar.h;
                        zg0Var.T(true, 0.0f);
                        if (qVar.f) {
                            zg0Var.start();
                        }
                        p pVar2 = this.C1;
                        if (pVar2 != null) {
                            pVar2.y = true;
                            org.telegram.messenger.g0.r(pVar2.h);
                            CameraController.getInstance().stopVideoRecording(pVar2.a.getCameraSessionRecording(), false, false);
                            pVar2.a(false);
                        }
                        org.telegram.messenger.g0.i3(nVar, 800L);
                    } else if (!z9 && !this.J1 && i10 >= 1.0f && this.b1 < 0.4f) {
                        this.L1 = true;
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                    }
                    invalidate();
                    n();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!this.J1 && !this.L1) {
                    z(false, false);
                }
                this.M1 = false;
            }
            return this.M1;
        }
        if (this.N1) {
            this.M1 = false;
            z(false, false);
            return true;
        }
        this.M1 = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        la laVar = (la) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        va vaVar = laVar.R1;
        if (!isCameraAllowed ? false : va.c(vaVar)) {
            org.telegram.messenger.g0.r(nVar);
            this.D1 = motionEvent.getX();
            this.E1 = motionEvent.getY();
            this.j1 = 0.0f;
            this.b1 = 0.0f;
            this.F1.e(true, 0.0f);
            this.G1.e(true, 0.0f);
            this.J1 = false;
            this.K1 = false;
            this.L1 = false;
            qVar.g = false;
            zg0 zg0Var2 = qVar.h;
            zg0Var2.stop();
            zg0Var2.T(true, 0.0f);
            this.N1 = true;
            this.d1 = System.currentTimeMillis();
            this.J0 = true;
            this.K0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            p pVar3 = new p(this, getContext());
            this.C1 = pVar3;
            p pVar4 = vaVar.q1;
            if (pVar4 != null) {
                pVar4.a(true);
            }
            ja jaVar = vaVar.X0;
            if (jaVar != null) {
                jaVar.O = true;
                jaVar.c();
                ja jaVar2 = vaVar.X0;
                jaVar2.m(0L);
                fb fbVar = jaVar2.F;
                if (fbVar != null) {
                    fbVar.setProgress(0L);
                }
            }
            pVar3.n = new di.b0(1, laVar, pVar3);
            pVar3.r = new n(laVar, 2);
            ha haVar = vaVar.h0;
            vaVar.q1 = pVar3;
            haVar.addView(pVar3, c8.ha.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // fi.m
    public int getCaptionDefaultLimit() {
        return qp.s1(this.U).V4;
    }

    @Override // fi.m
    public int getCaptionPremiumLimit() {
        return qp.s1(this.U).W4;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // fi.m
    public final void j(Canvas canvas, RectF rectF) {
        float f10;
        float f11;
        float f12;
        Paint paint;
        float f13;
        String str;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.C1 != null) {
            float d = this.F1.d(this.J1);
            float d2 = this.H1.d(this.L1);
            if (this.d1 <= 0) {
                this.d1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin(((System.currentTimeMillis() - this.d1) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + org.telegram.messenger.g0.L(21.0f);
            float L2 = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
            q qVar = this.Z0;
            qVar.setBounds((int) (L - org.telegram.messenger.g0.L(12.0f)), (int) (L2 - org.telegram.messenger.g0.L(12.0f)), (int) (L + org.telegram.messenger.g0.L(12.0f)), (int) (L2 + org.telegram.messenger.g0.L(12.0f)));
            qVar.draw(canvas3);
            int L3 = (int) ((rectF.left + org.telegram.messenger.g0.L(33.3f)) - (org.telegram.messenger.g0.L(10.0f) * d));
            int L4 = (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(9.0f));
            int L5 = (int) (rectF.left + org.telegram.messenger.g0.L(133.3f));
            int L6 = (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) + org.telegram.messenger.g0.L(9.0f));
            org.telegram.ui.Components.i6 i6Var = this.a1;
            i6Var.setBounds(L3, L4, L5, L6);
            long b10 = this.C1.b();
            int i7 = (int) (b10 / 1000);
            int i10 = (int) ((b10 - (i7 * 1000)) / 100);
            int i11 = i7 / 60;
            int i12 = i7 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(":");
            sb2.append(i12 < 10 ? "0" : "");
            sb2.append(i12);
            sb2.append(".");
            sb2.append(i10);
            i6Var.t(sb2.toString(), true, true);
            i6Var.B = (int) ((1.0f - d) * 255.0f);
            i6Var.draw(canvas3);
            float f14 = 1.0f - d2;
            float f15 = (1.0f - this.b1) * f14;
            Paint c10 = this.P.c(1.0f);
            if (c10 != null) {
                f11 = 10.0f;
                paint = c10;
                f10 = 12.0f;
                f12 = f15;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, qs.e4, 31);
                canvas3 = canvas;
            } else {
                f10 = 12.0f;
                f11 = 10.0f;
                f12 = f15;
                paint = c10;
            }
            if (f12 > 0.0f) {
                if (this.w1 == null) {
                    this.w1 = new ly0(hd.M0(2131745314, null), 15.0f, null);
                }
                if (this.x1 == null) {
                    Path path = new Path();
                    this.x1 = path;
                    path.moveTo(org.telegram.messenger.g0.L(3.83f), 0.0f);
                    this.x1.lineTo(0.0f, org.telegram.messenger.g0.L(5.0f));
                    this.x1.lineTo(org.telegram.messenger.g0.L(3.83f), org.telegram.messenger.g0.L(f11));
                    Paint paint2 = new Paint(1);
                    this.y1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.y1.setStrokeCap(Paint.Cap.ROUND);
                    this.y1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.y1.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                this.w1.p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - i6Var.c());
                float v = com.google.android.recaptcha.internal.a.v(1.0f, this.b1, org.telegram.messenger.g0.L(6.0f) * sin, (rectF.centerX() - ((this.w1.k() + org.telegram.messenger.g0.L(11.33f)) / 2.0f)) - (org.telegram.messenger.g0.T1(this.b1, 1.0f, d2) * (rectF.width() / 6.0f)));
                int r12 = org.telegram.ui.ActionBar.k6.r1(f12, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(v, rectF.centerY() - org.telegram.messenger.g0.L(5.0f));
                this.y1.setColor(r12);
                canvas3.drawPath(this.x1, this.y1);
                canvas3.restore();
                str = null;
                f13 = 15.0f;
                this.w1.c(v + org.telegram.messenger.g0.L(11.33f), rectF.centerY(), 1.0f, r12, canvas3);
            } else {
                f13 = 15.0f;
                str = null;
            }
            if (d2 > 0.0f) {
                if (this.z1 == null) {
                    this.z1 = new ly0(hd.M0(2131752570, str), f13, org.telegram.messenger.g0.o());
                }
                this.z1.p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - i6Var.c());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.z1.k() / 2.0f));
                canvas2 = canvas;
                this.z1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.k6.r1(d2, paint != null ? -1 : -2130706433), canvas2);
                this.t1.set(width - org.telegram.messenger.g0.L(f10), rectF.top, this.z1.k() + width + org.telegram.messenger.g0.L(f10), rectF.bottom);
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

    @Override // fi.m
    public final void k(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        if (f10 <= 0.0f) {
            return;
        }
        boolean z9 = this.J1;
        org.telegram.ui.Components.w5 w5Var = this.G1;
        float d = w5Var.d(z9);
        boolean z10 = this.L1;
        org.telegram.ui.Components.w5 w5Var2 = this.I1;
        float d2 = w5Var2.d(z10);
        float e10 = this.k1.e(false, this.j1);
        float f14 = 1.0f - d;
        float z11 = com.google.android.recaptcha.internal.a.z(1.0f, this.b1, org.telegram.messenger.g0.L(30.0f) * e10, org.telegram.messenger.g0.L(41.0f)) * f14 * f10;
        float T1 = org.telegram.messenger.g0.T1(com.google.android.recaptcha.internal.a.v(1.0f, d2, getWidth() * 0.35f * this.b1, rectF.right - org.telegram.messenger.g0.L(20.0f)), rectF.left + org.telegram.messenger.g0.L(20.0f), d);
        float L = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
        boolean e11 = rc.e(360928);
        Paint paint = this.f1;
        if (e11) {
            float L2 = org.telegram.messenger.g0.L(47.0f);
            org.telegram.ui.Components.r9 r9Var = this.g1;
            r9Var.a = L2;
            Paint paint2 = r9Var.d;
            f11 = 0.0f;
            r9Var.b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
            float L3 = org.telegram.messenger.g0.L(50.0f);
            f12 = d2;
            org.telegram.ui.Components.r9 r9Var2 = this.h1;
            r9Var2.a = L3;
            Paint paint3 = r9Var2.d;
            f13 = f14;
            r9Var2.b = (org.telegram.messenger.g0.L(12.0f) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
            r9Var2.e(e10, 1.01f);
            r9Var.e(e10, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.k6.r1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f15 = z11 / r9Var2.a;
            canvas.scale(f15, f15, T1, L);
            r9Var2.a(T1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f16 = z11 / r9Var.a;
            canvas.scale(f16, f16, T1, L);
            r9Var.a(T1, L, canvas, paint2);
            canvas.restore();
        } else {
            f11 = 0.0f;
            f12 = d2;
            f13 = f14;
        }
        float min = Math.min(z11, org.telegram.messenger.g0.L(55.0f));
        float f17 = f10 * 255.0f;
        paint.setAlpha((int) f17);
        canvas.drawCircle(T1, L, min, paint);
        canvas.save();
        Path path = this.l1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(T1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.i1;
        drawable.setBounds((int) (T1 - (((drawable.getIntrinsicWidth() / 2.0f) * f13) * (this.K1 ? f10 : 1.0f))), (int) (L - (((drawable.getIntrinsicHeight() / 2.0f) * f13) * (this.K1 ? f10 : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f13 * (this.K1 ? f10 : 1.0f)) + T1), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f13 * (this.K1 ? f10 : 1.0f)) + L));
        drawable.setAlpha((int) (f13 * 255.0f * (this.K1 ? f10 : 1.0f)));
        drawable.draw(canvas);
        if (f12 > f11) {
            float N = (org.telegram.messenger.g0.N(19.33f) / 2.0f) * f12 * f10;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(T1 - N, L - N, T1 + N, L + N);
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(5.33f), this.e1);
        }
        canvas.restore();
        float f18 = w5Var.c;
        float f19 = w5Var2.c;
        float A = org.telegram.messenger.k5.A(1.0f, f18, org.telegram.messenger.g0.T1(this.r1.d(this.b1 < 0.4f), f11, f19), f10);
        float L4 = rectF.right - org.telegram.messenger.g0.L(20.0f);
        float W1 = (org.telegram.messenger.g0.W1(f19, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(36.0f)) * A) / 2.0f;
        float f20 = 1.0f - f19;
        float T12 = org.telegram.messenger.g0.T1(((rectF.bottom - org.telegram.messenger.g0.L(80.0f)) - W1) - ((org.telegram.messenger.g0.L(120.0f) * this.c1) * f20), rectF.bottom - org.telegram.messenger.g0.L(20.0f), 1.0f - A);
        float L5 = (org.telegram.messenger.g0.L(36.0f) * A) / 2.0f;
        RectF rectF3 = this.s1;
        rectF3.set(L4 - L5, T12 - W1, L5 + L4, W1 + T12);
        float W12 = org.telegram.messenger.g0.W1(f19, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f));
        float L6 = org.telegram.messenger.g0.L(1.0f);
        float L7 = org.telegram.messenger.g0.L(0.66f);
        int r12 = org.telegram.ui.ActionBar.k6.r1(A, TLObject.FLAG_29);
        Paint paint4 = this.o1;
        paint4.setShadowLayer(L6, 0.0f, L7, r12);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, W12, W12, paint4);
        Paint c10 = this.R.c(A);
        if (c10 == null) {
            Paint paint5 = this.n1;
            paint5.setColor(TLObject.FLAG_30);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint5);
        } else {
            canvas.drawRoundRect(rectF3, W12, W12, c10);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint6);
        }
        canvas.save();
        canvas.scale(A, A, L4, T12);
        int r13 = org.telegram.ui.ActionBar.k6.r1(A, -1);
        Paint paint7 = this.p1;
        paint7.setColor(r13);
        int r14 = org.telegram.ui.ActionBar.k6.r1(A * f20, -1);
        Paint paint8 = this.q1;
        paint8.setColor(r14);
        float W13 = org.telegram.messenger.g0.W1(f19, org.telegram.messenger.g0.L(15.33f), org.telegram.messenger.g0.L(13.0f));
        float W14 = org.telegram.messenger.g0.W1(f19, org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(13.0f));
        float L8 = (org.telegram.messenger.g0.L(4.0f) * f20) + T12;
        canvas.rotate(this.c1 * 12.0f * f20, L4, L8);
        float f21 = W13 / 2.0f;
        float f22 = W14 / 2.0f;
        float f23 = L8 - f22;
        RectF rectF4 = this.u1;
        rectF4.set(L4 - f21, f23, f21 + L4, L8 + f22);
        canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(3.66f), paint7);
        if (f19 < 1.0f) {
            canvas.save();
            canvas.rotate(this.c1 * 12.0f * f20, L4, f23);
            canvas.translate(0.0f, f22 * f19);
            canvas.scale(f20, f20, L4, f23);
            Path path2 = this.v1;
            path2.rewind();
            float L9 = org.telegram.messenger.g0.L(4.33f);
            float L10 = f23 - org.telegram.messenger.g0.L(3.66f);
            float f24 = L4 + L9;
            path2.moveTo(f24, org.telegram.messenger.g0.L(3.66f) + L10);
            path2.lineTo(f24, L10);
            RectF rectF5 = org.telegram.messenger.g0.P;
            float f25 = L4 - L9;
            rectF5.set(f25, L10 - L9, f24, L9 + L10);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f25, (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(0.4f, 0.0f, this.c1), 1.0f, f19) * org.telegram.messenger.g0.L(3.66f)) + L10);
            paint8.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.J1) {
            ImageView imageView = this.R0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.w5 w5Var3 = this.L0;
            ImageView imageView2 = this.S0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || w5Var3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.n0) * 255.0f), 31);
                Path path3 = this.m1;
                path3.rewind();
                path3.addRoundRect(rectF, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || w5Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || w5Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.X0 == null) {
            this.X0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.X0.setAlpha((int) (f17 * f13));
        float timelineHeight = getTimelineHeight();
        this.X0.setBounds(org.telegram.messenger.g0.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.g0.L(48.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(40.0f)), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.g0.L(12.0f)));
        this.X0.draw(canvas);
    }

    @Override // fi.m, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q qVar = this.Z0;
        zg0 zg0Var = qVar.h;
        qVar.f = true;
        if (qVar.g) {
            zg0Var.start();
        }
        zg0Var.R(qVar.i);
    }

    @Override // fi.m, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.Z0;
        qVar.f = false;
        zg0 zg0Var = qVar.h;
        zg0Var.stop();
        zg0Var.R(null);
    }

    public void setAmplitude(double d) {
        this.j1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z9) {
        int i7 = z9 ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.R0;
        imageView.setImageResource(i7);
        imageView.setContentDescription(hd.M0(z9 ? 2131754788 : 2131754736, null));
        this.Y0 = z9;
    }

    public void setOnPeriodUpdate(c20 c20Var) {
        this.A1 = c20Var;
    }

    public void setOnPremiumHint(c20 c20Var) {
        this.B1 = c20Var;
    }

    public void setPeriod(int i7) {
        A(i7, true);
    }

    public void setPeriodVisible(boolean z9) {
        this.V0 = z9;
        this.S0.setVisibility((!z9 || this.o0) ? 8 : 0);
    }

    @Override // fi.m
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.S0.setAlpha(f11);
        this.R0.setAlpha(f11);
    }

    public final void z(boolean z9, boolean z10) {
        org.telegram.messenger.g0.r(this.O1);
        this.K1 = true;
        this.N1 = false;
        int L = (int) ((getBounds().right - org.telegram.messenger.g0.L(20.0f)) - ((getWidth() * 0.35f) * this.b1));
        this.J0 = false;
        this.K0 = L;
        invalidate();
        p pVar = this.C1;
        if (pVar != null) {
            if (!z9) {
                if (z10) {
                    pVar.y = true;
                    org.telegram.messenger.g0.r(pVar.h);
                    CameraController.getInstance().stopVideoRecording(pVar.a.getCameraSessionRecording(), false, false);
                    pVar.a(false);
                } else {
                    pVar.c();
                }
            }
            this.C1 = null;
        }
        n();
    }
}
