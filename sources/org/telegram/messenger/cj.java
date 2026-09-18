package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class cj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ cj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f = arrayList;
        this.c = z10;
        this.d = z11;
        this.r = message;
        this.h = arrayList2;
        this.n = arrayList3;
        this.b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        TLRPC.TL_username tL_username;
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$96((ArrayList) this.f, this.c, this.d, (TLRPC.Message) this.r, (ArrayList) this.h, (ArrayList) this.n, this.b);
                break;
            default:
                org.telegram.ui.ha haVar = (org.telegram.ui.ha) this.e;
                String str = (String) this.f;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.r;
                org.telegram.ui.sa saVar = haVar.a;
                ArrayList arrayList = saVar.w;
                ArrayList arrayList2 = saVar.v;
                arrayList.remove(str);
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                int i11 = this.b;
                boolean z11 = this.c;
                if (z10) {
                    saVar.i0(i11, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        saVar.j0(tL_username2, z12, true);
                    } else {
                        tL_username2.active = z11;
                        saVar.i0(i11, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(saVar.getParentActivity(), 0, saVar.getResourceProvider());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(haVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.o2) saVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(saVar.g0()));
                saVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (saVar.x != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        if (((TLRPC.TL_username) obj).active) {
                            break;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            tL_username = (TLRPC.TL_username) obj2;
                            if (tL_username.editable) {
                            }
                        } else {
                            tL_username = null;
                        }
                    }
                    if (tL_username != null) {
                        saVar.j0(tL_username, true, false);
                        saVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ cj(org.telegram.ui.ha haVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = haVar;
        this.f = str;
        this.h = tLObject;
        this.b = i10;
        this.c = z10;
        this.n = tL_error;
        this.r = tL_username;
        this.d = z11;
    }
}
