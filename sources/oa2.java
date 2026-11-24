// default package

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oa2 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ pa2 b;

    public oa2(pa2 pa2Var, TLRPC.User user) {
        this.b = pa2Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        gb2 gb2Var = this.b.a;
        bb2 bb2Var = gb2Var.eb;
        if (bb2Var != null) {
            bb2Var.c0(gb2Var, this.a, 0.0f, 0.0f);
        }
    }
}
