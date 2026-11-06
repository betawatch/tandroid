package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ k3(r3 r3Var, int i7) {
        this.a = i7;
        this.b = r3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final r3 r3Var = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                r3 r3Var2 = r3Var;
                                r3Var2.N = elapsedRealtime;
                                r3Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    qp.s1(r3Var2.C.a).Y3(groupparticipants.users, false);
                                    qp.s1(r3Var2.C.a).S3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = r3Var2.b;
                                    int i11 = groupCall.participants_count;
                                    int i12 = groupparticipants.count;
                                    if (i11 != i12) {
                                        groupCall.participants_count = i12;
                                        if (r2.a) {
                                            jg.g.s(r3Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        qs.f(r3Var2.C.a).k(qs.w2, Long.valueOf(r3Var2.c), Long.valueOf(r3Var2.b.id), Boolean.FALSE);
                                        break;
                                    }
                                }
                                break;
                            default:
                                r3 r3Var3 = r3Var;
                                r3Var3.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    r3Var3.b = groupcall.call;
                                    qp.s1(r3Var3.C.a).Y3(groupcall.users, false);
                                    qp.s1(r3Var3.C.a).S3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    r3Var3.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                r3 r3Var2 = this.b;
                r3Var2.getClass();
                if (tLObject != null) {
                    qp.s1(r3Var2.C.a).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            case 2:
                r3 r3Var3 = this.b;
                r3Var3.getClass();
                if (tLObject != null) {
                    qp.s1(r3Var3.C.a).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
            default:
                final r3 r3Var4 = this.b;
                r3Var4.getClass();
                final int i10 = 1;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                r3 r3Var22 = r3Var4;
                                r3Var22.N = elapsedRealtime;
                                r3Var22.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    qp.s1(r3Var22.C.a).Y3(groupparticipants.users, false);
                                    qp.s1(r3Var22.C.a).S3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = r3Var22.b;
                                    int i11 = groupCall.participants_count;
                                    int i12 = groupparticipants.count;
                                    if (i11 != i12) {
                                        groupCall.participants_count = i12;
                                        if (r2.a) {
                                            jg.g.s(r3Var22.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        qs.f(r3Var22.C.a).k(qs.w2, Long.valueOf(r3Var22.c), Long.valueOf(r3Var22.b.id), Boolean.FALSE);
                                        break;
                                    }
                                }
                                break;
                            default:
                                r3 r3Var32 = r3Var4;
                                r3Var32.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    r3Var32.b = groupcall.call;
                                    qp.s1(r3Var32.C.a).Y3(groupcall.users, false);
                                    qp.s1(r3Var32.C.a).S3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    r3Var32.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
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
