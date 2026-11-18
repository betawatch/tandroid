package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ c7(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                if (fjVar != null) {
                    g8 g8Var = this.b;
                    if (g8Var.q2 != null && (F0 = fjVar.F0()) != null) {
                        if (F0.id == 0) {
                            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, g8Var.getContext(), null);
                            u1Var.r(180L);
                            File file = new File(fjVar.k.attachPath);
                            if (file.exists()) {
                                org.telegram.messenger.w7.G(g8Var.a).f0(file.getAbsolutePath(), new bi.j(g8Var, u1Var, F0, 11));
                                break;
                            }
                        } else {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.gp gpVar = g8Var.q2;
                            if (gpVar != null) {
                                gpVar.c.add(0, gpVar.d(F0));
                                gpVar.e();
                            }
                            g8Var.r2.clear();
                            g8Var.r2.addAll(g8Var.q2.c);
                            g8Var.u1.f();
                            ConnectionsManager.getInstance(g8Var.a).sendRequest(tL_account_saveMusic, null);
                            break;
                        }
                    }
                }
                break;
            default:
                g8 g8Var2 = this.b;
                FrameLayout frameLayout = (FrameLayout) g8Var2.b;
                org.telegram.ui.ActionBar.i6 i6Var = g8Var2.J0;
                new lc(frameLayout, i6Var).o(kc.G, i6Var).j();
                break;
        }
    }
}
