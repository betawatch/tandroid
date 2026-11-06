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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class el implements org.telegram.ui.Cells.q0 {
    public final /* synthetic */ jl a;

    public el(jl jlVar) {
        this.a = jlVar;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void D(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i7;
        zj zjVar = this.a.Q.Qa;
        FrameLayout frameLayout = zjVar.G;
        HashMap hashMap = zjVar.f;
        Random random = zjVar.h;
        ArrayList arrayList = zjVar.F;
        if (arrayList.size() <= 12 && t0Var.getPhotoImage().L()) {
            float f10 = t0Var.getPhotoImage().N0;
            float f11 = t0Var.getPhotoImage().M0;
            if (f10 <= 0.0f || f11 <= 0.0f) {
                return;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < arrayList.size()) {
                if (((hx) arrayList.get(i10)).p == t0Var.getMessageObject().f1()) {
                    i11++;
                    if (((hx) arrayList.get(i10)).r.B() == null || ((hx) arrayList.get(i10)).r.B().y()) {
                        return;
                    }
                }
                if (((hx) arrayList.get(i10)).q == null || document == null) {
                    i7 = i10;
                } else {
                    i7 = i10;
                    if (((hx) arrayList.get(i10)).q.id == document.id) {
                        i12++;
                    }
                }
                i10 = i7 + 1;
            }
            if (i11 >= 4) {
                return;
            }
            hx hxVar = new hx();
            hxVar.h = true;
            if (!hxVar.i) {
                hxVar.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                hxVar.g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
            }
            hxVar.p = t0Var.getMessageObject().f1();
            hxVar.m = true;
            hxVar.r.t0 = true;
            int f12 = ix.f();
            if (i12 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(intValue);
                sb2.append("_");
                hxVar.r.v1 = a8.p0.n(hxVar.p, "_", sb2);
            }
            hxVar.q = document;
            hxVar.r.q0(org.telegram.messenger.hc.d(videoSize, document), com.google.android.recaptcha.internal.a.j(f12, "_", f12), null, "tgs", zjVar.c, 1);
            hxVar.r.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
            hxVar.r.W(0);
            if (hxVar.r.B() != null) {
                if (hxVar.h) {
                    hxVar.r.B().N(0, false, true);
                }
                hxVar.r.B().start();
            }
            arrayList.add(hxVar);
            if (zjVar.n) {
                hxVar.r.P();
                hxVar.r.H0(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void E(long j3) {
        an anVar = this.a.Q;
        int i7 = an.id;
        anVar.Na(j3);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void F(org.telegram.ui.Cells.t0 t0Var) {
        an anVar = this.a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject == null || anVar.f2 == null) {
            return;
        }
        if (org.telegram.messenger.t3.p0(anVar.e)) {
            anVar.f2.n(org.telegram.messenger.ij.v1(messageObject.k), true);
        } else {
            anVar.f2.n(messageObject.Z1(), true);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void W(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i7;
        an anVar = this.a.Q;
        if (str != null) {
            c(t0Var);
            vf.b bVar = anVar.ac;
            wg.g0 g0Var = wg.g0.K2;
            wg.c0.e1(LaunchActivity.Q(), str, bVar);
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        ug.f1 f1Var = new ug.f1(anVar, i7, anVar.j(), new ug.j(tL_premiumGiftOption), null, anVar.xa);
        f1Var.B2 = false;
        f1Var.U1 = t0Var.getMessageObject().O3();
        anVar.showDialog(f1Var);
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.q0
    public final long b() {
        return this.a.Q.b();
    }

    public final void c(org.telegram.ui.Cells.t0 t0Var) {
        an anVar = this.a.Q;
        vf.b bVar = anVar.ac;
        if (bVar != null) {
            bVar.a(true);
        }
        anVar.ac = t0Var.getMessageObject() == null ? null : new em(this, t0Var, 6);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void c0(org.telegram.ui.Cells.t0 t0Var, String str) {
        c(t0Var);
        an anVar = this.a.Q;
        wg.c0.e1(anVar, str, anVar.ac);
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void i(org.telegram.ui.Cells.t0 t0Var, int i7) {
        q8 q8Var = new q8(this, t0Var, i7, 3);
        an anVar = this.a.Q;
        if (!anVar.C0.N) {
            q8Var.run();
        } else {
            anVar.Nb(false, true, true);
            org.telegram.messenger.g0.i3(q8Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void l(org.telegram.ui.Cells.t0 t0Var) {
        dj djVar;
        an anVar = this.a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.K1 = true;
        aj ajVar = anVar.z0;
        if (ajVar != null && (djVar = anVar.B0) != null && djVar.y < 0) {
            int childCount = ajVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = anVar.z0.getChildAt(childCount);
                anVar.z0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            anVar.f9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        anVar.f9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        anVar.Vc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void m(org.telegram.ui.Cells.t0 t0Var, int i7, int i10) {
        l2.a0 a0Var = new l2.a0(this, t0Var, i7, i10, 11);
        an anVar = this.a.Q;
        if (!anVar.C0.N) {
            a0Var.run();
        } else {
            anVar.Nb(false, true, true);
            org.telegram.messenger.g0.i3(a0Var, 80L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.q0
    public final void q(org.telegram.ui.Cells.t0 t0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        int i7;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        PhotoViewer p12 = PhotoViewer.p1();
        an anVar = this.a.Q;
        p12.H2(null, anVar, anVar.xa);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.n0, 640, false, null, false);
        if (t0Var.getMessageObject().D == 24) {
            di.p9 orCreateStoryViewer = anVar.getOrCreateStoryViewer();
            aj ajVar = anVar.z0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.ij messageObject2 = t0Var.getMessageObject();
            if (anVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.f1();
                orCreateStoryViewer.L(anVar.getParentActivity(), messageObject2.k.media.storyItem, di.h7.a(ajVar));
                return;
            }
            return;
        }
        if (t0Var.getMessageObject().D == 22) {
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            RadialProgress2 radialProgress2 = t0Var.J1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.f1() < 0 && (str = s12.Q2) != null && TextUtils.equals(messageObject.k.action.wallpaper.uploadingImage, str)) {
                s12.A();
                anVar.fb(messageObject);
                return;
            }
            org.telegram.messenger.ij ijVar = t0Var.P0;
            if (ijVar == null || !t0Var.U(ijVar) || t0Var.x1 == null) {
                anVar.ac();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    oc1 oc1Var = new oc1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = oc1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        oc1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = oc1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                e71 e71Var = new e71(wallPaper, anVar, q10);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z9 = wallPaperSettings2.blur;
                    boolean z10 = wallPaperSettings2.motion;
                    e71Var.G1 = z9;
                    e71Var.F1 = z10;
                    e71Var.o1 = wallPaperSettings2.intensity / 100.0f;
                }
                e71Var.r0 = messageObject;
                e71Var.h1(org.telegram.messenger.ij.B0(messageObject.k));
                e71Var.a.a = anVar.xa;
                e71Var.q1 = new f71(anVar, q10);
                anVar.presentFragment(e71Var);
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
        if (t0Var.getMessageObject().D != 21 || messageObject.Q3()) {
            if (videoSize != null) {
                PhotoViewer.p1().b2(videoSize.location, org.telegram.messenger.hc.j(videoSize, messageObject.k.action.photo), anVar.Za);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.p1().L2(org.telegram.messenger.hd.M0(2131744373, null));
                    return;
                }
                return;
            }
            if (w10 == null) {
                PhotoViewer.p1().d2(messageObject, null, 0L, 0L, 0L, anVar.Za);
                return;
            }
            PhotoViewer.p1().b2(w10.location, org.telegram.messenger.hc.i(w10, messageObject.k.action.photo), anVar.Za);
            if (t0Var.getMessageObject().D == 21) {
                PhotoViewer.p1().L2(org.telegram.messenger.hd.M0(2131744376, null));
                return;
            }
            return;
        }
        if (messageObject.q) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
            j30Var.a = anVar;
            j30Var.e();
            j30Var.c.a2.u0(null, videoSize2, 0L);
            j30Var.b = new bg.e0(anVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], anVar.getUserConfig().e(), 0);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        org.telegram.messenger.hc.j(videoSize, messageObject.k.action.photo);
        org.telegram.messenger.w7 fileLoader = anVar.getFileLoader();
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
        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, I.getAbsolutePath(), 0, false, 0, 0);
        gfVar.a = anVar.Z.getFieldText();
        gfVar.b = videoSize != null;
        arrayList3.add(gfVar);
        PhotoViewer.p1().e2(arrayList3, 0, 1, false, new dl(this, messageObject, gfVar), null);
        if (gfVar.b) {
            PhotoViewer.p1().L2(org.telegram.messenger.hd.M0(2131744373, null));
        } else {
            PhotoViewer.p1().L2(org.telegram.messenger.hd.M0(2131744376, null));
        }
        org.telegram.ui.Components.h30 h30Var = new org.telegram.ui.Components.h30(1, anVar.getUserConfig().f());
        h30Var.e = videoSize != null;
        h30Var.b = anVar.getMessagesController().a2(Long.valueOf(anVar.j6));
        PhotoViewer.p1().u2(h30Var);
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        boolean z9;
        an anVar = this.a.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).inPreviewMode;
        if (z9) {
            return false;
        }
        return anVar.X7(t0Var, false, false, f10, f11, true, true, false);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void s(org.telegram.ui.Cells.t0 t0Var) {
        an anVar = this.a.Q;
        org.telegram.messenger.ij messageObject = t0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !t0Var.getMessageObject().Q3() && t0Var.getMessageObject().Z4() && t0Var.getMessageObject().T2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.getResourceProvider());
            String M0 = org.telegram.messenger.hd.M0(2131746283, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746284, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new w0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            anVar.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, anVar.getResourceProvider());
            }
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final org.telegram.ui.ActionBar.f2 t() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void t0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        this.a.Q.l8(t0Var, reactionCount, z9, f10, f11);
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
