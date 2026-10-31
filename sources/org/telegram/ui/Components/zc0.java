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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class zc0 extends FrameLayout implements org.telegram.messenger.us {
    public static final int[] i0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public int G;
    public final hi.b H;
    public final tg.b I;
    public Bitmap J;
    public Canvas K;
    public int L;
    public final ei0 M;
    public final Rect N;
    public xc0 O;
    public boolean P;
    public AnimatorSet Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public o1.j T;
    public final LinkedList U;
    public final LinkedList V;
    public final ArrayList W;
    public Drawable a;
    public float a0;
    public final FrameLayout b;
    public int b0;
    public final TextView c;
    public final ew c0;
    public final FrameLayout d;
    public int d0;
    public final org.telegram.ui.Cells.a5 e;
    public vh.r2 e0;
    public final ArrayList f;
    public boolean f0;
    public ValueAnimator g0;
    public final FrameLayout h;
    public final int[] h0;
    public final wc0 n;
    public final EditTextBoldCursor r;
    public final uc0 s;
    public final fg.i w;
    public final TextView x;
    public final TextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(Context context) {
        super(context);
        int i10;
        String L0 = org.telegram.messenger.cd.L0(2131743875, null);
        final int i11 = 0;
        this.G = 0;
        hi.b bVar = new hi.b();
        this.H = bVar;
        tg.b bVar2 = new tg.b(bVar);
        this.I = bVar2;
        je.b bVar3 = new je.b();
        this.N = new Rect();
        this.U = new LinkedList();
        this.V = new LinkedList();
        this.W = new ArrayList();
        this.b0 = -12;
        this.c0 = new ew(this, 6);
        final int i12 = 1;
        this.f0 = true;
        this.h0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        fg.i iVar = new fg.i(this, context);
        this.w = iVar;
        iVar.setWillNotDraw(false);
        addView(iVar, w7.b6.c(-1.0f, -1));
        bVar2.f = new zg.h(iVar);
        bVar2.g = iVar;
        bVar2.e = bVar3;
        ei0 ei0Var = new ei0(context);
        this.M = ei0Var;
        ei0Var.f(R.raw.passcode_lock, 58, 58, null);
        ei0Var.setAutoRepeat(false);
        addView(ei0Var, w7.b6.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        iVar.addView(frameLayout, w7.b6.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setAlpha(0.0f);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, w7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.y = l4;
        l4.setTextColor(-1);
        l4.setTextSize(1, 15.0f);
        l4.setGravity(1);
        l4.setVisibility(4);
        iVar.addView(l4, w7.b6.e(-2, -2, 17));
        uc0 uc0Var = new uc0(this, context);
        this.s = uc0Var;
        frameLayout.addView(uc0Var, w7.b6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
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
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(32.0f));
        frameLayout.addView(editTextBoldCursor, w7.b6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new t0(this, 4));
        editTextBoldCursor.addTextChangedListener(new ag.a1(this, 16));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new bi.i1(1));
        ImageView imageView = new ImageView(context);
        this.D = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, w7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oc0
            public final /* synthetic */ zc0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8, types: [int] */
            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v2, types: [int] */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r7v4, types: [int] */
            /* JADX WARN: Type inference failed for: r7v7 */
            /* JADX WARN: Type inference failed for: r7v8 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zc0 zc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i13;
                int i14;
                zc0 zc0Var2;
                boolean z12;
                boolean z13;
                int i15 = i11;
                zc0 zc0Var3 = this.b;
                switch (i15) {
                    case 0:
                        zc0Var3.n(false);
                        break;
                    case 1:
                        zc0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = zc0Var3.V;
                        LinkedList linkedList5 = zc0Var3.U;
                        uc0 uc0Var2 = zc0Var3.s;
                        if (zc0Var3.f0 && !zc0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    zc0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) uc0Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) uc0Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) uc0Var2.d;
                                    if (sb2.length() == 0) {
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            uc0Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
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
                                            zc0 zc0Var4 = zc0Var3;
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
                                                fArr5[0] = uc0Var2.c(i17);
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
                                                float c10 = uc0Var2.c(i17);
                                                i14 = i17;
                                                float[] fArr10 = new float[i13];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            zc0Var3 = zc0Var4;
                                            i16 = 1;
                                        }
                                        zc0Var = zc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, uc0Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, uc0Var2.c(i18)));
                                        }
                                        le leVar = (le) uc0Var2.f;
                                        if (leVar != null) {
                                            org.telegram.messenger.i0.r(leVar);
                                            uc0Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) uc0Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        uc0Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) uc0Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) uc0Var2.e).addListener(new tc0(uc0Var2, 1));
                                        ((AnimatorSet) uc0Var2.e).start();
                                        zc0.a((zc0) uc0Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (intValue == 11) {
                                zc0Var2 = zc0Var;
                            } else {
                                zc0Var2 = zc0Var;
                                Drawable drawable = zc0Var2.a;
                                if (drawable instanceof jb0) {
                                    jb0 jb0Var = (jb0) drawable;
                                    jb0Var.D = null;
                                    jb0Var.y();
                                    float f7 = jb0Var.h;
                                    if (intValue == 10) {
                                        if (z11) {
                                            jb0Var.x();
                                            z13 = true;
                                        } else {
                                            z13 = z10;
                                        }
                                        z12 = z10;
                                    } else {
                                        z12 = true;
                                        jb0Var.w(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            zc0Var2.b(jb0Var);
                                        } else {
                                            ?? r32 = linkedList2;
                                            r32.offer(new ag.j0(zc0Var2, z12, jb0Var, 19));
                                            ?? r22 = linkedList;
                                            r22.offer(Boolean.valueOf(z12));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r72 = z10; r72 < r32.size(); r72++) {
                                                Runnable runnable = (Runnable) r32.get(r72);
                                                Boolean bool = (Boolean) r22.get(r72);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r72));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r73 = z10; r73 < size; r73++) {
                                                r32.remove((Runnable) arrayList4.get(r73));
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.f6(13));
                                            int size2 = arrayList5.size();
                                            for (?? r33 = z10; r33 < size2; r33++) {
                                                r22.remove(((Integer) arrayList5.get(r33)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) uc0Var2.d).length() == 4) {
                                zc0Var2.n(z10);
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
        frameLayout.addView(imageView2, w7.b6.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(org.telegram.messenger.cd.L0(2131754881, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oc0
            public final /* synthetic */ zc0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v30, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.util.LinkedList] */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8, types: [int] */
            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v2, types: [int] */
            /* JADX WARN: Type inference failed for: r7v3 */
            /* JADX WARN: Type inference failed for: r7v4, types: [int] */
            /* JADX WARN: Type inference failed for: r7v7 */
            /* JADX WARN: Type inference failed for: r7v8 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zc0 zc0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i13;
                int i14;
                zc0 zc0Var2;
                boolean z12;
                boolean z13;
                int i15 = i12;
                zc0 zc0Var3 = this.b;
                switch (i15) {
                    case 0:
                        zc0Var3.n(false);
                        break;
                    case 1:
                        zc0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = zc0Var3.V;
                        LinkedList linkedList5 = zc0Var3.U;
                        uc0 uc0Var2 = zc0Var3.s;
                        if (zc0Var3.f0 && !zc0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    uc0Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    zc0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) uc0Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) uc0Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) uc0Var2.d;
                                    if (sb2.length() == 0) {
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            uc0Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
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
                                            zc0 zc0Var4 = zc0Var3;
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
                                                fArr5[0] = uc0Var2.c(i17);
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
                                                float c10 = uc0Var2.c(i17);
                                                i14 = i17;
                                                float[] fArr10 = new float[i13];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            zc0Var3 = zc0Var4;
                                            i16 = 1;
                                        }
                                        zc0Var = zc0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, uc0Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, uc0Var2.c(i18)));
                                        }
                                        le leVar = (le) uc0Var2.f;
                                        if (leVar != null) {
                                            org.telegram.messenger.i0.r(leVar);
                                            uc0Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) uc0Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        uc0Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) uc0Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) uc0Var2.e).addListener(new tc0(uc0Var2, 1));
                                        ((AnimatorSet) uc0Var2.e).start();
                                        zc0.a((zc0) uc0Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    zc0Var = zc0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (intValue == 11) {
                                zc0Var2 = zc0Var;
                            } else {
                                zc0Var2 = zc0Var;
                                Drawable drawable = zc0Var2.a;
                                if (drawable instanceof jb0) {
                                    jb0 jb0Var = (jb0) drawable;
                                    jb0Var.D = null;
                                    jb0Var.y();
                                    float f7 = jb0Var.h;
                                    if (intValue == 10) {
                                        if (z11) {
                                            jb0Var.x();
                                            z13 = true;
                                        } else {
                                            z13 = z10;
                                        }
                                        z12 = z10;
                                    } else {
                                        z12 = true;
                                        jb0Var.w(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            zc0Var2.b(jb0Var);
                                        } else {
                                            ?? r32 = linkedList2;
                                            r32.offer(new ag.j0(zc0Var2, z12, jb0Var, 19));
                                            ?? r22 = linkedList;
                                            r22.offer(Boolean.valueOf(z12));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (?? r72 = z10; r72 < r32.size(); r72++) {
                                                Runnable runnable = (Runnable) r32.get(r72);
                                                Boolean bool = (Boolean) r22.get(r72);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) r72));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (?? r73 = z10; r73 < size; r73++) {
                                                r32.remove((Runnable) arrayList4.get(r73));
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.f6(13));
                                            int size2 = arrayList5.size();
                                            for (?? r33 = z10; r33 < size2; r33++) {
                                                r22.remove(((Integer) arrayList5.get(r33)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) uc0Var2.d).length() == 4) {
                                zc0Var2.n(z10);
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
        frameLayout.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        iVar.addView(frameLayout2, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 20);
        this.e = a5Var;
        a5Var.setClipChildren(false);
        frameLayout2.addView(a5Var, w7.b6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        a5Var.addView(frameLayout3, w7.b6.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 15.0f);
        g10.setTypeface(org.telegram.messenger.i0.o());
        g10.setTextColor(-1);
        g10.setText(L0);
        TextView l10 = org.telegram.ui.Cells.f1.l(frameLayout3, g10, w7.b6.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = l10;
        l10.setTextSize(1, 14.0f);
        l10.setTextColor(-1);
        l10.setText((CharSequence) null);
        frameLayout3.addView(l10, w7.b6.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        while (true) {
            if (i11 >= 12) {
                break;
            }
            wc0 wc0Var = new wc0(context);
            w7.e6.b(wc0Var, 0.15f, 1.5f);
            wc0Var.setTag(Integer.valueOf(i11));
            int[] iArr = i0;
            if (i11 == 11) {
                wc0Var.setBackground(f(wc0Var));
                int L = org.telegram.messenger.i0.L(30.0f);
                wc0Var.setForeground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 0, 654311423, 654311423));
                wc0Var.setImage(R.drawable.filled_clear);
                wc0Var.setOnLongClickListener(new r00(this, i12));
                wc0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754920, null));
                wc0Var.setNextFocusForwardId(R.id.passcode_btn_0);
                wc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
            } else if (i11 == 10) {
                this.n = wc0Var;
                wc0Var.setBackground(f(wc0Var));
                int L2 = org.telegram.messenger.i0.L(30.0f);
                wc0Var.setForeground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, 654311423, 654311423));
                wc0Var.setContentDescription(org.telegram.messenger.cd.L0(2131754881, null));
                wc0Var.setImage(R.drawable.fingerprint);
                wc0Var.setNextFocusForwardId(R.id.passcode_btn_1);
                wc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_1);
            } else {
                wc0Var.setBackground(f(wc0Var));
                int L3 = org.telegram.messenger.i0.L(30.0f);
                wc0Var.setForeground(org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, 654311423, 654311423));
                wc0Var.setContentDescription(i11 + "");
                wc0Var.setNum(i11);
                if (i11 == 0) {
                    wc0Var.setNextFocusForwardId(R.id.passcode_btn_backspace);
                    wc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_backspace);
                } else if (i11 != 9) {
                    int i13 = iArr[i11 + 1];
                    wc0Var.setNextFocusForwardId(i13);
                    wc0Var.setAccessibilityTraversalBefore(i13);
                } else if (g()) {
                    wc0Var.setNextFocusForwardId(R.id.passcode_btn_fingerprint);
                    wc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_fingerprint);
                } else {
                    wc0Var.setNextFocusForwardId(R.id.passcode_btn_0);
                    wc0Var.setAccessibilityTraversalBefore(R.id.passcode_btn_0);
                }
            }
            wc0Var.setId(iArr[i11]);
            final int i14 = 2;
            wc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.oc0
                public final /* synthetic */ zc0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v30, types: [java.util.LinkedList] */
                /* JADX WARN: Type inference failed for: r3v10 */
                /* JADX WARN: Type inference failed for: r3v5, types: [java.util.LinkedList] */
                /* JADX WARN: Type inference failed for: r3v7 */
                /* JADX WARN: Type inference failed for: r3v8, types: [int] */
                /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList, java.util.List] */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v2, types: [int] */
                /* JADX WARN: Type inference failed for: r7v3 */
                /* JADX WARN: Type inference failed for: r7v4, types: [int] */
                /* JADX WARN: Type inference failed for: r7v7 */
                /* JADX WARN: Type inference failed for: r7v8 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zc0 zc0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    boolean z10;
                    boolean z11;
                    LinkedList linkedList3;
                    int i132;
                    int i142;
                    zc0 zc0Var2;
                    boolean z12;
                    boolean z13;
                    int i15 = i14;
                    zc0 zc0Var3 = this.b;
                    switch (i15) {
                        case 0:
                            zc0Var3.n(false);
                            break;
                        case 1:
                            zc0Var3.c();
                            break;
                        default:
                            LinkedList linkedList4 = zc0Var3.V;
                            LinkedList linkedList5 = zc0Var3.U;
                            uc0 uc0Var2 = zc0Var3.s;
                            if (zc0Var3.f0 && !zc0Var3.P) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("0");
                                        z11 = z10;
                                        break;
                                    case 1:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("1");
                                        z11 = z10;
                                        break;
                                    case 2:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("2");
                                        z11 = z10;
                                        break;
                                    case 3:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("3");
                                        z11 = z10;
                                        break;
                                    case 4:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("4");
                                        z11 = z10;
                                        break;
                                    case 5:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("5");
                                        z11 = z10;
                                        break;
                                    case 6:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("6");
                                        z11 = z10;
                                        break;
                                    case 7:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("7");
                                        z11 = z10;
                                        break;
                                    case 8:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("8");
                                        z11 = z10;
                                        break;
                                    case 9:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        uc0Var2.b("9");
                                        z11 = z10;
                                        break;
                                    case 10:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        zc0Var.c();
                                        z11 = z10;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) uc0Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        z10 = false;
                                        ArrayList arrayList2 = (ArrayList) uc0Var2.b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) uc0Var2.d;
                                        if (sb2.length() == 0) {
                                            zc0Var = zc0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z11 = z10;
                                            break;
                                        } else {
                                            try {
                                                uc0Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                org.telegram.messenger.f8.g(e, true);
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
                                                zc0 zc0Var4 = zc0Var3;
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
                                                    fArr5[0] = uc0Var2.c(i17);
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
                                                    float c10 = uc0Var2.c(i17);
                                                    i142 = i17;
                                                    float[] fArr10 = new float[i132];
                                                    fArr10[0] = c10;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                                } else {
                                                    i142 = i17;
                                                }
                                                i17 = i142 + 1;
                                                linkedList5 = linkedList3;
                                                zc0Var3 = zc0Var4;
                                                i16 = 1;
                                            }
                                            zc0Var = zc0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, uc0Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, uc0Var2.c(i18)));
                                            }
                                            le leVar = (le) uc0Var2.f;
                                            if (leVar != null) {
                                                org.telegram.messenger.i0.r(leVar);
                                                uc0Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) uc0Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            uc0Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) uc0Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) uc0Var2.e).addListener(new tc0(uc0Var2, 1));
                                            ((AnimatorSet) uc0Var2.e).start();
                                            zc0.a((zc0) uc0Var2.h);
                                            z11 = true;
                                            break;
                                        }
                                    default:
                                        zc0Var = zc0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z11 = z10;
                                        break;
                                }
                                if (intValue == 11) {
                                    zc0Var2 = zc0Var;
                                } else {
                                    zc0Var2 = zc0Var;
                                    Drawable drawable = zc0Var2.a;
                                    if (drawable instanceof jb0) {
                                        jb0 jb0Var = (jb0) drawable;
                                        jb0Var.D = null;
                                        jb0Var.y();
                                        float f7 = jb0Var.h;
                                        if (intValue == 10) {
                                            if (z11) {
                                                jb0Var.x();
                                                z13 = true;
                                            } else {
                                                z13 = z10;
                                            }
                                            z12 = z10;
                                        } else {
                                            z12 = true;
                                            jb0Var.w(true);
                                            z13 = true;
                                        }
                                        if (z13) {
                                            if (f7 >= 1.0f) {
                                                zc0Var2.b(jb0Var);
                                            } else {
                                                ?? r32 = linkedList2;
                                                r32.offer(new ag.j0(zc0Var2, z12, jb0Var, 19));
                                                ?? r22 = linkedList;
                                                r22.offer(Boolean.valueOf(z12));
                                                ?? arrayList4 = new ArrayList();
                                                ?? arrayList5 = new ArrayList();
                                                for (?? r72 = z10; r72 < r32.size(); r72++) {
                                                    Runnable runnable = (Runnable) r32.get(r72);
                                                    Boolean bool = (Boolean) r22.get(r72);
                                                    if (bool != null && bool.booleanValue() != z12) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf((int) r72));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                for (?? r73 = z10; r73 < size; r73++) {
                                                    r32.remove((Runnable) arrayList4.get(r73));
                                                }
                                                Collections.sort(arrayList5, new org.telegram.ui.f6(13));
                                                int size2 = arrayList5.size();
                                                for (?? r33 = z10; r33 < size2; r33++) {
                                                    r22.remove(((Integer) arrayList5.get(r33)).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) uc0Var2.d).length() == 4) {
                                    zc0Var2.n(z10);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.f.add(wc0Var);
            i11++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f.get(i10), w7.b6.e(60, 60, 51));
        }
        d();
    }

    public static void a(zc0 zc0Var) {
        FrameLayout frameLayout = zc0Var.b;
        uc0 uc0Var = zc0Var.s;
        boolean z10 = uc0Var == null || ((StringBuilder) uc0Var.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.messenger.z20.m(frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f), gr.h, 320L);
        }
    }

    public final void b(jb0 jb0Var) {
        o1.j jVar = this.T;
        if (jVar != null && jVar.f) {
            jVar.d();
        }
        o1.i iVar = new o1.i(0.0f);
        jb0Var.D = new px(iVar, 9);
        jb0Var.y();
        o1.j jVar2 = new o1.j(iVar);
        jVar2.m = org.telegram.ui.Cells.f1.p(100.0f, 300.0f, 1.0f);
        this.T = jVar2;
        jVar2.a(new za(3, this, jb0Var));
        this.T.b(new a7(jb0Var, 5));
        this.T.h();
    }

    public final void c() {
        Activity W;
        bd0 bd0Var;
        if (this.P || (W = org.telegram.messenger.i0.W(getContext())) == null || this.n.getVisibility() != 0 || org.telegram.messenger.w0.x) {
            return;
        }
        if (W instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) W;
            ArrayList arrayList = launchActivity.B0;
            if (!arrayList.isEmpty() || (bd0Var = launchActivity.A0) == null) {
                if (i0.a.g(1, arrayList) != this) {
                    return;
                }
            } else if (this != bd0Var.b) {
                return;
            }
        }
        try {
            int i10 = 0;
            if (new android.support.v4.media.session.a0(new androidx.biometric.s(getContext(), 0)).h(15) == 0 && org.telegram.messenger.d6.h() && !org.telegram.messenger.d6.a()) {
                k6.h hVar = new k6.h(LaunchActivity.I1, f0.c.d(getContext()), new pc0(this, i10));
                j6.m mVar = new j6.m(1);
                mVar.b = org.telegram.messenger.cd.L0(2131743875, null);
                mVar.d = org.telegram.messenger.cd.L0(2131743818, null);
                mVar.a = 15;
                hVar.a(mVar.c(), null);
                o(false);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void d() {
        boolean g10 = g();
        int i10 = g10 ? 0 : 8;
        wc0 wc0Var = this.n;
        wc0Var.setVisibility(i10);
        if (org.telegram.messenger.tz.r == 1) {
            this.E.setVisibility(wc0Var.getVisibility());
        }
        this.c.setText(org.telegram.messenger.cd.L0(org.telegram.messenger.tz.r == 1 ? 2131751117 : g10 ? 2131751118 : 2131751119, null));
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.Q1) {
            if (i10 != org.telegram.messenger.zs.o0 || objArr[0] == this) {
                return;
            }
            setVisibility(8);
            return;
        }
        d();
        if (((Boolean) objArr[0]).booleanValue() && org.telegram.messenger.tz.x) {
            c();
        }
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > org.telegram.messenger.tz.u) {
            long j10 = org.telegram.messenger.tz.t - (elapsedRealtime - org.telegram.messenger.tz.u);
            org.telegram.messenger.tz.t = j10;
            if (j10 < 0) {
                org.telegram.messenger.tz.t = 0L;
            }
        }
        org.telegram.messenger.tz.u = elapsedRealtime;
        org.telegram.messenger.tz.y();
        long j11 = org.telegram.messenger.tz.t;
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        ew ewVar = this.c0;
        TextView textView = this.y;
        if (j11 <= 0) {
            org.telegram.messenger.i0.r(ewVar);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                o(true);
                if (org.telegram.messenger.tz.r == 1) {
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
        if (max != this.d0) {
            textView.setText(org.telegram.messenger.cd.a0(null, null, 2131744061, org.telegram.messenger.cd.G(max, "Seconds", new Object[0])));
            this.d0 = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            o(false);
            org.telegram.messenger.i0.v1(editTextBoldCursor);
        }
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 100L);
    }

    public final yc0 f(wc0 wc0Var) {
        wg.d dVar = new wg.d(null);
        dVar.e = new au(10);
        if (Build.VERSION.SDK_INT < 29) {
            dVar.f(1308622847, 1308622847);
            dVar.e(452984831, 452984831);
            float N = org.telegram.messenger.i0.N(1.0f);
            float N2 = org.telegram.messenger.i0.N(0.6666667f);
            dVar.f = N;
            dVar.h = N2;
        }
        vg.f c10 = this.I.c(wc0Var, dVar, true);
        c10.q(org.telegram.messenger.i0.L(30.0f));
        return new yc0(c10);
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
        if (org.telegram.messenger.i0.W(getContext()) != null && org.telegram.messenger.tz.D) {
            try {
                Context context = org.telegram.messenger.w0.b;
                try {
                    fingerprintManager2 = (FingerprintManager) context.getSystemService("fingerprint");
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (fingerprintManager2 != null) {
                    z10 = fingerprintManager2.isHardwareDetected();
                    if (z10) {
                        try {
                            fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        if (fingerprintManager != null) {
                            z11 = fingerprintManager.hasEnrolledFingerprints();
                            if (z11 && org.telegram.messenger.d6.h()) {
                                if (org.telegram.messenger.d6.a()) {
                                    return true;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            if (org.telegram.messenger.d6.a()) {
                            }
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        return false;
    }

    public final boolean i() {
        vh.r2 r2Var = this.e0;
        if (r2Var == null || !r2Var.c()) {
            return true;
        }
        org.telegram.messenger.i0.v1(this.r);
        return false;
    }

    public final void k() {
        org.telegram.messenger.i0.r(this.c0);
    }

    public final void l() {
        if (this.P) {
            return;
        }
        e();
        if (this.y.getVisibility() != 0) {
            if (org.telegram.messenger.tz.r == 1) {
                EditTextBoldCursor editTextBoldCursor = this.r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                }
                org.telegram.messenger.i0.h3(new mc0(this, 0), 200L);
            }
            c();
        }
    }

    public final void m(boolean z10, int i10, int i11, org.telegram.ui.f70 f70Var) {
        View currentFocus;
        boolean z11;
        int i12;
        int i13;
        if (getVisibility() != 0) {
            this.P = false;
        }
        d();
        e();
        Activity W = org.telegram.messenger.i0.W(getContext());
        int i14 = org.telegram.messenger.tz.r;
        TextView textView = this.y;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i14 == 1) {
            if (!z10 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
            }
        } else if (W != null && (currentFocus = W.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            org.telegram.messenger.i0.v1(W.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.a = null;
        boolean z12 = org.telegram.ui.ActionBar.t6.s0() instanceof jb0;
        fg.i iVar = this.w;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.t6.I.q();
            this.a = org.telegram.ui.ActionBar.t6.s0();
            iVar.setBackgroundColor(-1090519040);
        } else {
            if (!org.telegram.ui.ActionBar.t6.W || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.t6.K0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.t6.K0())) {
                if (!"d".equals(org.telegram.ui.ActionBar.t6.K0())) {
                    String K0 = org.telegram.ui.ActionBar.t6.K0();
                    if (!org.telegram.ui.ActionBar.t6.j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(K0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(K0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.t6.s0();
                        this.a = s02;
                        if (s02 instanceof f9) {
                            iVar.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            iVar.setBackgroundColor(-1090519040);
                        } else {
                            iVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                iVar.setBackgroundColor(-11436898);
            } else {
                org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.t6.I.i0;
                f9 f9Var = (m6Var == null || (i12 = m6Var.d) == 0 || (i13 = m6Var.e) == 0) ? null : new f9(f9.d(m6Var.h), new int[]{i12, i13});
                this.a = f9Var;
                if (f9Var == null) {
                    this.a = org.telegram.ui.ActionBar.t6.s0();
                }
                if (this.a instanceof f9) {
                    iVar.setBackgroundColor(570425344);
                } else {
                    iVar.setBackgroundColor(-1090519040);
                }
            }
            z11 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof jb0) {
            jb0 jb0Var = (jb0) drawable;
            int[] iArr = jb0Var.a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.t6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.a = new jb0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (jb0Var.u == null || jb0Var.q >= 0) {
                iVar.setBackgroundColor(570425344);
            } else {
                iVar.setBackgroundColor(2130706432);
            }
            ((jb0) this.a).q(iVar);
        }
        this.x.setText(org.telegram.messenger.cd.L0(2131754232, null));
        int i16 = org.telegram.messenger.tz.r;
        ImageView imageView = this.E;
        ImageView imageView2 = this.D;
        org.telegram.ui.Cells.a5 a5Var = this.e;
        uc0 uc0Var = this.s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                a5Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            uc0Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(org.telegram.messenger.zs.N1);
            a5Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            uc0Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        uc0.a(uc0Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new sc0(this, i10, i11, f70Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.a0 = 1.0f;
            h(1.0f);
            ei0 ei0Var = this.M;
            ei0Var.setScaleX(1.0f);
            ei0Var.setScaleY(1.0f);
            ei0Var.i();
            ei0Var.getAnimatedDrawable().N(38, false, false);
            if (f70Var != null) {
                f70Var.run();
            }
        }
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(18));
    }

    public final void n(boolean z10) {
        if (this.P || getVisibility() != 0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (!z10) {
            if (org.telegram.messenger.tz.t > 0) {
                return;
            }
            int i10 = org.telegram.messenger.tz.r;
            uc0 uc0Var = this.s;
            String sb2 = i10 == 0 ? ((StringBuilder) uc0Var.d).toString() : i10 == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb2.length();
            FrameLayout frameLayout = this.b;
            org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.s;
            if (length == 0) {
                t2Var.a();
                int i11 = -this.b0;
                this.b0 = i11;
                org.telegram.messenger.i0.F3(i11, frameLayout, null);
                return;
            }
            if (!org.telegram.messenger.tz.g(sb2)) {
                org.telegram.messenger.tz.r();
                if (org.telegram.messenger.tz.t > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                uc0.a(uc0Var, true);
                t2Var.a();
                int i12 = -this.b0;
                this.b0 = i12;
                org.telegram.messenger.i0.F3(i12, frameLayout, null);
                Drawable drawable = this.a;
                if (drawable instanceof jb0) {
                    jb0 jb0Var = (jb0) drawable;
                    LinkedList linkedList = this.U;
                    linkedList.clear();
                    LinkedList linkedList2 = this.V;
                    linkedList2.clear();
                    o1.j jVar = this.T;
                    if (jVar == null || !jVar.f) {
                        jb0Var.m(true);
                        return;
                    } else {
                        linkedList.offer(new ib0(jb0Var, 1));
                        linkedList2.offer(Boolean.FALSE);
                        return;
                    }
                }
                return;
            }
        }
        this.P = true;
        k();
        org.telegram.messenger.tz.v = 0;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.i0.v1(editTextBoldCursor);
        if (org.telegram.messenger.d6.h() && org.telegram.messenger.d6.a()) {
            try {
                org.telegram.messenger.d6.e().deleteEntry("tmessages_passcode");
            } catch (KeyStoreException e) {
                org.telegram.messenger.f8.g(e, true);
            }
            org.telegram.messenger.d6.f = null;
            org.telegram.messenger.d6.b(false);
        }
        org.telegram.messenger.tz.x = false;
        org.telegram.messenger.tz.y();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.n0, new Object[0]);
        setOnTouchListener(null);
        xc0 xc0Var = this.O;
        if (xc0Var != null) {
            xc0Var.o(this);
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
        ei0 ei0Var = this.M;
        ei0Var.getAnimatedDrawable().P(71);
        ei0Var.getAnimatedDrawable().N(37, false, false);
        ei0Var.d();
        org.telegram.messenger.i0.g3(new mc0(this, 1));
    }

    public final void o(boolean z10) {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f0 = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new nc0(this, 0));
        this.g0.addListener(new ha0(2, this, z10));
        this.g0.setInterpolator(gr.h);
        this.g0.setDuration(320L);
        this.g0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.Q1);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.o0);
        if (this.e0 == null && (getParent() instanceof View)) {
            this.e0 = new vh.r2((View) getParent(), false, new r2(this, 8));
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
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.Q1);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.o0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.q1(rootView);
        Rect rect = this.N;
        getWindowVisibleDisplayFrame(rect);
        this.G = height - (rect.bottom - rect.top);
        if (org.telegram.messenger.tz.r == 1 && (org.telegram.messenger.i0.Q1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            int intValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((intValue + layoutParams.height) - (this.G / 2)) - org.telegram.messenger.i0.m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i10, i11, i12, i13);
        TextView textView = this.x;
        int[] iArr = this.h0;
        textView.getLocationInWindow(iArr);
        boolean Q1 = org.telegram.messenger.i0.Q1();
        ei0 ei0Var = this.M;
        if (Q1 || getContext().getResources().getConfiguration().orientation != 2) {
            int L = iArr[1] - org.telegram.messenger.i0.L(100.0f);
            this.L = L;
            ei0Var.setTranslationY(L);
        } else {
            int L2 = iArr[1] - org.telegram.messenger.i0.L(100.0f);
            this.L = L2;
            ei0Var.setTranslationY(L2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = org.telegram.messenger.i0.q.y;
        int L = org.telegram.messenger.i0.L(28.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f);
        int L3 = org.telegram.messenger.i0.L(60.0f);
        boolean z10 = !org.telegram.messenger.i0.Q1() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.F;
        if (view != null) {
            view.setVisibility(org.telegram.messenger.tz.r == 1 ? 0 : 8);
        }
        ei0 ei0Var = this.M;
        org.telegram.ui.Cells.a5 a5Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (org.telegram.messenger.tz.r == 0) {
                f7 = 2.0f;
                f10 = size / 2.0f;
            } else {
                f7 = 2.0f;
                f10 = size;
            }
            ei0Var.setTranslationX((f10 / f7) - org.telegram.messenger.i0.L(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = org.telegram.messenger.tz.r == 0 ? size / 2 : size;
            layoutParams.height = org.telegram.messenger.i0.L(180.0f);
            layoutParams.topMargin = org.telegram.messenger.z20.y(140.0f, i14, 2) + (org.telegram.messenger.tz.r == 0 ? org.telegram.messenger.i0.L(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i14;
            int i15 = size / 2;
            layoutParams2.leftMargin = i15;
            layoutParams2.topMargin = org.telegram.messenger.i0.m;
            layoutParams2.width = i15;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) a5Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.i0.L(82.0f);
            layoutParams3.width = (Math.max(0, 2) * L) + (L3 * 3);
            layoutParams3.gravity = 17;
            a5Var.setLayoutParams(layoutParams3);
            i13 = 0;
        } else {
            ei0Var.setTranslationX((size / 2.0f) - org.telegram.messenger.i0.L(29.0f));
            int i16 = org.telegram.messenger.i0.m;
            if (org.telegram.messenger.i0.Q1()) {
                if (size > org.telegram.messenger.i0.L(498.0f)) {
                    i12 = org.telegram.messenger.z20.y(498.0f, size, 2);
                    size = org.telegram.messenger.i0.L(498.0f);
                } else {
                    i12 = 0;
                }
                if (i14 > org.telegram.messenger.i0.L(528.0f)) {
                    i16 = org.telegram.messenger.z20.y(528.0f, i14, 2);
                    i14 = org.telegram.messenger.i0.L(528.0f);
                }
            } else {
                i12 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams4.height = (i14 / 3) + (org.telegram.messenger.tz.r == 0 ? org.telegram.messenger.i0.L(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = i16;
            layoutParams4.leftMargin = i12;
            frameLayout2.setTag(Integer.valueOf(i16));
            frameLayout2.setLayoutParams(layoutParams4);
            int i17 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) a5Var.getLayoutParams();
            i13 = 0;
            layoutParams5.height = (Math.max(0, 3) * L2) + (L3 * 4) + org.telegram.messenger.i0.L(82.0f);
            layoutParams5.width = (Math.max(0, 2) * L) + (L3 * 3);
            if (org.telegram.messenger.i0.Q1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            a5Var.setLayoutParams(layoutParams5);
            int i18 = i14 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i12;
            if (org.telegram.messenger.i0.Q1()) {
                layoutParams6.topMargin = (i14 - i18) / 2;
            } else {
                layoutParams6.topMargin = i17;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        int L4 = org.telegram.messenger.i0.L(z10 ? 52.0f : 82.0f);
        int i19 = i13;
        while (i19 < 12) {
            int i20 = 10;
            if (i19 != 0) {
                i20 = i19 == 10 ? 11 : i19 == 11 ? 9 : i19 - 1;
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f.get(i19);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i20 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i20 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
            i19++;
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(xc0 xc0Var) {
        this.O = xc0Var;
    }

    public void h(float f7) {
    }

    public void j() {
    }
}
