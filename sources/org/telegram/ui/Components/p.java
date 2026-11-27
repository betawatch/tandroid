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
import org.telegram.ui.Components.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class p extends FrameLayout implements snb {
    public AnimatorSet E;
    public final EditTextBoldCursor[] F;
    public final d7 G;
    public final ImageView H;
    public final TextView I;
    public final s7 J;
    public int K;
    public byte L;
    public byte M;
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
    public final hm2 a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public vnb e0;
    public final Drawable f;
    public int f0;
    public boolean h;
    public final RectF n;
    public boolean r;
    public Bitmap s;
    public final ColorPicker$RadioButton[] w;
    public final FrameLayout x;
    public final rg2 y;

    public p(Context context, boolean z, hm2 hm2Var) {
        super(context);
        this.n = new RectF();
        this.w = new ColorPicker$RadioButton[4];
        final byte b = 1;
        this.L = (byte) 1;
        this.M = (byte) 1;
        this.O = new float[]{0.0f, 0.0f, 1.0f};
        this.P = new float[3];
        this.V = 1.0f;
        this.a0 = 0.0f;
        this.b0 = 1.0f;
        this.c0 = 0.0f;
        this.d0 = 1.0f;
        this.a = hm2Var;
        this.F = new EditTextBoldCursor[2];
        final byte b2 = 0;
        setWillNotDraw(false);
        this.f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
        this.d = new Paint(1);
        this.b = new Paint(5);
        this.c = new Paint(5);
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(301989888);
        setClipChildren(false);
        rg2 rg2Var = new rg2(this, context);
        this.y = rg2Var;
        rg2Var.setOrientation(0);
        addView(rg2Var, tre.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        rg2Var.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, tre.d(jn7.D2, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i = 0;
        while (i < 4) {
            this.w[i] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.w[i];
            colorPicker$RadioButton.d = this.T == i;
            colorPicker$RadioButton.b(false);
            this.x.addView(this.w[i], tre.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.w[i].setOnClickListener(new View.OnClickListener(this) { // from class: dm2
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b2;
                    p pVar = this.b;
                    switch (b3) {
                        case 0:
                            pVar.d(view);
                            break;
                        default:
                            pVar.J.U(null, null);
                            break;
                    }
                }
            });
            i++;
        }
        int i2 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.F;
            if (i2 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i2 % 2 == 0) {
                editTextBoldCursorArr[i2] = new em2(this, context, i2, b2);
                this.F[i2].setBackgroundDrawable(null);
                this.F[i2].setText("#");
                this.F[i2].setEnabled(false);
                this.F[i2].setFocusable(false);
                this.F[i2].setPadding(0, hl.L(5.0f), 0, hl.L(16.0f));
                this.y.addView(this.F[i2], tre.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i2] = new em2(this, context, i2, b);
                this.F[i2].setBackgroundDrawable(null);
                this.F[i2].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.F[i2].setHint("8BC6ED");
                this.F[i2].setPadding(0, hl.L(5.0f), 0, hl.L(16.0f));
                this.y.addView(this.F[i2], tre.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.F[i2].addTextChangedListener(new o(this, i2));
                this.F[i2].setOnEditorActionListener(new mh(b));
            }
            this.F[i2].setTextSize(1, 16.0f);
            yob.D(this.F[i2], aob.H6, this.e0);
            EditTextBoldCursor editTextBoldCursor = this.F[i2];
            int i3 = aob.G6;
            yob.X(editTextBoldCursor, i3, this.e0);
            this.F[i2].setCursorColor(aob.v0(i3, this.e0));
            this.F[i2].setCursorSize(hl.L(18.0f));
            this.F[i2].setCursorWidth(1.5f);
            this.F[i2].setSingleLine(true);
            this.F[i2].setGravity(19);
            this.F[i2].setHeaderHintColor(aob.v0(aob.L6, this.e0));
            this.F[i2].setTransformHintToHeader(true);
            this.F[i2].setInputType(524416);
            this.F[i2].setImeOptions(268435462);
            if (i2 == 1) {
                this.F[i2].requestFocus();
            } else if (i2 == 2 || i2 == 3) {
                this.F[i2].setVisibility(8);
            }
            i2++;
        }
        ImageView imageView = new ImageView(getContext());
        this.H = imageView;
        int i4 = aob.I5;
        hf0 f0 = aob.f0(aob.v0(i4, this.e0), 1, -1);
        uob M = yob.M(i4);
        vnb vnbVar = this.e0;
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar);
        imageView.setImageResource(R.drawable.msg_add);
        int i5 = aob.G6;
        vnb vnbVar2 = this.e0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView, i5, vnbVar2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                p pVar = this.b;
                byte b4 = 1;
                byte b5 = 0;
                switch (b3) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        hm2 hm2Var2 = pVar.a;
                        d7 d7Var = pVar.G;
                        ImageView imageView2 = pVar.H;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = pVar.w;
                        if (pVar.E == null) {
                            byte b6 = pVar.L;
                            if (b6 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    colorPicker$RadioButton2.a(p.c(colorPicker$RadioButtonArr[0].e));
                                }
                                if (pVar.h) {
                                    hm2Var2.c(colorPicker$RadioButtonArr[0].e, 0, true);
                                }
                                hm2Var2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                pVar.L = (byte) 2;
                            } else if (b6 == 2) {
                                pVar.L = (byte) 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f = fArr[0];
                                    if (f > 180.0f) {
                                        fArr[0] = f - 60.0f;
                                    } else {
                                        fArr[0] = f + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(jn7.d4, fArr));
                                }
                                hm2Var2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (b6 == 3) {
                                pVar.L = (byte) 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(p.c(colorPicker$RadioButtonArr[2].e));
                                }
                                hm2Var2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (pVar.L < pVar.M) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, bp1.h(pVar.L, 1, hl.L(13.0f), (pVar.L - 1) * hl.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, bp1.h(pVar.L, 1, hl.L(13.0f), (pVar.L - 1) * hl.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (pVar.L > 1) {
                                if (d7Var.getVisibility() != 0) {
                                    d7Var.setScaleX(0.0f);
                                    d7Var.setScaleY(0.0f);
                                }
                                d7Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(d7Var, (Property<d7, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(d7Var, (Property<d7, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(d7Var, (Property<d7, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[pVar.L - 1].callOnClick();
                            pVar.E = new AnimatorSet();
                            pVar.g(pVar.getMeasuredWidth(), arrayList, false);
                            pVar.E.playTogether(arrayList);
                            pVar.E.setDuration(180L);
                            pVar.E.setInterpolator(k43.g);
                            pVar.E.addListener(new fm2(pVar, b5));
                            pVar.E.start();
                            break;
                        }
                        break;
                    default:
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        d7 d7Var2 = pVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = pVar.w;
                        ImageView imageView3 = pVar.H;
                        if (pVar.E == null) {
                            ArrayList arrayList2 = new ArrayList();
                            byte b7 = pVar.L;
                            if (b7 == 2) {
                                pVar.L = (byte) 1;
                                arrayList2.add(ObjectAnimator.ofFloat(d7Var2, (Property<d7, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(d7Var2, (Property<d7, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(d7Var2, (Property<d7, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (b7 == 3) {
                                pVar.L = (byte) 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, hl.L(13.0f) + hl.L(30.0f)));
                            } else if (b7 == 4) {
                                pVar.L = (byte) 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, (hl.L(30.0f) << 1) + (hl.L(13.0f) << 1)));
                            }
                            if (pVar.L < pVar.M) {
                                imageView3.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i6 = pVar.T;
                            if (i6 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i6];
                                for (int i7 = i6 + 1; i7 < colorPicker$RadioButtonArr2.length; i7++) {
                                    colorPicker$RadioButtonArr2[i7 - 1] = colorPicker$RadioButtonArr2[i7];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i8 = pVar.U;
                            if (i8 < 0 || i8 >= pVar.T) {
                                colorPicker$RadioButtonArr2[pVar.L - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i8].callOnClick();
                            }
                            int i9 = 0;
                            while (i9 < colorPicker$RadioButtonArr2.length) {
                                byte b8 = pVar.L;
                                hm2 hm2Var3 = pVar.a;
                                if (i9 < b8) {
                                    hm2Var3.c(colorPicker$RadioButtonArr2[i9].e, i9, i9 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    hm2Var3.c(0, i9, i9 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i9++;
                            }
                            pVar.E = new AnimatorSet();
                            pVar.g(pVar.getMeasuredWidth(), arrayList2, true);
                            pVar.E.playTogether(arrayList2);
                            pVar.E.setDuration(180L);
                            pVar.E.setInterpolator(k43.g);
                            pVar.E.addListener(new fm2(pVar, b4));
                            pVar.E.start();
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setContentDescription(ob6.M0(2131754479, null));
        addView(imageView, tre.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        d7 d7Var = new d7((byte) 1, getContext(), this);
        this.G = d7Var;
        hf0 f02 = aob.f0(aob.v0(i4, this.e0), 1, -1);
        uob M2 = yob.M(i4);
        vnb vnbVar3 = this.e0;
        d7Var.setBackground(f02);
        yob.j(d7Var, f02, null, M2, vnbVar3);
        d7Var.setImageResource(R.drawable.msg_close);
        yob.s(d7Var, i5, this.e0, mode);
        d7Var.setAlpha(0.0f);
        d7Var.setScaleX(0.0f);
        d7Var.setScaleY(0.0f);
        d7Var.setScaleType(scaleType);
        d7Var.setVisibility(4);
        d7Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                p pVar = this.b;
                byte b4 = 1;
                byte b5 = 0;
                switch (b3) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        hm2 hm2Var2 = pVar.a;
                        d7 d7Var2 = pVar.G;
                        ImageView imageView2 = pVar.H;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = pVar.w;
                        if (pVar.E == null) {
                            byte b6 = pVar.L;
                            if (b6 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    colorPicker$RadioButton2.a(p.c(colorPicker$RadioButtonArr[0].e));
                                }
                                if (pVar.h) {
                                    hm2Var2.c(colorPicker$RadioButtonArr[0].e, 0, true);
                                }
                                hm2Var2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                pVar.L = (byte) 2;
                            } else if (b6 == 2) {
                                pVar.L = (byte) 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f = fArr[0];
                                    if (f > 180.0f) {
                                        fArr[0] = f - 60.0f;
                                    } else {
                                        fArr[0] = f + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(jn7.d4, fArr));
                                }
                                hm2Var2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (b6 == 3) {
                                pVar.L = (byte) 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(p.c(colorPicker$RadioButtonArr[2].e));
                                }
                                hm2Var2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (pVar.L < pVar.M) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, bp1.h(pVar.L, 1, hl.L(13.0f), (pVar.L - 1) * hl.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, bp1.h(pVar.L, 1, hl.L(13.0f), (pVar.L - 1) * hl.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (pVar.L > 1) {
                                if (d7Var2.getVisibility() != 0) {
                                    d7Var2.setScaleX(0.0f);
                                    d7Var2.setScaleY(0.0f);
                                }
                                d7Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(d7Var2, (Property<d7, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(d7Var2, (Property<d7, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(d7Var2, (Property<d7, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[pVar.L - 1].callOnClick();
                            pVar.E = new AnimatorSet();
                            pVar.g(pVar.getMeasuredWidth(), arrayList, false);
                            pVar.E.playTogether(arrayList);
                            pVar.E.setDuration(180L);
                            pVar.E.setInterpolator(k43.g);
                            pVar.E.addListener(new fm2(pVar, b5));
                            pVar.E.start();
                            break;
                        }
                        break;
                    default:
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        d7 d7Var22 = pVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = pVar.w;
                        ImageView imageView3 = pVar.H;
                        if (pVar.E == null) {
                            ArrayList arrayList2 = new ArrayList();
                            byte b7 = pVar.L;
                            if (b7 == 2) {
                                pVar.L = (byte) 1;
                                arrayList2.add(ObjectAnimator.ofFloat(d7Var22, (Property<d7, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(d7Var22, (Property<d7, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(d7Var22, (Property<d7, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (b7 == 3) {
                                pVar.L = (byte) 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, hl.L(13.0f) + hl.L(30.0f)));
                            } else if (b7 == 4) {
                                pVar.L = (byte) 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property5, (hl.L(30.0f) << 1) + (hl.L(13.0f) << 1)));
                            }
                            if (pVar.L < pVar.M) {
                                imageView3.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i6 = pVar.T;
                            if (i6 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i6];
                                for (int i7 = i6 + 1; i7 < colorPicker$RadioButtonArr2.length; i7++) {
                                    colorPicker$RadioButtonArr2[i7 - 1] = colorPicker$RadioButtonArr2[i7];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i8 = pVar.U;
                            if (i8 < 0 || i8 >= pVar.T) {
                                colorPicker$RadioButtonArr2[pVar.L - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i8].callOnClick();
                            }
                            int i9 = 0;
                            while (i9 < colorPicker$RadioButtonArr2.length) {
                                byte b8 = pVar.L;
                                hm2 hm2Var3 = pVar.a;
                                if (i9 < b8) {
                                    hm2Var3.c(colorPicker$RadioButtonArr2[i9].e, i9, i9 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    hm2Var3.c(0, i9, i9 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i9++;
                            }
                            pVar.E = new AnimatorSet();
                            pVar.g(pVar.getMeasuredWidth(), arrayList2, true);
                            pVar.E.playTogether(arrayList2);
                            pVar.E.setDuration(180L);
                            pVar.E.setInterpolator(k43.g);
                            pVar.E.addListener(new fm2(pVar, b4));
                            pVar.E.start();
                            break;
                        }
                        break;
                }
            }
        });
        d7Var.setContentDescription(ob6.M0(2131752064, null));
        addView(d7Var, tre.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        yob.X(textView, i5, this.e0);
        addView(textView, tre.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new y00(b));
        if (z) {
            s7 s7Var = new s7(context, (s6) null, aob.v0(i5, this.e0));
            this.J = s7Var;
            s7Var.setLongClickEnabled(false);
            s7Var.setIcon(R.drawable.ic_ab_other);
            s7Var.setContentDescription(ob6.M0(2131754834, null));
            s7Var.e(1, R.drawable.msg_edit, ob6.M0(2131747524, null));
            s7Var.e(2, R.drawable.msg_share, ob6.M0(2131745154, null));
            s7Var.e(3, R.drawable.msg_delete, ob6.M0(2131751451, null));
            s7Var.setMenuYOffset(-hl.L(80.0f));
            s7Var.setSubMenuOpenSide(2);
            s7Var.setDelegate(new rd1((Object) this, (byte) 29));
            s7Var.setAdditionalYOffset(hl.L(72.0f));
            s7Var.setTranslationX(hl.L(6.0f));
            hf0 f03 = aob.f0(aob.v0(i4, this.e0), 1, -1);
            uob M3 = yob.M(i4);
            vnb vnbVar4 = this.e0;
            s7Var.setBackground(f03);
            yob.j(s7Var, f03, null, M3, vnbVar4);
            addView(s7Var, tre.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            s7Var.setOnClickListener(new View.OnClickListener(this) { // from class: dm2
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    p pVar = this.b;
                    switch (b3) {
                        case 0:
                            pVar.d(view);
                            break;
                        default:
                            pVar.J.U(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static int c(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[1];
        if (f > 0.5f) {
            fArr[1] = f - 0.15f;
        } else {
            fArr[1] = f + 0.15f;
        }
        float f2 = fArr[0];
        if (f2 > 180.0f) {
            fArr[0] = f2 - 20.0f;
        } else {
            fArr[0] = f2 + 20.0f;
        }
        return Color.HSVToColor(jn7.d4, fArr);
    }

    private float getBrightness() {
        return Math.max(this.c0, Math.min(this.O[2], this.d0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorInner(int i) {
        Color.colorToHSV(i, this.O);
        int d = this.a.d(this.T);
        if (d == 0 || d != i) {
            h();
        }
        this.Q = null;
        invalidate();
    }

    public final void b(Canvas canvas, int i, int i2, int i3, boolean z) {
        int L = hl.L(z ? 12.0f : 16.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i - L, i2 - L, i + L, L + i2);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f = i;
        float f2 = i2;
        canvas.drawCircle(f, f2, hl.L(z ? 11.0f : 15.0f), paint);
        paint.setColor(i3);
        canvas.drawCircle(f, f2, hl.L(z ? 9.0f : 13.0f), paint);
    }

    public final void d(View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.w;
            if (i >= colorPicker$RadioButtonArr.length) {
                int i2 = colorPicker$RadioButton.e;
                setColorInner(i2);
                this.F[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i2)), Byte.valueOf((byte) Color.green(i2)), Byte.valueOf((byte) Color.blue(i2))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i];
            boolean z = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z;
            colorPicker$RadioButton2.b(true);
            if (z) {
                this.U = this.T;
                this.T = i;
            }
            i++;
        }
    }

    public final void e(int i, int i2) {
        if (!this.r) {
            this.r = true;
            if (this.T == i2) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i)), Byte.valueOf((byte) Color.green(i)), Byte.valueOf((byte) Color.blue(i))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.F;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.w[i2].a(i);
            this.r = false;
        }
        setColorInner(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i, int i2, int i3, boolean z) {
        if (i != this.K) {
            this.U = 0;
            this.T = 0;
            int i4 = 0;
            while (i4 < 4) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.w[i4];
                colorPicker$RadioButton.d = i4 == this.T;
                colorPicker$RadioButton.b(true);
                i4++;
            }
        }
        this.M = i2;
        this.K = i;
        this.h = z;
        this.L = i3;
        ImageView imageView = this.H;
        if (i3 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i3 == 2) {
            imageView.setTranslationX(hl.L(13.0f) + hl.L(30.0f));
        } else if (i3 == 3) {
            imageView.setTranslationX((hl.L(30.0f) << 1) + (hl.L(13.0f) << 1));
        } else {
            imageView.setTranslationX(uh9.y(13.0f, 3, hl.L(30.0f) * 3));
        }
        d7 d7Var = this.G;
        s7 s7Var = this.J;
        if (s7Var != null) {
            if (i == 1) {
                s7Var.setVisibility(0);
            } else {
                s7Var.setVisibility(8);
                d7Var.setTranslationX(0.0f);
            }
        }
        if (i2 <= 1) {
            imageView.setVisibility(8);
            d7Var.setVisibility(8);
        } else {
            if (i3 < i2) {
                imageView.setVisibility(0);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                imageView.setVisibility(8);
            }
            if (i3 > 1) {
                d7Var.setVisibility(0);
                d7Var.setScaleX(1.0f);
                d7Var.setScaleY(1.0f);
                d7Var.setAlpha(1.0f);
            } else {
                d7Var.setVisibility(8);
            }
        }
        this.y.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i, ArrayList arrayList, boolean z) {
        byte b = this.L;
        float f = 30.0f;
        int y = uh9.y(13.0f, b - 1, hl.L(30.0f) * b);
        FrameLayout frameLayout = this.x;
        float f2 = frameLayout.getLeft() + y > i - hl.L(this.K == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
        Property property = View.TRANSLATION_X;
        float f3 = -f2;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, f3));
        } else {
            frameLayout.setTranslationX(f3);
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = this.w;
            if (i2 >= colorPicker$RadioButtonArr.length) {
                return;
            }
            boolean z2 = colorPicker$RadioButtonArr[i2].getTag(R.id.index_tag) != null;
            byte b2 = this.L;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            float f4 = f;
            Property property4 = View.ALPHA;
            if (i2 < b2) {
                colorPicker$RadioButtonArr[i2].setVisibility(0);
                if (arrayList != null) {
                    if (!z2) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], (Property<ColorPicker$RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], (Property<ColorPicker$RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], (Property<ColorPicker$RadioButton, Float>) property2, 1.0f));
                    }
                    if (z || !(z || i2 == this.L - 1)) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], (Property<ColorPicker$RadioButton, Float>) property, i3));
                    } else {
                        colorPicker$RadioButtonArr[i2].setTranslationX(i3);
                    }
                } else {
                    colorPicker$RadioButtonArr[i2].setVisibility(0);
                    if (this.E == null) {
                        colorPicker$RadioButtonArr[i2].setAlpha(1.0f);
                        colorPicker$RadioButtonArr[i2].setScaleX(1.0f);
                        colorPicker$RadioButtonArr[i2].setScaleY(1.0f);
                    }
                    colorPicker$RadioButtonArr[i2].setTranslationX(i3);
                }
                colorPicker$RadioButtonArr[i2].setTag(R.id.index_tag, 1);
            } else {
                if (arrayList == null) {
                    colorPicker$RadioButtonArr[i2].setVisibility(4);
                    if (this.E == null) {
                        colorPicker$RadioButtonArr[i2].setAlpha(0.0f);
                        colorPicker$RadioButtonArr[i2].setScaleX(0.0f);
                        colorPicker$RadioButtonArr[i2].setScaleY(0.0f);
                    }
                } else if (z2) {
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], (Property<ColorPicker$RadioButton, Float>) property4, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], (Property<ColorPicker$RadioButton, Float>) property3, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i2], (Property<ColorPicker$RadioButton, Float>) property2, 0.0f));
                }
                if (!z) {
                    colorPicker$RadioButtonArr[i2].setTranslationX(i3);
                }
                colorPicker$RadioButtonArr[i2].setTag(R.id.index_tag, null);
            }
            i3 = uh9.w(13.0f, hl.L(f4), i3);
            i2++;
            f = f4;
        }
    }

    public int getColor() {
        float[] fArr = this.O;
        float f = fArr[0];
        float[] fArr2 = this.P;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        d7 d7Var = this.G;
        if (d7Var == null) {
            return;
        }
        float f = d7Var.getTag() != null ? 0.0f : this.a0;
        float f2 = d7Var.getTag() != null ? 1.0f : this.b0;
        float[] fArr = this.O;
        float f3 = fArr[2];
        if (f == 0.0f && f2 == 1.0f) {
            this.c0 = 0.0f;
            this.d0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f3;
        float B = hl.B(HSVToColor);
        float max = Math.max(0.0f, Math.min(f / B, 1.0f));
        this.c0 = max;
        this.d0 = Math.max(max, Math.min(f2 / B, 1.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int L = hl.L(45.0f);
        float f2 = L;
        canvas.drawBitmap(this.s, 0.0f, f2, (Paint) null);
        int height = this.s.getHeight() + L;
        Paint paint = this.e;
        canvas.drawRect(0.0f, f2, getMeasuredWidth(), L + 1, paint);
        canvas.drawRect(0.0f, height - 1, getMeasuredWidth(), height, paint);
        float[] fArr = this.O;
        float f3 = fArr[0];
        float[] fArr2 = this.P;
        fArr2[0] = f3;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int A = (int) qd4.A(1.0f, fArr[1], this.s.getHeight(), f2);
        if (!this.R) {
            int L2 = hl.L(16.0f);
            float interpolation = k43.g.getInterpolation(this.V);
            if (measuredWidth < L2) {
                measuredWidth = (int) (((L2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - L2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - L2)) * interpolation));
            }
            if (A < L + L2) {
                A = (int) ((interpolation * (r5 - A)) + A);
            } else if (A > (this.s.getHeight() + L) - L2) {
                A = (int) (A - (interpolation * (A - ((this.s.getHeight() + L) - L2))));
            }
        }
        b(canvas, measuredWidth, A, Color.HSVToColor(fArr2), false);
        float L3 = hl.L(22.0f);
        float L4 = hl.L(26.0f) + height;
        float measuredWidth2 = getMeasuredWidth() - hl.L(22.0f);
        float L5 = hl.L(34.0f) + height;
        RectF rectF = this.n;
        rectF.set(L3, L4, measuredWidth2, L5);
        LinearGradient linearGradient = this.Q;
        Paint paint2 = this.c;
        if (linearGradient == null) {
            fArr2[2] = this.c0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.d0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f4 = rectF.left;
            float f5 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f4, f5, rectF.right, f5, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.Q = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint2);
        if (this.c0 == this.d0) {
            f = 0.5f;
        } else {
            float brightness = getBrightness();
            float f6 = this.c0;
            f = (brightness - f6) / (this.d0 - f6);
        }
        b(canvas, (int) ((rectF.width() * (1.0f - f)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (this.R || this.V >= 1.0f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.W;
        this.W = elapsedRealtime;
        float f7 = (j / 180.0f) + this.V;
        this.V = f7;
        if (f7 > 1.0f) {
            this.V = 1.0f;
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g(getMeasuredWidth(), null, false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.N != i) {
            this.N = i;
            int L = hl.L(180.0f);
            Bitmap createBitmap = Bitmap.createBitmap(i, L, Bitmap.Config.ARGB_8888);
            float f = i;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            float f2 = L;
            ComposeShader composeShader = new ComposeShader(new LinearGradient(0.0f, L / 3, 0.0f, f2, new int[]{-1, 0}, (float[]) null, tileMode), new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, tileMode), PorterDuff.Mode.MULTIPLY);
            Paint paint = this.b;
            paint.setShader(composeShader);
            new Canvas(createBitmap).drawRect(0.0f, 0.0f, f, f2, paint);
            this.s = createBitmap;
            this.Q = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f0, code lost:
    
        if (r12 <= (r5.bottom + hl.L(7.0f))) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r0 != 2) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
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
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int L = hl.L(45.0f);
        boolean z = this.R;
        float[] fArr = this.O;
        if (z || (!this.S && y >= L && y <= this.s.getHeight() + L)) {
            if (!this.R) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.R = true;
            this.V = 0.0f;
            this.W = SystemClock.elapsedRealtime();
            x = Math.max(0, Math.min(x, this.s.getWidth()));
            y = Math.max(L, Math.min(y, this.s.getHeight() + L));
            if (this.c0 == this.d0) {
                f = 0.5f;
            } else {
                float brightness = getBrightness();
                float f2 = this.c0;
                f = (brightness - f2) / (this.d0 - f2);
            }
            fArr[0] = (x * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y - L));
            h();
            fArr[2] = (this.d0 * f) + ((1.0f - f) * this.c0);
            this.Q = null;
        }
        boolean z2 = this.S;
        RectF rectF = this.n;
        if (!z2) {
            if (!this.R) {
                float f3 = x;
                if (f3 >= rectF.left && f3 <= rectF.right) {
                    float f4 = y;
                    if (f4 >= rectF.top - hl.L(7.0f)) {
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
        float width = 1.0f - ((x - rectF.left) / rectF.width());
        float f5 = width >= 0.0f ? width > 1.0f ? 1.0f : width : 0.0f;
        fArr[2] = (this.d0 * f5) + ((1.0f - f5) * this.c0);
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

    public void setHasChanges(boolean z) {
        TextView textView = this.I;
        Object tag = textView.getTag();
        if (z) {
            if (tag != null) {
                return;
            }
        } else if (tag == null) {
            return;
        }
        if (this.G.getTag() == null) {
            textView.setTag(z ? 1 : null);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            if (z) {
                textView.setVisibility(0);
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            animatorSet.addListener(new z7((byte) 22, (Object) this, z));
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(180L);
            animatorSet.start();
        }
    }

    public void setMaxBrightness(float f) {
        this.b0 = f;
        h();
    }

    public void setMinBrightness(float f) {
        this.a0 = f;
        h();
    }

    public void setResourcesProvider(vnb vnbVar) {
        this.e0 = vnbVar;
    }

    @Override // snb
    public final void updateColors() {
        s7 s7Var = this.J;
        if (s7Var != null) {
            try {
                int v0 = aob.v0(aob.G6, this.e0);
                if (v0 != this.f0) {
                    this.f0 = v0;
                    s7Var.setIconColor(v0);
                }
                s7Var.O(aob.v0(aob.E8, this.e0), false);
                s7Var.O(aob.v0(aob.F8, this.e0), true);
                s7Var.I(aob.v0(aob.G8, this.e0));
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.F;
        if (editTextBoldCursorArr != null) {
            for (int i = 0; i < editTextBoldCursorArr.length; i++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(aob.v0(aob.G6, this.e0));
                    editTextBoldCursorArr[i].setHeaderHintColor(aob.v0(aob.L6, this.e0));
                }
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
