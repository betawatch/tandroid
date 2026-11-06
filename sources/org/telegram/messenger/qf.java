package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class qf implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qf(Object obj, int i7, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i7;
        this.c = i10;
        this.e = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new hi.j4(this.b, this.c, 8, (ui) this.d, (StickersActivity) this.e, tLObject));
                break;
            case 1:
                qp qpVar = (qp) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    qpVar.J3(messages_dialogs, null, null, this.b, 0, this.c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.h3(runnable);
                        break;
                    }
                }
                break;
            default:
                ur0 ur0Var = (ur0) this.d;
                String str = (String) this.e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.b;
                        if (i10 == 0 || message.id <= i10) {
                            arrayList.add(new ij(ur0Var.w.x1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.h3(new pp0(ur0Var, this.c, arrayList, str, 1));
                break;
        }
    }

    public /* synthetic */ qf(ui uiVar, int i7, StickersActivity stickersActivity, int i10) {
        this.a = 0;
        this.d = uiVar;
        this.b = i7;
        this.e = stickersActivity;
        this.c = i10;
    }
}
