package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ao extends org.telegram.ui.Cells.y8 {
    public final /* synthetic */ ho E;
    public ValueAnimator x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(ho hoVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(12, context, e6Var);
        this.E = hoVar;
        this.y = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.y != -1) {
            ho hoVar = this.E;
            if (hoVar.n != null) {
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                boolean z11 = false;
                while (true) {
                    i13 = 1;
                    if (i14 >= hoVar.n.getChildCount()) {
                        break;
                    }
                    View childAt = hoVar.n.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                    i14++;
                }
                float height = this.y - getHeight();
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new pf(arrayList, height, i13));
                this.x.setInterpolator(org.telegram.ui.Components.er.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.y8, org.telegram.ui.ao] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.y8
    public final void setText(CharSequence charSequence) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            ho hoVar = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i7 = org.telegram.ui.ActionBar.j6.p7;
                e6Var = ((org.telegram.ui.ActionBar.e2) hoVar).resourceProvider;
                charSequence.setSpan(new org.telegram.ui.Components.b00(i7, e6Var), 0, indexOf, 33);
            }
            org.telegram.ui.Components.y31[] y31VarArr = (org.telegram.ui.Components.y31[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.y31.class);
            ah.i iVar = hoVar.b;
            String obj = (iVar == null || iVar.getText() == null) ? "" : hoVar.b.getText().toString();
            for (int i10 = 0; i10 < y31VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, obj), charSequence.getSpanStart(y31VarArr[i10]), charSequence.getSpanEnd(y31VarArr[i10]), 33);
                charSequence.removeSpan(y31VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
