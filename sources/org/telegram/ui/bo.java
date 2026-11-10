package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bo extends org.telegram.ui.Cells.z8 {
    public final /* synthetic */ io D;
    public ValueAnimator x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(io ioVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(12, context, h6Var);
        this.D = ioVar;
        this.y = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.y != -1) {
            io ioVar = this.D;
            if (ioVar.n != null) {
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                boolean z10 = false;
                while (true) {
                    i13 = 1;
                    if (i14 >= ioVar.n.getChildCount()) {
                        break;
                    }
                    View childAt = ioVar.n.getChildAt(i14);
                    if (z10) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z10 = true;
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
                ofFloat.addUpdateListener(new sf(arrayList, height, i13));
                this.x.setInterpolator(org.telegram.ui.Components.wq.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.z8, org.telegram.ui.bo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.z8
    public final void setText(CharSequence charSequence) {
        org.telegram.ui.ActionBar.h6 h6Var;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.X2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            io ioVar = this.D;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i7 = org.telegram.ui.ActionBar.m6.p7;
                h6Var = ((org.telegram.ui.ActionBar.f2) ioVar).resourceProvider;
                charSequence.setSpan(new org.telegram.ui.Components.xz(i7, h6Var), 0, indexOf, 33);
            }
            org.telegram.ui.Components.u31[] u31VarArr = (org.telegram.ui.Components.u31[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.u31.class);
            ah.i iVar = ioVar.b;
            String obj = (iVar == null || iVar.getText() == null) ? "" : ioVar.b.getText().toString();
            for (int i10 = 0; i10 < u31VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, obj), charSequence.getSpanStart(u31VarArr[i10]), charSequence.getSpanEnd(u31VarArr[i10]), 33);
                charSequence.removeSpan(u31VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
