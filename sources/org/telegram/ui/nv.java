package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ nv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                Object obj = eyVar.C0.x0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof di.t6) {
                        di.t6 t6Var = (di.t6) obj;
                        Bundle g7 = org.telegram.ui.Components.b10.g(3, TeXSymbolParser.TYPE_ATTR);
                        g7.putString("hashtag", t6Var.C);
                        g7.putInt("storiesCount", t6Var.J);
                        eyVar.presentFragment(new org.telegram.ui.Components.ua0(g7, null));
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
                    wn wnVar = new wn(bundle);
                    ey.l4(wnVar, messageObject);
                    eyVar.presentFragment(wnVar);
                    break;
                }
                break;
            default:
                ey eyVar2 = this.b;
                eyVar2.b0.I0(true);
                ArrayList arrayList = eyVar2.b0.f3;
                eyVar2.q3(arrayList.isEmpty() ? ig.r0.k3[i10] : (ig.p0) arrayList.get(i10));
                break;
        }
    }
}
