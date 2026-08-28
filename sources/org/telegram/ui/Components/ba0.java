package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ba0 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ba0(int i9, FrameLayout frameLayout) {
        this.a = i9;
        this.b = frameLayout;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i9 = org.telegram.ui.ActionBar.f6.n6;
                ((ca0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                textPaint.setAlpha(alpha);
                break;
            case 1:
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.f6.l1(0.4f, ((fi0) this.b).E)));
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.f6.l1(0.4f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, ((qh.s5) this.b).a))));
                break;
        }
    }

    public ba0(fi0 fi0Var) {
        this.a = 1;
        this.b = fi0Var;
    }
}
