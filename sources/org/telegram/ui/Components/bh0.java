package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class bh0 {
    public int a;
    public ArrayList b;
    public String c;
    public final byte[] d;
    public boolean e;
    public int f = 10;

    public bh0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
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
