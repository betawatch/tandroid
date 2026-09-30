package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final /* synthetic */ BaseController a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.a = baseController;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        ((SendMessagesHelper) this.a).lambda$prepareImportHistory$105((Uri) this.b, (ArrayList) this.c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override // org.telegram.messenger.MediaDataController.KeywordResultCallback
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.b, (MediaDataController.SearchStickersResult) this.c, (Utilities.Callback) this.d, arrayList, str);
    }
}
