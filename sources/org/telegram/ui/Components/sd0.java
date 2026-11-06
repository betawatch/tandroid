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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class sd0 extends FrameLayout implements ty, fi.ra {
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
    public final org.telegram.ui.ActionBar.f6 I0;
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
    public final h2.c W;
    public boolean a;
    public float a0;
    public final int b;
    public PointF b0;
    public final int c;
    public float c0;
    public final int d;
    public float d0;
    public final int e;
    public org.telegram.messenger.hf e0;
    public final int f;
    public final FrameLayout f0;
    public final TextView g0;
    public final int h;
    public final TextView h0;
    public final TextureView i0;
    public final boolean j0;
    public final boolean k0;
    public ry l0;
    public final eh m0;
    public final int n;
    public final FrameLayout n0;
    public final jd0 o0;
    public final ld0 p0;
    public final TextView q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final FrameLayout t0;
    public final RadioButton[] u0;
    public final sb0 v0;
    public final int w;
    public final boolean w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public int y0;
    public final ImageView z0;

    public sd0(Context context, h51 h51Var, Bitmap bitmap, Bitmap bitmap2, int i7, org.telegram.messenger.hf hfVar, sb0 sb0Var, int i10, boolean z9, boolean z10, y9 y9Var, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.u0 = new RadioButton[4];
        this.E0 = new Rect();
        this.F0 = new Matrix();
        this.G0 = new Paint(2);
        this.k0 = z10;
        this.I0 = f6Var;
        boolean z11 = context instanceof BubbleActivity;
        this.x0 = z11;
        this.v0 = sb0Var;
        this.w0 = z9;
        this.F = 0;
        if (i10 == 1) {
            this.F = 1;
            this.n = 0;
        } else if (i10 == 0) {
            this.n = -1;
        }
        int i11 = this.F;
        this.b = i11;
        this.c = i11 + 1;
        this.d = i11 + 2;
        this.e = i11 + 3;
        this.f = i11 + 4;
        this.h = i11 + 5;
        this.r = i11 + 6;
        this.s = i11 + 7;
        int i12 = i11 + 9;
        this.F = i12;
        this.w = i11 + 8;
        if (i10 == 2) {
            this.F = i11 + 10;
            this.n = i12;
        }
        if (h51Var == null) {
            int i13 = this.F;
            this.F = i13 + 1;
            this.x = i13;
        } else {
            this.x = -1;
        }
        int i14 = this.F;
        this.y = i14;
        this.D = i14 + 1;
        this.F = i14 + 3;
        this.E = i14 + 2;
        if (hfVar != null) {
            this.G = hfVar.a;
            this.M = hfVar.b;
            this.H = hfVar.c;
            this.I = hfVar.d;
            this.J = hfVar.e;
            this.K = hfVar.f;
            this.L = hfVar.g;
            this.N = hfVar.h;
            this.O = hfVar.i;
            this.P = hfVar.j;
            this.Q = hfVar.k;
            this.R = hfVar.l;
            this.S = hfVar.m;
            this.T = hfVar.n;
            this.U = hfVar.o;
            this.W = hfVar.p;
            this.a0 = hfVar.q;
            this.b0 = hfVar.r;
            this.c0 = hfVar.s;
            this.V = hfVar.a();
            this.d0 = hfVar.t;
            this.e0 = hfVar;
        } else {
            this.W = new h2.c();
            this.a0 = 0.35f;
            this.b0 = new PointF(0.5f, 0.5f);
            this.c0 = 0.15f;
            this.d0 = 1.5707964f;
            this.V = true;
        }
        this.C0 = bitmap;
        this.D0 = bitmap2;
        this.H0 = i7;
        if (h51Var != null) {
            this.i0 = h51Var;
            h51Var.setDelegate(new md0(this));
        } else {
            this.j0 = true;
            k40 k40Var = new k40(1, context, this);
            this.i0 = k40Var;
            if (z10) {
                addView(k40Var, c8.ha.e(-1, -1, 51));
            }
            k40Var.setVisibility(4);
            k40Var.setSurfaceTextureListener(new pd0(this, z10, y9Var));
        }
        jd0 jd0Var = new jd0(context);
        jd0Var.a = new PointF();
        jd0Var.d = new mt0();
        jd0Var.e = new PointF(0.5f, 0.5f);
        jd0Var.f = 0.15f;
        jd0Var.h = 0.35f;
        jd0Var.r = new RectF();
        jd0Var.y = 1.0f;
        jd0Var.F = true;
        Paint paint = new Paint(1);
        jd0Var.I = paint;
        Paint paint2 = new Paint(1);
        jd0Var.J = paint2;
        jd0Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        jd0Var.K = z11;
        this.o0 = jd0Var;
        jd0Var.setVisibility(4);
        if (z10) {
            addView(jd0Var, c8.ha.e(-1, -1, 51));
        }
        jd0Var.setDelegate(new md0(this));
        h2.c cVar = this.W;
        ld0 ld0Var = new ld0(context);
        ld0Var.a = 0;
        ld0Var.c = true;
        ld0Var.e = new ki0();
        Paint paint3 = new Paint(1);
        ld0Var.f = paint3;
        Paint paint4 = new Paint(1);
        ld0Var.h = paint4;
        Paint paint5 = new Paint(1);
        ld0Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        ld0Var.r = textPaint;
        ld0Var.s = new Path();
        ld0Var.setWillNotDraw(false);
        ld0Var.x = cVar;
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
        this.p0 = ld0Var;
        ld0Var.setDelegate(new md0(this));
        ld0Var.setVisibility(4);
        if (z10) {
            addView(ld0Var, c8.ha.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f0 = frameLayout;
        addView(frameLayout, c8.ha.e(-1, (!z10 ? 40 : 0) + org.telegram.messenger.qs.Q2, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, c8.ha.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.h0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.hd.M0(2131752589, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView, c8.ha.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.g0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.k6.ng;
        org.telegram.ui.ActionBar.r6.V(textView2, i15, f6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.hd.M0(2131751355, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView2, c8.ha.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, c8.ha.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.z0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        org.telegram.ui.ActionBar.r6.t(imageView, i15, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, c8.ha.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nd0
            public final /* synthetic */ sd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        sd0 sd0Var = this.b;
                        sd0Var.y0 = 0;
                        org.telegram.ui.ActionBar.r6.t(sd0Var.z0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var.A0.setColorFilter((ColorFilter) null);
                        sd0Var.B0.setColorFilter((ColorFilter) null);
                        sd0Var.c();
                        break;
                    case 1:
                        sd0 sd0Var2 = this.b;
                        sd0Var2.y0 = 1;
                        sd0Var2.z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var2.A0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var2.B0.setColorFilter((ColorFilter) null);
                        sd0Var2.c();
                        break;
                    default:
                        sd0 sd0Var3 = this.b;
                        sd0Var3.y0 = 2;
                        sd0Var3.z0.setColorFilter((ColorFilter) null);
                        sd0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var3.B0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var3.c();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.A0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        final int i16 = 1;
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, c8.ha.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nd0
            public final /* synthetic */ sd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        sd0 sd0Var = this.b;
                        sd0Var.y0 = 0;
                        org.telegram.ui.ActionBar.r6.t(sd0Var.z0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var.A0.setColorFilter((ColorFilter) null);
                        sd0Var.B0.setColorFilter((ColorFilter) null);
                        sd0Var.c();
                        break;
                    case 1:
                        sd0 sd0Var2 = this.b;
                        sd0Var2.y0 = 1;
                        sd0Var2.z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var2.A0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var2.B0.setColorFilter((ColorFilter) null);
                        sd0Var2.c();
                        break;
                    default:
                        sd0 sd0Var3 = this.b;
                        sd0Var3.y0 = 2;
                        sd0Var3.z0.setColorFilter((ColorFilter) null);
                        sd0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var3.B0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var3.c();
                        break;
                }
            }
        });
        if (h51Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, c8.ha.o(56, 48));
        final int i17 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nd0
            public final /* synthetic */ sd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        sd0 sd0Var = this.b;
                        sd0Var.y0 = 0;
                        org.telegram.ui.ActionBar.r6.t(sd0Var.z0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var.A0.setColorFilter((ColorFilter) null);
                        sd0Var.B0.setColorFilter((ColorFilter) null);
                        sd0Var.c();
                        break;
                    case 1:
                        sd0 sd0Var2 = this.b;
                        sd0Var2.y0 = 1;
                        sd0Var2.z0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var2.A0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var2.B0.setColorFilter((ColorFilter) null);
                        sd0Var2.c();
                        break;
                    default:
                        sd0 sd0Var3 = this.b;
                        sd0Var3.y0 = 2;
                        sd0Var3.z0.setColorFilter((ColorFilter) null);
                        sd0Var3.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.r6.t(sd0Var3.B0, org.telegram.ui.ActionBar.k6.ng, f6Var, PorterDuff.Mode.MULTIPLY);
                        sd0Var3.c();
                        break;
                }
            }
        });
        eh ehVar = new eh(context, 1);
        this.m0 = ehVar;
        v4.b0 b0Var = new v4.b0();
        b0Var.j1(1);
        ehVar.setLayoutManager(b0Var);
        ehVar.setClipToPadding(false);
        ehVar.setOverScrollMode(2);
        ehVar.setAdapter(new org.telegram.ui.l4(4, this, context));
        frameLayout.addView(ehVar, c8.ha.e(-1, (!z10 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.t0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, c8.ha.d(-1, 78.0f, 1, 0.0f, (!z10 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, c8.ha.e(-2, -2, 1));
        int i18 = 0;
        while (i18 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i18));
            this.u0[i18] = new RadioButton(context);
            this.u0[i18].setSize(org.telegram.messenger.g0.L(20.0f));
            frameLayout4.addView(this.u0[i18], c8.ha.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i18 == 0) {
                String M0 = org.telegram.messenger.hd.M0(2131751693, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.u0[i18].b(-1, -1);
            } else if (i18 == 1) {
                String M02 = org.telegram.messenger.hd.M0(2131751690, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.u0[i18].b(-1684147, -1684147);
            } else if (i18 == 2) {
                String M03 = org.telegram.messenger.hd.M0(2131751691, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.u0[i18].b(-10831009, -10831009);
            } else if (i18 == 3) {
                String M04 = org.telegram.messenger.hd.M0(2131751692, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.u0[i18].b(-12734994, -12734994);
            }
            frameLayout4.addView(textView3, c8.ha.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, c8.ha.k(i18 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.od0
                public final /* synthetic */ sd0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            sd0 sd0Var = this.b;
                            sd0Var.getClass();
                            int intValue = ((Integer) view.getTag()).intValue();
                            sd0Var.W.a = intValue;
                            int i19 = 0;
                            while (i19 < 4) {
                                sd0Var.u0[i19].a(i19 == intValue, true);
                                i19++;
                            }
                            sd0Var.p0.invalidate();
                            break;
                        case 1:
                            sd0 sd0Var2 = this.b;
                            sd0Var2.T = 0;
                            sd0Var2.e();
                            sd0Var2.o0.setVisibility(4);
                            ry ryVar = sd0Var2.l0;
                            if (ryVar != null) {
                                ryVar.c(false, false, false);
                                break;
                            }
                            break;
                        case 2:
                            sd0 sd0Var3 = this.b;
                            sd0Var3.T = 1;
                            sd0Var3.e();
                            jd0 jd0Var2 = sd0Var3.o0;
                            jd0Var2.setVisibility(0);
                            jd0Var2.setType(1);
                            ry ryVar2 = sd0Var3.l0;
                            if (ryVar2 != null) {
                                ryVar2.c(false, false, false);
                                break;
                            }
                            break;
                        default:
                            sd0 sd0Var4 = this.b;
                            sd0Var4.T = 2;
                            sd0Var4.e();
                            jd0 jd0Var3 = sd0Var4.o0;
                            jd0Var3.setVisibility(0);
                            jd0Var3.setType(0);
                            ry ryVar3 = sd0Var4.l0;
                            if (ryVar3 != null) {
                                ryVar3.c(false, false, false);
                                break;
                            }
                            break;
                    }
                }
            });
            i18++;
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.n0 = frameLayout5;
        frameLayout5.setVisibility(4);
        this.f0.addView(frameLayout5, c8.ha.d(org.telegram.messenger.qs.D4, 60.0f, 1, 0.0f, (z10 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.q0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        final int i19 = 1;
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.hd.M0(2131753673, null));
        frameLayout5.addView(textView4, c8.ha.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.od0
            public final /* synthetic */ sd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        sd0 sd0Var = this.b;
                        sd0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        sd0Var.W.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            sd0Var.u0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        sd0Var.p0.invalidate();
                        break;
                    case 1:
                        sd0 sd0Var2 = this.b;
                        sd0Var2.T = 0;
                        sd0Var2.e();
                        sd0Var2.o0.setVisibility(4);
                        ry ryVar = sd0Var2.l0;
                        if (ryVar != null) {
                            ryVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        sd0 sd0Var3 = this.b;
                        sd0Var3.T = 1;
                        sd0Var3.e();
                        jd0 jd0Var2 = sd0Var3.o0;
                        jd0Var2.setVisibility(0);
                        jd0Var2.setType(1);
                        ry ryVar2 = sd0Var3.l0;
                        if (ryVar2 != null) {
                            ryVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        sd0 sd0Var4 = this.b;
                        sd0Var4.T = 2;
                        sd0Var4.e();
                        jd0 jd0Var3 = sd0Var4.o0;
                        jd0Var3.setVisibility(0);
                        jd0Var3.setType(0);
                        ry ryVar3 = sd0Var4.l0;
                        if (ryVar3 != null) {
                            ryVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.r0 = textView5;
        textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(org.telegram.messenger.hd.M0(2131753672, null));
        frameLayout5.addView(textView5, c8.ha.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i20 = 2;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.od0
            public final /* synthetic */ sd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        sd0 sd0Var = this.b;
                        sd0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        sd0Var.W.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            sd0Var.u0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        sd0Var.p0.invalidate();
                        break;
                    case 1:
                        sd0 sd0Var2 = this.b;
                        sd0Var2.T = 0;
                        sd0Var2.e();
                        sd0Var2.o0.setVisibility(4);
                        ry ryVar = sd0Var2.l0;
                        if (ryVar != null) {
                            ryVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        sd0 sd0Var3 = this.b;
                        sd0Var3.T = 1;
                        sd0Var3.e();
                        jd0 jd0Var2 = sd0Var3.o0;
                        jd0Var2.setVisibility(0);
                        jd0Var2.setType(1);
                        ry ryVar2 = sd0Var3.l0;
                        if (ryVar2 != null) {
                            ryVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        sd0 sd0Var4 = this.b;
                        sd0Var4.T = 2;
                        sd0Var4.e();
                        jd0 jd0Var3 = sd0Var4.o0;
                        jd0Var3.setVisibility(0);
                        jd0Var3.setType(0);
                        ry ryVar3 = sd0Var4.l0;
                        if (ryVar3 != null) {
                            ryVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.s0 = textView6;
        textView6.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(org.telegram.messenger.hd.M0(2131753674, null));
        frameLayout5.addView(textView6, c8.ha.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i21 = 3;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.od0
            public final /* synthetic */ sd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        sd0 sd0Var = this.b;
                        sd0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        sd0Var.W.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            sd0Var.u0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        sd0Var.p0.invalidate();
                        break;
                    case 1:
                        sd0 sd0Var2 = this.b;
                        sd0Var2.T = 0;
                        sd0Var2.e();
                        sd0Var2.o0.setVisibility(4);
                        ry ryVar = sd0Var2.l0;
                        if (ryVar != null) {
                            ryVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        sd0 sd0Var3 = this.b;
                        sd0Var3.T = 1;
                        sd0Var3.e();
                        jd0 jd0Var2 = sd0Var3.o0;
                        jd0Var2.setVisibility(0);
                        jd0Var2.setType(1);
                        ry ryVar2 = sd0Var3.l0;
                        if (ryVar2 != null) {
                            ryVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        sd0 sd0Var4 = this.b;
                        sd0Var4.T = 2;
                        sd0Var4.e();
                        jd0 jd0Var3 = sd0Var4.o0;
                        jd0Var3.setVisibility(0);
                        jd0Var3.setType(0);
                        ry ryVar3 = sd0Var4.l0;
                        if (ryVar3 != null) {
                            ryVar3.c(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        e();
        if (this.x0 || !z10) {
            return;
        }
        if (this.j0) {
            ((FrameLayout.LayoutParams) this.i0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
        }
        ((FrameLayout.LayoutParams) this.p0.getLayoutParams()).topMargin = org.telegram.messenger.g0.m;
    }

    private void setShowOriginal(boolean z9) {
        if (this.a == z9) {
            return;
        }
        this.a = z9;
        ry ryVar = this.l0;
        if (ryVar != null) {
            ryVar.c(false, false, false);
        }
    }

    public final boolean a() {
        org.telegram.messenger.hf hfVar = this.e0;
        h2.c cVar = this.W;
        return hfVar != null ? (this.G == hfVar.a && this.I == hfVar.d && this.P == hfVar.j && this.H == hfVar.c && this.J == hfVar.e && this.K == hfVar.f && this.R == hfVar.l && this.Q == hfVar.k && this.S == hfVar.m && this.U == hfVar.o && this.L == hfVar.g && this.M == hfVar.b && this.O == hfVar.i && this.N == hfVar.h && cVar.F()) ? false : true : (this.G == 0.0f && this.I == 0.0f && this.P == 0.0f && this.H == 0.0f && this.J == 0.0f && this.K == 0.0f && this.R == 0.0f && this.Q == 0.0f && this.S == 0.0f && this.U == 0.0f && this.L == 0.0f && this.M == 0.0f && this.O == 0 && this.N == 0 && cVar.F()) ? false : true;
    }

    public final void b() {
        boolean z9 = this.j0;
        TextureView textureView = this.i0;
        if (z9) {
            ry ryVar = this.l0;
            if (ryVar != null) {
                ryVar.postRunnable(new oy(ryVar, 0));
                this.l0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof h51) {
            h51 h51Var = (h51) textureView;
            org.telegram.messenger.hf hfVar = this.e0;
            if (hfVar == null) {
                h51Var.setDelegate(null);
                return;
            }
            ry ryVar2 = this.l0;
            if (ryVar2 != null) {
                ryVar2.d(new n(hfVar));
            }
        }
    }

    public final void c() {
        int i7 = this.y0;
        eh ehVar = this.m0;
        ld0 ld0Var = this.p0;
        FrameLayout frameLayout = this.t0;
        FrameLayout frameLayout2 = this.n0;
        jd0 jd0Var = this.o0;
        if (i7 == 0) {
            jd0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            ld0Var.setVisibility(4);
            ehVar.setVisibility(0);
            return;
        }
        if (i7 == 1) {
            ehVar.setVisibility(4);
            frameLayout.setVisibility(4);
            ld0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.T != 0) {
                jd0Var.setVisibility(0);
            }
            e();
            return;
        }
        if (i7 == 2) {
            ehVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            jd0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            ld0Var.setVisibility(0);
            this.W.a = 0;
            int i10 = 0;
            while (i10 < 4) {
                this.u0[i10].a(i10 == 0, false);
                i10++;
            }
        }
    }

    public final void d() {
        this.V = Math.abs(this.G) < 0.1f && Math.abs(this.M) < 0.1f && Math.abs(this.H) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && this.N == 0 && this.O == 0 && Math.abs(this.P) < 0.1f && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && this.T == 0 && Math.abs(this.U) < 0.1f && this.W.F();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        sb0 sb0Var = this.v0;
        if (sb0Var != null && view == (textureView = this.i0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.D0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.E0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.G0;
                int i7 = this.H0;
                if (i7 != 0) {
                    Matrix matrix = this.F0;
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
            float measuredWidth2 = textureView.getMeasuredWidth() / sb0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            sb0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        int i7 = this.T;
        TextView textView = this.s0;
        TextView textView2 = this.r0;
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        TextView textView3 = this.q0;
        if (i7 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i10 = org.telegram.ui.ActionBar.k6.ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate, i10, f6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i11 = org.telegram.ui.ActionBar.k6.ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate2, i11, f6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i12 = org.telegram.ui.ActionBar.k6.ng;
            org.telegram.ui.ActionBar.r6.y(this, mutate3, i12, f6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
        }
        d();
    }

    public Bitmap getBitmap() {
        ry ryVar = this.l0;
        if (ryVar == null || !ryVar.f || !ryVar.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (ryVar.postRunnable(new ng(ryVar, bitmapArr, countDownLatch, 5))) {
                countDownLatch.await();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        return bitmapArr[0];
    }

    @Override // org.telegram.ui.Components.ty
    public float getBlurAngle() {
        return this.d0;
    }

    public jd0 getBlurControl() {
        return this.o0;
    }

    @Override // org.telegram.ui.Components.ty
    public float getBlurExcludeBlurSize() {
        return this.c0;
    }

    @Override // org.telegram.ui.Components.ty
    public PointF getBlurExcludePoint() {
        return this.b0;
    }

    @Override // org.telegram.ui.Components.ty
    public float getBlurExcludeSize() {
        return this.a0;
    }

    @Override // org.telegram.ui.Components.ty
    public int getBlurType() {
        return this.T;
    }

    public TextView getCancelTextView() {
        return this.h0;
    }

    @Override // org.telegram.ui.Components.ty
    public float getContrastValue() {
        return com.google.android.recaptcha.internal.a.c(this.I, 100.0f, 0.3f, 1.0f);
    }

    public ld0 getCurveControl() {
        return this.p0;
    }

    public TextView getDoneTextView() {
        return this.g0;
    }

    @Override // org.telegram.ui.Components.ty
    public float getEnhanceValue() {
        return this.G / 100.0f;
    }

    @Override // org.telegram.ui.Components.ty
    public float getExposureValue() {
        return this.H / 100.0f;
    }

    @Override // org.telegram.ui.Components.ty
    public float getFadeValue() {
        return this.L / 100.0f;
    }

    @Override // org.telegram.ui.Components.ty
    public float getGrainValue() {
        return (this.S / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.ty
    public float getHighlightsValue() {
        return com.google.android.recaptcha.internal.a.y(this.P, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.j0 || this.k0) {
            return null;
        }
        return this.i0;
    }

    @Override // org.telegram.ui.Components.ty
    public float getSaturationValue() {
        float f10 = this.K / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public org.telegram.messenger.hf getSavedFilterState() {
        org.telegram.messenger.hf hfVar = new org.telegram.messenger.hf();
        hfVar.a = this.G;
        hfVar.c = this.H;
        hfVar.d = this.I;
        hfVar.e = this.J;
        hfVar.f = this.K;
        hfVar.g = this.L;
        hfVar.b = this.M;
        hfVar.h = this.N;
        hfVar.i = this.O;
        hfVar.j = this.P;
        hfVar.k = this.Q;
        hfVar.l = this.R;
        hfVar.m = this.S;
        hfVar.n = this.T;
        hfVar.o = this.U;
        hfVar.p = this.W;
        hfVar.q = this.a0;
        hfVar.r = this.b0;
        hfVar.s = this.c0;
        hfVar.t = this.d0;
        this.e0 = hfVar;
        return hfVar;
    }

    @Override // org.telegram.ui.Components.ty
    public float getShadowsValue() {
        return com.google.android.recaptcha.internal.a.y(this.Q, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.ty
    public float getSharpenValue() {
        return com.google.android.recaptcha.internal.a.c(this.U, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.ty
    public float getSoftenSkinValue() {
        return this.M / 100.0f;
    }

    @Override // org.telegram.ui.Components.ty
    public int getTintHighlightsColor() {
        return this.O;
    }

    @Override // org.telegram.ui.Components.ty
    public float getTintHighlightsIntensityValue() {
        return this.O == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.ty
    public int getTintShadowsColor() {
        return this.N;
    }

    @Override // org.telegram.ui.Components.ty
    public float getTintShadowsIntensityValue() {
        return this.N == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f0;
    }

    public Bitmap getUiBlurBitmap() {
        da daVar;
        ry ryVar = this.l0;
        if (ryVar == null || (daVar = ryVar.I) == null) {
            return null;
        }
        synchronized (daVar.n) {
            try {
                if (daVar.q) {
                    return daVar.p;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.ty
    public float getVignetteValue() {
        return this.R / 100.0f;
    }

    @Override // org.telegram.ui.Components.ty
    public float getWarmthValue() {
        return this.J / 100.0f;
    }

    @Override // org.telegram.ui.Components.ty
    public final ByteBuffer h() {
        h2.c cVar = this.W;
        cVar.q();
        return (ByteBuffer) cVar.f;
    }

    @Override // fi.ra
    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.i0;
            if (textureView instanceof h51) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                ki0 ki0Var = ((h51) textureView).c;
                float f10 = ki0Var.a;
                if (x10 >= f10 && x10 <= f10 + ki0Var.c) {
                    float f11 = ki0Var.b;
                    if (y10 >= f11 && y10 <= f11 + ki0Var.d) {
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

    @Override // org.telegram.ui.Components.ty
    public final boolean n() {
        return this.a || this.V;
    }

    @Override // org.telegram.ui.Components.ty
    public final boolean o() {
        return !this.W.F();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float width;
        int height;
        float ceil;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (this.k0) {
            int L = size - org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(214.0f);
            boolean z9 = this.x0;
            int i11 = size2 - (L2 + (!z9 ? org.telegram.messenger.g0.m : 0));
            TextureView textureView = this.i0;
            Bitmap bitmap = this.C0;
            if (bitmap != null) {
                int i12 = this.H0 % 360;
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
            int ceil3 = (int) Math.ceil(((f12 - ceil) / 2.0f) + org.telegram.messenger.g0.L(14.0f) + (!z9 ? org.telegram.messenger.g0.m : 0));
            int i13 = (int) f10;
            int i14 = (int) ceil;
            if (this.j0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i13;
                layoutParams.height = i14;
            }
            float f13 = ceil2;
            float f14 = ceil3 - (!z9 ? org.telegram.messenger.g0.m : 0);
            float f15 = i13;
            float f16 = i14;
            ld0 ld0Var = this.p0;
            ki0 ki0Var = ld0Var.e;
            ki0Var.a = f13;
            ki0Var.b = f14;
            ki0Var.c = f15;
            ki0Var.d = f16;
            jd0 jd0Var = this.o0;
            mt0 mt0Var = jd0Var.d;
            mt0Var.a = f15;
            mt0Var.b = f16;
            ((FrameLayout.LayoutParams) jd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(38.0f) + i11;
            ((FrameLayout.LayoutParams) ld0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(28.0f) + i11;
            if (org.telegram.messenger.g0.Q1()) {
                int L3 = org.telegram.messenger.g0.L(86.0f) * 10;
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
        super.onMeasure(i7, i10);
    }

    public void setEnhanceValue(float f10) {
        this.G = f10 * 100.0f;
        d();
        int i7 = 0;
        while (true) {
            eh ehVar = this.m0;
            if (i7 >= ehVar.getChildCount()) {
                break;
            }
            View childAt = ehVar.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.s5) && RecyclerView.R(childAt) == this.b) {
                ((org.telegram.ui.Cells.s5) childAt).a(org.telegram.messenger.hd.M0(2131751127, null), 0, this.G);
                break;
            }
            i7++;
        }
        ry ryVar = this.l0;
        if (ryVar != null) {
            ryVar.c(true, false, false);
        }
    }
}
