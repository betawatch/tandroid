package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ m3(u3 u3Var, int i10) {
        this.a = i10;
        this.b = u3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final u3 u3Var = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.n3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        switch (i11) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                u3 u3Var2 = u3Var;
                                u3Var2.N = elapsedRealtime;
                                u3Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    vp.r1(u3Var2.C.a).V3(groupparticipants.users, false);
                                    vp.r1(u3Var2.C.a).P3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = u3Var2.b;
                                    int i12 = groupCall.participants_count;
                                    int i13 = groupparticipants.count;
                                    if (i12 != i13) {
                                        groupCall.participants_count = i13;
                                        if (v2.a) {
                                            i0.a.p(u3Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        zs.f(u3Var2.C.a).k(zs.w2, Long.valueOf(u3Var2.c), Long.valueOf(u3Var2.b.id), Boolean.FALSE);
                                        break;
                                    }
                                }
                                break;
                            default:
                                u3 u3Var3 = u3Var;
                                u3Var3.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    u3Var3.b = groupcall.call;
                                    vp.r1(u3Var3.C.a).V3(groupcall.users, false);
                                    vp.r1(u3Var3.C.a).P3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    u3Var3.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                u3 u3Var2 = this.b;
                u3Var2.getClass();
                if (tLObject != null) {
                    vp.r1(u3Var2.C.a).L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 2:
                u3 u3Var3 = this.b;
                u3Var3.getClass();
                if (tLObject != null) {
                    vp.r1(u3Var3.C.a).L3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                final u3 u3Var4 = this.b;
                u3Var4.getClass();
                final int i11 = 1;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.n3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                u3 u3Var22 = u3Var4;
                                u3Var22.N = elapsedRealtime;
                                u3Var22.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    vp.r1(u3Var22.C.a).V3(groupparticipants.users, false);
                                    vp.r1(u3Var22.C.a).P3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = u3Var22.b;
                                    int i12 = groupCall.participants_count;
                                    int i13 = groupparticipants.count;
                                    if (i12 != i13) {
                                        groupCall.participants_count = i13;
                                        if (v2.a) {
                                            i0.a.p(u3Var22.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        zs.f(u3Var22.C.a).k(zs.w2, Long.valueOf(u3Var22.c), Long.valueOf(u3Var22.b.id), Boolean.FALSE);
                                        break;
                                    }
                                }
                                break;
                            default:
                                u3 u3Var32 = u3Var4;
                                u3Var32.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    u3Var32.b = groupcall.call;
                                    vp.r1(u3Var32.C.a).V3(groupcall.users, false);
                                    vp.r1(u3Var32.C.a).P3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    u3Var32.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
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
