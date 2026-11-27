// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.media.metrics.LogSessionId;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lg(ls6 ls6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z) {
        this.a = (byte) 28;
        this.c = ls6Var;
        this.d = tLObject;
        this.e = str;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i;
        vnb vnbVar;
        nf9 nf9Var;
        boolean z;
        SQLitePreparedStatement executeFast;
        int i2;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList2;
        int i3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        byte b = 6;
        byte b2 = 15;
        int i4 = 2;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r12 = null;
        String str = null;
        int i5 = 1;
        int i6 = 0;
        switch (this.a) {
            case 0:
                boolean z2 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z2 && xc2.T(chat)) {
                    View c = alertDialog$Builder.a.c(-1);
                    if (c instanceof TextView) {
                        TextView textView = (TextView) c;
                        if (zArr[0]) {
                            textView.setText(ob6.M0(xc2.V(chat) ? 2131752396 : 2131751495, null));
                            return;
                        }
                        if (chat.monoforum) {
                            textView.setText(ob6.M0(2131748749, null));
                            return;
                        } else if (chat.megagroup) {
                            textView.setText(ob6.M0(2131748745, null));
                            return;
                        } else {
                            textView.setText(ob6.M0(2131748758, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                d31 d31Var = (d31) this.d;
                boolean z3 = this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                vnb vnbVar2 = (vnb) this.e;
                v21 I = d31Var.I(R.raw.star_premium_2, z3 ? ob6.M0(2131753474, "BoostingGiveawayCreated") : ob6.M0(2131753585, "BoostingAwardsCreated"), hl.N2(z3 ? ob6.M0(xc2.V(chat2) ? 2131753548 : 2131753547, null) : ob6.M0(xc2.V(chat2) ? 2131753550 : 2131753549, null), aob.xj, 0, new sm0(chat2), vnbVar2));
                I.j = 5000;
                I.j();
                return;
            case 2:
                b71 b71Var = (b71) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z4 = this.b;
                HashMap hashMap = b71Var.c;
                if (hashMap == null || (arrayList = (ArrayList) hashMap.get(pair)) == null) {
                    return;
                }
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    ((pcc) obj2).a(obj);
                }
                if (z4) {
                    arrayList.clear();
                    b71Var.c.remove(pair);
                    return;
                }
                return;
            case 3:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 4:
                zu1 zu1Var = (zu1) this.c;
                ynb ynbVar = (ynb) this.d;
                znb znbVar = (znb) this.e;
                boolean z5 = this.b;
                ynb i8 = znbVar.i(false);
                int i9 = ynbVar.a;
                UndoView undoView = zu1Var.N3;
                aob.I1(znbVar, false, i9, undoView != null ? undoView.getUndoButton() : null);
                if (z5) {
                    aob.j0(znbVar, i8, true);
                    return;
                }
                return;
            case 5:
                ((zu1) this.c).V8((String) this.d, (r47) this.e, this.b);
                return;
            case 6:
                ju1 ju1Var = (ju1) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z6 = this.b;
                r47 r47Var = (r47) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                zu1 zu1Var2 = ju1Var.a;
                qu6.s(null, null, 2131744047, new Object[]{zu1Var2.getMessagesController().A1(wf3.n(message.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                oj n = oj.n(message.suggested_post.price);
                int f = n.a == pj.b ? zu1Var2.getMessagesController().k4.g.f() : zu1Var2.getMessagesController().k4.d.f();
                if (z6) {
                    n = oj.j((n.b / 1000) * f, n.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z6) {
                        qu6.s(null, null, 2131744044, new Object[]{n.g(), cc.J0(f)}, spannableStringBuilder);
                    } else {
                        qu6.s(null, null, 2131744043, new Object[]{n.g()}, spannableStringBuilder);
                    }
                } else if (z6) {
                    qu6.s(null, null, 2131744045, new Object[]{n.g(), a77.G0(message.suggested_post.schedule_date), cc.J0(f)}, spannableStringBuilder);
                } else {
                    qu6.s(null, null, 2131744042, new Object[]{n.g(), a77.G0(message.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i = ((e) zu1Var2).currentAccount;
                qu6.s(null, null, 2131744046, new Object[]{Long.valueOf(uc7.s1(i).k4.h.g(TimeUnit.HOURS))}, spannableStringBuilder);
                v21[] v21VarArr = new v21[1];
                o1 o1Var = new o1(v21VarArr, (byte) 13);
                id[] idVarArr = new id[1];
                id s0 = jj.s0(zu1Var2, ob6.M0(2131744027, null), spannableStringBuilder, ob6.M0(message.suggested_post.schedule_date == 0 ? 2131747981 : 2131744026, null), false, new la7((Object) ju1Var, (Object) message, (Object) idVarArr, (Object) r47Var, (Object) o1Var, (byte) 19));
                idVarArr[0] = s0;
                s0.setOnDismissListener(o1Var);
                if (z6 && n.a == pj.a) {
                    n11 a = o11.a(zu1Var2.getParentActivity());
                    vnbVar = ((e) zu1Var2).resourceProvider;
                    v21 G = new d31(a, vnbVar).G(R.raw.info, 10, ob6.M0(2131744041, null));
                    G.j = 60000;
                    G.k(true);
                    v21VarArr[0] = G;
                    return;
                }
                return;
            case 7:
                xu1 xu1Var = (xu1) this.c;
                xu1Var.r((ez3) this.d, (TLRPC.WallPaper) this.e, this.b);
                xu1Var.o(xu1Var.h);
                nt1 nt1Var = xu1Var.G.m1;
                if (nt1Var == null || (nf9Var = nt1Var.M) == null) {
                    return;
                }
                nf9Var.invalidate();
                return;
            case 8:
                t32 t32Var = (t32) this.c;
                String str2 = (String) this.d;
                boolean z7 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                t32Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    hl.c3(new dy1(t32Var, new ArrayList(), b2));
                    return;
                }
                String S0 = ob6.D0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str = S0;
                }
                int i10 = (str != null ? 1 : 0) + 1;
                String[] strArr = new String[i10];
                strArr[0] = lowerCase;
                if (str != null) {
                    strArr[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z7) {
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        n32 n32Var = (n32) arrayList3.get(i11);
                        File file = n32Var.f;
                        if (file != null && !file.isDirectory()) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < i10) {
                                    String str3 = strArr[i12];
                                    String str4 = n32Var.b;
                                    if (str4 != null ? str4.toLowerCase().contains(str3) : false) {
                                        arrayList4.add(n32Var);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                }
                hl.c3(new dy1(t32Var, arrayList4, b2));
                return;
            case 9:
                v92 v92Var = (v92) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z8 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    v92Var.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = v92Var.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z8) {
                        if (v92Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(v92Var.getParentActivity());
                        alertDialog$Builder2.a.U = ob6.M0(2131745752, null);
                        alertDialog$Builder2.a.S = ob6.M0(2131745750, null);
                        alertDialog$Builder2.g(ob6.M0(2131747558, null), null);
                        v92Var.showDialog(alertDialog$Builder2.a);
                    }
                }
                i56 i56Var = v92Var.H;
                if (i56Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = v92Var.m0;
                    i56Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    v92Var.H.c(v92Var.m0, v92Var.a0);
                    return;
                }
                return;
            case 10:
                ja2 ja2Var = (ja2) this.d;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                boolean z9 = this.b;
                mw5 mw5Var = (mw5) this.e;
                chat3.join_to_send = z9;
                uc7 messagesController = ja2Var.y.d.getMessagesController();
                long j = chat3.id;
                ds6 ds6Var = new ds6(ja2Var, z9, chat3, b2);
                ea2 ea2Var = new ea2(ja2Var, mw5Var, (byte) 2);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.h1(j);
                tL_channels_toggleJoinToSend.enabled = z9;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new m65(messagesController, ds6Var, ea2Var, (byte) 22), 64);
                return;
            case 11:
                ja2 ja2Var2 = (ja2) this.d;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                boolean z10 = this.b;
                lw5 lw5Var = (lw5) this.e;
                chat4.join_request = z10;
                ja2Var2.y.d.getMessagesController().q5(chat4.id, 0L, z10, false, false, new ia2(ja2Var2, (byte) 0), new ea2(ja2Var2, lw5Var, (byte) 1));
                return;
            case 12:
                vc2 vc2Var = (vc2) this.c;
                boolean z11 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                vc2Var.u = false;
                if (z11) {
                    vc2Var.v = false;
                }
                if (tLObject2 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                    uc7.s1(vc2Var.C.a).j4(groupparticipants.users, false);
                    uc7.s1(vc2Var.C.a).c4(groupparticipants.chats, false);
                    vc2Var.n(groupparticipants.participants, z11, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 13:
                af2 af2Var = (af2) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                ResultCallback resultCallback = (ResultCallback) this.e;
                boolean z12 = this.b;
                af2Var.b = new ArrayList(arrayList5);
                resultCallback.onComplete(af2Var.d((z12 ? 1 : 0) | 2));
                return;
            case 14:
                lv2 lv2Var = (lv2) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                boolean z13 = this.b;
                String str5 = (String) this.e;
                int size2 = arrayList6.size();
                boolean z14 = false;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj3 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) lv2Var.g0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        lv2Var.f0.remove(tL_contact);
                        lv2Var.g0.remove(Long.valueOf(user.id));
                        z14 = true;
                    }
                }
                if (z14) {
                    lv2Var.d(false);
                }
                jn7 notificationCenter = lv2Var.getNotificationCenter();
                int i14 = uc7.r5;
                notificationCenter.k(2, 1);
                lv2Var.getNotificationCenter().k(25, new Object[0]);
                if (z13) {
                    jn7.e().k(jn7.S4, 1, ob6.a0("DeletedFromYourContacts", null, 2131751431, str5));
                    return;
                }
                return;
            case 15:
                tl3 tl3Var = (tl3) this.c;
                boolean z15 = this.b;
                p55 p55Var = (p55) this.d;
                ql3 ql3Var = (ql3) this.e;
                if (z15) {
                    return;
                }
                tl3Var.c = ql3Var;
                p55Var.setRightText(tl3Var.H(ql3Var));
                p55Var.setRightTextMargin(6);
                tl3Var.J.clear();
                tl3Var.d = true;
                tl3Var.f();
                tl3Var.P();
                return;
            case 16:
                fw3 fw3Var = (fw3) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z16 = this.b;
                hw3 hw3Var = fw3Var.s;
                if (fw3Var.r) {
                    if (tLObject3 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                        zw3 zw3Var = hw3Var.r;
                        ArrayList arrayList7 = hw3Var.n;
                        int i15 = zw3.C1;
                        jf7.Y(zw3Var.a).s1(str6, messages_botresults);
                        fw3Var.h = messages_botresults.next_offset;
                        if (z16) {
                            arrayList7.clear();
                        }
                        arrayList7.size();
                        arrayList7.addAll(messages_botresults.results);
                        fw3Var.f();
                    }
                    hw3Var.d.c(false);
                    fw3Var.r = false;
                    return;
                }
                return;
            case 17:
                Context context = (Context) this.c;
                boolean z17 = this.b;
                s64 s64Var = (s64) this.d;
                ig8 ig8Var = (ig8) this.e;
                vt6 b3 = vt6.b(context);
                if (b3 == null) {
                    efd.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    ea3 ea3Var = s64Var.s;
                    ea3Var.getClass();
                    ea3Var.f.a(b3);
                }
                LogSessionId d = b3.d();
                synchronized (ig8Var) {
                    hg8 hg8Var = ig8Var.b;
                    hg8Var.getClass();
                    hg8Var.a(d);
                }
                return;
            case 18:
                String str7 = (String) this.c;
                boolean z18 = this.b;
                nx0 nx0Var = (nx0) this.d;
                vnb vnbVar3 = (vnb) this.e;
                hl.g(str7);
                ex0 ex0Var = nx0Var.c;
                if (z18) {
                    new d31(ex0Var, vnbVar3).i(ob6.M0(2131747022, null)).j();
                    return;
                } else {
                    new d31(ex0Var, vnbVar3).k(false).j();
                    return;
                }
            case 19:
                nx0 nx0Var2 = (nx0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z19 = this.b;
                id idVar = (id) this.e;
                if (nx0Var2 != null && !nx0Var2.J) {
                    nx0Var2.w0(true);
                    editTextBoldCursor.requestFocus();
                    if (z19) {
                        hl.c3(new l(editTextBoldCursor, b));
                        return;
                    }
                    return;
                }
                if (idVar == null || !idVar.isShowing()) {
                    return;
                }
                idVar.k(true);
                editTextBoldCursor.requestFocus();
                if (z19) {
                    hl.c3(new l(editTextBoldCursor, (byte) 7));
                    return;
                }
                return;
            case 20:
                j95 j95Var = (j95) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z20 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        j95Var.p1(null, tL_chatInviteExported3.link, true, z20);
                        return;
                    }
                }
                return;
            case 21:
                dd5 dd5Var = (dd5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z21 = this.b;
                if (tL_error2 == null) {
                    dd5Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z21) {
                        if (dd5Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dd5Var.getParentActivity());
                        alertDialog$Builder3.a.U = ob6.M0(2131745752, null);
                        alertDialog$Builder3.a.S = ob6.M0(2131745750, null);
                        alertDialog$Builder3.g(ob6.M0(2131747558, null), null);
                        dd5Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                dd5Var.e = false;
                dd5Var.a.f();
                return;
            case 22:
                jw5 jw5Var = (jw5) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                boolean z22 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                e eVar = jw5Var.n1;
                if (eVar == null || eVar.getParentActivity() == null) {
                    return;
                }
                if (tL_error3 != null) {
                    if ("INVITE_REQUEST_SENT".equals(tL_error3.text)) {
                        jw5Var.setOnDismissListener(new fw5(jw5Var, z22, (byte) 1));
                    } else {
                        jj.c0(jw5Var.a, tL_error3, eVar, tL_messages_importChatInvite, new Object[0]);
                    }
                }
                jw5Var.dismiss();
                return;
            case 23:
                MediaController mediaController = (MediaController) this.c;
                fc7 fc7Var = (fc7) this.d;
                k5 k5Var = (k5) this.e;
                boolean z23 = this.b;
                String[] strArr2 = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = fc7Var.b;
                tL_document.id = fc7Var.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = fc7Var.c;
                tL_document.dc_id = ConnectionsManager.getInstance(k5Var.a).getCurrentDatacenterId();
                xb4.G(k5Var.a);
                File J = xb4.J(tL_document, null, true, true);
                if (!J.exists()) {
                    hl.c3(new mn6((Object) k5Var, (Object) tL_document, (byte) 0));
                    return;
                } else {
                    if (z23) {
                        return;
                    }
                    hl.c3(new z56(mediaController, J, (byte) 29));
                    return;
                }
            case 24:
                MediaController mediaController2 = (MediaController) this.c;
                File file2 = (File) this.d;
                boolean z24 = this.b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.e;
                String[] strArr3 = MediaController.W1;
                mediaController2.getClass();
                if (file2.exists()) {
                    ls6.d0(mediaController2.i1).D1(mediaController2.n1, mediaController2.o1, gs6.a(mediaController2, file2.getAbsolutePath(), z24));
                } else {
                    boolean z25 = f11.a;
                    cc4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.i1).getCurrentTime();
                tL_document2.size = (int) file2.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file2.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.l1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                jn7.f(mediaController2.i1).k(jn7.o2, new Object[0]);
                jn7.f(mediaController2.i1).k(jn7.s2, Integer.valueOf(mediaController2.h1), tL_document2, file2.getAbsolutePath());
                mediaController2.b0(false);
                return;
            case 25:
                ls6 ls6Var = (ls6) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                boolean z26 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                ls6Var.getMessagesController().j4(arrayList8, z26);
                ls6Var.getMessagesController().c4(arrayList9, z26);
                return;
            case 26:
                ls6 ls6Var2 = (ls6) this.c;
                boolean z27 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                zh6 zh6Var = (zh6) this.e;
                try {
                    ls6Var2.getMessagesStorage().b.beginTransaction();
                    if (z27) {
                        try {
                            executeFast = ls6Var2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e) {
                            e = e;
                            z = true;
                            cc4.g(e, z);
                            return;
                        }
                    } else {
                        executeFast = ls6Var2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        sQLitePreparedStatement3 = ls6Var2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i16 = 0;
                    while (i16 < arrayList10.size()) {
                        TLRPC.Message message2 = (TLRPC.Message) arrayList10.get(i16);
                        SparseArray sparseArray = (SparseArray) zh6Var.f(r47.B0(message2));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message2.id)) == null) {
                            i2 = i4;
                            sQLitePreparedStatement = sQLitePreparedStatement3;
                        } else {
                            r47.p5(message2);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message2.getObjectSize());
                            message2.serializeToStream(nativeByteBuffer);
                            int i17 = i6;
                            while (i17 < arrayList2.size()) {
                                r47 r47Var2 = (r47) arrayList2.get(i17);
                                while (i6 < i4) {
                                    SQLitePreparedStatement sQLitePreparedStatement4 = i6 == 0 ? executeFast : sQLitePreparedStatement3;
                                    if (sQLitePreparedStatement4 == null) {
                                        i3 = i4;
                                        sQLitePreparedStatement2 = sQLitePreparedStatement3;
                                    } else {
                                        sQLitePreparedStatement4.requery();
                                        sQLitePreparedStatement4.bindByteBuffer(i5, nativeByteBuffer);
                                        sQLitePreparedStatement4.bindInteger(i4, message2.id);
                                        sQLitePreparedStatement4.bindInteger(3, r47Var2.e1());
                                        i3 = i4;
                                        sQLitePreparedStatement2 = sQLitePreparedStatement3;
                                        sQLitePreparedStatement4.bindLong(4, r47.B0(r47Var2.k));
                                        sQLitePreparedStatement4.step();
                                    }
                                    i6++;
                                    sQLitePreparedStatement3 = sQLitePreparedStatement2;
                                    i4 = i3;
                                    i5 = 1;
                                }
                                i17++;
                                i5 = 1;
                                i6 = 0;
                            }
                            i2 = i4;
                            sQLitePreparedStatement = sQLitePreparedStatement3;
                            nativeByteBuffer.reuse();
                        }
                        i16++;
                        sQLitePreparedStatement3 = sQLitePreparedStatement;
                        i4 = i2;
                        i5 = 1;
                        i6 = 0;
                    }
                    SQLitePreparedStatement sQLitePreparedStatement5 = sQLitePreparedStatement3;
                    executeFast.dispose();
                    if (sQLitePreparedStatement5 != null) {
                        sQLitePreparedStatement5.dispose();
                    }
                    ls6Var2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
                break;
            case 27:
                ls6 ls6Var3 = (ls6) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z28 = this.b;
                if (tLObject6 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z28) {
                        ls6Var3.M1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        ls6Var3.N1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 28:
                ls6 ls6Var4 = (ls6) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str8 = (String) this.e;
                boolean z29 = this.b;
                if (tLObject7 instanceof TLRPC.TL_messages_stickerSet) {
                    ls6Var4.t1(str8, z29, (TLRPC.TL_messages_stickerSet) tLObject7, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    ls6Var4.t1(str8, z29, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            default:
                uc7 uc7Var = (uc7) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                boolean z30 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = uc7Var.x0;
                if (tLObject8 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject8;
                    uc7Var.j4(contacts_blocked.users, false);
                    uc7Var.c4(contacts_blocked.chats, false);
                    uc7Var.getMessagesStorage().j1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z30) {
                        longSparseIntArray.clear();
                    }
                    uc7Var.y0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    uc7Var.z0 = contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i18 = 0; i18 < size3; i18++) {
                        longSparseIntArray.put(r47.B1(contacts_blocked.blocked.get(i18).peer_id), 1);
                    }
                    uc7Var.w0 = false;
                    uc7Var.getNotificationCenter().k(44, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ lg(ja2 ja2Var, TLRPC.Chat chat, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.d = ja2Var;
        this.c = chat;
        this.b = z;
        this.e = runnable;
    }

    public /* synthetic */ lg(d31 d31Var, boolean z, TLRPC.Chat chat, vnb vnbVar) {
        this.a = (byte) 1;
        this.d = d31Var;
        this.b = z;
        this.c = chat;
        this.e = vnbVar;
    }

    public /* synthetic */ lg(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ lg(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ lg(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lg(String str, int i, nx0 nx0Var, vnb vnbVar) {
        this.a = (byte) 18;
        this.c = str;
        this.b = i;
        this.d = nx0Var;
        this.e = vnbVar;
    }

    public /* synthetic */ lg(boolean z, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = (byte) 0;
        this.b = z;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
