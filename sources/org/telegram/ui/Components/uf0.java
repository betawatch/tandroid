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
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.BubbleActivity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class uf0 extends FrameLayout implements yz, ci.kc {
    public final ImageView A0;
    public final ImageView B0;
    public final Bitmap C0;
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
    public final qf0 W;
    public boolean a;
    public float a0;
    public final int b;
    public PointF b0;
    public final int c;
    public float c0;
    public final int d;
    public float d0;
    public final int e;
    public MediaController.SavedFilterState e0;
    public final int f;
    public final FrameLayout f0;
    public final TextView g0;
    public final int h;
    public final TextView h0;
    public final TextureView i0;
    public final boolean j0;
    public final boolean k0;
    public vz l0;
    public final yh m0;
    public final int n;
    public final FrameLayout n0;
    public final jf0 o0;
    public final lf0 p0;
    public final TextView q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final FrameLayout t0;
    public final RadioButton[] u0;
    public final int v;
    public final rd0 v0;
    public final int w;
    public final boolean w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public int y0;
    public final ImageView z0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0559  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uf0(Context context, l71 l71Var, Bitmap bitmap, Bitmap bitmap2, int i10, MediaController.SavedFilterState savedFilterState, rd0 rd0Var, int i11, boolean z10, boolean z11, ia iaVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.u0 = new RadioButton[4];
        this.E0 = new Rect();
        this.F0 = new Matrix();
        this.G0 = new Paint(2);
        this.k0 = z11;
        this.I0 = f6Var;
        boolean z12 = context instanceof BubbleActivity;
        this.x0 = z12;
        this.v0 = rd0Var;
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
        this.v = i12 + 8;
        if (i11 == 2) {
            this.F = i12 + 10;
            this.n = i13;
        }
        if (l71Var == null) {
            int i14 = this.F;
            this.F = i14 + 1;
            this.w = i14;
        } else {
            this.w = -1;
        }
        int i15 = this.F;
        this.x = i15;
        this.y = i15 + 1;
        this.F = i15 + 3;
        this.E = i15 + 2;
        if (savedFilterState != null) {
            this.G = savedFilterState.enhanceValue;
            this.M = savedFilterState.softenSkinValue;
            this.H = savedFilterState.exposureValue;
            this.I = savedFilterState.contrastValue;
            this.J = savedFilterState.warmthValue;
            this.K = savedFilterState.saturationValue;
            this.L = savedFilterState.fadeValue;
            this.N = savedFilterState.tintShadowsColor;
            this.O = savedFilterState.tintHighlightsColor;
            this.P = savedFilterState.highlightsValue;
            this.Q = savedFilterState.shadowsValue;
            this.R = savedFilterState.vignetteValue;
            this.S = savedFilterState.grainValue;
            this.T = savedFilterState.blurType;
            this.U = savedFilterState.sharpenValue;
            this.W = savedFilterState.curvesToolValue;
            this.a0 = savedFilterState.blurExcludeSize;
            this.b0 = savedFilterState.blurExcludePoint;
            this.c0 = savedFilterState.blurExcludeBlurSize;
            this.V = savedFilterState.isEmpty();
            this.d0 = savedFilterState.blurAngle;
            this.e0 = savedFilterState;
        } else {
            this.W = new qf0();
            this.a0 = 0.35f;
            this.b0 = new PointF(0.5f, 0.5f);
            this.c0 = 0.15f;
            this.d0 = 1.5707964f;
            this.V = true;
        }
        this.C0 = bitmap;
        this.D0 = bitmap2;
        this.H0 = i10;
        if (l71Var != null) {
            this.i0 = l71Var;
            l71Var.setDelegate(new mf0(this));
        } else {
            this.j0 = true;
            of0 of0Var = new of0(this, context);
            this.i0 = of0Var;
            if (z11) {
                addView(of0Var, w7.y5.e(-1, -1, 51));
            }
            of0Var.setVisibility(4);
            of0Var.setSurfaceTextureListener(new pf0(this, z11, iaVar));
        }
        jf0 jf0Var = new jf0(context);
        jf0Var.a = new PointF();
        jf0Var.d = new wv0();
        jf0Var.e = new PointF(0.5f, 0.5f);
        jf0Var.f = 0.15f;
        jf0Var.h = 0.35f;
        jf0Var.r = new RectF();
        jf0Var.x = 1.0f;
        jf0Var.F = true;
        Paint paint = new Paint(1);
        jf0Var.I = paint;
        Paint paint2 = new Paint(1);
        jf0Var.J = paint2;
        jf0Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        jf0Var.K = z12;
        this.o0 = jf0Var;
        jf0Var.setVisibility(4);
        if (z11) {
            addView(jf0Var, w7.y5.e(-1, -1, 51));
        }
        jf0Var.setDelegate(new mf0(this));
        qf0 qf0Var = this.W;
        lf0 lf0Var = new lf0(context);
        lf0Var.a = 0;
        lf0Var.c = true;
        lf0Var.e = new uk0();
        Paint paint3 = new Paint(1);
        lf0Var.f = paint3;
        Paint paint4 = new Paint(1);
        lf0Var.h = paint4;
        Paint paint5 = new Paint(1);
        lf0Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        lf0Var.r = textPaint;
        lf0Var.s = new Path();
        lf0Var.setWillNotDraw(false);
        lf0Var.w = qf0Var;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.p0 = lf0Var;
        lf0Var.setDelegate(new mf0(this));
        lf0Var.setVisibility(4);
        if (z11) {
            addView(lf0Var, w7.y5.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f0 = frameLayout;
        addView(frameLayout, w7.y5.e(-1, (!z11 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, w7.y5.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.h0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout2, textView, w7.y5.e(-2, -1, 51), context);
        this.g0 = h;
        h.setTextSize(1, 14.0f);
        int i16 = org.telegram.ui.ActionBar.j6.zf;
        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var));
        h.setGravity(17);
        h.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        h.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        h.setText(LocaleController.getString(R.string.Done).toUpperCase());
        h.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(h, w7.y5.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, w7.y5.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.z0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i16, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView, w7.y5.n(56, 48));
        final int i17 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
            public final /* synthetic */ uf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        uf0 uf0Var = this.b;
                        uf0Var.y0 = 0;
                        uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var.A0.setColorFilter((ColorFilter) null);
                        uf0Var.B0.setColorFilter((ColorFilter) null);
                        uf0Var.f();
                        break;
                    case 1:
                        uf0 uf0Var2 = this.b;
                        uf0Var2.y0 = 1;
                        uf0Var2.z0.setColorFilter((ColorFilter) null);
                        uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var2.B0.setColorFilter((ColorFilter) null);
                        uf0Var2.f();
                        break;
                    case 2:
                        uf0 uf0Var3 = this.b;
                        uf0Var3.y0 = 2;
                        uf0Var3.z0.setColorFilter((ColorFilter) null);
                        uf0Var3.A0.setColorFilter((ColorFilter) null);
                        uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var3.f();
                        break;
                    case 3:
                        uf0 uf0Var4 = this.b;
                        uf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        uf0Var4.W.f = intValue;
                        int i18 = 0;
                        while (i18 < 4) {
                            uf0Var4.u0[i18].a(i18 == intValue, true);
                            i18++;
                        }
                        uf0Var4.p0.invalidate();
                        break;
                    case 4:
                        uf0 uf0Var5 = this.b;
                        uf0Var5.T = 0;
                        uf0Var5.h();
                        uf0Var5.o0.setVisibility(4);
                        vz vzVar = uf0Var5.l0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        uf0 uf0Var6 = this.b;
                        uf0Var6.T = 1;
                        uf0Var6.h();
                        jf0 jf0Var2 = uf0Var6.o0;
                        jf0Var2.setVisibility(0);
                        jf0Var2.setType(1);
                        vz vzVar2 = uf0Var6.l0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        uf0 uf0Var7 = this.b;
                        uf0Var7.T = 2;
                        uf0Var7.h();
                        jf0 jf0Var3 = uf0Var7.o0;
                        jf0Var3.setVisibility(0);
                        jf0Var3.setType(0);
                        vz vzVar3 = uf0Var7.l0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.A0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView2, w7.y5.n(56, 48));
        final int i18 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
            public final /* synthetic */ uf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        uf0 uf0Var = this.b;
                        uf0Var.y0 = 0;
                        uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var.A0.setColorFilter((ColorFilter) null);
                        uf0Var.B0.setColorFilter((ColorFilter) null);
                        uf0Var.f();
                        break;
                    case 1:
                        uf0 uf0Var2 = this.b;
                        uf0Var2.y0 = 1;
                        uf0Var2.z0.setColorFilter((ColorFilter) null);
                        uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var2.B0.setColorFilter((ColorFilter) null);
                        uf0Var2.f();
                        break;
                    case 2:
                        uf0 uf0Var3 = this.b;
                        uf0Var3.y0 = 2;
                        uf0Var3.z0.setColorFilter((ColorFilter) null);
                        uf0Var3.A0.setColorFilter((ColorFilter) null);
                        uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var3.f();
                        break;
                    case 3:
                        uf0 uf0Var4 = this.b;
                        uf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        uf0Var4.W.f = intValue;
                        int i182 = 0;
                        while (i182 < 4) {
                            uf0Var4.u0[i182].a(i182 == intValue, true);
                            i182++;
                        }
                        uf0Var4.p0.invalidate();
                        break;
                    case 4:
                        uf0 uf0Var5 = this.b;
                        uf0Var5.T = 0;
                        uf0Var5.h();
                        uf0Var5.o0.setVisibility(4);
                        vz vzVar = uf0Var5.l0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        uf0 uf0Var6 = this.b;
                        uf0Var6.T = 1;
                        uf0Var6.h();
                        jf0 jf0Var2 = uf0Var6.o0;
                        jf0Var2.setVisibility(0);
                        jf0Var2.setType(1);
                        vz vzVar2 = uf0Var6.l0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        uf0 uf0Var7 = this.b;
                        uf0Var7.T = 2;
                        uf0Var7.h();
                        jf0 jf0Var3 = uf0Var7.o0;
                        jf0Var3.setVisibility(0);
                        jf0Var3.setType(0);
                        vz vzVar3 = uf0Var7.l0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        if (l71Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.B0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView3, w7.y5.n(56, 48));
        final int i19 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
            public final /* synthetic */ uf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        uf0 uf0Var = this.b;
                        uf0Var.y0 = 0;
                        uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var.A0.setColorFilter((ColorFilter) null);
                        uf0Var.B0.setColorFilter((ColorFilter) null);
                        uf0Var.f();
                        break;
                    case 1:
                        uf0 uf0Var2 = this.b;
                        uf0Var2.y0 = 1;
                        uf0Var2.z0.setColorFilter((ColorFilter) null);
                        uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var2.B0.setColorFilter((ColorFilter) null);
                        uf0Var2.f();
                        break;
                    case 2:
                        uf0 uf0Var3 = this.b;
                        uf0Var3.y0 = 2;
                        uf0Var3.z0.setColorFilter((ColorFilter) null);
                        uf0Var3.A0.setColorFilter((ColorFilter) null);
                        uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var3.f();
                        break;
                    case 3:
                        uf0 uf0Var4 = this.b;
                        uf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        uf0Var4.W.f = intValue;
                        int i182 = 0;
                        while (i182 < 4) {
                            uf0Var4.u0[i182].a(i182 == intValue, true);
                            i182++;
                        }
                        uf0Var4.p0.invalidate();
                        break;
                    case 4:
                        uf0 uf0Var5 = this.b;
                        uf0Var5.T = 0;
                        uf0Var5.h();
                        uf0Var5.o0.setVisibility(4);
                        vz vzVar = uf0Var5.l0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        uf0 uf0Var6 = this.b;
                        uf0Var6.T = 1;
                        uf0Var6.h();
                        jf0 jf0Var2 = uf0Var6.o0;
                        jf0Var2.setVisibility(0);
                        jf0Var2.setType(1);
                        vz vzVar2 = uf0Var6.l0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        uf0 uf0Var7 = this.b;
                        uf0Var7.T = 2;
                        uf0Var7.h();
                        jf0 jf0Var3 = uf0Var7.o0;
                        jf0Var3.setVisibility(0);
                        jf0Var3.setType(0);
                        vz vzVar3 = uf0Var7.l0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        yh yhVar = new yh(context, 1);
        this.m0 = yhVar;
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(1);
        yhVar.setLayoutManager(c0Var);
        yhVar.setClipToPadding(false);
        yhVar.setOverScrollMode(2);
        yhVar.setAdapter(new tf0(this, context));
        frameLayout.addView(yhVar, w7.y5.e(-1, (!z11 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.t0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, w7.y5.d(-1, 78.0f, 1, 0.0f, (!z11 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, w7.y5.e(-2, -2, 1));
        int i20 = 0;
        while (i20 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i20));
            this.u0[i20] = new RadioButton(context);
            this.u0[i20].setSize(AndroidUtilities.dp(20.0f));
            frameLayout4.addView(this.u0[i20], w7.y5.e(30, 30, 49));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(16);
            if (i20 == 0) {
                String string = LocaleController.getString(R.string.CurvesAll);
                textView2.setText(string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase());
                textView2.setTextColor(-1);
                this.u0[i20].b(-1, -1);
            } else if (i20 == 1) {
                String string2 = LocaleController.getString(R.string.CurvesRed);
                textView2.setText(string2.substring(0, 1).toUpperCase() + string2.substring(1).toLowerCase());
                textView2.setTextColor(-1684147);
                this.u0[i20].b(-1684147, -1684147);
            } else if (i20 == 2) {
                String string3 = LocaleController.getString(R.string.CurvesGreen);
                textView2.setText(string3.substring(0, 1).toUpperCase() + string3.substring(1).toLowerCase());
                textView2.setTextColor(-10831009);
                this.u0[i20].b(-10831009, -10831009);
                frameLayout4.addView(textView2, w7.y5.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
                linearLayout2.addView(frameLayout4, w7.y5.k(i20 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                final int i21 = 3;
                frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
                    public final /* synthetic */ uf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                uf0 uf0Var = this.b;
                                uf0Var.y0 = 0;
                                uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                                uf0Var.A0.setColorFilter((ColorFilter) null);
                                uf0Var.B0.setColorFilter((ColorFilter) null);
                                uf0Var.f();
                                break;
                            case 1:
                                uf0 uf0Var2 = this.b;
                                uf0Var2.y0 = 1;
                                uf0Var2.z0.setColorFilter((ColorFilter) null);
                                uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                                uf0Var2.B0.setColorFilter((ColorFilter) null);
                                uf0Var2.f();
                                break;
                            case 2:
                                uf0 uf0Var3 = this.b;
                                uf0Var3.y0 = 2;
                                uf0Var3.z0.setColorFilter((ColorFilter) null);
                                uf0Var3.A0.setColorFilter((ColorFilter) null);
                                uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                                uf0Var3.f();
                                break;
                            case 3:
                                uf0 uf0Var4 = this.b;
                                uf0Var4.getClass();
                                int intValue = ((Integer) view.getTag()).intValue();
                                uf0Var4.W.f = intValue;
                                int i182 = 0;
                                while (i182 < 4) {
                                    uf0Var4.u0[i182].a(i182 == intValue, true);
                                    i182++;
                                }
                                uf0Var4.p0.invalidate();
                                break;
                            case 4:
                                uf0 uf0Var5 = this.b;
                                uf0Var5.T = 0;
                                uf0Var5.h();
                                uf0Var5.o0.setVisibility(4);
                                vz vzVar = uf0Var5.l0;
                                if (vzVar != null) {
                                    vzVar.e(false, false, false);
                                    break;
                                }
                                break;
                            case 5:
                                uf0 uf0Var6 = this.b;
                                uf0Var6.T = 1;
                                uf0Var6.h();
                                jf0 jf0Var2 = uf0Var6.o0;
                                jf0Var2.setVisibility(0);
                                jf0Var2.setType(1);
                                vz vzVar2 = uf0Var6.l0;
                                if (vzVar2 != null) {
                                    vzVar2.e(false, false, false);
                                    break;
                                }
                                break;
                            default:
                                uf0 uf0Var7 = this.b;
                                uf0Var7.T = 2;
                                uf0Var7.h();
                                jf0 jf0Var3 = uf0Var7.o0;
                                jf0Var3.setVisibility(0);
                                jf0Var3.setType(0);
                                vz vzVar3 = uf0Var7.l0;
                                if (vzVar3 != null) {
                                    vzVar3.e(false, false, false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                i20++;
            } else {
                if (i20 == 3) {
                    String string4 = LocaleController.getString(R.string.CurvesBlue);
                    textView2.setText(string4.substring(0, 1).toUpperCase() + string4.substring(1).toLowerCase());
                    textView2.setTextColor(-12734994);
                    this.u0[i20].b(-12734994, -12734994);
                }
                frameLayout4.addView(textView2, w7.y5.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
                linearLayout2.addView(frameLayout4, w7.y5.k(i20 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                final int i212 = 3;
                frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
                    public final /* synthetic */ uf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i212) {
                            case 0:
                                uf0 uf0Var = this.b;
                                uf0Var.y0 = 0;
                                uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                                uf0Var.A0.setColorFilter((ColorFilter) null);
                                uf0Var.B0.setColorFilter((ColorFilter) null);
                                uf0Var.f();
                                break;
                            case 1:
                                uf0 uf0Var2 = this.b;
                                uf0Var2.y0 = 1;
                                uf0Var2.z0.setColorFilter((ColorFilter) null);
                                uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                                uf0Var2.B0.setColorFilter((ColorFilter) null);
                                uf0Var2.f();
                                break;
                            case 2:
                                uf0 uf0Var3 = this.b;
                                uf0Var3.y0 = 2;
                                uf0Var3.z0.setColorFilter((ColorFilter) null);
                                uf0Var3.A0.setColorFilter((ColorFilter) null);
                                uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                                uf0Var3.f();
                                break;
                            case 3:
                                uf0 uf0Var4 = this.b;
                                uf0Var4.getClass();
                                int intValue = ((Integer) view.getTag()).intValue();
                                uf0Var4.W.f = intValue;
                                int i182 = 0;
                                while (i182 < 4) {
                                    uf0Var4.u0[i182].a(i182 == intValue, true);
                                    i182++;
                                }
                                uf0Var4.p0.invalidate();
                                break;
                            case 4:
                                uf0 uf0Var5 = this.b;
                                uf0Var5.T = 0;
                                uf0Var5.h();
                                uf0Var5.o0.setVisibility(4);
                                vz vzVar = uf0Var5.l0;
                                if (vzVar != null) {
                                    vzVar.e(false, false, false);
                                    break;
                                }
                                break;
                            case 5:
                                uf0 uf0Var6 = this.b;
                                uf0Var6.T = 1;
                                uf0Var6.h();
                                jf0 jf0Var2 = uf0Var6.o0;
                                jf0Var2.setVisibility(0);
                                jf0Var2.setType(1);
                                vz vzVar2 = uf0Var6.l0;
                                if (vzVar2 != null) {
                                    vzVar2.e(false, false, false);
                                    break;
                                }
                                break;
                            default:
                                uf0 uf0Var7 = this.b;
                                uf0Var7.T = 2;
                                uf0Var7.h();
                                jf0 jf0Var3 = uf0Var7.o0;
                                jf0Var3.setVisibility(0);
                                jf0Var3.setType(0);
                                vz vzVar3 = uf0Var7.l0;
                                if (vzVar3 != null) {
                                    vzVar3.e(false, false, false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                i20++;
            }
            frameLayout4.addView(textView2, w7.y5.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, w7.y5.k(i20 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            final int i2122 = 3;
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
                public final /* synthetic */ uf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2122) {
                        case 0:
                            uf0 uf0Var = this.b;
                            uf0Var.y0 = 0;
                            uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                            uf0Var.A0.setColorFilter((ColorFilter) null);
                            uf0Var.B0.setColorFilter((ColorFilter) null);
                            uf0Var.f();
                            break;
                        case 1:
                            uf0 uf0Var2 = this.b;
                            uf0Var2.y0 = 1;
                            uf0Var2.z0.setColorFilter((ColorFilter) null);
                            uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                            uf0Var2.B0.setColorFilter((ColorFilter) null);
                            uf0Var2.f();
                            break;
                        case 2:
                            uf0 uf0Var3 = this.b;
                            uf0Var3.y0 = 2;
                            uf0Var3.z0.setColorFilter((ColorFilter) null);
                            uf0Var3.A0.setColorFilter((ColorFilter) null);
                            uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                            uf0Var3.f();
                            break;
                        case 3:
                            uf0 uf0Var4 = this.b;
                            uf0Var4.getClass();
                            int intValue = ((Integer) view.getTag()).intValue();
                            uf0Var4.W.f = intValue;
                            int i182 = 0;
                            while (i182 < 4) {
                                uf0Var4.u0[i182].a(i182 == intValue, true);
                                i182++;
                            }
                            uf0Var4.p0.invalidate();
                            break;
                        case 4:
                            uf0 uf0Var5 = this.b;
                            uf0Var5.T = 0;
                            uf0Var5.h();
                            uf0Var5.o0.setVisibility(4);
                            vz vzVar = uf0Var5.l0;
                            if (vzVar != null) {
                                vzVar.e(false, false, false);
                                break;
                            }
                            break;
                        case 5:
                            uf0 uf0Var6 = this.b;
                            uf0Var6.T = 1;
                            uf0Var6.h();
                            jf0 jf0Var2 = uf0Var6.o0;
                            jf0Var2.setVisibility(0);
                            jf0Var2.setType(1);
                            vz vzVar2 = uf0Var6.l0;
                            if (vzVar2 != null) {
                                vzVar2.e(false, false, false);
                                break;
                            }
                            break;
                        default:
                            uf0 uf0Var7 = this.b;
                            uf0Var7.T = 2;
                            uf0Var7.h();
                            jf0 jf0Var3 = uf0Var7.o0;
                            jf0Var3.setVisibility(0);
                            jf0Var3.setType(0);
                            vz vzVar3 = uf0Var7.l0;
                            if (vzVar3 != null) {
                                vzVar3.e(false, false, false);
                                break;
                            }
                            break;
                    }
                }
            });
            i20++;
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.n0 = frameLayout5;
        frameLayout5.setVisibility(4);
        this.f0.addView(frameLayout5, w7.y5.d(280, 60.0f, 1, 0.0f, (z11 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.q0 = textView3;
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString(R.string.BlurOff));
        frameLayout5.addView(textView3, w7.y5.c(60.0f, 80));
        final int i22 = 4;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
            public final /* synthetic */ uf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        uf0 uf0Var = this.b;
                        uf0Var.y0 = 0;
                        uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var.A0.setColorFilter((ColorFilter) null);
                        uf0Var.B0.setColorFilter((ColorFilter) null);
                        uf0Var.f();
                        break;
                    case 1:
                        uf0 uf0Var2 = this.b;
                        uf0Var2.y0 = 1;
                        uf0Var2.z0.setColorFilter((ColorFilter) null);
                        uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var2.B0.setColorFilter((ColorFilter) null);
                        uf0Var2.f();
                        break;
                    case 2:
                        uf0 uf0Var3 = this.b;
                        uf0Var3.y0 = 2;
                        uf0Var3.z0.setColorFilter((ColorFilter) null);
                        uf0Var3.A0.setColorFilter((ColorFilter) null);
                        uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var3.f();
                        break;
                    case 3:
                        uf0 uf0Var4 = this.b;
                        uf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        uf0Var4.W.f = intValue;
                        int i182 = 0;
                        while (i182 < 4) {
                            uf0Var4.u0[i182].a(i182 == intValue, true);
                            i182++;
                        }
                        uf0Var4.p0.invalidate();
                        break;
                    case 4:
                        uf0 uf0Var5 = this.b;
                        uf0Var5.T = 0;
                        uf0Var5.h();
                        uf0Var5.o0.setVisibility(4);
                        vz vzVar = uf0Var5.l0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        uf0 uf0Var6 = this.b;
                        uf0Var6.T = 1;
                        uf0Var6.h();
                        jf0 jf0Var2 = uf0Var6.o0;
                        jf0Var2.setVisibility(0);
                        jf0Var2.setType(1);
                        vz vzVar2 = uf0Var6.l0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        uf0 uf0Var7 = this.b;
                        uf0Var7.T = 2;
                        uf0Var7.h();
                        jf0 jf0Var3 = uf0Var7.o0;
                        jf0Var3.setVisibility(0);
                        jf0Var3.setType(0);
                        vz vzVar3 = uf0Var7.l0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.r0 = textView4;
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(LocaleController.getString(R.string.BlurRadial));
        frameLayout5.addView(textView4, w7.y5.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i23 = 5;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
            public final /* synthetic */ uf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23) {
                    case 0:
                        uf0 uf0Var = this.b;
                        uf0Var.y0 = 0;
                        uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var.A0.setColorFilter((ColorFilter) null);
                        uf0Var.B0.setColorFilter((ColorFilter) null);
                        uf0Var.f();
                        break;
                    case 1:
                        uf0 uf0Var2 = this.b;
                        uf0Var2.y0 = 1;
                        uf0Var2.z0.setColorFilter((ColorFilter) null);
                        uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var2.B0.setColorFilter((ColorFilter) null);
                        uf0Var2.f();
                        break;
                    case 2:
                        uf0 uf0Var3 = this.b;
                        uf0Var3.y0 = 2;
                        uf0Var3.z0.setColorFilter((ColorFilter) null);
                        uf0Var3.A0.setColorFilter((ColorFilter) null);
                        uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var3.f();
                        break;
                    case 3:
                        uf0 uf0Var4 = this.b;
                        uf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        uf0Var4.W.f = intValue;
                        int i182 = 0;
                        while (i182 < 4) {
                            uf0Var4.u0[i182].a(i182 == intValue, true);
                            i182++;
                        }
                        uf0Var4.p0.invalidate();
                        break;
                    case 4:
                        uf0 uf0Var5 = this.b;
                        uf0Var5.T = 0;
                        uf0Var5.h();
                        uf0Var5.o0.setVisibility(4);
                        vz vzVar = uf0Var5.l0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        uf0 uf0Var6 = this.b;
                        uf0Var6.T = 1;
                        uf0Var6.h();
                        jf0 jf0Var2 = uf0Var6.o0;
                        jf0Var2.setVisibility(0);
                        jf0Var2.setType(1);
                        vz vzVar2 = uf0Var6.l0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        uf0 uf0Var7 = this.b;
                        uf0Var7.T = 2;
                        uf0Var7.h();
                        jf0 jf0Var3 = uf0Var7.o0;
                        jf0Var3.setVisibility(0);
                        jf0Var3.setType(0);
                        vz vzVar3 = uf0Var7.l0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.s0 = textView5;
        textView5.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(LocaleController.getString(R.string.BlurLinear));
        frameLayout5.addView(textView5, w7.y5.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i24 = 6;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.nf0
            public final /* synthetic */ uf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i24) {
                    case 0:
                        uf0 uf0Var = this.b;
                        uf0Var.y0 = 0;
                        uf0Var.z0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var.A0.setColorFilter((ColorFilter) null);
                        uf0Var.B0.setColorFilter((ColorFilter) null);
                        uf0Var.f();
                        break;
                    case 1:
                        uf0 uf0Var2 = this.b;
                        uf0Var2.y0 = 1;
                        uf0Var2.z0.setColorFilter((ColorFilter) null);
                        uf0Var2.A0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var2.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var2.B0.setColorFilter((ColorFilter) null);
                        uf0Var2.f();
                        break;
                    case 2:
                        uf0 uf0Var3 = this.b;
                        uf0Var3.y0 = 2;
                        uf0Var3.z0.setColorFilter((ColorFilter) null);
                        uf0Var3.A0.setColorFilter((ColorFilter) null);
                        uf0Var3.B0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, uf0Var3.I0), PorterDuff.Mode.MULTIPLY));
                        uf0Var3.f();
                        break;
                    case 3:
                        uf0 uf0Var4 = this.b;
                        uf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        uf0Var4.W.f = intValue;
                        int i182 = 0;
                        while (i182 < 4) {
                            uf0Var4.u0[i182].a(i182 == intValue, true);
                            i182++;
                        }
                        uf0Var4.p0.invalidate();
                        break;
                    case 4:
                        uf0 uf0Var5 = this.b;
                        uf0Var5.T = 0;
                        uf0Var5.h();
                        uf0Var5.o0.setVisibility(4);
                        vz vzVar = uf0Var5.l0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        uf0 uf0Var6 = this.b;
                        uf0Var6.T = 1;
                        uf0Var6.h();
                        jf0 jf0Var2 = uf0Var6.o0;
                        jf0Var2.setVisibility(0);
                        jf0Var2.setType(1);
                        vz vzVar2 = uf0Var6.l0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        uf0 uf0Var7 = this.b;
                        uf0Var7.T = 2;
                        uf0Var7.h();
                        jf0 jf0Var3 = uf0Var7.o0;
                        jf0Var3.setVisibility(0);
                        jf0Var3.setType(0);
                        vz vzVar3 = uf0Var7.l0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        h();
        if (this.x0 || !z11) {
            return;
        }
        if (this.j0) {
            ((FrameLayout.LayoutParams) this.i0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        ((FrameLayout.LayoutParams) this.p0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
    }

    private void setShowOriginal(boolean z10) {
        if (this.a == z10) {
            return;
        }
        this.a = z10;
        vz vzVar = this.l0;
        if (vzVar != null) {
            vzVar.e(false, false, false);
        }
    }

    @Override // org.telegram.ui.Components.yz
    public final ByteBuffer a() {
        qf0 qf0Var = this.W;
        qf0Var.a();
        return qf0Var.e;
    }

    @Override // org.telegram.ui.Components.yz
    public final boolean b() {
        return this.a || this.V;
    }

    @Override // org.telegram.ui.Components.yz
    public final boolean c() {
        return !this.W.b();
    }

    public final boolean d() {
        MediaController.SavedFilterState savedFilterState = this.e0;
        qf0 qf0Var = this.W;
        return savedFilterState != null ? (this.G == savedFilterState.enhanceValue && this.I == savedFilterState.contrastValue && this.P == savedFilterState.highlightsValue && this.H == savedFilterState.exposureValue && this.J == savedFilterState.warmthValue && this.K == savedFilterState.saturationValue && this.R == savedFilterState.vignetteValue && this.Q == savedFilterState.shadowsValue && this.S == savedFilterState.grainValue && this.U == savedFilterState.sharpenValue && this.L == savedFilterState.fadeValue && this.M == savedFilterState.softenSkinValue && this.O == savedFilterState.tintHighlightsColor && this.N == savedFilterState.tintShadowsColor && qf0Var.b()) ? false : true : (this.G == 0.0f && this.I == 0.0f && this.P == 0.0f && this.H == 0.0f && this.J == 0.0f && this.K == 0.0f && this.R == 0.0f && this.Q == 0.0f && this.S == 0.0f && this.U == 0.0f && this.L == 0.0f && this.M == 0.0f && this.O == 0 && this.N == 0 && qf0Var.b()) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        rd0 rd0Var = this.v0;
        if (rd0Var != null && view == (textureView = this.i0)) {
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
            float measuredWidth2 = textureView.getMeasuredWidth() / rd0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            rd0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z10 = this.j0;
        TextureView textureView = this.i0;
        if (z10) {
            vz vzVar = this.l0;
            if (vzVar != null) {
                vzVar.postRunnable(new sz(vzVar, 0));
                this.l0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof l71) {
            l71 l71Var = (l71) textureView;
            MediaController.SavedFilterState savedFilterState = this.e0;
            if (savedFilterState == null) {
                l71Var.setDelegate(null);
                return;
            }
            vz vzVar2 = this.l0;
            if (vzVar2 != null) {
                vzVar2.f(new wz(savedFilterState));
            }
        }
    }

    public final void f() {
        int i10 = this.y0;
        yh yhVar = this.m0;
        lf0 lf0Var = this.p0;
        FrameLayout frameLayout = this.t0;
        FrameLayout frameLayout2 = this.n0;
        jf0 jf0Var = this.o0;
        if (i10 == 0) {
            jf0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            lf0Var.setVisibility(4);
            yhVar.setVisibility(0);
            return;
        }
        if (i10 == 1) {
            yhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            lf0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.T != 0) {
                jf0Var.setVisibility(0);
            }
            h();
            return;
        }
        if (i10 == 2) {
            yhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            jf0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            lf0Var.setVisibility(0);
            this.W.f = 0;
            int i11 = 0;
            while (i11 < 4) {
                this.u0[i11].a(i11 == 0, false);
                i11++;
            }
        }
    }

    public final void g() {
        this.V = Math.abs(this.G) < 0.1f && Math.abs(this.M) < 0.1f && Math.abs(this.H) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && this.N == 0 && this.O == 0 && Math.abs(this.P) < 0.1f && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && this.T == 0 && Math.abs(this.U) < 0.1f && this.W.b();
    }

    public Bitmap getBitmap() {
        vz vzVar = this.l0;
        if (vzVar == null || !vzVar.f || !vzVar.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (vzVar.postRunnable(new org.telegram.messenger.video.o(vzVar, bitmapArr, countDownLatch, 18))) {
                countDownLatch.await();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    @Override // org.telegram.ui.Components.yz
    public float getBlurAngle() {
        return this.d0;
    }

    public jf0 getBlurControl() {
        return this.o0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getBlurExcludeBlurSize() {
        return this.c0;
    }

    @Override // org.telegram.ui.Components.yz
    public PointF getBlurExcludePoint() {
        return this.b0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getBlurExcludeSize() {
        return this.a0;
    }

    @Override // org.telegram.ui.Components.yz
    public int getBlurType() {
        return this.T;
    }

    public TextView getCancelTextView() {
        return this.h0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getContrastValue() {
        return a4.a.e(this.I, 100.0f, 0.3f, 1.0f);
    }

    public lf0 getCurveControl() {
        return this.p0;
    }

    public TextView getDoneTextView() {
        return this.g0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getEnhanceValue() {
        return this.G / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getExposureValue() {
        return this.H / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getFadeValue() {
        return this.L / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getGrainValue() {
        return (this.S / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.P, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.j0 || this.k0) {
            return null;
        }
        return this.i0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getSaturationValue() {
        float f7 = this.K / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    public MediaController.SavedFilterState getSavedFilterState() {
        MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
        savedFilterState.enhanceValue = this.G;
        savedFilterState.exposureValue = this.H;
        savedFilterState.contrastValue = this.I;
        savedFilterState.warmthValue = this.J;
        savedFilterState.saturationValue = this.K;
        savedFilterState.fadeValue = this.L;
        savedFilterState.softenSkinValue = this.M;
        savedFilterState.tintShadowsColor = this.N;
        savedFilterState.tintHighlightsColor = this.O;
        savedFilterState.highlightsValue = this.P;
        savedFilterState.shadowsValue = this.Q;
        savedFilterState.vignetteValue = this.R;
        savedFilterState.grainValue = this.S;
        savedFilterState.blurType = this.T;
        savedFilterState.sharpenValue = this.U;
        savedFilterState.curvesToolValue = this.W;
        savedFilterState.blurExcludeSize = this.a0;
        savedFilterState.blurExcludePoint = this.b0;
        savedFilterState.blurExcludeBlurSize = this.c0;
        savedFilterState.blurAngle = this.d0;
        this.e0 = savedFilterState;
        return savedFilterState;
    }

    @Override // org.telegram.ui.Components.yz
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.Q, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.yz
    public float getSharpenValue() {
        return a4.a.e(this.U, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.yz
    public float getSoftenSkinValue() {
        return this.M / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public int getTintHighlightsColor() {
        return this.O;
    }

    @Override // org.telegram.ui.Components.yz
    public float getTintHighlightsIntensityValue() {
        return this.O == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.yz
    public int getTintShadowsColor() {
        return this.N;
    }

    @Override // org.telegram.ui.Components.yz
    public float getTintShadowsIntensityValue() {
        return this.N == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f0;
    }

    public Bitmap getUiBlurBitmap() {
        oa oaVar;
        vz vzVar = this.l0;
        if (vzVar == null || (oaVar = vzVar.I) == null) {
            return null;
        }
        synchronized (oaVar.n) {
            try {
                if (oaVar.q) {
                    return oaVar.p;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.yz
    public float getVignetteValue() {
        return this.R / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getWarmthValue() {
        return this.J / 100.0f;
    }

    public final void h() {
        int i10 = this.T;
        TextView textView = this.s0;
        TextView textView2 = this.r0;
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        TextView textView3 = this.q0;
        if (i10 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i11 = org.telegram.ui.ActionBar.j6.zf;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i12 = org.telegram.ui.ActionBar.j6.zf;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.MULTIPLY));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i13 = org.telegram.ui.ActionBar.j6.zf;
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), PorterDuff.Mode.MULTIPLY));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        }
        g();
    }

    @Override // ci.kc
    public final boolean m(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.i0;
            if (textureView instanceof l71) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                uk0 uk0Var = ((l71) textureView).c;
                float f7 = uk0Var.a;
                if (x10 >= f7 && x10 <= f7 + uk0Var.c) {
                    float f10 = uk0Var.b;
                    if (y3 >= f10 && y3 <= f10 + uk0Var.d) {
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
            int dp = size - AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(214.0f);
            boolean z10 = this.x0;
            int i12 = size2 - (dp2 + (!z10 ? AndroidUtilities.statusBarHeight : 0));
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
            float f10 = dp;
            float f11 = i12;
            if (f10 / width > f11 / height) {
                f7 = (int) Math.ceil(width * r11);
                ceil = f11;
            } else {
                ceil = (int) Math.ceil(r6 * r9);
                f7 = f10;
            }
            int ceil2 = (int) Math.ceil(((f10 - f7) / 2.0f) + AndroidUtilities.dp(14.0f));
            int ceil3 = (int) Math.ceil(((f11 - ceil) / 2.0f) + AndroidUtilities.dp(14.0f) + (!z10 ? AndroidUtilities.statusBarHeight : 0));
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
            float f13 = ceil3 - (!z10 ? AndroidUtilities.statusBarHeight : 0);
            float f14 = i14;
            float f15 = i15;
            lf0 lf0Var = this.p0;
            uk0 uk0Var = lf0Var.e;
            uk0Var.a = f12;
            uk0Var.b = f13;
            uk0Var.c = f14;
            uk0Var.d = f15;
            jf0 jf0Var = this.o0;
            wv0 wv0Var = jf0Var.d;
            wv0Var.a = f14;
            wv0Var.b = f15;
            ((FrameLayout.LayoutParams) jf0Var.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i12;
            ((FrameLayout.LayoutParams) lf0Var.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i12;
            if (AndroidUtilities.isTablet()) {
                int dp3 = AndroidUtilities.dp(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.m0.getLayoutParams();
                if (dp3 < dp) {
                    layoutParams2.width = dp3;
                    layoutParams2.leftMargin = (dp - dp3) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setEnhanceValue(float f7) {
        this.G = f7 * 100.0f;
        g();
        int i10 = 0;
        while (true) {
            yh yhVar = this.m0;
            if (i10 >= yhVar.getChildCount()) {
                break;
            }
            View childAt = yhVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.w5) && RecyclerView.S(childAt) == this.b) {
                ((org.telegram.ui.Cells.w5) childAt).a(LocaleController.getString(R.string.Enhance), 0, this.G);
                break;
            }
            i10++;
        }
        vz vzVar = this.l0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
    }
}
