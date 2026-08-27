package jh;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ q6(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                r6 r6Var = this.b;
                lh.z7 z7Var = r6Var.c;
                z7Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(z7Var.c0);
                r6Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                r6 r6Var2 = this.b;
                r6Var2.B = videoEditedInfo;
                r6Var2.A.videoEditedInfo = videoEditedInfo;
                r6Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(r6Var2.A.videoEditedInfo.originalPath).renameTo(new File(r6Var2.e))) {
                        FileLoader.getInstance(r6Var2.I.a).uploadFile(r6Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(r6Var2.A, false, false, false);
                    break;
                }
                break;
        }
    }
}
