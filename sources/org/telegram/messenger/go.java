package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class go implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ go(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                wp wpVar = (wp) this.c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = v2.a;
                    int i10 = this.b;
                    if (z10) {
                        f8.b("account " + wpVar.currentAccount + " registered for push, push type: " + i10);
                    }
                    wpVar.getUserConfig().d = true;
                    uz.g = str;
                    uz.f = i10;
                    wpVar.getUserConfig().v(false);
                }
                i0.g3(new fo(wpVar, 9));
                break;
            case 1:
                m7 m7Var = (m7) this.c;
                l7 l7Var = (l7) this.d;
                m7Var.z0 = false;
                boolean z11 = tLObject instanceof Vector;
                int i11 = this.b;
                if (z11) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (m7Var.q0 == null) {
                            m7Var.q0 = new HashMap();
                        }
                        for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i12);
                            m7Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    m7Var.s(i11);
                    break;
                } else if (tL_error != null) {
                    if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                        m7Var.j(0, false);
                        break;
                    } else {
                        m7Var.u0 = false;
                        m7Var.e(l7Var, false, false);
                        m7Var.s(i11);
                        break;
                    }
                }
                break;
            case 2:
                i0.g3(new o7((vi) this.c, (TLRPC.StickerSet) this.d, this.b, 9));
                break;
            case 3:
                vi viVar = (vi) this.c;
                r20 r20Var = (r20) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i13 = this.b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    viVar.z1(i13, arrayList, false, (int) (System.currentTimeMillis() / 1000), vi.q(arrayList), new qf(r20Var, 4));
                    break;
                } else {
                    viVar.z1(i13, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new qf(r20Var, 5));
                    break;
                }
            default:
                i0.g3(new dg((wp) this.c, tLObject, this.b, (yo) this.d));
                break;
        }
    }

    public /* synthetic */ go(vi viVar, TLRPC.StickerSet stickerSet, int i10) {
        this.a = 2;
        this.c = viVar;
        this.d = stickerSet;
        this.b = i10;
    }
}
