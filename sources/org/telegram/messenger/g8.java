package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final /* synthetic */ BaseController a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.a = baseController;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        ((SendMessagesHelper) this.a).lambda$prepareImportHistory$108((Uri) this.b, (ArrayList) this.c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.b, (MediaDataController.SearchStickersResult) this.c, (Utilities.Callback) this.d, arrayList, str);
    }
}
