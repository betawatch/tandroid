package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class et0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ et0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.video.o oVar;
        ArrayList arrayList;
        String str;
        int i11;
        int i12;
        String str2;
        boolean z10;
        int i13;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        SpannableStringBuilder spannableStringBuilder;
        String str6;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                kt0 kt0Var = (kt0) this.b;
                String str7 = (String) this.c;
                kt0Var.getClass();
                org.telegram.messenger.i0.g(str7);
                kt0Var.c(true);
                break;
            case 1:
                kt0 kt0Var2 = (kt0) this.b;
                org.telegram.messenger.i0.g(org.telegram.messenger.jj.h0(((TLRPC.PollAnswer) this.c).text, false));
                kt0Var2.c(true);
                break;
            case 2:
                kt0 kt0Var3 = (kt0) this.b;
                byte[] bArr = (byte[]) this.c;
                org.telegram.messenger.qz C = org.telegram.messenger.qz.C(kt0Var3.H.I1);
                org.telegram.messenger.jj jjVar = kt0Var3.H;
                if (jjVar != null && (org.telegram.messenger.jj.n1(jjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                    int f12 = jjVar.f1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().i1(B0);
                    tL_messages_deletePollAnswer.msg_id = f12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.r5 r5Var = Utilities.d;
                    Objects.requireNonNull(r5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.y3(r5Var), new org.telegram.messenger.d(C, 7));
                }
                kt0Var3.c(true);
                break;
            case 3:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 4:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.B0();
                    break;
                }
                break;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.C0();
                break;
            case 6:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) this.c;
                boolean z12 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z12;
                t8Var.setChecked(z12);
                break;
            case 7:
                ((av0) this.b).getMessagesController().c5(null, ((Long) this.c).longValue());
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new un(bundle), true);
                break;
            case 9:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j10 = profileActivity2.z2;
                if (j10 != 0) {
                    TLRPC.User Z1 = profileActivity2.getMessagesController().Z1(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.e1, Z1);
                    if (profileActivity2.D2 != null && Z1 != null && org.telegram.ui.Components.cc.a(profileActivity2)) {
                        org.telegram.ui.Components.cc.D(profileActivity2, Z1, profileActivity2.D2.title).j();
                    }
                    if (profileActivity2.t2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.C5(true, false);
                        break;
                    }
                } else {
                    profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                    if (org.telegram.messenger.i0.Q1()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.e1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().k(4, new Object[0]);
                    }
                    profileActivity2.getMessagesController().f0(profileActivity2.e1, profileActivity2.getMessagesController().Z1(Long.valueOf(profileActivity2.getUserConfig().e())));
                    profileActivity2.I1 = i10;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 10:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.R6;
                org.telegram.messenger.i0.g("https://" + profileActivity3.getMessagesController().U2 + "/" + org.telegram.messenger.w3.K(chat, false));
                break;
            case 11:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF3 = ProfileActivity.R6;
                profileActivity4.getClass();
                org.telegram.ui.Components.wb.e();
                gf.f.r(profileActivity4.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 12:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF4 = ProfileActivity.R6;
                profileActivity5.D2 = profileActivity5.getMessagesStorage().O(profileActivity5.e1);
                countDownLatch.countDown();
                break;
            case 13:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                View view = (View) this.c;
                RectF rectF5 = ProfileActivity.R6;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.p8) view).setChecked(profileActivity6.r2.g());
                break;
            case 14:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF6 = ProfileActivity.R6;
                profileActivity7.getClass();
                profileActivity7.F2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                break;
            case 15:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                RectF rectF7 = ProfileActivity.R6;
                if (!zArr2[0] && (oVar = profileActivity8.x5) != null) {
                    oVar.run();
                }
                profileActivity8.x5 = null;
                break;
            case 16:
                fw0 fw0Var = (fw0) this.b;
                a0.h hVar = (a0.h) this.c;
                ProfileActivity profileActivity9 = fw0Var.R2.c;
                org.telegram.ui.Components.cc.x(profileActivity9.getParentActivity(), profileActivity9.m5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, fw0Var.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, fw0Var.I0)).j();
                break;
            case 17:
                uw0 uw0Var = (uw0) this.b;
                a0.h hVar2 = (a0.h) this.c;
                ProfileActivity profileActivity10 = uw0Var.R2;
                org.telegram.ui.Components.cc.x(profileActivity10.getParentActivity(), profileActivity10.m5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, uw0Var.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, uw0Var.I0)).j();
                break;
            case 18:
                ((xx0) this.b).e.presentFragment(ProfileActivity.z4(((Long) this.c).longValue()));
                break;
            case 19:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.b;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.c;
                z9 z9Var = new z9(null);
                z9Var.d = p6Var;
                k2Var.presentFragment(z9Var);
                break;
            case 20:
                hy0 hy0Var = (hy0) this.b;
                String str8 = (String) this.c;
                ArrayList arrayList2 = hy0Var.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = hy0Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str9 = " ";
                String[] split = str8.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i14 = 0; i14 < split.length; i14++) {
                    String R0 = org.telegram.messenger.cd.D0().R0(split[i14], true, false);
                    strArr2[i14] = R0;
                    if (R0.equals(split[i14])) {
                        strArr2[i14] = null;
                    }
                }
                int i15 = 0;
                while (true) {
                    gy0[] gy0VarArr = hy0Var.c;
                    if (i15 >= gy0VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str10 = str8;
                        if (hy0Var.E != null) {
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) arrayList2.get(i16);
                                String str11 = str9 + hpVar.a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < split.length) {
                                        if (split[i17].length() != 0) {
                                            String str12 = split[i17];
                                            arrayList = arrayList2;
                                            int indexOf = str11.indexOf(str9 + str12);
                                            if (indexOf >= 0 || (str2 = strArr3[i17]) == null) {
                                                i12 = indexOf;
                                            } else {
                                                str12 = str2;
                                                i12 = str11.indexOf(str9.concat(str2));
                                            }
                                            if (i12 >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    str = str9;
                                                    spannableStringBuilder2 = new SpannableStringBuilder(hpVar.a);
                                                } else {
                                                    str = str9;
                                                }
                                                i11 = size;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(k2Var2.getThemedColor(org.telegram.ui.ActionBar.t6.q6)), i12, str12.length() + i12, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            str = str9;
                                            i11 = size;
                                        }
                                        if (spannableStringBuilder2 != null && i17 == split.length - 1) {
                                            arrayList4.add(hpVar);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i17++;
                                        size = i11;
                                        arrayList2 = arrayList;
                                        str9 = str;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i16++;
                                size = size;
                                arrayList2 = arrayList;
                                str9 = str9;
                            }
                        }
                        org.telegram.messenger.i0.g3(new m90(hy0Var, str10, arrayList3, arrayList4, arrayList5, 19));
                        break;
                    } else {
                        gy0 gy0Var = gy0VarArr[i15];
                        if (gy0Var == null) {
                            i13 = i15;
                            z10 = z11;
                        } else {
                            String str13 = gy0Var.a;
                            z10 = z11;
                            String str14 = " " + str13.toLowerCase();
                            i13 = i15;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            int i18 = 0;
                            while (i18 < split.length) {
                                if (split[i18].length() != 0) {
                                    String str15 = split[i18];
                                    strArr = strArr2;
                                    int indexOf2 = str14.indexOf(" " + str15);
                                    if (indexOf2 >= 0 || (str6 = strArr[i18]) == null) {
                                        str6 = str15;
                                    } else {
                                        indexOf2 = str14.indexOf(" ".concat(str6));
                                    }
                                    if (indexOf2 >= 0) {
                                        str3 = str14;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str13) : spannableStringBuilder3;
                                        String str16 = str6;
                                        str4 = str8;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(k2Var2.getThemedColor(org.telegram.ui.ActionBar.t6.q6));
                                        int length = str16.length() + indexOf2;
                                        str5 = str13;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i15 = i13 + 1;
                                        z11 = z10;
                                        strArr2 = strArr;
                                        str8 = str8;
                                    }
                                } else {
                                    str3 = str14;
                                    strArr = strArr2;
                                    str4 = str8;
                                    str5 = str13;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i18 == split.length - 1) {
                                    if (gy0Var.f == 502) {
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 >= 4) {
                                                i19 = -1;
                                            } else if (org.telegram.messenger.d20.i(i19).p()) {
                                                i19++;
                                            }
                                        }
                                        if (i19 < 0) {
                                        }
                                    }
                                    arrayList3.add(gy0Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i18++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                strArr2 = strArr;
                                str14 = str3;
                                str13 = str5;
                                str8 = str4;
                            }
                        }
                        strArr = strArr2;
                        i15 = i13 + 1;
                        z11 = z10;
                        strArr2 = strArr;
                        str8 = str8;
                    }
                }
                break;
            case 21:
                hy0 hy0Var2 = (hy0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                hy0Var2.d.addAll(arrayList6);
                int i20 = hy0Var2.f;
                org.telegram.messenger.vp.r1(i20).p2 = arrayList6;
                org.telegram.messenger.vp.r1(i20).q2 = hy0Var2.E;
                if (!hy0Var2.x) {
                    hy0Var2.f();
                    break;
                }
                break;
            case 22:
                ly0 ly0Var = (ly0) this.b;
                ly0Var.f.add((ny0) this.c);
                ly0Var.a();
                break;
            case 23:
                View[] viewArr = (View[]) this.b;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                b01 b01Var = (b01) viewArr[0];
                b01Var.b = tL_channels_sponsoredMessageReportResultChooseOption;
                b01Var.c = null;
                b01Var.d = null;
                b01Var.f.f3.O(false);
                break;
            case 24:
                ((b01) ((View[]) this.b)[0]).b((TLRPC.TL_reportResultAddComment) this.c);
                break;
            case 25:
                View[] viewArr2 = (View[]) this.b;
                TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = (TLRPC.TL_reportResultChooseOption) this.c;
                b01 b01Var2 = (b01) viewArr2[0];
                b01Var2.b = null;
                b01Var2.c = tL_reportResultChooseOption;
                b01Var2.d = null;
                b01Var2.f.f3.O(false);
                break;
            case 26:
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.b;
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.c;
                aVar.run();
                ccVar.c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                break;
            case 27:
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) this.b;
                org.telegram.ui.Components.gi0 gi0Var = (org.telegram.ui.Components.gi0) this.c;
                org.telegram.ui.Components.cc.a0(k2Var3).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                org.telegram.messenger.i0.g3(gi0Var);
                break;
            case 28:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                gs0 gs0Var = (gs0) this.c;
                secretMediaViewer.K = false;
                gs0Var.a.O0(false, true);
                break;
            default:
                ((SecretMediaViewer) ((m5.e) this.b).c).i((File) this.c);
                break;
        }
    }

    public /* synthetic */ et0(org.telegram.ui.Components.op0 op0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = op0Var;
        this.c = hVar;
    }
}
