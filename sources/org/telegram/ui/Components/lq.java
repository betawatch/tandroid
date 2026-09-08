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
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class lq extends FrameLayout {
    public static final /* synthetic */ int e0 = 0;
    public final EditTextBoldCursor[] E;
    public final org.telegram.ui.ActionBar.k0 F;
    public final ImageView G;
    public final TextView H;
    public final org.telegram.ui.ActionBar.v0 I;
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
    public final kq a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public org.telegram.ui.ActionBar.f6 d0;
    public final Paint e;
    public final Drawable f;
    public boolean h;
    public final RectF n;
    public boolean r;
    public Bitmap s;
    public final ColorPicker$RadioButton[] v;
    public final FrameLayout w;
    public final bi.v0 x;
    public AnimatorSet y;

    public lq(Context context, boolean z10, kq kqVar) {
        super(context);
        this.n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        final int i10 = 1;
        this.K = 1;
        this.L = 1;
        final int i11 = 3;
        this.N = new float[]{0.0f, 0.0f, 1.0f};
        this.O = new float[3];
        this.U = 1.0f;
        this.W = 0.0f;
        this.a0 = 1.0f;
        this.b0 = 0.0f;
        this.c0 = 1.0f;
        this.a = kqVar;
        final int i12 = 2;
        this.E = new EditTextBoldCursor[2];
        final int i13 = 0;
        setWillNotDraw(false);
        this.f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.b = new Paint(5);
        this.c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        bi.v0 v0Var = new bi.v0(this, context);
        this.x = v0Var;
        v0Var.setOrientation(0);
        addView(v0Var, w7.x5.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        v0Var.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, w7.x5.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i14 = 0;
        while (i14 < 4) {
            this.v[i14] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i14];
            colorPicker$RadioButton.d = this.S == i14;
            colorPicker$RadioButton.b(false);
            this.w.addView(this.v[i14], w7.x5.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i14].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gq
                public final /* synthetic */ lq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15;
                    int i16 = i12;
                    lq lqVar = this.b;
                    switch (i16) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            kq kqVar2 = lqVar.a;
                            org.telegram.ui.ActionBar.k0 k0Var = lqVar.F;
                            ImageView imageView = lqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = lqVar.v;
                            if (lqVar.y == null) {
                                int i17 = lqVar.K;
                                if (i17 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i15 = 0;
                                        colorPicker$RadioButton2.a(lq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i15 = 0;
                                    }
                                    if (lqVar.h) {
                                        kqVar2.B0(colorPicker$RadioButtonArr[i15].e, i15, true);
                                    }
                                    kqVar2.B0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    lqVar.K = 2;
                                } else if (i17 == 2) {
                                    lqVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f7 = fArr[0];
                                        if (f7 > 180.0f) {
                                            fArr[0] = f7 - 60.0f;
                                        } else {
                                            fArr[0] = f7 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    kqVar2.B0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i17 == 3) {
                                    lqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(lq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    kqVar2.B0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (lqVar.K < lqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.w(lqVar.K, 1, AndroidUtilities.dp(13.0f), (lqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.w(lqVar.K, 1, AndroidUtilities.dp(13.0f), (lqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (lqVar.K > 1) {
                                    if (k0Var.getVisibility() != 0) {
                                        k0Var.setScaleX(0.0f);
                                        k0Var.setScaleY(0.0f);
                                    }
                                    k0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[lqVar.K - 1].callOnClick();
                                lqVar.y = new AnimatorSet();
                                lqVar.g(lqVar.getMeasuredWidth(), arrayList, false);
                                lqVar.y.playTogether(arrayList);
                                lqVar.y.setDuration(180L);
                                lqVar.y.setInterpolator(pr.g);
                                lqVar.y.addListener(new j6(lqVar, 17));
                                lqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            kq kqVar3 = lqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.k0 k0Var2 = lqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = lqVar.v;
                            ImageView imageView2 = lqVar.G;
                            if (lqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i18 = lqVar.K;
                                if (i18 == 2) {
                                    lqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i18 == 3) {
                                    lqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i18 == 4) {
                                    lqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.w1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (lqVar.K < lqVar.L) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i19 = lqVar.S;
                                if (i19 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                    for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                        colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i21 = lqVar.T;
                                if (i21 < 0 || i21 >= lqVar.S) {
                                    colorPicker$RadioButtonArr2[lqVar.K - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i21].callOnClick();
                                }
                                int i22 = 0;
                                while (i22 < colorPicker$RadioButtonArr2.length) {
                                    if (i22 < lqVar.K) {
                                        kqVar3.B0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        kqVar3.B0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i22++;
                                }
                                lqVar.y = new AnimatorSet();
                                lqVar.g(lqVar.getMeasuredWidth(), arrayList2, true);
                                lqVar.y.playTogether(arrayList2);
                                lqVar.y.setDuration(180L);
                                lqVar.y.setInterpolator(pr.g);
                                lqVar.y.addListener(new jq(lqVar));
                                lqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            lq.a(lqVar, view);
                            break;
                        default:
                            lqVar.I.M(null, null);
                            break;
                    }
                }
            });
            i14++;
        }
        int i15 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.E;
            if (i15 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i15 % 2 == 0) {
                editTextBoldCursorArr[i15] = new hq(this, context, i15, i13);
                this.E[i15].setBackgroundDrawable(null);
                this.E[i15].setText("#");
                this.E[i15].setEnabled(false);
                this.E[i15].setFocusable(false);
                this.E[i15].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.E[i15], w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i15] = new hq(this, context, i15, i10);
                this.E[i15].setBackgroundDrawable(null);
                this.E[i15].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.E[i15].setHint("8BC6ED");
                this.E[i15].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.E[i15], w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.E[i15].addTextChangedListener(new iq(this, i15));
                this.E[i15].setOnEditorActionListener(new s2(i10));
            }
            this.E[i15].setTextSize(1, 16.0f);
            this.E[i15].setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, this.d0));
            EditTextBoldCursor editTextBoldCursor = this.E[i15];
            int i16 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, this.d0));
            this.E[i15].setCursorColor(org.telegram.ui.ActionBar.j6.v0(i16, this.d0));
            this.E[i15].setCursorSize(AndroidUtilities.dp(18.0f));
            this.E[i15].setCursorWidth(1.5f);
            this.E[i15].setSingleLine(true);
            this.E[i15].setGravity(19);
            this.E[i15].setHeaderHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, this.d0));
            this.E[i15].setTransformHintToHeader(true);
            this.E[i15].setInputType(524416);
            this.E[i15].setImeOptions(268435462);
            if (i15 == 1) {
                this.E[i15].requestFocus();
            } else if (i15 == 2 || i15 == 3) {
                this.E[i15].setVisibility(8);
            }
            i15++;
        }
        ImageView imageView = new ImageView(getContext());
        this.G = imageView;
        int i17 = org.telegram.ui.ActionBar.j6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i17, this.d0), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i18, this.d0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gq
            public final /* synthetic */ lq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162 = i13;
                lq lqVar = this.b;
                switch (i162) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        kq kqVar2 = lqVar.a;
                        org.telegram.ui.ActionBar.k0 k0Var = lqVar.F;
                        ImageView imageView2 = lqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = lqVar.v;
                        if (lqVar.y == null) {
                            int i172 = lqVar.K;
                            if (i172 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i152 = 0;
                                    colorPicker$RadioButton2.a(lq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i152 = 0;
                                }
                                if (lqVar.h) {
                                    kqVar2.B0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                }
                                kqVar2.B0(colorPicker$RadioButtonArr[1].e, 1, true);
                                lqVar.K = 2;
                            } else if (i172 == 2) {
                                lqVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f7 = fArr[0];
                                    if (f7 > 180.0f) {
                                        fArr[0] = f7 - 60.0f;
                                    } else {
                                        fArr[0] = f7 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                kqVar2.B0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i172 == 3) {
                                lqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(lq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                kqVar2.B0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (lqVar.K < lqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.w(lqVar.K, 1, AndroidUtilities.dp(13.0f), (lqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.w(lqVar.K, 1, AndroidUtilities.dp(13.0f), (lqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (lqVar.K > 1) {
                                if (k0Var.getVisibility() != 0) {
                                    k0Var.setScaleX(0.0f);
                                    k0Var.setScaleY(0.0f);
                                }
                                k0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[lqVar.K - 1].callOnClick();
                            lqVar.y = new AnimatorSet();
                            lqVar.g(lqVar.getMeasuredWidth(), arrayList, false);
                            lqVar.y.playTogether(arrayList);
                            lqVar.y.setDuration(180L);
                            lqVar.y.setInterpolator(pr.g);
                            lqVar.y.addListener(new j6(lqVar, 17));
                            lqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        kq kqVar3 = lqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.k0 k0Var2 = lqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = lqVar.v;
                        ImageView imageView22 = lqVar.G;
                        if (lqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i182 = lqVar.K;
                            if (i182 == 2) {
                                lqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i182 == 3) {
                                lqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i182 == 4) {
                                lqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.w1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (lqVar.K < lqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i19 = lqVar.S;
                            if (i19 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                    colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i21 = lqVar.T;
                            if (i21 < 0 || i21 >= lqVar.S) {
                                colorPicker$RadioButtonArr2[lqVar.K - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i21].callOnClick();
                            }
                            int i22 = 0;
                            while (i22 < colorPicker$RadioButtonArr2.length) {
                                if (i22 < lqVar.K) {
                                    kqVar3.B0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    kqVar3.B0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i22++;
                            }
                            lqVar.y = new AnimatorSet();
                            lqVar.g(lqVar.getMeasuredWidth(), arrayList2, true);
                            lqVar.y.playTogether(arrayList2);
                            lqVar.y.setDuration(180L);
                            lqVar.y.setInterpolator(pr.g);
                            lqVar.y.addListener(new jq(lqVar));
                            lqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        lq.a(lqVar, view);
                        break;
                    default:
                        lqVar.I.M(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, w7.x5.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(this, getContext(), 1);
        this.F = k0Var;
        k0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i17, this.d0), 1, -1));
        k0Var.setImageResource(R.drawable.msg_close);
        k0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i18, this.d0), mode));
        k0Var.setAlpha(0.0f);
        k0Var.setScaleX(0.0f);
        k0Var.setScaleY(0.0f);
        k0Var.setScaleType(scaleType);
        k0Var.setVisibility(4);
        k0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gq
            public final /* synthetic */ lq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162 = i10;
                lq lqVar = this.b;
                switch (i162) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        kq kqVar2 = lqVar.a;
                        org.telegram.ui.ActionBar.k0 k0Var2 = lqVar.F;
                        ImageView imageView2 = lqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = lqVar.v;
                        if (lqVar.y == null) {
                            int i172 = lqVar.K;
                            if (i172 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i152 = 0;
                                    colorPicker$RadioButton2.a(lq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i152 = 0;
                                }
                                if (lqVar.h) {
                                    kqVar2.B0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                }
                                kqVar2.B0(colorPicker$RadioButtonArr[1].e, 1, true);
                                lqVar.K = 2;
                            } else if (i172 == 2) {
                                lqVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f7 = fArr[0];
                                    if (f7 > 180.0f) {
                                        fArr[0] = f7 - 60.0f;
                                    } else {
                                        fArr[0] = f7 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                kqVar2.B0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i172 == 3) {
                                lqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(lq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                kqVar2.B0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (lqVar.K < lqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.w(lqVar.K, 1, AndroidUtilities.dp(13.0f), (lqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.w(lqVar.K, 1, AndroidUtilities.dp(13.0f), (lqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (lqVar.K > 1) {
                                if (k0Var2.getVisibility() != 0) {
                                    k0Var2.setScaleX(0.0f);
                                    k0Var2.setScaleY(0.0f);
                                }
                                k0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[lqVar.K - 1].callOnClick();
                            lqVar.y = new AnimatorSet();
                            lqVar.g(lqVar.getMeasuredWidth(), arrayList, false);
                            lqVar.y.playTogether(arrayList);
                            lqVar.y.setDuration(180L);
                            lqVar.y.setInterpolator(pr.g);
                            lqVar.y.addListener(new j6(lqVar, 17));
                            lqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        kq kqVar3 = lqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.k0 k0Var22 = lqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = lqVar.v;
                        ImageView imageView22 = lqVar.G;
                        if (lqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i182 = lqVar.K;
                            if (i182 == 2) {
                                lqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i182 == 3) {
                                lqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i182 == 4) {
                                lqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.w1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (lqVar.K < lqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i19 = lqVar.S;
                            if (i19 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                    colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i21 = lqVar.T;
                            if (i21 < 0 || i21 >= lqVar.S) {
                                colorPicker$RadioButtonArr2[lqVar.K - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i21].callOnClick();
                            }
                            int i22 = 0;
                            while (i22 < colorPicker$RadioButtonArr2.length) {
                                if (i22 < lqVar.K) {
                                    kqVar3.B0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    kqVar3.B0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i22++;
                            }
                            lqVar.y = new AnimatorSet();
                            lqVar.g(lqVar.getMeasuredWidth(), arrayList2, true);
                            lqVar.y.playTogether(arrayList2);
                            lqVar.y.setDuration(180L);
                            lqVar.y.setInterpolator(pr.g);
                            lqVar.y.addListener(new jq(lqVar));
                            lqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        lq.a(lqVar, view);
                        break;
                    default:
                        lqVar.I.M(null, null);
                        break;
                }
            }
        });
        k0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(k0Var, w7.x5.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.H = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, this.d0));
        addView(textView, w7.x5.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new ah.f(10));
        if (z10) {
            org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(context, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.j6.v0(i18, this.d0));
            this.I = v0Var2;
            v0Var2.setLongClickEnabled(false);
            v0Var2.setIcon(R.drawable.ic_ab_other);
            v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            v0Var2.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            v0Var2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            v0Var2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            v0Var2.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            v0Var2.setSubMenuOpenSide(2);
            v0Var2.setDelegate(new t(this, 26));
            v0Var2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            v0Var2.setTranslationX(AndroidUtilities.dp(6.0f));
            v0Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i17, this.d0), 1, -1));
            addView(v0Var2, w7.x5.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            v0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gq
                public final /* synthetic */ lq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152;
                    int i162 = i11;
                    lq lqVar = this.b;
                    switch (i162) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            kq kqVar2 = lqVar.a;
                            org.telegram.ui.ActionBar.k0 k0Var2 = lqVar.F;
                            ImageView imageView2 = lqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = lqVar.v;
                            if (lqVar.y == null) {
                                int i172 = lqVar.K;
                                if (i172 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i152 = 0;
                                        colorPicker$RadioButton2.a(lq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i152 = 0;
                                    }
                                    if (lqVar.h) {
                                        kqVar2.B0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                    }
                                    kqVar2.B0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    lqVar.K = 2;
                                } else if (i172 == 2) {
                                    lqVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f7 = fArr[0];
                                        if (f7 > 180.0f) {
                                            fArr[0] = f7 - 60.0f;
                                        } else {
                                            fArr[0] = f7 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    kqVar2.B0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i172 == 3) {
                                    lqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(lq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    kqVar2.B0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (lqVar.K < lqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.w(lqVar.K, 1, AndroidUtilities.dp(13.0f), (lqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.gms.internal.vision.e2.w(lqVar.K, 1, AndroidUtilities.dp(13.0f), (lqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (lqVar.K > 1) {
                                    if (k0Var2.getVisibility() != 0) {
                                        k0Var2.setScaleX(0.0f);
                                        k0Var2.setScaleY(0.0f);
                                    }
                                    k0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[lqVar.K - 1].callOnClick();
                                lqVar.y = new AnimatorSet();
                                lqVar.g(lqVar.getMeasuredWidth(), arrayList, false);
                                lqVar.y.playTogether(arrayList);
                                lqVar.y.setDuration(180L);
                                lqVar.y.setInterpolator(pr.g);
                                lqVar.y.addListener(new j6(lqVar, 17));
                                lqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            kq kqVar3 = lqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.k0 k0Var22 = lqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = lqVar.v;
                            ImageView imageView22 = lqVar.G;
                            if (lqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i182 = lqVar.K;
                                if (i182 == 2) {
                                    lqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i182 == 3) {
                                    lqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i182 == 4) {
                                    lqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.w1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (lqVar.K < lqVar.L) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i19 = lqVar.S;
                                if (i19 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                    for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                        colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i21 = lqVar.T;
                                if (i21 < 0 || i21 >= lqVar.S) {
                                    colorPicker$RadioButtonArr2[lqVar.K - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i21].callOnClick();
                                }
                                int i22 = 0;
                                while (i22 < colorPicker$RadioButtonArr2.length) {
                                    if (i22 < lqVar.K) {
                                        kqVar3.B0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        kqVar3.B0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i22++;
                                }
                                lqVar.y = new AnimatorSet();
                                lqVar.g(lqVar.getMeasuredWidth(), arrayList2, true);
                                lqVar.y.playTogether(arrayList2);
                                lqVar.y.setDuration(180L);
                                lqVar.y.setInterpolator(pr.g);
                                lqVar.y.addListener(new jq(lqVar));
                                lqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            lq.a(lqVar, view);
                            break;
                        default:
                            lqVar.I.M(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(lq lqVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = lqVar.v;
            if (i10 >= colorPicker$RadioButtonArr.length) {
                int i11 = colorPicker$RadioButton.e;
                lqVar.setColorInner(i11);
                lqVar.E[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i10];
            boolean z10 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z10;
            colorPicker$RadioButton2.b(true);
            if (z10) {
                lqVar.T = lqVar.S;
                lqVar.S = i10;
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
        return Color.HSVToColor(255, fArr);
    }

    private float getBrightness() {
        return Math.max(this.b0, Math.min(this.N[2], this.c0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.N);
        int M0 = this.a.M0(this.S);
        if (M0 == 0 || M0 != i10) {
            h();
        }
        this.P = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i10, int i11, int i12, boolean z10) {
        int dp = AndroidUtilities.dp(z10 ? 12.0f : 16.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f7 = i10;
        float f10 = i11;
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(z10 ? 11.0f : 15.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(z10 ? 9.0f : 13.0f), paint);
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
            this.v[i11].a(i10);
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
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
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
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i12 == 3) {
            imageView.setTranslationX(org.telegram.messenger.w1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.w1.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.k0 k0Var = this.F;
        org.telegram.ui.ActionBar.v0 v0Var = this.I;
        if (v0Var != null) {
            if (i10 == 1) {
                v0Var.setVisibility(0);
            } else {
                v0Var.setVisibility(8);
                k0Var.setTranslationX(0.0f);
            }
        }
        if (i11 <= 1) {
            imageView.setVisibility(8);
            k0Var.setVisibility(8);
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
                k0Var.setVisibility(0);
                k0Var.setScaleX(1.0f);
                k0Var.setScaleY(1.0f);
                k0Var.setAlpha(1.0f);
            } else {
                k0Var.setVisibility(8);
            }
        }
        this.x.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i10, ArrayList arrayList, boolean z10) {
        float f7;
        int i11 = this.K;
        int D = org.telegram.messenger.w1.D(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.w;
        float f10 = frameLayout.getLeft() + D > i10 - AndroidUtilities.dp(this.J == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, -f10));
        } else {
            frameLayout.setTranslationX(-f10);
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.v;
            if (i12 >= colorPicker$RadioButtonArr.length) {
                return;
            }
            boolean z11 = colorPicker$RadioButtonArr[i12].getTag(R.id.index_tag) != null;
            int i14 = this.K;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (i12 < i14) {
                colorPicker$RadioButtonArr[i12].setVisibility(0);
                if (arrayList != null) {
                    if (z11) {
                        f7 = 30.0f;
                    } else {
                        f7 = 30.0f;
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
                    f7 = 30.0f;
                    colorPicker$RadioButtonArr[i12].setVisibility(0);
                    if (this.y == null) {
                        colorPicker$RadioButtonArr[i12].setAlpha(1.0f);
                        colorPicker$RadioButtonArr[i12].setScaleX(1.0f);
                        colorPicker$RadioButtonArr[i12].setScaleY(1.0f);
                    }
                    colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                }
                colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, 1);
            } else {
                f7 = 30.0f;
                if (arrayList == null) {
                    colorPicker$RadioButtonArr[i12].setVisibility(4);
                    if (this.y == null) {
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
            i13 = org.telegram.messenger.w1.C(13.0f, AndroidUtilities.dp(f7), i13);
            i12++;
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
        org.telegram.ui.ActionBar.k0 k0Var = this.F;
        if (k0Var == null) {
            return;
        }
        float f7 = k0Var.getTag() != null ? 0.0f : this.W;
        float f10 = k0Var.getTag() != null ? 1.0f : this.a0;
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
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        float max = Math.max(0.0f, Math.min(f7 / computePerceivedBrightness, 1.0f));
        this.b0 = max;
        this.c0 = Math.max(max, Math.min(f10 / computePerceivedBrightness, 1.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.x.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        int dp = AndroidUtilities.dp(45.0f);
        float f10 = dp;
        canvas.drawBitmap(this.s, 0.0f, f10, (Paint) null);
        int height = this.s.getHeight() + dp;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f10, getMeasuredWidth(), dp + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.N;
        float f11 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f11;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, fArr[1], this.s.getHeight(), f10);
        if (!this.Q) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = pr.g.getInterpolation(this.U);
            if (measuredWidth < dp2) {
                measuredWidth = (int) (((dp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - dp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - dp2)) * interpolation));
            }
            if (z10 < dp + dp2) {
                z10 = (int) ((interpolation * (r5 - z10)) + z10);
            } else if (z10 > (this.s.getHeight() + dp) - dp2) {
                z10 = (int) (z10 - (interpolation * (z10 - ((this.s.getHeight() + dp) - dp2))));
            }
        }
        c(canvas, measuredWidth, z10, Color.HSVToColor(fArr2), false);
        float dp3 = AndroidUtilities.dp(22.0f);
        float dp4 = AndroidUtilities.dp(26.0f) + height;
        float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(22.0f);
        float dp5 = AndroidUtilities.dp(34.0f) + height;
        RectF rectF = this.n;
        rectF.set(dp3, dp4, measuredWidth2, dp5);
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
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
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
        long j3 = elapsedRealtime - this.V;
        this.V = elapsedRealtime;
        float f15 = (j3 / 180.0f) + this.U;
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
            int dp = AndroidUtilities.dp(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i10, dp, Bitmap.Config.ARGB_8888);
            float f7 = i10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f10 = dp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, dp / 3, 0.0f, f10, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f7, f10, paint);
            this.s = createBitmap;
            this.P = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f4, code lost:
    
        if (r12 <= (r5.bottom + org.telegram.messenger.AndroidUtilities.dp(7.0f))) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0 != 2) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
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
        int dp = AndroidUtilities.dp(45.0f);
        boolean z10 = this.Q;
        float[] fArr = this.N;
        if (z10 || (!this.R && y3 >= dp && y3 <= this.s.getHeight() + dp)) {
            if (!this.Q) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.Q = true;
            this.U = 0.0f;
            this.V = SystemClock.elapsedRealtime();
            x10 = Math.max(0, Math.min(x10, this.s.getWidth()));
            y3 = Math.max(dp, Math.min(y3, this.s.getHeight() + dp));
            if (this.b0 == this.c0) {
                f7 = 0.5f;
            } else {
                float brightness = getBrightness();
                float f10 = this.b0;
                f7 = (brightness - f10) / (this.c0 - f10);
            }
            fArr[0] = (x10 * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y3 - dp));
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
                    if (f12 >= rectF.top - AndroidUtilities.dp(7.0f)) {
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
                this.v[this.S].a(color);
                this.r = false;
            }
            this.a.B0(color, this.S, false);
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
        this.a.B0(color2, this.S, false);
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
                animatorSet.addListener(new org.telegram.ui.to(7, this, z10));
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

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.d0 = f6Var;
    }
}
