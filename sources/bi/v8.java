package bi;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ v8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                w8 w8Var = this.b;
                di.k8 k8Var = w8Var.c;
                k8Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(k8Var.c0);
                w8Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                w8 w8Var2 = this.b;
                w8Var2.F = videoEditedInfo;
                w8Var2.E.videoEditedInfo = videoEditedInfo;
                w8Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(w8Var2.E.videoEditedInfo.originalPath).renameTo(new File(w8Var2.e))) {
                        FileLoader.getInstance(w8Var2.M.a).uploadFile(w8Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(w8Var2.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
