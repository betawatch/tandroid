// default package

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kx extends URLSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx(lx lxVar, String str, byte b) {
        super(str);
        this.a = b;
        this.b = lxVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        byte b = this.a;
        lx lxVar = this.b;
        switch (b) {
            case 0:
                o oVar = lxVar.c;
                String url = getURL();
                m66 m66Var = oVar.b;
                bx bxVar = oVar.d;
                HashSet hashSet = o.d1;
                oVar.O(url, null, m66Var == null ? null : new vu(oVar, bxVar, m66Var));
                break;
            default:
                lxVar.c.O(getURL(), null, null);
                break;
        }
    }
}
