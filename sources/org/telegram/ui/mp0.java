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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        ai.l2 l2Var;
        ArrayList arrayList;
        String str;
        int i10;
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
                op0 op0Var = (op0) this.b;
                tg.o0 o0Var = (tg.o0) this.c;
                o0Var.e.h();
                o0Var.c.postRunnable(new ah0(21));
                try {
                    op0Var.b.f0.removeView(o0Var);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                yp0 yp0Var = (yp0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                yp0Var.r.l7.d();
                animatorSet.start();
                break;
            case 2:
                yp0 yp0Var2 = (yp0) this.b;
                uq0 uq0Var = (uq0) this.c;
                yp0Var2.r.s4 = false;
                if (!uq0Var.s) {
                    uq0Var.a.O0(false, true);
                    break;
                }
                break;
            case 3:
                xr0 xr0Var = (xr0) this.b;
                String str7 = (String) this.c;
                xr0Var.getClass();
                org.telegram.messenger.g0.g(str7);
                xr0Var.c(true);
                break;
            case 4:
                xr0 xr0Var2 = (xr0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                xr0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.gj.h0(pollAnswer.text, false));
                xr0Var2.c(true);
                break;
            case 5:
                xr0 xr0Var3 = (xr0) this.b;
                byte[] bArr = (byte[]) this.c;
                org.telegram.messenger.ez C = org.telegram.messenger.ez.C(xr0Var3.I.K1);
                org.telegram.messenger.gj gjVar = xr0Var3.I;
                if (gjVar != null && (org.telegram.messenger.gj.m1(gjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                    int e12 = gjVar.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().j1(B0);
                    tL_messages_deletePollAnswer.msg_id = e12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.p5 p5Var = Utilities.d;
                    Objects.requireNonNull(p5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.d(C, 7));
                }
                xr0Var3.c(true);
                break;
            case 6:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 7:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    break;
                }
                break;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.D0();
                break;
            case 9:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.c;
                boolean z12 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z12;
                q8Var.setChecked(z12);
                break;
            case 10:
                ((pt0) this.b).getMessagesController().g5(null, ((Long) this.c).longValue());
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new an(bundle), true);
                break;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j3 = profileActivity2.B2;
                if (j3 != 0) {
                    TLRPC.User a22 = profileActivity2.getMessagesController().a2(Long.valueOf(j3));
                    profileActivity2.getMessagesController().f0(profileActivity2.f1, a22);
                    if (profileActivity2.F2 != null && a22 != null && org.telegram.ui.Components.cc.a(profileActivity2)) {
                        org.telegram.ui.Components.cc.D(profileActivity2, a22, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.G5(true, false);
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
                    profileActivity2.getMessagesController().f0(profileActivity2.f1, profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.getUserConfig().e())));
                    profileActivity2.J1 = i7;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 13:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.messenger.g0.g("https://" + profileActivity3.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(chat, false));
                break;
            case 14:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF3 = ProfileActivity.X6;
                profileActivity4.getClass();
                org.telegram.ui.Components.xb.e();
                vf.c.t(profileActivity4.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 15:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) this.c;
                RectF rectF4 = ProfileActivity.X6;
                org.telegram.ui.Components.on onVar = snVar.e;
                yw ywVar = profileActivity5.j5;
                View D = (ywVar == null || ywVar.getFragmentView() == null) ? profileActivity5.k5.D() : profileActivity5.j5.getFragmentView();
                RectF rectF5 = profileActivity5.j6;
                profileActivity5.i6 = jh.k.c(onVar, D, rectF5) ? rectF5.left : 0.0f;
                profileActivity5.c4();
                break;
            case 16:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF6 = ProfileActivity.X6;
                profileActivity6.F2 = profileActivity6.getMessagesStorage().O(profileActivity6.f1);
                countDownLatch.countDown();
                break;
            case 17:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                View view = (View) this.c;
                RectF rectF7 = ProfileActivity.X6;
                profileActivity7.getClass();
                ((org.telegram.ui.Cells.l8) view).setChecked(profileActivity7.t2.g());
                break;
            case 18:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF8 = ProfileActivity.X6;
                profileActivity8.getClass();
                profileActivity8.H2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                break;
            case 19:
                ProfileActivity profileActivity9 = (ProfileActivity) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                RectF rectF9 = ProfileActivity.X6;
                if (!zArr2[0] && (l2Var = profileActivity9.B5) != null) {
                    l2Var.run();
                }
                profileActivity9.B5 = null;
                break;
            case 20:
                tu0 tu0Var = (tu0) this.b;
                a0.h hVar = (a0.h) this.c;
                ProfileActivity profileActivity10 = tu0Var.V2.c;
                org.telegram.ui.Components.cc.x(profileActivity10.getParentActivity(), profileActivity10.q5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wj, tu0Var.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, tu0Var.J0)).j();
                break;
            case 21:
                iv0 iv0Var = (iv0) this.b;
                a0.h hVar2 = (a0.h) this.c;
                ProfileActivity profileActivity11 = iv0Var.V2;
                org.telegram.ui.Components.cc.x(profileActivity11.getParentActivity(), profileActivity11.q5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wj, iv0Var.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, iv0Var.J0)).j();
                break;
            case 22:
                ((iw0) this.b).e.presentFragment(ProfileActivity.C4(((Long) this.c).longValue()));
                break;
            case 23:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                y9 y9Var = new y9(null);
                y9Var.d = e6Var;
                e2Var.presentFragment(y9Var);
                break;
            case 24:
                sw0 sw0Var = (sw0) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList2 = sw0Var.d;
                org.telegram.ui.ActionBar.e2 e2Var2 = sw0Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str9 = " ";
                String[] split = str8.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String S0 = org.telegram.messenger.hd.E0().S0(split[i13], true, false);
                    strArr2[i13] = S0;
                    if (S0.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    rw0[] rw0VarArr = sw0Var.c;
                    if (i14 >= rw0VarArr.length) {
                        String str10 = str8;
                        String[] strArr3 = strArr2;
                        if (sw0Var.F != null) {
                            int size = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size) {
                                org.telegram.messenger.zo zoVar = (org.telegram.messenger.zo) arrayList2.get(i15);
                                String str11 = str9 + zoVar.a.toLowerCase();
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
                                                    str = str9;
                                                    spannableStringBuilder2 = new SpannableStringBuilder(zoVar.a);
                                                } else {
                                                    str = str9;
                                                }
                                                i10 = size;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(e2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), i11, str12.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            str = str9;
                                            i10 = size;
                                        }
                                        if (spannableStringBuilder2 != null && i16 == split.length - 1) {
                                            arrayList4.add(zoVar);
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
                        org.telegram.messenger.g0.h3(new cu0(sw0Var, str10, arrayList3, arrayList4, arrayList5, 3));
                        break;
                    } else {
                        rw0 rw0Var = rw0VarArr[i14];
                        if (rw0Var == null) {
                            i12 = i14;
                            z10 = z11;
                        } else {
                            String str13 = rw0Var.a;
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
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(e2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.q6));
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
                                    if (rw0Var.f == 502) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 >= 4) {
                                                i18 = -1;
                                            } else if (org.telegram.messenger.m10.i(i18).p()) {
                                                i18++;
                                            }
                                        }
                                        if (i18 < 0) {
                                        }
                                    }
                                    arrayList3.add(rw0Var);
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
            case 25:
                sw0 sw0Var2 = (sw0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                sw0Var2.d.addAll(arrayList6);
                int i19 = sw0Var2.f;
                org.telegram.messenger.np.s1(i19).q2 = arrayList6;
                org.telegram.messenger.np.s1(i19).r2 = sw0Var2.F;
                if (!sw0Var2.x) {
                    sw0Var2.f();
                    break;
                }
                break;
            case 26:
                ww0 ww0Var = (ww0) this.b;
                ww0Var.f.add((yw0) this.c);
                ww0Var.a();
                break;
            case 27:
                View[] viewArr = (View[]) this.b;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                ly0 ly0Var = (ly0) viewArr[0];
                ly0Var.b = tL_channels_sponsoredMessageReportResultChooseOption;
                ly0Var.c = null;
                ly0Var.d = null;
                ly0Var.f.g3.O(false);
                break;
            case 28:
                ((ly0) ((View[]) this.b)[0]).b((TLRPC.TL_reportResultAddComment) this.c);
                break;
            default:
                View[] viewArr2 = (View[]) this.b;
                TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = (TLRPC.TL_reportResultChooseOption) this.c;
                ly0 ly0Var2 = (ly0) viewArr2[0];
                ly0Var2.b = null;
                ly0Var2.c = tL_reportResultChooseOption;
                ly0Var2.d = null;
                ly0Var2.f.g3.O(false);
                break;
        }
    }

    public /* synthetic */ mp0(org.telegram.ui.Components.po0 po0Var, a0.h hVar, int i7, int i10) {
        this.a = i10;
        this.b = po0Var;
        this.c = hVar;
    }
}
