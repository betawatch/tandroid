package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n01 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public n01(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        long j3;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TL_bots.BotInfo botInfo;
        int i18;
        Runnable runnable;
        int i19;
        org.telegram.ui.Components.xs0 xs0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i10 == -1) {
            ProfileActivity profileActivity = this.b;
            r01 r01Var = profileActivity.O;
            if (r01Var == null || (xs0Var = r01Var.I0) == null || !xs0Var.n0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.R4();
                return;
            }
        }
        final int i20 = 2;
        int i21 = 0;
        if (i10 == 2) {
            this.b.n4(false);
            return;
        }
        final int i22 = 1;
        if (i10 == 1) {
            TLRPC.User user = this.b.getMessagesController().getUser(Long.valueOf(this.b.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            ts tsVar = new ts(bundle, profileActivity2.z0);
            tsVar.O = new oy0(profileActivity2, user);
            profileActivity2.presentFragment(tsVar);
            return;
        }
        if (i10 == 3) {
            Bundle e = org.telegram.messenger.a2.e(3, "onlySelect", "dialogsType", true);
            e.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
            e.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
            wy wyVar = new wy(e);
            ProfileActivity profileActivity3 = this.b;
            wyVar.C2 = profileActivity3;
            profileActivity3.presentFragment(wyVar);
            return;
        }
        if (i10 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.e1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new ts(bundle2, profileActivity4.z0));
            return;
        }
        if (i10 == 5) {
            TLRPC.User user2 = this.b.getMessagesController().getUser(Long.valueOf(this.b.e1));
            if (user2 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.z0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new fz0(i22, this, user2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            this.b.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.b.z0));
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.b.i4(false);
            return;
        }
        if (i10 == 45) {
            this.b.i4(true);
            return;
        }
        int i23 = 12;
        final int i24 = 0;
        if (i10 == 46) {
            if (!this.b.getUserConfig().isPremium()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i19 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                new qg.a1(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.f6 f6Var = this.b.z0;
            k01 k01Var = new k01(this, 0);
            Pattern pattern = org.telegram.ui.Components.d5.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.h3 i25 = org.telegram.messenger.em.i(1, context, null, false);
            runnable = i25.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
            linearLayout.addView(kj0Var, w7.a6.t(110, 110, 17, 0, 21, 0, 11));
            kj0Var.f(R.raw.raised_hand, 110, 110, null);
            kj0Var.setAutoRepeat(false);
            kj0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
            textView2.setTextSize(1, 20.0f);
            int i26 = org.telegram.ui.ActionBar.j6.G6;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i26, f6Var));
            linearLayout.addView(textView2, w7.a6.t(-1, -2, 17, 20, 0, 20, 14));
            ww0 ww0Var = new ww0(context, f6Var);
            ww0Var.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
            ww0Var.b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
            ww0Var.d.setVisibility(8);
            ww0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            ww0Var.c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i26, f6Var));
            linearLayout.addView(ww0Var, w7.a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var2 = new ww0(context, f6Var);
            ww0Var2.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
            ww0Var2.b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
            ww0Var2.d.setVisibility(8);
            ww0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            ww0Var2.c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i26, f6Var));
            linearLayout.addView(ww0Var2, w7.a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            ww0 ww0Var3 = new ww0(context, f6Var);
            ww0Var3.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
            ww0Var3.b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
            ww0Var3.d.setVisibility(8);
            ww0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            ww0Var3.c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i26, f6Var));
            linearLayout.addView(ww0Var3, w7.a6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            bi.d dVar = new bi.d(context, f6Var, true);
            dVar.setOnClickListener(new sh(i23, zArr, runnable));
            dVar.e();
            dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
            linearLayout.addView(dVar, w7.a6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i25.customView = linearLayout;
            i25.show();
            i25.setOnDismissListener(new qh(24, zArr, k01Var));
            return;
        }
        if (i10 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.e1, 0, false, new bi.lc(r8, profileActivity6, i20));
            return;
        }
        if (i10 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.R = LocaleController.getPluralString("DeleteTopics", 1);
            i18 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
            TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f1, profileActivity7.g1);
            alertDialog$Builder2.a.T = LocaleController.formatString("DeleteSelectedTopic", R.string.DeleteSelectedTopic, findTopic == null ? "topic" : findTopic.title);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.l01
                public final /* synthetic */ n01 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.c2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i27) {
                    org.telegram.ui.ActionBar.f5 f5Var;
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    int i28;
                    int i29;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i24;
                    n01 n01Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity8 = n01Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.g1));
                            profileActivity8.getMessagesController().getTopicsController().deleteTopics(profileActivity8.f1, arrayList);
                            profileActivity8.J1 = 0;
                            f5Var = ((org.telegram.ui.ActionBar.p2) profileActivity8).parentLayout;
                            if (f5Var != null) {
                                f5Var2 = ((org.telegram.ui.ActionBar.p2) profileActivity8).parentLayout;
                                if (f5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < f5Var3.getFragmentStack().size(); i31++) {
                                        f5Var4 = ((org.telegram.ui.ActionBar.p2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) f5Var4.getFragmentStack().get(i31);
                                        if ((p2Var instanceof eo) && ((eo) p2Var).d() == profileActivity8.g1) {
                                            p2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(parentActivity2), profileActivity8.z0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            d2Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = n01Var.b;
                            i28 = ((org.telegram.ui.ActionBar.p2) profileActivity9).currentAccount;
                            if (MessagesController.getInstance(i28).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.p2) profileActivity9).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity9.j1 = true;
                                profileActivity9.getSecretChatHelper().startSecretChat(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().getUser(Long.valueOf(profileActivity9.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = n01Var.b;
                            int realPosition = profileActivity10.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.n0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.v2;
                            if (profileActivity10.I2 == null || realPosition != 0) {
                                if (profileActivity10.p5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity10.i5(false);
                                }
                                if (profileActivity10.n0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity10, true);
                                }
                                if (F == null || profileActivity10.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity10.n0.F(1);
                                    if (F2 != null) {
                                        profileActivity10.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity10.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity10.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity10.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity10.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity10.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity10.getMessagesStorage().clearUserPhoto(profileActivity10.e1, F.id);
                                }
                                tz0 tz0Var = profileActivity10.n0;
                                ArrayList arrayList2 = tz0Var.X0;
                                ArrayList arrayList3 = tz0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = tz0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        tz0Var.U0.remove(realPosition);
                                        tz0Var.T0.remove(realPosition);
                                        tz0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        tz0Var.Y0.remove(realPosition);
                                        tz0Var.Z0.remove(realPosition);
                                        tz0Var.a1.remove(realPosition);
                                        tz0Var.d1.delete(realPosition);
                                        tz0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            tz0Var.P0 = (ImageLocation) arrayList2.get(0);
                                            tz0Var.Q0 = null;
                                            tz0Var.R0 = null;
                                        }
                                        tz0Var.D0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity10.n0.getRealCount() <= 0) {
                                    profileActivity10.n0.setVisibility(8);
                                    profileActivity10.e0.setForegroundAlpha(1.0f);
                                    profileActivity10.Y.setVisibility(0);
                                    profileActivity10.H0 = true;
                                    View m10 = profileActivity10.c.m(0);
                                    if (m10 != null) {
                                        profileActivity10.a.v0(0, m10.getTop() - profileActivity10.T3(), org.telegram.ui.Components.wr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.q0.c();
                                if (profileActivity10.S5 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.S5, true);
                                }
                                profileActivity10.o2 = (AndroidUtilities.isTablet() || profileActivity10.n2 || !profileActivity10.e0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity10.I2 = null;
                                profileActivity10.J2 = null;
                                tz0 tz0Var2 = profileActivity10.n0;
                                tz0Var2.H0 = true;
                                tz0Var2.K0 = profileActivity10.K2;
                                tz0Var2.q1 = null;
                                tz0Var2.r1 = null;
                                tz0Var2.setCreateThumbFromParent(false);
                                profileActivity10.i5(true);
                                profileActivity10.P4(false, true);
                                profileActivity10.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity10.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity10.getUserConfig().saveConfig(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new js0(3));
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
            d2Var2.show();
            TextView textView3 = (TextView) d2Var2.d(-1);
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        if (i10 == 24) {
            ProfileActivity profileActivity8 = this.b;
            h41.L(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i10 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.q1) {
                profileActivity9.presentFragment(ef1.a0(profileActivity9.f1, profileActivity9.g1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j10 = profileActivity10.f1;
            if (j10 != 0) {
                bundle3.putLong("chat_id", j10);
            } else if (profileActivity10.r2) {
                bundle3.putLong("user_id", profileActivity10.e1);
            }
            yo yoVar = new yo(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.u2;
            if (chatFull != null) {
                yoVar.l0(chatFull);
            } else {
                yoVar.m0(profileActivity11.v2);
            }
            this.b.presentFragment(yoVar);
            return;
        }
        if (i10 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        int i27 = 19;
        if (i10 == 9) {
            TLRPC.User user3 = this.b.getMessagesController().getUser(Long.valueOf(this.b.e1));
            if (user3 == null) {
                return;
            }
            Bundle e7 = org.telegram.messenger.a2.e(2, "onlySelect", "dialogsType", true);
            e7.putBoolean("resetDelegate", false);
            e7.putBoolean("closeFragment", false);
            wy wyVar2 = new wy(e7);
            wyVar2.C2 = new a7(this, user3, wyVar2, i27);
            this.b.presentFragment(wyVar2);
            return;
        }
        if (i10 == 10) {
            this.b.s4();
            return;
        }
        if (i10 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.D2 != null) {
                    j3 = DialogObject.makeEncryptedDialogId(r2.id);
                } else {
                    j3 = profileActivity12.e1;
                    if (j3 == 0) {
                        long j11 = profileActivity12.f1;
                        if (j11 == 0) {
                            return;
                        } else {
                            j3 = -j11;
                        }
                    }
                }
                this.b.getMediaDataController().installShortcut(j3, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if (i10 == 15 || i10 == 16) {
            this.b.o4(i10 == 16);
            return;
        }
        if (i10 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            wr wrVar = new wr(bundle4);
            wrVar.x0(this.b.u2);
            this.b.presentFragment(wrVar);
            return;
        }
        if (i10 == 18) {
            this.b.v4();
            return;
        }
        if (i10 == 19) {
            this.b.presentFragment(fb1.d0(this.b.getMessagesController().getChat(Long.valueOf(this.b.f1)), false));
            return;
        }
        if (i10 == 22) {
            this.b.y4();
            return;
        }
        if (i10 == 38) {
            this.b.p4();
            return;
        }
        if (i10 == 39) {
            Bundle e11 = org.telegram.ui.Cells.r6.e(2, TeXSymbolParser.TYPE_ATTR);
            e11.putLong("dialog_id", -this.b.f1);
            org.telegram.ui.Components.la0 la0Var = new org.telegram.ui.Components.la0(e11, null);
            ProfileActivity profileActivity13 = this.b;
            la0Var.c = profileActivity13.u2;
            profileActivity13.presentFragment(la0Var);
            return;
        }
        if (i10 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.z0);
            alertDialog$Builder3.a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
            alertDialog$Builder3.a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.l01
                public final /* synthetic */ n01 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.c2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i272) {
                    org.telegram.ui.ActionBar.f5 f5Var;
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    int i28;
                    int i29;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i22;
                    n01 n01Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity82 = n01Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.g1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.f1, arrayList);
                            profileActivity82.J1 = 0;
                            f5Var = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                            if (f5Var != null) {
                                f5Var2 = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                                if (f5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < f5Var3.getFragmentStack().size(); i31++) {
                                        f5Var4 = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) f5Var4.getFragmentStack().get(i31);
                                        if ((p2Var instanceof eo) && ((eo) p2Var).d() == profileActivity82.g1) {
                                            p2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(parentActivity2), profileActivity82.z0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            d2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = n01Var.b;
                            i28 = ((org.telegram.ui.ActionBar.p2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i28).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.p2) profileActivity92).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity92.j1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = n01Var.b;
                            int realPosition = profileActivity102.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.n0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.v2;
                            if (profileActivity102.I2 == null || realPosition != 0) {
                                if (profileActivity102.p5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity102.i5(false);
                                }
                                if (profileActivity102.n0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.n0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity102.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity102.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity102.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity102.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity102.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity102.getMessagesStorage().clearUserPhoto(profileActivity102.e1, F.id);
                                }
                                tz0 tz0Var = profileActivity102.n0;
                                ArrayList arrayList2 = tz0Var.X0;
                                ArrayList arrayList3 = tz0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = tz0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        tz0Var.U0.remove(realPosition);
                                        tz0Var.T0.remove(realPosition);
                                        tz0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        tz0Var.Y0.remove(realPosition);
                                        tz0Var.Z0.remove(realPosition);
                                        tz0Var.a1.remove(realPosition);
                                        tz0Var.d1.delete(realPosition);
                                        tz0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            tz0Var.P0 = (ImageLocation) arrayList2.get(0);
                                            tz0Var.Q0 = null;
                                            tz0Var.R0 = null;
                                        }
                                        tz0Var.D0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity102.n0.getRealCount() <= 0) {
                                    profileActivity102.n0.setVisibility(8);
                                    profileActivity102.e0.setForegroundAlpha(1.0f);
                                    profileActivity102.Y.setVisibility(0);
                                    profileActivity102.H0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.v0(0, m10.getTop() - profileActivity102.T3(), org.telegram.ui.Components.wr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.q0.c();
                                if (profileActivity102.S5 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.S5, true);
                                }
                                profileActivity102.o2 = (AndroidUtilities.isTablet() || profileActivity102.n2 || !profileActivity102.e0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity102.I2 = null;
                                profileActivity102.J2 = null;
                                tz0 tz0Var2 = profileActivity102.n0;
                                tz0Var2.H0 = true;
                                tz0Var2.K0 = profileActivity102.K2;
                                tz0Var2.q1 = null;
                                tz0Var2.r1 = null;
                                tz0Var2.setCreateThumbFromParent(false);
                                profileActivity102.i5(true);
                                profileActivity102.P4(false, true);
                                profileActivity102.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity102.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity102.getUserConfig().saveConfig(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            this.b.showDialog(alertDialog$Builder3.a);
            return;
        }
        if (i10 == 44) {
            i17 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
            long j12 = this.b.e1;
            TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(j12);
            if (userFull == null || (botInfo = userFull.bot_info) == null) {
                return;
            }
            String str2 = botInfo.privacy_policy_url;
            if (str2 == null && str2 == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                while (true) {
                    if (i21 >= size) {
                        str2 = LocaleController.getString(R.string.BotDefaultPrivacyPolicy);
                        break;
                    }
                    TLRPC.BotCommand botCommand = arrayList.get(i21);
                    i21++;
                    if ("privacy".equals(botCommand.command)) {
                        break;
                    }
                }
            }
            if (str2 != null) {
                nf.f.s(ApplicationLoader.applicationContext, str2);
                return;
            }
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            if (!(U instanceof eo) || ((eo) U).a() != j12) {
                U.presentFragment(eo.R9(j12));
            }
            AndroidUtilities.runOnUIThread(new di.e2(i17, j12), 150L);
            return;
        }
        if (i10 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            int i28 = Build.VERSION.SDK_INT;
            if (i28 >= 23 && ((i28 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            tz0 tz0Var = this.b.n0;
            ImageLocation D = tz0Var.D(tz0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.imageType == 2;
            i16 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
            File pathToAttach = FileLoader.getInstance(i16).getPathToAttach(D.location, z10 ? "mp4" : null, true);
            if (z10 && !pathToAttach.exists()) {
                pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(D.location, "mp4"));
            }
            if (pathToAttach.exists()) {
                MediaController.saveFile(pathToAttach.toString(), this.b.getParentActivity(), 0, null, null, new bi.ve(i20, this, z10));
                return;
            }
            return;
        }
        if (i10 == 30) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == 40) {
            ProfileActivity profileActivity14 = this.b;
            bq0 bq0Var = new bq0();
            bq0Var.H = this.b;
            profileActivity14.presentFragment(bq0Var);
            return;
        }
        if (i10 == 42) {
            AndroidUtilities.addToClipboard(this.b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(this.b.getMessagesController().getUser(Long.valueOf(this.b.e1))));
            return;
        }
        if (i10 == 43) {
            this.b.presentFragment(new ra(null));
            return;
        }
        if (i10 == 31) {
            this.b.presentFragment(new zg0(null));
            return;
        }
        if (i10 != 33) {
            if (i10 == 34) {
                i11 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                if (MessagesController.getInstance(i11).isFrozen()) {
                    i14 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                    b.b(i14);
                    return;
                }
                int realPosition = this.b.n0.getRealPosition();
                ImageLocation D2 = this.b.n0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i12 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                FileLoader fileLoader = FileLoader.getInstance(i12);
                Drawable[] drawableArr = PhotoViewer.T8;
                File pathToAttach2 = fileLoader.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                boolean z11 = D2.imageType == 2;
                if (z11) {
                    ImageLocation G = this.b.n0.G(realPosition);
                    i13 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
                    str = FileLoader.getInstance(i13).getPathToAttach(G == null ? null : G.location, PhotoViewer.q1(G), true).getAbsolutePath();
                } else {
                    str = null;
                }
                this.b.q0.q(pathToAttach2.getAbsolutePath(), str, z11);
                return;
            }
            if (i10 != 35) {
                if (i10 == 36) {
                    this.b.u4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.z0);
            tz0 tz0Var2 = this.b.n0;
            ImageLocation D3 = tz0Var2.D(tz0Var2.getRealPosition());
            if (D3 == null) {
                return;
            }
            if (D3.imageType == 2) {
                alertDialog$Builder4.a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                alertDialog$Builder4.a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
            } else {
                alertDialog$Builder4.a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                alertDialog$Builder4.a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
            }
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.l01
                public final /* synthetic */ n01 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.c2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i272) {
                    org.telegram.ui.ActionBar.f5 f5Var;
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    int i282;
                    int i29;
                    boolean z102;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i20;
                    n01 n01Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList2 = new ArrayList<>();
                            ProfileActivity profileActivity82 = n01Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.g1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.f1, arrayList2);
                            profileActivity82.J1 = 0;
                            f5Var = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                            if (f5Var != null) {
                                f5Var2 = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                                if (f5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < f5Var3.getFragmentStack().size(); i31++) {
                                        f5Var4 = ((org.telegram.ui.ActionBar.p2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) f5Var4.getFragmentStack().get(i31);
                                        if ((p2Var instanceof eo) && ((eo) p2Var).d() == profileActivity82.g1) {
                                            p2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(parentActivity2), profileActivity82.z0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            d2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = n01Var.b;
                            i282 = ((org.telegram.ui.ActionBar.p2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i282).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.p2) profileActivity92).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity92.j1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = n01Var.b;
                            int realPosition2 = profileActivity102.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.n0.F(realPosition2);
                            TLRPC.UserFull userFull2 = profileActivity102.v2;
                            if (profileActivity102.I2 == null || realPosition2 != 0) {
                                if (profileActivity102.p5 && F != null && userFull2 != null && (photo = userFull2.fallback_photo) != null && photo.id == F.id) {
                                    userFull2.fallback_photo = null;
                                    userFull2.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull2, true);
                                    profileActivity102.i5(false);
                                }
                                if (profileActivity102.n0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.n0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F2.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity102.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity102.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity102.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity102.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity102.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity102.getMessagesStorage().clearUserPhoto(profileActivity102.e1, F.id);
                                }
                                tz0 tz0Var3 = profileActivity102.n0;
                                ArrayList arrayList22 = tz0Var3.X0;
                                ArrayList arrayList3 = tz0Var3.V0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (dialogPhotos = tz0Var3.S0) == null) {
                                        arrayList3.remove(realPosition2);
                                        tz0Var3.U0.remove(realPosition2);
                                        tz0Var3.T0.remove(realPosition2);
                                        tz0Var3.W0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        tz0Var3.Y0.remove(realPosition2);
                                        tz0Var3.Z0.remove(realPosition2);
                                        tz0Var3.a1.remove(realPosition2);
                                        tz0Var3.d1.delete(realPosition2);
                                        tz0Var3.b1.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            tz0Var3.P0 = (ImageLocation) arrayList22.get(0);
                                            tz0Var3.Q0 = null;
                                            tz0Var3.R0 = null;
                                        }
                                        tz0Var3.D0.g();
                                        z102 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z102 = true;
                                    }
                                }
                                if (z102 || profileActivity102.n0.getRealCount() <= 0) {
                                    profileActivity102.n0.setVisibility(8);
                                    profileActivity102.e0.setForegroundAlpha(1.0f);
                                    profileActivity102.Y.setVisibility(0);
                                    profileActivity102.H0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.v0(0, m10.getTop() - profileActivity102.T3(), org.telegram.ui.Components.wr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.q0.c();
                                if (profileActivity102.S5 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.S5, true);
                                }
                                profileActivity102.o2 = (AndroidUtilities.isTablet() || profileActivity102.n2 || !profileActivity102.e0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity102.I2 = null;
                                profileActivity102.J2 = null;
                                tz0 tz0Var22 = profileActivity102.n0;
                                tz0Var22.H0 = true;
                                tz0Var22.K0 = profileActivity102.K2;
                                tz0Var22.q1 = null;
                                tz0Var22.r1 = null;
                                tz0Var22.setCreateThumbFromParent(false);
                                profileActivity102.i5(true);
                                profileActivity102.P4(false, true);
                                profileActivity102.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity102.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity102.getUserConfig().saveConfig(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.a;
            this.b.showDialog(d2Var3);
            TextView textView4 = (TextView) d2Var3.d(-1);
            if (textView4 != null) {
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q7, this.b.z0));
                return;
            }
            return;
        }
        int realPosition2 = this.b.n0.getRealPosition();
        TLRPC.Photo F = this.b.n0.F(realPosition2);
        if (F == null) {
            return;
        }
        tz0 tz0Var3 = this.b.n0;
        ArrayList arrayList2 = tz0Var3.b1;
        ArrayList arrayList3 = tz0Var3.a1;
        ArrayList arrayList4 = tz0Var3.Z0;
        ArrayList arrayList5 = tz0Var3.Y0;
        ArrayList arrayList6 = tz0Var3.W0;
        ArrayList arrayList7 = tz0Var3.U0;
        ArrayList arrayList8 = tz0Var3.X0;
        ArrayList arrayList9 = tz0Var3.V0;
        MessagesController.DialogPhotos dialogPhotos = tz0Var3.S0;
        if (dialogPhotos != null) {
            dialogPhotos.moveToStart(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            tz0Var3.c1++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = tz0Var3.T0;
            arrayList10.add(0, (String) arrayList10.remove(realPosition2));
            ImageLocation imageLocation = (ImageLocation) arrayList6.get(realPosition2);
            arrayList6.remove(realPosition2);
            arrayList6.add(0, imageLocation);
            ImageLocation imageLocation2 = (ImageLocation) arrayList8.get(realPosition2);
            arrayList8.remove(realPosition2);
            arrayList8.add(0, imageLocation2);
            ImageLocation imageLocation3 = (ImageLocation) arrayList5.get(realPosition2);
            arrayList5.remove(realPosition2);
            arrayList5.add(0, imageLocation3);
            org.telegram.ui.Components.d71 d71Var = (org.telegram.ui.Components.d71) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, d71Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f7 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f7);
            tz0Var3.P0 = (ImageLocation) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        UserConfig userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ms0(this, userConfig, F, 6));
        ProfileActivity profileActivity15 = this.b;
        profileActivity15.M.m(profileActivity15.e1, F.video_sizes.isEmpty() ? null : 1, 22);
        TLRPC.User user4 = this.b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
        if (user4 != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
            TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
            userProfilePhoto.photo_id = F.id;
            userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
            userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
            userConfig.setCurrentUser(user4);
            userConfig.saveConfig(true);
            i15 = ((org.telegram.ui.ActionBar.p2) this.b).currentAccount;
            NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            this.b.i5(true);
        }
        tz0 tz0Var4 = this.b.n0;
        tz0Var4.D0.g();
        tz0Var4.L();
    }
}
