// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gf3 extends FrameLayout {
    public d a;
    public FrameLayout b;
    public a c;
    public o39 d;
    public ns9 e;
    public int f;
    public final /* synthetic */ hf3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf3(hf3 hf3Var, Context context) {
        super(context);
        this.h = hf3Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        gf3 gf3Var;
        super.setTranslationX(f);
        hf3 hf3Var = this.h;
        gf3[] gf3VarArr = hf3Var.f;
        if (hf3Var.n && (gf3Var = gf3VarArr[0]) == this) {
            hf3Var.e.i(Math.abs(gf3Var.getTranslationX()) / gf3VarArr[0].getMeasuredWidth(), gf3VarArr[1].f);
        }
    }
}
