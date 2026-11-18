package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r4(i5 i5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.d = i5Var;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = z10;
        this.b = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        int i7 = 2;
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                boolean z10 = this.c;
                String str = (String) this.b;
                if (tL_error == null) {
                    i5Var.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    tr messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.a.c(new qp(messagesStorage, arrayList, 21));
                    }
                    Utilities.h.c(new y4(i5Var, arrayList2, i7));
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                        if (!TextUtils.isEmpty(user.phone)) {
                            i5Var.getMessagesStorage().f(user.phone, "");
                            f5 f5Var = (f5) i5Var.a0.get(user.phone);
                            if (f5Var != null && (indexOf = f5Var.g.indexOf(user.phone)) != -1) {
                                f5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    g0.g3(new aa.c0(i5Var, arrayList2, z10, str, 11));
                    break;
                }
                break;
            case 1:
                g0.g3(new yx(0, (zy) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.e, (org.telegram.ui.bn) this.f, (String) this.b, this.c));
                break;
            default:
                zy zyVar = (zy) this.d;
                boolean z11 = this.c;
                fj fjVar = (fj) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.b;
                if (tL_error == null) {
                    if (z11 && fjVar != null) {
                        fjVar.A2 = true;
                    }
                    zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new xr(zyVar, fjVar));
                    break;
                } else {
                    if (r8.r(tL_error.text)) {
                        String str2 = tL_error.text;
                        in inVar = new in(fjVar, zyVar, tL_messages_editMessage, h2Var, z11);
                        zyVar = zyVar;
                        if (fjVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                            ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                            arrayList3.addAll(tL_inputRichMessage.photos);
                            arrayList3.addAll(tL_inputRichMessage.documents);
                            if (!arrayList3.isEmpty()) {
                                int c10 = r8.c(str2);
                                if (c10 < 0 || c10 >= arrayList3.size()) {
                                    c10 = 0;
                                }
                                zyVar.getFileRefController().u(new Object[]{arrayList3.get(c10), inVar}, fjVar);
                                break;
                            }
                        }
                    }
                    g0.g3(new rq(20, zyVar, fjVar));
                    if (h2Var != null) {
                        g0.g3(new mw(zyVar, tL_error, h2Var, tL_messages_editMessage, 1));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ r4(fj fjVar, zy zyVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        this.d = zyVar;
        this.c = z10;
        this.e = fjVar;
        this.f = tL_messages_editMessage;
        this.b = h2Var;
    }

    public /* synthetic */ r4(zy zyVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.bn bnVar, String str, boolean z10) {
        this.d = zyVar;
        this.e = tL_messages_requestUrlAuth;
        this.f = bnVar;
        this.b = str;
        this.c = z10;
    }
}
