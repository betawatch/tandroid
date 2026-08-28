package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class po extends org.telegram.ui.Cells.b9 {
    public ValueAnimator v;
    public int w;
    public final /* synthetic */ vo x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(vo voVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 12, b6Var);
        this.x = voVar;
        this.w = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.w != -1) {
            vo voVar = this.x;
            if (voVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                boolean z11 = false;
                while (true) {
                    i13 = 1;
                    if (i14 >= voVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = voVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                    i14++;
                }
                float height = this.w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new cg(arrayList, height, i13));
                this.v.setInterpolator(org.telegram.ui.Components.gr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.w = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, org.telegram.ui.Cells.b9, org.telegram.ui.po] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // org.telegram.ui.Cells.b9
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            vo voVar = this.x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(voVar.getThemedColor(org.telegram.ui.ActionBar.f6.p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.i41[] i41VarArr = (org.telegram.ui.Components.i41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.i41.class);
            fg.g gVar = voVar.a;
            String obj = (gVar == null || gVar.getText() == null) ? "" : voVar.a.getText().toString();
            for (int i9 = 0; i9 < i41VarArr.length; i9++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, obj), charSequence.getSpanStart(i41VarArr[i9]), charSequence.getSpanEnd(i41VarArr[i9]), 33);
                charSequence.removeSpan(i41VarArr[i9]);
            }
        }
        super.setText(charSequence);
    }
}
