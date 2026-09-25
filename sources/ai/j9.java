package ai;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ j9(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k9 k9Var = this.b;
                ci.l8 l8Var = k9Var.c;
                l8Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(l8Var.c0);
                k9Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                k9 k9Var2 = this.b;
                k9Var2.F = videoEditedInfo;
                k9Var2.E.videoEditedInfo = videoEditedInfo;
                k9Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(k9Var2.E.videoEditedInfo.originalPath).renameTo(new File(k9Var2.e))) {
                        FileLoader.getInstance(k9Var2.M.a).uploadFile(k9Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(k9Var2.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
