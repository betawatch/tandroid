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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class zb0 extends FrameLayout implements org.telegram.messenger.cs {
    public static final int[] j0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public int H;
    public final si.b I;
    public final eh.c J;
    public Bitmap K;
    public Canvas L;
    public int M;
    public final fh0 N;
    public final Rect O;
    public xb0 P;
    public boolean Q;
    public AnimatorSet R;
    public AnimatorSet S;
    public ValueAnimator T;
    public q1.g U;
    public final LinkedList V;
    public final LinkedList W;
    public Drawable a;
    public final ArrayList a0;
    public final FrameLayout b;
    public float b0;
    public final TextView c;
    public int c0;
    public final FrameLayout d;
    public final lt d0;
    public final ai.d2 e;
    public int e0;
    public final ArrayList f;
    public gi.p3 f0;
    public boolean g0;
    public final FrameLayout h;
    public ValueAnimator h0;
    public final int[] i0;
    public final wb0 n;
    public final EditTextBoldCursor r;
    public final gi.z7 s;
    public final ai.c0 w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb0(Context context) {
        super(context);
        int i3;
        String M0 = org.telegram.messenger.bd.M0(2131743860, null);
        final int i10 = 0;
        this.H = 0;
        si.b bVar = new si.b();
        this.I = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.J = cVar;
        ue.b bVar2 = new ue.b();
        this.O = new Rect();
        this.V = new LinkedList();
        this.W = new LinkedList();
        this.a0 = new ArrayList();
        this.c0 = -12;
        this.d0 = new lt(this, 7);
        final int i11 = 1;
        this.g0 = true;
        this.i0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ai.c0 c0Var = new ai.c0(this, context);
        this.w = c0Var;
        c0Var.setWillNotDraw(false);
        addView(c0Var, b8.mf.c(-1.0f, -1));
        cVar.h = new kh.k(c0Var);
        cVar.i = c0Var;
        cVar.g = bVar2;
        fh0 fh0Var = new fh0(context);
        this.N = fh0Var;
        fh0Var.f(R.raw.passcode_lock, 58, 58, null);
        fh0Var.setAutoRepeat(false);
        addView(fh0Var, b8.mf.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        c0Var.addView(frameLayout, b8.mf.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setAlpha(0.0f);
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, b8.mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.y = m10;
        m10.setTextColor(-1);
        m10.setTextSize(1, 15.0f);
        m10.setGravity(1);
        m10.setVisibility(4);
        c0Var.addView(m10, b8.mf.e(-2, -2, 17));
        gi.z7 z7Var = new gi.z7(this, context);
        this.s = z7Var;
        frameLayout.addView(z7Var, b8.mf.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
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
        frameLayout.addView(editTextBoldCursor, b8.mf.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new s0(this, 4));
        editTextBoldCursor.addTextChangedListener(new bh.h(this, 21));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new mi.b1(1));
        ImageView imageView = new ImageView(context);
        this.E = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, b8.mf.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qb0
            public final /* synthetic */ zb0 b;

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
            /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v2, types: [int] */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r7v4, types: [int] */
            /* JADX WARN: Type inference failed for: r7v7 */
            /* JADX WARN: Type inference failed for: r7v8 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zb0 zb0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i12;
                int i13;
                zb0 zb0Var2;
                boolean z12;
                boolean z13;
                boolean z14;
                int i14 = i10;
                zb0 zb0Var3 = this.b;
                switch (i14) {
                    case 0:
                        zb0Var3.n(false);
                        break;
                    case 1:
                        zb0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = zb0Var3.W;
                        LinkedList linkedList5 = zb0Var3.V;
                        gi.z7 z7Var2 = zb0Var3.s;
                        if (zb0Var3.g0 && !zb0Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    zb0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) z7Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) z7Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) z7Var2.d;
                                    if (sb2.length() == 0) {
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            z7Var2.performHapticFeedback(3);
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
                                            zb0 zb0Var4 = zb0Var3;
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
                                                fArr5[0] = z7Var2.c(i16);
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
                                                float c2 = z7Var2.c(i16);
                                                i13 = i16;
                                                float[] fArr10 = new float[i12];
                                                fArr10[0] = c2;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i13 = i16;
                                            }
                                            i16 = i13 + 1;
                                            linkedList5 = linkedList3;
                                            zb0Var3 = zb0Var4;
                                            i15 = 1;
                                        }
                                        zb0Var = zb0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), (Property<TextView, Float>) property5, z7Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), (Property<TextView, Float>) property5, z7Var2.c(i17)));
                                        }
                                        oe oeVar = (oe) z7Var2.f;
                                        if (oeVar != null) {
                                            org.telegram.messenger.g0.r(oeVar);
                                            z7Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) z7Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        z7Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) z7Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) z7Var2.e).addListener(new ub0(z7Var2, 1));
                                        ((AnimatorSet) z7Var2.e).start();
                                        zb0.a((zb0) z7Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (intValue == 11) {
                                zb0Var2 = zb0Var;
                            } else {
                                zb0Var2 = zb0Var;
                                Drawable drawable = zb0Var2.a;
                                if (drawable instanceof la0) {
                                    la0 la0Var = (la0) drawable;
                                    la0Var.D = null;
                                    la0Var.y();
                                    float f10 = la0Var.h;
                                    if (intValue == 10) {
                                        if (z11) {
                                            la0Var.x();
                                            z14 = true;
                                        } else {
                                            z14 = z10;
                                        }
                                        z13 = z14;
                                        z12 = z10;
                                    } else {
                                        la0Var.w(true);
                                        z12 = true;
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f10 >= 1.0f) {
                                            zb0Var2.b(la0Var);
                                        } else {
                                            ci.v6 v6Var = new ci.v6(zb0Var2, z12, la0Var, 22);
                                            ?? r22 = linkedList2;
                                            r22.offer(v6Var);
                                            ?? r42 = linkedList;
                                            r42.offer(Boolean.valueOf(z12));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r72 = z10; r72 < r22.size(); r72++) {
                                                Runnable runnable = (Runnable) r22.get(r72);
                                                Boolean bool = (Boolean) r42.get(r72);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r72));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r73 = z10; r73 < size; r73++) {
                                                r22.remove((Runnable) arrayList4.get(r73));
                                            }
                                            Collections.sort(arrayList5, new d80(1));
                                            int size2 = arrayList5.size();
                                            for (?? r23 = z10; r23 < size2; r23++) {
                                                r42.remove(((Integer) arrayList5.get(r23)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) z7Var2.d).length() == 4) {
                                zb0Var2.n(z10);
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
        frameLayout.addView(imageView2, b8.mf.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(org.telegram.messenger.bd.M0(2131754881, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qb0
            public final /* synthetic */ zb0 b;

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
            /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v2, types: [int] */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r7v4, types: [int] */
            /* JADX WARN: Type inference failed for: r7v7 */
            /* JADX WARN: Type inference failed for: r7v8 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zb0 zb0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i12;
                int i13;
                zb0 zb0Var2;
                boolean z12;
                boolean z13;
                boolean z14;
                int i14 = i11;
                zb0 zb0Var3 = this.b;
                switch (i14) {
                    case 0:
                        zb0Var3.n(false);
                        break;
                    case 1:
                        zb0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = zb0Var3.W;
                        LinkedList linkedList5 = zb0Var3.V;
                        gi.z7 z7Var2 = zb0Var3.s;
                        if (zb0Var3.g0 && !zb0Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z7Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    zb0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) z7Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) z7Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) z7Var2.d;
                                    if (sb2.length() == 0) {
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            z7Var2.performHapticFeedback(3);
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
                                            zb0 zb0Var4 = zb0Var3;
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
                                                fArr5[0] = z7Var2.c(i16);
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
                                                float c2 = z7Var2.c(i16);
                                                i13 = i16;
                                                float[] fArr10 = new float[i12];
                                                fArr10[0] = c2;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i13 = i16;
                                            }
                                            i16 = i13 + 1;
                                            linkedList5 = linkedList3;
                                            zb0Var3 = zb0Var4;
                                            i15 = 1;
                                        }
                                        zb0Var = zb0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i17 = 0; i17 < length; i17++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), (Property<TextView, Float>) property5, z7Var2.c(i17)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), (Property<TextView, Float>) property5, z7Var2.c(i17)));
                                        }
                                        oe oeVar = (oe) z7Var2.f;
                                        if (oeVar != null) {
                                            org.telegram.messenger.g0.r(oeVar);
                                            z7Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) z7Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        z7Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) z7Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) z7Var2.e).addListener(new ub0(z7Var2, 1));
                                        ((AnimatorSet) z7Var2.e).start();
                                        zb0.a((zb0) z7Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    zb0Var = zb0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (intValue == 11) {
                                zb0Var2 = zb0Var;
                            } else {
                                zb0Var2 = zb0Var;
                                Drawable drawable = zb0Var2.a;
                                if (drawable instanceof la0) {
                                    la0 la0Var = (la0) drawable;
                                    la0Var.D = null;
                                    la0Var.y();
                                    float f10 = la0Var.h;
                                    if (intValue == 10) {
                                        if (z11) {
                                            la0Var.x();
                                            z14 = true;
                                        } else {
                                            z14 = z10;
                                        }
                                        z13 = z14;
                                        z12 = z10;
                                    } else {
                                        la0Var.w(true);
                                        z12 = true;
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f10 >= 1.0f) {
                                            zb0Var2.b(la0Var);
                                        } else {
                                            ci.v6 v6Var = new ci.v6(zb0Var2, z12, la0Var, 22);
                                            ?? r22 = linkedList2;
                                            r22.offer(v6Var);
                                            ?? r42 = linkedList;
                                            r42.offer(Boolean.valueOf(z12));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r72 = z10; r72 < r22.size(); r72++) {
                                                Runnable runnable = (Runnable) r22.get(r72);
                                                Boolean bool = (Boolean) r42.get(r72);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r72));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r73 = z10; r73 < size; r73++) {
                                                r22.remove((Runnable) arrayList4.get(r73));
                                            }
                                            Collections.sort(arrayList5, new d80(1));
                                            int size2 = arrayList5.size();
                                            for (?? r23 = z10; r23 < size2; r23++) {
                                                r42.remove(((Integer) arrayList5.get(r23)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) z7Var2.d).length() == 4) {
                                zb0Var2.n(z10);
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
        frameLayout.addView(view, b8.mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        c0Var.addView(frameLayout2, b8.mf.e(-1, -1, 51));
        ai.d2 d2Var = new ai.d2(context, 18);
        this.e = d2Var;
        d2Var.setClipChildren(false);
        frameLayout2.addView(d2Var, b8.mf.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        d2Var.addView(frameLayout3, b8.mf.e(-2, -2, 49));
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 15.0f);
        g7.setTypeface(org.telegram.messenger.g0.o());
        g7.setTextColor(-1);
        g7.setText(M0);
        TextView m11 = org.telegram.ui.Cells.f1.m(frameLayout3, g7, b8.mf.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = m11;
        m11.setTextSize(1, 14.0f);
        m11.setTextColor(-1);
        m11.setText((CharSequence) null);
        frameLayout3.addView(m11, b8.mf.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        while (true) {
            if (i10 >= 12) {
                break;
            }
            wb0 wb0Var = new wb0(context);
            b8.pf.b(wb0Var, 0.15f, 1.5f);
            wb0Var.setTag(Integer.valueOf(i10));
            int[] iArr = j0;
            if (i10 == 11) {
                wb0Var.setBackground(f(wb0Var));
                int L = org.telegram.messenger.g0.L(30.0f);
                wb0Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 0, 654311423, 654311423));
                wb0Var.setImage(R.drawable.filled_clear);
                wb0Var.setOnLongClickListener(new zz(this, i11));
                wb0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754920, null));
                wb0Var.setNextFocusForwardId(R.id.passcode_btn_0);
                wb0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
            } else if (i10 == 10) {
                this.n = wb0Var;
                wb0Var.setBackground(f(wb0Var));
                int L2 = org.telegram.messenger.g0.L(30.0f);
                wb0Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                wb0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754881, null));
                wb0Var.setImage(R.drawable.fingerprint);
                wb0Var.setNextFocusForwardId(R.id.passcode_btn_1);
                wb0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_1);
            } else {
                wb0Var.setBackground(f(wb0Var));
                int L3 = org.telegram.messenger.g0.L(30.0f);
                wb0Var.setForeground(org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                wb0Var.setContentDescription(i10 + "");
                wb0Var.setNum(i10);
                if (i10 == 0) {
                    wb0Var.setNextFocusForwardId(R.id.passcode_btn_backspace);
                    wb0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_backspace);
                } else if (i10 != 9) {
                    int i12 = iArr[i10 + 1];
                    wb0Var.setNextFocusForwardId(i12);
                    wb0Var.setAccessibilityTraversalBefore(i12);
                } else if (g()) {
                    wb0Var.setNextFocusForwardId(R.id.passcode_btn_fingerprint);
                    wb0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_fingerprint);
                } else {
                    wb0Var.setNextFocusForwardId(R.id.passcode_btn_0);
                    wb0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
                }
            }
            wb0Var.setId(iArr[i10]);
            final int i13 = 2;
            wb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qb0
                public final /* synthetic */ zb0 b;

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
                /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList, java.util.List] */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v2, types: [int] */
                /* JADX WARN: Type inference failed for: r7v3 */
                /* JADX WARN: Type inference failed for: r7v4, types: [int] */
                /* JADX WARN: Type inference failed for: r7v7 */
                /* JADX WARN: Type inference failed for: r7v8 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zb0 zb0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    boolean z10;
                    boolean z11;
                    LinkedList linkedList3;
                    int i122;
                    int i132;
                    zb0 zb0Var2;
                    boolean z12;
                    boolean z13;
                    boolean z14;
                    int i14 = i13;
                    zb0 zb0Var3 = this.b;
                    switch (i14) {
                        case 0:
                            zb0Var3.n(false);
                            break;
                        case 1:
                            zb0Var3.c();
                            break;
                        default:
                            LinkedList linkedList4 = zb0Var3.W;
                            LinkedList linkedList5 = zb0Var3.V;
                            gi.z7 z7Var2 = zb0Var3.s;
                            if (zb0Var3.g0 && !zb0Var3.Q) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("0");
                                        z11 = z10;
                                        break;
                                    case 1:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("1");
                                        z11 = z10;
                                        break;
                                    case 2:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("2");
                                        z11 = z10;
                                        break;
                                    case 3:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("3");
                                        z11 = z10;
                                        break;
                                    case 4:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("4");
                                        z11 = z10;
                                        break;
                                    case 5:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("5");
                                        z11 = z10;
                                        break;
                                    case 6:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("6");
                                        z11 = z10;
                                        break;
                                    case 7:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("7");
                                        z11 = z10;
                                        break;
                                    case 8:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("8");
                                        z11 = z10;
                                        break;
                                    case 9:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z7Var2.b("9");
                                        z11 = z10;
                                        break;
                                    case 10:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        zb0Var.c();
                                        z11 = z10;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) z7Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        z10 = false;
                                        ArrayList arrayList2 = (ArrayList) z7Var2.b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) z7Var2.d;
                                        if (sb2.length() == 0) {
                                            zb0Var = zb0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z11 = z10;
                                            break;
                                        } else {
                                            try {
                                                z7Var2.performHapticFeedback(3);
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
                                                zb0 zb0Var4 = zb0Var3;
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i122 = i15;
                                                    float[] fArr = new float[i122];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                    float[] fArr2 = new float[i122];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                    float[] fArr3 = new float[i122];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                    float[] fArr4 = new float[i122];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                    float[] fArr5 = new float[i122];
                                                    fArr5[0] = z7Var2.c(i16);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
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
                                                    float c2 = z7Var2.c(i16);
                                                    i132 = i16;
                                                    float[] fArr10 = new float[i122];
                                                    fArr10[0] = c2;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                                } else {
                                                    i132 = i16;
                                                }
                                                i16 = i132 + 1;
                                                linkedList5 = linkedList3;
                                                zb0Var3 = zb0Var4;
                                                i15 = 1;
                                            }
                                            zb0Var = zb0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i17 = 0; i17 < length; i17++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), (Property<TextView, Float>) property5, z7Var2.c(i17)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i17), (Property<TextView, Float>) property5, z7Var2.c(i17)));
                                            }
                                            oe oeVar = (oe) z7Var2.f;
                                            if (oeVar != null) {
                                                org.telegram.messenger.g0.r(oeVar);
                                                z7Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) z7Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            z7Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) z7Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) z7Var2.e).addListener(new ub0(z7Var2, 1));
                                            ((AnimatorSet) z7Var2.e).start();
                                            zb0.a((zb0) z7Var2.h);
                                            z11 = true;
                                            break;
                                        }
                                    default:
                                        zb0Var = zb0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z11 = z10;
                                        break;
                                }
                                if (intValue == 11) {
                                    zb0Var2 = zb0Var;
                                } else {
                                    zb0Var2 = zb0Var;
                                    Drawable drawable = zb0Var2.a;
                                    if (drawable instanceof la0) {
                                        la0 la0Var = (la0) drawable;
                                        la0Var.D = null;
                                        la0Var.y();
                                        float f10 = la0Var.h;
                                        if (intValue == 10) {
                                            if (z11) {
                                                la0Var.x();
                                                z14 = true;
                                            } else {
                                                z14 = z10;
                                            }
                                            z13 = z14;
                                            z12 = z10;
                                        } else {
                                            la0Var.w(true);
                                            z12 = true;
                                            z13 = true;
                                        }
                                        if (z13) {
                                            if (f10 >= 1.0f) {
                                                zb0Var2.b(la0Var);
                                            } else {
                                                ci.v6 v6Var = new ci.v6(zb0Var2, z12, la0Var, 22);
                                                ?? r22 = linkedList2;
                                                r22.offer(v6Var);
                                                ?? r42 = linkedList;
                                                r42.offer(Boolean.valueOf(z12));
                                                ?? arrayList4 = new ArrayList();
                                                ?? arrayList5 = new ArrayList();
                                                for (?? r72 = z10; r72 < r22.size(); r72++) {
                                                    Runnable runnable = (Runnable) r22.get(r72);
                                                    Boolean bool = (Boolean) r42.get(r72);
                                                    if (bool != null && bool.booleanValue() != z12) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf((int) r72));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                for (?? r73 = z10; r73 < size; r73++) {
                                                    r22.remove((Runnable) arrayList4.get(r73));
                                                }
                                                Collections.sort(arrayList5, new d80(1));
                                                int size2 = arrayList5.size();
                                                for (?? r23 = z10; r23 < size2; r23++) {
                                                    r42.remove(((Integer) arrayList5.get(r23)).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) z7Var2.d).length() == 4) {
                                    zb0Var2.n(z10);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.f.add(wb0Var);
            i10++;
        }
        for (i3 = 11; i3 >= 0; i3--) {
            this.e.addView((FrameLayout) this.f.get(i3), b8.mf.e(60, 60, 51));
        }
        d();
    }

    public static void a(zb0 zb0Var) {
        FrameLayout frameLayout = zb0Var.b;
        gi.z7 z7Var = zb0Var.s;
        boolean z10 = z7Var == null || ((StringBuilder) z7Var.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.messenger.camera.q.l(frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f), xq.h, 320L);
        }
    }

    public final void b(la0 la0Var) {
        q1.g gVar = this.U;
        if (gVar != null && gVar.f) {
            gVar.d();
        }
        q1.f fVar = new q1.f(0.0f);
        la0Var.D = new zw(fVar, 9);
        la0Var.y();
        q1.g gVar2 = new q1.g(fVar);
        gVar2.m = org.telegram.ui.Cells.f1.s(100.0f, 300.0f, 1.0f);
        this.U = gVar2;
        gVar2.a(new ii.z3(4, this, la0Var));
        this.U.b(new c7(la0Var, 5));
        this.U.h();
    }

    public final void c() {
        Activity W;
        bc0 bc0Var;
        if (this.Q || (W = org.telegram.messenger.g0.W(getContext())) == null || this.n.getVisibility() != 0 || org.telegram.messenger.t0.x) {
            return;
        }
        int i3 = 1;
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            ArrayList arrayList = launchActivity.C0;
            if (!arrayList.isEmpty() || (bc0Var = launchActivity.B0) == null) {
                if (k2.p1.h(1, arrayList) != this) {
                    return;
                }
            } else if (this != bc0Var.b) {
                return;
            }
        }
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(getContext(), 0)).b(15) == 0 && org.telegram.messenger.sr.h() && !org.telegram.messenger.sr.a()) {
                android.support.v4.media.c cVar = new android.support.v4.media.c(LaunchActivity.K1, f0.d.e(getContext()), new ii.p(this, i3));
                l6.n nVar = new l6.n(1);
                nVar.b = org.telegram.messenger.bd.M0(2131743860, null);
                nVar.d = org.telegram.messenger.bd.M0(2131743802, null);
                nVar.a = 15;
                cVar.Y(nVar.c(), null);
                o(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d() {
        boolean g7 = g();
        int i3 = g7 ? 0 : 8;
        wb0 wb0Var = this.n;
        wb0Var.setVisibility(i3);
        if (org.telegram.messenger.az.r == 1) {
            this.F.setVisibility(wb0Var.getVisibility());
        }
        this.c.setText(org.telegram.messenger.bd.M0(org.telegram.messenger.az.r == 1 ? 2131751117 : g7 ? 2131751118 : 2131751119, null));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.Q1) {
            d();
            if (((Boolean) objArr[0]).booleanValue() && org.telegram.messenger.az.x) {
                c();
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.o0 || objArr[0] == this) {
            return;
        }
        setVisibility(8);
        j();
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > org.telegram.messenger.az.u) {
            long j10 = org.telegram.messenger.az.t - (elapsedRealtime - org.telegram.messenger.az.u);
            org.telegram.messenger.az.t = j10;
            if (j10 < 0) {
                org.telegram.messenger.az.t = 0L;
            }
        }
        org.telegram.messenger.az.u = elapsedRealtime;
        org.telegram.messenger.az.y();
        long j11 = org.telegram.messenger.az.t;
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        lt ltVar = this.d0;
        TextView textView = this.y;
        if (j11 <= 0) {
            org.telegram.messenger.g0.r(ltVar);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                o(true);
                if (org.telegram.messenger.az.r == 1) {
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
        if (max != this.e0) {
            textView.setText(org.telegram.messenger.bd.a0(null, null, 2131744046, org.telegram.messenger.bd.G(max, "Seconds", new Object[0])));
            this.e0 = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            o(false);
            org.telegram.messenger.g0.v1(editTextBoldCursor);
        }
        org.telegram.messenger.g0.r(ltVar);
        org.telegram.messenger.g0.i3(ltVar, 100L);
    }

    public final yb0 f(wb0 wb0Var) {
        hh.e eVar = new hh.e(null);
        eVar.e = new a3(24);
        if (Build.VERSION.SDK_INT < 29) {
            eVar.f(1308622847, 1308622847);
            eVar.e(452984831, 452984831);
            float N = org.telegram.messenger.g0.N(1.0f);
            float N2 = org.telegram.messenger.g0.N(0.6666667f);
            eVar.f = N;
            eVar.h = N2;
        }
        gh.g c2 = this.J.c(wb0Var, eVar, true);
        c2.r(org.telegram.messenger.g0.L(30.0f));
        return new yb0(c2);
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
        if (org.telegram.messenger.g0.W(getContext()) != null && org.telegram.messenger.az.D) {
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
                            if (z11 && org.telegram.messenger.sr.h()) {
                                if (org.telegram.messenger.sr.a()) {
                                    return true;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            if (org.telegram.messenger.sr.a()) {
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
        gi.p3 p3Var = this.f0;
        if (p3Var == null || !p3Var.c()) {
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
            if (org.telegram.messenger.az.r == 1) {
                EditTextBoldCursor editTextBoldCursor = this.r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                }
                org.telegram.messenger.g0.i3(new ob0(this, 0), 200L);
            }
            c();
        }
    }

    public final void m(boolean z10, int i3, int i10, org.telegram.ui.ly lyVar) {
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
        int i13 = org.telegram.messenger.az.r;
        TextView textView = this.y;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i13 == 1) {
            if (!z10 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
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
        boolean z12 = org.telegram.ui.ActionBar.k6.s0() instanceof la0;
        ai.c0 c0Var = this.w;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.k6.I.q();
            this.a = org.telegram.ui.ActionBar.k6.s0();
            c0Var.setBackgroundColor(-1090519040);
        } else {
            if (!org.telegram.ui.ActionBar.k6.W || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.k6.K0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.k6.K0())) {
                if (!"d".equals(org.telegram.ui.ActionBar.k6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.k6.K0();
                    if (!org.telegram.ui.ActionBar.k6.j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.k6.s0();
                        this.a = s02;
                        if (s02 instanceof j9) {
                            c0Var.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            c0Var.setBackgroundColor(-1090519040);
                        } else {
                            c0Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                c0Var.setBackgroundColor(-11436898);
            } else {
                org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.k6.I.j0;
                j9 j9Var = (b6Var == null || (i11 = b6Var.d) == 0 || (i12 = b6Var.e) == 0) ? null : new j9(j9.d(b6Var.h), new int[]{i11, i12});
                this.a = j9Var;
                if (j9Var == null) {
                    this.a = org.telegram.ui.ActionBar.k6.s0();
                }
                if (this.a instanceof j9) {
                    c0Var.setBackgroundColor(570425344);
                } else {
                    c0Var.setBackgroundColor(-1090519040);
                }
            }
            z11 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof la0) {
            la0 la0Var = (la0) drawable;
            int[] iArr = la0Var.a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    iArr2[i14] = org.telegram.ui.ActionBar.k6.b(0.14f, 0.0f, iArr[i14]);
                }
                iArr = iArr2;
            }
            this.a = new la0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (la0Var.u == null || la0Var.q >= 0) {
                c0Var.setBackgroundColor(570425344);
            } else {
                c0Var.setBackgroundColor(2130706432);
            }
            ((la0) this.a).q(c0Var);
        }
        this.x.setText(org.telegram.messenger.bd.M0(2131754232, null));
        int i15 = org.telegram.messenger.az.r;
        ImageView imageView = this.F;
        ImageView imageView2 = this.E;
        ai.d2 d2Var = this.e;
        gi.z7 z7Var = this.s;
        if (i15 == 0) {
            if (textView.getVisibility() != 0) {
                d2Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            z7Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i15 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(org.telegram.messenger.hs.N1);
            d2Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            z7Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        gi.z7.a(z7Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new tb0(this, i3, i10, lyVar));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.b0 = 1.0f;
            h(1.0f);
            fh0 fh0Var = this.N;
            fh0Var.setScaleX(1.0f);
            fh0Var.setScaleY(1.0f);
            fh0Var.i();
            fh0Var.getAnimatedDrawable().N(38, false, false);
            if (lyVar != null) {
                lyVar.run();
            }
        }
        setOnTouchListener(new fi.a(19));
    }

    public final void n(boolean z10) {
        if (this.Q || getVisibility() != 0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (!z10) {
            if (org.telegram.messenger.az.t > 0) {
                return;
            }
            int i3 = org.telegram.messenger.az.r;
            gi.z7 z7Var = this.s;
            String sb2 = i3 == 0 ? ((StringBuilder) z7Var.d).toString() : i3 == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb2.length();
            FrameLayout frameLayout = this.b;
            org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.s;
            if (length == 0) {
                p2Var.a();
                int i10 = -this.c0;
                this.c0 = i10;
                org.telegram.messenger.g0.G3(i10, frameLayout, null);
                return;
            }
            if (!org.telegram.messenger.az.g(sb2)) {
                org.telegram.messenger.az.r();
                if (org.telegram.messenger.az.t > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                gi.z7.a(z7Var, true);
                p2Var.a();
                int i11 = -this.c0;
                this.c0 = i11;
                org.telegram.messenger.g0.G3(i11, frameLayout, null);
                Drawable drawable = this.a;
                if (drawable instanceof la0) {
                    la0 la0Var = (la0) drawable;
                    LinkedList linkedList = this.V;
                    linkedList.clear();
                    LinkedList linkedList2 = this.W;
                    linkedList2.clear();
                    q1.g gVar = this.U;
                    if (gVar == null || !gVar.f) {
                        la0Var.m(true);
                        return;
                    } else {
                        linkedList.offer(new ka0(la0Var, 1));
                        linkedList2.offer(Boolean.FALSE);
                        return;
                    }
                }
                return;
            }
        }
        this.Q = true;
        k();
        org.telegram.messenger.az.v = 0;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        if (org.telegram.messenger.sr.h() && org.telegram.messenger.sr.a()) {
            try {
                org.telegram.messenger.sr.e().deleteEntry("tmessages_passcode");
            } catch (KeyStoreException e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.sr.g = null;
            org.telegram.messenger.sr.b(false);
        }
        org.telegram.messenger.az.x = false;
        org.telegram.messenger.az.y();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.n0, new Object[0]);
        setOnTouchListener(null);
        xb0 xb0Var = this.P;
        if (xb0Var != null) {
            xb0Var.q(this);
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
        fh0 fh0Var = this.N;
        fh0Var.getAnimatedDrawable().P(71);
        fh0Var.getAnimatedDrawable().N(37, false, false);
        fh0Var.d();
        org.telegram.messenger.g0.h3(new ob0(this, 1));
    }

    public final void o(boolean z10) {
        ValueAnimator valueAnimator = this.h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g0 = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z10 ? 1.0f : 0.0f);
        this.h0 = ofFloat;
        ofFloat.addUpdateListener(new pb0(this, 0));
        this.h0.addListener(new s9(16, this, z10));
        this.h0.setInterpolator(xq.h);
        this.h0.setDuration(320L);
        this.h0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.Q1);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.o0);
        if (this.f0 == null && (getParent() instanceof View)) {
            this.f0 = new gi.p3((View) getParent(), false, new p2(this, 8));
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
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.Q1);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.o0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.q1(rootView);
        Rect rect = this.O;
        getWindowVisibleDisplayFrame(rect);
        this.H = height - (rect.bottom - rect.top);
        if (org.telegram.messenger.az.r == 1 && (org.telegram.messenger.g0.Q1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            int intValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((intValue + layoutParams.height) - (this.H / 2)) - org.telegram.messenger.g0.m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i3, i10, i11, i12);
        TextView textView = this.x;
        int[] iArr = this.i0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        fh0 fh0Var = this.N;
        if (Q1 || getContext().getResources().getConfiguration().orientation != 2) {
            int L = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.M = L;
            fh0Var.setTranslationY(L);
        } else {
            int L2 = iArr[1] - org.telegram.messenger.g0.L(100.0f);
            this.M = L2;
            fh0Var.setTranslationY(L2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i3);
        int i13 = org.telegram.messenger.g0.q.y;
        int L = org.telegram.messenger.g0.L(28.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int L3 = org.telegram.messenger.g0.L(60.0f);
        boolean z10 = !org.telegram.messenger.g0.Q1() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.G;
        if (view != null) {
            view.setVisibility(org.telegram.messenger.az.r == 1 ? 0 : 8);
        }
        fh0 fh0Var = this.N;
        ai.d2 d2Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (org.telegram.messenger.az.r == 0) {
                f10 = 2.0f;
                f11 = size / 2.0f;
            } else {
                f10 = 2.0f;
                f11 = size;
            }
            fh0Var.setTranslationX((f11 / f10) - org.telegram.messenger.g0.L(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = org.telegram.messenger.az.r == 0 ? size / 2 : size;
            layoutParams.height = org.telegram.messenger.g0.L(180.0f);
            layoutParams.topMargin = org.telegram.messenger.camera.q.y(140.0f, i13, 2) + (org.telegram.messenger.az.r == 0 ? org.telegram.messenger.g0.L(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i13;
            int i14 = size / 2;
            layoutParams2.leftMargin = i14;
            layoutParams2.topMargin = org.telegram.messenger.g0.m;
            layoutParams2.width = i14;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            d2Var.setLayoutParams(layoutParams3);
            i12 = 0;
        } else {
            fh0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.g0.L(29.0f));
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
            layoutParams4.height = (i13 / 3) + (org.telegram.messenger.az.r == 0 ? org.telegram.messenger.g0.L(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = i15;
            layoutParams4.leftMargin = i11;
            frameLayout2.setTag(Integer.valueOf(i15));
            frameLayout2.setLayoutParams(layoutParams4);
            int i16 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
            i12 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.g0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.g0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            d2Var.setLayoutParams(layoutParams5);
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
        super.onMeasure(i3, i10);
    }

    public void setDelegate(xb0 xb0Var) {
        this.P = xb0Var;
    }

    public void h(float f10) {
    }

    public void j() {
    }
}
