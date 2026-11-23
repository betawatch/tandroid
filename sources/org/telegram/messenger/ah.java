package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ah(i5 i5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
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
                ri riVar = (ri) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                boolean z10 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                a0.h hVar2 = (a0.h) this.r;
                riVar.getMessagesController().f4(arrayList, z10);
                riVar.getMessagesController().Z3(arrayList2, z10);
                int size = arrayList3.size();
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList3.get(i10);
                    if ((fj.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (fj.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i7++;
                    }
                    arrayList4.add(new fj(riVar.currentAccount, message, hVar, hVar2, false, i7 < 30));
                }
                g0.g3(new jh(riVar, arrayList4, 0));
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
                i5Var.a0 = hashMap;
                i5Var.Z = hashMap2;
                i5Var.e = false;
                i5Var.r = true;
                if (z11) {
                    i5Var.h = true;
                }
                if (!i5Var.x.isEmpty() && i5Var.h) {
                    i5Var.c(i5Var.x, null, null, null);
                    i5Var.x.clear();
                }
                g0.g3(new w4(i5Var, hashMap3, arrayList5, hashMap4, 3));
                if (zArr[0]) {
                    Utilities.e.d(new m4(i5Var, 7), 300000L);
                    break;
                }
                break;
            default:
                zy zyVar = (zy) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z12 = this.b;
                fj fjVar = (fj) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.n;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    zyVar.n0(z12, fjVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, bnVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ah(ri riVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = riVar;
        this.c = arrayList;
        this.b = z10;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = arrayList4;
        this.n = hVar;
        this.r = hVar2;
    }

    public /* synthetic */ ah(zy zyVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, fj fjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.bn bnVar) {
        this.d = zyVar;
        this.c = tL_error;
        this.e = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z10;
        this.h = fjVar;
        this.n = keyboardButtonProto;
        this.r = bnVar;
    }
}
