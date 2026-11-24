// default package

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class f4b implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g4b b;

    public /* synthetic */ f4b(g4b g4bVar, byte b) {
        this.a = b;
        this.b = g4bVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        g4b g4bVar = this.b;
        switch (b) {
            case 0:
                g6b g6bVar = g4bVar.c;
                g6bVar.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = g6bVar.c0;
                int i = oc7.s5;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                g4bVar.c(tL_inputFileStoryDocument);
                break;
            default:
                rcc rccVar = (rcc) obj;
                g4bVar.G = rccVar;
                g4bVar.F.r0 = rccVar;
                g4bVar.E = rccVar.r / 1000;
                if (!rccVar.b()) {
                    if (new File(g4bVar.F.r0.o).renameTo(new File(g4bVar.e))) {
                        bc4.G(g4bVar.N.a).h0(false, 33554432, g4bVar.e, false);
                        break;
                    }
                } else {
                    MediaController.w().g0(g4bVar.F, false, false, false);
                    break;
                }
                break;
        }
    }
}
