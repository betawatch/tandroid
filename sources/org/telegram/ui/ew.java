package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                        Bundle f7 = org.telegram.ui.Cells.c1.f(3, TeXSymbolParser.TYPE_ATTR);
                        f7.putString("hashtag", g8Var.C);
                        f7.putInt("storiesCount", g8Var.J);
                        yyVar.presentFragment(new org.telegram.ui.Components.cb0(f7, null));
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
                    yy.b4(foVar, messageObject);
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
