package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ TLObject u;

    public /* synthetic */ sk(hp hpVar, int i3, int i10, int i11, int i12, int i13, long j10, long j11, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.a = 1;
        this.b = hpVar;
        this.c = i3;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.g = i13;
        this.h = j10;
        this.i = j11;
        this.j = i14;
        this.k = i15;
        this.l = i16;
        this.m = i17;
        this.n = i18;
        this.o = j12;
        this.p = i19;
        this.q = z10;
        this.r = i20;
        this.s = z11;
        this.t = z12;
        this.u = tL_messages_getReplies;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.u;
                hp hpVar = this.b;
                int i13 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j10 = this.h;
                    hpVar.e4(arrayList, j10);
                    int size = messages_messages.messages.size();
                    int i14 = this.c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.e;
                    if (i15 == 0 || messages_messages.messages.isEmpty()) {
                        i3 = this.d;
                    } else {
                        i3 = ((TLRPC.Message) k2.p1.h(1, messages_messages.messages)).id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i3 = message.id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    }
                    hpVar.K3(messages_messages, messages_messages.messages.size(), j10, this.i, i14, i3, i15, false, i13, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    break;
                } else {
                    g0.h3(new vf(hpVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 13));
                    break;
                }
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.u;
                hp hpVar2 = this.b;
                int i16 = this.j;
                if (tLObject == null) {
                    g0.h3(new vf(hpVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 9));
                    break;
                } else {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i17 = this.c;
                    if (size3 > i17) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i18 = this.d;
                    int i19 = this.e;
                    int i20 = this.g;
                    if (!isEmpty) {
                        if (i19 == 0) {
                            int i21 = this.f;
                            if (i21 != 0 && i20 == 2 && i18 > 0) {
                                for (int size4 = messages_messages2.messages.size() - 1; size4 >= 0; size4--) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    int i22 = message2.id;
                                    if (i22 > i21 && !message2.out) {
                                        i11 = i18;
                                        i10 = i22;
                                        hpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i17, i11, i19, false, i16, i10, this.k, this.l, this.m, i20, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                                        break;
                                    }
                                }
                            }
                        } else {
                            i18 = ((TLRPC.Message) k2.p1.h(1, messages_messages2.messages)).id;
                            int size5 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    if (message3.date > i19) {
                                        i18 = message3.id;
                                    } else {
                                        size5--;
                                    }
                                }
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i18;
                    hpVar2.K3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i17, i11, i19, false, i16, i10, this.k, this.l, this.m, i20, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                }
                break;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.u;
                hp hpVar3 = this.b;
                int i23 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j11 = this.h;
                    hpVar3.e4(arrayList2, j11);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.e;
                    if (i25 == 0 || messages_messages3.messages.isEmpty()) {
                        i12 = this.d;
                    } else {
                        i12 = ((TLRPC.Message) k2.p1.h(1, messages_messages3.messages)).id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i25) {
                                    i12 = message4.id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    }
                    hpVar3.K3(messages_messages3, messages_messages3.messages.size(), j11, this.i, i24, i12, i25, false, i23, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    break;
                } else {
                    g0.h3(new vf(hpVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 11));
                    break;
                }
        }
    }

    public /* synthetic */ sk(hp hpVar, long j10, int i3, int i10, int i11, long j11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.a = i21;
        this.b = hpVar;
        this.h = j10;
        this.c = i3;
        this.d = i10;
        this.e = i11;
        this.i = j11;
        this.f = i12;
        this.g = i13;
        this.j = i14;
        this.k = i15;
        this.l = i16;
        this.m = i17;
        this.n = i18;
        this.o = j12;
        this.p = i19;
        this.q = z10;
        this.r = i20;
        this.s = z11;
        this.t = z12;
        this.u = tLObject;
    }
}
