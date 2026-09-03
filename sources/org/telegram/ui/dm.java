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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dm implements org.telegram.ui.Cells.t0 {
    public final /* synthetic */ lm a;

    public dm(lm lmVar) {
        this.a = lmVar;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void C1(long j10) {
        zn znVar = this.a.N;
        int i10 = zn.Ec;
        znVar.na(j10);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void D1(org.telegram.ui.Cells.v0 v0Var) {
        zn znVar = this.a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null || znVar.O1 == null) {
            return;
        }
        if (ChatObject.isMonoForum(znVar.e)) {
            znVar.O1.m(messageObject.getMonoForumTopicId(), true);
        } else {
            znVar.O1.m(messageObject.getTopicId(), true);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void N1(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        zn znVar = this.a.N;
        if (str != null) {
            b(v0Var);
            ze.c cVar = znVar.xb;
            gg.i1 i1Var = gg.i1.P0;
            gg.e1.T(LaunchActivity.R(), str, cVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        eg.e2 e2Var = new eg.e2(znVar, i10, znVar.i(), new eg.n(tL_premiumGiftOption), null, znVar.ba);
        e2Var.G0 = false;
        e2Var.Z = v0Var.getMessageObject().isOut();
        znVar.showDialog(e2Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final org.telegram.ui.ActionBar.p2 T0() {
        return this.a.N;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void V(org.telegram.ui.Cells.v0 v0Var, int i10) {
        ah.a aVar = new ah.a(this, v0Var, i10, 27);
        zn znVar = this.a.N;
        if (!znVar.x0.K) {
            aVar.run();
        } else {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(aVar, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ long a() {
        return 0L;
    }

    public final void b(org.telegram.ui.Cells.v0 v0Var) {
        zn znVar = this.a.N;
        ze.c cVar = znVar.xb;
        if (cVar != null) {
            cVar.a(true);
        }
        znVar.xb = v0Var.getMessageObject() == null ? null : new en(this, v0Var, 6);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void b0(org.telegram.ui.Cells.v0 v0Var) {
        vj vjVar;
        zn znVar = this.a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.forceUpdate = true;
        sj sjVar = znVar.u0;
        if (sjVar != null && (vjVar = znVar.w0) != null && vjVar.y < 0) {
            int childCount = sjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = znVar.u0.getChildAt(childCount);
                znVar.u0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            znVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
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
    public final long d() {
        return this.a.N.d();
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.t0
    public final void j0(org.telegram.ui.Cells.v0 v0Var, int i10, int i11) {
        j3.b0 b0Var = new j3.b0(this, v0Var, i10, i11, 3);
        zn znVar = this.a.N;
        if (!znVar.x0.K) {
            b0Var.run();
        } else {
            znVar.lb(false, true, true);
            AndroidUtilities.runOnUIThread(b0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void l1(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        wk wkVar = this.a.N.ua;
        FrameLayout frameLayout = wkVar.D;
        HashMap hashMap = wkVar.f;
        Random random = wkVar.h;
        ArrayList arrayList = wkVar.C;
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
                if (((cz) arrayList.get(i11)).p == v0Var.getMessageObject().getId()) {
                    i12++;
                    if (((cz) arrayList.get(i11)).r.getLottieAnimation() == null || ((cz) arrayList.get(i11)).r.getLottieAnimation().w()) {
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
            czVar.p = v0Var.getMessageObject().getId();
            czVar.m = true;
            czVar.r.setAllowStartAnimation(true);
            int f10 = dz.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                czVar.r.setUniqKeyPrefix(intValue + "_" + czVar.p + "_");
            }
            czVar.q = document;
            czVar.r.setImage(ImageLocation.getForDocument(videoSize, document), e2.c.h(f10, "_", f10), null, "tgs", wkVar.c, 1);
            czVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            czVar.r.setAutoRepeat(0);
            if (czVar.r.getLottieAnimation() != null) {
                if (czVar.h) {
                    czVar.r.getLottieAnimation().L(0, false, true);
                }
                czVar.r.getLottieAnimation().start();
            }
            arrayList.add(czVar);
            if (wkVar.n) {
                czVar.r.onAttachedToWindow();
                czVar.r.setParentView(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final void m2(org.telegram.ui.Cells.v0 v0Var, String str) {
        b(v0Var);
        zn znVar = this.a.N;
        gg.e1.T(znVar, str, znVar.xb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.t0
    public final void o0(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        MessageObject messageObject = v0Var.getMessageObject();
        PhotoViewer t12 = PhotoViewer.t1();
        zn znVar = this.a.N;
        t12.K2(null, znVar, znVar.ba);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
        if (v0Var.getMessageObject().type == 24) {
            nh.i9 orCreateStoryViewer = znVar.getOrCreateStoryViewer();
            sj sjVar = znVar.u0;
            orCreateStoryViewer.getClass();
            MessageObject messageObject2 = v0Var.getMessageObject();
            if (znVar.getParentActivity() != null && messageObject2.type == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.messageOwner.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = DialogObject.getPeerDialogId(messageMedia.peer);
                storyItem.messageId = messageObject2.getId();
                orCreateStoryViewer.G(znVar.getParentActivity(), messageObject2.messageOwner.media.storyItem, nh.c7.a(sjVar));
                return;
            }
            return;
        }
        if (v0Var.getMessageObject().type == 22) {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i10);
            RadialProgress2 radialProgress2 = v0Var.y1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.getId() < 0 && (str = messagesController.uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                messagesController.cancelUploadWallpaper();
                znVar.Ga(messageObject);
                return;
            }
            MessageObject messageObject3 = v0Var.E0;
            if (messageObject3 == null || !v0Var.K(messageObject3) || v0Var.m1 == null) {
                znVar.xb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    ui1 ui1Var = new ui1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = ui1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        ui1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = ui1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
                sc1 sc1Var = new sc1(wallPaper, znVar, q10);
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
                sc1Var.a.a = znVar.ba;
                sc1Var.m1 = new tc1(znVar, q10);
                znVar.presentFragment(sc1Var);
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
                PhotoViewer.t1().d2(videoSize.location, ImageLocation.getForPhoto(videoSize, messageObject.messageOwner.action.photo), znVar.Ca);
                if (v0Var.getMessageObject().type == 21) {
                    PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
                    return;
                }
                return;
            }
            if (closestPhotoSizeWithSize == null) {
                PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, znVar.Ca);
                return;
            }
            PhotoViewer.t1().d2(closestPhotoSizeWithSize.location, ImageLocation.getForPhoto(closestPhotoSizeWithSize, messageObject.messageOwner.action.photo), znVar.Ca);
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
            org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(0, true, true);
            x40Var.a = znVar;
            x40Var.f();
            x40Var.c.g0.r0(null, videoSize2, 0L);
            x40Var.b = new d9.c(znVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], znVar.getUserConfig().getClientUserId(), 3);
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
        photoEntry.caption = znVar.V.getFieldText();
        photoEntry.isVideo = videoSize != null;
        arrayList2.add(photoEntry);
        PhotoViewer.t1().f2(arrayList2, 0, 1, false, new cm(this, messageObject, photoEntry), null);
        if (photoEntry.isVideo) {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedVideo));
        } else {
            PhotoViewer.t1().O2(LocaleController.getString(R.string.SuggestedPhoto));
        }
        org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(1, znVar.getUserConfig().getCurrentUser());
        v40Var.e = videoSize != null;
        v40Var.b = znVar.getMessagesController().getUser(Long.valueOf(znVar.Q5));
        PhotoViewer.t1().x2(v40Var);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void w0(org.telegram.ui.Cells.v0 v0Var) {
        zn znVar = this.a.N;
        MessageObject messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.type == 22 && !v0Var.getMessageObject().isOutOwner() && v0Var.getMessageObject().isWallpaperForBoth() && v0Var.getMessageObject().isCurrentWallpaper()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.getResourceProvider());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.RemoveWallpaperTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.RemoveWallpaperMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new c1(this, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            znVar.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
            }
        }
    }

    @Override // org.telegram.ui.Cells.t0
    public final boolean w2(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z4;
        zn znVar = this.a.N;
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inPreviewMode;
        if (z4) {
            return false;
        }
        return znVar.I7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override // org.telegram.ui.Cells.t0
    public final void y2(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        this.a.N.W7(v0Var, reactionCount, z4, f10, f11);
    }

    @Override // org.telegram.ui.Cells.t0
    public final /* synthetic */ void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
