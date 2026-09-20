package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.cj0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                ((bb0) this.b).getClass();
                textPaint.setColor(j6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            default:
                textPaint.setColor(j6.v(j6.l1(0.55f, textPaint.getColor()), j6.l1(0.4f, ((cj0) this.b).I)));
                break;
        }
    }

    public z5(cj0 cj0Var) {
        this.a = 2;
        this.b = cj0Var;
    }
}
