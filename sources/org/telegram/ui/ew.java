package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ ew(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                Object obj = yyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof bi.g8) {
                        bi.g8 g8Var = (bi.g8) obj;
                        Bundle g10 = org.telegram.ui.Cells.d0.g(3, TeXSymbolParser.TYPE_ATTR);
                        g10.putString("hashtag", g8Var.C);
                        g10.putInt("storiesCount", g8Var.J);
                        yyVar.presentFragment(new org.telegram.ui.Components.cb0(g10, null));
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
                    fo foVar = new fo(bundle);
                    yy.a4(foVar, messageObject);
                    yyVar.presentFragment(foVar);
                    break;
                }
                break;
            default:
                yy yyVar2 = this.b;
                yyVar2.b0.I0(true);
                ArrayList arrayList = yyVar2.b0.V2;
                yyVar2.g3(arrayList.isEmpty() ? hg.r0.a3[i10] : (hg.p0) arrayList.get(i10));
                break;
        }
    }
}
