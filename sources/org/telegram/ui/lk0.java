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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.t4, org.telegram.messenger.k9, org.telegram.messenger.ri, org.telegram.ui.Components.cj0, org.telegram.ui.Components.dj0, or0, org.telegram.messenger.qr, fx0, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lk0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 5:
                hr0 hr0Var = (hr0) this.b;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.c;
                pr0 pr0Var = hr0Var.a;
                pr0Var.e0.a(tL_messageMediaToDo);
                pr0Var.finishFragment();
                break;
            default:
                hr0 hr0Var2 = (hr0) this.b;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.c;
                pr0 pr0Var2 = hr0Var2.a;
                pr0Var2.e0.a(tL_messageMediaPoll);
                pr0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.or0
    public void a(TLRPC.MessageMedia messageMedia) {
        f81 f81Var = (f81) this.b;
        an anVar = (an) this.c;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = f81Var.G.k.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        f81Var.G.k.media = messageMedia;
        anVar.getSendMessagesHelper().t(f81Var.G, null, null, null, null, null, null, null, false, false, null);
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
        final f61 f61Var = (f61) this.b;
        final h61 h61Var = (h61) this.c;
        ThemeActivity themeActivity = f61Var.e;
        if (i7 >= 0 && i7 < h61Var.e.size()) {
            final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) h61Var.e.get(i7);
            if (h6Var.a >= 100 && !h6Var.z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131747796, "OpenInEditor");
                String M02 = org.telegram.messenger.hd.M0(2131745427, "ShareTheme");
                TLRPC.TL_theme tL_theme = h6Var.r;
                CharSequence[] charSequenceArr = {M0, M02, (tL_theme == null || !tL_theme.creator) ? null : org.telegram.messenger.hd.M0(2131744146, "ThemeSetUrl"), org.telegram.messenger.hd.M0(2131751487, "DeleteTheme")};
                int[] iArr = {R.drawable.msg_edit, R.drawable.msg_share, R.drawable.msg_link, R.drawable.msg_delete};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.a61
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        f61 f61Var2 = f61.this;
                        ThemeActivity themeActivity2 = f61Var2.e;
                        if (themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                        if (i10 == 0) {
                            org.telegram.ui.Components.v4.T(themeActivity2, i10 != 1 ? 1 : 2, h6Var2.b, h6Var2);
                            return;
                        }
                        if (i10 == 1) {
                            if (h6Var2.r == null) {
                                themeActivity2.getMessagesController().y4(h6Var2.b, h6Var2);
                                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.s4, h6Var2.b, h6Var2);
                                return;
                            }
                            String str = "https://" + themeActivity2.getMessagesController().U2 + "/addtheme/" + h6Var2.r.slug;
                            themeActivity2.showDialog(new org.telegram.ui.Components.mo0(themeActivity2.getParentActivity(), null, str, false, str, false, null));
                            return;
                        }
                        if (i10 == 2) {
                            themeActivity2.presentFragment(new x71(h6Var2.b, h6Var2, false));
                            return;
                        }
                        if (i10 != 3 || themeActivity2.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(themeActivity2.getParentActivity());
                        String M03 = org.telegram.messenger.hd.M0(2131751485, "DeleteThemeTitle");
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                        u1Var.R = M03;
                        u1Var.T = org.telegram.messenger.hd.M0(2131751486, "DeleteThemeAlert");
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131751599, "Delete"), new a7(f61Var2, h61Var, h6Var2, 22));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                        themeActivity2.showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                        }
                    }
                };
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.P = charSequenceArr;
                u1Var.Q = iArr;
                u1Var.M = onClickListener;
                themeActivity.showDialog(u1Var);
                u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false));
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
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11 = this.a;
        int i12 = 20;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                hl0 hl0Var = (hl0) obj2;
                hl0Var.b0 = true;
                hl0Var.a0.email_unconfirmed_pattern = (String) obj;
                hl0Var.P0();
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
                PhotoViewer.u(((qo0) obj2).b, (ArrayList) obj);
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                PhotoViewer photoViewer = ((qo0) obj2).b;
                uq0 uq0Var = photoViewer.d;
                ArrayList arrayList2 = photoViewer.Z6;
                ArrayList arrayList3 = photoViewer.c7;
                ArrayList arrayList4 = photoViewer.X6;
                ArrayList arrayList5 = photoViewer.d7;
                ArrayList arrayList6 = photoViewer.e7;
                if (!uq0Var.N()) {
                    photoViewer.z0(false, false);
                    break;
                } else if (!arrayList4.isEmpty()) {
                    int i15 = photoViewer.O4;
                    if (i15 >= 0 && i15 < arrayList4.size()) {
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList4.get(photoViewer.O4);
                        if (ijVar.r4()) {
                            photoViewer.z0(false, false);
                            ArrayList arrayList7 = new ArrayList();
                            int i16 = photoViewer.w;
                            if (i16 != 0) {
                                arrayList7.add(Integer.valueOf(i16));
                            } else {
                                arrayList7.add(Integer.valueOf(ijVar.f1()));
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
                            int J1 = org.telegram.messenger.ij.J1(ijVar.k);
                            boolean z10 = zArr[0];
                            if (ijVar.p1) {
                                i10 = 1;
                            } else {
                                if (org.telegram.messenger.ij.e5(ijVar.k)) {
                                    i13 = 9;
                                } else if (org.telegram.messenger.ij.c4(ijVar.k)) {
                                    i13 = 5;
                                }
                                i10 = i13;
                            }
                            s12.Z(arrayList7, arrayList, encryptedChat, B0, J1, z10, i10);
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
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new h50(i12, privacySettingsActivity, (org.telegram.ui.Cells.r8) obj));
                break;
            case 10:
                ProfileActivity.p0((ProfileActivity) obj2, (org.telegram.ui.Cells.c2[]) obj);
                break;
            case 11:
                rv0 rv0Var = (rv0) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                rv0Var.getClass();
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(user);
                ProfileActivity profileActivity = rv0Var.b;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getContactsController().i(arrayList10, true);
                if (user != null) {
                    user.contact = false;
                    profileActivity.D5(false, false);
                    break;
                }
                break;
            case 14:
                a21 a21Var = (a21) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    a21Var.dismiss();
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    a7 a7Var = new a7(a21Var, user2, twoStepVerificationActivity, i12);
                    twoStepVerificationActivity.Z = 0;
                    twoStepVerificationActivity.b0 = a7Var;
                    T.presentFragment(twoStepVerificationActivity);
                    break;
                }
                break;
            case 15:
                ThemeActivity.c0((ThemeActivity) obj2, (by0) obj);
                break;
            case 18:
                f61 f61Var = (f61) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                f61Var.getClass();
                org.telegram.messenger.qp.s1(j6Var.E).x4(j6Var, null, j6Var == org.telegram.ui.ActionBar.k6.J, true);
                HashMap hashMap = org.telegram.ui.ActionBar.k6.H;
                if (j6Var.b == null) {
                    z9 = false;
                } else {
                    if (org.telegram.ui.ActionBar.k6.I == j6Var) {
                        org.telegram.ui.ActionBar.k6.u(org.telegram.ui.ActionBar.k6.L, true, false);
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (j6Var == org.telegram.ui.ActionBar.k6.J) {
                        org.telegram.ui.ActionBar.k6.J = (org.telegram.ui.ActionBar.j6) hashMap.get("Dark Blue");
                    }
                    j6Var.t();
                    org.telegram.ui.ActionBar.k6.G.remove(j6Var);
                    hashMap.remove(j6Var.a);
                    org.telegram.ui.ActionBar.c6 c6Var = j6Var.i0;
                    if (c6Var != null) {
                        org.telegram.ui.ActionBar.c6.a(c6Var);
                    }
                    org.telegram.ui.ActionBar.k6.F.remove(j6Var);
                    new File(j6Var.b).delete();
                    org.telegram.ui.ActionBar.k6.y1(true, false);
                }
                if (z9) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) f61Var.e).parentLayout;
                    ((ActionBarLayout) q4Var).X(true, true);
                }
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o4, new Object[0]);
                break;
            case 22:
                ya1.b0((ya1) obj2, (byte[]) obj);
                break;
            case 23:
                ec1 ec1Var = (ec1) obj2;
                ((boolean[]) obj)[0] = true;
                ec1Var.o0 = 17;
                Intent intent = new Intent(ec1Var.b, (Class<?>) VoIPService.class);
                intent.putExtra("user_id", ec1Var.d.id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", ec1Var.a);
                try {
                    ec1Var.b.startService(intent);
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 25:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) obj2;
                o8Var.getClass();
                u1Var.dismiss();
                org.telegram.ui.Wallet.f8 f8Var = new org.telegram.ui.Wallet.f8();
                f8Var.r = !((Boolean) obj).booleanValue();
                o8Var.presentFragment(f8Var);
                break;
            case 26:
                ((Runnable) obj2).run();
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                break;
            case 27:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                org.telegram.ui.Wallet.k8 k8Var = new org.telegram.ui.Wallet.k8((org.telegram.ui.Wallet.o8) obj2, h, i14);
                org.telegram.ui.Wallet.n0.H("disableBackupWithoutUpdatingPhrase");
                n0Var.m0(new h2.o0((Object) n0Var, (Object) new org.telegram.ui.Components.ex(28, n0Var, k8Var), true, false, 4));
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        ts0 ts0Var = (ts0) this.b;
        ss0 ss0Var = (ss0) this.c;
        PremiumPreviewFragment premiumPreviewFragment = ts0Var.d.n;
        premiumPreviewFragment.n0.d(0, 0.0f, 0, ss0Var.getMeasuredWidth(), -ss0Var.getTier().h, premiumPreviewFragment.O);
        return premiumPreviewFragment.n0.f;
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        h91 h91Var = (h91) this.b;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        v91 v91Var = h91Var.b;
        org.telegram.messenger.qs notificationCenter = v91Var.getNotificationCenter();
        int i7 = org.telegram.messenger.qs.t;
        notificationCenter.n(v91Var, i7);
        v91Var.getNotificationCenter().k(i7, new Object[0]);
        v91Var.finishFragment();
        v91Var.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z9));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        a8.r7 r7Var = (a8.r7) this.b;
        fi.d dVar = (fi.d) this.c;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) r7Var.d));
        dVar.setLoading(false);
        uc1.d = null;
        org.telegram.ui.ActionBar.v2 v2Var = uc1.c;
        if (v2Var != null) {
            v2Var.dismiss();
            uc1.c = null;
        }
    }

    @Override // org.telegram.ui.fx0
    public void t(oh0 oh0Var) {
        y91 y91Var = (y91) this.b;
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.c;
        ba1 ba1Var = y91Var.a;
        ba1Var.e.add(Integer.valueOf(tL_forumTopic.id));
        ba1Var.a0();
    }

    public /* synthetic */ lk0(hr0 hr0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, ArrayList arrayList) {
        this.a = 6;
        this.b = hr0Var;
        this.c = tL_messageMediaPoll;
    }

    @Override // org.telegram.ui.fx0
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
