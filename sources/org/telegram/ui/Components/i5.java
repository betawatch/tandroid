package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ i5(k5 k5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.a = i7;
        this.b = k5Var;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new i5(this.b, this.c, this.d, 1));
                break;
            default:
                k5 k5Var = this.b;
                k5Var.d(this.c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(k5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.u7(11, k5Var, arrayList));
                    break;
                }
                break;
        }
    }
}
