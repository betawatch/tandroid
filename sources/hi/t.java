package hi;

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
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.qc;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public abstract class t extends o {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public xy0 A1;
    public y10 B1;
    public y10 C1;
    public r D1;
    public float E1;
    public float F1;
    public final org.telegram.ui.Components.d6 G1;
    public final org.telegram.ui.Components.d6 H1;
    public final org.telegram.ui.Components.d6 I1;
    public final org.telegram.ui.Components.d6 J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final p P1;
    public final ImageView S0;
    public final ImageView T0;
    public final n U0;
    public a70 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final s a1;
    public final org.telegram.ui.Components.n6 b1;
    public float c1;
    public float d1;
    public long e1;
    public final Paint f1;
    public final Paint g1;
    public final org.telegram.ui.Components.w9 h1;
    public final org.telegram.ui.Components.w9 i1;
    public final Drawable j1;
    public float k1;
    public final org.telegram.ui.Components.d6 l1;
    public final Path m1;
    public final Path n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final Paint r1;
    public final org.telegram.ui.Components.d6 s1;
    public final RectF t1;
    public final RectF u1;
    public final RectF v1;
    public final Path w1;
    public xy0 x1;
    public Path y1;
    public Paint z1;

    public t(Context context, FrameLayout frameLayout, du0 du0Var, FrameLayout frameLayout2, fi.b bVar, org.telegram.ui.Components.ca caVar) {
        super(context, frameLayout, du0Var, frameLayout2, bVar, caVar);
        this.W0 = true;
        int i7 = 0;
        this.X0 = 0;
        ia iaVar = (ia) this;
        this.a1 = new s(iaVar, iaVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.b1 = n6Var;
        nr nrVar = nr.f;
        n6Var.n(0.16f, 50L, nrVar);
        n6Var.w(org.telegram.messenger.g0.L(15.0f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.t("0:00.0", true, true);
        n6Var.u(-1);
        Paint paint = new Paint(1);
        this.f1 = paint;
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(11, 360928);
        this.h1 = w9Var;
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(12, 360928);
        this.i1 = w9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        w9Var.a = org.telegram.messenger.g0.L(47.0f);
        w9Var.b = org.telegram.messenger.g0.L(55.0f);
        w9Var.b();
        w9Var2.a = org.telegram.messenger.g0.L(47.0f);
        w9Var2.b = org.telegram.messenger.g0.L(55.0f);
        w9Var2.b();
        this.j1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.l1 = new org.telegram.ui.Components.d6(new p(iaVar, i7), 200L, nrVar, 0);
        this.m1 = new Path();
        this.n1 = new Path();
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        this.q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        p pVar = new p(iaVar, i7);
        nr nrVar2 = nr.h;
        this.s1 = new org.telegram.ui.Components.d6(pVar, 350L, nrVar2);
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new RectF();
        this.w1 = new Path();
        this.G1 = new org.telegram.ui.Components.d6(this, 0L, 350L, nrVar2);
        this.H1 = new org.telegram.ui.Components.d6(new p(iaVar, i7), 420L, nrVar2, 0);
        this.I1 = new org.telegram.ui.Components.d6(this, 0L, 350L, nrVar2);
        this.J1 = new org.telegram.ui.Components.d6(new p(iaVar, i7), 350L, nrVar2, 0);
        this.P1 = new p(iaVar, 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(hd.N0(2131754735, null));
        addView(imageView, c8.ma.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ah.d(iaVar, 28));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        n nVar = new n(5);
        this.U0 = nVar;
        imageView2.setImageDrawable(nVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(hd.N0(2131744347, null));
        A(86400, false);
        addView(imageView2, c8.ma.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new ah.h(iaVar, frameLayout, bVar, 13));
    }

    public final void A(int i7, boolean z10) {
        int i10 = 0;
        while (true) {
            if (i10 >= 4) {
                i10 = 2;
                break;
            } else if (Q1[i10] == i7) {
                break;
            } else {
                i10++;
            }
        }
        if (this.X0 == i10) {
            return;
        }
        this.X0 = i10;
        this.U0.d(i7 / 3600, false, z10);
    }

    public final void B() {
        if (this.Z0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.a);
            String N0 = hd.N0(2131744255, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = hd.N0(2131744256, null);
            alertDialog$Builder.k(hd.N0(2131746125, null), new di.v6(this, 17));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, this.a);
            }
        }
    }

    @Override // hi.o
    public final int b() {
        return 36;
    }

    @Override // hi.o
    public final void c(boolean z10) {
        int i7 = (z10 || !this.W0) ? 8 : 0;
        ImageView imageView = this.T0;
        imageView.setVisibility(i7);
        this.S0.setVisibility(z10 ? 8 : 0);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override // hi.o
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
    @Override // hi.o, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        r rVar;
        Drawable drawable;
        if (this.O1 && (rVar = this.D1) != null && rVar.a != null && (drawable = this.Y0) != null) {
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
                    this.D1.a.switchCamera();
                    Drawable drawable2 = this.Y0;
                    if (drawable2 instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable2).start();
                    }
                }
            }
        }
        RectF rectF2 = org.telegram.messenger.g0.P;
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
        s sVar = this.a1;
        p pVar = this.P1;
        if (action != 0) {
            if (motionEvent.getAction() == 2) {
                if (!this.K1) {
                    this.c1 = Utilities.i((this.E1 - motionEvent.getX()) / (getWidth() * 0.35f), 1.0f, 0.0f);
                    float i10 = Utilities.i((this.F1 - motionEvent.getY()) / (getWidth() * 0.3f), 1.0f, 0.0f);
                    this.d1 = i10;
                    boolean z10 = this.M1;
                    if (!z10 && !this.K1 && this.c1 >= 1.0f) {
                        this.K1 = true;
                        this.O1 = false;
                        imageView.setVisibility(4);
                        this.T0.setVisibility(4);
                        sVar.g = true;
                        oh0 oh0Var = sVar.h;
                        oh0Var.T(true, 0.0f);
                        if (sVar.f) {
                            oh0Var.start();
                        }
                        r rVar2 = this.D1;
                        if (rVar2 != null) {
                            rVar2.y = true;
                            org.telegram.messenger.g0.r(rVar2.h);
                            CameraController.getInstance().stopVideoRecording(rVar2.a.getCameraSessionRecording(), false, false);
                            rVar2.a(false);
                        }
                        org.telegram.messenger.g0.h3(pVar, 800L);
                    } else if (!z10 && !this.K1 && i10 >= 1.0f && this.c1 < 0.4f) {
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
        ia iaVar = (ia) this;
        boolean isCameraAllowed = CameraView.isCameraAllowed();
        sa saVar = iaVar.S1;
        if (!isCameraAllowed ? false : sa.c(saVar)) {
            org.telegram.messenger.g0.r(pVar);
            this.E1 = motionEvent.getX();
            this.F1 = motionEvent.getY();
            this.k1 = 0.0f;
            this.c1 = 0.0f;
            this.G1.e(true, 0.0f);
            this.H1.e(true, 0.0f);
            this.K1 = false;
            this.L1 = false;
            this.M1 = false;
            sVar.g = false;
            oh0 oh0Var2 = sVar.h;
            oh0Var2.stop();
            oh0Var2.T(true, 0.0f);
            this.O1 = true;
            this.e1 = System.currentTimeMillis();
            this.K0 = true;
            this.L0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            invalidate();
            n();
            r rVar3 = new r(this, getContext());
            this.D1 = rVar3;
            r rVar4 = saVar.r1;
            if (rVar4 != null) {
                rVar4.a(true);
            }
            ga gaVar = saVar.Y0;
            if (gaVar != null) {
                gaVar.P = true;
                gaVar.c();
                ga gaVar2 = saVar.Y0;
                gaVar2.m(0L);
                cb cbVar = gaVar2.G;
                if (cbVar != null) {
                    cbVar.setProgress(0L);
                }
            }
            rVar3.n = new fi.b0(1, iaVar, rVar3);
            rVar3.r = new p(iaVar, 2);
            ea eaVar = saVar.i0;
            saVar.r1 = rVar3;
            eaVar.addView(rVar3, c8.ma.c(-1.0f, -1));
            return true;
        }
        return true;
    }

    @Override // hi.o
    public int getCaptionDefaultLimit() {
        return np.u1(this.V).Y4;
    }

    @Override // hi.o
    public int getCaptionPremiumLimit() {
        return np.u1(this.V).Z4;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override // hi.o
    public final void j(Canvas canvas, RectF rectF) {
        float f10;
        float f11;
        float f12;
        Paint paint;
        float f13;
        String str;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.D1 != null) {
            float d = this.G1.d(this.K1);
            float d2 = this.I1.d(this.M1);
            if (this.e1 <= 0) {
                this.e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin(((System.currentTimeMillis() - this.e1) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + org.telegram.messenger.g0.L(21.0f);
            float L2 = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
            s sVar = this.a1;
            sVar.setBounds((int) (L - org.telegram.messenger.g0.L(12.0f)), (int) (L2 - org.telegram.messenger.g0.L(12.0f)), (int) (L + org.telegram.messenger.g0.L(12.0f)), (int) (L2 + org.telegram.messenger.g0.L(12.0f)));
            sVar.draw(canvas3);
            int L3 = (int) ((rectF.left + org.telegram.messenger.g0.L(33.3f)) - (org.telegram.messenger.g0.L(10.0f) * d));
            int L4 = (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(9.0f));
            int L5 = (int) (rectF.left + org.telegram.messenger.g0.L(133.3f));
            int L6 = (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) + org.telegram.messenger.g0.L(9.0f));
            org.telegram.ui.Components.n6 n6Var = this.b1;
            n6Var.setBounds(L3, L4, L5, L6);
            long b10 = this.D1.b();
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
            n6Var.t(sb2.toString(), true, true);
            n6Var.C = (int) ((1.0f - d) * 255.0f);
            n6Var.draw(canvas3);
            float f14 = 1.0f - d2;
            float f15 = (1.0f - this.c1) * f14;
            Paint c10 = this.Q.c(1.0f);
            if (c10 != null) {
                f11 = 10.0f;
                paint = c10;
                f10 = 12.0f;
                f12 = f15;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, ls.e4, 31);
                canvas3 = canvas;
            } else {
                f10 = 12.0f;
                f11 = 10.0f;
                f12 = f15;
                paint = c10;
            }
            if (f12 > 0.0f) {
                if (this.x1 == null) {
                    this.x1 = new xy0(hd.N0(2131745117, null), 15.0f, null);
                }
                if (this.y1 == null) {
                    Path path = new Path();
                    this.y1 = path;
                    path.moveTo(org.telegram.messenger.g0.L(3.83f), 0.0f);
                    this.y1.lineTo(0.0f, org.telegram.messenger.g0.L(5.0f));
                    this.y1.lineTo(org.telegram.messenger.g0.L(3.83f), org.telegram.messenger.g0.L(f11));
                    Paint paint2 = new Paint(1);
                    this.z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.z1.setStrokeCap(Paint.Cap.ROUND);
                    this.z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.z1.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                this.x1.p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - n6Var.c());
                float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.c1, org.telegram.messenger.g0.L(6.0f) * sin, (rectF.centerX() - ((this.x1.k() + org.telegram.messenger.g0.L(11.33f)) / 2.0f)) - (org.telegram.messenger.g0.T1(this.c1, 1.0f, d2) * (rectF.width() / 6.0f)));
                int r12 = org.telegram.ui.ActionBar.m6.r1(f12, paint != null ? -1 : -2130706433);
                canvas3.save();
                canvas3.translate(t6, rectF.centerY() - org.telegram.messenger.g0.L(5.0f));
                this.z1.setColor(r12);
                canvas3.drawPath(this.y1, this.z1);
                canvas3.restore();
                str = null;
                f13 = 15.0f;
                this.x1.c(t6 + org.telegram.messenger.g0.L(11.33f), rectF.centerY(), 1.0f, r12, canvas3);
            } else {
                f13 = 15.0f;
                str = null;
            }
            if (d2 > 0.0f) {
                if (this.A1 == null) {
                    this.A1 = new xy0(hd.N0(2131752558, str), f13, org.telegram.messenger.g0.o());
                }
                this.A1.p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - n6Var.c());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.A1.k() / 2.0f));
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.m6.r1(d2, paint != null ? -1 : -2130706433), canvas2);
                this.u1.set(width - org.telegram.messenger.g0.L(f10), rectF.top, this.A1.k() + width + org.telegram.messenger.g0.L(f10), rectF.bottom);
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

    @Override // hi.o
    public final void k(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        if (f10 <= 0.0f) {
            return;
        }
        boolean z10 = this.K1;
        org.telegram.ui.Components.d6 d6Var = this.H1;
        float d = d6Var.d(z10);
        boolean z11 = this.M1;
        org.telegram.ui.Components.d6 d6Var2 = this.J1;
        float d2 = d6Var2.d(z11);
        float e10 = this.l1.e(false, this.k1);
        float f14 = 1.0f - d;
        float z12 = com.google.android.gms.internal.vision.e2.z(1.0f, this.c1, org.telegram.messenger.g0.L(30.0f) * e10, org.telegram.messenger.g0.L(41.0f)) * f14 * f10;
        float T1 = org.telegram.messenger.g0.T1(com.google.android.gms.internal.vision.e2.t(1.0f, d2, getWidth() * 0.35f * this.c1, rectF.right - org.telegram.messenger.g0.L(20.0f)), rectF.left + org.telegram.messenger.g0.L(20.0f), d);
        float L = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
        boolean e11 = qc.e(360928);
        Paint paint = this.g1;
        if (e11) {
            float L2 = org.telegram.messenger.g0.L(47.0f);
            org.telegram.ui.Components.w9 w9Var = this.h1;
            w9Var.a = L2;
            Paint paint2 = w9Var.d;
            f11 = 0.0f;
            w9Var.b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
            float L3 = org.telegram.messenger.g0.L(50.0f);
            f12 = d2;
            org.telegram.ui.Components.w9 w9Var2 = this.i1;
            w9Var2.a = L3;
            Paint paint3 = w9Var2.d;
            f13 = f14;
            w9Var2.b = (org.telegram.messenger.g0.L(12.0f) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
            w9Var2.e(e10, 1.01f);
            w9Var.e(e10, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.m6.r1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f15 = z12 / w9Var2.a;
            canvas.scale(f15, f15, T1, L);
            w9Var2.a(T1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.m6.r1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f16 = z12 / w9Var.a;
            canvas.scale(f16, f16, T1, L);
            w9Var.a(T1, L, canvas, paint2);
            canvas.restore();
        } else {
            f11 = 0.0f;
            f12 = d2;
            f13 = f14;
        }
        float min = Math.min(z12, org.telegram.messenger.g0.L(55.0f));
        float f17 = f10 * 255.0f;
        paint.setAlpha((int) f17);
        canvas.drawCircle(T1, L, min, paint);
        canvas.save();
        Path path = this.m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(T1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.j1;
        drawable.setBounds((int) (T1 - (((drawable.getIntrinsicWidth() / 2.0f) * f13) * (this.L1 ? f10 : 1.0f))), (int) (L - (((drawable.getIntrinsicHeight() / 2.0f) * f13) * (this.L1 ? f10 : 1.0f))), (int) (((drawable.getIntrinsicWidth() / 2.0f) * f13 * (this.L1 ? f10 : 1.0f)) + T1), (int) (((drawable.getIntrinsicHeight() / 2.0f) * f13 * (this.L1 ? f10 : 1.0f)) + L));
        drawable.setAlpha((int) (f13 * 255.0f * (this.L1 ? f10 : 1.0f)));
        drawable.draw(canvas);
        if (f12 > f11) {
            float N = (org.telegram.messenger.g0.N(19.33f) / 2.0f) * f12 * f10;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(T1 - N, L - N, T1 + N, L + N);
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(5.33f), this.f1);
        }
        canvas.restore();
        float f18 = d6Var.c;
        float f19 = d6Var2.c;
        float A = org.telegram.messenger.f3.A(1.0f, f18, org.telegram.messenger.g0.T1(this.s1.d(this.c1 < 0.4f), f11, f19), f10);
        float L4 = rectF.right - org.telegram.messenger.g0.L(20.0f);
        float W1 = (org.telegram.messenger.g0.W1(f19, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(36.0f)) * A) / 2.0f;
        float f20 = 1.0f - f19;
        float T12 = org.telegram.messenger.g0.T1(((rectF.bottom - org.telegram.messenger.g0.L(80.0f)) - W1) - ((org.telegram.messenger.g0.L(120.0f) * this.d1) * f20), rectF.bottom - org.telegram.messenger.g0.L(20.0f), 1.0f - A);
        float L5 = (org.telegram.messenger.g0.L(36.0f) * A) / 2.0f;
        RectF rectF3 = this.t1;
        rectF3.set(L4 - L5, T12 - W1, L5 + L4, W1 + T12);
        float W12 = org.telegram.messenger.g0.W1(f19, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f));
        float L6 = org.telegram.messenger.g0.L(1.0f);
        float L7 = org.telegram.messenger.g0.L(0.66f);
        int r12 = org.telegram.ui.ActionBar.m6.r1(A, TLObject.FLAG_29);
        Paint paint4 = this.p1;
        paint4.setShadowLayer(L6, 0.0f, L7, r12);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, W12, W12, paint4);
        Paint c10 = this.S.c(A);
        if (c10 == null) {
            Paint paint5 = this.o1;
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
        int r13 = org.telegram.ui.ActionBar.m6.r1(A, -1);
        Paint paint7 = this.q1;
        paint7.setColor(r13);
        int r14 = org.telegram.ui.ActionBar.m6.r1(A * f20, -1);
        Paint paint8 = this.r1;
        paint8.setColor(r14);
        float W13 = org.telegram.messenger.g0.W1(f19, org.telegram.messenger.g0.L(15.33f), org.telegram.messenger.g0.L(13.0f));
        float W14 = org.telegram.messenger.g0.W1(f19, org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(13.0f));
        float L8 = (org.telegram.messenger.g0.L(4.0f) * f20) + T12;
        canvas.rotate(this.d1 * 12.0f * f20, L4, L8);
        float f21 = W13 / 2.0f;
        float f22 = W14 / 2.0f;
        float f23 = L8 - f22;
        RectF rectF4 = this.v1;
        rectF4.set(L4 - f21, f23, f21 + L4, L8 + f22);
        canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(3.66f), paint7);
        if (f19 < 1.0f) {
            canvas.save();
            canvas.rotate(this.d1 * 12.0f * f20, L4, f23);
            canvas.translate(0.0f, f22 * f19);
            canvas.scale(f20, f20, L4, f23);
            Path path2 = this.w1;
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
            path2.lineTo(f25, (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(0.4f, 0.0f, this.d1), 1.0f, f19) * org.telegram.messenger.g0.L(3.66f)) + L10);
            paint8.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.d6 d6Var3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || d6Var3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.o0) * 255.0f), 31);
                Path path3 = this.n1;
                path3.rewind();
                path3.addRoundRect(rectF, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || d6Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || d6Var3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.Y0 == null) {
            this.Y0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.Y0.setAlpha((int) (f17 * f13));
        float timelineHeight = getTimelineHeight();
        this.Y0.setBounds(org.telegram.messenger.g0.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.g0.L(48.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(40.0f)), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.g0.L(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override // hi.o, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s sVar = this.a1;
        oh0 oh0Var = sVar.h;
        sVar.f = true;
        if (sVar.g) {
            oh0Var.start();
        }
        oh0Var.R(sVar.i);
    }

    @Override // hi.o, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s sVar = this.a1;
        sVar.f = false;
        oh0 oh0Var = sVar.h;
        oh0Var.stop();
        oh0Var.R(null);
    }

    public void setAmplitude(double d) {
        this.k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i7 = z10 ? R.drawable.input_video_story_remove : R.drawable.input_video_story;
        ImageView imageView = this.S0;
        imageView.setImageResource(i7);
        imageView.setContentDescription(hd.N0(z10 ? 2131754787 : 2131754735, null));
        this.Z0 = z10;
    }

    public void setOnPeriodUpdate(y10 y10Var) {
        this.B1 = y10Var;
    }

    public void setOnPremiumHint(y10 y10Var) {
        this.C1 = y10Var;
    }

    public void setPeriod(int i7) {
        A(i7, true);
    }

    public void setPeriodVisible(boolean z10) {
        this.W0 = z10;
        this.T0.setVisibility((!z10 || this.p0) ? 8 : 0);
    }

    @Override // hi.o
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.T0.setAlpha(f11);
        this.S0.setAlpha(f11);
    }

    public final void z(boolean z10, boolean z11) {
        org.telegram.messenger.g0.r(this.P1);
        this.L1 = true;
        this.O1 = false;
        int L = (int) ((getBounds().right - org.telegram.messenger.g0.L(20.0f)) - ((getWidth() * 0.35f) * this.c1));
        this.K0 = false;
        this.L0 = L;
        invalidate();
        r rVar = this.D1;
        if (rVar != null) {
            if (!z10) {
                if (z11) {
                    rVar.y = true;
                    org.telegram.messenger.g0.r(rVar.h);
                    CameraController.getInstance().stopVideoRecording(rVar.a.getCameraSessionRecording(), false, false);
                    rVar.a(false);
                } else {
                    rVar.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
