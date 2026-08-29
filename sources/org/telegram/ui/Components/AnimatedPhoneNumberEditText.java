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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class AnimatedPhoneNumberEditText extends d40 {
    public String A;
    public jh.r5 B;
    public final ArrayList e;
    public final ArrayList f;
    public final TextPaint h;
    public ObjectAnimator n;
    public float r;
    public String s;
    public final o1.e v;
    public final ArrayList w;
    public final ArrayList x;
    public Boolean y;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new TextPaint(1);
        this.s = "";
        this.v = new o1.e(this, 1);
        this.w = new ArrayList();
        this.x = new ArrayList();
    }

    public static /* synthetic */ void j(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.w.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.x;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        if (z10) {
            return;
        }
        super.setHintText(str);
    }

    @Override // org.telegram.ui.Components.d40
    public String getHintText() {
        return this.A;
    }

    public float getProgress() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.d40
    public final void i(int i10) {
        ArrayList arrayList = this.w;
        if (i10 < arrayList.size()) {
            this.b.setAlpha((int) (((Float) arrayList.get(i10)).floatValue() * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.d40
    public void setHintText(String str) {
        boolean isEmpty;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty2;
        Boolean bool = this.y;
        ArrayList arrayList = this.w;
        ArrayList arrayList2 = this.x;
        if (bool == null || bool.booleanValue() != z10) {
            arrayList.clear();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((o1.k) obj).c();
            }
            arrayList2.clear();
            this.y = Boolean.valueOf(z10);
            isEmpty = TextUtils.isEmpty(getText());
        } else {
            isEmpty = false;
        }
        String str2 = !isEmpty2 ? str : this.A;
        if (str2 == null) {
            str2 = "";
        }
        this.A = str;
        if (!isEmpty2 || !isEmpty) {
            super.setHintText(str);
        }
        if (isEmpty) {
            int length = str2.length();
            jh.r5 r5Var = new jh.r5(this, z10, str, 14);
            Runnable runnable = this.B;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i11 = 0; i11 < length; i11++) {
                float f9 = 0.0f;
                float f10 = !isEmpty2 ? 0.0f : 1.0f;
                if (!isEmpty2) {
                    f9 = 1.0f;
                }
                o1.k kVar = new o1.k(Integer.valueOf(i11), this.v);
                float f11 = f9 * 100.0f;
                o1.l lVar = new o1.l(f11);
                lVar.b(500.0f);
                lVar.a(1.0f);
                lVar.i = f11;
                kVar.u = lVar;
                kVar.b = 100.0f * f10;
                kVar.c = true;
                arrayList2.add(kVar);
                arrayList.add(Float.valueOf(f10));
                postDelayed(new ig(kVar, 7), i11 * 5);
            }
            this.B = r5Var;
            postDelayed(r5Var, (length * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        TextPaint textPaint;
        ArrayList arrayList2 = this.f;
        if (arrayList2 == null || (arrayList = this.e) == null || Objects.equals(this.s, str)) {
            return;
        }
        ObjectAnimator objectAnimator = this.n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.n = null;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
        int i10 = 0;
        boolean z10 = TextUtils.isEmpty(this.s) && !TextUtils.isEmpty(str);
        this.r = 0.0f;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            String substring = str.substring(i10, i11);
            String substring2 = (arrayList2.isEmpty() || i10 >= this.s.length()) ? null : this.s.substring(i10, i11);
            if (z10 || substring2 == null || !substring2.equals(substring)) {
                TextPaint textPaint2 = this.h;
                if (z10 && substring2 == null) {
                    textPaint = textPaint2;
                    arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    textPaint = textPaint2;
                }
                arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList.add((StaticLayout) arrayList2.get(i10));
                arrayList2.set(i10, null);
            }
            i10 = i11;
        }
        if (!arrayList2.isEmpty()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
            this.n = ofFloat;
            ofFloat.setDuration(150L);
            this.n.addListener(new org.telegram.ui.bm(this, 5));
            this.n.start();
        }
        this.s = str;
        invalidate();
    }

    public void setProgress(float f9) {
        if (this.r == f9) {
            return;
        }
        this.r = f9;
        invalidate();
    }

    @Override // org.telegram.ui.Components.ut, android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.h.setColor(i10);
    }

    @Override // org.telegram.ui.Components.d40, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView
    public final void setTextSize(int i10, float f9) {
        super.setTextSize(i10, f9);
        this.h.setTextSize(TypedValue.applyDimension(i10, f9, getResources().getDisplayMetrics()));
    }
}
