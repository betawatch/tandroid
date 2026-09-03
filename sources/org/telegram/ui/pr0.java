package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pr0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.w8 w8Var;
        ArrayList arrayList;
        int i11;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (y5Var != null) {
                    ArrayList arrayList2 = y5Var.h;
                    org.telegram.ui.Components.v5 v5Var = y5Var.n;
                    if (v5Var != null) {
                        arrayList2.add(v5Var);
                    }
                    org.telegram.ui.Components.v5 v5Var2 = y5Var.r;
                    if (v5Var2 != null) {
                        arrayList2.add(v5Var2);
                    }
                    org.telegram.ui.Components.v5 v5Var3 = y5Var.s;
                    if (v5Var3 != null) {
                        arrayList2.add(v5Var3);
                    }
                    y5Var.n = new org.telegram.ui.Components.v5(bitmap);
                    y5Var.r = null;
                    y5Var.s = null;
                    y5Var.t();
                    break;
                }
                break;
            case 1:
                sr0 sr0Var = (sr0) obj2;
                sr0Var.getClass();
                ((View) obj).setOutlineProvider(null);
                PhotoViewer photoViewer = sr0Var.c;
                ImageView imageView = photoViewer.u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                hu0 hu0Var = photoViewer.B2;
                if (hu0Var != null) {
                    hu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 2:
                dt0 dt0Var = (dt0) obj2;
                org.telegram.ui.Components.j71 j71Var = (org.telegram.ui.Components.j71) obj;
                dt0Var.getClass();
                if (j71Var.p() > 0 && j71Var.n() >= j71Var.p() - 590) {
                    dt0Var.a.b0.invalidate();
                    break;
                }
                break;
            case 3:
                ht0 ht0Var = (ht0) obj2;
                eg.o1 o1Var = (eg.o1) obj;
                o1Var.e.h();
                o1Var.c.postRunnable(new ag.f(5));
                try {
                    ht0Var.b.b0.removeView(o1Var);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                ag.l lVar = (ag.l) obj;
                PhotoViewer photoViewer2 = ((ls0) obj2).b;
                if (photoViewer2.z3 != null) {
                    ImageView imageView2 = photoViewer2.u3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer2.u3.setImageBitmap(photoViewer2.z3);
                    }
                    ((ImageReceiver) lVar.b).setImageBitmap(photoViewer2.z3);
                    break;
                }
                break;
            case 5:
                ((rt0) obj2).r.i7.lock();
                ((AnimatorSet) obj).start();
                break;
            case 6:
                qu0 qu0Var = (qu0) obj;
                ((rt0) obj2).r.p4 = false;
                if (!qu0Var.s) {
                    qu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 7:
                yv0 yv0Var = (yv0) obj2;
                yv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                yv0Var.c(true);
                break;
            case 8:
                yv0 yv0Var2 = (yv0) obj2;
                yv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                yv0Var2.c(true);
                break;
            case 9:
                yv0 yv0Var3 = (yv0) obj2;
                SendMessagesHelper.getInstance(yv0Var3.E.currentAccount).deletePollOption(yv0Var3.E, (byte[]) obj);
                yv0Var3.c(true);
                break;
            case 10:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 11:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z4 = !privacySettingsActivity2.S;
                privacySettingsActivity2.S = z4;
                ((org.telegram.ui.Cells.s8) obj).setChecked(z4);
                break;
            case 14:
                ((tx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new xn(bundle), true);
                break;
            case 16:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.x2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.c1, user);
                    if (profileActivity2.B2 != null && user != null && org.telegram.ui.Components.qc.a(profileActivity2)) {
                        org.telegram.ui.Components.qc.D(profileActivity2, user, profileActivity2.B2.title).j();
                    }
                    if (profileActivity2.r2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                } else {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i15 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i15);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.c1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.c1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.G1 = i10;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 17:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 18:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 19:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.B2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.c1);
                ((CountDownLatch) obj).countDown();
                break;
            case 20:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.D2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 21:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.o8) ((View) obj)).setChecked(profileActivity6.p2.g());
                break;
            case 22:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (w8Var = profileActivity7.u5) != null) {
                    w8Var.run();
                }
                profileActivity7.u5 = null;
                break;
            case 23:
                yy0 yy0Var = (yy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = yy0Var.Y0.c;
                org.telegram.ui.Components.qc.x(profileActivity8.getParentActivity(), profileActivity8.j5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, yy0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), yy0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                break;
            case 24:
                mz0 mz0Var = (mz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = mz0Var.Y0;
                org.telegram.ui.Components.qc.x(profileActivity9.getParentActivity(), profileActivity9.j5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, mz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), mz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                break;
            case 25:
                ((n01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 26:
                aa aaVar = new aa(null);
                aaVar.d = (org.telegram.ui.ActionBar.g6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment(aaVar);
                break;
            case 27:
                x01 x01Var = (x01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList3 = x01Var.d;
                org.telegram.ui.ActionBar.p2 p2Var = x01Var.e;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i16 = 0; i16 < split.length; i16++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i16]);
                    strArr2[i16] = translitString;
                    if (translitString.equals(split[i16])) {
                        strArr2[i16] = null;
                    }
                }
                int i17 = 0;
                while (true) {
                    w01[] w01VarArr = x01Var.c;
                    if (i17 >= w01VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (x01Var.B != null) {
                            int size = arrayList3.size();
                            int i18 = 0;
                            while (i18 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList3.get(i18);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i19 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i19 < split.length) {
                                        if (split[i19].length() != 0) {
                                            String str8 = split[i19];
                                            int indexOf = str7.indexOf(" " + str8);
                                            arrayList = arrayList3;
                                            if (indexOf < 0 && (str = strArr3[i19]) != null) {
                                                indexOf = str7.indexOf(" ".concat(str));
                                                str8 = str;
                                            }
                                            if (indexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                i11 = size;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(p2Var.getThemedColor(org.telegram.ui.ActionBar.k6.q6)), indexOf, str8.length() + indexOf, 33);
                                            }
                                        } else {
                                            arrayList = arrayList3;
                                            i11 = size;
                                        }
                                        if (spannableStringBuilder2 != null && i19 == split.length - 1) {
                                            arrayList5.add(faqSearchResult);
                                            arrayList6.add(spannableStringBuilder2);
                                        }
                                        i19++;
                                        arrayList3 = arrayList;
                                        size = i11;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                                i18++;
                                arrayList3 = arrayList;
                                size = size;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(x01Var, str6, arrayList4, arrayList5, arrayList6, 28));
                        break;
                    } else {
                        w01 w01Var = w01VarArr[i17];
                        if (w01Var != null) {
                            String str9 = w01Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i20 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i20 < split.length) {
                                if (split[i20].length() != 0) {
                                    String str11 = split[i20];
                                    i12 = i17;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i20]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str12 = str4;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str9) : spannableStringBuilder3;
                                        str2 = str10;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(p2Var.getThemedColor(org.telegram.ui.ActionBar.k6.q6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i17 = i12 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    i12 = i17;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i20 == split.length - 1) {
                                    if (w01Var.f == 502) {
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 >= 4) {
                                                i21 = -1;
                                            } else if (UserConfig.getInstance(i21).isClientActivated()) {
                                                i21++;
                                            }
                                        }
                                        if (i21 < 0) {
                                        }
                                    }
                                    arrayList4.add(w01Var);
                                    arrayList6.add(spannableStringBuilder);
                                }
                                i20++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i17 = i12;
                                str5 = str3;
                                str10 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i12 = i17;
                        i17 = i12 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 28:
                x01 x01Var2 = (x01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList7 = (ArrayList) obj;
                x01Var2.d.addAll(arrayList7);
                int i22 = x01Var2.f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList7;
                MessagesController.getInstance(i22).faqWebPage = x01Var2.B;
                if (!x01Var2.w) {
                    x01Var2.l();
                    break;
                }
                break;
            default:
                b11 b11Var = (b11) obj2;
                b11Var.f.add((d11) obj);
                b11Var.a();
                break;
        }
    }

    public /* synthetic */ pr0(org.telegram.ui.Components.lq0 lq0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = lq0Var;
        this.c = hVar;
    }
}
