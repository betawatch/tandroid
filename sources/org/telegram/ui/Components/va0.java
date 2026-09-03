package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class va0 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ va0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.j6.n6;
                ((wa0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, ((aj0) this.b).F)));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, ((vh.w5) this.b).a))));
                break;
        }
    }

    public va0(aj0 aj0Var) {
        this.a = 1;
        this.b = aj0Var;
    }
}
