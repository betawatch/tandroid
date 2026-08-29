package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final /* synthetic */ BaseController a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.a = baseController;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        ((SendMessagesHelper) this.a).lambda$prepareImportHistory$105((Uri) this.b, (ArrayList) this.c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.b, (MediaDataController.SearchStickersResult) this.c, (Utilities.Callback) this.d, arrayList, str);
    }
}
