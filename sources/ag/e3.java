package ag;

import android.app.Dialog;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.ot;
import org.telegram.messenger.q20;
import org.telegram.messenger.u3;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aa;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.cp;
import org.telegram.ui.f7;
import org.telegram.ui.f70;
import org.telegram.ui.fn;
import org.telegram.ui.iq;
import org.telegram.ui.j9;
import org.telegram.ui.jj0;
import org.telegram.ui.kd;
import org.telegram.ui.lt;
import org.telegram.ui.m7;
import org.telegram.ui.m91;
import org.telegram.ui.me1;
import org.telegram.ui.na;
import org.telegram.ui.nb;
import org.telegram.ui.oa;
import org.telegram.ui.oo;
import org.telegram.ui.or;
import org.telegram.ui.pr;
import org.telegram.ui.q5;
import org.telegram.ui.sb;
import org.telegram.ui.t7;
import org.telegram.ui.un;
import org.telegram.ui.zc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e3(i3 i3Var, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = i3Var;
        this.d = tLObject;
        this.c = arrayList;
        this.e = tL_messages_sendQuickReplyMessages;
        this.f = tL_error;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        String str;
        int i11;
        String str2;
        TLRPC.GroupCall groupCall;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 1;
        int i15 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i12) {
            case 0:
                i3 i3Var = (i3) obj5;
                h3 h3Var = (h3) obj2;
                jj jjVar = (jj) obj;
                int i16 = i3Var.a;
                vp.r1(i16).V3((ArrayList) obj4, true);
                vp.r1(i16).P3((ArrayList) obj3, true);
                h3Var.e = jjVar;
                if (jjVar != null) {
                    jjVar.l(h3Var.a, h3Var.b);
                }
                i3Var.l();
                zs.f(i16).k(zs.F1, new Object[0]);
                break;
            case 1:
                i3 i3Var2 = (i3) obj5;
                TLObject tLObject = (TLObject) obj3;
                ArrayList<Integer> arrayList = (ArrayList) obj4;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.TL_messages_messages) tLObject).messages;
                    arrayList.clear();
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLRPC.Message message = arrayList2.get(i17);
                        i17++;
                        arrayList.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList;
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.b.nextLong()));
                    }
                    ConnectionsManager.getInstance(i3Var2.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    f8.d("received " + tLObject + " " + tL_error + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
            case 2:
                i3 i3Var3 = (i3) obj5;
                Runnable runnable = (Runnable) obj;
                i3Var3.e = false;
                int i19 = i3Var3.a;
                vp.r1(i19).V3((ArrayList) obj4, true);
                vp.r1(i19).P3((ArrayList) obj3, true);
                ArrayList arrayList3 = i3Var3.b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj2);
                if (runnable != null) {
                    runnable.run();
                    i10 = 0;
                } else {
                    i10 = 0;
                    i3Var3.i(null, false);
                }
                zs.f(i19).k(zs.F1, new Object[i10]);
                break;
            case 3:
                ((m4.h) obj4).run().a(new q0((xa.n) obj5, (AtomicBoolean) obj3, (m4.i) obj2, (AtomicBoolean) obj, 9), j9.r.a);
                break;
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.j1 j1Var = (org.telegram.messenger.j1) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                vp vpVar = (vp) obj2;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                if (tL_error2 != null) {
                    j1Var.a(tL_error2);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject2;
                    vpVar.V3(tL_premium_myBoosts.users, false);
                    vpVar.P3(tL_premium_myBoosts.chats, false);
                    g3Var.a(tL_premium_myBoosts);
                    break;
                }
                break;
            case 5:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                q20 q20Var = (q20) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                vp vpVar2 = (vp) obj2;
                q20 q20Var2 = (q20) obj;
                if (tL_error3 != null) {
                    q20Var.a(tL_error3);
                    break;
                } else if (tLObject3 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject3;
                    vpVar2.V3(tL_premium_myBoosts2.users, false);
                    vpVar2.P3(tL_premium_myBoosts2.chats, false);
                    q20Var2.a(tL_premium_myBoosts2);
                    break;
                }
                break;
            case 6:
                TLObject tLObject4 = (TLObject) obj5;
                vp vpVar3 = (vp) obj4;
                m2 m2Var = (m2) obj3;
                mg.k kVar = (mg.k) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject4;
                    vpVar3.P3(tL_payments_checkedGiftCode.chats, false);
                    vpVar3.V3(tL_payments_checkedGiftCode.users, false);
                    m2Var.a(tL_payments_checkedGiftCode);
                }
                kVar.a(tL_error4);
                break;
            case 7:
                mg.i2 i2Var = (mg.i2) obj5;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                FrameLayout frameLayout = i2Var.W1;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    wb Q = new cc(frameLayout, i2Var.I0).Q(R.raw.contact_check, 36, cd.L0(2131746871, null));
                    Q.j = 5000;
                    Q.j();
                    break;
                } else {
                    if (userFull != null) {
                        if (tL_birthday == null) {
                            userFull.flags2 &= -33;
                        } else {
                            userFull.flags2 |= 32;
                        }
                        userFull.birthday = tL_birthday;
                        hs.a0(i2Var.a).j2(userFull, false);
                    }
                    if (tL_error5 != null && (str = tL_error5.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        if (i2Var.getContext() != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i2Var.getContext(), i2Var.I0);
                            alertDialog$Builder.a.R = cd.L0(2131746867, null);
                            alertDialog$Builder.a.T = cd.L0(2131746868, null);
                            i0.a.w(null, 2131747847, alertDialog$Builder, null);
                            break;
                        }
                    } else {
                        m5.n(null, 2131743904, new cc(frameLayout, i2Var.I0), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 8:
                ((CameraController) obj5).lambda$open$10((CameraSession) obj4, (Runnable) obj3, (SurfaceTexture) obj2, (Runnable) obj);
                break;
            case 9:
                t7 t7Var = (t7) obj5;
                sh.a aVar = (sh.a) obj4;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj3;
                t7Var.getClass();
                aVar.e.a = false;
                tL_documentAttributeAudio.title = (String) obj2;
                tL_documentAttributeAudio.performer = (String) obj;
                w71 w71Var = t7Var.n;
                for (int i20 = 0; i20 < w71Var.getViewPages().length; i20++) {
                    tk0 c10 = t7Var.c(w71Var.getViewPages()[i20]);
                    if (c10 != null && ((f7) c10.getAdapter()).d == 3) {
                        f7 f7Var = (f7) c10.getAdapter();
                        int i21 = 0;
                        while (true) {
                            if (i21 >= f7Var.e.size()) {
                                break;
                            } else if (((m7) f7Var.e.get(i21)).d == aVar) {
                                f7Var.g(i21);
                            } else {
                                i21++;
                            }
                        }
                    }
                }
                break;
            case 10:
                oa oaVar = (oa) obj5;
                String str3 = (String) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) obj;
                oaVar.e = 0;
                String str4 = oaVar.f;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error6 != null || !(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                        if (oaVar.G != null) {
                            if (tL_error6 != null && "USERNAME_INVALID".equals(tL_error6.text) && checkusername.username.length() == 4) {
                                oaVar.G.setText(cd.L0(2131743680, null));
                                org.telegram.ui.Cells.b2 b2Var = oaVar.G;
                                int i22 = t6.p7;
                                b2Var.setTag(Integer.valueOf(i22));
                                a7.V(oaVar.G, i22, null);
                            } else if (tL_error6 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error6.text)) {
                                oaVar.G.setText(cd.L0(2131743684, null));
                                org.telegram.ui.Cells.b2 b2Var2 = oaVar.G;
                                int i23 = t6.p7;
                                b2Var2.setTag(Integer.valueOf(i23));
                                a7.V(oaVar.G, i23, null);
                            } else {
                                if (checkusername.username.length() == 4) {
                                    oaVar.G.setText(cd.L0(2131743679, null));
                                } else {
                                    oaVar.G.setText(cd.L0(2131743683, null));
                                }
                                org.telegram.ui.Cells.b2 b2Var3 = oaVar.G;
                                int i24 = t6.F6;
                                b2Var3.setTag(Integer.valueOf(i24));
                                a7.V(oaVar.G, i24, null);
                            }
                            na naVar = oaVar.F;
                            if (naVar != null) {
                                na.a(naVar);
                                break;
                            }
                        }
                    } else {
                        org.telegram.ui.Cells.b2 b2Var4 = oaVar.G;
                        if (b2Var4 != null) {
                            b2Var4.setText(cd.a0("UsernameAvailable", null, 2131743693, str3));
                            org.telegram.ui.Cells.b2 b2Var5 = oaVar.G;
                            int i25 = t6.w6;
                            b2Var5.setTag(Integer.valueOf(i25));
                            a7.V(oaVar.G, i25, null);
                            na naVar2 = oaVar.F;
                            if (naVar2 != null) {
                                na.a(naVar2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                sb sbVar = ((nb) obj5).a.n;
                sbVar.A0 = false;
                sbVar.y0.put(((TLRPC.TL_chatInviteExported) obj4).link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!zArr[0]) {
                    x1Var.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        sb.E0(sbVar, tL_messages_exportedChatInvite, sbVar.z0);
                        break;
                    } else {
                        m5.n(null, 2131748923, cc.a0(sbVar), R.raw.linkbroken, 36);
                        break;
                    }
                }
                break;
            case 12:
                zc zcVar = (zc) obj5;
                boolean[] zArr2 = (boolean[]) obj4;
                int[] iArr = (int[]) obj3;
                int[] iArr2 = (int[]) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (!zArr2[0] && (i11 = iArr[0]) < iArr2[0]) {
                    if (tL_error7 != null) {
                        zArr2[0] = true;
                        if ("BOOSTS_REQUIRED".equals(tL_error7.text)) {
                            zcVar.getMessagesController().G0().b(zcVar.a, zcVar.c, new org.telegram.ui.cc(zcVar, i14));
                            break;
                        } else {
                            zcVar.P.setLoading(false);
                            cc.a0(zcVar).Q(R.raw.error, 36, cd.a0(null, null, 2131743903, tL_error7.text)).j();
                            break;
                        }
                    } else {
                        int i26 = i11 + 1;
                        iArr[0] = i26;
                        if (i26 == iArr2[0]) {
                            zcVar.finishFragment();
                            org.telegram.ui.ActionBar.k2 k2Var = zcVar.l0;
                            if (k2Var != null) {
                                if (k2Var instanceof oo) {
                                    ((oo) k2Var).s0();
                                }
                                m5.n(null, zcVar.d ? 2131749507 : 2131752459, cc.a0(zcVar.l0), R.raw.contact_check, 36);
                                zcVar.l0 = null;
                            }
                            zcVar.P.setLoading(false);
                            break;
                        }
                    }
                }
                break;
            case 13:
                kd kdVar = (kd) obj5;
                String str5 = (String) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) obj;
                kdVar.X = 0;
                String str6 = kdVar.Y;
                if (str6 != null && str6.equals(str5)) {
                    if (tL_error8 != null || !(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error8 != null && "USERNAME_INVALID".equals(tL_error8.text) && tL_channels_checkUsername.username.length() == 4) {
                            kdVar.V.setText(cd.L0(2131743680, null));
                            a7.V(kdVar.V, t6.p7, null);
                        } else if (tL_error8 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                            if (tL_channels_checkUsername.username.length() == 4) {
                                kdVar.V.setText(cd.L0(2131743679, null));
                            } else {
                                kdVar.V.setText(cd.L0(2131743683, null));
                            }
                            a7.V(kdVar.V, t6.F6, null);
                        } else if (tL_error8 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error8.text)) {
                            a7.V(kdVar.V, t6.p7, null);
                            kdVar.V.setText(cd.L0(2131748922, null));
                        } else {
                            a7.V(kdVar.V, t6.p7, null);
                            kdVar.k0 = false;
                            kdVar.k0();
                        }
                        kdVar.a0 = false;
                        break;
                    } else {
                        kdVar.V.setText(cd.a0("LinkAvailable", null, 2131748934, str5));
                        org.telegram.ui.Cells.b2 b2Var6 = kdVar.V;
                        int i27 = t6.w6;
                        b2Var6.setTag(Integer.valueOf(i27));
                        a7.V(kdVar.V, i27, null);
                        kdVar.a0 = true;
                        break;
                    }
                }
                break;
            case 14:
                un unVar = (un) obj5;
                boolean[] zArr3 = (boolean[]) obj4;
                boolean[] zArr4 = (boolean[]) obj3;
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    long[] jArr = {-1};
                    q0 q0Var = new q0(jArr, zArr4, imageView, imageView2, 26);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = unVar.t5.f1();
                    tL_messages_rateTranscribedAudio.peer = unVar.getMessagesController().l1(unVar.t5.k.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = unVar.t5.k.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr4[0];
                    unVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new aa(unVar, q0Var, jArr, i13));
                    org.telegram.messenger.i0.h3(q0Var, 150L);
                    break;
                }
                break;
            case 15:
                fn fnVar = (fn) obj5;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj3;
                jj jjVar2 = (jj) obj;
                q5 q5Var = (q5) obj2;
                un unVar2 = fnVar.a;
                if (((TLRPC.Message) obj4).suggested_post.schedule_date == 0) {
                    x1VarArr[0].setOnDismissListener(null);
                    org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) s4.S(unVar2.getParentActivity(), 0L, new ng.d(15, fnVar, jjVar2), unVar2.getResourceProvider(), 1).b;
                    z2Var.show();
                    z2Var.setOnDismissListener(q5Var);
                    break;
                } else {
                    unVar2.getMessagesController().v(jjVar2.k.id, 0, o5.o(jjVar2.k.peer_id), null, false);
                    break;
                }
            case 16:
                cp cpVar = (cp) obj5;
                String str7 = (String) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) obj;
                cpVar.h0 = 0;
                String str8 = cpVar.i0;
                if (str8 != null && str8.equals(str7)) {
                    if (tL_error9 != null || !(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error9 != null && "USERNAME_INVALID".equals(tL_error9.text) && tL_channels_checkUsername2.username.length() == 4) {
                            cpVar.h.setText(cd.L0(2131743680, null));
                            a7.V(cpVar.h.getTextView(), t6.p7, null);
                        } else if (tL_error9 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error9.text)) {
                            if (tL_channels_checkUsername2.username.length() == 4) {
                                cpVar.h.setText(cd.L0(2131743679, null));
                            } else {
                                cpVar.h.setText(cd.L0(2131743683, null));
                            }
                            a7.V(cpVar.h.getTextView(), t6.F6, null);
                        } else if (tL_error9 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error9.text)) {
                            cpVar.h.setText(cd.L0(2131748922, null));
                            cpVar.h.setTextColorByKey(t6.p7);
                        } else {
                            cpVar.c0 = false;
                            cpVar.e0();
                        }
                        cpVar.k0 = false;
                        break;
                    } else {
                        cpVar.h.setText(cd.a0("LinkAvailable", null, 2131748934, str7));
                        cpVar.h.setTextColorByKey(t6.w6);
                        cpVar.k0 = true;
                        break;
                    }
                }
                break;
            case 17:
                iq.c0((iq) obj5, (TLRPC.TL_error) obj4, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj);
                break;
            case 18:
                or orVar = (or) obj5;
                ArrayList arrayList4 = (ArrayList) obj4;
                a0.h hVar = (a0.h) obj2;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                zf.m1 m1Var = orVar.h;
                pr prVar = orVar.D;
                if (prVar.n1) {
                    orVar.s = false;
                    orVar.d = arrayList4;
                    orVar.e = hVar;
                    orVar.f = arrayList5;
                    m1Var.f(arrayList4, null);
                    if (!w3.T(prVar.n)) {
                        ArrayList arrayList7 = m1Var.g;
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                    }
                    int i28 = orVar.r;
                    orVar.f();
                    if (orVar.r > i28) {
                        prVar.C0(i28);
                    }
                    if (!m1Var.e() && orVar.r == 0) {
                        prVar.b.e(false, true);
                        break;
                    }
                }
                break;
            case 19:
                View view = (View) obj5;
                View view2 = (View) obj4;
                WindowManager windowManager = (WindowManager) obj3;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj2);
                windowManager.removeView((View) obj);
                break;
            case 20:
                cx0 cx0Var = (cx0) obj5;
                String str9 = (String) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                TextView textView = (TextView) obj;
                cx0Var.g2 = 0;
                String str10 = cx0Var.f2;
                if (str10 != null && str10.equals(str9)) {
                    if (tL_error10 != null || !(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(cd.L0(2131749239, null));
                        a7.V(textView, t6.p7, cx0Var.I0);
                        cx0Var.h2 = false;
                        break;
                    } else {
                        textView.setText(cd.L0(2131749244, null));
                        a7.V(textView, t6.w6, cx0Var.I0);
                        cx0Var.h2 = true;
                        break;
                    }
                }
                break;
            case 21:
                nx0 nx0Var = (nx0) obj5;
                TLObject tLObject9 = (TLObject) obj4;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject9 instanceof TLRPC.TL_boolTrue) {
                        wb I = cc.a0(T).I(R.raw.gift, cd.L0(2131746871, null), cd.L0(2131746870, null));
                        I.j = 5000;
                        I.j();
                        break;
                    } else {
                        if (userFull2 != null) {
                            if (tL_birthday2 == null) {
                                userFull2.flags2 &= -33;
                            } else {
                                userFull2.flags2 |= 32;
                            }
                            userFull2.birthday = tL_birthday2;
                            hs.a0(nx0Var.a).j2(userFull2, false);
                        }
                        if (tL_error11 != null && (str2 = tL_error11.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nx0Var.b.getContext());
                            alertDialog$Builder2.a.R = cd.L0(2131746867, null);
                            alertDialog$Builder2.a.T = cd.L0(2131746868, null);
                            i0.a.w(null, 2131747847, alertDialog$Builder2, null);
                            break;
                        } else {
                            m5.n(null, 2131743904, cc.a0(T), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 22:
                o21 o21Var = (o21) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                z60 z60Var = (z60) obj2;
                z60 z60Var2 = (z60) obj;
                un unVar3 = o21Var.y;
                if (((vp) obj4).q2(o21Var.r, tL_forumTopic.id, null)) {
                    z60Var.u();
                    ot.t(o21Var.n).G(o21Var.r, tL_forumTopic.id, false);
                    if (cc.a(unVar3)) {
                        cc.z(unVar3, 4, 0, o21Var.s).j();
                        break;
                    }
                } else {
                    z60Var.K(z60Var2);
                    break;
                }
                break;
            case 23:
                lt ltVar = (lt) obj5;
                TLObject tLObject10 = (TLObject) obj2;
                ArrayList arrayList8 = (ArrayList) obj4;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj3) == null && (tLObject10 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject10;
                    ArrayList<TLRPC.StickerSetCovered> arrayList9 = tL_messages_myStickers.sets;
                    int size2 = arrayList9.size();
                    while (i15 < size2) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList9.get(i15);
                        i15++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet m0 = ui.b0(ltVar.r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList8.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i0.a.g(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(ltVar.r).sendRequest(tL_messages_getMyStickers, new aa(ltVar, arrayList8, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 24:
                ay.I0((ay) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 25:
                b50 b50Var = (b50) obj5;
                TLObject tLObject11 = (TLObject) obj3;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj2;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj;
                b50Var.getClass();
                ((org.telegram.ui.ActionBar.x1) obj4).dismiss();
                if (tLObject11 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = b50Var.getContext();
                    int i29 = b50Var.a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str11 = ((TL_phone.exportedGroupCallInvite) tLObject11).link;
                    p6 p6Var = b50Var.I0;
                    u3 u3Var = b50Var.R2;
                    j9.m0(context, i29, inputGroupCall, str11, p6Var, false, (u3Var == null || (groupCall = u3Var.b) == null || !groupCall.creator) ? false : true);
                    break;
                } else if (tL_error12 != null) {
                    new cc(b50Var.E, new ro0()).f0(tL_error12, false);
                    break;
                }
                break;
            case 26:
                b50 b50Var2 = (b50) obj5;
                ArrayList arrayList10 = (ArrayList) obj4;
                ArrayList arrayList11 = (ArrayList) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                String str12 = (String) obj;
                b50Var2.getClass();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    kg.q0 q0Var2 = new kg.q0(34, b50Var2.a, T2.getContext(), T2, new ro0());
                    q0Var2.C1(null, arrayList10, arrayList11, arrayList12, str12);
                    q0Var2.show();
                    break;
                }
                break;
            case 27:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                f70 f70Var = (f70) obj4;
                TLObject tLObject12 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (tLObject12 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tLObject12;
                    if (tL_wallPaper2.pattern) {
                        String str13 = tL_wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                        me1 me1Var = new me1(str13, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.i0.s1(wallPaperSettings.rotation, false), r2.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                        me1Var.g = tL_wallPaper2;
                        tL_wallPaper2 = me1Var;
                    }
                    m91 m91Var = new m91(tL_wallPaper2, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f7 = wallPaperSettings2.intensity;
                    m91Var.G1 = z10;
                    m91Var.F1 = z11;
                    m91Var.o1 = f7;
                    launchActivity.t0(m91Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z20.q(null, 2131751106, sb2, "\n");
                    sb2.append(tL_error13.text);
                    launchActivity.F0(s4.M(launchActivity, null, sb2.toString()));
                    break;
                }
            case 28:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                ay ayVar = (ay) obj4;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str14 = (String) obj;
                ArrayList arrayList13 = launchActivity2.E0;
                if (ayVar != null) {
                    if (k2Var2 != null) {
                        k2Var2.dismissCurrentDialog();
                    }
                    while (i15 < arrayList13.size()) {
                        if (((Dialog) arrayList13.get(i15)).isShowing()) {
                            ((Dialog) arrayList13.get(i15)).dismiss();
                        }
                        i15++;
                    }
                    arrayList13.clear();
                    launchActivity2.t0(ayVar);
                    break;
                } else if (k2Var2 instanceof un) {
                    ((un) k2Var2).ma(user.id, str14, true);
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str15 = (String) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (tLObject13 != null) {
                    if (tLObject13 instanceof TLRPC.TL_urlAuthResultRequest) {
                        jj0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject13, null, null, null, false, null);
                        break;
                    } else if (tLObject13 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        jj0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject13, null, null, null, false, null);
                        break;
                    } else if (tLObject13 instanceof TLRPC.TL_urlAuthResultDefault) {
                        s4.p0(T3, str15, false, true);
                        break;
                    }
                } else if (tL_error14 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error14.text)) {
                        jj0.a().I(R.raw.error, cd.L0(2131753128, null), cd.L0(2131753129, null)).j();
                        break;
                    } else {
                        jj0.a().f0(tL_error14, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ e3(fn fnVar, TLRPC.Message message, org.telegram.ui.ActionBar.x1[] x1VarArr, jj jjVar, q5 q5Var) {
        this.a = 15;
        this.b = fnVar;
        this.c = message;
        this.d = x1VarArr;
        this.f = jjVar;
        this.e = q5Var;
    }

    public /* synthetic */ e3(or orVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 18;
        this.b = orVar;
        this.c = arrayList;
        this.e = hVar;
        this.d = arrayList2;
        this.f = arrayList3;
    }

    public /* synthetic */ e3(lt ltVar, TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers) {
        this.a = 23;
        this.b = ltVar;
        this.d = tL_error;
        this.e = tLObject;
        this.c = arrayList;
        this.f = tL_messages_getMyStickers;
    }
}
