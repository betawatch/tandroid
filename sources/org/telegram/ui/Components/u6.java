package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ u6(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                if (jjVar != null) {
                    w7 w7Var = this.b;
                    if (w7Var.m2 != null && (F0 = jjVar.F0()) != null) {
                        if (F0.id == 0) {
                            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, w7Var.getContext(), null);
                            x1Var.r(180L);
                            File file = new File(jjVar.k.attachPath);
                            if (file.exists()) {
                                org.telegram.messenger.b8.G(w7Var.a).g0(file.getAbsolutePath(), new kg.d0(w7Var, x1Var, F0, 1));
                                break;
                            }
                        } else {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.pp ppVar = w7Var.m2;
                            if (ppVar != null) {
                                ppVar.c.add(0, ppVar.d(F0));
                                ppVar.e();
                            }
                            w7Var.n2.clear();
                            w7Var.n2.addAll(w7Var.m2.c);
                            w7Var.q1.f();
                            ConnectionsManager.getInstance(w7Var.a).sendRequest(tL_account_saveMusic, null);
                            break;
                        }
                    }
                }
                break;
            default:
                w7 w7Var2 = this.b;
                FrameLayout frameLayout = (FrameLayout) w7Var2.b;
                org.telegram.ui.ActionBar.p6 p6Var = w7Var2.I0;
                new cc(frameLayout, p6Var).o(bc.F, p6Var).j();
                break;
        }
    }
}
