package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class is extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40 {
    public gs A;
    public org.telegram.ui.Cells.p8 B;
    public MessagesController.DialogPhotos C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public String I;
    public String J;
    public hs K;
    public final org.telegram.ui.Components.e40 L;
    public TLRPC.FileLocation M;
    public int N;
    public int O;
    public TLRPC.Photo P;
    public org.telegram.ui.Components.o9 Q;
    public FrameLayout R;
    public org.telegram.ui.Components.i51 S;
    public boolean T;
    public boolean U;
    public MessageObject V;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.j3 b;
    public org.telegram.ui.Cells.j3 c;
    public org.telegram.ui.Cells.j3 d;
    public org.telegram.ui.Components.o9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.z8 n;
    public final org.telegram.ui.ActionBar.b6 r;
    public RadialProgressView s;
    public kh.h6 v;
    public AnimatorSet w;
    public org.telegram.ui.Cells.p8 x;
    public org.telegram.ui.Cells.p8 y;

    public is(Bundle bundle) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.L = new org.telegram.ui.Components.e40(0, true, true);
    }

    public static /* synthetic */ void T(is isVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = isVar.getMessagesController().getInputUser(isVar.D);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(isVar.currentAccount).sendRequest(tL_users_suggestBirthday, new m(isVar, 5));
    }

    public static /* synthetic */ void U(is isVar, TLRPC.User user) {
        isVar.M = null;
        isVar.c0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(isVar.currentAccount).getUserFull(isVar.D);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            isVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = isVar.P;
        if (photo != null) {
            user2.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null) {
                user2.photo.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                user2.photo.photo_big = closestPhotoSizeWithSize2.location;
            }
        } else {
            user2.photo = null;
            user2.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        isVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        isVar.f0();
        isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static /* synthetic */ void V(is isVar) {
        TLRPC.User user;
        if (isVar.e == null || (user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D))) == null) {
            return;
        }
        isVar.n.m(isVar.currentAccount, user);
        isVar.e.invalidate();
    }

    public static void W(is isVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.e40 e40Var = isVar.L;
        if (e40Var.P) {
            return;
        }
        int i9 = isVar.O;
        if (i9 == 2) {
            isVar.M = photoSize.location;
        } else if (i9 == 1 && isVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.b5 parentLayout = isVar.getParentLayout();
            org.telegram.ui.ActionBar.o2 lastFragment = isVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                if (o2Var instanceof qn) {
                    qn qnVar = (qn) o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var2 = lastFragment;
                    if (qnVar.a() == isVar.D && qnVar.N3 == 0) {
                        qnVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                            if (arrayList.get(size2) != o2Var3) {
                                ((org.telegram.ui.ActionBar.o2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            o2Var2 = o2Var3;
                        }
                        o2Var2.finishFragment();
                    } else {
                        lastFragment = o2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.o2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            isVar.e.h(ImageLocation.getForLocal(isVar.M), "50_50", isVar.n, isVar.getMessagesController().getUser(Long.valueOf(isVar.D)));
            if (isVar.O == 2) {
                isVar.d0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(isVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = isVar.D;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = isVar.getUserConfig().getNewMessageId();
                tL_messageService.id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = isVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = isVar.D;
                tL_messageService.date = isVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(isVar.currentAccount, tL_messageService, false, false);
                isVar.V = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(isVar.currentAccount).updateInterfaceWithMessages(isVar.D, arrayList2, 0);
                isVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, e40Var);
            }
        } else {
            TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
            if (isVar.V == null && user != null) {
                boolean z11 = inputFile2 != null;
                user.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z11;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                isVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            isVar.c0(isVar.M, photoSize2.location, inputFile, inputFile2, videoSize, d, isVar.O);
            isVar.d0(false, true);
        }
        isVar.f0();
    }

    public static void X(is isVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i9) {
        if (isVar.V != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
        TLRPC.UserFull userFull = MessagesController.getInstance(isVar.currentAccount).getUserFull(isVar.D);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= TLObject.FLAG_21;
            isVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(isVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(isVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String l10 = aa.d.l(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(isVar.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(isVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(isVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            ff.l0.a(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            isVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            isVar.getMessagesController().getDialogPhotos(isVar.D).addPhotoAtStart(tL_photos_photo.photo);
            isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (isVar.getParentActivity() != null) {
                if (i9 == 2) {
                    org.telegram.ui.Components.oc.a0(isVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.oc.a0(isVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                }
            }
        }
        isVar.M = null;
        isVar.f0();
    }

    public static /* synthetic */ void Y(is isVar) {
        if (isVar.V != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(isVar.V.getId()));
            NotificationCenter.getInstance(isVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.d40
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.O = this.N;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d40
    public final void O() {
        AndroidUtilities.runOnUIThread(new as(this, 1));
    }

    @Override // org.telegram.ui.Components.d40
    public final void P(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xr
            @Override // java.lang.Runnable
            public final void run() {
                is.W(is.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String b0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.H : user.phone;
    }

    public final void c0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i9) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.D);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i10 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i9 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new ff.j0(this, fileLocation, inputFile2, fileLocation2, i9, 10));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f8;
        org.telegram.ui.ActionBar.b6 b6Var = this.r;
        final int i10 = 0;
        kVar.A(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v8, b6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.E) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new es(this));
        this.a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i12 = org.telegram.ui.ActionBar.f6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        int i13 = org.telegram.ui.ActionBar.f6.d6;
        frameLayout2.setBackgroundColor(getThemedColor(i13));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.e = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.R.addView(this.e, g7.e6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        kh.h6 h6Var = new kh.h6(this, context, paint, 8);
        this.v = h6Var;
        this.R.addView(h6Var, g7.e6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.R.addView(this.s, g7.e6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        d0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = this.R;
        TextView textView3 = this.f;
        boolean z10 = LocaleController.isRTL;
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout3, textView3, g7.e6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = g10;
        g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.R;
        TextView textView4 = this.h;
        boolean z11 = LocaleController.isRTL;
        frameLayout4.addView(textView4, g7.e6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.r);
        this.b = j3Var;
        j3Var.b.setImeOptions(5);
        this.b.setBackgroundColor(getThemedColor(i13));
        this.b.setDivider(true);
        this.b.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.cs
            public final /* synthetic */ is b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i14, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i14 == 5) {
                            is isVar = this.b;
                            isVar.c.b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = isVar.c.b;
                            h3Var.setSelection(h3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        is isVar2 = this.b;
                        if (i14 != 6) {
                            if (i14 == 5) {
                                isVar2.d.b.requestFocus();
                                isVar2.d.b.setSelection(isVar2.c.b.length());
                                break;
                            }
                        } else {
                            isVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i14 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.b.b.setOnFocusChangeListener(new fs());
        this.b.setText(this.I);
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.r);
        this.c = j3Var2;
        j3Var2.b.setImeOptions(5);
        this.c.setBackgroundColor(getThemedColor(i13));
        this.c.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.cs
            public final /* synthetic */ is b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i14, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i14 == 5) {
                            is isVar = this.b;
                            isVar.c.b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = isVar.c.b;
                            h3Var.setSelection(h3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        is isVar2 = this.b;
                        if (i14 != 6) {
                            if (i14 == 5) {
                                isVar2.d.b.requestFocus();
                                isVar2.d.b.setSelection(isVar2.c.b.length());
                                break;
                            }
                        } else {
                            isVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i14 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.c.setText(this.J);
        org.telegram.ui.Cells.j3 j3Var3 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.r);
        this.d = j3Var3;
        j3Var3.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.gc));
        this.d.b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i13));
        final int i14 = 2;
        this.d.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.cs
            public final /* synthetic */ is b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i142, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        if (i142 == 5) {
                            is isVar = this.b;
                            isVar.c.b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = isVar.c.b;
                            h3Var.setSelection(h3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        is isVar2 = this.b;
                        if (i142 != 6) {
                            if (i142 == 5) {
                                isVar2.d.b.requestFocus();
                                isVar2.d.b.setSelection(isVar2.c.b.length());
                                break;
                            }
                        } else {
                            isVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i142 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (!this.E) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, b6Var);
            this.x = p8Var;
            p8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.x.setBackground(org.telegram.ui.ActionBar.f6.J0(b6Var, true));
            org.telegram.ui.Cells.p8 p8Var2 = this.x;
            int i15 = org.telegram.ui.ActionBar.f6.v6;
            int i16 = org.telegram.ui.ActionBar.f6.u6;
            p8Var2.e(i15, i16);
            final org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.photo_suggest_icon, "" + R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.x.e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.x.e.setAnimation(mi0Var);
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ds
                public final /* synthetic */ is b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            final is isVar = this.b;
                            isVar.N = 1;
                            org.telegram.ui.Components.e40 e40Var = isVar.L;
                            TLRPC.User user2 = user;
                            e40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            bg.d2 d2Var = new bg.d2(23);
                            final int i17 = 1;
                            final org.telegram.ui.Components.mi0 mi0Var2 = mi0Var;
                            e40Var.o(z12, d2Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.bs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i17) {
                                        case 0:
                                            is isVar2 = isVar;
                                            boolean h = isVar2.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var3 = mi0Var2;
                                            if (!h) {
                                                mi0Var3.N(86);
                                                isVar2.y.e.d();
                                                break;
                                            } else {
                                                mi0Var3.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            is isVar3 = isVar;
                                            boolean h10 = isVar3.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var4 = mi0Var2;
                                            if (!h10) {
                                                mi0Var4.N(85);
                                                isVar3.x.e.d();
                                                break;
                                            } else {
                                                mi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            mi0Var2.K(0);
                            mi0Var2.N(43);
                            isVar.x.e.d();
                            break;
                        default:
                            final is isVar2 = this.b;
                            isVar2.N = 2;
                            org.telegram.ui.Components.e40 e40Var2 = isVar2.L;
                            TLRPC.User user3 = user;
                            e40Var2.H = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            bg.d2 d2Var2 = new bg.d2(23);
                            final int i18 = 0;
                            final org.telegram.ui.Components.mi0 mi0Var3 = mi0Var;
                            e40Var2.o(z13, d2Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.bs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            is isVar22 = isVar2;
                                            boolean h = isVar22.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var32 = mi0Var3;
                                            if (!h) {
                                                mi0Var32.N(86);
                                                isVar22.y.e.d();
                                                break;
                                            } else {
                                                mi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            is isVar3 = isVar2;
                                            boolean h10 = isVar3.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var4 = mi0Var3;
                                            if (!h10) {
                                                mi0Var4.N(85);
                                                isVar3.x.e.d();
                                                break;
                                            } else {
                                                mi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            mi0Var3.K(0);
                            mi0Var3.N(43);
                            isVar2.y.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(context, b6Var);
            this.y = p8Var3;
            p8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.y.setBackground(org.telegram.ui.ActionBar.f6.J0(b6Var, true));
            this.y.e(i15, i16);
            final org.telegram.ui.Components.mi0 mi0Var2 = new org.telegram.ui.Components.mi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.y.e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.y.e.setAnimation(mi0Var2);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ds
                public final /* synthetic */ is b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            final is isVar = this.b;
                            isVar.N = 1;
                            org.telegram.ui.Components.e40 e40Var = isVar.L;
                            TLRPC.User user2 = user;
                            e40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            bg.d2 d2Var = new bg.d2(23);
                            final int i17 = 1;
                            final org.telegram.ui.Components.mi0 mi0Var22 = mi0Var2;
                            e40Var.o(z12, d2Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.bs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i17) {
                                        case 0:
                                            is isVar22 = isVar;
                                            boolean h = isVar22.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var32 = mi0Var22;
                                            if (!h) {
                                                mi0Var32.N(86);
                                                isVar22.y.e.d();
                                                break;
                                            } else {
                                                mi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            is isVar3 = isVar;
                                            boolean h10 = isVar3.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var4 = mi0Var22;
                                            if (!h10) {
                                                mi0Var4.N(85);
                                                isVar3.x.e.d();
                                                break;
                                            } else {
                                                mi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            mi0Var22.K(0);
                            mi0Var22.N(43);
                            isVar.x.e.d();
                            break;
                        default:
                            final is isVar2 = this.b;
                            isVar2.N = 2;
                            org.telegram.ui.Components.e40 e40Var2 = isVar2.L;
                            TLRPC.User user3 = user;
                            e40Var2.H = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            bg.d2 d2Var2 = new bg.d2(23);
                            final int i18 = 0;
                            final org.telegram.ui.Components.mi0 mi0Var3 = mi0Var2;
                            e40Var2.o(z13, d2Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.bs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            is isVar22 = isVar2;
                                            boolean h = isVar22.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var32 = mi0Var3;
                                            if (!h) {
                                                mi0Var32.N(86);
                                                isVar22.y.e.d();
                                                break;
                                            } else {
                                                mi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            is isVar3 = isVar2;
                                            boolean h10 = isVar3.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var4 = mi0Var3;
                                            if (!h10) {
                                                mi0Var4.N(85);
                                                isVar3.x.e.d();
                                                break;
                                            } else {
                                                mi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            mi0Var3.K(0);
                            mi0Var3.N(43);
                            isVar2.y.e.d();
                            break;
                    }
                }
            });
            this.Q = new org.telegram.ui.Components.o9(context);
            this.A = new gs(this, context, b6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.z8(0, user);
            }
            this.Q.e(user.photo, this.n);
            this.A.addView(this.Q, g7.e6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.A.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.A.getImageView().setVisibility(0);
            this.A.setBackground(org.telegram.ui.ActionBar.f6.J0(b6Var, true));
            this.A.e(i15, i16);
            this.A.setOnClickListener(new b0(this, context, user, 10));
            org.telegram.ui.Cells.p8 p8Var4 = new org.telegram.ui.Cells.p8(context, b6Var);
            this.B = p8Var4;
            p8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.B.setBackground(org.telegram.ui.ActionBar.f6.J0(b6Var, true));
            this.B.e(i15, i16);
            this.B.setNeedDivider(true);
            this.B.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.B.setOnClickListener(new org.telegram.ui.Components.vh0(14, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.D);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.P = photo;
                if (photo == null) {
                    this.P = userFull.fallback_photo;
                }
            }
            f0();
        }
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this, new a5(this, 7), new b1(this, 26), null);
        this.S = i51Var;
        i51Var.p1();
        this.S.setOnScrollListener(new eh.n(5, this, frameLayout));
        this.S.setBackgroundColor(getThemedColor(i12));
        frameLayout.addView(this.S, g7.e6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.S);
        if (this.E && this.G) {
            this.T = true;
        }
        this.S.U2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10, boolean z11) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        if (!z11) {
            if (z10) {
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                this.v.setAlpha(1.0f);
                this.v.setVisibility(0);
                return;
            }
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        if (z10) {
            this.s.setVisibility(0);
            this.v.setVisibility(0);
            AnimatorSet animatorSet3 = this.w;
            RadialProgressView radialProgressView = this.s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<kh.h6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<kh.h6, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new org.telegram.ui.Components.u9(26, this, z10));
        this.w.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            e0();
            return;
        }
        if (i9 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.C) {
            ArrayList arrayList = new ArrayList(dialogPhotos.photos);
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (arrayList.get(i11) == null) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (arrayList.size() > 0) {
                this.P = (TLRPC.Photo) arrayList.get(0);
                f0();
            }
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final boolean e() {
        return this.O != 1;
    }

    public final void e0() {
        TLRPC.User user;
        if (this.f == null || (user = getMessagesController().getUser(Long.valueOf(this.D))) == null) {
            return;
        }
        if (TextUtils.isEmpty(b0())) {
            this.f.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.f.setText(ne.b.c().b("+" + b0()));
        }
        this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.M == null) {
            org.telegram.ui.Components.o9 o9Var = this.e;
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
            this.n = z8Var;
            o9Var.e(user, z8Var);
        }
    }

    public final void f0() {
        TLRPC.Photo photo;
        if (this.E) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.P) != null) {
            this.Q.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), this.P), "50_50", this.n, null);
        }
        if (this.n == null) {
            this.n = new org.telegram.ui.Components.z8(0, user);
        }
        TLRPC.FileLocation fileLocation = this.M;
        if (fileLocation == null) {
            this.e.e(user, this.n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.n, getMessagesController().getUser(Long.valueOf(this.D)));
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        TextView textView = this.f;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4, null, null, null, null, i9));
        org.telegram.ui.Cells.j3 j3Var = this.b;
        int i10 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(j3Var, TLObject.FLAG_23, null, null, null, null, i10));
        org.telegram.ui.Cells.j3 j3Var2 = this.b;
        int i11 = org.telegram.ui.ActionBar.f6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(j3Var2, 32, null, null, null, null, i11));
        org.telegram.ui.Cells.j3 j3Var3 = this.b;
        int i12 = org.telegram.ui.ActionBar.f6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(j3Var3, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, TLObject.FLAG_23, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.D = getArguments().getLong("user_id", 0L);
        this.H = getArguments().getString("phone");
        this.I = getArguments().getString("first_name_card");
        this.J = getArguments().getString("last_name_card");
        this.E = getArguments().getBoolean("addContact", false);
        this.F = getArguments().getBoolean("focus_notes", false);
        this.G = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("dialog_bar_exception" + this.D, false);
        TLRPC.User user = this.D != 0 ? getMessagesController().getUser(Long.valueOf(this.D)) : null;
        org.telegram.ui.Components.e40 e40Var = this.L;
        if (e40Var != null) {
            e40Var.a = this;
            e40Var.b = this;
        }
        this.C = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.D);
        return user != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.e40 e40Var = this.L;
        if (e40Var != null) {
            e40Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.L.j();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        e0();
        this.L.l();
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean u() {
        return false;
    }

    public is(Bundle bundle, org.telegram.ui.ActionBar.b6 b6Var) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.r = b6Var;
        this.L = new org.telegram.ui.Components.e40(0, true, true);
    }
}
