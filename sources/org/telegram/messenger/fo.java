package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fo(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.c;
                String str = (String) this.d;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    boolean z10 = v2.a;
                    int i10 = this.b;
                    if (z10) {
                        f8.b("account " + vpVar.currentAccount + " registered for push, push type: " + i10);
                    }
                    vpVar.getUserConfig().d = true;
                    tz.g = str;
                    tz.f = i10;
                    vpVar.getUserConfig().v(false);
                }
                i0.g3(new eo(vpVar, 9));
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
                i0.g3(new o7((ui) this.c, (TLRPC.StickerSet) this.d, this.b, 9));
                break;
            case 3:
                ui uiVar = (ui) this.c;
                q20 q20Var = (q20) this.d;
                boolean z12 = tLObject instanceof TLRPC.TL_messages_stickerSet;
                int i13 = this.b;
                if (z12) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((TLRPC.TL_messages_stickerSet) tLObject);
                    uiVar.z1(i13, arrayList, false, (int) (System.currentTimeMillis() / 1000), ui.q(arrayList), new pf(q20Var, 4));
                    break;
                } else {
                    uiVar.z1(i13, null, false, (int) (System.currentTimeMillis() / 1000), 0L, new pf(q20Var, 5));
                    break;
                }
            default:
                i0.g3(new cg((vp) this.c, tLObject, this.b, (xo) this.d));
                break;
        }
    }

    public /* synthetic */ fo(ui uiVar, TLRPC.StickerSet stickerSet, int i10) {
        this.a = 2;
        this.c = uiVar;
        this.d = stickerSet;
        this.b = i10;
    }
}
