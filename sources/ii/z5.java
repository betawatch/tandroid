package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.dj0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
                textPaint.setColor(j6.v(j6.l1(0.55f, textPaint.getColor()), j6.l1(0.4f, j6.v0(j6.Oh, ((d6) this.b).a))));
                break;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = j6.n6;
                ((cb0) this.b).getClass();
                textPaint.setColor(j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            default:
                textPaint.setColor(j6.v(j6.l1(0.55f, textPaint.getColor()), j6.l1(0.4f, ((dj0) this.b).I)));
                break;
        }
    }

    public z5(dj0 dj0Var) {
        this.a = 2;
        this.b = dj0Var;
    }
}
