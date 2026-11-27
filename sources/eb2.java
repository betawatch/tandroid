// default package

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class eb2 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ fb2 b;

    public eb2(fb2 fb2Var, TLRPC.User user) {
        this.b = fb2Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        wb2 wb2Var = this.b.a;
        rb2 rb2Var = wb2Var.eb;
        if (rb2Var != null) {
            rb2Var.W(wb2Var, this.a, 0.0f, 0.0f);
        }
    }
}
