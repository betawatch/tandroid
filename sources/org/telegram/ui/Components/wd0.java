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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class wd0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] U = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView B;
    public final View C;
    public int D;
    public int E;
    public final jj0 F;
    public final Rect G;
    public vd0 H;
    public o1.j I;
    public final LinkedList J;
    public final LinkedList K;
    public final ArrayList L;
    public float M;
    public int N;
    public final m2.b O;
    public int P;
    public ph.i3 Q;
    public boolean R;
    public ValueAnimator S;
    public final int[] T;
    public Drawable a;
    public final FrameLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final dh.d e;
    public final ArrayList f;
    public final FrameLayout h;
    public final ud0 n;
    public final EditTextBoldCursor r;
    public final sd0 s;
    public final ah.e v;
    public final TextView w;
    public final TextView x;
    public final ImageView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd0(Context context) {
        super(context);
        int i10;
        int[] iArr = U;
        final int i11 = 0;
        this.D = 0;
        this.G = new Rect();
        this.J = new LinkedList();
        this.K = new LinkedList();
        this.L = new ArrayList();
        this.N = -12;
        this.O = new m2.b(this, 26);
        this.R = true;
        this.T = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ah.e eVar = new ah.e(this, context);
        this.v = eVar;
        eVar.setWillNotDraw(false);
        addView(eVar, k7.b6.c(-1.0f, -1));
        jj0 jj0Var = new jj0(context);
        this.F = jj0Var;
        jj0Var.f(R.raw.passcode_lock, 58, 58, null);
        jj0Var.setAutoRepeat(false);
        addView(jj0Var, k7.b6.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        eVar.addView(frameLayout, k7.b6.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView h = org.telegram.ui.ai.h(frameLayout, textView, k7.b6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.x = h;
        h.setTextColor(-1);
        h.setTextSize(1, 15.0f);
        h.setGravity(1);
        h.setVisibility(4);
        eVar.addView(h, k7.b6.e(-2, -2, 17));
        sd0 sd0Var = new sd0(this, context);
        this.s = sd0Var;
        frameLayout.addView(sd0Var, k7.b6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
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
        frameLayout.addView(editTextBoldCursor, k7.b6.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new d1(this, 3));
        editTextBoldCursor.addTextChangedListener(new dh.c(this, 10));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(1));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, k7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(LocaleController.getString(R.string.Done));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ld0
            public final /* synthetic */ wd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i12;
                boolean z4;
                LinkedList linkedList3;
                int i13;
                int i14;
                int i15;
                boolean z10;
                boolean z11;
                int i16 = i11;
                wd0 wd0Var = this.b;
                switch (i16) {
                    case 0:
                        wd0Var.k(false);
                        break;
                    case 1:
                        wd0Var.c();
                        break;
                    default:
                        LinkedList linkedList4 = wd0Var.K;
                        LinkedList linkedList5 = wd0Var.J;
                        sd0 sd0Var2 = wd0Var.s;
                        if (wd0Var.R) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("0");
                                    z4 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("1");
                                    z4 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("2");
                                    z4 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("3");
                                    z4 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("4");
                                    z4 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("5");
                                    z4 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("6");
                                    z4 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("7");
                                    z4 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("8");
                                    z4 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    sd0Var2.b("9");
                                    z4 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    wd0Var.c();
                                    z4 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) sd0Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) sd0Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) sd0Var2.d;
                                    if (sb.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i12 = intValue;
                                        z4 = false;
                                        break;
                                    } else {
                                        try {
                                            sd0Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
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
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, sd0Var2.c(i17)));
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
                                                float c3 = sd0Var2.c(i17);
                                                i15 = i17;
                                                float[] fArr5 = new float[i14];
                                                fArr5[0] = c3;
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
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, sd0Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, sd0Var2.c(i18)));
                                        }
                                        ye yeVar = (ye) sd0Var2.f;
                                        if (yeVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(yeVar);
                                            sd0Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) sd0Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        sd0Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) sd0Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) sd0Var2.e).addListener(new rd0(sd0Var2, 1));
                                        ((AnimatorSet) sd0Var2.e).start();
                                        wd0.a((wd0) sd0Var2.h);
                                        z4 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i12 = intValue;
                                    z4 = false;
                                    break;
                            }
                            if (((StringBuilder) sd0Var2.d).length() == 4) {
                                wd0Var.k(false);
                            }
                            int i19 = i12;
                            if (i19 != 11) {
                                Drawable drawable = wd0Var.a;
                                if (drawable instanceof ec0) {
                                    ec0 ec0Var = (ec0) drawable;
                                    ec0Var.D = null;
                                    ec0Var.z();
                                    float f10 = ec0Var.h;
                                    if (i19 == 10) {
                                        if (z4) {
                                            ec0Var.y();
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                        ec0Var.x(true);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        if (f10 >= 1.0f) {
                                            wd0Var.b(ec0Var);
                                            break;
                                        } else {
                                            lh.r5 r5Var = new lh.r5(wd0Var, z10, ec0Var, 16);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(r5Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z10));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i20);
                                                Boolean bool = (Boolean) linkedList7.get(i20);
                                                if (bool != null && bool.booleanValue() != z10) {
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
                                            Collections.sort(arrayList5, new nh.e4(22));
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
        this.B = imageView2;
        imageView2.setImageResource(R.drawable.fingerprint);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView2, k7.b6.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        final int i12 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ld0
            public final /* synthetic */ wd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinkedList linkedList;
                LinkedList linkedList2;
                int i122;
                boolean z4;
                LinkedList linkedList3;
                int i13;
                int i14;
                int i15;
                boolean z10;
                boolean z11;
                int i16 = i12;
                wd0 wd0Var = this.b;
                switch (i16) {
                    case 0:
                        wd0Var.k(false);
                        break;
                    case 1:
                        wd0Var.c();
                        break;
                    default:
                        LinkedList linkedList4 = wd0Var.K;
                        LinkedList linkedList5 = wd0Var.J;
                        sd0 sd0Var2 = wd0Var.s;
                        if (wd0Var.R) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("0");
                                    z4 = false;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("1");
                                    z4 = false;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("2");
                                    z4 = false;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("3");
                                    z4 = false;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("4");
                                    z4 = false;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("5");
                                    z4 = false;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("6");
                                    z4 = false;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("7");
                                    z4 = false;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("8");
                                    z4 = false;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    sd0Var2.b("9");
                                    z4 = false;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    wd0Var.c();
                                    z4 = false;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) sd0Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) sd0Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) sd0Var2.d;
                                    if (sb.length() == 0) {
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z4 = false;
                                        break;
                                    } else {
                                        try {
                                            sd0Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
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
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, sd0Var2.c(i17)));
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
                                                float c3 = sd0Var2.c(i17);
                                                i15 = i17;
                                                float[] fArr5 = new float[i14];
                                                fArr5[0] = c3;
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
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, sd0Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, sd0Var2.c(i18)));
                                        }
                                        ye yeVar = (ye) sd0Var2.f;
                                        if (yeVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(yeVar);
                                            sd0Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) sd0Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        sd0Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) sd0Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) sd0Var2.e).addListener(new rd0(sd0Var2, 1));
                                        ((AnimatorSet) sd0Var2.e).start();
                                        wd0.a((wd0) sd0Var2.h);
                                        z4 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    i122 = intValue;
                                    z4 = false;
                                    break;
                            }
                            if (((StringBuilder) sd0Var2.d).length() == 4) {
                                wd0Var.k(false);
                            }
                            int i19 = i122;
                            if (i19 != 11) {
                                Drawable drawable = wd0Var.a;
                                if (drawable instanceof ec0) {
                                    ec0 ec0Var = (ec0) drawable;
                                    ec0Var.D = null;
                                    ec0Var.z();
                                    float f10 = ec0Var.h;
                                    if (i19 == 10) {
                                        if (z4) {
                                            ec0Var.y();
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                        ec0Var.x(true);
                                        z11 = true;
                                    }
                                    if (z11) {
                                        if (f10 >= 1.0f) {
                                            wd0Var.b(ec0Var);
                                            break;
                                        } else {
                                            lh.r5 r5Var = new lh.r5(wd0Var, z10, ec0Var, 16);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(r5Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z10));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i20);
                                                Boolean bool = (Boolean) linkedList7.get(i20);
                                                if (bool != null && bool.booleanValue() != z10) {
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
                                            Collections.sort(arrayList5, new nh.e4(22));
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
        this.C = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        eVar.addView(frameLayout2, k7.b6.e(-1, -1, 51));
        dh.d dVar = new dh.d(context, 17);
        this.e = dVar;
        frameLayout2.addView(dVar, k7.b6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        dVar.addView(frameLayout3, k7.b6.e(-2, -2, 49));
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 15.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(-1);
        g10.setText(LocaleController.getString(R.string.UnlockToUse));
        TextView h9 = org.telegram.ui.ai.h(frameLayout3, g10, k7.b6.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = h9;
        h9.setTextSize(1, 14.0f);
        h9.setTextColor(-1);
        h9.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        frameLayout3.addView(h9, k7.b6.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        int i13 = 0;
        while (true) {
            if (i13 >= 12) {
                break;
            }
            ud0 ud0Var = new ud0(context);
            k7.d6.b(ud0Var, 0.15f, 1.5f);
            ud0Var.setTag(Integer.valueOf(i13));
            if (i13 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                ud0Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, 654311423, 654311423));
                ud0Var.setImage(R.drawable.filled_clear);
                ud0Var.setOnLongClickListener(new n10(this, 1));
                ud0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                l(ud0Var, R.id.passcode_btn_0);
            } else if (i13 == 10) {
                this.n = ud0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                ud0Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                ud0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                ud0Var.setImage(R.drawable.fingerprint);
                l(ud0Var, R.id.passcode_btn_1);
            } else {
                int dp3 = AndroidUtilities.dp(30.0f);
                ud0Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 654311423, 1291845631, 1291845631));
                ud0Var.setContentDescription(i13 + "");
                ud0Var.setNum(i13);
                if (i13 == 0) {
                    l(ud0Var, R.id.passcode_btn_backspace);
                } else if (i13 == 9) {
                    Activity findActivity = AndroidUtilities.findActivity(getContext());
                    if (Build.VERSION.SDK_INT >= 23 && findActivity != null && SharedConfig.useFingerprintLock) {
                        try {
                            Context context2 = ApplicationLoader.applicationContext;
                            jf.a aVar = jf.b.a;
                            if (aVar.M0(context2) && aVar.h(context2) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                                l(ud0Var, R.id.passcode_btn_fingerprint);
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    l(ud0Var, R.id.passcode_btn_0);
                } else {
                    l(ud0Var, iArr[i13 + 1]);
                }
            }
            ud0Var.setId(iArr[i13]);
            final int i14 = 2;
            ud0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ld0
                public final /* synthetic */ wd0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    int i122;
                    boolean z4;
                    LinkedList linkedList3;
                    int i132;
                    int i142;
                    int i15;
                    boolean z10;
                    boolean z11;
                    int i16 = i14;
                    wd0 wd0Var = this.b;
                    switch (i16) {
                        case 0:
                            wd0Var.k(false);
                            break;
                        case 1:
                            wd0Var.c();
                            break;
                        default:
                            LinkedList linkedList4 = wd0Var.K;
                            LinkedList linkedList5 = wd0Var.J;
                            sd0 sd0Var2 = wd0Var.s;
                            if (wd0Var.R) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("0");
                                        z4 = false;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("1");
                                        z4 = false;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("2");
                                        z4 = false;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("3");
                                        z4 = false;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("4");
                                        z4 = false;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("5");
                                        z4 = false;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("6");
                                        z4 = false;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("7");
                                        z4 = false;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("8");
                                        z4 = false;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        sd0Var2.b("9");
                                        z4 = false;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        wd0Var.c();
                                        z4 = false;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) sd0Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) sd0Var2.b;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb = (StringBuilder) sd0Var2.d;
                                        if (sb.length() == 0) {
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            i122 = intValue;
                                            z4 = false;
                                            break;
                                        } else {
                                            try {
                                                sd0Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb.length() - 1;
                                            if (length != 0) {
                                                sb.deleteCharAt(length);
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
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, sd0Var2.c(i17)));
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
                                                    float c3 = sd0Var2.c(i17);
                                                    i15 = i17;
                                                    float[] fArr5 = new float[i142];
                                                    fArr5[0] = c3;
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
                                                sb.deleteCharAt(length);
                                            }
                                            for (int i18 = 0; i18 < length; i18++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, sd0Var2.c(i18)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, sd0Var2.c(i18)));
                                            }
                                            ye yeVar = (ye) sd0Var2.f;
                                            if (yeVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(yeVar);
                                                sd0Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) sd0Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            sd0Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) sd0Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) sd0Var2.e).addListener(new rd0(sd0Var2, 1));
                                            ((AnimatorSet) sd0Var2.e).start();
                                            wd0.a((wd0) sd0Var2.h);
                                            z4 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        i122 = intValue;
                                        z4 = false;
                                        break;
                                }
                                if (((StringBuilder) sd0Var2.d).length() == 4) {
                                    wd0Var.k(false);
                                }
                                int i19 = i122;
                                if (i19 != 11) {
                                    Drawable drawable = wd0Var.a;
                                    if (drawable instanceof ec0) {
                                        ec0 ec0Var = (ec0) drawable;
                                        ec0Var.D = null;
                                        ec0Var.z();
                                        float f10 = ec0Var.h;
                                        if (i19 == 10) {
                                            if (z4) {
                                                ec0Var.y();
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                            ec0Var.x(true);
                                            z11 = true;
                                        }
                                        if (z11) {
                                            if (f10 >= 1.0f) {
                                                wd0Var.b(ec0Var);
                                                break;
                                            } else {
                                                lh.r5 r5Var = new lh.r5(wd0Var, z10, ec0Var, 16);
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(r5Var);
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z10));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i20 = 0; i20 < linkedList6.size(); i20++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i20);
                                                    Boolean bool = (Boolean) linkedList7.get(i20);
                                                    if (bool != null && bool.booleanValue() != z10) {
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
                                                Collections.sort(arrayList5, new nh.e4(22));
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
            this.f.add(ud0Var);
            i13++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f.get(i10), k7.b6.e(60, 60, 51));
        }
        d();
    }

    public static void a(wd0 wd0Var) {
        FrameLayout frameLayout = wd0Var.b;
        sd0 sd0Var = wd0Var.s;
        boolean z4 = sd0Var == null || ((StringBuilder) sd0Var.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.ui.b.p(frameLayout.animate().alpha(z4 ? 0.0f : 1.0f).scaleX(z4 ? 0.8f : 1.0f).scaleY(z4 ? 0.8f : 1.0f), mr.h, 320L);
        }
    }

    public static void l(ud0 ud0Var, int i10) {
        ud0Var.setNextFocusForwardId(i10);
        if (Build.VERSION.SDK_INT >= 22) {
            ud0Var.setAccessibilityTraversalBefore(i10);
        }
    }

    public final void b(ec0 ec0Var) {
        o1.j jVar = this.I;
        if (jVar != null && jVar.f) {
            jVar.c();
        }
        kb.a aVar = new kb.a(0.0f);
        ec0Var.D = new ev(aVar, 8);
        ec0Var.z();
        o1.j jVar2 = new o1.j(aVar);
        jVar2.u = org.telegram.ui.ai.m(100.0f, 300.0f, 1.0f);
        this.I = jVar2;
        jVar2.a(new lb(3, this, ec0Var));
        this.I.b(new f7(ec0Var, 4));
        this.I.f();
    }

    public final void c() {
        Activity findActivity;
        yd0 yd0Var;
        if (Build.VERSION.SDK_INT >= 23 && (findActivity = AndroidUtilities.findActivity(getContext())) != null && this.n.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (findActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) findActivity;
                ArrayList arrayList = launchActivity.y0;
                if (!arrayList.isEmpty() || (yd0Var = launchActivity.x0) == null) {
                    if (kf.k0.i(1, arrayList) != this) {
                        return;
                    }
                } else if (this != yd0Var.b) {
                    return;
                }
            }
            try {
                if (new af.d(new androidx.biometric.t(getContext(), 0)).i(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    o5.i iVar = new o5.i(LaunchActivity.D1, f0.f.e(getContext()), new md0(this));
                    h5.u uVar = new h5.u(1);
                    uVar.b = LocaleController.getString(R.string.UnlockToUse);
                    uVar.d = LocaleController.getString(R.string.UsePIN);
                    uVar.a = 15;
                    iVar.h(uVar.c(), null);
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
        boolean z4 = false;
        if (Build.VERSION.SDK_INT < 23 || findActivity == null || !SharedConfig.useFingerprintLock) {
            this.n.setVisibility(8);
        } else {
            try {
                Context context = ApplicationLoader.applicationContext;
                jf.a aVar = jf.b.a;
                if (aVar.M0(context) && aVar.h(context) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    try {
                        this.n.setVisibility(0);
                        z4 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z4 = true;
                        FileLog.e(th);
                        this.n.setVisibility(8);
                        if (SharedConfig.passcodeType == 1) {
                        }
                        this.c.setText(LocaleController.getString(!z4 ? R.string.EnterPINorFingerprint : R.string.EnterPIN));
                    }
                } else {
                    this.n.setVisibility(8);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (SharedConfig.passcodeType == 1) {
            this.B.setVisibility(this.n.getVisibility());
        }
        this.c.setText(LocaleController.getString(!z4 ? R.string.EnterPINorFingerprint : R.string.EnterPIN));
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
            long j10 = SharedConfig.passcodeRetryInMs - (elapsedRealtime - SharedConfig.lastUptimeMillis);
            SharedConfig.passcodeRetryInMs = j10;
            if (j10 < 0) {
                SharedConfig.passcodeRetryInMs = 0L;
            }
        }
        SharedConfig.lastUptimeMillis = elapsedRealtime;
        SharedConfig.saveConfig();
        long j11 = SharedConfig.passcodeRetryInMs;
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        m2.b bVar = this.O;
        TextView textView = this.x;
        if (j11 <= 0) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
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
        int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
        if (max != this.P) {
            textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
            this.P = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            m(false);
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 100L);
    }

    public final boolean g() {
        ph.i3 i3Var = this.Q;
        if (i3Var == null || !i3Var.c()) {
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
                AndroidUtilities.runOnUIThread(new jd0(this, 0), 200L);
            }
            c();
        }
    }

    public final void j(boolean z4, int i10, int i11, org.telegram.ui.w10 w10Var) {
        View currentFocus;
        boolean z10;
        int i12;
        int i13;
        d();
        e();
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        int i14 = SharedConfig.passcodeType;
        TextView textView = this.x;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i14 == 1) {
            if (!z4 && textView.getVisibility() != 0 && editTextBoldCursor != null) {
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
        o9 o9Var = null;
        this.a = null;
        boolean z11 = org.telegram.ui.ActionBar.j6.r0() instanceof ec0;
        ah.e eVar = this.v;
        if (z11) {
            z10 = !org.telegram.ui.ActionBar.j6.I.q();
            this.a = org.telegram.ui.ActionBar.j6.r0();
            eVar.setBackgroundColor(-1090519040);
        } else {
            if (!org.telegram.ui.ActionBar.j6.W || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.j6.H0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.j6.H0())) {
                if (!"d".equals(org.telegram.ui.ActionBar.j6.H0())) {
                    String H0 = org.telegram.ui.ActionBar.j6.H0();
                    if (!org.telegram.ui.ActionBar.j6.j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(H0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(H0)) {
                        Drawable r02 = org.telegram.ui.ActionBar.j6.r0();
                        this.a = r02;
                        if (r02 instanceof o9) {
                            eVar.setBackgroundColor(570425344);
                        } else if (r02 != null) {
                            eVar.setBackgroundColor(-1090519040);
                        } else {
                            eVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                eVar.setBackgroundColor(-11436898);
            } else {
                org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.f0;
                if (c6Var != null && (i12 = c6Var.d) != 0 && (i13 = c6Var.e) != 0) {
                    o9Var = new o9(o9.d(c6Var.h), new int[]{i12, i13});
                }
                this.a = o9Var;
                if (o9Var == null) {
                    this.a = org.telegram.ui.ActionBar.j6.r0();
                }
                if (this.a instanceof o9) {
                    eVar.setBackgroundColor(570425344);
                } else {
                    eVar.setBackgroundColor(-1090519040);
                }
            }
            z10 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof ec0) {
            ec0 ec0Var = (ec0) drawable;
            int[] iArr = ec0Var.a;
            if (z10) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.j6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.a = new ec0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (ec0Var.u == null || ec0Var.q >= 0) {
                eVar.setBackgroundColor(570425344);
            } else {
                eVar.setBackgroundColor(2130706432);
            }
            ((ec0) this.a).r(eVar);
        }
        this.w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.B;
        ImageView imageView2 = this.y;
        dh.d dVar = this.e;
        sd0 sd0Var = this.s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                dVar.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            sd0Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            dVar.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            sd0Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        sd0.a(sd0Var, false);
        if (z4) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new qd0(this, i10, i11, w10Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.M = 1.0f;
            f(1.0f);
            jj0 jj0Var = this.F;
            jj0Var.setScaleX(1.0f);
            jj0Var.setScaleY(1.0f);
            jj0Var.i();
            jj0Var.getAnimatedDrawable().L(38, false, false);
            if (w10Var != null) {
                w10Var.run();
            }
        }
        setOnTouchListener(new oh.d(19));
    }

    public final void k(boolean z4) {
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (!z4) {
            if (SharedConfig.passcodeRetryInMs > 0) {
                return;
            }
            int i10 = SharedConfig.passcodeType;
            sd0 sd0Var = this.s;
            String sb = i10 == 0 ? ((StringBuilder) sd0Var.d).toString() : i10 == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb.length();
            FrameLayout frameLayout = this.b;
            if (length == 0) {
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i11 = -this.N;
                this.N = i11;
                AndroidUtilities.shakeViewSpring(frameLayout, i11);
                return;
            }
            if (!SharedConfig.checkPasscode(sb)) {
                SharedConfig.increaseBadPasscodeTries();
                if (SharedConfig.passcodeRetryInMs > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                sd0.a(sd0Var, true);
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i12 = -this.N;
                this.N = i12;
                AndroidUtilities.shakeViewSpring(frameLayout, i12);
                Drawable drawable = this.a;
                if (drawable instanceof ec0) {
                    ec0 ec0Var = (ec0) drawable;
                    o1.j jVar = this.I;
                    if (jVar != null) {
                        jVar.c();
                        ec0Var.h = 1.0f;
                        ec0Var.z();
                    }
                    if (ec0Var.h >= 1.0f) {
                        ec0Var.m(true);
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
        vd0 vd0Var = this.H;
        if (vd0Var != null) {
            vd0Var.h(this);
        }
        jj0 jj0Var = this.F;
        jj0Var.getAnimatedDrawable().N(71);
        jj0Var.getAnimatedDrawable().L(37, false, false);
        jj0Var.d();
        AndroidUtilities.runOnUIThread(new jd0(this, 1));
    }

    public final void m(boolean z4) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.R = z4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z4 ? 1.0f : 0.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new kd0(this, 1));
        this.S.addListener(new m00(8, this, z4));
        this.S.setInterpolator(mr.h);
        this.S.setDuration(320L);
        this.S.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.Q == null && (getParent() instanceof View)) {
            this.Q = new ph.i3((View) getParent(), false, new v2(this, 8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.G;
        getWindowVisibleDisplayFrame(rect);
        this.D = height - (rect.bottom - rect.top);
        if (SharedConfig.passcodeType == 1 && (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            int intValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((intValue + layoutParams.height) - (this.D / 2)) - AndroidUtilities.statusBarHeight;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z4, i10, i11, i12, i13);
        TextView textView = this.w;
        int[] iArr = this.T;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        jj0 jj0Var = this.F;
        if (isTablet || getContext().getResources().getConfiguration().orientation != 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.E = dp;
            jj0Var.setTranslationY(dp);
        } else {
            int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
            this.E = dp2;
            jj0Var.setTranslationY(dp2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = AndroidUtilities.displaySize.y;
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int dp3 = AndroidUtilities.dp(60.0f);
        boolean z4 = !AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.C;
        if (view != null) {
            view.setVisibility(SharedConfig.passcodeType == 1 ? 0 : 8);
        }
        jj0 jj0Var = this.F;
        dh.d dVar = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        if (z4) {
            if (SharedConfig.passcodeType == 0) {
                f10 = 2.0f;
                f11 = size / 2.0f;
            } else {
                f10 = 2.0f;
                f11 = size;
            }
            jj0Var.setTranslationX((f11 / f10) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = SharedConfig.passcodeType == 0 ? size / 2 : size;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            layoutParams.topMargin = org.telegram.ui.b.x(140.0f, i13, 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i13;
            int i14 = size / 2;
            layoutParams2.leftMargin = i14;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i14;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            dVar.setLayoutParams(layoutParams3);
        } else {
            jj0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i15 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.ui.b.x(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i13 > AndroidUtilities.dp(528.0f)) {
                    i15 = org.telegram.ui.b.x(528.0f, i13, 2);
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            dVar.setLayoutParams(layoutParams5);
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
        int dp4 = AndroidUtilities.dp(z4 ? 52.0f : 82.0f);
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

    public void setDelegate(vd0 vd0Var) {
        this.H = vd0Var;
    }

    public void f(float f10) {
    }

    public void h() {
    }
}
