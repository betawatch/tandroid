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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ps extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.w40 {
    public ns B;
    public org.telegram.ui.Cells.n8 C;
    public MessagesController.DialogPhotos D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public os L;
    public final org.telegram.ui.Components.x40 M;
    public TLRPC.FileLocation N;
    public int O;
    public int P;
    public TLRPC.Photo Q;
    public org.telegram.ui.Components.p9 R;
    public FrameLayout S;
    public org.telegram.ui.Components.g61 T;
    public boolean U;
    public boolean V;
    public MessageObject W;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.h3 b;
    public org.telegram.ui.Cells.h3 c;
    public org.telegram.ui.Cells.h3 d;
    public org.telegram.ui.Components.p9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.z8 n;
    public final org.telegram.ui.ActionBar.f6 r;
    public RadialProgressView s;
    public eg.i0 v;
    public AnimatorSet w;
    public org.telegram.ui.Cells.n8 x;
    public org.telegram.ui.Cells.n8 y;

    public ps(Bundle bundle) {
        super(bundle);
        this.U = false;
        this.V = true;
        this.M = new org.telegram.ui.Components.x40(0, true, true);
    }

    public static /* synthetic */ void U(ps psVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = psVar.getMessagesController().getInputUser(psVar.E);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(psVar.currentAccount).sendRequest(tL_users_suggestBirthday, new o(psVar, 5));
    }

    public static /* synthetic */ void V(ps psVar, TLRPC.User user) {
        psVar.N = null;
        psVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(psVar.currentAccount).getUserFull(psVar.E);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            psVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = psVar.Q;
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
        psVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        psVar.g0();
        psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static /* synthetic */ void W(ps psVar) {
        TLRPC.User user;
        if (psVar.e == null || (user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E))) == null) {
            return;
        }
        psVar.n.m(psVar.currentAccount, user);
        psVar.e.invalidate();
    }

    public static void X(ps psVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z4) {
        org.telegram.ui.Components.x40 x40Var = psVar.M;
        if (x40Var.Q) {
            return;
        }
        int i10 = psVar.P;
        if (i10 == 2) {
            psVar.N = photoSize.location;
        } else if (i10 == 1 && psVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.e5 parentLayout = psVar.getParentLayout();
            org.telegram.ui.ActionBar.p2 lastFragment = psVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                if (p2Var instanceof zn) {
                    zn znVar = (zn) p2Var;
                    org.telegram.ui.ActionBar.p2 p2Var2 = lastFragment;
                    if (znVar.a() == psVar.E && znVar.O3 == 0) {
                        znVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            if (arrayList.get(size2) != p2Var3) {
                                ((org.telegram.ui.ActionBar.p2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            p2Var2 = p2Var3;
                        }
                        p2Var2.finishFragment();
                    } else {
                        lastFragment = p2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.p2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            psVar.e.h(ImageLocation.getForLocal(psVar.N), "50_50", psVar.n, psVar.getMessagesController().getUser(Long.valueOf(psVar.E)));
            if (psVar.P == 2) {
                psVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(psVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = psVar.E;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = psVar.getUserConfig().getNewMessageId();
                tL_messageService.id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = psVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = psVar.E;
                tL_messageService.date = psVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z4;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(psVar.currentAccount, tL_messageService, false, false);
                psVar.W = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(psVar.currentAccount).updateInterfaceWithMessages(psVar.E, arrayList2, 0);
                psVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, x40Var);
            }
        } else {
            TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
            if (psVar.W == null && user != null) {
                boolean z10 = inputFile2 != null;
                user.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z10;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                psVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            psVar.d0(psVar.N, photoSize2.location, inputFile, inputFile2, videoSize, d, psVar.P);
            psVar.e0(false, true);
        }
        psVar.g0();
    }

    public static void Y(ps psVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (psVar.W != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
        TLRPC.UserFull userFull = MessagesController.getInstance(psVar.currentAccount).getUserFull(psVar.E);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= TLObject.FLAG_21;
            psVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(psVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(psVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(fileLocation.volume_id);
                sb.append("_");
                String m9 = android.support.v4.media.a.m(fileLocation.local_id, "@50_50", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(psVar.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(psVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(psVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            kf.l0.a(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            psVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            psVar.getMessagesController().getDialogPhotos(psVar.E).addPhotoAtStart(tL_photos_photo.photo);
            psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (psVar.getParentActivity() != null) {
                if (i10 == 2) {
                    org.telegram.ui.Components.qc.a0(psVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.qc.a0(psVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                }
            }
        }
        psVar.N = null;
        psVar.g0();
    }

    public static /* synthetic */ void Z(ps psVar) {
        if (psVar.W != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(psVar.W.getId()));
            NotificationCenter.getInstance(psVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.w40
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.P = this.O;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.w40
    public final void P() {
        AndroidUtilities.runOnUIThread(new hs(this, 1));
    }

    @Override // org.telegram.ui.Components.w40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.fs
            @Override // java.lang.Runnable
            public final void run() {
                ps.X(ps.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z4);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.E));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.I : user.phone;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        final int i11 = 0;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.F) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ls(this));
        this.a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i13 = org.telegram.ui.ActionBar.j6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        int i14 = org.telegram.ui.ActionBar.j6.d6;
        frameLayout2.setBackgroundColor(getThemedColor(i14));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.e = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        int i15 = 5;
        this.S.addView(this.e, k7.b6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        int i16 = 7;
        eg.i0 i0Var = new eg.i0(this, context, paint, i16);
        this.v = i0Var;
        this.S.addView(i0Var, k7.b6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.S.addView(this.s, k7.b6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = this.S;
        TextView textView3 = this.f;
        boolean z4 = LocaleController.isRTL;
        TextView h = ai.h(frameLayout3, textView3, k7.b6.d(-2, -2.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 94.0f, 25.66f, z4 ? 94.0f : 0.0f, 0.0f), context);
        this.h = h;
        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.S;
        TextView textView4 = this.h;
        boolean z10 = LocaleController.isRTL;
        frameLayout4.addView(textView4, k7.b6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 49.66f, z10 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.r);
        this.b = h3Var;
        h3Var.b.setImeOptions(5);
        this.b.setBackgroundColor(getThemedColor(i14));
        this.b.setDivider(true);
        this.b.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.js
            public final /* synthetic */ ps b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i17, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i17 == 5) {
                            ps psVar = this.b;
                            psVar.c.b.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = psVar.c.b;
                            f3Var.setSelection(f3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ps psVar2 = this.b;
                        if (i17 != 6) {
                            if (i17 == 5) {
                                psVar2.d.b.requestFocus();
                                psVar2.d.b.setSelection(psVar2.c.b.length());
                                break;
                            }
                        } else {
                            psVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i17 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.b.b.setOnFocusChangeListener(new ms());
        this.b.setText(this.J);
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.r);
        this.c = h3Var2;
        h3Var2.b.setImeOptions(5);
        this.c.setBackgroundColor(getThemedColor(i14));
        this.c.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.js
            public final /* synthetic */ ps b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i17, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i17 == 5) {
                            ps psVar = this.b;
                            psVar.c.b.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = psVar.c.b;
                            f3Var.setSelection(f3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ps psVar2 = this.b;
                        if (i17 != 6) {
                            if (i17 == 5) {
                                psVar2.d.b.requestFocus();
                                psVar2.d.b.setSelection(psVar2.c.b.length());
                                break;
                            }
                        } else {
                            psVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i17 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.c.setText(this.K);
        org.telegram.ui.Cells.h3 h3Var3 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.r);
        this.d = h3Var3;
        h3Var3.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.gc));
        this.d.b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i14));
        final int i17 = 2;
        this.d.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.js
            public final /* synthetic */ ps b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i172, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i172 == 5) {
                            ps psVar = this.b;
                            psVar.c.b.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = psVar.c.b;
                            f3Var.setSelection(f3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ps psVar2 = this.b;
                        if (i172 != 6) {
                            if (i172 == 5) {
                                psVar2.d.b.requestFocus();
                                psVar2.d.b.setSelection(psVar2.c.b.length());
                                break;
                            }
                        } else {
                            psVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i172 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (!this.F) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.E));
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context, f6Var);
            this.x = n8Var;
            n8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.x.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            org.telegram.ui.Cells.n8 n8Var2 = this.x;
            int i18 = org.telegram.ui.ActionBar.j6.v6;
            int i19 = org.telegram.ui.ActionBar.j6.u6;
            n8Var2.e(i18, i19);
            final org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.x.e.setAnimation(gj0Var);
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ks
                public final /* synthetic */ ps b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            final ps psVar = this.b;
                            psVar.O = 1;
                            org.telegram.ui.Components.x40 x40Var = psVar.M;
                            TLRPC.User user2 = user;
                            x40Var.I = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z11 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            cg.n0 n0Var = new cg.n0(21);
                            final int i20 = 1;
                            final org.telegram.ui.Components.gj0 gj0Var2 = gj0Var;
                            x40Var.o(z11, n0Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.is
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i20) {
                                        case 0:
                                            ps psVar2 = psVar;
                                            boolean h9 = psVar2.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var3 = gj0Var2;
                                            if (!h9) {
                                                gj0Var3.N(86);
                                                psVar2.y.e.d();
                                                break;
                                            } else {
                                                gj0Var3.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            ps psVar3 = psVar;
                                            boolean h10 = psVar3.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var4 = gj0Var2;
                                            if (!h10) {
                                                gj0Var4.N(85);
                                                psVar3.x.e.d();
                                                break;
                                            } else {
                                                gj0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            gj0Var2.K(0);
                            gj0Var2.N(43);
                            psVar.x.e.d();
                            break;
                        default:
                            final ps psVar2 = this.b;
                            psVar2.O = 2;
                            org.telegram.ui.Components.x40 x40Var2 = psVar2.M;
                            TLRPC.User user3 = user;
                            x40Var2.I = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z12 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            cg.n0 n0Var2 = new cg.n0(21);
                            final int i21 = 0;
                            final org.telegram.ui.Components.gj0 gj0Var3 = gj0Var;
                            x40Var2.o(z12, n0Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.is
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i21) {
                                        case 0:
                                            ps psVar22 = psVar2;
                                            boolean h9 = psVar22.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var32 = gj0Var3;
                                            if (!h9) {
                                                gj0Var32.N(86);
                                                psVar22.y.e.d();
                                                break;
                                            } else {
                                                gj0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            ps psVar3 = psVar2;
                                            boolean h10 = psVar3.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var4 = gj0Var3;
                                            if (!h10) {
                                                gj0Var4.N(85);
                                                psVar3.x.e.d();
                                                break;
                                            } else {
                                                gj0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            gj0Var3.K(0);
                            gj0Var3.N(43);
                            psVar2.y.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(context, f6Var);
            this.y = n8Var3;
            n8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.y.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.y.e(i18, i19);
            final org.telegram.ui.Components.gj0 gj0Var2 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.y.e.setAnimation(gj0Var2);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ks
                public final /* synthetic */ ps b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final ps psVar = this.b;
                            psVar.O = 1;
                            org.telegram.ui.Components.x40 x40Var = psVar.M;
                            TLRPC.User user2 = user;
                            x40Var.I = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z11 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            cg.n0 n0Var = new cg.n0(21);
                            final int i20 = 1;
                            final org.telegram.ui.Components.gj0 gj0Var22 = gj0Var2;
                            x40Var.o(z11, n0Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.is
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i20) {
                                        case 0:
                                            ps psVar22 = psVar;
                                            boolean h9 = psVar22.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var32 = gj0Var22;
                                            if (!h9) {
                                                gj0Var32.N(86);
                                                psVar22.y.e.d();
                                                break;
                                            } else {
                                                gj0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            ps psVar3 = psVar;
                                            boolean h10 = psVar3.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var4 = gj0Var22;
                                            if (!h10) {
                                                gj0Var4.N(85);
                                                psVar3.x.e.d();
                                                break;
                                            } else {
                                                gj0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            gj0Var22.K(0);
                            gj0Var22.N(43);
                            psVar.x.e.d();
                            break;
                        default:
                            final ps psVar2 = this.b;
                            psVar2.O = 2;
                            org.telegram.ui.Components.x40 x40Var2 = psVar2.M;
                            TLRPC.User user3 = user;
                            x40Var2.I = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z12 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            cg.n0 n0Var2 = new cg.n0(21);
                            final int i21 = 0;
                            final org.telegram.ui.Components.gj0 gj0Var3 = gj0Var2;
                            x40Var2.o(z12, n0Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.is
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i21) {
                                        case 0:
                                            ps psVar22 = psVar2;
                                            boolean h9 = psVar22.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var32 = gj0Var3;
                                            if (!h9) {
                                                gj0Var32.N(86);
                                                psVar22.y.e.d();
                                                break;
                                            } else {
                                                gj0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            ps psVar3 = psVar2;
                                            boolean h10 = psVar3.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var4 = gj0Var3;
                                            if (!h10) {
                                                gj0Var4.N(85);
                                                psVar3.x.e.d();
                                                break;
                                            } else {
                                                gj0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            gj0Var3.K(0);
                            gj0Var3.N(43);
                            psVar2.y.e.d();
                            break;
                    }
                }
            });
            this.R = new org.telegram.ui.Components.p9(context);
            this.B = new ns(this, context, f6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.z8(0, user);
            }
            this.R.e(user.photo, this.n);
            this.B.addView(this.R, k7.b6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.B.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.B.getImageView().setVisibility(0);
            this.B.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.B.e(i18, i19);
            this.B.setOnClickListener(new c0(this, context, user, 10));
            org.telegram.ui.Cells.n8 n8Var4 = new org.telegram.ui.Cells.n8(context, f6Var);
            this.C = n8Var4;
            n8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.C.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.C.e(i18, i19);
            this.C.setNeedDivider(true);
            this.C.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.C.setOnClickListener(new org.telegram.ui.Components.rx0(12, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.E);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.Q = photo;
                if (photo == null) {
                    this.Q = userFull.fallback_photo;
                }
            }
            g0();
        }
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(this, new f5(this, i16), new c1(this, 26), null);
        this.T = g61Var;
        g61Var.o1();
        this.T.setOnScrollListener(new jh.l(i15, this, frameLayout));
        this.T.setBackgroundColor(getThemedColor(i13));
        frameLayout.addView(this.T, k7.b6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.T);
        if (this.F && this.H) {
            this.U = true;
        }
        this.T.V2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.E);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i11 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i11 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i10 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new kf.i0(this, fileLocation, inputFile2, fileLocation2, i10, 9));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            f0();
            return;
        }
        if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.D) {
            ArrayList arrayList = new ArrayList(dialogPhotos.photos);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.Q = (TLRPC.Photo) arrayList.get(0);
                g0();
            }
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final boolean e() {
        return this.P != 1;
    }

    public final void e0(boolean z4, boolean z10) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        if (!z10) {
            if (z4) {
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
        if (z4) {
            this.s.setVisibility(0);
            this.v.setVisibility(0);
            AnimatorSet animatorSet3 = this.w;
            RadialProgressView radialProgressView = this.s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<eg.i0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<eg.i0, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new org.telegram.ui.Components.m00(18, this, z4));
        this.w.start();
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f == null || (user = getMessagesController().getUser(Long.valueOf(this.E))) == null) {
            return;
        }
        if (TextUtils.isEmpty(c0())) {
            this.f.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.f.setText(se.b.c().b("+" + c0()));
        }
        this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.N == null) {
            org.telegram.ui.Components.p9 p9Var = this.e;
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
            this.n = z8Var;
            p9Var.e(user, z8Var);
        }
    }

    public final void g0() {
        TLRPC.Photo photo;
        if (this.F) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.E));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.Q) != null) {
            this.R.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), this.Q), "50_50", this.n, null);
        }
        if (this.n == null) {
            this.n = new org.telegram.ui.Components.z8(0, user);
        }
        TLRPC.FileLocation fileLocation = this.N;
        if (fileLocation == null) {
            this.e.e(user, this.n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.n, getMessagesController().getUser(Long.valueOf(this.E)));
        }
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.w40
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        TextView textView = this.f;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.h3 h3Var = this.b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h3Var, TLObject.FLAG_23, null, null, null, null, i11));
        org.telegram.ui.Cells.h3 h3Var2 = this.b;
        int i12 = org.telegram.ui.ActionBar.j6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.h3 h3Var3 = this.b;
        int i13 = org.telegram.ui.ActionBar.j6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.E = getArguments().getLong("user_id", 0L);
        this.I = getArguments().getString("phone");
        this.J = getArguments().getString("first_name_card");
        this.K = getArguments().getString("last_name_card");
        this.F = getArguments().getBoolean("addContact", false);
        this.G = getArguments().getBoolean("focus_notes", false);
        this.H = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("dialog_bar_exception" + this.E, false);
        TLRPC.User user = this.E != 0 ? getMessagesController().getUser(Long.valueOf(this.E)) : null;
        org.telegram.ui.Components.x40 x40Var = this.M;
        if (x40Var != null) {
            x40Var.a = this;
            x40Var.b = this;
        }
        this.D = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.E);
        return user != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.x40 x40Var = this.M;
        if (x40Var != null) {
            x40Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        this.M.j();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        f0();
        this.M.l();
    }

    @Override // org.telegram.ui.Components.w40
    public final /* synthetic */ boolean u() {
        return false;
    }

    public ps(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.U = false;
        this.V = true;
        this.r = f6Var;
        this.M = new org.telegram.ui.Components.x40(0, true, true);
    }
}
