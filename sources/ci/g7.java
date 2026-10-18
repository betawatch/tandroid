package ci;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ g7(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                ei.a8 a8Var = h7Var.c;
                a8Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(a8Var.c0);
                h7Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                h7 h7Var2 = this.b;
                h7Var2.F = videoEditedInfo;
                h7Var2.E.videoEditedInfo = videoEditedInfo;
                h7Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(h7Var2.E.videoEditedInfo.originalPath).renameTo(new File(h7Var2.e))) {
                        FileLoader.getInstance(h7Var2.M.a).uploadFile(h7Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(h7Var2.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
