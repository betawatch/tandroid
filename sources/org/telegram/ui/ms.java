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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ms extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.u40 {
    public ks E;
    public org.telegram.ui.Cells.r8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public ls O;
    public final org.telegram.ui.Components.v40 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.w9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.r61 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.u0 a;
    public org.telegram.ui.Cells.j3 b;
    public org.telegram.ui.Cells.j3 c;
    public org.telegram.ui.Cells.j3 d;
    public org.telegram.ui.Components.w9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.h9 n;
    public final org.telegram.ui.ActionBar.d6 r;
    public RadialProgressView s;
    public ci.r6 v;
    public AnimatorSet w;
    public org.telegram.ui.Cells.r8 x;
    public org.telegram.ui.Cells.r8 y;

    public ms(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.v40(0, true, true);
    }

    public static /* synthetic */ void U(ms msVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = msVar.getMessagesController().getInputUser(msVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(msVar.currentAccount).sendRequest(tL_users_suggestBirthday, new m(msVar, 5));
    }

    public static /* synthetic */ void V(ms msVar, TLRPC.User user) {
        msVar.Q = null;
        msVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(msVar.currentAccount).getUserFull(msVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            msVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = msVar.T;
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
        msVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        msVar.g0();
        msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static /* synthetic */ void W(ms msVar) {
        TLRPC.User user;
        if (msVar.e == null || (user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H))) == null) {
            return;
        }
        msVar.n.m(msVar.currentAccount, user);
        msVar.e.invalidate();
    }

    public static void X(ms msVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.v40 v40Var = msVar.P;
        if (v40Var.T) {
            return;
        }
        int i10 = msVar.S;
        if (i10 == 2) {
            msVar.Q = photoSize.location;
        } else if (i10 == 1 && msVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.b5 parentLayout = msVar.getParentLayout();
            org.telegram.ui.ActionBar.m2 lastFragment = msVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(size);
                if (m2Var instanceof wn) {
                    wn wnVar = (wn) m2Var;
                    org.telegram.ui.ActionBar.m2 m2Var2 = lastFragment;
                    if (wnVar.a() == msVar.H && wnVar.R3 == 0) {
                        wnVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            if (arrayList.get(size2) != m2Var3) {
                                ((org.telegram.ui.ActionBar.m2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            m2Var2 = m2Var3;
                        }
                        m2Var2.finishFragment();
                    } else {
                        lastFragment = m2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.m2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            msVar.e.h(ImageLocation.getForLocal(msVar.Q), "50_50", msVar.n, msVar.getMessagesController().getUser(Long.valueOf(msVar.H)));
            if (msVar.S == 2) {
                msVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(msVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = msVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = msVar.getUserConfig().getNewMessageId();
                tL_messageService.id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = msVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = msVar.H;
                tL_messageService.date = msVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(msVar.currentAccount, tL_messageService, false, false);
                msVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(msVar.currentAccount).updateInterfaceWithMessages(msVar.H, arrayList2, 0);
                msVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, v40Var);
            }
        } else {
            TLRPC.User user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
            if (msVar.Z == null && user != null) {
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
                msVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            msVar.d0(msVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, msVar.S);
            msVar.e0(false, true);
        }
        msVar.g0();
    }

    public static void Y(ms msVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (msVar.Z != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
        TLRPC.UserFull userFull = MessagesController.getInstance(msVar.currentAccount).getUserFull(msVar.H);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= TLObject.FLAG_21;
            msVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(msVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(msVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String o9 = a4.a.o(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(msVar.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(msVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(msVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            yf.d0.a(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            msVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            msVar.getMessagesController().getDialogPhotos(msVar.H).addPhotoAtStart(tL_photos_photo.photo);
            msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (msVar.getParentActivity() != null) {
                if (i10 == 2) {
                    org.telegram.ui.Components.xc.a0(msVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.xc.a0(msVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                }
            }
        }
        msVar.Q = null;
        msVar.g0();
    }

    public static /* synthetic */ void Z(ms msVar) {
        if (msVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(msVar.Z.getId()));
            NotificationCenter.getInstance(msVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final void B(float f7) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.u40
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.u40
    public final void P() {
        AndroidUtilities.runOnUIThread(new es(this, 1));
    }

    @Override // org.telegram.ui.Components.u40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cs
            @Override // java.lang.Runnable
            public final void run() {
                ms.X(ms.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.L : user.phone;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.r;
        final int i11 = 0;
        kVar.A(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.I) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new is(this));
        this.a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i13 = org.telegram.ui.ActionBar.h6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i14 = org.telegram.ui.ActionBar.h6.d6;
        frameLayout2.setBackgroundColor(getThemedColor(i14));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.V.addView(this.e, w7.y5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ci.r6 r6Var = new ci.r6(this, context, paint, 8);
        this.v = r6Var;
        this.V.addView(r6Var, w7.y5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.V.addView(this.s, w7.y5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = this.V;
        TextView textView3 = this.f;
        boolean z10 = LocaleController.isRTL;
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout3, textView3, w7.y5.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = h;
        h.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.V;
        TextView textView4 = this.h;
        boolean z11 = LocaleController.isRTL;
        frameLayout4.addView(textView4, w7.y5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.r);
        this.b = j3Var;
        j3Var.b.setImeOptions(5);
        this.b.setBackgroundColor(getThemedColor(i14));
        this.b.setDivider(true);
        this.b.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.gs
            public final /* synthetic */ ms b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i15 == 5) {
                            ms msVar = this.b;
                            msVar.c.b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = msVar.c.b;
                            h3Var.setSelection(h3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ms msVar2 = this.b;
                        if (i15 != 6) {
                            if (i15 == 5) {
                                msVar2.d.b.requestFocus();
                                msVar2.d.b.setSelection(msVar2.c.b.length());
                                break;
                            }
                        } else {
                            msVar2.a.performClick();
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
        this.b.b.setOnFocusChangeListener(new js());
        this.b.setText(this.M);
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.r);
        this.c = j3Var2;
        j3Var2.b.setImeOptions(5);
        this.c.setBackgroundColor(getThemedColor(i14));
        this.c.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.gs
            public final /* synthetic */ ms b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i15 == 5) {
                            ms msVar = this.b;
                            msVar.c.b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = msVar.c.b;
                            h3Var.setSelection(h3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ms msVar2 = this.b;
                        if (i15 != 6) {
                            if (i15 == 5) {
                                msVar2.d.b.requestFocus();
                                msVar2.d.b.setSelection(msVar2.c.b.length());
                                break;
                            }
                        } else {
                            msVar2.a.performClick();
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
        this.c.setText(this.N);
        org.telegram.ui.Cells.j3 j3Var3 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.r);
        this.d = j3Var3;
        j3Var3.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.gc));
        this.d.b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i14));
        final int i15 = 2;
        this.d.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.gs
            public final /* synthetic */ ms b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i152, KeyEvent keyEvent) {
                switch (i15) {
                    case 0:
                        if (i152 == 5) {
                            ms msVar = this.b;
                            msVar.c.b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = msVar.c.b;
                            h3Var.setSelection(h3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ms msVar2 = this.b;
                        if (i152 != 6) {
                            if (i152 == 5) {
                                msVar2.d.b.requestFocus();
                                msVar2.d.b.setSelection(msVar2.c.b.length());
                                break;
                            }
                        } else {
                            msVar2.a.performClick();
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
        if (!this.I) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, d6Var);
            this.x = r8Var;
            r8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.x.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            org.telegram.ui.Cells.r8 r8Var2 = this.x;
            int i16 = org.telegram.ui.ActionBar.h6.v6;
            int i17 = org.telegram.ui.ActionBar.h6.u6;
            r8Var2.e(i16, i17);
            final org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.x.e.setAnimation(ij0Var);
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hs
                public final /* synthetic */ ms b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            final ms msVar = this.b;
                            msVar.R = 1;
                            org.telegram.ui.Components.v40 v40Var = msVar.P;
                            TLRPC.User user2 = user;
                            v40Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ai.f fVar = new ai.f(18);
                            final int i18 = 1;
                            final org.telegram.ui.Components.ij0 ij0Var2 = ij0Var;
                            v40Var.o(z12, fVar, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.fs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            ms msVar2 = msVar;
                                            boolean h10 = msVar2.P.h();
                                            org.telegram.ui.Components.ij0 ij0Var3 = ij0Var2;
                                            if (!h10) {
                                                ij0Var3.P(86);
                                                msVar2.y.e.d();
                                                break;
                                            } else {
                                                ij0Var3.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ms msVar3 = msVar;
                                            boolean h11 = msVar3.P.h();
                                            org.telegram.ui.Components.ij0 ij0Var4 = ij0Var2;
                                            if (!h11) {
                                                ij0Var4.P(85);
                                                msVar3.x.e.d();
                                                break;
                                            } else {
                                                ij0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            ij0Var2.M(0);
                            ij0Var2.P(43);
                            msVar.x.e.d();
                            break;
                        default:
                            final ms msVar2 = this.b;
                            msVar2.R = 2;
                            org.telegram.ui.Components.v40 v40Var2 = msVar2.P;
                            TLRPC.User user3 = user;
                            v40Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ai.f fVar2 = new ai.f(18);
                            final int i19 = 0;
                            final org.telegram.ui.Components.ij0 ij0Var3 = ij0Var;
                            v40Var2.o(z13, fVar2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.fs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            ms msVar22 = msVar2;
                                            boolean h10 = msVar22.P.h();
                                            org.telegram.ui.Components.ij0 ij0Var32 = ij0Var3;
                                            if (!h10) {
                                                ij0Var32.P(86);
                                                msVar22.y.e.d();
                                                break;
                                            } else {
                                                ij0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ms msVar3 = msVar2;
                                            boolean h11 = msVar3.P.h();
                                            org.telegram.ui.Components.ij0 ij0Var4 = ij0Var3;
                                            if (!h11) {
                                                ij0Var4.P(85);
                                                msVar3.x.e.d();
                                                break;
                                            } else {
                                                ij0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            ij0Var3.M(0);
                            ij0Var3.P(43);
                            msVar2.y.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(context, d6Var);
            this.y = r8Var3;
            r8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.y.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.y.e(i16, i17);
            final org.telegram.ui.Components.ij0 ij0Var2 = new org.telegram.ui.Components.ij0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.y.e.setAnimation(ij0Var2);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hs
                public final /* synthetic */ ms b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final ms msVar = this.b;
                            msVar.R = 1;
                            org.telegram.ui.Components.v40 v40Var = msVar.P;
                            TLRPC.User user2 = user;
                            v40Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ai.f fVar = new ai.f(18);
                            final int i18 = 1;
                            final org.telegram.ui.Components.ij0 ij0Var22 = ij0Var2;
                            v40Var.o(z12, fVar, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.fs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            ms msVar22 = msVar;
                                            boolean h10 = msVar22.P.h();
                                            org.telegram.ui.Components.ij0 ij0Var32 = ij0Var22;
                                            if (!h10) {
                                                ij0Var32.P(86);
                                                msVar22.y.e.d();
                                                break;
                                            } else {
                                                ij0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ms msVar3 = msVar;
                                            boolean h11 = msVar3.P.h();
                                            org.telegram.ui.Components.ij0 ij0Var4 = ij0Var22;
                                            if (!h11) {
                                                ij0Var4.P(85);
                                                msVar3.x.e.d();
                                                break;
                                            } else {
                                                ij0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            ij0Var22.M(0);
                            ij0Var22.P(43);
                            msVar.x.e.d();
                            break;
                        default:
                            final ms msVar2 = this.b;
                            msVar2.R = 2;
                            org.telegram.ui.Components.v40 v40Var2 = msVar2.P;
                            TLRPC.User user3 = user;
                            v40Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ai.f fVar2 = new ai.f(18);
                            final int i19 = 0;
                            final org.telegram.ui.Components.ij0 ij0Var3 = ij0Var2;
                            v40Var2.o(z13, fVar2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.fs
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            ms msVar22 = msVar2;
                                            boolean h10 = msVar22.P.h();
                                            org.telegram.ui.Components.ij0 ij0Var32 = ij0Var3;
                                            if (!h10) {
                                                ij0Var32.P(86);
                                                msVar22.y.e.d();
                                                break;
                                            } else {
                                                ij0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ms msVar3 = msVar2;
                                            boolean h11 = msVar3.P.h();
                                            org.telegram.ui.Components.ij0 ij0Var4 = ij0Var3;
                                            if (!h11) {
                                                ij0Var4.P(85);
                                                msVar3.x.e.d();
                                                break;
                                            } else {
                                                ij0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            ij0Var3.M(0);
                            ij0Var3.P(43);
                            msVar2.y.e.d();
                            break;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.w9(context);
            this.E = new ks(this, context, d6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.h9(0, user);
            }
            this.U.e(user.photo, this.n);
            this.E.addView(this.U, w7.y5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.E.e(i16, i17);
            this.E.setOnClickListener(new a0(this, context, user, 10));
            org.telegram.ui.Cells.r8 r8Var4 = new org.telegram.ui.Cells.r8(context, d6Var);
            this.F = r8Var4;
            r8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.F.e(i16, i17);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.et(27, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.H);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = userFull.fallback_photo;
                }
            }
            g0();
        }
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(this, new b5(this, 7), new z0(this, 26), null);
        this.W = r61Var;
        r61Var.p1();
        this.W.setOnScrollListener(new ii.n3(4, this, frameLayout));
        this.W.setBackgroundColor(getThemedColor(i13));
        frameLayout.addView(this.W, w7.y5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.W);
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.Y2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.H);
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new ai.ya(this, fileLocation, inputFile2, fileLocation2, i10, 7));
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
        if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.G) {
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
                this.T = (TLRPC.Photo) arrayList.get(0);
                g0();
            }
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final boolean e() {
        return this.S != 1;
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<ci.r6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<ci.r6, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new org.telegram.ui.Components.ca(26, this, z10));
        this.w.start();
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f == null || (user = getMessagesController().getUser(Long.valueOf(this.H))) == null) {
            return;
        }
        if (TextUtils.isEmpty(c0())) {
            this.f.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.f.setText(gf.b.c().b("+" + c0()));
        }
        this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.Q == null) {
            org.telegram.ui.Components.w9 w9Var = this.e;
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(0, user);
            this.n = h9Var;
            w9Var.e(user, h9Var);
        }
    }

    public final void g0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), this.T), "50_50", this.n, null);
        }
        if (this.n == null) {
            this.n = new org.telegram.ui.Components.h9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(user, this.n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.n, getMessagesController().getUser(Long.valueOf(this.H)));
        }
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ vu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.u40
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        TextView textView = this.f;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.j3 j3Var = this.b;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(j3Var, TLObject.FLAG_23, null, null, null, null, i11));
        org.telegram.ui.Cells.j3 j3Var2 = this.b;
        int i12 = org.telegram.ui.ActionBar.h6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(j3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.j3 j3Var3 = this.b;
        int i13 = org.telegram.ui.ActionBar.h6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(j3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        this.K = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("dialog_bar_exception" + this.H, false);
        TLRPC.User user = this.H != 0 ? getMessagesController().getUser(Long.valueOf(this.H)) : null;
        org.telegram.ui.Components.v40 v40Var = this.P;
        if (v40Var != null) {
            v40Var.a = this;
            v40Var.b = this;
        }
        this.G = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.H);
        return user != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.v40 v40Var = this.P;
        if (v40Var != null) {
            v40Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        this.P.j();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        f0();
        this.P.l();
    }

    @Override // org.telegram.ui.Components.u40
    public final /* synthetic */ boolean t() {
        return false;
    }

    public ms(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.r = d6Var;
        this.P = new org.telegram.ui.Components.v40(0, true, true);
    }
}
