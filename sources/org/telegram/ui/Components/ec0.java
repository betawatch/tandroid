package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class ec0 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int[] i0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public int G;
    public final ri.b H;
    public final dh.c I;
    public Bitmap J;
    public Canvas K;
    public int L;
    public final ch0 M;
    public final Rect N;
    public cc0 O;
    public boolean P;
    public AnimatorSet Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public r1.g T;
    public final LinkedList U;
    public final LinkedList V;
    public final ArrayList W;
    public Drawable a;
    public float a0;
    public final FrameLayout b;
    public int b0;
    public final TextView c;
    public final dt c0;
    public final FrameLayout d;
    public int d0;
    public final di.b4 e;
    public fi.q3 e0;
    public final ArrayList f;
    public boolean f0;
    public ValueAnimator g0;
    public final FrameLayout h;
    public final int[] h0;
    public final bc0 n;
    public final EditTextBoldCursor r;
    public final fi.a8 s;
    public final bi.x5 w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec0(Context context) {
        super(context);
        int i7;
        String M0 = org.telegram.messenger.id.M0(2131743850, null);
        final int i10 = 0;
        this.G = 0;
        ri.b bVar = new ri.b();
        this.H = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.I = cVar;
        xe.b bVar2 = new xe.b();
        this.N = new Rect();
        this.U = new LinkedList();
        this.V = new LinkedList();
        this.W = new ArrayList();
        this.b0 = -12;
        this.c0 = new dt(this, 8);
        final int i11 = 1;
        this.f0 = true;
        this.h0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        bi.x5 x5Var = new bi.x5(this, context);
        this.w = x5Var;
        x5Var.setWillNotDraw(false);
        addView(x5Var, c8.ha.c(-1.0f, -1));
        cVar.h = new jh.k(x5Var);
        cVar.i = x5Var;
        cVar.g = bVar2;
        ch0 ch0Var = new ch0(context);
        this.M = ch0Var;
        ch0Var.f(R.raw.passcode_lock, 58, 58, null);
        ch0Var.setAutoRepeat(false);
        addView(ch0Var, c8.ha.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        x5Var.addView(frameLayout, c8.ha.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setAlpha(0.0f);
        TextView i12 = org.telegram.ui.Cells.f1.i(frameLayout, textView, c8.ha.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.y = i12;
        i12.setTextColor(-1);
        i12.setTextSize(1, 15.0f);
        i12.setGravity(1);
        i12.setVisibility(4);
        x5Var.addView(i12, c8.ha.e(-2, -2, 17));
        fi.a8 a8Var = new fi.a8(this, context);
        this.s = a8Var;
        frameLayout.addView(a8Var, c8.ha.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.r = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 36.0f);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setGravity(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setCursorColor(-1);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(32.0f));
        frameLayout.addView(editTextBoldCursor, c8.ha.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new s0(this, 4));
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 21));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new li.a1(1));
        ImageView imageView = new ImageView(context);
        this.D = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131751354, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vb0
            public final /* synthetic */ ec0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r2v29 */
            /* JADX WARN: Type inference failed for: r2v30, types: [int] */
            /* JADX WARN: Type inference failed for: r2v33 */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v23, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r8v13 */
            /* JADX WARN: Type inference failed for: r8v14 */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5, types: [int] */
            /* JADX WARN: Type inference failed for: r8v6 */
            /* JADX WARN: Type inference failed for: r8v7, types: [int] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ec0 ec0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z9;
                boolean z10;
                LinkedList linkedList3;
                int i13;
                int i14;
                ec0 ec0Var2;
                boolean z11;
                boolean z12;
                int i15 = i10;
                ec0 ec0Var3 = this.b;
                switch (i15) {
                    case 0:
                        ec0Var3.n(false);
                        break;
                    case 1:
                        ec0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = ec0Var3.V;
                        LinkedList linkedList5 = ec0Var3.U;
                        fi.a8 a8Var2 = ec0Var3.s;
                        if (ec0Var3.f0 && !ec0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("0");
                                    z10 = z9;
                                    break;
                                case 1:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("1");
                                    z10 = z9;
                                    break;
                                case 2:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("2");
                                    z10 = z9;
                                    break;
                                case 3:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("3");
                                    z10 = z9;
                                    break;
                                case 4:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("4");
                                    z10 = z9;
                                    break;
                                case 5:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("5");
                                    z10 = z9;
                                    break;
                                case 6:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("6");
                                    z10 = z9;
                                    break;
                                case 7:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("7");
                                    z10 = z9;
                                    break;
                                case 8:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("8");
                                    z10 = z9;
                                    break;
                                case 9:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("9");
                                    z10 = z9;
                                    break;
                                case 10:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    ec0Var.c();
                                    z10 = z9;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) a8Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z9 = false;
                                    ArrayList arrayList2 = (ArrayList) a8Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) a8Var2.d;
                                    if (sb2.length() == 0) {
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = z9;
                                        break;
                                    } else {
                                        try {
                                            a8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i16 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i17 = length;
                                        while (i17 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i17);
                                            ec0 ec0Var4 = ec0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i13 = i16;
                                                float[] fArr = new float[i13];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i13];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i13];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i13];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                float[] fArr5 = new float[i13];
                                                fArr5[0] = a8Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i13 = i16;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i17);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i13];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                float[] fArr7 = new float[i13];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                float[] fArr8 = new float[i13];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                float[] fArr9 = new float[i13];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                float c10 = a8Var2.c(i17);
                                                i14 = i17;
                                                float[] fArr10 = new float[i13];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            ec0Var3 = ec0Var4;
                                            i16 = 1;
                                        }
                                        ec0Var = ec0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, a8Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, a8Var2.c(i18)));
                                        }
                                        pe peVar = (pe) a8Var2.f;
                                        if (peVar != null) {
                                            org.telegram.messenger.g0.r(peVar);
                                            a8Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) a8Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        a8Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) a8Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) a8Var2.e).addListener(new zb0(a8Var2, 1));
                                        ((AnimatorSet) a8Var2.e).start();
                                        ec0.a((ec0) a8Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    z10 = z9;
                                    break;
                            }
                            int i19 = 11;
                            if (intValue == 11) {
                                ec0Var2 = ec0Var;
                            } else {
                                ec0Var2 = ec0Var;
                                Drawable drawable = ec0Var2.a;
                                if (drawable instanceof qa0) {
                                    qa0 qa0Var = (qa0) drawable;
                                    qa0Var.D = null;
                                    qa0Var.y();
                                    float f10 = qa0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            qa0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = z9;
                                        }
                                        z11 = z9;
                                    } else {
                                        z11 = true;
                                        qa0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            ec0Var2.b(qa0Var);
                                        } else {
                                            bi.u7 u7Var = new bi.u7(ec0Var2, z11, qa0Var, 22);
                                            ?? r22 = linkedList2;
                                            r22.offer(u7Var);
                                            ?? r42 = linkedList;
                                            r42.offer(Boolean.valueOf(z11));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r82 = z9; r82 < r22.size(); r82++) {
                                                Runnable runnable = (Runnable) r22.get(r82);
                                                Boolean bool = (Boolean) r42.get(r82);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r82));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r83 = z9; r83 < size; r83++) {
                                                r22.remove((Runnable) arrayList4.get(r83));
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.pe(i19));
                                            int size2 = arrayList5.size();
                                            for (?? r23 = z9; r23 < size2; r23++) {
                                                r42.remove(((Integer) arrayList5.get(r23)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) a8Var2.d).length() == 4) {
                                ec0Var2.n(z9);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setImageResource(R.drawable.fingerprint);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, c8.ha.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(org.telegram.messenger.id.M0(2131754881, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vb0
            public final /* synthetic */ ec0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v27, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r2v29 */
            /* JADX WARN: Type inference failed for: r2v30, types: [int] */
            /* JADX WARN: Type inference failed for: r2v33 */
            /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v23, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r8v13 */
            /* JADX WARN: Type inference failed for: r8v14 */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5, types: [int] */
            /* JADX WARN: Type inference failed for: r8v6 */
            /* JADX WARN: Type inference failed for: r8v7, types: [int] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ec0 ec0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z9;
                boolean z10;
                LinkedList linkedList3;
                int i13;
                int i14;
                ec0 ec0Var2;
                boolean z11;
                boolean z12;
                int i15 = i11;
                ec0 ec0Var3 = this.b;
                switch (i15) {
                    case 0:
                        ec0Var3.n(false);
                        break;
                    case 1:
                        ec0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = ec0Var3.V;
                        LinkedList linkedList5 = ec0Var3.U;
                        fi.a8 a8Var2 = ec0Var3.s;
                        if (ec0Var3.f0 && !ec0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("0");
                                    z10 = z9;
                                    break;
                                case 1:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("1");
                                    z10 = z9;
                                    break;
                                case 2:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("2");
                                    z10 = z9;
                                    break;
                                case 3:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("3");
                                    z10 = z9;
                                    break;
                                case 4:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("4");
                                    z10 = z9;
                                    break;
                                case 5:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("5");
                                    z10 = z9;
                                    break;
                                case 6:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("6");
                                    z10 = z9;
                                    break;
                                case 7:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("7");
                                    z10 = z9;
                                    break;
                                case 8:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("8");
                                    z10 = z9;
                                    break;
                                case 9:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    a8Var2.b("9");
                                    z10 = z9;
                                    break;
                                case 10:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    ec0Var.c();
                                    z10 = z9;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) a8Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z9 = false;
                                    ArrayList arrayList2 = (ArrayList) a8Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) a8Var2.d;
                                    if (sb2.length() == 0) {
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = z9;
                                        break;
                                    } else {
                                        try {
                                            a8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i16 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i17 = length;
                                        while (i17 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i17);
                                            ec0 ec0Var4 = ec0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i13 = i16;
                                                float[] fArr = new float[i13];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i13];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i13];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i13];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                float[] fArr5 = new float[i13];
                                                fArr5[0] = a8Var2.c(i17);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i13 = i16;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i17);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i13];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                float[] fArr7 = new float[i13];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                float[] fArr8 = new float[i13];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                float[] fArr9 = new float[i13];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                float c10 = a8Var2.c(i17);
                                                i14 = i17;
                                                float[] fArr10 = new float[i13];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            ec0Var3 = ec0Var4;
                                            i16 = 1;
                                        }
                                        ec0Var = ec0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, a8Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, a8Var2.c(i18)));
                                        }
                                        pe peVar = (pe) a8Var2.f;
                                        if (peVar != null) {
                                            org.telegram.messenger.g0.r(peVar);
                                            a8Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) a8Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        a8Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) a8Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) a8Var2.e).addListener(new zb0(a8Var2, 1));
                                        ((AnimatorSet) a8Var2.e).start();
                                        ec0.a((ec0) a8Var2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    ec0Var = ec0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z9 = false;
                                    z10 = z9;
                                    break;
                            }
                            int i19 = 11;
                            if (intValue == 11) {
                                ec0Var2 = ec0Var;
                            } else {
                                ec0Var2 = ec0Var;
                                Drawable drawable = ec0Var2.a;
                                if (drawable instanceof qa0) {
                                    qa0 qa0Var = (qa0) drawable;
                                    qa0Var.D = null;
                                    qa0Var.y();
                                    float f10 = qa0Var.h;
                                    if (intValue == 10) {
                                        if (z10) {
                                            qa0Var.x();
                                            z12 = true;
                                        } else {
                                            z12 = z9;
                                        }
                                        z11 = z9;
                                    } else {
                                        z11 = true;
                                        qa0Var.w(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            ec0Var2.b(qa0Var);
                                        } else {
                                            bi.u7 u7Var = new bi.u7(ec0Var2, z11, qa0Var, 22);
                                            ?? r22 = linkedList2;
                                            r22.offer(u7Var);
                                            ?? r42 = linkedList;
                                            r42.offer(Boolean.valueOf(z11));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r82 = z9; r82 < r22.size(); r82++) {
                                                Runnable runnable = (Runnable) r22.get(r82);
                                                Boolean bool = (Boolean) r42.get(r82);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r82));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r83 = z9; r83 < size; r83++) {
                                                r22.remove((Runnable) arrayList4.get(r83));
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.pe(i19));
                                            int size2 = arrayList5.size();
                                            for (?? r23 = z9; r23 < size2; r23++) {
                                                r42.remove(((Integer) arrayList5.get(r23)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) a8Var2.d).length() == 4) {
                                ec0Var2.n(z9);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        View view = new View(context);
        this.F = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        x5Var.addView(frameLayout2, c8.ha.e(-1, -1, 51));
        di.b4 b4Var = new di.b4(context, 16);
        this.e = b4Var;
        b4Var.setClipChildren(false);
        frameLayout2.addView(b4Var, c8.ha.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        b4Var.addView(frameLayout3, c8.ha.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 15.0f);
        g10.setTypeface(org.telegram.messenger.g0.o());
        g10.setTextColor(-1);
        g10.setText(M0);
        TextView i13 = org.telegram.ui.Cells.f1.i(frameLayout3, g10, c8.ha.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = i13;
        i13.setTextSize(1, 14.0f);
        i13.setTextColor(-1);
        i13.setText((CharSequence) null);
        frameLayout3.addView(i13, c8.ha.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        while (true) {
            if (i10 >= 12) {
                break;
            }
            bc0 bc0Var = new bc0(context);
            c8.ka.b(bc0Var, 0.15f, 1.5f);
            bc0Var.setTag(Integer.valueOf(i10));
            int[] iArr = i0;
            if (i10 == 11) {
                bc0Var.setBackground(f(bc0Var));
                int L = org.telegram.messenger.g0.L(30.0f);
                bc0Var.setForeground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, 654311423, 654311423));
                bc0Var.setImage(R.drawable.filled_clear);
                bc0Var.setOnLongClickListener(new d00(this, i11));
                bc0Var.setContentDescription(org.telegram.messenger.id.M0(2131754920, null));
                bc0Var.setNextFocusForwardId(R.id.passcode_btn_0);
                bc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
            } else if (i10 == 10) {
                this.n = bc0Var;
                bc0Var.setBackground(f(bc0Var));
                int L2 = org.telegram.messenger.g0.L(30.0f);
                bc0Var.setForeground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                bc0Var.setContentDescription(org.telegram.messenger.id.M0(2131754881, null));
                bc0Var.setImage(R.drawable.fingerprint);
                bc0Var.setNextFocusForwardId(R.id.passcode_btn_1);
                bc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_1);
            } else {
                bc0Var.setBackground(f(bc0Var));
                int L3 = org.telegram.messenger.g0.L(30.0f);
                bc0Var.setForeground(org.telegram.ui.ActionBar.m6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                bc0Var.setContentDescription(i10 + "");
                bc0Var.setNum(i10);
                if (i10 == 0) {
                    bc0Var.setNextFocusForwardId(R.id.passcode_btn_backspace);
                    bc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_backspace);
                } else if (i10 != 9) {
                    int i14 = iArr[i10 + 1];
                    bc0Var.setNextFocusForwardId(i14);
                    bc0Var.setAccessibilityTraversalBefore(i14);
                } else if (g()) {
                    bc0Var.setNextFocusForwardId(R.id.passcode_btn_fingerprint);
                    bc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_fingerprint);
                } else {
                    bc0Var.setNextFocusForwardId(R.id.passcode_btn_0);
                    bc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
                }
            }
            bc0Var.setId(iArr[i10]);
            final int i15 = 2;
            bc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vb0
                public final /* synthetic */ ec0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v27, types: [java.util.LinkedList] */
                /* JADX WARN: Type inference failed for: r2v29 */
                /* JADX WARN: Type inference failed for: r2v30, types: [int] */
                /* JADX WARN: Type inference failed for: r2v33 */
                /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r4v23, types: [java.util.LinkedList] */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List] */
                /* JADX WARN: Type inference failed for: r8v13 */
                /* JADX WARN: Type inference failed for: r8v14 */
                /* JADX WARN: Type inference failed for: r8v4 */
                /* JADX WARN: Type inference failed for: r8v5, types: [int] */
                /* JADX WARN: Type inference failed for: r8v6 */
                /* JADX WARN: Type inference failed for: r8v7, types: [int] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ec0 ec0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    boolean z9;
                    boolean z10;
                    LinkedList linkedList3;
                    int i132;
                    int i142;
                    ec0 ec0Var2;
                    boolean z11;
                    boolean z12;
                    int i152 = i15;
                    ec0 ec0Var3 = this.b;
                    switch (i152) {
                        case 0:
                            ec0Var3.n(false);
                            break;
                        case 1:
                            ec0Var3.c();
                            break;
                        default:
                            LinkedList linkedList4 = ec0Var3.V;
                            LinkedList linkedList5 = ec0Var3.U;
                            fi.a8 a8Var2 = ec0Var3.s;
                            if (ec0Var3.f0 && !ec0Var3.P) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("0");
                                        z10 = z9;
                                        break;
                                    case 1:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("1");
                                        z10 = z9;
                                        break;
                                    case 2:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("2");
                                        z10 = z9;
                                        break;
                                    case 3:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("3");
                                        z10 = z9;
                                        break;
                                    case 4:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("4");
                                        z10 = z9;
                                        break;
                                    case 5:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("5");
                                        z10 = z9;
                                        break;
                                    case 6:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("6");
                                        z10 = z9;
                                        break;
                                    case 7:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("7");
                                        z10 = z9;
                                        break;
                                    case 8:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("8");
                                        z10 = z9;
                                        break;
                                    case 9:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        a8Var2.b("9");
                                        z10 = z9;
                                        break;
                                    case 10:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        ec0Var.c();
                                        z10 = z9;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) a8Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        z9 = false;
                                        ArrayList arrayList2 = (ArrayList) a8Var2.b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) a8Var2.d;
                                        if (sb2.length() == 0) {
                                            ec0Var = ec0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = z9;
                                            break;
                                        } else {
                                            try {
                                                a8Var2.performHapticFeedback(3);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int i16 = 1;
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i17 = length;
                                            while (i17 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i17);
                                                ec0 ec0Var4 = ec0Var3;
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i132 = i16;
                                                    float[] fArr = new float[i132];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                    float[] fArr2 = new float[i132];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                    float[] fArr3 = new float[i132];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                    float[] fArr4 = new float[i132];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                    float[] fArr5 = new float[i132];
                                                    fArr5[0] = a8Var2.c(i17);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i132 = i16;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i17);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr6 = new float[i132];
                                                    fArr6[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                    float[] fArr7 = new float[i132];
                                                    fArr7[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                    float[] fArr8 = new float[i132];
                                                    fArr8[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                    float[] fArr9 = new float[i132];
                                                    fArr9[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                    float c10 = a8Var2.c(i17);
                                                    i142 = i17;
                                                    float[] fArr10 = new float[i132];
                                                    fArr10[0] = c10;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                                } else {
                                                    i142 = i17;
                                                }
                                                i17 = i142 + 1;
                                                linkedList5 = linkedList3;
                                                ec0Var3 = ec0Var4;
                                                i16 = 1;
                                            }
                                            ec0Var = ec0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, a8Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, a8Var2.c(i18)));
                                            }
                                            pe peVar = (pe) a8Var2.f;
                                            if (peVar != null) {
                                                org.telegram.messenger.g0.r(peVar);
                                                a8Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) a8Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            a8Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) a8Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) a8Var2.e).addListener(new zb0(a8Var2, 1));
                                            ((AnimatorSet) a8Var2.e).start();
                                            ec0.a((ec0) a8Var2.h);
                                            z10 = true;
                                            break;
                                        }
                                    default:
                                        ec0Var = ec0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z9 = false;
                                        z10 = z9;
                                        break;
                                }
                                int i19 = 11;
                                if (intValue == 11) {
                                    ec0Var2 = ec0Var;
                                } else {
                                    ec0Var2 = ec0Var;
                                    Drawable drawable = ec0Var2.a;
                                    if (drawable instanceof qa0) {
                                        qa0 qa0Var = (qa0) drawable;
                                        qa0Var.D = null;
                                        qa0Var.y();
                                        float f10 = qa0Var.h;
                                        if (intValue == 10) {
                                            if (z10) {
                                                qa0Var.x();
                                                z12 = true;
                                            } else {
                                                z12 = z9;
                                            }
                                            z11 = z9;
                                        } else {
                                            z11 = true;
                                            qa0Var.w(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f10 >= 1.0f) {
                                                ec0Var2.b(qa0Var);
                                            } else {
                                                bi.u7 u7Var = new bi.u7(ec0Var2, z11, qa0Var, 22);
                                                ?? r22 = linkedList2;
                                                r22.offer(u7Var);
                                                ?? r42 = linkedList;
                                                r42.offer(Boolean.valueOf(z11));
                                                ?? arrayList4 = new ArrayList();
                                                ?? arrayList5 = new ArrayList();
                                                for (?? r82 = z9; r82 < r22.size(); r82++) {
                                                    Runnable runnable = (Runnable) r22.get(r82);
                                                    Boolean bool = (Boolean) r42.get(r82);
                                                    if (bool != null && bool.booleanValue() != z11) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf((int) r82));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                for (?? r83 = z9; r83 < size; r83++) {
                                                    r22.remove((Runnable) arrayList4.get(r83));
                                                }
                                                Collections.sort(arrayList5, new org.telegram.ui.pe(i19));
                                                int size2 = arrayList5.size();
                                                for (?? r23 = z9; r23 < size2; r23++) {
                                                    r42.remove(((Integer) arrayList5.get(r23)).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) a8Var2.d).length() == 4) {
                                    ec0Var2.n(z9);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.f.add(bc0Var);
            i10++;
        }
        for (i7 = 11; i7 >= 0; i7--) {
            this.e.addView((FrameLayout) this.f.get(i7), c8.ha.e(60, 60, 51));
        }
        d();
    }

    public static void a(ec0 ec0Var) {
        FrameLayout frameLayout = ec0Var.b;
        fi.a8 a8Var = ec0Var.s;
        boolean z9 = a8Var == null || ((StringBuilder) a8Var.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.messenger.camera.q.l(frameLayout.animate().alpha(z9 ? 0.0f : 1.0f).scaleX(z9 ? 0.8f : 1.0f).scaleY(z9 ? 0.8f : 1.0f), wq.h, 320L);
        }
    }

    public final void b(qa0 qa0Var) {
        r1.g gVar = this.T;
        if (gVar != null && gVar.f) {
            gVar.d();
        }
        r1.f fVar = new r1.f(0.0f);
        qa0Var.D = new ax(fVar, 9);
        qa0Var.y();
        r1.g gVar2 = new r1.g(fVar);
        gVar2.m = org.telegram.ui.Cells.f1.o(100.0f, 300.0f, 1.0f);
        this.T = gVar2;
        gVar2.a(new hi.y3(4, this, qa0Var));
        this.T.b(new d7(qa0Var, 5));
        this.T.h();
    }

    public final void c() {
        Activity W;
        gc0 gc0Var;
        if (this.P || (W = org.telegram.messenger.g0.W(getContext())) == null || this.n.getVisibility() != 0 || org.telegram.messenger.t0.x) {
            return;
        }
        int i7 = 1;
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            ArrayList arrayList = launchActivity.z0;
            if (!arrayList.isEmpty() || (gc0Var = launchActivity.y0) == null) {
                if (jg.g.i(1, arrayList) != this) {
                    return;
                }
            } else if (this != gc0Var.b) {
                return;
            }
        }
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(getContext(), 0)).d(15) == 0 && org.telegram.messenger.as.h() && !org.telegram.messenger.as.a()) {
                cb.c cVar = new cb.c(LaunchActivity.G1, f0.d.e(getContext()), new hi.n(this, i7));
                m6.n nVar = new m6.n(1);
                nVar.b = org.telegram.messenger.id.M0(2131743850, null);
                nVar.d = org.telegram.messenger.id.M0(2131743792, null);
                nVar.a = 15;
                cVar.l(nVar.b(), null);
                o(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        boolean g10 = g();
        int i7 = g10 ? 0 : 8;
        bc0 bc0Var = this.n;
        bc0Var.setVisibility(i7);
        if (org.telegram.messenger.iz.r == 1) {
            this.E.setVisibility(bc0Var.getVisibility());
        }
        this.c.setText(org.telegram.messenger.id.M0(org.telegram.messenger.iz.r == 1 ? 2131751116 : g10 ? 2131751117 : 2131751118, null));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.Q1) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && org.telegram.messenger.iz.x) {
                c();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.o0 || objArr[0] == this) {
            return;
        }
        setVisibility(8);
        j();
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > org.telegram.messenger.iz.u) {
            long j3 = org.telegram.messenger.iz.t - (elapsedRealtime - org.telegram.messenger.iz.u);
            org.telegram.messenger.iz.t = j3;
            if (j3 < 0) {
                org.telegram.messenger.iz.t = 0L;
            }
        }
        org.telegram.messenger.iz.u = elapsedRealtime;
        org.telegram.messenger.iz.y();
        long j10 = org.telegram.messenger.iz.t;
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        dt dtVar = this.c0;
        TextView textView = this.y;
        if (j10 <= 0) {
            org.telegram.messenger.g0.r(dtVar);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                o(true);
                if (org.telegram.messenger.iz.r == 1) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
        if (max != this.d0) {
            textView.setText(org.telegram.messenger.id.a0(null, null, 2131744036, org.telegram.messenger.id.G(max, "Seconds", new Object[0])));
            this.d0 = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            o(false);
            org.telegram.messenger.g0.v1(editTextBoldCursor);
        }
        org.telegram.messenger.g0.r(dtVar);
        org.telegram.messenger.g0.i3(dtVar, 100L);
    }

    public final dc0 f(bc0 bc0Var) {
        gh.e eVar = new gh.e(null);
        eVar.e = new j2(27);
        if (Build.VERSION.SDK_INT < 29) {
            eVar.f(1308622847, 1308622847);
            eVar.e(452984831, 452984831);
            float N = org.telegram.messenger.g0.N(1.0f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f = N;
            eVar.h = N2;
        }
        fh.g c10 = this.I.c(bc0Var, eVar, true);
        c10.r(org.telegram.messenger.g0.L(30.0f));
        return new dc0(c10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        boolean z9;
        boolean z10;
        FingerprintManager fingerprintManager;
        FingerprintManager fingerprintManager2;
        if (org.telegram.messenger.g0.W(getContext()) != null && org.telegram.messenger.iz.D) {
            try {
                Context context = org.telegram.messenger.t0.b;
                try {
                    fingerprintManager2 = (FingerprintManager) context.getSystemService("fingerprint");
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (fingerprintManager2 != null) {
                    z9 = fingerprintManager2.isHardwareDetected();
                    if (z9) {
                        try {
                            fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        if (fingerprintManager != null) {
                            z10 = fingerprintManager.hasEnrolledFingerprints();
                            if (z10 && org.telegram.messenger.as.h()) {
                                if (org.telegram.messenger.as.a()) {
                                    return true;
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                            if (org.telegram.messenger.as.a()) {
                            }
                        }
                    }
                }
                z9 = false;
                if (z9) {
                }
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        return false;
    }

    public final boolean i() {
        fi.q3 q3Var = this.e0;
        if (q3Var == null || !q3Var.c()) {
            return true;
        }
        org.telegram.messenger.g0.v1(this.r);
        return false;
    }

    public final void k() {
        org.telegram.messenger.g0.r(this.c0);
    }

    public final void l() {
        if (this.P) {
            return;
        }
        e();
        if (this.y.getVisibility() != 0) {
            if (org.telegram.messenger.iz.r == 1) {
                EditTextBoldCursor editTextBoldCursor = this.r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                }
                org.telegram.messenger.g0.i3(new tb0(this, 0), 200L);
            }
            c();
        }
    }

    public final void m(boolean z9, int i7, int i10, org.telegram.ui.f10 f10Var) {
        View currentFocus;
        boolean z10;
        int i11;
        int i12;
        if (getVisibility() != 0) {
            this.P = false;
        }
        d();
        e();
        Activity W = org.telegram.messenger.g0.W(getContext());
        int i13 = org.telegram.messenger.iz.r;
        TextView textView = this.y;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i13 == 1) {
            if (!z9 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
            }
        } else if (W != null && (currentFocus = W.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            org.telegram.messenger.g0.v1(W.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.a = null;
        boolean z11 = org.telegram.ui.ActionBar.m6.s0() instanceof qa0;
        bi.x5 x5Var = this.w;
        if (z11) {
            z10 = !org.telegram.ui.ActionBar.m6.I.q();
            this.a = org.telegram.ui.ActionBar.m6.s0();
            x5Var.setBackgroundColor(-1090519040);
        } else {
            if (!org.telegram.ui.ActionBar.m6.W || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.m6.K0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.m6.K0())) {
                if (!"d".equals(org.telegram.ui.ActionBar.m6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.m6.K0();
                    if (!org.telegram.ui.ActionBar.m6.j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.m6.s0();
                        this.a = s02;
                        if (s02 instanceof j9) {
                            x5Var.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            x5Var.setBackgroundColor(-1090519040);
                        } else {
                            x5Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                x5Var.setBackgroundColor(-11436898);
            } else {
                org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.m6.I.i0;
                j9 j9Var = (e6Var == null || (i11 = e6Var.d) == 0 || (i12 = e6Var.e) == 0) ? null : new j9(j9.d(e6Var.h), new int[]{i11, i12});
                this.a = j9Var;
                if (j9Var == null) {
                    this.a = org.telegram.ui.ActionBar.m6.s0();
                }
                if (this.a instanceof j9) {
                    x5Var.setBackgroundColor(570425344);
                } else {
                    x5Var.setBackgroundColor(-1090519040);
                }
            }
            z10 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof qa0) {
            qa0 qa0Var = (qa0) drawable;
            int[] iArr = qa0Var.a;
            if (z10) {
                int[] iArr2 = new int[iArr.length];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr2[i14] = org.telegram.ui.ActionBar.m6.b(0.14f, 0.0f, iArr[i14]);
                }
                iArr = iArr2;
            }
            this.a = new qa0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (qa0Var.u == null || qa0Var.q >= 0) {
                x5Var.setBackgroundColor(570425344);
            } else {
                x5Var.setBackgroundColor(2130706432);
            }
            ((qa0) this.a).q(x5Var);
        }
        this.x.setText(org.telegram.messenger.id.M0(2131754232, null));
        int i15 = org.telegram.messenger.iz.r;
        ImageView imageView = this.E;
        ImageView imageView2 = this.D;
        di.b4 b4Var = this.e;
        fi.a8 a8Var = this.s;
        if (i15 == 0) {
            if (textView.getVisibility() != 0) {
                b4Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            a8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i15 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(org.telegram.messenger.qs.N1);
            b4Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            a8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        fi.a8.a(a8Var, false);
        if (z9) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new yb0(this, i7, i10, f10Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.a0 = 1.0f;
            h(1.0f);
            ch0 ch0Var = this.M;
            ch0Var.setScaleX(1.0f);
            ch0Var.setScaleY(1.0f);
            ch0Var.i();
            ch0Var.getAnimatedDrawable().N(38, false, false);
            if (f10Var != null) {
                f10Var.run();
            }
        }
        setOnTouchListener(new ei.b(19));
    }

    public final void n(boolean z9) {
        if (this.P || getVisibility() != 0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (!z9) {
            if (org.telegram.messenger.iz.t > 0) {
                return;
            }
            int i7 = org.telegram.messenger.iz.r;
            fi.a8 a8Var = this.s;
            String sb2 = i7 == 0 ? ((StringBuilder) a8Var.d).toString() : i7 == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb2.length();
            FrameLayout frameLayout = this.b;
            org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.s;
            if (length == 0) {
                p2Var.a();
                int i10 = -this.b0;
                this.b0 = i10;
                org.telegram.messenger.g0.G3(i10, frameLayout, null);
                return;
            }
            if (!org.telegram.messenger.iz.g(sb2)) {
                org.telegram.messenger.iz.r();
                if (org.telegram.messenger.iz.t > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                fi.a8.a(a8Var, true);
                p2Var.a();
                int i11 = -this.b0;
                this.b0 = i11;
                org.telegram.messenger.g0.G3(i11, frameLayout, null);
                Drawable drawable = this.a;
                if (drawable instanceof qa0) {
                    qa0 qa0Var = (qa0) drawable;
                    LinkedList linkedList = this.U;
                    linkedList.clear();
                    LinkedList linkedList2 = this.V;
                    linkedList2.clear();
                    r1.g gVar = this.T;
                    if (gVar == null || !gVar.f) {
                        qa0Var.m(true);
                        return;
                    } else {
                        linkedList.offer(new pa0(qa0Var, 1));
                        linkedList2.offer(Boolean.FALSE);
                        return;
                    }
                }
                return;
            }
        }
        this.P = true;
        k();
        org.telegram.messenger.iz.v = 0;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        if (org.telegram.messenger.as.h() && org.telegram.messenger.as.a()) {
            try {
                org.telegram.messenger.as.e().deleteEntry("tmessages_passcode");
            } catch (KeyStoreException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.as.g = null;
            org.telegram.messenger.as.b(false);
        }
        org.telegram.messenger.iz.x = false;
        org.telegram.messenger.iz.y();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.n0, new Object[0]);
        setOnTouchListener(null);
        cc0 cc0Var = this.O;
        if (cc0Var != null) {
            cc0Var.p(this);
        }
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Q = null;
        }
        AnimatorSet animatorSet2 = this.R;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.R = null;
        }
        ch0 ch0Var = this.M;
        ch0Var.getAnimatedDrawable().P(71);
        ch0Var.getAnimatedDrawable().N(37, false, false);
        ch0Var.d();
        org.telegram.messenger.g0.h3(new tb0(this, 1));
    }

    public final void o(boolean z9) {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f0 = z9;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z9 ? 1.0f : 0.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new ub0(this, 0));
        this.g0.addListener(new s9(16, this, z9));
        this.g0.setInterpolator(wq.h);
        this.g0.setDuration(320L);
        this.g0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.Q1);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.o0);
        if (this.e0 == null && (getParent() instanceof View)) {
            this.e0 = new fi.q3((View) getParent(), false, new r2(this, 8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.P = true;
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.R;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.S.cancel();
            this.S = null;
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.Q1);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.o0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.q1(rootView);
        Rect rect = this.N;
        getWindowVisibleDisplayFrame(rect);
        this.G = height - (rect.bottom - rect.top);
        if (org.telegram.messenger.iz.r == 1 && (org.telegram.messenger.g0.Q1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            int intValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((intValue + layoutParams.height) - (this.G / 2)) - org.telegram.messenger.g0.m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z9, i7, i10, i11, i12);
        TextView textView = this.x;
        int[] iArr = this.h0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        ch0 ch0Var = this.M;
        if (Q1 || getContext().getResources().getConfiguration().orientation != 2) {
            int L = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.L = L;
            ch0Var.setTranslationY(L);
        } else {
            int L2 = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.L = L2;
            ch0Var.setTranslationY(L2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = org.telegram.messenger.g0.q.y;
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int L3 = org.telegram.messenger.g0.L(60.0f);
        boolean z9 = !org.telegram.messenger.g0.Q1() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.F;
        if (view != null) {
            view.setVisibility(org.telegram.messenger.iz.r == 1 ? 0 : 8);
        }
        ch0 ch0Var = this.M;
        di.b4 b4Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z9) {
            if (org.telegram.messenger.iz.r == 0) {
                f10 = 2.0f;
                f11 = size / 2.0f;
            } else {
                f10 = 2.0f;
                f11 = size;
            }
            ch0Var.setTranslationX((f11 / f10) - org.telegram.messenger.g0.L(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = org.telegram.messenger.iz.r == 0 ? size / 2 : size;
            layoutParams.height = org.telegram.messenger.g0.L(180.0f);
            layoutParams.topMargin = org.telegram.messenger.camera.q.y(140.0f, i13, 2) + (org.telegram.messenger.iz.r == 0 ? org.telegram.messenger.g0.L(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i13;
            int i14 = size / 2;
            layoutParams2.leftMargin = i14;
            layoutParams2.topMargin = org.telegram.messenger.g0.m;
            layoutParams2.width = i14;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) b4Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            b4Var.setLayoutParams(layoutParams3);
            i12 = 0;
        } else {
            ch0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.g0.L(29.0f));
            int i15 = org.telegram.messenger.g0.m;
            if (org.telegram.messenger.g0.Q1()) {
                if (size > org.telegram.messenger.g0.L(498.0f)) {
                    i11 = org.telegram.messenger.camera.q.y(498.0f, size, 2);
                    size = org.telegram.messenger.g0.L(498.0f);
                } else {
                    i11 = 0;
                }
                if (i13 > org.telegram.messenger.g0.L(528.0f)) {
                    i15 = org.telegram.messenger.camera.q.y(528.0f, i13, 2);
                    i13 = org.telegram.messenger.g0.L(528.0f);
                }
            } else {
                i11 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams4.height = (i13 / 3) + (org.telegram.messenger.iz.r == 0 ? org.telegram.messenger.g0.L(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = i15;
            layoutParams4.leftMargin = i11;
            frameLayout2.setTag(Integer.valueOf(i15));
            frameLayout2.setLayoutParams(layoutParams4);
            int i16 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) b4Var.getLayoutParams();
            i12 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            b4Var.setLayoutParams(layoutParams5);
            int i17 = i13 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i11;
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams6.topMargin = (i13 - i17) / 2;
            } else {
                layoutParams6.topMargin = i16;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        int L4 = org.telegram.messenger.g0.L(z9 ? 52.0f : 82.0f);
        int i18 = i12;
        while (i18 < 12) {
            int i19 = 10;
            if (i18 != 0) {
                i19 = i18 == 10 ? 11 : i18 == 11 ? 9 : i18 - 1;
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f.get(i18);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i19 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i19 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
            i18++;
        }
        super.onMeasure(i7, i10);
    }

    public void setDelegate(cc0 cc0Var) {
        this.O = cc0Var;
    }

    public void h(float f10) {
    }

    public void j() {
    }
}
