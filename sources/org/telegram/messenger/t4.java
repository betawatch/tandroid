package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class t4 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ f1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t4(i5 i5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
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
        int i10 = 2;
        int i11 = 0;
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                boolean z10 = this.c;
                String str = (String) this.b;
                if (tL_error == null) {
                    i5Var.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    hs messagesStorage = i5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.a.c(new xp(messagesStorage, arrayList, i11));
                    }
                    Utilities.h.c(new z4(i5Var, arrayList2, i10));
                    while (i11 < arrayList2.size()) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i11);
                        if (!TextUtils.isEmpty(user.phone)) {
                            i5Var.getMessagesStorage().f(user.phone, "");
                            f5 f5Var = (f5) i5Var.Z.get(user.phone);
                            if (f5Var != null && (indexOf = f5Var.g.indexOf(user.phone)) != -1) {
                                f5Var.h.set(indexOf, 1);
                            }
                        }
                        i11++;
                    }
                    i0.g3(new bi.n4(i5Var, arrayList2, z10, str, 9));
                    break;
                }
                break;
            case 1:
                i0.g3(new sy((qz) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.e, (org.telegram.ui.un) this.f, (String) this.b, this.c, 0));
                break;
            default:
                qz qzVar = (qz) this.d;
                boolean z11 = this.c;
                jj jjVar = (jj) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.b;
                if (tL_error != null) {
                    if (w8.r(tL_error.text)) {
                        String str2 = tL_error.text;
                        rn rnVar = new rn(jjVar, qzVar, tL_messages_editMessage, k2Var, z11);
                        qzVar = qzVar;
                        if (jjVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                            ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                            arrayList3.addAll(tL_inputRichMessage.photos);
                            arrayList3.addAll(tL_inputRichMessage.documents);
                            if (!arrayList3.isEmpty()) {
                                int c10 = w8.c(str2);
                                if (c10 < 0 || c10 >= arrayList3.size()) {
                                    c10 = 0;
                                }
                                qzVar.getFileRefController().u(new Object[]{arrayList3.get(c10), rnVar}, jjVar);
                                break;
                            }
                        }
                    }
                    i0.g3(new hr(16, qzVar, jjVar));
                    if (k2Var != null) {
                        i0.g3(new fx(qzVar, tL_error, k2Var, tL_messages_editMessage, 1));
                        break;
                    }
                } else {
                    if (z11 && jjVar != null) {
                        jjVar.y2 = true;
                    }
                    qzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new ms(qzVar, jjVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t4(jj jjVar, qz qzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        this.d = qzVar;
        this.c = z10;
        this.e = jjVar;
        this.f = tL_messages_editMessage;
        this.b = k2Var;
    }

    public /* synthetic */ t4(qz qzVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.un unVar, String str, boolean z10) {
        this.d = qzVar;
        this.e = tL_messages_requestUrlAuth;
        this.f = unVar;
        this.b = str;
        this.c = z10;
    }
}
