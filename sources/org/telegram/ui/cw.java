package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ cw(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                Object obj = wyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof zh.u4) {
                        zh.u4 u4Var = (zh.u4) obj;
                        Bundle e = org.telegram.ui.Cells.r6.e(3, TeXSymbolParser.TYPE_ATTR);
                        e.putString("hashtag", u4Var.C);
                        e.putInt("storiesCount", u4Var.J);
                        wyVar.presentFragment(new org.telegram.ui.Components.la0(e, null));
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
                    eo eoVar = new eo(bundle);
                    wy.d4(eoVar, messageObject);
                    wyVar.presentFragment(eoVar);
                    break;
                }
                break;
            default:
                wy wyVar2 = this.b;
                wyVar2.b0.I0(true);
                ArrayList arrayList = wyVar2.b0.X2;
                wyVar2.j3(arrayList.isEmpty() ? fg.s0.c3[i10] : (fg.q0) arrayList.get(i10));
                break;
        }
    }
}
