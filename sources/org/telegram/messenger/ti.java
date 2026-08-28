package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ti implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ ti(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i9) {
        this.e = sendMessagesHelper;
        this.f = arrayList;
        this.c = z10;
        this.d = z11;
        this.r = message;
        this.h = arrayList2;
        this.n = arrayList3;
        this.b = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        TLRPC.TL_username tL_username;
        switch (this.a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$96((ArrayList) this.f, this.c, this.d, (TLRPC.Message) this.r, (ArrayList) this.h, (ArrayList) this.n, this.b);
                break;
            default:
                org.telegram.ui.ba baVar = (org.telegram.ui.ba) this.e;
                String str = (String) this.f;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.r;
                org.telegram.ui.ma maVar = baVar.a;
                ArrayList arrayList = maVar.w;
                ArrayList arrayList2 = maVar.v;
                arrayList.remove(str);
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                int i10 = this.b;
                boolean z11 = this.c;
                if (z10) {
                    maVar.h0(i10, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        maVar.i0(tL_username2, z12, true);
                    } else {
                        tL_username2.active = z11;
                        maVar.h0(i10, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(maVar.getParentActivity(), 0, maVar.getResourceProvider());
                        alertDialog$Builder.a.N = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.a.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new b5.e(baVar, tL_username2, z12, 3));
                        alertDialog$Builder.o();
                    }
                }
                i9 = ((org.telegram.ui.ActionBar.o2) maVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(maVar.f0()));
                maVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (maVar.x != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        if (((TLRPC.TL_username) obj).active) {
                            break;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            tL_username = (TLRPC.TL_username) obj2;
                            if (tL_username.editable) {
                            }
                        } else {
                            tL_username = null;
                        }
                    }
                    if (tL_username != null) {
                        maVar.i0(tL_username, true, false);
                        maVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ti(org.telegram.ui.ba baVar, String str, TLObject tLObject, int i9, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = baVar;
        this.f = str;
        this.h = tLObject;
        this.b = i9;
        this.c = z10;
        this.n = tL_error;
        this.r = tL_username;
        this.d = z11;
    }
}
