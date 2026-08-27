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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class aq extends FrameLayout {
    public static final /* synthetic */ int a0 = 0;
    public final EditTextBoldCursor[] A;
    public final org.telegram.ui.ActionBar.l0 B;
    public final ImageView C;
    public final TextView D;
    public final org.telegram.ui.ActionBar.v0 E;
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
    public org.telegram.ui.ActionBar.c6 W;
    public final zp a;
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
    public final hh.w9 x;
    public AnimatorSet y;

    public aq(Context context, boolean z10, zp zpVar) {
        super(context);
        this.n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        final int i10 = 1;
        this.G = 1;
        this.H = 1;
        final int i11 = 3;
        this.J = new float[]{0.0f, 0.0f, 1.0f};
        this.K = new float[3];
        this.Q = 1.0f;
        this.S = 0.0f;
        this.T = 1.0f;
        this.U = 0.0f;
        this.V = 1.0f;
        this.a = zpVar;
        final int i12 = 2;
        this.A = new EditTextBoldCursor[2];
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
        hh.w9 w9Var = new hh.w9(this, context);
        this.x = w9Var;
        w9Var.setOrientation(0);
        addView(w9Var, h7.z5.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        w9Var.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, h7.z5.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i14 = 0;
        while (i14 < 4) {
            this.v[i14] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i14];
            colorPicker$RadioButton.d = this.O == i14;
            colorPicker$RadioButton.b(false);
            this.w.addView(this.v[i14], h7.z5.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i14].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vp
                public final /* synthetic */ aq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15;
                    int i16 = i12;
                    aq aqVar = this.b;
                    switch (i16) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            zp zpVar2 = aqVar.a;
                            org.telegram.ui.ActionBar.l0 l0Var = aqVar.B;
                            ImageView imageView = aqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
                            if (aqVar.y == null) {
                                int i17 = aqVar.G;
                                if (i17 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i15 = 0;
                                        colorPicker$RadioButton2.a(aq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i15 = 0;
                                    }
                                    if (aqVar.h) {
                                        zpVar2.n0(colorPicker$RadioButtonArr[i15].e, i15, true);
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    aqVar.G = 2;
                                } else if (i17 == 2) {
                                    aqVar.G = 3;
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
                                    zpVar2.n0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i17 == 3) {
                                    aqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(aq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (aqVar.G < aqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (aqVar.G > 1) {
                                    if (l0Var.getVisibility() != 0) {
                                        l0Var.setScaleX(0.0f);
                                        l0Var.setScaleY(0.0f);
                                    }
                                    l0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[aqVar.G - 1].callOnClick();
                                aqVar.y = new AnimatorSet();
                                aqVar.g(aqVar.getMeasuredWidth(), arrayList, false);
                                aqVar.y.playTogether(arrayList);
                                aqVar.y.setDuration(180L);
                                aqVar.y.setInterpolator(er.g);
                                aqVar.y.addListener(new org.telegram.ui.am(aqVar, 22));
                                aqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            zp zpVar3 = aqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = aqVar.v;
                            ImageView imageView2 = aqVar.C;
                            if (aqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i18 = aqVar.G;
                                if (i18 == 2) {
                                    aqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i18 == 3) {
                                    aqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i18 == 4) {
                                    aqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (aqVar.G < aqVar.H) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i19 = aqVar.O;
                                if (i19 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                    for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                        colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i21 = aqVar.P;
                                if (i21 < 0 || i21 >= aqVar.O) {
                                    colorPicker$RadioButtonArr2[aqVar.G - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i21].callOnClick();
                                }
                                int i22 = 0;
                                while (i22 < colorPicker$RadioButtonArr2.length) {
                                    if (i22 < aqVar.G) {
                                        zpVar3.n0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        zpVar3.n0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i22++;
                                }
                                aqVar.y = new AnimatorSet();
                                aqVar.g(aqVar.getMeasuredWidth(), arrayList2, true);
                                aqVar.y.playTogether(arrayList2);
                                aqVar.y.setDuration(180L);
                                aqVar.y.setInterpolator(er.g);
                                aqVar.y.addListener(new yp(aqVar));
                                aqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            aq.a(aqVar, view);
                            break;
                        default:
                            aqVar.E.M(null, null);
                            break;
                    }
                }
            });
            i14++;
        }
        int i15 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.A;
            if (i15 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i15 % 2 == 0) {
                editTextBoldCursorArr[i15] = new wp(this, context, i15, i13);
                this.A[i15].setBackgroundDrawable(null);
                this.A[i15].setText("#");
                this.A[i15].setEnabled(false);
                this.A[i15].setFocusable(false);
                this.A[i15].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.A[i15], h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i15] = new wp(this, context, i15, i10);
                this.A[i15].setBackgroundDrawable(null);
                this.A[i15].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.A[i15].setHint("8BC6ED");
                this.A[i15].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.A[i15], h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.A[i15].addTextChangedListener(new xp(this, i15));
                this.A[i15].setOnEditorActionListener(new o2(i10));
            }
            this.A[i15].setTextSize(1, 16.0f);
            this.A[i15].setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, this.W));
            EditTextBoldCursor editTextBoldCursor = this.A[i15];
            int i16 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, this.W));
            this.A[i15].setCursorColor(org.telegram.ui.ActionBar.g6.v0(i16, this.W));
            this.A[i15].setCursorSize(AndroidUtilities.dp(18.0f));
            this.A[i15].setCursorWidth(1.5f);
            this.A[i15].setSingleLine(true);
            this.A[i15].setGravity(19);
            this.A[i15].setHeaderHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, this.W));
            this.A[i15].setTransformHintToHeader(true);
            this.A[i15].setInputType(524416);
            this.A[i15].setImeOptions(268435462);
            if (i15 == 1) {
                this.A[i15].requestFocus();
            } else if (i15 == 2 || i15 == 3) {
                this.A[i15].setVisibility(8);
            }
            i15++;
        }
        ImageView imageView = new ImageView(getContext());
        this.C = imageView;
        int i17 = org.telegram.ui.ActionBar.g6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17, this.W), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i18 = org.telegram.ui.ActionBar.g6.G6;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i18, this.W);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162 = i13;
                aq aqVar = this.b;
                switch (i162) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        zp zpVar2 = aqVar.a;
                        org.telegram.ui.ActionBar.l0 l0Var = aqVar.B;
                        ImageView imageView2 = aqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
                        if (aqVar.y == null) {
                            int i172 = aqVar.G;
                            if (i172 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i152 = 0;
                                    colorPicker$RadioButton2.a(aq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i152 = 0;
                                }
                                if (aqVar.h) {
                                    zpVar2.n0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[1].e, 1, true);
                                aqVar.G = 2;
                            } else if (i172 == 2) {
                                aqVar.G = 3;
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
                                zpVar2.n0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i172 == 3) {
                                aqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(aq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (aqVar.G < aqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (aqVar.G > 1) {
                                if (l0Var.getVisibility() != 0) {
                                    l0Var.setScaleX(0.0f);
                                    l0Var.setScaleY(0.0f);
                                }
                                l0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[aqVar.G - 1].callOnClick();
                            aqVar.y = new AnimatorSet();
                            aqVar.g(aqVar.getMeasuredWidth(), arrayList, false);
                            aqVar.y.playTogether(arrayList);
                            aqVar.y.setDuration(180L);
                            aqVar.y.setInterpolator(er.g);
                            aqVar.y.addListener(new org.telegram.ui.am(aqVar, 22));
                            aqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        zp zpVar3 = aqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = aqVar.v;
                        ImageView imageView22 = aqVar.C;
                        if (aqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i182 = aqVar.G;
                            if (i182 == 2) {
                                aqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i182 == 3) {
                                aqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i182 == 4) {
                                aqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (aqVar.G < aqVar.H) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i19 = aqVar.O;
                            if (i19 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                    colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i21 = aqVar.P;
                            if (i21 < 0 || i21 >= aqVar.O) {
                                colorPicker$RadioButtonArr2[aqVar.G - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i21].callOnClick();
                            }
                            int i22 = 0;
                            while (i22 < colorPicker$RadioButtonArr2.length) {
                                if (i22 < aqVar.G) {
                                    zpVar3.n0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    zpVar3.n0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i22++;
                            }
                            aqVar.y = new AnimatorSet();
                            aqVar.g(aqVar.getMeasuredWidth(), arrayList2, true);
                            aqVar.y.playTogether(arrayList2);
                            aqVar.y.setDuration(180L);
                            aqVar.y.setInterpolator(er.g);
                            aqVar.y.addListener(new yp(aqVar));
                            aqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        aq.a(aqVar, view);
                        break;
                    default:
                        aqVar.E.M(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, h7.z5.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, getContext(), 1);
        this.B = l0Var;
        l0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17, this.W), 1, -1));
        l0Var.setImageResource(R.drawable.msg_close);
        l0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i18, this.W), mode));
        l0Var.setAlpha(0.0f);
        l0Var.setScaleX(0.0f);
        l0Var.setScaleY(0.0f);
        l0Var.setScaleType(scaleType);
        l0Var.setVisibility(4);
        l0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vp
            public final /* synthetic */ aq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162 = i10;
                aq aqVar = this.b;
                switch (i162) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        zp zpVar2 = aqVar.a;
                        org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
                        ImageView imageView2 = aqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
                        if (aqVar.y == null) {
                            int i172 = aqVar.G;
                            if (i172 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i152 = 0;
                                    colorPicker$RadioButton2.a(aq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i152 = 0;
                                }
                                if (aqVar.h) {
                                    zpVar2.n0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[1].e, 1, true);
                                aqVar.G = 2;
                            } else if (i172 == 2) {
                                aqVar.G = 3;
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
                                zpVar2.n0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i172 == 3) {
                                aqVar.G = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(aq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                zpVar2.n0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (aqVar.G < aqVar.H) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (aqVar.G > 1) {
                                if (l0Var2.getVisibility() != 0) {
                                    l0Var2.setScaleX(0.0f);
                                    l0Var2.setScaleY(0.0f);
                                }
                                l0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[aqVar.G - 1].callOnClick();
                            aqVar.y = new AnimatorSet();
                            aqVar.g(aqVar.getMeasuredWidth(), arrayList, false);
                            aqVar.y.playTogether(arrayList);
                            aqVar.y.setDuration(180L);
                            aqVar.y.setInterpolator(er.g);
                            aqVar.y.addListener(new org.telegram.ui.am(aqVar, 22));
                            aqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        zp zpVar3 = aqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var22 = aqVar.B;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = aqVar.v;
                        ImageView imageView22 = aqVar.C;
                        if (aqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i182 = aqVar.G;
                            if (i182 == 2) {
                                aqVar.G = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i182 == 3) {
                                aqVar.G = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i182 == 4) {
                                aqVar.G = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (aqVar.G < aqVar.H) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i19 = aqVar.O;
                            if (i19 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                    colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i21 = aqVar.P;
                            if (i21 < 0 || i21 >= aqVar.O) {
                                colorPicker$RadioButtonArr2[aqVar.G - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i21].callOnClick();
                            }
                            int i22 = 0;
                            while (i22 < colorPicker$RadioButtonArr2.length) {
                                if (i22 < aqVar.G) {
                                    zpVar3.n0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    zpVar3.n0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i22++;
                            }
                            aqVar.y = new AnimatorSet();
                            aqVar.g(aqVar.getMeasuredWidth(), arrayList2, true);
                            aqVar.y.playTogether(arrayList2);
                            aqVar.y.setDuration(180L);
                            aqVar.y.setInterpolator(er.g);
                            aqVar.y.addListener(new yp(aqVar));
                            aqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        aq.a(aqVar, view);
                        break;
                    default:
                        aqVar.E.M(null, null);
                        break;
                }
            }
        });
        l0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(l0Var, h7.z5.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, this.W));
        addView(textView, h7.z5.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new ag.l2(13));
        if (z10) {
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.g6.v0(i18, this.W));
            this.E = v0Var;
            v0Var.setLongClickEnabled(false);
            v0Var.setIcon(R.drawable.ic_ab_other);
            v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            v0Var.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            v0Var.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            v0Var.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            v0Var.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            v0Var.setSubMenuOpenSide(2);
            v0Var.setDelegate(new s(this, 26));
            v0Var.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            v0Var.setTranslationX(AndroidUtilities.dp(6.0f));
            v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i17, this.W), 1, -1));
            addView(v0Var, h7.z5.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vp
                public final /* synthetic */ aq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152;
                    int i162 = i11;
                    aq aqVar = this.b;
                    switch (i162) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            zp zpVar2 = aqVar.a;
                            org.telegram.ui.ActionBar.l0 l0Var2 = aqVar.B;
                            ImageView imageView2 = aqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
                            if (aqVar.y == null) {
                                int i172 = aqVar.G;
                                if (i172 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i152 = 0;
                                        colorPicker$RadioButton2.a(aq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i152 = 0;
                                    }
                                    if (aqVar.h) {
                                        zpVar2.n0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    aqVar.G = 2;
                                } else if (i172 == 2) {
                                    aqVar.G = 3;
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
                                    zpVar2.n0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i172 == 3) {
                                    aqVar.G = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(aq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    zpVar2.n0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (aqVar.G < aqVar.H) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i0.a.e(aqVar.G, 1, AndroidUtilities.dp(13.0f), (aqVar.G - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (aqVar.G > 1) {
                                    if (l0Var2.getVisibility() != 0) {
                                        l0Var2.setScaleX(0.0f);
                                        l0Var2.setScaleY(0.0f);
                                    }
                                    l0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[aqVar.G - 1].callOnClick();
                                aqVar.y = new AnimatorSet();
                                aqVar.g(aqVar.getMeasuredWidth(), arrayList, false);
                                aqVar.y.playTogether(arrayList);
                                aqVar.y.setDuration(180L);
                                aqVar.y.setInterpolator(er.g);
                                aqVar.y.addListener(new org.telegram.ui.am(aqVar, 22));
                                aqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            zp zpVar3 = aqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var22 = aqVar.B;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = aqVar.v;
                            ImageView imageView22 = aqVar.C;
                            if (aqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i182 = aqVar.G;
                                if (i182 == 2) {
                                    aqVar.G = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i182 == 3) {
                                    aqVar.G = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i182 == 4) {
                                    aqVar.G = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (aqVar.G < aqVar.H) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i19 = aqVar.O;
                                if (i19 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                    for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                        colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i21 = aqVar.P;
                                if (i21 < 0 || i21 >= aqVar.O) {
                                    colorPicker$RadioButtonArr2[aqVar.G - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i21].callOnClick();
                                }
                                int i22 = 0;
                                while (i22 < colorPicker$RadioButtonArr2.length) {
                                    if (i22 < aqVar.G) {
                                        zpVar3.n0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        zpVar3.n0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i22++;
                                }
                                aqVar.y = new AnimatorSet();
                                aqVar.g(aqVar.getMeasuredWidth(), arrayList2, true);
                                aqVar.y.playTogether(arrayList2);
                                aqVar.y.setDuration(180L);
                                aqVar.y.setInterpolator(er.g);
                                aqVar.y.addListener(new yp(aqVar));
                                aqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            aq.a(aqVar, view);
                            break;
                        default:
                            aqVar.E.M(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(aq aqVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
            if (i10 >= colorPicker$RadioButtonArr.length) {
                int i11 = colorPicker$RadioButton.e;
                aqVar.setColorInner(i11);
                aqVar.A[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i10];
            boolean z10 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z10;
            colorPicker$RadioButton2.b(true);
            if (z10) {
                aqVar.P = aqVar.O;
                aqVar.O = i10;
            }
            i10++;
        }
    }

    public static int d(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
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
    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.J);
        int D0 = this.a.D0(this.O);
        if (D0 == 0 || D0 != i10) {
            h();
        }
        this.L = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i10, int i11, int i12, boolean z10) {
        int dp = AndroidUtilities.dp(z10 ? 12.0f : 16.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f10 = i10;
        float f11 = i11;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(z10 ? 11.0f : 15.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(z10 ? 9.0f : 13.0f), paint);
    }

    public final void e(int i10, int i11) {
        if (!this.r) {
            this.r = true;
            if (this.O == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.A;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i11].a(i10);
            this.r = false;
        }
        setColorInner(i10);
    }

    public final void f(int i10, int i11, int i12, boolean z10) {
        if (i10 != this.F) {
            this.P = 0;
            this.O = 0;
            int i13 = 0;
            while (i13 < 4) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
                colorPicker$RadioButton.d = i13 == this.O;
                colorPicker$RadioButton.b(true);
                i13++;
            }
        }
        this.H = i11;
        this.F = i10;
        this.h = z10;
        this.G = i12;
        ImageView imageView = this.C;
        if (i12 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i12 == 2) {
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i12 == 3) {
            imageView.setTranslationX(org.telegram.messenger.y1.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.y1.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.l0 l0Var = this.B;
        org.telegram.ui.ActionBar.v0 v0Var = this.E;
        if (v0Var != null) {
            if (i10 == 1) {
                v0Var.setVisibility(0);
            } else {
                v0Var.setVisibility(8);
                l0Var.setTranslationX(0.0f);
            }
        }
        if (i11 <= 1) {
            imageView.setVisibility(8);
            l0Var.setVisibility(8);
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

    public final void g(int i10, ArrayList arrayList, boolean z10) {
        float f10;
        int i11 = this.G;
        int D = org.telegram.messenger.y1.D(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.w;
        float f11 = frameLayout.getLeft() + D > i10 - AndroidUtilities.dp(this.F == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
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
            int i14 = this.G;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (i12 < i14) {
                colorPicker$RadioButtonArr[i12].setVisibility(0);
                if (arrayList != null) {
                    if (z11) {
                        f10 = 30.0f;
                    } else {
                        f10 = 30.0f;
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property2, 1.0f));
                    }
                    if (z10 || !(z10 || i12 == this.G - 1)) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property, i13));
                    } else {
                        colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                    }
                } else {
                    f10 = 30.0f;
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
                f10 = 30.0f;
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
            i13 = org.telegram.messenger.y1.C(13.0f, AndroidUtilities.dp(f10), i13);
            i12++;
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
        int z10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, fArr[1], this.s.getHeight(), f11);
        if (!this.M) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = er.g.getInterpolation(this.Q);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g(getMeasuredWidth(), null, false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.I != i10) {
            this.I = i10;
            int dp = AndroidUtilities.dp(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i10, dp, Bitmap.Config.ARGB_8888);
            float f10 = i10;
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
        int x8 = (int) motionEvent.getX();
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
            x8 = Math.max(0, Math.min(x8, this.s.getWidth()));
            y10 = Math.max(dp, Math.min(y10, this.s.getHeight() + dp));
            if (this.U == this.V) {
                f10 = 0.5f;
            } else {
                float brightness = getBrightness();
                float f11 = this.U;
                f10 = (brightness - f11) / (this.V - f11);
            }
            fArr[0] = (x8 * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y10 - dp));
            h();
            fArr[2] = (this.V * f10) + ((1.0f - f10) * this.U);
            this.L = null;
        }
        boolean z11 = this.N;
        RectF rectF = this.n;
        if (!z11) {
            if (!this.M) {
                float f12 = x8;
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
        float width = 1.0f - ((x8 - rectF.left) / rectF.width());
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
                animatorSet.addListener(new org.telegram.ui.go(7, this, z10));
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

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.W = c6Var;
    }
}
