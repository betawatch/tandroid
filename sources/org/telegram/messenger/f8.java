package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class f8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final /* synthetic */ BaseController a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f8(BaseController baseController, Object obj, Object obj2, Object obj3) {
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
