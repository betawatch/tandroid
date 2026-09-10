package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.Cells.f9 {
    public ValueAnimator v;
    public int w;
    public final /* synthetic */ mp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp(mp mpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.x = mpVar;
        this.w = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.w != -1) {
            mp mpVar = this.x;
            if (mpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z11 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= mpVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = mpVar.h.getChildAt(i15);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                    i15++;
                }
                float height = this.w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new og(arrayList, height, i14));
                this.v.setInterpolator(org.telegram.ui.Components.wr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.w = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.f9, org.telegram.ui.gp] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.f9
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            mp mpVar = this.x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(mpVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.s51[] s51VarArr = (org.telegram.ui.Components.s51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.s51.class);
            bi.t2 t2Var = mpVar.a;
            String obj = (t2Var == null || t2Var.getText() == null) ? "" : mpVar.a.getText().toString();
            for (int i10 = 0; i10 < s51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(s51VarArr[i10]), charSequence.getSpanEnd(s51VarArr[i10]), 33);
                charSequence.removeSpan(s51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
