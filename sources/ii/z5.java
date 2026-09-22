package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.fj0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                ((eb0) this.b).getClass();
                textPaint.setColor(j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            default:
                textPaint.setColor(j6.v(j6.l1(0.55f, textPaint.getColor()), j6.l1(0.4f, ((fj0) this.b).I)));
                break;
        }
    }

    public z5(fj0 fj0Var) {
        this.a = 2;
        this.b = fj0Var;
    }
}
