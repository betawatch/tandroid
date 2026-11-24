// default package

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k92 extends f63 {
    public final /* synthetic */ n92 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k92(n92 n92Var, Context context, ylb ylbVar, int i) {
        super(i, ylbVar, context);
        this.i2 = n92Var;
    }

    @Override // qu3
    public final void G(int i, int i2) {
        if (i2 > i) {
            this.i2.F.x0(0, gm.L(30.0f), null);
        }
    }

    @Override // qu3, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == R.id.menu_delete || i == 16908320) {
            return this.i2.g0();
        }
        if (i == 16908322 || i == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i);
    }
}
