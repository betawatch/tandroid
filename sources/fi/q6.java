package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.g20;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ q6(r6 r6Var, int i7) {
        this.a = i7;
        this.b = r6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        r6 r6Var = this.b;
        switch (i7) {
            case 0:
                hi.d7 d7Var = r6Var.c;
                d7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = d7Var.c0;
                int i10 = np.D8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                r6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                g20 g20Var = (g20) obj;
                r6Var.G = g20Var;
                r6Var.F.r0 = g20Var;
                r6Var.E = g20Var.r / 1000;
                if (!g20Var.c()) {
                    if (new File(r6Var.F.r0.o).renameTo(new File(r6Var.e))) {
                        org.telegram.messenger.w7.G(r6Var.N.a).h0(false, 33554432, r6Var.e, false);
                        break;
                    }
                } else {
                    MediaController.B().h0(r6Var.F, false, false, false);
                    break;
                }
                break;
        }
    }
}
