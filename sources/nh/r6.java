package nh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ph.u6 u6Var = s6Var.c;
                u6Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(u6Var.c0);
                s6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                s6 s6Var2 = this.b;
                s6Var2.C = videoEditedInfo;
                s6Var2.B.videoEditedInfo = videoEditedInfo;
                s6Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(s6Var2.B.videoEditedInfo.originalPath).renameTo(new File(s6Var2.e))) {
                        FileLoader.getInstance(s6Var2.J.a).uploadFile(s6Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(s6Var2.B, false, false, false);
                    break;
                }
                break;
        }
    }
}
