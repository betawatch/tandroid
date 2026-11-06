package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ zg(g5 g5Var, HashMap hashMap, HashMap hashMap2, boolean z9, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = g5Var;
        this.e = hashMap;
        this.f = hashMap2;
        this.b = z9;
        this.h = hashMap3;
        this.c = arrayList;
        this.n = hashMap4;
        this.r = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                boolean z9 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                a0.h hVar2 = (a0.h) this.r;
                uiVar.getMessagesController().Y3(arrayList, z9);
                uiVar.getMessagesController().S3(arrayList2, z9);
                int size = arrayList3.size();
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList3.get(i10);
                    if ((ij.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (ij.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i7++;
                    }
                    arrayList4.add(new ij(uiVar.currentAccount, message, hVar, hVar2, false, i7 < 30));
                }
                g0.h3(new jh(uiVar, arrayList4, 0));
                break;
            case 1:
                g5 g5Var = (g5) this.d;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                boolean z10 = this.b;
                HashMap hashMap3 = (HashMap) this.h;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashMap hashMap4 = (HashMap) this.n;
                boolean[] zArr = (boolean[]) this.r;
                g5Var.Z = hashMap;
                g5Var.Y = hashMap2;
                g5Var.e = false;
                g5Var.r = true;
                if (z10) {
                    g5Var.h = true;
                }
                if (!g5Var.x.isEmpty() && g5Var.h) {
                    g5Var.c(g5Var.x, null, null, null);
                    g5Var.x.clear();
                }
                g0.h3(new v4(g5Var, hashMap3, arrayList5, hashMap4, 3));
                if (zArr[0]) {
                    Utilities.e.d(new x4(g5Var, 7), 300000L);
                    break;
                }
                break;
            default:
                gz gzVar = (gz) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z11 = this.b;
                ij ijVar = (ij) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.n;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    gzVar.n0(z11, ijVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, anVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zg(ui uiVar, ArrayList arrayList, boolean z9, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = uiVar;
        this.c = arrayList;
        this.b = z9;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = arrayList4;
        this.n = hVar;
        this.r = hVar2;
    }

    public /* synthetic */ zg(gz gzVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, ij ijVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.an anVar) {
        this.d = gzVar;
        this.c = tL_error;
        this.e = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z9;
        this.h = ijVar;
        this.n = keyboardButtonProto;
        this.r = anVar;
    }
}
