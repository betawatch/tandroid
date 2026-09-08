package bi;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ r8(t8 t8Var, int i10) {
        this.a = i10;
        this.b = t8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                t8 t8Var = this.b;
                di.o8 o8Var = t8Var.c;
                o8Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(o8Var.c0);
                t8Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                t8 t8Var2 = this.b;
                t8Var2.F = videoEditedInfo;
                t8Var2.E.videoEditedInfo = videoEditedInfo;
                t8Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(t8Var2.E.videoEditedInfo.originalPath).renameTo(new File(t8Var2.e))) {
                        FileLoader.getInstance(t8Var2.M.a).uploadFile(t8Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(t8Var2.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
