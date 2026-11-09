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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class vp extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int f0 = 0;
    public AnimatorSet D;
    public final EditTextBoldCursor[] E;
    public final org.telegram.ui.ActionBar.f0 F;
    public final ImageView G;
    public final TextView H;
    public final org.telegram.ui.ActionBar.r0 I;
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
    public final up a;
    public float a0;
    public final Paint b;
    public float b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public org.telegram.ui.ActionBar.g6 d0;
    public final Paint e;
    public int e0;
    public final Drawable f;
    public boolean h;
    public final RectF n;
    public boolean r;
    public Bitmap s;
    public final ColorPicker$RadioButton[] w;
    public final FrameLayout x;
    public final bi.nc y;

    public vp(Context context, boolean z9, up upVar) {
        super(context);
        this.n = new RectF();
        this.w = new ColorPicker$RadioButton[4];
        final int i7 = 1;
        this.K = 1;
        this.L = 1;
        this.N = new float[]{0.0f, 0.0f, 1.0f};
        this.O = new float[3];
        this.U = 1.0f;
        this.W = 0.0f;
        this.a0 = 1.0f;
        this.b0 = 0.0f;
        this.c0 = 1.0f;
        this.a = upVar;
        final int i10 = 2;
        this.E = new EditTextBoldCursor[2];
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
        bi.nc ncVar = new bi.nc(this, context);
        this.y = ncVar;
        ncVar.setOrientation(0);
        addView(ncVar, c8.ha.d(-1, 54.0f, 51, 27.0f, -6.0f, 17.0f, 0.0f));
        ncVar.setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        frameLayout.setClipChildren(false);
        addView(frameLayout, c8.ha.d(org.telegram.messenger.qs.E2, 30.0f, 49, 72.0f, 1.0f, 0.0f, 0.0f));
        int i12 = 0;
        while (i12 < 4) {
            this.w[i12] = new ColorPicker$RadioButton(context);
            ColorPicker$RadioButton colorPicker$RadioButton = this.w[i12];
            colorPicker$RadioButton.d = this.S == i12;
            colorPicker$RadioButton.b(false);
            this.x.addView(this.w[i12], c8.ha.d(30, 30.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.w[i12].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qp
                public final /* synthetic */ vp b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i13;
                    int i14 = i10;
                    vp vpVar = this.b;
                    int i15 = 1;
                    switch (i14) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            up upVar2 = vpVar.a;
                            org.telegram.ui.ActionBar.f0 f0Var = vpVar.F;
                            ImageView imageView = vpVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.w;
                            if (vpVar.D == null) {
                                int i16 = vpVar.K;
                                if (i16 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i13 = 0;
                                        colorPicker$RadioButton2.a(vp.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i13 = 0;
                                    }
                                    if (vpVar.h) {
                                        upVar2.c(colorPicker$RadioButtonArr[i13].e, i13, true);
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                    vpVar.K = 2;
                                } else if (i16 == 2) {
                                    vpVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.qs.e4, fArr));
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i16 == 3) {
                                    vpVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(vp.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (vpVar.K < vpVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (vpVar.K > 1) {
                                    if (f0Var.getVisibility() != 0) {
                                        f0Var.setScaleX(0.0f);
                                        f0Var.setScaleY(0.0f);
                                    }
                                    f0Var.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<org.telegram.ui.ActionBar.f0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<org.telegram.ui.ActionBar.f0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<org.telegram.ui.ActionBar.f0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[vpVar.K - 1].callOnClick();
                                vpVar.D = new AnimatorSet();
                                vpVar.g(vpVar.getMeasuredWidth(), arrayList, false);
                                vpVar.D.playTogether(arrayList);
                                vpVar.D.setDuration(180L);
                                vpVar.D.setInterpolator(xq.g);
                                vpVar.D.addListener(new tp(vpVar, i15));
                                vpVar.D.start();
                                break;
                            }
                            break;
                        case 1:
                            up upVar3 = vpVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.f0 f0Var2 = vpVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = vpVar.w;
                            ImageView imageView2 = vpVar.G;
                            if (vpVar.D == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i17 = vpVar.K;
                                if (i17 == 2) {
                                    vpVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i17 == 3) {
                                    vpVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                                } else if (i17 == 4) {
                                    vpVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                                }
                                if (vpVar.K < vpVar.L) {
                                    imageView2.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i18 = vpVar.S;
                                if (i18 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                    for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                        colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i20 = vpVar.T;
                                if (i20 < 0 || i20 >= vpVar.S) {
                                    colorPicker$RadioButtonArr2[vpVar.K - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i20].callOnClick();
                                }
                                int i21 = 0;
                                while (i21 < colorPicker$RadioButtonArr2.length) {
                                    if (i21 < vpVar.K) {
                                        upVar3.c(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        upVar3.c(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i21++;
                                }
                                vpVar.D = new AnimatorSet();
                                vpVar.g(vpVar.getMeasuredWidth(), arrayList2, true);
                                vpVar.D.playTogether(arrayList2);
                                vpVar.D.setDuration(180L);
                                vpVar.D.setInterpolator(xq.g);
                                vpVar.D.addListener(new tp(vpVar, 0));
                                vpVar.D.start();
                                break;
                            }
                            break;
                        case 2:
                            vp.a(vpVar, view);
                            break;
                        default:
                            vpVar.I.U(null, null);
                            break;
                    }
                }
            });
            i12++;
        }
        int i13 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.E;
            if (i13 >= editTextBoldCursorArr.length) {
                break;
            }
            if (i13 % 2 == 0) {
                editTextBoldCursorArr[i13] = new rp(this, context, i13, i11);
                this.E[i13].setBackgroundDrawable(null);
                this.E[i13].setText("#");
                this.E[i13].setEnabled(false);
                this.E[i13].setFocusable(false);
                this.E[i13].setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(16.0f));
                this.y.addView(this.E[i13], c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -1));
            } else {
                editTextBoldCursorArr[i13] = new rp(this, context, i13, i7);
                this.E[i13].setBackgroundDrawable(null);
                this.E[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
                this.E[i13].setHint("8BC6ED");
                this.E[i13].setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(16.0f));
                this.y.addView(this.E[i13], c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, 71, -1));
                this.E[i13].addTextChangedListener(new sp(this, i13));
                this.E[i13].setOnEditorActionListener(new l2(i7));
            }
            this.E[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.s6.D(this.E[i13], org.telegram.ui.ActionBar.l6.H6, this.d0);
            EditTextBoldCursor editTextBoldCursor = this.E[i13];
            int i14 = org.telegram.ui.ActionBar.l6.G6;
            org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, i14, this.d0);
            this.E[i13].setCursorColor(org.telegram.ui.ActionBar.l6.w0(i14, this.d0));
            this.E[i13].setCursorSize(org.telegram.messenger.g0.L(18.0f));
            this.E[i13].setCursorWidth(1.5f);
            this.E[i13].setSingleLine(true);
            this.E[i13].setGravity(19);
            this.E[i13].setHeaderHintColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.L6, this.d0));
            this.E[i13].setTransformHintToHeader(true);
            this.E[i13].setInputType(524416);
            this.E[i13].setImeOptions(268435462);
            if (i13 == 1) {
                this.E[i13].requestFocus();
            } else if (i13 == 2 || i13 == 3) {
                this.E[i13].setVisibility(8);
            }
            i13++;
        }
        ImageView imageView = new ImageView(getContext());
        this.G = imageView;
        int i15 = org.telegram.ui.ActionBar.l6.I5;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i15, this.d0), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i15);
        org.telegram.ui.ActionBar.g6 g6Var = this.d0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, g6Var);
        imageView.setImageResource(R.drawable.msg_add);
        int i16 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var2 = this.d0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.s(imageView, i16, g6Var2, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qp
            public final /* synthetic */ vp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i11;
                vp vpVar = this.b;
                int i152 = 1;
                switch (i142) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        up upVar2 = vpVar.a;
                        org.telegram.ui.ActionBar.f0 f0Var = vpVar.F;
                        ImageView imageView2 = vpVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.w;
                        if (vpVar.D == null) {
                            int i162 = vpVar.K;
                            if (i162 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i132 = 0;
                                    colorPicker$RadioButton2.a(vp.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i132 = 0;
                                }
                                if (vpVar.h) {
                                    upVar2.c(colorPicker$RadioButtonArr[i132].e, i132, true);
                                }
                                upVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                vpVar.K = 2;
                            } else if (i162 == 2) {
                                vpVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.qs.e4, fArr));
                                }
                                upVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i162 == 3) {
                                vpVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(vp.d(colorPicker$RadioButtonArr[2].e));
                                }
                                upVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (vpVar.K < vpVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (vpVar.K > 1) {
                                if (f0Var.getVisibility() != 0) {
                                    f0Var.setScaleX(0.0f);
                                    f0Var.setScaleY(0.0f);
                                }
                                f0Var.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<org.telegram.ui.ActionBar.f0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<org.telegram.ui.ActionBar.f0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var, (Property<org.telegram.ui.ActionBar.f0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[vpVar.K - 1].callOnClick();
                            vpVar.D = new AnimatorSet();
                            vpVar.g(vpVar.getMeasuredWidth(), arrayList, false);
                            vpVar.D.playTogether(arrayList);
                            vpVar.D.setDuration(180L);
                            vpVar.D.setInterpolator(xq.g);
                            vpVar.D.addListener(new tp(vpVar, i152));
                            vpVar.D.start();
                            break;
                        }
                        break;
                    case 1:
                        up upVar3 = vpVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.f0 f0Var2 = vpVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = vpVar.w;
                        ImageView imageView22 = vpVar.G;
                        if (vpVar.D == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i17 = vpVar.K;
                            if (i17 == 2) {
                                vpVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i17 == 3) {
                                vpVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                            } else if (i17 == 4) {
                                vpVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                            }
                            if (vpVar.K < vpVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i18 = vpVar.S;
                            if (i18 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                    colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i20 = vpVar.T;
                            if (i20 < 0 || i20 >= vpVar.S) {
                                colorPicker$RadioButtonArr2[vpVar.K - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i20].callOnClick();
                            }
                            int i21 = 0;
                            while (i21 < colorPicker$RadioButtonArr2.length) {
                                if (i21 < vpVar.K) {
                                    upVar3.c(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    upVar3.c(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i21++;
                            }
                            vpVar.D = new AnimatorSet();
                            vpVar.g(vpVar.getMeasuredWidth(), arrayList2, true);
                            vpVar.D.playTogether(arrayList2);
                            vpVar.D.setDuration(180L);
                            vpVar.D.setInterpolator(xq.g);
                            vpVar.D.addListener(new tp(vpVar, 0));
                            vpVar.D.start();
                            break;
                        }
                        break;
                    case 2:
                        vp.a(vpVar, view);
                        break;
                    default:
                        vpVar.I.U(null, null);
                        break;
                }
            }
        });
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754486, null));
        addView(imageView, c8.ha.d(30, 30.0f, 49, 36.0f, 1.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(1, getContext(), this);
        this.F = f0Var;
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i15, this.d0), 1, -1);
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i15);
        org.telegram.ui.ActionBar.g6 g6Var3 = this.d0;
        f0Var.setBackground(h03);
        org.telegram.ui.ActionBar.s6.j(f0Var, h03, null, M2, g6Var3);
        f0Var.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.s6.s(f0Var, i16, this.d0, mode);
        f0Var.setAlpha(0.0f);
        f0Var.setScaleX(0.0f);
        f0Var.setScaleY(0.0f);
        f0Var.setScaleType(scaleType);
        f0Var.setVisibility(4);
        f0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qp
            public final /* synthetic */ vp b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132;
                int i142 = i7;
                vp vpVar = this.b;
                int i152 = 1;
                switch (i142) {
                    case 0:
                        Property property = View.TRANSLATION_X;
                        Property property2 = View.SCALE_Y;
                        Property property3 = View.SCALE_X;
                        Property property4 = View.ALPHA;
                        up upVar2 = vpVar.a;
                        org.telegram.ui.ActionBar.f0 f0Var2 = vpVar.F;
                        ImageView imageView2 = vpVar.G;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.w;
                        if (vpVar.D == null) {
                            int i162 = vpVar.K;
                            if (i162 == 1) {
                                ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                if (colorPicker$RadioButton2.e == 0) {
                                    i132 = 0;
                                    colorPicker$RadioButton2.a(vp.d(colorPicker$RadioButtonArr[0].e));
                                } else {
                                    i132 = 0;
                                }
                                if (vpVar.h) {
                                    upVar2.c(colorPicker$RadioButtonArr[i132].e, i132, true);
                                }
                                upVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                vpVar.K = 2;
                            } else if (i162 == 2) {
                                vpVar.K = 3;
                                if (colorPicker$RadioButtonArr[2].e == 0) {
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                    float f10 = fArr[0];
                                    if (f10 > 180.0f) {
                                        fArr[0] = f10 - 60.0f;
                                    } else {
                                        fArr[0] = f10 + 60.0f;
                                    }
                                    colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.qs.e4, fArr));
                                }
                                upVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                            } else if (i162 == 3) {
                                vpVar.K = 4;
                                ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                if (colorPicker$RadioButton3.e == 0) {
                                    colorPicker$RadioButton3.a(vp.d(colorPicker$RadioButtonArr[2].e));
                                }
                                upVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                            }
                            ArrayList arrayList = new ArrayList();
                            if (vpVar.K < vpVar.L) {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                            } else {
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                            }
                            if (vpVar.K > 1) {
                                if (f0Var2.getVisibility() != 0) {
                                    f0Var2.setScaleX(0.0f);
                                    f0Var2.setScaleY(0.0f);
                                }
                                f0Var2.setVisibility(0);
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property4, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property3, 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property2, 1.0f));
                            }
                            colorPicker$RadioButtonArr[vpVar.K - 1].callOnClick();
                            vpVar.D = new AnimatorSet();
                            vpVar.g(vpVar.getMeasuredWidth(), arrayList, false);
                            vpVar.D.playTogether(arrayList);
                            vpVar.D.setDuration(180L);
                            vpVar.D.setInterpolator(xq.g);
                            vpVar.D.addListener(new tp(vpVar, i152));
                            vpVar.D.start();
                            break;
                        }
                        break;
                    case 1:
                        up upVar3 = vpVar.a;
                        Property property5 = View.TRANSLATION_X;
                        Property property6 = View.SCALE_Y;
                        Property property7 = View.SCALE_X;
                        Property property8 = View.ALPHA;
                        org.telegram.ui.ActionBar.f0 f0Var22 = vpVar.F;
                        ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = vpVar.w;
                        ImageView imageView22 = vpVar.G;
                        if (vpVar.D == null) {
                            ArrayList arrayList2 = new ArrayList();
                            int i17 = vpVar.K;
                            if (i17 == 2) {
                                vpVar.K = 1;
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, (Property<org.telegram.ui.ActionBar.f0, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, (Property<org.telegram.ui.ActionBar.f0, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(f0Var22, (Property<org.telegram.ui.ActionBar.f0, Float>) property6, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                            } else if (i17 == 3) {
                                vpVar.K = 2;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                            } else if (i17 == 4) {
                                vpVar.K = 3;
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                            }
                            if (vpVar.K < vpVar.L) {
                                imageView22.setVisibility(0);
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                            } else {
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                            }
                            int i18 = vpVar.S;
                            if (i18 != 3) {
                                ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                    colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                }
                                colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                            }
                            int i20 = vpVar.T;
                            if (i20 < 0 || i20 >= vpVar.S) {
                                colorPicker$RadioButtonArr2[vpVar.K - 1].callOnClick();
                            } else {
                                colorPicker$RadioButtonArr2[i20].callOnClick();
                            }
                            int i21 = 0;
                            while (i21 < colorPicker$RadioButtonArr2.length) {
                                if (i21 < vpVar.K) {
                                    upVar3.c(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                } else {
                                    upVar3.c(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                }
                                i21++;
                            }
                            vpVar.D = new AnimatorSet();
                            vpVar.g(vpVar.getMeasuredWidth(), arrayList2, true);
                            vpVar.D.playTogether(arrayList2);
                            vpVar.D.setDuration(180L);
                            vpVar.D.setInterpolator(xq.g);
                            vpVar.D.addListener(new tp(vpVar, 0));
                            vpVar.D.start();
                            break;
                        }
                        break;
                    case 2:
                        vp.a(vpVar, view);
                        break;
                    default:
                        vpVar.I.U(null, null);
                        break;
                }
            }
        });
        f0Var.setContentDescription(org.telegram.messenger.id.M0(2131752099, null));
        addView(f0Var, c8.ha.d(30, 30.0f, 51, 97.0f, 1.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.H = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.s6.U(textView, i16, this.d0);
        addView(textView, c8.ha.d(-2, 36.0f, 53, 0.0f, 3.0f, 14.0f, 0.0f));
        textView.setOnClickListener(new bi.l1(10));
        if (z9) {
            org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, (org.telegram.ui.ActionBar.y) null, org.telegram.ui.ActionBar.l6.w0(i16, this.d0));
            this.I = r0Var;
            r0Var.setLongClickEnabled(false);
            r0Var.setIcon(R.drawable.ic_ab_other);
            r0Var.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
            r0Var.e(1, R.drawable.msg_edit, org.telegram.messenger.id.M0(2131747797, null));
            r0Var.e(2, R.drawable.msg_share, org.telegram.messenger.id.M0(2131745426, null));
            r0Var.e(3, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751486, null));
            r0Var.setMenuYOffset(-org.telegram.messenger.g0.L(80.0f));
            r0Var.setSubMenuOpenSide(2);
            r0Var.setDelegate(new u(this, 26));
            r0Var.setAdditionalYOffset(org.telegram.messenger.g0.L(72.0f));
            r0Var.setTranslationX(org.telegram.messenger.g0.L(6.0f));
            org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i15, this.d0), 1, -1);
            org.telegram.ui.ActionBar.o6 M3 = org.telegram.ui.ActionBar.s6.M(i15);
            org.telegram.ui.ActionBar.g6 g6Var4 = this.d0;
            r0Var.setBackground(h04);
            org.telegram.ui.ActionBar.s6.j(r0Var, h04, null, M3, g6Var4);
            addView(r0Var, c8.ha.d(30, 30.0f, 53, 0.0f, 2.0f, 10.0f, 0.0f));
            final int i17 = 3;
            r0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qp
                public final /* synthetic */ vp b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i132;
                    int i142 = i17;
                    vp vpVar = this.b;
                    int i152 = 1;
                    switch (i142) {
                        case 0:
                            Property property = View.TRANSLATION_X;
                            Property property2 = View.SCALE_Y;
                            Property property3 = View.SCALE_X;
                            Property property4 = View.ALPHA;
                            up upVar2 = vpVar.a;
                            org.telegram.ui.ActionBar.f0 f0Var2 = vpVar.F;
                            ImageView imageView2 = vpVar.G;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.w;
                            if (vpVar.D == null) {
                                int i162 = vpVar.K;
                                if (i162 == 1) {
                                    ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[1];
                                    if (colorPicker$RadioButton2.e == 0) {
                                        i132 = 0;
                                        colorPicker$RadioButton2.a(vp.d(colorPicker$RadioButtonArr[0].e));
                                    } else {
                                        i132 = 0;
                                    }
                                    if (vpVar.h) {
                                        upVar2.c(colorPicker$RadioButtonArr[i132].e, i132, true);
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[1].e, 1, true);
                                    vpVar.K = 2;
                                } else if (i162 == 2) {
                                    vpVar.K = 3;
                                    if (colorPicker$RadioButtonArr[2].e == 0) {
                                        float[] fArr = new float[3];
                                        Color.colorToHSV(colorPicker$RadioButtonArr[0].e, fArr);
                                        float f10 = fArr[0];
                                        if (f10 > 180.0f) {
                                            fArr[0] = f10 - 60.0f;
                                        } else {
                                            fArr[0] = f10 + 60.0f;
                                        }
                                        colorPicker$RadioButtonArr[2].a(Color.HSVToColor(org.telegram.messenger.qs.e4, fArr));
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[2].e, 2, true);
                                } else if (i162 == 3) {
                                    vpVar.K = 4;
                                    ColorPicker$RadioButton colorPicker$RadioButton3 = colorPicker$RadioButtonArr[3];
                                    if (colorPicker$RadioButton3.e == 0) {
                                        colorPicker$RadioButton3.a(vp.d(colorPicker$RadioButtonArr[2].e));
                                    }
                                    upVar2.c(colorPicker$RadioButtonArr[3].e, 3, true);
                                }
                                ArrayList arrayList = new ArrayList();
                                if (vpVar.K < vpVar.L) {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                } else {
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, com.google.android.recaptcha.internal.a.e(vpVar.K, 1, org.telegram.messenger.g0.L(13.0f), (vpVar.K - 1) * org.telegram.messenger.g0.L(30.0f))));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property4, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.0f));
                                }
                                if (vpVar.K > 1) {
                                    if (f0Var2.getVisibility() != 0) {
                                        f0Var2.setScaleX(0.0f);
                                        f0Var2.setScaleY(0.0f);
                                    }
                                    f0Var2.setVisibility(0);
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property4, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property3, 1.0f));
                                    arrayList.add(ObjectAnimator.ofFloat(f0Var2, (Property<org.telegram.ui.ActionBar.f0, Float>) property2, 1.0f));
                                }
                                colorPicker$RadioButtonArr[vpVar.K - 1].callOnClick();
                                vpVar.D = new AnimatorSet();
                                vpVar.g(vpVar.getMeasuredWidth(), arrayList, false);
                                vpVar.D.playTogether(arrayList);
                                vpVar.D.setDuration(180L);
                                vpVar.D.setInterpolator(xq.g);
                                vpVar.D.addListener(new tp(vpVar, i152));
                                vpVar.D.start();
                                break;
                            }
                            break;
                        case 1:
                            up upVar3 = vpVar.a;
                            Property property5 = View.TRANSLATION_X;
                            Property property6 = View.SCALE_Y;
                            Property property7 = View.SCALE_X;
                            Property property8 = View.ALPHA;
                            org.telegram.ui.ActionBar.f0 f0Var22 = vpVar.F;
                            ColorPicker$RadioButton[] colorPicker$RadioButtonArr2 = vpVar.w;
                            ImageView imageView22 = vpVar.G;
                            if (vpVar.D == null) {
                                ArrayList arrayList2 = new ArrayList();
                                int i172 = vpVar.K;
                                if (i172 == 2) {
                                    vpVar.K = 1;
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, (Property<org.telegram.ui.ActionBar.f0, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, (Property<org.telegram.ui.ActionBar.f0, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(f0Var22, (Property<org.telegram.ui.ActionBar.f0, Float>) property6, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, 0.0f));
                                } else if (i172 == 3) {
                                    vpVar.K = 2;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f)));
                                } else if (i172 == 4) {
                                    vpVar.K = 3;
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property5, org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2)));
                                }
                                if (vpVar.K < vpVar.L) {
                                    imageView22.setVisibility(0);
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 1.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 1.0f));
                                } else {
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property8, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property7, 0.0f));
                                    arrayList2.add(ObjectAnimator.ofFloat(imageView22, (Property<ImageView, Float>) property6, 0.0f));
                                }
                                int i18 = vpVar.S;
                                if (i18 != 3) {
                                    ColorPicker$RadioButton colorPicker$RadioButton4 = colorPicker$RadioButtonArr2[i18];
                                    for (int i19 = i18 + 1; i19 < colorPicker$RadioButtonArr2.length; i19++) {
                                        colorPicker$RadioButtonArr2[i19 - 1] = colorPicker$RadioButtonArr2[i19];
                                    }
                                    colorPicker$RadioButtonArr2[3] = colorPicker$RadioButton4;
                                }
                                int i20 = vpVar.T;
                                if (i20 < 0 || i20 >= vpVar.S) {
                                    colorPicker$RadioButtonArr2[vpVar.K - 1].callOnClick();
                                } else {
                                    colorPicker$RadioButtonArr2[i20].callOnClick();
                                }
                                int i21 = 0;
                                while (i21 < colorPicker$RadioButtonArr2.length) {
                                    if (i21 < vpVar.K) {
                                        upVar3.c(colorPicker$RadioButtonArr2[i21].e, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    } else {
                                        upVar3.c(0, i21, i21 == colorPicker$RadioButtonArr2.length - 1);
                                    }
                                    i21++;
                                }
                                vpVar.D = new AnimatorSet();
                                vpVar.g(vpVar.getMeasuredWidth(), arrayList2, true);
                                vpVar.D.playTogether(arrayList2);
                                vpVar.D.setDuration(180L);
                                vpVar.D.setInterpolator(xq.g);
                                vpVar.D.addListener(new tp(vpVar, 0));
                                vpVar.D.start();
                                break;
                            }
                            break;
                        case 2:
                            vp.a(vpVar, view);
                            break;
                        default:
                            vpVar.I.U(null, null);
                            break;
                    }
                }
            });
        }
        g(getMeasuredWidth(), null, false);
    }

    public static void a(vp vpVar, View view) {
        ColorPicker$RadioButton colorPicker$RadioButton = (ColorPicker$RadioButton) view;
        int i7 = 0;
        while (true) {
            ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.w;
            if (i7 >= colorPicker$RadioButtonArr.length) {
                int i10 = colorPicker$RadioButton.e;
                vpVar.setColorInner(i10);
                vpVar.E[1].setText(String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i10)), Byte.valueOf((byte) Color.green(i10)), Byte.valueOf((byte) Color.blue(i10))).toUpperCase());
                return;
            }
            ColorPicker$RadioButton colorPicker$RadioButton2 = colorPicker$RadioButtonArr[i7];
            boolean z9 = colorPicker$RadioButton2 == colorPicker$RadioButton;
            colorPicker$RadioButton2.d = z9;
            colorPicker$RadioButton2.b(true);
            if (z9) {
                vpVar.T = vpVar.S;
                vpVar.S = i7;
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
        return Color.HSVToColor(org.telegram.messenger.qs.e4, fArr);
    }

    private float getBrightness() {
        return Math.max(this.b0, Math.min(this.N[2], this.c0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorInner(int i7) {
        Color.colorToHSV(i7, this.N);
        int d = this.a.d(this.S);
        if (d == 0 || d != i7) {
            h();
        }
        this.P = null;
        invalidate();
    }

    public final void c(Canvas canvas, int i7, int i10, int i11, boolean z9) {
        int L = org.telegram.messenger.g0.L(z9 ? 12.0f : 16.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i7 - L, i10 - L, i7 + L, L + i10);
        drawable.draw(canvas);
        Paint paint = this.d;
        paint.setColor(-1);
        float f10 = i7;
        float f11 = i10;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(z9 ? 11.0f : 15.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(z9 ? 9.0f : 13.0f), paint);
    }

    public final void e(int i7, int i10) {
        if (!this.r) {
            this.r = true;
            if (this.S == i10) {
                String upperCase = String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(i7)), Byte.valueOf((byte) Color.green(i7)), Byte.valueOf((byte) Color.blue(i7))).toUpperCase();
                EditTextBoldCursor[] editTextBoldCursorArr = this.E;
                editTextBoldCursorArr[1].setText(upperCase);
                editTextBoldCursorArr[1].setSelection(upperCase.length());
            }
            this.w[i10].a(i7);
            this.r = false;
        }
        setColorInner(i7);
    }

    public final void f(int i7, int i10, int i11, boolean z9) {
        if (i7 != this.J) {
            this.T = 0;
            this.S = 0;
            int i12 = 0;
            while (i12 < 4) {
                ColorPicker$RadioButton colorPicker$RadioButton = this.w[i12];
                colorPicker$RadioButton.d = i12 == this.S;
                colorPicker$RadioButton.b(true);
                i12++;
            }
        }
        this.L = i10;
        this.J = i7;
        this.h = z9;
        this.K = i11;
        ImageView imageView = this.G;
        if (i11 == 1) {
            imageView.setTranslationX(0.0f);
        } else if (i11 == 2) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(13.0f) + org.telegram.messenger.g0.L(30.0f));
        } else if (i11 == 3) {
            imageView.setTranslationX(org.telegram.messenger.k5.D(13.0f, 2, org.telegram.messenger.g0.L(30.0f) * 2));
        } else {
            imageView.setTranslationX(org.telegram.messenger.k5.D(13.0f, 3, org.telegram.messenger.g0.L(30.0f) * 3));
        }
        org.telegram.ui.ActionBar.f0 f0Var = this.F;
        org.telegram.ui.ActionBar.r0 r0Var = this.I;
        if (r0Var != null) {
            if (i7 == 1) {
                r0Var.setVisibility(0);
            } else {
                r0Var.setVisibility(8);
                f0Var.setTranslationX(0.0f);
            }
        }
        if (i10 <= 1) {
            imageView.setVisibility(8);
            f0Var.setVisibility(8);
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
                f0Var.setVisibility(0);
                f0Var.setScaleX(1.0f);
                f0Var.setScaleY(1.0f);
                f0Var.setAlpha(1.0f);
            } else {
                f0Var.setVisibility(8);
            }
        }
        this.y.invalidate();
        g(getMeasuredWidth(), null, false);
    }

    public final void g(int i7, ArrayList arrayList, boolean z9) {
        int i10 = this.K;
        float f10 = 30.0f;
        int D = org.telegram.messenger.k5.D(13.0f, i10 - 1, org.telegram.messenger.g0.L(30.0f) * i10);
        FrameLayout frameLayout = this.x;
        float f11 = frameLayout.getLeft() + D > i7 - org.telegram.messenger.g0.L(this.J == 1 ? 50.0f : 0.0f) ? r7 - r2 : 0.0f;
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
            boolean z10 = colorPicker$RadioButtonArr[i11].getTag(R.id.index_tag) != null;
            int i13 = this.K;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            float f12 = f10;
            Property property4 = View.ALPHA;
            if (i11 < i13) {
                colorPicker$RadioButtonArr[i11].setVisibility(0);
                if (arrayList != null) {
                    if (!z10) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property4, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property3, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property2, 1.0f));
                    }
                    if (z9 || !(z9 || i11 == this.K - 1)) {
                        arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property, i12));
                    } else {
                        colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                    }
                } else {
                    colorPicker$RadioButtonArr[i11].setVisibility(0);
                    if (this.D == null) {
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
                    if (this.D == null) {
                        colorPicker$RadioButtonArr[i11].setAlpha(0.0f);
                        colorPicker$RadioButtonArr[i11].setScaleX(0.0f);
                        colorPicker$RadioButtonArr[i11].setScaleY(0.0f);
                    }
                } else if (z10) {
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property4, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property3, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(colorPicker$RadioButtonArr[i11], (Property<ColorPicker$RadioButton, Float>) property2, 0.0f));
                }
                if (!z9) {
                    colorPicker$RadioButtonArr[i11].setTranslationX(i12);
                }
                colorPicker$RadioButtonArr[i11].setTag(R.id.index_tag, null);
            }
            i12 = org.telegram.messenger.k5.C(13.0f, org.telegram.messenger.g0.L(f12), i12);
            i11++;
            f10 = f12;
        }
    }

    public int getColor() {
        float[] fArr = this.N;
        float f10 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        fArr2[2] = getBrightness();
        return (Color.HSVToColor(fArr2) & 16777215) | (-16777216);
    }

    public final void h() {
        org.telegram.ui.ActionBar.f0 f0Var = this.F;
        if (f0Var == null) {
            return;
        }
        float f10 = f0Var.getTag() != null ? 0.0f : this.W;
        float f11 = f0Var.getTag() != null ? 1.0f : this.a0;
        float[] fArr = this.N;
        float f12 = fArr[2];
        if (f10 == 0.0f && f11 == 1.0f) {
            this.b0 = 0.0f;
            this.c0 = 1.0f;
            return;
        }
        fArr[2] = 1.0f;
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = f12;
        float B = org.telegram.messenger.g0.B(HSVToColor);
        float max = Math.max(0.0f, Math.min(f10 / B, 1.0f));
        this.b0 = max;
        this.c0 = Math.max(max, Math.min(f11 / B, 1.0f));
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
        float[] fArr = this.N;
        float f12 = fArr[0];
        float[] fArr2 = this.O;
        fArr2[0] = f12;
        fArr2[1] = fArr[1];
        fArr2[2] = 1.0f;
        int measuredWidth = (int) ((fArr[0] * getMeasuredWidth()) / 360.0f);
        int z9 = (int) com.google.android.recaptcha.internal.a.z(1.0f, fArr[1], this.s.getHeight(), f11);
        if (!this.Q) {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            float interpolation = xq.g.getInterpolation(this.U);
            if (measuredWidth < L2) {
                measuredWidth = (int) (((L2 - measuredWidth) * interpolation) + measuredWidth);
            } else if (measuredWidth > getMeasuredWidth() - L2) {
                measuredWidth = (int) (measuredWidth - ((measuredWidth - (getMeasuredWidth() - L2)) * interpolation));
            }
            if (z9 < L + L2) {
                z9 = (int) ((interpolation * (r5 - z9)) + z9);
            } else if (z9 > (this.s.getHeight() + L) - L2) {
                z9 = (int) (z9 - (interpolation * (z9 - ((this.s.getHeight() + L) - L2))));
            }
        }
        c(canvas, measuredWidth, z9, Color.HSVToColor(fArr2), false);
        float L3 = org.telegram.messenger.g0.L(22.0f);
        float L4 = org.telegram.messenger.g0.L(26.0f) + height;
        float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(22.0f);
        float L5 = org.telegram.messenger.g0.L(34.0f) + height;
        RectF rectF = this.n;
        rectF.set(L3, L4, measuredWidth2, L5);
        LinearGradient linearGradient = this.P;
        Paint paint2 = this.c;
        if (linearGradient == null) {
            fArr2[2] = this.b0;
            int HSVToColor = Color.HSVToColor(fArr2);
            fArr2[2] = this.c0;
            int HSVToColor2 = Color.HSVToColor(fArr2);
            float f13 = rectF.left;
            float f14 = rectF.top;
            LinearGradient linearGradient2 = new LinearGradient(f13, f14, rectF.right, f14, new int[]{HSVToColor2, HSVToColor}, (float[]) null, Shader.TileMode.CLAMP);
            this.P = linearGradient2;
            paint2.setShader(linearGradient2);
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint2);
        if (this.b0 == this.c0) {
            f10 = 0.5f;
        } else {
            float brightness = getBrightness();
            float f15 = this.b0;
            f10 = (brightness - f15) / (this.c0 - f15);
        }
        c(canvas, (int) ((rectF.width() * (1.0f - f10)) + rectF.left), (int) rectF.centerY(), getColor(), true);
        if (this.Q || this.U >= 1.0f) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.V;
        this.V = elapsedRealtime;
        float f16 = (j3 / 180.0f) + this.U;
        this.U = f16;
        if (f16 > 1.0f) {
            this.U = 1.0f;
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        g(getMeasuredWidth(), null, false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (this.M != i7) {
            this.M = i7;
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
            this.P = null;
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
                this.R = false;
                this.Q = false;
                this.V = SystemClock.elapsedRealtime();
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int L = org.telegram.messenger.g0.L(45.0f);
        boolean z9 = this.Q;
        float[] fArr = this.N;
        if (z9 || (!this.R && y10 >= L && y10 <= this.s.getHeight() + L)) {
            if (!this.Q) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.Q = true;
            this.U = 0.0f;
            this.V = SystemClock.elapsedRealtime();
            x10 = Math.max(0, Math.min(x10, this.s.getWidth()));
            y10 = Math.max(L, Math.min(y10, this.s.getHeight() + L));
            if (this.b0 == this.c0) {
                f10 = 0.5f;
            } else {
                float brightness = getBrightness();
                float f11 = this.b0;
                f10 = (brightness - f11) / (this.c0 - f11);
            }
            fArr[0] = (x10 * 360.0f) / this.s.getWidth();
            fArr[1] = 1.0f - ((1.0f / this.s.getHeight()) * (y10 - L));
            h();
            fArr[2] = (this.c0 * f10) + ((1.0f - f10) * this.b0);
            this.P = null;
        }
        boolean z10 = this.R;
        RectF rectF = this.n;
        if (!z10) {
            if (!this.Q) {
                float f12 = x10;
                if (f12 >= rectF.left && f12 <= rectF.right) {
                    float f13 = y10;
                    if (f13 >= rectF.top - org.telegram.messenger.g0.L(7.0f)) {
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
        float f14 = width >= 0.0f ? width > 1.0f ? 1.0f : width : 0.0f;
        fArr[2] = (this.c0 * f14) + ((1.0f - f14) * this.b0);
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

    public void setHasChanges(boolean z9) {
        TextView textView = this.H;
        if (!z9 || textView.getTag() == null) {
            if ((z9 || textView.getTag() != null) && this.F.getTag() == null) {
                textView.setTag(z9 ? 1 : null);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (z9) {
                    textView.setVisibility(0);
                }
                arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
                animatorSet.addListener(new t9(6, this, z9));
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(180L);
                animatorSet.start();
            }
        }
    }

    public void setMaxBrightness(float f10) {
        this.a0 = f10;
        h();
    }

    public void setMinBrightness(float f10) {
        this.W = f10;
        h();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.d0 = g6Var;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.r0 r0Var = this.I;
        if (r0Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, this.d0);
                if (w02 != this.e0) {
                    this.e0 = w02;
                    r0Var.setIconColor(w02);
                }
                r0Var.O(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, this.d0), false);
                r0Var.O(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.F8, this.d0), true);
                r0Var.H(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, this.d0));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.E;
        if (editTextBoldCursorArr != null) {
            for (int i7 = 0; i7 < editTextBoldCursorArr.length; i7++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, this.d0));
                    editTextBoldCursorArr[i7].setHeaderHintColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.L6, this.d0));
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
