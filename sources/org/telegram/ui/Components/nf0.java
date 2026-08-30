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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nf0 extends FrameLayout implements yz, ph.z9 {
    public final Bitmap A0;
    public final int B;
    public final Rect B0;
    public final int C;
    public final Matrix C0;
    public float D;
    public final Paint D0;
    public float E;
    public final int E0;
    public float F;
    public final org.telegram.ui.ActionBar.f6 F0;
    public float G;
    public int G0;
    public float H;
    public int H0;
    public float I;
    public float J;
    public int K;
    public int L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public float R;
    public boolean S;
    public final jf0 T;
    public float U;
    public PointF V;
    public float W;
    public boolean a;
    public float a0;
    public final int b;
    public MediaController.SavedFilterState b0;
    public final int c;
    public final FrameLayout c0;
    public final int d;
    public final TextView d0;
    public final int e;
    public final TextView e0;
    public final int f;
    public final TextureView f0;
    public final boolean g0;
    public final int h;
    public final boolean h0;
    public vz i0;
    public final nh j0;
    public final FrameLayout k0;
    public final cf0 l0;
    public final ef0 m0;
    public final int n;
    public final TextView n0;
    public final TextView o0;
    public final TextView p0;
    public final FrameLayout q0;
    public final int r;
    public final RadioButton[] r0;
    public final int s;
    public final hd0 s0;
    public final boolean t0;
    public final boolean u0;
    public final int v;
    public int v0;
    public final int w;
    public final ImageView w0;
    public final int x;
    public final ImageView x0;
    public final int y;
    public final ImageView y0;
    public final Bitmap z0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0559  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nf0(Context context, w61 w61Var, Bitmap bitmap, Bitmap bitmap2, int i10, MediaController.SavedFilterState savedFilterState, hd0 hd0Var, int i11, boolean z4, boolean z10, ba baVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r0 = new RadioButton[4];
        this.B0 = new Rect();
        this.C0 = new Matrix();
        this.D0 = new Paint(2);
        this.h0 = z10;
        this.F0 = f6Var;
        boolean z11 = context instanceof BubbleActivity;
        this.u0 = z11;
        this.s0 = hd0Var;
        this.t0 = z4;
        this.C = 0;
        if (i11 == 1) {
            this.C = 1;
            this.n = 0;
        } else if (i11 == 0) {
            this.n = -1;
        }
        int i12 = this.C;
        this.b = i12;
        this.c = i12 + 1;
        this.d = i12 + 2;
        this.e = i12 + 3;
        this.f = i12 + 4;
        this.h = i12 + 5;
        this.r = i12 + 6;
        this.s = i12 + 7;
        int i13 = i12 + 9;
        this.C = i13;
        this.v = i12 + 8;
        if (i11 == 2) {
            this.C = i12 + 10;
            this.n = i13;
        }
        if (w61Var == null) {
            int i14 = this.C;
            this.C = i14 + 1;
            this.w = i14;
        } else {
            this.w = -1;
        }
        int i15 = this.C;
        this.x = i15;
        this.y = i15 + 1;
        this.C = i15 + 3;
        this.B = i15 + 2;
        if (savedFilterState != null) {
            this.D = savedFilterState.enhanceValue;
            this.J = savedFilterState.softenSkinValue;
            this.E = savedFilterState.exposureValue;
            this.F = savedFilterState.contrastValue;
            this.G = savedFilterState.warmthValue;
            this.H = savedFilterState.saturationValue;
            this.I = savedFilterState.fadeValue;
            this.K = savedFilterState.tintShadowsColor;
            this.L = savedFilterState.tintHighlightsColor;
            this.M = savedFilterState.highlightsValue;
            this.N = savedFilterState.shadowsValue;
            this.O = savedFilterState.vignetteValue;
            this.P = savedFilterState.grainValue;
            this.Q = savedFilterState.blurType;
            this.R = savedFilterState.sharpenValue;
            this.T = savedFilterState.curvesToolValue;
            this.U = savedFilterState.blurExcludeSize;
            this.V = savedFilterState.blurExcludePoint;
            this.W = savedFilterState.blurExcludeBlurSize;
            this.S = savedFilterState.isEmpty();
            this.a0 = savedFilterState.blurAngle;
            this.b0 = savedFilterState;
        } else {
            this.T = new jf0();
            this.U = 0.35f;
            this.V = new PointF(0.5f, 0.5f);
            this.W = 0.15f;
            this.a0 = 1.5707964f;
            this.S = true;
        }
        this.z0 = bitmap;
        this.A0 = bitmap2;
        this.E0 = i10;
        if (w61Var != null) {
            this.f0 = w61Var;
            w61Var.setDelegate(new ff0(this));
        } else {
            this.g0 = true;
            hf0 hf0Var = new hf0(this, context);
            this.f0 = hf0Var;
            if (z10) {
                addView(hf0Var, k7.b6.e(-1, -1, 51));
            }
            hf0Var.setVisibility(4);
            hf0Var.setSurfaceTextureListener(new if0(this, z10, baVar));
        }
        cf0 cf0Var = new cf0(context);
        cf0Var.a = new PointF();
        cf0Var.d = new jv0();
        cf0Var.e = new PointF(0.5f, 0.5f);
        cf0Var.f = 0.15f;
        cf0Var.h = 0.35f;
        cf0Var.r = new RectF();
        cf0Var.x = 1.0f;
        cf0Var.C = true;
        Paint paint = new Paint(1);
        cf0Var.F = paint;
        Paint paint2 = new Paint(1);
        cf0Var.G = paint2;
        cf0Var.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        cf0Var.H = z11;
        this.l0 = cf0Var;
        cf0Var.setVisibility(4);
        if (z10) {
            addView(cf0Var, k7.b6.e(-1, -1, 51));
        }
        cf0Var.setDelegate(new ff0(this));
        jf0 jf0Var = this.T;
        ef0 ef0Var = new ef0(context);
        ef0Var.a = 0;
        ef0Var.c = true;
        ef0Var.e = new sk0();
        Paint paint3 = new Paint(1);
        ef0Var.f = paint3;
        Paint paint4 = new Paint(1);
        ef0Var.h = paint4;
        Paint paint5 = new Paint(1);
        ef0Var.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        ef0Var.r = textPaint;
        ef0Var.s = new Path();
        ef0Var.setWillNotDraw(false);
        ef0Var.w = jf0Var;
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
        this.m0 = ef0Var;
        ef0Var.setDelegate(new ff0(this));
        ef0Var.setVisibility(4);
        if (z10) {
            addView(ef0Var, k7.b6.e(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c0 = frameLayout;
        addView(frameLayout, k7.b6.e(-1, (!z10 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, k7.b6.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.e0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        TextView i16 = org.telegram.ui.yh.i(frameLayout2, textView, k7.b6.e(-2, -1, 51), context);
        this.d0 = i16;
        i16.setTextSize(1, 14.0f);
        int i17 = org.telegram.ui.ActionBar.j6.zf;
        i16.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, f6Var));
        i16.setGravity(17);
        i16.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        i16.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        i16.setText(LocaleController.getString(R.string.Done).toUpperCase());
        i16.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(i16, k7.b6.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, k7.b6.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.w0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i17, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView, k7.b6.n(56, 48));
        final int i18 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
            public final /* synthetic */ nf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        nf0 nf0Var = this.b;
                        nf0Var.v0 = 0;
                        nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var.x0.setColorFilter((ColorFilter) null);
                        nf0Var.y0.setColorFilter((ColorFilter) null);
                        nf0Var.f();
                        break;
                    case 1:
                        nf0 nf0Var2 = this.b;
                        nf0Var2.v0 = 1;
                        nf0Var2.w0.setColorFilter((ColorFilter) null);
                        nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var2.y0.setColorFilter((ColorFilter) null);
                        nf0Var2.f();
                        break;
                    case 2:
                        nf0 nf0Var3 = this.b;
                        nf0Var3.v0 = 2;
                        nf0Var3.w0.setColorFilter((ColorFilter) null);
                        nf0Var3.x0.setColorFilter((ColorFilter) null);
                        nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var3.f();
                        break;
                    case 3:
                        nf0 nf0Var4 = this.b;
                        nf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nf0Var4.T.f = intValue;
                        int i19 = 0;
                        while (i19 < 4) {
                            nf0Var4.r0[i19].a(i19 == intValue, true);
                            i19++;
                        }
                        nf0Var4.m0.invalidate();
                        break;
                    case 4:
                        nf0 nf0Var5 = this.b;
                        nf0Var5.Q = 0;
                        nf0Var5.h();
                        nf0Var5.l0.setVisibility(4);
                        vz vzVar = nf0Var5.i0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        nf0 nf0Var6 = this.b;
                        nf0Var6.Q = 1;
                        nf0Var6.h();
                        cf0 cf0Var2 = nf0Var6.l0;
                        cf0Var2.setVisibility(0);
                        cf0Var2.setType(1);
                        vz vzVar2 = nf0Var6.i0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nf0 nf0Var7 = this.b;
                        nf0Var7.Q = 2;
                        nf0Var7.h();
                        cf0 cf0Var3 = nf0Var7.l0;
                        cf0Var3.setVisibility(0);
                        cf0Var3.setType(0);
                        vz vzVar3 = nf0Var7.i0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.x0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView2, k7.b6.n(56, 48));
        final int i19 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
            public final /* synthetic */ nf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        nf0 nf0Var = this.b;
                        nf0Var.v0 = 0;
                        nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var.x0.setColorFilter((ColorFilter) null);
                        nf0Var.y0.setColorFilter((ColorFilter) null);
                        nf0Var.f();
                        break;
                    case 1:
                        nf0 nf0Var2 = this.b;
                        nf0Var2.v0 = 1;
                        nf0Var2.w0.setColorFilter((ColorFilter) null);
                        nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var2.y0.setColorFilter((ColorFilter) null);
                        nf0Var2.f();
                        break;
                    case 2:
                        nf0 nf0Var3 = this.b;
                        nf0Var3.v0 = 2;
                        nf0Var3.w0.setColorFilter((ColorFilter) null);
                        nf0Var3.x0.setColorFilter((ColorFilter) null);
                        nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var3.f();
                        break;
                    case 3:
                        nf0 nf0Var4 = this.b;
                        nf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nf0Var4.T.f = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            nf0Var4.r0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        nf0Var4.m0.invalidate();
                        break;
                    case 4:
                        nf0 nf0Var5 = this.b;
                        nf0Var5.Q = 0;
                        nf0Var5.h();
                        nf0Var5.l0.setVisibility(4);
                        vz vzVar = nf0Var5.i0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        nf0 nf0Var6 = this.b;
                        nf0Var6.Q = 1;
                        nf0Var6.h();
                        cf0 cf0Var2 = nf0Var6.l0;
                        cf0Var2.setVisibility(0);
                        cf0Var2.setType(1);
                        vz vzVar2 = nf0Var6.i0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nf0 nf0Var7 = this.b;
                        nf0Var7.Q = 2;
                        nf0Var7.h();
                        cf0 cf0Var3 = nf0Var7.l0;
                        cf0Var3.setVisibility(0);
                        cf0Var3.setType(0);
                        vz vzVar3 = nf0Var7.i0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        if (w61Var != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.y0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        linearLayout.addView(imageView3, k7.b6.n(56, 48));
        final int i20 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
            public final /* synthetic */ nf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        nf0 nf0Var = this.b;
                        nf0Var.v0 = 0;
                        nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var.x0.setColorFilter((ColorFilter) null);
                        nf0Var.y0.setColorFilter((ColorFilter) null);
                        nf0Var.f();
                        break;
                    case 1:
                        nf0 nf0Var2 = this.b;
                        nf0Var2.v0 = 1;
                        nf0Var2.w0.setColorFilter((ColorFilter) null);
                        nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var2.y0.setColorFilter((ColorFilter) null);
                        nf0Var2.f();
                        break;
                    case 2:
                        nf0 nf0Var3 = this.b;
                        nf0Var3.v0 = 2;
                        nf0Var3.w0.setColorFilter((ColorFilter) null);
                        nf0Var3.x0.setColorFilter((ColorFilter) null);
                        nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var3.f();
                        break;
                    case 3:
                        nf0 nf0Var4 = this.b;
                        nf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nf0Var4.T.f = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            nf0Var4.r0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        nf0Var4.m0.invalidate();
                        break;
                    case 4:
                        nf0 nf0Var5 = this.b;
                        nf0Var5.Q = 0;
                        nf0Var5.h();
                        nf0Var5.l0.setVisibility(4);
                        vz vzVar = nf0Var5.i0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        nf0 nf0Var6 = this.b;
                        nf0Var6.Q = 1;
                        nf0Var6.h();
                        cf0 cf0Var2 = nf0Var6.l0;
                        cf0Var2.setVisibility(0);
                        cf0Var2.setType(1);
                        vz vzVar2 = nf0Var6.i0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nf0 nf0Var7 = this.b;
                        nf0Var7.Q = 2;
                        nf0Var7.h();
                        cf0 cf0Var3 = nf0Var7.l0;
                        cf0Var3.setVisibility(0);
                        cf0Var3.setType(0);
                        vz vzVar3 = nf0Var7.i0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        nh nhVar = new nh(context, 1);
        this.j0 = nhVar;
        f2.i0 i0Var = new f2.i0();
        i0Var.j1(1);
        nhVar.setLayoutManager(i0Var);
        nhVar.setClipToPadding(false);
        nhVar.setOverScrollMode(2);
        nhVar.setAdapter(new mf0(this, context));
        frameLayout.addView(nhVar, k7.b6.e(-1, (!z10 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.q0 = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, k7.b6.d(-1, 78.0f, 1, 0.0f, (!z10 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, k7.b6.e(-2, -2, 1));
        int i21 = 0;
        while (i21 < 4) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i21));
            this.r0[i21] = new RadioButton(context);
            this.r0[i21].setSize(AndroidUtilities.dp(20.0f));
            frameLayout4.addView(this.r0[i21], k7.b6.e(30, 30, 49));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(16);
            if (i21 == 0) {
                String string = LocaleController.getString(R.string.CurvesAll);
                textView2.setText(string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase());
                textView2.setTextColor(-1);
                this.r0[i21].b(-1, -1);
            } else if (i21 == 1) {
                String string2 = LocaleController.getString(R.string.CurvesRed);
                textView2.setText(string2.substring(0, 1).toUpperCase() + string2.substring(1).toLowerCase());
                textView2.setTextColor(-1684147);
                this.r0[i21].b(-1684147, -1684147);
            } else if (i21 == 2) {
                String string3 = LocaleController.getString(R.string.CurvesGreen);
                textView2.setText(string3.substring(0, 1).toUpperCase() + string3.substring(1).toLowerCase());
                textView2.setTextColor(-10831009);
                this.r0[i21].b(-10831009, -10831009);
                frameLayout4.addView(textView2, k7.b6.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
                linearLayout2.addView(frameLayout4, k7.b6.k(i21 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                final int i22 = 3;
                frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
                    public final /* synthetic */ nf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                nf0 nf0Var = this.b;
                                nf0Var.v0 = 0;
                                nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                                nf0Var.x0.setColorFilter((ColorFilter) null);
                                nf0Var.y0.setColorFilter((ColorFilter) null);
                                nf0Var.f();
                                break;
                            case 1:
                                nf0 nf0Var2 = this.b;
                                nf0Var2.v0 = 1;
                                nf0Var2.w0.setColorFilter((ColorFilter) null);
                                nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                                nf0Var2.y0.setColorFilter((ColorFilter) null);
                                nf0Var2.f();
                                break;
                            case 2:
                                nf0 nf0Var3 = this.b;
                                nf0Var3.v0 = 2;
                                nf0Var3.w0.setColorFilter((ColorFilter) null);
                                nf0Var3.x0.setColorFilter((ColorFilter) null);
                                nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                                nf0Var3.f();
                                break;
                            case 3:
                                nf0 nf0Var4 = this.b;
                                nf0Var4.getClass();
                                int intValue = ((Integer) view.getTag()).intValue();
                                nf0Var4.T.f = intValue;
                                int i192 = 0;
                                while (i192 < 4) {
                                    nf0Var4.r0[i192].a(i192 == intValue, true);
                                    i192++;
                                }
                                nf0Var4.m0.invalidate();
                                break;
                            case 4:
                                nf0 nf0Var5 = this.b;
                                nf0Var5.Q = 0;
                                nf0Var5.h();
                                nf0Var5.l0.setVisibility(4);
                                vz vzVar = nf0Var5.i0;
                                if (vzVar != null) {
                                    vzVar.e(false, false, false);
                                    break;
                                }
                                break;
                            case 5:
                                nf0 nf0Var6 = this.b;
                                nf0Var6.Q = 1;
                                nf0Var6.h();
                                cf0 cf0Var2 = nf0Var6.l0;
                                cf0Var2.setVisibility(0);
                                cf0Var2.setType(1);
                                vz vzVar2 = nf0Var6.i0;
                                if (vzVar2 != null) {
                                    vzVar2.e(false, false, false);
                                    break;
                                }
                                break;
                            default:
                                nf0 nf0Var7 = this.b;
                                nf0Var7.Q = 2;
                                nf0Var7.h();
                                cf0 cf0Var3 = nf0Var7.l0;
                                cf0Var3.setVisibility(0);
                                cf0Var3.setType(0);
                                vz vzVar3 = nf0Var7.i0;
                                if (vzVar3 != null) {
                                    vzVar3.e(false, false, false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                i21++;
            } else {
                if (i21 == 3) {
                    String string4 = LocaleController.getString(R.string.CurvesBlue);
                    textView2.setText(string4.substring(0, 1).toUpperCase() + string4.substring(1).toLowerCase());
                    textView2.setTextColor(-12734994);
                    this.r0[i21].b(-12734994, -12734994);
                }
                frameLayout4.addView(textView2, k7.b6.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
                linearLayout2.addView(frameLayout4, k7.b6.k(i21 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                final int i222 = 3;
                frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
                    public final /* synthetic */ nf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i222) {
                            case 0:
                                nf0 nf0Var = this.b;
                                nf0Var.v0 = 0;
                                nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                                nf0Var.x0.setColorFilter((ColorFilter) null);
                                nf0Var.y0.setColorFilter((ColorFilter) null);
                                nf0Var.f();
                                break;
                            case 1:
                                nf0 nf0Var2 = this.b;
                                nf0Var2.v0 = 1;
                                nf0Var2.w0.setColorFilter((ColorFilter) null);
                                nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                                nf0Var2.y0.setColorFilter((ColorFilter) null);
                                nf0Var2.f();
                                break;
                            case 2:
                                nf0 nf0Var3 = this.b;
                                nf0Var3.v0 = 2;
                                nf0Var3.w0.setColorFilter((ColorFilter) null);
                                nf0Var3.x0.setColorFilter((ColorFilter) null);
                                nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                                nf0Var3.f();
                                break;
                            case 3:
                                nf0 nf0Var4 = this.b;
                                nf0Var4.getClass();
                                int intValue = ((Integer) view.getTag()).intValue();
                                nf0Var4.T.f = intValue;
                                int i192 = 0;
                                while (i192 < 4) {
                                    nf0Var4.r0[i192].a(i192 == intValue, true);
                                    i192++;
                                }
                                nf0Var4.m0.invalidate();
                                break;
                            case 4:
                                nf0 nf0Var5 = this.b;
                                nf0Var5.Q = 0;
                                nf0Var5.h();
                                nf0Var5.l0.setVisibility(4);
                                vz vzVar = nf0Var5.i0;
                                if (vzVar != null) {
                                    vzVar.e(false, false, false);
                                    break;
                                }
                                break;
                            case 5:
                                nf0 nf0Var6 = this.b;
                                nf0Var6.Q = 1;
                                nf0Var6.h();
                                cf0 cf0Var2 = nf0Var6.l0;
                                cf0Var2.setVisibility(0);
                                cf0Var2.setType(1);
                                vz vzVar2 = nf0Var6.i0;
                                if (vzVar2 != null) {
                                    vzVar2.e(false, false, false);
                                    break;
                                }
                                break;
                            default:
                                nf0 nf0Var7 = this.b;
                                nf0Var7.Q = 2;
                                nf0Var7.h();
                                cf0 cf0Var3 = nf0Var7.l0;
                                cf0Var3.setVisibility(0);
                                cf0Var3.setType(0);
                                vz vzVar3 = nf0Var7.i0;
                                if (vzVar3 != null) {
                                    vzVar3.e(false, false, false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                i21++;
            }
            frameLayout4.addView(textView2, k7.b6.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout4, k7.b6.k(i21 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            final int i2222 = 3;
            frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
                public final /* synthetic */ nf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2222) {
                        case 0:
                            nf0 nf0Var = this.b;
                            nf0Var.v0 = 0;
                            nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                            nf0Var.x0.setColorFilter((ColorFilter) null);
                            nf0Var.y0.setColorFilter((ColorFilter) null);
                            nf0Var.f();
                            break;
                        case 1:
                            nf0 nf0Var2 = this.b;
                            nf0Var2.v0 = 1;
                            nf0Var2.w0.setColorFilter((ColorFilter) null);
                            nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                            nf0Var2.y0.setColorFilter((ColorFilter) null);
                            nf0Var2.f();
                            break;
                        case 2:
                            nf0 nf0Var3 = this.b;
                            nf0Var3.v0 = 2;
                            nf0Var3.w0.setColorFilter((ColorFilter) null);
                            nf0Var3.x0.setColorFilter((ColorFilter) null);
                            nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                            nf0Var3.f();
                            break;
                        case 3:
                            nf0 nf0Var4 = this.b;
                            nf0Var4.getClass();
                            int intValue = ((Integer) view.getTag()).intValue();
                            nf0Var4.T.f = intValue;
                            int i192 = 0;
                            while (i192 < 4) {
                                nf0Var4.r0[i192].a(i192 == intValue, true);
                                i192++;
                            }
                            nf0Var4.m0.invalidate();
                            break;
                        case 4:
                            nf0 nf0Var5 = this.b;
                            nf0Var5.Q = 0;
                            nf0Var5.h();
                            nf0Var5.l0.setVisibility(4);
                            vz vzVar = nf0Var5.i0;
                            if (vzVar != null) {
                                vzVar.e(false, false, false);
                                break;
                            }
                            break;
                        case 5:
                            nf0 nf0Var6 = this.b;
                            nf0Var6.Q = 1;
                            nf0Var6.h();
                            cf0 cf0Var2 = nf0Var6.l0;
                            cf0Var2.setVisibility(0);
                            cf0Var2.setType(1);
                            vz vzVar2 = nf0Var6.i0;
                            if (vzVar2 != null) {
                                vzVar2.e(false, false, false);
                                break;
                            }
                            break;
                        default:
                            nf0 nf0Var7 = this.b;
                            nf0Var7.Q = 2;
                            nf0Var7.h();
                            cf0 cf0Var3 = nf0Var7.l0;
                            cf0Var3.setVisibility(0);
                            cf0Var3.setType(0);
                            vz vzVar3 = nf0Var7.i0;
                            if (vzVar3 != null) {
                                vzVar3.e(false, false, false);
                                break;
                            }
                            break;
                    }
                }
            });
            i21++;
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.k0 = frameLayout5;
        frameLayout5.setVisibility(4);
        this.c0.addView(frameLayout5, k7.b6.d(280, 60.0f, 1, 0.0f, (z10 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.n0 = textView3;
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString(R.string.BlurOff));
        frameLayout5.addView(textView3, k7.b6.c(60.0f, 80));
        final int i23 = 4;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
            public final /* synthetic */ nf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23) {
                    case 0:
                        nf0 nf0Var = this.b;
                        nf0Var.v0 = 0;
                        nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var.x0.setColorFilter((ColorFilter) null);
                        nf0Var.y0.setColorFilter((ColorFilter) null);
                        nf0Var.f();
                        break;
                    case 1:
                        nf0 nf0Var2 = this.b;
                        nf0Var2.v0 = 1;
                        nf0Var2.w0.setColorFilter((ColorFilter) null);
                        nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var2.y0.setColorFilter((ColorFilter) null);
                        nf0Var2.f();
                        break;
                    case 2:
                        nf0 nf0Var3 = this.b;
                        nf0Var3.v0 = 2;
                        nf0Var3.w0.setColorFilter((ColorFilter) null);
                        nf0Var3.x0.setColorFilter((ColorFilter) null);
                        nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var3.f();
                        break;
                    case 3:
                        nf0 nf0Var4 = this.b;
                        nf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nf0Var4.T.f = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            nf0Var4.r0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        nf0Var4.m0.invalidate();
                        break;
                    case 4:
                        nf0 nf0Var5 = this.b;
                        nf0Var5.Q = 0;
                        nf0Var5.h();
                        nf0Var5.l0.setVisibility(4);
                        vz vzVar = nf0Var5.i0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        nf0 nf0Var6 = this.b;
                        nf0Var6.Q = 1;
                        nf0Var6.h();
                        cf0 cf0Var2 = nf0Var6.l0;
                        cf0Var2.setVisibility(0);
                        cf0Var2.setType(1);
                        vz vzVar2 = nf0Var6.i0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nf0 nf0Var7 = this.b;
                        nf0Var7.Q = 2;
                        nf0Var7.h();
                        cf0 cf0Var3 = nf0Var7.l0;
                        cf0Var3.setVisibility(0);
                        cf0Var3.setType(0);
                        vz vzVar3 = nf0Var7.i0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.o0 = textView4;
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(LocaleController.getString(R.string.BlurRadial));
        frameLayout5.addView(textView4, k7.b6.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i24 = 5;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
            public final /* synthetic */ nf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i24) {
                    case 0:
                        nf0 nf0Var = this.b;
                        nf0Var.v0 = 0;
                        nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var.x0.setColorFilter((ColorFilter) null);
                        nf0Var.y0.setColorFilter((ColorFilter) null);
                        nf0Var.f();
                        break;
                    case 1:
                        nf0 nf0Var2 = this.b;
                        nf0Var2.v0 = 1;
                        nf0Var2.w0.setColorFilter((ColorFilter) null);
                        nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var2.y0.setColorFilter((ColorFilter) null);
                        nf0Var2.f();
                        break;
                    case 2:
                        nf0 nf0Var3 = this.b;
                        nf0Var3.v0 = 2;
                        nf0Var3.w0.setColorFilter((ColorFilter) null);
                        nf0Var3.x0.setColorFilter((ColorFilter) null);
                        nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var3.f();
                        break;
                    case 3:
                        nf0 nf0Var4 = this.b;
                        nf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nf0Var4.T.f = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            nf0Var4.r0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        nf0Var4.m0.invalidate();
                        break;
                    case 4:
                        nf0 nf0Var5 = this.b;
                        nf0Var5.Q = 0;
                        nf0Var5.h();
                        nf0Var5.l0.setVisibility(4);
                        vz vzVar = nf0Var5.i0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        nf0 nf0Var6 = this.b;
                        nf0Var6.Q = 1;
                        nf0Var6.h();
                        cf0 cf0Var2 = nf0Var6.l0;
                        cf0Var2.setVisibility(0);
                        cf0Var2.setType(1);
                        vz vzVar2 = nf0Var6.i0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nf0 nf0Var7 = this.b;
                        nf0Var7.Q = 2;
                        nf0Var7.h();
                        cf0 cf0Var3 = nf0Var7.l0;
                        cf0Var3.setVisibility(0);
                        cf0Var3.setType(0);
                        vz vzVar3 = nf0Var7.i0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.p0 = textView5;
        textView5.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(LocaleController.getString(R.string.BlurLinear));
        frameLayout5.addView(textView5, k7.b6.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i25 = 6;
        textView5.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gf0
            public final /* synthetic */ nf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i25) {
                    case 0:
                        nf0 nf0Var = this.b;
                        nf0Var.v0 = 0;
                        nf0Var.w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var.x0.setColorFilter((ColorFilter) null);
                        nf0Var.y0.setColorFilter((ColorFilter) null);
                        nf0Var.f();
                        break;
                    case 1:
                        nf0 nf0Var2 = this.b;
                        nf0Var2.v0 = 1;
                        nf0Var2.w0.setColorFilter((ColorFilter) null);
                        nf0Var2.x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var2.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var2.y0.setColorFilter((ColorFilter) null);
                        nf0Var2.f();
                        break;
                    case 2:
                        nf0 nf0Var3 = this.b;
                        nf0Var3.v0 = 2;
                        nf0Var3.w0.setColorFilter((ColorFilter) null);
                        nf0Var3.x0.setColorFilter((ColorFilter) null);
                        nf0Var3.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zf, nf0Var3.F0), PorterDuff.Mode.MULTIPLY));
                        nf0Var3.f();
                        break;
                    case 3:
                        nf0 nf0Var4 = this.b;
                        nf0Var4.getClass();
                        int intValue = ((Integer) view.getTag()).intValue();
                        nf0Var4.T.f = intValue;
                        int i192 = 0;
                        while (i192 < 4) {
                            nf0Var4.r0[i192].a(i192 == intValue, true);
                            i192++;
                        }
                        nf0Var4.m0.invalidate();
                        break;
                    case 4:
                        nf0 nf0Var5 = this.b;
                        nf0Var5.Q = 0;
                        nf0Var5.h();
                        nf0Var5.l0.setVisibility(4);
                        vz vzVar = nf0Var5.i0;
                        if (vzVar != null) {
                            vzVar.e(false, false, false);
                            break;
                        }
                        break;
                    case 5:
                        nf0 nf0Var6 = this.b;
                        nf0Var6.Q = 1;
                        nf0Var6.h();
                        cf0 cf0Var2 = nf0Var6.l0;
                        cf0Var2.setVisibility(0);
                        cf0Var2.setType(1);
                        vz vzVar2 = nf0Var6.i0;
                        if (vzVar2 != null) {
                            vzVar2.e(false, false, false);
                            break;
                        }
                        break;
                    default:
                        nf0 nf0Var7 = this.b;
                        nf0Var7.Q = 2;
                        nf0Var7.h();
                        cf0 cf0Var3 = nf0Var7.l0;
                        cf0Var3.setVisibility(0);
                        cf0Var3.setType(0);
                        vz vzVar3 = nf0Var7.i0;
                        if (vzVar3 != null) {
                            vzVar3.e(false, false, false);
                            break;
                        }
                        break;
                }
            }
        });
        h();
        if (this.u0 || !z10) {
            return;
        }
        if (this.g0) {
            ((FrameLayout.LayoutParams) this.f0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        ((FrameLayout.LayoutParams) this.m0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
    }

    private void setShowOriginal(boolean z4) {
        if (this.a == z4) {
            return;
        }
        this.a = z4;
        vz vzVar = this.i0;
        if (vzVar != null) {
            vzVar.e(false, false, false);
        }
    }

    @Override // org.telegram.ui.Components.yz
    public final ByteBuffer a() {
        jf0 jf0Var = this.T;
        jf0Var.a();
        return jf0Var.e;
    }

    @Override // org.telegram.ui.Components.yz
    public final boolean b() {
        return this.a || this.S;
    }

    @Override // org.telegram.ui.Components.yz
    public final boolean c() {
        return !this.T.b();
    }

    public final boolean d() {
        MediaController.SavedFilterState savedFilterState = this.b0;
        jf0 jf0Var = this.T;
        return savedFilterState != null ? (this.D == savedFilterState.enhanceValue && this.F == savedFilterState.contrastValue && this.M == savedFilterState.highlightsValue && this.E == savedFilterState.exposureValue && this.G == savedFilterState.warmthValue && this.H == savedFilterState.saturationValue && this.O == savedFilterState.vignetteValue && this.N == savedFilterState.shadowsValue && this.P == savedFilterState.grainValue && this.R == savedFilterState.sharpenValue && this.I == savedFilterState.fadeValue && this.J == savedFilterState.softenSkinValue && this.L == savedFilterState.tintHighlightsColor && this.K == savedFilterState.tintShadowsColor && jf0Var.b()) ? false : true : (this.D == 0.0f && this.F == 0.0f && this.M == 0.0f && this.E == 0.0f && this.G == 0.0f && this.H == 0.0f && this.O == 0.0f && this.N == 0.0f && this.P == 0.0f && this.R == 0.0f && this.I == 0.0f && this.J == 0.0f && this.L == 0 && this.K == 0 && jf0Var.b()) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j10);
        hd0 hd0Var = this.s0;
        if (hd0Var != null && view == (textureView = this.f0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.A0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.B0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.D0;
                int i10 = this.E0;
                if (i10 != 0) {
                    Matrix matrix = this.C0;
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
            float measuredWidth2 = textureView.getMeasuredWidth() / hd0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            hd0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z4 = this.g0;
        TextureView textureView = this.f0;
        if (z4) {
            vz vzVar = this.i0;
            if (vzVar != null) {
                vzVar.postRunnable(new sz(vzVar, 0));
                this.i0 = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof w61) {
            w61 w61Var = (w61) textureView;
            MediaController.SavedFilterState savedFilterState = this.b0;
            if (savedFilterState == null) {
                w61Var.setDelegate(null);
                return;
            }
            vz vzVar2 = this.i0;
            if (vzVar2 != null) {
                vzVar2.f(new wz(savedFilterState));
            }
        }
    }

    public final void f() {
        int i10 = this.v0;
        nh nhVar = this.j0;
        ef0 ef0Var = this.m0;
        FrameLayout frameLayout = this.q0;
        FrameLayout frameLayout2 = this.k0;
        cf0 cf0Var = this.l0;
        if (i10 == 0) {
            cf0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            ef0Var.setVisibility(4);
            nhVar.setVisibility(0);
            return;
        }
        if (i10 == 1) {
            nhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            ef0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.Q != 0) {
                cf0Var.setVisibility(0);
            }
            h();
            return;
        }
        if (i10 == 2) {
            nhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            cf0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            ef0Var.setVisibility(0);
            this.T.f = 0;
            int i11 = 0;
            while (i11 < 4) {
                this.r0[i11].a(i11 == 0, false);
                i11++;
            }
        }
    }

    public final void g() {
        this.S = Math.abs(this.D) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.E) < 0.1f && Math.abs(this.F) < 0.1f && Math.abs(this.G) < 0.1f && Math.abs(this.H) < 0.1f && Math.abs(this.I) < 0.1f && this.K == 0 && this.L == 0 && Math.abs(this.M) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.O) < 0.1f && Math.abs(this.P) < 0.1f && this.Q == 0 && Math.abs(this.R) < 0.1f && this.T.b();
    }

    public Bitmap getBitmap() {
        vz vzVar = this.i0;
        if (vzVar == null || !vzVar.f || !vzVar.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (vzVar.postRunnable(new hp(vzVar, bitmapArr, countDownLatch, 2))) {
                countDownLatch.await();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    @Override // org.telegram.ui.Components.yz
    public float getBlurAngle() {
        return this.a0;
    }

    public cf0 getBlurControl() {
        return this.l0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getBlurExcludeBlurSize() {
        return this.W;
    }

    @Override // org.telegram.ui.Components.yz
    public PointF getBlurExcludePoint() {
        return this.V;
    }

    @Override // org.telegram.ui.Components.yz
    public float getBlurExcludeSize() {
        return this.U;
    }

    @Override // org.telegram.ui.Components.yz
    public int getBlurType() {
        return this.Q;
    }

    public TextView getCancelTextView() {
        return this.e0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getContrastValue() {
        return vh.v2.c(this.F, 100.0f, 0.3f, 1.0f);
    }

    public ef0 getCurveControl() {
        return this.m0;
    }

    public TextView getDoneTextView() {
        return this.d0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getEnhanceValue() {
        return this.D / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getExposureValue() {
        return this.E / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getFadeValue() {
        return this.I / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getGrainValue() {
        return (this.P / 100.0f) * 0.04f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getHighlightsValue() {
        return e2.c.v(this.M, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.g0 || this.h0) {
            return null;
        }
        return this.f0;
    }

    @Override // org.telegram.ui.Components.yz
    public float getSaturationValue() {
        float f10 = this.H / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public MediaController.SavedFilterState getSavedFilterState() {
        MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
        savedFilterState.enhanceValue = this.D;
        savedFilterState.exposureValue = this.E;
        savedFilterState.contrastValue = this.F;
        savedFilterState.warmthValue = this.G;
        savedFilterState.saturationValue = this.H;
        savedFilterState.fadeValue = this.I;
        savedFilterState.softenSkinValue = this.J;
        savedFilterState.tintShadowsColor = this.K;
        savedFilterState.tintHighlightsColor = this.L;
        savedFilterState.highlightsValue = this.M;
        savedFilterState.shadowsValue = this.N;
        savedFilterState.vignetteValue = this.O;
        savedFilterState.grainValue = this.P;
        savedFilterState.blurType = this.Q;
        savedFilterState.sharpenValue = this.R;
        savedFilterState.curvesToolValue = this.T;
        savedFilterState.blurExcludeSize = this.U;
        savedFilterState.blurExcludePoint = this.V;
        savedFilterState.blurExcludeBlurSize = this.W;
        savedFilterState.blurAngle = this.a0;
        this.b0 = savedFilterState;
        return savedFilterState;
    }

    @Override // org.telegram.ui.Components.yz
    public float getShadowsValue() {
        return e2.c.v(this.N, 0.55f, 100.0f, 100.0f);
    }

    @Override // org.telegram.ui.Components.yz
    public float getSharpenValue() {
        return vh.v2.c(this.R, 100.0f, 0.6f, 0.11f);
    }

    @Override // org.telegram.ui.Components.yz
    public float getSoftenSkinValue() {
        return this.J / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public int getTintHighlightsColor() {
        return this.L;
    }

    @Override // org.telegram.ui.Components.yz
    public float getTintHighlightsIntensityValue() {
        return this.L == 0 ? 0.0f : 0.5f;
    }

    @Override // org.telegram.ui.Components.yz
    public int getTintShadowsColor() {
        return this.K;
    }

    @Override // org.telegram.ui.Components.yz
    public float getTintShadowsIntensityValue() {
        return this.K == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.c0;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        vz vzVar = this.i0;
        if (vzVar == null || (haVar = vzVar.F) == null) {
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

    @Override // org.telegram.ui.Components.yz
    public float getVignetteValue() {
        return this.O / 100.0f;
    }

    @Override // org.telegram.ui.Components.yz
    public float getWarmthValue() {
        return this.G / 100.0f;
    }

    public final void h() {
        int i10 = this.Q;
        TextView textView = this.p0;
        TextView textView2 = this.o0;
        org.telegram.ui.ActionBar.f6 f6Var = this.F0;
        TextView textView3 = this.n0;
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

    @Override // ph.z9
    public final boolean l(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.f0;
            if (textureView instanceof w61) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                sk0 sk0Var = ((w61) textureView).c;
                float f10 = sk0Var.a;
                if (x10 >= f10 && x10 <= f10 + sk0Var.c) {
                    float f11 = sk0Var.b;
                    if (y10 >= f11 && y10 <= f11 + sk0Var.d) {
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
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.h0) {
            int dp = size - AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(214.0f);
            boolean z4 = this.u0;
            int i12 = size2 - (dp2 + (!z4 ? AndroidUtilities.statusBarHeight : 0));
            TextureView textureView = this.f0;
            Bitmap bitmap = this.z0;
            if (bitmap != null) {
                int i13 = this.E0 % 360;
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
            float f11 = dp;
            float f12 = i12;
            if (f11 / width > f12 / height) {
                f10 = (int) Math.ceil(width * r11);
                ceil = f12;
            } else {
                ceil = (int) Math.ceil(r6 * r9);
                f10 = f11;
            }
            int ceil2 = (int) Math.ceil(((f11 - f10) / 2.0f) + AndroidUtilities.dp(14.0f));
            int ceil3 = (int) Math.ceil(((f12 - ceil) / 2.0f) + AndroidUtilities.dp(14.0f) + (!z4 ? AndroidUtilities.statusBarHeight : 0));
            int i14 = (int) f10;
            int i15 = (int) ceil;
            if (this.g0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i14;
                layoutParams.height = i15;
            }
            float f13 = ceil2;
            float f14 = ceil3 - (!z4 ? AndroidUtilities.statusBarHeight : 0);
            float f15 = i14;
            float f16 = i15;
            ef0 ef0Var = this.m0;
            sk0 sk0Var = ef0Var.e;
            sk0Var.a = f13;
            sk0Var.b = f14;
            sk0Var.c = f15;
            sk0Var.d = f16;
            cf0 cf0Var = this.l0;
            jv0 jv0Var = cf0Var.d;
            jv0Var.a = f15;
            jv0Var.b = f16;
            ((FrameLayout.LayoutParams) cf0Var.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i12;
            ((FrameLayout.LayoutParams) ef0Var.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i12;
            if (AndroidUtilities.isTablet()) {
                int dp3 = AndroidUtilities.dp(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.j0.getLayoutParams();
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

    public void setEnhanceValue(float f10) {
        this.D = f10 * 100.0f;
        g();
        int i10 = 0;
        while (true) {
            nh nhVar = this.j0;
            if (i10 >= nhVar.getChildCount()) {
                break;
            }
            View childAt = nhVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.v5) && RecyclerView.R(childAt) == this.b) {
                ((org.telegram.ui.Cells.v5) childAt).a(LocaleController.getString(R.string.Enhance), 0, this.D);
                break;
            }
            i10++;
        }
        vz vzVar = this.i0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
    }
}
