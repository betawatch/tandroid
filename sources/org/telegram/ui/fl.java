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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fl implements org.telegram.ui.Cells.s0 {
    public final /* synthetic */ kl a;

    public fl(kl klVar) {
        this.a = klVar;
    }

    @Override // org.telegram.ui.Cells.s0
    public final org.telegram.ui.ActionBar.g2 B() {
        return this.a.R;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void K(org.telegram.ui.Cells.v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i7;
        ak akVar = this.a.R.Ua;
        FrameLayout frameLayout = akVar.H;
        HashMap hashMap = akVar.f;
        Random random = akVar.h;
        ArrayList arrayList = akVar.G;
        if (arrayList.size() <= 12 && v0Var.getPhotoImage().M()) {
            float f10 = v0Var.getPhotoImage().O0;
            float f11 = v0Var.getPhotoImage().N0;
            if (f10 <= 0.0f || f11 <= 0.0f) {
                return;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < arrayList.size()) {
                if (((lx) arrayList.get(i10)).p == v0Var.getMessageObject().e1()) {
                    i11++;
                    if (((lx) arrayList.get(i10)).r.C() == null || ((lx) arrayList.get(i10)).r.C().y()) {
                        return;
                    }
                }
                if (((lx) arrayList.get(i10)).q == null || document == null) {
                    i7 = i10;
                } else {
                    i7 = i10;
                    if (((lx) arrayList.get(i10)).q.id == document.id) {
                        i12++;
                    }
                }
                i10 = i7 + 1;
            }
            if (i11 >= 4) {
                return;
            }
            lx lxVar = new lx();
            lxVar.h = true;
            if (!lxVar.i) {
                lxVar.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                lxVar.g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
            }
            lxVar.p = v0Var.getMessageObject().e1();
            lxVar.m = true;
            lxVar.r.u0 = true;
            int f12 = mx.f();
            if (i12 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(intValue);
                sb2.append("_");
                lxVar.r.w1 = a8.p0.n(lxVar.p, "_", sb2);
            }
            lxVar.q = document;
            lxVar.r.r0(org.telegram.messenger.fc.d(videoSize, document), com.google.android.gms.internal.vision.e2.j(f12, "_", f12), null, "tgs", akVar.c, 1);
            lxVar.r.F0(ConnectionsManager.DEFAULT_DATACENTER_ID);
            lxVar.r.X(0);
            if (lxVar.r.C() != null) {
                if (lxVar.h) {
                    lxVar.r.C().N(0, false, true);
                }
                lxVar.r.C().start();
            }
            arrayList.add(lxVar);
            if (akVar.n) {
                lxVar.r.Q();
                lxVar.r.I0(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void Q(long j3) {
        bn bnVar = this.a.R;
        int i7 = bn.md;
        bnVar.Qa(j3);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void S(org.telegram.ui.Cells.v0 v0Var) {
        bn bnVar = this.a.R;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        if (messageObject == null || bnVar.g2 == null) {
            return;
        }
        if (org.telegram.messenger.v3.p0(bnVar.e)) {
            bnVar.g2.n(org.telegram.messenger.fj.u1(messageObject.k), true);
        } else {
            bnVar.g2.n(messageObject.Y1(), true);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void T(org.telegram.ui.Cells.v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i7;
        bn bnVar = this.a.R;
        if (str != null) {
            c(v0Var);
            vf.b bVar = bnVar.ec;
            wg.f0 f0Var = wg.f0.O2;
            wg.b0.f1(LaunchActivity.Q(), str, bVar);
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        ug.h1 h1Var = new ug.h1(bnVar, i7, bnVar.j(), new ug.j(tL_premiumGiftOption), null, bnVar.Ba);
        h1Var.F2 = false;
        h1Var.Y1 = v0Var.getMessageObject().N3();
        bnVar.showDialog(h1Var);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void V(org.telegram.ui.Cells.v0 v0Var, String str) {
        c(v0Var);
        bn bnVar = this.a.R;
        wg.b0.f1(bnVar, str, bnVar.ec);
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.s0
    public final long b() {
        return this.a.R.b();
    }

    public final void c(org.telegram.ui.Cells.v0 v0Var) {
        bn bnVar = this.a.R;
        vf.b bVar = bnVar.ec;
        if (bVar != null) {
            bVar.a(true);
        }
        bnVar.ec = v0Var.getMessageObject() == null ? null : new fm(this, v0Var, 6);
    }

    @Override // org.telegram.ui.Cells.s0
    public final boolean g0(org.telegram.ui.Cells.v0 v0Var, float f10, float f11) {
        boolean z10;
        bn bnVar = this.a.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return bnVar.Y7(v0Var, false, false, f10, f11, true, true, false);
    }

    @Override // org.telegram.ui.Cells.s0
    public final boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Cells.s0
    public final void j(org.telegram.ui.Cells.v0 v0Var, int i7) {
        f0 f0Var = new f0(this, v0Var, i7, 6);
        bn bnVar = this.a.R;
        if (!bnVar.D0.O) {
            f0Var.run();
        } else {
            bnVar.Rb(false, true, true);
            org.telegram.messenger.g0.h3(f0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final void l(org.telegram.ui.Cells.v0 v0Var) {
        ej ejVar;
        bn bnVar = this.a.R;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.y < 0) {
            int childCount = bjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = bnVar.A0.getChildAt(childCount);
                bnVar.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        if (((org.telegram.ui.Cells.r1) childAt).getCurrentMessagesGroup() == null) {
                            bnVar.h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        bnVar.h9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        bnVar.Zc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void n(org.telegram.ui.Cells.v0 v0Var, int i7, int i10) {
        l2.y yVar = new l2.y(this, v0Var, i7, i10, 11);
        bn bnVar = this.a.R;
        if (!bnVar.D0.O) {
            yVar.run();
        } else {
            bnVar.Rb(false, true, true);
            org.telegram.messenger.g0.h3(yVar, 80L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.s0
    public final void r(org.telegram.ui.Cells.v0 v0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        int i7;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        PhotoViewer p12 = PhotoViewer.p1();
        bn bnVar = this.a.R;
        p12.J2(null, bnVar, bnVar.Ba);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.p0, 640, false, null, false);
        if (v0Var.getMessageObject().D == 24) {
            fi.f9 orCreateStoryViewer = bnVar.getOrCreateStoryViewer();
            bj bjVar = bnVar.A0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.fj messageObject2 = v0Var.getMessageObject();
            if (bnVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.n5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.e1();
                orCreateStoryViewer.L(bnVar.getParentActivity(), messageObject2.k.media.storyItem, fi.y6.a(bjVar));
                return;
            }
            return;
        }
        if (v0Var.getMessageObject().D == 22) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            RadialProgress2 radialProgress2 = v0Var.K1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.e1() < 0 && (str = u12.T2) != null && TextUtils.equals(messageObject.k.action.wallpaper.uploadingImage, str)) {
                u12.A();
                bnVar.jb(messageObject);
                return;
            }
            org.telegram.messenger.fj fjVar = v0Var.Q0;
            if (fjVar == null || !v0Var.Y(fjVar) || v0Var.y1 == null) {
                bnVar.ec();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    pc1 pc1Var = new pc1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = pc1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        pc1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = pc1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
                e71 e71Var = new e71(wallPaper, bnVar, q10);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    e71Var.H1 = z10;
                    e71Var.G1 = z11;
                    e71Var.p1 = wallPaperSettings2.intensity / 100.0f;
                }
                e71Var.s0 = messageObject;
                e71Var.h1(org.telegram.messenger.fj.B0(messageObject.k));
                e71Var.a.a = bnVar.Ba;
                e71Var.r1 = new f71(bnVar, q10);
                bnVar.presentFragment(e71Var);
                return;
            }
            return;
        }
        ArrayList<TLRPC.VideoSize> arrayList = messageObject.k.action.photo.video_sizes;
        if (arrayList == null || arrayList.isEmpty()) {
            videoSize = null;
            videoSize2 = null;
        } else {
            videoSize = org.telegram.messenger.w7.x(1000, messageObject.k.action.photo.video_sizes);
            ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.k.action.photo.video_sizes;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if ((arrayList2.get(i10) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList2.get(i10) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    videoSize2 = arrayList2.get(i10);
                    break;
                }
            }
            videoSize2 = null;
        }
        if (v0Var.getMessageObject().D != 21 || messageObject.P3()) {
            if (videoSize != null) {
                PhotoViewer.p1().d2(videoSize.location, org.telegram.messenger.fc.j(videoSize, messageObject.k.action.photo), bnVar.db);
                if (v0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().N2(org.telegram.messenger.gd.N0(2131744127, null));
                    return;
                }
                return;
            }
            if (w10 == null) {
                PhotoViewer.p1().f2(messageObject, null, 0L, 0L, 0L, bnVar.db);
                return;
            }
            PhotoViewer.p1().d2(w10.location, org.telegram.messenger.fc.i(w10, messageObject.k.action.photo), bnVar.db);
            if (v0Var.getMessageObject().D == 21) {
                PhotoViewer.p1().N2(org.telegram.messenger.gd.N0(2131744130, null));
                return;
            }
            return;
        }
        if (messageObject.q) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(0, true, true);
            u30Var.a = bnVar;
            u30Var.e();
            u30Var.c.e2.u0(null, videoSize2, 0L);
            u30Var.b = new bg.f0(bnVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], bnVar.getUserConfig().e(), 0);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        org.telegram.messenger.fc.j(videoSize, messageObject.k.action.photo);
        org.telegram.messenger.w7 fileLoader = bnVar.getFileLoader();
        if (videoSize == null) {
            TLRPC.Photo photo = messageObject.k.action.photo;
            fileLoader.getClass();
            I = org.telegram.messenger.w7.I(photo);
        } else {
            fileLoader.getClass();
            I = org.telegram.messenger.w7.I(videoSize);
        }
        File file = new File(org.telegram.messenger.w7.z(4), I.getName());
        if (!I.exists()) {
            if (!file.exists()) {
                return;
            } else {
                I = file;
            }
        }
        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, I.getAbsolutePath(), 0, false, 0, 0);
        efVar.a = bnVar.a0.getFieldText();
        efVar.b = videoSize != null;
        arrayList3.add(efVar);
        PhotoViewer.p1().g2(arrayList3, 0, 1, false, new el(this, messageObject, efVar), null);
        if (efVar.b) {
            PhotoViewer.p1().N2(org.telegram.messenger.gd.N0(2131744127, null));
        } else {
            PhotoViewer.p1().N2(org.telegram.messenger.gd.N0(2131744130, null));
        }
        org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(1, bnVar.getUserConfig().f());
        s30Var.e = videoSize != null;
        s30Var.b = bnVar.getMessagesController().c2(Long.valueOf(bnVar.l6));
        PhotoViewer.p1().w2(s30Var);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void s0(org.telegram.ui.Cells.v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.a.R.n8(v0Var, reactionCount, z10, f10, f11);
    }

    @Override // org.telegram.ui.Cells.s0
    public final void w(org.telegram.ui.Cells.v0 v0Var) {
        bn bnVar = this.a.R;
        org.telegram.messenger.fj messageObject = v0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !v0Var.getMessageObject().P3() && v0Var.getMessageObject().Y4() && v0Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.getResourceProvider());
            String N0 = org.telegram.messenger.gd.N0(2131746088, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131746089, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131746125, null), new w0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            bnVar.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, bnVar.getResourceProvider());
            }
        }
    }

    @Override // org.telegram.ui.Cells.s0
    public final /* synthetic */ void H(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
