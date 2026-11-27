// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ag3 extends FrameLayout {
    public e a;
    public FrameLayout b;
    public a c;
    public d79 d;
    public gw9 e;
    public int f;
    public final /* synthetic */ bg3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag3(bg3 bg3Var, Context context) {
        super(context);
        this.h = bg3Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        ag3 ag3Var;
        super.setTranslationX(f);
        bg3 bg3Var = this.h;
        ag3[] ag3VarArr = bg3Var.f;
        if (bg3Var.n && (ag3Var = ag3VarArr[0]) == this) {
            bg3Var.e.i(Math.abs(ag3Var.getTranslationX()) / ag3VarArr[0].getMeasuredWidth(), ag3VarArr[1].f);
        }
    }
}
