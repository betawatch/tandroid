package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class vk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ BaseController c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vk(BaseController baseController, Object obj, long j3, int i10) {
        this.a = i10;
        this.c = baseController;
        this.d = obj;
        this.b = j3;
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

    public /* synthetic */ vk(TranslateController translateController, long j3, String str) {
        this.a = 1;
        this.c = translateController;
        this.b = j3;
        this.d = str;
    }
}
