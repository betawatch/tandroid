package ji;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ub0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class e6 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ e6(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.m1(0.4f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, ((i6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.g6.n6;
                ((ub0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.g6.m1(0.4f, ((tj0) this.b).I)));
                break;
        }
    }

    public e6(tj0 tj0Var) {
        this.a = 2;
        this.b = tj0Var;
    }
}
