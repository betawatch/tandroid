package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gb1 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public final String a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final String m;
    public String n;
    public String o;
    public long p;
    public TLRPC.TL_messageMediaWidget q;
    public String r;
    public nb1 s;
    public bn0 t;
    public bn0 v;
    public int w;
    public long x;
    public boolean y;
    public boolean z;
    public final ArrayList u = new ArrayList();
    public final t51 F = new t51(this, 11);

    public gb1(String str, int i10, long j10, int i11, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        this.a = str;
        this.b = i10;
        this.c = j10;
        this.d = i11;
        boolean z11 = false;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f = Math.max(0, tL_messageMediaWidget.height);
        this.g = tL_messageMediaWidget.payload;
        this.k = z10;
        boolean z12 = !z10 && tL_messageMediaWidget.is_copy;
        this.h = z12;
        this.i = !z10 && tL_messageMediaWidget.can_query;
        if (!z10 && tL_messageMediaWidget.background_query) {
            z11 = true;
        }
        this.j = z11;
        this.l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z12) {
            if (DialogObject.isUserDialog(j10)) {
                str2 = "private";
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (chat != null) {
                    str2 = !ChatObject.isChannel(chat) ? "group" : chat.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.m = str2;
        this.q = tL_messageMediaWidget;
        this.n = jb1.w(tL_messageMediaWidget.chat_data);
        this.o = jb1.w(tL_messageMediaWidget.public_data);
        this.p = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        return this.b + "/" + this.c + "/" + this.d;
    }
}
