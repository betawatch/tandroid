// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class e87 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
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

    public /* synthetic */ e87(oc7 oc7Var, long j, int i, int i2, int i3, long j2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLObject tLObject, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.h = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.i = j2;
        this.f = i4;
        this.g = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = j3;
        this.p = i11;
        this.q = z;
        this.r = i12;
        this.s = z2;
        this.t = z3;
        this.u = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        int i2;
        byte b = this.a;
        TLObject tLObject2 = this.u;
        int i3 = this.d;
        switch (b) {
            case 0:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) tLObject2;
                oc7 oc7Var = this.b;
                int i4 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                    long j = this.h;
                    oc7Var.j4(arrayList, j);
                    int size = messages_messages.messages.size();
                    int i5 = this.c;
                    if (size > i5) {
                        messages_messages.messages.remove(0);
                    }
                    int i6 = this.e;
                    if (i6 != 0 && !messages_messages.messages.isEmpty()) {
                        i3 = ((TLRPC.Message) b10.f(1, messages_messages.messages)).id;
                        int size2 = messages_messages.messages.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                TLRPC.Message message = messages_messages.messages.get(size2);
                                if (message.date > i6) {
                                    i3 = message.id;
                                } else {
                                    size2--;
                                }
                            }
                        }
                    }
                    oc7Var.P3(messages_messages, messages_messages.messages.size(), j, this.i, i5, i3, i6, false, i4, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    break;
                } else {
                    gm.c3(new v36(oc7Var, i4, tL_messages_getSavedHistory, tL_error, (byte) 6));
                    break;
                }
            case 1:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) tLObject2;
                oc7 oc7Var2 = this.b;
                int i7 = this.j;
                if (tLObject == null) {
                    gm.c3(new v36(oc7Var2, i7, tL_messages_getReplies, tL_error, (byte) 7));
                    break;
                } else {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                    int size3 = messages_messages2.messages.size();
                    int i8 = this.c;
                    if (size3 > i8) {
                        messages_messages2.messages.remove(0);
                    }
                    boolean isEmpty = messages_messages2.messages.isEmpty();
                    int i9 = this.e;
                    int i10 = this.g;
                    if (!isEmpty) {
                        if (i9 == 0) {
                            int i11 = this.f;
                            if (i11 != 0 && i10 == 2 && i3 > 0) {
                                for (int size4 = messages_messages2.messages.size() - 1; size4 >= 0; size4--) {
                                    TLRPC.Message message2 = messages_messages2.messages.get(size4);
                                    int i12 = message2.id;
                                    if (i12 > i11 && !message2.out) {
                                        i2 = i3;
                                        i = i12;
                                        oc7Var2.P3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i8, i2, i9, false, i7, i, this.k, this.l, this.m, i10, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                                        break;
                                    }
                                }
                            }
                        } else {
                            int i13 = ((TLRPC.Message) b10.f(1, messages_messages2.messages)).id;
                            int size5 = messages_messages2.messages.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    TLRPC.Message message3 = messages_messages2.messages.get(size5);
                                    if (message3.date > i9) {
                                        i3 = message3.id;
                                    } else {
                                        size5--;
                                    }
                                } else {
                                    i3 = i13;
                                }
                            }
                        }
                    }
                    i = 0;
                    i2 = i3;
                    oc7Var2.P3(messages_messages2, messages_messages2.messages.size(), this.h, this.i, i8, i2, i9, false, i7, i, this.k, this.l, this.m, i10, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                }
                break;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) tLObject2;
                oc7 oc7Var3 = this.b;
                int i14 = this.f;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    ArrayList<TLRPC.Message> arrayList2 = messages_messages3.messages;
                    long j2 = this.h;
                    oc7Var3.j4(arrayList2, j2);
                    int size6 = messages_messages3.messages.size();
                    int i15 = this.c;
                    if (size6 > i15) {
                        messages_messages3.messages.remove(0);
                    }
                    int i16 = this.e;
                    if (i16 != 0 && !messages_messages3.messages.isEmpty()) {
                        i3 = ((TLRPC.Message) b10.f(1, messages_messages3.messages)).id;
                        int size7 = messages_messages3.messages.size() - 1;
                        while (true) {
                            if (size7 >= 0) {
                                TLRPC.Message message4 = messages_messages3.messages.get(size7);
                                if (message4.date > i16) {
                                    i3 = message4.id;
                                } else {
                                    size7--;
                                }
                            }
                        }
                    }
                    oc7Var3.P3(messages_messages3, messages_messages3.messages.size(), j2, this.i, i15, i3, i16, false, i14, this.g, this.j, this.k, this.l, this.m, false, this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
                    break;
                } else {
                    gm.c3(new v36(oc7Var3, i14, tL_messages_getHistory, tL_error, (byte) 8));
                    break;
                }
        }
    }

    public /* synthetic */ e87(oc7 oc7Var, int i, int i2, int i3, int i4, int i5, long j, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.a = (byte) 1;
        this.b = oc7Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = j;
        this.i = j2;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = j3;
        this.p = i11;
        this.q = z;
        this.r = i12;
        this.s = z2;
        this.t = z3;
        this.u = tL_messages_getReplies;
    }
}
