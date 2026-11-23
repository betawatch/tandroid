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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class oc0 extends FrameLayout implements org.telegram.messenger.fs {
    public static final int[] j0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public int H;
    public final ui.b I;
    public final dh.c J;
    public Bitmap K;
    public Canvas L;
    public int M;
    public final qh0 N;
    public final Rect O;
    public mc0 P;
    public boolean Q;
    public AnimatorSet R;
    public AnimatorSet S;
    public ValueAnimator T;
    public r1.g U;
    public final LinkedList V;
    public final LinkedList W;
    public Drawable a;
    public final ArrayList a0;
    public final FrameLayout b;
    public float b0;
    public final TextView c;
    public int c0;
    public final FrameLayout d;
    public final rc d0;
    public final bi.v2 e;
    public int e0;
    public final ArrayList f;
    public hi.x3 f0;
    public boolean g0;
    public final FrameLayout h;
    public ValueAnimator h0;
    public final int[] i0;
    public final lc0 n;
    public final EditTextBoldCursor r;
    public final hi.s8 s;
    public final ai.h0 w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(Context context) {
        super(context);
        int i7;
        String N0 = org.telegram.messenger.gd.N0(2131743603, null);
        final int i10 = 0;
        this.H = 0;
        ui.b bVar = new ui.b();
        this.I = bVar;
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.J = cVar;
        xe.b bVar2 = new xe.b();
        this.O = new Rect();
        this.V = new LinkedList();
        this.W = new LinkedList();
        this.a0 = new ArrayList();
        this.c0 = -12;
        this.d0 = new rc(this, 13);
        final int i11 = 1;
        this.g0 = true;
        this.i0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ai.h0 h0Var = new ai.h0(this, context);
        this.w = h0Var;
        h0Var.setWillNotDraw(false);
        addView(h0Var, c8.na.c(-1.0f, -1));
        cVar.h = new jh.k(h0Var);
        cVar.i = h0Var;
        cVar.g = bVar2;
        qh0 qh0Var = new qh0(context);
        this.N = qh0Var;
        qh0Var.f(R.raw.passcode_lock, 58, 58, null);
        qh0Var.setAutoRepeat(false);
        addView(qh0Var, c8.na.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        h0Var.addView(frameLayout, c8.na.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setAlpha(0.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, c8.na.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.y = m10;
        m10.setTextColor(-1);
        m10.setTextSize(1, 15.0f);
        m10.setGravity(1);
        m10.setVisibility(4);
        h0Var.addView(m10, c8.na.e(-2, -2, 17));
        hi.s8 s8Var = new hi.s8(this, context);
        this.s = s8Var;
        frameLayout.addView(s8Var, c8.na.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
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
        frameLayout.addView(editTextBoldCursor, c8.na.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new g(this, 5));
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 24));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new oi.z0(1));
        ImageView imageView = new ImageView(context);
        this.E = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, c8.na.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fc0
            public final /* synthetic */ oc0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4, types: [int] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r8v13 */
            /* JADX WARN: Type inference failed for: r8v14 */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5, types: [int] */
            /* JADX WARN: Type inference failed for: r8v6 */
            /* JADX WARN: Type inference failed for: r8v7, types: [int] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oc0 oc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i12;
                int i13;
                oc0 oc0Var2;
                boolean z12;
                boolean z13;
                int i14 = i10;
                oc0 oc0Var3 = this.b;
                switch (i14) {
                    case 0:
                        oc0Var3.n(false);
                        break;
                    case 1:
                        oc0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = oc0Var3.W;
                        LinkedList linkedList5 = oc0Var3.V;
                        hi.s8 s8Var2 = oc0Var3.s;
                        if (oc0Var3.g0 && !oc0Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    oc0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) s8Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) s8Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) s8Var2.d;
                                    if (sb2.length() == 0) {
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            s8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i15 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i16 = length;
                                        while (i16 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i16);
                                            oc0 oc0Var4 = oc0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i12 = i15;
                                                float[] fArr = new float[i12];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i12];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i12];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i12];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                float[] fArr5 = new float[i12];
                                                fArr5[0] = s8Var2.c(i16);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i12 = i15;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i16);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i12];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                float[] fArr7 = new float[i12];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                float[] fArr8 = new float[i12];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                float[] fArr9 = new float[i12];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                float c10 = s8Var2.c(i16);
                                                i13 = i16;
                                                float[] fArr10 = new float[i12];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i13 = i16;
                                            }
                                            i16 = i13 + 1;
                                            linkedList5 = linkedList3;
                                            oc0Var3 = oc0Var4;
                                            i15 = 1;
                                        }
                                        oc0Var = oc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), (Property<TextView, Float>) property5, s8Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), (Property<TextView, Float>) property5, s8Var2.c(i17)));
                                        }
                                        xe xeVar = (xe) s8Var2.f;
                                        if (xeVar != null) {
                                            org.telegram.messenger.g0.r(xeVar);
                                            s8Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) s8Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        s8Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) s8Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) s8Var2.e).addListener(new jc0(s8Var2, 1));
                                        ((AnimatorSet) s8Var2.e).start();
                                        oc0.a((oc0) s8Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (intValue == 11) {
                                oc0Var2 = oc0Var;
                            } else {
                                oc0Var2 = oc0Var;
                                Drawable drawable = oc0Var2.a;
                                if (drawable instanceof za0) {
                                    za0 za0Var = (za0) drawable;
                                    za0Var.D = null;
                                    za0Var.y();
                                    float f10 = za0Var.h;
                                    int i18 = 10;
                                    if (intValue == 10) {
                                        if (z11) {
                                            za0Var.x();
                                            z13 = true;
                                        } else {
                                            z13 = z10;
                                        }
                                        z12 = z10;
                                    } else {
                                        z12 = true;
                                        za0Var.w(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f10 >= 1.0f) {
                                            oc0Var2.b(za0Var);
                                        } else {
                                            ?? r42 = linkedList2;
                                            r42.offer(new di.p6(oc0Var2, z12, za0Var, 22));
                                            ?? r22 = linkedList;
                                            r22.offer(Boolean.valueOf(z12));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r82 = z10; r82 < r42.size(); r82++) {
                                                Runnable runnable = (Runnable) r42.get(r82);
                                                Boolean bool = (Boolean) r22.get(r82);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r82));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r83 = z10; r83 < size; r83++) {
                                                r42.remove((Runnable) arrayList4.get(r83));
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.pe(i18));
                                            int size2 = arrayList5.size();
                                            for (?? r32 = z10; r32 < size2; r32++) {
                                                r22.remove(((Integer) arrayList5.get(r32)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) s8Var2.d).length() == 4) {
                                oc0Var2.n(z10);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.F = imageView2;
        imageView2.setImageResource(R.drawable.fingerprint);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, c8.na.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(org.telegram.messenger.gd.N0(2131754881, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fc0
            public final /* synthetic */ oc0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4, types: [int] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r8v13 */
            /* JADX WARN: Type inference failed for: r8v14 */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5, types: [int] */
            /* JADX WARN: Type inference failed for: r8v6 */
            /* JADX WARN: Type inference failed for: r8v7, types: [int] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oc0 oc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i12;
                int i13;
                oc0 oc0Var2;
                boolean z12;
                boolean z13;
                int i14 = i11;
                oc0 oc0Var3 = this.b;
                switch (i14) {
                    case 0:
                        oc0Var3.n(false);
                        break;
                    case 1:
                        oc0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = oc0Var3.W;
                        LinkedList linkedList5 = oc0Var3.V;
                        hi.s8 s8Var2 = oc0Var3.s;
                        if (oc0Var3.g0 && !oc0Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    s8Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    oc0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) s8Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) s8Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) s8Var2.d;
                                    if (sb2.length() == 0) {
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            s8Var2.performHapticFeedback(3);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i15 = 1;
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i16 = length;
                                        while (i16 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i16);
                                            oc0 oc0Var4 = oc0Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i12 = i15;
                                                float[] fArr = new float[i12];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i12];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i12];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i12];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                float[] fArr5 = new float[i12];
                                                fArr5[0] = s8Var2.c(i16);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i12 = i15;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i16);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i12];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                float[] fArr7 = new float[i12];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                float[] fArr8 = new float[i12];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                float[] fArr9 = new float[i12];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                float c10 = s8Var2.c(i16);
                                                i13 = i16;
                                                float[] fArr10 = new float[i12];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i13 = i16;
                                            }
                                            i16 = i13 + 1;
                                            linkedList5 = linkedList3;
                                            oc0Var3 = oc0Var4;
                                            i15 = 1;
                                        }
                                        oc0Var = oc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), (Property<TextView, Float>) property5, s8Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), (Property<TextView, Float>) property5, s8Var2.c(i17)));
                                        }
                                        xe xeVar = (xe) s8Var2.f;
                                        if (xeVar != null) {
                                            org.telegram.messenger.g0.r(xeVar);
                                            s8Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) s8Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        s8Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) s8Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) s8Var2.e).addListener(new jc0(s8Var2, 1));
                                        ((AnimatorSet) s8Var2.e).start();
                                        oc0.a((oc0) s8Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    oc0Var = oc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (intValue == 11) {
                                oc0Var2 = oc0Var;
                            } else {
                                oc0Var2 = oc0Var;
                                Drawable drawable = oc0Var2.a;
                                if (drawable instanceof za0) {
                                    za0 za0Var = (za0) drawable;
                                    za0Var.D = null;
                                    za0Var.y();
                                    float f10 = za0Var.h;
                                    int i18 = 10;
                                    if (intValue == 10) {
                                        if (z11) {
                                            za0Var.x();
                                            z13 = true;
                                        } else {
                                            z13 = z10;
                                        }
                                        z12 = z10;
                                    } else {
                                        z12 = true;
                                        za0Var.w(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f10 >= 1.0f) {
                                            oc0Var2.b(za0Var);
                                        } else {
                                            ?? r42 = linkedList2;
                                            r42.offer(new di.p6(oc0Var2, z12, za0Var, 22));
                                            ?? r22 = linkedList;
                                            r22.offer(Boolean.valueOf(z12));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r82 = z10; r82 < r42.size(); r82++) {
                                                Runnable runnable = (Runnable) r42.get(r82);
                                                Boolean bool = (Boolean) r22.get(r82);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r82));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r83 = z10; r83 < size; r83++) {
                                                r42.remove((Runnable) arrayList4.get(r83));
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.pe(i18));
                                            int size2 = arrayList5.size();
                                            for (?? r32 = z10; r32 < size2; r32++) {
                                                r22.remove(((Integer) arrayList5.get(r32)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) s8Var2.d).length() == 4) {
                                oc0Var2.n(z10);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        View view = new View(context);
        this.G = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        h0Var.addView(frameLayout2, c8.na.e(-1, -1, 51));
        bi.v2 v2Var = new bi.v2(context, 18);
        this.e = v2Var;
        v2Var.setClipChildren(false);
        frameLayout2.addView(v2Var, c8.na.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        v2Var.addView(frameLayout3, c8.na.e(-2, -2, 49));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        textView2.setText(N0);
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout3, textView2, c8.na.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = m11;
        m11.setTextSize(1, 14.0f);
        m11.setTextColor(-1);
        m11.setText((CharSequence) null);
        frameLayout3.addView(m11, c8.na.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        while (true) {
            if (i10 >= 12) {
                break;
            }
            lc0 lc0Var = new lc0(context);
            c8.sa.b(lc0Var, 0.15f, 1.5f);
            lc0Var.setTag(Integer.valueOf(i10));
            int[] iArr = j0;
            if (i10 == 11) {
                lc0Var.setBackground(f(lc0Var));
                int L = org.telegram.messenger.g0.L(30.0f);
                lc0Var.setForeground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, 654311423, 654311423));
                lc0Var.setImage(R.drawable.filled_clear);
                lc0Var.setOnLongClickListener(new o00(this, i11));
                lc0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754920, null));
                lc0Var.setNextFocusForwardId(R.id.passcode_btn_0);
                lc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
            } else if (i10 == 10) {
                this.n = lc0Var;
                lc0Var.setBackground(f(lc0Var));
                int L2 = org.telegram.messenger.g0.L(30.0f);
                lc0Var.setForeground(org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                lc0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754881, null));
                lc0Var.setImage(R.drawable.fingerprint);
                lc0Var.setNextFocusForwardId(R.id.passcode_btn_1);
                lc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_1);
            } else {
                lc0Var.setBackground(f(lc0Var));
                int L3 = org.telegram.messenger.g0.L(30.0f);
                lc0Var.setForeground(org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                lc0Var.setContentDescription(i10 + "");
                lc0Var.setNum(i10);
                if (i10 == 0) {
                    lc0Var.setNextFocusForwardId(R.id.passcode_btn_backspace);
                    lc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_backspace);
                } else if (i10 != 9) {
                    int i12 = iArr[i10 + 1];
                    lc0Var.setNextFocusForwardId(i12);
                    lc0Var.setAccessibilityTraversalBefore(i12);
                } else if (g()) {
                    lc0Var.setNextFocusForwardId(R.id.passcode_btn_fingerprint);
                    lc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_fingerprint);
                } else {
                    lc0Var.setNextFocusForwardId(R.id.passcode_btn_0);
                    lc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
                }
            }
            lc0Var.setId(iArr[i10]);
            final int i13 = 2;
            lc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fc0
                public final /* synthetic */ oc0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v30, types: [java.util.LinkedList] */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v4, types: [int] */
                /* JADX WARN: Type inference failed for: r3v6 */
                /* JADX WARN: Type inference failed for: r4v22, types: [java.util.LinkedList] */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List] */
                /* JADX WARN: Type inference failed for: r8v13 */
                /* JADX WARN: Type inference failed for: r8v14 */
                /* JADX WARN: Type inference failed for: r8v4 */
                /* JADX WARN: Type inference failed for: r8v5, types: [int] */
                /* JADX WARN: Type inference failed for: r8v6 */
                /* JADX WARN: Type inference failed for: r8v7, types: [int] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    oc0 oc0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    boolean z10;
                    boolean z11;
                    LinkedList linkedList3;
                    int i122;
                    int i132;
                    oc0 oc0Var2;
                    boolean z12;
                    boolean z13;
                    int i14 = i13;
                    oc0 oc0Var3 = this.b;
                    switch (i14) {
                        case 0:
                            oc0Var3.n(false);
                            break;
                        case 1:
                            oc0Var3.c();
                            break;
                        default:
                            LinkedList linkedList4 = oc0Var3.W;
                            LinkedList linkedList5 = oc0Var3.V;
                            hi.s8 s8Var2 = oc0Var3.s;
                            if (oc0Var3.g0 && !oc0Var3.Q) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("0");
                                        z11 = z10;
                                        break;
                                    case 1:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("1");
                                        z11 = z10;
                                        break;
                                    case 2:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("2");
                                        z11 = z10;
                                        break;
                                    case 3:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("3");
                                        z11 = z10;
                                        break;
                                    case 4:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("4");
                                        z11 = z10;
                                        break;
                                    case 5:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("5");
                                        z11 = z10;
                                        break;
                                    case 6:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("6");
                                        z11 = z10;
                                        break;
                                    case 7:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("7");
                                        z11 = z10;
                                        break;
                                    case 8:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("8");
                                        z11 = z10;
                                        break;
                                    case 9:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        s8Var2.b("9");
                                        z11 = z10;
                                        break;
                                    case 10:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        oc0Var.c();
                                        z11 = z10;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) s8Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        z10 = false;
                                        ArrayList arrayList2 = (ArrayList) s8Var2.b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) s8Var2.d;
                                        if (sb2.length() == 0) {
                                            oc0Var = oc0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z11 = z10;
                                            break;
                                        } else {
                                            try {
                                                s8Var2.performHapticFeedback(3);
                                            } catch (Exception e10) {
                                                org.telegram.messenger.a8.g(e10, true);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int i15 = 1;
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i16 = length;
                                            while (i16 < 4) {
                                                TextView textView22 = (TextView) arrayList2.get(i16);
                                                oc0 oc0Var4 = oc0Var3;
                                                if (textView22.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i122 = i15;
                                                    float[] fArr = new float[i122];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property4, fArr));
                                                    float[] fArr2 = new float[i122];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property3, fArr2));
                                                    float[] fArr3 = new float[i122];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property2, fArr3));
                                                    float[] fArr4 = new float[i122];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property, fArr4));
                                                    float[] fArr5 = new float[i122];
                                                    fArr5[0] = s8Var2.c(i16);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, (Property<TextView, Float>) property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i122 = i15;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i16);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr6 = new float[i122];
                                                    fArr6[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                    float[] fArr7 = new float[i122];
                                                    fArr7[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                    float[] fArr8 = new float[i122];
                                                    fArr8[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                    float[] fArr9 = new float[i122];
                                                    fArr9[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                    float c10 = s8Var2.c(i16);
                                                    i132 = i16;
                                                    float[] fArr10 = new float[i122];
                                                    fArr10[0] = c10;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                                } else {
                                                    i132 = i16;
                                                }
                                                i16 = i132 + 1;
                                                linkedList5 = linkedList3;
                                                oc0Var3 = oc0Var4;
                                                i15 = 1;
                                            }
                                            oc0Var = oc0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i17 = 0; i17 < length; i17++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), (Property<TextView, Float>) property5, s8Var2.c(i17)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), (Property<TextView, Float>) property5, s8Var2.c(i17)));
                                            }
                                            xe xeVar = (xe) s8Var2.f;
                                            if (xeVar != null) {
                                                org.telegram.messenger.g0.r(xeVar);
                                                s8Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) s8Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            s8Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) s8Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) s8Var2.e).addListener(new jc0(s8Var2, 1));
                                            ((AnimatorSet) s8Var2.e).start();
                                            oc0.a((oc0) s8Var2.h);
                                            z11 = true;
                                            break;
                                        }
                                    default:
                                        oc0Var = oc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z11 = z10;
                                        break;
                                }
                                if (intValue == 11) {
                                    oc0Var2 = oc0Var;
                                } else {
                                    oc0Var2 = oc0Var;
                                    Drawable drawable = oc0Var2.a;
                                    if (drawable instanceof za0) {
                                        za0 za0Var = (za0) drawable;
                                        za0Var.D = null;
                                        za0Var.y();
                                        float f10 = za0Var.h;
                                        int i18 = 10;
                                        if (intValue == 10) {
                                            if (z11) {
                                                za0Var.x();
                                                z13 = true;
                                            } else {
                                                z13 = z10;
                                            }
                                            z12 = z10;
                                        } else {
                                            z12 = true;
                                            za0Var.w(true);
                                            z13 = true;
                                        }
                                        if (z13) {
                                            if (f10 >= 1.0f) {
                                                oc0Var2.b(za0Var);
                                            } else {
                                                ?? r42 = linkedList2;
                                                r42.offer(new di.p6(oc0Var2, z12, za0Var, 22));
                                                ?? r22 = linkedList;
                                                r22.offer(Boolean.valueOf(z12));
                                                ?? arrayList4 = new ArrayList();
                                                ?? arrayList5 = new ArrayList();
                                                for (?? r82 = z10; r82 < r42.size(); r82++) {
                                                    Runnable runnable = (Runnable) r42.get(r82);
                                                    Boolean bool = (Boolean) r22.get(r82);
                                                    if (bool != null && bool.booleanValue() != z12) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf((int) r82));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                for (?? r83 = z10; r83 < size; r83++) {
                                                    r42.remove((Runnable) arrayList4.get(r83));
                                                }
                                                Collections.sort(arrayList5, new org.telegram.ui.pe(i18));
                                                int size2 = arrayList5.size();
                                                for (?? r32 = z10; r32 < size2; r32++) {
                                                    r22.remove(((Integer) arrayList5.get(r32)).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) s8Var2.d).length() == 4) {
                                    oc0Var2.n(z10);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.f.add(lc0Var);
            i10++;
        }
        for (i7 = 11; i7 >= 0; i7--) {
            this.e.addView((FrameLayout) this.f.get(i7), c8.na.e(60, 60, 51));
        }
        d();
    }

    public static void a(oc0 oc0Var) {
        FrameLayout frameLayout = oc0Var.b;
        hi.s8 s8Var = oc0Var.s;
        boolean z10 = s8Var == null || ((StringBuilder) s8Var.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.messenger.m10.o(frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f), kr.h, 320L);
        }
    }

    public final void b(za0 za0Var) {
        r1.g gVar = this.U;
        if (gVar != null && gVar.f) {
            gVar.d();
        }
        r1.f fVar = new r1.f(0.0f);
        za0Var.D = new hy(fVar, 8);
        za0Var.y();
        r1.g gVar2 = new r1.g(fVar);
        gVar2.m = org.telegram.ui.Cells.c0.p(100.0f, 300.0f, 1.0f);
        this.U = gVar2;
        int i7 = 5;
        gVar2.a(new bi.y0(i7, this, za0Var));
        this.U.b(new i7(za0Var, i7));
        this.U.h();
    }

    public final void c() {
        Activity W;
        qc0 qc0Var;
        if (this.Q || (W = org.telegram.messenger.g0.W(getContext())) == null || this.n.getVisibility() != 0 || org.telegram.messenger.t0.x) {
            return;
        }
        int i7 = 1;
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            ArrayList arrayList = launchActivity.A0;
            if (!arrayList.isEmpty() || (qc0Var = launchActivity.z0) == null) {
                if (i5.c.h(1, arrayList) != this) {
                    return;
                }
            } else if (this != qc0Var.b) {
                return;
            }
        }
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(getContext(), 0)).d(15) == 0 && org.telegram.messenger.vr.g() && !org.telegram.messenger.vr.a()) {
                d6.i iVar = new d6.i(LaunchActivity.H1, f0.d.e(getContext()), new ki.n(this, i7));
                m6.n nVar = new m6.n(1);
                nVar.b = org.telegram.messenger.gd.N0(2131743603, null);
                nVar.d = org.telegram.messenger.gd.N0(2131743545, null);
                nVar.a = 15;
                iVar.e(nVar.b(), null);
                o(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        boolean g10 = g();
        int i7 = g10 ? 0 : 8;
        lc0 lc0Var = this.n;
        lc0Var.setVisibility(i7);
        if (org.telegram.messenger.bz.r == 1) {
            this.F.setVisibility(lc0Var.getVisibility());
        }
        this.c.setText(org.telegram.messenger.gd.N0(org.telegram.messenger.bz.r == 1 ? 2131751104 : g10 ? 2131751105 : 2131751106, null));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.Q1) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && org.telegram.messenger.bz.x) {
                c();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.ks.o0 || objArr[0] == this) {
            return;
        }
        setVisibility(8);
        j();
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > org.telegram.messenger.bz.u) {
            long j3 = org.telegram.messenger.bz.t - (elapsedRealtime - org.telegram.messenger.bz.u);
            org.telegram.messenger.bz.t = j3;
            if (j3 < 0) {
                org.telegram.messenger.bz.t = 0L;
            }
        }
        org.telegram.messenger.bz.u = elapsedRealtime;
        org.telegram.messenger.bz.y();
        long j10 = org.telegram.messenger.bz.t;
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        rc rcVar = this.d0;
        TextView textView = this.y;
        if (j10 <= 0) {
            org.telegram.messenger.g0.r(rcVar);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                o(true);
                if (org.telegram.messenger.bz.r == 1) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
        if (max != this.e0) {
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131743791, org.telegram.messenger.gd.G(max, "Seconds", new Object[0])));
            this.e0 = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            o(false);
            org.telegram.messenger.g0.v1(editTextBoldCursor);
        }
        org.telegram.messenger.g0.r(rcVar);
        org.telegram.messenger.g0.h3(rcVar, 100L);
    }

    public final nc0 f(lc0 lc0Var) {
        gh.e eVar = new gh.e(null);
        eVar.e = new ub0(2);
        if (Build.VERSION.SDK_INT < 29) {
            eVar.f(1308622847, 1308622847);
            eVar.e(452984831, 452984831);
            float N = org.telegram.messenger.g0.N(1.0f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f = N;
            eVar.h = N2;
        }
        fh.g c10 = this.J.c(lc0Var, eVar, true);
        c10.r(org.telegram.messenger.g0.L(30.0f));
        return new nc0(c10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        boolean z10;
        boolean z11;
        FingerprintManager fingerprintManager;
        FingerprintManager fingerprintManager2;
        if (org.telegram.messenger.g0.W(getContext()) != null && org.telegram.messenger.bz.D) {
            try {
                Context context = org.telegram.messenger.t0.b;
                try {
                    fingerprintManager2 = (FingerprintManager) context.getSystemService("fingerprint");
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (fingerprintManager2 != null) {
                    z10 = fingerprintManager2.isHardwareDetected();
                    if (z10) {
                        try {
                            fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        if (fingerprintManager != null) {
                            z11 = fingerprintManager.hasEnrolledFingerprints();
                            if (z11 && org.telegram.messenger.vr.g()) {
                                if (org.telegram.messenger.vr.a()) {
                                    return true;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            if (org.telegram.messenger.vr.a()) {
                            }
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        return false;
    }

    public final boolean i() {
        hi.x3 x3Var = this.f0;
        if (x3Var == null || !x3Var.c()) {
            return true;
        }
        org.telegram.messenger.g0.v1(this.r);
        return false;
    }

    public final void k() {
        org.telegram.messenger.g0.r(this.d0);
    }

    public final void l() {
        if (this.Q) {
            return;
        }
        e();
        if (this.y.getVisibility() != 0) {
            if (org.telegram.messenger.bz.r == 1) {
                EditTextBoldCursor editTextBoldCursor = this.r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                }
                org.telegram.messenger.g0.h3(new dc0(this, 0), 200L);
            }
            c();
        }
    }

    public final void m(boolean z10, int i7, int i10, org.telegram.ui.i50 i50Var) {
        View currentFocus;
        boolean z11;
        int i11;
        int i12;
        if (getVisibility() != 0) {
            this.Q = false;
        }
        d();
        e();
        Activity W = org.telegram.messenger.g0.W(getContext());
        int i13 = org.telegram.messenger.bz.r;
        TextView textView = this.y;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i13 == 1) {
            if (!z10 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
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
        boolean z12 = org.telegram.ui.ActionBar.n6.s0() instanceof za0;
        ai.h0 h0Var = this.w;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.n6.I.q();
            this.a = org.telegram.ui.ActionBar.n6.s0();
            h0Var.setBackgroundColor(-1090519040);
        } else {
            if (!org.telegram.ui.ActionBar.n6.W || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.n6.K0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.n6.K0())) {
                if (!"d".equals(org.telegram.ui.ActionBar.n6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.n6.K0();
                    if (!org.telegram.ui.ActionBar.n6.j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.n6.s0();
                        this.a = s02;
                        if (s02 instanceof o9) {
                            h0Var.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            h0Var.setBackgroundColor(-1090519040);
                        } else {
                            h0Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                h0Var.setBackgroundColor(-11436898);
            } else {
                org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.n6.I.j0;
                o9 o9Var = (e6Var == null || (i11 = e6Var.d) == 0 || (i12 = e6Var.e) == 0) ? null : new o9(o9.d(e6Var.h), new int[]{i11, i12});
                this.a = o9Var;
                if (o9Var == null) {
                    this.a = org.telegram.ui.ActionBar.n6.s0();
                }
                if (this.a instanceof o9) {
                    h0Var.setBackgroundColor(570425344);
                } else {
                    h0Var.setBackgroundColor(-1090519040);
                }
            }
            z11 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof za0) {
            za0 za0Var = (za0) drawable;
            int[] iArr = za0Var.a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr2[i14] = org.telegram.ui.ActionBar.n6.b(0.14f, 0.0f, iArr[i14]);
                }
                iArr = iArr2;
            }
            this.a = new za0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (za0Var.u == null || za0Var.q >= 0) {
                h0Var.setBackgroundColor(570425344);
            } else {
                h0Var.setBackgroundColor(2130706432);
            }
            ((za0) this.a).q(h0Var);
        }
        this.x.setText(org.telegram.messenger.gd.N0(2131754229, null));
        int i15 = org.telegram.messenger.bz.r;
        ImageView imageView = this.F;
        ImageView imageView2 = this.E;
        bi.v2 v2Var = this.e;
        hi.s8 s8Var = this.s;
        if (i15 == 0) {
            if (textView.getVisibility() != 0) {
                v2Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            s8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i15 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(org.telegram.messenger.ks.N1);
            v2Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            s8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        hi.s8.a(s8Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new ic0(this, i7, i10, i50Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.b0 = 1.0f;
            h(1.0f);
            qh0 qh0Var = this.N;
            qh0Var.setScaleX(1.0f);
            qh0Var.setScaleY(1.0f);
            qh0Var.i();
            qh0Var.getAnimatedDrawable().N(38, false, false);
            if (i50Var != null) {
                i50Var.run();
            }
        }
        setOnTouchListener(new gi.a(20));
    }

    public final void n(boolean z10) {
        if (this.Q || getVisibility() != 0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (!z10) {
            if (org.telegram.messenger.bz.t > 0) {
                return;
            }
            int i7 = org.telegram.messenger.bz.r;
            hi.s8 s8Var = this.s;
            String sb2 = i7 == 0 ? ((StringBuilder) s8Var.d).toString() : i7 == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb2.length();
            FrameLayout frameLayout = this.b;
            org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.s;
            if (length == 0) {
                q2Var.a();
                int i10 = -this.c0;
                this.c0 = i10;
                org.telegram.messenger.g0.E3(i10, frameLayout, null);
                return;
            }
            if (!org.telegram.messenger.bz.g(sb2)) {
                org.telegram.messenger.bz.r();
                if (org.telegram.messenger.bz.t > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                hi.s8.a(s8Var, true);
                q2Var.a();
                int i11 = -this.c0;
                this.c0 = i11;
                org.telegram.messenger.g0.E3(i11, frameLayout, null);
                Drawable drawable = this.a;
                if (drawable instanceof za0) {
                    za0 za0Var = (za0) drawable;
                    LinkedList linkedList = this.V;
                    linkedList.clear();
                    LinkedList linkedList2 = this.W;
                    linkedList2.clear();
                    r1.g gVar = this.U;
                    if (gVar == null || !gVar.f) {
                        za0Var.m(true);
                        return;
                    } else {
                        linkedList.offer(new ya0(za0Var, 1));
                        linkedList2.offer(Boolean.FALSE);
                        return;
                    }
                }
                return;
            }
        }
        this.Q = true;
        k();
        org.telegram.messenger.bz.v = 0;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        if (org.telegram.messenger.vr.g() && org.telegram.messenger.vr.a()) {
            try {
                org.telegram.messenger.vr.e().deleteEntry("tmessages_passcode");
            } catch (KeyStoreException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.vr.g = null;
            org.telegram.messenger.vr.b(false);
        }
        org.telegram.messenger.bz.x = false;
        org.telegram.messenger.bz.y();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.n0, new Object[0]);
        setOnTouchListener(null);
        mc0 mc0Var = this.P;
        if (mc0Var != null) {
            mc0Var.p(this);
        }
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.R = null;
        }
        AnimatorSet animatorSet2 = this.S;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.S = null;
        }
        qh0 qh0Var = this.N;
        qh0Var.getAnimatedDrawable().P(71);
        qh0Var.getAnimatedDrawable().N(37, false, false);
        qh0Var.d();
        org.telegram.messenger.g0.g3(new dc0(this, 1));
    }

    public final void o(boolean z10) {
        ValueAnimator valueAnimator = this.h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g0 = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z10 ? 1.0f : 0.0f);
        this.h0 = ofFloat;
        ofFloat.addUpdateListener(new ec0(this, 0));
        this.h0.addListener(new org.telegram.ui.on(17, this, z10));
        this.h0.setInterpolator(kr.h);
        this.h0.setDuration(320L);
        this.h0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.Q1);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.o0);
        if (this.f0 == null && (getParent() instanceof View)) {
            this.f0 = new hi.x3((View) getParent(), false, new y2(this, 10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.Q = true;
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.S;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.T.cancel();
            this.T = null;
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.Q1);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.o0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.q1(rootView);
        Rect rect = this.O;
        getWindowVisibleDisplayFrame(rect);
        this.H = height - (rect.bottom - rect.top);
        if (org.telegram.messenger.bz.r == 1 && (org.telegram.messenger.g0.Q1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            int intValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((intValue + layoutParams.height) - (this.H / 2)) - org.telegram.messenger.g0.m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i7, i10, i11, i12);
        TextView textView = this.x;
        int[] iArr = this.i0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        qh0 qh0Var = this.N;
        if (Q1 || getContext().getResources().getConfiguration().orientation != 2) {
            int L = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.M = L;
            qh0Var.setTranslationY(L);
        } else {
            int L2 = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.M = L2;
            qh0Var.setTranslationY(L2);
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
        boolean z10 = !org.telegram.messenger.g0.Q1() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.G;
        if (view != null) {
            view.setVisibility(org.telegram.messenger.bz.r == 1 ? 0 : 8);
        }
        qh0 qh0Var = this.N;
        bi.v2 v2Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (org.telegram.messenger.bz.r == 0) {
                f10 = 2.0f;
                f11 = size / 2.0f;
            } else {
                f10 = 2.0f;
                f11 = size;
            }
            qh0Var.setTranslationX((f11 / f10) - org.telegram.messenger.g0.L(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = org.telegram.messenger.bz.r == 0 ? size / 2 : size;
            layoutParams.height = org.telegram.messenger.g0.L(180.0f);
            layoutParams.topMargin = org.telegram.messenger.m10.z(140.0f, i13, 2) + (org.telegram.messenger.bz.r == 0 ? org.telegram.messenger.g0.L(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i13;
            int i14 = size / 2;
            layoutParams2.leftMargin = i14;
            layoutParams2.topMargin = org.telegram.messenger.g0.m;
            layoutParams2.width = i14;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) v2Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            v2Var.setLayoutParams(layoutParams3);
            i12 = 0;
        } else {
            qh0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.g0.L(29.0f));
            int i15 = org.telegram.messenger.g0.m;
            if (org.telegram.messenger.g0.Q1()) {
                if (size > org.telegram.messenger.g0.L(498.0f)) {
                    i11 = org.telegram.messenger.m10.z(498.0f, size, 2);
                    size = org.telegram.messenger.g0.L(498.0f);
                } else {
                    i11 = 0;
                }
                if (i13 > org.telegram.messenger.g0.L(528.0f)) {
                    i15 = org.telegram.messenger.m10.z(528.0f, i13, 2);
                    i13 = org.telegram.messenger.g0.L(528.0f);
                }
            } else {
                i11 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams4.height = (i13 / 3) + (org.telegram.messenger.bz.r == 0 ? org.telegram.messenger.g0.L(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = i15;
            layoutParams4.leftMargin = i11;
            frameLayout2.setTag(Integer.valueOf(i15));
            frameLayout2.setLayoutParams(layoutParams4);
            int i16 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) v2Var.getLayoutParams();
            i12 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            v2Var.setLayoutParams(layoutParams5);
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
        int L4 = org.telegram.messenger.g0.L(z10 ? 52.0f : 82.0f);
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

    public void setDelegate(mc0 mc0Var) {
        this.P = mc0Var;
    }

    public void h(float f10) {
    }

    public void j() {
    }
}
