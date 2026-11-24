// default package

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lx3 extends g4c {
    public final /* synthetic */ mx3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx3(mx3 mx3Var, String str) {
        super(str, (vib) null);
        this.e = mx3Var;
    }

    @Override // g4c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        mx3 mx3Var = this.e;
        qx3 qx3Var = mx3Var.y;
        Pattern pattern = qx3.P1;
        na7 q1 = na7.q1(qx3Var.a);
        String url = getURL();
        qx3 qx3Var2 = mx3Var.y;
        q1.A3(url, qx3Var2.m1, 1, null);
        qx3Var2.G0();
        qx3Var2.dismiss();
    }
}
