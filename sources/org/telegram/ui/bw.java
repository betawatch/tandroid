package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ bw(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                Object obj = uyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof bi.d8) {
                        bi.d8 d8Var = (bi.d8) obj;
                        Bundle e7 = org.telegram.ui.Cells.p6.e(3, TeXSymbolParser.TYPE_ATTR);
                        e7.putString("hashtag", d8Var.C);
                        e7.putInt("storiesCount", d8Var.J);
                        uyVar.presentFragment(new org.telegram.ui.Components.ca0(e7, null));
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
                    co coVar = new co(bundle);
                    uy.d4(coVar, messageObject);
                    uyVar.presentFragment(coVar);
                    break;
                }
                break;
            default:
                uy uyVar2 = this.b;
                uyVar2.b0.I0(true);
                ArrayList arrayList = uyVar2.b0.X2;
                uyVar2.j3(arrayList.isEmpty() ? hg.s0.c3[i10] : (hg.q0) arrayList.get(i10));
                break;
        }
    }
}
