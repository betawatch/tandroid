package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements org.telegram.ui.Components.xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ lv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                Object obj = cyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ci.u6) {
                        ci.u6 u6Var = (ci.u6) obj;
                        Bundle i11 = org.telegram.ui.Cells.c1.i(3, TeXSymbolParser.TYPE_ATTR);
                        i11.putString("hashtag", u6Var.C);
                        i11.putInt("storiesCount", u6Var.J);
                        cyVar.presentFragment(new org.telegram.ui.Components.wa0(i11, null));
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
                    qn qnVar = new qn(bundle);
                    cy.b4(qnVar, messageObject);
                    cyVar.presentFragment(qnVar);
                    break;
                }
                break;
            default:
                cy cyVar2 = this.b;
                cyVar2.b0.I0(true);
                ArrayList arrayList = cyVar2.b0.V2;
                cyVar2.g3(arrayList.isEmpty() ? hg.q0.a3[i10] : (hg.o0) arrayList.get(i10));
                break;
        }
    }
}
