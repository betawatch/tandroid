package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class yg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ f1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ yg(i5 i5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = i5Var;
        this.e = hashMap;
        this.f = hashMap2;
        this.b = z10;
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
                boolean z10 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                a0.h hVar2 = (a0.h) this.r;
                uiVar.getMessagesController().V3(arrayList, z10);
                uiVar.getMessagesController().P3(arrayList2, z10);
                int size = arrayList3.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList3.get(i11);
                    if ((jj.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (jj.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i10++;
                    }
                    arrayList4.add(new jj(uiVar.currentAccount, message, hVar, hVar2, false, i10 < 30));
                }
                i0.g3(new hh(uiVar, arrayList4, 0));
                break;
            case 1:
                i5 i5Var = (i5) this.d;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                boolean z11 = this.b;
                HashMap hashMap3 = (HashMap) this.h;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashMap hashMap4 = (HashMap) this.n;
                boolean[] zArr = (boolean[]) this.r;
                i5Var.Z = hashMap;
                i5Var.Y = hashMap2;
                i5Var.e = false;
                i5Var.r = true;
                if (z11) {
                    i5Var.h = true;
                }
                if (!i5Var.x.isEmpty() && i5Var.h) {
                    i5Var.c(i5Var.x, null, null, null);
                    i5Var.x.clear();
                }
                i0.g3(new y4(i5Var, hashMap3, arrayList5, hashMap4, 3));
                if (zArr[0]) {
                    Utilities.e.d(new a5(i5Var, 7), 300000L);
                    break;
                }
                break;
            default:
                qz qzVar = (qz) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z12 = this.b;
                jj jjVar = (jj) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.n;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.q0(password);
                    qzVar.n0(z12, jjVar, keyboardButtonProto, twoStepVerificationActivity.p0(), twoStepVerificationActivity, unVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yg(ui uiVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = uiVar;
        this.c = arrayList;
        this.b = z10;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = arrayList4;
        this.n = hVar;
        this.r = hVar2;
    }

    public /* synthetic */ yg(qz qzVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, jj jjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.un unVar) {
        this.d = qzVar;
        this.c = tL_error;
        this.e = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z10;
        this.h = jjVar;
        this.n = keyboardButtonProto;
        this.r = unVar;
    }
}
