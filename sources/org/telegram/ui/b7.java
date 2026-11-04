package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements org.telegram.ui.Components.ij0, org.telegram.ui.Components.sh0, org.telegram.ui.Components.r4, org.telegram.messenger.jc, w4, org.telegram.ui.ActionBar.p1, org.telegram.messenger.lr, org.telegram.ui.Components.gj0, nw, ca1, org.telegram.ui.Components.voip.o2, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b7(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 2:
                wm wmVar = (wm) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l10 = (Long) this.d;
                wmVar.getClass();
                wmVar.Db(botInlineResult, z10, i3, l10.longValue());
                break;
            case 3:
            default:
                wm wmVar2 = (wm) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.d;
                wmVar2.getClass();
                if (z10) {
                    dg.a l11 = dg.a.l(suggestedPost != null ? suggestedPost.price : null);
                    long j10 = i3;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (l11 != null && !l11.k()) {
                        suggestedPost2.price = l11.o();
                    }
                    if (j10 > 0) {
                        suggestedPost2.schedule_date = (int) j10;
                        suggestedPost2.flags |= 1;
                    }
                    if (ziVar != null && ziVar.k != null) {
                        wmVar2.getMessagesController().h(ziVar, suggestedPost2);
                        break;
                    }
                }
                break;
            case 4:
                wm.T0((wm) this.b, (org.telegram.messenger.ui) this.c, (org.telegram.messenger.zi) this.d, i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(uw uwVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.jc
    public void a(String str) {
        wm wmVar = (wm) this.b;
        org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.bd.E0().y.getLanguage();
        if (str == null || ((str.equals(language) && !str.equals("und")) || gy0.d0().contains(str))) {
            f0Var.setClickable(false);
        } else {
            f0Var.setOnClickListener(new ei.f0(wmVar, str, language, charSequence, f0Var, 7));
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        x30.I0((x30) this.b, (Activity) this.c, (org.telegram.messenger.r3) this.d, view, i3);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.sh0
    public void c(org.telegram.ui.Components.uh0 uh0Var, int i3) {
        int i10;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(uh0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.k5.C(52.0f, i10, i3), true);
    }

    @Override // org.telegram.ui.w4
    public void d(e5 e5Var) {
        switch (this.a) {
            case 6:
                hm hmVar = (hm) this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = e5Var.ordinal();
                if (ordinal == 0) {
                    hmVar.o(user, false);
                    break;
                } else if (ordinal == 3) {
                    hmVar.l(q1Var, user);
                    break;
                } else if (ordinal == 4) {
                    hmVar.b(user);
                    break;
                } else if (ordinal == 5) {
                    hmVar.a.Ma(user);
                    break;
                }
                break;
            default:
                hm hmVar2 = (hm) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.d;
                int ordinal2 = e5Var.ordinal();
                if (ordinal2 == 0) {
                    hmVar2.m(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        hmVar2.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        hmVar2.a.Ka(chat);
                        break;
                    }
                } else {
                    hmVar2.k(q1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    public boolean e(TLRPC.Message message) {
        dl0 dl0Var = (dl0) this.b;
        org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) this.c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.zi.C1(message.peer_id) != dl0Var.m0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        org.telegram.messenger.g0.h3(new ih0(dl0Var, q4Var, activity, message, 1));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        String str;
        int i10;
        switch (this.a) {
            case 8:
                yn ynVar = (yn) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view = (View) this.d;
                bo boVar = ynVar.a.i3;
                if (tL_username.editable) {
                    if (boVar.s0 == null) {
                        boVar.s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = boVar.Y;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    boVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ci.o3(ynVar, tL_channels_toggleUsername, tL_username, z10, 5));
                    boVar.Q.add(tL_username.username);
                    ((ha) view).setLoading(true);
                }
                boVar.b0();
                break;
            case 9:
                qo qoVar = (qo) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                qoVar.getClass();
                if (chatFull.hidden_prehistory) {
                    qoVar.getMessagesController().b5(chat2.id, false);
                }
                qoVar.d0(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                v51 v51Var = (v51) this.b;
                if (org.telegram.ui.ActionBar.k6.l0(((x51) this.c).d, (org.telegram.ui.ActionBar.g6) this.d, true)) {
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                    org.telegram.ui.ActionBar.k6.K1(org.telegram.ui.ActionBar.k6.I, v51Var.e.f == 1, -1, null);
                    break;
                }
                break;
            case 11:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                EditText editText = (EditText) this.d;
                if (editText != null) {
                    contactsActivity.getClass();
                    str = editText.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.l0(user, false, str);
                break;
            case 12:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.b;
                String str2 = (String) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                org.telegram.messenger.az.h0 = str2;
                org.telegram.messenger.az.y();
                org.telegram.messenger.az.b = false;
                dataSettingsActivity.s0(dataSettingsActivity.n);
                org.telegram.messenger.zb.D().i(new us(dataSettingsActivity, 2));
                alertDialog$Builder.a.O0.run();
                break;
            case 13:
                zx zxVar = (zx) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                alertDialog$Builder2.a.O0.run();
                cy cyVar = zxVar.F.c;
                cyVar.d.title = editTextBoldCursor.getText().toString();
                cyVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = cyVar.d;
                if (cyVar.F != 0) {
                    cyVar.getConnectionsManager().cancelRequest(cyVar.F, true);
                    cyVar.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = cyVar.c.a;
                tL_chatlists_editExportedInvite.slug = cyVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                cyVar.F = cyVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new qx(cyVar, 1));
                org.telegram.messenger.u10 u10Var = cyVar.y;
                if (u10Var != null) {
                    u10Var.a(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                c30 c30Var = (c30) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder3 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.g0.v1(editTextBoldCursor2);
                org.telegram.messenger.r3 r3Var = c30Var.b.S2;
                String obj = editTextBoldCursor2.getText().toString();
                r3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = r3Var.g(r3Var.a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(r3Var.C.a).sendRequest(editgroupcalltitle, new org.telegram.messenger.k3(r3Var, 1));
                alertDialog$Builder3.a.O0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, arrayList, arrayList2, false));
                break;
            case 21:
                a21 a21Var = (a21) this.b;
                k21 k21Var = (k21) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.d2) k21Var.a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new xy(29, k21Var, tL_authorization));
                a21Var.d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.o2
    public void i(org.telegram.ui.Components.voip.p2 p2Var) {
        zb1 zb1Var = (zb1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.g0.r(zb1Var.T0);
            zb1Var.S0 = false;
            if (zb1Var.x0.isTouchExplorationEnabled()) {
                p2Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? org.telegram.messenger.bd.M0(2131754731, null) : org.telegram.messenger.bd.M0(2131754730, null));
            }
            q2Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.ca1
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((q11) this.b).e1((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        b8.ke keVar = (b8.ke) this.b;
        gi.d dVar = (gi.d) this.c;
        int[] iArr = (int[]) this.d;
        org.telegram.messenger.a8.b("wear-auth: /answer delivered to " + ((String) keVar.d));
        int i3 = 0;
        dVar.setLoading(false);
        int i10 = iArr[0];
        ArrayList arrayList = (ArrayList) keVar.f;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        org.telegram.ui.ActionBar.e6 resourceProvider = T != null ? T.getResourceProvider() : null;
        org.telegram.ui.ActionBar.t2 t2Var = qc1.c;
        if (t2Var != null) {
            t2Var.dismiss();
            qc1.c = null;
        }
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, resourceProvider, false);
        pc1 pc1Var = new pc1(context);
        l10.O = pc1Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        pc1Var.addView(f10, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        TextView b10 = b8.rf.b(context, 20.0f, org.telegram.ui.ActionBar.k6.j5, true, resourceProvider);
        org.telegram.messenger.k5.m(b10, 17, null, 2131742957);
        f10.addView(b10, b8.mf.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i3 < arrayList.size()) {
            org.telegram.messenger.e6 f11 = org.telegram.messenger.i6.f((String) arrayList.get(i3));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(f11);
            org.telegram.messenger.hs.i(imageView);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.w0(i11, resourceProvider)));
            org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.r6.k(imageView, L2, L3, null, resourceProvider);
            linearLayout.addView(imageView, b8.mf.k(i3 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i3++;
        }
        f10.addView(linearLayout, b8.mf.t(-2, -2, 49, 32, 12, 32, 12));
        gi.d h = org.telegram.messenger.k5.h(24, context, resourceProvider, true);
        h.setText(org.telegram.messenger.bd.M0(2131742956, null));
        f10.addView(h, b8.mf.t(-1, 48, 7, 12, 12, 12, 8));
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        l10.w0(i12);
        l10.P(i12);
        qc1.c = l10;
        l10.show();
        h.setOnClickListener(new ai.h3(h, i10, l10, 22));
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        ip.f0((ip) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.nw
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        long j10;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                wm wmVar = (wm) obj;
                PhotoViewer photoViewer = ((ho0) obj3).b;
                if (arrayList.size() > 1 || ((org.telegram.messenger.pr) arrayList.get(0)).a == org.telegram.messenger.h10.i(photoViewer.U).e() || charSequence != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j11 = ((org.telegram.messenger.pr) arrayList.get(i13)).a;
                        if (charSequence != null) {
                            j10 = j11;
                            org.telegram.messenger.yy.C(photoViewer.U).r0(org.telegram.messenger.wy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j11;
                        }
                        org.telegram.messenger.yy.C(photoViewer.U).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    uwVar.finishFragment();
                    if (wmVar != null) {
                        wmVar.f8();
                        UndoView undoView = wmVar.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.pr) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
                                break;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.pr prVar = (org.telegram.messenger.pr) arrayList.get(0);
                    long j12 = prVar.a;
                    Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                    if (org.telegram.messenger.m5.C(j12)) {
                        k10.putInt("enc_id", (int) (j12 & 4294967295L));
                    } else if (org.telegram.messenger.m5.E(j12)) {
                        k10.putLong("user_id", j12);
                    } else {
                        k10.putLong("chat_id", -j12);
                    }
                    wm wmVar2 = new wm(k10);
                    if (prVar.b != 0) {
                        rg.c.a(wmVar2, prVar);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(wmVar2, true, false)) {
                        wmVar2.dc(arrayList2);
                        break;
                    } else {
                        uwVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                iv0 iv0Var = (iv0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                uw uwVar2 = (uw) obj;
                long j13 = ((org.telegram.messenger.pr) arrayList.get(0)).a;
                ProfileActivity profileActivity = iv0Var.b;
                i11 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i11).M0(Long.valueOf(-j13));
                if (M0 == null || (!M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String M02 = org.telegram.messenger.bd.M0(2131754463, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M02;
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AddMembersAlertNamesText", null, 2131754399, org.telegram.messenger.l10.p(user), M0 == null ? "" : M0.title));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754463, null), new cg.d0(iv0Var, j13, uwVar, user, 5));
                    profileActivity.showDialog(s1Var);
                    break;
                } else {
                    profileActivity.getMessagesController().K(M0, user, new ci.i(iv0Var, j13, uwVar2, 8));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, final View view) {
        String str;
        final e7 e7Var = (e7) this.b;
        org.telegram.ui.Components.tj0 tj0Var = (org.telegram.ui.Components.tj0) this.c;
        z6 z6Var = (z6) this.d;
        u7 u7Var = e7Var.f;
        g7 g7Var = (g7) tj0Var.getAdapter();
        final n7 n7Var = (n7) g7Var.e.get(i3);
        final int i10 = 1;
        if (!(view instanceof l7) && !(view instanceof org.telegram.ui.Cells.n7)) {
            j7 j7Var = u7Var.G;
            if (j7Var != null) {
                j7Var.a(n7Var.c, n7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(u7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.bd.M0(2131752648, null), false, null).setOnClickListener(new ei.f0(e7Var, n7Var, g7Var, tj0Var, view, 5));
            str = null;
        } else {
            final int i11 = 0;
            if (((l7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.f7) {
                str = null;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, org.telegram.messenger.bd.M0(2131747228, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                e7 e7Var2 = e7Var;
                                u7.b(e7Var2.f, n7Var.d, (l7) view);
                                org.telegram.ui.ActionBar.f1 f1Var = e7Var2.a;
                                if (f1Var != null) {
                                    f1Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                e7 e7Var3 = e7Var;
                                u7.b(e7Var3.f, n7Var.d, (l7) view);
                                org.telegram.ui.ActionBar.f1 f1Var2 = e7Var3.a;
                                if (f1Var2 != null) {
                                    f1Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                str = null;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.bd.M0(2131752648, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.c7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                e7 e7Var2 = e7Var;
                                u7.b(e7Var2.f, n7Var.d, (l7) view);
                                org.telegram.ui.ActionBar.f1 f1Var = e7Var2.a;
                                if (f1Var != null) {
                                    f1Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                e7 e7Var3 = e7Var;
                                u7.b(e7Var3.f, n7Var.d, (l7) view);
                                org.telegram.ui.ActionBar.f1 f1Var2 = e7Var3.a;
                                if (f1Var2 != null) {
                                    f1Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        di.b bVar = n7Var.d;
        if (bVar.b != 0 && bVar.g != 0) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, org.telegram.messenger.bd.M0(2131743562, str), false, null).setOnClickListener(new a0(e7Var, n7Var, z6Var, i10));
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.bd.M0(!u7Var.h.j.contains(n7Var.d) ? 2131745682 : 2131751459, str), false, null).setOnClickListener(new org.telegram.messenger.video.g(11, e7Var, n7Var));
        e7Var.a = org.telegram.ui.Components.t4.P(z6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        u7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
