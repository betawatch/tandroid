// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cu1 implements zl1 {
    public final /* synthetic */ hu1 a;

    public cu1(hu1 hu1Var) {
        this.a = hu1Var;
    }

    @Override // zl1
    public final void C(cm1 cm1Var, int i) {
        wc7 wc7Var = new wc7((Object) this, (Object) cm1Var, i, (byte) 13);
        yv1 yv1Var = this.a.R;
        if (!yv1Var.D0.O) {
            wc7Var.run();
        } else {
            yv1Var.Jb(false, true, true);
            gm.d3(wc7Var, 80L);
        }
    }

    @Override // zl1
    public final void I(long j) {
        yv1 yv1Var = this.a.R;
        int i = yv1.xd;
        yv1Var.Ea(j);
    }

    @Override // zl1
    public final void J(cm1 cm1Var) {
        yv1 yv1Var = this.a.R;
        k47 messageObject = cm1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !cm1Var.getMessageObject().O3() && cm1Var.getMessageObject().X4() && cm1Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.getResourceProvider(), yv1Var.getParentActivity());
            String M0 = jb6.M0(2131746017, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131746018, null);
            alertDialog$Builder.j(jb6.M0(2131746054, null), new cd1((Object) this, (byte) 13));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            yv1Var.showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, yv1Var.getResourceProvider());
            }
        }
    }

    @Override // zl1
    public final long a() {
        return 0L;
    }

    public final void b(cm1 cm1Var) {
        yv1 yv1Var = this.a.R;
        k11 k11Var = yv1Var.oc;
        if (k11Var != null) {
            k11Var.a(true);
        }
        yv1Var.oc = cm1Var.getMessageObject() == null ? null : new bv1(this, cm1Var, (byte) 6);
    }

    @Override // zl1
    public final void b0(cm1 cm1Var) {
        yv1 yv1Var = this.a.R;
        k47 messageObject = cm1Var.getMessageObject();
        if (messageObject == null || yv1Var.g2 == null) {
            return;
        }
        if (sd2.p0(yv1Var.e)) {
            yv1Var.g2.k(k47.u1(messageObject.k), true);
        } else {
            yv1Var.g2.k(messageObject.Y1(), true);
        }
    }

    @Override // zl1
    public final long d() {
        return this.a.R.d();
    }

    @Override // zl1
    public final boolean f() {
        return false;
    }

    @Override // zl1
    public final void g0(cm1 cm1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i;
        yv1 yv1Var = this.a.R;
        if (str != null) {
            b(cm1Var);
            k11 k11Var = yv1Var.oc;
            lk8 lk8Var = lk8.N2;
            rv4.Z0(LaunchActivity.Q(), str, k11Var);
            return;
        }
        i = ((d) yv1Var).currentAccount;
        yj8 yj8Var = new yj8(yv1Var, i, yv1Var.h(), new nw4(tL_premiumGiftOption), null, yv1Var.Ba);
        yj8Var.E2 = false;
        yj8Var.X1 = cm1Var.getMessageObject().N3();
        yv1Var.showDialog(yj8Var);
    }

    @Override // zl1
    public final void h(cm1 cm1Var) {
        yr1 yr1Var;
        yv1 yv1Var = this.a.R;
        k47 messageObject = cm1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        vr1 vr1Var = yv1Var.A0;
        if (vr1Var != null && (yr1Var = yv1Var.C0) != null && yr1Var.y < 0) {
            int childCount = vr1Var.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = yv1Var.A0.getChildAt(childCount);
                yv1Var.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof rc2) {
                        if (((rc2) childAt).getCurrentMessagesGroup() == null) {
                            yv1Var.i7(childAt);
                            break;
                        }
                    } else if (childAt instanceof cm1) {
                        yv1Var.i7(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        yv1Var.Zc(messageObject, false);
    }

    @Override // zl1
    public final boolean j0(cm1 cm1Var, float f, float f2) {
        boolean z;
        yv1 yv1Var = this.a.R;
        z = ((d) yv1Var).inPreviewMode;
        if (z) {
            return false;
        }
        return yv1Var.Y5(cm1Var, false, false, f, f2, true, true, false);
    }

    @Override // zl1
    public final void l(cm1 cm1Var, String str) {
        b(cm1Var);
        yv1 yv1Var = this.a.R;
        rv4.Z0(yv1Var, str, yv1Var.oc);
    }

    @Override // zl1
    public final void n(cm1 cm1Var, int i, int i2) {
        zq1 zq1Var = new zq1(this, cm1Var, i, i2, (byte) 1);
        yv1 yv1Var = this.a.R;
        if (!yv1Var.D0.O) {
            zq1Var.run();
        } else {
            yv1Var.Jb(false, true, true);
            gm.d3(zq1Var, 80L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zl1
    public final void o(cm1 cm1Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        int i;
        TLRPC.WallPaper wallPaper;
        String str;
        k47 messageObject = cm1Var.getMessageObject();
        PhotoViewer r0 = PhotoViewer.r0();
        yv1 yv1Var = this.a.R;
        r0.T1(null, yv1Var, yv1Var.Ba);
        TLRPC.PhotoSize w = bc4.w(messageObject.p0, 640, false, null, false);
        if (cm1Var.getMessageObject().D == 24) {
            oab orCreateStoryViewer = yv1Var.getOrCreateStoryViewer();
            vr1 vr1Var = yv1Var.A0;
            orCreateStoryViewer.getClass();
            k47 messageObject2 = cm1Var.getMessageObject();
            if (yv1Var.getParentActivity() == null || messageObject2.D != 24) {
                return;
            }
            TLRPC.MessageMedia messageMedia = messageObject2.k.media;
            TL_stories.StoryItem storyItem = messageMedia.storyItem;
            storyItem.dialogId = pg3.n(messageMedia.peer);
            storyItem.messageId = messageObject2.e1();
            orCreateStoryViewer.J(yv1Var.getParentActivity(), messageObject2.k.media.storyItem, q4b.a(vr1Var));
            return;
        }
        if (cm1Var.getMessageObject().D != 22) {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.k.action.photo.video_sizes;
            if (arrayList == null || arrayList.isEmpty()) {
                videoSize = null;
                videoSize2 = null;
            } else {
                videoSize = bc4.x(1000, messageObject.k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.k.action.photo.video_sizes;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if ((arrayList2.get(i2) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList2.get(i2) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                        videoSize2 = arrayList2.get(i2);
                        break;
                    }
                }
                videoSize2 = null;
            }
            if (cm1Var.getMessageObject().D != 21 || messageObject.O3()) {
                if (videoSize != null) {
                    PhotoViewer.r0().k1(videoSize.location, gn5.j(videoSize, messageObject.k.action.photo), yv1Var.db);
                    if (cm1Var.getMessageObject().D == 21) {
                        PhotoViewer.r0().X1(jb6.M0(2131744057, null));
                        return;
                    }
                    return;
                }
                if (w == null) {
                    PhotoViewer.r0().l1(messageObject, null, 0L, 0L, 0L, yv1Var.db);
                    return;
                }
                PhotoViewer.r0().k1(w.location, gn5.i(w, messageObject.k.action.photo), yv1Var.db);
                if (cm1Var.getMessageObject().D == 21) {
                    PhotoViewer.r0().X1(jb6.M0(2131744060, null));
                    return;
                }
                return;
            }
            if (messageObject.q) {
                return;
            }
            if (videoSize2 != null) {
                wn5 wn5Var = new wn5(0, true, true);
                wn5Var.a = yv1Var;
                wn5Var.d();
                wn5Var.c.d2.u0(null, videoSize2, 0L);
                wn5Var.b = new zn1((Object) yv1Var, (Object) new TLRPC.FileLocation[1], (Object) new TLRPC.FileLocation[1], yv1Var.getUserConfig().e(), (byte) 5);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            gn5.j(videoSize, messageObject.k.action.photo);
            bc4 fileLoader = yv1Var.getFileLoader();
            if (videoSize == null) {
                TLRPC.Photo photo = messageObject.k.action.photo;
                fileLoader.getClass();
                I = bc4.I(photo);
            } else {
                fileLoader.getClass();
                I = bc4.I(videoSize);
            }
            File file = new File(bc4.z(4), I.getName());
            if (!I.exists()) {
                if (!file.exists()) {
                    return;
                } else {
                    I = file;
                }
            }
            jo6 jo6Var = new jo6(0, I.getAbsolutePath(), 0, false, 0, 0);
            jo6Var.a = yv1Var.a0.getFieldText();
            jo6Var.b = videoSize != null;
            arrayList3.add(jo6Var);
            PhotoViewer.r0().o1(arrayList3, 0, 1, false, new bu1(this, messageObject, jo6Var), null);
            if (jo6Var.b) {
                PhotoViewer.r0().X1(jb6.M0(2131744057, null));
            } else {
                PhotoViewer.r0().X1(jb6.M0(2131744060, null));
            }
            un5 un5Var = new un5(1, yv1Var.getUserConfig().f());
            un5Var.e = videoSize != null;
            un5Var.b = yv1Var.getMessagesController().W1(Long.valueOf(yv1Var.l6));
            PhotoViewer.r0().G1(un5Var);
            return;
        }
        i = ((d) yv1Var).currentAccount;
        oc7 r1 = oc7.r1(i);
        RadialProgress2 radialProgress2 = cm1Var.K1;
        if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.e1() < 0 && (str = r1.J2) != null && TextUtils.equals(messageObject.k.action.wallpaper.uploadingImage, str)) {
            xlb xlbVar = r1.K2;
            if (xlbVar != null) {
                if (xlbVar.s != null) {
                    for (int i3 = 0; i3 < r1.K2.s.size(); i3++) {
                        ConnectionsManager.getInstance(r1.currentAccount).cancelRequest(((Integer) r1.K2.s.get(i3)).intValue(), true);
                    }
                }
                bc4.G(r1.currentAccount).b(r1.J2, false);
                long j = r1.K2.n;
                if (j != 0) {
                    if (j >= 0) {
                        TLRPC.UserFull X1 = r1.X1(j);
                        if (X1 != null) {
                            X1.wallpaper = r1.K2.t;
                            nm7.f(r1.currentAccount).k(68, Long.valueOf(r1.K2.n), X1);
                        }
                    } else {
                        TLRPC.ChatFull M0 = r1.M0(-j);
                        if (M0 != null) {
                            M0.wallpaper = r1.K2.t;
                            nm7 f = nm7.f(r1.currentAccount);
                            Boolean bool = Boolean.FALSE;
                            f.k(31, M0, 0, bool, bool);
                        }
                    }
                }
                r1.K2 = null;
                r1.J2 = null;
            }
            yv1Var.ab(messageObject);
            return;
        }
        k47 k47Var = cm1Var.Q0;
        if (k47Var == null || !cm1Var.U(k47Var) || cm1Var.y1 == null) {
            yv1Var.Zb();
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
            TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
            if (wallPaper2.pattern || wallPaper2.document == null) {
                String str2 = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                mtc mtcVar = new mtc(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, gm.q1(wallPaperSettings.rotation, false), r1.intensity / 100.0f, wallPaper2.settings.motion);
                wallPaper = mtcVar;
                if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                    mtcVar.g = (TLRPC.TL_wallPaper) wallPaper2;
                    wallPaper = mtcVar;
                }
            } else {
                wallPaper = wallPaper2;
            }
            boolean o = cmb.I.o();
            bob bobVar = new bob(wallPaper, yv1Var, o);
            TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
            if (wallPaperSettings2 != null) {
                boolean z = wallPaperSettings2.blur;
                boolean z2 = wallPaperSettings2.motion;
                bobVar.H1 = z;
                bobVar.G1 = z2;
                bobVar.p1 = wallPaperSettings2.intensity / 100.0f;
            }
            bobVar.s0 = messageObject;
            bobVar.h1(k47.B0(messageObject.k));
            bobVar.a.a = yv1Var.Ba;
            bobVar.r1 = new cob(yv1Var, o);
            yv1Var.presentFragment(bobVar);
        }
    }

    @Override // zl1
    public final void r(cm1 cm1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        xs1 xs1Var = this.a.R.Ua;
        FrameLayout frameLayout = xs1Var.H;
        HashMap hashMap = xs1Var.f;
        Random random = xs1Var.h;
        ArrayList arrayList = xs1Var.G;
        if (arrayList.size() > 12 || !cm1Var.getPhotoImage().E()) {
            return;
        }
        float f = cm1Var.getPhotoImage().O0;
        float f2 = cm1Var.getPhotoImage().N0;
        if (f <= 0.0f || f2 <= 0.0f) {
            return;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((jw3) arrayList.get(i3)).p == cm1Var.getMessageObject().e1()) {
                i++;
                if (((jw3) arrayList.get(i3)).r.y() == null || ((jw3) arrayList.get(i3)).r.y().t()) {
                    return;
                }
            }
            if (((jw3) arrayList.get(i3)).q != null && document != null && ((jw3) arrayList.get(i3)).q.id == document.id) {
                i2++;
            }
        }
        if (i < 4) {
            jw3 jw3Var = new jw3();
            jw3Var.h = true;
            if (!jw3Var.i) {
                jw3Var.f = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                jw3Var.g = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
            }
            jw3Var.p = cm1Var.getMessageObject().e1();
            jw3Var.m = true;
            ImageReceiver imageReceiver = jw3Var.r;
            imageReceiver.u0 = true;
            int f3 = kw3.f();
            if (i2 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                StringBuilder sb = new StringBuilder();
                sb.append(intValue);
                sb.append("_");
                imageReceiver.w1 = hg9.k(sb, jw3Var.p, "_");
            }
            jw3Var.q = document;
            jw3Var.r.d0(gn5.d(videoSize, document), td4.n(f3, f3, "_"), null, "tgs", xs1Var.c, 1);
            imageReceiver.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
            imageReceiver.M(0);
            if (imageReceiver.y() != null) {
                if (jw3Var.h) {
                    imageReceiver.y().I(0, false, true);
                }
                imageReceiver.y().start();
            }
            arrayList.add(jw3Var);
            if (xs1Var.n) {
                imageReceiver.I();
                imageReceiver.p0(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // zl1
    public final d w() {
        return this.a.R;
    }

    @Override // zl1
    public final void y(cm1 cm1Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.R.o6(cm1Var, reactionCount, z, f, f2);
    }

    @Override // zl1
    public final void x(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
