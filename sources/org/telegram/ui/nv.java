package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements org.telegram.ui.Components.mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ nv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        switch (this.a) {
            case 0:
                dy dyVar = this.b;
                Object obj = dyVar.y0.r0.G(i9).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ih.h6) {
                        ih.h6 h6Var = (ih.h6) obj;
                        Bundle h = aa.d.h(3, TeXSymbolParser.TYPE_ATTR);
                        h.putString("hashtag", h6Var.C);
                        h.putInt("storiesCount", h6Var.J);
                        dyVar.presentFragment(new org.telegram.ui.Components.k90(h, null));
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
                    dy.d4(qnVar, messageObject);
                    dyVar.presentFragment(qnVar);
                    break;
                }
                break;
            default:
                dy dyVar2 = this.b;
                dyVar2.X.I0(true);
                ArrayList arrayList = dyVar2.X.T2;
                dyVar2.j3(arrayList.isEmpty() ? of.o0.Y2[i9] : (of.m0) arrayList.get(i9));
                break;
        }
    }
}
