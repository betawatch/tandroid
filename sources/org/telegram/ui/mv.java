package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ mv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                Object obj = eyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ci.u6) {
                        ci.u6 u6Var = (ci.u6) obj;
                        Bundle j10 = org.telegram.ui.Cells.t0.j(3, TeXSymbolParser.TYPE_ATTR);
                        j10.putString("hashtag", u6Var.C);
                        j10.putInt("storiesCount", u6Var.J);
                        eyVar.presentFragment(new org.telegram.ui.Components.wa0(j10, null));
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
                    sn snVar = new sn(bundle);
                    ey.b4(snVar, messageObject);
                    eyVar.presentFragment(snVar);
                    break;
                }
                break;
            default:
                ey eyVar2 = this.b;
                eyVar2.b0.I0(true);
                ArrayList arrayList = eyVar2.b0.V2;
                eyVar2.g3(arrayList.isEmpty() ? hg.q0.a3[i10] : (hg.o0) arrayList.get(i10));
                break;
        }
    }
}
