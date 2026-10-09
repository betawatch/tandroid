package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class te0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] e0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final View F;
    public int G;
    public int H;
    public final fk0 I;
    public final Rect J;
    public se0 K;
    public boolean L;
    public AnimatorSet M;
    public AnimatorSet N;
    public ValueAnimator O;
    public o1.k P;
    public final LinkedList Q;
    public final LinkedList R;
    public final ArrayList S;
    public float T;
    public int U;
    public final org.telegram.ui.Cells.t6 V;
    public int W;
    public Drawable a;
    public ci.h4 a0;
    public final FrameLayout b;
    public boolean b0;
    public final TextView c;
    public ValueAnimator c0;
    public final FrameLayout d;
    public final int[] d0;
    public final ai.x5 e;
    public final ArrayList f;
    public final FrameLayout h;
    public final re0 n;
    public final EditTextBoldCursor r;
    public final ci.j9 s;
    public final ci.m6 v;
    public final TextView w;
    public final TextView x;
    public final ImageView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te0(Context context) {
        super(context);
        int i10;
        String string = LocaleController.getString(R.string.UnlockToUse);
        this.G = 0;
        this.J = new Rect();
        this.Q = new LinkedList();
        this.R = new LinkedList();
        this.S = new ArrayList();
        this.U = -12;
        this.V = new org.telegram.ui.Cells.t6(this, 17);
        this.b0 = true;
        this.d0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ci.m6 m6Var = new ci.m6(this, context);
        this.v = m6Var;
        m6Var.setWillNotDraw(false);
        addView(m6Var, w7.x5.d(-1.0f, -1));
        fk0 fk0Var = new fk0(context);
        this.I = fk0Var;
        fk0Var.f(R.raw.passcode_lock, 58, 58, null);
        fk0Var.setAutoRepeat(false);
        addView(fk0Var, w7.x5.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        m6Var.addView(frameLayout, w7.x5.d(-1.0f, -1));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 128.0f, -2, 81), context);
        this.x = g10;
        g10.setTextColor(-1);
        g10.setTextSize(1, 15.0f);
        g10.setGravity(1);
        g10.setVisibility(4);
        m6Var.addView(g10, w7.x5.e(-2, -2, 17));
        ci.j9 j9Var = new ci.j9(this, context);
        this.s = j9Var;
        frameLayout.addView(j9Var, w7.x5.a(-2.0f, 70.0f, 0.0f, 70.0f, 46.0f, -1, 81));
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
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(32.0f));
        frameLayout.addView(editTextBoldCursor, w7.x5.a(-2.0f, 70.0f, 0.0f, 70.0f, 0.0f, -1, 81));
        editTextBoldCursor.setOnEditorActionListener(new e1(this, 4));
        editTextBoldCursor.addTextChangedListener(new ci.h2(this, 10));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new ii.d1(1));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, w7.x5.a(60.0f, 0.0f, 0.0f, 10.0f, 4.0f, 60, 85));
        imageView.setContentDescription(LocaleController.getString(R.string.Done));
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ke0
            public final /* synthetic */ te0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i13;
                int i14;
                int i15;
                boolean z12;
                boolean z13;
                int i16 = i11;
                te0 te0Var = this.b;
                switch (i16) {
                    case 0:
                        te0Var.m(false);
                        break;
                    case 1:
                        te0Var.c();
                        break;
                    default:
                        LinkedList linkedList4 = te0Var.R;
                        LinkedList linkedList5 = te0Var.Q;
                        ci.j9 j9Var2 = te0Var.s;
                        if (te0Var.b0 && !te0Var.L) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    j9Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    te0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) j9Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) j9Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i17 = 1;
                                    StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i12 = intValue;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            j9Var2.performHapticFeedback(3);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i18 = length;
                                        while (i18 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i18);
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i13 = intValue;
                                                i14 = i17;
                                                float[] fArr = new float[i14];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i14];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i14];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i14];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                float[] fArr5 = new float[i14];
                                                fArr5[0] = j9Var2.c(i18);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i13 = intValue;
                                                i14 = i17;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i18);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i14];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                float[] fArr7 = new float[i14];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                float[] fArr8 = new float[i14];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                float[] fArr9 = new float[i14];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                float c10 = j9Var2.c(i18);
                                                i15 = i18;
                                                float[] fArr10 = new float[i14];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i15 = i18;
                                            }
                                            i18 = i15 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i13;
                                            i17 = 1;
                                        }
                                        linkedList2 = linkedList5;
                                        i12 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i19 = 0; i19 < length; i19++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i19), (Property<TextView, Float>) property5, j9Var2.c(i19)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i19), (Property<TextView, Float>) property5, j9Var2.c(i19)));
                                        }
                                        lf lfVar = (lf) j9Var2.f;
                                        if (lfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(lfVar);
                                            j9Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) j9Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        j9Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) j9Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) j9Var2.e).addListener(new pe0(j9Var2, 1));
                                        ((AnimatorSet) j9Var2.e).start();
                                        te0.a((te0) j9Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (((StringBuilder) j9Var2.d).length() == 4) {
                                te0Var.m(z10);
                            }
                            int i20 = 11;
                            int i21 = i12;
                            if (i21 != 11) {
                                Drawable drawable = te0Var.a;
                                if (drawable instanceof cd0) {
                                    cd0 cd0Var = (cd0) drawable;
                                    cd0Var.D = null;
                                    cd0Var.z();
                                    float f7 = cd0Var.h;
                                    if (i21 == 10) {
                                        if (z11) {
                                            cd0Var.y();
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                        cd0Var.x(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            te0Var.b(cd0Var);
                                            break;
                                        } else {
                                            ci.x0 x0Var = new ci.x0(te0Var, z12, cd0Var, 21);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(x0Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z12));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i22 = 0; i22 < linkedList6.size(); i22++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i22);
                                                Boolean bool = (Boolean) linkedList7.get(i22);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i22));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i23 = 0;
                                            while (i23 < size) {
                                                Object obj = arrayList4.get(i23);
                                                i23++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.gf(i20));
                                            int size2 = arrayList5.size();
                                            int i24 = 0;
                                            while (i24 < size2) {
                                                Object obj2 = arrayList5.get(i24);
                                                i24++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                            break;
                                        }
                                    }
                                }
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
        frameLayout.addView(imageView2, w7.x5.a(60.0f, 10.0f, 0.0f, 0.0f, 4.0f, 60, 83));
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        final int i12 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ke0
            public final /* synthetic */ te0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i122;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i13;
                int i14;
                int i15;
                boolean z12;
                boolean z13;
                int i16 = i12;
                te0 te0Var = this.b;
                switch (i16) {
                    case 0:
                        te0Var.m(false);
                        break;
                    case 1:
                        te0Var.c();
                        break;
                    default:
                        LinkedList linkedList4 = te0Var.R;
                        LinkedList linkedList5 = te0Var.Q;
                        ci.j9 j9Var2 = te0Var.s;
                        if (te0Var.b0 && !te0Var.L) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    j9Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    te0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) j9Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) j9Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i17 = 1;
                                    StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            j9Var2.performHapticFeedback(3);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i18 = length;
                                        while (i18 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i18);
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i13 = intValue;
                                                i14 = i17;
                                                float[] fArr = new float[i14];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i14];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i14];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i14];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                float[] fArr5 = new float[i14];
                                                fArr5[0] = j9Var2.c(i18);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i13 = intValue;
                                                i14 = i17;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i18);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i14];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                float[] fArr7 = new float[i14];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                float[] fArr8 = new float[i14];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                float[] fArr9 = new float[i14];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                float c10 = j9Var2.c(i18);
                                                i15 = i18;
                                                float[] fArr10 = new float[i14];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i15 = i18;
                                            }
                                            i18 = i15 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i13;
                                            i17 = 1;
                                        }
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i19 = 0; i19 < length; i19++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i19), (Property<TextView, Float>) property5, j9Var2.c(i19)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i19), (Property<TextView, Float>) property5, j9Var2.c(i19)));
                                        }
                                        lf lfVar = (lf) j9Var2.f;
                                        if (lfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(lfVar);
                                            j9Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) j9Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        j9Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) j9Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) j9Var2.e).addListener(new pe0(j9Var2, 1));
                                        ((AnimatorSet) j9Var2.e).start();
                                        te0.a((te0) j9Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (((StringBuilder) j9Var2.d).length() == 4) {
                                te0Var.m(z10);
                            }
                            int i20 = 11;
                            int i21 = i122;
                            if (i21 != 11) {
                                Drawable drawable = te0Var.a;
                                if (drawable instanceof cd0) {
                                    cd0 cd0Var = (cd0) drawable;
                                    cd0Var.D = null;
                                    cd0Var.z();
                                    float f7 = cd0Var.h;
                                    if (i21 == 10) {
                                        if (z11) {
                                            cd0Var.y();
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                        cd0Var.x(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            te0Var.b(cd0Var);
                                            break;
                                        } else {
                                            ci.x0 x0Var = new ci.x0(te0Var, z12, cd0Var, 21);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(x0Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z12));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i22 = 0; i22 < linkedList6.size(); i22++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i22);
                                                Boolean bool = (Boolean) linkedList7.get(i22);
                                                if (bool != null && bool.booleanValue() != z12) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i22));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i23 = 0;
                                            while (i23 < size) {
                                                Object obj = arrayList4.get(i23);
                                                i23++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new org.telegram.ui.gf(i20));
                                            int size2 = arrayList5.size();
                                            int i24 = 0;
                                            while (i24 < size2) {
                                                Object obj2 = arrayList5.get(i24);
                                                i24++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        View view = new View(context);
        this.F = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        m6Var.addView(frameLayout2, w7.x5.e(-1, -1, 51));
        ai.x5 x5Var = new ai.x5(context, 17);
        this.e = x5Var;
        frameLayout2.addView(x5Var, w7.x5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        x5Var.addView(frameLayout3, w7.x5.e(-2, -2, 49));
        TextView f7 = org.telegram.messenger.q.f(context, 1, 15.0f);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextColor(-1);
        f7.setText(string);
        TextView g11 = org.telegram.ui.Cells.c1.g(frameLayout3, f7, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 49), context);
        this.c = g11;
        g11.setTextSize(1, 14.0f);
        g11.setTextColor(-1);
        g11.setText((CharSequence) null);
        frameLayout3.addView(g11, w7.x5.a(-2.0f, 0.0f, 23.0f, 0.0f, 0.0f, -2, 49));
        this.f = new ArrayList(10);
        int i13 = 0;
        while (true) {
            if (i13 >= 12) {
                break;
            }
            re0 re0Var = new re0(context);
            w7.z5.b(re0Var, 0.15f, 1.5f);
            re0Var.setTag(Integer.valueOf(i13));
            int[] iArr = e0;
            if (i13 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                re0Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, 654311423, 654311423));
                re0Var.setImage(R.drawable.filled_clear);
                re0Var.setOnLongClickListener(new c20(this, 1));
                re0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                int i14 = R.id.passcode_btn_0;
                re0Var.setNextFocusForwardId(i14);
                re0Var.setAccessibilityTraversalBefore(i14);
            } else if (i13 == 10) {
                this.n = re0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                re0Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                re0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                re0Var.setImage(R.drawable.fingerprint);
                int i15 = R.id.passcode_btn_1;
                re0Var.setNextFocusForwardId(i15);
                re0Var.setAccessibilityTraversalBefore(i15);
            } else {
                int dp3 = AndroidUtilities.dp(30.0f);
                re0Var.setBackground(org.telegram.ui.ActionBar.i6.j0(dp3, dp3, dp3, dp3, 654311423, 1291845631, 1291845631));
                re0Var.setContentDescription(i13 + "");
                re0Var.setNum(i13);
                if (i13 == 0) {
                    int i16 = R.id.passcode_btn_backspace;
                    re0Var.setNextFocusForwardId(i16);
                    re0Var.setAccessibilityTraversalBefore(i16);
                } else if (i13 != 9) {
                    int i17 = iArr[i13 + 1];
                    re0Var.setNextFocusForwardId(i17);
                    re0Var.setAccessibilityTraversalBefore(i17);
                } else if (f()) {
                    int i18 = R.id.passcode_btn_fingerprint;
                    re0Var.setNextFocusForwardId(i18);
                    re0Var.setAccessibilityTraversalBefore(i18);
                } else {
                    int i19 = R.id.passcode_btn_0;
                    re0Var.setNextFocusForwardId(i19);
                    re0Var.setAccessibilityTraversalBefore(i19);
                }
            }
            re0Var.setId(iArr[i13]);
            final int i20 = 2;
            re0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ke0
                public final /* synthetic */ te0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i122;
                    boolean z10;
                    boolean z11;
                    LinkedList linkedList3;
                    int i132;
                    int i142;
                    int i152;
                    boolean z12;
                    boolean z13;
                    int i162 = i20;
                    te0 te0Var = this.b;
                    switch (i162) {
                        case 0:
                            te0Var.m(false);
                            break;
                        case 1:
                            te0Var.c();
                            break;
                        default:
                            LinkedList linkedList4 = te0Var.R;
                            LinkedList linkedList5 = te0Var.Q;
                            ci.j9 j9Var2 = te0Var.s;
                            if (te0Var.b0 && !te0Var.L) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("0");
                                        z11 = z10;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("1");
                                        z11 = z10;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("2");
                                        z11 = z10;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("3");
                                        z11 = z10;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("4");
                                        z11 = z10;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("5");
                                        z11 = z10;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("6");
                                        z11 = z10;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("7");
                                        z11 = z10;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("8");
                                        z11 = z10;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        j9Var2.b("9");
                                        z11 = z10;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        te0Var.c();
                                        z11 = z10;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) j9Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        z10 = false;
                                        ArrayList arrayList2 = (ArrayList) j9Var2.b;
                                        Property property5 = View.TRANSLATION_X;
                                        int i172 = 1;
                                        StringBuilder sb2 = (StringBuilder) j9Var2.d;
                                        if (sb2.length() == 0) {
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            i122 = intValue;
                                            z11 = z10;
                                            break;
                                        } else {
                                            try {
                                                j9Var2.performHapticFeedback(3);
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i182 = length;
                                            while (i182 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i182);
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i132 = intValue;
                                                    i142 = i172;
                                                    float[] fArr = new float[i142];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr));
                                                    float[] fArr2 = new float[i142];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr2));
                                                    float[] fArr3 = new float[i142];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr3));
                                                    float[] fArr4 = new float[i142];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, fArr4));
                                                    float[] fArr5 = new float[i142];
                                                    fArr5[0] = j9Var2.c(i182);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i132 = intValue;
                                                    i142 = i172;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i182);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr6 = new float[i142];
                                                    fArr6[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr6));
                                                    float[] fArr7 = new float[i142];
                                                    fArr7[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr7));
                                                    float[] fArr8 = new float[i142];
                                                    fArr8[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr8));
                                                    float[] fArr9 = new float[i142];
                                                    fArr9[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr9));
                                                    float c10 = j9Var2.c(i182);
                                                    i152 = i182;
                                                    float[] fArr10 = new float[i142];
                                                    fArr10[0] = c10;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                                } else {
                                                    i152 = i182;
                                                }
                                                i182 = i152 + 1;
                                                linkedList5 = linkedList3;
                                                intValue = i132;
                                                i172 = 1;
                                            }
                                            linkedList2 = linkedList5;
                                            i122 = intValue;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i192 = 0; i192 < length; i192++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i192), (Property<TextView, Float>) property5, j9Var2.c(i192)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i192), (Property<TextView, Float>) property5, j9Var2.c(i192)));
                                            }
                                            lf lfVar = (lf) j9Var2.f;
                                            if (lfVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(lfVar);
                                                j9Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) j9Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            j9Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) j9Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) j9Var2.e).addListener(new pe0(j9Var2, 1));
                                            ((AnimatorSet) j9Var2.e).start();
                                            te0.a((te0) j9Var2.h);
                                            z11 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        z11 = z10;
                                        break;
                                }
                                if (((StringBuilder) j9Var2.d).length() == 4) {
                                    te0Var.m(z10);
                                }
                                int i202 = 11;
                                int i21 = i122;
                                if (i21 != 11) {
                                    Drawable drawable = te0Var.a;
                                    if (drawable instanceof cd0) {
                                        cd0 cd0Var = (cd0) drawable;
                                        cd0Var.D = null;
                                        cd0Var.z();
                                        float f72 = cd0Var.h;
                                        if (i21 == 10) {
                                            if (z11) {
                                                cd0Var.y();
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            z12 = false;
                                        } else {
                                            z12 = true;
                                            cd0Var.x(true);
                                            z13 = true;
                                        }
                                        if (z13) {
                                            if (f72 >= 1.0f) {
                                                te0Var.b(cd0Var);
                                                break;
                                            } else {
                                                ci.x0 x0Var = new ci.x0(te0Var, z12, cd0Var, 21);
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(x0Var);
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z12));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i22 = 0; i22 < linkedList6.size(); i22++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i22);
                                                    Boolean bool = (Boolean) linkedList7.get(i22);
                                                    if (bool != null && bool.booleanValue() != z12) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf(i22));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                int i23 = 0;
                                                while (i23 < size) {
                                                    Object obj = arrayList4.get(i23);
                                                    i23++;
                                                    linkedList6.remove((Runnable) obj);
                                                }
                                                Collections.sort(arrayList5, new org.telegram.ui.gf(i202));
                                                int size2 = arrayList5.size();
                                                int i24 = 0;
                                                while (i24 < size2) {
                                                    Object obj2 = arrayList5.get(i24);
                                                    i24++;
                                                    linkedList7.remove(((Integer) obj2).intValue());
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            });
            this.f.add(re0Var);
            i13++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f.get(i10), w7.x5.e(60, 60, 51));
        }
        d();
    }

    public static void a(te0 te0Var) {
        FrameLayout frameLayout = te0Var.b;
        ci.j9 j9Var = te0Var.s;
        boolean z10 = j9Var == null || ((StringBuilder) j9Var.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.messenger.bi.t(frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f), hs.h, 320L);
        }
    }

    public final void b(cd0 cd0Var) {
        o1.k kVar = this.P;
        if (kVar != null && kVar.f) {
            kVar.c();
        }
        o1.j jVar = new o1.j(0.0f);
        cd0Var.D = new bw(jVar, 9);
        cd0Var.z();
        o1.k kVar2 = new o1.k(jVar);
        kVar2.u = org.telegram.ui.Cells.c1.j(100.0f, 300.0f, 1.0f);
        this.P = kVar2;
        kVar2.a(new ei.l4(4, this, cd0Var));
        this.P.b(new m7(cd0Var, 5));
        this.P.h();
    }

    public final void c() {
        Activity findActivity;
        ve0 ve0Var;
        if (this.L || (findActivity = AndroidUtilities.findActivity(getContext())) == null || this.n.getVisibility() != 0 || ApplicationLoader.mainInterfacePaused) {
            return;
        }
        if (findActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) findActivity;
            ArrayList arrayList = launchActivity.B0;
            if (!arrayList.isEmpty() || (ve0Var = launchActivity.A0) == null) {
                if (hg.c.g(1, arrayList) != this) {
                    return;
                }
            } else if (this != ve0Var.b) {
                return;
            }
        }
        try {
            if (new aa.a(new k6.h(getContext(), 1)).f(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                pb.c cVar = new pb.c(LaunchActivity.G1, f0.c.d(getContext()), new le0(this));
                j6.l lVar = new j6.l(2);
                lVar.b = LocaleController.getString(R.string.UnlockToUse);
                lVar.d = LocaleController.getString(R.string.UsePIN);
                lVar.a = 15;
                cVar.l(lVar.b(), null);
                n(false);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void d() {
        boolean f7 = f();
        int i10 = f7 ? 0 : 8;
        re0 re0Var = this.n;
        re0Var.setVisibility(i10);
        if (SharedConfig.passcodeType == 1) {
            this.E.setVisibility(re0Var.getVisibility());
        }
        this.c.setText(LocaleController.getString(SharedConfig.passcodeType == 1 ? R.string.EnterPassword : f7 ? R.string.EnterPINorFingerprint : R.string.EnterPIN));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.didGenerateFingerprintKeyPair) {
            if (i10 != NotificationCenter.passcodeDismissed || objArr[0] == this) {
                return;
            }
            setVisibility(8);
            return;
        }
        d();
        if (((Boolean) objArr[0]).booleanValue() && SharedConfig.appLocked) {
            c();
        }
    }

    public final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > SharedConfig.lastUptimeMillis) {
            long j3 = SharedConfig.passcodeRetryInMs - (elapsedRealtime - SharedConfig.lastUptimeMillis);
            SharedConfig.passcodeRetryInMs = j3;
            if (j3 < 0) {
                SharedConfig.passcodeRetryInMs = 0L;
            }
        }
        SharedConfig.lastUptimeMillis = elapsedRealtime;
        SharedConfig.saveConfig();
        long j10 = SharedConfig.passcodeRetryInMs;
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        org.telegram.ui.Cells.t6 t6Var = this.V;
        TextView textView = this.x;
        if (j10 <= 0) {
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                n(true);
                if (SharedConfig.passcodeType == 1) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
        if (max != this.W) {
            textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
            this.W = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            n(false);
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.cancelRunOnUIThread(t6Var);
        AndroidUtilities.runOnUIThread(t6Var, 100L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        boolean z10;
        boolean z11;
        FingerprintManager fingerprintManager;
        FingerprintManager fingerprintManager2;
        if (AndroidUtilities.findActivity(getContext()) != null && SharedConfig.useFingerprintLock) {
            try {
                Context context = ApplicationLoader.applicationContext;
                try {
                    fingerprintManager2 = (FingerprintManager) context.getSystemService("fingerprint");
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (fingerprintManager2 != null) {
                    z10 = fingerprintManager2.isHardwareDetected();
                    if (z10) {
                        try {
                            fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        if (fingerprintManager != null) {
                            z11 = fingerprintManager.hasEnrolledFingerprints();
                            if (z11 && FingerprintController.isKeyReady()) {
                                if (FingerprintController.checkDeviceFingerprintsChanged()) {
                                    return true;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            if (FingerprintController.checkDeviceFingerprintsChanged()) {
                            }
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return false;
    }

    public final boolean h() {
        ci.h4 h4Var = this.a0;
        if (h4Var == null || !h4Var.c()) {
            return true;
        }
        AndroidUtilities.hideKeyboard(this.r);
        return false;
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.V);
    }

    public final void k() {
        if (this.L) {
            return;
        }
        e();
        if (this.x.getVisibility() != 0) {
            if (SharedConfig.passcodeType == 1) {
                EditTextBoldCursor editTextBoldCursor = this.r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                AndroidUtilities.runOnUIThread(new ie0(this, 0), 200L);
            }
            c();
        }
    }

    public final void l(boolean z10, int i10, int i11, org.telegram.ui.m70 m70Var) {
        View currentFocus;
        boolean z11;
        int i12;
        int i13;
        if (getVisibility() != 0) {
            this.L = false;
        }
        d();
        e();
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        int i14 = SharedConfig.passcodeType;
        TextView textView = this.x;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i14 == 1) {
            if (!z10 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        } else if (findActivity != null && (currentFocus = findActivity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findActivity.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        x9 x9Var = null;
        this.a = null;
        boolean z12 = org.telegram.ui.ActionBar.i6.s0() instanceof cd0;
        ci.m6 m6Var = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.i6.I.q();
            this.a = org.telegram.ui.ActionBar.i6.s0();
            m6Var.setBackgroundColor(-1090519040);
        } else {
            if (!org.telegram.ui.ActionBar.i6.W || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.i6.I0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.i6.I0())) {
                if (!"d".equals(org.telegram.ui.ActionBar.i6.I0())) {
                    String I0 = org.telegram.ui.ActionBar.i6.I0();
                    if (!org.telegram.ui.ActionBar.i6.j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(I0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(I0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.i6.s0();
                        this.a = s02;
                        if (s02 instanceof x9) {
                            m6Var.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            m6Var.setBackgroundColor(-1090519040);
                        } else {
                            m6Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                m6Var.setBackgroundColor(-11436898);
            } else {
                org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.i6.I.i0;
                if (b6Var != null && (i12 = b6Var.d) != 0 && (i13 = b6Var.e) != 0) {
                    x9Var = new x9(x9.d(b6Var.h), new int[]{i12, i13});
                }
                this.a = x9Var;
                if (x9Var == null) {
                    this.a = org.telegram.ui.ActionBar.i6.s0();
                }
                if (this.a instanceof x9) {
                    m6Var.setBackgroundColor(570425344);
                } else {
                    m6Var.setBackgroundColor(-1090519040);
                }
            }
            z11 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof cd0) {
            cd0 cd0Var = (cd0) drawable;
            int[] iArr = cd0Var.a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.i6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.a = new cd0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (cd0Var.u == null || cd0Var.q >= 0) {
                m6Var.setBackgroundColor(570425344);
            } else {
                m6Var.setBackgroundColor(2130706432);
            }
            ((cd0) this.a).r(m6Var);
        }
        this.w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.E;
        ImageView imageView2 = this.y;
        ai.x5 x5Var = this.e;
        ci.j9 j9Var = this.s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                x5Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            j9Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            x5Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            j9Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        ci.j9.a(j9Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new oe0(this, i10, i11, m70Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.T = 1.0f;
            g(1.0f);
            fk0 fk0Var = this.I;
            fk0Var.setScaleX(1.0f);
            fk0Var.setScaleY(1.0f);
            fk0Var.i();
            fk0Var.getAnimatedDrawable().N(38, false, false);
            if (m70Var != null) {
                m70Var.run();
            }
        }
        setOnTouchListener(new bi.d(19));
    }

    public final void m(boolean z10) {
        if (this.L || getVisibility() != 0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (!z10) {
            if (SharedConfig.passcodeRetryInMs > 0) {
                return;
            }
            int i10 = SharedConfig.passcodeType;
            ci.j9 j9Var = this.s;
            String sb2 = i10 == 0 ? ((StringBuilder) j9Var.d).toString() : i10 == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb2.length();
            FrameLayout frameLayout = this.b;
            if (length == 0) {
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i11 = -this.U;
                this.U = i11;
                AndroidUtilities.shakeViewSpring(frameLayout, i11);
                return;
            }
            if (!SharedConfig.checkPasscode(sb2)) {
                SharedConfig.increaseBadPasscodeTries();
                if (SharedConfig.passcodeRetryInMs > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                ci.j9.a(j9Var, true);
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i12 = -this.U;
                this.U = i12;
                AndroidUtilities.shakeViewSpring(frameLayout, i12);
                Drawable drawable = this.a;
                if (drawable instanceof cd0) {
                    cd0 cd0Var = (cd0) drawable;
                    o1.k kVar = this.P;
                    if (kVar != null) {
                        kVar.c();
                        cd0Var.h = 1.0f;
                        cd0Var.z();
                    }
                    if (cd0Var.h >= 1.0f) {
                        cd0Var.m(true);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.L = true;
        j();
        SharedConfig.badPasscodeTries = 0;
        editTextBoldCursor.clearFocus();
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        if (FingerprintController.isKeyReady() && FingerprintController.checkDeviceFingerprintsChanged()) {
            FingerprintController.deleteInvalidKey();
        }
        SharedConfig.appLocked = false;
        SharedConfig.saveConfig();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
        setOnTouchListener(null);
        se0 se0Var = this.K;
        if (se0Var != null) {
            se0Var.i(this);
        }
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M = null;
        }
        AnimatorSet animatorSet2 = this.N;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.N = null;
        }
        fk0 fk0Var = this.I;
        fk0Var.getAnimatedDrawable().P(71);
        fk0Var.getAnimatedDrawable().N(37, false, false);
        fk0Var.d();
        AndroidUtilities.runOnUIThread(new ie0(this, 1));
    }

    public final void n(boolean z10) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.b0 = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z10 ? 1.0f : 0.0f);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new je0(this, 1));
        this.c0.addListener(new fa(16, this, z10));
        this.c0.setInterpolator(hs.h);
        this.c0.setDuration(320L);
        this.c0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.a0 == null && (getParent() instanceof View)) {
            this.a0 = new ci.h4((View) getParent(), false, new a3(this, 9));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
        this.L = true;
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.N;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.O.cancel();
            this.O = null;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.J;
        getWindowVisibleDisplayFrame(rect);
        this.G = height - (rect.bottom - rect.top);
        if (SharedConfig.passcodeType == 1 && (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            int intValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((intValue + layoutParams.height) - (this.G / 2)) - AndroidUtilities.statusBarHeight;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z10, i10, i11, i12, i13);
        TextView textView = this.w;
        int[] iArr = this.d0;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        fk0 fk0Var = this.I;
        if (isTablet || getContext().getResources().getConfiguration().orientation != 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.H = dp;
            fk0Var.setTranslationY(dp);
        } else {
            int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
            this.H = dp2;
            fk0Var.setTranslationY(dp2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = AndroidUtilities.displaySize.y;
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int dp3 = AndroidUtilities.dp(60.0f);
        boolean z10 = !AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.F;
        if (view != null) {
            view.setVisibility(SharedConfig.passcodeType == 1 ? 0 : 8);
        }
        fk0 fk0Var = this.I;
        ai.x5 x5Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z10) {
            if (SharedConfig.passcodeType == 0) {
                f7 = 2.0f;
                f10 = size / 2.0f;
            } else {
                f7 = 2.0f;
                f10 = size;
            }
            fk0Var.setTranslationX((f10 / f7) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = SharedConfig.passcodeType == 0 ? size / 2 : size;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            layoutParams.topMargin = org.telegram.messenger.bi.A(140.0f, i14, 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i14;
            int i15 = size / 2;
            layoutParams2.leftMargin = i15;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i15;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            x5Var.setLayoutParams(layoutParams3);
            i13 = 0;
        } else {
            fk0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i16 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.messenger.bi.A(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i14 > AndroidUtilities.dp(528.0f)) {
                    i16 = org.telegram.messenger.bi.A(528.0f, i14, 2);
                    i14 = AndroidUtilities.dp(528.0f);
                }
            } else {
                i12 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams4.height = (i14 / 3) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = i16;
            layoutParams4.leftMargin = i12;
            frameLayout2.setTag(Integer.valueOf(i16));
            frameLayout2.setLayoutParams(layoutParams4);
            int i17 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            i13 = 0;
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            x5Var.setLayoutParams(layoutParams5);
            int i18 = i14 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i12;
            if (AndroidUtilities.isTablet()) {
                layoutParams6.topMargin = (i14 - i18) / 2;
            } else {
                layoutParams6.topMargin = i17;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        int dp4 = AndroidUtilities.dp(z10 ? 52.0f : 82.0f);
        int i19 = i13;
        while (i19 < 12) {
            int i20 = 10;
            if (i19 != 0) {
                i20 = i19 == 10 ? 11 : i19 == 11 ? 9 : i19 - 1;
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f.get(i19);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((dp3 + dp2) * (i20 / 3)) + dp4;
            layoutParams7.leftMargin = (dp3 + dp) * (i20 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
            i19++;
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(se0 se0Var) {
        this.K = se0Var;
    }

    public void g(float f7) {
    }

    public void i() {
    }
}
