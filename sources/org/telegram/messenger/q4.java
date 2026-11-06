package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class q4 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q4(g5 g5Var, ArrayList arrayList, ArrayList arrayList2, boolean z9, String str) {
        this.d = g5Var;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = z9;
        this.b = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        int i7 = 2;
        int i10 = 0;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                boolean z9 = this.c;
                String str = (String) this.b;
                if (tL_error == null) {
                    g5Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    yr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.a.c(new sp(messagesStorage, arrayList, i10));
                    }
                    Utilities.h.c(new w4(g5Var, arrayList2, i7));
                    while (i10 < arrayList2.size()) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                        if (!TextUtils.isEmpty(user.phone)) {
                            g5Var.getMessagesStorage().f(user.phone, "");
                            d5 d5Var = (d5) g5Var.Z.get(user.phone);
                            if (d5Var != null && (indexOf = d5Var.g.indexOf(user.phone)) != -1) {
                                d5Var.h.set(indexOf, 1);
                            }
                        }
                        i10++;
                    }
                    g0.h3(new aa.d0(g5Var, arrayList2, z9, str, 11));
                    break;
                }
                break;
            case 1:
                g0.h3(new iy(0, (gz) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.e, (org.telegram.ui.an) this.f, (String) this.b, this.c));
                break;
            default:
                gz gzVar = (gz) this.d;
                boolean z10 = this.c;
                ij ijVar = (ij) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.b;
                if (tL_error != null) {
                    if (r8.r(tL_error.text)) {
                        String str2 = tL_error.text;
                        ln lnVar = new ln(ijVar, gzVar, tL_messages_editMessage, f2Var, z10);
                        gzVar = gzVar;
                        if (ijVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                            ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                            arrayList3.addAll(tL_inputRichMessage.photos);
                            arrayList3.addAll(tL_inputRichMessage.documents);
                            if (!arrayList3.isEmpty()) {
                                int c10 = r8.c(str2);
                                if (c10 < 0 || c10 >= arrayList3.size()) {
                                    c10 = 0;
                                }
                                gzVar.getFileRefController().u(new Object[]{arrayList3.get(c10), lnVar}, ijVar);
                                break;
                            }
                        }
                    }
                    g0.h3(new yq(18, gzVar, ijVar));
                    if (f2Var != null) {
                        g0.h3(new uw(gzVar, tL_error, f2Var, tL_messages_editMessage, 1));
                        break;
                    }
                } else {
                    if (z10 && ijVar != null) {
                        ijVar.y2 = true;
                    }
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new ds(gzVar, ijVar));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q4(ij ijVar, gz gzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        this.d = gzVar;
        this.c = z9;
        this.e = ijVar;
        this.f = tL_messages_editMessage;
        this.b = f2Var;
    }

    public /* synthetic */ q4(gz gzVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.an anVar, String str, boolean z9) {
        this.d = gzVar;
        this.e = tL_messages_requestUrlAuth;
        this.f = anVar;
        this.b = str;
        this.c = z9;
    }
}
