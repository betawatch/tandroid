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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class am implements org.telegram.ui.Cells.q0 {
    public final /* synthetic */ fm a;

    public am(fm fmVar) {
        this.a = fmVar;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void E(org.telegram.ui.Cells.s0 s0Var, int i10, int i11) {
        i2.a0 a0Var = new i2.a0(this, s0Var, i10, i11, 11);
        un unVar = this.a.Q;
        if (!unVar.C0.N) {
            a0Var.run();
        } else {
            unVar.Db(false, true, true);
            org.telegram.messenger.i0.h3(a0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void E0(long j10) {
        un unVar = this.a.Q;
        int i10 = un.ad;
        unVar.Da(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.q0
    public final void F(org.telegram.ui.Cells.s0 s0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        int i10;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.jj messageObject = s0Var.getMessageObject();
        PhotoViewer v12 = PhotoViewer.v1();
        un unVar = this.a.Q;
        v12.N2(null, unVar, unVar.xa);
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(messageObject.n0, 640, false, null, false);
        if (s0Var.getMessageObject().D == 24) {
            th.o7 orCreateStoryViewer = unVar.getOrCreateStoryViewer();
            vj vjVar = unVar.z0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.jj messageObject2 = s0Var.getMessageObject();
            if (unVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.o5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.f1();
                orCreateStoryViewer.U(unVar.getParentActivity(), messageObject2.k.media.storyItem, th.n5.a(vjVar));
                return;
            }
            return;
        }
        if (s0Var.getMessageObject().D == 22) {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
            RadialProgress2 radialProgress2 = s0Var.J1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.f1() < 0 && (str = r12.Q2) != null && TextUtils.equals(messageObject.k.action.wallpaper.uploadingImage, str)) {
                r12.A();
                unVar.Va(messageObject);
                return;
            }
            org.telegram.messenger.jj jjVar = s0Var.P0;
            if (jjVar == null || !s0Var.V(jjVar) || s0Var.x1 == null) {
                unVar.Qb();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    me1 me1Var = new me1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.i0.s1(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = me1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        me1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = me1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
                w81 w81Var = new w81(wallPaper, unVar, q6);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    w81Var.G1 = z10;
                    w81Var.F1 = z11;
                    w81Var.o1 = wallPaperSettings2.intensity / 100.0f;
                }
                w81Var.r0 = messageObject;
                w81Var.g1(org.telegram.messenger.jj.B0(messageObject.k));
                w81Var.a.a = unVar.xa;
                w81Var.q1 = new x81(unVar, q6);
                unVar.presentFragment(w81Var);
                return;
            }
            return;
        }
        ArrayList<TLRPC.VideoSize> arrayList = messageObject.k.action.photo.video_sizes;
        if (arrayList == null || arrayList.isEmpty()) {
            videoSize = null;
            videoSize2 = null;
        } else {
            videoSize = org.telegram.messenger.b8.x(1000, messageObject.k.action.photo.video_sizes);
            ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.k.action.photo.video_sizes;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if ((arrayList2.get(i11) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList2.get(i11) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    videoSize2 = arrayList2.get(i11);
                    break;
                }
            }
            videoSize2 = null;
        }
        if (s0Var.getMessageObject().D != 21 || messageObject.P3()) {
            if (videoSize != null) {
                PhotoViewer.v1().g2(videoSize.location, org.telegram.messenger.ic.j(videoSize, messageObject.k.action.photo), unVar.Za);
                if (s0Var.getMessageObject().D == 21) {
                    PhotoViewer.v1().R2(org.telegram.messenger.cd.L0(2131744398, null));
                    return;
                }
                return;
            }
            if (w9 == null) {
                PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, unVar.Za);
                return;
            }
            PhotoViewer.v1().g2(w9.location, org.telegram.messenger.ic.i(w9, messageObject.k.action.photo), unVar.Za);
            if (s0Var.getMessageObject().D == 21) {
                PhotoViewer.v1().R2(org.telegram.messenger.cd.L0(2131744401, null));
                return;
            }
            return;
        }
        if (messageObject.q) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            b40Var.a = unVar;
            b40Var.e();
            b40Var.c.a2.s0(null, videoSize2, 0L);
            b40Var.b = new vg(unVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], unVar.getUserConfig().e(), 4);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        org.telegram.messenger.ic.j(videoSize, messageObject.k.action.photo);
        org.telegram.messenger.b8 fileLoader = unVar.getFileLoader();
        if (videoSize == null) {
            TLRPC.Photo photo = messageObject.k.action.photo;
            fileLoader.getClass();
            I = org.telegram.messenger.b8.I(photo);
        } else {
            fileLoader.getClass();
            I = org.telegram.messenger.b8.I(videoSize);
        }
        File file = new File(org.telegram.messenger.b8.z(4), I.getName());
        if (!I.exists()) {
            if (!file.exists()) {
                return;
            } else {
                I = file;
            }
        }
        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, I.getAbsolutePath(), 0, false, 0, 0);
        efVar.a = unVar.Z.getFieldText();
        efVar.b = videoSize != null;
        arrayList3.add(efVar);
        PhotoViewer.v1().j2(arrayList3, 0, 1, false, new zl(this, messageObject, efVar), null);
        if (efVar.b) {
            PhotoViewer.v1().R2(org.telegram.messenger.cd.L0(2131744398, null));
        } else {
            PhotoViewer.v1().R2(org.telegram.messenger.cd.L0(2131744401, null));
        }
        org.telegram.ui.Components.z30 z30Var = new org.telegram.ui.Components.z30(1, unVar.getUserConfig().f());
        z30Var.e = videoSize != null;
        z30Var.b = unVar.getMessagesController().Z1(Long.valueOf(unVar.j6));
        PhotoViewer.v1().A2(z30Var);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void G0(org.telegram.ui.Cells.s0 s0Var) {
        un unVar = this.a.Q;
        org.telegram.messenger.jj messageObject = s0Var.getMessageObject();
        if (messageObject == null || unVar.f2 == null) {
            return;
        }
        if (org.telegram.messenger.w3.p0(unVar.e)) {
            unVar.f2.n(org.telegram.messenger.jj.v1(messageObject.k), true);
        } else {
            unVar.f2.n(messageObject.Z1(), true);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void I(org.telegram.ui.Cells.s0 s0Var) {
        un unVar = this.a.Q;
        org.telegram.messenger.jj messageObject = s0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !s0Var.getMessageObject().P3() && s0Var.getMessageObject().Y4() && s0Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.getResourceProvider());
            String L0 = org.telegram.messenger.cd.L0(2131746299, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746300, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new y0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            unVar.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, unVar.getResourceProvider());
            }
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void M1(org.telegram.ui.Cells.s0 s0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        this.a.Q.e8(s0Var, reactionCount, z10, f7, f10);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void R0(org.telegram.ui.Cells.s0 s0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i10;
        un unVar = this.a.Q;
        if (str != null) {
            c(s0Var);
            gf.e eVar = unVar.Vb;
            mg.c1 c1Var = mg.c1.K2;
            mg.y0.e1(LaunchActivity.Q(), str, eVar);
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
        kg.v1 v1Var = new kg.v1(unVar, i10, unVar.j(), new kg.m(tL_premiumGiftOption), null, unVar.xa);
        v1Var.B2 = false;
        v1Var.U1 = s0Var.getMessageObject().N3();
        unVar.showDialog(v1Var);
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.q0
    public final long b() {
        return this.a.Q.b();
    }

    public final void c(org.telegram.ui.Cells.s0 s0Var) {
        un unVar = this.a.Q;
        gf.e eVar = unVar.Vb;
        if (eVar != null) {
            eVar.a(true);
        }
        unVar.Vb = s0Var.getMessageObject() == null ? null : new ym(this, s0Var, 6);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void e1(org.telegram.ui.Cells.s0 s0Var, String str) {
        c(s0Var);
        un unVar = this.a.Q;
        mg.y0.e1(unVar, str, unVar.Vb);
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q0
    public final org.telegram.ui.ActionBar.k2 h0() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean i1(org.telegram.ui.Cells.s0 s0Var, float f7, float f10) {
        boolean z10;
        un unVar = this.a.Q;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return unVar.Q7(s0Var, false, false, f7, f10, true, true, false);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void r(org.telegram.ui.Cells.s0 s0Var, int i10) {
        ag.o0 o0Var = new ag.o0(this, s0Var, i10, 20);
        un unVar = this.a.Q;
        if (!unVar.C0.N) {
            o0Var.run();
        } else {
            unVar.Db(false, true, true);
            org.telegram.messenger.i0.h3(o0Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void t0(org.telegram.ui.Cells.s0 s0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i10;
        vk vkVar = this.a.Q.Qa;
        FrameLayout frameLayout = vkVar.G;
        HashMap hashMap = vkVar.f;
        Random random = vkVar.h;
        ArrayList arrayList = vkVar.F;
        if (arrayList.size() <= 12 && s0Var.getPhotoImage().L()) {
            float f7 = s0Var.getPhotoImage().N0;
            float f10 = s0Var.getPhotoImage().M0;
            if (f7 <= 0.0f || f10 <= 0.0f) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < arrayList.size()) {
                if (((ky) arrayList.get(i11)).p == s0Var.getMessageObject().f1()) {
                    i12++;
                    if (((ky) arrayList.get(i11)).r.B() == null || ((ky) arrayList.get(i11)).r.B().y()) {
                        return;
                    }
                }
                if (((ky) arrayList.get(i11)).q == null || document == null) {
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (((ky) arrayList.get(i11)).q.id == document.id) {
                        i13++;
                    }
                }
                i11 = i10 + 1;
            }
            if (i12 >= 4) {
                return;
            }
            ky kyVar = new ky();
            kyVar.h = true;
            if (!kyVar.i) {
                kyVar.f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                kyVar.g = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
            }
            kyVar.p = s0Var.getMessageObject().f1();
            kyVar.m = true;
            kyVar.r.t0 = true;
            int f11 = ly.f();
            if (i13 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(intValue);
                sb2.append("_");
                kyVar.r.v1 = a1.g.p(sb2, kyVar.p, "_");
            }
            kyVar.q = document;
            kyVar.r.q0(org.telegram.messenger.ic.d(videoSize, document), a1.g.i(f11, f11, "_"), null, "tgs", vkVar.c, 1);
            kyVar.r.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
            kyVar.r.W(0);
            if (kyVar.r.B() != null) {
                if (kyVar.h) {
                    kyVar.r.B().N(0, false, true);
                }
                kyVar.r.B().start();
            }
            arrayList.add(kyVar);
            if (vkVar.n) {
                kyVar.r.P();
                kyVar.r.H0(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void w(org.telegram.ui.Cells.s0 s0Var) {
        yj yjVar;
        un unVar = this.a.Q;
        org.telegram.messenger.jj messageObject = s0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.K1 = true;
        vj vjVar = unVar.z0;
        if (vjVar != null && (yjVar = unVar.B0) != null && yjVar.y < 0) {
            int childCount = vjVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = unVar.z0.getChildAt(childCount);
                unVar.z0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            unVar.Y8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        unVar.Y8(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        unVar.Lc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
