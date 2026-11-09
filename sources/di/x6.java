package di;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.c20;
import org.telegram.messenger.j20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ x6(y6 y6Var, int i7) {
        this.a = i7;
        this.b = y6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        y6 y6Var = this.b;
        switch (i7) {
            case 0:
                fi.e7 e7Var = y6Var.c;
                e7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = e7Var.c0;
                int i10 = qp.C8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                y6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                j20 j20Var = (j20) obj;
                y6Var.F = j20Var;
                y6Var.E.p0 = j20Var;
                y6Var.D = j20Var.r / 1000;
                if (!j20Var.c()) {
                    if (new File(y6Var.E.p0.o).renameTo(new File(y6Var.e))) {
                        org.telegram.messenger.w7.G(y6Var.M.a).h0(false, 33554432, y6Var.e, false);
                        break;
                    }
                } else {
                    MediaController.B().h0(y6Var.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
