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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class am implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ jm a;

    public am(jm jmVar) {
        this.a = jmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void J1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        yn ynVar = this.a.Q;
        if (str != null) {
            b(w0Var);
            nf.e eVar = ynVar.xb;
            tg.g0 g0Var = tg.g0.S0;
            tg.c0.R(LaunchActivity.R(), str, eVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        rg.m1 m1Var = new rg.m1(ynVar, i10, ynVar.i(), new rg.k(tL_premiumGiftOption), null, ynVar.ca);
        m1Var.J0 = false;
        m1Var.c0 = w0Var.getMessageObject().isOut();
        ynVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void L(org.telegram.ui.Cells.w0 w0Var, int i10) {
        ai.s1 s1Var = new ai.s1(this, w0Var, i10, 29);
        yn ynVar = this.a.Q;
        if (!ynVar.y0.N) {
            s1Var.run();
        } else {
            ynVar.kb(false, true, true);
            AndroidUtilities.runOnUIThread(s1Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.n2 O0() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void Y(org.telegram.ui.Cells.w0 w0Var) {
        vj vjVar;
        yn ynVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        sj sjVar = ynVar.v0;
        if (sjVar != null && (vjVar = ynVar.x0) != null && vjVar.y < 0) {
            int childCount = sjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = ynVar.v0.getChildAt(childCount);
                ynVar.v0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            ynVar.M8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        ynVar.M8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        ynVar.qc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        yn ynVar = this.a.Q;
        nf.e eVar = ynVar.xb;
        if (eVar != null) {
            eVar.a(true);
        }
        ynVar.xb = w0Var.getMessageObject() == null ? null : new cn(this, w0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final long d() {
        return this.a.Q.d();
    }

    @Override // org.telegram.ui.Cells.t0
    public final void d0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, w0Var, i10, i11, 3);
        yn ynVar = this.a.Q;
        if (!ynVar.y0.N) {
            a0Var.run();
        } else {
            ynVar.kb(false, true, true);
            AndroidUtilities.runOnUIThread(a0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void g1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        uk ukVar = this.a.Q.va;
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
            fzVar.r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.l(f7, f7, "_"), null, "tgs", ukVar.c, 1);
            fzVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            fzVar.r.setAutoRepeat(0);
            if (fzVar.r.getLottieAnimation() != null) {
                if (fzVar.h) {
                    fzVar.r.getLottieAnimation().N(0, false, true);
                }
                fzVar.r.getLottieAnimation().start();
            }
            arrayList.add(fzVar);
            if (ukVar.n) {
                fzVar.r.onAttachedToWindow();
                fzVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void h2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        yn ynVar = this.a.Q;
        tg.c0.R(ynVar, str, ynVar.xb);
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
        yn ynVar = this.a.Q;
        t12.K2(null, ynVar, ynVar.ca);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            ai.jc orCreateStoryViewer = ynVar.getOrCreateStoryViewer();
            sj sjVar = ynVar.v0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (ynVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(ynVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, ai.u9.a(sjVar));
                return;
            }
            return;
        }
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                ynVar.Fa(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 == null || !w0Var.J(messageObject3) || w0Var.p1 == null) {
                ynVar.wb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    wi1 wi1Var = new wi1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = wi1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        wi1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = wi1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                yc1 yc1Var = new yc1(wallPaper, ynVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    yc1Var.F1 = z10;
                    yc1Var.E1 = z11;
                    yc1Var.n1 = wallPaperSettings2.intensity / 100.0f;
                }
                yc1Var.q0 = messageObject;
                yc1Var.c1(messageObject.getDialogId());
                yc1Var.a.a = ynVar.ca;
                yc1Var.p1 = new zc1(ynVar, q6);
                ynVar.presentFragment(yc1Var);
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
                PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), ynVar.Da);
                if (w0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, ynVar.Da);
                return;
            }
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), ynVar.Da);
            if (w0Var.getMessageObject().type == 21) {
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
            y40Var.a = ynVar;
            y40Var.f();
            y40Var.c.j0.r0(null, videoSize2, 0L);
            y40Var.b = new ci.y6(ynVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], ynVar.getUserConfig().getClientUserId(), 7);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = ynVar.getFileLoader();
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
        photoEntry.caption = ynVar.W.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().g2(arrayList2, 0, 1, false, new zl(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(1, ynVar.getUserConfig().getCurrentUser());
        w40Var.e = videoSize != null;
        w40Var.b = ynVar.getMessagesController().getUser(Long.valueOf(ynVar.R5));
        PhotoViewer.t1().x2(w40Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        yn ynVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new z0(this, 23));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            ynVar.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean r2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        yn ynVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return ynVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void u2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void x1(long j3) {
        yn ynVar = this.a.Q;
        int i10 = yn.Bc;
        ynVar.ma(j3);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void y1(org.telegram.ui.Cells.w0 w0Var) {
        yn ynVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || ynVar.P1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(ynVar.e)) {
            ynVar.P1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            ynVar.P1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
