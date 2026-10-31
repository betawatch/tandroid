package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.q4, org.telegram.messenger.l9, org.telegram.messenger.ri, org.telegram.ui.Components.hk0, org.telegram.ui.Components.ik0, zs0, org.telegram.messenger.zr, ty0, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ep0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 4:
                ss0 ss0Var = (ss0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                at0 at0Var = ss0Var.a;
                at0Var.e0.a(tL_messageMediaToDo);
                at0Var.finishFragment();
                break;
            default:
                ss0 ss0Var2 = (ss0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                at0 at0Var2 = ss0Var2.a;
                at0Var2.e0.a(tL_messageMediaPoll);
                at0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.zs0
    public void a(TLRPC.MessageMedia messageMedia) {
        x91 x91Var = (x91) this.b;
        un unVar = (un) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = x91Var.G.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        x91Var.G.k.media = messageMedia;
        unVar.getSendMessagesHelper().t(x91Var.G, null, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        ThemeActivity.a0((ThemeActivity) this.b, (Context) this.c, view, i10, f7);
    }

    @Override // org.telegram.messenger.ri
    public void c(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (!((org.telegram.messenger.qi) arrayList.get(i10)).a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.k6.c(((org.telegram.messenger.qi) arrayList.get(i10)).a);
                    if (org.telegram.messenger.k6.g(c10) != null) {
                        linkedHashSet.add(c10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    public File d() {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.messenger.b8.G(photoViewer.T);
                return org.telegram.messenger.b8.K(tLObject, null, true, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                org.telegram.messenger.b8.G(photoViewer2.T);
                return org.telegram.messenger.b8.N(message, false, true);
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        final x71 x71Var = (x71) this.b;
        final z71 z71Var = (z71) this.c;
        ThemeActivity themeActivity = x71Var.e;
        if (i10 >= 0 && i10 < z71Var.e.size()) {
            final org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) z71Var.e.get(i10);
            if (r6Var.a >= 100 && !r6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131747813, "OpenInEditor");
                String L02 = org.telegram.messenger.cd.L0(2131745444, "ShareTheme");
                TLRPC.TL_theme tL_theme = r6Var.r;
                CharSequence[] charSequenceArr = {L0, L02, (tL_theme == null || !tL_theme.creator) ? null : org.telegram.messenger.cd.L0(2131744170, "ThemeSetUrl"), org.telegram.messenger.cd.L0(2131751487, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.s71
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        x71 x71Var2 = x71.this;
                        ThemeActivity themeActivity2 = x71Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.r6 r6Var2 = r6Var;
                        if (i11 == 0) {
                            org.telegram.ui.Components.s4.V(themeActivity2, i11 != 1 ? 1 : 2, r6Var2.b, r6Var2);
                            return;
                        }
                        if (i11 == 1) {
                            if (r6Var2.r == null) {
                                themeActivity2.getMessagesController().v4(r6Var2.b, r6Var2);
                                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.s4, r6Var2.b, r6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + r6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.op0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i11 == 2) {
                            themeActivity2.presentFragment(new p91(r6Var2.b, r6Var2, false));
                            return;
                        }
                        if (i11 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String L03 = org.telegram.messenger.cd.L0(2131751485, "DeleteThemeTitle");
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder2.a;
                        x1Var.R = L03;
                        x1Var.T = org.telegram.messenger.cd.L0(2131751486, "DeleteThemeAlert");
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751599, "Delete"), new a7(x71Var2, z71Var, r6Var2, 22));
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                        themeActivity2.showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                        }
                    }
                };
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.P = charSequenceArr;
                x1Var.Q = iArr;
                x1Var.M = onClickListener;
                themeActivity.showDialog(x1Var);
                x1Var.m(x1Var.P0.size() - 1, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 2:
                PhotoViewer.D(((aq0) obj2).b, (ArrayList) obj);
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((aq0) obj2).b;
                es0 es0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.a7;
                ArrayList arrayList3 = photoViewer.d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!es0Var.N()) {
                    photoViewer.H0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i16 = photoViewer.P4;
                    if (i16 >= 0 && i16 < arrayList4.size()) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList4.get(photoViewer.P4);
                        if (jjVar.q4()) {
                            photoViewer.H0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i17 = photoViewer.w;
                            if (i17 != 0) {
                                arrayList7.add(Integer.valueOf(i17));
                            } else {
                                arrayList7.add(Integer.valueOf(jjVar.f1()));
                            }
                            if (!org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.k)) || jjVar.k.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(jjVar.k.random_id));
                                encryptedChat = org.telegram.messenger.vp.r1(photoViewer.T).Z0(Integer.valueOf((int) (org.telegram.messenger.jj.B0(jjVar.k) & 4294967295L)));
                                arrayList = arrayList8;
                            }
                            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(photoViewer.T);
                            long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                            int J1 = org.telegram.messenger.jj.J1(jjVar.k);
                            boolean z11 = zArr[0];
                            if (jjVar.p1) {
                                i11 = 1;
                            } else {
                                if (org.telegram.messenger.jj.d5(jjVar.k)) {
                                    i14 = 9;
                                } else if (org.telegram.messenger.jj.b4(jjVar.k)) {
                                    i14 = 5;
                                }
                                i11 = i14;
                            }
                            r12.Z(arrayList7, arrayList, encryptedChat, B0, J1, z11, i11);
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i18 = photoViewer.P4;
                    if (i18 >= 0 && i18 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.id));
                            org.telegram.messenger.vp.r1(photoViewer.T).Z(arrayList9, null, null, org.telegram.messenger.jj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.zs.f(photoViewer.T).k(39, new Object[0]);
                        }
                        if (!photoViewer.L1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.P4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.z5 > 0) {
                                    org.telegram.messenger.vp.r1(photoViewer.T).l0(tL_inputPhoto);
                                }
                                org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(photoViewer.T);
                                a02.a.c(new org.telegram.messenger.aq(4, photoViewer.z5, photo.id, a02));
                                arrayList2.remove(photoViewer.P4);
                                photoViewer.c7.remove(photoViewer.P4);
                                photoViewer.b7.remove(photoViewer.P4);
                                arrayList3.remove(photoViewer.P4);
                                arrayList6.remove(photoViewer.P4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.H0(false, false);
                                } else {
                                    int i19 = photoViewer.P4;
                                    if (i19 >= arrayList6.size()) {
                                        i19 = arrayList6.size() - 1;
                                    }
                                    photoViewer.P4 = -1;
                                    photoViewer.E2(i19);
                                }
                                if (message == null) {
                                    org.telegram.messenger.zs.f(photoViewer.T).k(39, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.z5 > 0) {
                                org.telegram.messenger.vp.r1(photoViewer.T).l0(null);
                            } else {
                                org.telegram.messenger.vp.r1(photoViewer.T).B(-photoViewer.z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.H0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (!arrayList5.isEmpty()) {
                        int i20 = photoViewer.P4;
                        if (i20 >= arrayList5.size()) {
                            i20 = arrayList5.size() - 1;
                        }
                        photoViewer.P4 = -1;
                        photoViewer.E2(i20);
                        break;
                    } else {
                        photoViewer.H0(false, false);
                        break;
                    }
                }
                break;
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 23:
            case 27:
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj2;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = org.telegram.messenger.vp.r1(z0Var.M).p1(z0Var.U);
                ConnectionsManager.getInstance(z0Var.M).sendRequest(allowsendmessage, new ag.p0(z0Var, (String[]) obj, x1Var, 16));
                break;
            case 7:
                ((PrivacyControlActivity) obj2).x0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ul0(i13, privacySettingsActivity, (org.telegram.ui.Cells.t8) obj));
                break;
            case 9:
                ProfileActivity.o0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                break;
            case 10:
                dx0 dx0Var = (dx0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                dx0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = dx0Var.b;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.C5(false, false);
                    break;
                }
                break;
            case 13:
                s31 s31Var = (s31) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    s31Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(s31Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 14:
                ThemeActivity.b0((ThemeActivity) obj2, (t11) obj);
                break;
            case 17:
                x71 x71Var = (x71) obj2;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) obj;
                x71Var.getClass();
                org.telegram.messenger.vp.r1(s6Var.E).u4(s6Var, null, s6Var == org.telegram.ui.ActionBar.t6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.t6.H;
                if (s6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.t6.I == s6Var) {
                        org.telegram.ui.ActionBar.t6.u(org.telegram.ui.ActionBar.t6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (s6Var == org.telegram.ui.ActionBar.t6.J) {
                        org.telegram.ui.ActionBar.t6.J = (org.telegram.ui.ActionBar.s6) hashMap.get("Dark Blue");
                    }
                    s6Var.t();
                    org.telegram.ui.ActionBar.t6.G.remove(s6Var);
                    hashMap.remove(s6Var.a);
                    org.telegram.ui.ActionBar.m6 m6Var = s6Var.i0;
                    if (m6Var != null) {
                        org.telegram.ui.ActionBar.m6.a(m6Var);
                    }
                    org.telegram.ui.ActionBar.t6.F.remove(s6Var);
                    new File(s6Var.b).delete();
                    org.telegram.ui.ActionBar.t6.y1(true, false);
                }
                if (z10) {
                    z4Var = ((org.telegram.ui.ActionBar.k2) x71Var.e).parentLayout;
                    ((ActionBarLayout) z4Var).W(true, true);
                }
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.o4, new Object[0]);
                break;
            case 21:
                tc1.a0((tc1) obj2, (byte[]) obj);
                break;
            case 22:
                be1 be1Var = (be1) obj2;
                ((boolean[]) obj)[0] = true;
                be1Var.p0 = 17;
                Intent intent = new Intent(be1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", be1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", be1Var.a);
                try {
                    be1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                    return;
                }
            case 24:
                org.telegram.ui.Wallet.t8 t8Var = (org.telegram.ui.Wallet.t8) obj2;
                t8Var.getClass();
                x1Var.dismiss();
                org.telegram.ui.Wallet.k8 k8Var = new org.telegram.ui.Wallet.k8();
                k8Var.r = !((Boolean) obj).booleanValue();
                t8Var.presentFragment(k8Var);
                break;
            case 25:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.z2) obj).dismiss();
                break;
            case 26:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                gf.e h = x1Var.h(i10, true, true);
                h.d();
                org.telegram.ui.Wallet.p8 p8Var = new org.telegram.ui.Wallet.p8((org.telegram.ui.Wallet.t8) obj2, h, i15);
                org.telegram.ui.Wallet.k0.H("disableBackupWithoutUpdatingPhrase");
                k0Var.m0(new e2.n0((Object) k0Var, (Object) new f11(i13, k0Var, p8Var), true, false, 4));
                break;
            case 28:
                org.telegram.ui.web.m.c0((org.telegram.ui.web.m) obj2, (HashSet) obj);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        bb1 bb1Var = (bb1) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        pb1 pb1Var = bb1Var.b;
        org.telegram.messenger.zs notificationCenter = pb1Var.getNotificationCenter();
        int i10 = org.telegram.messenger.zs.t;
        notificationCenter.n(pb1Var, i10);
        pb1Var.getNotificationCenter().k(i10, new Object[0]);
        pb1Var.finishFragment();
        pb1Var.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        cu0 cu0Var = (cu0) this.b;
        bu0 bu0Var = (bu0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = cu0Var.d.n;
        premiumPreviewFragment.n0.d(0, 0.0f, 0, bu0Var.getMeasuredWidth(), -bu0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.n0.f;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        bh.d dVar = (bh.d) this.b;
        vh.d dVar2 = (vh.d) this.c;
        org.telegram.messenger.f8.b("wear-auth: /token delivered to " + ((String) dVar.c));
        dVar2.setLoading(false);
        se1.d = null;
        org.telegram.ui.ActionBar.z2 z2Var = se1.c;
        if (z2Var != null) {
            z2Var.dismiss();
            se1.c = null;
        }
    }

    @Override // org.telegram.ui.ty0
    public void w(ui0 ui0Var) {
        sb1 sb1Var = (sb1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        vb1 vb1Var = sb1Var.a;
        vb1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        vb1Var.Z();
    }

    public /* synthetic */ ep0(ss0 ss0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 5;
        this.b = ss0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.ui.ty0
    public /* synthetic */ void b0() {
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
