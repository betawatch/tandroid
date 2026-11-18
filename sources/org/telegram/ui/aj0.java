package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj0 implements org.telegram.ui.ActionBar.r1, ss, org.telegram.ui.Components.z4, org.telegram.messenger.i9, org.telegram.messenger.oi, org.telegram.ui.Components.pj0, org.telegram.ui.Components.qj0, or0, org.telegram.messenger.lr, ix0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aj0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 8:
                hr0 hr0Var = (hr0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                pr0 pr0Var = hr0Var.a;
                pr0Var.f0.a(tL_messageMediaToDo);
                pr0Var.finishFragment();
                break;
            default:
                hr0 hr0Var2 = (hr0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                pr0 pr0Var2 = hr0Var2.a;
                pr0Var2.f0.a(tL_messageMediaPoll);
                pr0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.or0
    public void a(TLRPC.MessageMedia messageMedia) {
        i81 i81Var = (i81) this.b;
        bn bnVar = (bn) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = i81Var.H.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        i81Var.H.k.media = messageMedia;
        bnVar.getSendMessagesHelper().t(i81Var.H, null, null, null, null, null, null, null, false, false, null);
    }

    @Override // org.telegram.ui.ss
    public void b(ps psVar) {
        hk0 hk0Var = (hk0) this.b;
        int intValue = ((Integer) ((View) this.c).getTag()).intValue();
        EditTextBoldCursor editTextBoldCursor = hk0Var.Z[intValue];
        if (intValue == 5) {
            hk0Var.s = psVar.d;
        } else {
            hk0Var.w = psVar.d;
        }
        editTextBoldCursor.setText(psVar.a);
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        final g61 g61Var = (g61) this.b;
        final i61 i61Var = (i61) this.c;
        ThemeActivity themeActivity = g61Var.e;
        if (i7 >= 0 && i7 < i61Var.e.size()) {
            final org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) i61Var.e.get(i7);
            if (k6Var.a >= 100 && !k6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131747604, "OpenInEditor");
                String M02 = org.telegram.messenger.gd.M0(2131745231, "ShareTheme");
                TLRPC.TL_theme tL_theme = k6Var.r;
                CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : org.telegram.messenger.gd.M0(2131743910, "ThemeSetUrl"), org.telegram.messenger.gd.M0(2131751475, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.b61
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        g61 g61Var2 = g61.this;
                        ThemeActivity themeActivity2 = g61Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.k6 k6Var2 = k6Var;
                        if (i10 == 0) {
                            org.telegram.ui.Components.b5.T(themeActivity2, i10 != 1 ? 1 : 2, k6Var2.b, k6Var2);
                            return;
                        }
                        if (i10 == 1) {
                            if (k6Var2.r == null) {
                                themeActivity2.getMessagesController().H4(k6Var2.b, k6Var2);
                                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.v4, k6Var2.b, k6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().X2 + "/addtheme/" + k6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.yo0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i10 == 2) {
                            themeActivity2.presentFragment(new a81(k6Var2.b, k6Var2, false));
                            return;
                        }
                        if (i10 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String M03 = org.telegram.messenger.gd.M0(2131751473, "DeleteThemeTitle");
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                        u1Var.S = M03;
                        u1Var.U = org.telegram.messenger.gd.M0(2131751474, "DeleteThemeAlert");
                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131751587, "Delete"), new z6(g61Var2, i61Var, k6Var2, 22));
                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), null);
                        themeActivity2.showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                        }
                    }
                };
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.Q = charSequenceArr;
                u1Var.R = iArr;
                u1Var.N = onClickListener;
                themeActivity.showDialog(u1Var);
                u1Var.m(u1Var.O0.size() - 1, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.q7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.lr
    public void d(boolean z10) {
        j91 j91Var = (j91) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        y91 y91Var = j91Var.b;
        org.telegram.messenger.ks notificationCenter = y91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.ks.t;
        notificationCenter.n(y91Var, i7);
        y91Var.getNotificationCenter().k(i7, new Object[0]);
        y91Var.finishFragment();
        y91Var.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.oi
    public void e(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.ni) arrayList.get(i7)).a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.j6.c(((org.telegram.messenger.ni) arrayList.get(i7)).a);
                    if (org.telegram.messenger.j6.g(c10) != null) {
                        linkedHashSet.add(c10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        ThemeActivity.b0((ThemeActivity) this.b, (Context) this.c, view, i7, f10);
    }

    public File g() {
        switch (this.a) {
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.messenger.w7.G(photoViewer.U);
                return org.telegram.messenger.w7.J(tLObject, null, true, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                org.telegram.messenger.w7.G(photoViewer2.U);
                return org.telegram.messenger.w7.M(message, false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z10;
        org.telegram.ui.ActionBar.s4 s4Var;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                int[] iArr = ((hk0) obj2).y;
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                ((EditTextBoldCursor) obj).setText(org.telegram.messenger.gd.M0(2131747301, null));
                break;
            case 1:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 15:
            case 16:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.z8 z8Var = new org.telegram.ui.Wallet.z8((org.telegram.ui.Wallet.d9) obj2, h, i13);
                org.telegram.ui.Wallet.u0.P("disableBackupWithoutUpdatingPhrase");
                u0Var.x0(new h2.n0((Object) u0Var, (Object) new p51(6, u0Var, z8Var), true, false, 4));
                break;
            case 2:
                hk0.Z((hk0) obj2, (TLRPC.TL_auth_passwordRecovery) obj);
                break;
            case 3:
                ml0 ml0Var = (ml0) obj2;
                ml0Var.c0 = true;
                ml0Var.b0.email_unconfirmed_pattern = (String) obj;
                ml0Var.P0();
                break;
            case 6:
                PhotoViewer.u(((ro0) obj2).b, (ArrayList) obj);
                break;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((ro0) obj2).b;
                uq0 uq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.a7;
                ArrayList arrayList3 = photoViewer.d7;
                ArrayList arrayList4 = photoViewer.Y6;
                ArrayList arrayList5 = photoViewer.e7;
                ArrayList arrayList6 = photoViewer.f7;
                if (!uq0Var.N()) {
                    photoViewer.z0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i14 = photoViewer.P4;
                    if (i14 >= 0 && i14 < arrayList4.size()) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(photoViewer.P4);
                        if (fjVar.q4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i15 = photoViewer.w;
                            if (i15 != 0) {
                                arrayList7.add(Integer.valueOf(i15));
                            } else {
                                arrayList7.add(Integer.valueOf(fjVar.e1()));
                            }
                            if (!org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(fjVar.k)) || fjVar.k.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(fjVar.k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.mp.u1(photoViewer.U).c1(Integer.valueOf((int) (org.telegram.messenger.fj.B0(fjVar.k) & 4294967295L)));
                            }
                            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(photoViewer.U);
                            long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                            int I1 = org.telegram.messenger.fj.I1(fjVar.k);
                            boolean z11 = zArr[0];
                            if (fjVar.r1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.fj.d5(fjVar.k)) {
                                    i12 = 9;
                                } else if (org.telegram.messenger.fj.b4(fjVar.k)) {
                                    i12 = 5;
                                }
                                i10 = i12;
                            }
                            u12.Z(arrayList7, arrayList, encryptedChat, B0, I1, z11, i10);
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i16 = photoViewer.P4;
                    if (i16 >= 0 && i16 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.P4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.id));
                            org.telegram.messenger.mp.u1(photoViewer.U).Z(arrayList9, null, null, org.telegram.messenger.fj.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.ks.f(photoViewer.U).k(39, new Object[0]);
                        }
                        if (!photoViewer.G1()) {
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
                                    org.telegram.messenger.mp.u1(photoViewer.U).l0(tL_inputPhoto);
                                }
                                org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(photoViewer.U);
                                a02.a.c(new org.telegram.messenger.np(4, photoViewer.z5, photo.id, a02));
                                arrayList2.remove(photoViewer.P4);
                                photoViewer.c7.remove(photoViewer.P4);
                                photoViewer.b7.remove(photoViewer.P4);
                                arrayList3.remove(photoViewer.P4);
                                arrayList6.remove(photoViewer.P4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.z0(false, false);
                                } else {
                                    int i17 = photoViewer.P4;
                                    if (i17 >= arrayList6.size()) {
                                        i17 = arrayList6.size() - 1;
                                    }
                                    photoViewer.P4 = -1;
                                    photoViewer.z2(i17);
                                }
                                if (message == null) {
                                    org.telegram.messenger.ks.f(photoViewer.U).k(39, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.z5 > 0) {
                                org.telegram.messenger.mp.u1(photoViewer.U).l0(null);
                            } else {
                                org.telegram.messenger.mp.u1(photoViewer.U).B(-photoViewer.z5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.P4);
                    photoViewer.d.B(photoViewer.P4);
                    if (!arrayList5.isEmpty()) {
                        int i18 = photoViewer.P4;
                        if (i18 >= arrayList5.size()) {
                            i18 = arrayList5.size() - 1;
                        }
                        photoViewer.P4 = -1;
                        photoViewer.z2(i18);
                        break;
                    } else {
                        photoViewer.z0(false, false);
                        break;
                    }
                }
                break;
            case 11:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.a0;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new e00(22, privacySettingsActivity, (org.telegram.ui.Cells.s8) obj));
                break;
            case 13:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.d2[]) obj);
                break;
            case 14:
                rv0 rv0Var = (rv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                rv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = rv0Var.b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.H5(false, false);
                    break;
                }
                break;
            case 17:
                b21 b21Var = (b21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    b21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    z6 z6Var = new z6(b21Var, user2, twoStepVerificationActivity, 20);
                    twoStepVerificationActivity.a0 = 0;
                    twoStepVerificationActivity.c0 = z6Var;
                    T.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 18:
                ThemeActivity.c0((ThemeActivity) obj2, (b31) obj);
                break;
            case 21:
                g61 g61Var = (g61) obj2;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) obj;
                g61Var.getClass();
                org.telegram.messenger.mp.u1(m6Var.F).G4(m6Var, null, m6Var == org.telegram.ui.ActionBar.n6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.n6.H;
                if (m6Var.b == null) {
                    z10 = false;
                } else {
                    if (org.telegram.ui.ActionBar.n6.I == m6Var) {
                        org.telegram.ui.ActionBar.n6.u(org.telegram.ui.ActionBar.n6.L, true, false);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (m6Var == org.telegram.ui.ActionBar.n6.J) {
                        org.telegram.ui.ActionBar.n6.J = (org.telegram.ui.ActionBar.m6) hashMap.get("Dark Blue");
                    }
                    m6Var.t();
                    org.telegram.ui.ActionBar.n6.G.remove(m6Var);
                    hashMap.remove(m6Var.a);
                    org.telegram.ui.ActionBar.e6 e6Var = m6Var.j0;
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.e6.a(e6Var);
                    }
                    org.telegram.ui.ActionBar.n6.F.remove(m6Var);
                    new File(m6Var.b).delete();
                    org.telegram.ui.ActionBar.n6.y1(true, false);
                }
                if (z10) {
                    s4Var = ((org.telegram.ui.ActionBar.h2) g61Var.e).parentLayout;
                    ((ActionBarLayout) s4Var).X(true, true);
                }
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.r4, new Object[0]);
                break;
            case 25:
                bb1.b0((bb1) obj2, (byte[]) obj);
                break;
            case 26:
                hc1 hc1Var = (hc1) obj2;
                ((boolean[]) obj)[0] = true;
                hc1Var.p0 = 17;
                Intent intent = new Intent(hc1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", hc1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", hc1Var.a);
                try {
                    hc1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 27:
                org.telegram.ui.Wallet.d9 d9Var = (org.telegram.ui.Wallet.d9) obj2;
                d9Var.getClass();
                u1Var.dismiss();
                org.telegram.ui.Wallet.u8 u8Var = new org.telegram.ui.Wallet.u8();
                u8Var.r = !((Boolean) obj).booleanValue();
                d9Var.presentFragment(u8Var);
                break;
            case 28:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.x2) obj).dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ix0
    public void k(uh0 uh0Var) {
        ba1 ba1Var = (ba1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        ea1 ea1Var = ba1Var.a;
        ea1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        ea1Var.a0();
    }

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        us0 us0Var = (us0) this.b;
        ts0 ts0Var = (ts0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = us0Var.d.n;
        premiumPreviewFragment.o0.d(0, 0.0f, 0, ts0Var.getMeasuredWidth(), -ts0Var.getTier().h, premiumPreviewFragment.P);
        return premiumPreviewFragment.o0.f;
    }

    public /* synthetic */ aj0(hr0 hr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 9;
        this.b = hr0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.ui.ix0
    public /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
