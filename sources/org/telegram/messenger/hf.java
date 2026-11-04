package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.StickersActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hf implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hf(Object obj, int i3, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i3;
        this.c = i10;
        this.e = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new ii.j4(this.b, this.c, 8, (li) this.d, (StickersActivity) this.e, tLObject));
                break;
            case 1:
                hp hpVar = (hp) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) tLObject;
                    hpVar.J3(messages_dialogs, null, null, this.b, 0, this.c, 0, false, false, false);
                    if (runnable != null && messages_dialogs.dialogs.isEmpty()) {
                        g0.h3(runnable);
                        break;
                    }
                }
                break;
            default:
                tr0 tr0Var = (tr0) this.d;
                String str = (String) this.e;
                ArrayList arrayList = new ArrayList();
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                        TLRPC.Message message = messages_messages.messages.get(i3);
                        int i10 = this.b;
                        if (i10 == 0 || message.id <= i10) {
                            arrayList.add(new zi(tr0Var.w.y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                g0.h3(new zo0(tr0Var, this.c, arrayList, str, 2));
                break;
        }
    }

    public /* synthetic */ hf(li liVar, int i3, StickersActivity stickersActivity, int i10) {
        this.a = 0;
        this.d = liVar;
        this.b = i3;
        this.e = stickersActivity;
        this.c = i10;
    }
}
