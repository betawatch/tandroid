package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fl implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
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

    public /* synthetic */ fl(vp vpVar, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.a = 1;
        this.b = vpVar;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = i14;
        this.h = j10;
        this.i = j11;
        this.j = i15;
        this.k = i16;
        this.l = i17;
        this.m = i18;
        this.n = i19;
        this.o = j12;
        this.p = i20;
        this.q = z10;
        this.r = i21;
        this.s = z11;
        this.t = z12;
        this.u = tL_messages_getReplies;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.u;
                vp vpVar = this.b;
                int i14 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j10 = this.h;
                    vpVar.b4(arrayList, j10);
                    int size = messages_messages.messages.size();
                    int i15 = this.c;
                    if (size > i15) {
                        messages_messages.messages.remove(0);
                    }
                    int i16 = this.e;
                    if (i16 == 0 || messages_messages.messages.isEmpty()) {
                        i10 = this.d;
                    } else {
                        i10 = ((TLRPC.Message) i0.a.g(1, messages_messages.messages)).id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i16) {
                                    i10 = message.id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    }
                    vpVar.H3(messages_messages, messages_messages.messages.size(), j10, this.i, i15, i10, i16, false, i14, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    break;
                } else {
                    i0.g3(new cg(vpVar, i14, (TLObject) tL_messages_getSavedHistory, tL_error, 11));
                    break;
                }
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.u;
                vp vpVar2 = this.b;
                int i17 = this.j;
                if (tLObject == null) {
                    i0.g3(new cg(vpVar2, i17, (TLObject) tL_messages_getReplies, tL_error, 13));
                    break;
                } else {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i18 = this.c;
                    if (size3 > i18) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i19 = this.d;
                    int i20 = this.e;
                    int i21 = this.g;
                    if (!isEmpty) {
                        if (i20 == 0) {
                            int i22 = this.f;
                            if (i22 != 0 && i21 == 2 && i19 > 0) {
                                for (int size4 = messages_messages2.messages.size() - 1; size4 >= 0; size4--) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    int i23 = message2.id;
                                    if (i23 > i22 && !message2.out) {
                                        i12 = i19;
                                        i11 = i23;
                                        vpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i18, i12, i20, false, i17, i11, this.k, this.l, this.m, i21, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                                        break;
                                    }
                                }
                            }
                        } else {
                            i19 = ((TLRPC.Message) i0.a.g(1, messages_messages2.messages)).id;
                            int size5 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    if (message3.date > i20) {
                                        i19 = message3.id;
                                    } else {
                                        size5--;
                                    }
                                }
                            }
                        }
                    }
                    i11 = 0;
                    i12 = i19;
                    vpVar2.H3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i18, i12, i20, false, i17, i11, this.k, this.l, this.m, i21, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                }
                break;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.u;
                vp vpVar3 = this.b;
                int i24 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j11 = this.h;
                    vpVar3.b4(arrayList2, j11);
                    int size6 = messages_messages3.messages.size();
                    int i25 = this.c;
                    if (size6 > i25) {
                        messages_messages3.messages.remove(0);
                    }
                    int i26 = this.e;
                    if (i26 == 0 || messages_messages3.messages.isEmpty()) {
                        i13 = this.d;
                    } else {
                        i13 = ((TLRPC.Message) i0.a.g(1, messages_messages3.messages)).id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i26) {
                                    i13 = message4.id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    }
                    vpVar3.H3(messages_messages3, messages_messages3.messages.size(), j11, this.i, i25, i13, i26, false, i24, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    break;
                } else {
                    i0.g3(new cg(vpVar3, i24, (TLObject) tL_messages_getHistory, tL_error, 10));
                    break;
                }
        }
    }

    public /* synthetic */ fl(vp vpVar, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.a = i22;
        this.b = vpVar;
        this.h = j10;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.i = j11;
        this.f = i13;
        this.g = i14;
        this.j = i15;
        this.k = i16;
        this.l = i17;
        this.m = i18;
        this.n = i19;
        this.o = j12;
        this.p = i20;
        this.q = z10;
        this.r = i21;
        this.s = z11;
        this.t = z12;
        this.u = tLObject;
    }
}
