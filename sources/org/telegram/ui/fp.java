package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fp extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int w;
    public final /* synthetic */ lp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(lp lpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 12, f6Var);
        this.x = lpVar;
        this.w = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.w != -1) {
            lp lpVar = this.x;
            if (lpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z11 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= lpVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = lpVar.h.getChildAt(i15);
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
                ofFloat.addUpdateListener(new ng(arrayList, height, i14));
                this.v.setInterpolator(org.telegram.ui.Components.pr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.w = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.e9, org.telegram.ui.fp] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.e9
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            lp lpVar = this.x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(lpVar.getThemedColor(org.telegram.ui.ActionBar.j6.p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.e51[] e51VarArr = (org.telegram.ui.Components.e51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.e51.class);
            di.h2 h2Var = lpVar.a;
            String obj = (h2Var == null || h2Var.getText() == null) ? "" : lpVar.a.getText().toString();
            for (int i10 = 0; i10 < e51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(e51VarArr[i10]), charSequence.getSpanEnd(e51VarArr[i10]), 33);
                charSequence.removeSpan(e51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
