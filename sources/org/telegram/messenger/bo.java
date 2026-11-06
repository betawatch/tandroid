package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class bo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bo(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qp qpVar = (qp) this.c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z9 = r2.a;
                    int i7 = this.b;
                    if (z9) {
                        a8.b("account " + qpVar.currentAccount + " registered for push, push type: " + i7);
                    }
                    qpVar.getUserConfig().d = true;
                    iz.g = str;
                    iz.f = i7;
                    qpVar.getUserConfig().v(false);
                }
                g0.h3(new wj(qpVar, 4));
                break;
            case 1:
                i7 i7Var = (i7) this.c;
                h7 h7Var = (h7) this.d;
                i7Var.z0 = false;
                boolean z10 = tLObject instanceof Vector;
                int i10 = this.b;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.q0 == null) {
                            i7Var.q0 = new HashMap();
                        }
                        for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                            i7Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    i7Var.s(i10);
                    break;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        i7Var.j(0, false);
                        break;
                    } else {
                        i7Var.u0 = false;
                        i7Var.e(h7Var, false, false);
                        i7Var.s(i10);
                        break;
                    }
                }
                break;
            case 2:
                g0.h3(new k7((ui) this.c, (TLRPC.StickerSet) this.d, this.b, 9));
                break;
            case 3:
                ui uiVar = (ui) this.c;
                c20 c20Var = (c20) this.d;
                boolean z11 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.b;
                if (z11) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    uiVar.z1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), ui.q(arrayList), new rf(c20Var, 4));
                    break;
                } else {
                    uiVar.z1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new rf(c20Var, 5));
                    break;
                }
            default:
                g0.h3(new dg((qp) this.c, tLObject, this.b, (so) this.d));
                break;
        }
    }

    public /* synthetic */ bo(ui uiVar, TLRPC.StickerSet stickerSet, int i7) {
        this.a = 2;
        this.c = uiVar;
        this.d = stickerSet;
        this.b = i7;
    }
}
