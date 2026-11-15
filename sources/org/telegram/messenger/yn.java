package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class yn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yn(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                np npVar = (np) this.c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = r2.a;
                    int i7 = this.b;
                    if (z10) {
                        a8.b("account " + npVar.currentAccount + " registered for push, push type: " + i7);
                    }
                    npVar.getUserConfig().d = true;
                    gz.g = str;
                    gz.f = i7;
                    npVar.getUserConfig().v(false);
                }
                g0.h3(new tj(npVar, 4));
                break;
            case 1:
                i7 i7Var = (i7) this.c;
                h7 h7Var = (h7) this.d;
                i7Var.z0 = false;
                boolean z11 = tLObject instanceof Vector;
                int i10 = this.b;
                if (z11) {
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
                g0.h3(new l7((si) this.c, (TLRPC.StickerSet) this.d, this.b, 9));
                break;
            case 3:
                si siVar = (si) this.c;
                z10 z10Var = (z10) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    siVar.z1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), si.q(arrayList), new qf(z10Var, 4));
                    break;
                } else {
                    siVar.z1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new qf(z10Var, 5));
                    break;
                }
            default:
                g0.h3(new cg((np) this.c, tLObject, this.b, (po) this.d));
                break;
        }
    }

    public /* synthetic */ yn(si siVar, TLRPC.StickerSet stickerSet, int i7) {
        this.a = 2;
        this.c = siVar;
        this.d = stickerSet;
        this.b = i7;
    }
}
