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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class cm implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ lm a;

    public cm(lm lmVar) {
        this.a = lmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        zn znVar = this.a.Q;
        if (str != null) {
            b(w0Var);
            nf.e eVar = znVar.zb;
            tg.g0 g0Var = tg.g0.S0;
            tg.c0.T(LaunchActivity.R(), str, eVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        rg.k1 k1Var = new rg.k1(znVar, i10, znVar.i(), new rg.k(tL_premiumGiftOption), null, znVar.ea);
        k1Var.J0 = false;
        k1Var.c0 = w0Var.getMessageObject().isOut();
        znVar.showDialog(k1Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 P0() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        zn znVar = this.a.Q;
        if (!znVar.A0.N) {
            s1Var.run();
        } else {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        wj wjVar;
        zn znVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        tj tjVar = znVar.x0;
        if (tjVar != null && (wjVar = znVar.z0) != null && wjVar.y < 0) {
            int childCount = tjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = znVar.x0.getChildAt(childCount);
                znVar.x0.getClass();
                if (RecyclerView.S(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            znVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        znVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        znVar.rc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.a.Q;
        nf.e eVar = znVar.zb;
        if (eVar != null) {
            eVar.a(true);
        }
        znVar.zb = w0Var.getMessageObject() == null ? null : new en(this, w0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final long d() {
        return this.a.Q.d();
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void h0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        zn znVar = this.a.Q;
        if (!znVar.A0.N) {
            zVar.run();
        } else {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void h1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        wk wkVar = this.a.Q.xa;
        FrameLayout frameLayout = wkVar.G;
        HashMap hashMap = wkVar.f;
        Random random = wkVar.h;
        ArrayList arrayList = wkVar.F;
        if (arrayList.size() <= 12 && w0Var.getPhotoImage().hasNotThumb()) {
            float imageHeight = w0Var.getPhotoImage().getImageHeight();
            float imageWidth = w0Var.getPhotoImage().getImageWidth();
            if (imageHeight <= 0.0f || imageWidth <= 0.0f) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < arrayList.size()) {
                if (((fz) arrayList.get(i11)).p == w0Var.getMessageObject().getId()) {
                    i12++;
                    if (((fz) arrayList.get(i11)).r.getLottieAnimation() == null || ((fz) arrayList.get(i11)).r.getLottieAnimation().y()) {
                        return;
                    }
                }
                if (((fz) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((fz) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            fz fzVar = new fz();
            fzVar.h = true;
            if (!fzVar.i) {
                fzVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                fzVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            fzVar.p = w0Var.getMessageObject().getId();
            fzVar.m = true;
            fzVar.r.setAllowStartAnimation(true);
            int f7 = gz.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                fzVar.r.setUniqKeyPrefix(intValue + "_" + fzVar.p + "_");
            }
            fzVar.q = document;
            fzVar.r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", wkVar.c, 1);
            fzVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            fzVar.r.setAutoRepeat(0);
            if (fzVar.r.getLottieAnimation() != null) {
                if (fzVar.h) {
                    fzVar.r.getLottieAnimation().N(0, false, true);
                }
                fzVar.r.getLottieAnimation().start();
            }
            arrayList.add(fzVar);
            if (wkVar.n) {
                fzVar.r.onAttachedToWindow();
                fzVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        zn znVar = this.a.Q;
        tg.c0.T(znVar, str, znVar.zb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.t0
    public final void l0(org.telegram.ui.Cells.w0 w0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = w0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        zn znVar = this.a.Q;
        t12.J2(null, znVar, znVar.ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = znVar.getOrCreateStoryViewer();
            tj tjVar = znVar.x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (znVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(znVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(tjVar));
                return;
            }
            return;
        }
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                znVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 == null || !w0Var.L(messageObject3) || w0Var.p1 == null) {
                znVar.xb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    fj1 fj1Var = new fj1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = fj1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        fj1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = fj1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                gd1 gd1Var = new gd1(wallPaper, znVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    gd1Var.F1 = z10;
                    gd1Var.E1 = z11;
                    gd1Var.n1 = wallPaperSettings2.intensity / 100.0f;
                }
                gd1Var.q0 = messageObject;
                gd1Var.c1(messageObject.getDialogId());
                gd1Var.a.a = znVar.ea;
                gd1Var.p1 = new hd1(znVar, q6);
                znVar.presentFragment(gd1Var);
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
        if (w0Var.getMessageObject().type != 21 || messageObject.isOutOwner()) {
            if (videoSize != null) {
                PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), znVar.Fa);
                if (w0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, znVar.Fa);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), znVar.Fa);
            if (w0Var.getMessageObject().type == 21) {
                PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
                return;
            }
            return;
        }
        if (messageObject.settingAvatar) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
            u40Var.a = znVar;
            u40Var.f();
            u40Var.c.j0.r0(null, videoSize2, 0L);
            u40Var.b = new ci.z6(znVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], znVar.getUserConfig().getClientUserId(), 7);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = znVar.getFileLoader();
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
        photoEntry.caption = znVar.Y.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new bm(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(1, znVar.getUserConfig().getCurrentUser());
        s40Var.e = videoSize != null;
        s40Var.b = znVar.getMessagesController().getUser(Long.valueOf(znVar.T5));
        PhotoViewer.t1().w2(s40Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        zn znVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return znVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void s0(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new y0(this, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            znVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void y1(long j3) {
        zn znVar = this.a.Q;
        int i10 = zn.Gc;
        znVar.na(j3);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void z1(org.telegram.ui.Cells.w0 w0Var) {
        zn znVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || znVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(znVar.e)) {
            znVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            znVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void R0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
