package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((FactCheckController) this.c).lambda$loadMissing$3(this.b, (ArrayList) this.d, (HashMap) this.e, (ArrayList) obj);
                break;
            case 1:
                ((MessagesController) this.c).lambda$checkSensitive$451(this.b, (boolean[]) this.d, (Runnable) this.e, (Boolean) obj);
                break;
            default:
                ((TranslateController) this.c).lambda$checkTranslation$6((MessageObject) this.d, (String) this.e, this.b, (TLRPC.TL_textWithEntities) obj);
                break;
        }
    }

    public /* synthetic */ h2(TranslateController translateController, MessageObject messageObject, String str, long j10) {
        this.a = 2;
        this.c = translateController;
        this.d = messageObject;
        this.e = str;
        this.b = j10;
    }
}
