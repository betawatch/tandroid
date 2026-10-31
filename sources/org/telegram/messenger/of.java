package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.us0;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class of implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ of(Object obj, int i10, int i11, Object obj2, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
        this.e = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new bi.u0(this.b, this.c, 6, (ui) this.d, (StickersActivity) this.e, tLObject));
                break;
            case 1:
                vp vpVar = (vp) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    vpVar.G3(messages_dialogs, null, null, this.b, 0, this.c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        i0.g3(runnable);
                        break;
                    }
                }
                break;
            default:
                us0 us0Var = (us0) this.d;
                String str = (String) this.e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                        TLRPC.Message message = messages_messages.messages.get(i10);
                        int i11 = this.b;
                        if (i11 == 0 || message.id <= i11) {
                            arrayList.add(new jj(us0Var.w.x1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                i0.g3(new ag.g3(us0Var, this.c, arrayList, str, 26));
                break;
        }
    }

    public /* synthetic */ of(ui uiVar, int i10, StickersActivity stickersActivity, int i11) {
        this.a = 0;
        this.d = uiVar;
        this.b = i10;
        this.e = stickersActivity;
        this.c = i11;
    }
}
