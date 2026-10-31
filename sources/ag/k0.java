package ag;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.w7;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.df;
import org.telegram.ui.fp;
import org.telegram.ui.ho;
import org.telegram.ui.iq;
import org.telegram.ui.le;
import org.telegram.ui.oo;
import org.telegram.ui.qp;
import org.telegram.ui.un;
import org.telegram.ui.xc;
import org.telegram.ui.zg;
import org.telegram.ui.zl;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Boolean] */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new a3.l0((s0) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 3));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new a1.f(8, (j1) this.b, (qq) this.c));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new a3.l0((n3) this.b, tLObject, (SharedPreferences) this.c, 8));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new q0((jg.v2) this.b, tLObject, (jg.t2) this.c, tL_error, 6));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new li.s(tLObject, (vp) this.b, (mg.s1) this.c, 6));
                break;
            case 5:
                vp vpVar = (vp) this.b;
                vg vgVar = (vg) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    vpVar.V3(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !h20.x(user) && !h20.A(user.id)) {
                            arrayList3.add(user);
                        }
                    }
                    org.telegram.messenger.i0.g3(new k2.u(26, vgVar, arrayList3));
                    break;
                }
                break;
            case 6:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 7:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 8:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 9:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((org.telegram.messenger.c) this.c, tLObject, tL_error);
                break;
            case 10:
                o6 o6Var = (o6) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    String str = null;
                    ArrayList arrayList5 = null;
                    int i11 = 0;
                    while (true) {
                        boolean z10 = true;
                        if (i11 >= size) {
                            org.telegram.messenger.i0.g3(new j0(o6Var, arrayList5, z10, 10));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i11);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    b8.G(d20.s0);
                                    File K = b8.K(tL_wallPaper.document, str, true, true);
                                    int size2 = arrayList4.size();
                                    String str2 = str;
                                    ?? r14 = str2;
                                    int i12 = 0;
                                    ?? r13 = str2;
                                    while (i12 < size2) {
                                        r6 r6Var = (r6) arrayList4.get(i12);
                                        if (r6Var.o.equals(tL_wallPaper.slug)) {
                                            if (r14 == null) {
                                                r14 = Boolean.valueOf(K.exists());
                                            }
                                            if (r13 != 0 || r14.booleanValue()) {
                                                arrayList2 = arrayList4;
                                                r13 = o6.b(r13, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), K, r6Var);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                }
                                                arrayList5.add(r6Var);
                                            } else {
                                                String r10 = b8.r(null, tL_wallPaper.document);
                                                if (o6Var.b == null) {
                                                    o6Var.b = new HashMap();
                                                }
                                                n6 n6Var = (n6) o6Var.b.get(r10);
                                                if (n6Var == null) {
                                                    n6Var = new n6();
                                                    arrayList2 = arrayList4;
                                                    n6Var.b = new ArrayList();
                                                    n6Var.a = tL_wallPaper;
                                                    o6Var.b.put(r10, n6Var);
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                n6Var.b.add(r6Var);
                                            }
                                        } else {
                                            arrayList2 = arrayList4;
                                        }
                                        i12++;
                                        arrayList4 = arrayList2;
                                        r13 = r13;
                                    }
                                    arrayList = arrayList4;
                                    if (r13 != 0) {
                                        r13.recycle();
                                    }
                                    i11++;
                                    arrayList4 = arrayList;
                                    str = null;
                                }
                            }
                            arrayList = arrayList4;
                            i11++;
                            arrayList4 = arrayList;
                            str = null;
                        }
                    }
                }
                break;
            case 11:
                org.telegram.messenger.i0.g3(new li.s((s6) this.b, tLObject, (s6) this.c, 21));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new q0(this.b, (Object) tL_error, tLObject, this.c, 22));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new org.telegram.ui.p1((xc) this.b, tLObject, (s6) this.c, 10));
                break;
            case 14:
                org.telegram.messenger.i0.g3(new org.telegram.ui.p1((le) this.b, tLObject, (Context) this.c, 13));
                break;
            case 15:
                un unVar = (un) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    org.telegram.messenger.i0.g3(new df(unVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 6));
                    break;
                }
                break;
            case 16:
                org.telegram.messenger.i0.g3(new org.telegram.ui.p1((un) this.b, tLObject, (TLRPC.User) this.c, 21));
                break;
            case 17:
                org.telegram.messenger.i0.g3(new q0(this.b, (Object) tLObject, (Object) tL_error, this.c, 28));
                break;
            case 18:
                un unVar2 = (un) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error == null) {
                    unVar2.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(new zg(3, unVar2, tL_messages_sendScheduledMessages));
                    break;
                } else if (tL_error.text != null) {
                    org.telegram.messenger.i0.g3(new zg(4, unVar2, tL_error));
                    break;
                }
                break;
            case 19:
                org.telegram.messenger.i0.g3(new org.telegram.ui.p1((zl) this.b, tLObject, (jj) this.c, 23));
                break;
            case 20:
                oo ooVar = (oo) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = ooVar.D0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    ooVar.getMessagesStorage().j2(ooVar.D0, false);
                }
                org.telegram.messenger.i0.g3(new ho(ooVar, 2));
                break;
            case 21:
                org.telegram.messenger.i0.g3(new zg(16, (qp) this.b, (org.telegram.ui.ActionBar.x1[]) this.c));
                break;
            case 22:
                org.telegram.messenger.i0.g3(new fp((iq) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, 1));
                break;
            case 23:
                b5 b5Var = (b5) this.b;
                zs.f(b5Var.e).d(new a5(b5Var, (ArrayList) this.c, tLObject, 0));
                break;
            case 24:
                org.telegram.messenger.i0.g3(new li.s((w7) this.b, (org.telegram.ui.ActionBar.x1) this.c, tLObject, 26));
                break;
            case 25:
                org.telegram.messenger.i0.g3(new cd(9, (bi) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 26:
                org.telegram.messenger.i0.g3(new cd(8, (bi) this.b, (vh) this.c));
                break;
            case 27:
                org.telegram.messenger.i0.g3(new jg((bp) this.b, tLObject, (s6) this.c, 2));
                break;
            case 28:
                org.telegram.messenger.i0.g3(new at(12, (j00) this.b, (Pair) this.c));
                break;
            default:
                org.telegram.messenger.i0.g3(new fp(this.b, (Object) tL_error, (Object) tLObject, this.c, 11));
                break;
        }
    }
}
