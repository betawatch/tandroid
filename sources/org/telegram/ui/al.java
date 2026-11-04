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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class al implements org.telegram.ui.Cells.q0 {
    public final /* synthetic */ fl a;

    public al(fl flVar) {
        this.a = flVar;
    }

    @Override // org.telegram.ui.Cells.q0
    public final org.telegram.ui.ActionBar.d2 E() {
        return this.a.R;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void M(org.telegram.ui.Cells.t0 t0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int i3;
        vj vjVar = this.a.R.Ra;
        FrameLayout frameLayout = vjVar.H;
        HashMap hashMap = vjVar.f;
        Random random = vjVar.h;
        ArrayList arrayList = vjVar.G;
        if (arrayList.size() <= 12 && t0Var.getPhotoImage().L()) {
            float f10 = t0Var.getPhotoImage().O0;
            float f11 = t0Var.getPhotoImage().N0;
            if (f10 <= 0.0f || f11 <= 0.0f) {
                return;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < arrayList.size()) {
                if (((ex) arrayList.get(i10)).p == t0Var.getMessageObject().f1()) {
                    i11++;
                    if (((ex) arrayList.get(i10)).r.B() == null || ((ex) arrayList.get(i10)).r.B().y()) {
                        return;
                    }
                }
                if (((ex) arrayList.get(i10)).q == null || document == null) {
                    i3 = i10;
                } else {
                    i3 = i10;
                    if (((ex) arrayList.get(i10)).q.id == document.id) {
                        i12++;
                    }
                }
                i10 = i3 + 1;
            }
            if (i11 >= 4) {
                return;
            }
            ex exVar = new ex();
            exVar.h = true;
            if (!exVar.i) {
                exVar.f = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                exVar.g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
            }
            exVar.p = t0Var.getMessageObject().f1();
            exVar.m = true;
            exVar.r.u0 = true;
            int f12 = fx.f();
            if (i12 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(intValue);
                sb2.append("_");
                exVar.r.w1 = a1.g.o(exVar.p, "_", sb2);
            }
            exVar.q = document;
            exVar.r.q0(org.telegram.messenger.ac.d(videoSize, document), com.google.android.recaptcha.internal.a.i(f12, "_", f12), null, "tgs", vjVar.c, 1);
            exVar.r.E0(ConnectionsManager.DEFAULT_DATACENTER_ID);
            exVar.r.W(0);
            if (exVar.r.B() != null) {
                if (exVar.h) {
                    exVar.r.B().N(0, false, true);
                }
                exVar.r.B().start();
            }
            arrayList.add(exVar);
            if (vjVar.n) {
                exVar.r.P();
                exVar.r.H0(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void W(long j10) {
        wm wmVar = this.a.R;
        int i3 = wm.jd;
        wmVar.Na(j10);
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.q0
    public final long b() {
        return this.a.R.b();
    }

    public final void c(org.telegram.ui.Cells.t0 t0Var) {
        wm wmVar = this.a.R;
        sf.b bVar = wmVar.bc;
        if (bVar != null) {
            bVar.a(true);
        }
        wmVar.bc = t0Var.getMessageObject() == null ? null : new am(this, t0Var, 6);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void c0(org.telegram.ui.Cells.t0 t0Var) {
        wm wmVar = this.a.R;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        if (messageObject == null || wmVar.g2 == null) {
            return;
        }
        if (org.telegram.messenger.t3.p0(wmVar.e)) {
            wmVar.g2.n(org.telegram.messenger.zi.v1(messageObject.k), true);
        } else {
            wmVar.g2.n(messageObject.Z1(), true);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q0
    public final void g0(org.telegram.ui.Cells.t0 t0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i3;
        wm wmVar = this.a.R;
        if (str != null) {
            c(t0Var);
            sf.b bVar = wmVar.bc;
            xg.g0 g0Var = xg.g0.L2;
            xg.c0.e1(LaunchActivity.Q(), str, bVar);
            return;
        }
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        vg.h1 h1Var = new vg.h1(wmVar, i3, wmVar.j(), new vg.j(tL_premiumGiftOption), null, wmVar.ya);
        h1Var.C2 = false;
        h1Var.V1 = t0Var.getMessageObject().O3();
        wmVar.showDialog(h1Var);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void h(org.telegram.ui.Cells.t0 t0Var, int i3) {
        f4 f4Var = new f4(this, t0Var, i3, 4);
        wm wmVar = this.a.R;
        if (!wmVar.D0.O) {
            f4Var.run();
        } else {
            wmVar.Nb(false, true, true);
            org.telegram.messenger.g0.i3(f4Var, 80L);
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final void q0(org.telegram.ui.Cells.t0 t0Var, String str) {
        c(t0Var);
        wm wmVar = this.a.R;
        xg.c0.e1(wmVar, str, wmVar.bc);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void r(org.telegram.ui.Cells.t0 t0Var) {
        zi ziVar;
        wm wmVar = this.a.R;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.K1 = true;
        wi wiVar = wmVar.A0;
        if (wiVar != null && (ziVar = wmVar.C0) != null && ziVar.y < 0) {
            int childCount = wiVar.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = wmVar.A0.getChildAt(childCount);
                wmVar.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            wmVar.f9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        wmVar.f9(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        wmVar.Vc(messageObject, false);
    }

    @Override // org.telegram.ui.Cells.q0
    public final boolean r0(org.telegram.ui.Cells.t0 t0Var, float f10, float f11) {
        boolean z10;
        wm wmVar = this.a.R;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        if (z10) {
            return false;
        }
        return wmVar.X7(t0Var, false, false, f10, f11, true, true, false);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void t(org.telegram.ui.Cells.t0 t0Var, int i3, int i10) {
        k2.a0 a0Var = new k2.a0(this, t0Var, i3, i10, 11);
        wm wmVar = this.a.R;
        if (!wmVar.D0.O) {
            a0Var.run();
        } else {
            wmVar.Nb(false, true, true);
            org.telegram.messenger.g0.i3(a0Var, 80L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Cells.q0
    public final void u(org.telegram.ui.Cells.t0 t0Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        int i3;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        PhotoViewer v12 = PhotoViewer.v1();
        wm wmVar = this.a.R;
        v12.N2(null, wmVar, wmVar.ya);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(messageObject.n0, 640, false, null, false);
        if (t0Var.getMessageObject().D == 24) {
            ei.r9 orCreateStoryViewer = wmVar.getOrCreateStoryViewer();
            wi wiVar = wmVar.A0;
            orCreateStoryViewer.getClass();
            org.telegram.messenger.zi messageObject2 = t0Var.getMessageObject();
            if (wmVar.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = org.telegram.messenger.m5.o(messageMedia.peer);
                storyItem.messageId = messageObject2.f1();
                orCreateStoryViewer.T(wmVar.getParentActivity(), messageObject2.k.media.storyItem, ei.i7.a(wiVar));
                return;
            }
            return;
        }
        if (t0Var.getMessageObject().D == 22) {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
            RadialProgress2 radialProgress2 = t0Var.K1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.f1() < 0 && (str = s12.R2) != null && TextUtils.equals(messageObject.k.action.wallpaper.uploadingImage, str)) {
                s12.A();
                wmVar.fb(messageObject);
                return;
            }
            org.telegram.messenger.zi ziVar = t0Var.Q0;
            if (ziVar == null || !t0Var.U(ziVar) || t0Var.y1 == null) {
                wmVar.ac();
                return;
            }
            TLRPC.MessageAction messageAction = messageObject.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                if (wallPaper2.pattern || wallPaper2.document == null) {
                    String str2 = wallPaper2.slug;
                    TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                    kc1 kc1Var = new kc1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r3.intensity / 100.0f, wallPaper2.settings.motion, null);
                    wallPaper = kc1Var;
                    if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                        kc1Var.g = (TLRPC.TL_wallPaper) wallPaper2;
                        wallPaper = kc1Var;
                    }
                } else {
                    wallPaper = wallPaper2;
                }
                boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
                v61 v61Var = new v61(wallPaper, wmVar, q10);
                TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                if (wallPaperSettings2 != null) {
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    v61Var.H1 = z10;
                    v61Var.G1 = z11;
                    v61Var.p1 = wallPaperSettings2.intensity / 100.0f;
                }
                v61Var.s0 = messageObject;
                v61Var.h1(org.telegram.messenger.zi.B0(messageObject.k));
                v61Var.a.a = wmVar.ya;
                v61Var.r1 = new w61(wmVar, q10);
                wmVar.presentFragment(v61Var);
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
                PhotoViewer.v1().g2(videoSize.location, org.telegram.messenger.ac.j(videoSize, messageObject.k.action.photo), wmVar.ab);
                if (t0Var.getMessageObject().D == 21) {
                    PhotoViewer.v1().R2(org.telegram.messenger.bd.M0(2131744382, null));
                    return;
                }
                return;
            }
            if (w10 == null) {
                PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, wmVar.ab);
                return;
            }
            PhotoViewer.v1().g2(w10.location, org.telegram.messenger.ac.i(w10, messageObject.k.action.photo), wmVar.ab);
            if (t0Var.getMessageObject().D == 21) {
                PhotoViewer.v1().R2(org.telegram.messenger.bd.M0(2131744385, null));
                return;
            }
            return;
        }
        if (messageObject.q) {
            return;
        }
        if (videoSize2 != null) {
            org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
            f30Var.a = wmVar;
            f30Var.e();
            f30Var.c.b2.u0(null, videoSize2, 0L);
            f30Var.b = new cg.d0(wmVar, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], wmVar.getUserConfig().e(), 0);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        org.telegram.messenger.ac.j(videoSize, messageObject.k.action.photo);
        org.telegram.messenger.w7 fileLoader = wmVar.getFileLoader();
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
        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, I.getAbsolutePath(), 0, false, 0, 0);
        yeVar.a = wmVar.a0.getFieldText();
        yeVar.b = videoSize != null;
        arrayList3.add(yeVar);
        PhotoViewer.v1().j2(arrayList3, 0, 1, false, new zk(this, messageObject, yeVar), null);
        if (yeVar.b) {
            PhotoViewer.v1().R2(org.telegram.messenger.bd.M0(2131744382, null));
        } else {
            PhotoViewer.v1().R2(org.telegram.messenger.bd.M0(2131744385, null));
        }
        org.telegram.ui.Components.d30 d30Var = new org.telegram.ui.Components.d30(1, wmVar.getUserConfig().f());
        d30Var.e = videoSize != null;
        d30Var.b = wmVar.getMessagesController().a2(Long.valueOf(wmVar.k6));
        PhotoViewer.v1().A2(d30Var);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void v0(org.telegram.ui.Cells.t0 t0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.a.R.l8(t0Var, reactionCount, z10, f10, f11);
    }

    @Override // org.telegram.ui.Cells.q0
    public final void x(org.telegram.ui.Cells.t0 t0Var) {
        wm wmVar = this.a.R;
        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !t0Var.getMessageObject().Q3() && t0Var.getMessageObject().Z4() && t0Var.getMessageObject().T2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.getResourceProvider());
            String M0 = org.telegram.messenger.bd.M0(2131746292, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746293, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new x0(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            wmVar.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, wmVar.getResourceProvider());
            }
        }
    }

    @Override // org.telegram.ui.Cells.q0
    public final /* synthetic */ void F(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
