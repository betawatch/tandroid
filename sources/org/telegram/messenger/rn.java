package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rn(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hp hpVar = (hp) this.c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = r2.a;
                    int i3 = this.b;
                    if (z10) {
                        a8.b("account " + hpVar.currentAccount + " registered for push, push type: " + i3);
                    }
                    hpVar.getUserConfig().d = true;
                    az.g = str;
                    az.f = i3;
                    hpVar.getUserConfig().v(false);
                }
                g0.h3(new mj(hpVar, 4));
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
                g0.h3(new k7((li) this.c, (TLRPC.StickerSet) this.d, this.b, 9));
                break;
            case 3:
                li liVar = (li) this.c;
                u10 u10Var = (u10) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i12 = this.b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    liVar.z1(i12, arrayList, false, (int) (System.currentTimeMillis() / 1000), li.q(arrayList), new jf(u10Var, 4));
                    break;
                } else {
                    liVar.z1(i12, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new jf(u10Var, 5));
                    break;
                }
            default:
                g0.h3(new vf((hp) this.c, tLObject, this.b, (jo) this.d));
                break;
        }
    }

    public /* synthetic */ rn(li liVar, TLRPC.StickerSet stickerSet, int i3) {
        this.a = 2;
        this.c = liVar;
        this.d = stickerSet;
        this.b = i3;
    }
}
