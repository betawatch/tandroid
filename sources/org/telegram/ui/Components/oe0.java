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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oe0 extends FrameLayout implements iz, vh.k8 {
    public final ImageView A0;
    public final ImageView B0;
    public final Bitmap C0;
    public final int D;
    public final Bitmap D0;
    public final int E;
    public final Rect E0;
    public final int F;
    public final Matrix F0;
    public float G;
    public final Paint G0;
    public float H;
    public final int H0;
    public float I;
    public final org.telegram.ui.ActionBar.p6 I0;
    public float J;
    public int J0;
    public float K;
    public int K0;
    public float L;
    public float M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public int T;
    public float U;
    public boolean V;
    public final e2.c W;
    public boolean a;
    public float a0;
    public final int b;
    public PointF b0;
    public final int c;
    public float c0;
    public final int d;
    public float d0;
    public final int e;
    public org.telegram.messenger.ff e0;
    public final int f;
    public final FrameLayout f0;
    public final TextView g0;
    public final int h;
    public final TextView h0;
    public final TextureView i0;
    public final boolean j0;
    public final boolean k0;
    public gz l0;
    public final bh m0;
    public final int n;
    public final FrameLayout n0;
    public final fe0 o0;
    public final he0 p0;
    public final TextView q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final FrameLayout t0;
    public final RadioButton[] u0;
    public final lc0 v0;
    public final int w;
    public final boolean w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public int y0;
    public final ImageView z0;

    public oe0(Context context, k61 k61Var, Bitmap bitmap, Bitmap bitmap2, int i10, org.telegram.messenger.ff ffVar, lc0 lc0Var, int i11, boolean z10, boolean z11, s9 s9Var, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.u0 = new RadioButton[4];
        this.E0 = new Rect();
        this.F0 = new Matrix();
        this.G0 = new Paint(2);
        this.k0 = z11;
        this.I0 = p6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.x0 = z12;
        this.v0 = lc0Var;
        this.w0 = z10;
        this.F = 0;
        if (i11 == 1) {
            this.F = 1;
            this.n = 0;
        } else if (i11 == 0) {
            this.n = -1;
        }
        int i12 = this.F;
        this.b = i12;
        this.c = i12 + 1;
        this.d = i12 + 2;
        this.e = i12 + 3;
        this.f = i12 + 4;
        this.h = i12 + 5;
        this.r = i12 + 6;
        this.s = i12 + 7;
        int i13 = i12 + 9;
        this.F = i13;
        this.w = i12 + 8;
        if (i11 == 2) {
            this.F = i12 + 10;
            this.n = i13;
        }
        if (k61Var == null) {
            int i14 = this.F;
            this.F = i14 + 1;
            this.x = i14;
        } else {
            this.x = -1;
        }
        int i15 = this.F;
        this.y = i15;
        this.D = i15 + 1;
        this.F = i15 + 3;
        this.E = i15 + 2;
        if (ffVar != null) {
            this.G = ffVar.a;
            this.M = ffVar.b;
            this.H = ffVar.c;
            this.I = ffVar.d;
            this.J = ffVar.e;
            this.K = ffVar.f;
            this.L = ffVar.g;
            this.N = ffVar.h;
            this.O = ffVar.i;
            this.P = ffVar.j;
            this.Q = ffVar.k;
            this.R = ffVar.l;
            this.S = ffVar.m;
            this.T = ffVar.n;
            this.U = ffVar.o;
            this.W = ffVar.p;
            this.a0 = ffVar.q;
            this.b0 = ffVar.r;
            this.c0 = ffVar.s;
            this.V = ffVar.a();
            this.d0 = ffVar.t;
            this.e0 = ffVar;
        } else {
            this.W = new e2.c();
            this.a0 = 0.35f;
            this.b0 = new PointF(0.5f, 0.5f);
            this.c0 = 0.15f;
            this.d0 = 1.5707964f;
            this.V = true;
        }
        this.C0 = bitmap;
        this.D0 = bitmap2;
        this.H0 = i10;
        if (k61Var != null) {
            this.i0 = k61Var;
            k61Var.setDelegate(new ie0(this));
        } else {
            this.j0 = true;
            nh.f fVar = new nh.f(this, context, 2);
            this.i0 = fVar;
            if (z11) {
                addView(fVar, w7.b6.e(-1, -1, 51));
            }
            fVar.setVisibility(4);
            fVar.setSurfaceTextureListener(new le0(this, z11, s9Var));
        }
        fe0 fe0Var = new fe0(context);
        fe0Var.a = new PointF();
        fe0Var.d = new pu0();
        fe0Var.e = new PointF(0.5f, 0.5f);
        fe0Var.f = 0.15f;
        fe0Var.h = 0.35f;
        fe0Var.r = new RectF();
        fe0Var.y = 1.0f;
        fe0Var.F = true;
        Paint paint = new Paint(1);
        fe0Var.I = paint;
        Paint paint2 = new Paint(1);
        fe0Var.J = paint2;
        fe0Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        fe0Var.K = z12;
        this.o0 = fe0Var;
        fe0Var.setVisibility(4);
        if (z11) {
            addView(fe0Var, w7.b6.e(-1, -1, 51));
        }
        fe0Var.setDelegate(new ie0(this));
        e2.c cVar = this.W;
        he0 he0Var = new he0(context);
        he0Var.a = 0;
        he0Var.c = true;
        he0Var.e = new oj0();
        Paint paint3 = new Paint(1);
        he0Var.f = paint3;
        Paint paint4 = new Paint(1);
        he0Var.h = paint4;
        Paint paint5 = new Paint(1);
        he0Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        he0Var.r = textPaint;
        he0Var.s = new Path();
        he0Var.setWillNotDraw(false);
        he0Var.x = cVar;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        this.p0 = he0Var;
        he0Var.setDelegate(new ie0(this));
        he0Var.setVisibility(4);
        if (z11) {
            addView(he0Var, w7.b6.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f0 = frameLayout;
        addView(frameLayout, w7.b6.e(-1, (!z11 ? 40 : 0) + org.telegram.messenger.zs.Q2, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, w7.b6.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.h0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.cd.L0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout2.addView(textView, w7.b6.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.g0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i16 = org.telegram.ui.ActionBar.t6.ng;
        org.telegram.ui.ActionBar.a7.V(textView2, i16, p6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.cd.L0(2131751355, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.i0.o());
        frameLayout2.addView(textView2, w7.b6.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, w7.b6.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.z0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        org.telegram.ui.ActionBar.a7.t(imageView, i16, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, w7.b6.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.je0
            public final /* synthetic */ oe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        oe0 oe0Var = this.b;
                        oe0Var.y0 = 0;
                        org.telegram.ui.ActionBar.a7.t(oe0Var.z0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var.A0.setColorFilter((ColorFilter) null);
                        oe0Var.B0.setColorFilter((ColorFilter) null);
                        oe0Var.d();
                        break;
                    case 1:
                        oe0 oe0Var2 = this.b;
                        oe0Var2.y0 = 1;
                        oe0Var2.z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var2.A0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var2.B0.setColorFilter((ColorFilter) null);
                        oe0Var2.d();
                        break;
                    default:
                        oe0 oe0Var3 = this.b;
                        oe0Var3.y0 = 2;
                        oe0Var3.z0.setColorFilter((ColorFilter) null);
                        oe0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var3.B0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var3.d();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.A0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        final int i17 = 1;
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, w7.b6.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.je0
            public final /* synthetic */ oe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        oe0 oe0Var = this.b;
                        oe0Var.y0 = 0;
                        org.telegram.ui.ActionBar.a7.t(oe0Var.z0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var.A0.setColorFilter((ColorFilter) null);
                        oe0Var.B0.setColorFilter((ColorFilter) null);
                        oe0Var.d();
                        break;
                    case 1:
                        oe0 oe0Var2 = this.b;
                        oe0Var2.y0 = 1;
                        oe0Var2.z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var2.A0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var2.B0.setColorFilter((ColorFilter) null);
                        oe0Var2.d();
                        break;
                    default:
                        oe0 oe0Var3 = this.b;
                        oe0Var3.y0 = 2;
                        oe0Var3.z0.setColorFilter((ColorFilter) null);
                        oe0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var3.B0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var3.d();
                        break;
                }
            }
        });
        if (k61Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, w7.b6.o(56, 48));
        final int i18 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.je0
            public final /* synthetic */ oe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        oe0 oe0Var = this.b;
                        oe0Var.y0 = 0;
                        org.telegram.ui.ActionBar.a7.t(oe0Var.z0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var.A0.setColorFilter((ColorFilter) null);
                        oe0Var.B0.setColorFilter((ColorFilter) null);
                        oe0Var.d();
                        break;
                    case 1:
                        oe0 oe0Var2 = this.b;
                        oe0Var2.y0 = 1;
                        oe0Var2.z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var2.A0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var2.B0.setColorFilter((ColorFilter) null);
                        oe0Var2.d();
                        break;
                    default:
                        oe0 oe0Var3 = this.b;
                        oe0Var3.y0 = 2;
                        oe0Var3.z0.setColorFilter((ColorFilter) null);
                        oe0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.a7.t(oe0Var3.B0, org.telegram.ui.ActionBar.t6.ng, p6Var, PorterDuff.Mode.MULTIPLY);
                        oe0Var3.d();
                        break;
                }
            }
        });
        bh bhVar = new bh(context, 1);
        this.m0 = bhVar;
        s4.a0 a0Var = new s4.a0();
        a0Var.j1(1);
        bhVar.setLayoutManager(a0Var);
        bhVar.setClipToPadding(false);
        bhVar.setOverScrollMode(2);
        bhVar.setAdapter(new fg.j(5, this, context));
        frameLayout.addView(bhVar, w7.b6.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.t0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, w7.b6.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, w7.b6.e(-2, -2, 1));
        int i19 = 0;
        while (i19 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i19));
            this.u0[i19] = new RadioButton(context);
            this.u0[i19].setSize(org.telegram.messenger.i0.L(20.0f));
            frameLayout4.addView(this.u0[i19], w7.b6.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i19 == 0) {
                String L0 = org.telegram.messenger.cd.L0(2131751693, null);
                textView3.setText(L0.substring(0, 1).toUpperCase() + L0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.u0[i19].b(-1, -1);
            } else if (i19 == 1) {
                String L02 = org.telegram.messenger.cd.L0(2131751690, null);
                textView3.setText(L02.substring(0, 1).toUpperCase() + L02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.u0[i19].b(-1684147, -1684147);
            } else if (i19 == 2) {
                String L03 = org.telegram.messenger.cd.L0(2131751691, null);
                textView3.setText(L03.substring(0, 1).toUpperCase() + L03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.u0[i19].b(-10831009, -10831009);
            } else if (i19 == 3) {
                String L04 = org.telegram.messenger.cd.L0(2131751692, null);
                textView3.setText(L04.substring(0, 1).toUpperCase() + L04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.u0[i19].b(-12734994, -12734994);
            }
            frameLayout4.addView(textView3, w7.b6.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, w7.b6.k(i19 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ke0
                public final /* synthetic */ oe0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            oe0 oe0Var = this.b;
                            oe0Var.getClass();
                            int intValue = ((Integer) view.getTag()).intValue();
                            oe0Var.W.a = intValue;
                            int i20 = 0;
                            while (i20 < 4) {
                                oe0Var.u0[i20].a(i20 == intValue, true);
                                i20++;
                            }
                            oe0Var.p0.invalidate();
                            break;
                        case 1:
                            oe0 oe0Var2 = this.b;
                            oe0Var2.T = 0;
                            oe0Var2.g();
                            oe0Var2.o0.setVisibility(4);
                            gz gzVar = oe0Var2.l0;
                            if (gzVar != null) {
                                gzVar.c(false, false, false);
                                break;
                            }
                            break;
                        case 2:
                            oe0 oe0Var3 = this.b;
                            oe0Var3.T = 1;
                            oe0Var3.g();
                            fe0 fe0Var2 = oe0Var3.o0;
                            fe0Var2.setVisibility(0);
                            fe0Var2.setType(1);
                            gz gzVar2 = oe0Var3.l0;
                            if (gzVar2 != null) {
                                gzVar2.c(false, false, false);
                                break;
                            }
                            break;
                        default:
                            oe0 oe0Var4 = this.b;
                            oe0Var4.T = 2;
                            oe0Var4.g();
                            fe0 fe0Var3 = oe0Var4.o0;
                            fe0Var3.setVisibility(0);
                            fe0Var3.setType(0);
                            gz gzVar3 = oe0Var4.l0;
                            if (gzVar3 != null) {
                                gzVar3.c(false, false, false);
                                break;
                            }
                            break;
                    }
                }
            });
            i19++;
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.n0 = frameLayout5;
        frameLayout5.setVisibility(4);
        this.f0.addView(frameLayout5, w7.b6.d(org.telegram.messenger.zs.D4, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.q0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        final int i20 = 1;
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.cd.L0(2131753673, null));
        frameLayout5.addView(textView4, w7.b6.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ke0
            public final /* synthetic */ oe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        oe0 oe0Var = this.b;
                        oe0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        oe0Var.W.a = intValue;
                        int i202 = 0;
                        while (i202 < 4) {
                            oe0Var.u0[i202].a(i202 == intValue, true);
                            i202++;
                        }
                        oe0Var.p0.invalidate();
                        break;
                    case 1:
                        oe0 oe0Var2 = this.b;
                        oe0Var2.T = 0;
                        oe0Var2.g();
                        oe0Var2.o0.setVisibility(4);
                        gz gzVar = oe0Var2.l0;
                        if (gzVar != null) {
                            gzVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        oe0 oe0Var3 = this.b;
                        oe0Var3.T = 1;
                        oe0Var3.g();
                        fe0 fe0Var2 = oe0Var3.o0;
                        fe0Var2.setVisibility(0);
                        fe0Var2.setType(1);
                        gz gzVar2 = oe0Var3.l0;
                        if (gzVar2 != null) {
                            gzVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        oe0 oe0Var4 = this.b;
                        oe0Var4.T = 2;
                        oe0Var4.g();
                        fe0 fe0Var3 = oe0Var4.o0;
                        fe0Var3.setVisibility(0);
                        fe0Var3.setType(0);
                        gz gzVar3 = oe0Var4.l0;
                        if (gzVar3 != null) {
                            gzVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.r0 = textView5;
        textView5.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(org.telegram.messenger.cd.L0(2131753672, null));
        frameLayout5.addView(textView5, w7.b6.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i21 = 2;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ke0
            public final /* synthetic */ oe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        oe0 oe0Var = this.b;
                        oe0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        oe0Var.W.a = intValue;
                        int i202 = 0;
                        while (i202 < 4) {
                            oe0Var.u0[i202].a(i202 == intValue, true);
                            i202++;
                        }
                        oe0Var.p0.invalidate();
                        break;
                    case 1:
                        oe0 oe0Var2 = this.b;
                        oe0Var2.T = 0;
                        oe0Var2.g();
                        oe0Var2.o0.setVisibility(4);
                        gz gzVar = oe0Var2.l0;
                        if (gzVar != null) {
                            gzVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        oe0 oe0Var3 = this.b;
                        oe0Var3.T = 1;
                        oe0Var3.g();
                        fe0 fe0Var2 = oe0Var3.o0;
                        fe0Var2.setVisibility(0);
                        fe0Var2.setType(1);
                        gz gzVar2 = oe0Var3.l0;
                        if (gzVar2 != null) {
                            gzVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        oe0 oe0Var4 = this.b;
                        oe0Var4.T = 2;
                        oe0Var4.g();
                        fe0 fe0Var3 = oe0Var4.o0;
                        fe0Var3.setVisibility(0);
                        fe0Var3.setType(0);
                        gz gzVar3 = oe0Var4.l0;
                        if (gzVar3 != null) {
                            gzVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.s0 = textView6;
        textView6.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(org.telegram.messenger.cd.L0(2131753674, null));
        frameLayout5.addView(textView6, w7.b6.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i22 = 3;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ke0
            public final /* synthetic */ oe0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        oe0 oe0Var = this.b;
                        oe0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        oe0Var.W.a = intValue;
                        int i202 = 0;
                        while (i202 < 4) {
                            oe0Var.u0[i202].a(i202 == intValue, true);
                            i202++;
                        }
                        oe0Var.p0.invalidate();
                        break;
                    case 1:
                        oe0 oe0Var2 = this.b;
                        oe0Var2.T = 0;
                        oe0Var2.g();
                        oe0Var2.o0.setVisibility(4);
                        gz gzVar = oe0Var2.l0;
                        if (gzVar != null) {
                            gzVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        oe0 oe0Var3 = this.b;
                        oe0Var3.T = 1;
                        oe0Var3.g();
                        fe0 fe0Var2 = oe0Var3.o0;
                        fe0Var2.setVisibility(0);
                        fe0Var2.setType(1);
                        gz gzVar2 = oe0Var3.l0;
                        if (gzVar2 != null) {
                            gzVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        oe0 oe0Var4 = this.b;
                        oe0Var4.T = 2;
                        oe0Var4.g();
                        fe0 fe0Var3 = oe0Var4.o0;
                        fe0Var3.setVisibility(0);
                        fe0Var3.setType(0);
                        gz gzVar3 = oe0Var4.l0;
                        if (gzVar3 != null) {
                            gzVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        g();
        if (this.x0 || !z11) {
            return;
        }
        if (this.j0) {
            ((FrameLayout.LayoutParams) this.i0.getLayoutParams()).topMargin = org.telegram.messenger.i0.m;
        }
        ((FrameLayout.LayoutParams) this.p0.getLayoutParams()).topMargin = org.telegram.messenger.i0.m;
    }

    private void setShowOriginal(boolean z10) {
        if (this.a == z10) {
            return;
        }
        this.a = z10;
        gz gzVar = this.l0;
        if (gzVar != null) {
            gzVar.c(false, false, false);
        }
    }

    public final boolean a() {
        org.telegram.messenger.ff ffVar = this.e0;
        e2.c cVar = this.W;
        return ffVar != null ? (this.G == ffVar.a && this.I == ffVar.d && this.P == ffVar.j && this.H == ffVar.c && this.J == ffVar.e && this.K == ffVar.f && this.R == ffVar.l && this.Q == ffVar.k && this.S == ffVar.m && this.U == ffVar.o && this.L == ffVar.g && this.M == ffVar.b && this.O == ffVar.i && this.N == ffVar.h && cVar.s()) ? false : true : (this.G == 0.0f && this.I == 0.0f && this.P == 0.0f && this.H == 0.0f && this.J == 0.0f && this.K == 0.0f && this.R == 0.0f && this.Q == 0.0f && this.S == 0.0f && this.U == 0.0f && this.L == 0.0f && this.M == 0.0f && this.O == 0 && this.N == 0 && cVar.s()) ? false : true;
    }

    @Override // org.telegram.ui.Components.iz
    public final ByteBuffer b() {
        e2.c cVar = this.W;
        cVar.d();
        return (ByteBuffer) cVar.f;
    }

    public final void c() {
        boolean z10 = this.j0;
        TextureView textureView = this.i0;
        if (z10) {
            gz gzVar = this.l0;
            if (gzVar != null) {
                gzVar.postRunnable(new dz(gzVar, 0));
                this.l0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof k61) {
            k61 k61Var = (k61) textureView;
            org.telegram.messenger.ff ffVar = this.e0;
            if (ffVar == null) {
                k61Var.setDelegate(null);
                return;
            }
            gz gzVar2 = this.l0;
            if (gzVar2 != null) {
                gzVar2.d(new n2.u(ffVar, 10));
            }
        }
    }

    public final void d() {
        int i10 = this.y0;
        bh bhVar = this.m0;
        he0 he0Var = this.p0;
        FrameLayout frameLayout = this.t0;
        FrameLayout frameLayout2 = this.n0;
        fe0 fe0Var = this.o0;
        if (i10 == 0) {
            fe0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            he0Var.setVisibility(4);
            bhVar.setVisibility(0);
            return;
        }
        if (i10 == 1) {
            bhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            he0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.T != 0) {
                fe0Var.setVisibility(0);
            }
            g();
            return;
        }
        if (i10 == 2) {
            bhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            fe0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            he0Var.setVisibility(0);
            this.W.a = 0;
            int i11 = 0;
            while (i11 < 4) {
                this.u0[i11].a(i11 == 0, false);
                i11++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j10);
        lc0 lc0Var = this.v0;
        if (lc0Var != null && view == (textureView = this.i0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.D0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.E0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.G0;
                int i10 = this.H0;
                if (i10 != 0) {
                    Matrix matrix = this.F0;
                    matrix.reset();
                    matrix.postRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / lc0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            lc0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.iz
    public final boolean e() {
        return this.a || this.V;
    }

    public final void f() {
        this.V = Math.abs(this.G) < 0.1f && Math.abs(this.M) < 0.1f && Math.abs(this.H) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && this.N == 0 && this.O == 0 && Math.abs(this.P) < 0.1f && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && this.T == 0 && Math.abs(this.U) < 0.1f && this.W.s();
    }

    public final void g() {
        int i10 = this.T;
        TextView textView = this.s0;
        TextView textView2 = this.r0;
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        TextView textView3 = this.q0;
        if (i10 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i11 = org.telegram.ui.ActionBar.t6.ng;
            org.telegram.ui.ActionBar.a7.y(this, mutate, i11, p6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i12 = org.telegram.ui.ActionBar.t6.ng;
            org.telegram.ui.ActionBar.a7.y(this, mutate2, i12, p6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i13 = org.telegram.ui.ActionBar.t6.ng;
            org.telegram.ui.ActionBar.a7.y(this, mutate3, i13, p6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
        }
        f();
    }

    public Bitmap getBitmap() {
        gz gzVar = this.l0;
        if (gzVar == null || !gzVar.f || !gzVar.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (gzVar.postRunnable(new jg(gzVar, bitmapArr, countDownLatch, 5))) {
                countDownLatch.await();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        return bitmapArr[0];
    }

    @Override // org.telegram.ui.Components.iz
    public float getBlurAngle() {
        return this.d0;
    }

    public fe0 getBlurControl() {
        return this.o0;
    }

    @Override // org.telegram.ui.Components.iz
    public float getBlurExcludeBlurSize() {
        return this.c0;
    }

    @Override // org.telegram.ui.Components.iz
    public PointF getBlurExcludePoint() {
        return this.b0;
    }

    @Override // org.telegram.ui.Components.iz
    public float getBlurExcludeSize() {
        return this.a0;
    }

    @Override // org.telegram.ui.Components.iz
    public int getBlurType() {
        return this.T;
    }

    public TextView getCancelTextView() {
        return this.h0;
    }

    @Override // org.telegram.ui.Components.iz
    public float getContrastValue() {
        return a1.g.c(this.I, 100.0f, 0.3f, 1.0f);
    }

    public he0 getCurveControl() {
        return this.p0;
    }

    public TextView getDoneTextView() {
        return this.g0;
    }

    @Override // org.telegram.ui.Components.iz
    public float getEnhanceValue() {
        return this.G / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getExposureValue() {
        return this.H / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getFadeValue() {
        return this.L / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getGrainValue() {
        return (this.S / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getHighlightsValue() {
        return c3.i0.x(this.P, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.j0 || this.k0) {
            return null;
        }
        return this.i0;
    }

    @Override // org.telegram.ui.Components.iz
    public float getSaturationValue() {
        float f7 = this.K / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    public org.telegram.messenger.ff getSavedFilterState() {
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff();
        ffVar.a = this.G;
        ffVar.c = this.H;
        ffVar.d = this.I;
        ffVar.e = this.J;
        ffVar.f = this.K;
        ffVar.g = this.L;
        ffVar.b = this.M;
        ffVar.h = this.N;
        ffVar.i = this.O;
        ffVar.j = this.P;
        ffVar.k = this.Q;
        ffVar.l = this.R;
        ffVar.m = this.S;
        ffVar.n = this.T;
        ffVar.o = this.U;
        ffVar.p = this.W;
        ffVar.q = this.a0;
        ffVar.r = this.b0;
        ffVar.s = this.c0;
        ffVar.t = this.d0;
        this.e0 = ffVar;
        return ffVar;
    }

    @Override // org.telegram.ui.Components.iz
    public float getShadowsValue() {
        return c3.i0.x(this.Q, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.iz
    public float getSharpenValue() {
        return a1.g.c(this.U, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.iz
    public float getSoftenSkinValue() {
        return this.M / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public int getTintHighlightsColor() {
        return this.O;
    }

    @Override // org.telegram.ui.Components.iz
    public float getTintHighlightsIntensityValue() {
        return this.O == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.iz
    public int getTintShadowsColor() {
        return this.N;
    }

    @Override // org.telegram.ui.Components.iz
    public float getTintShadowsIntensityValue() {
        return this.N == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f0;
    }

    public Bitmap getUiBlurBitmap() {
        x9 x9Var;
        gz gzVar = this.l0;
        if (gzVar == null || (x9Var = gzVar.I) == null) {
            return null;
        }
        synchronized (x9Var.n) {
            try {
                if (x9Var.q) {
                    return x9Var.p;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.iz
    public float getVignetteValue() {
        return this.R / 100.0f;
    }

    @Override // org.telegram.ui.Components.iz
    public float getWarmthValue() {
        return this.J / 100.0f;
    }

    @Override // vh.k8
    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.i0;
            if (textureView instanceof k61) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                oj0 oj0Var = ((k61) textureView).c;
                float f7 = oj0Var.a;
                if (x10 >= f7 && x10 <= f7 + oj0Var.c) {
                    float f10 = oj0Var.b;
                    if (y3 >= f10 && y3 <= f10 + oj0Var.d) {
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

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float width;
        int height;
        float ceil;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.k0) {
            int L = size - org.telegram.messenger.i0.L(28.0f);
            int L2 = org.telegram.messenger.i0.L(214.0f);
            boolean z10 = this.x0;
            int i12 = size2 - (L2 + (!z10 ? org.telegram.messenger.i0.m : 0));
            TextureView textureView = this.i0;
            Bitmap bitmap = this.C0;
            if (bitmap != null) {
                int i13 = this.H0 % 360;
                if (i13 == 90 || i13 == 270) {
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
            float f10 = L;
            float f11 = i12;
            if (f10 / width > f11 / height) {
                f7 = (int) Math.ceil(width * r11);
                ceil = f11;
            } else {
                ceil = (int) Math.ceil(r6 * r9);
                f7 = f10;
            }
            int ceil2 = (int) Math.ceil(((f10 - f7) / 2.0f) + org.telegram.messenger.i0.L(14.0f));
            int ceil3 = (int) Math.ceil(((f11 - ceil) / 2.0f) + org.telegram.messenger.i0.L(14.0f) + (!z10 ? org.telegram.messenger.i0.m : 0));
            int i14 = (int) f7;
            int i15 = (int) ceil;
            if (this.j0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i14;
                layoutParams.height = i15;
            }
            float f12 = ceil2;
            float f13 = ceil3 - (!z10 ? org.telegram.messenger.i0.m : 0);
            float f14 = i14;
            float f15 = i15;
            he0 he0Var = this.p0;
            oj0 oj0Var = he0Var.e;
            oj0Var.a = f12;
            oj0Var.b = f13;
            oj0Var.c = f14;
            oj0Var.d = f15;
            fe0 fe0Var = this.o0;
            pu0 pu0Var = fe0Var.d;
            pu0Var.a = f14;
            pu0Var.b = f15;
            ((FrameLayout.LayoutParams) fe0Var.getLayoutParams()).height = org.telegram.messenger.i0.L(38.0f) + i12;
            ((FrameLayout.LayoutParams) he0Var.getLayoutParams()).height = org.telegram.messenger.i0.L(28.0f) + i12;
            if (org.telegram.messenger.i0.Q1()) {
                int L3 = org.telegram.messenger.i0.L(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.m0.getLayoutParams();
                if (L3 < L) {
                    layoutParams2.width = L3;
                    layoutParams2.leftMargin = (L - L3) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.iz
    public final boolean p() {
        return !this.W.s();
    }

    public void setEnhanceValue(float f7) {
        this.G = f7 * 100.0f;
        f();
        int i10 = 0;
        while (true) {
            bh bhVar = this.m0;
            if (i10 >= bhVar.getChildCount()) {
                break;
            }
            View childAt = bhVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.x5) && RecyclerView.R(childAt) == this.b) {
                ((org.telegram.ui.Cells.x5) childAt).a(org.telegram.messenger.cd.L0(2131751127, null), 0, this.G);
                break;
            }
            i10++;
        }
        gz gzVar = this.l0;
        if (gzVar != null) {
            gzVar.c(true, false, false);
        }
    }
}
