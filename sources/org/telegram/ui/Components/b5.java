package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ b5(c5 c5Var, ArrayList arrayList, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = c5Var;
        this.c = arrayList;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new b5(this.b, this.c, this.d, 1));
                break;
            default:
                c5 c5Var = this.b;
                int i7 = c5Var.e;
                HashSet hashSet = new HashSet(this.c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    org.telegram.messenger.vr.a0(i7).a.c(new z4(c5Var, arrayList, 1));
                    c5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.v7(11, c5Var, arrayList2));
                        break;
                    }
                }
                break;
        }
    }
}
