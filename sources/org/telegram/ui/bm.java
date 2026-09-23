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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bm implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ km a;

    public bm(km kmVar) {
        this.a = kmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        xn xnVar = this.a.Q;
        if (str != null) {
            b(w0Var);
            nf.e eVar = xnVar.zb;
            tg.h0 h0Var = tg.h0.S0;
            tg.d0.T(LaunchActivity.R(), str, eVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
        rg.k1 k1Var = new rg.k1(xnVar, i10, xnVar.i(), new rg.k(tL_premiumGiftOption), null, xnVar.ea);
        k1Var.J0 = false;
        k1Var.c0 = w0Var.getMessageObject().isOut();
        xnVar.showDialog(k1Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 O0() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void U(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        xn xnVar = this.a.Q;
        if (!xnVar.A0.N) {
            s1Var.run();
        } else {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Z(org.telegram.ui.Cells.w0 w0Var) {
        uj ujVar;
        xn xnVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        rj rjVar = xnVar.x0;
        if (rjVar != null && (ujVar = xnVar.z0) != null && ujVar.y < 0) {
            int childCount = rjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = xnVar.x0.getChildAt(childCount);
                xnVar.x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            xnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        xnVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        xnVar.rc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        xn xnVar = this.a.Q;
        nf.e eVar = xnVar.zb;
        if (eVar != null) {
            eVar.a(true);
        }
        xnVar.zb = w0Var.getMessageObject() == null ? null : new cn(this, w0Var, 6);
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
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        xn xnVar = this.a.Q;
        if (!xnVar.A0.N) {
            a0Var.run();
        } else {
            xnVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        uk ukVar = this.a.Q.xa;
        FrameLayout frameLayout = ukVar.G;
        HashMap hashMap = ukVar.f;
        Random random = ukVar.h;
        ArrayList arrayList = ukVar.F;
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
                if (((cz) arrayList.get(i11)).p == w0Var.getMessageObject().getId()) {
                    i12++;
                    if (((cz) arrayList.get(i11)).r.getLottieAnimation() == null || ((cz) arrayList.get(i11)).r.getLottieAnimation().y()) {
                        return;
                    }
                }
                if (((cz) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((cz) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            cz czVar = new cz();
            czVar.h = true;
            if (!czVar.i) {
                czVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                czVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            czVar.p = w0Var.getMessageObject().getId();
            czVar.m = true;
            czVar.r.setAllowStartAnimation(true);
            int f7 = dz.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                czVar.r.setUniqKeyPrefix(intValue + "_" + czVar.p + "_");
            }
            czVar.q = document;
            czVar.r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.l(f7, f7, "_"), null, "tgs", ukVar.c, 1);
            czVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            czVar.r.setAutoRepeat(0);
            if (czVar.r.getLottieAnimation() != null) {
                if (czVar.h) {
                    czVar.r.getLottieAnimation().N(0, false, true);
                }
                czVar.r.getLottieAnimation().start();
            }
            arrayList.add(czVar);
            if (ukVar.n) {
                czVar.r.onAttachedToWindow();
                czVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        xn xnVar = this.a.Q;
        tg.d0.T(xnVar, str, xnVar.zb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.t0
    public final void k0(org.telegram.ui.Cells.w0 w0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = w0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        xn xnVar = this.a.Q;
        t12.J2(null, xnVar, xnVar.ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = xnVar.getOrCreateStoryViewer();
            rj rjVar = xnVar.x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (xnVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(xnVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(rjVar));
                return;
            }
            return;
        }
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                xnVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 == null || !w0Var.L(messageObject3) || w0Var.p1 == null) {
                xnVar.xb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    yi1 yi1Var = new yi1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = yi1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        yi1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = yi1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                xc1 xc1Var = new xc1(wallPaper, xnVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    xc1Var.F1 = z10;
                    xc1Var.E1 = z11;
                    xc1Var.n1 = wallPaperSettings2.intensity / 100.0f;
                }
                xc1Var.q0 = messageObject;
                xc1Var.c1(messageObject.getDialogId());
                xc1Var.a.a = xnVar.ea;
                xc1Var.p1 = new yc1(xnVar, q6);
                xnVar.presentFragment(xc1Var);
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
                PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), xnVar.Fa);
                if (w0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, xnVar.Fa);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), xnVar.Fa);
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
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(0, true, true);
            v40Var.a = xnVar;
            v40Var.f();
            v40Var.c.j0.r0(null, videoSize2, 0L);
            v40Var.b = new ci.y6(xnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], xnVar.getUserConfig().getClientUserId(), 7);
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
        photoEntry.caption = xnVar.Y.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new am(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().N2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(1, xnVar.getUserConfig().getCurrentUser());
        t40Var.e = videoSize != null;
        t40Var.b = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.T5));
        PhotoViewer.t1().w2(t40Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        xn xnVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            xnVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        xn xnVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return xnVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void x1(long j3) {
        xn xnVar = this.a.Q;
        int i10 = xn.Gc;
        xnVar.na(j3);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        xn xnVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || xnVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(xnVar.e)) {
            xnVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            xnVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
