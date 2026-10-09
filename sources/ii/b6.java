package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.xj0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b6 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b6(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.i6.m1(0.4f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, ((f6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.i6.n6;
                ((vb0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.m1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.i6.m1(0.4f, ((xj0) this.b).I)));
                break;
        }
    }

    public b6(xj0 xj0Var) {
        this.a = 2;
        this.b = xj0Var;
    }
}
