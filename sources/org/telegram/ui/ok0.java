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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.s4, org.telegram.messenger.k9, org.telegram.messenger.ri, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0, rr0, org.telegram.messenger.qr, kx0, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ok0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 5:
                kr0 kr0Var = (kr0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                sr0 sr0Var = kr0Var.a;
                sr0Var.e0.a(tL_messageMediaToDo);
                sr0Var.finishFragment();
                break;
            default:
                kr0 kr0Var2 = (kr0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                sr0 sr0Var2 = kr0Var2.a;
                sr0Var2.e0.a(tL_messageMediaPoll);
                sr0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.rr0
    public void a(TLRPC.MessageMedia messageMedia) {
        i81 i81Var = (i81) this.b;
        cn cnVar = (cn) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = i81Var.G.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        i81Var.G.k.media = messageMedia;
        cnVar.getSendMessagesHelper().t(i81Var.G, null, null, null, null, null, null, null, false, false, null);
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

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        final h61 h61Var = (h61) this.b;
        final j61 j61Var = (j61) this.c;
        ThemeActivity themeActivity = h61Var.e;
        if (i7 >= 0 && i7 < j61Var.e.size()) {
            final org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) j61Var.e.get(i7);
            if (j6Var.a >= 100 && !j6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.id.M0(2131747797, "OpenInEditor");
                String M02 = org.telegram.messenger.id.M0(2131745426, "ShareTheme");
                TLRPC.TL_theme tL_theme = j6Var.r;
                CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : org.telegram.messenger.id.M0(2131744145, "ThemeSetUrl"), org.telegram.messenger.id.M0(2131751486, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.c61
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        h61 h61Var2 = h61.this;
                        ThemeActivity themeActivity2 = h61Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                        if (i10 == 0) {
                            org.telegram.ui.Components.u4.T(themeActivity2, i10 != 1 ? 1 : 2, j6Var2.b, j6Var2);
                            return;
                        }
                        if (i10 == 1) {
                            if (j6Var2.r == null) {
                                themeActivity2.getMessagesController().y4(j6Var2.b, j6Var2);
                                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.s4, j6Var2.b, j6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + j6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.mo0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i10 == 2) {
                            themeActivity2.presentFragment(new a81(j6Var2.b, j6Var2, false));
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
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751598, "Delete"), new a7(h61Var2, j61Var, j6Var2, 22));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                        themeActivity2.showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                        }
                    }
                };
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.P = charSequenceArr;
                u1Var.Q = iArr;
                u1Var.M = onClickListener;
                themeActivity.showDialog(u1Var);
                u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.p7, false));
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

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        ThemeActivity.b0((ThemeActivity) this.b, (Context) this.c, view, i7, f10);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList;
        TLRPC.EncryptedChat encryptedChat;
        int i10;
        boolean z9;
        org.telegram.ui.ActionBar.r4 r4Var;
        int i11 = this.a;
        int i12 = 20;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                kl0 kl0Var = (kl0) obj2;
                kl0Var.b0 = true;
                kl0Var.a0.email_unconfirmed_pattern = (String) obj;
                kl0Var.P0();
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
                PhotoViewer.u(((to0) obj2).b, (ArrayList) obj);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((to0) obj2).b;
                xq0 xq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.Z6;
                ArrayList arrayList3 = photoViewer.c7;
                ArrayList arrayList4 = photoViewer.X6;
                ArrayList arrayList5 = photoViewer.d7;
                ArrayList arrayList6 = photoViewer.e7;
                if (!xq0Var.N()) {
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
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new k50(i12, privacySettingsActivity, (org.telegram.ui.Cells.r8) obj));
                break;
            case 10:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                break;
            case 11:
                uv0 uv0Var = (uv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                uv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = uv0Var.b;
                RectF rectF = ProfileActivity.V6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.G5(false, false);
                    break;
                }
                break;
            case 14:
                d21 d21Var = (d21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    d21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(d21Var, user2, twoStepVerificationActivity, i12);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 15:
                ThemeActivity.c0((ThemeActivity) obj2, (rw0) obj);
                break;
            case 18:
                h61 h61Var = (h61) obj2;
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) obj;
                h61Var.getClass();
                org.telegram.messenger.qp.s1(l6Var.E).x4(l6Var, null, l6Var == org.telegram.ui.ActionBar.m6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.m6.H;
                if (l6Var.b == null) {
                    z9 = false;
                } else {
                    if (org.telegram.ui.ActionBar.m6.I == l6Var) {
                        org.telegram.ui.ActionBar.m6.u(org.telegram.ui.ActionBar.m6.L, true, false);
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (l6Var == org.telegram.ui.ActionBar.m6.J) {
                        org.telegram.ui.ActionBar.m6.J = (org.telegram.ui.ActionBar.l6) hashMap.get("Dark Blue");
                    }
                    l6Var.t();
                    org.telegram.ui.ActionBar.m6.G.remove(l6Var);
                    hashMap.remove(l6Var.a);
                    org.telegram.ui.ActionBar.e6 e6Var = l6Var.i0;
                    if (e6Var != null) {
                        org.telegram.ui.ActionBar.e6.a(e6Var);
                    }
                    org.telegram.ui.ActionBar.m6.F.remove(l6Var);
                    new File(l6Var.b).delete();
                    org.telegram.ui.ActionBar.m6.y1(true, false);
                }
                if (z9) {
                    r4Var = ((org.telegram.ui.ActionBar.f2) h61Var.e).parentLayout;
                    ((ActionBarLayout) r4Var).X(true, true);
                }
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o4, new Object[0]);
                break;
            case 22:
                cb1.b0((cb1) obj2, (byte[]) obj);
                break;
            case 23:
                jc1 jc1Var = (jc1) obj2;
                ((boolean[]) obj)[0] = true;
                jc1Var.o0 = 17;
                Intent intent = new Intent(jc1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", jc1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", jc1Var.a);
                try {
                    jc1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) obj2;
                p8Var.getClass();
                u1Var.dismiss();
                org.telegram.ui.Wallet.g8 g8Var = new org.telegram.ui.Wallet.g8();
                g8Var.r = !((Boolean) obj).booleanValue();
                p8Var.presentFragment(g8Var);
                break;
            case 26:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                break;
            case 27:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.l8 l8Var = new org.telegram.ui.Wallet.l8((org.telegram.ui.Wallet.p8) obj2, h, i14);
                org.telegram.ui.Wallet.l0.H("disableBackupWithoutUpdatingPhrase");
                l0Var.m0(new h2.o0((Object) l0Var, (Object) new org.telegram.ui.Components.ex(28, l0Var, l8Var), true, false, 4));
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        ws0 ws0Var = (ws0) this.b;
        vs0 vs0Var = (vs0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = ws0Var.d.n;
        premiumPreviewFragment.n0.d(0, 0.0f, 0, vs0Var.getMeasuredWidth(), -vs0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.n0.f;
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        k91 k91Var = (k91) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        z91 z91Var = k91Var.b;
        org.telegram.messenger.qs notificationCenter = z91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.t;
        notificationCenter.n(z91Var, i7);
        z91Var.getNotificationCenter().k(i7, new Object[0]);
        z91Var.finishFragment();
        z91Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z9));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        fi.d dVar = (fi.d) this.c;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) r7Var.d));
        dVar.setLoading(false);
        zc1.d = null;
        org.telegram.ui.ActionBar.w2 w2Var = zc1.c;
        if (w2Var != null) {
            w2Var.dismiss();
            zc1.c = null;
        }
    }

    @Override // org.telegram.ui.kx0
    public void t(rh0 rh0Var) {
        ca1 ca1Var = (ca1) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        fa1 fa1Var = ca1Var.a;
        fa1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        fa1Var.a0();
    }

    public /* synthetic */ ok0(kr0 kr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 6;
        this.b = kr0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.ui.kx0
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
