package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.e20;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ n6(o6 o6Var, int i7) {
        this.a = i7;
        this.b = o6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        o6 o6Var = this.b;
        switch (i7) {
            case 0:
                hi.c7 c7Var = o6Var.c;
                c7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                TLRPC.Document document = c7Var.c0;
                int i10 = mp.I8;
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputFileStoryDocument.doc = tL_inputDocument;
                o6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                e20 e20Var = (e20) obj;
                o6Var.G = e20Var;
                o6Var.F.r0 = e20Var;
                o6Var.E = e20Var.r / 1000;
                if (!e20Var.c()) {
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
