// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d61 extends o71 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(je3 je3Var, Context context, d dVar) {
        super(context, dVar, null, null);
        this.J = je3Var;
    }

    public final void f(boolean z) {
        pha phaVar;
        pha phaVar2;
        r61 r61Var = (r61) this.J;
        if (!z) {
            phaVar = ((d) r61Var).simpleActionBar;
            phaVar.w();
            return;
        }
        fm0 fm0Var = r61Var.T;
        if (fm0Var != null) {
            fm0Var.a(true, true);
        }
        phaVar2 = ((d) r61Var).simpleActionBar;
        phaVar2.J();
    }

    @Override // o71, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.I) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((je3) this.J).q1 - a.getCurrentActionBarHeight()) - gl.m, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(r61 r61Var, Context context, r61 r61Var2, qw4 qw4Var, dha dhaVar) {
        super(context, r61Var2, qw4Var, dhaVar);
        this.J = r61Var;
    }
}
