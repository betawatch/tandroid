package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class qo {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public int f;
    public int g;

    public qo(int i7, long j3) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = -1;
        this.a = i7;
        this.b = j3;
        if (this.c || this.d) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.c = true;
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        tL_messages_getCommonChats.user_id = np.s1(i7).o1(j3);
        tL_messages_getCommonChats.max_id = arrayList.isEmpty() ? 0L : ((TLRPC.Chat) i5.c.h(1, arrayList)).id;
        tL_messages_getCommonChats.limit = isEmpty ? 15 : 30;
        int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCommonChats, new n3(this, r7, isEmpty, 4));
        this.f = sendRequest;
        int[] iArr = {sendRequest};
    }
}
