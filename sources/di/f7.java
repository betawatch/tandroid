package di;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g7 b;

    public /* synthetic */ f7(g7 g7Var, int i10) {
        this.a = i10;
        this.b = g7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                g7 g7Var = this.b;
                fi.w7 w7Var = g7Var.c;
                w7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(w7Var.c0);
                g7Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                g7 g7Var2 = this.b;
                g7Var2.F = videoEditedInfo;
                g7Var2.E.videoEditedInfo = videoEditedInfo;
                g7Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(g7Var2.E.videoEditedInfo.originalPath).renameTo(new File(g7Var2.e))) {
                        FileLoader.getInstance(g7Var2.M.a).uploadFile(g7Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(g7Var2.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
