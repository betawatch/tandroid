package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements org.telegram.ui.Components.zl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ lv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                Object obj = cyVar.C0.x0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof di.t6) {
                        di.t6 t6Var = (di.t6) obj;
                        Bundle g7 = org.telegram.ui.Components.b10.g(3, TeXSymbolParser.TYPE_ATTR);
                        g7.putString("hashtag", t6Var.C);
                        g7.putInt("storiesCount", t6Var.J);
                        cyVar.presentFragment(new org.telegram.ui.Components.ta0(g7, null));
                        break;
                    }
                } else {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    un unVar = new un(bundle);
                    cy.l4(unVar, messageObject);
                    cyVar.presentFragment(unVar);
                    break;
                }
                break;
            default:
                cy cyVar2 = this.b;
                cyVar2.b0.I0(true);
                ArrayList arrayList = cyVar2.b0.f3;
                cyVar2.q3(arrayList.isEmpty() ? ig.r0.k3[i10] : (ig.p0) arrayList.get(i10));
                break;
        }
    }
}
