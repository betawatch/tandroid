package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mp0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        ai.f2 f2Var;
        ArrayList arrayList;
        int i10;
        String str;
        int i11;
        String str2;
        boolean z10;
        int i12;
        String str3;
        String str4;
        String[] strArr;
        String str5;
        SpannableStringBuilder spannableStringBuilder;
        String str6;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                np0 np0Var = (np0) this.b;
                org.telegram.ui.Components.h61 h61Var = (org.telegram.ui.Components.h61) this.c;
                np0Var.getClass();
                if (h61Var.U() > 0 && h61Var.S() >= h61Var.U() - 590) {
                    np0Var.a.f0.invalidate();
                    break;
                }
                break;
            case 1:
                qp0 qp0Var = (qp0) this.b;
                tg.t0 t0Var = (tg.t0) this.c;
                t0Var.e.h();
                t0Var.c.postRunnable(new cd0(24));
                try {
                    qp0Var.b.f0.removeView(t0Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 2:
                aq0 aq0Var = (aq0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                aq0Var.r.r7.d();
                animatorSet.start();
                break;
            case 3:
                aq0 aq0Var2 = (aq0) this.b;
                wq0 wq0Var = (wq0) this.c;
                aq0Var2.r.s4 = false;
                if (!wq0Var.s) {
                    wq0Var.a.P0(false, true);
                    break;
                }
                break;
            case 4:
                zr0 zr0Var = (zr0) this.b;
                String str7 = (String) this.c;
                zr0Var.getClass();
                org.telegram.messenger.g0.g(str7);
                zr0Var.c(true);
                break;
            case 5:
                zr0 zr0Var2 = (zr0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                zr0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(pollAnswer.text, false));
                zr0Var2.c(true);
                break;
            case 6:
                zr0 zr0Var3 = (zr0) this.b;
                byte[] bArr = (byte[]) this.c;
                org.telegram.messenger.zy C = org.telegram.messenger.zy.C(zr0Var3.I.K1);
                org.telegram.messenger.fj fjVar = zr0Var3.I;
                if (fjVar != null && (org.telegram.messenger.fj.m1(fjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                    int e12 = fjVar.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().l1(B0);
                    tL_messages_deletePollAnswer.msg_id = e12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.q5 q5Var = Utilities.d;
                    Objects.requireNonNull(q5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.x3(q5Var), new org.telegram.messenger.d(C, 7));
                }
                zr0Var3.c(true);
                break;
            case 7:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 8:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    break;
                }
                break;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.D0();
                break;
            case 10:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) this.c;
                boolean z12 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z12;
                r8Var.setChecked(z12);
                break;
            case 11:
                ((rt0) this.b).getMessagesController().r5(null, ((Long) this.c).longValue());
                break;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new bn(bundle), true);
                break;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j3 = profileActivity2.B2;
                if (j3 != 0) {
                    TLRPC.User c22 = profileActivity2.getMessagesController().c2(Long.valueOf(j3));
                    profileActivity2.getMessagesController().f0(profileActivity2.f1, c22);
                    if (profileActivity2.F2 != null && c22 != null && org.telegram.ui.Components.kc.a(profileActivity2)) {
                        org.telegram.ui.Components.kc.D(profileActivity2, c22, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.H5(true, false);
                        break;
                    }
                } else {
                    profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                    if (org.telegram.messenger.g0.Q1()) {
                        i7 = 0;
                        profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f1));
                    } else {
                        i7 = 0;
                        profileActivity2.getNotificationCenter().k(4, new Object[0]);
                    }
                    profileActivity2.getMessagesController().f0(profileActivity2.f1, profileActivity2.getMessagesController().c2(Long.valueOf(profileActivity2.getUserConfig().e())));
                    profileActivity2.J1 = i7;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 14:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g("https://" + profileActivity3.getMessagesController().X2 + "/" + org.telegram.messenger.v3.K(chat, false));
                break;
            case 15:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity4.getClass();
                org.telegram.ui.Components.fc.e();
                vf.c.t(profileActivity4.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 16:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                org.telegram.ui.Components.zn znVar = (org.telegram.ui.Components.zn) this.c;
                RectF rectF4 = ProfileActivity.Z6;
                org.telegram.ui.Components.vn vnVar = znVar.e;
                bx bxVar = profileActivity5.l5;
                View D = (bxVar == null || bxVar.getFragmentView() == null) ? profileActivity5.m5.D() : profileActivity5.l5.getFragmentView();
                RectF rectF5 = profileActivity5.l6;
                profileActivity5.k6 = jh.k.c(vnVar, D, rectF5) ? rectF5.left : 0.0f;
                profileActivity5.d4();
                break;
            case 17:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity6.F2 = profileActivity6.getMessagesStorage().O(profileActivity6.f1);
                countDownLatch.countDown();
                break;
            case 18:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                View view = (View) this.c;
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity7.getClass();
                ((org.telegram.ui.Cells.m8) view).setChecked(profileActivity7.t2.g());
                break;
            case 19:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity8.getClass();
                profileActivity8.H2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                break;
            case 20:
                ProfileActivity profileActivity9 = (ProfileActivity) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                RectF rectF9 = ProfileActivity.Z6;
                if (!zArr2[0] && (f2Var = profileActivity9.D5) != null) {
                    f2Var.run();
                }
                profileActivity9.D5 = null;
                break;
            case 21:
                uu0 uu0Var = (uu0) this.b;
                a0.h hVar = (a0.h) this.c;
                ProfileActivity profileActivity10 = uu0Var.V2.c;
                org.telegram.ui.Components.kc.x(profileActivity10.getParentActivity(), profileActivity10.s5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, uu0Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, uu0Var.J0)).j();
                break;
            case 22:
                jv0 jv0Var = (jv0) this.b;
                a0.h hVar2 = (a0.h) this.c;
                ProfileActivity profileActivity11 = jv0Var.V2;
                org.telegram.ui.Components.kc.x(profileActivity11.getParentActivity(), profileActivity11.s5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, jv0Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, jv0Var.J0)).j();
                break;
            case 23:
                ((jw0) this.b).e.presentFragment(ProfileActivity.D4(((Long) this.c).longValue()));
                break;
            case 24:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                y9 y9Var = new y9(null);
                y9Var.d = i6Var;
                g2Var.presentFragment(y9Var);
                break;
            case 25:
                uw0 uw0Var = (uw0) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList2 = uw0Var.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = uw0Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str9 = " ";
                String[] split = str8.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String T0 = org.telegram.messenger.gd.E0().T0(split[i13], true, false);
                    strArr2[i13] = T0;
                    if (T0.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    tw0[] tw0VarArr = uw0Var.c;
                    if (i14 >= tw0VarArr.length) {
                        String str10 = str8;
                        String[] strArr3 = strArr2;
                        if (uw0Var.F != null) {
                            int size = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size) {
                                org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) arrayList2.get(i15);
                                String str11 = str9 + yoVar.a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                int i16 = 0;
                                while (true) {
                                    if (i16 < split.length) {
                                        if (split[i16].length() != 0) {
                                            String str12 = split[i16];
                                            arrayList = arrayList2;
                                            int indexOf = str11.indexOf(str9 + str12);
                                            if (indexOf >= 0 || (str2 = strArr3[i16]) == null) {
                                                i11 = indexOf;
                                            } else {
                                                str12 = str2;
                                                i11 = str11.indexOf(str9.concat(str2));
                                            }
                                            if (i11 >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    i10 = size;
                                                    spannableStringBuilder2 = new SpannableStringBuilder(yoVar.a);
                                                } else {
                                                    i10 = size;
                                                }
                                                str = str9;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.n6.q6)), i11, str12.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            i10 = size;
                                            str = str9;
                                        }
                                        if (spannableStringBuilder2 != null && i16 == split.length - 1) {
                                            arrayList4.add(yoVar);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i16++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                        str9 = str;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i15++;
                                size = size;
                                arrayList2 = arrayList;
                                str9 = str9;
                            }
                        }
                        org.telegram.messenger.g0.g3(new eu0(uw0Var, str10, arrayList3, arrayList4, arrayList5, 3));
                        break;
                    } else {
                        tw0 tw0Var = tw0VarArr[i14];
                        if (tw0Var == null) {
                            i12 = i14;
                            z10 = z11;
                        } else {
                            String str13 = tw0Var.a;
                            z10 = z11;
                            String str14 = " " + str13.toLowerCase();
                            i12 = i14;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            int i17 = 0;
                            while (i17 < split.length) {
                                if (split[i17].length() != 0) {
                                    String str15 = split[i17];
                                    str4 = str8;
                                    int indexOf2 = str14.indexOf(" " + str15);
                                    if (indexOf2 >= 0 || (str6 = strArr2[i17]) == null) {
                                        str6 = str15;
                                    } else {
                                        indexOf2 = str14.indexOf(" ".concat(str6));
                                    }
                                    if (indexOf2 >= 0) {
                                        str3 = str14;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str13) : spannableStringBuilder3;
                                        String str16 = str6;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.n6.q6));
                                        int length = str16.length() + indexOf2;
                                        str5 = str13;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i14 = i12 + 1;
                                        z11 = z10;
                                        str8 = str4;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str3 = str14;
                                    str4 = str8;
                                    strArr = strArr2;
                                    str5 = str13;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i17 == split.length - 1) {
                                    if (tw0Var.f == 502) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 >= 4) {
                                                i18 = -1;
                                            } else if (org.telegram.messenger.i10.i(i18).p()) {
                                                i18++;
                                            }
                                        }
                                        if (i18 < 0) {
                                        }
                                    }
                                    arrayList3.add(tw0Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i17++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                str8 = str4;
                                str14 = str3;
                                str13 = str5;
                                strArr2 = strArr;
                            }
                        }
                        str4 = str8;
                        i14 = i12 + 1;
                        z11 = z10;
                        str8 = str4;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 26:
                uw0 uw0Var2 = (uw0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                uw0Var2.d.addAll(arrayList6);
                int i19 = uw0Var2.f;
                org.telegram.messenger.mp.u1(i19).s2 = arrayList6;
                org.telegram.messenger.mp.u1(i19).t2 = uw0Var2.F;
                if (!uw0Var2.x) {
                    uw0Var2.f();
                    break;
                }
                break;
            case 27:
                yw0 yw0Var = (yw0) this.b;
                yw0Var.f.add((ax0) this.c);
                yw0Var.a();
                break;
            case 28:
                View[] viewArr = (View[]) this.b;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                oy0 oy0Var = (oy0) viewArr[0];
                oy0Var.b = tL_channels_sponsoredMessageReportResultChooseOption;
                oy0Var.c = null;
                oy0Var.d = null;
                oy0Var.f.g3.O(false);
                break;
            default:
                ((oy0) ((View[]) this.b)[0]).b((TLRPC.TL_reportResultAddComment) this.c);
                break;
        }
    }

    public /* synthetic */ mp0(org.telegram.ui.Components.zo0 zo0Var, a0.h hVar, int i7, int i10) {
        this.a = i10;
        this.b = zo0Var;
        this.c = hVar;
    }
}
