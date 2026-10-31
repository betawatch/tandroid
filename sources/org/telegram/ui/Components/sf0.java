package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sf0 {
    public int a;
    public ArrayList b;
    public String c;
    public final byte[] d;
    public boolean e;
    public int f = 10;

    public sf0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
        this.a = tL_messages_votesList.count;
        this.b = tL_messages_votesList.votes;
        this.c = tL_messages_votesList.next_offset;
        this.d = bArr;
    }

    public final int a() {
        if (this.b.size() <= 15) {
            return 0;
        }
        return this.e ? 1 : 2;
    }

    public final int b() {
        return this.e ? Math.min(this.f, this.b.size()) : this.b.size();
    }
}
