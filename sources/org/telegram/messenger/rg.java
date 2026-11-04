package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ rg(g5 g5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = g5Var;
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
                li liVar = (li) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                boolean z10 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.n;
                a0.h hVar2 = (a0.h) this.r;
                liVar.getMessagesController().Y3(arrayList, z10);
                liVar.getMessagesController().S3(arrayList2, z10);
                int size = arrayList3.size();
                int i3 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList3.get(i10);
                    if ((zi.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i3++;
                    }
                    arrayList4.add(new zi(liVar.currentAccount, message, hVar, hVar2, false, i3 < 30));
                }
                g0.h3(new ah(liVar, arrayList4, 0));
                break;
            case 1:
                g5 g5Var = (g5) this.d;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                boolean z11 = this.b;
                HashMap hashMap3 = (HashMap) this.h;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashMap hashMap4 = (HashMap) this.n;
                boolean[] zArr = (boolean[]) this.r;
                g5Var.a0 = hashMap;
                g5Var.Z = hashMap2;
                g5Var.e = false;
                g5Var.r = true;
                if (z11) {
                    g5Var.h = true;
                }
                if (!g5Var.x.isEmpty() && g5Var.h) {
                    g5Var.c(g5Var.x, null, null, null);
                    g5Var.x.clear();
                }
                g0.h3(new v4(g5Var, hashMap3, arrayList5, hashMap4, 3));
                if (zArr[0]) {
                    Utilities.e.e(new x4(g5Var, 7), 300000L);
                    break;
                }
                break;
            default:
                yy yyVar = (yy) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z12 = this.b;
                zi ziVar = (zi) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.n;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    yyVar.n0(z12, ziVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, wmVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rg(li liVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = liVar;
        this.c = arrayList;
        this.b = z10;
        this.e = arrayList2;
        this.f = arrayList3;
        this.h = arrayList4;
        this.n = hVar;
        this.r = hVar2;
    }

    public /* synthetic */ rg(yy yyVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, zi ziVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.wm wmVar) {
        this.d = yyVar;
        this.c = tL_error;
        this.e = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z10;
        this.h = ziVar;
        this.n = keyboardButtonProto;
        this.r = wmVar;
    }
}
