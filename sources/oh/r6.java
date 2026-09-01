package oh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ r6(s6 s6Var, int i10) {
        this.a = i10;
        this.b = s6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                s6 s6Var = this.b;
                qh.s6 s6Var2 = s6Var.c;
                s6Var2.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(s6Var2.c0);
                s6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                s6 s6Var3 = this.b;
                s6Var3.C = videoEditedInfo;
                s6Var3.B.videoEditedInfo = videoEditedInfo;
                s6Var3.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(s6Var3.B.videoEditedInfo.originalPath).renameTo(new File(s6Var3.e))) {
                        FileLoader.getInstance(s6Var3.J.a).uploadFile(s6Var3.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(s6Var3.B, false, false, false);
                    break;
                }
                break;
        }
    }
}
