package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements org.telegram.ui.ActionBar.r1, pj0, pb0, qb0, te.d, org.telegram.messenger.jc, z4, r0.m, wh.a, t0.e, qj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.p5, fi.b9, org.telegram.ui.ActionBar.m0, org.telegram.ui.ActionBar.f1, org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.d
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean D(float f10) {
        return false;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        ((k8) this.b).R0(i7 * 60, i7 == 0 ? 71 : 70);
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        cb cbVar = (cb) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        bb bbVar = cbVar.a;
        if (bbVar != null) {
            bbVar.setPadding(I0.a, I0.b, I0.c, I0.d);
        }
        view.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        Object O;
        kk kkVar = (kk) this.b;
        v4.i0 adapter = kkVar.r.getAdapter();
        ck ckVar = kkVar.w;
        if (adapter == ckVar) {
            O = ckVar.E(i7);
        } else {
            jk jkVar = kkVar.E;
            O = jkVar.O(jkVar.S(i7), jkVar.Q(i7));
        }
        return kkVar.U(view, O);
    }

    @Override // t0.e
    public boolean d(of ofVar, int i7, Bundle bundle) {
        jg jgVar = (jg) this.b;
        ChatActivityEnterView chatActivityEnterView = jgVar.f2;
        if (chatActivityEnterView.k7) {
            return true;
        }
        int i10 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) ofVar.b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) ofVar.b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.zy.x0(hVar.c(), null)) {
            jgVar.J(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            b5.J(chatActivityEnterView.C3, chatActivityEnterView.D3.a(), new g2(8, jgVar, ofVar), chatActivityEnterView.K4);
            return true;
        }
        jgVar.L(ofVar, true, 0, 0);
        return true;
    }

    @Override // fi.b9
    public void e(long j3, int i7, fi.e3 e3Var) {
        e3Var.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    @Override // org.telegram.ui.Components.pj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        boolean z10;
        ArrayList arrayList;
        o0 o0Var = (o0) this.b;
        l41 G = o0Var.T1.G(i7 - 1);
        if (G == null) {
            return;
        }
        int i10 = G.a;
        if (i10 == 41 || i10 == 35) {
            if (i10 == 41) {
                if (org.telegram.messenger.gd.a0) {
                }
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (!z10) {
                    c2Var.c(!c2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = o0Var.U1;
                            boolean b10 = c2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (o0Var.X1) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = o0Var.U1;
                                boolean b11 = c2Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            o0Var.Z1 = !o0Var.Z1;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = o0Var.U1;
                        boolean b12 = c2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = o0Var.U1;
                        boolean b13 = c2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = o0Var.U1;
                        boolean b14 = c2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        o0Var.U1.leave = c2Var.b();
                        break;
                    case 7:
                        o0Var.U1.edit_rank = c2Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = o0Var.U1;
                            boolean b15 = c2Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            o0Var.a2 = !o0Var.a2;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = o0Var.U1;
                        boolean b16 = c2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        o0Var.U1.invites = c2Var.b();
                        break;
                    case 11:
                        o0Var.U1.group_call = c2Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = o0Var.U1;
                            boolean b17 = c2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            o0Var.b2 = !o0Var.b2;
                            break;
                        }
                    case 13:
                        o0Var.U1.delete = c2Var.b();
                        break;
                    case 14:
                        o0Var.U1.edit = c2Var.b();
                        break;
                    case 15:
                        o0Var.U1.pinned = c2Var.b();
                        break;
                    case 16:
                        if (o0Var.W1 == null) {
                            o0Var.W1 = new a0.h();
                        }
                        o0Var.W1.b();
                        if (c2Var.b() && (arrayList = o0Var.V1) != null) {
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                long o4 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) obj).peer);
                                o0Var.W1.k(org.telegram.messenger.mp.u1(o0Var.a).c2(Long.valueOf(o4)), o4);
                            }
                            break;
                        }
                        break;
                }
                o0Var.T1.O(true);
            }
            z10 = false;
            org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            o0Var.T1.O(true);
        }
        int i12 = G.d;
        if (i12 < 0) {
            org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
            int i13 = (-i12) - 1;
            if (i13 < 0 || i13 >= o0Var.V1.size()) {
                return;
            }
            long o10 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) o0Var.V1.get(i13)).peer);
            TLRPC.User c22 = org.telegram.messenger.mp.u1(o0Var.a).c2(Long.valueOf(o10));
            if (o0Var.W1 == null) {
                o0Var.W1 = new a0.h();
            }
            if (o0Var.W1.d(o10)) {
                o0Var.W1.l(o10);
                c2Var3.c(false, true);
            } else {
                o0Var.W1.k(c22, o10);
                c2Var3.c(true, true);
            }
            o0Var.T1.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void g(int i7) {
        ArrayList arrayList;
        String str;
        switch (this.a) {
            case 25:
                jq jqVar = ((kq) this.b).a;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        jqVar.b();
                        break;
                    }
                } else {
                    jqVar.a(i7 == 2);
                    break;
                }
                break;
            default:
                bv bvVar = (bv) this.b;
                org.telegram.ui.ActionBar.h2 h2Var = bvVar.n1;
                nu nuVar = bvVar.p1;
                if (nuVar != null && (arrayList = nuVar.b) != null && !arrayList.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.b.get(0);
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet == null || !stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.mp.u1(bvVar.a).X2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.mp.u1(bvVar.a).X2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        Context parentActivity = h2Var != null ? h2Var.getParentActivity() : null;
                        if (parentActivity == null) {
                            parentActivity = bvVar.getContext();
                        }
                        qu quVar = new qu(bvVar, parentActivity, str2, str2, bvVar.J0);
                        if (h2Var == null) {
                            quVar.show();
                            break;
                        } else {
                            h2Var.showDialog(quVar);
                            break;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new lc((FrameLayout) bvVar.b, bvVar.J0).k(false).j();
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.b;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(h0Var.f2);
                ConnectionsManager.getInstance(h0Var.a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(h0Var, h, u1Var, 8));
                break;
            case 2:
                ((org.telegram.messenger.camera.i) this.b).run();
                break;
            case 3:
                ((bi.y3) this.b).run();
                break;
            case 4:
                ((bg.m0) this.b).run();
                break;
            case 5:
                ((z1) this.b).run();
                break;
            case 6:
                ((sr) this.b).run();
                break;
            case 7:
                ((r2) this.b).run();
                break;
            case 16:
                ((fg) this.b).a.V0.r();
                break;
            case 18:
                ((mg) this.b).run();
                org.telegram.messenger.mp.g1().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 22:
                ((rn) this.b).b.dismiss();
                break;
            case 23:
                ((wm) this.b).a.F.r();
                break;
            default:
                ((ut) this.b).a.d.r();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pb0
    public void i(int i7) {
        w2 w2Var = (w2) this.b;
        if (i7 == 0) {
            w2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) ((k.a) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && h1Var != null && h1Var.isShowing()) {
            h1Var.d(true);
        }
    }

    @Override // fi.b9
    public boolean k(long j3, int i7, int i10, int i11, fi.c9 c9Var) {
        wn wnVar = (wn) ((org.telegram.ui.Cells.k6) this.b).T;
        ImageReceiver imageReceiver = wnVar.a;
        c9Var.c = imageReceiver;
        c9Var.l = imageReceiver;
        org.telegram.ui.Cells.k6 k6Var = wnVar.H;
        c9Var.m = k6Var;
        boolean z10 = k6Var.w;
        wn wnVar2 = wnVar.L.e;
        c9Var.a = wnVar2;
        c9Var.k = wnVar2.getAlpha();
        c9Var.h = 0.0f;
        c9Var.i = org.telegram.messenger.g0.q.y;
        c9Var.g = (View) wnVar.getParent();
        return true;
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        long j3;
        qx qxVar = (qx) this.b;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        mx mxVar = qxVar.c;
        ry ryVar = qxVar.G;
        Object obj3 = l41Var.H;
        if (obj3 instanceof TLRPC.StickerSetCovered) {
            kx kxVar = (kx) l41Var.I;
            long j10 = qxVar.d;
            stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
            long j11 = stickerSet.id;
            if (j10 == j11) {
                qxVar.d = 0L;
                stickerSet = null;
            } else {
                qxVar.d = j11;
                qxVar.f = kxVar.d;
                qxVar.e = stickerSet;
            }
        } else {
            if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                long j12 = qxVar.d;
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                long j13 = stickerSet2.id;
                if (j12 == j13) {
                    qxVar.d = 0L;
                } else {
                    qxVar.d = j13;
                    qxVar.f = tL_messages_stickerSet.documents;
                    qxVar.e = stickerSet2;
                    stickerSet = stickerSet2;
                }
            }
            stickerSet = null;
        }
        int childCount = mxVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ph.b bVar = (ph.b) mxVar.getChildAt(i7);
            if (bVar != view) {
                bVar.a(false, true);
            }
        }
        if (qxVar.d == 0 || qxVar.f.size() >= qxVar.e.count) {
            j3 = 0;
        } else {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(ryVar.d1);
            TLRPC.StickerSet stickerSet3 = qxVar.e;
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            j3 = 0;
            tL_inputStickerSetID.id = stickerSet3.id;
            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
            TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_inputStickerSetID, false);
            if (o02 != null) {
                qxVar.f = o02.documents;
            }
        }
        TLObject tLObject = (TLObject) l41Var.H;
        TLRPC.Document document = null;
        TLRPC.StickerSet stickerSet4 = stickerSet;
        ph.a aVar = ryVar.M;
        te.a aVar2 = ryVar.b;
        ArrayList arrayList = qxVar.f;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) qxVar.f.get(0);
        }
        ryVar.K(aVar, tLObject, stickerSet4, document, true, aVar2.e > 0.0f);
        ((ph.b) view).a(qxVar.d != j3, true);
        aVar2.a(qxVar.d != j3, true);
        qxVar.f();
        ryVar.W.b();
        if (qxVar.d != j3) {
            mxVar.L1(view);
        }
    }

    @Override // wh.a
    public void m(Canvas canvas, int i7) {
        ((lb) this.b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 11:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new w((u6) obj, 2));
                duration.start();
                break;
            default:
                q9 q9Var = (q9) obj;
                if (z10 && !z11) {
                    q9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // te.d
    public void m1() {
        e6 e6Var = (e6) this.b;
        e6Var.b();
        e6Var.f();
    }

    @Override // org.telegram.ui.Components.qb0
    public void n(sb0 sb0Var, int i7) {
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.b;
        try {
            if (i7 == 0) {
                w3Var.setText(org.telegram.messenger.gd.M0(2131751423, null));
            } else {
                w3Var.setText(org.telegram.messenger.gd.M0(2131745345, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.ef efVar;
        vl vlVar = (vl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vlVar.e;
        si siVar = chatAttachAlertPhotoLayout.b;
        if (vlVar.a == null || siVar.Q1 || chatAttachAlertPhotoLayout.Q == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.r1 = false;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i7 = options.outWidth;
            try {
                i10 = options.outHeight;
            } catch (Exception unused) {
                i10 = 0;
                int i11 = i7;
                int i12 = ChatAttachAlertPhotoLayout.v1;
                ChatAttachAlertPhotoLayout.v1 = i12 - 1;
                efVar = new org.telegram.messenger.ef(i12, vlVar.a.getAbsolutePath(), 0, true, i11, i10);
                efVar.E = (int) (j3 / 1000.0f);
                efVar.c = str;
                if (siVar.O2 != 0) {
                    org.telegram.messenger.we weVar = new org.telegram.messenger.we();
                    efVar.A = weVar;
                    weVar.l = true;
                    weVar.u = false;
                    weVar.v = 1.0f;
                }
                chatAttachAlertPhotoLayout.m0(efVar, false, false);
            }
        } catch (Exception unused2) {
            i7 = 0;
        }
        int i112 = i7;
        int i122 = ChatAttachAlertPhotoLayout.v1;
        ChatAttachAlertPhotoLayout.v1 = i122 - 1;
        efVar = new org.telegram.messenger.ef(i122, vlVar.a.getAbsolutePath(), 0, true, i112, i10);
        efVar.E = (int) (j3 / 1000.0f);
        efVar.c = str;
        if (siVar.O2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
            org.telegram.messenger.we weVar2 = new org.telegram.messenger.we();
            efVar.A = weVar2;
            weVar2.l = true;
            weVar2.u = false;
            weVar2.v = 1.0f;
        }
        chatAttachAlertPhotoLayout.m0(efVar, false, false);
    }

    private final /* synthetic */ void q(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    @Override // fi.b9
    public /* synthetic */ void b(boolean z10) {
    }

    @Override // te.d
    public /* synthetic */ void x(boolean z10) {
    }

    @Override // te.d
    public /* synthetic */ void H() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }

    private final /* synthetic */ void o(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void p(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
