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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ee0 extends FrameLayout implements gz, hi.oa {
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
    public final org.telegram.ui.ActionBar.h6 J0;
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
    public org.telegram.messenger.ff f0;
    public final FrameLayout g0;
    public final int h;
    public final TextView h0;
    public final TextView i0;
    public final TextureView j0;
    public final boolean k0;
    public final boolean l0;
    public ez m0;
    public final int n;
    public final vh n0;
    public final FrameLayout o0;
    public final vd0 p0;
    public final xd0 q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final TextView t0;
    public final FrameLayout u0;
    public final RadioButton[] v0;
    public final int w;
    public final ec0 w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public final boolean y0;
    public int z0;

    public ee0(Context context, y51 y51Var, Bitmap bitmap, Bitmap bitmap2, int i7, org.telegram.messenger.ff ffVar, ec0 ec0Var, int i10, boolean z10, boolean z11, ca caVar, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.l0 = z11;
        this.J0 = h6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.y0 = z12;
        this.w0 = ec0Var;
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
        if (y51Var == null) {
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
        if (ffVar != null) {
            this.H = ffVar.a;
            this.N = ffVar.b;
            this.I = ffVar.c;
            this.J = ffVar.d;
            this.K = ffVar.e;
            this.L = ffVar.f;
            this.M = ffVar.g;
            this.O = ffVar.h;
            this.P = ffVar.i;
            this.Q = ffVar.j;
            this.R = ffVar.k;
            this.S = ffVar.l;
            this.T = ffVar.m;
            this.U = ffVar.n;
            this.V = ffVar.o;
            this.a0 = ffVar.p;
            this.b0 = ffVar.q;
            this.c0 = ffVar.r;
            this.d0 = ffVar.s;
            this.W = ffVar.a();
            this.e0 = ffVar.t;
            this.f0 = ffVar;
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
        if (y51Var != null) {
            this.j0 = y51Var;
            y51Var.setDelegate(new yd0(this));
        } else {
            this.k0 = true;
            y40 y40Var = new y40(1, context, this);
            this.j0 = y40Var;
            if (z11) {
                addView(y40Var, c8.ma.e(-1, -1, 51));
            }
            y40Var.setVisibility(4);
            y40Var.setSurfaceTextureListener(new be0(this, z11, caVar));
        }
        vd0 vd0Var = new vd0(context);
        vd0Var.a = new PointF();
        vd0Var.d = new yt0();
        vd0Var.e = new PointF(0.5f, 0.5f);
        vd0Var.f = 0.15f;
        vd0Var.h = 0.35f;
        vd0Var.r = new RectF();
        vd0Var.y = 1.0f;
        vd0Var.G = true;
        Paint paint = new Paint(1);
        vd0Var.J = paint;
        Paint paint2 = new Paint(1);
        vd0Var.K = paint2;
        vd0Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        vd0Var.L = z12;
        this.p0 = vd0Var;
        vd0Var.setVisibility(4);
        if (z11) {
            addView(vd0Var, c8.ma.e(-1, -1, 51));
        }
        vd0Var.setDelegate(new yd0(this));
        h2.c cVar = this.a0;
        xd0 xd0Var = new xd0(context);
        xd0Var.a = 0;
        xd0Var.c = true;
        xd0Var.e = new aj0();
        Paint paint3 = new Paint(1);
        xd0Var.f = paint3;
        Paint paint4 = new Paint(1);
        xd0Var.h = paint4;
        Paint paint5 = new Paint(1);
        xd0Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        xd0Var.r = textPaint;
        xd0Var.s = new Path();
        xd0Var.setWillNotDraw(false);
        xd0Var.x = cVar;
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
        this.q0 = xd0Var;
        xd0Var.setDelegate(new yd0(this));
        xd0Var.setVisibility(4);
        if (z11) {
            addView(xd0Var, c8.ma.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        addView(frameLayout, c8.ma.e(-1, (!z11 ? 40 : 0) + org.telegram.messenger.ks.Q2, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, c8.ma.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView.setText(org.telegram.messenger.gd.N0(2131752577, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView, c8.ma.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.m6.qg;
        org.telegram.ui.ActionBar.t6.U(textView2, i15, h6Var);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        textView2.setText(org.telegram.messenger.gd.N0(2131751342, null).toUpperCase());
        textView2.setTypeface(org.telegram.messenger.g0.o());
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, c8.ma.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        org.telegram.ui.ActionBar.t6.s(imageView, i15, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView, c8.ma.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zd0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        ee0 ee0Var = this.b;
                        ee0Var.z0 = 0;
                        org.telegram.ui.ActionBar.t6.s(ee0Var.A0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var.B0.setColorFilter((ColorFilter) null);
                        ee0Var.C0.setColorFilter((ColorFilter) null);
                        ee0Var.c();
                        break;
                    case 1:
                        ee0 ee0Var2 = this.b;
                        ee0Var2.z0 = 1;
                        ee0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.t6.s(ee0Var2.B0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var2.C0.setColorFilter((ColorFilter) null);
                        ee0Var2.c();
                        break;
                    default:
                        ee0 ee0Var3 = this.b;
                        ee0Var3.z0 = 2;
                        ee0Var3.A0.setColorFilter((ColorFilter) null);
                        ee0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.t6.s(ee0Var3.C0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var3.c();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        final int i16 = 1;
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView2, c8.ma.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zd0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        ee0 ee0Var = this.b;
                        ee0Var.z0 = 0;
                        org.telegram.ui.ActionBar.t6.s(ee0Var.A0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var.B0.setColorFilter((ColorFilter) null);
                        ee0Var.C0.setColorFilter((ColorFilter) null);
                        ee0Var.c();
                        break;
                    case 1:
                        ee0 ee0Var2 = this.b;
                        ee0Var2.z0 = 1;
                        ee0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.t6.s(ee0Var2.B0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var2.C0.setColorFilter((ColorFilter) null);
                        ee0Var2.c();
                        break;
                    default:
                        ee0 ee0Var3 = this.b;
                        ee0Var3.z0 = 2;
                        ee0Var3.A0.setColorFilter((ColorFilter) null);
                        ee0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.t6.s(ee0Var3.C0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var3.c();
                        break;
                }
            }
        });
        if (y51Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, -1));
        linearLayout.addView(imageView3, c8.ma.o(56, 48));
        final int i17 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zd0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        ee0 ee0Var = this.b;
                        ee0Var.z0 = 0;
                        org.telegram.ui.ActionBar.t6.s(ee0Var.A0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var.B0.setColorFilter((ColorFilter) null);
                        ee0Var.C0.setColorFilter((ColorFilter) null);
                        ee0Var.c();
                        break;
                    case 1:
                        ee0 ee0Var2 = this.b;
                        ee0Var2.z0 = 1;
                        ee0Var2.A0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.t6.s(ee0Var2.B0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var2.C0.setColorFilter((ColorFilter) null);
                        ee0Var2.c();
                        break;
                    default:
                        ee0 ee0Var3 = this.b;
                        ee0Var3.z0 = 2;
                        ee0Var3.A0.setColorFilter((ColorFilter) null);
                        ee0Var3.B0.setColorFilter((ColorFilter) null);
                        org.telegram.ui.ActionBar.t6.s(ee0Var3.C0, org.telegram.ui.ActionBar.m6.qg, h6Var, PorterDuff.Mode.MULTIPLY);
                        ee0Var3.c();
                        break;
                }
            }
        });
        vh vhVar = new vh(context, 1);
        this.n0 = vhVar;
        v4.c0 c0Var = new v4.c0();
        c0Var.j1(1);
        vhVar.setLayoutManager(c0Var);
        vhVar.setClipToPadding(false);
        vhVar.setOverScrollMode(2);
        vhVar.setAdapter(new org.telegram.ui.l4(4, this, context));
        frameLayout.addView(vhVar, c8.ma.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.u0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, c8.ma.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, c8.ma.e(-2, -2, 1));
        int i18 = 0;
        while (i18 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i18));
            this.v0[i18] = new RadioButton(context);
            this.v0[i18].setSize(org.telegram.messenger.g0.L(20.0f));
            frameLayout4.addView(this.v0[i18], c8.ma.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i18 == 0) {
                String N0 = org.telegram.messenger.gd.N0(2131751680, null);
                textView3.setText(N0.substring(0, 1).toUpperCase() + N0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.v0[i18].b(-1, -1);
            } else if (i18 == 1) {
                String N02 = org.telegram.messenger.gd.N0(2131751677, null);
                textView3.setText(N02.substring(0, 1).toUpperCase() + N02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.v0[i18].b(-1684147, -1684147);
            } else if (i18 == 2) {
                String N03 = org.telegram.messenger.gd.N0(2131751678, null);
                textView3.setText(N03.substring(0, 1).toUpperCase() + N03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.v0[i18].b(-10831009, -10831009);
            } else if (i18 == 3) {
                String N04 = org.telegram.messenger.gd.N0(2131751679, null);
                textView3.setText(N04.substring(0, 1).toUpperCase() + N04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.v0[i18].b(-12734994, -12734994);
            }
            frameLayout4.addView(textView3, c8.ma.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, c8.ma.k(i18 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ae0
                public final /* synthetic */ ee0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ee0 ee0Var = this.b;
                            ee0Var.getClass();
                            int intValue = ((Integer) view.getTag()).intValue();
                            ee0Var.a0.a = intValue;
                            int i19 = 0;
                            while (i19 < 4) {
                                ee0Var.v0[i19].a(i19 == intValue, true);
                                i19++;
                            }
                            ee0Var.q0.invalidate();
                            break;
                        case 1:
                            ee0 ee0Var2 = this.b;
                            ee0Var2.U = 0;
                            ee0Var2.e();
                            ee0Var2.p0.setVisibility(4);
                            ez ezVar = ee0Var2.m0;
                            if (ezVar != null) {
                                ezVar.c(false, false, false);
                                break;
                            }
                            break;
                        case 2:
                            ee0 ee0Var3 = this.b;
                            ee0Var3.U = 1;
                            ee0Var3.e();
                            vd0 vd0Var2 = ee0Var3.p0;
                            vd0Var2.setVisibility(0);
                            vd0Var2.setType(1);
                            ez ezVar2 = ee0Var3.m0;
                            if (ezVar2 != null) {
                                ezVar2.c(false, false, false);
                                break;
                            }
                            break;
                        default:
                            ee0 ee0Var4 = this.b;
                            ee0Var4.U = 2;
                            ee0Var4.e();
                            vd0 vd0Var3 = ee0Var4.p0;
                            vd0Var3.setVisibility(0);
                            vd0Var3.setType(0);
                            ez ezVar3 = ee0Var4.m0;
                            if (ezVar3 != null) {
                                ezVar3.c(false, false, false);
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
        this.g0.addView(frameLayout5, c8.ma.d(org.telegram.messenger.ks.D4, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.r0 = textView4;
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        final int i19 = 1;
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(org.telegram.messenger.gd.N0(2131753670, null));
        frameLayout5.addView(textView4, c8.ma.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ae0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        ee0 ee0Var = this.b;
                        ee0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        ee0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            ee0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        ee0Var.q0.invalidate();
                        break;
                    case 1:
                        ee0 ee0Var2 = this.b;
                        ee0Var2.U = 0;
                        ee0Var2.e();
                        ee0Var2.p0.setVisibility(4);
                        ez ezVar = ee0Var2.m0;
                        if (ezVar != null) {
                            ezVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        ee0 ee0Var3 = this.b;
                        ee0Var3.U = 1;
                        ee0Var3.e();
                        vd0 vd0Var2 = ee0Var3.p0;
                        vd0Var2.setVisibility(0);
                        vd0Var2.setType(1);
                        ez ezVar2 = ee0Var3.m0;
                        if (ezVar2 != null) {
                            ezVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        ee0 ee0Var4 = this.b;
                        ee0Var4.U = 2;
                        ee0Var4.e();
                        vd0 vd0Var3 = ee0Var4.p0;
                        vd0Var3.setVisibility(0);
                        vd0Var3.setType(0);
                        ez ezVar3 = ee0Var4.m0;
                        if (ezVar3 != null) {
                            ezVar3.c(false, false, false);
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
        textView5.setText(org.telegram.messenger.gd.N0(2131753669, null));
        frameLayout5.addView(textView5, c8.ma.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i20 = 2;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ae0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        ee0 ee0Var = this.b;
                        ee0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        ee0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            ee0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        ee0Var.q0.invalidate();
                        break;
                    case 1:
                        ee0 ee0Var2 = this.b;
                        ee0Var2.U = 0;
                        ee0Var2.e();
                        ee0Var2.p0.setVisibility(4);
                        ez ezVar = ee0Var2.m0;
                        if (ezVar != null) {
                            ezVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        ee0 ee0Var3 = this.b;
                        ee0Var3.U = 1;
                        ee0Var3.e();
                        vd0 vd0Var2 = ee0Var3.p0;
                        vd0Var2.setVisibility(0);
                        vd0Var2.setType(1);
                        ez ezVar2 = ee0Var3.m0;
                        if (ezVar2 != null) {
                            ezVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        ee0 ee0Var4 = this.b;
                        ee0Var4.U = 2;
                        ee0Var4.e();
                        vd0 vd0Var3 = ee0Var4.p0;
                        vd0Var3.setVisibility(0);
                        vd0Var3.setType(0);
                        ez ezVar3 = ee0Var4.m0;
                        if (ezVar3 != null) {
                            ezVar3.c(false, false, false);
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
        textView6.setText(org.telegram.messenger.gd.N0(2131753671, null));
        frameLayout5.addView(textView6, c8.ma.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i21 = 3;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ae0
            public final /* synthetic */ ee0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        ee0 ee0Var = this.b;
                        ee0Var.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        ee0Var.a0.a = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            ee0Var.v0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        ee0Var.q0.invalidate();
                        break;
                    case 1:
                        ee0 ee0Var2 = this.b;
                        ee0Var2.U = 0;
                        ee0Var2.e();
                        ee0Var2.p0.setVisibility(4);
                        ez ezVar = ee0Var2.m0;
                        if (ezVar != null) {
                            ezVar.c(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        ee0 ee0Var3 = this.b;
                        ee0Var3.U = 1;
                        ee0Var3.e();
                        vd0 vd0Var2 = ee0Var3.p0;
                        vd0Var2.setVisibility(0);
                        vd0Var2.setType(1);
                        ez ezVar2 = ee0Var3.m0;
                        if (ezVar2 != null) {
                            ezVar2.c(false, false, false);
                            break;
                        }
                        break;
                    default:
                        ee0 ee0Var4 = this.b;
                        ee0Var4.U = 2;
                        ee0Var4.e();
                        vd0 vd0Var3 = ee0Var4.p0;
                        vd0Var3.setVisibility(0);
                        vd0Var3.setType(0);
                        ez ezVar3 = ee0Var4.m0;
                        if (ezVar3 != null) {
                            ezVar3.c(false, false, false);
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
        ez ezVar = this.m0;
        if (ezVar != null) {
            ezVar.c(false, false, false);
        }
    }

    public final boolean a() {
        org.telegram.messenger.ff ffVar = this.f0;
        h2.c cVar = this.a0;
        return ffVar != null ? (this.H == ffVar.a && this.J == ffVar.d && this.Q == ffVar.j && this.I == ffVar.c && this.K == ffVar.e && this.L == ffVar.f && this.S == ffVar.l && this.R == ffVar.k && this.T == ffVar.m && this.V == ffVar.o && this.M == ffVar.g && this.N == ffVar.b && this.P == ffVar.i && this.O == ffVar.h && cVar.F()) ? false : true : (this.H == 0.0f && this.J == 0.0f && this.Q == 0.0f && this.I == 0.0f && this.K == 0.0f && this.L == 0.0f && this.S == 0.0f && this.R == 0.0f && this.T == 0.0f && this.V == 0.0f && this.M == 0.0f && this.N == 0.0f && this.P == 0 && this.O == 0 && cVar.F()) ? false : true;
    }

    public final void b() {
        boolean z10 = this.k0;
        TextureView textureView = this.j0;
        if (z10) {
            ez ezVar = this.m0;
            if (ezVar != null) {
                ezVar.postRunnable(new bz(ezVar, 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof y51) {
            y51 y51Var = (y51) textureView;
            org.telegram.messenger.ff ffVar = this.f0;
            if (ffVar == null) {
                y51Var.setDelegate(null);
                return;
            }
            ez ezVar2 = this.m0;
            if (ezVar2 != null) {
                ezVar2.d(new org.telegram.ui.Cells.c5(ffVar));
            }
        }
    }

    public final void c() {
        int i7 = this.z0;
        vh vhVar = this.n0;
        xd0 xd0Var = this.q0;
        FrameLayout frameLayout = this.u0;
        FrameLayout frameLayout2 = this.o0;
        vd0 vd0Var = this.p0;
        if (i7 == 0) {
            vd0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            xd0Var.setVisibility(4);
            vhVar.setVisibility(0);
            return;
        }
        if (i7 == 1) {
            vhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            xd0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                vd0Var.setVisibility(0);
            }
            e();
            return;
        }
        if (i7 == 2) {
            vhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            vd0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            xd0Var.setVisibility(0);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        ec0 ec0Var = this.w0;
        if (ec0Var != null && view == (textureView = this.j0)) {
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
            float measuredWidth2 = textureView.getMeasuredWidth() / ec0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            ec0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        int i7 = this.U;
        TextView textView = this.t0;
        TextView textView2 = this.s0;
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        TextView textView3 = this.r0;
        if (i7 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i10 = org.telegram.ui.ActionBar.m6.qg;
            org.telegram.ui.ActionBar.t6.x(this, mutate, i10, h6Var, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i11 = org.telegram.ui.ActionBar.m6.qg;
            org.telegram.ui.ActionBar.t6.x(this, mutate2, i11, h6Var, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i7 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i12 = org.telegram.ui.ActionBar.m6.qg;
            org.telegram.ui.ActionBar.t6.x(this, mutate3, i12, h6Var, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(i12, h6Var));
        }
        d();
    }

    public Bitmap getBitmap() {
        ez ezVar = this.m0;
        if (ezVar == null || !ezVar.f || !ezVar.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (ezVar.postRunnable(new g(ezVar, bitmapArr, countDownLatch, 11))) {
                countDownLatch.await();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        return bitmapArr[0];
    }

    @Override // org.telegram.ui.Components.gz
    public float getBlurAngle() {
        return this.e0;
    }

    public vd0 getBlurControl() {
        return this.p0;
    }

    @Override // org.telegram.ui.Components.gz
    public float getBlurExcludeBlurSize() {
        return this.d0;
    }

    @Override // org.telegram.ui.Components.gz
    public PointF getBlurExcludePoint() {
        return this.c0;
    }

    @Override // org.telegram.ui.Components.gz
    public float getBlurExcludeSize() {
        return this.b0;
    }

    @Override // org.telegram.ui.Components.gz
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.i0;
    }

    @Override // org.telegram.ui.Components.gz
    public float getContrastValue() {
        return com.google.android.gms.internal.vision.e2.c(this.J, 100.0f, 0.3f, 1.0f);
    }

    public xd0 getCurveControl() {
        return this.q0;
    }

    public TextView getDoneTextView() {
        return this.h0;
    }

    @Override // org.telegram.ui.Components.gz
    public float getEnhanceValue() {
        return this.H / 100.0f;
    }

    @Override // org.telegram.ui.Components.gz
    public float getExposureValue() {
        return this.I / 100.0f;
    }

    @Override // org.telegram.ui.Components.gz
    public float getFadeValue() {
        return this.M / 100.0f;
    }

    @Override // org.telegram.ui.Components.gz
    public float getGrainValue() {
        return (this.T / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.gz
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.Q, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.k0 || this.l0) {
            return null;
        }
        return this.j0;
    }

    @Override // org.telegram.ui.Components.gz
    public float getSaturationValue() {
        float f10 = this.L / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public org.telegram.messenger.ff getSavedFilterState() {
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff();
        ffVar.a = this.H;
        ffVar.c = this.I;
        ffVar.d = this.J;
        ffVar.e = this.K;
        ffVar.f = this.L;
        ffVar.g = this.M;
        ffVar.b = this.N;
        ffVar.h = this.O;
        ffVar.i = this.P;
        ffVar.j = this.Q;
        ffVar.k = this.R;
        ffVar.l = this.S;
        ffVar.m = this.T;
        ffVar.n = this.U;
        ffVar.o = this.V;
        ffVar.p = this.a0;
        ffVar.q = this.b0;
        ffVar.r = this.c0;
        ffVar.s = this.d0;
        ffVar.t = this.e0;
        this.f0 = ffVar;
        return ffVar;
    }

    @Override // org.telegram.ui.Components.gz
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.R, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.gz
    public float getSharpenValue() {
        return com.google.android.gms.internal.vision.e2.c(this.V, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.gz
    public float getSoftenSkinValue() {
        return this.N / 100.0f;
    }

    @Override // org.telegram.ui.Components.gz
    public int getTintHighlightsColor() {
        return this.P;
    }

    @Override // org.telegram.ui.Components.gz
    public float getTintHighlightsIntensityValue() {
        return this.P == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.gz
    public int getTintShadowsColor() {
        return this.O;
    }

    @Override // org.telegram.ui.Components.gz
    public float getTintShadowsIntensityValue() {
        return this.O == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.g0;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        ez ezVar = this.m0;
        if (ezVar == null || (haVar = ezVar.J) == null) {
            return null;
        }
        synchronized (haVar.n) {
            try {
                if (haVar.q) {
                    return haVar.p;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.gz
    public float getVignetteValue() {
        return this.S / 100.0f;
    }

    @Override // org.telegram.ui.Components.gz
    public float getWarmthValue() {
        return this.K / 100.0f;
    }

    @Override // hi.oa
    public final boolean i(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.j0;
            if (textureView instanceof y51) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                aj0 aj0Var = ((y51) textureView).c;
                float f10 = aj0Var.a;
                if (x10 >= f10 && x10 <= f10 + aj0Var.c) {
                    float f11 = aj0Var.b;
                    if (y10 >= f11 && y10 <= f11 + aj0Var.d) {
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

    @Override // org.telegram.ui.Components.gz
    public final ByteBuffer j() {
        h2.c cVar = this.a0;
        cVar.q();
        return (ByteBuffer) cVar.f;
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
            xd0 xd0Var = this.q0;
            aj0 aj0Var = xd0Var.e;
            aj0Var.a = f13;
            aj0Var.b = f14;
            aj0Var.c = f15;
            aj0Var.d = f16;
            vd0 vd0Var = this.p0;
            yt0 yt0Var = vd0Var.d;
            yt0Var.a = f15;
            yt0Var.b = f16;
            ((FrameLayout.LayoutParams) vd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(38.0f) + i11;
            ((FrameLayout.LayoutParams) xd0Var.getLayoutParams()).height = org.telegram.messenger.g0.L(28.0f) + i11;
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

    @Override // org.telegram.ui.Components.gz
    public final boolean q() {
        return this.a || this.W;
    }

    @Override // org.telegram.ui.Components.gz
    public final boolean s() {
        return !this.a0.F();
    }

    public void setEnhanceValue(float f10) {
        this.H = f10 * 100.0f;
        d();
        int i7 = 0;
        while (true) {
            vh vhVar = this.n0;
            if (i7 >= vhVar.getChildCount()) {
                break;
            }
            View childAt = vhVar.getChildAt(i7);
            if ((childAt instanceof org.telegram.ui.Cells.u5) && RecyclerView.R(childAt) == this.b) {
                ((org.telegram.ui.Cells.u5) childAt).a(org.telegram.messenger.gd.N0(2131751114, null), 0, this.H);
                break;
            }
            i7++;
        }
        ez ezVar = this.m0;
        if (ezVar != null) {
            ezVar.c(true, false, false);
        }
    }
}
