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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4, org.telegram.messenger.k9, org.telegram.messenger.ri, org.telegram.ui.Components.dj0, org.telegram.ui.Components.ej0, qr0, org.telegram.messenger.qr, jx0, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nk0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 5:
                jr0 jr0Var = (jr0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                rr0 rr0Var = jr0Var.a;
                rr0Var.e0.a(tL_messageMediaToDo);
                rr0Var.finishFragment();
                break;
            default:
                jr0 jr0Var2 = (jr0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                rr0 rr0Var2 = jr0Var2.a;
                rr0Var2.e0.a(tL_messageMediaPoll);
                rr0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.qr0
    public void a(TLRPC.MessageMedia messageMedia) {
        h81 h81Var = (h81) this.b;
        cn cnVar = (cn) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = h81Var.G.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        h81Var.G.k.media = messageMedia;
        cnVar.getSendMessagesHelper().t(h81Var.G, null, null, null, null, null, null, null, false, false, null);
    }

    public File b() {
        switch (this.a) {
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.messenger.w7.G(photoViewer.T);
                return org.telegram.messenger.w7.J(tLObject, null, true, true);
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                org.telegram.messenger.w7.G(photoViewer2.T);
                return org.telegram.messenger.w7.M(message, false, true);
        }
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        final g61 g61Var = (g61) this.b;
        final i61 i61Var = (i61) this.c;
        ThemeActivity themeActivity = g61Var.e;
        if (i7 >= 0 && i7 < i61Var.e.size()) {
            final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) i61Var.e.get(i7);
            if (i6Var.a >= 100 && !i6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131747797, "OpenInEditor");
                String M02 = org.telegram.messenger.id.M0(2131745426, "ShareTheme");
                TLRPC.TL_theme tL_theme = i6Var.r;
                CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : org.telegram.messenger.id.M0(2131744145, "ThemeSetUrl"), org.telegram.messenger.id.M0(2131751486, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.b61
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        g61 g61Var2 = g61.this;
                        ThemeActivity themeActivity2 = g61Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (i10 == 0) {
                            org.telegram.ui.Components.v4.T(themeActivity2, i10 != 1 ? 1 : 2, i6Var2.b, i6Var2);
                            return;
                        }
                        if (i10 == 1) {
                            if (i6Var2.r == null) {
                                themeActivity2.getMessagesController().y4(i6Var2.b, i6Var2);
                                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.s4, i6Var2.b, i6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + i6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.no0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i10 == 2) {
                            themeActivity2.presentFragment(new z71(i6Var2.b, i6Var2, false));
                            return;
                        }
                        if (i10 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String M03 = org.telegram.messenger.id.M0(2131751484, "DeleteThemeTitle");
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                        u1Var.R = M03;
                        u1Var.T = org.telegram.messenger.id.M0(2131751485, "DeleteThemeAlert");
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, "Delete"), new a7(g61Var2, i61Var, i6Var2, 22));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                        themeActivity2.showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
                        }
                    }
                };
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.P = charSequenceArr;
                u1Var.Q = iArr;
                u1Var.M = onClickListener;
                themeActivity.showDialog(u1Var);
                u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.q7, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.p7, false));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.ri
    public void e(String str, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b;
        Runnable runnable = (Runnable) this.c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            try {
                if (!((org.telegram.messenger.qi) arrayList.get(i7)).a.startsWith("animated_")) {
                    String c10 = org.telegram.messenger.i6.c(((org.telegram.messenger.qi) arrayList.get(i7)).a);
                    if (org.telegram.messenger.i6.g(c10) != null) {
                        linkedHashSet.add(c10);
                    }
                }
            } catch (Exception unused) {
            }
        }
        runnable.run();
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        ThemeActivity.b0((ThemeActivity) this.b, (Context) this.c, view, i7, f10);
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z9;
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11 = this.a;
        int i12 = 20;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                jl0 jl0Var = (jl0) obj2;
                jl0Var.b0 = true;
                jl0Var.a0.email_unconfirmed_pattern = (String) obj;
                jl0Var.P0();
                break;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 24:
            default:
                org.telegram.ui.web.l.d0((org.telegram.ui.web.l) obj2, (HashSet) obj);
                break;
            case 3:
                PhotoViewer.u(((so0) obj2).b, (ArrayList) obj);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((so0) obj2).b;
                wq0 wq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.Z6;
                ArrayList arrayList3 = photoViewer.c7;
                ArrayList arrayList4 = photoViewer.X6;
                ArrayList arrayList5 = photoViewer.d7;
                ArrayList arrayList6 = photoViewer.e7;
                if (!wq0Var.N()) {
                    photoViewer.z0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i15 = photoViewer.O4;
                    if (i15 >= 0 && i15 < arrayList4.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(photoViewer.O4);
                        if (ijVar.q4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i16 = photoViewer.w;
                            if (i16 != 0) {
                                arrayList7.add(Integer.valueOf(i16));
                            } else {
                                arrayList7.add(Integer.valueOf(ijVar.e1()));
                            }
                            if (!org.telegram.messenger.m5.C(org.telegram.messenger.ij.B0(ijVar.k)) || ijVar.k.random_id == 0) {
                                arrayList = null;
                                encryptedChat = null;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                arrayList8.add(Long.valueOf(ijVar.k.random_id));
                                arrayList = arrayList8;
                                encryptedChat = org.telegram.messenger.qp.s1(photoViewer.T).a1(Integer.valueOf((int) (org.telegram.messenger.ij.B0(ijVar.k) & 4294967295L)));
                            }
                            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(photoViewer.T);
                            long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                            int I1 = org.telegram.messenger.ij.I1(ijVar.k);
                            boolean z10 = zArr[0];
                            if (ijVar.p1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.ij.d5(ijVar.k)) {
                                    i13 = 9;
                                } else if (org.telegram.messenger.ij.b4(ijVar.k)) {
                                    i13 = 5;
                                }
                                i10 = i13;
                            }
                            s12.Z(arrayList7, arrayList, encryptedChat, B0, I1, z10, i10);
                            break;
                        }
                    }
                } else if (!arrayList6.isEmpty()) {
                    int i17 = photoViewer.O4;
                    if (i17 >= 0 && i17 < arrayList6.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList3.get(photoViewer.O4);
                        if (message != null) {
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(Integer.valueOf(message.id));
                            org.telegram.messenger.qp.s1(photoViewer.T).Z(arrayList9, null, null, org.telegram.messenger.ij.B0(message), message.quick_reply_shortcut_id, true, 0);
                            org.telegram.messenger.qs.f(photoViewer.T).k(39, new Object[0]);
                        }
                        if (!photoViewer.G1()) {
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList6.get(photoViewer.O4);
                            if (photo != null) {
                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                tL_inputPhoto.id = photo.id;
                                tL_inputPhoto.access_hash = photo.access_hash;
                                byte[] bArr = photo.file_reference;
                                tL_inputPhoto.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputPhoto.file_reference = new byte[0];
                                }
                                if (photoViewer.y5 > 0) {
                                    org.telegram.messenger.qp.s1(photoViewer.T).l0(tL_inputPhoto);
                                }
                                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(photoViewer.T);
                                a02.a.c(new org.telegram.messenger.vp(4, photoViewer.y5, photo.id, a02));
                                arrayList2.remove(photoViewer.O4);
                                photoViewer.b7.remove(photoViewer.O4);
                                photoViewer.a7.remove(photoViewer.O4);
                                arrayList3.remove(photoViewer.O4);
                                arrayList6.remove(photoViewer.O4);
                                if (arrayList2.isEmpty()) {
                                    photoViewer.z0(false, false);
                                } else {
                                    int i18 = photoViewer.O4;
                                    if (i18 >= arrayList6.size()) {
                                        i18 = arrayList6.size() - 1;
                                    }
                                    photoViewer.O4 = -1;
                                    photoViewer.y2(i18);
                                }
                                if (message == null) {
                                    org.telegram.messenger.qs.f(photoViewer.T).k(39, new Object[0]);
                                    break;
                                }
                            }
                        } else {
                            if (photoViewer.y5 > 0) {
                                org.telegram.messenger.qp.s1(photoViewer.T).l0(null);
                            } else {
                                org.telegram.messenger.qp.s1(photoViewer.T).B(-photoViewer.y5, null, null, null, null, 0.0d, null, null, null, null);
                            }
                            photoViewer.z0(false, false);
                            break;
                        }
                    }
                } else if (!arrayList5.isEmpty() && photoViewer.d != null) {
                    arrayList5.remove(photoViewer.O4);
                    photoViewer.d.B(photoViewer.O4);
                    if (!arrayList5.isEmpty()) {
                        int i19 = photoViewer.O4;
                        if (i19 >= arrayList5.size()) {
                            i19 = arrayList5.size() - 1;
                        }
                        photoViewer.O4 = -1;
                        photoViewer.y2(i19);
                        break;
                    } else {
                        photoViewer.z0(false, false);
                        break;
                    }
                }
                break;
            case 8:
                ((PrivacyControlActivity) obj2).E0();
                ((SharedPreferences) obj).edit().putBoolean("privacyAlertShowed", true).commit();
                break;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr2 = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr2[1];
                tL_payments_clearSavedInfo.info = zArr2[0];
                privacySettingsActivity.getUserConfig().y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new j50(i12, privacySettingsActivity, (org.telegram.ui.Cells.r8) obj));
                break;
            case 10:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                break;
            case 11:
                tv0 tv0Var = (tv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                tv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = tv0Var.b;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.G5(false, false);
                    break;
                }
                break;
            case 14:
                c21 c21Var = (c21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    c21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(c21Var, user2, twoStepVerificationActivity, i12);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 15:
                ThemeActivity.c0((ThemeActivity) obj2, (ax0) obj);
                break;
            case 18:
                g61 g61Var = (g61) obj2;
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) obj;
                g61Var.getClass();
                org.telegram.messenger.qp.s1(k6Var.E).x4(k6Var, null, k6Var == org.telegram.ui.ActionBar.l6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.l6.H;
                if (k6Var.b == null) {
                    z9 = false;
                } else {
                    if (org.telegram.ui.ActionBar.l6.I == k6Var) {
                        org.telegram.ui.ActionBar.l6.u(org.telegram.ui.ActionBar.l6.L, true, false);
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (k6Var == org.telegram.ui.ActionBar.l6.J) {
                        org.telegram.ui.ActionBar.l6.J = (org.telegram.ui.ActionBar.k6) hashMap.get("Dark Blue");
                    }
                    k6Var.t();
                    org.telegram.ui.ActionBar.l6.G.remove(k6Var);
                    hashMap.remove(k6Var.a);
                    org.telegram.ui.ActionBar.d6 d6Var = k6Var.i0;
                    if (d6Var != null) {
                        org.telegram.ui.ActionBar.d6.a(d6Var);
                    }
                    org.telegram.ui.ActionBar.l6.F.remove(k6Var);
                    new File(k6Var.b).delete();
                    org.telegram.ui.ActionBar.l6.y1(true, false);
                }
                if (z9) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) g61Var.e).parentLayout;
                    ((ActionBarLayout) q4Var).X(true, true);
                }
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o4, new Object[0]);
                break;
            case 22:
                bb1.b0((bb1) obj2, (byte[]) obj);
                break;
            case 23:
                ic1 ic1Var = (ic1) obj2;
                ((boolean[]) obj)[0] = true;
                ic1Var.o0 = 17;
                Intent intent = new Intent(ic1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", ic1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ic1Var.a);
                try {
                    ic1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.m8 m8Var = (org.telegram.ui.Wallet.m8) obj2;
                m8Var.getClass();
                u1Var.dismiss();
                org.telegram.ui.Wallet.d8 d8Var = new org.telegram.ui.Wallet.d8();
                d8Var.r = !((Boolean) obj).booleanValue();
                m8Var.presentFragment(d8Var);
                break;
            case 26:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                break;
            case 27:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.i8 i8Var = new org.telegram.ui.Wallet.i8((org.telegram.ui.Wallet.m8) obj2, h, i14);
                org.telegram.ui.Wallet.l0.H("disableBackupWithoutUpdatingPhrase");
                l0Var.m0(new h2.o0((Object) l0Var, (Object) new org.telegram.ui.Components.fx(28, l0Var, i8Var), true, false, 4));
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        vs0 vs0Var = (vs0) this.b;
        us0 us0Var = (us0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = vs0Var.d.n;
        premiumPreviewFragment.n0.d(0, 0.0f, 0, us0Var.getMeasuredWidth(), -us0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.n0.f;
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        j91 j91Var = (j91) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        y91 y91Var = j91Var.b;
        org.telegram.messenger.qs notificationCenter = y91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.t;
        notificationCenter.n(y91Var, i7);
        y91Var.getNotificationCenter().k(i7, new Object[0]);
        y91Var.finishFragment();
        y91Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z9));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        fi.d dVar = (fi.d) this.c;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) r7Var.d));
        dVar.setLoading(false);
        yc1.d = null;
        org.telegram.ui.ActionBar.v2 v2Var = yc1.c;
        if (v2Var != null) {
            v2Var.dismiss();
            yc1.c = null;
        }
    }

    @Override // org.telegram.ui.jx0
    public void t(qh0 qh0Var) {
        ba1 ba1Var = (ba1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        ea1 ea1Var = ba1Var.a;
        ea1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        ea1Var.a0();
    }

    public /* synthetic */ nk0(jr0 jr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 6;
        this.b = jr0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.ui.jx0
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
