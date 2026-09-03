package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wg0 {
    public int a;
    public ArrayList b;
    public String c;
    public final byte[] d;
    public boolean e;
    public int f = 10;

    public wg0(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
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
