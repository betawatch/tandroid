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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class cq extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final EditTextBoldCursor[] A;
    public final org.telegram.ui.ActionBar.l0 B;
    public final ImageView C;
    public final TextView D;
    public final org.telegram.ui.ActionBar.w0 E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final float[] J;
    public final float[] K;
    public LinearGradient L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public float Q;
    public long R;
    public float S;
    public float T;
    public float U;
    public float V;
    public org.telegram.ui.ActionBar.b6 W;
    public final bq a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Drawable f;
    public boolean h;
    public final RectF n;
    public boolean r;
    public Bitmap s;
    public final ColorPicker$RadioButton[] v;
    public final FrameLayout w;
    public final gh.x9 x;
    public AnimatorSet y;

    public cq(Context context, boolean z10, bq bqVar) {
        super(context);
        this.n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        final int i9 = 1;
        this.G = 1;
        this.H = 1;
        final int i10 = 3;
        this.J = new float[]{0.0f, 0.0f, 1.0f};
        this.K = new float[3];
        this.Q = 1.0f;
        this.S = 0.0f;
        this.T = 1.0f;
        this.U = 0.0f;
        this.V = 1.0f;
        this.a = bqVar;
        final int i11 = 2;
        this.A = new EditTextBoldCursor[2];
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
        gh.x9 x9Var = new gh.x9(this, context);
        this.x = x9Var;
        x9Var.setOrientation(0);
        addView(x9Var, g7.e6.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        x9Var.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, g7.e6.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i13 = 0;
        while (i13 < 4) {
            this.v[i13] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
            colorPicker$RadioButton.d = this.O == i13;
            colorPicker$RadioButton.b(false);
            this.w.addView(this.v[i13], g7.e6.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i13].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xp
                public final /* synthetic */ cq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14;
                    int i15 = i11;
                    cq cqVar = this.b;
                    switch (i15) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            bq bqVar2 = cqVar.a;
                            org.telegram.ui.ActionBar.l0 l0Var = cqVar.B;
                            ImageView imageView = cqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
                            if (cqVar.y == null) {
                                int i16 = cqVar.G;
                                if (i16 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i14 = 0;
                                        colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i14 = 0;
                                    }
                                    if (cqVar.h) {
                                        bqVar2.n0(colorPicker$RadioButtonArr[i14].e, i14, true);
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    cqVar.G = 2;
                                } else if (i16 == 2) {
                                    cqVar.G = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i16 == 3) {
                                    cqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (cqVar.G < cqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (cqVar.G > 1) {
                                    if (l0Var.getVisibility() != 0) {
                                        l0Var.setScaleX(0.0f);
                                        l0Var.setScaleY(0.0f);
                                    }
                                    l0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[cqVar.G - 1].callOnClick();
                                cqVar.y = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                                cqVar.y.playTogether(arrayList);
                                cqVar.y.setDuration(180L);
                                cqVar.y.setInterpolator(gr.g);
                                cqVar.y.addListener(new org.telegram.ui.xp(cqVar, 20));
                                cqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            bq bqVar3 = cqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.v;
                            ImageView imageView2 = cqVar.C;
                            if (cqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i17 = cqVar.G;
                                if (i17 == 2) {
                                    cqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i17 == 3) {
                                    cqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i17 == 4) {
                                    cqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (cqVar.G < cqVar.H) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i18 = cqVar.O;
                                if (i18 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                    for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                        colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i20 = cqVar.P;
                                if (i20 < 0 || i20 >= cqVar.O) {
                                    colorPicker$RadioButtonArr2[cqVar.G - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i20].callOnClick();
                                }
                                int i21 = 0;
                                while (i21 < colorPicker$RadioButtonArr2.length) {
                                    if (i21 < cqVar.G) {
                                        bqVar3.n0(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        bqVar3.n0(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i21++;
                                }
                                cqVar.y = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                                cqVar.y.playTogether(arrayList2);
                                cqVar.y.setDuration(180L);
                                cqVar.y.setInterpolator(gr.g);
                                cqVar.y.addListener(new aq(cqVar));
                                cqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            cq.a(cqVar, view);
                            break;
                        default:
                            cqVar.E.M(null, null);
                            break;
                    }
                }
            });
            i13++;
        }
        int i14 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.A;
            if (i14 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i14 % 2 == 0) {
                editTextBoldCursorArr[i14] = new yp(this, context, i14, i12);
                this.A[i14].setBackgroundDrawable(null);
                this.A[i14].setText("#");
                this.A[i14].setEnabled(false);
                this.A[i14].setFocusable(false);
                this.A[i14].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.A[i14], g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i14] = new yp(this, context, i14, i9);
                this.A[i14].setBackgroundDrawable(null);
                this.A[i14].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.A[i14].setHint("8BC6ED");
                this.A[i14].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.A[i14], g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.A[i14].addTextChangedListener(new zp(this, i14));
                this.A[i14].setOnEditorActionListener(new o2(i9));
            }
            this.A[i14].setTextSize(1, 16.0f);
            this.A[i14].setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, this.W));
            EditTextBoldCursor editTextBoldCursor = this.A[i14];
            int i15 = org.telegram.ui.ActionBar.f6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, this.W));
            this.A[i14].setCursorColor(org.telegram.ui.ActionBar.f6.v0(i15, this.W));
            this.A[i14].setCursorSize(AndroidUtilities.dp(18.0f));
            this.A[i14].setCursorWidth(1.5f);
            this.A[i14].setSingleLine(true);
            this.A[i14].setGravity(19);
            this.A[i14].setHeaderHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, this.W));
            this.A[i14].setTransformHintToHeader(true);
            this.A[i14].setInputType(524416);
            this.A[i14].setImeOptions(268435462);
            if (i14 == 1) {
                this.A[i14].requestFocus();
            } else if (i14 == 2 || i14 == 3) {
                this.A[i14].setVisibility(8);
            }
            i14++;
        }
        ImageView imageView = new ImageView(getContext());
        this.C = imageView;
        int i16 = org.telegram.ui.ActionBar.f6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i16, this.W), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i17 = org.telegram.ui.ActionBar.f6.G6;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i17, this.W);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xp
            public final /* synthetic */ cq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142;
                int i152 = i12;
                cq cqVar = this.b;
                switch (i152) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        bq bqVar2 = cqVar.a;
                        org.telegram.ui.ActionBar.l0 l0Var = cqVar.B;
                        ImageView imageView2 = cqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
                        if (cqVar.y == null) {
                            int i162 = cqVar.G;
                            if (i162 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i142 = 0;
                                    colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i142 = 0;
                                }
                                if (cqVar.h) {
                                    bqVar2.n0(colorPicker$RadioButtonArr[i142].e, i142, true);
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[1].e, 1, true);
                                cqVar.G = 2;
                            } else if (i162 == 2) {
                                cqVar.G = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i162 == 3) {
                                cqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (cqVar.G < cqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (cqVar.G > 1) {
                                if (l0Var.getVisibility() != 0) {
                                    l0Var.setScaleX(0.0f);
                                    l0Var.setScaleY(0.0f);
                                }
                                l0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[cqVar.G - 1].callOnClick();
                            cqVar.y = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                            cqVar.y.playTogether(arrayList);
                            cqVar.y.setDuration(180L);
                            cqVar.y.setInterpolator(gr.g);
                            cqVar.y.addListener(new org.telegram.ui.xp(cqVar, 20));
                            cqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        bq bqVar3 = cqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.v;
                        ImageView imageView22 = cqVar.C;
                        if (cqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i172 = cqVar.G;
                            if (i172 == 2) {
                                cqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i172 == 3) {
                                cqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i172 == 4) {
                                cqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (cqVar.G < cqVar.H) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i18 = cqVar.O;
                            if (i18 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                    colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i20 = cqVar.P;
                            if (i20 < 0 || i20 >= cqVar.O) {
                                colorPicker$RadioButtonArr2[cqVar.G - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i20].callOnClick();
                            }
                            int i21 = 0;
                            while (i21 < colorPicker$RadioButtonArr2.length) {
                                if (i21 < cqVar.G) {
                                    bqVar3.n0(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    bqVar3.n0(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i21++;
                            }
                            cqVar.y = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                            cqVar.y.playTogether(arrayList2);
                            cqVar.y.setDuration(180L);
                            cqVar.y.setInterpolator(gr.g);
                            cqVar.y.addListener(new aq(cqVar));
                            cqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        cq.a(cqVar, view);
                        break;
                    default:
                        cqVar.E.M(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, g7.e6.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, getContext(), 1);
        this.B = l0Var;
        l0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i16, this.W), 1, -1));
        l0Var.setImageResource(R.drawable.msg_close);
        l0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i17, this.W), mode));
        l0Var.setAlpha(0.0f);
        l0Var.setScaleX(0.0f);
        l0Var.setScaleY(0.0f);
        l0Var.setScaleType(scaleType);
        l0Var.setVisibility(4);
        l0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xp
            public final /* synthetic */ cq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142;
                int i152 = i9;
                cq cqVar = this.b;
                switch (i152) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        bq bqVar2 = cqVar.a;
                        org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
                        ImageView imageView2 = cqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
                        if (cqVar.y == null) {
                            int i162 = cqVar.G;
                            if (i162 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i142 = 0;
                                    colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i142 = 0;
                                }
                                if (cqVar.h) {
                                    bqVar2.n0(colorPicker$RadioButtonArr[i142].e, i142, true);
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[1].e, 1, true);
                                cqVar.G = 2;
                            } else if (i162 == 2) {
                                cqVar.G = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i162 == 3) {
                                cqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                bqVar2.n0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (cqVar.G < cqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (cqVar.G > 1) {
                                if (l0Var2.getVisibility() != 0) {
                                    l0Var2.setScaleX(0.0f);
                                    l0Var2.setScaleY(0.0f);
                                }
                                l0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[cqVar.G - 1].callOnClick();
                            cqVar.y = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                            cqVar.y.playTogether(arrayList);
                            cqVar.y.setDuration(180L);
                            cqVar.y.setInterpolator(gr.g);
                            cqVar.y.addListener(new org.telegram.ui.xp(cqVar, 20));
                            cqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        bq bqVar3 = cqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var22 = cqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.v;
                        ImageView imageView22 = cqVar.C;
                        if (cqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i172 = cqVar.G;
                            if (i172 == 2) {
                                cqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i172 == 3) {
                                cqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i172 == 4) {
                                cqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (cqVar.G < cqVar.H) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i18 = cqVar.O;
                            if (i18 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                    colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i20 = cqVar.P;
                            if (i20 < 0 || i20 >= cqVar.O) {
                                colorPicker$RadioButtonArr2[cqVar.G - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i20].callOnClick();
                            }
                            int i21 = 0;
                            while (i21 < colorPicker$RadioButtonArr2.length) {
                                if (i21 < cqVar.G) {
                                    bqVar3.n0(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    bqVar3.n0(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i21++;
                            }
                            cqVar.y = new AnimatorSet();
                            cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                            cqVar.y.playTogether(arrayList2);
                            cqVar.y.setDuration(180L);
                            cqVar.y.setInterpolator(gr.g);
                            cqVar.y.addListener(new aq(cqVar));
                            cqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        cq.a(cqVar, view);
                        break;
                    default:
                        cqVar.E.M(null, null);
                        break;
                }
            }
        });
        l0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(l0Var, g7.e6.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i17, this.W));
        addView(textView, g7.e6.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new fh.n(12));
        if (z10) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.f6.v0(i17, this.W));
            this.E = w0Var;
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
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i16, this.W), 1, -1));
            addView(w0Var, g7.e6.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.xp
                public final /* synthetic */ cq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142;
                    int i152 = i10;
                    cq cqVar = this.b;
                    switch (i152) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            bq bqVar2 = cqVar.a;
                            org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
                            ImageView imageView2 = cqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
                            if (cqVar.y == null) {
                                int i162 = cqVar.G;
                                if (i162 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i142 = 0;
                                        colorPicker$RadioButton2.a(cq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i142 = 0;
                                    }
                                    if (cqVar.h) {
                                        bqVar2.n0(colorPicker$RadioButtonArr[i142].e, i142, true);
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    cqVar.G = 2;
                                } else if (i162 == 2) {
                                    cqVar.G = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(255, fArr));
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i162 == 3) {
                                    cqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(cq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    bqVar2.n0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (cqVar.G < cqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(cqVar.G, 1, AndroidUtilities.dp(13.0f), (cqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (cqVar.G > 1) {
                                    if (l0Var2.getVisibility() != 0) {
                                        l0Var2.setScaleX(0.0f);
                                        l0Var2.setScaleY(0.0f);
                                    }
                                    l0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[cqVar.G - 1].callOnClick();
                                cqVar.y = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList, false);
                                cqVar.y.playTogether(arrayList);
                                cqVar.y.setDuration(180L);
                                cqVar.y.setInterpolator(gr.g);
                                cqVar.y.addListener(new org.telegram.ui.xp(cqVar, 20));
                                cqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            bq bqVar3 = cqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var22 = cqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = cqVar.v;
                            ImageView imageView22 = cqVar.C;
                            if (cqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i172 = cqVar.G;
                                if (i172 == 2) {
                                    cqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i172 == 3) {
                                    cqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i172 == 4) {
                                    cqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (cqVar.G < cqVar.H) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i18 = cqVar.O;
                                if (i18 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                    for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                        colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i20 = cqVar.P;
                                if (i20 < 0 || i20 >= cqVar.O) {
                                    colorPicker$RadioButtonArr2[cqVar.G - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i20].callOnClick();
                                }
                                int i21 = 0;
                                while (i21 < colorPicker$RadioButtonArr2.length) {
                                    if (i21 < cqVar.G) {
                                        bqVar3.n0(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        bqVar3.n0(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i21++;
                                }
                                cqVar.y = new AnimatorSet();
                                cqVar.g(cqVar.getMeasuredWidth(), arrayList2, true);
                                cqVar.y.playTogether(arrayList2);
                                cqVar.y.setDuration(180L);
                                cqVar.y.setInterpolator(gr.g);
                                cqVar.y.addListener(new aq(cqVar));
                                cqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            cq.a(cqVar, view);
                            break;
                        default:
                            cqVar.E.M(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(cq cqVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i9 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
            if (i9 >= colorPicker$RadioButtonArr.length) {
                int i10 = colorPicker$RadioButton.e;
                cqVar.setColorInner(i10);
                cqVar.A[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i9];
            boolean z10 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z10;
            colorPicker$RadioButton2.b(true);
            if (z10) {
                cqVar.P = cqVar.O;
                cqVar.O = i9;
            }
            i9++;
        }
    }

    public static int d(int i9) {
        float[] fArr = new float[3];
        Color.colorToHSV(i9, fArr);
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
        return Color.HSVToColor(255, fArr);
    }

    private float getBrightness() {
        return Math.max(this.U, Math.min(this.J[2], this.V));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorInner(int i9) {
        Color.colorToHSV(i9, this.J);
        int H0 = this.a.H0(this.O);
        if (H0 == 0 || H0 != i9) {
            h();
        }
        this.L = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i9, int i10, int i11, boolean z10) {
        int dp = AndroidUtilities.dp(z10 ? 12.0f : 16.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i9 - dp, i10 - dp, i9 + dp, dp + i10);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f10 = i9;
        float f11 = i10;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(z10 ? 11.0f : 15.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(z10 ? 9.0f : 13.0f), paint);
    }

    public final void e(int i9, int i10) {
        if (!this.r) {
            this.r = true;
            if (this.O == i10) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i9)), Byte.valueOf((byte) Color.green(i9)), Byte.valueOf((byte) Color.blue(i9))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.A;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i10].a(i9);
            this.r = false;
        }
        setColorInner(i9);
    }

    public final void f(int i9, int i10, int i11, boolean z10) {
        if (i9 != this.F) {
            this.P = 0;
            this.O = 0;
            int i12 = 0;
            while (i12 < 4) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i12];
                colorPicker$RadioButton.d = i12 == this.O;
                colorPicker$RadioButton.b(true);
                i12++;
            }
        }
        this.H = i10;
        this.F = i9;
        this.h = z10;
        this.G = i11;
        ImageView imageView = this.C;
        if (i11 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i11 == 2) {
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i11 == 3) {
            imageView.setTranslationX(org.telegram.messenger.l0.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.l0.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.l0 l0Var = this.B;
        org.telegram.ui.ActionBar.w0 w0Var = this.E;
        if (w0Var != null) {
            if (i9 == 1) {
                w0Var.setVisibility(0);
            } else {
                w0Var.setVisibility(8);
                l0Var.setTranslationX(0.0f);
            }
        }
        if (i10 <= 1) {
            imageView.setVisibility(8);
            l0Var.setVisibility(8);
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
                l0Var.setVisibility(0);
                l0Var.setScaleX(1.0f);
                l0Var.setScaleY(1.0f);
                l0Var.setAlpha(1.0f);
            } else {
                l0Var.setVisibility(8);
            }
        }
        this.x.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i9, ArrayList arrayList, boolean z10) {
        float f10;
        int i10 = this.G;
        int D = org.telegram.messenger.l0.D(13.0f, i10 - 1, AndroidUtilities.dp(30.0f) * i10);
        FrameLayout frameLayout = this.w;
        float f11 = frameLayout.getLeft() + D > i9 - AndroidUtilities.dp(this.F == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
        Property property = View.TRANSLATION_X;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, -f11));
        } else {
            frameLayout.setTranslationX(-f11);
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.v;
            if (i11 >= colorPicker$RadioButtonArr.length) {
                return;
            }
            boolean z11 = colorPicker$RadioButtonArr[i11].getTag(R.id.index_tag) != null;
            int i13 = this.G;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (i11 < i13) {
                colorPicker$RadioButtonArr[i11].setVisibility(0);
                if (arrayList != null) {
                    if (z11) {
                        f10 = 30.0f;
                    } else {
                        f10 = 30.0f;
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property2, 1.0f));
                    }
                    if (z10 || !(z10 || i11 == this.G - 1)) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property, i12));
                    } else {
                        colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                    }
                } else {
                    f10 = 30.0f;
                    colorPicker$RadioButtonArr[i11].setVisibility(0);
                    if (this.y == null) {
                        colorPicker$RadioButtonArr[i11].setAlpha(1.0f);
                        colorPicker$RadioButtonArr[i11].setScaleX(1.0f);
                        colorPicker$RadioButtonArr[i11].setScaleY(1.0f);
                    }
                    colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                }
                colorPicker$RadioButtonArr[i11].setTag(R.id.index_tag, 1);
            } else {
                f10 = 30.0f;
                if (arrayList == null) {
                    colorPicker$RadioButtonArr[i11].setVisibility(4);
                    if (this.y == null) {
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
            i12 = org.telegram.messenger.l0.C(13.0f, AndroidUtilities.dp(f10), i12);
            i11++;
        }
    }

    public int getColor() {
        float[] fArr = this.J;
        float f10 = fArr[0];
        float[] fArr2 = this.K;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        org.telegram.ui.ActionBar.l0 l0Var = this.B;
        if (l0Var == null) {
            return;
        }
        float f10 = l0Var.getTag() != null ? 0.0f : this.S;
        float f11 = l0Var.getTag() != null ? 1.0f : this.T;
        float[] fArr = this.J;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.U = 0.0f;
            this.V = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        float max = Math.max(0.0f, Math.min(f10 / computePerceivedBrightness, 1.0f));
        this.U = max;
        this.V = Math.max(max, Math.min(f11 / computePerceivedBrightness, 1.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.x.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int dp = AndroidUtilities.dp(45.0f);
        float f11 = dp;
        canvas.drawBitmap(this.s, 0.0f, f11, (Paint) null);
        int height = this.s.getHeight() + dp;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f11, getMeasuredWidth(), dp + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.J;
        float f12 = fArr[0];
        float[] fArr2 = this.K;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z10 = (int) e2.c.z(1.0f, fArr[1], this.s.getHeight(), f11);
        if (!this.M) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = gr.g.getInterpolation(this.Q);
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
        LinearGradient linearGradient = this.L;
        Paint paint2 = this.c;
        if (linearGradient == null) {
            fArr2[2] = this.U;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.V;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.L = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (this.U == this.V) {
            f10 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f15 = this.U;
            f10 = (brightness - f15) / (this.V - f15);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f10)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (this.M || this.Q >= 1.0f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.R;
        this.R = elapsedRealtime;
        float f16 = (j10 / 180.0f) + this.Q;
        this.Q = f16;
        if (f16 > 1.0f) {
            this.Q = 1.0f;
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        g(getMeasuredWidth(), null, false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        if (this.I != i9) {
            this.I = i9;
            int dp = AndroidUtilities.dp(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i9, dp, Bitmap.Config.ARGB_8888);
            float f10 = i9;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f11 = dp;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, dp / 3, 0.0f, f11, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f10, f11, paint);
            this.s = createBitmap;
            this.L = null;
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
        float f10;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.N = false;
                this.M = false;
                this.R = SystemClock.elapsedRealtime();
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int dp = AndroidUtilities.dp(45.0f);
        boolean z10 = this.M;
        float[] fArr = this.J;
        if (z10 || (!this.N && y10 >= dp && y10 <= this.s.getHeight() + dp)) {
            if (!this.M) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.M = true;
            this.Q = 0.0f;
            this.R = SystemClock.elapsedRealtime();
            x10 = Math.max(0, Math.min(x10, this.s.getWidth()));
            y10 = Math.max(dp, Math.min(y10, this.s.getHeight() + dp));
            if (this.U == this.V) {
                f10 = 0.5f;
            } else {
                float brightness = getBrightness();
                float f11 = this.U;
                f10 = (brightness - f11) / (this.V - f11);
            }
            fArr[0] = (x10 * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y10 - dp));
            h();
            fArr[2] = (this.V * f10) + ((1.0f - f10) * this.U);
            this.L = null;
        }
        boolean z11 = this.N;
        RectF rectF = this.n;
        if (!z11) {
            if (!this.M) {
                float f12 = x10;
                if (f12 >= rectF.left && f12 <= rectF.right) {
                    float f13 = y10;
                    if (f13 >= rectF.top - AndroidUtilities.dp(7.0f)) {
                    }
                }
            }
            if (this.N && !this.M) {
                return true;
            }
            int color = getColor();
            if (!this.r) {
                int red = Color.red(color);
                int green = Color.green(color);
                int blue = Color.blue(color);
                this.r = true;
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) red), Byte.valueOf((byte) green), Byte.valueOf((byte) blue)).toUpperCase();
                Editable text = this.A[1].getText();
                text.replace(0, text.length(), upperCase);
                this.v[this.O].a(color);
                this.r = false;
            }
            this.a.n0(color, this.O, false);
            invalidate();
            return true;
        }
        float width = 1.0f - ((x10 - rectF.left) / rectF.width());
        float f14 = width >= 0.0f ? width > 1.0f ? 1.0f : width : 0.0f;
        fArr[2] = (this.V * f14) + ((1.0f - f14) * this.U);
        if (!this.N) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        this.N = true;
        if (this.N) {
        }
        int color2 = getColor();
        if (!this.r) {
        }
        this.a.n0(color2, this.O, false);
        invalidate();
        return true;
    }

    public void setHasChanges(boolean z10) {
        TextView textView = this.D;
        if (!z10 || textView.getTag() == null) {
            if ((z10 || textView.getTag() != null) && this.B.getTag() == null) {
                textView.setTag(z10 ? 1 : null);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (z10) {
                    textView.setVisibility(0);
                }
                arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
                animatorSet.addListener(new u9(6, this, z10));
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(180L);
                animatorSet.start();
            }
        }
    }

    public void setMaxBrightness(float f10) {
        this.T = f10;
        h();
    }

    public void setMinBrightness(float f10) {
        this.S = f10;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.W = b6Var;
    }
}
