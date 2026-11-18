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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class kq extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final /* synthetic */ int g0 = 0;
    public AnimatorSet E;
    public final EditTextBoldCursor[] F;
    public final org.telegram.ui.ActionBar.g0 G;
    public final ImageView H;
    public final TextView I;
    public final org.telegram.ui.ActionBar.r0 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final float[] O;
    public final float[] P;
    public LinearGradient Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public long W;
    public final jq a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public org.telegram.ui.ActionBar.i6 e0;
    public final Drawable f;
    public int f0;
    public boolean h;
    public final RectF n;
    public boolean r;
    public Bitmap s;
    public final ColorPicker$RadioButton[] w;
    public final FrameLayout x;
    public final di.za y;

    public kq(Context context, boolean z10, jq jqVar) {
        super(context);
        this.n = new RectF();
        this.w = new ColorPicker$RadioButton[4];
        final int i7 = 1;
        this.L = 1;
        this.M = 1;
        this.O = new float[]{0.0f, 0.0f, 1.0f};
        this.P = new float[3];
        this.V = 1.0f;
        this.a0 = 0.0f;
        this.b0 = 1.0f;
        this.c0 = 0.0f;
        this.d0 = 1.0f;
        this.a = jqVar;
        final int i10 = 2;
        this.F = new EditTextBoldCursor[2];
        final int i11 = 0;
        setWillNotDraw(false);
        this.f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.b = new Paint(5);
        this.c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        di.za zaVar = new di.za(this, context);
        this.y = zaVar;
        zaVar.setOrientation(0);
        addView(zaVar, c8.ma.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        zaVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, c8.ma.d(org.telegram.messenger.ks.E2, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i12 = 0;
        while (i12 < 4) {
            this.w[i12] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.w[i12];
            colorPicker$RadioButton.d = this.T == i12;
            colorPicker$RadioButton.b(false);
            this.x.addView(this.w[i12], c8.ma.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.w[i12].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fq
                public final /* synthetic */ kq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13;
                    int i14 = i10;
                    kq kqVar = this.b;
                    int i15 = 1;
                    switch (i14) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            jq jqVar2 = kqVar.a;
                            org.telegram.ui.ActionBar.g0 g0Var = kqVar.G;
                            ImageView imageView = kqVar.H;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = kqVar.w;
                            if (kqVar.E == null) {
                                int i16 = kqVar.L;
                                if (i16 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i13 = 0;
                                        colorPicker$RadioButton2.a(kq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i13 = 0;
                                    }
                                    if (kqVar.h) {
                                        jqVar2.c(colorPicker$RadioButtonArr[i13].e, i13, true);
                                    }
                                    jqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                    kqVar.L = 2;
                                } else if (i16 == 2) {
                                    kqVar.L = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.ks.e4, fArr));
                                    }
                                    jqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i16 == 3) {
                                    kqVar.L = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(kq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    jqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (kqVar.L < kqVar.M) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.v(kqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (kqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.v(kqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (kqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (kqVar.L > 1) {
                                    if (g0Var.getVisibility() != 0) {
                                        g0Var.setScaleX(0.0f);
                                        g0Var.setScaleY(0.0f);
                                    }
                                    g0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[kqVar.L - 1].callOnClick();
                                kqVar.E = new AnimatorSet();
                                kqVar.g(kqVar.getMeasuredWidth(), arrayList, false);
                                kqVar.E.playTogether(arrayList);
                                kqVar.E.setDuration(180L);
                                kqVar.E.setInterpolator(lr.g);
                                kqVar.E.addListener(new iq(kqVar, i15));
                                kqVar.E.start();
                                break;
                            }
                            break;
                        case 1:
                            jq jqVar3 = kqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.g0 g0Var2 = kqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = kqVar.w;
                            ImageView imageView2 = kqVar.H;
                            if (kqVar.E == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i17 = kqVar.L;
                                if (i17 == 2) {
                                    kqVar.L = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i17 == 3) {
                                    kqVar.L = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                                } else if (i17 == 4) {
                                    kqVar.L = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.f3.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                                }
                                if (kqVar.L < kqVar.M) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i18 = kqVar.T;
                                if (i18 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                    for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                        colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i20 = kqVar.U;
                                if (i20 < 0 || i20 >= kqVar.T) {
                                    colorPicker$RadioButtonArr2[kqVar.L - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i20].callOnClick();
                                }
                                int i21 = 0;
                                while (i21 < colorPicker$RadioButtonArr2.length) {
                                    if (i21 < kqVar.L) {
                                        jqVar3.c(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        jqVar3.c(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i21++;
                                }
                                kqVar.E = new AnimatorSet();
                                kqVar.g(kqVar.getMeasuredWidth(), arrayList2, true);
                                kqVar.E.playTogether(arrayList2);
                                kqVar.E.setDuration(180L);
                                kqVar.E.setInterpolator(lr.g);
                                kqVar.E.addListener(new iq(kqVar, 0));
                                kqVar.E.start();
                                break;
                            }
                            break;
                        case 2:
                            kq.a(kqVar, view);
                            break;
                        default:
                            kqVar.J.V(null, null);
                            break;
                    }
                }
            });
            i12++;
        }
        int i13 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.F;
            if (i13 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i13 % 2 == 0) {
                editTextBoldCursorArr[i13] = new gq(this, context, i13, i11);
                this.F[i13].setBackgroundDrawable(null);
                this.F[i13].setText("#");
                this.F[i13].setEnabled(false);
                this.F[i13].setFocusable(false);
                this.F[i13].setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(16.0f));
                this.y.addView(this.F[i13], c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i13] = new gq(this, context, i13, i7);
                this.F[i13].setBackgroundDrawable(null);
                this.F[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.F[i13].setHint("8BC6ED");
                this.F[i13].setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(16.0f));
                this.y.addView(this.F[i13], c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.F[i13].addTextChangedListener(new hq(this, i13));
                this.F[i13].setOnEditorActionListener(new s2(i7));
            }
            this.F[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.u6.D(this.F[i13], org.telegram.ui.ActionBar.n6.H6, this.e0);
            EditTextBoldCursor editTextBoldCursor = this.F[i13];
            int i14 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i14, this.e0);
            this.F[i13].setCursorColor(org.telegram.ui.ActionBar.n6.w0(i14, this.e0));
            this.F[i13].setCursorSize(org.telegram.messenger.g0.L(18.0f));
            this.F[i13].setCursorWidth(1.5f);
            this.F[i13].setSingleLine(true);
            this.F[i13].setGravity(19);
            this.F[i13].setHeaderHintColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.L6, this.e0));
            this.F[i13].setTransformHintToHeader(true);
            this.F[i13].setInputType(524416);
            this.F[i13].setImeOptions(268435462);
            if (i13 == 1) {
                this.F[i13].requestFocus();
            } else if (i13 == 2 || i13 == 3) {
                this.F[i13].setVisibility(8);
            }
            i13++;
        }
        ImageView imageView = new ImageView(getContext());
        this.H = imageView;
        int i15 = org.telegram.ui.ActionBar.n6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i15, this.e0), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
        org.telegram.ui.ActionBar.i6 i6Var = this.e0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var);
        imageView.setImageResource(R.drawable.msg_add);
        int i16 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var2 = this.e0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i16, i6Var2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fq
            public final /* synthetic */ kq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i11;
                kq kqVar = this.b;
                int i152 = 1;
                switch (i142) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        jq jqVar2 = kqVar.a;
                        org.telegram.ui.ActionBar.g0 g0Var = kqVar.G;
                        ImageView imageView2 = kqVar.H;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = kqVar.w;
                        if (kqVar.E == null) {
                            int i162 = kqVar.L;
                            if (i162 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i132 = 0;
                                    colorPicker$RadioButton2.a(kq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i132 = 0;
                                }
                                if (kqVar.h) {
                                    jqVar2.c(colorPicker$RadioButtonArr[i132].e, i132, true);
                                }
                                jqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                kqVar.L = 2;
                            } else if (i162 == 2) {
                                kqVar.L = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.ks.e4, fArr));
                                }
                                jqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i162 == 3) {
                                kqVar.L = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(kq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                jqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (kqVar.L < kqVar.M) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.v(kqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (kqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.v(kqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (kqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (kqVar.L > 1) {
                                if (g0Var.getVisibility() != 0) {
                                    g0Var.setScaleX(0.0f);
                                    g0Var.setScaleY(0.0f);
                                }
                                g0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var, (Property<org.telegram.ui.ActionBar.g0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[kqVar.L - 1].callOnClick();
                            kqVar.E = new AnimatorSet();
                            kqVar.g(kqVar.getMeasuredWidth(), arrayList, false);
                            kqVar.E.playTogether(arrayList);
                            kqVar.E.setDuration(180L);
                            kqVar.E.setInterpolator(lr.g);
                            kqVar.E.addListener(new iq(kqVar, i152));
                            kqVar.E.start();
                            break;
                        }
                        break;
                    case 1:
                        jq jqVar3 = kqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.g0 g0Var2 = kqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = kqVar.w;
                        ImageView imageView22 = kqVar.H;
                        if (kqVar.E == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i17 = kqVar.L;
                            if (i17 == 2) {
                                kqVar.L = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i17 == 3) {
                                kqVar.L = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                            } else if (i17 == 4) {
                                kqVar.L = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.f3.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                            }
                            if (kqVar.L < kqVar.M) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i18 = kqVar.T;
                            if (i18 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                    colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i20 = kqVar.U;
                            if (i20 < 0 || i20 >= kqVar.T) {
                                colorPicker$RadioButtonArr2[kqVar.L - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i20].callOnClick();
                            }
                            int i21 = 0;
                            while (i21 < colorPicker$RadioButtonArr2.length) {
                                if (i21 < kqVar.L) {
                                    jqVar3.c(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    jqVar3.c(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i21++;
                            }
                            kqVar.E = new AnimatorSet();
                            kqVar.g(kqVar.getMeasuredWidth(), arrayList2, true);
                            kqVar.E.playTogether(arrayList2);
                            kqVar.E.setDuration(180L);
                            kqVar.E.setInterpolator(lr.g);
                            kqVar.E.addListener(new iq(kqVar, 0));
                            kqVar.E.start();
                            break;
                        }
                        break;
                    case 2:
                        kq.a(kqVar, view);
                        break;
                    default:
                        kqVar.J.V(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131754484, null));
        addView(imageView, c8.ma.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(1, getContext(), this);
        this.G = g0Var;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i15, this.e0), 1, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i15);
        org.telegram.ui.ActionBar.i6 i6Var3 = this.e0;
        g0Var.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(g0Var, h03, null, M2, i6Var3);
        g0Var.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.u6.s(g0Var, i16, this.e0, mode);
        g0Var.setAlpha(0.0f);
        g0Var.setScaleX(0.0f);
        g0Var.setScaleY(0.0f);
        g0Var.setScaleType(scaleType);
        g0Var.setVisibility(4);
        g0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fq
            public final /* synthetic */ kq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i7;
                kq kqVar = this.b;
                int i152 = 1;
                switch (i142) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        jq jqVar2 = kqVar.a;
                        org.telegram.ui.ActionBar.g0 g0Var2 = kqVar.G;
                        ImageView imageView2 = kqVar.H;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = kqVar.w;
                        if (kqVar.E == null) {
                            int i162 = kqVar.L;
                            if (i162 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i132 = 0;
                                    colorPicker$RadioButton2.a(kq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i132 = 0;
                                }
                                if (kqVar.h) {
                                    jqVar2.c(colorPicker$RadioButtonArr[i132].e, i132, true);
                                }
                                jqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                kqVar.L = 2;
                            } else if (i162 == 2) {
                                kqVar.L = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.ks.e4, fArr));
                                }
                                jqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i162 == 3) {
                                kqVar.L = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(kq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                jqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (kqVar.L < kqVar.M) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.v(kqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (kqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.v(kqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (kqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (kqVar.L > 1) {
                                if (g0Var2.getVisibility() != 0) {
                                    g0Var2.setScaleX(0.0f);
                                    g0Var2.setScaleY(0.0f);
                                }
                                g0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[kqVar.L - 1].callOnClick();
                            kqVar.E = new AnimatorSet();
                            kqVar.g(kqVar.getMeasuredWidth(), arrayList, false);
                            kqVar.E.playTogether(arrayList);
                            kqVar.E.setDuration(180L);
                            kqVar.E.setInterpolator(lr.g);
                            kqVar.E.addListener(new iq(kqVar, i152));
                            kqVar.E.start();
                            break;
                        }
                        break;
                    case 1:
                        jq jqVar3 = kqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.g0 g0Var22 = kqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = kqVar.w;
                        ImageView imageView22 = kqVar.H;
                        if (kqVar.E == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i17 = kqVar.L;
                            if (i17 == 2) {
                                kqVar.L = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i17 == 3) {
                                kqVar.L = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                            } else if (i17 == 4) {
                                kqVar.L = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.f3.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                            }
                            if (kqVar.L < kqVar.M) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i18 = kqVar.T;
                            if (i18 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                    colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i20 = kqVar.U;
                            if (i20 < 0 || i20 >= kqVar.T) {
                                colorPicker$RadioButtonArr2[kqVar.L - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i20].callOnClick();
                            }
                            int i21 = 0;
                            while (i21 < colorPicker$RadioButtonArr2.length) {
                                if (i21 < kqVar.L) {
                                    jqVar3.c(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    jqVar3.c(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i21++;
                            }
                            kqVar.E = new AnimatorSet();
                            kqVar.g(kqVar.getMeasuredWidth(), arrayList2, true);
                            kqVar.E.playTogether(arrayList2);
                            kqVar.E.setDuration(180L);
                            kqVar.E.setInterpolator(lr.g);
                            kqVar.E.addListener(new iq(kqVar, 0));
                            kqVar.E.start();
                            break;
                        }
                        break;
                    case 2:
                        kq.a(kqVar, view);
                        break;
                    default:
                        kqVar.J.V(null, null);
                        break;
                }
            }
        });
        g0Var.setContentDescription(org.telegram.messenger.gd.M0(2131752088, null));
        addView(g0Var, c8.ma.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(textView, i16, this.e0);
        addView(textView, c8.ma.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new bi.o(15));
        if (z10) {
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, (org.telegram.ui.ActionBar.z) null, org.telegram.ui.ActionBar.n6.w0(i16, this.e0));
            this.J = r0Var;
            r0Var.setLongClickEnabled(false);
            r0Var.setIcon(R.drawable.ic_ab_other);
            r0Var.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
            r0Var.e(1, R.drawable.msg_edit, org.telegram.messenger.gd.M0(2131747604, null));
            r0Var.e(2, R.drawable.msg_share, org.telegram.messenger.gd.M0(2131745231, null));
            r0Var.e(3, R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751475, null));
            r0Var.setMenuYOffset(-org.telegram.messenger.g0.L(80.0f));
            r0Var.setSubMenuOpenSide(2);
            r0Var.setDelegate(new b0(this, 25));
            r0Var.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
            r0Var.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i15, this.e0), 1, -1);
            org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i15);
            org.telegram.ui.ActionBar.i6 i6Var4 = this.e0;
            r0Var.setBackground(h04);
            org.telegram.ui.ActionBar.u6.j(r0Var, h04, null, M3, i6Var4);
            addView(r0Var, c8.ma.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            final int i17 = 3;
            r0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fq
                public final /* synthetic */ kq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132;
                    int i142 = i17;
                    kq kqVar = this.b;
                    int i152 = 1;
                    switch (i142) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            jq jqVar2 = kqVar.a;
                            org.telegram.ui.ActionBar.g0 g0Var2 = kqVar.G;
                            ImageView imageView2 = kqVar.H;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = kqVar.w;
                            if (kqVar.E == null) {
                                int i162 = kqVar.L;
                                if (i162 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i132 = 0;
                                        colorPicker$RadioButton2.a(kq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i132 = 0;
                                    }
                                    if (kqVar.h) {
                                        jqVar2.c(colorPicker$RadioButtonArr[i132].e, i132, true);
                                    }
                                    jqVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                    kqVar.L = 2;
                                } else if (i162 == 2) {
                                    kqVar.L = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.ks.e4, fArr));
                                    }
                                    jqVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i162 == 3) {
                                    kqVar.L = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(kq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    jqVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (kqVar.L < kqVar.M) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.v(kqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (kqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.v(kqVar.L, 1, org.telegram.messenger.g0.L(13.0f), (kqVar.L - 1) * org.telegram.messenger.g0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (kqVar.L > 1) {
                                    if (g0Var2.getVisibility() != 0) {
                                        g0Var2.setScaleX(0.0f);
                                        g0Var2.setScaleY(0.0f);
                                    }
                                    g0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(g0Var2, (Property<org.telegram.ui.ActionBar.g0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[kqVar.L - 1].callOnClick();
                                kqVar.E = new AnimatorSet();
                                kqVar.g(kqVar.getMeasuredWidth(), arrayList, false);
                                kqVar.E.playTogether(arrayList);
                                kqVar.E.setDuration(180L);
                                kqVar.E.setInterpolator(lr.g);
                                kqVar.E.addListener(new iq(kqVar, i152));
                                kqVar.E.start();
                                break;
                            }
                            break;
                        case 1:
                            jq jqVar3 = kqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.g0 g0Var22 = kqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = kqVar.w;
                            ImageView imageView22 = kqVar.H;
                            if (kqVar.E == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i172 = kqVar.L;
                                if (i172 == 2) {
                                    kqVar.L = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(g0Var22, (Property<org.telegram.ui.ActionBar.g0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i172 == 3) {
                                    kqVar.L = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                                } else if (i172 == 4) {
                                    kqVar.L = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.f3.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                                }
                                if (kqVar.L < kqVar.M) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i18 = kqVar.T;
                                if (i18 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                    for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                        colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i20 = kqVar.U;
                                if (i20 < 0 || i20 >= kqVar.T) {
                                    colorPicker$RadioButtonArr2[kqVar.L - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i20].callOnClick();
                                }
                                int i21 = 0;
                                while (i21 < colorPicker$RadioButtonArr2.length) {
                                    if (i21 < kqVar.L) {
                                        jqVar3.c(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        jqVar3.c(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i21++;
                                }
                                kqVar.E = new AnimatorSet();
                                kqVar.g(kqVar.getMeasuredWidth(), arrayList2, true);
                                kqVar.E.playTogether(arrayList2);
                                kqVar.E.setDuration(180L);
                                kqVar.E.setInterpolator(lr.g);
                                kqVar.E.addListener(new iq(kqVar, 0));
                                kqVar.E.start();
                                break;
                            }
                            break;
                        case 2:
                            kq.a(kqVar, view);
                            break;
                        default:
                            kqVar.J.V(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(kq kqVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i7 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = kqVar.w;
            if (i7 >= colorPicker$RadioButtonArr.length) {
                int i10 = colorPicker$RadioButton.e;
                kqVar.setColorInner(i10);
                kqVar.F[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i7];
            boolean z10 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z10;
            colorPicker$RadioButton2.b(true);
            if (z10) {
                kqVar.U = kqVar.T;
                kqVar.T = i7;
            }
            i7++;
        }
    }

    public static int d(int i7) {
        float[] fArr = new float[3];
        Color.colorToHSV(i7, fArr);
        float f10 = fArr[1];
        if (f10 > 0.5f) {
            fArr[1] = f10 - 0.15f;
        } else {
            fArr[1] = f10 + 0.15f;
        }
        float f11 = fArr[0];
        if (f11 > 180.0f) {
            fArr[0] = f11 - 20.0f;
        } else {
            fArr[0] = f11 + 20.0f;
        }
        return Color.HSVToColor(org.telegram.messenger.ks.e4, fArr);
    }

    private float getBrightness() {
        return Math.max(this.c0, Math.min(this.O[2], this.d0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorInner(int i7) {
        Color.colorToHSV(i7, this.O);
        int d = this.a.d(this.T);
        if (d == 0 || d != i7) {
            h();
        }
        this.Q = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i7, int i10, int i11, boolean z10) {
        int L = org.telegram.messenger.g0.L(z10 ? 12.0f : 16.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i7 - L, i10 - L, i7 + L, L + i10);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f10 = i7;
        float f11 = i10;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(z10 ? 11.0f : 15.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(z10 ? 9.0f : 13.0f), paint);
    }

    public final void e(int i7, int i10) {
        if (!this.r) {
            this.r = true;
            if (this.T == i10) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i7)), Byte.valueOf((byte) Color.green(i7)), Byte.valueOf((byte) Color.blue(i7))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.F;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.w[i10].a(i7);
            this.r = false;
        }
        setColorInner(i7);
    }

    public final void f(int i7, int i10, int i11, boolean z10) {
        if (i7 != this.K) {
            this.U = 0;
            this.T = 0;
            int i12 = 0;
            while (i12 < 4) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.w[i12];
                colorPicker$RadioButton.d = i12 == this.T;
                colorPicker$RadioButton.b(true);
                i12++;
            }
        }
        this.M = i10;
        this.K = i7;
        this.h = z10;
        this.L = i11;
        ImageView imageView = this.H;
        if (i11 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i11 == 2) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f));
        } else if (i11 == 3) {
            imageView.setTranslationX(org.telegram.messenger.f3.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.f3.D(13.0f, 3, org.telegram.messenger.g0.L(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.g0 g0Var = this.G;
        org.telegram.ui.ActionBar.r0 r0Var = this.J;
        if (r0Var != null) {
            if (i7 == 1) {
                r0Var.setVisibility(0);
            } else {
                r0Var.setVisibility(8);
                g0Var.setTranslationX(0.0f);
            }
        }
        if (i10 <= 1) {
            imageView.setVisibility(8);
            g0Var.setVisibility(8);
        } else {
            if (i11 < i10) {
                imageView.setVisibility(0);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                imageView.setVisibility(8);
            }
            if (i11 > 1) {
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

    public final void g(int i7, ArrayList arrayList, boolean z10) {
        int i10 = this.L;
        float f10 = 30.0f;
        int D = org.telegram.messenger.f3.D(13.0f, i10 - 1, org.telegram.messenger.g0.L(30.0f) * i10);
        FrameLayout frameLayout = this.x;
        float f11 = frameLayout.getLeft() + D > i7 - org.telegram.messenger.g0.L(this.K == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, -f11));
        } else {
            frameLayout.setTranslationX(-f11);
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.w;
            if (i11 >= colorPicker$RadioButtonArr.length) {
                return;
            }
            boolean z11 = colorPicker$RadioButtonArr[i11].getTag(R.id.index_tag) != null;
            int i13 = this.L;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            float f12 = f10;
            Property property4 = View.ALPHA;
            if (i11 < i13) {
                colorPicker$RadioButtonArr[i11].setVisibility(0);
                if (arrayList != null) {
                    if (!z11) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property2, 1.0f));
                    }
                    if (z10 || !(z10 || i11 == this.L - 1)) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property, i12));
                    } else {
                        colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                    }
                } else {
                    colorPicker$RadioButtonArr[i11].setVisibility(0);
                    if (this.E == null) {
                        colorPicker$RadioButtonArr[i11].setAlpha(1.0f);
                        colorPicker$RadioButtonArr[i11].setScaleX(1.0f);
                        colorPicker$RadioButtonArr[i11].setScaleY(1.0f);
                    }
                    colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                }
                colorPicker$RadioButtonArr[i11].setTag(R.id.index_tag, 1);
            } else {
                if (arrayList == null) {
                    colorPicker$RadioButtonArr[i11].setVisibility(4);
                    if (this.E == null) {
                        colorPicker$RadioButtonArr[i11].setAlpha(0.0f);
                        colorPicker$RadioButtonArr[i11].setScaleX(0.0f);
                        colorPicker$RadioButtonArr[i11].setScaleY(0.0f);
                    }
                } else if (z11) {
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property4, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property3, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property2, 0.0f));
                }
                if (!z10) {
                    colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                }
                colorPicker$RadioButtonArr[i11].setTag(R.id.index_tag, null);
            }
            i12 = org.telegram.messenger.f3.C(13.0f, org.telegram.messenger.g0.L(f12), i12);
            i11++;
            f10 = f12;
        }
    }

    public int getColor() {
        float[] fArr = this.O;
        float f10 = fArr[0];
        float[] fArr2 = this.P;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        org.telegram.ui.ActionBar.g0 g0Var = this.G;
        if (g0Var == null) {
            return;
        }
        float f10 = g0Var.getTag() != null ? 0.0f : this.a0;
        float f11 = g0Var.getTag() != null ? 1.0f : this.b0;
        float[] fArr = this.O;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.c0 = 0.0f;
            this.d0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float B = org.telegram.messenger.g0.B(HSVToColor);
        float max = Math.max(0.0f, Math.min(f10 / B, 1.0f));
        this.c0 = max;
        this.d0 = Math.max(max, Math.min(f11 / B, 1.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int L = org.telegram.messenger.g0.L(45.0f);
        float f11 = L;
        canvas.drawBitmap(this.s, 0.0f, f11, (Paint) null);
        int height = this.s.getHeight() + L;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f11, getMeasuredWidth(), L + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.O;
        float f12 = fArr[0];
        float[] fArr2 = this.P;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, fArr[1], this.s.getHeight(), f11);
        if (!this.R) {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            float interpolation = lr.g.getInterpolation(this.V);
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
        float L3 = org.telegram.messenger.g0.L(22.0f);
        float L4 = org.telegram.messenger.g0.L(26.0f) + height;
        float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(22.0f);
        float L5 = org.telegram.messenger.g0.L(34.0f) + height;
        RectF rectF = this.n;
        rectF.set(L3, L4, measuredWidth2, L5);
        LinearGradient linearGradient = this.Q;
        Paint paint2 = this.c;
        if (linearGradient == null) {
            fArr2[2] = this.c0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.d0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.Q = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        if (this.c0 == this.d0) {
            f10 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f15 = this.c0;
            f10 = (brightness - f15) / (this.d0 - f15);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f10)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (this.R || this.V >= 1.0f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.W;
        this.W = elapsedRealtime;
        float f16 = (j3 / 180.0f) + this.V;
        this.V = f16;
        if (f16 > 1.0f) {
            this.V = 1.0f;
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        g(getMeasuredWidth(), null, false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (this.N != i7) {
            this.N = i7;
            int L = org.telegram.messenger.g0.L(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i7, L, Bitmap.Config.ARGB_8888);
            float f10 = i7;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f11 = L;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, L / 3, 0.0f, f11, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f10, f11, paint);
            this.s = createBitmap;
            this.Q = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        if (r12 <= (r5.bottom + org.telegram.messenger.g0.L(7.0f))) goto L37;
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
        float f10;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.S = false;
                this.R = false;
                this.W = SystemClock.elapsedRealtime();
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int L = org.telegram.messenger.g0.L(45.0f);
        boolean z10 = this.R;
        float[] fArr = this.O;
        if (z10 || (!this.S && y10 >= L && y10 <= this.s.getHeight() + L)) {
            if (!this.R) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.R = true;
            this.V = 0.0f;
            this.W = SystemClock.elapsedRealtime();
            x10 = Math.max(0, Math.min(x10, this.s.getWidth()));
            y10 = Math.max(L, Math.min(y10, this.s.getHeight() + L));
            if (this.c0 == this.d0) {
                f10 = 0.5f;
            } else {
                float brightness = getBrightness();
                float f11 = this.c0;
                f10 = (brightness - f11) / (this.d0 - f11);
            }
            fArr[0] = (x10 * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y10 - L));
            h();
            fArr[2] = (this.d0 * f10) + ((1.0f - f10) * this.c0);
            this.Q = null;
        }
        boolean z11 = this.S;
        RectF rectF = this.n;
        if (!z11) {
            if (!this.R) {
                float f12 = x10;
                if (f12 >= rectF.left && f12 <= rectF.right) {
                    float f13 = y10;
                    if (f13 >= rectF.top - org.telegram.messenger.g0.L(7.0f)) {
                    }
                }
            }
            if (this.S && !this.R) {
                return true;
            }
            int color = getColor();
            if (!this.r) {
                int red = Color.red(color);
                int green = Color.green(color);
                int blue = Color.blue(color);
                this.r = true;
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) red), Byte.valueOf((byte) green), Byte.valueOf((byte) blue)).toUpperCase();
                Editable text = this.F[1].getText();
                text.replace(0, text.length(), upperCase);
                this.w[this.T].a(color);
                this.r = false;
            }
            this.a.c(color, this.T, false);
            invalidate();
            return true;
        }
        float width = 1.0f - ((x10 - rectF.left) / rectF.width());
        float f14 = width >= 0.0f ? width > 1.0f ? 1.0f : width : 0.0f;
        fArr[2] = (this.d0 * f14) + ((1.0f - f14) * this.c0);
        if (!this.S) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        this.S = true;
        if (this.S) {
        }
        int color2 = getColor();
        if (!this.r) {
        }
        this.a.c(color2, this.T, false);
        invalidate();
        return true;
    }

    public void setHasChanges(boolean z10) {
        TextView textView = this.I;
        if (!z10 || textView.getTag() == null) {
            if ((z10 || textView.getTag() != null) && this.G.getTag() == null) {
                textView.setTag(z10 ? 1 : null);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (z10) {
                    textView.setVisibility(0);
                }
                arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
                animatorSet.addListener(new org.telegram.ui.on(7, this, z10));
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(180L);
                animatorSet.start();
            }
        }
    }

    public void setMaxBrightness(float f10) {
        this.b0 = f10;
        h();
    }

    public void setMinBrightness(float f10) {
        this.a0 = f10;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.i6 i6Var) {
        this.e0 = i6Var;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.r0 r0Var = this.J;
        if (r0Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.e0);
                if (w02 != this.f0) {
                    this.f0 = w02;
                    r0Var.setIconColor(w02);
                }
                r0Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.e0), false);
                r0Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, this.e0), true);
                r0Var.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.e0));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.F;
        if (editTextBoldCursorArr != null) {
            for (int i7 = 0; i7 < editTextBoldCursorArr.length; i7++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.e0));
                    editTextBoldCursorArr[i7].setHeaderHintColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.L6, this.e0));
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
