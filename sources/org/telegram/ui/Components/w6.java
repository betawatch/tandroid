package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    public /* synthetic */ w6(z7 z7Var, int i3) {
        this.a = i3;
        this.b = z7Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                if (ziVar != null) {
                    z7 z7Var = this.b;
                    if (z7Var.n2 != null && (F0 = ziVar.F0()) != null) {
                        if (F0.id == 0) {
                            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, z7Var.getContext(), null);
                            s1Var.r(180L);
                            File file = new File(ziVar.k.attachPath);
                            if (file.exists()) {
                                org.telegram.messenger.w7.G(z7Var.a).g0(file.getAbsolutePath(), new ai.m(z7Var, s1Var, F0, 8));
                                break;
                            }
                        } else {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.bp bpVar = z7Var.n2;
                            if (bpVar != null) {
                                bpVar.c.add(0, bpVar.d(F0));
                                bpVar.e();
                            }
                            z7Var.o2.clear();
                            z7Var.o2.addAll(z7Var.n2.c);
                            z7Var.r1.f();
                            ConnectionsManager.getInstance(z7Var.a).sendRequest(tL_account_saveMusic, null);
                            break;
                        }
                    }
                }
                break;
            default:
                z7 z7Var2 = this.b;
                FrameLayout frameLayout = (FrameLayout) z7Var2.b;
                org.telegram.ui.ActionBar.e6 e6Var = z7Var2.J0;
                new fc(frameLayout, e6Var).o(ec.G, e6Var).j();
                break;
        }
    }
}
