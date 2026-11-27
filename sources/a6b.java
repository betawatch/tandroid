// default package

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6b implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b6b b;

    public /* synthetic */ a6b(b6b b6bVar, byte b) {
        this.a = b;
        this.b = b6bVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        b6b b6bVar = this.b;
        switch (b) {
            case 0:
                c8b c8bVar = b6bVar.c;
                c8bVar.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = c8bVar.c0;
                int i = uc7.s5;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                b6bVar.c(tL_inputFileStoryDocument);
                break;
            default:
                oec oecVar = (oec) obj;
                b6bVar.G = oecVar;
                b6bVar.F.r0 = oecVar;
                b6bVar.E = oecVar.r / 1000;
                if (!oecVar.b()) {
                    if (new File(b6bVar.F.r0.o).renameTo(new File(b6bVar.e))) {
                        xb4.G(b6bVar.N.a).h0(false, 33554432, b6bVar.e, false);
                        break;
                    }
                } else {
                    MediaController.z().j0(b6bVar.F, false, false, false);
                    break;
                }
                break;
        }
    }
}
