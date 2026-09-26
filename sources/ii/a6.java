package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.fb0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class a6 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ a6(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.4f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, ((e6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.h6.n6;
                ((fb0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.4f, ((dj0) this.b).I)));
                break;
        }
    }

    public a6(dj0 dj0Var) {
        this.a = 2;
        this.b = dj0Var;
    }
}
