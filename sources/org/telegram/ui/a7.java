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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements org.telegram.ui.Components.ej0, org.telegram.ui.Components.ph0, org.telegram.ui.Components.t4, org.telegram.messenger.pc, u4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.tr, org.telegram.ui.Components.cj0, qw, la1, org.telegram.ui.Components.voip.z2, OnSuccessListener {
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

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 2:
                an anVar = (an) this.b;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.c;
                Long l10 = (Long) this.d;
                anVar.getClass();
                anVar.Db(botInlineResult, z9, i7, l10.longValue());
                break;
            case 3:
            default:
                an anVar2 = (an) this.b;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                anVar2.getClass();
                if (z9) {
                    cg.a l11 = cg.a.l(suggestedPost != null ? suggestedPost.price : null);
                    long j3 = i7;
                    TLRPC.SuggestedPost suggestedPost2 = new TLRPC.SuggestedPost();
                    if (l11 != null && !l11.k()) {
                        suggestedPost2.price = l11.o();
                    }
                    if (j3 > 0) {
                        suggestedPost2.schedule_date = (int) j3;
                        suggestedPost2.flags |= 1;
                    }
                    if (ijVar != null && ijVar.k != null) {
                        anVar2.getMessagesController().h(ijVar, suggestedPost2);
                        break;
                    }
                }
                break;
            case 4:
                an.T0((an) this.b, (org.telegram.messenger.dj) this.c, (org.telegram.messenger.ij) this.d, i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        an anVar = (an) this.b;
        org.telegram.ui.Cells.f0 f0Var = (org.telegram.ui.Cells.f0) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String language = org.telegram.messenger.hd.E0().y.getLanguage();
        if (str == null || ((str.equals(language) && !str.equals("und")) || qy0.d0().contains(str))) {
            f0Var.setClickable(false);
        } else {
            f0Var.setOnClickListener(new di.d0(anVar, str, language, charSequence, f0Var, 7));
        }
    }

    @Override // org.telegram.ui.Components.ph0
    public void b(org.telegram.ui.Components.rh0 rh0Var, int i7) {
        int i10;
        View view = (View) this.b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
        int[] iArr = (int[]) this.d;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(rh0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = view.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30));
        } else {
            i10 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], org.telegram.messenger.k5.C(52.0f, i10, i7), true);
    }

    @Override // org.telegram.ui.u4
    public void c(c5 c5Var) {
        switch (this.a) {
            case 6:
                lm lmVar = (lm) this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int ordinal = c5Var.ordinal();
                if (ordinal == 0) {
                    lmVar.q(user, false);
                    break;
                } else if (ordinal == 3) {
                    lmVar.l(q1Var, user);
                    break;
                } else if (ordinal == 4) {
                    lmVar.b(user);
                    break;
                } else if (ordinal == 5) {
                    lmVar.a.Ma(user);
                    break;
                }
                break;
            default:
                lm lmVar2 = (lm) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.d;
                int ordinal2 = c5Var.ordinal();
                if (ordinal2 == 0) {
                    lmVar2.m(chat);
                    break;
                } else if (ordinal2 != 1 && ordinal2 != 2) {
                    if (ordinal2 == 4) {
                        lmVar2.a(chat);
                        break;
                    } else if (ordinal2 == 5) {
                        lmVar2.a.Ka(chat);
                        break;
                    }
                } else {
                    lmVar2.i(q1Var2, chat, 0, false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.z2
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        ec1 ec1Var = (ec1) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            org.telegram.messenger.g0.r(ec1Var.R0);
            ec1Var.Q0 = false;
            if (ec1Var.v0.isTouchExplorationEnabled()) {
                a3Var.announceForAccessibility(voIPService.isFrontFaceCamera() ? org.telegram.messenger.hd.M0(2131754731, null) : org.telegram.messenger.hd.M0(2131754730, null));
            }
            b3Var.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    public boolean e(TLRPC.Message message) {
        hl0 hl0Var = (hl0) this.b;
        org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) this.c;
        Activity activity = (Activity) this.d;
        if (org.telegram.messenger.ij.C1(message.peer_id) != hl0Var.l0.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(hl0Var, q4Var, activity, message, 25));
        return true;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        c40.I0((c40) this.b, (Activity) this.c, (org.telegram.messenger.r3) this.d, view, i7);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String str;
        int i10;
        switch (this.a) {
            case 8:
                co coVar = (co) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                View view = (View) this.d;
                go goVar = coVar.a.h3;
                if (tL_username.editable) {
                    if (goVar.r0 == null) {
                        goVar.r0 = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    TLRPC.Chat chat = goVar.X;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z9 = tL_username.active;
                    tL_channels_toggleUsername.active = !z9;
                    goVar.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new bi.d4(coVar, tL_channels_toggleUsername, tL_username, z9, 5));
                    goVar.P.add(tL_username.username);
                    ((ia) view).setLoading(true);
                }
                goVar.b0();
                break;
            case 9:
                so soVar = (so) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.c;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.d;
                soVar.getClass();
                if (chatFull.hidden_prehistory) {
                    soVar.getMessagesController().b5(chat2.id, false);
                }
                soVar.d0(chat2, null);
                break;
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                f61 f61Var = (f61) this.b;
                if (org.telegram.ui.ActionBar.k6.l0(((h61) this.c).d, (org.telegram.ui.ActionBar.h6) this.d, true)) {
                    org.telegram.ui.ActionBar.k6.t1(false, false);
                    org.telegram.ui.ActionBar.k6.K1(org.telegram.ui.ActionBar.k6.I, f61Var.e.f == 1, -1, null);
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
                org.telegram.messenger.iz.h0 = str2;
                org.telegram.messenger.iz.y();
                org.telegram.messenger.iz.b = false;
                dataSettingsActivity.s0(dataSettingsActivity.n);
                org.telegram.messenger.gc.D().i(new ws(dataSettingsActivity, 2));
                alertDialog$Builder.a.L0.run();
                break;
            case 13:
                ey eyVar = (ey) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder2 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.g0.v1(editTextBoldCursor);
                alertDialog$Builder2.a.L0.run();
                gy gyVar = eyVar.E.c;
                gyVar.d.title = editTextBoldCursor.getText().toString();
                gyVar.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = gyVar.d;
                if (gyVar.E != 0) {
                    gyVar.getConnectionsManager().cancelRequest(gyVar.E, true);
                    gyVar.E = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = gyVar.c.a;
                tL_chatlists_editExportedInvite.slug = gyVar.g0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                gyVar.E = gyVar.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new tx(gyVar, 1));
                org.telegram.messenger.c20 c20Var = gyVar.y;
                if (c20Var != null) {
                    c20Var.a(tL_exportedChatlistInvite);
                    break;
                }
                break;
            case 15:
                h30 h30Var = (h30) this.b;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.c;
                AlertDialog$Builder alertDialog$Builder3 = (AlertDialog$Builder) this.d;
                org.telegram.messenger.g0.v1(editTextBoldCursor2);
                org.telegram.messenger.r3 r3Var = h30Var.b.R2;
                String obj = editTextBoldCursor2.getText().toString();
                r3Var.getClass();
                TL_phone.editGroupCallTitle editgroupcalltitle = new TL_phone.editGroupCallTitle();
                editgroupcalltitle.call = r3Var.g(r3Var.a);
                editgroupcalltitle.title = obj;
                ConnectionsManager.getInstance(r3Var.C.a).sendRequest(editgroupcalltitle, new org.telegram.messenger.k3(r3Var, 1));
                alertDialog$Builder3.a.L0.run();
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
                i10 = ((org.telegram.ui.ActionBar.f2) v21Var.a).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(resetauthorization, new h50(26, v21Var, tL_authorization));
                k21Var.d.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.la1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((a21) this.b).e1((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        fi.d dVar = (fi.d) this.c;
        int[] iArr = (int[]) this.d;
        org.telegram.messenger.a8.b("wear-auth: /answer delivered to " + ((String) r7Var.d));
        int i7 = 0;
        dVar.setLoading(false);
        int i10 = iArr[0];
        ArrayList arrayList = (ArrayList) r7Var.f;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        org.telegram.ui.ActionBar.f6 resourceProvider = T != null ? T.getResourceProvider() : null;
        org.telegram.ui.ActionBar.v2 v2Var = uc1.c;
        if (v2Var != null) {
            v2Var.dismiss();
            uc1.c = null;
        }
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, resourceProvider, false);
        tc1 tc1Var = new tc1(context);
        l10.N = tc1Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        tc1Var.addView(f10, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        TextView b10 = c8.qa.b(context, 20.0f, org.telegram.ui.ActionBar.k6.j5, true, resourceProvider);
        org.telegram.messenger.k5.m(b10, 17, null, 2131742948);
        f10.addView(b10, c8.ha.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        while (i7 < arrayList.size()) {
            org.telegram.messenger.e6 f11 = org.telegram.messenger.i6.f((String) arrayList.get(i7));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(f11);
            org.telegram.messenger.qs.i(imageView);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.w0(i11, resourceProvider)));
            org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.15f, i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.r6.k(imageView, L2, L3, null, resourceProvider);
            linearLayout.addView(imageView, c8.ha.k(i7 == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
            i7++;
        }
        f10.addView(linearLayout, c8.ha.t(-2, -2, 49, 32, 12, 32, 12));
        fi.d h = org.telegram.messenger.k5.h(24, context, resourceProvider, true);
        h.setText(org.telegram.messenger.hd.M0(2131742947, null));
        f10.addView(h, c8.ha.t(-1, 48, 7, 12, 12, 12, 8));
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        l10.w0(i12);
        l10.P(i12);
        uc1.c = l10;
        l10.show();
        h.setOnClickListener(new bi.la(h, i10, l10, 20));
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        kp.f0((kp) this.b, (TLRPC.InputCheckPasswordSRP) this.c, (TwoStepVerificationActivity) this.d, j3);
    }

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
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
                an anVar = (an) obj;
                PhotoViewer photoViewer = ((qo0) obj3).b;
                if (arrayList.size() > 1 || ((org.telegram.messenger.xr) arrayList.get(0)).a == org.telegram.messenger.p10.i(photoViewer.T).e() || charSequence != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        long j10 = ((org.telegram.messenger.xr) arrayList.get(i13)).a;
                        if (charSequence != null) {
                            j3 = j10;
                            org.telegram.messenger.gz.C(photoViewer.T).r0(org.telegram.messenger.ez.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j3 = j10;
                        }
                        org.telegram.messenger.gz.C(photoViewer.T).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    wwVar.finishFragment();
                    if (anVar != null) {
                        anVar.f8();
                        UndoView undoView = anVar.M3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(((org.telegram.messenger.xr) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
                                break;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.xr xrVar = (org.telegram.messenger.xr) arrayList.get(0);
                    long j11 = xrVar.a;
                    Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                    if (org.telegram.messenger.m5.C(j11)) {
                        k10.putInt("enc_id", (int) (j11 & 4294967295L));
                    } else if (org.telegram.messenger.m5.E(j11)) {
                        k10.putLong("user_id", j11);
                    } else {
                        k10.putLong("chat_id", -j11);
                    }
                    an anVar2 = new an(k10);
                    if (xrVar.b != 0) {
                        qg.d.a(anVar2, xrVar);
                    }
                    if (((LaunchActivity) photoViewer.D).u0(anVar2, true, false)) {
                        anVar2.dc(arrayList2);
                        break;
                    } else {
                        wwVar.finishFragment();
                        break;
                    }
                }
                break;
            default:
                rv0 rv0Var = (rv0) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                ww wwVar2 = (ww) obj;
                long j12 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
                ProfileActivity profileActivity = rv0Var.b;
                i11 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i11).M0(Long.valueOf(-j12));
                if (M0 == null || (!M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.add_admins))) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                    String M02 = org.telegram.messenger.hd.M0(2131754463, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M02;
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("AddMembersAlertNamesText", null, 2131754399, org.telegram.messenger.t10.p(user), M0 == null ? "" : M0.title));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754463, null), new bg.e0(rv0Var, j12, wwVar, user, 5));
                    profileActivity.showDialog(u1Var);
                    break;
                } else {
                    profileActivity.getMessagesController().K(M0, user, new bi.i(rv0Var, j12, wwVar2, 8));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, final View view) {
        String str;
        final d7 d7Var = (d7) this.b;
        org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) this.c;
        y6 y6Var = (y6) this.d;
        t7 t7Var = d7Var.f;
        f7 f7Var = (f7) pj0Var.getAdapter();
        final m7 m7Var = (m7) f7Var.e.get(i7);
        final int i10 = 1;
        if (!(view instanceof k7) && !(view instanceof org.telegram.ui.Cells.o7)) {
            i7 i7Var = t7Var.F;
            if (i7Var != null) {
                i7Var.o(m7Var.c, m7Var.d, true);
            }
            return true;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(t7Var.getContext(), null);
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131752648, null), false, null).setOnClickListener(new di.d0(d7Var, m7Var, f7Var, pj0Var, view, 5));
            str = null;
        } else {
            final int i11 = 0;
            if (((k7) view).b.getChildAt(0) instanceof org.telegram.ui.Cells.g7) {
                str = null;
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_played, org.telegram.messenger.hd.M0(2131747219, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.b7
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
                org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_view_file, org.telegram.messenger.hd.M0(2131752648, null), false, null).setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.b7
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
        ci.b bVar = m7Var.d;
        if (bVar.b != 0 && bVar.g != 0) {
            org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_viewintopic, org.telegram.messenger.hd.M0(2131743553, str), false, null).setOnClickListener(new z(d7Var, m7Var, y6Var, i10));
        }
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, org.telegram.messenger.hd.M0(!t7Var.h.j.contains(m7Var.d) ? 2131745673 : 2131751459, str), false, null).setOnClickListener(new org.telegram.ui.ActionBar.l1(5, d7Var, m7Var));
        d7Var.a = org.telegram.ui.Components.v4.N(y6Var, actionBarPopupWindow$ActionBarPopupWindowLayout, view, (int) f10, (int) f11);
        t7Var.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
