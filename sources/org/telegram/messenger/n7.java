package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController.KeywordResultCallback b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ n7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.a = i10;
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
