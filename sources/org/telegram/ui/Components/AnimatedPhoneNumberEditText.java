package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class AnimatedPhoneNumberEditText extends j30 {
    public final ArrayList P1;
    public final ArrayList Q1;
    public final TextPaint R1;
    public ObjectAnimator S1;
    public float T1;
    public String U1;
    public final i6 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public Boolean Y1;
    public String Z1;
    public di.p6 a2;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.P1 = new ArrayList();
        this.Q1 = new ArrayList();
        this.R1 = new TextPaint(1);
        this.U1 = "";
        this.V1 = new i6(this, 0);
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
    }

    public static /* synthetic */ void B(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.W1.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.X1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        if (z10) {
            return;
        }
        super.setHintText(str);
    }

    @Override // org.telegram.ui.Components.j30
    public final void A(int i7) {
        ArrayList arrayList = this.W1;
        if (i7 < arrayList.size()) {
            this.M1.setAlpha((int) (((Float) arrayList.get(i7)).floatValue() * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.j30
    public String getHintText() {
        return this.Z1;
    }

    public float getProgress() {
        return this.T1;
    }

    @Override // org.telegram.ui.Components.j30
    public void setHintText(String str) {
        boolean isEmpty;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty2;
        Boolean bool = this.Y1;
        ArrayList arrayList = this.W1;
        ArrayList arrayList2 = this.X1;
        if (bool == null || bool.booleanValue() != z10) {
            arrayList.clear();
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                ((r1.g) obj).d();
            }
            arrayList2.clear();
            this.Y1 = Boolean.valueOf(z10);
            isEmpty = TextUtils.isEmpty(getText());
        } else {
            isEmpty = false;
        }
        String str2 = !isEmpty2 ? str : this.Z1;
        if (str2 == null) {
            str2 = "";
        }
        this.Z1 = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            di.p6 p6Var = new di.p6(this, z10, str, 18);
            Runnable runnable = this.a2;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i10 = 0; i10 < length; i10++) {
                float f10 = 0.0f;
                float f11 = !isEmpty2 ? 0.0f : 1.0f;
                if (!isEmpty2) {
                    f10 = 1.0f;
                }
                r1.g gVar = new r1.g(Integer.valueOf(i10), this.V1);
                float f12 = f10 * 100.0f;
                r1.h hVar = new r1.h(f12);
                hVar.b(500.0f);
                hVar.a(1.0f);
                hVar.i = f12;
                gVar.m = hVar;
                gVar.b = 100.0f * f11;
                gVar.c = true;
                arrayList2.add(gVar);
                arrayList.add(Float.valueOf(f11));
                postDelayed(new og(gVar, 7), i10 * 5);
            }
            this.a2 = p6Var;
            postDelayed(p6Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        TextPaint textPaint;
        ArrayList arrayList2 = this.Q1;
        if (arrayList2 == null || (arrayList = this.P1) == null || Objects.equals(this.U1, str)) {
            return;
        }
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.S1 = null;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
        int i7 = 0;
        boolean z10 = TextUtils.isEmpty(this.U1) && !TextUtils.isEmpty(str);
        this.T1 = 0.0f;
        while (i7 < str.length()) {
            int i10 = i7 + 1;
            String substring = str.substring(i7, i10);
            String substring2 = (arrayList2.isEmpty() || i7 >= this.U1.length()) ? null : this.U1.substring(i7, i10);
            if (z10 || substring2 == null || !substring2.equals(substring)) {
                TextPaint textPaint2 = this.R1;
                if (z10 && substring2 == null) {
                    textPaint = textPaint2;
                    arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    textPaint = textPaint2;
                }
                arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList.add((StaticLayout) arrayList2.get(i7));
                arrayList2.set(i7, null);
            }
            i7 = i10;
        }
        if (!arrayList2.isEmpty()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
            this.S1 = ofFloat;
            ofFloat.setDuration(150L);
            this.S1.addListener(new y(this, 2));
            this.S1.start();
        }
        this.U1 = str;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.T1 == f10) {
            return;
        }
        this.T1 = f10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.rt, android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        this.R1.setColor(i7);
    }

    @Override // org.telegram.ui.Components.j30, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView
    public final void setTextSize(int i7, float f10) {
        super.setTextSize(i7, f10);
        this.R1.setTextSize(TypedValue.applyDimension(i7, f10, getResources().getDisplayMetrics()));
    }
}
