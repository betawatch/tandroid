package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;

    public /* synthetic */ x6(a8 a8Var, int i7) {
        this.a = i7;
        this.b = a8Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (ijVar != null) {
                    a8 a8Var = this.b;
                    if (a8Var.p2 != null && (F0 = ijVar.F0()) != null) {
                        if (F0.id == 0) {
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, a8Var.getContext(), null);
                            u1Var.r(180L);
                            File file = new File(ijVar.k.attachPath);
                            if (file.exists()) {
                                org.telegram.messenger.w7.G(a8Var.a).f0(file.getAbsolutePath(), new bi.v3(a8Var, u1Var, F0, 6));
                                break;
                            }
                        } else {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.kp kpVar = a8Var.p2;
                            if (kpVar != null) {
                                kpVar.c.add(0, kpVar.d(F0));
                                kpVar.e();
                            }
                            a8Var.q2.clear();
                            a8Var.q2.addAll(a8Var.p2.c);
                            a8Var.t1.f();
                            ConnectionsManager.getInstance(a8Var.a).sendRequest(tL_account_saveMusic, null);
                            break;
                        }
                    }
                }
                break;
            default:
                a8 a8Var2 = this.b;
                FrameLayout frameLayout = (FrameLayout) a8Var2.b;
                org.telegram.ui.ActionBar.h6 h6Var = a8Var2.I0;
                new gc(frameLayout, h6Var).o(fc.F, h6Var).j();
                break;
        }
    }
}
