package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ z4(b5 b5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.a = i10;
        this.b = b5Var;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new z4(this.b, this.c, this.d, 1));
                break;
            default:
                b5 b5Var = this.b;
                b5Var.d(this.c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(b5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new ag.k0(23, b5Var, arrayList));
                    break;
                }
                break;
        }
    }
}
