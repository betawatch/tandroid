package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class aj implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ aj(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
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
                org.telegram.ui.aa aaVar = (org.telegram.ui.aa) this.e;
                String str = (String) this.f;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.r;
                org.telegram.ui.la laVar = aaVar.a;
                ArrayList arrayList = laVar.w;
                ArrayList arrayList2 = laVar.v;
                arrayList.remove(str);
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                int i11 = this.b;
                boolean z11 = this.c;
                if (z10) {
                    laVar.i0(i11, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        laVar.j0(tL_username2, z12, true);
                    } else {
                        tL_username2.active = z11;
                        laVar.i0(i11, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(laVar.getParentActivity(), 0, laVar.getResourceProvider());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(aaVar, tL_username2, z12, 3));
                        alertDialog$Builder.o();
                    }
                }
                i10 = ((org.telegram.ui.ActionBar.o2) laVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(laVar.g0()));
                laVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (laVar.x != 0 && arrayList2 != null) {
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
                        laVar.j0(tL_username, true, false);
                        laVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ aj(org.telegram.ui.aa aaVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = aaVar;
        this.f = str;
        this.h = tLObject;
        this.b = i10;
        this.c = z10;
        this.n = tL_error;
        this.r = tL_username;
        this.d = z11;
    }
}
