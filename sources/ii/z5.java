package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.ta0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class z5 extends CharacterStyle {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ z5(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(i6.v(i6.l1(0.55f, textPaint.getColor()), i6.l1(0.4f, i6.v0(i6.Oh, ((d6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = i6.n6;
                ((ta0) this.b).getClass();
                textPaint.setColor(i6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            default:
                textPaint.setColor(i6.v(i6.l1(0.55f, textPaint.getColor()), i6.l1(0.4f, ((si0) this.b).I)));
                break;
        }
    }

    public z5(si0 si0Var) {
        this.a = 2;
        this.b = si0Var;
    }
}
