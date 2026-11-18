package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class co extends org.telegram.ui.Cells.a9 {
    public final /* synthetic */ jo E;
    public ValueAnimator x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(jo joVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(12, context, i6Var);
        this.E = joVar;
        this.y = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.y != -1) {
            jo joVar = this.E;
            if (joVar.n != null) {
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                boolean z11 = false;
                while (true) {
                    i13 = 1;
                    if (i14 >= joVar.n.getChildCount()) {
                        break;
                    }
                    View childAt = joVar.n.getChildAt(i14);
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
                ofFloat.addUpdateListener(new rf(arrayList, height, i13));
                this.x.setInterpolator(org.telegram.ui.Components.lr.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.a9, org.telegram.ui.co] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.a9
    public final void setText(CharSequence charSequence) {
        org.telegram.ui.ActionBar.i6 i6Var;
        if (charSequence != 0) {
            charSequence = org.telegram.messenger.g0.W2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            jo joVar = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i7 = org.telegram.ui.ActionBar.n6.p7;
                i6Var = ((org.telegram.ui.ActionBar.h2) joVar).resourceProvider;
                charSequence.setSpan(new org.telegram.ui.Components.i00(i7, i6Var), 0, indexOf, 33);
            }
            org.telegram.ui.Components.i41[] i41VarArr = (org.telegram.ui.Components.i41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.i41.class);
            ah.i iVar = joVar.b;
            String obj = (iVar == null || iVar.getText() == null) ? "" : joVar.b.getText().toString();
            for (int i10 = 0; i10 < i41VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.h(5, (Object) this, obj), charSequence.getSpanStart(i41VarArr[i10]), charSequence.getSpanEnd(i41VarArr[i10]), 33);
                charSequence.removeSpan(i41VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
