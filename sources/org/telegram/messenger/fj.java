package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class fj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ fj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z4, boolean z10, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.e = sendMessagesHelper;
        this.f = arrayList;
        this.c = z4;
        this.d = z10;
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
                org.telegram.ui.ga gaVar = (org.telegram.ui.ga) this.e;
                String str = (String) this.f;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.r;
                org.telegram.ui.ra raVar = gaVar.a;
                ArrayList arrayList = raVar.w;
                ArrayList arrayList2 = raVar.v;
                arrayList.remove(str);
                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                int i11 = this.b;
                boolean z10 = this.c;
                if (z4) {
                    raVar.i0(i11, z10, false);
                } else {
                    boolean z11 = this.d;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        raVar.j0(tL_username2, z11, true);
                    } else {
                        tL_username2.active = z10;
                        raVar.i0(i11, z10, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(raVar.getParentActivity(), 0, raVar.getResourceProvider());
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.a.Q = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(gaVar, tL_username2, z11, 3));
                        alertDialog$Builder.o();
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.p2) raVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(raVar.g0()));
                raVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (raVar.x != 0 && arrayList2 != null) {
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
                        raVar.j0(tL_username, true, false);
                        raVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ fj(org.telegram.ui.ga gaVar, String str, TLObject tLObject, int i10, boolean z4, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z10) {
        this.e = gaVar;
        this.f = str;
        this.h = tLObject;
        this.b = i10;
        this.c = z4;
        this.n = tL_error;
        this.r = tL_username;
        this.d = z10;
    }
}
