package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ c5(e5 e5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.a = i7;
        this.b = e5Var;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new c5(this.b, this.c, this.d, 1));
                break;
            default:
                e5 e5Var = this.b;
                e5Var.d(this.c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(e5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ld(9, e5Var, arrayList));
                    break;
                }
                break;
        }
    }
}
