package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ cw(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                Object obj = wyVar.C0.w0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ai.v8) {
                        ai.v8 v8Var = (ai.v8) obj;
                        Bundle e = org.telegram.ui.Cells.p6.e(3, TeXSymbolParser.TYPE_ATTR);
                        e.putString("hashtag", v8Var.C);
                        e.putInt("storiesCount", v8Var.J);
                        wyVar.presentFragment(new org.telegram.ui.Components.ba0(e, null));
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
                    bo boVar = new bo(bundle);
                    wy.d4(boVar, messageObject);
                    wyVar.presentFragment(boVar);
                    break;
                }
                break;
            default:
                wy wyVar2 = this.b;
                wyVar2.b0.J0(true);
                ArrayList arrayList = wyVar2.b0.X2;
                wyVar2.j3(arrayList.isEmpty() ? gg.s0.c3[i10] : (gg.q0) arrayList.get(i10));
                break;
        }
    }
}
