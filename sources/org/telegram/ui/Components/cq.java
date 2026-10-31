package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class cq extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int f0 = 0;
    public AnimatorSet D;
    public final EditTextBoldCursor[] E;
    public final org.telegram.ui.ActionBar.g0 F;
    public final ImageView G;
    public final TextView H;
    public final org.telegram.ui.ActionBar.t0 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final float[] N;
    public final float[] O;
    public LinearGradient P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public float U;
    public long V;
    public float W;
    public final bq a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public org.telegram.ui.ActionBar.p6 d0;
    public final Paint e;
    public int e0;
    public final Drawable f;
    public boolean h;
    public final RectF n;
    public boolean r;
    public Bitmap s;
    public final ColorPicker$RadioButton[] w;
    public final FrameLayout x;
    public final ai.b y;

    public cq(Context context, boolean z10, bq bqVar) {
        super(context);
        int i10;
        this.n = new RectF();
        this.w = new ColorPicker$RadioButton[4];
        final int i11 = 1;
        this.K = 1;
        this.L = 1;
        int i12 = 3;
        this.N = new float[]{0.0f, 0.0f, 1.0f};
        this.O = new float[3];
        this.U = 1.0f;
        this.W = 0.0f;
        this.a0 = 1.0f;
        this.b0 = 0.0f;
        this.c0 = 1.0f;
        this.a = bqVar;
        final int i13 = 2;
        this.E = new EditTextBoldCursor[2];
        final int i14 = 0;
        setWillNotDraw(false);
        this.f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.b = new Paint(5);
        this.c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        ai.b bVar = new ai.b(this, context);
        this.y = bVar;
        bVar.setOrientation(0);
        addView(bVar, w7.b6.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        bVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, w7.b6.d(org.telegram.messenger.zs.E2, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i15 = 0;
        while (i15 < 4) {
            this.w[i15] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.w[i15];
            colorPicker$RadioButton.d = this.S == i15;
            colorPicker$RadioButton.b(false);
            this.x.addView(this.w[i15], w7.b6.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.w[i15].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xp
                public final /* synthetic */ cq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16;
                    int i17 = i13;
                    cq cqVar = this.b;
                    int i18 = 1;
                    switch (i17) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            bq bqVar2 = cqVar.a;
                            org.telegram.ui.ActionBar.g0 g0Var = cqVar.F;
                            ImageView imageView = cqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.w;
                            if (cqVar.D == null) {
                                int i19 = cqVar.K;
                                if (i19 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i16 = 0;
                                        colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i16 = 0;
                                    }
                                    if (cqVar.h) {
                                        bqVar2.c(colorPicker$RadioButtonArr[i16].e, i16, true);
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                    cqVar.K = 2;
                                } else if (i19 == 2) {
                                    cqVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f7 = fArr[0];
                                        if (f7 > 180.0f) {
                                            fArr[0] = f7 - 60.0f;
                                        } else {
                                            fArr[0] = f7 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.zs.e4, fArr));
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i19 == 3) {
                                    cqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (cqVar.K < cqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (cqVar.K > 1) {
                                    if (g0Var.getVisibility() != 0) {
                                        g0Var.setScaleX(0.0f);
                                        g0Var.setScaleY(0.0f);
                                    }
                                    g0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[cqVar.K - 1].callOnClick();
                                cqVar.D = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                                cqVar.D.playTogether(arrayList);
                                cqVar.D.setDuration(180L);
                                cqVar.D.setInterpolator(gr.g);
                                cqVar.D.addListener(new aq(cqVar, i18));
                                cqVar.D.start();
                                break;
                            }
                            break;
                        case 1:
                            bq bqVar3 = cqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.g0 g0Var2 = cqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.w;
                            ImageView imageView2 = cqVar.G;
                            if (cqVar.D == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i20 = cqVar.K;
                                if (i20 == 2) {
                                    cqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i20 == 3) {
                                    cqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f)));
                                } else if (i20 == 4) {
                                    cqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2)));
                                }
                                if (cqVar.K < cqVar.L) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i21 = cqVar.S;
                                if (i21 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i21];
                                    for (int i22 = i21 + 1; i22 < colorPicker$RadioButtonArr2.length; i22++) {
                                        colorPicker$RadioButtonArr2[i22 - 1] = colorPicker$RadioButtonArr2[i22];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i23 = cqVar.T;
                                if (i23 < 0 || i23 >= cqVar.S) {
                                    colorPicker$RadioButtonArr2[cqVar.K - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i23].callOnClick();
                                }
                                int i24 = 0;
                                while (i24 < colorPicker$RadioButtonArr2.length) {
                                    if (i24 < cqVar.K) {
                                        bqVar3.c(colorPicker$RadioButtonArr2[i24].e, i24, i24 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        bqVar3.c(0, i24, i24 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i24++;
                                }
                                cqVar.D = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                                cqVar.D.playTogether(arrayList2);
                                cqVar.D.setDuration(180L);
                                cqVar.D.setInterpolator(gr.g);
                                cqVar.D.addListener(new aq(cqVar, 0));
                                cqVar.D.start();
                                break;
                            }
                            break;
                        case 2:
                            cq.a(cqVar, view);
                            break;
                        default:
                            cqVar.I.U(null, null);
                            break;
                    }
                }
            });
            i15++;
        }
        int i16 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.E;
            i10 = 6;
            if (i16 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i16 % 2 == 0) {
                editTextBoldCursorArr[i16] = new yp(this, context, i16, i14);
                this.E[i16].setBackgroundDrawable(null);
                this.E[i16].setText("#");
                this.E[i16].setEnabled(false);
                this.E[i16].setFocusable(false);
                this.E[i16].setPadding(0, org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(16.0f));
                this.y.addView(this.E[i16], w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i16] = new yp(this, context, i16, i11);
                this.E[i16].setBackgroundDrawable(null);
                this.E[i16].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.E[i16].setHint("8BC6ED");
                this.E[i16].setPadding(0, org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(16.0f));
                this.y.addView(this.E[i16], w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.E[i16].addTextChangedListener(new zp(this, i16));
                this.E[i16].setOnEditorActionListener(new ig.r(i12));
            }
            this.E[i16].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.E(this.E[i16], org.telegram.ui.ActionBar.t6.H6, this.d0);
            EditTextBoldCursor editTextBoldCursor = this.E[i16];
            int i17 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i17, this.d0);
            this.E[i16].setCursorColor(org.telegram.ui.ActionBar.t6.w0(i17, this.d0));
            this.E[i16].setCursorSize(org.telegram.messenger.i0.L(18.0f));
            this.E[i16].setCursorWidth(1.5f);
            this.E[i16].setSingleLine(true);
            this.E[i16].setGravity(19);
            this.E[i16].setHeaderHintColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L6, this.d0));
            this.E[i16].setTransformHintToHeader(true);
            this.E[i16].setInputType(524416);
            this.E[i16].setImeOptions(268435462);
            if (i16 == 1) {
                this.E[i16].requestFocus();
            } else if (i16 == 2 || i16 == 3) {
                this.E[i16].setVisibility(8);
            }
            i16++;
        }
        ImageView imageView = new ImageView(getContext());
        this.G = imageView;
        int i18 = org.telegram.ui.ActionBar.t6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i18, this.d0), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i18);
        org.telegram.ui.ActionBar.p6 p6Var = this.d0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        imageView.setImageResource(R.drawable.msg_add);
        int i19 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var2 = this.d0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i19, p6Var2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xp
            public final /* synthetic */ cq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162;
                int i172 = i14;
                cq cqVar = this.b;
                int i182 = 1;
                switch (i172) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        bq bqVar2 = cqVar.a;
                        org.telegram.ui.ActionBar.g0 g0Var = cqVar.F;
                        ImageView imageView2 = cqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.w;
                        if (cqVar.D == null) {
                            int i192 = cqVar.K;
                            if (i192 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i162 = 0;
                                    colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i162 = 0;
                                }
                                if (cqVar.h) {
                                    bqVar2.c(colorPicker$RadioButtonArr[i162].e, i162, true);
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                cqVar.K = 2;
                            } else if (i192 == 2) {
                                cqVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f7 = fArr[0];
                                    if (f7 > 180.0f) {
                                        fArr[0] = f7 - 60.0f;
                                    } else {
                                        fArr[0] = f7 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.zs.e4, fArr));
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i192 == 3) {
                                cqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (cqVar.K < cqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (cqVar.K > 1) {
                                if (g0Var.getVisibility() != 0) {
                                    g0Var.setScaleX(0.0f);
                                    g0Var.setScaleY(0.0f);
                                }
                                g0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[cqVar.K - 1].callOnClick();
                            cqVar.D = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                            cqVar.D.playTogether(arrayList);
                            cqVar.D.setDuration(180L);
                            cqVar.D.setInterpolator(gr.g);
                            cqVar.D.addListener(new aq(cqVar, i182));
                            cqVar.D.start();
                            break;
                        }
                        break;
                    case 1:
                        bq bqVar3 = cqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.g0 g0Var2 = cqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.w;
                        ImageView imageView22 = cqVar.G;
                        if (cqVar.D == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i20 = cqVar.K;
                            if (i20 == 2) {
                                cqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i20 == 3) {
                                cqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f)));
                            } else if (i20 == 4) {
                                cqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2)));
                            }
                            if (cqVar.K < cqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i21 = cqVar.S;
                            if (i21 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i21];
                                for (int i22 = i21 + 1; i22 < colorPicker$RadioButtonArr2.length; i22++) {
                                    colorPicker$RadioButtonArr2[i22 - 1] = colorPicker$RadioButtonArr2[i22];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i23 = cqVar.T;
                            if (i23 < 0 || i23 >= cqVar.S) {
                                colorPicker$RadioButtonArr2[cqVar.K - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i23].callOnClick();
                            }
                            int i24 = 0;
                            while (i24 < colorPicker$RadioButtonArr2.length) {
                                if (i24 < cqVar.K) {
                                    bqVar3.c(colorPicker$RadioButtonArr2[i24].e, i24, i24 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    bqVar3.c(0, i24, i24 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i24++;
                            }
                            cqVar.D = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                            cqVar.D.playTogether(arrayList2);
                            cqVar.D.setDuration(180L);
                            cqVar.D.setInterpolator(gr.g);
                            cqVar.D.addListener(new aq(cqVar, 0));
                            cqVar.D.start();
                            break;
                        }
                        break;
                    case 2:
                        cq.a(cqVar, view);
                        break;
                    default:
                        cqVar.I.U(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754486, null));
        addView(imageView, w7.b6.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(this, getContext(), 1);
        this.F = g0Var;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i18, this.d0), 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i18);
        org.telegram.ui.ActionBar.p6 p6Var3 = this.d0;
        g0Var.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(g0Var, h03, null, N2, p6Var3);
        g0Var.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.a7.t(g0Var, i19, this.d0, mode);
        g0Var.setAlpha(0.0f);
        g0Var.setScaleX(0.0f);
        g0Var.setScaleY(0.0f);
        g0Var.setScaleType(scaleType);
        g0Var.setVisibility(4);
        g0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xp
            public final /* synthetic */ cq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i162;
                int i172 = i11;
                cq cqVar = this.b;
                int i182 = 1;
                switch (i172) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        bq bqVar2 = cqVar.a;
                        org.telegram.ui.ActionBar.g0 g0Var2 = cqVar.F;
                        ImageView imageView2 = cqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.w;
                        if (cqVar.D == null) {
                            int i192 = cqVar.K;
                            if (i192 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i162 = 0;
                                    colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i162 = 0;
                                }
                                if (cqVar.h) {
                                    bqVar2.c(colorPicker$RadioButtonArr[i162].e, i162, true);
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                cqVar.K = 2;
                            } else if (i192 == 2) {
                                cqVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f7 = fArr[0];
                                    if (f7 > 180.0f) {
                                        fArr[0] = f7 - 60.0f;
                                    } else {
                                        fArr[0] = f7 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.zs.e4, fArr));
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i192 == 3) {
                                cqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                bqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (cqVar.K < cqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (cqVar.K > 1) {
                                if (g0Var2.getVisibility() != 0) {
                                    g0Var2.setScaleX(0.0f);
                                    g0Var2.setScaleY(0.0f);
                                }
                                g0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[cqVar.K - 1].callOnClick();
                            cqVar.D = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                            cqVar.D.playTogether(arrayList);
                            cqVar.D.setDuration(180L);
                            cqVar.D.setInterpolator(gr.g);
                            cqVar.D.addListener(new aq(cqVar, i182));
                            cqVar.D.start();
                            break;
                        }
                        break;
                    case 1:
                        bq bqVar3 = cqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.g0 g0Var22 = cqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.w;
                        ImageView imageView22 = cqVar.G;
                        if (cqVar.D == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i20 = cqVar.K;
                            if (i20 == 2) {
                                cqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i20 == 3) {
                                cqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f)));
                            } else if (i20 == 4) {
                                cqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2)));
                            }
                            if (cqVar.K < cqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i21 = cqVar.S;
                            if (i21 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i21];
                                for (int i22 = i21 + 1; i22 < colorPicker$RadioButtonArr2.length; i22++) {
                                    colorPicker$RadioButtonArr2[i22 - 1] = colorPicker$RadioButtonArr2[i22];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i23 = cqVar.T;
                            if (i23 < 0 || i23 >= cqVar.S) {
                                colorPicker$RadioButtonArr2[cqVar.K - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i23].callOnClick();
                            }
                            int i24 = 0;
                            while (i24 < colorPicker$RadioButtonArr2.length) {
                                if (i24 < cqVar.K) {
                                    bqVar3.c(colorPicker$RadioButtonArr2[i24].e, i24, i24 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    bqVar3.c(0, i24, i24 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i24++;
                            }
                            cqVar.D = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                            cqVar.D.playTogether(arrayList2);
                            cqVar.D.setDuration(180L);
                            cqVar.D.setInterpolator(gr.g);
                            cqVar.D.addListener(new aq(cqVar, 0));
                            cqVar.D.start();
                            break;
                        }
                        break;
                    case 2:
                        cq.a(cqVar, view);
                        break;
                    default:
                        cqVar.I.U(null, null);
                        break;
                }
            }
        });
        g0Var.setContentDescription(org.telegram.messenger.cd.L0(2131752099, null));
        addView(g0Var, w7.b6.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.H = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.V(textView, i19, this.d0);
        addView(textView, w7.b6.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new bh.c(i10));
        if (z10) {
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.t6.w0(i19, this.d0));
            this.I = t0Var;
            t0Var.setLongClickEnabled(false);
            t0Var.setIcon(R.drawable.ic_ab_other);
            t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
            t0Var.e(1, R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131747813, null));
            t0Var.e(2, R.drawable.msg_share, org.telegram.messenger.cd.L0(2131745444, null));
            t0Var.e(3, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751487, null));
            t0Var.setMenuYOffset(-org.telegram.messenger.i0.L(80.0f));
            t0Var.setSubMenuOpenSide(2);
            t0Var.setDelegate(new t(this, 26));
            t0Var.setAdditionalYOffset(org.telegram.messenger.i0.L(72.0f));
            t0Var.setTranslationX(org.telegram.messenger.i0.L(6.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i18, this.d0), 1, -1);
            org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i18);
            org.telegram.ui.ActionBar.p6 p6Var4 = this.d0;
            t0Var.setBackground(h04);
            org.telegram.ui.ActionBar.a7.k(t0Var, h04, null, N3, p6Var4);
            addView(t0Var, w7.b6.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            final int i20 = 3;
            t0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xp
                public final /* synthetic */ cq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162;
                    int i172 = i20;
                    cq cqVar = this.b;
                    int i182 = 1;
                    switch (i172) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            bq bqVar2 = cqVar.a;
                            org.telegram.ui.ActionBar.g0 g0Var2 = cqVar.F;
                            ImageView imageView2 = cqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.w;
                            if (cqVar.D == null) {
                                int i192 = cqVar.K;
                                if (i192 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i162 = 0;
                                        colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i162 = 0;
                                    }
                                    if (cqVar.h) {
                                        bqVar2.c(colorPicker$RadioButtonArr[i162].e, i162, true);
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                    cqVar.K = 2;
                                } else if (i192 == 2) {
                                    cqVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f7 = fArr[0];
                                        if (f7 > 180.0f) {
                                            fArr[0] = f7 - 60.0f;
                                        } else {
                                            fArr[0] = f7 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.zs.e4, fArr));
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i192 == 3) {
                                    cqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    bqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (cqVar.K < cqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(cqVar.K, 1, org.telegram.messenger.i0.L(13.0f), (cqVar.K - 1) * org.telegram.messenger.i0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (cqVar.K > 1) {
                                    if (g0Var2.getVisibility() != 0) {
                                        g0Var2.setScaleX(0.0f);
                                        g0Var2.setScaleY(0.0f);
                                    }
                                    g0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[cqVar.K - 1].callOnClick();
                                cqVar.D = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                                cqVar.D.playTogether(arrayList);
                                cqVar.D.setDuration(180L);
                                cqVar.D.setInterpolator(gr.g);
                                cqVar.D.addListener(new aq(cqVar, i182));
                                cqVar.D.start();
                                break;
                            }
                            break;
                        case 1:
                            bq bqVar3 = cqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.g0 g0Var22 = cqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.w;
                            ImageView imageView22 = cqVar.G;
                            if (cqVar.D == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i202 = cqVar.K;
                                if (i202 == 2) {
                                    cqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i202 == 3) {
                                    cqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f)));
                                } else if (i202 == 4) {
                                    cqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2)));
                                }
                                if (cqVar.K < cqVar.L) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i21 = cqVar.S;
                                if (i21 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i21];
                                    for (int i22 = i21 + 1; i22 < colorPicker$RadioButtonArr2.length; i22++) {
                                        colorPicker$RadioButtonArr2[i22 - 1] = colorPicker$RadioButtonArr2[i22];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i23 = cqVar.T;
                                if (i23 < 0 || i23 >= cqVar.S) {
                                    colorPicker$RadioButtonArr2[cqVar.K - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i23].callOnClick();
                                }
                                int i24 = 0;
                                while (i24 < colorPicker$RadioButtonArr2.length) {
                                    if (i24 < cqVar.K) {
                                        bqVar3.c(colorPicker$RadioButtonArr2[i24].e, i24, i24 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        bqVar3.c(0, i24, i24 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i24++;
                                }
                                cqVar.D = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                                cqVar.D.playTogether(arrayList2);
                                cqVar.D.setDuration(180L);
                                cqVar.D.setInterpolator(gr.g);
                                cqVar.D.addListener(new aq(cqVar, 0));
                                cqVar.D.start();
                                break;
                            }
                            break;
                        case 2:
                            cq.a(cqVar, view);
                            break;
                        default:
                            cqVar.I.U(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(cq cqVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.w;
            if (i10 >= colorPicker$RadioButtonArr.length) {
                int i11 = colorPicker$RadioButton.e;
                cqVar.setColorInner(i11);
                cqVar.E[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i10];
            boolean z10 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z10;
            colorPicker$RadioButton2.b(true);
            if (z10) {
                cqVar.T = cqVar.S;
                cqVar.S = i10;
            }
            i10++;
        }
    }

    public static int d(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        float f7 = fArr[1];
        if (f7 > 0.5f) {
            fArr[1] = f7 - 0.15f;
        } else {
            fArr[1] = f7 + 0.15f;
        }
        float f10 = fArr[0];
        if (f10 > 180.0f) {
            fArr[0] = f10 - 20.0f;
        } else {
            fArr[0] = f10 + 20.0f;
        }
        return Color.HSVToColor(org.telegram.messenger.zs.e4, fArr);
    }

    private float getBrightness() {
        return Math.max(this.b0, Math.min(this.N[2], this.c0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.N);
        int d = this.a.d(this.S);
        if (d == 0 || d != i10) {
            h();
        }
        this.P = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i10, int i11, int i12, boolean z10) {
        int L = org.telegram.messenger.i0.L(z10 ? 12.0f : 16.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i10 - L, i11 - L, i10 + L, L + i11);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f7 = i10;
        float f10 = i11;
        canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(z10 ? 11.0f : 15.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(z10 ? 9.0f : 13.0f), paint);
    }

    public final void e(int i10, int i11) {
        if (!this.r) {
            this.r = true;
            if (this.S == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.E;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.w[i11].a(i10);
            this.r = false;
        }
        setColorInner(i10);
    }

    public final void f(int i10, int i11, int i12, boolean z10) {
        if (i10 != this.J) {
            this.T = 0;
            this.S = 0;
            int i13 = 0;
            while (i13 < 4) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.w[i13];
                colorPicker$RadioButton.d = i13 == this.S;
                colorPicker$RadioButton.b(true);
                i13++;
            }
        }
        this.L = i11;
        this.J = i10;
        this.h = z10;
        this.K = i12;
        ImageView imageView = this.G;
        if (i12 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i12 == 2) {
            imageView.setTranslationX(org.telegram.messenger.i0.L(13.0f) + org.telegram.messenger.i0.L(30.0f));
        } else if (i12 == 3) {
            imageView.setTranslationX(org.telegram.messenger.m5.D(13.0f, 2, org.telegram.messenger.i0.L(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.m5.D(13.0f, 3, org.telegram.messenger.i0.L(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.g0 g0Var = this.F;
        org.telegram.ui.ActionBar.t0 t0Var = this.I;
        if (t0Var != null) {
            if (i10 == 1) {
                t0Var.setVisibility(0);
            } else {
                t0Var.setVisibility(8);
                g0Var.setTranslationX(0.0f);
            }
        }
        if (i11 <= 1) {
            imageView.setVisibility(8);
            g0Var.setVisibility(8);
        } else {
            if (i12 < i11) {
                imageView.setVisibility(0);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                imageView.setVisibility(8);
            }
            if (i12 > 1) {
                g0Var.setVisibility(0);
                g0Var.setScaleX(1.0f);
                g0Var.setScaleY(1.0f);
                g0Var.setAlpha(1.0f);
            } else {
                g0Var.setVisibility(8);
            }
        }
        this.y.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i10, ArrayList arrayList, boolean z10) {
        int i11 = this.K;
        float f7 = 30.0f;
        int D = org.telegram.messenger.m5.D(13.0f, i11 - 1, org.telegram.messenger.i0.L(30.0f) * i11);
        FrameLayout frameLayout = this.x;
        float f10 = frameLayout.getLeft() + D > i10 - org.telegram.messenger.i0.L(this.J == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, -f10));
        } else {
            frameLayout.setTranslationX(-f10);
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.w;
            if (i12 >= colorPicker$RadioButtonArr.length) {
                return;
            }
            boolean z11 = colorPicker$RadioButtonArr[i12].getTag(R.id.index_tag) != null;
            int i14 = this.K;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            float f11 = f7;
            Property property4 = View.ALPHA;
            if (i12 < i14) {
                colorPicker$RadioButtonArr[i12].setVisibility(0);
                if (arrayList != null) {
                    if (!z11) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property2, 1.0f));
                    }
                    if (z10 || !(z10 || i12 == this.K - 1)) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property, i13));
                    } else {
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                } else {
                    colorPicker$RadioButtonArr[i12].setVisibility(0);
                    if (this.D == null) {
                        colorPicker$RadioButtonArr[i12].setAlpha(1.0f);
                        colorPicker$RadioButtonArr[i12].setScaleX(1.0f);
                        colorPicker$RadioButtonArr[i12].setScaleY(1.0f);
                    }
                    colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                }
                colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, 1);
            } else {
                if (arrayList == null) {
                    colorPicker$RadioButtonArr[i12].setVisibility(4);
                    if (this.D == null) {
                        colorPicker$RadioButtonArr[i12].setAlpha(0.0f);
                        colorPicker$RadioButtonArr[i12].setScaleX(0.0f);
                        colorPicker$RadioButtonArr[i12].setScaleY(0.0f);
                    }
                } else if (z11) {
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property4, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property3, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property2, 0.0f));
                }
                if (!z10) {
                    colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                }
                colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, null);
            }
            i13 = org.telegram.messenger.m5.C(13.0f, org.telegram.messenger.i0.L(f11), i13);
            i12++;
            f7 = f11;
        }
    }

    public int getColor() {
        float[] fArr = this.N;
        float f7 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f7;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        org.telegram.ui.ActionBar.g0 g0Var = this.F;
        if (g0Var == null) {
            return;
        }
        float f7 = g0Var.getTag() != null ? 0.0f : this.W;
        float f10 = g0Var.getTag() != null ? 1.0f : this.a0;
        float[] fArr = this.N;
        float f11 = fArr[2];
        if (f7 == 0.0f && f10 == 1.0f) {
            this.b0 = 0.0f;
            this.c0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f11;
        float B = org.telegram.messenger.i0.B(HSVToColor);
        float max = Math.max(0.0f, Math.min(f7 / B, 1.0f));
        this.b0 = max;
        this.c0 = Math.max(max, Math.min(f10 / B, 1.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        int L = org.telegram.messenger.i0.L(45.0f);
        float f10 = L;
        canvas.drawBitmap(this.s, 0.0f, f10, (Paint) null);
        int height = this.s.getHeight() + L;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f10, getMeasuredWidth(), L + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.N;
        float f11 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f11;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) c3.i0.z(1.0f, fArr[1], this.s.getHeight(), f10);
        if (!this.Q) {
            int L2 = org.telegram.messenger.i0.L(16.0f);
            float interpolation = gr.g.getInterpolation(this.U);
            if (measuredWidth < L2) {
                measuredWidth = (int) (((L2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - L2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - L2)) * interpolation));
            }
            if (z10 < L + L2) {
                z10 = (int) ((interpolation * (r5 - z10)) + z10);
            } else if (z10 > (this.s.getHeight() + L) - L2) {
                z10 = (int) (z10 - (interpolation * (z10 - ((this.s.getHeight() + L) - L2))));
            }
        }
        c(canvas, measuredWidth, z10, Color.HSVToColor(fArr2), false);
        float L3 = org.telegram.messenger.i0.L(22.0f);
        float L4 = org.telegram.messenger.i0.L(26.0f) + height;
        float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.i0.L(22.0f);
        float L5 = org.telegram.messenger.i0.L(34.0f) + height;
        RectF rectF = this.n;
        rectF.set(L3, L4, measuredWidth2, L5);
        LinearGradient linearGradient = this.P;
        Paint paint2 = this.c;
        if (linearGradient == null) {
            fArr2[2] = this.b0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.c0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f12 = rectF.left;
            float f13 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f12, f13, rectF.right, f13, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.P = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint2);
        if (this.b0 == this.c0) {
            f7 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f14 = this.b0;
            f7 = (brightness - f14) / (this.c0 - f14);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f7)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (this.Q || this.U >= 1.0f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.V;
        this.V = elapsedRealtime;
        float f15 = (j10 / 180.0f) + this.U;
        this.U = f15;
        if (f15 > 1.0f) {
            this.U = 1.0f;
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g(getMeasuredWidth(), null, false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.M != i10) {
            this.M = i10;
            int L = org.telegram.messenger.i0.L(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i10, L, Bitmap.Config.ARGB_8888);
            float f7 = i10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f10 = L;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, L / 3, 0.0f, f10, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f7, f10, paint);
            this.s = createBitmap;
            this.P = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        if (r12 <= (r5.bottom + org.telegram.messenger.i0.L(7.0f))) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0 != 2) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f7;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.R = false;
                this.Q = false;
                this.V = SystemClock.elapsedRealtime();
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int L = org.telegram.messenger.i0.L(45.0f);
        boolean z10 = this.Q;
        float[] fArr = this.N;
        if (z10 || (!this.R && y3 >= L && y3 <= this.s.getHeight() + L)) {
            if (!this.Q) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.Q = true;
            this.U = 0.0f;
            this.V = SystemClock.elapsedRealtime();
            x10 = Math.max(0, Math.min(x10, this.s.getWidth()));
            y3 = Math.max(L, Math.min(y3, this.s.getHeight() + L));
            if (this.b0 == this.c0) {
                f7 = 0.5f;
            } else {
                float brightness = getBrightness();
                float f10 = this.b0;
                f7 = (brightness - f10) / (this.c0 - f10);
            }
            fArr[0] = (x10 * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y3 - L));
            h();
            fArr[2] = (this.c0 * f7) + ((1.0f - f7) * this.b0);
            this.P = null;
        }
        boolean z11 = this.R;
        RectF rectF = this.n;
        if (!z11) {
            if (!this.Q) {
                float f11 = x10;
                if (f11 >= rectF.left && f11 <= rectF.right) {
                    float f12 = y3;
                    if (f12 >= rectF.top - org.telegram.messenger.i0.L(7.0f)) {
                    }
                }
            }
            if (this.R && !this.Q) {
                return true;
            }
            int color = getColor();
            if (!this.r) {
                int red = Color.red(color);
                int green = Color.green(color);
                int blue = Color.blue(color);
                this.r = true;
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) red), Byte.valueOf((byte) green), Byte.valueOf((byte) blue)).toUpperCase();
                Editable text = this.E[1].getText();
                text.replace(0, text.length(), upperCase);
                this.w[this.S].a(color);
                this.r = false;
            }
            this.a.c(color, this.S, false);
            invalidate();
            return true;
        }
        float width = 1.0f - ((x10 - rectF.left) / rectF.width());
        float f13 = width >= 0.0f ? width > 1.0f ? 1.0f : width : 0.0f;
        fArr[2] = (this.c0 * f13) + ((1.0f - f13) * this.b0);
        if (!this.R) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        this.R = true;
        if (this.R) {
        }
        int color2 = getColor();
        if (!this.r) {
        }
        this.a.c(color2, this.S, false);
        invalidate();
        return true;
    }

    public void setHasChanges(boolean z10) {
        TextView textView = this.H;
        if (!z10 || textView.getTag() == null) {
            if ((z10 || textView.getTag() != null) && this.F.getTag() == null) {
                textView.setTag(z10 ? 1 : null);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (z10) {
                    textView.setVisibility(0);
                }
                arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
                animatorSet.addListener(new eg.m(22, this, z10));
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(180L);
                animatorSet.start();
            }
        }
    }

    public void setMaxBrightness(float f7) {
        this.a0 = f7;
        h();
    }

    public void setMinBrightness(float f7) {
        this.W = f7;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.d0 = p6Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.t0 t0Var = this.I;
        if (t0Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.d0);
                if (w02 != this.e0) {
                    this.e0 = w02;
                    t0Var.setIconColor(w02);
                }
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.d0), false);
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.d0), true);
                t0Var.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.d0));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.E;
        if (editTextBoldCursorArr != null) {
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.d0));
                    editTextBoldCursorArr[i10].setHeaderHintColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L6, this.d0));
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
