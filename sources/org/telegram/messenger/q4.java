package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q4 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q4(g5 g5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.d = g5Var;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = z10;
        this.b = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        int i3 = 2;
        int i10 = 0;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                boolean z10 = this.c;
                String str = (String) this.b;
                if (tL_error == null) {
                    g5Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    qr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.a.c(new jp(messagesStorage, arrayList, i10));
                    }
                    Utilities.h.c(new w4(g5Var, arrayList2, i3));
                    while (i10 < arrayList2.size()) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                        if (!TextUtils.isEmpty(user.phone)) {
                            g5Var.getMessagesStorage().f(user.phone, "");
                            d5 d5Var = (d5) g5Var.a0.get(user.phone);
                            if (d5Var != null && (indexOf = d5Var.g.indexOf(user.phone)) != -1) {
                                d5Var.h.set(indexOf, 1);
                            }
                        }
                        i10++;
                    }
                    g0.h3(new ci.u8(g5Var, arrayList2, z10, str, 11));
                    break;
                }
                break;
            case 1:
                g0.h3(new zx(0, (yy) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.e, (org.telegram.ui.wm) this.f, (String) this.b, this.c));
                break;
            default:
                yy yyVar = (yy) this.d;
                boolean z11 = this.c;
                zi ziVar = (zi) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                if (tL_error != null) {
                    if (r8.r(tL_error.text)) {
                        String str2 = tL_error.text;
                        bn bnVar = new bn(ziVar, yyVar, tL_messages_editMessage, d2Var, z11);
                        yyVar = yyVar;
                        if (ziVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                            ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                            arrayList3.addAll(tL_inputRichMessage.photos);
                            arrayList3.addAll(tL_inputRichMessage.documents);
                            if (!arrayList3.isEmpty()) {
                                int c2 = r8.c(str2);
                                if (c2 < 0 || c2 >= arrayList3.size()) {
                                    c2 = 0;
                                }
                                yyVar.getFileRefController().u(new Object[]{arrayList3.get(c2), bnVar}, ziVar);
                                break;
                            }
                        }
                    }
                    g0.h3(new pq(18, yyVar, ziVar));
                    if (d2Var != null) {
                        g0.h3(new mw(yyVar, tL_error, d2Var, tL_messages_editMessage, 1));
                        break;
                    }
                } else {
                    if (z11 && ziVar != null) {
                        ziVar.y2 = true;
                    }
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new vs(yyVar, ziVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q4(zi ziVar, yy yyVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        this.d = yyVar;
        this.c = z10;
        this.e = ziVar;
        this.f = tL_messages_editMessage;
        this.b = d2Var;
    }

    public /* synthetic */ q4(yy yyVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.wm wmVar, String str, boolean z10) {
        this.d = yyVar;
        this.e = tL_messages_requestUrlAuth;
        this.f = wmVar;
        this.b = str;
        this.c = z10;
    }
}
