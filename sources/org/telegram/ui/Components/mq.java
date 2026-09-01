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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class mq extends FrameLayout {
    public static final /* synthetic */ int b0 = 0;
    public final EditTextBoldCursor[] B;
    public final org.telegram.ui.ActionBar.l0 C;
    public final ImageView D;
    public final TextView E;
    public final org.telegram.ui.ActionBar.w0 F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final float[] K;
    public final float[] L;
    public LinearGradient M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public long S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final lq a;
    public org.telegram.ui.ActionBar.g6 a0;
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
    public final dg.u x;
    public AnimatorSet y;

    public mq(Context context, boolean z4, lq lqVar) {
        super(context);
        this.n = new RectF();
        this.v = new ColorPicker$RadioButton[4];
        final int i10 = 1;
        this.H = 1;
        this.I = 1;
        final int i11 = 3;
        this.K = new float[]{0.0f, 0.0f, 1.0f};
        this.L = new float[3];
        this.R = 1.0f;
        this.T = 0.0f;
        this.U = 1.0f;
        this.V = 0.0f;
        this.W = 1.0f;
        this.a = lqVar;
        final int i12 = 2;
        this.B = new EditTextBoldCursor[2];
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
        dg.u uVar = new dg.u(this, context);
        this.x = uVar;
        uVar.setOrientation(0);
        addView(uVar, k7.c6.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        uVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.w = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, k7.c6.d(174, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i14 = 0;
        while (i14 < 4) {
            this.v[i14] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.v[i14];
            colorPicker$RadioButton.d = this.P == i14;
            colorPicker$RadioButton.b(false);
            this.w.addView(this.v[i14], k7.c6.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.v[i14].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hq
                public final /* synthetic */ mq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15;
                    int i16 = i12;
                    mq mqVar = this.b;
                    switch (i16) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            lq lqVar2 = mqVar.a;
                            org.telegram.ui.ActionBar.l0 l0Var = mqVar.C;
                            ImageView imageView = mqVar.D;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
                            if (mqVar.y == null) {
                                int i17 = mqVar.H;
                                if (i17 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i15 = 0;
                                        colorPicker$RadioButton2.a(mq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i15 = 0;
                                    }
                                    if (mqVar.h) {
                                        lqVar2.v0(colorPicker$RadioButtonArr[i15].e, i15, true);
                                    }
                                    lqVar2.v0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    mqVar.H = 2;
                                } else if (i17 == 2) {
                                    mqVar.H = 3;
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
                                    lqVar2.v0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i17 == 3) {
                                    mqVar.H = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(mq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    lqVar2.v0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (mqVar.H < mqVar.I) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, e2.c.e(mqVar.H, 1, AndroidUtilities.dp(13.0f), (mqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, e2.c.e(mqVar.H, 1, AndroidUtilities.dp(13.0f), (mqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (mqVar.H > 1) {
                                    if (l0Var.getVisibility() != 0) {
                                        l0Var.setScaleX(0.0f);
                                        l0Var.setScaleY(0.0f);
                                    }
                                    l0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[mqVar.H - 1].callOnClick();
                                mqVar.y = new AnimatorSet();
                                mqVar.g(mqVar.getMeasuredWidth(), arrayList, false);
                                mqVar.y.playTogether(arrayList);
                                mqVar.y.setDuration(180L);
                                mqVar.y.setInterpolator(pr.g);
                                mqVar.y.addListener(new a9(mqVar, 13));
                                mqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            lq lqVar3 = mqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var2 = mqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = mqVar.v;
                            ImageView imageView2 = mqVar.D;
                            if (mqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i18 = mqVar.H;
                                if (i18 == 2) {
                                    mqVar.H = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i18 == 3) {
                                    mqVar.H = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i18 == 4) {
                                    mqVar.H = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (mqVar.H < mqVar.I) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i19 = mqVar.P;
                                if (i19 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                    for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                        colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i21 = mqVar.Q;
                                if (i21 < 0 || i21 >= mqVar.P) {
                                    colorPicker$RadioButtonArr2[mqVar.H - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i21].callOnClick();
                                }
                                int i22 = 0;
                                while (i22 < colorPicker$RadioButtonArr2.length) {
                                    if (i22 < mqVar.H) {
                                        lqVar3.v0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        lqVar3.v0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i22++;
                                }
                                mqVar.y = new AnimatorSet();
                                mqVar.g(mqVar.getMeasuredWidth(), arrayList2, true);
                                mqVar.y.playTogether(arrayList2);
                                mqVar.y.setDuration(180L);
                                mqVar.y.setInterpolator(pr.g);
                                mqVar.y.addListener(new kq(mqVar));
                                mqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            mq.a(mqVar, view);
                            break;
                        default:
                            mqVar.F.M(null, null);
                            break;
                    }
                }
            });
            i14++;
        }
        int i15 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.B;
            if (i15 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i15 % 2 == 0) {
                editTextBoldCursorArr[i15] = new iq(this, context, i15, i13);
                this.B[i15].setBackgroundDrawable(null);
                this.B[i15].setText("#");
                this.B[i15].setEnabled(false);
                this.B[i15].setFocusable(false);
                this.B[i15].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.B[i15], k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i15] = new iq(this, context, i15, i10);
                this.B[i15].setBackgroundDrawable(null);
                this.B[i15].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.B[i15].setHint("8BC6ED");
                this.B[i15].setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(16.0f));
                this.x.addView(this.B[i15], k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.B[i15].addTextChangedListener(new jq(this, i15));
                this.B[i15].setOnEditorActionListener(new dg.a0(i11));
            }
            this.B[i15].setTextSize(1, 16.0f);
            this.B[i15].setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6, this.a0));
            EditTextBoldCursor editTextBoldCursor = this.B[i15];
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, this.a0));
            this.B[i15].setCursorColor(org.telegram.ui.ActionBar.k6.v0(i16, this.a0));
            this.B[i15].setCursorSize(AndroidUtilities.dp(18.0f));
            this.B[i15].setCursorWidth(1.5f);
            this.B[i15].setSingleLine(true);
            this.B[i15].setGravity(19);
            this.B[i15].setHeaderHintColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6, this.a0));
            this.B[i15].setTransformHintToHeader(true);
            this.B[i15].setInputType(524416);
            this.B[i15].setImeOptions(268435462);
            if (i15 == 1) {
                this.B[i15].requestFocus();
            } else if (i15 == 2 || i15 == 3) {
                this.B[i15].setVisibility(8);
            }
            i15++;
        }
        ImageView imageView = new ImageView(getContext());
        this.D = imageView;
        int i17 = org.telegram.ui.ActionBar.k6.I5;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i17, this.a0), 1, -1));
        imageView.setImageResource(R.drawable.msg_add);
        int i18 = org.telegram.ui.ActionBar.k6.G6;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i18, this.a0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hq
            public final /* synthetic */ mq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162 = i13;
                mq mqVar = this.b;
                switch (i162) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        lq lqVar2 = mqVar.a;
                        org.telegram.ui.ActionBar.l0 l0Var = mqVar.C;
                        ImageView imageView2 = mqVar.D;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
                        if (mqVar.y == null) {
                            int i172 = mqVar.H;
                            if (i172 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i152 = 0;
                                    colorPicker$RadioButton2.a(mq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i152 = 0;
                                }
                                if (mqVar.h) {
                                    lqVar2.v0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                }
                                lqVar2.v0(colorPicker$RadioButtonArr[1].e, 1, true);
                                mqVar.H = 2;
                            } else if (i172 == 2) {
                                mqVar.H = 3;
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
                                lqVar2.v0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i172 == 3) {
                                mqVar.H = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(mq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                lqVar2.v0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (mqVar.H < mqVar.I) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(mqVar.H, 1, AndroidUtilities.dp(13.0f), (mqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(mqVar.H, 1, AndroidUtilities.dp(13.0f), (mqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (mqVar.H > 1) {
                                if (l0Var.getVisibility() != 0) {
                                    l0Var.setScaleX(0.0f);
                                    l0Var.setScaleY(0.0f);
                                }
                                l0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[mqVar.H - 1].callOnClick();
                            mqVar.y = new AnimatorSet();
                            mqVar.g(mqVar.getMeasuredWidth(), arrayList, false);
                            mqVar.y.playTogether(arrayList);
                            mqVar.y.setDuration(180L);
                            mqVar.y.setInterpolator(pr.g);
                            mqVar.y.addListener(new a9(mqVar, 13));
                            mqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        lq lqVar3 = mqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var2 = mqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = mqVar.v;
                        ImageView imageView22 = mqVar.D;
                        if (mqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i182 = mqVar.H;
                            if (i182 == 2) {
                                mqVar.H = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i182 == 3) {
                                mqVar.H = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i182 == 4) {
                                mqVar.H = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (mqVar.H < mqVar.I) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i19 = mqVar.P;
                            if (i19 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                    colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i21 = mqVar.Q;
                            if (i21 < 0 || i21 >= mqVar.P) {
                                colorPicker$RadioButtonArr2[mqVar.H - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i21].callOnClick();
                            }
                            int i22 = 0;
                            while (i22 < colorPicker$RadioButtonArr2.length) {
                                if (i22 < mqVar.H) {
                                    lqVar3.v0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    lqVar3.v0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i22++;
                            }
                            mqVar.y = new AnimatorSet();
                            mqVar.g(mqVar.getMeasuredWidth(), arrayList2, true);
                            mqVar.y.playTogether(arrayList2);
                            mqVar.y.setDuration(180L);
                            mqVar.y.setInterpolator(pr.g);
                            mqVar.y.addListener(new kq(mqVar));
                            mqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        mq.a(mqVar, view);
                        break;
                    default:
                        mqVar.F.M(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(LocaleController.getString(R.string.Add));
        addView(imageView, k7.c6.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, getContext(), 1);
        this.C = l0Var;
        l0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i17, this.a0), 1, -1));
        l0Var.setImageResource(R.drawable.msg_close);
        l0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i18, this.a0), mode));
        l0Var.setAlpha(0.0f);
        l0Var.setScaleX(0.0f);
        l0Var.setScaleY(0.0f);
        l0Var.setScaleType(scaleType);
        l0Var.setVisibility(4);
        l0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hq
            public final /* synthetic */ mq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152;
                int i162 = i10;
                mq mqVar = this.b;
                switch (i162) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        lq lqVar2 = mqVar.a;
                        org.telegram.ui.ActionBar.l0 l0Var2 = mqVar.C;
                        ImageView imageView2 = mqVar.D;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
                        if (mqVar.y == null) {
                            int i172 = mqVar.H;
                            if (i172 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i152 = 0;
                                    colorPicker$RadioButton2.a(mq.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i152 = 0;
                                }
                                if (mqVar.h) {
                                    lqVar2.v0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                }
                                lqVar2.v0(colorPicker$RadioButtonArr[1].e, 1, true);
                                mqVar.H = 2;
                            } else if (i172 == 2) {
                                mqVar.H = 3;
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
                                lqVar2.v0(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i172 == 3) {
                                mqVar.H = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(mq.d(colorPicker$RadioButtonArr[2].e));
                                }
                                lqVar2.v0(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (mqVar.H < mqVar.I) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(mqVar.H, 1, AndroidUtilities.dp(13.0f), (mqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(mqVar.H, 1, AndroidUtilities.dp(13.0f), (mqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (mqVar.H > 1) {
                                if (l0Var2.getVisibility() != 0) {
                                    l0Var2.setScaleX(0.0f);
                                    l0Var2.setScaleY(0.0f);
                                }
                                l0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[mqVar.H - 1].callOnClick();
                            mqVar.y = new AnimatorSet();
                            mqVar.g(mqVar.getMeasuredWidth(), arrayList, false);
                            mqVar.y.playTogether(arrayList);
                            mqVar.y.setDuration(180L);
                            mqVar.y.setInterpolator(pr.g);
                            mqVar.y.addListener(new a9(mqVar, 13));
                            mqVar.y.start();
                            break;
                        }
                        break;
                    case 1:
                        lq lqVar3 = mqVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.l0 l0Var22 = mqVar.C;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = mqVar.v;
                        ImageView imageView22 = mqVar.D;
                        if (mqVar.y == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i182 = mqVar.H;
                            if (i182 == 2) {
                                mqVar.H = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i182 == 3) {
                                mqVar.H = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                            } else if (i182 == 4) {
                                mqVar.H = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                            }
                            if (mqVar.H < mqVar.I) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i19 = mqVar.P;
                            if (i19 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                    colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i21 = mqVar.Q;
                            if (i21 < 0 || i21 >= mqVar.P) {
                                colorPicker$RadioButtonArr2[mqVar.H - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i21].callOnClick();
                            }
                            int i22 = 0;
                            while (i22 < colorPicker$RadioButtonArr2.length) {
                                if (i22 < mqVar.H) {
                                    lqVar3.v0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    lqVar3.v0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i22++;
                            }
                            mqVar.y = new AnimatorSet();
                            mqVar.g(mqVar.getMeasuredWidth(), arrayList2, true);
                            mqVar.y.playTogether(arrayList2);
                            mqVar.y.setDuration(180L);
                            mqVar.y.setInterpolator(pr.g);
                            mqVar.y.addListener(new kq(mqVar));
                            mqVar.y.start();
                            break;
                        }
                        break;
                    case 2:
                        mq.a(mqVar, view);
                        break;
                    default:
                        mqVar.F.M(null, null);
                        break;
                }
            }
        });
        l0Var.setContentDescription(LocaleController.getString(R.string.ClearButton));
        addView(l0Var, k7.c6.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i18, this.a0));
        addView(textView, k7.c6.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new eg.m(11));
        if (z4) {
            org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.k6.v0(i18, this.a0));
            this.F = w0Var;
            w0Var.setLongClickEnabled(false);
            w0Var.setIcon(R.drawable.ic_ab_other);
            w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            w0Var.e(1, R.drawable.msg_edit, LocaleController.getString(R.string.OpenInEditor));
            w0Var.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareTheme));
            w0Var.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteTheme));
            w0Var.setMenuYOffset(-AndroidUtilities.dp(80.0f));
            w0Var.setSubMenuOpenSide(2);
            w0Var.setDelegate(new t(this, 26));
            w0Var.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
            w0Var.setTranslationX(AndroidUtilities.dp(6.0f));
            w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i17, this.a0), 1, -1));
            addView(w0Var, k7.c6.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hq
                public final /* synthetic */ mq b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i152;
                    int i162 = i11;
                    mq mqVar = this.b;
                    switch (i162) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            lq lqVar2 = mqVar.a;
                            org.telegram.ui.ActionBar.l0 l0Var2 = mqVar.C;
                            ImageView imageView2 = mqVar.D;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
                            if (mqVar.y == null) {
                                int i172 = mqVar.H;
                                if (i172 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i152 = 0;
                                        colorPicker$RadioButton2.a(mq.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i152 = 0;
                                    }
                                    if (mqVar.h) {
                                        lqVar2.v0(colorPicker$RadioButtonArr[i152].e, i152, true);
                                    }
                                    lqVar2.v0(colorPicker$RadioButtonArr[1].e, 1, true);
                                    mqVar.H = 2;
                                } else if (i172 == 2) {
                                    mqVar.H = 3;
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
                                    lqVar2.v0(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i172 == 3) {
                                    mqVar.H = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(mq.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    lqVar2.v0(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (mqVar.H < mqVar.I) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(mqVar.H, 1, AndroidUtilities.dp(13.0f), (mqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, e2.c.e(mqVar.H, 1, AndroidUtilities.dp(13.0f), (mqVar.H - 1) * AndroidUtilities.dp(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (mqVar.H > 1) {
                                    if (l0Var2.getVisibility() != 0) {
                                        l0Var2.setScaleX(0.0f);
                                        l0Var2.setScaleY(0.0f);
                                    }
                                    l0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(l0Var2, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[mqVar.H - 1].callOnClick();
                                mqVar.y = new AnimatorSet();
                                mqVar.g(mqVar.getMeasuredWidth(), arrayList, false);
                                mqVar.y.playTogether(arrayList);
                                mqVar.y.setDuration(180L);
                                mqVar.y.setInterpolator(pr.g);
                                mqVar.y.addListener(new a9(mqVar, 13));
                                mqVar.y.start();
                                break;
                            }
                            break;
                        case 1:
                            lq lqVar3 = mqVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.l0 l0Var22 = mqVar.C;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = mqVar.v;
                            ImageView imageView22 = mqVar.D;
                            if (mqVar.y == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i182 = mqVar.H;
                                if (i182 == 2) {
                                    mqVar.H = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(l0Var22, (Property<org.telegram.ui.ActionBar.l0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i182 == 3) {
                                    mqVar.H = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f)));
                                } else if (i182 == 4) {
                                    mqVar.H = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2)));
                                }
                                if (mqVar.H < mqVar.I) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i19 = mqVar.P;
                                if (i19 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i19];
                                    for (int i20 = i19 + 1; i20 < colorPicker$RadioButtonArr2.length; i20++) {
                                        colorPicker$RadioButtonArr2[i20 - 1] = colorPicker$RadioButtonArr2[i20];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i21 = mqVar.Q;
                                if (i21 < 0 || i21 >= mqVar.P) {
                                    colorPicker$RadioButtonArr2[mqVar.H - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i21].callOnClick();
                                }
                                int i22 = 0;
                                while (i22 < colorPicker$RadioButtonArr2.length) {
                                    if (i22 < mqVar.H) {
                                        lqVar3.v0(colorPicker$RadioButtonArr2[i22].e, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        lqVar3.v0(0, i22, i22 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i22++;
                                }
                                mqVar.y = new AnimatorSet();
                                mqVar.g(mqVar.getMeasuredWidth(), arrayList2, true);
                                mqVar.y.playTogether(arrayList2);
                                mqVar.y.setDuration(180L);
                                mqVar.y.setInterpolator(pr.g);
                                mqVar.y.addListener(new kq(mqVar));
                                mqVar.y.start();
                                break;
                            }
                            break;
                        case 2:
                            mq.a(mqVar, view);
                            break;
                        default:
                            mqVar.F.M(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(mq mqVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i10 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.v;
            if (i10 >= colorPicker$RadioButtonArr.length) {
                int i11 = colorPicker$RadioButton.e;
                mqVar.setColorInner(i11);
                mqVar.B[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i11)), Byte.valueOf((byte) Color.green(i11)), Byte.valueOf((byte) Color.blue(i11))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i10];
            boolean z4 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z4;
            colorPicker$RadioButton2.b(true);
            if (z4) {
                mqVar.Q = mqVar.P;
                mqVar.P = i10;
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
        return Math.max(this.V, Math.min(this.K[2], this.W));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorInner(int i10) {
        Color.colorToHSV(i10, this.K);
        int H0 = this.a.H0(this.P);
        if (H0 == 0 || H0 != i10) {
            h();
        }
        this.M = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i10, int i11, int i12, boolean z4) {
        int dp = AndroidUtilities.dp(z4 ? 12.0f : 16.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f10 = i10;
        float f11 = i11;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(z4 ? 11.0f : 15.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(z4 ? 9.0f : 13.0f), paint);
    }

    public final void e(int i10, int i11) {
        if (!this.r) {
            this.r = true;
            if (this.P == i11) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.B;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.v[i11].a(i10);
            this.r = false;
        }
        setColorInner(i10);
    }

    public final void f(int i10, int i11, int i12, boolean z4) {
        if (i10 != this.G) {
            this.Q = 0;
            this.P = 0;
            int i13 = 0;
            while (i13 < 4) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.v[i13];
                colorPicker$RadioButton.d = i13 == this.P;
                colorPicker$RadioButton.b(true);
                i13++;
            }
        }
        this.I = i11;
        this.G = i10;
        this.h = z4;
        this.H = i12;
        ImageView imageView = this.D;
        if (i12 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i12 == 2) {
            imageView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(30.0f));
        } else if (i12 == 3) {
            imageView.setTranslationX(org.telegram.messenger.y3.D(13.0f, 2, AndroidUtilities.dp(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.y3.D(13.0f, 3, AndroidUtilities.dp(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.l0 l0Var = this.C;
        org.telegram.ui.ActionBar.w0 w0Var = this.F;
        if (w0Var != null) {
            if (i10 == 1) {
                w0Var.setVisibility(0);
            } else {
                w0Var.setVisibility(8);
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

    public final void g(int i10, ArrayList arrayList, boolean z4) {
        float f10;
        int i11 = this.H;
        int D = org.telegram.messenger.y3.D(13.0f, i11 - 1, AndroidUtilities.dp(30.0f) * i11);
        FrameLayout frameLayout = this.w;
        float f11 = frameLayout.getLeft() + D > i10 - AndroidUtilities.dp(this.G == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
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
            boolean z10 = colorPicker$RadioButtonArr[i12].getTag(R.id.index_tag) != null;
            int i14 = this.H;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (i12 < i14) {
                colorPicker$RadioButtonArr[i12].setVisibility(0);
                if (arrayList != null) {
                    if (z10) {
                        f10 = 30.0f;
                    } else {
                        f10 = 30.0f;
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property2, 1.0f));
                    }
                    if (z4 || !(z4 || i12 == this.H - 1)) {
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
                } else if (z10) {
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property4, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property3, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i12], (Property<ColorPicker$RadioButton, Float>) property2, 0.0f));
                }
                if (!z4) {
                    colorPicker$RadioButtonArr[i12].setTranslationX(i13);
                }
                colorPicker$RadioButtonArr[i12].setTag(R.id.index_tag, null);
            }
            i13 = org.telegram.messenger.y3.C(13.0f, AndroidUtilities.dp(f10), i13);
            i12++;
        }
    }

    public int getColor() {
        float[] fArr = this.K;
        float f10 = fArr[0];
        float[] fArr2 = this.L;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        org.telegram.ui.ActionBar.l0 l0Var = this.C;
        if (l0Var == null) {
            return;
        }
        float f10 = l0Var.getTag() != null ? 0.0f : this.T;
        float f11 = l0Var.getTag() != null ? 1.0f : this.U;
        float[] fArr = this.K;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.V = 0.0f;
            this.W = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        float max = Math.max(0.0f, Math.min(f10 / computePerceivedBrightness, 1.0f));
        this.V = max;
        this.W = Math.max(max, Math.min(f11 / computePerceivedBrightness, 1.0f));
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
        float[] fArr = this.K;
        float f12 = fArr[0];
        float[] fArr2 = this.L;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int w10 = (int) e2.c.w(1.0f, fArr[1], this.s.getHeight(), f11);
        if (!this.N) {
            int dp2 = AndroidUtilities.dp(16.0f);
            float interpolation = pr.g.getInterpolation(this.R);
            if (measuredWidth < dp2) {
                measuredWidth = (int) (((dp2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - dp2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - dp2)) * interpolation));
            }
            if (w10 < dp + dp2) {
                w10 = (int) ((interpolation * (r5 - w10)) + w10);
            } else if (w10 > (this.s.getHeight() + dp) - dp2) {
                w10 = (int) (w10 - (interpolation * (w10 - ((this.s.getHeight() + dp) - dp2))));
            }
        }
        c(canvas, measuredWidth, w10, Color.HSVToColor(fArr2), false);
        float dp3 = AndroidUtilities.dp(22.0f);
        float dp4 = AndroidUtilities.dp(26.0f) + height;
        float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(22.0f);
        float dp5 = AndroidUtilities.dp(34.0f) + height;
        RectF rectF = this.n;
        rectF.set(dp3, dp4, measuredWidth2, dp5);
        LinearGradient linearGradient = this.M;
        Paint paint2 = this.c;
        if (linearGradient == null) {
            fArr2[2] = this.V;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.W;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.M = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        if (this.V == this.W) {
            f10 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f15 = this.V;
            f10 = (brightness - f15) / (this.W - f15);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f10)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (this.N || this.R >= 1.0f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.S;
        this.S = elapsedRealtime;
        float f16 = (j10 / 180.0f) + this.R;
        this.R = f16;
        if (f16 > 1.0f) {
            this.R = 1.0f;
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        g(getMeasuredWidth(), null, false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.J != i10) {
            this.J = i10;
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
            this.M = null;
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
                this.O = false;
                this.N = false;
                this.S = SystemClock.elapsedRealtime();
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int dp = AndroidUtilities.dp(45.0f);
        boolean z4 = this.N;
        float[] fArr = this.K;
        if (z4 || (!this.O && y10 >= dp && y10 <= this.s.getHeight() + dp)) {
            if (!this.N) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.N = true;
            this.R = 0.0f;
            this.S = SystemClock.elapsedRealtime();
            x10 = Math.max(0, Math.min(x10, this.s.getWidth()));
            y10 = Math.max(dp, Math.min(y10, this.s.getHeight() + dp));
            if (this.V == this.W) {
                f10 = 0.5f;
            } else {
                float brightness = getBrightness();
                float f11 = this.V;
                f10 = (brightness - f11) / (this.W - f11);
            }
            fArr[0] = (x10 * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y10 - dp));
            h();
            fArr[2] = (this.W * f10) + ((1.0f - f10) * this.V);
            this.M = null;
        }
        boolean z10 = this.O;
        RectF rectF = this.n;
        if (!z10) {
            if (!this.N) {
                float f12 = x10;
                if (f12 >= rectF.left && f12 <= rectF.right) {
                    float f13 = y10;
                    if (f13 >= rectF.top - AndroidUtilities.dp(7.0f)) {
                    }
                }
            }
            if (this.O && !this.N) {
                return true;
            }
            int color = getColor();
            if (!this.r) {
                int red = Color.red(color);
                int green = Color.green(color);
                int blue = Color.blue(color);
                this.r = true;
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) red), Byte.valueOf((byte) green), Byte.valueOf((byte) blue)).toUpperCase();
                Editable text = this.B[1].getText();
                text.replace(0, text.length(), upperCase);
                this.v[this.P].a(color);
                this.r = false;
            }
            this.a.v0(color, this.P, false);
            invalidate();
            return true;
        }
        float width = 1.0f - ((x10 - rectF.left) / rectF.width());
        float f14 = width >= 0.0f ? width > 1.0f ? 1.0f : width : 0.0f;
        fArr[2] = (this.W * f14) + ((1.0f - f14) * this.V);
        if (!this.O) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        this.O = true;
        if (this.O) {
        }
        int color2 = getColor();
        if (!this.r) {
        }
        this.a.v0(color2, this.P, false);
        invalidate();
        return true;
    }

    public void setHasChanges(boolean z4) {
        TextView textView = this.E;
        if (!z4 || textView.getTag() == null) {
            if ((z4 || textView.getTag() != null) && this.C.getTag() == null) {
                textView.setTag(z4 ? 1 : null);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (z4) {
                    textView.setVisibility(0);
                }
                arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
                animatorSet.addListener(new eg.u2(26, this, z4));
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(180L);
                animatorSet.start();
            }
        }
    }

    public void setMaxBrightness(float f10) {
        this.U = f10;
        h();
    }

    public void setMinBrightness(float f10) {
        this.T = f10;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.a0 = g6Var;
    }
}
