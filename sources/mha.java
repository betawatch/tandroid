// default package

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mha implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pha b;

    public /* synthetic */ mha(pha phaVar, byte b) {
        this.a = b;
        this.b = phaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        pha phaVar = this.b;
        switch (b) {
            case 0:
                if (!phaVar.H && phaVar.G) {
                    phaVar.n(true);
                    break;
                } else {
                    c6 c6Var = phaVar.W;
                    if (c6Var != null) {
                        c6Var.b(-1);
                        break;
                    }
                }
                break;
            default:
                if (phaVar.s.length() != 0) {
                    phaVar.s.setText("");
                } else {
                    TextView textView = phaVar.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        phaVar.m();
                    }
                }
                phaVar.s.requestFocus();
                gl.F3(phaVar.s);
                break;
        }
    }
}
