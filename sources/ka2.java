// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ka2 extends njb {
    public final /* synthetic */ qa2 E;
    public ValueAnimator x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka2(qa2 qa2Var, Context context, ylb ylbVar) {
        super(12, ylbVar, context);
        this.E = qa2Var;
        this.y = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.y != -1) {
            qa2 qa2Var = this.E;
            if (qa2Var.n != null) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                for (int i5 = 0; i5 < qa2Var.n.getChildCount(); i5++) {
                    View childAt = qa2Var.n.getChildAt(i5);
                    if (z2) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z2 = true;
                    }
                }
                float height = this.y - getHeight();
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new go1(arrayList, height, (byte) 4));
                this.x.setInterpolator(d53.h);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
        this.y = getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, ka2, njb] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.SpannableStringBuilder] */
    @Override // njb
    public final void setText(CharSequence charSequence) {
        ylb ylbVar;
        if (charSequence != 0) {
            charSequence = gm.S2(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            qa2 qa2Var = this.E;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                int i = cmb.o7;
                ylbVar = ((d) qa2Var).resourceProvider;
                charSequence.setSpan(new do4(i, ylbVar), 0, indexOf, 33);
            }
            z5c[] z5cVarArr = (z5c[]) charSequence.getSpans(0, charSequence.length(), z5c.class);
            l7 l7Var = qa2Var.b;
            String obj = (l7Var == null || l7Var.getText() == null) ? "" : qa2Var.b.getText().toString();
            for (int i2 = 0; i2 < z5cVarArr.length; i2++) {
                charSequence.setSpan(new q1((Object) this, (Object) obj, (byte) 4), charSequence.getSpanStart(z5cVarArr[i2]), charSequence.getSpanEnd(z5cVarArr[i2]), 33);
                charSequence.removeSpan(z5cVarArr[i2]);
            }
        }
        super.setText(charSequence);
    }
}
