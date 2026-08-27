package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fa0 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fa0(int i10, FrameLayout frameLayout) {
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
                ((ga0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.4f, ((hi0) this.b).E)));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, ((rh.t5) this.b).a))));
                break;
        }
    }

    public fa0(hi0 hi0Var) {
        this.a = 1;
        this.b = hi0Var;
    }
}
