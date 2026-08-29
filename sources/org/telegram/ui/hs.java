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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hs extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.r40 {
    public fs A;
    public org.telegram.ui.Cells.m8 B;
    public MessagesController.DialogPhotos C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public String I;
    public String J;
    public gs K;
    public final org.telegram.ui.Components.s40 L;
    public TLRPC.FileLocation M;
    public int N;
    public int O;
    public TLRPC.Photo P;
    public org.telegram.ui.Components.t9 Q;
    public FrameLayout R;
    public org.telegram.ui.Components.u51 S;
    public boolean T;
    public boolean U;
    public MessageObject V;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.g3 b;
    public org.telegram.ui.Cells.g3 c;
    public org.telegram.ui.Cells.g3 d;
    public org.telegram.ui.Components.t9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.e9 n;
    public final org.telegram.ui.ActionBar.c6 r;
    public RadialProgressView s;
    public cg.i0 v;
    public AnimatorSet w;
    public org.telegram.ui.Cells.m8 x;
    public org.telegram.ui.Cells.m8 y;

    public hs(Bundle bundle) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.L = new org.telegram.ui.Components.s40(0, true, true);
    }

    public static /* synthetic */ void U(hs hsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = hsVar.getMessagesController().getInputUser(hsVar.D);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(hsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new o(hsVar, 5));
    }

    public static /* synthetic */ void V(hs hsVar, TLRPC.User user) {
        hsVar.M = null;
        hsVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(hsVar.currentAccount).getUserFull(hsVar.D);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            hsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = hsVar.P;
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
        hsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        hsVar.g0();
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static /* synthetic */ void W(hs hsVar) {
        TLRPC.User user;
        if (hsVar.e == null || (user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D))) == null) {
            return;
        }
        hsVar.n.m(hsVar.currentAccount, user);
        hsVar.e.invalidate();
    }

    public static void X(hs hsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.s40 s40Var = hsVar.L;
        if (s40Var.P) {
            return;
        }
        int i10 = hsVar.O;
        if (i10 == 2) {
            hsVar.M = photoSize.location;
        } else if (i10 == 1 && hsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.b5 parentLayout = hsVar.getParentLayout();
            org.telegram.ui.ActionBar.o2 lastFragment = hsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                if (o2Var instanceof tn) {
                    tn tnVar = (tn) o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var2 = lastFragment;
                    if (tnVar.a() == hsVar.D && tnVar.N3 == 0) {
                        tnVar.Wa(false, null);
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
            hsVar.e.h(ImageLocation.getForLocal(hsVar.M), "50_50", hsVar.n, hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D)));
            if (hsVar.O == 2) {
                hsVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(hsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = hsVar.D;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = hsVar.getUserConfig().getNewMessageId();
                tL_messageService.id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = hsVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = hsVar.D;
                tL_messageService.date = hsVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(hsVar.currentAccount, tL_messageService, false, false);
                hsVar.V = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(hsVar.currentAccount).updateInterfaceWithMessages(hsVar.D, arrayList2, 0);
                hsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, s40Var);
            }
        } else {
            TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
            if (hsVar.V == null && user != null) {
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
                hsVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            hsVar.d0(hsVar.M, photoSize2.location, inputFile, inputFile2, videoSize, d, hsVar.O);
            hsVar.e0(false, true);
        }
        hsVar.g0();
    }

    public static void Y(hs hsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (hsVar.V != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
        TLRPC.UserFull userFull = MessagesController.getInstance(hsVar.currentAccount).getUserFull(hsVar.D);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= TLObject.FLAG_21;
            hsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String l10 = a4.w.l(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(l10, a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(hsVar.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            jf.k0.a(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            hsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            hsVar.getMessagesController().getDialogPhotos(hsVar.D).addPhotoAtStart(tL_photos_photo.photo);
            hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (hsVar.getParentActivity() != null) {
                if (i10 == 2) {
                    org.telegram.ui.Components.tc.a0(hsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.tc.a0(hsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                }
            }
        }
        hsVar.M = null;
        hsVar.g0();
    }

    public static /* synthetic */ void Z(hs hsVar) {
        if (hsVar.V != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(hsVar.V.getId()));
            NotificationCenter.getInstance(hsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.r40
    public final void D(float f9) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f9);
    }

    @Override // org.telegram.ui.Components.r40
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.O = this.N;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.r40
    public final void P() {
        AndroidUtilities.runOnUIThread(new zr(this, 1));
    }

    @Override // org.telegram.ui.Components.r40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wr
            @Override // java.lang.Runnable
            public final void run() {
                hs.X(hs.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.H : user.phone;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.r;
        final int i11 = 0;
        lVar.B(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.E) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ds(this));
        this.a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i13 = org.telegram.ui.ActionBar.g6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        int i14 = org.telegram.ui.ActionBar.g6.d6;
        frameLayout2.setBackgroundColor(getThemedColor(i14));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.e = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.R.addView(this.e, i7.f6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        cg.i0 i0Var = new cg.i0(this, context, paint, 8);
        this.v = i0Var;
        this.R.addView(i0Var, i7.f6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.R.addView(this.s, i7.f6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
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
        TextView h = th.h(frameLayout3, textView3, i7.f6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = h;
        h.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.R;
        TextView textView4 = this.h;
        boolean z11 = LocaleController.isRTL;
        frameLayout4.addView(textView4, i7.f6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.r);
        this.b = g3Var;
        g3Var.b.setImeOptions(5);
        this.b.setBackgroundColor(getThemedColor(i14));
        this.b.setDivider(true);
        this.b.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bs
            public final /* synthetic */ hs b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i15 == 5) {
                            hs hsVar = this.b;
                            hsVar.c.b.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = hsVar.c.b;
                            e3Var.setSelection(e3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        hs hsVar2 = this.b;
                        if (i15 != 6) {
                            if (i15 == 5) {
                                hsVar2.d.b.requestFocus();
                                hsVar2.d.b.setSelection(hsVar2.c.b.length());
                                break;
                            }
                        } else {
                            hsVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i15 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.b.b.setOnFocusChangeListener(new es());
        this.b.setText(this.I);
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.r);
        this.c = g3Var2;
        g3Var2.b.setImeOptions(5);
        this.c.setBackgroundColor(getThemedColor(i14));
        this.c.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bs
            public final /* synthetic */ hs b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i15 == 5) {
                            hs hsVar = this.b;
                            hsVar.c.b.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = hsVar.c.b;
                            e3Var.setSelection(e3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        hs hsVar2 = this.b;
                        if (i15 != 6) {
                            if (i15 == 5) {
                                hsVar2.d.b.requestFocus();
                                hsVar2.d.b.setSelection(hsVar2.c.b.length());
                                break;
                            }
                        } else {
                            hsVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i15 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.c.setText(this.J);
        org.telegram.ui.Cells.g3 g3Var3 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.r);
        this.d = g3Var3;
        g3Var3.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.gc));
        this.d.b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i14));
        final int i15 = 2;
        this.d.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bs
            public final /* synthetic */ hs b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i152, KeyEvent keyEvent) {
                switch (i15) {
                    case 0:
                        if (i152 == 5) {
                            hs hsVar = this.b;
                            hsVar.c.b.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = hsVar.c.b;
                            e3Var.setSelection(e3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        hs hsVar2 = this.b;
                        if (i152 != 6) {
                            if (i152 == 5) {
                                hsVar2.d.b.requestFocus();
                                hsVar2.d.b.setSelection(hsVar2.c.b.length());
                                break;
                            }
                        } else {
                            hsVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i152 == 6) {
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
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context, c6Var);
            this.x = m8Var;
            m8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.x.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            org.telegram.ui.Cells.m8 m8Var2 = this.x;
            int i16 = org.telegram.ui.ActionBar.g6.v6;
            int i17 = org.telegram.ui.ActionBar.g6.u6;
            m8Var2.e(i16, i17);
            final org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.photo_suggest_icon, "" + R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.x.e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.x.e.setAnimation(xi0Var);
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cs
                public final /* synthetic */ hs b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            final hs hsVar = this.b;
                            hsVar.N = 1;
                            org.telegram.ui.Components.s40 s40Var = hsVar.L;
                            TLRPC.User user2 = user;
                            s40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ag.o0 o0Var = new ag.o0(25);
                            final int i18 = 1;
                            final org.telegram.ui.Components.xi0 xi0Var2 = xi0Var;
                            s40Var.o(z12, o0Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.as
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            hs hsVar2 = hsVar;
                                            boolean h10 = hsVar2.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var3 = xi0Var2;
                                            if (!h10) {
                                                xi0Var3.N(86);
                                                hsVar2.y.e.d();
                                                break;
                                            } else {
                                                xi0Var3.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            hs hsVar3 = hsVar;
                                            boolean h11 = hsVar3.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var2;
                                            if (!h11) {
                                                xi0Var4.N(85);
                                                hsVar3.x.e.d();
                                                break;
                                            } else {
                                                xi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            xi0Var2.K(0);
                            xi0Var2.N(43);
                            hsVar.x.e.d();
                            break;
                        default:
                            final hs hsVar2 = this.b;
                            hsVar2.N = 2;
                            org.telegram.ui.Components.s40 s40Var2 = hsVar2.L;
                            TLRPC.User user3 = user;
                            s40Var2.H = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ag.o0 o0Var2 = new ag.o0(25);
                            final int i19 = 0;
                            final org.telegram.ui.Components.xi0 xi0Var3 = xi0Var;
                            s40Var2.o(z13, o0Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.as
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            hs hsVar22 = hsVar2;
                                            boolean h10 = hsVar22.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var3;
                                            if (!h10) {
                                                xi0Var32.N(86);
                                                hsVar22.y.e.d();
                                                break;
                                            } else {
                                                xi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            hs hsVar3 = hsVar2;
                                            boolean h11 = hsVar3.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var3;
                                            if (!h11) {
                                                xi0Var4.N(85);
                                                hsVar3.x.e.d();
                                                break;
                                            } else {
                                                xi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            xi0Var3.K(0);
                            xi0Var3.N(43);
                            hsVar2.y.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(context, c6Var);
            this.y = m8Var3;
            m8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.y.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.y.e(i16, i17);
            final org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.y.e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.y.e.setAnimation(xi0Var2);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cs
                public final /* synthetic */ hs b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final hs hsVar = this.b;
                            hsVar.N = 1;
                            org.telegram.ui.Components.s40 s40Var = hsVar.L;
                            TLRPC.User user2 = user;
                            s40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ag.o0 o0Var = new ag.o0(25);
                            final int i18 = 1;
                            final org.telegram.ui.Components.xi0 xi0Var22 = xi0Var2;
                            s40Var.o(z12, o0Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.as
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            hs hsVar22 = hsVar;
                                            boolean h10 = hsVar22.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var22;
                                            if (!h10) {
                                                xi0Var32.N(86);
                                                hsVar22.y.e.d();
                                                break;
                                            } else {
                                                xi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            hs hsVar3 = hsVar;
                                            boolean h11 = hsVar3.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var22;
                                            if (!h11) {
                                                xi0Var4.N(85);
                                                hsVar3.x.e.d();
                                                break;
                                            } else {
                                                xi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            xi0Var22.K(0);
                            xi0Var22.N(43);
                            hsVar.x.e.d();
                            break;
                        default:
                            final hs hsVar2 = this.b;
                            hsVar2.N = 2;
                            org.telegram.ui.Components.s40 s40Var2 = hsVar2.L;
                            TLRPC.User user3 = user;
                            s40Var2.H = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ag.o0 o0Var2 = new ag.o0(25);
                            final int i19 = 0;
                            final org.telegram.ui.Components.xi0 xi0Var3 = xi0Var2;
                            s40Var2.o(z13, o0Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.as
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            hs hsVar22 = hsVar2;
                                            boolean h10 = hsVar22.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var3;
                                            if (!h10) {
                                                xi0Var32.N(86);
                                                hsVar22.y.e.d();
                                                break;
                                            } else {
                                                xi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            hs hsVar3 = hsVar2;
                                            boolean h11 = hsVar3.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var3;
                                            if (!h11) {
                                                xi0Var4.N(85);
                                                hsVar3.x.e.d();
                                                break;
                                            } else {
                                                xi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            xi0Var3.K(0);
                            xi0Var3.N(43);
                            hsVar2.y.e.d();
                            break;
                    }
                }
            });
            this.Q = new org.telegram.ui.Components.t9(context);
            this.A = new fs(this, context, c6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.e9(0, user);
            }
            this.Q.e(user.photo, this.n);
            this.A.addView(this.Q, i7.f6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.A.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.A.getImageView().setVisibility(0);
            this.A.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.A.e(i16, i17);
            this.A.setOnClickListener(new c0(this, context, user, 10));
            org.telegram.ui.Cells.m8 m8Var4 = new org.telegram.ui.Cells.m8(context, c6Var);
            this.B = m8Var4;
            m8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.B.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.B.e(i16, i17);
            this.B.setNeedDivider(true);
            this.B.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.B.setOnClickListener(new org.telegram.ui.Components.fi0(15, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.D);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.P = photo;
                if (photo == null) {
                    this.P = userFull.fallback_photo;
                }
            }
            g0();
        }
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new b5(this, 7), new c1(this, 26), null);
        this.S = u51Var;
        u51Var.p1();
        this.S.setOnScrollListener(new hh.l(5, this, frameLayout));
        this.S.setBackgroundColor(getThemedColor(i13));
        frameLayout.addView(this.S, i7.f6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.S);
        if (this.E && this.G) {
            this.T = true;
        }
        this.S.U2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.D);
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new jf.i0(this, fileLocation, inputFile2, fileLocation2, i10, 9));
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
        if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.C) {
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
                this.P = (TLRPC.Photo) arrayList.get(0);
                g0();
            }
        }
    }

    @Override // org.telegram.ui.Components.r40
    public final boolean e() {
        return this.O != 1;
    }

    public final void e0(boolean z10, boolean z11) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<cg.i0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<cg.i0, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new org.telegram.ui.Components.z9(26, this, z10));
        this.w.start();
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f == null || (user = getMessagesController().getUser(Long.valueOf(this.D))) == null) {
            return;
        }
        if (TextUtils.isEmpty(c0())) {
            this.f.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.f.setText(qe.b.c().b("+" + c0()));
        }
        this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.M == null) {
            org.telegram.ui.Components.t9 t9Var = this.e;
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(0, user);
            this.n = e9Var;
            t9Var.e(user, e9Var);
        }
    }

    public final void g0() {
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
            this.n = new org.telegram.ui.Components.e9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.M;
        if (fileLocation == null) {
            this.e.e(user, this.n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.n, getMessagesController().getUser(Long.valueOf(this.D)));
        }
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ zt0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        TextView textView = this.f;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.g3 g3Var = this.b;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var, TLObject.FLAG_23, null, null, null, null, i11));
        org.telegram.ui.Cells.g3 g3Var2 = this.b;
        int i12 = org.telegram.ui.ActionBar.g6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.g3 g3Var3 = this.b;
        int i13 = org.telegram.ui.ActionBar.g6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
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
        org.telegram.ui.Components.s40 s40Var = this.L;
        if (s40Var != null) {
            s40Var.a = this;
            s40Var.b = this;
        }
        this.C = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.D);
        return user != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.s40 s40Var = this.L;
        if (s40Var != null) {
            s40Var.e();
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
        f0();
        this.L.l();
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean u() {
        return false;
    }

    public hs(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.r = c6Var;
        this.L = new org.telegram.ui.Components.s40(0, true, true);
    }
}
