package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ nv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                Object obj = eyVar.C0.v0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof ci.t6) {
                        ci.t6 t6Var = (ci.t6) obj;
                        Bundle i11 = org.telegram.ui.Cells.b1.i(3, TeXSymbolParser.TYPE_ATTR);
                        i11.putString("hashtag", t6Var.C);
                        i11.putInt("storiesCount", t6Var.J);
                        eyVar.presentFragment(new org.telegram.ui.Components.xa0(i11, null));
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
                ArrayList arrayList = eyVar2.b0.Y2;
                eyVar2.f3(arrayList.isEmpty() ? hg.q0.d3[i10] : (hg.o0) arrayList.get(i10));
                break;
        }
    }
}
