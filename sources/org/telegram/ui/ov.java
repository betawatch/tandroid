package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ ov(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                fy fyVar = this.b;
                Object obj = fyVar.y0.r0.G(i10).G;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof lh.e6) {
                        lh.e6 e6Var = (lh.e6) obj;
                        Bundle h = a4.w.h(3, TeXSymbolParser.TYPE_ATTR);
                        h.putString("hashtag", e6Var.C);
                        h.putInt("storiesCount", e6Var.J);
                        fyVar.presentFragment(new org.telegram.ui.Components.y90(h, null));
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
                    tn tnVar = new tn(bundle);
                    fy.d4(tnVar, messageObject);
                    fyVar.presentFragment(tnVar);
                    break;
                }
                break;
            default:
                fy fyVar2 = this.b;
                fyVar2.X.I0(true);
                ArrayList arrayList = fyVar2.X.T2;
                fyVar2.j3(arrayList.isEmpty() ? rf.h0.Y2[i10] : (rf.f0) arrayList.get(i10));
                break;
        }
    }
}
