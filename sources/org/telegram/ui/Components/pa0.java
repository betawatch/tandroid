package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pa0 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pa0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.g6.n6;
                ((qa0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.4f, ((qi0) this.b).E)));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, ((th.t5) this.b).a))));
                break;
        }
    }

    public pa0(qi0 qi0Var) {
        this.a = 1;
        this.b = qi0Var;
    }
}
