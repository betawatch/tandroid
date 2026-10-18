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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class le0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] i0 = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public final ImageView E;
    public final View F;
    public int G;
    public final gh.b H;
    public final bh.b I;
    public Bitmap J;
    public Canvas K;
    public int L;
    public final xj0 M;
    public final Rect N;
    public ke0 O;
    public boolean P;
    public AnimatorSet Q;
    public AnimatorSet R;
    public ValueAnimator S;
    public o1.k T;
    public final LinkedList U;
    public final LinkedList V;
    public final ArrayList W;
    public Drawable a;
    public float a0;
    public final FrameLayout b;
    public int b0;
    public final TextView c;
    public final org.telegram.ui.Cells.k7 c0;
    public final FrameLayout d;
    public int d0;
    public final ci.i4 e;
    public ei.b4 e0;
    public final ArrayList f;
    public boolean f0;
    public ValueAnimator g0;
    public final FrameLayout h;
    public final int[] h0;
    public final je0 n;
    public final EditTextBoldCursor r;
    public final ei.x8 s;
    public final ah.v v;
    public final TextView w;
    public final TextView x;
    public final ImageView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le0(Context context) {
        super(context);
        int i10;
        String string = LocaleController.getString(R.string.UnlockToUse);
        int i11 = 0;
        this.G = 0;
        gh.b bVar = new gh.b();
        this.H = bVar;
        bh.b bVar2 = new bh.b(bVar);
        this.I = bVar2;
        re.b bVar3 = new re.b();
        this.N = new Rect();
        this.U = new LinkedList();
        this.V = new LinkedList();
        this.W = new ArrayList();
        this.b0 = -12;
        this.c0 = new org.telegram.ui.Cells.k7(this, 16);
        this.f0 = true;
        this.h0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        ah.v vVar = new ah.v(this, context);
        this.v = vVar;
        vVar.setWillNotDraw(false);
        addView(vVar, w7.z5.d(-1.0f, -1));
        bVar2.f = new ih.j(vVar);
        bVar2.g = vVar;
        bVar2.e = bVar3;
        xj0 xj0Var = new xj0(context);
        this.M = xj0Var;
        xj0Var.f(R.raw.passcode_lock, 58, 58, null);
        xj0Var.setAutoRepeat(false);
        addView(xj0Var, w7.z5.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        vVar.addView(frameLayout, w7.z5.d(-1.0f, -1));
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        TextView j10 = org.telegram.ui.Cells.c1.j(frameLayout, textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 128.0f, -2, 81), context);
        this.x = j10;
        j10.setTextColor(-1);
        j10.setTextSize(1, 15.0f);
        j10.setGravity(1);
        j10.setVisibility(4);
        vVar.addView(j10, w7.z5.e(-2, -2, 17));
        ei.x8 x8Var = new ei.x8(this, context);
        this.s = x8Var;
        frameLayout.addView(x8Var, w7.z5.a(-2.0f, 70.0f, 0.0f, 70.0f, 46.0f, -1, 81));
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
        frameLayout.addView(editTextBoldCursor, w7.z5.a(-2.0f, 70.0f, 0.0f, 70.0f, 0.0f, -1, 81));
        editTextBoldCursor.setOnEditorActionListener(new e1(this, 4));
        editTextBoldCursor.addTextChangedListener(new ai.u(this, 11));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new ki.c1(1));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackgroundResource(R.drawable.bar_selector_lock);
        frameLayout.addView(imageView, w7.z5.a(60.0f, 0.0f, 0.0f, 10.0f, 4.0f, 60, 85));
        imageView.setContentDescription(LocaleController.getString(R.string.Done));
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ce0
            public final /* synthetic */ le0 b;

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
                le0 le0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i13;
                int i14;
                le0 le0Var2;
                boolean z12;
                boolean z13;
                int i15 = i12;
                le0 le0Var3 = this.b;
                switch (i15) {
                    case 0:
                        le0Var3.m(false);
                        break;
                    case 1:
                        le0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = le0Var3.V;
                        LinkedList linkedList5 = le0Var3.U;
                        ei.x8 x8Var2 = le0Var3.s;
                        if (le0Var3.f0 && !le0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    le0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) x8Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) x8Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i16 = 1;
                                    StringBuilder sb2 = (StringBuilder) x8Var2.d;
                                    if (sb2.length() == 0) {
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            x8Var2.performHapticFeedback(3);
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
                                            le0 le0Var4 = le0Var3;
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
                                                fArr5[0] = x8Var2.c(i17);
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
                                                float c10 = x8Var2.c(i17);
                                                i14 = i17;
                                                float[] fArr10 = new float[i13];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            le0Var3 = le0Var4;
                                            i16 = 1;
                                        }
                                        le0Var = le0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, x8Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, x8Var2.c(i18)));
                                        }
                                        hf hfVar = (hf) x8Var2.f;
                                        if (hfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(hfVar);
                                            x8Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) x8Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        x8Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) x8Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) x8Var2.e).addListener(new he0(x8Var2, 1));
                                        ((AnimatorSet) x8Var2.e).start();
                                        le0.a((le0) x8Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (intValue == 11) {
                                le0Var2 = le0Var;
                            } else {
                                le0Var2 = le0Var;
                                Drawable drawable = le0Var2.a;
                                if (drawable instanceof wc0) {
                                    wc0 wc0Var = (wc0) drawable;
                                    wc0Var.D = null;
                                    wc0Var.y();
                                    float f7 = wc0Var.h;
                                    if (intValue == 10) {
                                        if (z11) {
                                            wc0Var.x();
                                            z13 = true;
                                        } else {
                                            z13 = z10;
                                        }
                                        z12 = z10;
                                    } else {
                                        z12 = true;
                                        wc0Var.w(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            le0Var2.b(wc0Var);
                                        } else {
                                            ?? r32 = linkedList2;
                                            r32.offer(new ai.x7(le0Var2, z12, wc0Var, 23));
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
                                            Collections.sort(arrayList5, new org.telegram.ui.ActionBar.i4(18));
                                            int size2 = arrayList5.size();
                                            for (?? r33 = z10; r33 < size2; r33++) {
                                                r22.remove(((Integer) arrayList5.get(r33)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) x8Var2.d).length() == 4) {
                                le0Var2.m(z10);
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
        frameLayout.addView(imageView2, w7.z5.a(60.0f, 10.0f, 0.0f, 0.0f, 4.0f, 60, 83));
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        final int i13 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ce0
            public final /* synthetic */ le0 b;

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
                le0 le0Var;
                LinkedList linkedList;
                LinkedList linkedList2;
                boolean z10;
                boolean z11;
                LinkedList linkedList3;
                int i132;
                int i14;
                le0 le0Var2;
                boolean z12;
                boolean z13;
                int i15 = i13;
                le0 le0Var3 = this.b;
                switch (i15) {
                    case 0:
                        le0Var3.m(false);
                        break;
                    case 1:
                        le0Var3.c();
                        break;
                    default:
                        LinkedList linkedList4 = le0Var3.V;
                        LinkedList linkedList5 = le0Var3.U;
                        ei.x8 x8Var2 = le0Var3.s;
                        if (le0Var3.f0 && !le0Var3.P) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            switch (intValue) {
                                case 0:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("0");
                                    z11 = z10;
                                    break;
                                case 1:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("1");
                                    z11 = z10;
                                    break;
                                case 2:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("2");
                                    z11 = z10;
                                    break;
                                case 3:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("3");
                                    z11 = z10;
                                    break;
                                case 4:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("4");
                                    z11 = z10;
                                    break;
                                case 5:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("5");
                                    z11 = z10;
                                    break;
                                case 6:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("6");
                                    z11 = z10;
                                    break;
                                case 7:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("7");
                                    z11 = z10;
                                    break;
                                case 8:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("8");
                                    z11 = z10;
                                    break;
                                case 9:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    x8Var2.b("9");
                                    z11 = z10;
                                    break;
                                case 10:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    le0Var.c();
                                    z11 = z10;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) x8Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    z10 = false;
                                    ArrayList arrayList2 = (ArrayList) x8Var2.b;
                                    Property property5 = View.TRANSLATION_X;
                                    int i16 = 1;
                                    StringBuilder sb2 = (StringBuilder) x8Var2.d;
                                    if (sb2.length() == 0) {
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z11 = z10;
                                        break;
                                    } else {
                                        try {
                                            x8Var2.performHapticFeedback(3);
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
                                            le0 le0Var4 = le0Var3;
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
                                                fArr5[0] = x8Var2.c(i17);
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
                                                float c10 = x8Var2.c(i17);
                                                i14 = i17;
                                                float[] fArr10 = new float[i132];
                                                fArr10[0] = c10;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                            } else {
                                                i14 = i17;
                                            }
                                            i17 = i14 + 1;
                                            linkedList5 = linkedList3;
                                            le0Var3 = le0Var4;
                                            i16 = 1;
                                        }
                                        le0Var = le0Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb2.deleteCharAt(length);
                                        }
                                        for (int i18 = 0; i18 < length; i18++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i18), (Property<TextView, Float>) property5, x8Var2.c(i18)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i18), (Property<TextView, Float>) property5, x8Var2.c(i18)));
                                        }
                                        hf hfVar = (hf) x8Var2.f;
                                        if (hfVar != null) {
                                            AndroidUtilities.cancelRunOnUIThread(hfVar);
                                            x8Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) x8Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        x8Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) x8Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) x8Var2.e).addListener(new he0(x8Var2, 1));
                                        ((AnimatorSet) x8Var2.e).start();
                                        le0.a((le0) x8Var2.h);
                                        z11 = true;
                                        break;
                                    }
                                default:
                                    le0Var = le0Var3;
                                    linkedList = linkedList4;
                                    linkedList2 = linkedList5;
                                    z10 = false;
                                    z11 = z10;
                                    break;
                            }
                            if (intValue == 11) {
                                le0Var2 = le0Var;
                            } else {
                                le0Var2 = le0Var;
                                Drawable drawable = le0Var2.a;
                                if (drawable instanceof wc0) {
                                    wc0 wc0Var = (wc0) drawable;
                                    wc0Var.D = null;
                                    wc0Var.y();
                                    float f7 = wc0Var.h;
                                    if (intValue == 10) {
                                        if (z11) {
                                            wc0Var.x();
                                            z13 = true;
                                        } else {
                                            z13 = z10;
                                        }
                                        z12 = z10;
                                    } else {
                                        z12 = true;
                                        wc0Var.w(true);
                                        z13 = true;
                                    }
                                    if (z13) {
                                        if (f7 >= 1.0f) {
                                            le0Var2.b(wc0Var);
                                        } else {
                                            ?? r32 = linkedList2;
                                            r32.offer(new ai.x7(le0Var2, z12, wc0Var, 23));
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
                                            Collections.sort(arrayList5, new org.telegram.ui.ActionBar.i4(18));
                                            int size2 = arrayList5.size();
                                            for (?? r33 = z10; r33 < size2; r33++) {
                                                r22.remove(((Integer) arrayList5.get(r33)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) x8Var2.d).length() == 4) {
                                le0Var2.m(z10);
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
        frameLayout.addView(view, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        vVar.addView(frameLayout2, w7.z5.e(-1, -1, 51));
        ci.i4 i4Var = new ci.i4(context, 17);
        this.e = i4Var;
        i4Var.setClipChildren(false);
        frameLayout2.addView(i4Var, w7.z5.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        i4Var.addView(frameLayout3, w7.z5.e(-2, -2, 49));
        TextView f7 = org.telegram.messenger.g0.f(context, 1, 15.0f);
        f7.setTypeface(AndroidUtilities.bold());
        f7.setTextColor(-1);
        f7.setText(string);
        TextView j11 = org.telegram.ui.Cells.c1.j(frameLayout3, f7, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 49), context);
        this.c = j11;
        j11.setTextSize(1, 14.0f);
        j11.setTextColor(-1);
        j11.setText((CharSequence) null);
        frameLayout3.addView(j11, w7.z5.a(-2.0f, 0.0f, 23.0f, 0.0f, 0.0f, -2, 49));
        this.f = new ArrayList(10);
        while (true) {
            if (i11 >= 12) {
                break;
            }
            je0 je0Var = new je0(context);
            w7.b6.b(je0Var, 0.15f, 1.5f);
            je0Var.setTag(Integer.valueOf(i11));
            int[] iArr = i0;
            if (i11 == 11) {
                int dp = AndroidUtilities.dp(30.0f);
                je0Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, 654311423, 654311423));
                je0Var.setImage(R.drawable.filled_clear);
                je0Var.setOnLongClickListener(new u10(this, 1));
                je0Var.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                int i14 = R.id.passcode_btn_0;
                je0Var.setNextFocusForwardId(i14);
                je0Var.setAccessibilityTraversalBefore(i14);
            } else if (i11 == 10) {
                this.n = je0Var;
                int dp2 = AndroidUtilities.dp(30.0f);
                je0Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, 654311423, 654311423));
                je0Var.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                je0Var.setImage(R.drawable.fingerprint);
                int i15 = R.id.passcode_btn_1;
                je0Var.setNextFocusForwardId(i15);
                je0Var.setAccessibilityTraversalBefore(i15);
            } else {
                bh.b bVar4 = this.I;
                eh.e eVar = new eh.e(null);
                eVar.e = new k2(26);
                eVar.d(1308622847, 1308622847);
                eVar.c(452984831, 452984831);
                eVar.b(335544320, 335544320);
                float dpf2 = AndroidUtilities.dpf2(6.0f);
                float dpf22 = AndroidUtilities.dpf2(1.0f);
                eVar.n = dpf2;
                eVar.r = dpf22;
                float dpf23 = AndroidUtilities.dpf2(1.0f);
                float dpf24 = AndroidUtilities.dpf2(0.6666667f);
                eVar.f = dpf23;
                eVar.h = dpf24;
                dh.d c10 = bVar4.c(je0Var, eVar, true);
                c10.q(AndroidUtilities.dp(30.0f));
                je0Var.setBackground(c10);
                int dp3 = AndroidUtilities.dp(30.0f);
                je0Var.setForeground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 0, 654311423, 654311423));
                je0Var.setContentDescription(i11 + "");
                je0Var.setNum(i11);
                if (i11 == 0) {
                    int i16 = R.id.passcode_btn_backspace;
                    je0Var.setNextFocusForwardId(i16);
                    je0Var.setAccessibilityTraversalBefore(i16);
                } else if (i11 != 9) {
                    int i17 = iArr[i11 + 1];
                    je0Var.setNextFocusForwardId(i17);
                    je0Var.setAccessibilityTraversalBefore(i17);
                } else if (f()) {
                    int i18 = R.id.passcode_btn_fingerprint;
                    je0Var.setNextFocusForwardId(i18);
                    je0Var.setAccessibilityTraversalBefore(i18);
                } else {
                    int i19 = R.id.passcode_btn_0;
                    je0Var.setNextFocusForwardId(i19);
                    je0Var.setAccessibilityTraversalBefore(i19);
                }
                je0Var.setId(iArr[i11]);
                final int i20 = 2;
                je0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ce0
                    public final /* synthetic */ le0 b;

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
                        le0 le0Var;
                        LinkedList linkedList;
                        LinkedList linkedList2;
                        boolean z10;
                        boolean z11;
                        LinkedList linkedList3;
                        int i132;
                        int i142;
                        le0 le0Var2;
                        boolean z12;
                        boolean z13;
                        int i152 = i20;
                        le0 le0Var3 = this.b;
                        switch (i152) {
                            case 0:
                                le0Var3.m(false);
                                break;
                            case 1:
                                le0Var3.c();
                                break;
                            default:
                                LinkedList linkedList4 = le0Var3.V;
                                LinkedList linkedList5 = le0Var3.U;
                                ei.x8 x8Var2 = le0Var3.s;
                                if (le0Var3.f0 && !le0Var3.P) {
                                    int intValue = ((Integer) view2.getTag()).intValue();
                                    switch (intValue) {
                                        case 0:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("0");
                                            z11 = z10;
                                            break;
                                        case 1:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("1");
                                            z11 = z10;
                                            break;
                                        case 2:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("2");
                                            z11 = z10;
                                            break;
                                        case 3:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("3");
                                            z11 = z10;
                                            break;
                                        case 4:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("4");
                                            z11 = z10;
                                            break;
                                        case 5:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("5");
                                            z11 = z10;
                                            break;
                                        case 6:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("6");
                                            z11 = z10;
                                            break;
                                        case 7:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("7");
                                            z11 = z10;
                                            break;
                                        case 8:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("8");
                                            z11 = z10;
                                            break;
                                        case 9:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            x8Var2.b("9");
                                            z11 = z10;
                                            break;
                                        case 10:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            le0Var.c();
                                            z11 = z10;
                                            break;
                                        case 11:
                                            ArrayList arrayList = (ArrayList) x8Var2.c;
                                            Property property = View.TRANSLATION_Y;
                                            Property property2 = View.ALPHA;
                                            Property property3 = View.SCALE_Y;
                                            Property property4 = View.SCALE_X;
                                            z10 = false;
                                            ArrayList arrayList2 = (ArrayList) x8Var2.b;
                                            Property property5 = View.TRANSLATION_X;
                                            int i162 = 1;
                                            StringBuilder sb2 = (StringBuilder) x8Var2.d;
                                            if (sb2.length() == 0) {
                                                le0Var = le0Var3;
                                                linkedList = linkedList4;
                                                linkedList2 = linkedList5;
                                                z11 = z10;
                                                break;
                                            } else {
                                                try {
                                                    x8Var2.performHapticFeedback(3);
                                                } catch (Exception e) {
                                                    FileLog.e(e);
                                                }
                                                ArrayList arrayList3 = new ArrayList();
                                                int length = sb2.length() - 1;
                                                if (length != 0) {
                                                    sb2.deleteCharAt(length);
                                                }
                                                linkedList = linkedList4;
                                                int i172 = length;
                                                while (i172 < 4) {
                                                    TextView textView2 = (TextView) arrayList2.get(i172);
                                                    le0 le0Var4 = le0Var3;
                                                    if (textView2.getAlpha() != 0.0f) {
                                                        linkedList3 = linkedList5;
                                                        i132 = i162;
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
                                                        fArr5[0] = x8Var2.c(i172);
                                                        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                                    } else {
                                                        linkedList3 = linkedList5;
                                                        i132 = i162;
                                                    }
                                                    TextView textView3 = (TextView) arrayList.get(i172);
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
                                                        float c102 = x8Var2.c(i172);
                                                        i142 = i172;
                                                        float[] fArr10 = new float[i132];
                                                        fArr10[0] = c102;
                                                        arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                                    } else {
                                                        i142 = i172;
                                                    }
                                                    i172 = i142 + 1;
                                                    linkedList5 = linkedList3;
                                                    le0Var3 = le0Var4;
                                                    i162 = 1;
                                                }
                                                le0Var = le0Var3;
                                                linkedList2 = linkedList5;
                                                if (length == 0) {
                                                    sb2.deleteCharAt(length);
                                                }
                                                for (int i182 = 0; i182 < length; i182++) {
                                                    arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i182), (Property<TextView, Float>) property5, x8Var2.c(i182)));
                                                    arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i182), (Property<TextView, Float>) property5, x8Var2.c(i182)));
                                                }
                                                hf hfVar = (hf) x8Var2.f;
                                                if (hfVar != null) {
                                                    AndroidUtilities.cancelRunOnUIThread(hfVar);
                                                    x8Var2.f = null;
                                                }
                                                AnimatorSet animatorSet = (AnimatorSet) x8Var2.e;
                                                if (animatorSet != null) {
                                                    animatorSet.cancel();
                                                }
                                                AnimatorSet animatorSet2 = new AnimatorSet();
                                                x8Var2.e = animatorSet2;
                                                animatorSet2.setDuration(150L);
                                                ((AnimatorSet) x8Var2.e).playTogether(arrayList3);
                                                ((AnimatorSet) x8Var2.e).addListener(new he0(x8Var2, 1));
                                                ((AnimatorSet) x8Var2.e).start();
                                                le0.a((le0) x8Var2.h);
                                                z11 = true;
                                                break;
                                            }
                                        default:
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z10 = false;
                                            z11 = z10;
                                            break;
                                    }
                                    if (intValue == 11) {
                                        le0Var2 = le0Var;
                                    } else {
                                        le0Var2 = le0Var;
                                        Drawable drawable = le0Var2.a;
                                        if (drawable instanceof wc0) {
                                            wc0 wc0Var = (wc0) drawable;
                                            wc0Var.D = null;
                                            wc0Var.y();
                                            float f72 = wc0Var.h;
                                            if (intValue == 10) {
                                                if (z11) {
                                                    wc0Var.x();
                                                    z13 = true;
                                                } else {
                                                    z13 = z10;
                                                }
                                                z12 = z10;
                                            } else {
                                                z12 = true;
                                                wc0Var.w(true);
                                                z13 = true;
                                            }
                                            if (z13) {
                                                if (f72 >= 1.0f) {
                                                    le0Var2.b(wc0Var);
                                                } else {
                                                    ?? r32 = linkedList2;
                                                    r32.offer(new ai.x7(le0Var2, z12, wc0Var, 23));
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
                                                    Collections.sort(arrayList5, new org.telegram.ui.ActionBar.i4(18));
                                                    int size2 = arrayList5.size();
                                                    for (?? r33 = z10; r33 < size2; r33++) {
                                                        r22.remove(((Integer) arrayList5.get(r33)).intValue());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (((StringBuilder) x8Var2.d).length() == 4) {
                                        le0Var2.m(z10);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                this.f.add(je0Var);
                i11++;
            }
            je0Var.setId(iArr[i11]);
            final int i202 = 2;
            je0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ce0
                public final /* synthetic */ le0 b;

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
                    le0 le0Var;
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    boolean z10;
                    boolean z11;
                    LinkedList linkedList3;
                    int i132;
                    int i142;
                    le0 le0Var2;
                    boolean z12;
                    boolean z13;
                    int i152 = i202;
                    le0 le0Var3 = this.b;
                    switch (i152) {
                        case 0:
                            le0Var3.m(false);
                            break;
                        case 1:
                            le0Var3.c();
                            break;
                        default:
                            LinkedList linkedList4 = le0Var3.V;
                            LinkedList linkedList5 = le0Var3.U;
                            ei.x8 x8Var2 = le0Var3.s;
                            if (le0Var3.f0 && !le0Var3.P) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                switch (intValue) {
                                    case 0:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("0");
                                        z11 = z10;
                                        break;
                                    case 1:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("1");
                                        z11 = z10;
                                        break;
                                    case 2:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("2");
                                        z11 = z10;
                                        break;
                                    case 3:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("3");
                                        z11 = z10;
                                        break;
                                    case 4:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("4");
                                        z11 = z10;
                                        break;
                                    case 5:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("5");
                                        z11 = z10;
                                        break;
                                    case 6:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("6");
                                        z11 = z10;
                                        break;
                                    case 7:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("7");
                                        z11 = z10;
                                        break;
                                    case 8:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("8");
                                        z11 = z10;
                                        break;
                                    case 9:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        x8Var2.b("9");
                                        z11 = z10;
                                        break;
                                    case 10:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        le0Var.c();
                                        z11 = z10;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) x8Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        z10 = false;
                                        ArrayList arrayList2 = (ArrayList) x8Var2.b;
                                        Property property5 = View.TRANSLATION_X;
                                        int i162 = 1;
                                        StringBuilder sb2 = (StringBuilder) x8Var2.d;
                                        if (sb2.length() == 0) {
                                            le0Var = le0Var3;
                                            linkedList = linkedList4;
                                            linkedList2 = linkedList5;
                                            z11 = z10;
                                            break;
                                        } else {
                                            try {
                                                x8Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int length = sb2.length() - 1;
                                            if (length != 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i172 = length;
                                            while (i172 < 4) {
                                                TextView textView2 = (TextView) arrayList2.get(i172);
                                                le0 le0Var4 = le0Var3;
                                                if (textView2.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i132 = i162;
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
                                                    fArr5[0] = x8Var2.c(i172);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i132 = i162;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i172);
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
                                                    float c102 = x8Var2.c(i172);
                                                    i142 = i172;
                                                    float[] fArr10 = new float[i132];
                                                    fArr10[0] = c102;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, fArr10));
                                                } else {
                                                    i142 = i172;
                                                }
                                                i172 = i142 + 1;
                                                linkedList5 = linkedList3;
                                                le0Var3 = le0Var4;
                                                i162 = 1;
                                            }
                                            le0Var = le0Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb2.deleteCharAt(length);
                                            }
                                            for (int i182 = 0; i182 < length; i182++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i182), (Property<TextView, Float>) property5, x8Var2.c(i182)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i182), (Property<TextView, Float>) property5, x8Var2.c(i182)));
                                            }
                                            hf hfVar = (hf) x8Var2.f;
                                            if (hfVar != null) {
                                                AndroidUtilities.cancelRunOnUIThread(hfVar);
                                                x8Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) x8Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            x8Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) x8Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) x8Var2.e).addListener(new he0(x8Var2, 1));
                                            ((AnimatorSet) x8Var2.e).start();
                                            le0.a((le0) x8Var2.h);
                                            z11 = true;
                                            break;
                                        }
                                    default:
                                        le0Var = le0Var3;
                                        linkedList = linkedList4;
                                        linkedList2 = linkedList5;
                                        z10 = false;
                                        z11 = z10;
                                        break;
                                }
                                if (intValue == 11) {
                                    le0Var2 = le0Var;
                                } else {
                                    le0Var2 = le0Var;
                                    Drawable drawable = le0Var2.a;
                                    if (drawable instanceof wc0) {
                                        wc0 wc0Var = (wc0) drawable;
                                        wc0Var.D = null;
                                        wc0Var.y();
                                        float f72 = wc0Var.h;
                                        if (intValue == 10) {
                                            if (z11) {
                                                wc0Var.x();
                                                z13 = true;
                                            } else {
                                                z13 = z10;
                                            }
                                            z12 = z10;
                                        } else {
                                            z12 = true;
                                            wc0Var.w(true);
                                            z13 = true;
                                        }
                                        if (z13) {
                                            if (f72 >= 1.0f) {
                                                le0Var2.b(wc0Var);
                                            } else {
                                                ?? r32 = linkedList2;
                                                r32.offer(new ai.x7(le0Var2, z12, wc0Var, 23));
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
                                                Collections.sort(arrayList5, new org.telegram.ui.ActionBar.i4(18));
                                                int size2 = arrayList5.size();
                                                for (?? r33 = z10; r33 < size2; r33++) {
                                                    r22.remove(((Integer) arrayList5.get(r33)).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) x8Var2.d).length() == 4) {
                                    le0Var2.m(z10);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.f.add(je0Var);
            i11++;
        }
        for (i10 = 11; i10 >= 0; i10--) {
            this.e.addView((FrameLayout) this.f.get(i10), w7.z5.e(60, 60, 51));
        }
        d();
    }

    public static void a(le0 le0Var) {
        FrameLayout frameLayout = le0Var.b;
        ei.x8 x8Var = le0Var.s;
        boolean z10 = x8Var == null || ((StringBuilder) x8Var.d).length() > 0;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            org.telegram.messenger.kk.t(frameLayout.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(z10 ? 0.8f : 1.0f).scaleY(z10 ? 0.8f : 1.0f), bs.h, 320L);
        }
    }

    public final void b(wc0 wc0Var) {
        o1.k kVar = this.T;
        if (kVar != null && kVar.f) {
            kVar.c();
        }
        o1.j jVar = new o1.j(0.0f);
        wc0Var.D = new tv(jVar, 9);
        wc0Var.y();
        o1.k kVar2 = new o1.k(jVar);
        kVar2.u = org.telegram.ui.Cells.c1.l(100.0f, 300.0f, 1.0f);
        this.T = kVar2;
        kVar2.a(new gi.b4(4, this, wc0Var));
        this.T.b(new l7(wc0Var, 5));
        this.T.h();
    }

    public final void c() {
        Activity findActivity;
        ne0 ne0Var;
        if (this.P || (findActivity = AndroidUtilities.findActivity(getContext())) == null || this.n.getVisibility() != 0 || ApplicationLoader.mainInterfacePaused) {
            return;
        }
        if (findActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) findActivity;
            ArrayList arrayList = launchActivity.B0;
            if (!arrayList.isEmpty() || (ne0Var = launchActivity.A0) == null) {
                if (i2.d.h(1, arrayList) != this) {
                    return;
                }
            } else if (this != ne0Var.b) {
                return;
            }
        }
        try {
            if (new androidx.biometric.e(new k6.h(getContext(), 1)).h(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                a6.m mVar = new a6.m(LaunchActivity.H1, f0.c.d(getContext()), new de0(this));
                j6.l lVar = new j6.l(1);
                lVar.b = LocaleController.getString(R.string.UnlockToUse);
                lVar.d = LocaleController.getString(R.string.UsePIN);
                lVar.a = 15;
                mVar.c(lVar.a(), null);
                n(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void d() {
        boolean f7 = f();
        int i10 = f7 ? 0 : 8;
        je0 je0Var = this.n;
        je0Var.setVisibility(i10);
        if (SharedConfig.passcodeType == 1) {
            this.E.setVisibility(je0Var.getVisibility());
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
        org.telegram.ui.Cells.k7 k7Var = this.c0;
        TextView textView = this.x;
        if (j11 <= 0) {
            AndroidUtilities.cancelRunOnUIThread(k7Var);
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
        int max = Math.max(1, (int) Math.ceil(j11 / 1000.0d));
        if (max != this.d0) {
            textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
            this.d0 = max;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            n(false);
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        AndroidUtilities.runOnUIThread(k7Var, 100L);
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (fingerprintManager2 != null) {
                    z10 = fingerprintManager2.isHardwareDetected();
                    if (z10) {
                        try {
                            fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
        ei.b4 b4Var = this.e0;
        if (b4Var == null || !b4Var.c()) {
            return true;
        }
        AndroidUtilities.hideKeyboard(this.r);
        return false;
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.c0);
    }

    public final void k() {
        if (this.P) {
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
                AndroidUtilities.runOnUIThread(new ae0(this, 0), 200L);
            }
            c();
        }
    }

    public final void l(boolean z10, int i10, int i11, org.telegram.ui.b80 b80Var) {
        View currentFocus;
        boolean z11;
        int i12;
        int i13;
        if (getVisibility() != 0) {
            this.P = false;
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
        v9 v9Var = null;
        this.a = null;
        boolean z12 = org.telegram.ui.ActionBar.h6.s0() instanceof wc0;
        ah.v vVar = this.v;
        if (z12) {
            z11 = !org.telegram.ui.ActionBar.h6.I.q();
            this.a = org.telegram.ui.ActionBar.h6.s0();
            vVar.setBackgroundColor(-1090519040);
        } else {
            if (!org.telegram.ui.ActionBar.h6.W || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(org.telegram.ui.ActionBar.h6.I0()) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(org.telegram.ui.ActionBar.h6.I0())) {
                if (!"d".equals(org.telegram.ui.ActionBar.h6.I0())) {
                    String I0 = org.telegram.ui.ActionBar.h6.I0();
                    if (!org.telegram.ui.ActionBar.h6.j0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(I0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(I0)) {
                        Drawable s02 = org.telegram.ui.ActionBar.h6.s0();
                        this.a = s02;
                        if (s02 instanceof v9) {
                            vVar.setBackgroundColor(570425344);
                        } else if (s02 != null) {
                            vVar.setBackgroundColor(-1090519040);
                        } else {
                            vVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                vVar.setBackgroundColor(-11436898);
            } else {
                org.telegram.ui.ActionBar.a6 a6Var = org.telegram.ui.ActionBar.h6.I.i0;
                if (a6Var != null && (i12 = a6Var.d) != 0 && (i13 = a6Var.e) != 0) {
                    v9Var = new v9(v9.d(a6Var.h), new int[]{i12, i13});
                }
                this.a = v9Var;
                if (v9Var == null) {
                    this.a = org.telegram.ui.ActionBar.h6.s0();
                }
                if (this.a instanceof v9) {
                    vVar.setBackgroundColor(570425344);
                } else {
                    vVar.setBackgroundColor(-1090519040);
                }
            }
            z11 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof wc0) {
            wc0 wc0Var = (wc0) drawable;
            int[] iArr = wc0Var.a;
            if (z11) {
                int[] iArr2 = new int[iArr.length];
                for (int i15 = 0; i15 < iArr.length; i15++) {
                    iArr2[i15] = org.telegram.ui.ActionBar.h6.b(0.14f, 0.0f, iArr[i15]);
                }
                iArr = iArr2;
            }
            this.a = new wc0(false, iArr[0], iArr[1], iArr[2], iArr[3]);
            if (wc0Var.u == null || wc0Var.q >= 0) {
                vVar.setBackgroundColor(570425344);
            } else {
                vVar.setBackgroundColor(2130706432);
            }
            ((wc0) this.a).q(vVar);
        }
        this.w.setText(LocaleController.getString(R.string.AppLocked));
        int i16 = SharedConfig.passcodeType;
        ImageView imageView = this.E;
        ImageView imageView2 = this.y;
        ci.i4 i4Var = this.e;
        ei.x8 x8Var = this.s;
        if (i16 == 0) {
            if (textView.getVisibility() != 0) {
                i4Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            x8Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i16 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            i4Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            x8Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        ei.x8.a(x8Var, false);
        if (z10) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new ge0(this, i10, i11, b80Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.a0 = 1.0f;
            g(1.0f);
            xj0 xj0Var = this.M;
            xj0Var.setScaleX(1.0f);
            xj0Var.setScaleY(1.0f);
            xj0Var.i();
            xj0Var.getAnimatedDrawable().N(38, false, false);
            if (b80Var != null) {
                b80Var.run();
            }
        }
        setOnTouchListener(new di.d(19));
    }

    public final void m(boolean z10) {
        if (this.P || getVisibility() != 0) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (!z10) {
            if (SharedConfig.passcodeRetryInMs > 0) {
                return;
            }
            int i10 = SharedConfig.passcodeType;
            ei.x8 x8Var = this.s;
            String sb2 = i10 == 0 ? ((StringBuilder) x8Var.d).toString() : i10 == 1 ? editTextBoldCursor.getText().toString() : "";
            int length = sb2.length();
            FrameLayout frameLayout = this.b;
            if (length == 0) {
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i11 = -this.b0;
                this.b0 = i11;
                AndroidUtilities.shakeViewSpring(frameLayout, i11);
                return;
            }
            if (!SharedConfig.checkPasscode(sb2)) {
                SharedConfig.increaseBadPasscodeTries();
                if (SharedConfig.passcodeRetryInMs > 0) {
                    e();
                }
                editTextBoldCursor.setText("");
                ei.x8.a(x8Var, true);
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i12 = -this.b0;
                this.b0 = i12;
                AndroidUtilities.shakeViewSpring(frameLayout, i12);
                Drawable drawable = this.a;
                if (drawable instanceof wc0) {
                    wc0 wc0Var = (wc0) drawable;
                    LinkedList linkedList = this.U;
                    linkedList.clear();
                    LinkedList linkedList2 = this.V;
                    linkedList2.clear();
                    o1.k kVar = this.T;
                    if (kVar == null || !kVar.f) {
                        wc0Var.m(true);
                        return;
                    } else {
                        linkedList.offer(new vc0(wc0Var, 1));
                        linkedList2.offer(Boolean.FALSE);
                        return;
                    }
                }
                return;
            }
        }
        this.P = true;
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
        ke0 ke0Var = this.O;
        if (ke0Var != null) {
            ke0Var.j(this);
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
        xj0 xj0Var = this.M;
        xj0Var.getAnimatedDrawable().P(71);
        xj0Var.getAnimatedDrawable().N(37, false, false);
        xj0Var.d();
        AndroidUtilities.runOnUIThread(new ae0(this, 1));
    }

    public final void n(boolean z10) {
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f0 = z10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e.getAlpha(), z10 ? 1.0f : 0.0f);
        this.g0 = ofFloat;
        ofFloat.addUpdateListener(new be0(this, 0));
        this.g0.addListener(new org.telegram.ui.ho(17, this, z10));
        this.g0.setInterpolator(bs.h);
        this.g0.setDuration(320L);
        this.g0.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.e0 == null && (getParent() instanceof View)) {
            this.e0 = new ei.b4((View) getParent(), false, new z2(this, 9));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
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
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.N;
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
        int[] iArr = this.h0;
        textView.getLocationInWindow(iArr);
        boolean isTablet = AndroidUtilities.isTablet();
        xj0 xj0Var = this.M;
        if (isTablet || getContext().getResources().getConfiguration().orientation != 2) {
            int dp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.L = dp;
            xj0Var.setTranslationY(dp);
        } else {
            int dp2 = iArr[1] - AndroidUtilities.dp(100.0f);
            this.L = dp2;
            xj0Var.setTranslationY(dp2);
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
        xj0 xj0Var = this.M;
        ci.i4 i4Var = this.e;
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
            xj0Var.setTranslationX((f10 / f7) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = SharedConfig.passcodeType == 0 ? size / 2 : size;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            layoutParams.topMargin = org.telegram.messenger.kk.A(140.0f, i14, 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i14;
            int i15 = size / 2;
            layoutParams2.leftMargin = i15;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i15;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i4Var.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            layoutParams3.gravity = 17;
            i4Var.setLayoutParams(layoutParams3);
            i13 = 0;
        } else {
            xj0Var.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int i16 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    i12 = org.telegram.messenger.kk.A(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    i12 = 0;
                }
                if (i14 > AndroidUtilities.dp(528.0f)) {
                    i16 = org.telegram.messenger.kk.A(528.0f, i14, 2);
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) i4Var.getLayoutParams();
            i13 = 0;
            layoutParams5.height = (Math.max(0, 3) * dp2) + (dp3 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * dp) + (dp3 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            i4Var.setLayoutParams(layoutParams5);
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

    public void setDelegate(ke0 ke0Var) {
        this.O = ke0Var;
    }

    public void g(float f7) {
    }

    public void i() {
    }
}
