package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ d7(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        TLRPC.Document F0;
        switch (this.a) {
            case 0:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                if (gjVar != null) {
                    f8 f8Var = this.b;
                    if (f8Var.q2 != null && (F0 = gjVar.F0()) != null) {
                        if (F0.id == 0) {
                            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, f8Var.getContext(), null);
                            t1Var.r(180L);
                            File file = new File(gjVar.k.attachPath);
                            if (file.exists()) {
                                org.telegram.messenger.w7.G(f8Var.a).f0(file.getAbsolutePath(), new bi.j(f8Var, t1Var, F0, 11));
                                break;
                            }
                        } else {
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = F0.id;
                            tL_inputDocument.access_hash = F0.access_hash;
                            tL_inputDocument.file_reference = F0.file_reference;
                            org.telegram.messenger.hp hpVar = f8Var.q2;
                            if (hpVar != null) {
                                hpVar.c.add(0, hpVar.d(F0));
                                hpVar.e();
                            }
                            f8Var.r2.clear();
                            f8Var.r2.addAll(f8Var.q2.c);
                            f8Var.u1.f();
                            ConnectionsManager.getInstance(f8Var.a).sendRequest(tL_account_saveMusic, null);
                            break;
                        }
                    }
                }
                break;
            default:
                f8 f8Var2 = this.b;
                FrameLayout frameLayout = (FrameLayout) f8Var2.b;
                org.telegram.ui.ActionBar.h6 h6Var = f8Var2.J0;
                new lc(frameLayout, h6Var).o(kc.G, h6Var).j();
                break;
        }
    }
}
