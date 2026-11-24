// default package

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a20 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i30 b;

    public /* synthetic */ a20(i30 i30Var, byte b) {
        this.a = b;
        this.b = i30Var;
    }

    @Override // qac
    public final void a(Object obj) {
        TLRPC.Document F0;
        byte b = this.a;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                k47 k47Var = (k47) obj;
                if (k47Var != null && i30Var.p2 != null && (F0 = k47Var.F0()) != null) {
                    if (F0.id == 0) {
                        he heVar = new he(3, null, i30Var.getContext());
                        heVar.q(180L);
                        File file = new File(k47Var.k.attachPath);
                        if (file.exists()) {
                            bc4.G(i30Var.a).f0(new iu(i30Var, heVar, F0, (byte) 4), file.getAbsolutePath());
                            break;
                        }
                    } else {
                        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_account_saveMusic.id = tL_inputDocument;
                        tL_inputDocument.id = F0.id;
                        tL_inputDocument.access_hash = F0.access_hash;
                        tL_inputDocument.file_reference = F0.file_reference;
                        jc7 jc7Var = i30Var.p2;
                        if (jc7Var != null) {
                            jc7Var.c.add(0, jc7Var.d(F0));
                            jc7Var.e();
                        }
                        i30Var.q2.clear();
                        i30Var.q2.addAll(i30Var.p2.c);
                        i30Var.t1.f();
                        ConnectionsManager.getInstance(i30Var.a).sendRequest(tL_account_saveMusic, null);
                        break;
                    }
                }
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) i30Var.b;
                ylb ylbVar = i30Var.J0;
                new c41(frameLayout, ylbVar).o(b41.G, ylbVar).j();
                break;
        }
    }
}
