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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l58 extends FrameLayout implements vd4, p7b {
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
    public final wjb J0;
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
    public final ko a0;
    public final boolean b;
    public float b0;
    public final int c;
    public PointF c0;
    public final int d;
    public float d0;
    public final int e;
    public float e0;
    public final int f;
    public lm6 f0;
    public final FrameLayout g0;
    public final int h;
    public final TextView h0;
    public final TextView i0;
    public final TextureView j0;
    public final boolean k0;
    public final boolean l0;
    public td4 m0;
    public final int n;
    public final xz1 n0;
    public final FrameLayout o0;
    public final c58 p0;
    public final e58 q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final TextView t0;
    public final FrameLayout u0;
    public final RadioButton[] v0;
    public final int w;
    public final ju7 w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public final boolean y0;
    public byte z0;

    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v25 */
    public l58(Context context, kac kacVar, Bitmap bitmap, Bitmap bitmap2, int i, lm6 lm6Var, ju7 ju7Var, int i2, boolean z, boolean z2, sl0 sl0Var, final wjb wjbVar) {
        super(context);
        ?? r13;
        ko koVar;
        this.v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.l0 = z2;
        this.J0 = wjbVar;
        boolean z3 = context instanceof BubbleActivity;
        this.y0 = z3;
        this.w0 = ju7Var;
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
        if (kacVar == null) {
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
        if (lm6Var != null) {
            this.H = lm6Var.a;
            this.N = lm6Var.b;
            this.I = lm6Var.c;
            this.J = lm6Var.d;
            this.K = lm6Var.e;
            this.L = lm6Var.f;
            this.M = lm6Var.g;
            this.O = lm6Var.h;
            this.P = lm6Var.i;
            this.Q = lm6Var.j;
            this.R = lm6Var.k;
            this.S = lm6Var.l;
            this.T = lm6Var.m;
            this.U = lm6Var.n;
            this.V = lm6Var.o;
            koVar = lm6Var.p;
            this.a0 = koVar;
            this.b0 = lm6Var.q;
            this.c0 = lm6Var.r;
            this.d0 = lm6Var.s;
            this.W = lm6Var.a();
            this.e0 = lm6Var.t;
            this.f0 = lm6Var;
        } else {
            koVar = new ko();
            this.a0 = koVar;
            this.b0 = 0.35f;
            this.c0 = new PointF(0.5f, 0.5f);
            this.d0 = 0.15f;
            this.e0 = 1.5707964f;
            this.W = true;
        }
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.I0 = i;
        if (kacVar != null) {
            this.j0 = kacVar;
            kacVar.setDelegate(new f58(this));
        } else {
            this.k0 = true;
            ro5 ro5Var = new ro5((byte) 1, context, this);
            this.j0 = ro5Var;
            if (z2) {
                addView(ro5Var, nme.e(-1, -1, 51));
            }
            ro5Var.setVisibility(4);
            ro5Var.setSurfaceTextureListener(new i58(this, z2, sl0Var));
        }
        c58 c58Var = new c58(context);
        c58Var.a = new PointF();
        c58Var.d = new via();
        c58Var.e = new PointF(0.5f, 0.5f);
        c58Var.f = 0.15f;
        c58Var.h = 0.35f;
        c58Var.r = new RectF();
        c58Var.y = 1.0f;
        c58Var.G = true;
        Paint paint = new Paint(1);
        c58Var.J = paint;
        Paint paint2 = new Paint(1);
        c58Var.K = paint2;
        c58Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(gl.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        c58Var.L = z3;
        this.p0 = c58Var;
        c58Var.setVisibility(4);
        if (z2) {
            addView(c58Var, nme.e(-1, -1, 51));
        }
        c58Var.setDelegate(new f58(this));
        e58 e58Var = new e58(context);
        e58Var.a = 0;
        e58Var.c = true;
        e58Var.e = new l29();
        Paint paint3 = new Paint(1);
        e58Var.f = paint3;
        Paint paint4 = new Paint(1);
        e58Var.h = paint4;
        Paint paint5 = new Paint(1);
        e58Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        e58Var.r = textPaint;
        e58Var.s = new Path();
        e58Var.setWillNotDraw(false);
        e58Var.x = koVar;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(gl.L(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(gl.L(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(gl.L(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(gl.L(13.0f));
        this.q0 = e58Var;
        e58Var.setDelegate(new f58(this));
        e58Var.setVisibility(4);
        if (z2) {
            addView(e58Var, nme.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        addView(frameLayout, nme.e(-1, (!z2 ? 40 : 0) + kk7.P2, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, nme.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(bkb.f0(-12763843, 0, -1));
        textView.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
        textView.setText(k96.M0(2131752577, null).toUpperCase());
        textView.setTypeface(gl.o());
        frameLayout2.addView(textView, nme.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i6 = bkb.pg;
        zkb.X(textView2, i6, wjbVar);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(bkb.f0(-12763843, 0, -1));
        textView2.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
        textView2.setText(k96.M0(2131751342, null).toUpperCase());
        textView2.setTypeface(gl.o());
        frameLayout2.addView(textView2, nme.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, nme.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        zkb.s(imageView, i6, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        linearLayout.addView(imageView, nme.o(56, 48));
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                wjb wjbVar2 = wjbVar;
                l58 l58Var = this.b;
                switch (b3) {
                    case 0:
                        l58Var.z0 = (byte) 0;
                        zkb.s(l58Var.A0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.B0.setColorFilter((ColorFilter) null);
                        l58Var.C0.setColorFilter((ColorFilter) null);
                        l58Var.d();
                        break;
                    case 1:
                        l58Var.z0 = (byte) 1;
                        l58Var.A0.setColorFilter((ColorFilter) null);
                        zkb.s(l58Var.B0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.C0.setColorFilter((ColorFilter) null);
                        l58Var.d();
                        break;
                    default:
                        l58Var.z0 = (byte) 2;
                        l58Var.A0.setColorFilter((ColorFilter) null);
                        l58Var.B0.setColorFilter((ColorFilter) null);
                        zkb.s(l58Var.C0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.d();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        imageView2.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        linearLayout.addView(imageView2, nme.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                wjb wjbVar2 = wjbVar;
                l58 l58Var = this.b;
                switch (b3) {
                    case 0:
                        l58Var.z0 = (byte) 0;
                        zkb.s(l58Var.A0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.B0.setColorFilter((ColorFilter) null);
                        l58Var.C0.setColorFilter((ColorFilter) null);
                        l58Var.d();
                        break;
                    case 1:
                        l58Var.z0 = (byte) 1;
                        l58Var.A0.setColorFilter((ColorFilter) null);
                        zkb.s(l58Var.B0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.C0.setColorFilter((ColorFilter) null);
                        l58Var.d();
                        break;
                    default:
                        l58Var.z0 = (byte) 2;
                        l58Var.A0.setColorFilter((ColorFilter) null);
                        l58Var.B0.setColorFilter((ColorFilter) null);
                        zkb.s(l58Var.C0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.d();
                        break;
                }
            }
        });
        if (kacVar != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        linearLayout.addView(imageView3, nme.o(56, 48));
        final byte b3 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: g58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                wjb wjbVar2 = wjbVar;
                l58 l58Var = this.b;
                switch (b32) {
                    case 0:
                        l58Var.z0 = (byte) 0;
                        zkb.s(l58Var.A0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.B0.setColorFilter((ColorFilter) null);
                        l58Var.C0.setColorFilter((ColorFilter) null);
                        l58Var.d();
                        break;
                    case 1:
                        l58Var.z0 = (byte) 1;
                        l58Var.A0.setColorFilter((ColorFilter) null);
                        zkb.s(l58Var.B0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.C0.setColorFilter((ColorFilter) null);
                        l58Var.d();
                        break;
                    default:
                        l58Var.z0 = (byte) 2;
                        l58Var.A0.setColorFilter((ColorFilter) null);
                        l58Var.B0.setColorFilter((ColorFilter) null);
                        zkb.s(l58Var.C0, bkb.pg, wjbVar2, PorterDuff.Mode.MULTIPLY);
                        l58Var.d();
                        break;
                }
            }
        });
        xz1 xz1Var = new xz1(context, (byte) 1);
        this.n0 = xz1Var;
        t26 t26Var = new t26();
        t26Var.i1(1);
        xz1Var.setLayoutManager(t26Var);
        xz1Var.setClipToPadding(false);
        xz1Var.setOverScrollMode(2);
        xz1Var.setAdapter(new s20(this, context, (byte) 11));
        frameLayout.addView(xz1Var, nme.e(-1, (!z2 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.u0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, nme.d(-1, 78.0f, 1, 0.0f, (!z2 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, nme.e(-2, -2, 1));
        int i7 = 0;
        while (i7 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i7));
            this.v0[i7] = new RadioButton(context);
            this.v0[i7].setSize(gl.L(20.0f));
            frameLayout4.addView(this.v0[i7], nme.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i7 == 0) {
                String M0 = k96.M0(2131751680, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.v0[i7].b(-1, -1);
            } else if (i7 == 1) {
                String M02 = k96.M0(2131751677, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.v0[i7].b(-1684147, -1684147);
            } else if (i7 == 2) {
                String M03 = k96.M0(2131751678, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.v0[i7].b(-10831009, -10831009);
            } else if (i7 == 3) {
                String M04 = k96.M0(2131751679, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.v0[i7].b(-12734994, -12734994);
            }
            frameLayout4.addView(textView3, nme.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, nme.k(i7 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            final byte b4 = 0;
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: h58
                public final /* synthetic */ l58 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b5 = b4;
                    l58 l58Var = this.b;
                    switch (b5) {
                        case 0:
                            int intValue = ((Integer) view.getTag()).intValue();
                            l58Var.a0.a = intValue;
                            int i8 = 0;
                            while (i8 < 4) {
                                l58Var.v0[i8].a(i8 == intValue, true);
                                i8++;
                            }
                            l58Var.q0.invalidate();
                            break;
                        case 1:
                            l58Var.U = 0;
                            l58Var.f();
                            l58Var.p0.setVisibility(4);
                            td4 td4Var = l58Var.m0;
                            if (td4Var != null) {
                                td4Var.b(false, false, false);
                                break;
                            }
                            break;
                        case 2:
                            l58Var.U = 1;
                            l58Var.f();
                            c58 c58Var2 = l58Var.p0;
                            c58Var2.setVisibility(0);
                            c58Var2.setType(1);
                            td4 td4Var2 = l58Var.m0;
                            if (td4Var2 != null) {
                                td4Var2.b(false, false, false);
                                break;
                            }
                            break;
                        default:
                            l58Var.U = 2;
                            l58Var.f();
                            c58 c58Var3 = l58Var.p0;
                            c58Var3.setVisibility(0);
                            c58Var3.setType(0);
                            td4 td4Var3 = l58Var.m0;
                            if (td4Var3 != null) {
                                td4Var3.b(false, false, false);
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
        this.g0.addView(frameLayout5, nme.d(kk7.C4, 60.0f, 1, 0.0f, (!z2 ? 40 : 0) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.r0 = textView4;
        textView4.setCompoundDrawablePadding(gl.L(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(k96.M0(2131753670, null));
        frameLayout5.addView(textView4, nme.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: h58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b;
                l58 l58Var = this.b;
                switch (b5) {
                    case 0:
                        int intValue = ((Integer) view.getTag()).intValue();
                        l58Var.a0.a = intValue;
                        int i8 = 0;
                        while (i8 < 4) {
                            l58Var.v0[i8].a(i8 == intValue, true);
                            i8++;
                        }
                        l58Var.q0.invalidate();
                        break;
                    case 1:
                        l58Var.U = 0;
                        l58Var.f();
                        l58Var.p0.setVisibility(4);
                        td4 td4Var = l58Var.m0;
                        if (td4Var != null) {
                            td4Var.b(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        l58Var.U = 1;
                        l58Var.f();
                        c58 c58Var2 = l58Var.p0;
                        c58Var2.setVisibility(0);
                        c58Var2.setType(1);
                        td4 td4Var2 = l58Var.m0;
                        if (td4Var2 != null) {
                            td4Var2.b(false, false, false);
                            break;
                        }
                        break;
                    default:
                        l58Var.U = 2;
                        l58Var.f();
                        c58 c58Var3 = l58Var.p0;
                        c58Var3.setVisibility(0);
                        c58Var3.setType(0);
                        td4 td4Var3 = l58Var.m0;
                        if (td4Var3 != null) {
                            td4Var3.b(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.s0 = textView5;
        textView5.setCompoundDrawablePadding(gl.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(k96.M0(2131753669, null));
        frameLayout5.addView(textView5, nme.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final byte b5 = 2;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: h58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b5;
                l58 l58Var = this.b;
                switch (b52) {
                    case 0:
                        int intValue = ((Integer) view.getTag()).intValue();
                        l58Var.a0.a = intValue;
                        int i8 = 0;
                        while (i8 < 4) {
                            l58Var.v0[i8].a(i8 == intValue, true);
                            i8++;
                        }
                        l58Var.q0.invalidate();
                        break;
                    case 1:
                        l58Var.U = 0;
                        l58Var.f();
                        l58Var.p0.setVisibility(4);
                        td4 td4Var = l58Var.m0;
                        if (td4Var != null) {
                            td4Var.b(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        l58Var.U = 1;
                        l58Var.f();
                        c58 c58Var2 = l58Var.p0;
                        c58Var2.setVisibility(0);
                        c58Var2.setType(1);
                        td4 td4Var2 = l58Var.m0;
                        if (td4Var2 != null) {
                            td4Var2.b(false, false, false);
                            break;
                        }
                        break;
                    default:
                        l58Var.U = 2;
                        l58Var.f();
                        c58 c58Var3 = l58Var.p0;
                        c58Var3.setVisibility(0);
                        c58Var3.setType(0);
                        td4 td4Var3 = l58Var.m0;
                        if (td4Var3 != null) {
                            td4Var3.b(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.t0 = textView6;
        textView6.setCompoundDrawablePadding(gl.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(k96.M0(2131753671, null));
        frameLayout5.addView(textView6, nme.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final byte b6 = 3;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: h58
            public final /* synthetic */ l58 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b52 = b6;
                l58 l58Var = this.b;
                switch (b52) {
                    case 0:
                        int intValue = ((Integer) view.getTag()).intValue();
                        l58Var.a0.a = intValue;
                        int i8 = 0;
                        while (i8 < 4) {
                            l58Var.v0[i8].a(i8 == intValue, true);
                            i8++;
                        }
                        l58Var.q0.invalidate();
                        break;
                    case 1:
                        l58Var.U = 0;
                        l58Var.f();
                        l58Var.p0.setVisibility(4);
                        td4 td4Var = l58Var.m0;
                        if (td4Var != null) {
                            td4Var.b(false, false, false);
                            break;
                        }
                        break;
                    case 2:
                        l58Var.U = 1;
                        l58Var.f();
                        c58 c58Var2 = l58Var.p0;
                        c58Var2.setVisibility(0);
                        c58Var2.setType(1);
                        td4 td4Var2 = l58Var.m0;
                        if (td4Var2 != null) {
                            td4Var2.b(false, false, false);
                            break;
                        }
                        break;
                    default:
                        l58Var.U = 2;
                        l58Var.f();
                        c58 c58Var3 = l58Var.p0;
                        c58Var3.setVisibility(0);
                        c58Var3.setType(0);
                        td4 td4Var3 = l58Var.m0;
                        if (td4Var3 != null) {
                            td4Var3.b(false, false, false);
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
            ((FrameLayout.LayoutParams) this.j0.getLayoutParams()).topMargin = gl.m;
        }
        ((FrameLayout.LayoutParams) this.q0.getLayoutParams()).topMargin = gl.m;
    }

    private void setShowOriginal(boolean z) {
        if (this.a != z) {
            this.a = z;
            td4 td4Var = this.m0;
            if (td4Var != null) {
                td4Var.b(false, false, false);
            }
        }
    }

    public final boolean a() {
        lm6 lm6Var = this.f0;
        float f = this.H;
        ko koVar = this.a0;
        return lm6Var != null ? (f == lm6Var.a && this.J == lm6Var.d && this.Q == lm6Var.j && this.I == lm6Var.c && this.K == lm6Var.e && this.L == lm6Var.f && this.S == lm6Var.l && this.R == lm6Var.k && this.T == lm6Var.m && this.V == lm6Var.o && this.M == lm6Var.g && this.N == lm6Var.b && this.P == lm6Var.i && this.O == lm6Var.h && koVar.o()) ? false : true : (f == 0.0f && this.J == 0.0f && this.Q == 0.0f && this.I == 0.0f && this.K == 0.0f && this.L == 0.0f && this.S == 0.0f && this.R == 0.0f && this.T == 0.0f && this.V == 0.0f && this.M == 0.0f && this.N == 0.0f && this.P == 0 && this.O == 0 && koVar.o()) ? false : true;
    }

    @Override // vd4
    public final ByteBuffer b() {
        ko koVar = this.a0;
        koVar.c();
        return (ByteBuffer) koVar.f;
    }

    public final void c() {
        boolean z = this.k0;
        TextureView textureView = this.j0;
        if (z) {
            td4 td4Var = this.m0;
            if (td4Var != null) {
                td4Var.postRunnable(new rd4(td4Var, (byte) 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof kac) {
            kac kacVar = (kac) textureView;
            lm6 lm6Var = this.f0;
            if (lm6Var == null) {
                kacVar.setDelegate(null);
                return;
            }
            td4 td4Var2 = this.m0;
            if (td4Var2 != null) {
                td4Var2.c(new z24((Object) lm6Var, (byte) 1));
            }
        }
    }

    public final void d() {
        byte b = this.z0;
        xz1 xz1Var = this.n0;
        e58 e58Var = this.q0;
        FrameLayout frameLayout = this.u0;
        FrameLayout frameLayout2 = this.o0;
        c58 c58Var = this.p0;
        if (b == 0) {
            c58Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            e58Var.setVisibility(4);
            xz1Var.setVisibility(0);
            return;
        }
        if (b == 1) {
            xz1Var.setVisibility(4);
            frameLayout.setVisibility(4);
            e58Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                c58Var.setVisibility(0);
            }
            f();
            return;
        }
        if (b == 2) {
            xz1Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            c58Var.setVisibility(4);
            frameLayout.setVisibility(0);
            e58Var.setVisibility(0);
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
        ju7 ju7Var = this.w0;
        if (ju7Var != null && view == (textureView = this.j0)) {
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
            float measuredWidth2 = textureView.getMeasuredWidth() / ju7Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            ju7Var.draw(canvas);
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
        wjb wjbVar = this.J0;
        TextView textView3 = this.r0;
        if (i == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i2 = bkb.pg;
            zkb.x(this, mutate, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(bkb.v0(i2, wjbVar));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i3 = bkb.pg;
            zkb.x(this, mutate2, i3, wjbVar, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(bkb.v0(i3, wjbVar));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i4 = bkb.pg;
            zkb.x(this, mutate3, i4, wjbVar, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(bkb.v0(i4, wjbVar));
        }
        e();
    }

    public Bitmap getBitmap() {
        td4 td4Var = this.m0;
        if (td4Var == null || !td4Var.f || !td4Var.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (td4Var.postRunnable(new mg3(td4Var, bitmapArr, countDownLatch, (byte) 29))) {
                countDownLatch.await();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        return bitmapArr[0];
    }

    @Override // vd4
    public float getBlurAngle() {
        return this.e0;
    }

    public c58 getBlurControl() {
        return this.p0;
    }

    @Override // vd4
    public float getBlurExcludeBlurSize() {
        return this.d0;
    }

    @Override // vd4
    public PointF getBlurExcludePoint() {
        return this.c0;
    }

    @Override // vd4
    public float getBlurExcludeSize() {
        return this.b0;
    }

    @Override // vd4
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.i0;
    }

    @Override // vd4
    public float getContrastValue() {
        return b00.A(this.J, 100.0f, 0.3f, 1.0f);
    }

    public e58 getCurveControl() {
        return this.q0;
    }

    public TextView getDoneTextView() {
        return this.h0;
    }

    @Override // vd4
    public float getEnhanceValue() {
        return this.H / 100.0f;
    }

    @Override // vd4
    public float getExposureValue() {
        return this.I / 100.0f;
    }

    @Override // vd4
    public float getFadeValue() {
        return this.M / 100.0f;
    }

    @Override // vd4
    public float getGrainValue() {
        return (this.T / 100.0f) * 0.04f;
    }

    @Override // vd4
    public float getHighlightsValue() {
        return b00.y(this.Q, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.k0 || this.l0) {
            return null;
        }
        return this.j0;
    }

    @Override // vd4
    public float getSaturationValue() {
        float f = this.L / 100.0f;
        if (f > 0.0f) {
            f *= 1.05f;
        }
        return f + 1.0f;
    }

    public lm6 getSavedFilterState() {
        lm6 lm6Var = new lm6();
        lm6Var.a = this.H;
        lm6Var.c = this.I;
        lm6Var.d = this.J;
        lm6Var.e = this.K;
        lm6Var.f = this.L;
        lm6Var.g = this.M;
        lm6Var.b = this.N;
        lm6Var.h = this.O;
        lm6Var.i = this.P;
        lm6Var.j = this.Q;
        lm6Var.k = this.R;
        lm6Var.l = this.S;
        lm6Var.m = this.T;
        lm6Var.n = this.U;
        lm6Var.o = this.V;
        lm6Var.p = this.a0;
        lm6Var.q = this.b0;
        lm6Var.r = this.c0;
        lm6Var.s = this.d0;
        lm6Var.t = this.e0;
        this.f0 = lm6Var;
        return lm6Var;
    }

    @Override // vd4
    public float getShadowsValue() {
        return b00.y(this.R, 0.55f, 100.0f, 100.0f);
    }

    @Override // vd4
    public float getSharpenValue() {
        return b00.A(this.V, 100.0f, 0.6f, 0.11f);
    }

    @Override // vd4
    public float getSoftenSkinValue() {
        return this.N / 100.0f;
    }

    @Override // vd4
    public int getTintHighlightsColor() {
        return this.P;
    }

    @Override // vd4
    public float getTintHighlightsIntensityValue() {
        return this.P == 0 ? 0.0f : 0.5f;
    }

    @Override // vd4
    public int getTintShadowsColor() {
        return this.O;
    }

    @Override // vd4
    public float getTintShadowsIntensityValue() {
        return this.O == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.g0;
    }

    public Bitmap getUiBlurBitmap() {
        xl0 xl0Var;
        td4 td4Var = this.m0;
        if (td4Var == null || (xl0Var = td4Var.J) == null) {
            return null;
        }
        synchronized (xl0Var.n) {
            if (xl0Var.q) {
                return xl0Var.p;
            }
            return null;
        }
    }

    @Override // vd4
    public float getVignetteValue() {
        return this.S / 100.0f;
    }

    @Override // vd4
    public float getWarmthValue() {
        return this.K / 100.0f;
    }

    @Override // p7b
    public final boolean h(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.j0;
            if (textureView instanceof kac) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                l29 l29Var = ((kac) textureView).c;
                float f = l29Var.a;
                if (x >= f && x <= f + l29Var.c) {
                    float f2 = l29Var.b;
                    if (y >= f2 && y <= f2 + l29Var.d) {
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

    @Override // vd4
    public final boolean m() {
        return this.a || this.W;
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
            int L = size - gl.L(28.0f);
            int L2 = gl.L(214.0f);
            boolean z = this.y0;
            int i3 = size2 - (L2 + (!z ? gl.m : 0));
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
            int ceil2 = (int) Math.ceil(((f2 - f) / 2.0f) + gl.L(14.0f));
            int ceil3 = (int) Math.ceil(((f3 - ceil) / 2.0f) + gl.L(14.0f) + (!z ? gl.m : 0));
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
            float f5 = ceil3 - (!z ? gl.m : 0);
            float f6 = i5;
            float f7 = i6;
            e58 e58Var = this.q0;
            l29 l29Var = e58Var.e;
            l29Var.a = f4;
            l29Var.b = f5;
            l29Var.c = f6;
            l29Var.d = f7;
            c58 c58Var = this.p0;
            via viaVar = c58Var.d;
            viaVar.a = f6;
            viaVar.b = f7;
            ((FrameLayout.LayoutParams) c58Var.getLayoutParams()).height = gl.L(38.0f) + i3;
            ((FrameLayout.LayoutParams) e58Var.getLayoutParams()).height = gl.L(28.0f) + i3;
            if (gl.O1()) {
                int L3 = gl.L(86.0f) * 10;
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
            xz1 xz1Var = this.n0;
            if (i >= xz1Var.getChildCount()) {
                break;
            }
            View childAt = xz1Var.getChildAt(i);
            if ((childAt instanceof x48) && RecyclerView.R(childAt) == this.b) {
                ((x48) childAt).a(k96.M0(2131751114, null), 0, this.H);
                break;
            }
            i++;
        }
        td4 td4Var = this.m0;
        if (td4Var != null) {
            td4Var.b(true, false, false);
        }
    }

    @Override // vd4
    public final boolean t() {
        return !this.a0.o();
    }
}
