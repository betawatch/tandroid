// default package

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
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c98 extends FrameLayout implements tf4, nbb {
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
    public final vnb J0;
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
    public final lo a0;
    public final boolean b;
    public float b0;
    public final int c;
    public PointF c0;
    public final int d;
    public float d0;
    public final int e;
    public float e0;
    public final int f;
    public po6 f0;
    public final FrameLayout g0;
    public final int h;
    public final TextView h0;
    public final TextView i0;
    public final TextureView j0;
    public final boolean k0;
    public final boolean l0;
    public rf4 m0;
    public final int n;
    public final n02 n0;
    public final FrameLayout o0;
    public final t88 p0;
    public final v88 q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final TextView t0;
    public final FrameLayout u0;
    public final RadioButton[] v0;
    public final int w;
    public final qx7 w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public final boolean y0;
    public byte z0;

    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v25 */
    public c98(Context context, kec kecVar, Bitmap bitmap, Bitmap bitmap2, int i, po6 po6Var, qx7 qx7Var, int i2, boolean z, boolean z2, tl0 tl0Var, final vnb vnbVar) {
        super(context);
        ?? r13;
        lo loVar;
        this.v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.l0 = z2;
        this.J0 = vnbVar;
        boolean z3 = context instanceof BubbleActivity;
        this.y0 = z3;
        this.w0 = qx7Var;
        this.x0 = z;
        this.G = 0;
        final byte b = 1;
        if (i2 == 1) {
            this.G = 1;
            this.n = 0;
            r13 = 1;
        } else {
            if (i2 == 0) {
                this.n = -1;
            }
            r13 = 0;
        }
        this.b = r13;
        this.c = r13 + 1;
        this.d = r13 + 2;
        this.e = r13 + 3;
        this.f = r13 + 4;
        this.h = r13 + 5;
        this.r = r13 + 6;
        this.s = r13 + 7;
        int i3 = r13 + 9;
        this.G = i3;
        this.w = r13 + 8;
        if (i2 == 2) {
            int i4 = r13 + 10;
            this.G = i4;
            this.n = i3;
            i3 = i4;
        }
        if (kecVar == null) {
            int i5 = i3 + 1;
            this.G = i5;
            this.x = i3;
            i3 = i5;
        } else {
            this.x = -1;
        }
        this.y = i3;
        this.E = i3 + 1;
        this.G = i3 + 3;
        this.F = i3 + 2;
        if (po6Var != null) {
            this.H = po6Var.a;
            this.N = po6Var.b;
            this.I = po6Var.c;
            this.J = po6Var.d;
            this.K = po6Var.e;
            this.L = po6Var.f;
            this.M = po6Var.g;
            this.O = po6Var.h;
            this.P = po6Var.i;
            this.Q = po6Var.j;
            this.R = po6Var.k;
            this.S = po6Var.l;
            this.T = po6Var.m;
            this.U = po6Var.n;
            this.V = po6Var.o;
            loVar = po6Var.p;
            this.a0 = loVar;
            this.b0 = po6Var.q;
            this.c0 = po6Var.r;
            this.d0 = po6Var.s;
            this.W = po6Var.a();
            this.e0 = po6Var.t;
            this.f0 = po6Var;
        } else {
            loVar = new lo();
            this.a0 = loVar;
            this.b0 = 0.35f;
            this.c0 = new PointF(0.5f, 0.5f);
            this.d0 = 0.15f;
            this.e0 = 1.5707964f;
            this.W = true;
        }
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.I0 = i;
        if (kecVar != null) {
            this.j0 = kecVar;
            kecVar.setDelegate(new w88(this));
        } else {
            this.k0 = true;
            uq5 uq5Var = new uq5((byte) 1, context, this);
            this.j0 = uq5Var;
            if (z2) {
                addView(uq5Var, tre.e(-1, -1, 51));
            }
            uq5Var.setVisibility(4);
            uq5Var.setSurfaceTextureListener(new z88(this, z2, tl0Var));
        }
        t88 t88Var = new t88(context);
        t88Var.a = new PointF();
        t88Var.d = new qma();
        t88Var.e = new PointF(0.5f, 0.5f);
        t88Var.f = 0.15f;
        t88Var.h = 0.35f;
        t88Var.r = new RectF();
        t88Var.y = 1.0f;
        t88Var.G = true;
        Paint paint = new Paint(1);
        t88Var.J = paint;
        Paint paint2 = new Paint(1);
        t88Var.K = paint2;
        t88Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(hl.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        t88Var.L = z3;
        this.p0 = t88Var;
        t88Var.setVisibility(4);
        if (z2) {
            addView(t88Var, tre.e(-1, -1, 51));
        }
        t88Var.setDelegate(new w88(this));
        v88 v88Var = new v88(context);
        v88Var.a = 0;
        v88Var.c = true;
        v88Var.e = new a69();
        Paint paint3 = new Paint(1);
        v88Var.f = paint3;
        Paint paint4 = new Paint(1);
        v88Var.h = paint4;
        Paint paint5 = new Paint(1);
        v88Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        v88Var.r = textPaint;
        v88Var.s = new Path();
        v88Var.setWillNotDraw(false);
        v88Var.x = loVar;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(hl.L(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(hl.L(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(hl.L(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(hl.L(13.0f));
        this.q0 = v88Var;
        v88Var.setDelegate(new w88(this));
        v88Var.setVisibility(4);
        if (z2) {
            addView(v88Var, tre.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        addView(frameLayout, tre.e(-1, (!z2 ? 40 : 0) + jn7.P2, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, tre.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(aob.f0(-12763843, 0, -1));
        textView.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
        textView.setText(ob6.M0(2131752570, null).toUpperCase());
        textView.setTypeface(hl.o());
        frameLayout2.addView(textView, tre.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i6 = aob.qg;
        yob.X(textView2, i6, vnbVar);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(aob.f0(-12763843, 0, -1));
        textView2.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
        textView2.setText(ob6.M0(2131751319, null).toUpperCase());
        textView2.setTypeface(hl.o());
        frameLayout2.addView(textView2, tre.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, tre.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        yob.s(imageView, i6, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(aob.f0(1090519039, 1, -1));
        linearLayout.addView(imageView, tre.o(56, 48));
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: x88
            public final /* synthetic */ c98 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                vnb vnbVar2 = vnbVar;
                c98 c98Var = this.b;
                switch (b3) {
                    case 0:
                        c98Var.z0 = (byte) 0;
                        yob.s(c98Var.A0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        break;
                    case 1:
                        c98Var.z0 = (byte) 1;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.B0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        break;
                    default:
                        c98Var.z0 = (byte) 2;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.C0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.d();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        imageView2.setBackgroundDrawable(aob.f0(1090519039, 1, -1));
        linearLayout.addView(imageView2, tre.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: x88
            public final /* synthetic */ c98 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                vnb vnbVar2 = vnbVar;
                c98 c98Var = this.b;
                switch (b3) {
                    case 0:
                        c98Var.z0 = (byte) 0;
                        yob.s(c98Var.A0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        break;
                    case 1:
                        c98Var.z0 = (byte) 1;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.B0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        break;
                    default:
                        c98Var.z0 = (byte) 2;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.C0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.d();
                        break;
                }
            }
        });
        if (kecVar != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(aob.f0(1090519039, 1, -1));
        linearLayout.addView(imageView3, tre.o(56, 48));
        final byte b3 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: x88
            public final /* synthetic */ c98 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                vnb vnbVar2 = vnbVar;
                c98 c98Var = this.b;
                switch (b32) {
                    case 0:
                        c98Var.z0 = (byte) 0;
                        yob.s(c98Var.A0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        break;
                    case 1:
                        c98Var.z0 = (byte) 1;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.B0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        break;
                    default:
                        c98Var.z0 = (byte) 2;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.C0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.d();
                        break;
                }
            }
        });
        n02 n02Var = new n02(context, (byte) 1);
        this.n0 = n02Var;
        x46 x46Var = new x46();
        x46Var.i1(1);
        n02Var.setLayoutManager(x46Var);
        n02Var.setClipToPadding(false);
        n02Var.setOverScrollMode(2);
        n02Var.setAdapter(new t20(this, context, (byte) 11));
        frameLayout.addView(n02Var, tre.e(-1, (!z2 ? 60 : 0) + jn7.E1, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.u0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, tre.d(-1, 78.0f, 1, 0.0f, (!z2 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, tre.e(-2, -2, 1));
        int i7 = 0;
        while (i7 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i7));
            this.v0[i7] = new RadioButton(context);
            this.v0[i7].setSize(hl.L(20.0f));
            frameLayout4.addView(this.v0[i7], tre.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i7 == 0) {
                String M0 = ob6.M0(2131751657, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.v0[i7].b(-1, -1);
            } else if (i7 == 1) {
                String M02 = ob6.M0(2131751654, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.v0[i7].b(-1684147, -1684147);
            } else if (i7 == 2) {
                String M03 = ob6.M0(2131751655, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.v0[i7].b(-10831009, -10831009);
            } else if (i7 == 3) {
                String M04 = ob6.M0(2131751656, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.v0[i7].b(-12734994, -12734994);
            }
            frameLayout4.addView(textView3, tre.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, tre.k(i7 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            final byte b4 = 0;
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: y88
                public final /* synthetic */ c98 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b5 = b4;
                    c98 c98Var = this.b;
                    switch (b5) {
                        case 0:
                            int intValue = ((Integer) view.getTag()).intValue();
                            c98Var.a0.a = intValue;
                            int i8 = 0;
                            while (i8 < 4) {
                                c98Var.v0[i8].a(i8 == intValue, true);
                                i8++;
                            }
                            c98Var.q0.invalidate();
                            break;
                        case 1:
                            c98Var.U = 0;
                            c98Var.f();
                            c98Var.p0.setVisibility(4);
                            rf4 rf4Var = c98Var.m0;
                            if (rf4Var != null) {
                                rf4Var.b(false, false, false);
                                break;
                            }
                            break;
                        case 2:
                            c98Var.U = 1;
                            c98Var.f();
                            t88 t88Var2 = c98Var.p0;
                            t88Var2.setVisibility(0);
                            t88Var2.setType(1);
                            rf4 rf4Var2 = c98Var.m0;
                            if (rf4Var2 != null) {
                                rf4Var2.b(false, false, false);
                                break;
                            }
                            break;
                        default:
                            c98Var.U = 2;
                            c98Var.f();
                            t88 t88Var3 = c98Var.p0;
                            t88Var3.setVisibility(0);
                            t88Var3.setType(0);
                            rf4 rf4Var3 = c98Var.m0;
                            if (rf4Var3 != null) {
                                rf4Var3.b(false, false, false);
                                break;
                            }
                            break;
                    }
                }
            });
            i7++;
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.o0 = frameLayout5;
        frameLayout5.setVisibility(4);
        this.g0.addView(frameLayout5, tre.d(jn7.C4, 60.0f, 1, 0.0f, (!z2 ? 40 : 0) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.r0 = textView4;
        textView4.setCompoundDrawablePadding(hl.L(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(ob6.M0(2131753666, null));
        frameLayout5.addView(textView4, tre.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: y88
            public final /* synthetic */ c98 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b;
                c98 c98Var = this.b;
                switch (b5) {
                    case 0:
                        int intValue = ((Integer) view.getTag()).intValue();
                        c98Var.a0.a = intValue;
                        int i8 = 0;
                        while (i8 < 4) {
                            c98Var.v0[i8].a(i8 == intValue, true);
                            i8++;
                        }
                        c98Var.q0.invalidate();
                        break;
                    case 1:
                        c98Var.U = 0;
                        c98Var.f();
                        c98Var.p0.setVisibility(4);
                        rf4 rf4Var = c98Var.m0;
                        if (rf4Var != null) {
                            rf4Var.b(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        c98Var.U = 1;
                        c98Var.f();
                        t88 t88Var2 = c98Var.p0;
                        t88Var2.setVisibility(0);
                        t88Var2.setType(1);
                        rf4 rf4Var2 = c98Var.m0;
                        if (rf4Var2 != null) {
                            rf4Var2.b(false, false, false);
                            break;
                        }
                        break;
                    default:
                        c98Var.U = 2;
                        c98Var.f();
                        t88 t88Var3 = c98Var.p0;
                        t88Var3.setVisibility(0);
                        t88Var3.setType(0);
                        rf4 rf4Var3 = c98Var.m0;
                        if (rf4Var3 != null) {
                            rf4Var3.b(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.s0 = textView5;
        textView5.setCompoundDrawablePadding(hl.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(ob6.M0(2131753665, null));
        frameLayout5.addView(textView5, tre.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final byte b5 = 2;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: y88
            public final /* synthetic */ c98 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b5;
                c98 c98Var = this.b;
                switch (b52) {
                    case 0:
                        int intValue = ((Integer) view.getTag()).intValue();
                        c98Var.a0.a = intValue;
                        int i8 = 0;
                        while (i8 < 4) {
                            c98Var.v0[i8].a(i8 == intValue, true);
                            i8++;
                        }
                        c98Var.q0.invalidate();
                        break;
                    case 1:
                        c98Var.U = 0;
                        c98Var.f();
                        c98Var.p0.setVisibility(4);
                        rf4 rf4Var = c98Var.m0;
                        if (rf4Var != null) {
                            rf4Var.b(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        c98Var.U = 1;
                        c98Var.f();
                        t88 t88Var2 = c98Var.p0;
                        t88Var2.setVisibility(0);
                        t88Var2.setType(1);
                        rf4 rf4Var2 = c98Var.m0;
                        if (rf4Var2 != null) {
                            rf4Var2.b(false, false, false);
                            break;
                        }
                        break;
                    default:
                        c98Var.U = 2;
                        c98Var.f();
                        t88 t88Var3 = c98Var.p0;
                        t88Var3.setVisibility(0);
                        t88Var3.setType(0);
                        rf4 rf4Var3 = c98Var.m0;
                        if (rf4Var3 != null) {
                            rf4Var3.b(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.t0 = textView6;
        textView6.setCompoundDrawablePadding(hl.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(ob6.M0(2131753667, null));
        frameLayout5.addView(textView6, tre.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final byte b6 = 3;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: y88
            public final /* synthetic */ c98 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b6;
                c98 c98Var = this.b;
                switch (b52) {
                    case 0:
                        int intValue = ((Integer) view.getTag()).intValue();
                        c98Var.a0.a = intValue;
                        int i8 = 0;
                        while (i8 < 4) {
                            c98Var.v0[i8].a(i8 == intValue, true);
                            i8++;
                        }
                        c98Var.q0.invalidate();
                        break;
                    case 1:
                        c98Var.U = 0;
                        c98Var.f();
                        c98Var.p0.setVisibility(4);
                        rf4 rf4Var = c98Var.m0;
                        if (rf4Var != null) {
                            rf4Var.b(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        c98Var.U = 1;
                        c98Var.f();
                        t88 t88Var2 = c98Var.p0;
                        t88Var2.setVisibility(0);
                        t88Var2.setType(1);
                        rf4 rf4Var2 = c98Var.m0;
                        if (rf4Var2 != null) {
                            rf4Var2.b(false, false, false);
                            break;
                        }
                        break;
                    default:
                        c98Var.U = 2;
                        c98Var.f();
                        t88 t88Var3 = c98Var.p0;
                        t88Var3.setVisibility(0);
                        t88Var3.setType(0);
                        rf4 rf4Var3 = c98Var.m0;
                        if (rf4Var3 != null) {
                            rf4Var3.b(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        f();
        if (this.y0 || !z2) {
            return;
        }
        if (this.k0) {
            ((FrameLayout.LayoutParams) this.j0.getLayoutParams()).topMargin = hl.m;
        }
        ((FrameLayout.LayoutParams) this.q0.getLayoutParams()).topMargin = hl.m;
    }

    private void setShowOriginal(boolean z) {
        if (this.a != z) {
            this.a = z;
            rf4 rf4Var = this.m0;
            if (rf4Var != null) {
                rf4Var.b(false, false, false);
            }
        }
    }

    @Override // tf4
    public final ByteBuffer a() {
        lo loVar = this.a0;
        loVar.c();
        return (ByteBuffer) loVar.f;
    }

    public final boolean b() {
        po6 po6Var = this.f0;
        float f = this.H;
        lo loVar = this.a0;
        return po6Var != null ? (f == po6Var.a && this.J == po6Var.d && this.Q == po6Var.j && this.I == po6Var.c && this.K == po6Var.e && this.L == po6Var.f && this.S == po6Var.l && this.R == po6Var.k && this.T == po6Var.m && this.V == po6Var.o && this.M == po6Var.g && this.N == po6Var.b && this.P == po6Var.i && this.O == po6Var.h && loVar.o()) ? false : true : (f == 0.0f && this.J == 0.0f && this.Q == 0.0f && this.I == 0.0f && this.K == 0.0f && this.L == 0.0f && this.S == 0.0f && this.R == 0.0f && this.T == 0.0f && this.V == 0.0f && this.M == 0.0f && this.N == 0.0f && this.P == 0 && this.O == 0 && loVar.o()) ? false : true;
    }

    public final void c() {
        boolean z = this.k0;
        TextureView textureView = this.j0;
        if (z) {
            rf4 rf4Var = this.m0;
            if (rf4Var != null) {
                rf4Var.postRunnable(new pf4(rf4Var, (byte) 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof kec) {
            kec kecVar = (kec) textureView;
            po6 po6Var = this.f0;
            if (po6Var == null) {
                kecVar.setDelegate(null);
                return;
            }
            rf4 rf4Var2 = this.m0;
            if (rf4Var2 != null) {
                rf4Var2.c(new ri6(po6Var, (byte) 29));
            }
        }
    }

    public final void d() {
        byte b = this.z0;
        n02 n02Var = this.n0;
        v88 v88Var = this.q0;
        FrameLayout frameLayout = this.u0;
        FrameLayout frameLayout2 = this.o0;
        t88 t88Var = this.p0;
        if (b == 0) {
            t88Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            v88Var.setVisibility(4);
            n02Var.setVisibility(0);
            return;
        }
        if (b == 1) {
            n02Var.setVisibility(4);
            frameLayout.setVisibility(4);
            v88Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                t88Var.setVisibility(0);
            }
            f();
            return;
        }
        if (b == 2) {
            n02Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            t88Var.setVisibility(4);
            frameLayout.setVisibility(0);
            v88Var.setVisibility(0);
            this.a0.a = 0;
            int i = 0;
            while (i < 4) {
                this.v0[i].a(i == 0, false);
                i++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j);
        qx7 qx7Var = this.w0;
        if (qx7Var != null && view == (textureView = this.j0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.E0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.F0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.H0;
                int i = this.I0;
                if (i != 0) {
                    Matrix matrix = this.G0;
                    matrix.reset();
                    matrix.postRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / qx7Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            qx7Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.W = Math.abs(this.H) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && this.O == 0 && this.P == 0 && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && Math.abs(this.T) < 0.1f && this.U == 0 && Math.abs(this.V) < 0.1f && this.a0.o();
    }

    public final void f() {
        int i = this.U;
        TextView textView = this.t0;
        TextView textView2 = this.s0;
        vnb vnbVar = this.J0;
        TextView textView3 = this.r0;
        if (i == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i2 = aob.qg;
            yob.x(this, mutate, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(aob.v0(i2, vnbVar));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i3 = aob.qg;
            yob.x(this, mutate2, i3, vnbVar, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(aob.v0(i3, vnbVar));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i4 = aob.qg;
            yob.x(this, mutate3, i4, vnbVar, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(aob.v0(i4, vnbVar));
        }
        e();
    }

    @Override // tf4
    public final boolean g() {
        return this.a || this.W;
    }

    public Bitmap getBitmap() {
        rf4 rf4Var = this.m0;
        if (rf4Var == null || !rf4Var.f || !rf4Var.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (rf4Var.postRunnable(new re4((Object) rf4Var, (Object) bitmapArr, (Object) countDownLatch, (byte) 3))) {
                countDownLatch.await();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        return bitmapArr[0];
    }

    @Override // tf4
    public float getBlurAngle() {
        return this.e0;
    }

    public t88 getBlurControl() {
        return this.p0;
    }

    @Override // tf4
    public float getBlurExcludeBlurSize() {
        return this.d0;
    }

    @Override // tf4
    public PointF getBlurExcludePoint() {
        return this.c0;
    }

    @Override // tf4
    public float getBlurExcludeSize() {
        return this.b0;
    }

    @Override // tf4
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.i0;
    }

    @Override // tf4
    public float getContrastValue() {
        return c00.B(this.J, 100.0f, 0.3f, 1.0f);
    }

    public v88 getCurveControl() {
        return this.q0;
    }

    public TextView getDoneTextView() {
        return this.h0;
    }

    @Override // tf4
    public float getEnhanceValue() {
        return this.H / 100.0f;
    }

    @Override // tf4
    public float getExposureValue() {
        return this.I / 100.0f;
    }

    @Override // tf4
    public float getFadeValue() {
        return this.M / 100.0f;
    }

    @Override // tf4
    public float getGrainValue() {
        return (this.T / 100.0f) * 0.04f;
    }

    @Override // tf4
    public float getHighlightsValue() {
        return c00.z(this.Q, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.k0 || this.l0) {
            return null;
        }
        return this.j0;
    }

    @Override // tf4
    public float getSaturationValue() {
        float f = this.L / 100.0f;
        if (f > 0.0f) {
            f *= 1.05f;
        }
        return f + 1.0f;
    }

    public po6 getSavedFilterState() {
        po6 po6Var = new po6();
        po6Var.a = this.H;
        po6Var.c = this.I;
        po6Var.d = this.J;
        po6Var.e = this.K;
        po6Var.f = this.L;
        po6Var.g = this.M;
        po6Var.b = this.N;
        po6Var.h = this.O;
        po6Var.i = this.P;
        po6Var.j = this.Q;
        po6Var.k = this.R;
        po6Var.l = this.S;
        po6Var.m = this.T;
        po6Var.n = this.U;
        po6Var.o = this.V;
        po6Var.p = this.a0;
        po6Var.q = this.b0;
        po6Var.r = this.c0;
        po6Var.s = this.d0;
        po6Var.t = this.e0;
        this.f0 = po6Var;
        return po6Var;
    }

    @Override // tf4
    public float getShadowsValue() {
        return c00.z(this.R, 0.55f, 100.0f, 100.0f);
    }

    @Override // tf4
    public float getSharpenValue() {
        return c00.B(this.V, 100.0f, 0.6f, 0.11f);
    }

    @Override // tf4
    public float getSoftenSkinValue() {
        return this.N / 100.0f;
    }

    @Override // tf4
    public int getTintHighlightsColor() {
        return this.P;
    }

    @Override // tf4
    public float getTintHighlightsIntensityValue() {
        return this.P == 0 ? 0.0f : 0.5f;
    }

    @Override // tf4
    public int getTintShadowsColor() {
        return this.O;
    }

    @Override // tf4
    public float getTintShadowsIntensityValue() {
        return this.O == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.g0;
    }

    public Bitmap getUiBlurBitmap() {
        yl0 yl0Var;
        rf4 rf4Var = this.m0;
        if (rf4Var == null || (yl0Var = rf4Var.J) == null) {
            return null;
        }
        synchronized (yl0Var.n) {
            if (yl0Var.q) {
                return yl0Var.p;
            }
            return null;
        }
    }

    @Override // tf4
    public float getVignetteValue() {
        return this.S / 100.0f;
    }

    @Override // tf4
    public float getWarmthValue() {
        return this.K / 100.0f;
    }

    @Override // nbb
    public final boolean h(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.j0;
            if (textureView instanceof kec) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                a69 a69Var = ((kec) textureView).c;
                float f = a69Var.a;
                if (x >= f && x <= f + a69Var.c) {
                    float f2 = a69Var.b;
                    if (y >= f2 && y <= f2 + a69Var.d) {
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

    @Override // tf4
    public final boolean i() {
        return !this.a0.o();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float width;
        int height;
        float ceil;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.l0) {
            int L = size - hl.L(28.0f);
            int L2 = hl.L(214.0f);
            boolean z = this.y0;
            int i3 = size2 - (L2 + (!z ? hl.m : 0));
            TextureView textureView = this.j0;
            Bitmap bitmap = this.D0;
            if (bitmap != null) {
                int i4 = this.I0 % 360;
                if (i4 == 90 || i4 == 270) {
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
            float f2 = L;
            float f3 = i3;
            if (f2 / width > f3 / height) {
                f = (int) Math.ceil(width * r11);
                ceil = f3;
            } else {
                ceil = (int) Math.ceil(r6 * r9);
                f = f2;
            }
            int ceil2 = (int) Math.ceil(((f2 - f) / 2.0f) + hl.L(14.0f));
            int ceil3 = (int) Math.ceil(((f3 - ceil) / 2.0f) + hl.L(14.0f) + (!z ? hl.m : 0));
            int i5 = (int) f;
            int i6 = (int) ceil;
            if (this.k0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i5;
                layoutParams.height = i6;
            }
            float f4 = ceil2;
            float f5 = ceil3 - (!z ? hl.m : 0);
            float f6 = i5;
            float f7 = i6;
            v88 v88Var = this.q0;
            a69 a69Var = v88Var.e;
            a69Var.a = f4;
            a69Var.b = f5;
            a69Var.c = f6;
            a69Var.d = f7;
            t88 t88Var = this.p0;
            qma qmaVar = t88Var.d;
            qmaVar.a = f6;
            qmaVar.b = f7;
            ((FrameLayout.LayoutParams) t88Var.getLayoutParams()).height = hl.L(38.0f) + i3;
            ((FrameLayout.LayoutParams) v88Var.getLayoutParams()).height = hl.L(28.0f) + i3;
            if (hl.O1()) {
                int L3 = hl.L(86.0f) * 10;
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
        super.onMeasure(i, i2);
    }

    public void setEnhanceValue(float f) {
        this.H = f * 100.0f;
        e();
        int i = 0;
        while (true) {
            n02 n02Var = this.n0;
            if (i >= n02Var.getChildCount()) {
                break;
            }
            View childAt = n02Var.getChildAt(i);
            if ((childAt instanceof o88) && RecyclerView.S(childAt) == this.b) {
                ((o88) childAt).a(ob6.M0(2131751091, null), 0, this.H);
                break;
            }
            i++;
        }
        rf4 rf4Var = this.m0;
        if (rf4Var != null) {
            rf4Var.b(true, false, false);
        }
    }
}
