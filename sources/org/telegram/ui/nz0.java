package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class nz0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public nz0(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        long j10;
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
        org.telegram.ui.Components.nt0 nt0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i10 == -1) {
            ProfileActivity profileActivity = this.b;
            rz0 rz0Var = profileActivity.O;
            if (rz0Var == null || (nt0Var = rz0Var.I0) == null || !nt0Var.n0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.U4();
                return;
            }
        }
        final int i20 = 2;
        int i21 = 0;
        if (i10 == 2) {
            this.b.p4(false);
            return;
        }
        final int i22 = 1;
        if (i10 == 1) {
            TLRPC.User user = this.b.getMessagesController().getUser(Long.valueOf(this.b.f1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            hs hsVar = new hs(bundle, profileActivity2.A0);
            hsVar.O = new rx0(profileActivity2, user);
            profileActivity2.presentFragment(hsVar);
            return;
        }
        if (i10 == 3) {
            Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
            e.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
            e.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
            ey eyVar = new ey(e);
            ProfileActivity profileActivity3 = this.b;
            eyVar.C2 = profileActivity3;
            profileActivity3.presentFragment(eyVar);
            return;
        }
        if (i10 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.f1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new hs(bundle2, profileActivity4.A0));
            return;
        }
        if (i10 == 5) {
            TLRPC.User user2 = this.b.getMessagesController().getUser(Long.valueOf(this.b.f1));
            if (user2 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.A0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContact);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ql0(13, this, user2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            this.b.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, this.b.A0);
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.b.k4(false);
            return;
        }
        if (i10 == 45) {
            this.b.k4(true);
            return;
        }
        int i23 = 8;
        int i24 = 17;
        if (i10 == 46) {
            if (!this.b.getUserConfig().isPremium()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i19 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                new sg.y0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.g6 g6Var = this.b.A0;
            my0 my0Var = new my0(this, 2);
            Pattern pattern = org.telegram.ui.Components.f5.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.h3 j11 = org.telegram.messenger.sl.j(1, context, null, false);
            runnable = j11.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
            linearLayout.addView(bk0Var, w7.z5.t(110, 110, 17, 0, 21, 0, 11));
            bk0Var.f(R.raw.raised_hand, 110, 110, null);
            bk0Var.setAutoRepeat(false);
            bk0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            org.telegram.messenger.sl.n(R.string.DisableSharingInfoHeader, textView2, 1, 20.0f);
            int i25 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(textView2, i25, g6Var);
            linearLayout.addView(textView2, w7.z5.t(-1, -2, 17, 20, 0, 20, 14));
            cw0 cw0Var = new cw0(context, g6Var);
            cw0Var.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
            cw0Var.b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
            cw0Var.d.setVisibility(8);
            cw0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            ImageView imageView = cw0Var.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.r6.t(imageView, i25, g6Var, mode);
            linearLayout.addView(cw0Var, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            cw0 cw0Var2 = new cw0(context, g6Var);
            cw0Var2.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
            cw0Var2.b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
            cw0Var2.d.setVisibility(8);
            cw0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            org.telegram.ui.ActionBar.r6.t(cw0Var2.c, i25, g6Var, mode);
            linearLayout.addView(cw0Var2, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            cw0 cw0Var3 = new cw0(context, g6Var);
            cw0Var3.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
            cw0Var3.b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
            cw0Var3.d.setVisibility(8);
            cw0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            org.telegram.ui.ActionBar.r6.t(cw0Var3.c, i25, g6Var, mode);
            linearLayout.addView(cw0Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ei.d dVar = new ei.d(context, g6Var, true);
            dVar.setOnClickListener(new org.telegram.ui.ActionBar.s1(25, zArr, runnable));
            dVar.f();
            dVar.i(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
            linearLayout.addView(dVar, w7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            j11.customView = linearLayout;
            j11.show();
            j11.setOnDismissListener(new eh(24, zArr, my0Var));
            return;
        }
        if (i10 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f1, 0, false, new ei.ka(2, profileActivity6, false));
            return;
        }
        if (i10 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.R = LocaleController.getPluralString("DeleteTopics", 1);
            i18 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
            TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.g1, profileActivity7.h1);
            final int i26 = 0;
            alertDialog$Builder2.a.T = LocaleController.formatString("DeleteSelectedTopic", R.string.DeleteSelectedTopic, findTopic == null ? "topic" : findTopic.title);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.lz0
                public final /* synthetic */ nz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.z1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i27) {
                    org.telegram.ui.ActionBar.h5 h5Var;
                    org.telegram.ui.ActionBar.h5 h5Var2;
                    org.telegram.ui.ActionBar.h5 h5Var3;
                    org.telegram.ui.ActionBar.h5 h5Var4;
                    int i28;
                    int i29;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i26;
                    nz0 nz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity8 = nz0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.h1));
                            profileActivity8.getMessagesController().getTopicsController().deleteTopics(profileActivity8.g1, arrayList);
                            profileActivity8.K1 = 0;
                            h5Var = ((org.telegram.ui.ActionBar.o2) profileActivity8).parentLayout;
                            if (h5Var != null) {
                                h5Var2 = ((org.telegram.ui.ActionBar.o2) profileActivity8).parentLayout;
                                if (h5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < h5Var3.getFragmentStack().size(); i31++) {
                                        h5Var4 = ((org.telegram.ui.ActionBar.o2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) h5Var4.getFragmentStack().get(i31);
                                        if ((o2Var instanceof sn) && ((sn) o2Var).d() == profileActivity8.h1) {
                                            o2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(parentActivity2), profileActivity8.A0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            c2Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = nz0Var.b;
                            i28 = ((org.telegram.ui.ActionBar.o2) profileActivity9).currentAccount;
                            if (MessagesController.getInstance(i28).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.o2) profileActivity9).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity9.k1 = true;
                                profileActivity9.getSecretChatHelper().startSecretChat(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().getUser(Long.valueOf(profileActivity9.f1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = nz0Var.b;
                            int realPosition = profileActivity10.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.w2;
                            if (profileActivity10.J2 == null || realPosition != 0) {
                                if (profileActivity10.r5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity10.m5(false);
                                }
                                if (profileActivity10.o0.getRealCount() == 1) {
                                    ProfileActivity.t3(profileActivity10, true);
                                }
                                if (F == null || profileActivity10.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity10.o0.F(1);
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
                                    profileActivity10.getMessagesStorage().clearUserPhoto(profileActivity10.f1, F.id);
                                }
                                wy0 wy0Var = profileActivity10.o0;
                                ArrayList arrayList2 = wy0Var.X0;
                                ArrayList arrayList3 = wy0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = wy0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        wy0Var.U0.remove(realPosition);
                                        wy0Var.T0.remove(realPosition);
                                        wy0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        wy0Var.Y0.remove(realPosition);
                                        wy0Var.Z0.remove(realPosition);
                                        wy0Var.a1.remove(realPosition);
                                        wy0Var.d1.delete(realPosition);
                                        wy0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            wy0Var.P0 = (ImageLocation) arrayList2.get(0);
                                            wy0Var.Q0 = null;
                                            wy0Var.R0 = null;
                                        }
                                        wy0Var.D0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity10.o0.getRealCount() <= 0) {
                                    profileActivity10.o0.setVisibility(8);
                                    profileActivity10.f0.setForegroundAlpha(1.0f);
                                    profileActivity10.Y.setVisibility(0);
                                    profileActivity10.I0 = true;
                                    View m10 = profileActivity10.c.m(0);
                                    if (m10 != null) {
                                        profileActivity10.a.v0(0, m10.getTop() - profileActivity10.V3(), org.telegram.ui.Components.bs.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.r0.b();
                                if (profileActivity10.U5 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.U5, true);
                                }
                                profileActivity10.p2 = (AndroidUtilities.isTablet() || profileActivity10.o2 || !profileActivity10.f0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity10.J2 = null;
                                profileActivity10.K2 = null;
                                wy0 wy0Var2 = profileActivity10.o0;
                                wy0Var2.H0 = true;
                                wy0Var2.K0 = profileActivity10.L2;
                                wy0Var2.q1 = null;
                                wy0Var2.r1 = null;
                                wy0Var2.setCreateThumbFromParent(false);
                                profileActivity10.m5(true);
                                profileActivity10.S4(false, true);
                                profileActivity10.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity10.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity10.getUserConfig().saveConfig(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new wv(i24));
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.show();
            TextView textView3 = (TextView) c2Var2.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i10 == 24) {
            ProfileActivity profileActivity8 = this.b;
            s21.O(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i10 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.r1) {
                profileActivity9.presentFragment(td1.a0(profileActivity9.g1, profileActivity9.h1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j12 = profileActivity10.g1;
            if (j12 != 0) {
                bundle3.putLong("chat_id", j12);
            } else if (profileActivity10.s2) {
                bundle3.putLong("user_id", profileActivity10.f1);
            }
            ko koVar = new ko(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.v2;
            if (chatFull != null) {
                koVar.l0(chatFull);
            } else {
                koVar.m0(profileActivity11.w2);
            }
            this.b.presentFragment(koVar);
            return;
        }
        if (i10 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        int i27 = 19;
        if (i10 == 9) {
            TLRPC.User user3 = this.b.getMessagesController().getUser(Long.valueOf(this.b.f1));
            if (user3 == null) {
                return;
            }
            Bundle e7 = org.telegram.messenger.v0.e(2, "onlySelect", "dialogsType", true);
            e7.putBoolean("resetDelegate", false);
            e7.putBoolean("closeFragment", false);
            ey eyVar2 = new ey(e7);
            eyVar2.C2 = new e7(this, user3, eyVar2, i27);
            this.b.presentFragment(eyVar2);
            return;
        }
        if (i10 == 10) {
            this.b.u4();
            return;
        }
        if (i10 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.E2 != null) {
                    j10 = DialogObject.makeEncryptedDialogId(r2.id);
                } else {
                    j10 = profileActivity12.f1;
                    if (j10 == 0) {
                        long j13 = profileActivity12.g1;
                        if (j13 == 0) {
                            return;
                        } else {
                            j10 = -j13;
                        }
                    }
                }
                this.b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        if (i10 == 15 || i10 == 16) {
            this.b.q4(i10 == 16);
            return;
        }
        if (i10 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.g1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            jr jrVar = new jr(bundle4);
            jrVar.x0(this.b.v2);
            this.b.presentFragment(jrVar);
            return;
        }
        if (i10 == 18) {
            this.b.x4();
            return;
        }
        if (i10 == 19) {
            this.b.presentFragment(u91.d0(this.b.getMessagesController().getChat(Long.valueOf(this.b.g1)), false));
            return;
        }
        if (i10 == 22) {
            this.b.A4();
            return;
        }
        if (i10 == 38) {
            this.b.r4();
            return;
        }
        if (i10 == 48) {
            ProfileActivity profileActivity13 = this.b;
            org.telegram.ui.Wallet.j9 j9Var = new org.telegram.ui.Wallet.j9(profileActivity13.getMessagesController().getUser(Long.valueOf(this.b.f1)));
            j9Var.e0 = true;
            profileActivity13.presentFragment(j9Var);
            return;
        }
        if (i10 == 39) {
            Bundle i28 = org.telegram.ui.Cells.b1.i(2, TeXSymbolParser.TYPE_ATTR);
            i28.putLong("dialog_id", -this.b.g1);
            org.telegram.ui.Components.xa0 xa0Var = new org.telegram.ui.Components.xa0(i28, null);
            ProfileActivity profileActivity14 = this.b;
            xa0Var.c = profileActivity14.v2;
            profileActivity14.presentFragment(xa0Var);
            return;
        }
        if (i10 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.A0);
            alertDialog$Builder3.a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
            alertDialog$Builder3.a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.lz0
                public final /* synthetic */ nz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.z1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i272) {
                    org.telegram.ui.ActionBar.h5 h5Var;
                    org.telegram.ui.ActionBar.h5 h5Var2;
                    org.telegram.ui.ActionBar.h5 h5Var3;
                    org.telegram.ui.ActionBar.h5 h5Var4;
                    int i282;
                    int i29;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i22;
                    nz0 nz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity82 = nz0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.h1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.g1, arrayList);
                            profileActivity82.K1 = 0;
                            h5Var = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                            if (h5Var != null) {
                                h5Var2 = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                                if (h5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < h5Var3.getFragmentStack().size(); i31++) {
                                        h5Var4 = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) h5Var4.getFragmentStack().get(i31);
                                        if ((o2Var instanceof sn) && ((sn) o2Var).d() == profileActivity82.h1) {
                                            o2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            c2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = nz0Var.b;
                            i282 = ((org.telegram.ui.ActionBar.o2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i282).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.o2) profileActivity92).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity92.k1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.f1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = nz0Var.b;
                            int realPosition = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.w2;
                            if (profileActivity102.J2 == null || realPosition != 0) {
                                if (profileActivity102.r5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity102.m5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.t3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.o0.F(1);
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
                                    profileActivity102.getMessagesStorage().clearUserPhoto(profileActivity102.f1, F.id);
                                }
                                wy0 wy0Var = profileActivity102.o0;
                                ArrayList arrayList2 = wy0Var.X0;
                                ArrayList arrayList3 = wy0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = wy0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        wy0Var.U0.remove(realPosition);
                                        wy0Var.T0.remove(realPosition);
                                        wy0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        wy0Var.Y0.remove(realPosition);
                                        wy0Var.Z0.remove(realPosition);
                                        wy0Var.a1.remove(realPosition);
                                        wy0Var.d1.delete(realPosition);
                                        wy0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            wy0Var.P0 = (ImageLocation) arrayList2.get(0);
                                            wy0Var.Q0 = null;
                                            wy0Var.R0 = null;
                                        }
                                        wy0Var.D0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity102.o0.getRealCount() <= 0) {
                                    profileActivity102.o0.setVisibility(8);
                                    profileActivity102.f0.setForegroundAlpha(1.0f);
                                    profileActivity102.Y.setVisibility(0);
                                    profileActivity102.I0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.v0(0, m10.getTop() - profileActivity102.V3(), org.telegram.ui.Components.bs.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.r0.b();
                                if (profileActivity102.U5 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.U5, true);
                                }
                                profileActivity102.p2 = (AndroidUtilities.isTablet() || profileActivity102.o2 || !profileActivity102.f0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity102.J2 = null;
                                profileActivity102.K2 = null;
                                wy0 wy0Var2 = profileActivity102.o0;
                                wy0Var2.H0 = true;
                                wy0Var2.K0 = profileActivity102.L2;
                                wy0Var2.q1 = null;
                                wy0Var2.r1 = null;
                                wy0Var2.setCreateThumbFromParent(false);
                                profileActivity102.m5(true);
                                profileActivity102.S4(false, true);
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
            i17 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
            long j14 = this.b.f1;
            TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(j14);
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
                pf.d.r(ApplicationLoader.applicationContext, str2);
                return;
            }
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            if (!(U instanceof sn) || ((sn) U).a() != j14) {
                U.presentFragment(sn.W9(j14));
            }
            AndroidUtilities.runOnUIThread(new ai.ra(i17, j14, i22), 150L);
            return;
        }
        if (i10 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            wy0 wy0Var = this.b.o0;
            ImageLocation D = wy0Var.D(wy0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.imageType == 2;
            i16 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
            File pathToAttach = FileLoader.getInstance(i16).getPathToAttach(D.location, z10 ? "mp4" : null, true);
            if (z10 && !pathToAttach.exists()) {
                pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(D.location, "mp4"));
            }
            if (pathToAttach.exists()) {
                MediaController.saveFile(pathToAttach.toString(), this.b.getParentActivity(), 0, null, null, new ai.y8(i23, this, z10));
                return;
            }
            return;
        }
        if (i10 == 30) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == 40) {
            ProfileActivity profileActivity15 = this.b;
            lp0 lp0Var = new lp0();
            lp0Var.H = this.b;
            profileActivity15.presentFragment(lp0Var);
            return;
        }
        if (i10 == 42) {
            AndroidUtilities.addToClipboard(this.b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(this.b.getMessagesController().getUser(Long.valueOf(this.b.f1))));
            return;
        }
        if (i10 == 43) {
            this.b.presentFragment(new sa(null));
            return;
        }
        if (i10 == 31) {
            this.b.presentFragment(new lg0(null));
            return;
        }
        if (i10 != 33) {
            if (i10 == 34) {
                i11 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                if (MessagesController.getInstance(i11).isFrozen()) {
                    i14 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                    b.b(i14);
                    return;
                }
                int realPosition = this.b.o0.getRealPosition();
                ImageLocation D2 = this.b.o0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i12 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                FileLoader fileLoader = FileLoader.getInstance(i12);
                Drawable[] drawableArr = PhotoViewer.U8;
                File pathToAttach2 = fileLoader.getPathToAttach(D2.location, PhotoViewer.r1(D2), true);
                boolean z11 = D2.imageType == 2;
                if (z11) {
                    ImageLocation G = this.b.o0.G(realPosition);
                    i13 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                    str = FileLoader.getInstance(i13).getPathToAttach(G == null ? null : G.location, PhotoViewer.r1(G), true).getAbsolutePath();
                } else {
                    str = null;
                }
                this.b.r0.p(pathToAttach2.getAbsolutePath(), str, z11);
                return;
            }
            if (i10 != 35) {
                if (i10 == 36) {
                    this.b.w4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.A0);
            wy0 wy0Var2 = this.b.o0;
            ImageLocation D3 = wy0Var2.D(wy0Var2.getRealPosition());
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
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.lz0
                public final /* synthetic */ nz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.z1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i272) {
                    org.telegram.ui.ActionBar.h5 h5Var;
                    org.telegram.ui.ActionBar.h5 h5Var2;
                    org.telegram.ui.ActionBar.h5 h5Var3;
                    org.telegram.ui.ActionBar.h5 h5Var4;
                    int i282;
                    int i29;
                    boolean z102;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i20;
                    nz0 nz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList2 = new ArrayList<>();
                            ProfileActivity profileActivity82 = nz0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.h1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.g1, arrayList2);
                            profileActivity82.K1 = 0;
                            h5Var = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                            if (h5Var != null) {
                                h5Var2 = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                                if (h5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < h5Var3.getFragmentStack().size(); i31++) {
                                        h5Var4 = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) h5Var4.getFragmentStack().get(i31);
                                        if ((o2Var instanceof sn) && ((sn) o2Var).d() == profileActivity82.h1) {
                                            o2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            c2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = nz0Var.b;
                            i282 = ((org.telegram.ui.ActionBar.o2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i282).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.o2) profileActivity92).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity92.k1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.f1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = nz0Var.b;
                            int realPosition2 = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition2);
                            TLRPC.UserFull userFull2 = profileActivity102.w2;
                            if (profileActivity102.J2 == null || realPosition2 != 0) {
                                if (profileActivity102.r5 && F != null && userFull2 != null && (photo = userFull2.fallback_photo) != null && photo.id == F.id) {
                                    userFull2.fallback_photo = null;
                                    userFull2.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull2, true);
                                    profileActivity102.m5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.t3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.o0.F(1);
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
                                    profileActivity102.getMessagesStorage().clearUserPhoto(profileActivity102.f1, F.id);
                                }
                                wy0 wy0Var3 = profileActivity102.o0;
                                ArrayList arrayList22 = wy0Var3.X0;
                                ArrayList arrayList3 = wy0Var3.V0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (dialogPhotos = wy0Var3.S0) == null) {
                                        arrayList3.remove(realPosition2);
                                        wy0Var3.U0.remove(realPosition2);
                                        wy0Var3.T0.remove(realPosition2);
                                        wy0Var3.W0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        wy0Var3.Y0.remove(realPosition2);
                                        wy0Var3.Z0.remove(realPosition2);
                                        wy0Var3.a1.remove(realPosition2);
                                        wy0Var3.d1.delete(realPosition2);
                                        wy0Var3.b1.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            wy0Var3.P0 = (ImageLocation) arrayList22.get(0);
                                            wy0Var3.Q0 = null;
                                            wy0Var3.R0 = null;
                                        }
                                        wy0Var3.D0.g();
                                        z102 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z102 = true;
                                    }
                                }
                                if (z102 || profileActivity102.o0.getRealCount() <= 0) {
                                    profileActivity102.o0.setVisibility(8);
                                    profileActivity102.f0.setForegroundAlpha(1.0f);
                                    profileActivity102.Y.setVisibility(0);
                                    profileActivity102.I0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.v0(0, m10.getTop() - profileActivity102.V3(), org.telegram.ui.Components.bs.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.r0.b();
                                if (profileActivity102.U5 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.U5, true);
                                }
                                profileActivity102.p2 = (AndroidUtilities.isTablet() || profileActivity102.o2 || !profileActivity102.f0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity102.J2 = null;
                                profileActivity102.K2 = null;
                                wy0 wy0Var22 = profileActivity102.o0;
                                wy0Var22.H0 = true;
                                wy0Var22.K0 = profileActivity102.L2;
                                wy0Var22.q1 = null;
                                wy0Var22.r1 = null;
                                wy0Var22.setCreateThumbFromParent(false);
                                profileActivity102.m5(true);
                                profileActivity102.S4(false, true);
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
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.a;
            this.b.showDialog(c2Var3);
            TextView textView4 = (TextView) c2Var3.d(-1);
            if (textView4 != null) {
                org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.q7, this.b.A0);
                return;
            }
            return;
        }
        int realPosition2 = this.b.o0.getRealPosition();
        TLRPC.Photo F = this.b.o0.F(realPosition2);
        if (F == null) {
            return;
        }
        wy0 wy0Var3 = this.b.o0;
        ArrayList arrayList2 = wy0Var3.b1;
        ArrayList arrayList3 = wy0Var3.a1;
        ArrayList arrayList4 = wy0Var3.Z0;
        ArrayList arrayList5 = wy0Var3.Y0;
        ArrayList arrayList6 = wy0Var3.W0;
        ArrayList arrayList7 = wy0Var3.U0;
        ArrayList arrayList8 = wy0Var3.X0;
        ArrayList arrayList9 = wy0Var3.V0;
        MessagesController.DialogPhotos dialogPhotos = wy0Var3.S0;
        if (dialogPhotos != null) {
            dialogPhotos.moveToStart(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            wy0Var3.c1++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = wy0Var3.T0;
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
            org.telegram.ui.Components.u71 u71Var = (org.telegram.ui.Components.u71) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, u71Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f7 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f7);
            wy0Var3.P0 = (ImageLocation) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        UserConfig userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new wr0(this, userConfig, F, 6));
        ProfileActivity profileActivity16 = this.b;
        profileActivity16.M.m(profileActivity16.f1, F.video_sizes.isEmpty() ? null : 1, 22);
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
            i15 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
            NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            this.b.m5(true);
        }
        wy0 wy0Var4 = this.b.o0;
        wy0Var4.D0.g();
        wy0Var4.L();
    }
}
