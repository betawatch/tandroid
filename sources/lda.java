// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lda implements View.OnLayoutChangeListener {
    public final /* synthetic */ nfa a;

    public lda(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        r7 r7Var = this.a.q0;
        if (r7Var == null) {
            return;
        }
        r7Var.setTranslationX(((View) r7Var.getParent()).getMeasuredWidth() - r7Var.getRight());
    }
}
