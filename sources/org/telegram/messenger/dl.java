package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class dl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dl(Object obj, Serializable serializable, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((TranslateController) this.b).lambda$checkDialogMessageSure$10((ArrayList) this.c, (ArrayList) this.d);
                break;
            case 1:
                Utilities.lambda$raceCallbacks$1((int[]) this.b, (Utilities.Callback[]) this.c, (Runnable) this.d);
                break;
            default:
                WearAuthListenerService.lambda$onMessageReceived$0((String) this.b, (String) this.c, (byte[]) this.d);
                break;
        }
    }
}
