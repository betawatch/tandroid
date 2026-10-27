package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class uk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uk(BaseController baseController, long j10, Object obj, int i10) {
        this.a = i10;
        this.b = baseController;
        this.c = j10;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TopicsController) this.b).lambda$loadTopics$4(this.c, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                break;
            case 1:
                ((TopicsController) this.b).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.c);
                break;
            case 2:
                ((TranslateController) this.b).lambda$setDialogTranslateTo$0(this.c, (String) this.d);
                break;
            default:
                ((TranslateController) this.b).lambda$invalidateTranslation$9((MessageObject) this.d, this.c);
                break;
        }
    }

    public /* synthetic */ uk(BaseController baseController, Object obj, long j10, int i10) {
        this.a = i10;
        this.b = baseController;
        this.d = obj;
        this.c = j10;
    }
}
