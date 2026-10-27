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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class yq extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final /* synthetic */ int f0 = 0;
    public final EditTextBoldCursor[] E;
    public final org.telegram.ui.ActionBar.k0 F;
    public final ImageView G;
    public final TextView H;
    public final org.telegram.ui.ActionBar.w0 I;
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
    public final xq a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public org.telegram.ui.ActionBar.u6 d0;
    public final Paint e;
    public int e0;
    public final Drawable f;
    public boolean h;
    public final RectF n;
    public boolean r;
    public Bitmap s;
    public final ColorPicker$RadioButton[] v;
    public final FrameLayout w;
    public final bi.mc x;
    public AnimatorSet y;

    public yq(Context context, boolean z10, xq xqVar) {
        super(context);
        this.n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        final int i10 = 1;
        this.K = 1;
        this.L = 1;
        this.N = new float[]{0.0f, 0.0f, 1.0f};
        this.O = new float[3];
        this.U = 1.0f;
        this.W = 0.0f;
        this.a0 = 1.0f;
        this.b0 = 0.0f;
        this.c0 = 1.0f;
        this.a = xqVar;
        final int i11 = 2;
        this.E = new EditTextBoldCursor[2];
        final int i12 = 0;
        setWillNotDraw(false);
        this.f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.b = new Paint(5);
        this.c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        bi.mc mcVar = new bi.mc(this, context);
        this.x = mcVar;
        mcVar.setOrientation(0);
        addView(mcVar, kb1.h(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        mcVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, kb1.h(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i13 = 0;
        while (i13 < 4) {
            this.v[i13] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
            colorPicker$RadioButton.d = this.S == i13;
            colorPicker$RadioButton.b(false);
            this.w.addView(this.v[i13], kb1.h(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i13].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tq
                public final /* synthetic */ yq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14;
                    int i15 = i11;
                    yq yqVar = this.b;
                    switch (i15) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            xq xqVar2 = yqVar.a;
                            org.telegram.ui.ActionBar.k0 k0Var = yqVar.F;
                            ImageView imageView = yqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = yqVar.v;
                            if (yqVar.y == null) {
                                int i16 = yqVar.K;
                                if (i16 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i14 = 0;
                                        colorPicker$RadioButton2.a(yq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i14 = 0;
                                    }
                                    if (yqVar.h) {
                                        xqVar2.x0(colorPicker$RadioButtonArr[i14].e, i14, true);
                                    }
                                    xqVar2.x0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    yqVar.K = 2;
                                } else if (i16 == 2) {
                                    yqVar.K = 3;
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
                                    xqVar2.x0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i16 == 3) {
                                    yqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(yq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    xqVar2.x0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (yqVar.K < yqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, c3.h0.w(yqVar.K, 1, AndroidUtilities.dp(13.0f), (yqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, c3.h0.w(yqVar.K, 1, AndroidUtilities.dp(13.0f), (yqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (yqVar.K > 1) {
                                    if (k0Var.getVisibility() != 0) {
                                        k0Var.setScaleX(0.0f);
                                        k0Var.setScaleY(0.0f);
                                    }
                                    k0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[yqVar.K - 1].callOnClick();
                                yqVar.y = new AnimatorSet();
                                yqVar.g(yqVar.getMeasuredWidth(), arrayList, false);
                                yqVar.y.playTogether(arrayList);
                                yqVar.y.setDuration(180L);
                                yqVar.y.setInterpolator(ds.g);
                                yqVar.y.addListener(new org.telegram.ui.sp(yqVar, 21));
                                yqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            xq xqVar3 = yqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.k0 k0Var2 = yqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = yqVar.v;
                            ImageView imageView2 = yqVar.G;
                            if (yqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i17 = yqVar.K;
                                if (i17 == 2) {
                                    yqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i17 == 3) {
                                    yqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i17 == 4) {
                                    yqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.wh.b(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (yqVar.K < yqVar.L) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i18 = yqVar.S;
                                if (i18 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                    for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                        colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i20 = yqVar.T;
                                if (i20 < 0 || i20 >= yqVar.S) {
                                    colorPicker$RadioButtonArr2[yqVar.K - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i20].callOnClick();
                                }
                                int i21 = 0;
                                while (i21 < colorPicker$RadioButtonArr2.length) {
                                    if (i21 < yqVar.K) {
                                        xqVar3.x0(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        xqVar3.x0(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i21++;
                                }
                                yqVar.y = new AnimatorSet();
                                yqVar.g(yqVar.getMeasuredWidth(), arrayList2, true);
                                yqVar.y.playTogether(arrayList2);
                                yqVar.y.setDuration(180L);
                                yqVar.y.setInterpolator(ds.g);
                                yqVar.y.addListener(new wq(yqVar));
                                yqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            yq.a(yqVar, view);
                            break;
                        default:
                            yqVar.I.U(null, null);
                            break;
                    }
                }
            });
            i13++;
        }
        int i14 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.E;
            if (i14 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i14 % 2 == 0) {
                editTextBoldCursorArr[i14] = new uq(this, context, i14, i12);
                this.E[i14].setBackgroundDrawable(null);
                this.E[i14].setText("#");
                this.E[i14].setEnabled(false);
                this.E[i14].setFocusable(false);
                this.E[i14].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.E[i14], kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i14] = new uq(this, context, i14, i10);
                this.E[i14].setBackgroundDrawable(null);
                this.E[i14].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.E[i14].setHint("8BC6ED");
                this.E[i14].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.E[i14], kb1.o(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.E[i14].addTextChangedListener(new vq(this, i14));
                this.E[i14].setOnEditorActionListener(new u2(i10));
            }
            this.E[i14].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.E(this.E[i14], org.telegram.ui.ActionBar.y6.H6, this.d0);
            EditTextBoldCursor editTextBoldCursor = this.E[i14];
            int i15 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i15, this.d0);
            this.E[i14].setCursorColor(org.telegram.ui.ActionBar.y6.w0(i15, this.d0));
            this.E[i14].setCursorSize(AndroidUtilities.dp(18.0f));
            this.E[i14].setCursorWidth(1.5f);
            this.E[i14].setSingleLine(true);
            this.E[i14].setGravity(19);
            this.E[i14].setHeaderHintColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.L6, this.d0));
            this.E[i14].setTransformHintToHeader(true);
            this.E[i14].setInputType(524416);
            this.E[i14].setImeOptions(268435462);
            if (i14 == 1) {
                this.E[i14].requestFocus();
            } else if (i14 == 2 || i14 == 3) {
                this.E[i14].setVisibility(8);
            }
            i14++;
        }
        ImageView imageView = new ImageView(getContext());
        this.G = imageView;
        int i16 = org.telegram.ui.ActionBar.y6.I5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i16, this.d0), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
        org.telegram.ui.ActionBar.u6 u6Var = this.d0;
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
        imageView.setImageResource(R.drawable.msg_add);
        int i17 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var2 = this.d0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i17, u6Var2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tq
            public final /* synthetic */ yq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142;
                int i152 = i12;
                yq yqVar = this.b;
                switch (i152) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        xq xqVar2 = yqVar.a;
                        org.telegram.ui.ActionBar.k0 k0Var = yqVar.F;
                        ImageView imageView2 = yqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = yqVar.v;
                        if (yqVar.y == null) {
                            int i162 = yqVar.K;
                            if (i162 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i142 = 0;
                                    colorPicker$RadioButton2.a(yq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i142 = 0;
                                }
                                if (yqVar.h) {
                                    xqVar2.x0(colorPicker$RadioButtonArr[i142].e, i142, true);
                                }
                                xqVar2.x0(colorPicker$RadioButtonArr[1].e, 1, true);
                                yqVar.K = 2;
                            } else if (i162 == 2) {
                                yqVar.K = 3;
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
                                xqVar2.x0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i162 == 3) {
                                yqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(yq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                xqVar2.x0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (yqVar.K < yqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, c3.h0.w(yqVar.K, 1, AndroidUtilities.dp(13.0f), (yqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, c3.h0.w(yqVar.K, 1, AndroidUtilities.dp(13.0f), (yqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (yqVar.K > 1) {
                                if (k0Var.getVisibility() != 0) {
                                    k0Var.setScaleX(0.0f);
                                    k0Var.setScaleY(0.0f);
                                }
                                k0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[yqVar.K - 1].callOnClick();
                            yqVar.y = new AnimatorSet();
                            yqVar.g(yqVar.getMeasuredWidth(), arrayList, false);
                            yqVar.y.playTogether(arrayList);
                            yqVar.y.setDuration(180L);
                            yqVar.y.setInterpolator(ds.g);
                            yqVar.y.addListener(new org.telegram.ui.sp(yqVar, 21));
                            yqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        xq xqVar3 = yqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.k0 k0Var2 = yqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = yqVar.v;
                        ImageView imageView22 = yqVar.G;
                        if (yqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i172 = yqVar.K;
                            if (i172 == 2) {
                                yqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i172 == 3) {
                                yqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i172 == 4) {
                                yqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.wh.b(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (yqVar.K < yqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i18 = yqVar.S;
                            if (i18 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                    colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i20 = yqVar.T;
                            if (i20 < 0 || i20 >= yqVar.S) {
                                colorPicker$RadioButtonArr2[yqVar.K - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i20].callOnClick();
                            }
                            int i21 = 0;
                            while (i21 < colorPicker$RadioButtonArr2.length) {
                                if (i21 < yqVar.K) {
                                    xqVar3.x0(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    xqVar3.x0(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i21++;
                            }
                            yqVar.y = new AnimatorSet();
                            yqVar.g(yqVar.getMeasuredWidth(), arrayList2, true);
                            yqVar.y.playTogether(arrayList2);
                            yqVar.y.setDuration(180L);
                            yqVar.y.setInterpolator(ds.g);
                            yqVar.y.addListener(new wq(yqVar));
                            yqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        yq.a(yqVar, view);
                        break;
                    default:
                        yqVar.I.U(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, kb1.h(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k0 k0Var = new org.telegram.ui.ActionBar.k0(this, getContext(), 1);
        this.F = k0Var;
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i16, this.d0), 1, -1);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i16);
        org.telegram.ui.ActionBar.u6 u6Var3 = this.d0;
        k0Var.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(k0Var, g03, null, N2, u6Var3);
        k0Var.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.f7.t(k0Var, i17, this.d0, mode);
        k0Var.setAlpha(0.0f);
        k0Var.setScaleX(0.0f);
        k0Var.setScaleY(0.0f);
        k0Var.setScaleType(scaleType);
        k0Var.setVisibility(4);
        k0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tq
            public final /* synthetic */ yq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142;
                int i152 = i10;
                yq yqVar = this.b;
                switch (i152) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        xq xqVar2 = yqVar.a;
                        org.telegram.ui.ActionBar.k0 k0Var2 = yqVar.F;
                        ImageView imageView2 = yqVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = yqVar.v;
                        if (yqVar.y == null) {
                            int i162 = yqVar.K;
                            if (i162 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i142 = 0;
                                    colorPicker$RadioButton2.a(yq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i142 = 0;
                                }
                                if (yqVar.h) {
                                    xqVar2.x0(colorPicker$RadioButtonArr[i142].e, i142, true);
                                }
                                xqVar2.x0(colorPicker$RadioButtonArr[1].e, 1, true);
                                yqVar.K = 2;
                            } else if (i162 == 2) {
                                yqVar.K = 3;
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
                                xqVar2.x0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i162 == 3) {
                                yqVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(yq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                xqVar2.x0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (yqVar.K < yqVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, c3.h0.w(yqVar.K, 1, AndroidUtilities.dp(13.0f), (yqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, c3.h0.w(yqVar.K, 1, AndroidUtilities.dp(13.0f), (yqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (yqVar.K > 1) {
                                if (k0Var2.getVisibility() != 0) {
                                    k0Var2.setScaleX(0.0f);
                                    k0Var2.setScaleY(0.0f);
                                }
                                k0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[yqVar.K - 1].callOnClick();
                            yqVar.y = new AnimatorSet();
                            yqVar.g(yqVar.getMeasuredWidth(), arrayList, false);
                            yqVar.y.playTogether(arrayList);
                            yqVar.y.setDuration(180L);
                            yqVar.y.setInterpolator(ds.g);
                            yqVar.y.addListener(new org.telegram.ui.sp(yqVar, 21));
                            yqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        xq xqVar3 = yqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.k0 k0Var22 = yqVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = yqVar.v;
                        ImageView imageView22 = yqVar.G;
                        if (yqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i172 = yqVar.K;
                            if (i172 == 2) {
                                yqVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i172 == 3) {
                                yqVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i172 == 4) {
                                yqVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.wh.b(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (yqVar.K < yqVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i18 = yqVar.S;
                            if (i18 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                    colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i20 = yqVar.T;
                            if (i20 < 0 || i20 >= yqVar.S) {
                                colorPicker$RadioButtonArr2[yqVar.K - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i20].callOnClick();
                            }
                            int i21 = 0;
                            while (i21 < colorPicker$RadioButtonArr2.length) {
                                if (i21 < yqVar.K) {
                                    xqVar3.x0(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    xqVar3.x0(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i21++;
                            }
                            yqVar.y = new AnimatorSet();
                            yqVar.g(yqVar.getMeasuredWidth(), arrayList2, true);
                            yqVar.y.playTogether(arrayList2);
                            yqVar.y.setDuration(180L);
                            yqVar.y.setInterpolator(ds.g);
                            yqVar.y.addListener(new wq(yqVar));
                            yqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        yq.a(yqVar, view);
                        break;
                    default:
                        yqVar.I.U(null, null);
                        break;
                }
            }
        });
        k0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(k0Var, kb1.h(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.H = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.V(textView, i17, this.d0);
        addView(textView, kb1.h(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new bh.f(11));
        if (z10) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, (org.telegram.ui.ActionBar.z) null, org.telegram.ui.ActionBar.y6.w0(i17, this.d0));
            this.I = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            w0Var.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            w0Var.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            w0Var.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            w0Var.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            w0Var.setSubMenuOpenSide(2);
            w0Var.setDelegate(new s(this, 26));
            w0Var.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            w0Var.setTranslationX(AndroidUtilities.dp(6.0f));
            org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i16, this.d0), 1, -1);
            org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i16);
            org.telegram.ui.ActionBar.u6 u6Var4 = this.d0;
            w0Var.setBackground(g04);
            org.telegram.ui.ActionBar.f7.k(w0Var, g04, null, N3, u6Var4);
            addView(w0Var, kb1.h(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            final int i18 = 3;
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tq
                public final /* synthetic */ yq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142;
                    int i152 = i18;
                    yq yqVar = this.b;
                    switch (i152) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            xq xqVar2 = yqVar.a;
                            org.telegram.ui.ActionBar.k0 k0Var2 = yqVar.F;
                            ImageView imageView2 = yqVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = yqVar.v;
                            if (yqVar.y == null) {
                                int i162 = yqVar.K;
                                if (i162 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i142 = 0;
                                        colorPicker$RadioButton2.a(yq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i142 = 0;
                                    }
                                    if (yqVar.h) {
                                        xqVar2.x0(colorPicker$RadioButtonArr[i142].e, i142, true);
                                    }
                                    xqVar2.x0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    yqVar.K = 2;
                                } else if (i162 == 2) {
                                    yqVar.K = 3;
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
                                    xqVar2.x0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i162 == 3) {
                                    yqVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(yq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    xqVar2.x0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (yqVar.K < yqVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, c3.h0.w(yqVar.K, 1, AndroidUtilities.dp(13.0f), (yqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, c3.h0.w(yqVar.K, 1, AndroidUtilities.dp(13.0f), (yqVar.K - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (yqVar.K > 1) {
                                    if (k0Var2.getVisibility() != 0) {
                                        k0Var2.setScaleX(0.0f);
                                        k0Var2.setScaleY(0.0f);
                                    }
                                    k0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(k0Var2, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[yqVar.K - 1].callOnClick();
                                yqVar.y = new AnimatorSet();
                                yqVar.g(yqVar.getMeasuredWidth(), arrayList, false);
                                yqVar.y.playTogether(arrayList);
                                yqVar.y.setDuration(180L);
                                yqVar.y.setInterpolator(ds.g);
                                yqVar.y.addListener(new org.telegram.ui.sp(yqVar, 21));
                                yqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            xq xqVar3 = yqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.k0 k0Var22 = yqVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = yqVar.v;
                            ImageView imageView22 = yqVar.G;
                            if (yqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i172 = yqVar.K;
                                if (i172 == 2) {
                                    yqVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(k0Var22, (Property<org.telegram.ui.ActionBar.k0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i172 == 3) {
                                    yqVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i172 == 4) {
                                    yqVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.wh.b(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (yqVar.K < yqVar.L) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i182 = yqVar.S;
                                if (i182 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i182];
                                    for (int i19 = i182 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                        colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i20 = yqVar.T;
                                if (i20 < 0 || i20 >= yqVar.S) {
                                    colorPicker$RadioButtonArr2[yqVar.K - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i20].callOnClick();
                                }
                                int i21 = 0;
                                while (i21 < colorPicker$RadioButtonArr2.length) {
                                    if (i21 < yqVar.K) {
                                        xqVar3.x0(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        xqVar3.x0(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i21++;
                                }
                                yqVar.y = new AnimatorSet();
                                yqVar.g(yqVar.getMeasuredWidth(), arrayList2, true);
                                yqVar.y.playTogether(arrayList2);
                                yqVar.y.setDuration(180L);
                                yqVar.y.setInterpolator(ds.g);
                                yqVar.y.addListener(new wq(yqVar));
                                yqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            yq.a(yqVar, view);
                            break;
                        default:
                            yqVar.I.U(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(yq yqVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = yqVar.v;
            if (i10 >= colorPicker$RadioButtonArr.length) {
                int i11 = colorPicker$RadioButton.e;
                yqVar.setColorInner(i11);
                yqVar.E[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i10];
            boolean z10 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z10;
            colorPicker$RadioButton2.b(true);
            if (z10) {
                yqVar.T = yqVar.S;
                yqVar.S = i10;
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
            imageView.setTranslationX(org.telegram.messenger.wh.b(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.wh.b(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.k0 k0Var = this.F;
        org.telegram.ui.ActionBar.w0 w0Var = this.I;
        if (w0Var != null) {
            if (i10 == 1) {
                w0Var.setVisibility(0);
            } else {
                w0Var.setVisibility(8);
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
        float f10 = 30.0f;
        int b10 = org.telegram.messenger.wh.b(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.w;
        float f11 = frameLayout.getLeft() + b10 > i10 - AndroidUtilities.dp(this.J == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, -f11));
        } else {
            frameLayout.setTranslationX(-f11);
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
                        f7 = f10;
                    } else {
                        f7 = f10;
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
                    f7 = f10;
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
                f7 = f10;
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
            i13 = org.telegram.messenger.t.D(13.0f, AndroidUtilities.dp(f7), i13);
            i12++;
            f10 = f7;
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
        int z10 = (int) c3.h0.z(1.0f, fArr[1], this.s.getHeight(), f10);
        if (!this.Q) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = ds.g.getInterpolation(this.U);
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        if (r12 <= (r5.bottom + org.telegram.messenger.AndroidUtilities.dp(7.0f))) goto L37;
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
        int x9 = (int) motionEvent.getX();
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
            x9 = Math.max(0, Math.min(x9, this.s.getWidth()));
            y3 = Math.max(dp, Math.min(y3, this.s.getHeight() + dp));
            if (this.b0 == this.c0) {
                f7 = 0.5f;
            } else {
                float brightness = getBrightness();
                float f10 = this.b0;
                f7 = (brightness - f10) / (this.c0 - f10);
            }
            fArr[0] = (x9 * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y3 - dp));
            h();
            fArr[2] = (this.c0 * f7) + ((1.0f - f7) * this.b0);
            this.P = null;
        }
        boolean z11 = this.R;
        RectF rectF = this.n;
        if (!z11) {
            if (!this.Q) {
                float f11 = x9;
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
            this.a.x0(color, this.S, false);
            invalidate();
            return true;
        }
        float width = 1.0f - ((x9 - rectF.left) / rectF.width());
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
        this.a.x0(color2, this.S, false);
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
                animatorSet.addListener(new org.telegram.ui.lo(7, this, z10));
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

    public void setResourcesProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.d0 = u6Var;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.w0 w0Var = this.I;
        if (w0Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.d0);
                if (w02 != this.e0) {
                    this.e0 = w02;
                    w0Var.setIconColor(w02);
                }
                w0Var.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, this.d0), false);
                w0Var.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, this.d0), true);
                w0Var.H(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, this.d0));
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.E;
        if (editTextBoldCursorArr != null) {
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.d0));
                    editTextBoldCursorArr[i10].setHeaderHintColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.L6, this.d0));
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
