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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gm implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ pm a;

    public gm(pm pmVar) {
        this.a = pmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void H1(org.telegram.ui.Cells.w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        eo eoVar = this.a.Q;
        if (str != null) {
            b(w0Var);
            nf.e eVar = eoVar.Ab;
            sg.h0 h0Var = sg.h0.S0;
            sg.c0.T(LaunchActivity.R(), str, eVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        qg.m1 m1Var = new qg.m1(eoVar, i10, eoVar.i(), new qg.k(tL_premiumGiftOption), null, eoVar.ea);
        m1Var.J0 = false;
        m1Var.c0 = w0Var.getMessageObject().isOut();
        eoVar.showDialog(m1Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.p2 O0() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void V(org.telegram.ui.Cells.w0 w0Var, int i10) {
        bi.g3 g3Var = new bi.g3(this, w0Var, i10, 27);
        eo eoVar = this.a.Q;
        if (!eoVar.A0.N) {
            g3Var.run();
        } else {
            eoVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(g3Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void a0(org.telegram.ui.Cells.w0 w0Var) {
        zj zjVar;
        eo eoVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        wj wjVar = eoVar.x0;
        if (wjVar != null && (zjVar = eoVar.z0) != null && zjVar.y < 0) {
            int childCount = wjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = eoVar.x0.getChildAt(childCount);
                eoVar.x0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            eoVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        eoVar.L8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        eoVar.rc(messageObject, false);
    }

    public final void b(org.telegram.ui.Cells.w0 w0Var) {
        eo eoVar = this.a.Q;
        nf.e eVar = eoVar.Ab;
        if (eVar != null) {
            eVar.a(true);
        }
        eoVar.Ab = w0Var.getMessageObject() == null ? null : new in(this, w0Var, 6);
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
    public final void f1(org.telegram.ui.Cells.w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        zk zkVar = this.a.Q.xa;
        FrameLayout frameLayout = zkVar.G;
        HashMap hashMap = zkVar.f;
        Random random = zkVar.h;
        ArrayList arrayList = zkVar.F;
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
                if (((hz) arrayList.get(i11)).p == w0Var.getMessageObject().getId()) {
                    i12++;
                    if (((hz) arrayList.get(i11)).r.getLottieAnimation() == null || ((hz) arrayList.get(i11)).r.getLottieAnimation().y()) {
                        return;
                    }
                }
                if (((hz) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((hz) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            hz hzVar = new hz();
            hzVar.h = true;
            if (!hzVar.i) {
                hzVar.f = ((random.nextInt() % 101) / 100.0f) * (imageWidth / 4.0f);
                hzVar.g = ((random.nextInt() % 101) / 100.0f) * (imageHeight / 4.0f);
            }
            hzVar.p = w0Var.getMessageObject().getId();
            hzVar.m = true;
            hzVar.r.setAllowStartAnimation(true);
            int f7 = iz.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                hzVar.r.setUniqKeyPrefix(intValue + "_" + hzVar.p + "_");
            }
            hzVar.q = document;
            hzVar.r.setImage(ImageLocation.getForDocument(videoSize, document), a4.a.k(f7, f7, "_"), null, "tgs", zkVar.c, 1);
            hzVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            hzVar.r.setAutoRepeat(0);
            if (hzVar.r.getLottieAnimation() != null) {
                if (hzVar.h) {
                    hzVar.r.getLottieAnimation().N(0, false, true);
                }
                hzVar.r.getLottieAnimation().start();
            }
            arrayList.add(hzVar);
            if (zkVar.n) {
                hzVar.r.onAttachedToWindow();
                hzVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void f2(org.telegram.ui.Cells.w0 w0Var, String str) {
        b(w0Var);
        eo eoVar = this.a.Q;
        sg.c0.T(eoVar, str, eoVar.Ab);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void g0(org.telegram.ui.Cells.w0 w0Var, int i10, int i11) {
        i2.z zVar = new i2.z(this, w0Var, i10, i11, 3);
        eo eoVar = this.a.Q;
        if (!eoVar.A0.N) {
            zVar.run();
        } else {
            eoVar.lb(false, true, true);
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
        eo eoVar = this.a.Q;
        t12.K2(null, eoVar, eoVar.ea);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (w0Var.getMessageObject().type == 24) {
            zh.u7 orCreateStoryViewer = eoVar.getOrCreateStoryViewer();
            wj wjVar = eoVar.x0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = w0Var.getMessageObject();
            if (eoVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(eoVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, zh.s5.a(wjVar));
                return;
            }
            return;
        }
        if (w0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = w0Var.B1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                eoVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = w0Var.H0;
            if (messageObject3 == null || !w0Var.L(messageObject3) || w0Var.p1 == null) {
                eoVar.xb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    kj1 kj1Var = new kj1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = kj1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        kj1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = kj1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                jd1 jd1Var = new jd1(wallPaper, eoVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    jd1Var.F1 = z10;
                    jd1Var.E1 = z11;
                    jd1Var.n1 = wallPaperSettings2.intensity / 100.0f;
                }
                jd1Var.q0 = messageObject;
                jd1Var.c1(messageObject.getDialogId());
                jd1Var.a.a = eoVar.ea;
                jd1Var.p1 = new kd1(eoVar, q6);
                eoVar.presentFragment(jd1Var);
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
                PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), eoVar.Fa);
                if (w0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, eoVar.Fa);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), eoVar.Fa);
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
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
            e50Var.a = eoVar;
            e50Var.f();
            e50Var.c.j0.r0(null, videoSize2, 0L);
            e50Var.b = new bi.a8(eoVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], eoVar.getUserConfig().getClientUserId(), 7);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo);
        FileLoader fileLoader = eoVar.getFileLoader();
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
        photoEntry.caption = eoVar.Y.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new fm(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(1, eoVar.getUserConfig().getCurrentUser());
        c50Var.e = videoSize != null;
        c50Var.b = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.T5));
        PhotoViewer.t1().x2(c50Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean p2(org.telegram.ui.Cells.w0 w0Var, float f7, float f10) {
        boolean z10;
        eo eoVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return eoVar.I7(w0Var, false, false, f7, f10, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void r0(org.telegram.ui.Cells.w0 w0Var) {
        eo eoVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !w0Var.getMessageObject().isOutOwner() && w0Var.getMessageObject().isWallpaperForBoth() && w0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eoVar.getParentActivity(), 0, eoVar.getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            eoVar.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void s2(org.telegram.ui.Cells.w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.W7(w0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void w1(long j3) {
        eo eoVar = this.a.Q;
        int i10 = eo.Hc;
        eoVar.na(j3);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void x1(org.telegram.ui.Cells.w0 w0Var) {
        eo eoVar = this.a.Q;
        MessageObject messageObject = w0Var.getMessageObject();
        if (messageObject == null || eoVar.R1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(eoVar.e)) {
            eoVar.R1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            eoVar.R1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
