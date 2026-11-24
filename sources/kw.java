// default package

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kw extends URLSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw(lw lwVar, String str, byte b) {
        super(str);
        this.a = b;
        this.b = lwVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        byte b = this.a;
        lw lwVar = this.b;
        switch (b) {
            case 0:
                o oVar = lwVar.c;
                String url = getURL();
                m46 m46Var = oVar.b;
                bw bwVar = oVar.d;
                HashSet hashSet = o.d1;
                oVar.O(url, null, m46Var == null ? null : new vt(oVar, bwVar, m46Var));
                break;
            default:
                lwVar.c.O(getURL(), null, null);
                break;
        }
    }
}
