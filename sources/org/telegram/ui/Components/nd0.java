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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nd0 extends FrameLayout implements ry, gi.ra {
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
    public final g2.d a0;
    public final int b;
    public float b0;
    public final int c;
    public PointF c0;
    public final int d;
    public float d0;
    public final int e;
    public float e0;
    public final int f;
    public org.telegram.messenger.ze f0;
    public final FrameLayout g0;
    public final int h;
    public final TextView h0;
    public final TextView i0;
    public final TextureView j0;
    public final boolean k0;
    public final boolean l0;
    public py m0;
    public final int n;
    public final bh n0;
    public final FrameLayout o0;
    public final ed0 p0;
    public final gd0 q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final TextView t0;
    public final FrameLayout u0;
    public final RadioButton[] v0;
    public final int w;
    public final nb0 w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public final boolean y0;
    public int z0;

    public nd0(Context context, b51 b51Var, Bitmap bitmap, Bitmap bitmap2, int i3, org.telegram.messenger.ze zeVar, nb0 nb0Var, int i10, boolean z10, boolean z11, x9 x9Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.l0 = z11;
        this.J0 = e6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.y0 = z12;
        this.w0 = nb0Var;
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
        if (b51Var == null) {
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
        if (zeVar != null) {
            this.H = zeVar.a;
            this.N = zeVar.b;
            this.I = zeVar.c;
            this.J = zeVar.d;
            this.K = zeVar.e;
            this.L = zeVar.f;
            this.M = zeVar.g;
            this.O = zeVar.h;
            this.P = zeVar.i;
            this.Q = zeVar.j;
            this.R = zeVar.k;
            this.S = zeVar.l;
            this.T = zeVar.m;
            this.U = zeVar.n;
            this.V = zeVar.o;
            this.a0 = zeVar.p;
            this.b0 = zeVar.q;
            this.c0 = zeVar.r;
            this.d0 = zeVar.s;
            this.W = zeVar.a();
            this.e0 = zeVar.t;
            this.f0 = zeVar;
        } else {
            this.a0 = new g2.d();
            this.b0 = 0.35f;
            this.c0 = new PointF(0.5f, 0.5f);
            this.d0 = 0.15f;
            this.e0 = 1.5707964f;
            this.W = true;
        }
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.I0 = i3;
        if (b51Var != null) {
            this.j0 = b51Var;
            b51Var.setDelegate(new hd0(this));
        } else {
            this.k0 = true;
            g40 g40Var = new g40(1, context, this);
            this.j0 = g40Var;
            if (z11) {
                addView(g40Var, b8.mf.e(-1, -1, 51));
            }
            g40Var.setVisibility(4);
            g40Var.setSurfaceTextureListener(new kd0(this, z11, x9Var));
        }
        ed0 ed0Var = new ed0(context);
        ed0Var.a = new PointF();
        ed0Var.d = new lt0();
        ed0Var.e = new PointF(0.5f, 0.5f);
        ed0Var.f = 0.15f;
        ed0Var.h = 0.35f;
        ed0Var.r = new RectF();
        ed0Var.y = 1.0f;
        ed0Var.G = true;
        Paint paint = new Paint(1);
        ed0Var.J = paint;
        Paint paint2 = new Paint(1);
        ed0Var.K = paint2;
        ed0Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        ed0Var.L = z12;
        this.p0 = ed0Var;
        ed0Var.setVisibility(4);
        if (z11) {
            addView(ed0Var, b8.mf.e(-1, -1, 51));
        }
        ed0Var.setDelegate(new hd0(this));
        g2.d dVar = this.a0;
        gd0 gd0Var = new gd0(context);
        gd0Var.a = 0;
        gd0Var.c = true;
        gd0Var.e = new ni0();
        Paint paint3 = new Paint(1);
        gd0Var.f = paint3;
        Paint paint4 = new Paint(1);
        gd0Var.h = paint4;
        Paint paint5 = new Paint(1);
        gd0Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        gd0Var.r = textPaint;
        gd0Var.s = new Path();
        gd0Var.setWillNotDraw(false);
        gd0Var.x = dVar;
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
        this.q0 = gd0Var;
        gd0Var.setDelegate(new hd0(this));
        gd0Var.setVisibility(4);
        if (z11) {
            addView(gd0Var, b8.mf.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        addView(frameLayout, b8.mf.e(-1, (!z11 ? 40 : 0) + org.telegram.messenger.hs.Q2, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, b8.mf.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.bd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView, b8.mf.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.k6.ng;
        org.telegram.ui.ActionBar.r6.V(textView2, i15, e6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.bd.M0(2131751355, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView2, b8.mf.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, b8.mf.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        org.telegram.ui.ActionBar.r6.t(imageView, i15, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, b8.mf.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.id0
            public final /* synthetic */ nd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        nd0 nd0Var = this.b;
                        nd0Var.z0 = 0;
                        org.telegram.ui.ActionBar.r6.t(nd0Var.A0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var.B0.setColorFilter((ColorFilter) null);
                        nd0Var.C0.setColorFilter((ColorFilter) null);
                        nd0Var.c();
                        break;
                    case 1:
                        nd0 nd0Var2 = this.b;
                        nd0Var2.z0 = 1;
                        nd0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var2.B0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var2.C0.setColorFilter((ColorFilter) null);
                        nd0Var2.c();
                        break;
                    default:
                        nd0 nd0Var3 = this.b;
                        nd0Var3.z0 = 2;
                        nd0Var3.A0.setColorFilter((ColorFilter) null);
                        nd0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var3.C0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var3.c();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        final int i16 = 1;
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, b8.mf.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.id0
            public final /* synthetic */ nd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        nd0 nd0Var = this.b;
                        nd0Var.z0 = 0;
                        org.telegram.ui.ActionBar.r6.t(nd0Var.A0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var.B0.setColorFilter((ColorFilter) null);
                        nd0Var.C0.setColorFilter((ColorFilter) null);
                        nd0Var.c();
                        break;
                    case 1:
                        nd0 nd0Var2 = this.b;
                        nd0Var2.z0 = 1;
                        nd0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var2.B0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var2.C0.setColorFilter((ColorFilter) null);
                        nd0Var2.c();
                        break;
                    default:
                        nd0 nd0Var3 = this.b;
                        nd0Var3.z0 = 2;
                        nd0Var3.A0.setColorFilter((ColorFilter) null);
                        nd0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var3.C0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var3.c();
                        break;
                }
            }
        });
        if (b51Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, b8.mf.o(56, 48));
        final int i17 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.id0
            public final /* synthetic */ nd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        nd0 nd0Var = this.b;
                        nd0Var.z0 = 0;
                        org.telegram.ui.ActionBar.r6.t(nd0Var.A0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var.B0.setColorFilter((ColorFilter) null);
                        nd0Var.C0.setColorFilter((ColorFilter) null);
                        nd0Var.c();
                        break;
                    case 1:
                        nd0 nd0Var2 = this.b;
                        nd0Var2.z0 = 1;
                        nd0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var2.B0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var2.C0.setColorFilter((ColorFilter) null);
                        nd0Var2.c();
                        break;
                    default:
                        nd0 nd0Var3 = this.b;
                        nd0Var3.z0 = 2;
                        nd0Var3.A0.setColorFilter((ColorFilter) null);
                        nd0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(nd0Var3.C0, org.telegram.ui.ActionBar.k6.ng, e6Var, PorterDuff.Mode.MULTIPLY);
                        nd0Var3.c();
                        break;
                }
            }
        });
        bh bhVar = new bh(context, 1);
        this.n0 = bhVar;
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(1);
        bhVar.setLayoutManager(b0Var);
        bhVar.setClipToPadding(false);
        bhVar.setOverScrollMode(2);
        bhVar.setAdapter(new org.telegram.ui.n4(4, this, context));
        frameLayout.addView(bhVar, b8.mf.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.u0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, b8.mf.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, b8.mf.e(-2, -2, 1));
        int i18 = 0;
        while (i18 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i18));
            this.v0[i18] = new RadioButton(context);
            this.v0[i18].setSize(org.telegram.messenger.g0.L(20.0f));
            frameLayout4.addView(this.v0[i18], b8.mf.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i18 == 0) {
                String M0 = org.telegram.messenger.bd.M0(2131751693, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.v0[i18].b(-1, -1);
            } else if (i18 == 1) {
                String M02 = org.telegram.messenger.bd.M0(2131751690, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.v0[i18].b(-1684147, -1684147);
            } else if (i18 == 2) {
                String M03 = org.telegram.messenger.bd.M0(2131751691, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.v0[i18].b(-10831009, -10831009);
            } else if (i18 == 3) {
                String M04 = org.telegram.messenger.bd.M0(2131751692, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.v0[i18].b(-12734994, -12734994);
            }
            frameLayout4.addView(textView3, b8.mf.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, b8.mf.k(i18 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jd0
                public final /* synthetic */ nd0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nd0 nd0Var = this.b;
                            nd0Var.getClass();
                            int intValue = ((Integer) view.getTag()).intValue();
                            nd0Var.a0.a = intValue;
                            int i19 = 0;
                            while (i19 < 4) {
                                nd0Var.v0[i19].a(i19 == intValue, true);
                                i19++;
                            }
                            nd0Var.q0.invalidate();
                            break;
                        case 1:
                            nd0 nd0Var2 = this.b;
                            nd0Var2.U = 0;
                            nd0Var2.e();
                            nd0Var2.p0.setVisibility(4);
                            py pyVar = nd0Var2.m0;
                            if (pyVar != null) {
                                pyVar.c(false, false, false);
                                break;
                            }
                            break;
                        case 2:
                            nd0 nd0Var3 = this.b;
                            nd0Var3.U = 1;
                            nd0Var3.e();
                            ed0 ed0Var2 = nd0Var3.p0;
                            ed0Var2.setVisibility(0);
                            ed0Var2.setType(1);
                            py pyVar2 = nd0Var3.m0;
                            if (pyVar2 != null) {
                                pyVar2.c(false, false, false);
                                break;
                            }
                            break;
                        default:
                            nd0 nd0Var4 = this.b;
                            nd0Var4.U = 2;
                            nd0Var4.e();
                            ed0 ed0Var3 = nd0Var4.p0;
                            ed0Var3.setVisibility(0);
                            ed0Var3.setType(0);
                            py pyVar3 = nd0Var4.m0;
                            if (pyVar3 != null) {
                                pyVar3.c(false, false, false);
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
        this.g0.addView(frameLayout5, b8.mf.d(org.telegram.messenger.hs.D4, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.r0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        final int i19 = 1;
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.bd.M0(2131753673, null));
        frameLayout5.addView(textView4, b8.mf.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jd0
            public final /* synthetic */ nd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        nd0 nd0Var = this.b;
                        nd0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nd0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            nd0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        nd0Var.q0.invalidate();
                        break;
                    case 1:
                        nd0 nd0Var2 = this.b;
                        nd0Var2.U = 0;
                        nd0Var2.e();
                        nd0Var2.p0.setVisibility(4);
                        py pyVar = nd0Var2.m0;
                        if (pyVar != null) {
                            pyVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        nd0 nd0Var3 = this.b;
                        nd0Var3.U = 1;
                        nd0Var3.e();
                        ed0 ed0Var2 = nd0Var3.p0;
                        ed0Var2.setVisibility(0);
                        ed0Var2.setType(1);
                        py pyVar2 = nd0Var3.m0;
                        if (pyVar2 != null) {
                            pyVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nd0 nd0Var4 = this.b;
                        nd0Var4.U = 2;
                        nd0Var4.e();
                        ed0 ed0Var3 = nd0Var4.p0;
                        ed0Var3.setVisibility(0);
                        ed0Var3.setType(0);
                        py pyVar3 = nd0Var4.m0;
                        if (pyVar3 != null) {
                            pyVar3.c(false, false, false);
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
        textView5.setText(org.telegram.messenger.bd.M0(2131753672, null));
        frameLayout5.addView(textView5, b8.mf.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i20 = 2;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jd0
            public final /* synthetic */ nd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        nd0 nd0Var = this.b;
                        nd0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nd0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            nd0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        nd0Var.q0.invalidate();
                        break;
                    case 1:
                        nd0 nd0Var2 = this.b;
                        nd0Var2.U = 0;
                        nd0Var2.e();
                        nd0Var2.p0.setVisibility(4);
                        py pyVar = nd0Var2.m0;
                        if (pyVar != null) {
                            pyVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        nd0 nd0Var3 = this.b;
                        nd0Var3.U = 1;
                        nd0Var3.e();
                        ed0 ed0Var2 = nd0Var3.p0;
                        ed0Var2.setVisibility(0);
                        ed0Var2.setType(1);
                        py pyVar2 = nd0Var3.m0;
                        if (pyVar2 != null) {
                            pyVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nd0 nd0Var4 = this.b;
                        nd0Var4.U = 2;
                        nd0Var4.e();
                        ed0 ed0Var3 = nd0Var4.p0;
                        ed0Var3.setVisibility(0);
                        ed0Var3.setType(0);
                        py pyVar3 = nd0Var4.m0;
                        if (pyVar3 != null) {
                            pyVar3.c(false, false, false);
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
        textView6.setText(org.telegram.messenger.bd.M0(2131753674, null));
        frameLayout5.addView(textView6, b8.mf.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i21 = 3;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jd0
            public final /* synthetic */ nd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        nd0 nd0Var = this.b;
                        nd0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nd0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            nd0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        nd0Var.q0.invalidate();
                        break;
                    case 1:
                        nd0 nd0Var2 = this.b;
                        nd0Var2.U = 0;
                        nd0Var2.e();
                        nd0Var2.p0.setVisibility(4);
                        py pyVar = nd0Var2.m0;
                        if (pyVar != null) {
                            pyVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        nd0 nd0Var3 = this.b;
                        nd0Var3.U = 1;
                        nd0Var3.e();
                        ed0 ed0Var2 = nd0Var3.p0;
                        ed0Var2.setVisibility(0);
                        ed0Var2.setType(1);
                        py pyVar2 = nd0Var3.m0;
                        if (pyVar2 != null) {
                            pyVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nd0 nd0Var4 = this.b;
                        nd0Var4.U = 2;
                        nd0Var4.e();
                        ed0 ed0Var3 = nd0Var4.p0;
                        ed0Var3.setVisibility(0);
                        ed0Var3.setType(0);
                        py pyVar3 = nd0Var4.m0;
                        if (pyVar3 != null) {
                            pyVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        e();
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
        py pyVar = this.m0;
        if (pyVar != null) {
            pyVar.c(false, false, false);
        }
    }

    public final boolean a() {
        org.telegram.messenger.ze zeVar = this.f0;
        g2.d dVar = this.a0;
        return zeVar != null ? (this.H == zeVar.a && this.J == zeVar.d && this.Q == zeVar.j && this.I == zeVar.c && this.K == zeVar.e && this.L == zeVar.f && this.S == zeVar.l && this.R == zeVar.k && this.T == zeVar.m && this.V == zeVar.o && this.M == zeVar.g && this.N == zeVar.b && this.P == zeVar.i && this.O == zeVar.h && dVar.F()) ? false : true : (this.H == 0.0f && this.J == 0.0f && this.Q == 0.0f && this.I == 0.0f && this.K == 0.0f && this.L == 0.0f && this.S == 0.0f && this.R == 0.0f && this.T == 0.0f && this.V == 0.0f && this.M == 0.0f && this.N == 0.0f && this.P == 0 && this.O == 0 && dVar.F()) ? false : true;
    }

    public final void b() {
        boolean z10 = this.k0;
        TextureView textureView = this.j0;
        if (z10) {
            py pyVar = this.m0;
            if (pyVar != null) {
                pyVar.postRunnable(new my(pyVar, 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof b51) {
            b51 b51Var = (b51) textureView;
            org.telegram.messenger.ze zeVar = this.f0;
            if (zeVar == null) {
                b51Var.setDelegate(null);
                return;
            }
            py pyVar2 = this.m0;
            if (pyVar2 != null) {
                pyVar2.e(new nh(zeVar, 1));
            }
        }
    }

    public final void c() {
        int i3 = this.z0;
        bh bhVar = this.n0;
        gd0 gd0Var = this.q0;
        FrameLayout frameLayout = this.u0;
        FrameLayout frameLayout2 = this.o0;
        ed0 ed0Var = this.p0;
        if (i3 == 0) {
            ed0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            gd0Var.setVisibility(4);
            bhVar.setVisibility(0);
            return;
        }
        if (i3 == 1) {
            bhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            gd0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                ed0Var.setVisibility(0);
            }
            e();
            return;
        }
        if (i3 == 2) {
            bhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            ed0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            gd0Var.setVisibility(0);
            this.a0.a = 0;
            int i10 = 0;
            while (i10 < 4) {
                this.v0[i10].a(i10 == 0, false);
                i10++;
            }
        }
    }

    public final void d() {
        this.W = Math.abs(this.H) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && this.O == 0 && this.P == 0 && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && Math.abs(this.T) < 0.1f && this.U == 0 && Math.abs(this.V) < 0.1f && this.a0.F();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j10);
        nb0 nb0Var = this.w0;
        if (nb0Var != null && view == (textureView = this.j0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.E0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.F0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.H0;
                int i3 = this.I0;
                if (i3 != 0) {
                    Matrix matrix = this.G0;
                    matrix.reset();
                    matrix.postRotate(i3, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / nb0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            nb0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        int i3 = this.U;
        TextView textView = this.t0;
        TextView textView2 = this.s0;
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        TextView textView3 = this.r0;
        if (i3 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i10 = org.telegram.ui.ActionBar.k6.ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i3 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i11 = org.telegram.ui.ActionBar.k6.ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate2, i11, e6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i3 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i12 = org.telegram.ui.ActionBar.k6.ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate3, i12, e6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
        }
        d();
    }

    public Bitmap getBitmap() {
        py pyVar = this.m0;
        if (pyVar == null || !pyVar.f || !pyVar.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (pyVar.postRunnable(new e7(pyVar, bitmapArr, countDownLatch, 9))) {
                countDownLatch.await();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        return bitmapArr[0];
    }

    @Override // org.telegram.ui.Components.ry
    public float getBlurAngle() {
        return this.e0;
    }

    public ed0 getBlurControl() {
        return this.p0;
    }

    @Override // org.telegram.ui.Components.ry
    public float getBlurExcludeBlurSize() {
        return this.d0;
    }

    @Override // org.telegram.ui.Components.ry
    public PointF getBlurExcludePoint() {
        return this.c0;
    }

    @Override // org.telegram.ui.Components.ry
    public float getBlurExcludeSize() {
        return this.b0;
    }

    @Override // org.telegram.ui.Components.ry
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.i0;
    }

    @Override // org.telegram.ui.Components.ry
    public float getContrastValue() {
        return a1.g.A(this.J, 100.0f, 0.3f, 1.0f);
    }

    public gd0 getCurveControl() {
        return this.q0;
    }

    public TextView getDoneTextView() {
        return this.h0;
    }

    @Override // org.telegram.ui.Components.ry
    public float getEnhanceValue() {
        return this.H / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getExposureValue() {
        return this.I / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getFadeValue() {
        return this.M / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getGrainValue() {
        return (this.T / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.x(this.Q, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.k0 || this.l0) {
            return null;
        }
        return this.j0;
    }

    @Override // org.telegram.ui.Components.ry
    public float getSaturationValue() {
        float f10 = this.L / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public org.telegram.messenger.ze getSavedFilterState() {
        org.telegram.messenger.ze zeVar = new org.telegram.messenger.ze();
        zeVar.a = this.H;
        zeVar.c = this.I;
        zeVar.d = this.J;
        zeVar.e = this.K;
        zeVar.f = this.L;
        zeVar.g = this.M;
        zeVar.b = this.N;
        zeVar.h = this.O;
        zeVar.i = this.P;
        zeVar.j = this.Q;
        zeVar.k = this.R;
        zeVar.l = this.S;
        zeVar.m = this.T;
        zeVar.n = this.U;
        zeVar.o = this.V;
        zeVar.p = this.a0;
        zeVar.q = this.b0;
        zeVar.r = this.c0;
        zeVar.s = this.d0;
        zeVar.t = this.e0;
        this.f0 = zeVar;
        return zeVar;
    }

    @Override // org.telegram.ui.Components.ry
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.x(this.R, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.ry
    public float getSharpenValue() {
        return a1.g.A(this.V, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.ry
    public float getSoftenSkinValue() {
        return this.N / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public int getTintHighlightsColor() {
        return this.P;
    }

    @Override // org.telegram.ui.Components.ry
    public float getTintHighlightsIntensityValue() {
        return this.P == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.ry
    public int getTintShadowsColor() {
        return this.O;
    }

    @Override // org.telegram.ui.Components.ry
    public float getTintShadowsIntensityValue() {
        return this.O == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.g0;
    }

    public Bitmap getUiBlurBitmap() {
        ca caVar;
        py pyVar = this.m0;
        if (pyVar == null || (caVar = pyVar.J) == null) {
            return null;
        }
        synchronized (caVar.n) {
            try {
                if (caVar.q) {
                    return caVar.p;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.ry
    public float getVignetteValue() {
        return this.S / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public float getWarmthValue() {
        return this.K / 100.0f;
    }

    @Override // org.telegram.ui.Components.ry
    public final ByteBuffer h() {
        g2.d dVar = this.a0;
        dVar.q();
        return (ByteBuffer) dVar.f;
    }

    @Override // gi.ra
    public final boolean j(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.j0;
            if (textureView instanceof b51) {
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                ni0 ni0Var = ((b51) textureView).c;
                float f10 = ni0Var.a;
                if (x10 >= f10 && x10 <= f10 + ni0Var.c) {
                    float f11 = ni0Var.b;
                    if (y9 >= f11 && y9 <= f11 + ni0Var.d) {
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

    @Override // org.telegram.ui.Components.ry
    public final boolean o() {
        return this.a || this.W;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        float width;
        int height;
        float ceil;
        float f10;
        int size = View.MeasureSpec.getSize(i3);
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
            gd0 gd0Var = this.q0;
            ni0 ni0Var = gd0Var.e;
            ni0Var.a = f13;
            ni0Var.b = f14;
            ni0Var.c = f15;
            ni0Var.d = f16;
            ed0 ed0Var = this.p0;
            lt0 lt0Var = ed0Var.d;
            lt0Var.a = f15;
            lt0Var.b = f16;
            ((FrameLayout.LayoutParams) ed0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(38.0f) + i11;
            ((FrameLayout.LayoutParams) gd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(28.0f) + i11;
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
        super.onMeasure(i3, i10);
    }

    public void setEnhanceValue(float f10) {
        this.H = f10 * 100.0f;
        d();
        int i3 = 0;
        while (true) {
            bh bhVar = this.n0;
            if (i3 >= bhVar.getChildCount()) {
                break;
            }
            View childAt = bhVar.getChildAt(i3);
            if ((childAt instanceof org.telegram.ui.Cells.s5) && RecyclerView.R(childAt) == this.b) {
                ((org.telegram.ui.Cells.s5) childAt).a(org.telegram.messenger.bd.M0(2131751127, null), 0, this.H);
                break;
            }
            i3++;
        }
        py pyVar = this.m0;
        if (pyVar != null) {
            pyVar.c(true, false, false);
        }
    }

    @Override // org.telegram.ui.Components.ry
    public final boolean v() {
        return !this.a0.F();
    }
}
