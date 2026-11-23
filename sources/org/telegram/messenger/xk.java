package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class xk implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
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

    public /* synthetic */ xk(np npVar, int i7, int i10, int i11, int i12, int i13, long j3, long j10, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.a = 1;
        this.b = npVar;
        this.c = i7;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.g = i13;
        this.h = j3;
        this.i = j10;
        this.j = i14;
        this.k = i15;
        this.l = i16;
        this.m = i17;
        this.n = i18;
        this.o = j11;
        this.p = i19;
        this.q = z10;
        this.r = i20;
        this.s = z11;
        this.t = z12;
        this.u = tL_messages_getReplies;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.u;
                np npVar = this.b;
                int i13 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j3 = this.h;
                    npVar.m4(arrayList, j3);
                    int size = messages_messages.messages.size();
                    int i14 = this.c;
                    if (size > i14) {
                        messages_messages.messages.remove(0);
                    }
                    int i15 = this.e;
                    if (i15 == 0 || messages_messages.messages.isEmpty()) {
                        i7 = this.d;
                    } else {
                        i7 = ((TLRPC.Message) i5.c.h(1, messages_messages.messages)).id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i15) {
                                    i7 = message.id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    }
                    npVar.R3(messages_messages, messages_messages.messages.size(), j3, this.i, i14, i7, i15, false, i13, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    break;
                } else {
                    g0.g3(new eg(npVar, i13, (TLObject) tL_messages_getSavedHistory, tL_error, 9));
                    break;
                }
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.u;
                np npVar2 = this.b;
                int i16 = this.j;
                if (tLObject == null) {
                    g0.g3(new eg(npVar2, i16, (TLObject) tL_messages_getReplies, tL_error, 12));
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
                                        npVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i17, i11, i19, false, i16, i10, this.k, this.l, this.m, i20, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                                        break;
                                    }
                                }
                            }
                        } else {
                            i18 = ((TLRPC.Message) i5.c.h(1, messages_messages2.messages)).id;
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
                    npVar2.R3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i17, i11, i19, false, i16, i10, this.k, this.l, this.m, i20, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                }
                break;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.u;
                np npVar3 = this.b;
                int i23 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j10 = this.h;
                    npVar3.m4(arrayList2, j10);
                    int size6 = messages_messages3.messages.size();
                    int i24 = this.c;
                    if (size6 > i24) {
                        messages_messages3.messages.remove(0);
                    }
                    int i25 = this.e;
                    if (i25 == 0 || messages_messages3.messages.isEmpty()) {
                        i12 = this.d;
                    } else {
                        i12 = ((TLRPC.Message) i5.c.h(1, messages_messages3.messages)).id;
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
                    npVar3.R3(messages_messages3, messages_messages3.messages.size(), j10, this.i, i24, i12, i25, false, i23, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    break;
                } else {
                    g0.g3(new eg(npVar3, i23, (TLObject) tL_messages_getHistory, tL_error, 8));
                    break;
                }
        }
    }

    public /* synthetic */ xk(np npVar, long j3, int i7, int i10, int i11, long j10, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11, int i19, boolean z10, int i20, boolean z11, boolean z12, TLObject tLObject, int i21) {
        this.a = i21;
        this.b = npVar;
        this.h = j3;
        this.c = i7;
        this.d = i10;
        this.e = i11;
        this.i = j10;
        this.f = i12;
        this.g = i13;
        this.j = i14;
        this.k = i15;
        this.l = i16;
        this.m = i17;
        this.n = i18;
        this.o = j11;
        this.p = i19;
        this.q = z10;
        this.r = i20;
        this.s = z11;
        this.t = z12;
        this.u = tLObject;
    }
}
