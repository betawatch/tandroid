package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ aw(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                Object obj = uyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ai.v8) {
                        ai.v8 v8Var = (ai.v8) obj;
                        Bundle e = org.telegram.ui.Cells.q3.e(3, TeXSymbolParser.TYPE_ATTR);
                        e.putString("hashtag", v8Var.C);
                        e.putInt("storiesCount", v8Var.J);
                        uyVar.presentFragment(new org.telegram.ui.Components.ba0(e, null));
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
                    uy.d4(boVar, messageObject);
                    uyVar.presentFragment(boVar);
                    break;
                }
                break;
            default:
                uy uyVar2 = this.b;
                uyVar2.b0.I0(true);
                ArrayList arrayList = uyVar2.b0.X2;
                uyVar2.j3(arrayList.isEmpty() ? gg.s0.c3[i10] : (gg.q0) arrayList.get(i10));
                break;
        }
    }
}
