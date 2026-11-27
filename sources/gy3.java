// default package

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gy3 extends f8c {
    public final /* synthetic */ hy3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy3(hy3 hy3Var, String str) {
        super(str, (rmb) null);
        this.e = hy3Var;
    }

    @Override // f8c, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        hy3 hy3Var = this.e;
        ly3 ly3Var = hy3Var.y;
        Pattern pattern = ly3.P1;
        uc7 s1 = uc7.s1(ly3Var.a);
        String url = getURL();
        ly3 ly3Var2 = hy3Var.y;
        s1.H3(url, ly3Var2.m1, 1, null);
        ly3Var2.H0();
        ly3Var2.dismiss();
    }
}
