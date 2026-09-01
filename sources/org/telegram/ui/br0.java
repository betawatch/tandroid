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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ br0(int i10, Object obj, Object obj2) {
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
        String str3;
        int i12;
        String[] strArr;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.a;
        int i14 = 5;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                eg.o1 o1Var = (eg.o1) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                o1Var.e.h();
                o1Var.c.postRunnable(new ag.f(i14));
                photoViewer.b0.removeView(photoViewer.K1);
                break;
            case 1:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
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
            case 2:
                nr0 nr0Var = (nr0) obj2;
                nr0Var.getClass();
                ((View) obj).setOutlineProvider(null);
                PhotoViewer photoViewer2 = nr0Var.c;
                ImageView imageView = photoViewer2.u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                cu0 cu0Var = photoViewer2.B2;
                if (cu0Var != null) {
                    cu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 3:
                ys0 ys0Var = (ys0) obj2;
                org.telegram.ui.Components.k71 k71Var = (org.telegram.ui.Components.k71) obj;
                ys0Var.getClass();
                if (k71Var.p() > 0 && k71Var.n() >= k71Var.p() - 590) {
                    ys0Var.a.b0.invalidate();
                    break;
                }
                break;
            case 4:
                ct0 ct0Var = (ct0) obj2;
                eg.o1 o1Var2 = (eg.o1) obj;
                o1Var2.e.h();
                o1Var2.c.postRunnable(new ag.f(i14));
                try {
                    ct0Var.b.b0.removeView(o1Var2);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 5:
                ag.l lVar = (ag.l) obj;
                PhotoViewer photoViewer3 = ((gs0) obj2).b;
                if (photoViewer3.z3 != null) {
                    ImageView imageView2 = photoViewer3.u3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer3.u3.setImageBitmap(photoViewer3.z3);
                    }
                    ((ImageReceiver) lVar.b).setImageBitmap(photoViewer3.z3);
                    break;
                }
                break;
            case 6:
                ((mt0) obj2).r.i7.lock();
                ((AnimatorSet) obj).start();
                break;
            case 7:
                lu0 lu0Var = (lu0) obj;
                ((mt0) obj2).r.p4 = false;
                if (!lu0Var.s) {
                    lu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 8:
                tv0 tv0Var = (tv0) obj2;
                tv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                tv0Var.c(true);
                break;
            case 9:
                tv0 tv0Var2 = (tv0) obj2;
                tv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                tv0Var2.c(true);
                break;
            case 10:
                tv0 tv0Var3 = (tv0) obj2;
                SendMessagesHelper.getInstance(tv0Var3.E.currentAccount).deletePollOption(tv0Var3.E, (byte[]) obj);
                tv0Var3.c(true);
                break;
            case 11:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 14:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z4 = !privacySettingsActivity2.S;
                privacySettingsActivity2.S = z4;
                ((org.telegram.ui.Cells.s8) obj).setChecked(z4);
                break;
            case 15:
                ((ox0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i15 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i15);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new xn(bundle), true);
                break;
            case 17:
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
                    int i16 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i16);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i16, Long.valueOf(-profileActivity2.c1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.c1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.G1 = i10;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 18:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 19:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 20:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.B2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.c1);
                ((CountDownLatch) obj).countDown();
                break;
            case 21:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.D2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 22:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.o8) ((View) obj)).setChecked(profileActivity6.p2.g());
                break;
            case 23:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (w8Var = profileActivity7.u5) != null) {
                    w8Var.run();
                }
                profileActivity7.u5 = null;
                break;
            case 24:
                ty0 ty0Var = (ty0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = ty0Var.Y0.c;
                org.telegram.ui.Components.qc.x(profileActivity8.getParentActivity(), profileActivity8.j5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, ty0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), ty0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                break;
            case 25:
                iz0 iz0Var = (iz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = iz0Var.Y0;
                org.telegram.ui.Components.qc.x(profileActivity9.getParentActivity(), profileActivity9.j5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, iz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), iz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                break;
            case 26:
                ((i01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 27:
                aa aaVar = new aa(null);
                aaVar.d = (org.telegram.ui.ActionBar.g6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment(aaVar);
                break;
            case 28:
                s01 s01Var = (s01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList3 = s01Var.d;
                org.telegram.ui.ActionBar.p2 p2Var = s01Var.e;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i17 = 0; i17 < split.length; i17++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i17]);
                    strArr2[i17] = translitString;
                    if (translitString.equals(split[i17])) {
                        strArr2[i17] = null;
                    }
                }
                int i18 = 0;
                while (true) {
                    r01[] r01VarArr = s01Var.c;
                    if (i18 >= r01VarArr.length) {
                        String str6 = str5;
                        String[] strArr3 = strArr2;
                        if (s01Var.B != null) {
                            int size = arrayList3.size();
                            int i19 = 0;
                            while (i19 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList3.get(i19);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i20 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i20 < split.length) {
                                        if (split[i20].length() != 0) {
                                            String str8 = split[i20];
                                            int indexOf = str7.indexOf(" " + str8);
                                            arrayList = arrayList3;
                                            if (indexOf < 0 && (str = strArr3[i20]) != null) {
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
                                        if (spannableStringBuilder2 != null && i20 == split.length - 1) {
                                            arrayList5.add(faqSearchResult);
                                            arrayList6.add(spannableStringBuilder2);
                                        }
                                        i20++;
                                        arrayList3 = arrayList;
                                        size = i11;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                                i19++;
                                arrayList3 = arrayList;
                                size = size;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(s01Var, str6, arrayList4, arrayList5, arrayList6, 28));
                        break;
                    } else {
                        r01 r01Var = r01VarArr[i18];
                        if (r01Var != null) {
                            String str9 = r01Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i21 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i21 < split.length) {
                                if (split[i21].length() != 0) {
                                    String str11 = split[i21];
                                    str2 = str5;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i21]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str12 = str4;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str9) : spannableStringBuilder3;
                                        str3 = str10;
                                        i12 = i18;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(p2Var.getThemedColor(org.telegram.ui.ActionBar.k6.q6));
                                        int length = str12.length() + indexOf2;
                                        strArr = strArr2;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i18++;
                                        str5 = str2;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str5;
                                    str3 = str10;
                                    i12 = i18;
                                    strArr = strArr2;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i21 == split.length - 1) {
                                    if (r01Var.f == 502) {
                                        int i22 = 0;
                                        while (true) {
                                            if (i22 >= 4) {
                                                i22 = -1;
                                            } else if (UserConfig.getInstance(i22).isClientActivated()) {
                                                i22++;
                                            }
                                        }
                                        if (i22 < 0) {
                                        }
                                    }
                                    arrayList4.add(r01Var);
                                    arrayList6.add(spannableStringBuilder);
                                }
                                i21++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                str5 = str2;
                                strArr2 = strArr;
                                str10 = str3;
                                i18 = i12;
                            }
                        }
                        str2 = str5;
                        i18++;
                        str5 = str2;
                        strArr2 = strArr2;
                    }
                }
                break;
            default:
                s01 s01Var2 = (s01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList7 = (ArrayList) obj;
                s01Var2.d.addAll(arrayList7);
                int i23 = s01Var2.f;
                MessagesController.getInstance(i23).faqSearchArray = arrayList7;
                MessagesController.getInstance(i23).faqWebPage = s01Var2.B;
                if (!s01Var2.w) {
                    s01Var2.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ br0(org.telegram.ui.Components.mq0 mq0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = mq0Var;
        this.c = hVar;
    }
}
