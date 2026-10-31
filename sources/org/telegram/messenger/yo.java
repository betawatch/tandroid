package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class yo {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public int f;
    public int g;

    public yo(int i10, long j10) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = -1;
        this.a = i10;
        this.b = j10;
        if (this.c || this.d) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.c = true;
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        tL_messages_getCommonChats.user_id = vp.r1(i10).n1(j10);
        tL_messages_getCommonChats.max_id = arrayList.isEmpty() ? 0L : ((TLRPC.Chat) i0.a.g(1, arrayList)).id;
        tL_messages_getCommonChats.limit = isEmpty ? 15 : 30;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCommonChats, new q3(this, r7, isEmpty, 4));
        this.f = sendRequest;
        int[] iArr = {sendRequest};
    }
}
