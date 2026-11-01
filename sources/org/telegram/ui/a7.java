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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements org.telegram.ui.Components.kk0, org.telegram.ui.Components.ui0, org.telegram.ui.Components.q4, org.telegram.messenger.rc, t4, org.telegram.ui.ActionBar.u1, org.telegram.messenger.ds, org.telegram.ui.Components.ik0, tx, ec1, org.telegram.ui.Components.voip.q2, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a7(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean H() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 2:
                un unVar = (un) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l4 = (Long) this.d;
                unVar.getClass();
                unVar.yb(botInlineResult, z10, i10, l4.longValue());
                break;
            case 3:
            default:
                un unVar2 = (un) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.d;
                unVar2.getClass();
                if (z10) {
                    sf.a l10 = sf.a.l(suggestedPost != null ? suggestedPost.price : null);
                    long j10 = i10;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (l10 != null && !l10.k()) {
                        suggestedPost2.price = l10.o();
                    }
                    if (j10 > 0) {
                        suggestedPost2.schedule_date = (int) j10;
                        suggestedPost2.flags |= 1;
                    }
                    if (kjVar != null && kjVar.k != null) {
                        unVar2.getMessagesController().h(kjVar, suggestedPost2);
                        break;
                    }
                }
                break;
            case 4:
                un.w1((un) this.b, (org.telegram.messenger.fj) this.c, (org.telegram.messenger.kj) this.d, i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean O(zx zxVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.rc
    public void a(String str) {
        un unVar = (un) this.b;
        org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.dd.D0().y.getLanguage();
        if (str == null || ((str.equals(language) && !str.equals("und")) || e01.d0().contains(str))) {
            f0Var.setClickable(false);
        } else {
            f0Var.setOnClickListener(new bi.c(unVar, str, language, charSequence, f0Var, 3));
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        a50.I0((a50) this.b, (Activity) this.c, (org.telegram.messenger.u3) this.d, view, i10);
    }

    @Override // org.telegram.ui.Components.ui0
    public void c(org.telegram.ui.Components.wi0 wi0Var, int i10) {
        int i11;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(wi0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i11 = view.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i11 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.m5.C(52.0f, i11, i10), true);
    }

    @Override // org.telegram.ui.t4
    public void d(b5 b5Var) {
        switch (this.a) {
            case 6:
                fn fnVar = (fn) this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = b5Var.ordinal();
                if (ordinal == 0) {
                    fnVar.r(user, false);
                    break;
                } else if (ordinal == 3) {
                    fnVar.m(q1Var, user);
                    break;
                } else if (ordinal == 4) {
                    fnVar.b(user);
                    break;
                } else if (ordinal == 5) {
                    fnVar.a.Ha(user);
                    break;
                }
                break;
            default:
                fn fnVar2 = (fn) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.d;
                int ordinal2 = b5Var.ordinal();
                if (ordinal2 == 0) {
                    fnVar2.p(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        fnVar2.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        fnVar2.a.Fa(chat);
                        break;
                    }
                } else {
                    fnVar2.k(q1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    public boolean e(TLRPC.Message message) {
        qm0 qm0Var = (qm0) this.b;
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) this.c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.kj.C1(message.peer_id) != qm0Var.l0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        org.telegram.messenger.i0.g3(new v50(qm0Var, z4Var, activity, message, 15));
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        String str;
        int i11;
        switch (this.a) {
            case 8:
                zo zoVar = (zo) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view = (View) this.d;
                cp cpVar = zoVar.a.h3;
                if (tL_username.editable) {
                    if (cpVar.r0 == null) {
                        cpVar.r0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = cpVar.X;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    cpVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new org.telegram.messenger.s6(zoVar, tL_channels_toggleUsername, tL_username, z10, 3));
                    cpVar.P.add(tL_username.username);
                    ((la) view).setLoading(true);
                }
                cpVar.b0();
                break;
            case 9:
                qp qpVar = (qp) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                qpVar.getClass();
                if (chatFull.hidden_prehistory) {
                    qpVar.getMessagesController().Y4(chat2.id, false);
                }
                qpVar.d0(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                v71 v71Var = (v71) this.b;
                if (org.telegram.ui.ActionBar.t6.l0(((x71) this.c).d, (org.telegram.ui.ActionBar.r6) this.d, true)) {
                    org.telegram.ui.ActionBar.t6.t1(false, false);
                    org.telegram.ui.ActionBar.t6.K1(org.telegram.ui.ActionBar.t6.I, v71Var.e.f == 1, -1, null);
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
                org.telegram.messenger.uz.h0 = str2;
                org.telegram.messenger.uz.y();
                org.telegram.messenger.uz.b = false;
                dataSettingsActivity.s0(dataSettingsActivity.n);
                org.telegram.messenger.ic.D().i(new yt(dataSettingsActivity, 2));
                alertDialog$Builder.a.N0.run();
                break;
            case 13:
                fz fzVar = (fz) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.i0.v1(editTextBoldCursor);
                alertDialog$Builder2.a.N0.run();
                hz hzVar = fzVar.E.c;
                hzVar.d.title = editTextBoldCursor.getText().toString();
                hzVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = hzVar.d;
                if (hzVar.E != 0) {
                    hzVar.getConnectionsManager().cancelRequest(hzVar.E, true);
                    hzVar.E = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = hzVar.c.a;
                tL_chatlists_editExportedInvite.slug = hzVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                hzVar.E = hzVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vy(hzVar, 1));
                org.telegram.messenger.r20 r20Var = hzVar.y;
                if (r20Var != null) {
                    r20Var.a(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                e40 e40Var = (e40) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder3 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.i0.v1(editTextBoldCursor2);
                org.telegram.messenger.u3 u3Var = e40Var.b.R2;
                String obj = editTextBoldCursor2.getText().toString();
                u3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = u3Var.g(u3Var.a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(u3Var.C.a).sendRequest(editgroupcalltitle, new org.telegram.messenger.m3(u3Var, 1));
                alertDialog$Builder3.a.N0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, arrayList, arrayList2, false));
                break;
            case 21:
                z31 z31Var = (z31) this.b;
                k41 k41Var = (k41) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i11 = ((org.telegram.ui.ActionBar.k2) k41Var.a).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(resetauthorization, new sl0(10, k41Var, tL_authorization));
                z31Var.d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.voip.q2
    public void j(org.telegram.ui.Components.voip.r2 r2Var) {
        zd1 zd1Var = (zd1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.i0.r(zd1Var.S0);
            zd1Var.R0 = false;
            if (zd1Var.w0.isTouchExplorationEnabled()) {
                r2Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? org.telegram.messenger.dd.L0(2131754731, null) : org.telegram.messenger.dd.L0(2131754730, null));
            }
            s2Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override // org.telegram.ui.ec1
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((q31) this.b).e1((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        bh.d dVar = (bh.d) this.b;
        vh.d dVar2 = (vh.d) this.c;
        int[] iArr = (int[]) this.d;
        org.telegram.messenger.f8.b("wear-auth: /answer delivered to " + ((String) dVar.c));
        int i10 = 0;
        dVar2.setLoading(false);
        int i11 = iArr[0];
        ArrayList arrayList = (ArrayList) dVar.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.b;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        org.telegram.ui.ActionBar.p6 resourceProvider = T != null ? T.getResourceProvider() : null;
        org.telegram.ui.ActionBar.z2 z2Var = qe1.c;
        if (z2Var != null) {
            z2Var.dismiss();
            qe1.c = null;
        }
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, resourceProvider, false);
        pe1 pe1Var = new pe1(context);
        k10.N = pe1Var;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        pe1Var.addView(f7, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
        TextView b10 = w7.g6.b(context, 20.0f, org.telegram.ui.ActionBar.t6.j5, true, resourceProvider);
        org.telegram.messenger.m5.l(b10, 17, null, 2131742973);
        f7.addView(b10, w7.b6.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i10 < arrayList.size()) {
            org.telegram.messenger.g6 f10 = org.telegram.messenger.k6.f((String) arrayList.get(i10));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(f10);
            org.telegram.messenger.at.i(imageView);
            int L = org.telegram.messenger.i0.L(80.0f);
            int i12 = org.telegram.ui.ActionBar.t6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.ui.ActionBar.t6.w0(i12, resourceProvider)));
            org.telegram.ui.ActionBar.w6 L3 = org.telegram.ui.ActionBar.a7.L(0.15f, i12);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.a7.k(imageView, L2, L3, null, resourceProvider);
            linearLayout.addView(imageView, w7.b6.k(i10 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i10++;
        }
        f7.addView(linearLayout, w7.b6.t(-2, -2, 49, 32, 12, 32, 12));
        vh.d i13 = org.telegram.messenger.a30.i(24, context, resourceProvider, true);
        i13.setText(org.telegram.messenger.dd.L0(2131742972, null));
        f7.addView(i13, w7.b6.t(-1, 48, 7, 12, 12, 12, 8));
        int i14 = org.telegram.ui.ActionBar.t6.a7;
        k10.w0(i14);
        k10.Q(i14);
        qe1.c = k10;
        k10.show();
        i13.setOnClickListener(new jg.w1(i13, i11, k10, 20));
    }

    @Override // org.telegram.messenger.ds
    public void run(long j10) {
        iq.f0((iq) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j10);
    }

    @Override // org.telegram.ui.tx
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        long j10;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i13) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                un unVar = (un) obj;
                PhotoViewer photoViewer = ((yp0) obj3).b;
                if (arrayList.size() > 1 || ((org.telegram.messenger.hs) arrayList.get(0)).a == org.telegram.messenger.e20.i(photoViewer.T).e() || charSequence != null) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        long j11 = ((org.telegram.messenger.hs) arrayList.get(i14)).a;
                        if (charSequence != null) {
                            j10 = j11;
                            org.telegram.messenger.rz.C(photoViewer.T).r0(org.telegram.messenger.pz.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j10 = j11;
                        }
                        org.telegram.messenger.rz.C(photoViewer.T).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    zxVar.finishFragment();
                    if (unVar != null) {
                        unVar.c8();
                        UndoView undoView = unVar.M3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.hs) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
                                break;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.hs hsVar = (org.telegram.messenger.hs) arrayList.get(0);
                    long j12 = hsVar.a;
                    Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                    if (org.telegram.messenger.o5.C(j12)) {
                        g10.putInt("enc_id", (int) (j12 & 4294967295L));
                    } else if (org.telegram.messenger.o5.E(j12)) {
                        g10.putLong("user_id", j12);
                    } else {
                        g10.putLong("chat_id", -j12);
                    }
                    un unVar2 = new un(g10);
                    if (hsVar.b != 0) {
                        gg.e.a(unVar2, hsVar);
                    }
                    if (((LaunchActivity) photoViewer.D).u0(unVar2, true, false)) {
                        unVar2.Yb(arrayList2);
                        break;
                    } else {
                        zxVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                cx0 cx0Var = (cx0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                zx zxVar2 = (zx) obj;
                long j13 = ((org.telegram.messenger.hs) arrayList.get(0)).a;
                ProfileActivity profileActivity = cx0Var.b;
                i12 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i12).L0(Long.valueOf(-j13));
                if (L0 == null || (!L0.creator && ((tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                    String L02 = org.telegram.messenger.dd.L0(2131754463, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L02;
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("AddMembersAlertNamesText", null, 2131754399, org.telegram.messenger.i20.p(user), L0 == null ? "" : L0.title));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754463, null), new dg(cx0Var, j13, zxVar, user, 2));
                    profileActivity.showDialog(x1Var);
                    break;
                } else {
                    profileActivity.getMessagesController().K(false, L0, user, new org.telegram.messenger.voip.d0(cx0Var, j13, zxVar2, 5));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kk0
    public boolean b(float f7, float f10, int i10, final View view) {
        String str;
        final d7 d7Var = (d7) this.b;
        org.telegram.ui.Components.uk0 uk0Var = (org.telegram.ui.Components.uk0) this.c;
        y6 y6Var = (y6) this.d;
        t7 t7Var = d7Var.f;
        f7 f7Var = (f7) uk0Var.getAdapter();
        final m7 m7Var = (m7) f7Var.e.get(i10);
        final int i11 = 1;
        if (!(view instanceof k7) && !(view instanceof org.telegram.ui.Cells.s7)) {
            i7 i7Var = t7Var.F;
            if (i7Var != null) {
                i7Var.a(m7Var.c, m7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(t7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.dd.L0(2131752648, null), false, null).setOnClickListener(new bi.c(d7Var, m7Var, f7Var, uk0Var, view, 1));
            str = null;
        } else {
            final int i12 = 0;
            if (((k7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.k7) {
                str = null;
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, org.telegram.messenger.dd.L0(2131747235, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.b7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                d7 d7Var2 = d7Var;
                                t7.b(d7Var2.f, m7Var.d, (k7) view);
                                org.telegram.ui.ActionBar.k1 k1Var = d7Var2.a;
                                if (k1Var != null) {
                                    k1Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                d7 d7Var3 = d7Var;
                                t7.b(d7Var3.f, m7Var.d, (k7) view);
                                org.telegram.ui.ActionBar.k1 k1Var2 = d7Var3.a;
                                if (k1Var2 != null) {
                                    k1Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                str = null;
                org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.dd.L0(2131752648, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.b7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                d7 d7Var2 = d7Var;
                                t7.b(d7Var2.f, m7Var.d, (k7) view);
                                org.telegram.ui.ActionBar.k1 k1Var = d7Var2.a;
                                if (k1Var != null) {
                                    k1Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                d7 d7Var3 = d7Var;
                                t7.b(d7Var3.f, m7Var.d, (k7) view);
                                org.telegram.ui.ActionBar.k1 k1Var2 = d7Var3.a;
                                if (k1Var2 != null) {
                                    k1Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        sh.a aVar = m7Var.d;
        if (aVar.b != 0 && aVar.g != 0) {
            org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, org.telegram.messenger.dd.L0(2131743578, str), false, null).setOnClickListener(new x(d7Var, m7Var, y6Var, i11));
        }
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.dd.L0(!t7Var.h.j.contains(m7Var.d) ? 2131745689 : 2131751459, str), false, null).setOnClickListener(new ag.t0(27, d7Var, m7Var));
        d7Var.a = org.telegram.ui.Components.s4.P(y6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f7, (int) f10);
        t7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.ui.Components.kk0
    public /* synthetic */ void p(float f7) {
    }

    @Override // org.telegram.ui.Components.kk0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
