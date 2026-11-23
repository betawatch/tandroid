package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ c7(e8 e8Var, int i7) {
        this.a = i7;
        this.b = e8Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                if (fjVar != null) {
                    e8 e8Var = this.b;
                    if (e8Var.q2 != null && (F0 = fjVar.F0()) != null) {
                        if (F0.id == 0) {
                            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, e8Var.getContext(), null);
                            t1Var.r(180L);
                            File file = new File(fjVar.k.attachPath);
                            if (file.exists()) {
                                org.telegram.messenger.w7.G(e8Var.a).f0(file.getAbsolutePath(), new bi.j(e8Var, t1Var, F0, 11));
                                break;
                            }
                        } else {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.gp gpVar = e8Var.q2;
                            if (gpVar != null) {
                                gpVar.c.add(0, gpVar.d(F0));
                                gpVar.e();
                            }
                            e8Var.r2.clear();
                            e8Var.r2.addAll(e8Var.q2.c);
                            e8Var.u1.f();
                            ConnectionsManager.getInstance(e8Var.a).sendRequest(tL_account_saveMusic, null);
                            break;
                        }
                    }
                }
                break;
            default:
                e8 e8Var2 = this.b;
                FrameLayout frameLayout = (FrameLayout) e8Var2.b;
                org.telegram.ui.ActionBar.i6 i6Var = e8Var2.J0;
                new kc(frameLayout, i6Var).o(jc.G, i6Var).j();
                break;
        }
    }
}
