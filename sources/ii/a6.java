package ii;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.ua0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ((ua0) this.b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                textPaint.setAlpha(alpha);
                break;
            default:
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.l1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.h6.l1(0.4f, ((ti0) this.b).I)));
                break;
        }
    }

    public a6(ti0 ti0Var) {
        this.a = 2;
        this.b = ti0Var;
    }
}
