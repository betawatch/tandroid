package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wa0 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wa0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.k6.n6;
                ((xa0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.k6.l1(0.4f, ((bj0) this.b).F)));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.k6.l1(0.4f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, ((wh.v5) this.b).a))));
                break;
        }
    }

    public wa0(bj0 bj0Var) {
        this.a = 1;
        this.b = bj0Var;
    }
}
