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
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class hs extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public fs E;
    public org.telegram.ui.Cells.r8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public gs O;
    public final org.telegram.ui.Components.e50 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.w9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.j71 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.u0 a;
    public org.telegram.ui.Cells.h3 b;
    public org.telegram.ui.Cells.h3 c;
    public org.telegram.ui.Cells.h3 d;
    public org.telegram.ui.Components.w9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.h9 n;
    public final org.telegram.ui.ActionBar.g6 r;
    public RadialProgressView s;
    public ei.g6 v;
    public AnimatorSet w;
    public org.telegram.ui.Cells.r8 x;
    public org.telegram.ui.Cells.r8 y;

    public hs(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.e50(0, true, true);
    }

    public static /* synthetic */ void U(hs hsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = hsVar.getMessagesController().getInputUser(hsVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(hsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(hsVar, 5));
    }

    public static /* synthetic */ void V(hs hsVar, TLRPC.User user) {
        hsVar.Q = null;
        hsVar.c0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(hsVar.currentAccount).getUserFull(hsVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            hsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = hsVar.T;
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
        hsVar.f0();
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(hs hsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.e50 e50Var = hsVar.P;
        if (e50Var.T) {
            return;
        }
        int i10 = hsVar.S;
        if (i10 == 2) {
            hsVar.Q = photoSize.location;
        } else if (i10 == 1 && hsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.h5 parentLayout = hsVar.getParentLayout();
            org.telegram.ui.ActionBar.o2 lastFragment = hsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                if (o2Var instanceof sn) {
                    sn snVar = (sn) o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var2 = lastFragment;
                    if (snVar.a() == hsVar.H && snVar.d4 == 0) {
                        snVar.ab(false, null);
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
            hsVar.e.h(ImageLocation.getForLocal(hsVar.Q), "50_50", hsVar.n, hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H)));
            if (hsVar.S == 2) {
                hsVar.d0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(hsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = hsVar.H;
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
                tL_peerUser2.user_id = hsVar.H;
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
                hsVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(hsVar.currentAccount).updateInterfaceWithMessages(hsVar.H, arrayList2, 0);
                hsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, e50Var);
            }
        } else {
            TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
            if (hsVar.Z == null && user != null) {
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
            hsVar.c0(hsVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, hsVar.S);
            hsVar.d0(false, true);
        }
        hsVar.f0();
    }

    public static void X(hs hsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (hsVar.Z != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
        TLRPC.UserFull userFull = MessagesController.getInstance(hsVar.currentAccount).getUserFull(hsVar.H);
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
                String n10 = a1.g.n(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(hsVar.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            zf.d0.a(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            hsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            hsVar.getMessagesController().getDialogPhotos(hsVar.H).addPhotoAtStart(tL_photos_photo.photo);
            hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (hsVar.getParentActivity() != null) {
                if (i10 == 2) {
                    org.telegram.ui.Components.xc.a0(hsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.xc.a0(hsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                }
            }
        }
        hsVar.Q = null;
        hsVar.f0();
    }

    public static /* synthetic */ void Y(hs hsVar) {
        if (hsVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(hsVar.Z.getId()));
            NotificationCenter.getInstance(hsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void P() {
        AndroidUtilities.runOnUIThread(new xr(this, 0));
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yr
            @Override // java.lang.Runnable
            public final void run() {
                hs.W(hs.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    public final String b0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.L : user.phone;
    }

    public final void c0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new ai.tb(this, fileLocation, inputFile2, fileLocation2, i10, 9));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f8;
        org.telegram.ui.ActionBar.g6 g6Var = this.r;
        org.telegram.ui.ActionBar.r6.m(kVar, 3, i10, g6Var);
        final int i11 = 1;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.v8, g6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.I) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ds(this));
        this.a = this.actionBar.m().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i12, frameLayout, g6Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i13 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i13, frameLayout2, g6Var);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.V.addView(this.e, w7.z5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        int i14 = 8;
        ei.g6 g6Var2 = new ei.g6(this, context, paint, i14);
        this.v = g6Var2;
        this.V.addView(g6Var2, w7.z5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.s.setProgressColor(-1);
        final int i15 = 0;
        this.s.setNoProgress(false);
        this.V.addView(this.s, w7.z5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        d0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
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
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout3, textView3, w7.z5.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = j10;
        org.telegram.ui.ActionBar.r6.W(j10, org.telegram.ui.ActionBar.k6.A6, g6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.V;
        TextView textView4 = this.h;
        boolean z11 = LocaleController.isRTL;
        frameLayout4.addView(textView4, w7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.r);
        this.b = h3Var;
        h3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i13, this.b, g6Var);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bs
            public final /* synthetic */ hs b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i16, KeyEvent keyEvent) {
                switch (i15) {
                    case 0:
                        if (i16 == 5) {
                            hs hsVar = this.b;
                            hsVar.c.d.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = hsVar.c.d;
                            f3Var.setSelection(f3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        hs hsVar2 = this.b;
                        if (i16 != 6) {
                            if (i16 == 5) {
                                hsVar2.d.d.requestFocus();
                                hsVar2.d.d.setSelection(hsVar2.c.d.length());
                                break;
                            }
                        } else {
                            hsVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i16 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.b.d.setOnFocusChangeListener(new es());
        this.b.setText(this.M);
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.r);
        this.c = h3Var2;
        h3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i13, this.c, g6Var);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bs
            public final /* synthetic */ hs b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i16, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i16 == 5) {
                            hs hsVar = this.b;
                            hsVar.c.d.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = hsVar.c.d;
                            f3Var.setSelection(f3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        hs hsVar2 = this.b;
                        if (i16 != 6) {
                            if (i16 == 5) {
                                hsVar2.d.d.requestFocus();
                                hsVar2.d.d.setSelection(hsVar2.c.d.length());
                                break;
                            }
                        } else {
                            hsVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i16 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.c.setText(this.N);
        org.telegram.ui.Cells.h3 h3Var3 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.r);
        this.d = h3Var3;
        org.telegram.ui.ActionBar.r6.I(h3Var3.d, org.telegram.ui.ActionBar.k6.gc, g6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.i(i13, this.d, g6Var);
        final int i16 = 2;
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.bs
            public final /* synthetic */ hs b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i162, KeyEvent keyEvent) {
                switch (i16) {
                    case 0:
                        if (i162 == 5) {
                            hs hsVar = this.b;
                            hsVar.c.d.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = hsVar.c.d;
                            f3Var.setSelection(f3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        hs hsVar2 = this.b;
                        if (i162 != 6) {
                            if (i162 == 5) {
                                hsVar2.d.d.requestFocus();
                                hsVar2.d.d.setSelection(hsVar2.c.d.length());
                                break;
                            }
                        } else {
                            hsVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i162 == 6) {
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
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, g6Var);
            this.x = r8Var;
            r8Var.o(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.x.setBackground(org.telegram.ui.ActionBar.k6.L0(g6Var, true));
            org.telegram.ui.Cells.r8 r8Var2 = this.x;
            int i17 = org.telegram.ui.ActionBar.k6.v6;
            int i18 = org.telegram.ui.ActionBar.k6.u6;
            r8Var2.g(i17, i18);
            final org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.x.e.setAnimation(yj0Var);
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cs
                public final /* synthetic */ hs b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            final hs hsVar = this.b;
                            hsVar.R = 1;
                            org.telegram.ui.Components.e50 e50Var = hsVar.P;
                            TLRPC.User user2 = user;
                            e50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ah.j jVar = new ah.j(23);
                            final int i19 = 1;
                            final org.telegram.ui.Components.yj0 yj0Var2 = yj0Var;
                            e50Var.n(z12, jVar, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.as
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            hs hsVar2 = hsVar;
                                            boolean g10 = hsVar2.P.g();
                                            org.telegram.ui.Components.yj0 yj0Var3 = yj0Var2;
                                            if (!g10) {
                                                yj0Var3.P(86);
                                                hsVar2.y.e.d();
                                                break;
                                            } else {
                                                yj0Var3.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            hs hsVar3 = hsVar;
                                            boolean g11 = hsVar3.P.g();
                                            org.telegram.ui.Components.yj0 yj0Var4 = yj0Var2;
                                            if (!g11) {
                                                yj0Var4.P(85);
                                                hsVar3.x.e.d();
                                                break;
                                            } else {
                                                yj0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            yj0Var2.M(0);
                            yj0Var2.P(43);
                            hsVar.x.e.d();
                            break;
                        default:
                            final hs hsVar2 = this.b;
                            hsVar2.R = 2;
                            org.telegram.ui.Components.e50 e50Var2 = hsVar2.P;
                            TLRPC.User user3 = user;
                            e50Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ah.j jVar2 = new ah.j(23);
                            final int i20 = 0;
                            final org.telegram.ui.Components.yj0 yj0Var3 = yj0Var;
                            e50Var2.n(z13, jVar2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.as
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i20) {
                                        case 0:
                                            hs hsVar22 = hsVar2;
                                            boolean g10 = hsVar22.P.g();
                                            org.telegram.ui.Components.yj0 yj0Var32 = yj0Var3;
                                            if (!g10) {
                                                yj0Var32.P(86);
                                                hsVar22.y.e.d();
                                                break;
                                            } else {
                                                yj0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            hs hsVar3 = hsVar2;
                                            boolean g11 = hsVar3.P.g();
                                            org.telegram.ui.Components.yj0 yj0Var4 = yj0Var3;
                                            if (!g11) {
                                                yj0Var4.P(85);
                                                hsVar3.x.e.d();
                                                break;
                                            } else {
                                                yj0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            yj0Var3.M(0);
                            yj0Var3.P(43);
                            hsVar2.y.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(context, g6Var);
            this.y = r8Var3;
            r8Var3.o(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.y.setBackground(org.telegram.ui.ActionBar.k6.L0(g6Var, true));
            this.y.g(i17, i18);
            final org.telegram.ui.Components.yj0 yj0Var2 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.y.e.setAnimation(yj0Var2);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cs
                public final /* synthetic */ hs b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            final hs hsVar = this.b;
                            hsVar.R = 1;
                            org.telegram.ui.Components.e50 e50Var = hsVar.P;
                            TLRPC.User user2 = user;
                            e50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ah.j jVar = new ah.j(23);
                            final int i19 = 1;
                            final org.telegram.ui.Components.yj0 yj0Var22 = yj0Var2;
                            e50Var.n(z12, jVar, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.as
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            hs hsVar22 = hsVar;
                                            boolean g10 = hsVar22.P.g();
                                            org.telegram.ui.Components.yj0 yj0Var32 = yj0Var22;
                                            if (!g10) {
                                                yj0Var32.P(86);
                                                hsVar22.y.e.d();
                                                break;
                                            } else {
                                                yj0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            hs hsVar3 = hsVar;
                                            boolean g11 = hsVar3.P.g();
                                            org.telegram.ui.Components.yj0 yj0Var4 = yj0Var22;
                                            if (!g11) {
                                                yj0Var4.P(85);
                                                hsVar3.x.e.d();
                                                break;
                                            } else {
                                                yj0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            yj0Var22.M(0);
                            yj0Var22.P(43);
                            hsVar.x.e.d();
                            break;
                        default:
                            final hs hsVar2 = this.b;
                            hsVar2.R = 2;
                            org.telegram.ui.Components.e50 e50Var2 = hsVar2.P;
                            TLRPC.User user3 = user;
                            e50Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ah.j jVar2 = new ah.j(23);
                            final int i20 = 0;
                            final org.telegram.ui.Components.yj0 yj0Var3 = yj0Var2;
                            e50Var2.n(z13, jVar2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.as
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i20) {
                                        case 0:
                                            hs hsVar22 = hsVar2;
                                            boolean g10 = hsVar22.P.g();
                                            org.telegram.ui.Components.yj0 yj0Var32 = yj0Var3;
                                            if (!g10) {
                                                yj0Var32.P(86);
                                                hsVar22.y.e.d();
                                                break;
                                            } else {
                                                yj0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            hs hsVar3 = hsVar2;
                                            boolean g11 = hsVar3.P.g();
                                            org.telegram.ui.Components.yj0 yj0Var4 = yj0Var3;
                                            if (!g11) {
                                                yj0Var4.P(85);
                                                hsVar3.x.e.d();
                                                break;
                                            } else {
                                                yj0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            yj0Var3.M(0);
                            yj0Var3.P(43);
                            hsVar2.y.e.d();
                            break;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.w9(context);
            this.E = new fs(this, context, g6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.h9(0, user);
            }
            this.U.e(user.photo, this.n);
            this.E.addView(this.U, w7.z5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.k(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.k6.L0(g6Var, true));
            this.E.g(i17, i18);
            this.E.setOnClickListener(new z(this, context, user, 10));
            org.telegram.ui.Cells.r8 r8Var4 = new org.telegram.ui.Cells.r8(context, g6Var);
            this.F = r8Var4;
            r8Var4.o(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.k6.L0(g6Var, true));
            this.F.g(i17, i18);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.d51(i14, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.H);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = userFull.fallback_photo;
                }
            }
            f0();
        }
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(this, new f5(this, 7), new a1(this, 26), null);
        this.W = j71Var;
        j71Var.t1();
        this.W.setOnScrollListener(new ki.m3(4, this, frameLayout));
        org.telegram.ui.ActionBar.r6.i(i12, this.W, g6Var);
        frameLayout.addView(this.W, w7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.W);
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.Z2.N(false);
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<ei.g6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<ei.g6, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new ho(27, this, z10));
        this.w.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            e0();
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
                f0();
            }
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final boolean e() {
        return this.S != 1;
    }

    public final void e0() {
        TLRPC.User user;
        if (this.f == null || (user = getMessagesController().getUser(Long.valueOf(this.H))) == null) {
            return;
        }
        if (TextUtils.isEmpty(b0())) {
            this.f.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.f.setText(jf.b.c().b("+" + b0()));
        }
        this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.Q == null) {
            org.telegram.ui.Components.w9 w9Var = this.e;
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(0, user);
            this.n = h9Var;
            w9Var.e(user, h9Var);
        }
    }

    public final void f0() {
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

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ mu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        org.telegram.ui.Components.e50 e50Var = this.P;
        if (e50Var != null) {
            e50Var.a = this;
            e50Var.b = this;
        }
        this.G = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.H);
        return user != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.e50 e50Var = this.P;
        if (e50Var != null) {
            e50Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.P.i();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        e0();
        this.P.k();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        TLRPC.User user;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (user = getMessagesController().getUser(Long.valueOf(this.H))) != null) {
                this.n.m(this.currentAccount, user);
                this.e.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    public hs(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.r = g6Var;
        this.P = new org.telegram.ui.Components.e50(0, true, true);
    }
}
