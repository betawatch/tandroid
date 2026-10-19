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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class jz0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public jz0(ProfileActivity profileActivity, Context context) {
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
        org.telegram.ui.Components.jt0 jt0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i10 == -1) {
            ProfileActivity profileActivity = this.b;
            nz0 nz0Var = profileActivity.O;
            if (nz0Var == null || (jt0Var = nz0Var.I0) == null || !jt0Var.n0) {
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
            TLRPC.User user = this.b.getMessagesController().getUser(Long.valueOf(this.b.f1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            fs fsVar = new fs(bundle, profileActivity2.A0);
            fsVar.O = new nx0(profileActivity2, user);
            profileActivity2.presentFragment(fsVar);
            return;
        }
        if (i10 == 3) {
            Bundle d = org.telegram.messenger.kk.d(3, "onlySelect", "dialogsType", true);
            d.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
            d.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
            cy cyVar = new cy(d);
            ProfileActivity profileActivity3 = this.b;
            cyVar.C2 = profileActivity3;
            profileActivity3.presentFragment(cyVar);
            return;
        }
        if (i10 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.f1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new fs(bundle2, profileActivity4.A0));
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
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new en0(11, this, user2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            this.b.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, this.b.A0));
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
        int i23 = 8;
        if (i10 == 46) {
            if (!this.b.getUserConfig().isPremium()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i19 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
                new sg.y0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.d6 d6Var = this.b.A0;
            qy0 qy0Var = new qy0(this, 1);
            Pattern pattern = org.telegram.ui.Components.f5.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.f3 i24 = org.telegram.messenger.kk.i(1, context, null, false);
            runnable = i24.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
            linearLayout.addView(xj0Var, w7.z5.t(110, 110, 17, 0, 21, 0, 11));
            xj0Var.f(R.raw.raised_hand, 110, 110, null);
            xj0Var.setAutoRepeat(false);
            xj0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            org.telegram.messenger.kk.j(20.0f, R.string.DisableSharingInfoHeader, 1, textView2);
            int i25 = org.telegram.ui.ActionBar.h6.G6;
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i25, d6Var));
            linearLayout.addView(textView2, w7.z5.t(-1, -2, 17, 20, 0, 20, 14));
            yv0 yv0Var = new yv0(context, d6Var);
            yv0Var.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
            yv0Var.b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
            yv0Var.d.setVisibility(8);
            yv0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            yv0Var.c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i25, d6Var));
            linearLayout.addView(yv0Var, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yv0 yv0Var2 = new yv0(context, d6Var);
            yv0Var2.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
            yv0Var2.b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
            yv0Var2.d.setVisibility(8);
            yv0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            yv0Var2.c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i25, d6Var));
            linearLayout.addView(yv0Var2, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yv0 yv0Var3 = new yv0(context, d6Var);
            yv0Var3.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
            yv0Var3.b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
            yv0Var3.d.setVisibility(8);
            yv0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            yv0Var3.c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i25, d6Var));
            linearLayout.addView(yv0Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ei.d dVar = new ei.d(context, d6Var, true);
            dVar.setOnClickListener(new org.telegram.ui.ActionBar.s1(25, zArr, runnable));
            dVar.e();
            dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
            linearLayout.addView(dVar, w7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            i24.customView = linearLayout;
            i24.show();
            i24.setOnDismissListener(new eh(24, zArr, qy0Var));
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
            i18 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
            TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.g1, profileActivity7.h1);
            final int i26 = 0;
            alertDialog$Builder2.a.T = LocaleController.formatString("DeleteSelectedTopic", R.string.DeleteSelectedTopic, findTopic == null ? "topic" : findTopic.title);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.hz0
                public final /* synthetic */ jz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.a2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i27) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    int i28;
                    int i29;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i26;
                    jz0 jz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity8 = jz0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.h1));
                            profileActivity8.getMessagesController().getTopicsController().deleteTopics(profileActivity8.g1, arrayList);
                            profileActivity8.K1 = 0;
                            d5Var = ((org.telegram.ui.ActionBar.n2) profileActivity8).parentLayout;
                            if (d5Var != null) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) profileActivity8).parentLayout;
                                if (d5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < d5Var3.getFragmentStack().size(); i31++) {
                                        d5Var4 = ((org.telegram.ui.ActionBar.n2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) d5Var4.getFragmentStack().get(i31);
                                        if ((n2Var instanceof qn) && ((qn) n2Var).d() == profileActivity8.h1) {
                                            n2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(parentActivity2), profileActivity8.A0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            b2Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = jz0Var.b;
                            i28 = ((org.telegram.ui.ActionBar.n2) profileActivity9).currentAccount;
                            if (MessagesController.getInstance(i28).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.n2) profileActivity9).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity9.k1 = true;
                                profileActivity9.getSecretChatHelper().startSecretChat(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().getUser(Long.valueOf(profileActivity9.f1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = jz0Var.b;
                            int realPosition = profileActivity10.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.w2;
                            if (profileActivity10.J2 == null || realPosition != 0) {
                                if (profileActivity10.r5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity10.i5(false);
                                }
                                if (profileActivity10.o0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity10, true);
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
                                sy0 sy0Var = profileActivity10.o0;
                                ArrayList arrayList2 = sy0Var.X0;
                                ArrayList arrayList3 = sy0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = sy0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        sy0Var.U0.remove(realPosition);
                                        sy0Var.T0.remove(realPosition);
                                        sy0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        sy0Var.Y0.remove(realPosition);
                                        sy0Var.Z0.remove(realPosition);
                                        sy0Var.a1.remove(realPosition);
                                        sy0Var.d1.delete(realPosition);
                                        sy0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            sy0Var.P0 = (ImageLocation) arrayList2.get(0);
                                            sy0Var.Q0 = null;
                                            sy0Var.R0 = null;
                                        }
                                        sy0Var.D0.g();
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
                                        profileActivity10.a.v0(0, m10.getTop() - profileActivity10.T3(), org.telegram.ui.Components.bs.h);
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
                                sy0 sy0Var2 = profileActivity10.o0;
                                sy0Var2.H0 = true;
                                sy0Var2.K0 = profileActivity10.L2;
                                sy0Var2.q1 = null;
                                sy0Var2.r1 = null;
                                sy0Var2.setCreateThumbFromParent(false);
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
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fk0(7));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.show();
            TextView textView3 = (TextView) b2Var2.d(-1);
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                return;
            }
            return;
        }
        if (i10 == 24) {
            ProfileActivity profileActivity8 = this.b;
            o21.M(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i10 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.r1) {
                profileActivity9.presentFragment(nd1.a0(profileActivity9.g1, profileActivity9.h1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j11 = profileActivity10.g1;
            if (j11 != 0) {
                bundle3.putLong("chat_id", j11);
            } else if (profileActivity10.s2) {
                bundle3.putLong("user_id", profileActivity10.f1);
            }
            io ioVar = new io(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.v2;
            if (chatFull != null) {
                ioVar.l0(chatFull);
            } else {
                ioVar.m0(profileActivity11.w2);
            }
            this.b.presentFragment(ioVar);
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
            Bundle d10 = org.telegram.messenger.kk.d(2, "onlySelect", "dialogsType", true);
            d10.putBoolean("resetDelegate", false);
            d10.putBoolean("closeFragment", false);
            cy cyVar2 = new cy(d10);
            cyVar2.C2 = new e7(this, user3, cyVar2, i27);
            this.b.presentFragment(cyVar2);
            return;
        }
        if (i10 == 10) {
            this.b.s4();
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
                        long j12 = profileActivity12.g1;
                        if (j12 == 0) {
                            return;
                        } else {
                            j10 = -j12;
                        }
                    }
                }
                this.b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i10 == 15 || i10 == 16) {
            this.b.o4(i10 == 16);
            return;
        }
        if (i10 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.g1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            hr hrVar = new hr(bundle4);
            hrVar.x0(this.b.v2);
            this.b.presentFragment(hrVar);
            return;
        }
        if (i10 == 18) {
            this.b.v4();
            return;
        }
        if (i10 == 19) {
            this.b.presentFragment(p91.d0(this.b.getMessagesController().getChat(Long.valueOf(this.b.g1)), false));
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
        if (i10 == 48) {
            ProfileActivity profileActivity13 = this.b;
            org.telegram.ui.Wallet.i9 i9Var = new org.telegram.ui.Wallet.i9(profileActivity13.getMessagesController().getUser(Long.valueOf(this.b.f1)));
            i9Var.c0 = true;
            profileActivity13.presentFragment(i9Var);
            return;
        }
        if (i10 == 39) {
            Bundle i28 = org.telegram.ui.Cells.c1.i(2, TeXSymbolParser.TYPE_ATTR);
            i28.putLong("dialog_id", -this.b.g1);
            org.telegram.ui.Components.wa0 wa0Var = new org.telegram.ui.Components.wa0(i28, null);
            ProfileActivity profileActivity14 = this.b;
            wa0Var.c = profileActivity14.v2;
            profileActivity14.presentFragment(wa0Var);
            return;
        }
        if (i10 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.A0);
            alertDialog$Builder3.a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
            alertDialog$Builder3.a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.hz0
                public final /* synthetic */ jz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.a2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i272) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    int i282;
                    int i29;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i22;
                    jz0 jz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity82 = jz0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.h1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.g1, arrayList);
                            profileActivity82.K1 = 0;
                            d5Var = ((org.telegram.ui.ActionBar.n2) profileActivity82).parentLayout;
                            if (d5Var != null) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) profileActivity82).parentLayout;
                                if (d5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < d5Var3.getFragmentStack().size(); i31++) {
                                        d5Var4 = ((org.telegram.ui.ActionBar.n2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) d5Var4.getFragmentStack().get(i31);
                                        if ((n2Var instanceof qn) && ((qn) n2Var).d() == profileActivity82.h1) {
                                            n2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            b2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = jz0Var.b;
                            i282 = ((org.telegram.ui.ActionBar.n2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i282).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.n2) profileActivity92).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity92.k1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.f1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = jz0Var.b;
                            int realPosition = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.w2;
                            if (profileActivity102.J2 == null || realPosition != 0) {
                                if (profileActivity102.r5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity102.i5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity102, true);
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
                                sy0 sy0Var = profileActivity102.o0;
                                ArrayList arrayList2 = sy0Var.X0;
                                ArrayList arrayList3 = sy0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = sy0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        sy0Var.U0.remove(realPosition);
                                        sy0Var.T0.remove(realPosition);
                                        sy0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        sy0Var.Y0.remove(realPosition);
                                        sy0Var.Z0.remove(realPosition);
                                        sy0Var.a1.remove(realPosition);
                                        sy0Var.d1.delete(realPosition);
                                        sy0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            sy0Var.P0 = (ImageLocation) arrayList2.get(0);
                                            sy0Var.Q0 = null;
                                            sy0Var.R0 = null;
                                        }
                                        sy0Var.D0.g();
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
                                        profileActivity102.a.v0(0, m10.getTop() - profileActivity102.T3(), org.telegram.ui.Components.bs.h);
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
                                sy0 sy0Var2 = profileActivity102.o0;
                                sy0Var2.H0 = true;
                                sy0Var2.K0 = profileActivity102.L2;
                                sy0Var2.q1 = null;
                                sy0Var2.r1 = null;
                                sy0Var2.setCreateThumbFromParent(false);
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
            i17 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
            long j13 = this.b.f1;
            TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(j13);
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
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            if (!(U instanceof qn) || ((qn) U).a() != j13) {
                U.presentFragment(qn.W9(j13));
            }
            AndroidUtilities.runOnUIThread(new ai.qa(i17, j13, i22), 150L);
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
            sy0 sy0Var = this.b.o0;
            ImageLocation D = sy0Var.D(sy0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.imageType == 2;
            i16 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
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
            ip0 ip0Var = new ip0();
            ip0Var.H = this.b;
            profileActivity15.presentFragment(ip0Var);
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
            this.b.presentFragment(new gg0(null));
            return;
        }
        if (i10 != 33) {
            if (i10 == 34) {
                i11 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
                if (MessagesController.getInstance(i11).isFrozen()) {
                    i14 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
                    b.b(i14);
                    return;
                }
                int realPosition = this.b.o0.getRealPosition();
                ImageLocation D2 = this.b.o0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i12 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
                FileLoader fileLoader = FileLoader.getInstance(i12);
                Drawable[] drawableArr = PhotoViewer.U8;
                File pathToAttach2 = fileLoader.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                boolean z11 = D2.imageType == 2;
                if (z11) {
                    ImageLocation G = this.b.o0.G(realPosition);
                    i13 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
                    str = FileLoader.getInstance(i13).getPathToAttach(G == null ? null : G.location, PhotoViewer.q1(G), true).getAbsolutePath();
                } else {
                    str = null;
                }
                this.b.r0.p(pathToAttach2.getAbsolutePath(), str, z11);
                return;
            }
            if (i10 != 35) {
                if (i10 == 36) {
                    this.b.u4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.A0);
            sy0 sy0Var2 = this.b.o0;
            ImageLocation D3 = sy0Var2.D(sy0Var2.getRealPosition());
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
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.hz0
                public final /* synthetic */ jz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.a2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i272) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    int i282;
                    int i29;
                    boolean z102;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i30 = i20;
                    jz0 jz0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList<Integer> arrayList2 = new ArrayList<>();
                            ProfileActivity profileActivity82 = jz0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.h1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.g1, arrayList2);
                            profileActivity82.K1 = 0;
                            d5Var = ((org.telegram.ui.ActionBar.n2) profileActivity82).parentLayout;
                            if (d5Var != null) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) profileActivity82).parentLayout;
                                if (d5Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < d5Var3.getFragmentStack().size(); i31++) {
                                        d5Var4 = ((org.telegram.ui.ActionBar.n2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) d5Var4.getFragmentStack().get(i31);
                                        if ((n2Var instanceof qn) && ((qn) n2Var).d() == profileActivity82.h1) {
                                            n2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            b2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = jz0Var.b;
                            i282 = ((org.telegram.ui.ActionBar.n2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i282).isFrozen()) {
                                i29 = ((org.telegram.ui.ActionBar.n2) profileActivity92).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity92.k1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.f1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = jz0Var.b;
                            int realPosition2 = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition2);
                            TLRPC.UserFull userFull2 = profileActivity102.w2;
                            if (profileActivity102.J2 == null || realPosition2 != 0) {
                                if (profileActivity102.r5 && F != null && userFull2 != null && (photo = userFull2.fallback_photo) != null && photo.id == F.id) {
                                    userFull2.fallback_photo = null;
                                    userFull2.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull2, true);
                                    profileActivity102.i5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity102, true);
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
                                sy0 sy0Var3 = profileActivity102.o0;
                                ArrayList arrayList22 = sy0Var3.X0;
                                ArrayList arrayList3 = sy0Var3.V0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (dialogPhotos = sy0Var3.S0) == null) {
                                        arrayList3.remove(realPosition2);
                                        sy0Var3.U0.remove(realPosition2);
                                        sy0Var3.T0.remove(realPosition2);
                                        sy0Var3.W0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        sy0Var3.Y0.remove(realPosition2);
                                        sy0Var3.Z0.remove(realPosition2);
                                        sy0Var3.a1.remove(realPosition2);
                                        sy0Var3.d1.delete(realPosition2);
                                        sy0Var3.b1.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            sy0Var3.P0 = (ImageLocation) arrayList22.get(0);
                                            sy0Var3.Q0 = null;
                                            sy0Var3.R0 = null;
                                        }
                                        sy0Var3.D0.g();
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
                                        profileActivity102.a.v0(0, m10.getTop() - profileActivity102.T3(), org.telegram.ui.Components.bs.h);
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
                                sy0 sy0Var22 = profileActivity102.o0;
                                sy0Var22.H0 = true;
                                sy0Var22.K0 = profileActivity102.L2;
                                sy0Var22.q1 = null;
                                sy0Var22.r1 = null;
                                sy0Var22.setCreateThumbFromParent(false);
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
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.a;
            this.b.showDialog(b2Var3);
            TextView textView4 = (TextView) b2Var3.d(-1);
            if (textView4 != null) {
                textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q7, this.b.A0));
                return;
            }
            return;
        }
        int realPosition2 = this.b.o0.getRealPosition();
        TLRPC.Photo F = this.b.o0.F(realPosition2);
        if (F == null) {
            return;
        }
        sy0 sy0Var3 = this.b.o0;
        ArrayList arrayList2 = sy0Var3.b1;
        ArrayList arrayList3 = sy0Var3.a1;
        ArrayList arrayList4 = sy0Var3.Z0;
        ArrayList arrayList5 = sy0Var3.Y0;
        ArrayList arrayList6 = sy0Var3.W0;
        ArrayList arrayList7 = sy0Var3.U0;
        ArrayList arrayList8 = sy0Var3.X0;
        ArrayList arrayList9 = sy0Var3.V0;
        MessagesController.DialogPhotos dialogPhotos = sy0Var3.S0;
        if (dialogPhotos != null) {
            dialogPhotos.moveToStart(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            sy0Var3.c1++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = sy0Var3.T0;
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
            org.telegram.ui.Components.m71 m71Var = (org.telegram.ui.Components.m71) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, m71Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f7 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f7);
            sy0Var3.P0 = (ImageLocation) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        UserConfig userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new tr0(this, userConfig, F, 6));
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
            i15 = ((org.telegram.ui.ActionBar.n2) this.b).currentAccount;
            NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            this.b.i5(true);
        }
        sy0 sy0Var4 = this.b.o0;
        sy0Var4.D0.g();
        sy0Var4.L();
    }
}
