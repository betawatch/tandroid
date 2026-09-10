package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class be0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] a0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final View F;
    public int G;
    public int H;
    public final kj0 I;
    public final Rect J;
    public ae0 K;
    public o1.k L;
    public final LinkedList M;
    public final LinkedList N;
    public final ArrayList O;
    public float P;
    public int Q;
    public final org.telegram.ui.Cells.l9 R;
    public int S;
    public bi.b5 T;
    public boolean U;
    public ValueAnimator V;
    public final int[] W;
    public Drawable a;
    public final FrameLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final bi.l4 e;
    public final ArrayList f;
    public final FrameLayout h;
    public final zd0 n;
    public final EditTextBoldCursor r;
    public final bi.oa s;
    public final bi.n7 v;
    public final TextView w;
    public final TextView x;
    public final ImageView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be0(Context context) {
        super(context);
        int i10;
        int[] iArr = a0;
        final int i11 = 0;
        this.G = 0;
        this.J = new Rect();
        this.M = new LinkedList();
        this.N = new LinkedList();
        this.O = new ArrayList();
        this.Q = -12;
        this.R = new org.telegram.ui.Cells.l9(this, 15);
        this.U = true;
        this.W = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        bi.n7 n7Var = new bi.n7(this, context);
        this.v = n7Var;
        n7Var.setWillNotDraw(false);
        addView(n7Var, w7.a6.c(-1.0f, -1));
        kj0 kj0Var = new kj0(context);
        this.I = kj0Var;
        kj0Var.f(R.raw.passcode_lock, 58, 58, null);
        kj0Var.setAutoRepeat(false);
        addView(kj0Var, w7.a6.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        n7Var.addView(frameLayout, w7.a6.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout, textView, w7.a6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.x = f7;
        f7.setTextColor(-1);
        f7.setTextSize(1, 15.0f);
        f7.setGravity(1);
        f7.setVisibility(4);
        n7Var.addView(f7, w7.a6.e(-2, -2, 17));
        bi.oa oaVar = new bi.oa(this, context);
        this.s = oaVar;
        frameLayout.addView(oaVar, w7.a6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
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
        frameLayout.addView(editTextBoldCursor, w7.a6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new g1(this, 3));
        editTextBoldCursor.addTextChangedListener(new bi.u2(this, 10));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new hi.f1(2));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, w7.a6.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(LocaleController.getString(R.string.Done));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sd0
            public final /* synthetic */ be0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z10;
                LinkedList linkedList3;
                int i13;
                int i14;
                int i15;
                boolean z11;
                boolean z12;
                int i16 = i11;
                be0 be0Var = this.b;
                switch (i16) {
                    case 0:
                        be0Var.k(false);
                        break;
                    case 1:
                        be0Var.c();
                        break;
                    default:
                        LinkedList linkedList4 = be0Var.N;
                        LinkedList linkedList5 = be0Var.M;
                        bi.oa oaVar2 = be0Var.s;
                        if (be0Var.U) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("0");
                                    z10 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("1");
                                    z10 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("2");
                                    z10 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("3");
                                    z10 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("4");
                                    z10 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("5");
                                    z10 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("6");
                                    z10 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("7");
                                    z10 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("8");
                                    z10 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    oaVar2.b("9");
                                    z10 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    be0Var.c();
                                    z10 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) oaVar2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) oaVar2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) oaVar2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i12 = intValue;
                                        z10 = false;
                                        break;
                                    } else {
                                        try {
                                            oaVar2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i17 = length;
                                        while (i17 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i17);
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i13 = intValue;
                                                i14 = 1;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, oaVar2.c(i17)));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i13 = intValue;
                                                i14 = 1;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i17);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr = new float[i14];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i14];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i14];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i14];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr4));
                                                float c10 = oaVar2.c(i17);
                                                i15 = i17;
                                                float[] fArr5 = new float[i14];
                                                fArr5[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                i15 = i17;
                                            }
                                            i17 = i15 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i13;
                                        }
                                        linkedList2 = linkedList5;
                                        i12 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, oaVar2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, oaVar2.c(i18)));
                                        }
                                        kf kfVar = (kf) oaVar2.f;
                                        if (kfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(kfVar);
                                            oaVar2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) oaVar2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        oaVar2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) oaVar2.e).playTogether(arrayList3);
                                        ((AnimatorSet) oaVar2.e).addListener(new xd0(oaVar2, 1));
                                        ((AnimatorSet) oaVar2.e).start();
                                        be0.a((be0) oaVar2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z10 = false;
                                    break;
                            }
                            if (((StringBuilder) oaVar2.d).length() == 4) {
                                be0Var.k(false);
                            }
                            int i19 = i12;
                            if (i19 != 11) {
                                Drawable drawable = be0Var.a;
                                if (drawable instanceof lc0) {
                                    lc0 lc0Var = (lc0) drawable;
                                    lc0Var.D = null;
                                    lc0Var.z();
                                    float f10 = lc0Var.h;
                                    if (i19 == 10) {
                                        if (z10) {
                                            lc0Var.y();
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                        lc0Var.x(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            be0Var.b(lc0Var);
                                            break;
                                        } else {
                                            bi.c1 c1Var = new bi.c1(be0Var, z11, lc0Var, 20);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(c1Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i20);
                                                Boolean bool = (Boolean) linkedList7.get(i20);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i20));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i21 = 0;
                                            while (i21 < size) {
                                                Object obj = arrayList4.get(i21);
                                                i21++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new m9(4));
                                            int size2 = arrayList5.size();
                                            int i22 = 0;
                                            while (i22 < size2) {
                                                Object obj2 = arrayList5.get(i22);
                                                i22++;
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
        frameLayout.addView(imageView2, w7.a6.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        final int i12 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sd0
            public final /* synthetic */ be0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i122;
                boolean z10;
                LinkedList linkedList3;
                int i13;
                int i14;
                int i15;
                boolean z11;
                boolean z12;
                int i16 = i12;
                be0 be0Var = this.b;
                switch (i16) {
                    case 0:
                        be0Var.k(false);
                        break;
                    case 1:
                        be0Var.c();
                        break;
                    default:
                        LinkedList linkedList4 = be0Var.N;
                        LinkedList linkedList5 = be0Var.M;
                        bi.oa oaVar2 = be0Var.s;
                        if (be0Var.U) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("0");
                                    z10 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("1");
                                    z10 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("2");
                                    z10 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("3");
                                    z10 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("4");
                                    z10 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("5");
                                    z10 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("6");
                                    z10 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("7");
                                    z10 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("8");
                                    z10 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    oaVar2.b("9");
                                    z10 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    be0Var.c();
                                    z10 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) oaVar2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) oaVar2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb2 = (StringBuilder) oaVar2.d;
                                    if (sb2.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        break;
                                    } else {
                                        try {
                                            oaVar2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb2.length() - 1;
                                        if (length != 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i17 = length;
                                        while (i17 < 4) {
                                            TextView textView2 = (TextView) arrayList2.get(i17);
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i13 = intValue;
                                                i14 = 1;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, oaVar2.c(i17)));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i13 = intValue;
                                                i14 = 1;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i17);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr = new float[i14];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr));
                                                float[] fArr2 = new float[i14];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr2));
                                                float[] fArr3 = new float[i14];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr3));
                                                float[] fArr4 = new float[i14];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr4));
                                                float c10 = oaVar2.c(i17);
                                                i15 = i17;
                                                float[] fArr5 = new float[i14];
                                                fArr5[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr5));
                                            } else {
                                                i15 = i17;
                                            }
                                            i17 = i15 + 1;
                                            linkedList5 = linkedList3;
                                            intValue = i13;
                                        }
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, oaVar2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, oaVar2.c(i18)));
                                        }
                                        kf kfVar = (kf) oaVar2.f;
                                        if (kfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(kfVar);
                                            oaVar2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) oaVar2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        oaVar2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) oaVar2.e).playTogether(arrayList3);
                                        ((AnimatorSet) oaVar2.e).addListener(new xd0(oaVar2, 1));
                                        ((AnimatorSet) oaVar2.e).start();
                                        be0.a((be0) oaVar2.h);
                                        z10 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z10 = false;
                                    break;
                            }
                            if (((StringBuilder) oaVar2.d).length() == 4) {
                                be0Var.k(false);
                            }
                            int i19 = i122;
                            if (i19 != 11) {
                                Drawable drawable = be0Var.a;
                                if (drawable instanceof lc0) {
                                    lc0 lc0Var = (lc0) drawable;
                                    lc0Var.D = null;
                                    lc0Var.z();
                                    float f10 = lc0Var.h;
                                    if (i19 == 10) {
                                        if (z10) {
                                            lc0Var.y();
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                        lc0Var.x(true);
                                        z12 = true;
                                    }
                                    if (z12) {
                                        if (f10 >= 1.0f) {
                                            be0Var.b(lc0Var);
                                            break;
                                        } else {
                                            bi.c1 c1Var = new bi.c1(be0Var, z11, lc0Var, 20);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(c1Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z11));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i20);
                                                Boolean bool = (Boolean) linkedList7.get(i20);
                                                if (bool != null && bool.booleanValue() != z11) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i20));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i21 = 0;
                                            while (i21 < size) {
                                                Object obj = arrayList4.get(i21);
                                                i21++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new m9(4));
                                            int size2 = arrayList5.size();
                                            int i22 = 0;
                                            while (i22 < size2) {
                                                Object obj2 = arrayList5.get(i22);
                                                i22++;
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
        frameLayout.addView(view, w7.a6.a(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        n7Var.addView(frameLayout2, w7.a6.e(-1, -1, 51));
        bi.l4 l4Var = new bi.l4(context, 16);
        this.e = l4Var;
        frameLayout2.addView(l4Var, w7.a6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        l4Var.addView(frameLayout3, w7.a6.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.a2.g(context, 1, 15.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(-1);
        g10.setText(LocaleController.getString(R.string.UnlockToUse));
        TextView f10 = org.telegram.ui.Cells.r6.f(frameLayout3, g10, w7.a6.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = f10;
        f10.setTextSize(1, 14.0f);
        f10.setTextColor(-1);
        f10.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        frameLayout3.addView(f10, w7.a6.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        int i13 = 0;
        while (true) {
            if (i13 >= 12) {
                break;
            }
            zd0 zd0Var = new zd0(context);
            w7.c6.b(zd0Var, 0.15f, 1.5f);
            zd0Var.setTag(Integer.valueOf(i13));
            if (i13 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                zd0Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, 654311423, 654311423));
                zd0Var.setImage(R.drawable.filled_clear);
                zd0Var.setOnLongClickListener(new v10(this, 1));
                zd0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                l(zd0Var, R.id.passcode_btn_0);
            } else if (i13 == 10) {
                this.n = zd0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                zd0Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                zd0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                zd0Var.setImage(R.drawable.fingerprint);
                l(zd0Var, R.id.passcode_btn_1);
            } else {
                int dp3 = AndroidUtilities.dp(30.0f);
                zd0Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 654311423, 1291845631, 1291845631));
                zd0Var.setContentDescription(i13 + "");
                zd0Var.setNum(i13);
                if (i13 == 0) {
                    l(zd0Var, R.id.passcode_btn_backspace);
                } else if (i13 == 9) {
                    Activity findActivity = AndroidUtilities.findActivity(getContext());
                    if (Build.VERSION.SDK_INT >= 23 && findActivity != null && SharedConfig.useFingerprintLock) {
                        try {
                            Context context2 = ApplicationLoader.applicationContext;
                            wf.a aVar = wf.b.a;
                            if (aVar.y(context2) && aVar.a(context2) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                                l(zd0Var, R.id.passcode_btn_fingerprint);
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    l(zd0Var, R.id.passcode_btn_0);
                } else {
                    l(zd0Var, iArr[i13 + 1]);
                }
            }
            zd0Var.setId(iArr[i13]);
            final int i14 = 2;
            zd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sd0
                public final /* synthetic */ be0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i122;
                    boolean z10;
                    LinkedList linkedList3;
                    int i132;
                    int i142;
                    int i15;
                    boolean z11;
                    boolean z12;
                    int i16 = i14;
                    be0 be0Var = this.b;
                    switch (i16) {
                        case 0:
                            be0Var.k(false);
                            break;
                        case 1:
                            be0Var.c();
                            break;
                        default:
                            LinkedList linkedList4 = be0Var.N;
                            LinkedList linkedList5 = be0Var.M;
                            bi.oa oaVar2 = be0Var.s;
                            if (be0Var.U) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("0");
                                        z10 = false;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("1");
                                        z10 = false;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("2");
                                        z10 = false;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("3");
                                        z10 = false;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("4");
                                        z10 = false;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("5");
                                        z10 = false;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("6");
                                        z10 = false;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("7");
                                        z10 = false;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("8");
                                        z10 = false;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        oaVar2.b("9");
                                        z10 = false;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        be0Var.c();
                                        z10 = false;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) oaVar2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) oaVar2.b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb2 = (StringBuilder) oaVar2.d;
                                        if (sb2.length() == 0) {
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            i122 = intValue;
                                            z10 = false;
                                            break;
                                        } else {
                                            try {
                                                oaVar2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i17 = length;
                                            while (i17 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i17);
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i132 = intValue;
                                                    i142 = 1;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, oaVar2.c(i17)));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i132 = intValue;
                                                    i142 = 1;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i17);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr = new float[i142];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, fArr));
                                                    float[] fArr2 = new float[i142];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr2));
                                                    float[] fArr3 = new float[i142];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, fArr3));
                                                    float[] fArr4 = new float[i142];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, fArr4));
                                                    float c10 = oaVar2.c(i17);
                                                    i15 = i17;
                                                    float[] fArr5 = new float[i142];
                                                    fArr5[0] = c10;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr5));
                                                } else {
                                                    i15 = i17;
                                                }
                                                i17 = i15 + 1;
                                                linkedList5 = linkedList3;
                                                intValue = i132;
                                            }
                                            linkedList2 = linkedList5;
                                            i122 = intValue;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, oaVar2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, oaVar2.c(i18)));
                                            }
                                            kf kfVar = (kf) oaVar2.f;
                                            if (kfVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(kfVar);
                                                oaVar2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) oaVar2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            oaVar2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) oaVar2.e).playTogether(arrayList3);
                                            ((AnimatorSet) oaVar2.e).addListener(new xd0(oaVar2, 1));
                                            ((AnimatorSet) oaVar2.e).start();
                                            be0.a((be0) oaVar2.h);
                                            z10 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z10 = false;
                                        break;
                                }
                                if (((StringBuilder) oaVar2.d).length() == 4) {
                                    be0Var.k(false);
                                }
                                int i19 = i122;
                                if (i19 != 11) {
                                    Drawable drawable = be0Var.a;
                                    if (drawable instanceof lc0) {
                                        lc0 lc0Var = (lc0) drawable;
                                        lc0Var.D = null;
                                        lc0Var.z();
                                        float f102 = lc0Var.h;
                                        if (i19 == 10) {
                                            if (z10) {
                                                lc0Var.y();
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                            lc0Var.x(true);
                                            z12 = true;
                                        }
                                        if (z12) {
                                            if (f102 >= 1.0f) {
                                                be0Var.b(lc0Var);
                                                break;
                                            } else {
                                                bi.c1 c1Var = new bi.c1(be0Var, z11, lc0Var, 20);
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(c1Var);
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z11));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i20);
                                                    Boolean bool = (Boolean) linkedList7.get(i20);
                                                    if (bool != null && bool.booleanValue() != z11) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf(i20));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                int i21 = 0;
                                                while (i21 < size) {
                                                    Object obj = arrayList4.get(i21);
                                                    i21++;
                                                    linkedList6.remove((Runnable) obj);
                                                }
                                                Collections.sort(arrayList5, new m9(4));
                                                int size2 = arrayList5.size();
                                                int i22 = 0;
                                                while (i22 < size2) {
                                                    Object obj2 = arrayList5.get(i22);
                                                    i22++;
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
            this.f.add(zd0Var);
            i13++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f.get(i10), w7.a6.e(60, 60, 51));
        }
        d();
    }

    public static void a(be0 be0Var) {
        FrameLayout frameLayout = be0Var.b;
        bi.oa oaVar = be0Var.s;
        boolean z10 = oaVar == null || ((StringBuilder) oaVar.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.messenger.em.q(frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f), wr.h, 320L);
        }
    }

    public static void l(zd0 zd0Var, int i10) {
        zd0Var.setNextFocusForwardId(i10);
        if (Build.VERSION.SDK_INT >= 22) {
            zd0Var.setAccessibilityTraversalBefore(i10);
        }
    }

    public final void b(lc0 lc0Var) {
        o1.k kVar = this.L;
        if (kVar != null && kVar.f) {
            kVar.c();
        }
        o1.j jVar = new o1.j(0.0f);
        lc0Var.D = new pv(jVar, 8);
        lc0Var.z();
        o1.k kVar2 = new o1.k(jVar);
        kVar2.u = org.telegram.ui.Cells.r6.l(100.0f, 300.0f, 1.0f);
        this.L = kVar2;
        int i10 = 4;
        kVar2.a(new di.q4(i10, this, lc0Var));
        this.L.b(new k7(lc0Var, i10));
        this.L.f();
    }

    public final void c() {
        Activity findActivity;
        de0 de0Var;
        if (Build.VERSION.SDK_INT >= 23 && (findActivity = AndroidUtilities.findActivity(getContext())) != null && this.n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                ArrayList arrayList = launchActivity.B0;
                if (!arrayList.isEmpty() || (de0Var = launchActivity.A0) == null) {
                    if (hc.b.i(1, arrayList) != this) {
                        return;
                    }
                } else if (this != de0Var.b) {
                    return;
                }
            }
            try {
                if (new aa.a(new androidx.biometric.s(getContext(), 0)).f(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    xa.c cVar = new xa.c(LaunchActivity.G1, f0.e.e(getContext()), new td0(this));
                    j6.l lVar = new j6.l(1);
                    lVar.b = LocaleController.getString(R.string.UnlockToUse);
                    lVar.d = LocaleController.getString(R.string.UsePIN);
                    lVar.a = 15;
                    cVar.s0(lVar.c(), null);
                    m(false);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 23 || findActivity == null || !SharedConfig.useFingerprintLock) {
            this.n.setVisibility(8);
        } else {
            try {
                Context context = ApplicationLoader.applicationContext;
                wf.a aVar = wf.b.a;
                if (aVar.y(context) && aVar.a(context) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    try {
                        this.n.setVisibility(0);
                        z10 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        FileLog.e(th);
                        this.n.setVisibility(8);
                        if (SharedConfig.passcodeType == 1) {
                        }
                        this.c.setText(LocaleController.getString(!z10 ? R.string.EnterPINorFingerprint : R.string.EnterPIN));
                    }
                } else {
                    this.n.setVisibility(8);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (SharedConfig.passcodeType == 1) {
            this.E.setVisibility(this.n.getVisibility());
        }
        this.c.setText(LocaleController.getString(!z10 ? R.string.EnterPINorFingerprint : R.string.EnterPIN));
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
        org.telegram.ui.Cells.l9 l9Var = this.R;
        TextView textView = this.x;
        if (j10 <= 0) {
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                m(true);
                if (SharedConfig.passcodeType == 1) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int max = Math.max(1, (int) Math.ceil(j10 / 1000.0d));
        if (max != this.S) {
            textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
            this.S = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            m(false);
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.cancelRunOnUIThread(l9Var);
        AndroidUtilities.runOnUIThread(l9Var, 100L);
    }

    public final boolean g() {
        bi.b5 b5Var = this.T;
        if (b5Var == null || !b5Var.c()) {
            return true;
        }
        AndroidUtilities.hideKeyboard(this.r);
        return false;
    }

    public final void i() {
        e();
        if (this.x.getVisibility() != 0) {
            if (SharedConfig.passcodeType == 1) {
                EditTextBoldCursor editTextBoldCursor = this.r;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                AndroidUtilities.runOnUIThread(new qd0(this, 0), 200L);
            }
            c();
        }
    }

    public final void j(boolean z10, int i10, int i11, org.telegram.ui.h90 h90Var) {
        View currentFocus;
        boolean z11;
        int i12;
        int i13;
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
        v9 v9Var = null;
        this.a = null;
        boolean z12 = org.telegram.ui.ActionBar.j6.r0() instanceof lc0;
        bi.n7 n7Var = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.j6.I.q();
            this.a = org.telegram.ui.ActionBar.j6.r0();
            n7Var.setBackgroundColor(-1090519040);
        } else {
            if (!org.telegram.ui.ActionBar.j6.W || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.j6.H0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.j6.H0())) {
                if (!"d".equals(org.telegram.ui.ActionBar.j6.H0())) {
                    String H0 = org.telegram.ui.ActionBar.j6.H0();
                    if (!org.telegram.ui.ActionBar.j6.j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(H0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(H0)) {
                        Drawable r02 = org.telegram.ui.ActionBar.j6.r0();
                        this.a = r02;
                        if (r02 instanceof v9) {
                            n7Var.setBackgroundColor(570425344);
                        } else if (r02 != null) {
                            n7Var.setBackgroundColor(-1090519040);
                        } else {
                            n7Var.setBackgroundColor(-11436898);
                        }
                    }
                }
                n7Var.setBackgroundColor(-11436898);
            } else {
                org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.i0;
                if (c6Var != null && (i12 = c6Var.d) != 0 && (i13 = c6Var.e) != 0) {
                    v9Var = new v9(v9.d(c6Var.h), new int[]{i12, i13});
                }
                this.a = v9Var;
                if (v9Var == null) {
                    this.a = org.telegram.ui.ActionBar.j6.r0();
                }
                if (this.a instanceof v9) {
                    n7Var.setBackgroundColor(570425344);
                } else {
                    n7Var.setBackgroundColor(-1090519040);
                }
            }
            z11 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof lc0) {
            lc0 lc0Var = (lc0) drawable;
            int[] iArr = lc0Var.a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.j6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.a = new lc0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (lc0Var.u == null || lc0Var.q >= 0) {
                n7Var.setBackgroundColor(570425344);
            } else {
                n7Var.setBackgroundColor(2130706432);
            }
            ((lc0) this.a).r(n7Var);
        }
        this.w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.E;
        ImageView imageView2 = this.y;
        bi.l4 l4Var = this.e;
        bi.oa oaVar = this.s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                l4Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            oaVar.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            l4Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            oaVar.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        bi.oa.a(oaVar, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new wd0(this, i10, i11, h90Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.P = 1.0f;
            f(1.0f);
            kj0 kj0Var = this.I;
            kj0Var.setScaleX(1.0f);
            kj0Var.setScaleY(1.0f);
            kj0Var.i();
            kj0Var.getAnimatedDrawable().N(38, false, false);
            if (h90Var != null) {
                h90Var.run();
            }
        }
        setOnTouchListener(new ai.h(19));
    }

    public final void k(boolean z10) {
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (!z10) {
            if (SharedConfig.passcodeRetryInMs > 0) {
                return;
            }
            int i10 = SharedConfig.passcodeType;
            bi.oa oaVar = this.s;
            String sb2 = i10 == 0 ? ((StringBuilder) oaVar.d).toString() : i10 == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb2.length();
            FrameLayout frameLayout = this.b;
            if (length == 0) {
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i11 = -this.Q;
                this.Q = i11;
                AndroidUtilities.shakeViewSpring(frameLayout, i11);
                return;
            }
            if (!SharedConfig.checkPasscode(sb2)) {
                SharedConfig.increaseBadPasscodeTries();
                if (SharedConfig.passcodeRetryInMs > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                bi.oa.a(oaVar, true);
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i12 = -this.Q;
                this.Q = i12;
                AndroidUtilities.shakeViewSpring(frameLayout, i12);
                Drawable drawable = this.a;
                if (drawable instanceof lc0) {
                    lc0 lc0Var = (lc0) drawable;
                    o1.k kVar = this.L;
                    if (kVar != null) {
                        kVar.c();
                        lc0Var.h = 1.0f;
                        lc0Var.z();
                    }
                    if (lc0Var.h >= 1.0f) {
                        lc0Var.m(true);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        SharedConfig.badPasscodeTries = 0;
        editTextBoldCursor.clearFocus();
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        if (Build.VERSION.SDK_INT >= 23 && FingerprintController.isKeyReady() && FingerprintController.checkDeviceFingerprintsChanged()) {
            FingerprintController.deleteInvalidKey();
        }
        SharedConfig.appLocked = false;
        SharedConfig.saveConfig();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
        setOnTouchListener(null);
        ae0 ae0Var = this.K;
        if (ae0Var != null) {
            ae0Var.g(this);
        }
        kj0 kj0Var = this.I;
        kj0Var.getAnimatedDrawable().P(71);
        kj0Var.getAnimatedDrawable().N(37, false, false);
        kj0Var.d();
        AndroidUtilities.runOnUIThread(new qd0(this, 1));
    }

    public final void m(boolean z10) {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z10 ? 1.0f : 0.0f);
        this.V = ofFloat;
        ofFloat.addUpdateListener(new rd0(this, 1));
        this.V.addListener(new yo(12, this, z10));
        this.V.setInterpolator(wr.h);
        this.V.setDuration(320L);
        this.V.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.T == null && (getParent() instanceof View)) {
            this.T = new bi.b5((View) getParent(), false, new y2(this, 8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
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
        int[] iArr = this.W;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        kj0 kj0Var = this.I;
        if (isTablet || getContext().getResources().getConfiguration().orientation != 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.H = dp;
            kj0Var.setTranslationY(dp);
        } else {
            int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
            this.H = dp2;
            kj0Var.setTranslationY(dp2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = AndroidUtilities.displaySize.y;
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int dp3 = AndroidUtilities.dp(60.0f);
        boolean z10 = !AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.F;
        if (view != null) {
            view.setVisibility(SharedConfig.passcodeType == 1 ? 0 : 8);
        }
        kj0 kj0Var = this.I;
        bi.l4 l4Var = this.e;
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
            kj0Var.setTranslationX((f10 / f7) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = SharedConfig.passcodeType == 0 ? size / 2 : size;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            layoutParams.topMargin = org.telegram.messenger.em.y(140.0f, i13, 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i13;
            int i14 = size / 2;
            layoutParams2.leftMargin = i14;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i14;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) l4Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            l4Var.setLayoutParams(layoutParams3);
        } else {
            kj0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i15 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.messenger.em.y(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i13 > AndroidUtilities.dp(528.0f)) {
                    i15 = org.telegram.messenger.em.y(528.0f, i13, 2);
                    i13 = AndroidUtilities.dp(528.0f);
                }
            } else {
                i12 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams4.height = (i13 / 3) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = i15;
            layoutParams4.leftMargin = i12;
            frameLayout2.setTag(Integer.valueOf(i15));
            frameLayout2.setLayoutParams(layoutParams4);
            int i16 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) l4Var.getLayoutParams();
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            l4Var.setLayoutParams(layoutParams5);
            int i17 = i13 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i12;
            if (AndroidUtilities.isTablet()) {
                layoutParams6.topMargin = (i13 - i17) / 2;
            } else {
                layoutParams6.topMargin = i16;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        int dp4 = AndroidUtilities.dp(z10 ? 52.0f : 82.0f);
        int i18 = 0;
        while (i18 < 12) {
            int i19 = 10;
            if (i18 != 0) {
                i19 = i18 == 10 ? 11 : i18 == 11 ? 9 : i18 - 1;
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f.get(i18);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((dp3 + dp2) * (i19 / 3)) + dp4;
            layoutParams7.leftMargin = (dp3 + dp) * (i19 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
            i18++;
        }
        super.onMeasure(i10, i11);
    }

    public void setDelegate(ae0 ae0Var) {
        this.K = ae0Var;
    }

    public void f(float f7) {
    }

    public void h() {
    }
}
