// default package

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jf1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ s49 b;
    public final /* synthetic */ kf1 c;

    public jf1(kf1 kf1Var, View view, s49 s49Var) {
        this.c = kf1Var;
        this.a = view;
        this.b = s49Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a aVar;
        a aVar2;
        a aVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        nf1 nf1Var = this.c.n;
        int measuredHeight = nf1Var.w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof gb2) {
            int heightWithKeyboard = (nf1Var.Y.getHeightWithKeyboard() - gl.L(48.0f)) - nf1Var.w.getTop();
            float y = view.getY();
            aVar3 = ((d) nf1Var).actionBar;
            ((gb2) view).D3(i, measuredHeight2 - i, heightWithKeyboard, 0.0f, (y + aVar3.getMeasuredHeight()) - nf1Var.Y.getBackgroundTranslationY(), nf1Var.Y.getMeasuredWidth(), nf1Var.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof uk1)) {
            return true;
        }
        aVar = ((d) nf1Var).actionBar;
        if (aVar == null || nf1Var.Y == null) {
            return true;
        }
        uk1 uk1Var = (uk1) view;
        float y2 = view.getY();
        aVar2 = ((d) nf1Var).actionBar;
        uk1Var.k0((y2 + aVar2.getMeasuredHeight()) - nf1Var.Y.getBackgroundTranslationY(), nf1Var.Y.getBackgroundSizeY());
        return true;
    }
}
