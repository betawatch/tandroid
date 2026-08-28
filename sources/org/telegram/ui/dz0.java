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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dz0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public dz0(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        long j10;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TL_bots.BotInfo botInfo;
        int i17;
        int i18;
        org.telegram.ui.Components.ur0 ur0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i9 == -1) {
            ProfileActivity profileActivity = this.b;
            hz0 hz0Var = profileActivity.K;
            if (hz0Var == null || (ur0Var = hz0Var.E0) == null || !ur0Var.j0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.R4();
                return;
            }
        }
        final int i19 = 2;
        int i20 = 0;
        if (i9 == 2) {
            this.b.n4(false);
            return;
        }
        final int i21 = 1;
        if (i9 == 1) {
            TLRPC.User user = this.b.getMessagesController().getUser(Long.valueOf(this.b.a1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            is isVar = new is(bundle, profileActivity2.v0);
            isVar.K = new gx0(profileActivity2, user);
            profileActivity2.presentFragment(isVar);
            return;
        }
        if (i9 == 3) {
            Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
            e10.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
            e10.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
            dy dyVar = new dy(e10);
            ProfileActivity profileActivity3 = this.b;
            dyVar.y2 = profileActivity3;
            profileActivity3.presentFragment(dyVar);
            return;
        }
        int i22 = 4;
        if (i9 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.a1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new is(bundle2, profileActivity4.v0));
            return;
        }
        int i23 = 15;
        if (i9 == 5) {
            TLRPC.User user2 = this.b.getMessagesController().getUser(Long.valueOf(this.b.a1));
            if (user2 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.v0);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteContact);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nl0(i23, this, user2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            this.b.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, this.b.v0));
                return;
            }
            return;
        }
        if (i9 == 7) {
            this.b.i4(false);
            return;
        }
        if (i9 == 45) {
            this.b.i4(true);
            return;
        }
        if (i9 == 46) {
            if (!this.b.getUserConfig().isPremium()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                new zf.x0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.b6 b6Var = this.b.v0;
            ky0 ky0Var = new ky0(this, 1);
            Pattern pattern = org.telegram.ui.Components.y4.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.f3 j11 = org.telegram.messenger.ll.j(context, null, false, false);
            Runnable runnable = j11.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
            linearLayout.addView(pi0Var, g7.e6.t(110, 110, 17, 0, 21, 0, 11));
            pi0Var.f(R.raw.raised_hand, 110, 110, null);
            pi0Var.setAutoRepeat(false);
            pi0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
            textView2.setTextSize(1, 20.0f);
            int i24 = org.telegram.ui.ActionBar.f6.G6;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i24, b6Var));
            linearLayout.addView(textView2, g7.e6.t(-1, -2, 17, 20, 0, 20, 14));
            qv0 qv0Var = new qv0(context, b6Var);
            qv0Var.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
            qv0Var.b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
            qv0Var.d.setVisibility(8);
            qv0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            qv0Var.c.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i24, b6Var));
            linearLayout.addView(qv0Var, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            qv0 qv0Var2 = new qv0(context, b6Var);
            qv0Var2.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
            qv0Var2.b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
            qv0Var2.d.setVisibility(8);
            qv0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            qv0Var2.c.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i24, b6Var));
            linearLayout.addView(qv0Var2, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            qv0 qv0Var3 = new qv0(context, b6Var);
            qv0Var3.a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
            qv0Var3.b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
            qv0Var3.d.setVisibility(8);
            qv0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            qv0Var3.c.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i24, b6Var));
            linearLayout.addView(qv0Var3, g7.e6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            kh.d dVar = new kh.d(context, b6Var, true);
            dVar.setOnClickListener(new org.telegram.ui.Components.s2(i19, zArr, runnable));
            dVar.e();
            dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
            linearLayout.addView(dVar, g7.e6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            j11.customView = linearLayout;
            j11.show();
            j11.setOnDismissListener(new wq(3, zArr, ky0Var));
            return;
        }
        if (i9 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.a1, 0, false, new kh.la(r8, profileActivity6, i19));
            return;
        }
        if (i9 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.N = LocaleController.getPluralString("DeleteTopics", 1);
            i17 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
            TopicsController topicsController = MessagesController.getInstance(i17).getTopicsController();
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.b1, profileActivity7.c1);
            final int i25 = 0;
            alertDialog$Builder2.a.P = LocaleController.formatString("DeleteSelectedTopic", R.string.DeleteSelectedTopic, findTopic == null ? "topic" : findTopic.title);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bz0
                public final /* synthetic */ dz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.b2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i26) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    int i27;
                    int i28;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i29 = i25;
                    dz0 dz0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity8 = dz0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.c1));
                            profileActivity8.getMessagesController().getTopicsController().deleteTopics(profileActivity8.b1, arrayList);
                            profileActivity8.F1 = 0;
                            b5Var = ((org.telegram.ui.ActionBar.o2) profileActivity8).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.o2) profileActivity8).parentLayout;
                                if (b5Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < b5Var3.getFragmentStack().size(); i30++) {
                                        b5Var4 = ((org.telegram.ui.ActionBar.o2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) b5Var4.getFragmentStack().get(i30);
                                        if ((o2Var instanceof qn) && ((qn) o2Var).b() == profileActivity8.c1) {
                                            o2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity8.v0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            c2Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = dz0Var.b;
                            i27 = ((org.telegram.ui.ActionBar.o2) profileActivity9).currentAccount;
                            if (MessagesController.getInstance(i27).isFrozen()) {
                                i28 = ((org.telegram.ui.ActionBar.o2) profileActivity9).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity9.f1 = true;
                                profileActivity9.getSecretChatHelper().startSecretChat(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().getUser(Long.valueOf(profileActivity9.a1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = dz0Var.b;
                            int realPosition = profileActivity10.j0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.j0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.r2;
                            if (profileActivity10.E2 == null || realPosition != 0) {
                                if (profileActivity10.l5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity10.i5(false);
                                }
                                if (profileActivity10.j0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity10, true);
                                }
                                if (F == null || profileActivity10.j0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity10.j0.F(1);
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
                                    profileActivity10.getMessagesStorage().clearUserPhoto(profileActivity10.a1, F.id);
                                }
                                my0 my0Var = profileActivity10.j0;
                                ArrayList arrayList2 = my0Var.T0;
                                ArrayList arrayList3 = my0Var.R0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = my0Var.O0) == null) {
                                        arrayList3.remove(realPosition);
                                        my0Var.Q0.remove(realPosition);
                                        my0Var.P0.remove(realPosition);
                                        my0Var.S0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        my0Var.U0.remove(realPosition);
                                        my0Var.V0.remove(realPosition);
                                        my0Var.W0.remove(realPosition);
                                        my0Var.Z0.delete(realPosition);
                                        my0Var.X0.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            my0Var.L0 = (ImageLocation) arrayList2.get(0);
                                            my0Var.M0 = null;
                                            my0Var.N0 = null;
                                        }
                                        my0Var.z0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity10.j0.getRealCount() <= 0) {
                                    profileActivity10.j0.setVisibility(8);
                                    profileActivity10.a0.setForegroundAlpha(1.0f);
                                    profileActivity10.U.setVisibility(0);
                                    profileActivity10.D0 = true;
                                    View m10 = profileActivity10.c.m(0);
                                    if (m10 != null) {
                                        profileActivity10.a.v0(0, m10.getTop() - profileActivity10.T3(), org.telegram.ui.Components.gr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.m0.c();
                                if (profileActivity10.O5 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.O5, true);
                                }
                                profileActivity10.k2 = (AndroidUtilities.isTablet() || profileActivity10.j2 || !profileActivity10.a0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity10.E2 = null;
                                profileActivity10.F2 = null;
                                my0 my0Var2 = profileActivity10.j0;
                                my0Var2.D0 = true;
                                my0Var2.G0 = profileActivity10.G2;
                                my0Var2.m1 = null;
                                my0Var2.n1 = null;
                                my0Var2.setCreateThumbFromParent(false);
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
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
            c2Var2.show();
            TextView textView3 = (TextView) c2Var2.d(-1);
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        if (i9 == 24) {
            ProfileActivity profileActivity8 = this.b;
            y21.K(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i9 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.m1) {
                profileActivity9.presentFragment(rd1.Z(profileActivity9.b1, profileActivity9.c1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j12 = profileActivity10.b1;
            if (j12 != 0) {
                bundle3.putLong("chat_id", j12);
            } else if (profileActivity10.n2) {
                bundle3.putLong("user_id", profileActivity10.a1);
            }
            ho hoVar = new ho(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.q2;
            if (chatFull != null) {
                hoVar.k0(chatFull);
            } else {
                hoVar.l0(profileActivity11.r2);
            }
            this.b.presentFragment(hoVar);
            return;
        }
        if (i9 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        int i26 = 19;
        if (i9 == 9) {
            TLRPC.User user3 = this.b.getMessagesController().getUser(Long.valueOf(this.b.a1));
            if (user3 == null) {
                return;
            }
            Bundle e11 = org.telegram.messenger.l0.e(2, "onlySelect", "dialogsType", true);
            e11.putBoolean("resetDelegate", false);
            e11.putBoolean("closeFragment", false);
            dy dyVar2 = new dy(e11);
            dyVar2.y2 = new a7(this, user3, dyVar2, i26);
            this.b.presentFragment(dyVar2);
            return;
        }
        if (i9 == 10) {
            this.b.s4();
            return;
        }
        if (i9 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.z2 != null) {
                    j10 = DialogObject.makeEncryptedDialogId(r2.id);
                } else {
                    j10 = profileActivity12.a1;
                    if (j10 == 0) {
                        long j13 = profileActivity12.b1;
                        if (j13 == 0) {
                            return;
                        } else {
                            j10 = -j13;
                        }
                    }
                }
                this.b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                return;
            } catch (Exception e12) {
                FileLog.e(e12);
                return;
            }
        }
        if (i9 == 15 || i9 == 16) {
            this.b.o4(i9 == 16);
            return;
        }
        if (i9 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.b1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            jr jrVar = new jr(bundle4);
            jrVar.w0(this.b.q2);
            this.b.presentFragment(jrVar);
            return;
        }
        if (i9 == 18) {
            this.b.v4();
            return;
        }
        if (i9 == 19) {
            this.b.presentFragment(s91.c0(this.b.getMessagesController().getChat(Long.valueOf(this.b.b1)), false));
            return;
        }
        if (i9 == 22) {
            this.b.y4();
            return;
        }
        if (i9 == 38) {
            this.b.p4();
            return;
        }
        if (i9 == 39) {
            Bundle h = aa.d.h(2, TeXSymbolParser.TYPE_ATTR);
            h.putLong("dialog_id", -this.b.b1);
            org.telegram.ui.Components.k90 k90Var = new org.telegram.ui.Components.k90(h, null);
            ProfileActivity profileActivity13 = this.b;
            k90Var.c = profileActivity13.q2;
            profileActivity13.presentFragment(k90Var);
            return;
        }
        if (i9 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.v0);
            alertDialog$Builder3.a.N = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
            alertDialog$Builder3.a.P = LocaleController.getString(R.string.AreYouSureSecretChat);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bz0
                public final /* synthetic */ dz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.b2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i262) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    int i27;
                    int i28;
                    boolean z10;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i29 = i21;
                    dz0 dz0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity82 = dz0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.c1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.b1, arrayList);
                            profileActivity82.F1 = 0;
                            b5Var = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                                if (b5Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < b5Var3.getFragmentStack().size(); i30++) {
                                        b5Var4 = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) b5Var4.getFragmentStack().get(i30);
                                        if ((o2Var instanceof qn) && ((qn) o2Var).b() == profileActivity82.c1) {
                                            o2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity82.v0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            c2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = dz0Var.b;
                            i27 = ((org.telegram.ui.ActionBar.o2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i27).isFrozen()) {
                                i28 = ((org.telegram.ui.ActionBar.o2) profileActivity92).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity92.f1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.a1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = dz0Var.b;
                            int realPosition = profileActivity102.j0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.j0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.r2;
                            if (profileActivity102.E2 == null || realPosition != 0) {
                                if (profileActivity102.l5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity102.i5(false);
                                }
                                if (profileActivity102.j0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.j0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.j0.F(1);
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
                                    profileActivity102.getMessagesStorage().clearUserPhoto(profileActivity102.a1, F.id);
                                }
                                my0 my0Var = profileActivity102.j0;
                                ArrayList arrayList2 = my0Var.T0;
                                ArrayList arrayList3 = my0Var.R0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = my0Var.O0) == null) {
                                        arrayList3.remove(realPosition);
                                        my0Var.Q0.remove(realPosition);
                                        my0Var.P0.remove(realPosition);
                                        my0Var.S0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        my0Var.U0.remove(realPosition);
                                        my0Var.V0.remove(realPosition);
                                        my0Var.W0.remove(realPosition);
                                        my0Var.Z0.delete(realPosition);
                                        my0Var.X0.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            my0Var.L0 = (ImageLocation) arrayList2.get(0);
                                            my0Var.M0 = null;
                                            my0Var.N0 = null;
                                        }
                                        my0Var.z0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity102.j0.getRealCount() <= 0) {
                                    profileActivity102.j0.setVisibility(8);
                                    profileActivity102.a0.setForegroundAlpha(1.0f);
                                    profileActivity102.U.setVisibility(0);
                                    profileActivity102.D0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.v0(0, m10.getTop() - profileActivity102.T3(), org.telegram.ui.Components.gr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.m0.c();
                                if (profileActivity102.O5 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.O5, true);
                                }
                                profileActivity102.k2 = (AndroidUtilities.isTablet() || profileActivity102.j2 || !profileActivity102.a0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity102.E2 = null;
                                profileActivity102.F2 = null;
                                my0 my0Var2 = profileActivity102.j0;
                                my0Var2.D0 = true;
                                my0Var2.G0 = profileActivity102.G2;
                                my0Var2.m1 = null;
                                my0Var2.n1 = null;
                                my0Var2.setCreateThumbFromParent(false);
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
        if (i9 == 44) {
            i16 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
            long j14 = this.b.a1;
            TLRPC.UserFull userFull = MessagesController.getInstance(i16).getUserFull(j14);
            if (userFull == null || (botInfo = userFull.bot_info) == null) {
                return;
            }
            String str2 = botInfo.privacy_policy_url;
            if (str2 == null && str2 == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                while (true) {
                    if (i20 >= size) {
                        str2 = LocaleController.getString(R.string.BotDefaultPrivacyPolicy);
                        break;
                    }
                    TLRPC.BotCommand botCommand = arrayList.get(i20);
                    i20++;
                    if ("privacy".equals(botCommand.command)) {
                        break;
                    }
                }
            }
            if (str2 != null) {
                ve.e.s(ApplicationLoader.applicationContext, str2);
                return;
            }
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            if (!(U instanceof qn) || ((qn) U).a() != j14) {
                U.presentFragment(qn.R9(j14));
            }
            AndroidUtilities.runOnUIThread(new gh.d8(i16, j14), 150L);
            return;
        }
        if (i9 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            int i27 = Build.VERSION.SDK_INT;
            if (i27 >= 23 && ((i27 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            my0 my0Var = this.b.j0;
            ImageLocation D = my0Var.D(my0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.imageType == 2;
            i15 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
            File pathToAttach = FileLoader.getInstance(i15).getPathToAttach(D.location, z10 ? "mp4" : null, true);
            if (z10 && !pathToAttach.exists()) {
                pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(D.location, "mp4"));
            }
            if (pathToAttach.exists()) {
                MediaController.saveFile(pathToAttach.toString(), this.b.getParentActivity(), 0, null, null, new gh.p6(i22, this, z10));
                return;
            }
            return;
        }
        if (i9 == 30) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i9 == 40) {
            ProfileActivity profileActivity14 = this.b;
            zo0 zo0Var = new zo0();
            zo0Var.x = this.b;
            profileActivity14.presentFragment(zo0Var);
            return;
        }
        if (i9 == 42) {
            AndroidUtilities.addToClipboard(this.b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(this.b.getMessagesController().getUser(Long.valueOf(this.b.a1))));
            return;
        }
        if (i9 == 43) {
            this.b.presentFragment(new ma(null));
            return;
        }
        if (i9 == 31) {
            this.b.presentFragment(new hg0(null));
            return;
        }
        if (i9 != 33) {
            if (i9 == 34) {
                i10 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                if (MessagesController.getInstance(i10).isFrozen()) {
                    i13 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                    b.b(i13);
                    return;
                }
                int realPosition = this.b.j0.getRealPosition();
                ImageLocation D2 = this.b.j0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                FileLoader fileLoader = FileLoader.getInstance(i11);
                Drawable[] drawableArr = PhotoViewer.P8;
                File pathToAttach2 = fileLoader.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                boolean z11 = D2.imageType == 2;
                if (z11) {
                    ImageLocation G = this.b.j0.G(realPosition);
                    i12 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
                    str = FileLoader.getInstance(i12).getPathToAttach(G == null ? null : G.location, PhotoViewer.q1(G), true).getAbsolutePath();
                } else {
                    str = null;
                }
                this.b.m0.q(pathToAttach2.getAbsolutePath(), str, z11);
                return;
            }
            if (i9 != 35) {
                if (i9 == 36) {
                    this.b.u4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.b.getParentActivity(), 0, this.b.v0);
            my0 my0Var2 = this.b.j0;
            ImageLocation D3 = my0Var2.D(my0Var2.getRealPosition());
            if (D3 == null) {
                return;
            }
            if (D3.imageType == 2) {
                alertDialog$Builder4.a.N = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                alertDialog$Builder4.a.P = LocaleController.getString(R.string.AreYouSureDeleteVideo);
            } else {
                alertDialog$Builder4.a.N = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                alertDialog$Builder4.a.P = LocaleController.getString(R.string.AreYouSureDeletePhoto);
            }
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.bz0
                public final /* synthetic */ dz0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0270 */
                @Override // org.telegram.ui.ActionBar.b2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void f(org.telegram.ui.ActionBar.c2 c2Var22, int i262) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    int i272;
                    int i28;
                    boolean z102;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i29 = i19;
                    dz0 dz0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList<Integer> arrayList2 = new ArrayList<>();
                            ProfileActivity profileActivity82 = dz0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.c1));
                            profileActivity82.getMessagesController().getTopicsController().deleteTopics(profileActivity82.b1, arrayList2);
                            profileActivity82.F1 = 0;
                            b5Var = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                                if (b5Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < b5Var3.getFragmentStack().size(); i30++) {
                                        b5Var4 = ((org.telegram.ui.ActionBar.o2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) b5Var4.getFragmentStack().get(i30);
                                        if ((o2Var instanceof qn) && ((qn) o2Var).b() == profileActivity82.c1) {
                                            o2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(parentActivity2), profileActivity82.v0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            c2Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = dz0Var.b;
                            i272 = ((org.telegram.ui.ActionBar.o2) profileActivity92).currentAccount;
                            if (MessagesController.getInstance(i272).isFrozen()) {
                                i28 = ((org.telegram.ui.ActionBar.o2) profileActivity92).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity92.f1 = true;
                                profileActivity92.getSecretChatHelper().startSecretChat(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().getUser(Long.valueOf(profileActivity92.a1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = dz0Var.b;
                            int realPosition2 = profileActivity102.j0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.j0.F(realPosition2);
                            TLRPC.UserFull userFull2 = profileActivity102.r2;
                            if (profileActivity102.E2 == null || realPosition2 != 0) {
                                if (profileActivity102.l5 && F != null && userFull2 != null && (photo = userFull2.fallback_photo) != null && photo.id == F.id) {
                                    userFull2.fallback_photo = null;
                                    userFull2.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().updateUserInfo(userFull2, true);
                                    profileActivity102.i5(false);
                                }
                                if (profileActivity102.j0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.j0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.j0.F(1);
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
                                    profileActivity102.getMessagesStorage().clearUserPhoto(profileActivity102.a1, F.id);
                                }
                                my0 my0Var3 = profileActivity102.j0;
                                ArrayList arrayList22 = my0Var3.T0;
                                ArrayList arrayList3 = my0Var3.R0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (dialogPhotos = my0Var3.O0) == null) {
                                        arrayList3.remove(realPosition2);
                                        my0Var3.Q0.remove(realPosition2);
                                        my0Var3.P0.remove(realPosition2);
                                        my0Var3.S0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        my0Var3.U0.remove(realPosition2);
                                        my0Var3.V0.remove(realPosition2);
                                        my0Var3.W0.remove(realPosition2);
                                        my0Var3.Z0.delete(realPosition2);
                                        my0Var3.X0.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            my0Var3.L0 = (ImageLocation) arrayList22.get(0);
                                            my0Var3.M0 = null;
                                            my0Var3.N0 = null;
                                        }
                                        my0Var3.z0.g();
                                        z102 = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.id);
                                        z102 = true;
                                    }
                                }
                                if (z102 || profileActivity102.j0.getRealCount() <= 0) {
                                    profileActivity102.j0.setVisibility(8);
                                    profileActivity102.a0.setForegroundAlpha(1.0f);
                                    profileActivity102.U.setVisibility(0);
                                    profileActivity102.D0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.v0(0, m10.getTop() - profileActivity102.T3(), org.telegram.ui.Components.gr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.m0.c();
                                if (profileActivity102.O5 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.O5, true);
                                }
                                profileActivity102.k2 = (AndroidUtilities.isTablet() || profileActivity102.j2 || !profileActivity102.a0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity102.E2 = null;
                                profileActivity102.F2 = null;
                                my0 my0Var22 = profileActivity102.j0;
                                my0Var22.D0 = true;
                                my0Var22.G0 = profileActivity102.G2;
                                my0Var22.m1 = null;
                                my0Var22.n1 = null;
                                my0Var22.setCreateThumbFromParent(false);
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
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.a;
            this.b.showDialog(c2Var3);
            TextView textView4 = (TextView) c2Var3.d(-1);
            if (textView4 != null) {
                textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.q7, this.b.v0));
                return;
            }
            return;
        }
        int realPosition2 = this.b.j0.getRealPosition();
        TLRPC.Photo F = this.b.j0.F(realPosition2);
        if (F == null) {
            return;
        }
        my0 my0Var3 = this.b.j0;
        ArrayList arrayList2 = my0Var3.X0;
        ArrayList arrayList3 = my0Var3.W0;
        ArrayList arrayList4 = my0Var3.V0;
        ArrayList arrayList5 = my0Var3.U0;
        ArrayList arrayList6 = my0Var3.S0;
        ArrayList arrayList7 = my0Var3.Q0;
        ArrayList arrayList8 = my0Var3.T0;
        ArrayList arrayList9 = my0Var3.R0;
        MessagesController.DialogPhotos dialogPhotos = my0Var3.O0;
        if (dialogPhotos != null) {
            dialogPhotos.moveToStart(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            my0Var3.Y0++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = my0Var3.P0;
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
            org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, u51Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f10 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f10);
            my0Var3.L0 = (ImageLocation) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        UserConfig userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new kr0(this, userConfig, F, 6));
        ProfileActivity profileActivity15 = this.b;
        profileActivity15.I.m(profileActivity15.a1, F.video_sizes.isEmpty() ? null : 1, 22);
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
            i14 = ((org.telegram.ui.ActionBar.o2) this.b).currentAccount;
            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            this.b.i5(true);
        }
        my0 my0Var4 = this.b.j0;
        my0Var4.z0.g();
        my0Var4.L();
    }
}
