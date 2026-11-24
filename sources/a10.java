// default package

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a10 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i20 b;

    public /* synthetic */ a10(i20 i20Var, byte b) {
        this.a = b;
        this.b = i20Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        TLRPC.Document F0;
        byte b = this.a;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                k27 k27Var = (k27) obj;
                if (k27Var != null && i20Var.p2 != null && (F0 = k27Var.F0()) != null) {
                    if (F0.id == 0) {
                        hd hdVar = new hd(3, null, i20Var.getContext());
                        hdVar.q(180L);
                        File file = new File(k27Var.k.attachPath);
                        if (file.exists()) {
                            ba4.G(i20Var.a).f0(new ht(i20Var, hdVar, F0, (byte) 4), file.getAbsolutePath());
                            break;
                        }
                    } else {
                        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_account_saveMusic.id = tL_inputDocument;
                        tL_inputDocument.id = F0.id;
                        tL_inputDocument.access_hash = F0.access_hash;
                        tL_inputDocument.file_reference = F0.file_reference;
                        ia7 ia7Var = i20Var.p2;
                        if (ia7Var != null) {
                            ia7Var.c.add(0, ia7Var.d(F0));
                            ia7Var.e();
                        }
                        i20Var.q2.clear();
                        i20Var.q2.addAll(i20Var.p2.c);
                        i20Var.t1.f();
                        ConnectionsManager.getInstance(i20Var.a).sendRequest(tL_account_saveMusic, null);
                        break;
                    }
                }
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) i20Var.b;
                wjb wjbVar = i20Var.J0;
                new u21(frameLayout, wjbVar).o(t21.G, wjbVar).j();
                break;
        }
    }
}
