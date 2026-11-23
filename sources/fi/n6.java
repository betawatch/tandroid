package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.f20;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ n6(o6 o6Var, int i7) {
        this.a = i7;
        this.b = o6Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7 = this.a;
        o6 o6Var = this.b;
        switch (i7) {
            case 0:
                hi.c7 c7Var = o6Var.c;
                c7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = c7Var.c0;
                int i10 = np.I8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                o6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                f20 f20Var = (f20) obj;
                o6Var.G = f20Var;
                o6Var.F.r0 = f20Var;
                o6Var.E = f20Var.r / 1000;
                if (!f20Var.c()) {
                    if (new File(o6Var.F.r0.o).renameTo(new File(o6Var.e))) {
                        org.telegram.messenger.w7.G(o6Var.N.a).h0(false, 33554432, o6Var.e, false);
                        break;
                    }
                } else {
                    MediaController.B().h0(o6Var.F, false, false, false);
                    break;
                }
                break;
        }
    }
}
