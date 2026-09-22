package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ep extends org.telegram.ui.Cells.e9 {
    public ValueAnimator v;
    public int w;
    public final /* synthetic */ kp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(kp kpVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 12, e6Var);
        this.x = kpVar;
        this.w = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.w != -1) {
            kp kpVar = this.x;
            if (kpVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z11 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= kpVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = kpVar.h.getChildAt(i15);
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
                this.v.setInterpolator(org.telegram.ui.Components.qr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.w = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.e9, org.telegram.ui.ep] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.e9
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            kp kpVar = this.x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(kpVar.getThemedColor(org.telegram.ui.ActionBar.i6.p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.f51[] f51VarArr = (org.telegram.ui.Components.f51[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.f51.class);
            ci.h2 h2Var = kpVar.a;
            String obj = (h2Var == null || h2Var.getText() == null) ? "" : kpVar.a.getText().toString();
            for (int i10 = 0; i10 < f51VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(f51VarArr[i10]), charSequence.getSpanEnd(f51VarArr[i10]), 33);
                charSequence.removeSpan(f51VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
