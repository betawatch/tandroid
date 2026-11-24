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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class AnimatedPhoneNumberEditText extends fe5 {
    public static final /* synthetic */ int b2 = 0;
    public final ArrayList P1;
    public final ArrayList Q1;
    public final TextPaint R1;
    public ObjectAnimator S1;
    public float T1;
    public String U1;
    public final sm V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public Boolean Y1;
    public String Z1;
    public mn6 a2;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.P1 = new ArrayList();
        this.Q1 = new ArrayList();
        this.R1 = new TextPaint(1);
        this.U1 = "";
        this.V1 = new sm(this, (byte) 0);
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
    }

    @Override // fe5
    public final void A(int i) {
        ArrayList arrayList = this.W1;
        if (i < arrayList.size()) {
            this.M1.setAlpha((int) (((Float) arrayList.get(i)).floatValue() * 255.0f));
        }
    }

    public final /* synthetic */ void B(String str, boolean z) {
        this.W1.clear();
        ArrayList arrayList = this.X1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((yla) obj).d();
        }
        if (z) {
            return;
        }
        super.setHintText(str);
    }

    @Override // fe5
    public String getHintText() {
        return this.Z1;
    }

    public float getProgress() {
        return this.T1;
    }

    @Override // fe5
    public void setHintText(String str) {
        boolean isEmpty;
        float f;
        boolean isEmpty2 = TextUtils.isEmpty(str);
        boolean z = !isEmpty2;
        Boolean bool = this.Y1;
        ArrayList arrayList = this.W1;
        ArrayList arrayList2 = this.X1;
        if (bool == null || bool.booleanValue() != z) {
            arrayList.clear();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((yla) obj).d();
            }
            arrayList2.clear();
            this.Y1 = Boolean.valueOf(z);
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
            mn6 mn6Var = new mn6((Object) this, z, (Object) str, (byte) 6);
            Runnable runnable = this.a2;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i2 = 0; i2 < length; i2++) {
                float f2 = 0.0f;
                if (isEmpty2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                    f2 = 1.0f;
                }
                yla ylaVar = new yla(Integer.valueOf(i2), this.V1);
                float f3 = f2 * 100.0f;
                zla zlaVar = new zla(f3);
                zlaVar.b(500.0f);
                zlaVar.a(1.0f);
                zlaVar.i = f3;
                ylaVar.m = zlaVar;
                ylaVar.b = 100.0f * f;
                ylaVar.c = true;
                arrayList2.add(ylaVar);
                arrayList.add(Float.valueOf(f));
                postDelayed(new b1(ylaVar, (byte) 16), i2 * 5);
            }
            this.a2 = mn6Var;
            postDelayed(mn6Var, (length * 5) + 150);
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
        int i = 0;
        boolean z = TextUtils.isEmpty(this.U1) && !TextUtils.isEmpty(str);
        this.T1 = 0.0f;
        while (i < str.length()) {
            int i2 = i + 1;
            String substring = str.substring(i, i2);
            String substring2 = (arrayList2.isEmpty() || i >= this.U1.length()) ? null : this.U1.substring(i, i2);
            if (z || substring2 == null || !substring2.equals(substring)) {
                TextPaint textPaint2 = this.R1;
                if (z && substring2 == null) {
                    textPaint = textPaint2;
                    arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    textPaint = textPaint2;
                }
                arrayList.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList.add((StaticLayout) arrayList2.get(i));
                arrayList2.set(i, null);
            }
            i = i2;
        }
        if (!arrayList2.isEmpty()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
            this.S1 = ofFloat;
            ofFloat.setDuration(150L);
            this.S1.addListener(new g0(this, (byte) 8));
            this.S1.start();
        }
        this.U1 = str;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.T1 == f) {
            return;
        }
        this.T1 = f;
        invalidate();
    }

    @Override // lt3, android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.R1.setColor(i);
    }

    @Override // fe5, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.R1.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }
}
