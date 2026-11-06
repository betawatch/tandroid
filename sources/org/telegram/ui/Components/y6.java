package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ y6(b8 b8Var, int i7) {
        this.a = i7;
        this.b = b8Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                if (ijVar != null) {
                    b8 b8Var = this.b;
                    if (b8Var.m2 != null && (F0 = ijVar.F0()) != null) {
                        if (F0.id == 0) {
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, b8Var.getContext(), null);
                            u1Var.r(180L);
                            File file = new File(ijVar.k.attachPath);
                            if (file.exists()) {
                                org.telegram.messenger.w7.G(b8Var.a).f0(file.getAbsolutePath(), new bi.v3(b8Var, u1Var, F0, 6));
                                break;
                            }
                        } else {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.kp kpVar = b8Var.m2;
                            if (kpVar != null) {
                                kpVar.c.add(0, kpVar.d(F0));
                                kpVar.e();
                            }
                            b8Var.n2.clear();
                            b8Var.n2.addAll(b8Var.m2.c);
                            b8Var.q1.f();
                            ConnectionsManager.getInstance(b8Var.a).sendRequest(tL_account_saveMusic, null);
                            break;
                        }
                    }
                }
                break;
            default:
                b8 b8Var2 = this.b;
                FrameLayout frameLayout = (FrameLayout) b8Var2.b;
                org.telegram.ui.ActionBar.f6 f6Var = b8Var2.I0;
                new hc(frameLayout, f6Var).o(gc.F, f6Var).j();
                break;
        }
    }
}
