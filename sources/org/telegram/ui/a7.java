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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements org.telegram.ui.Components.tj0, org.telegram.ui.Components.ei0, org.telegram.ui.Components.z4, org.telegram.messenger.nc, u4, org.telegram.ui.ActionBar.q1, org.telegram.messenger.or, org.telegram.ui.Components.rj0, vw, ma1, org.telegram.ui.Components.voip.d3, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a7(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 2:
                bn bnVar = (bn) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l10 = (Long) this.d;
                bnVar.getClass();
                bnVar.Hb(botInlineResult, z10, i7, l10.longValue());
                break;
            case 3:
            default:
                bn bnVar2 = (bn) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
                bnVar2.getClass();
                if (z10) {
                    cg.a m10 = cg.a.m(suggestedPost != null ? suggestedPost.price : null);
                    long j3 = i7;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (m10 != null && !m10.l()) {
                        suggestedPost2.price = m10.q();
                    }
                    if (j3 > 0) {
                        suggestedPost2.schedule_date = (int) j3;
                        suggestedPost2.flags |= 1;
                    }
                    if (fjVar != null && fjVar.k != null) {
                        bnVar2.getMessagesController().h(fjVar, suggestedPost2);
                        break;
                    }
                }
                break;
            case 4:
                bn.C0((bn) this.b, (org.telegram.messenger.aj) this.c, (org.telegram.messenger.fj) this.d, i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(bx bxVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        bn bnVar = (bn) this.b;
        org.telegram.ui.Cells.g0 g0Var = (org.telegram.ui.Cells.g0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.gd.E0().y.getLanguage();
        if (str == null || ((str.equals(language) && !str.equals("und")) || ry0.d0().contains(str))) {
            g0Var.setClickable(false);
        } else {
            g0Var.setOnClickListener(new fi.d0(bnVar, str, language, charSequence, g0Var, 7));
        }
    }

    @Override // org.telegram.ui.Components.ei0
    public void b(org.telegram.ui.Components.gi0 gi0Var, int i7) {
        int i10;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(gi0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.f3.C(52.0f, i10, i7), true);
    }

    @Override // org.telegram.ui.u4
    public void c(c5 c5Var) {
        switch (this.a) {
            case 6:
                mm mmVar = (mm) this.b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal == 0) {
                    mmVar.n(user, false);
                    break;
                } else if (ordinal == 3) {
                    mmVar.j(r1Var, user);
                    break;
                } else if (ordinal == 4) {
                    mmVar.b(user);
                    break;
                } else if (ordinal == 5) {
                    mmVar.a.Pa(user);
                    break;
                }
                break;
            default:
                mm mmVar2 = (mm) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 == 0) {
                    mmVar2.l(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        mmVar2.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        mmVar2.a.Na(chat);
                        break;
                    }
                } else {
                    mmVar2.h(r1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.d3
    public void d(org.telegram.ui.Components.voip.e3 e3Var) {
        fc1 fc1Var = (fc1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.f3 f3Var = (org.telegram.ui.Components.voip.f3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.g0.r(fc1Var.S0);
            fc1Var.R0 = false;
            if (fc1Var.w0.isTouchExplorationEnabled()) {
                e3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? org.telegram.messenger.gd.N0(2131754730, null) : org.telegram.messenger.gd.N0(2131754729, null));
            }
            f3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    public boolean e(TLRPC.Message message) {
        kl0 kl0Var = (kl0) this.b;
        org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) this.c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.fj.B1(message.peer_id) != kl0Var.m0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        org.telegram.messenger.g0.g3(new yd0(kl0Var, r4Var, activity, message, 3));
        return true;
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        e40.J0((e40) this.b, (Activity) this.c, (org.telegram.messenger.t3) this.d, view, i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str;
        int i10;
        switch (this.a) {
            case 8:
                fo foVar = (fo) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view = (View) this.d;
                io ioVar = foVar.a.i3;
                if (tL_username.editable) {
                    if (ioVar.s0 == null) {
                        ioVar.s0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = ioVar.Y;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z10 = tL_username.active;
                    tL_channels_toggleUsername.active = !z10;
                    ioVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new di.j3(foVar, tL_channels_toggleUsername, tL_username, z10, 5));
                    ioVar.Q.add(tL_username.username);
                    ((ia) view).setLoading(true);
                }
                ioVar.b0();
                break;
            case 9:
                uo uoVar = (uo) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                uoVar.getClass();
                if (chatFull.hidden_prehistory) {
                    uoVar.getMessagesController().n5(chat2.id, false);
                }
                uoVar.d0(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                e61 e61Var = (e61) this.b;
                if (org.telegram.ui.ActionBar.n6.l0(((g61) this.c).d, (org.telegram.ui.ActionBar.k6) this.d, true)) {
                    org.telegram.ui.ActionBar.n6.t1(false, false);
                    org.telegram.ui.ActionBar.n6.K1(org.telegram.ui.ActionBar.n6.I, e61Var.e.f == 1, -1, null);
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
                org.telegram.messenger.bz.h0 = str2;
                org.telegram.messenger.bz.y();
                org.telegram.messenger.bz.b = false;
                dataSettingsActivity.s0(dataSettingsActivity.n);
                org.telegram.messenger.ec.D().i(new at(dataSettingsActivity, 2));
                alertDialog$Builder.a.M0.run();
                break;
            case 13:
                hy hyVar = (hy) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                alertDialog$Builder2.a.M0.run();
                jy jyVar = hyVar.F.c;
                jyVar.d.title = editTextBoldCursor.getText().toString();
                jyVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = jyVar.d;
                if (jyVar.F != 0) {
                    jyVar.getConnectionsManager().cancelRequest(jyVar.F, true);
                    jyVar.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = jyVar.c.a;
                tL_chatlists_editExportedInvite.slug = jyVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                jyVar.F = jyVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new wx(jyVar, 1));
                org.telegram.messenger.w10 w10Var = jyVar.y;
                if (w10Var != null) {
                    w10Var.a(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                j30 j30Var = (j30) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder3 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.g0.v1(editTextBoldCursor2);
                org.telegram.messenger.t3 t3Var = j30Var.b.V2;
                String obj = editTextBoldCursor2.getText().toString();
                t3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = t3Var.g(t3Var.a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(t3Var.C.a).sendRequest(editgroupcalltitle, new org.telegram.messenger.m3(t3Var, 1));
                alertDialog$Builder3.a.M0.run();
                break;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, arrayList, arrayList2, false));
                break;
            case 21:
                k21 k21Var = (k21) this.b;
                v21 v21Var = (v21) this.c;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.d;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i10 = ((org.telegram.ui.ActionBar.g2) v21Var.a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new d00(28, v21Var, tL_authorization));
                k21Var.d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ma1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((a21) this.b).f1((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        hi.e eVar = (hi.e) this.c;
        int[] iArr = (int[]) this.d;
        org.telegram.messenger.a8.b("wear-auth: /answer delivered to " + ((String) r7Var.d));
        int i7 = 0;
        eVar.setLoading(false);
        int i10 = iArr[0];
        ArrayList arrayList = (ArrayList) r7Var.f;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        org.telegram.ui.ActionBar.i6 resourceProvider = T != null ? T.getResourceProvider() : null;
        org.telegram.ui.ActionBar.w2 w2Var = wc1.c;
        if (w2Var != null) {
            w2Var.dismiss();
            wc1.c = null;
        }
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, resourceProvider, false);
        vc1 vc1Var = new vc1(context);
        j3.O = vc1Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        vc1Var.addView(g10, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        TextView b10 = c8.wa.b(context, 20.0f, org.telegram.ui.ActionBar.n6.j5, true, resourceProvider);
        org.telegram.messenger.f3.k(b10, 17, null, 2131742676);
        g10.addView(b10, c8.na.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i7 < arrayList.size()) {
            org.telegram.messenger.f6 f10 = org.telegram.messenger.j6.f((String) arrayList.get(i7));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(f10);
            org.telegram.messenger.ks.i(imageView);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.n6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.r1(0.15f, org.telegram.ui.ActionBar.n6.w0(i11, resourceProvider)));
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.15f, i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.u6.j(imageView, L2, K, null, resourceProvider);
            linearLayout.addView(imageView, c8.na.k(i7 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i7++;
        }
        g10.addView(linearLayout, c8.na.t(-2, -2, 49, 32, 12, 32, 12));
        hi.e g11 = org.telegram.messenger.m10.g(24, context, resourceProvider, true);
        g11.setText(org.telegram.messenger.gd.N0(2131742675, null));
        g10.addView(g11, c8.na.t(-1, 48, 7, 12, 12, 12, 8));
        int i12 = org.telegram.ui.ActionBar.n6.a7;
        j3.w0(i12);
        j3.Q(i12);
        wc1.c = j3;
        j3.show();
        g11.setOnClickListener(new bi.k5(g11, i10, j3, 23));
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        np.f0((np) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override // org.telegram.ui.vw
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        long j3;
        int i11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i12 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i12) {
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                bn bnVar = (bn) obj;
                PhotoViewer photoViewer = ((ro0) obj3).b;
                if (arrayList.size() > 1 || ((org.telegram.messenger.sr) arrayList.get(0)).a == org.telegram.messenger.i10.i(photoViewer.U).e() || charSequence != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j10 = ((org.telegram.messenger.sr) arrayList.get(i13)).a;
                        if (charSequence != null) {
                            j3 = j10;
                            org.telegram.messenger.zy.C(photoViewer.U).r0(org.telegram.messenger.xy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j10;
                        }
                        org.telegram.messenger.zy.C(photoViewer.U).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    bxVar.finishFragment();
                    if (bnVar != null) {
                        bnVar.h8();
                        UndoView undoView = bnVar.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.sr) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
                                break;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.sr srVar = (org.telegram.messenger.sr) arrayList.get(0);
                    long j11 = srVar.a;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    if (org.telegram.messenger.n5.C(j11)) {
                        k10.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (org.telegram.messenger.n5.E(j11)) {
                        k10.putLong("user_id", j11);
                    } else {
                        k10.putLong("chat_id", -j11);
                    }
                    bn bnVar2 = new bn(k10);
                    if (srVar.b != 0) {
                        qg.c.a(bnVar2, srVar);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(bnVar2, true, false)) {
                        bnVar2.hc(arrayList2);
                        break;
                    } else {
                        bxVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                qv0 qv0Var = (qv0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                bx bxVar2 = (bx) obj;
                long j12 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
                ProfileActivity profileActivity = qv0Var.b;
                i11 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i11).O0(Long.valueOf(-j12));
                if (O0 == null || (!O0.creator && ((tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                    String N0 = org.telegram.messenger.gd.N0(2131754460, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("AddMembersAlertNamesText", null, 2131754396, org.telegram.messenger.n10.q(user), O0 == null ? "" : O0.title));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754460, null), new bg.f0(qv0Var, j12, bxVar, user, 6));
                    profileActivity.showDialog(t1Var);
                    break;
                } else {
                    profileActivity.getMessagesController().K(O0, user, new di.h(qv0Var, j12, bxVar2, 9));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean g(float f10, float f11, int i7, final View view) {
        String str;
        final d7 d7Var = (d7) this.b;
        org.telegram.ui.Components.ek0 ek0Var = (org.telegram.ui.Components.ek0) this.c;
        y6 y6Var = (y6) this.d;
        t7 t7Var = d7Var.f;
        f7 f7Var = (f7) ek0Var.getAdapter();
        final m7 m7Var = (m7) f7Var.e.get(i7);
        final int i10 = 1;
        if (!(view instanceof k7) && !(view instanceof org.telegram.ui.Cells.o7)) {
            i7 i7Var = t7Var.G;
            if (i7Var != null) {
                i7Var.O(m7Var.c, m7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(t7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.gd.N0(2131752636, null), false, null).setOnClickListener(new fi.d0(d7Var, m7Var, f7Var, ek0Var, view, 5));
            str = null;
        } else {
            final int i11 = 0;
            if (((k7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.g7) {
                str = null;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, org.telegram.messenger.gd.N0(2131747026, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.b7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                d7 d7Var2 = d7Var;
                                t7.b(d7Var2.f, m7Var.d, (k7) view);
                                org.telegram.ui.ActionBar.g1 g1Var = d7Var2.a;
                                if (g1Var != null) {
                                    g1Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                d7 d7Var3 = d7Var;
                                t7.b(d7Var3.f, m7Var.d, (k7) view);
                                org.telegram.ui.ActionBar.g1 g1Var2 = d7Var3.a;
                                if (g1Var2 != null) {
                                    g1Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                str = null;
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.gd.N0(2131752636, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.b7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                d7 d7Var2 = d7Var;
                                t7.b(d7Var2.f, m7Var.d, (k7) view);
                                org.telegram.ui.ActionBar.g1 g1Var = d7Var2.a;
                                if (g1Var != null) {
                                    g1Var.d(true);
                                    break;
                                }
                                break;
                            default:
                                d7 d7Var3 = d7Var;
                                t7.b(d7Var3.f, m7Var.d, (k7) view);
                                org.telegram.ui.ActionBar.g1 g1Var2 = d7Var3.a;
                                if (g1Var2 != null) {
                                    g1Var2.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        ei.b bVar = m7Var.d;
        if (bVar.b != 0 && bVar.g != 0) {
            org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, org.telegram.messenger.gd.N0(2131743302, str), false, null).setOnClickListener(new y(d7Var, m7Var, y6Var, i10));
        }
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.gd.N0(!t7Var.h.j.contains(m7Var.d) ? 2131745476 : 2131751446, str), false, null).setOnClickListener(new oi.i1(7, d7Var, m7Var));
        d7Var.a = org.telegram.ui.Components.b5.N(y6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        t7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void l(float f10) {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
