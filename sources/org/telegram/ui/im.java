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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class im implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ rm a;

    public im(rm rmVar) {
        this.a = rmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void D1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        fo foVar = this.a.Q;
        if (str != null) {
            b(w0Var);
            pf.c cVar = foVar.Ab;
            ug.g0 g0Var = ug.g0.S0;
            ug.c0.U(LaunchActivity.R(), str, cVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        sg.m1 m1Var = new sg.m1(foVar, i10, foVar.i(), new sg.k(tL_premiumGiftOption), null, foVar.ea);
        m1Var.J0 = false;
        m1Var.c0 = w0Var.getMessageObject().isOut();
        foVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.m2 M0() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void W(org.telegram.ui.Cells.w0 w0Var, int i10) {
        gm gmVar = new gm(this, w0Var, i10, 0);
        fo foVar = this.a.Q;
        if (!foVar.A0.N) {
            gmVar.run();
        } else {
            foVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(gmVar, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void a2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        fo foVar = this.a.Q;
        ug.c0.U(foVar, str, foVar.Ab);
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        fo foVar = this.a.Q;
        pf.c cVar = foVar.Ab;
        if (cVar != null) {
            cVar.a(true);
        }
        foVar.Ab = w0Var.getMessageObject() == null ? null : new jn(this, w0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void b0(org.telegram.ui.Cells.w0 w0Var) {
        dk dkVar;
        fo foVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        ak akVar = foVar.x0;
        if (akVar != null && (dkVar = foVar.z0) != null && dkVar.y < 0) {
            int childCount = akVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = foVar.x0.getChildAt(childCount);
                foVar.x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            foVar.Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        foVar.Q8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        foVar.vc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final long d() {
        return this.a.Q.d();
    }

    @Override // org.telegram.ui.Cells.t0
    public final void d1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        cl clVar = this.a.Q.xa;
        FrameLayout frameLayout = clVar.G;
        HashMap hashMap = clVar.f;
        Random random = clVar.h;
        ArrayList arrayList = clVar.F;
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
                if (((jz) arrayList.get(i11)).p == w0Var.getMessageObject().getId()) {
                    i12++;
                    if (((jz) arrayList.get(i11)).r.getLottieAnimation() == null || ((jz) arrayList.get(i11)).r.getLottieAnimation().y()) {
                        return;
                    }
                }
                if (((jz) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((jz) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            jz jzVar = new jz();
            jzVar.h = true;
            if (!jzVar.i) {
                jzVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                jzVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            jzVar.p = w0Var.getMessageObject().getId();
            jzVar.m = true;
            jzVar.r.setAllowStartAnimation(true);
            int f7 = kz.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                jzVar.r.setUniqKeyPrefix(intValue + "_" + jzVar.p + "_");
            }
            jzVar.q = document;
            jzVar.r.setImage(ImageLocation.getForDocument(videoSize, document), a1.g.k(f7, f7, "_"), null, "tgs", clVar.c, 1);
            jzVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            jzVar.r.setAutoRepeat(0);
            if (jzVar.r.getLottieAnimation() != null) {
                if (jzVar.h) {
                    jzVar.r.getLottieAnimation().N(0, false, true);
                }
                jzVar.r.getLottieAnimation().start();
            }
            arrayList.add(jzVar);
            if (clVar.n) {
                jzVar.r.onAttachedToWindow();
                jzVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean e() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        fo foVar = this.a.Q;
        if (!foVar.A0.N) {
            zVar.run();
        } else {
            foVar.pb(false, true, true);
            AndroidUtilities.runOnUIThread(zVar, 80L);
        }
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
        fo foVar = this.a.Q;
        t12.K2(null, foVar, foVar.ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            bi.sb orCreateStoryViewer = foVar.getOrCreateStoryViewer();
            ak akVar = foVar.x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (foVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.F(foVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, bi.g9.a(akVar));
                return;
            }
            return;
        }
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.J1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                foVar.Ka(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.P0;
            if (messageObject3 == null || !w0Var.O(messageObject3) || w0Var.x1 == null) {
                foVar.Bb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    oj1 oj1Var = new oj1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = oj1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        oj1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = oj1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                ld1 ld1Var = new ld1(wallPaper, foVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    ld1Var.F1 = z10;
                    ld1Var.E1 = z11;
                    ld1Var.n1 = wallPaperSettings2.intensity / 100.0f;
                }
                ld1Var.q0 = messageObject;
                ld1Var.c1(messageObject.getDialogId());
                ld1Var.a.a = foVar.ea;
                ld1Var.p1 = new md1(foVar, q6);
                foVar.presentFragment(ld1Var);
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
                PhotoViewer.t1().e2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), foVar.Ga);
                if (w0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().d2(messageObject, null, 0L, 0L, 0L, foVar.Ga);
                return;
            }
            PhotoViewer.t1().e2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), foVar.Ga);
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
            org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(0, true, true);
            i50Var.a = foVar;
            i50Var.e();
            i50Var.c.j0.r0(null, videoSize2, 0L);
            i50Var.b = new di.w6(foVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], foVar.getUserConfig().getClientUserId(), 7);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = foVar.getFileLoader();
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
        photoEntry.caption = foVar.Y.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().g2(arrayList2, 0, 1, false, new hm(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(1, foVar.getUserConfig().getCurrentUser());
        g50Var.e = videoSize != null;
        g50Var.b = foVar.getMessagesController().getUser(Long.valueOf(foVar.T5));
        PhotoViewer.t1().x2(g50Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean k2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        fo foVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return foVar.L7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void o2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.Z7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        fo foVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar.getParentActivity(), 0, foVar.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new b1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            foVar.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void t1(long j10) {
        fo foVar = this.a.Q;
        int i10 = fo.Hc;
        foVar.sa(j10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void u1(org.telegram.ui.Cells.w0 w0Var) {
        fo foVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || foVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(foVar.e)) {
            foVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            foVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void O0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
