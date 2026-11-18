package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ m3(t3 t3Var, int i7) {
        this.a = i7;
        this.b = t3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final t3 t3Var = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.n3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                t3 t3Var2 = t3Var;
                                t3Var2.N = elapsedRealtime;
                                t3Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    mp.u1(t3Var2.C.a).f4(groupparticipants.users, false);
                                    mp.u1(t3Var2.C.a).Z3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = t3Var2.b;
                                    int i11 = groupCall.participants_count;
                                    int i12 = groupparticipants.count;
                                    if (i11 != i12) {
                                        groupCall.participants_count = i12;
                                        if (s2.a) {
                                            i5.c.t(t3Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        ks.f(t3Var2.C.a).k(ks.w2, Long.valueOf(t3Var2.c), Long.valueOf(t3Var2.b.id), Boolean.FALSE);
                                        break;
                                    }
                                }
                                break;
                            default:
                                t3 t3Var3 = t3Var;
                                t3Var3.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    t3Var3.b = groupcall.call;
                                    mp.u1(t3Var3.C.a).f4(groupcall.users, false);
                                    mp.u1(t3Var3.C.a).Z3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    t3Var3.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                t3 t3Var2 = this.b;
                t3Var2.getClass();
                if (tLObject != null) {
                    mp.u1(t3Var2.C.a).V3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 2:
                t3 t3Var3 = this.b;
                t3Var3.getClass();
                if (tLObject != null) {
                    mp.u1(t3Var3.C.a).V3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                final t3 t3Var4 = this.b;
                t3Var4.getClass();
                final int i10 = 1;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.n3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                t3 t3Var22 = t3Var4;
                                t3Var22.N = elapsedRealtime;
                                t3Var22.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    mp.u1(t3Var22.C.a).f4(groupparticipants.users, false);
                                    mp.u1(t3Var22.C.a).Z3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = t3Var22.b;
                                    int i11 = groupCall.participants_count;
                                    int i12 = groupparticipants.count;
                                    if (i11 != i12) {
                                        groupCall.participants_count = i12;
                                        if (s2.a) {
                                            i5.c.t(t3Var22.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        ks.f(t3Var22.C.a).k(ks.w2, Long.valueOf(t3Var22.c), Long.valueOf(t3Var22.b.id), Boolean.FALSE);
                                        break;
                                    }
                                }
                                break;
                            default:
                                t3 t3Var32 = t3Var4;
                                t3Var32.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    t3Var32.b = groupcall.call;
                                    mp.u1(t3Var32.C.a).f4(groupcall.users, false);
                                    mp.u1(t3Var32.C.a).Z3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    t3Var32.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
