package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h6 {
    public static final org.telegram.ui.Cells.t8 h = new org.telegram.ui.Cells.t8("progress", 3);
    public final TextPaint c;
    public ObjectAnimator d;
    public final org.telegram.ui.Cells.t1 g;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public float e = 0.0f;
    public int f = 1;

    public h6(org.telegram.ui.Cells.t1 t1Var, TextPaint textPaint) {
        this.c = textPaint;
        this.g = t1Var;
    }

    public final int a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float f7 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            f7 += ((StaticLayout) arrayList.get(i10)).getLineWidth(0);
        }
        return (int) Math.ceil(f7);
    }

    public final void b(int i10, boolean z10) {
        ArrayList arrayList;
        int i11 = this.f;
        ArrayList arrayList2 = this.a;
        if (i11 != i10 || arrayList2.isEmpty()) {
            ObjectAnimator objectAnimator = this.d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.d = null;
            }
            ArrayList arrayList3 = this.b;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            arrayList2.clear();
            Locale locale = Locale.US;
            int i12 = this.f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i10);
            String sb5 = sb4.toString();
            boolean z11 = i10 > this.f;
            this.f = i10;
            this.e = 0.0f;
            int i13 = 0;
            while (i13 < sb5.length()) {
                int i14 = i13 + 1;
                String substring = sb5.substring(i13, i14);
                String substring2 = (arrayList3.isEmpty() || i13 >= sb3.length()) ? null : sb3.substring(i13, i14);
                if (substring2 == null || !substring2.equals(substring)) {
                    arrayList = arrayList3;
                    arrayList2.add(new StaticLayout(substring, this.c, (int) Math.ceil(r14.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    arrayList2.add((StaticLayout) arrayList3.get(i13));
                    arrayList3.set(i13, null);
                    arrayList = arrayList3;
                }
                i13 = i14;
                arrayList3 = arrayList;
            }
            ArrayList arrayList4 = arrayList3;
            if (z10 && !arrayList4.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, z11 ? -1.0f : 1.0f, 0.0f);
                this.d = ofFloat;
                ofFloat.setDuration(150L);
                this.d.addListener(new org.telegram.ui.s0(this, 29));
                this.d.start();
            }
            this.g.invalidate();
        }
    }
}
