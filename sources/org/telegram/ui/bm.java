package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bm implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ jm a;

    public bm(jm jmVar) {
        this.a = jmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean A2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z4;
        xn xnVar = this.a.N;
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inPreviewMode;
        if (z4) {
            return false;
        }
        return xnVar.I7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void D2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.a.N.W7(v0Var, reactionCount, z4, f10, f11);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void E1(long j10) {
        xn xnVar = this.a.N;
        int i10 = xn.Ec;
        xnVar.na(j10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void F1(org.telegram.ui.Cells.v0 v0Var) {
        xn xnVar = this.a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || xnVar.O1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(xnVar.e)) {
            xnVar.O1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            xnVar.O1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void I(org.telegram.ui.Cells.v0 v0Var, int i10) {
        bh.a aVar = new bh.a(this, v0Var, i10, 27);
        xn xnVar = this.a.N;
        if (!xnVar.x0.K) {
            aVar.run();
        } else {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(aVar, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Q1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        xn xnVar = this.a.N;
        if (str != null) {
            c(v0Var);
            af.f fVar = xnVar.xb;
            hg.i1 i1Var = hg.i1.P0;
            hg.e1.T(LaunchActivity.R(), str, fVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        fg.d2 d2Var = new fg.d2(xnVar, i10, xnVar.i(), new fg.n(tL_premiumGiftOption), null, xnVar.ba);
        d2Var.G0 = false;
        d2Var.Z = v0Var.getMessageObject().isOut();
        xnVar.showDialog(d2Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.p2 T0() {
        return this.a.N;
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final long b() {
        return this.a.N.b();
    }

    @Override // org.telegram.ui.Cells.t0
    public final void b0(org.telegram.ui.Cells.v0 v0Var) {
        tj tjVar;
        xn xnVar = this.a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        qj qjVar = xnVar.u0;
        if (qjVar != null && (tjVar = xnVar.w0) != null && tjVar.y < 0) {
            int childCount = qjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = xnVar.u0.getChildAt(childCount);
                xnVar.u0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            xnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        xnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        xnVar.rc(messageObject, false);
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        xn xnVar = this.a.N;
        af.f fVar = xnVar.xb;
        if (fVar != null) {
            fVar.a(true);
        }
        xnVar.xb = v0Var.getMessageObject() == null ? null : new cn(this, v0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        j3.b0 b0Var = new j3.b0(this, v0Var, i10, i11, 3);
        xn xnVar = this.a.N;
        if (!xnVar.x0.K) {
            b0Var.run();
        } else {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(b0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void l1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        uk ukVar = this.a.N.ua;
        FrameLayout frameLayout = ukVar.D;
        HashMap hashMap = ukVar.f;
        Random random = ukVar.h;
        ArrayList arrayList = ukVar.C;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = v0Var.getPhotoImage().getImageHeight();
            float imageWidth = v0Var.getPhotoImage().getImageWidth();
            if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < arrayList.size()) {
                if (((bz) arrayList.get(i11)).p == v0Var.getMessageObject().getId()) {
                    i12++;
                    if (((bz) arrayList.get(i11)).r.getLottieAnimation() == null || ((bz) arrayList.get(i11)).r.getLottieAnimation().w()) {
                        return;
                    }
                }
                if (((bz) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((bz) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            bz bzVar = new bz();
            bzVar.h = true;
            if (!bzVar.i) {
                bzVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                bzVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            bzVar.p = v0Var.getMessageObject().getId();
            bzVar.m = true;
            bzVar.r.setAllowStartAnimation(true);
            int f10 = cz.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                bzVar.r.setUniqKeyPrefix(intValue + "_" + bzVar.p + "_");
            }
            bzVar.q = document;
            bzVar.r.setImage(ImageLocation.getForDocument(videoSize, document), e2.c.h(f10, "_", f10), null, "tgs", ukVar.c, 1);
            bzVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            bzVar.r.setAutoRepeat(0);
            if (bzVar.r.getLottieAnimation() != null) {
                if (bzVar.h) {
                    bzVar.r.getLottieAnimation().L(0, false, true);
                }
                bzVar.r.getLottieAnimation().start();
            }
            arrayList.add(bzVar);
            if (ukVar.n) {
                bzVar.r.onAttachedToWindow();
                bzVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.t0
    public final void m0(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        xn xnVar = this.a.N;
        t12.K2(null, xnVar, xnVar.ba);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            oh.i9 orCreateStoryViewer = xnVar.getOrCreateStoryViewer();
            qj qjVar = xnVar.u0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (xnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(xnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, oh.c7.a(qjVar));
                return;
            }
            return;
        }
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.y1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                xnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.E0;
            if (messageObject3 == null || !v0Var.K(messageObject3) || v0Var.m1 == null) {
                xnVar.xb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    vi1 vi1Var = new vi1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = vi1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        vi1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = vi1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                sc1 sc1Var = new sc1(wallPaper, xnVar, q10);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z4 = wallPaperSettings2.blur;
                    boolean z10 = wallPaperSettings2.motion;
                    sc1Var.C1 = z4;
                    sc1Var.B1 = z10;
                    sc1Var.k1 = wallPaperSettings2.intensity / 100.0f;
                }
                sc1Var.n0 = messageObject;
                sc1Var.c1(messageObject.getDialogId());
                sc1Var.a.a = xnVar.ba;
                sc1Var.m1 = new tc1(xnVar, q10);
                xnVar.presentFragment(sc1Var);
                return;
            }
            return;
        }
        ArrayList<TLRPC.VideoSize> arrayList = messageObject.messageOwner.action.photo.video_sizes;
        if (arrayList == null || arrayList.isEmpty()) {
            videoSize = null;
            videoSize2 = null;
        } else {
            videoSize = FileLoader.getClosestVideoSizeWithSize(messageObject.messageOwner.action.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            videoSize2 = FileLoader.getEmojiMarkup(messageObject.messageOwner.action.photo.video_sizes);
        }
        if (v0Var.getMessageObject().type != 21 || messageObject.isOutOwner()) {
            if (videoSize != null) {
                PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), xnVar.Ca);
                if (v0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, xnVar.Ca);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), xnVar.Ca);
            if (v0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
                return;
            }
            return;
        }
        if (messageObject.settingAvatar) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
            y40Var.a = xnVar;
            y40Var.f();
            y40Var.c.g0.r0(null, videoSize2, 0L);
            y40Var.b = new d9.c(xnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], xnVar.getUserConfig().getClientUserId(), 3);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = xnVar.getFileLoader();
        File pathToAttach = videoSize == null ? fileLoader.getPathToAttach(messageObject.messageOwner.action.photo) : fileLoader.getPathToAttach(videoSize);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        if (!pathToAttach.exists()) {
            if (!file.exists()) {
                return;
            } else {
                pathToAttach = file;
            }
        }
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, pathToAttach.getAbsolutePath(), 0, false, 0, 0, 0L);
        photoEntry.caption = xnVar.V.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new am(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(1, xnVar.getUserConfig().getCurrentUser());
        w40Var.e = videoSize != null;
        w40Var.b = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.Q5));
        PhotoViewer.t1().x2(w40Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void r2(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        xn xnVar = this.a.N;
        hg.e1.T(xnVar, str, xnVar.xb);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void t0(org.telegram.ui.Cells.v0 v0Var) {
        xn xnVar = this.a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            xnVar.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
