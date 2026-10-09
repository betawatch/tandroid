package ai;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ k9(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l9 l9Var = this.b;
                ci.l8 l8Var = l9Var.c;
                l8Var.c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(l8Var.c0);
                l9Var.c(tL_inputFileStoryDocument);
                break;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                l9 l9Var2 = this.b;
                l9Var2.F = videoEditedInfo;
                l9Var2.E.videoEditedInfo = videoEditedInfo;
                l9Var2.y = videoEditedInfo.estimatedDuration / 1000;
                if (!videoEditedInfo.needConvert()) {
                    if (new File(l9Var2.E.videoEditedInfo.originalPath).renameTo(new File(l9Var2.e))) {
                        FileLoader.getInstance(l9Var2.M.a).uploadFile(l9Var2.e, false, false, 33554432);
                        break;
                    }
                } else {
                    MediaController.getInstance().scheduleVideoConvert(l9Var2.E, false, false, false);
                    break;
                }
                break;
        }
    }
}
