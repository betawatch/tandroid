package ih;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ t6(u6 u6Var, int i9) {
        this.a = i9;
        this.b = u6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                u6 u6Var = this.b;
                kh.a8 a8Var = u6Var.c;
                a8Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(a8Var.c0);
                u6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                u6 u6Var2 = this.b;
                u6Var2.B = videoEditedInfo;
                u6Var2.A.videoEditedInfo = videoEditedInfo;
                u6Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(u6Var2.A.videoEditedInfo.originalPath).renameTo(new File(u6Var2.e))) {
                        FileLoader.getInstance(u6Var2.I.a).uploadFile(u6Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(u6Var2.A, false, false, false);
                    break;
                }
                break;
        }
    }
}
