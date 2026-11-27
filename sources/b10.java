// default package

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b10 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j20 b;

    public /* synthetic */ b10(j20 j20Var, byte b) {
        this.a = b;
        this.b = j20Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        TLRPC.Document F0;
        byte b = this.a;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                r47 r47Var = (r47) obj;
                if (r47Var != null && j20Var.p2 != null && (F0 = r47Var.F0()) != null) {
                    if (F0.id == 0) {
                        id idVar = new id(3, null, j20Var.getContext());
                        idVar.q(180L);
                        File file = new File(r47Var.k.attachPath);
                        if (file.exists()) {
                            xb4.G(j20Var.a).f0(new gt(j20Var, idVar, F0, (byte) 4), file.getAbsolutePath());
                            break;
                        }
                    } else {
                        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_account_saveMusic.id = tL_inputDocument;
                        tL_inputDocument.id = F0.id;
                        tL_inputDocument.access_hash = F0.access_hash;
                        tL_inputDocument.file_reference = F0.file_reference;
                        pc7 pc7Var = j20Var.p2;
                        if (pc7Var != null) {
                            pc7Var.c.add(0, pc7Var.d(F0));
                            pc7Var.e();
                        }
                        j20Var.q2.clear();
                        j20Var.q2.addAll(j20Var.p2.c);
                        j20Var.t1.f();
                        ConnectionsManager.getInstance(j20Var.a).sendRequest(tL_account_saveMusic, null);
                        break;
                    }
                }
                break;
            default:
                FrameLayout frameLayout = (FrameLayout) j20Var.b;
                vnb vnbVar = j20Var.J0;
                new d31(frameLayout, vnbVar).o(c31.G, vnbVar).j();
                break;
        }
    }
}
