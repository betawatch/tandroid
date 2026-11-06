package di;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.c20;
import org.telegram.messenger.j20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;

    public /* synthetic */ w6(x6 x6Var, int i7) {
        this.a = i7;
        this.b = x6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        x6 x6Var = this.b;
        switch (i7) {
            case 0:
                fi.e7 e7Var = x6Var.c;
                e7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = e7Var.c0;
                int i10 = qp.C8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                x6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                j20 j20Var = (j20) obj;
                x6Var.F = j20Var;
                x6Var.E.p0 = j20Var;
                x6Var.D = j20Var.r / 1000;
                if (!j20Var.c()) {
                    if (new File(x6Var.E.p0.o).renameTo(new File(x6Var.e))) {
                        org.telegram.messenger.w7.G(x6Var.M.a).h0(false, 33554432, x6Var.e, false);
                        break;
                    }
                } else {
                    MediaController.B().h0(x6Var.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
