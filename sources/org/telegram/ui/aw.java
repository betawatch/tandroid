package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ aw(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                Object obj = uyVar.C0.x0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ai.v8) {
                        ai.v8 v8Var = (ai.v8) obj;
                        Bundle h = org.telegram.ui.Cells.c1.h(3, TeXSymbolParser.TYPE_ATTR);
                        h.putString("hashtag", v8Var.C);
                        h.putInt("storiesCount", v8Var.J);
                        uyVar.presentFragment(new org.telegram.ui.Components.pa0(h, null));
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
                    yn ynVar = new yn(bundle);
                    uy.m4(ynVar, messageObject);
                    uyVar.presentFragment(ynVar);
                    break;
                }
                break;
            default:
                uy uyVar2 = this.b;
                uyVar2.b0.J0(true);
                ArrayList arrayList = uyVar2.b0.e3;
                uyVar2.t3(arrayList.isEmpty() ? gg.s0.j3[i10] : (gg.q0) arrayList.get(i10));
                break;
        }
    }
}
