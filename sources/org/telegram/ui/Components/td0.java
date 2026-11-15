package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class td0 extends FrameLayout implements yy, hi.oa {
    public final ImageView A0;
    public final ImageView B0;
    public final ImageView C0;
    public final Bitmap D0;
    public final int E;
    public final Bitmap E0;
    public final int F;
    public final Rect F0;
    public final int G;
    public final Matrix G0;
    public float H;
    public final Paint H0;
    public float I;
    public final int I0;
    public float J;
    public final org.telegram.ui.ActionBar.e6 J0;
    public float K;
    public int K0;
    public float L;
    public int L0;
    public float M;
    public float N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public int U;
    public float V;
    public boolean W;
    public boolean a;
    public final h2.c a0;
    public final int b;
    public float b0;
    public final int c;
    public PointF c0;
    public final int d;
    public float d0;
    public final int e;
    public float e0;
    public final int f;
    public org.telegram.messenger.gf f0;
    public final FrameLayout g0;
    public final int h;
    public final TextView h0;
    public final TextView i0;
    public final TextureView j0;
    public final boolean k0;
    public final boolean l0;
    public wy m0;
    public final int n;
    public final lh n0;
    public final FrameLayout o0;
    public final kd0 p0;
    public final md0 q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final TextView t0;
    public final FrameLayout u0;
    public final RadioButton[] v0;
    public final int w;
    public final tb0 w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public final boolean y0;
    public int z0;

    public td0(Context context, k51 k51Var, Bitmap bitmap, Bitmap bitmap2, int i7, org.telegram.messenger.gf gfVar, tb0 tb0Var, int i10, boolean z10, boolean z11, u9 u9Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.l0 = z11;
        this.J0 = e6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.y0 = z12;
        this.w0 = tb0Var;
        this.x0 = z10;
        this.G = 0;
        if (i10 == 1) {
            this.G = 1;
            this.n = 0;
        } else if (i10 == 0) {
            this.n = -1;
        }
        int i11 = this.G;
        this.b = i11;
        this.c = i11 + 1;
        this.d = i11 + 2;
        this.e = i11 + 3;
        this.f = i11 + 4;
        this.h = i11 + 5;
        this.r = i11 + 6;
        this.s = i11 + 7;
        int i12 = i11 + 9;
        this.G = i12;
        this.w = i11 + 8;
        if (i10 == 2) {
            this.G = i11 + 10;
            this.n = i12;
        }
        if (k51Var == null) {
            int i13 = this.G;
            this.G = i13 + 1;
            this.x = i13;
        } else {
            this.x = -1;
        }
        int i14 = this.G;
        this.y = i14;
        this.E = i14 + 1;
        this.G = i14 + 3;
        this.F = i14 + 2;
        if (gfVar != null) {
            this.H = gfVar.a;
            this.N = gfVar.b;
            this.I = gfVar.c;
            this.J = gfVar.d;
            this.K = gfVar.e;
            this.L = gfVar.f;
            this.M = gfVar.g;
            this.O = gfVar.h;
            this.P = gfVar.i;
            this.Q = gfVar.j;
            this.R = gfVar.k;
            this.S = gfVar.l;
            this.T = gfVar.m;
            this.U = gfVar.n;
            this.V = gfVar.o;
            this.a0 = gfVar.p;
            this.b0 = gfVar.q;
            this.c0 = gfVar.r;
            this.d0 = gfVar.s;
            this.W = gfVar.a();
            this.e0 = gfVar.t;
            this.f0 = gfVar;
        } else {
            this.a0 = new h2.c();
            this.b0 = 0.35f;
            this.c0 = new PointF(0.5f, 0.5f);
            this.d0 = 0.15f;
            this.e0 = 1.5707964f;
            this.W = true;
        }
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.I0 = i7;
        if (k51Var != null) {
            this.j0 = k51Var;
            k51Var.setDelegate(new nd0(this));
        } else {
            this.k0 = true;
            n40 n40Var = new n40(1, context, this);
            this.j0 = n40Var;
            if (z11) {
                addView(n40Var, c8.ja.e(-1, -1, 51));
            }
            n40Var.setVisibility(4);
            n40Var.setSurfaceTextureListener(new qd0(this, z11, u9Var));
        }
        kd0 kd0Var = new kd0(context);
        kd0Var.a = new PointF();
        kd0Var.d = new nt0();
        kd0Var.e = new PointF(0.5f, 0.5f);
        kd0Var.f = 0.15f;
        kd0Var.h = 0.35f;
        kd0Var.r = new RectF();
        kd0Var.y = 1.0f;
        kd0Var.G = true;
        Paint paint = new Paint(1);
        kd0Var.J = paint;
        Paint paint2 = new Paint(1);
        kd0Var.K = paint2;
        kd0Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        kd0Var.L = z12;
        this.p0 = kd0Var;
        kd0Var.setVisibility(4);
        if (z11) {
            addView(kd0Var, c8.ja.e(-1, -1, 51));
        }
        kd0Var.setDelegate(new nd0(this));
        h2.c cVar = this.a0;
        md0 md0Var = new md0(context);
        md0Var.a = 0;
        md0Var.c = true;
        md0Var.e = new pi0();
        Paint paint3 = new Paint(1);
        md0Var.f = paint3;
        Paint paint4 = new Paint(1);
        md0Var.h = paint4;
        Paint paint5 = new Paint(1);
        md0Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        md0Var.r = textPaint;
        md0Var.s = new Path();
        md0Var.setWillNotDraw(false);
        md0Var.x = cVar;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        this.q0 = md0Var;
        md0Var.setDelegate(new nd0(this));
        md0Var.setVisibility(4);
        if (z11) {
            addView(md0Var, c8.ja.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        addView(frameLayout, c8.ja.e(-1, (!z11 ? 40 : 0) + org.telegram.messenger.ns.Q2, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, c8.ja.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView, c8.ja.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.j6.qg;
        org.telegram.ui.ActionBar.q6.U(textView2, i15, e6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.hd.M0(2131751354, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView2, c8.ja.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, c8.ja.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        org.telegram.ui.ActionBar.q6.s(imageView, i15, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, c8.ja.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.od0
            public final /* synthetic */ td0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        td0 td0Var = this.b;
                        td0Var.z0 = 0;
                        org.telegram.ui.ActionBar.q6.s(td0Var.A0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var.B0.setColorFilter((ColorFilter) null);
                        td0Var.C0.setColorFilter((ColorFilter) null);
                        td0Var.d();
                        break;
                    case 1:
                        td0 td0Var2 = this.b;
                        td0Var2.z0 = 1;
                        td0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var2.B0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var2.C0.setColorFilter((ColorFilter) null);
                        td0Var2.d();
                        break;
                    default:
                        td0 td0Var3 = this.b;
                        td0Var3.z0 = 2;
                        td0Var3.A0.setColorFilter((ColorFilter) null);
                        td0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var3.C0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var3.d();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        final int i16 = 1;
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, c8.ja.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.od0
            public final /* synthetic */ td0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        td0 td0Var = this.b;
                        td0Var.z0 = 0;
                        org.telegram.ui.ActionBar.q6.s(td0Var.A0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var.B0.setColorFilter((ColorFilter) null);
                        td0Var.C0.setColorFilter((ColorFilter) null);
                        td0Var.d();
                        break;
                    case 1:
                        td0 td0Var2 = this.b;
                        td0Var2.z0 = 1;
                        td0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var2.B0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var2.C0.setColorFilter((ColorFilter) null);
                        td0Var2.d();
                        break;
                    default:
                        td0 td0Var3 = this.b;
                        td0Var3.z0 = 2;
                        td0Var3.A0.setColorFilter((ColorFilter) null);
                        td0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var3.C0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var3.d();
                        break;
                }
            }
        });
        if (k51Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, c8.ja.o(56, 48));
        final int i17 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.od0
            public final /* synthetic */ td0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        td0 td0Var = this.b;
                        td0Var.z0 = 0;
                        org.telegram.ui.ActionBar.q6.s(td0Var.A0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var.B0.setColorFilter((ColorFilter) null);
                        td0Var.C0.setColorFilter((ColorFilter) null);
                        td0Var.d();
                        break;
                    case 1:
                        td0 td0Var2 = this.b;
                        td0Var2.z0 = 1;
                        td0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var2.B0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var2.C0.setColorFilter((ColorFilter) null);
                        td0Var2.d();
                        break;
                    default:
                        td0 td0Var3 = this.b;
                        td0Var3.z0 = 2;
                        td0Var3.A0.setColorFilter((ColorFilter) null);
                        td0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.q6.s(td0Var3.C0, org.telegram.ui.ActionBar.j6.qg, e6Var, PorterDuff.Mode.MULTIPLY);
                        td0Var3.d();
                        break;
                }
            }
        });
        lh lhVar = new lh(context, 1);
        this.n0 = lhVar;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(1);
        lhVar.setLayoutManager(b0Var);
        lhVar.setClipToPadding(false);
        lhVar.setOverScrollMode(2);
        lhVar.setAdapter(new org.telegram.ui.l4(4, this, context));
        frameLayout.addView(lhVar, c8.ja.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.u0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, c8.ja.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, c8.ja.e(-2, -2, 1));
        int i18 = 0;
        while (i18 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i18));
            this.v0[i18] = new RadioButton(context);
            this.v0[i18].setSize(org.telegram.messenger.g0.L(20.0f));
            frameLayout4.addView(this.v0[i18], c8.ja.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i18 == 0) {
                String M0 = org.telegram.messenger.hd.M0(2131751692, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.v0[i18].b(-1, -1);
            } else if (i18 == 1) {
                String M02 = org.telegram.messenger.hd.M0(2131751689, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.v0[i18].b(-1684147, -1684147);
            } else if (i18 == 2) {
                String M03 = org.telegram.messenger.hd.M0(2131751690, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.v0[i18].b(-10831009, -10831009);
            } else if (i18 == 3) {
                String M04 = org.telegram.messenger.hd.M0(2131751691, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.v0[i18].b(-12734994, -12734994);
            }
            frameLayout4.addView(textView3, c8.ja.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, c8.ja.k(i18 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pd0
                public final /* synthetic */ td0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            td0 td0Var = this.b;
                            td0Var.getClass();
                            int intValue = ((Integer) view.getTag()).intValue();
                            td0Var.a0.a = intValue;
                            int i19 = 0;
                            while (i19 < 4) {
                                td0Var.v0[i19].a(i19 == intValue, true);
                                i19++;
                            }
                            td0Var.q0.invalidate();
                            break;
                        case 1:
                            td0 td0Var2 = this.b;
                            td0Var2.U = 0;
                            td0Var2.f();
                            td0Var2.p0.setVisibility(4);
                            wy wyVar = td0Var2.m0;
                            if (wyVar != null) {
                                wyVar.c(false, false, false);
                                break;
                            }
                            break;
                        case 2:
                            td0 td0Var3 = this.b;
                            td0Var3.U = 1;
                            td0Var3.f();
                            kd0 kd0Var2 = td0Var3.p0;
                            kd0Var2.setVisibility(0);
                            kd0Var2.setType(1);
                            wy wyVar2 = td0Var3.m0;
                            if (wyVar2 != null) {
                                wyVar2.c(false, false, false);
                                break;
                            }
                            break;
                        default:
                            td0 td0Var4 = this.b;
                            td0Var4.U = 2;
                            td0Var4.f();
                            kd0 kd0Var3 = td0Var4.p0;
                            kd0Var3.setVisibility(0);
                            kd0Var3.setType(0);
                            wy wyVar3 = td0Var4.m0;
                            if (wyVar3 != null) {
                                wyVar3.c(false, false, false);
                                break;
                            }
                            break;
                    }
                }
            });
            i18++;
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.o0 = frameLayout5;
        frameLayout5.setVisibility(4);
        this.g0.addView(frameLayout5, c8.ja.d(org.telegram.messenger.ns.D4, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.r0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        final int i19 = 1;
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.hd.M0(2131753673, null));
        frameLayout5.addView(textView4, c8.ja.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pd0
            public final /* synthetic */ td0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        td0 td0Var = this.b;
                        td0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        td0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            td0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        td0Var.q0.invalidate();
                        break;
                    case 1:
                        td0 td0Var2 = this.b;
                        td0Var2.U = 0;
                        td0Var2.f();
                        td0Var2.p0.setVisibility(4);
                        wy wyVar = td0Var2.m0;
                        if (wyVar != null) {
                            wyVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        td0 td0Var3 = this.b;
                        td0Var3.U = 1;
                        td0Var3.f();
                        kd0 kd0Var2 = td0Var3.p0;
                        kd0Var2.setVisibility(0);
                        kd0Var2.setType(1);
                        wy wyVar2 = td0Var3.m0;
                        if (wyVar2 != null) {
                            wyVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        td0 td0Var4 = this.b;
                        td0Var4.U = 2;
                        td0Var4.f();
                        kd0 kd0Var3 = td0Var4.p0;
                        kd0Var3.setVisibility(0);
                        kd0Var3.setType(0);
                        wy wyVar3 = td0Var4.m0;
                        if (wyVar3 != null) {
                            wyVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.s0 = textView5;
        textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(org.telegram.messenger.hd.M0(2131753672, null));
        frameLayout5.addView(textView5, c8.ja.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i20 = 2;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pd0
            public final /* synthetic */ td0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        td0 td0Var = this.b;
                        td0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        td0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            td0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        td0Var.q0.invalidate();
                        break;
                    case 1:
                        td0 td0Var2 = this.b;
                        td0Var2.U = 0;
                        td0Var2.f();
                        td0Var2.p0.setVisibility(4);
                        wy wyVar = td0Var2.m0;
                        if (wyVar != null) {
                            wyVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        td0 td0Var3 = this.b;
                        td0Var3.U = 1;
                        td0Var3.f();
                        kd0 kd0Var2 = td0Var3.p0;
                        kd0Var2.setVisibility(0);
                        kd0Var2.setType(1);
                        wy wyVar2 = td0Var3.m0;
                        if (wyVar2 != null) {
                            wyVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        td0 td0Var4 = this.b;
                        td0Var4.U = 2;
                        td0Var4.f();
                        kd0 kd0Var3 = td0Var4.p0;
                        kd0Var3.setVisibility(0);
                        kd0Var3.setType(0);
                        wy wyVar3 = td0Var4.m0;
                        if (wyVar3 != null) {
                            wyVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.t0 = textView6;
        textView6.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(org.telegram.messenger.hd.M0(2131753674, null));
        frameLayout5.addView(textView6, c8.ja.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i21 = 3;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pd0
            public final /* synthetic */ td0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        td0 td0Var = this.b;
                        td0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        td0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            td0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        td0Var.q0.invalidate();
                        break;
                    case 1:
                        td0 td0Var2 = this.b;
                        td0Var2.U = 0;
                        td0Var2.f();
                        td0Var2.p0.setVisibility(4);
                        wy wyVar = td0Var2.m0;
                        if (wyVar != null) {
                            wyVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        td0 td0Var3 = this.b;
                        td0Var3.U = 1;
                        td0Var3.f();
                        kd0 kd0Var2 = td0Var3.p0;
                        kd0Var2.setVisibility(0);
                        kd0Var2.setType(1);
                        wy wyVar2 = td0Var3.m0;
                        if (wyVar2 != null) {
                            wyVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        td0 td0Var4 = this.b;
                        td0Var4.U = 2;
                        td0Var4.f();
                        kd0 kd0Var3 = td0Var4.p0;
                        kd0Var3.setVisibility(0);
                        kd0Var3.setType(0);
                        wy wyVar3 = td0Var4.m0;
                        if (wyVar3 != null) {
                            wyVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        f();
        if (this.y0 || !z11) {
            return;
        }
        if (this.k0) {
            ((FrameLayout.LayoutParams) this.j0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        }
        ((FrameLayout.LayoutParams) this.q0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
    }

    private void setShowOriginal(boolean z10) {
        if (this.a == z10) {
            return;
        }
        this.a = z10;
        wy wyVar = this.m0;
        if (wyVar != null) {
            wyVar.c(false, false, false);
        }
    }

    public final boolean a() {
        org.telegram.messenger.gf gfVar = this.f0;
        h2.c cVar = this.a0;
        return gfVar != null ? (this.H == gfVar.a && this.J == gfVar.d && this.Q == gfVar.j && this.I == gfVar.c && this.K == gfVar.e && this.L == gfVar.f && this.S == gfVar.l && this.R == gfVar.k && this.T == gfVar.m && this.V == gfVar.o && this.M == gfVar.g && this.N == gfVar.b && this.P == gfVar.i && this.O == gfVar.h && cVar.F()) ? false : true : (this.H == 0.0f && this.J == 0.0f && this.Q == 0.0f && this.I == 0.0f && this.K == 0.0f && this.L == 0.0f && this.S == 0.0f && this.R == 0.0f && this.T == 0.0f && this.V == 0.0f && this.M == 0.0f && this.N == 0.0f && this.P == 0 && this.O == 0 && cVar.F()) ? false : true;
    }

    public final void b() {
        boolean z10 = this.k0;
        TextureView textureView = this.j0;
        if (z10) {
            wy wyVar = this.m0;
            if (wyVar != null) {
                wyVar.postRunnable(new ty(wyVar, 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof k51) {
            k51 k51Var = (k51) textureView;
            org.telegram.messenger.gf gfVar = this.f0;
            if (gfVar == null) {
                k51Var.setDelegate(null);
                return;
            }
            wy wyVar2 = this.m0;
            if (wyVar2 != null) {
                wyVar2.d(new cf(gfVar));
            }
        }
    }

    @Override // org.telegram.ui.Components.yy
    public final ByteBuffer c() {
        h2.c cVar = this.a0;
        cVar.q();
        return (ByteBuffer) cVar.f;
    }

    public final void d() {
        int i7 = this.z0;
        lh lhVar = this.n0;
        md0 md0Var = this.q0;
        FrameLayout frameLayout = this.u0;
        FrameLayout frameLayout2 = this.o0;
        kd0 kd0Var = this.p0;
        if (i7 == 0) {
            kd0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            md0Var.setVisibility(4);
            lhVar.setVisibility(0);
            return;
        }
        if (i7 == 1) {
            lhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            md0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                kd0Var.setVisibility(0);
            }
            f();
            return;
        }
        if (i7 == 2) {
            lhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            kd0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            md0Var.setVisibility(0);
            this.a0.a = 0;
            int i10 = 0;
            while (i10 < 4) {
                this.v0[i10].a(i10 == 0, false);
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        tb0 tb0Var = this.w0;
        if (tb0Var != null && view == (textureView = this.j0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.E0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.F0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.H0;
                int i7 = this.I0;
                if (i7 != 0) {
                    Matrix matrix = this.G0;
                    matrix.reset();
                    matrix.postRotate(i7, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / tb0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            tb0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.W = Math.abs(this.H) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && this.O == 0 && this.P == 0 && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && Math.abs(this.T) < 0.1f && this.U == 0 && Math.abs(this.V) < 0.1f && this.a0.F();
    }

    public final void f() {
        int i7 = this.U;
        TextView textView = this.t0;
        TextView textView2 = this.s0;
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        TextView textView3 = this.r0;
        if (i7 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i10 = org.telegram.ui.ActionBar.j6.qg;
            org.telegram.ui.ActionBar.q6.x(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i11 = org.telegram.ui.ActionBar.j6.qg;
            org.telegram.ui.ActionBar.q6.x(this, mutate2, i11, e6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i12 = org.telegram.ui.ActionBar.j6.qg;
            org.telegram.ui.ActionBar.q6.x(this, mutate3, i12, e6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(i12, e6Var));
        }
        e();
    }

    public Bitmap getBitmap() {
        wy wyVar = this.m0;
        if (wyVar == null || !wyVar.f || !wyVar.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (wyVar.postRunnable(new yf(wyVar, bitmapArr, countDownLatch, 7))) {
                countDownLatch.await();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        return bitmapArr[0];
    }

    @Override // org.telegram.ui.Components.yy
    public float getBlurAngle() {
        return this.e0;
    }

    public kd0 getBlurControl() {
        return this.p0;
    }

    @Override // org.telegram.ui.Components.yy
    public float getBlurExcludeBlurSize() {
        return this.d0;
    }

    @Override // org.telegram.ui.Components.yy
    public PointF getBlurExcludePoint() {
        return this.c0;
    }

    @Override // org.telegram.ui.Components.yy
    public float getBlurExcludeSize() {
        return this.b0;
    }

    @Override // org.telegram.ui.Components.yy
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.i0;
    }

    @Override // org.telegram.ui.Components.yy
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(this.J, 100.0f, 0.3f, 1.0f);
    }

    public md0 getCurveControl() {
        return this.q0;
    }

    public TextView getDoneTextView() {
        return this.h0;
    }

    @Override // org.telegram.ui.Components.yy
    public float getEnhanceValue() {
        return this.H / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getExposureValue() {
        return this.I / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getFadeValue() {
        return this.M / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getGrainValue() {
        return (this.T / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.Q, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.k0 || this.l0) {
            return null;
        }
        return this.j0;
    }

    @Override // org.telegram.ui.Components.yy
    public float getSaturationValue() {
        float f10 = this.L / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public org.telegram.messenger.gf getSavedFilterState() {
        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf();
        gfVar.a = this.H;
        gfVar.c = this.I;
        gfVar.d = this.J;
        gfVar.e = this.K;
        gfVar.f = this.L;
        gfVar.g = this.M;
        gfVar.b = this.N;
        gfVar.h = this.O;
        gfVar.i = this.P;
        gfVar.j = this.Q;
        gfVar.k = this.R;
        gfVar.l = this.S;
        gfVar.m = this.T;
        gfVar.n = this.U;
        gfVar.o = this.V;
        gfVar.p = this.a0;
        gfVar.q = this.b0;
        gfVar.r = this.c0;
        gfVar.s = this.d0;
        gfVar.t = this.e0;
        this.f0 = gfVar;
        return gfVar;
    }

    @Override // org.telegram.ui.Components.yy
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.R, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.yy
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(this.V, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.yy
    public float getSoftenSkinValue() {
        return this.N / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public int getTintHighlightsColor() {
        return this.P;
    }

    @Override // org.telegram.ui.Components.yy
    public float getTintHighlightsIntensityValue() {
        return this.P == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.yy
    public int getTintShadowsColor() {
        return this.O;
    }

    @Override // org.telegram.ui.Components.yy
    public float getTintShadowsIntensityValue() {
        return this.O == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.g0;
    }

    public Bitmap getUiBlurBitmap() {
        z9 z9Var;
        wy wyVar = this.m0;
        if (wyVar == null || (z9Var = wyVar.J) == null) {
            return null;
        }
        synchronized (z9Var.n) {
            try {
                if (z9Var.q) {
                    return z9Var.p;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.yy
    public float getVignetteValue() {
        return this.S / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public float getWarmthValue() {
        return this.K / 100.0f;
    }

    @Override // org.telegram.ui.Components.yy
    public final boolean h() {
        return this.a || this.W;
    }

    @Override // hi.oa
    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.j0;
            if (textureView instanceof k51) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                pi0 pi0Var = ((k51) textureView).c;
                float f10 = pi0Var.a;
                if (x10 >= f10 && x10 <= f10 + pi0Var.c) {
                    float f11 = pi0Var.b;
                    if (y10 >= f11 && y10 <= f11 + pi0Var.d) {
                        setShowOriginal(true);
                    }
                }
            } else if (motionEvent.getX() >= textureView.getX() && motionEvent.getY() >= textureView.getY() && motionEvent.getX() <= textureView.getX() + textureView.getWidth() && motionEvent.getY() <= textureView.getY() + textureView.getHeight()) {
                setShowOriginal(true);
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
            setShowOriginal(false);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.yy
    public final boolean k() {
        return !this.a0.F();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float width;
        int height;
        float ceil;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (this.l0) {
            int L = size - org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(214.0f);
            boolean z10 = this.y0;
            int i11 = size2 - (L2 + (!z10 ? org.telegram.messenger.g0.m : 0));
            TextureView textureView = this.j0;
            Bitmap bitmap = this.D0;
            if (bitmap != null) {
                int i12 = this.I0 % 360;
                if (i12 == 90 || i12 == 270) {
                    width = bitmap.getHeight();
                    height = bitmap.getWidth();
                } else {
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                }
            } else {
                width = textureView.getWidth();
                height = textureView.getHeight();
            }
            float f11 = L;
            float f12 = i11;
            if (f11 / width > f12 / height) {
                f10 = (int) Math.ceil(width * r11);
                ceil = f12;
            } else {
                ceil = (int) Math.ceil(r6 * r9);
                f10 = f11;
            }
            int ceil2 = (int) Math.ceil(((f11 - f10) / 2.0f) + org.telegram.messenger.g0.L(14.0f));
            int ceil3 = (int) Math.ceil(((f12 - ceil) / 2.0f) + org.telegram.messenger.g0.L(14.0f) + (!z10 ? org.telegram.messenger.g0.m : 0));
            int i13 = (int) f10;
            int i14 = (int) ceil;
            if (this.k0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i13;
                layoutParams.height = i14;
            }
            float f13 = ceil2;
            float f14 = ceil3 - (!z10 ? org.telegram.messenger.g0.m : 0);
            float f15 = i13;
            float f16 = i14;
            md0 md0Var = this.q0;
            pi0 pi0Var = md0Var.e;
            pi0Var.a = f13;
            pi0Var.b = f14;
            pi0Var.c = f15;
            pi0Var.d = f16;
            kd0 kd0Var = this.p0;
            nt0 nt0Var = kd0Var.d;
            nt0Var.a = f15;
            nt0Var.b = f16;
            ((FrameLayout.LayoutParams) kd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(38.0f) + i11;
            ((FrameLayout.LayoutParams) md0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(28.0f) + i11;
            if (org.telegram.messenger.g0.Q1()) {
                int L3 = org.telegram.messenger.g0.L(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.n0.getLayoutParams();
                if (L3 < L) {
                    layoutParams2.width = L3;
                    layoutParams2.leftMargin = (L - L3) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i7, i10);
    }

    public void setEnhanceValue(float f10) {
        this.H = f10 * 100.0f;
        e();
        int i7 = 0;
        while (true) {
            lh lhVar = this.n0;
            if (i7 >= lhVar.getChildCount()) {
                break;
            }
            View childAt = lhVar.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.s5) && RecyclerView.R(childAt) == this.b) {
                ((org.telegram.ui.Cells.s5) childAt).a(org.telegram.messenger.hd.M0(2131751126, null), 0, this.H);
                break;
            }
            i7++;
        }
        wy wyVar = this.m0;
        if (wyVar != null) {
            wyVar.c(true, false, false);
        }
    }
}
