package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ w6(y7 y7Var, int i7) {
        this.a = i7;
        this.b = y7Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                if (gjVar != null) {
                    y7 y7Var = this.b;
                    if (y7Var.q2 != null && (F0 = gjVar.F0()) != null) {
                        if (F0.id == 0) {
                            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, y7Var.getContext(), null);
                            t1Var.r(180L);
                            File file = new File(gjVar.k.attachPath);
                            if (file.exists()) {
                                org.telegram.messenger.w7.G(y7Var.a).f0(file.getAbsolutePath(), new bi.j(y7Var, t1Var, F0, 8));
                                break;
                            }
                        } else {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.hp hpVar = y7Var.q2;
                            if (hpVar != null) {
                                hpVar.c.add(0, hpVar.d(F0));
                                hpVar.e();
                            }
                            y7Var.r2.clear();
                            y7Var.r2.addAll(y7Var.q2.c);
                            y7Var.u1.f();
                            ConnectionsManager.getInstance(y7Var.a).sendRequest(tL_account_saveMusic, null);
                            break;
                        }
                    }
                }
                break;
            default:
                y7 y7Var2 = this.b;
                FrameLayout frameLayout = (FrameLayout) y7Var2.b;
                org.telegram.ui.ActionBar.e6 e6Var = y7Var2.J0;
                new cc(frameLayout, e6Var).o(bc.G, e6Var).j();
                break;
        }
    }
}
