package ei;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ x6(y6 y6Var, int i3) {
        this.a = i3;
        this.b = y6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        y6 y6Var = this.b;
        switch (i3) {
            case 0:
                gi.f7 f7Var = y6Var.c;
                f7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = f7Var.c0;
                int i10 = hp.C8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                y6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                b20 b20Var = (b20) obj;
                y6Var.G = b20Var;
                y6Var.F.p0 = b20Var;
                y6Var.E = b20Var.r / 1000;
                if (!b20Var.c()) {
                    if (new File(y6Var.F.p0.o).renameTo(new File(y6Var.e))) {
                        org.telegram.messenger.w7.G(y6Var.N.a).i0(false, 33554432, y6Var.e, false);
                        break;
                    }
                } else {
                    MediaController.B().h0(y6Var.F, false, false, false);
                    break;
                }
                break;
        }
    }
}
