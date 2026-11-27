// default package

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lw extends URLSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw(mw mwVar, String str, byte b) {
        super(str);
        this.a = b;
        this.b = mwVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        byte b = this.a;
        mw mwVar = this.b;
        switch (b) {
            case 0:
                o oVar = mwVar.c;
                String url = getURL();
                q66 q66Var = oVar.b;
                cw cwVar = oVar.d;
                HashSet hashSet = o.d1;
                oVar.O(url, null, q66Var == null ? null : new wt(oVar, cwVar, q66Var));
                break;
            default:
                mwVar.c.O(getURL(), null, null);
                break;
        }
    }
}
