package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController.KeywordResultCallback b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ i7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i9) {
        this.a = i9;
        this.b = keywordResultCallback;
        this.c = arrayList;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(this.c, this.d);
                break;
            default:
                this.b.run(this.c, this.d);
                break;
        }
    }
}
