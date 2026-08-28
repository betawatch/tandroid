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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class AnimatedPhoneNumberEditText extends p30 {
    public String A;
    public gh.u5 B;
    public final ArrayList e;
    public final ArrayList f;
    public final TextPaint h;
    public ObjectAnimator n;
    public float r;
    public String s;
    public final o1.d v;
    public final ArrayList w;
    public final ArrayList x;
    public Boolean y;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new TextPaint(1);
        this.s = "";
        this.v = new o1.d(this, 1);
        this.w = new ArrayList();
        this.x = new ArrayList();
    }

    public static /* synthetic */ void j(AnimatedPhoneNumberEditText animatedPhoneNumberEditText, boolean z10, String str) {
        animatedPhoneNumberEditText.w.clear();
        ArrayList arrayList = animatedPhoneNumberEditText.x;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((o1.j) obj).c();
        }
        if (z10) {
            return;
        }
        super.setHintText(str);
    }

    @Override // org.telegram.ui.Components.p30
    public String getHintText() {
        return this.A;
    }

    public float getProgress() {
        return this.r;
    }

    @Override // org.telegram.ui.Components.p30
    public final void i(int i9) {
        ArrayList arrayList = this.w;
        if (i9 < arrayList.size()) {
            this.b.setAlpha((int) (((Float) arrayList.get(i9)).floatValue() * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.p30
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
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                ((o1.j) obj).c();
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
            gh.u5 u5Var = new gh.u5(this, z10, str, 14);
            Runnable runnable = this.B;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i10 = 0; i10 < length; i10++) {
                float f10 = 0.0f;
                float f11 = !isEmpty2 ? 0.0f : 1.0f;
                if (!isEmpty2) {
                    f10 = 1.0f;
                }
                o1.j jVar = new o1.j(Integer.valueOf(i10), this.v);
                float f12 = f10 * 100.0f;
                o1.k kVar = new o1.k(f12);
                kVar.b(500.0f);
                kVar.a(1.0f);
                kVar.i = f12;
                jVar.u = kVar;
                jVar.b = 100.0f * f11;
                jVar.c = true;
                arrayList2.add(jVar);
                arrayList.add(Float.valueOf(f11));
                postDelayed(new fg(jVar, 7), i10 * 5);
            }
            this.B = u5Var;
            postDelayed(u5Var, (length * 5) + 150);
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
        int i9 = 0;
        boolean z10 = TextUtils.isEmpty(this.s) && !TextUtils.isEmpty(str);
        this.r = 0.0f;
        while (i9 < str.length()) {
            int i10 = i9 + 1;
            String substring = str.substring(i9, i10);
            String substring2 = (arrayList2.isEmpty() || i9 >= this.s.length()) ? null : this.s.substring(i9, i10);
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
                arrayList.add((StaticLayout) arrayList2.get(i9));
                arrayList2.set(i9, null);
            }
            i9 = i10;
        }
        if (!arrayList2.isEmpty()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
            this.n = ofFloat;
            ofFloat.setDuration(150L);
            this.n.addListener(new org.telegram.ui.xp(this, 3));
            this.n.start();
        }
        this.s = str;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.r == f10) {
            return;
        }
        this.r = f10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.ot, android.widget.TextView
    public void setTextColor(int i9) {
        super.setTextColor(i9);
        this.h.setColor(i9);
    }

    @Override // org.telegram.ui.Components.p30, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView
    public final void setTextSize(int i9, float f10) {
        super.setTextSize(i9, f10);
        this.h.setTextSize(TypedValue.applyDimension(i9, f10, getResources().getDisplayMetrics()));
    }
}
