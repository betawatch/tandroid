package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class rf implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rf(Object obj, int i7, int i10, Object obj2, int i11) {
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
                g0.g3(new jg.o1(this.b, this.c, 8, (si) this.d, (StickersActivity) this.e, tLObject));
                break;
            case 1:
                np npVar = (np) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    npVar.Q3(messages_dialogs, null, null, this.b, 0, this.c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.g3(runnable);
                        break;
                    }
                }
                break;
            default:
                gs0 gs0Var = (gs0) this.d;
                String str = (String) this.e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i7 = 0; i7 < messages_messages.messages.size(); i7++) {
                        TLRPC.Message message = messages_messages.messages.get(i7);
                        int i10 = this.b;
                        if (i10 == 0 || message.id <= i10) {
                            arrayList.add(new gj(gs0Var.w.y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.g3(new lp0(gs0Var, this.c, arrayList, str, 3));
                break;
        }
    }

    public /* synthetic */ rf(si siVar, int i7, StickersActivity stickersActivity, int i10) {
        this.a = 0;
        this.d = siVar;
        this.b = i7;
        this.e = stickersActivity;
        this.c = i10;
    }
}
