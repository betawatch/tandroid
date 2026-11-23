package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d20;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ n6(o6 o6Var, int i7) {
        this.a = i7;
        this.b = o6Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        o6 o6Var = this.b;
        switch (i7) {
            case 0:
                hi.x7 x7Var = o6Var.c;
                x7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = x7Var.c0;
                int i10 = mp.I8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                o6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                d20 d20Var = (d20) obj;
                o6Var.G = d20Var;
                o6Var.F.r0 = d20Var;
                o6Var.E = d20Var.r / 1000;
                if (!d20Var.c()) {
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
