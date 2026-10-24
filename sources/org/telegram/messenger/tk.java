package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ BaseController c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tk(BaseController baseController, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = baseController;
        this.d = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TopicsController) this.c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.b);
                break;
            case 1:
                ((TranslateController) this.c).lambda$setDialogTranslateTo$0(this.b, (String) this.d);
                break;
            default:
                ((TranslateController) this.c).lambda$invalidateTranslation$9((MessageObject) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ tk(TranslateController translateController, long j10, String str) {
        this.a = 1;
        this.c = translateController;
        this.b = j10;
        this.d = str;
    }
}
