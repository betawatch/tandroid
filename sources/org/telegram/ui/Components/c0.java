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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements org.telegram.ui.ActionBar.q1, rj0, qb0, rb0, te.d, org.telegram.messenger.kc, a5, r0.m, wh.a, t0.e, sj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.q5, fi.b9, org.telegram.ui.ActionBar.l0, org.telegram.ui.ActionBar.e1, org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i7) {
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

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        ((j8) this.b).R0(i7 * 60, i7 == 0 ? 71 : 70);
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

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        Object O;
        mk mkVar = (mk) this.b;
        v4.i0 adapter = mkVar.r.getAdapter();
        ek ekVar = mkVar.w;
        if (adapter == ekVar) {
            O = ekVar.E(i7);
        } else {
            lk lkVar = mkVar.E;
            O = lkVar.O(lkVar.S(i7), lkVar.Q(i7));
        }
        return mkVar.U(view, O);
    }

    @Override // t0.e
    public boolean d(qf qfVar, int i7, Bundle bundle) {
        mg mgVar = (mg) this.b;
        ChatActivityEnterView chatActivityEnterView = mgVar.f2;
        if (chatActivityEnterView.p7) {
            return true;
        }
        int i10 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) qfVar.b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) qfVar.b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.az.x0(hVar.c(), null)) {
            mgVar.J(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            c5.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new h2(8, mgVar, qfVar), chatActivityEnterView.M4);
            return true;
        }
        mgVar.L(qfVar, true, 0, 0);
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
    @Override // org.telegram.ui.Components.rj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        boolean z10;
        ArrayList arrayList;
        p0 p0Var = (p0) this.b;
        o41 G = p0Var.T1.G(i7 - 1);
        if (G == null) {
            return;
        }
        int i10 = G.a;
        if (i10 == 41 || i10 == 35) {
            if (i10 == 41) {
                if (org.telegram.messenger.hd.a0) {
                }
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                if (!z10) {
                    d2Var.c(!d2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = p0Var.U1;
                            boolean b10 = d2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (p0Var.X1) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = p0Var.U1;
                                boolean b11 = d2Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            p0Var.Z1 = !p0Var.Z1;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = p0Var.U1;
                        boolean b12 = d2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = p0Var.U1;
                        boolean b13 = d2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = p0Var.U1;
                        boolean b14 = d2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        p0Var.U1.leave = d2Var.b();
                        break;
                    case 7:
                        p0Var.U1.edit_rank = d2Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = p0Var.U1;
                            boolean b15 = d2Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            p0Var.a2 = !p0Var.a2;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = p0Var.U1;
                        boolean b16 = d2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        p0Var.U1.invites = d2Var.b();
                        break;
                    case 11:
                        p0Var.U1.group_call = d2Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = p0Var.U1;
                            boolean b17 = d2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            p0Var.b2 = !p0Var.b2;
                            break;
                        }
                    case 13:
                        p0Var.U1.delete = d2Var.b();
                        break;
                    case 14:
                        p0Var.U1.edit = d2Var.b();
                        break;
                    case 15:
                        p0Var.U1.pinned = d2Var.b();
                        break;
                    case 16:
                        if (p0Var.W1 == null) {
                            p0Var.W1 = new a0.h();
                        }
                        p0Var.W1.b();
                        if (d2Var.b() && (arrayList = p0Var.V1) != null) {
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                long o4 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) obj).peer);
                                p0Var.W1.k(org.telegram.messenger.np.u1(p0Var.a).c2(Long.valueOf(o4)), o4);
                            }
                            break;
                        }
                        break;
                }
                p0Var.T1.O(true);
            }
            z10 = false;
            org.telegram.ui.Cells.d2 d2Var2 = (org.telegram.ui.Cells.d2) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            p0Var.T1.O(true);
        }
        int i12 = G.d;
        if (i12 < 0) {
            org.telegram.ui.Cells.d2 d2Var3 = (org.telegram.ui.Cells.d2) view;
            int i13 = (-i12) - 1;
            if (i13 < 0 || i13 >= p0Var.V1.size()) {
                return;
            }
            long o10 = org.telegram.messenger.n5.o(((TLRPC.ChannelParticipant) p0Var.V1.get(i13)).peer);
            TLRPC.User c22 = org.telegram.messenger.np.u1(p0Var.a).c2(Long.valueOf(o10));
            if (p0Var.W1 == null) {
                p0Var.W1 = new a0.h();
            }
            if (p0Var.W1.d(o10)) {
                p0Var.W1.l(o10);
                d2Var3.c(false, true);
            } else {
                p0Var.W1.k(c22, o10);
                d2Var3.c(true, true);
            }
            p0Var.T1.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        ArrayList arrayList;
        String str;
        switch (this.a) {
            case 25:
                lq lqVar = ((mq) this.b).a;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        lqVar.b();
                        break;
                    }
                } else {
                    lqVar.a(i7 == 2);
                    break;
                }
                break;
            default:
                ev evVar = (ev) this.b;
                org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
                qu quVar = evVar.p1;
                if (quVar != null && (arrayList = quVar.b) != null && !arrayList.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) quVar.b.get(0);
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet == null || !stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.np.u1(evVar.a).X2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.np.u1(evVar.a).X2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        Context parentActivity = g2Var != null ? g2Var.getParentActivity() : null;
                        if (parentActivity == null) {
                            parentActivity = evVar.getContext();
                        }
                        tu tuVar = new tu(evVar, parentActivity, str2, str2, evVar.J0);
                        if (g2Var == null) {
                            tuVar.show();
                            break;
                        } else {
                            g2Var.showDialog(tuVar);
                            break;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new lc((FrameLayout) evVar.b, evVar.J0).k(false).j();
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.b;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(i0Var.f2);
                ConnectionsManager.getInstance(i0Var.a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(i0Var, h, t1Var, 8));
                break;
            case 2:
                ((org.telegram.messenger.camera.i) this.b).run();
                break;
            case 3:
                ((bi.c4) this.b).run();
                break;
            case 4:
                ((bg.m0) this.b).run();
                break;
            case 5:
                ((a2) this.b).run();
                break;
            case 6:
                ((ur) this.b).run();
                break;
            case 7:
                ((s2) this.b).run();
                break;
            case 16:
                ((ig) this.b).a.V0.r();
                break;
            case 18:
                ((mf) this.b).run();
                org.telegram.messenger.np.g1().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 22:
                ((tn) this.b).b.dismiss();
                break;
            case 23:
                ((ym) this.b).a.F.r();
                break;
            default:
                ((wt) this.b).a.d.r();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qb0
    public void i(int i7) {
        x2 x2Var = (x2) this.b;
        if (i7 == 0) {
            x2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g1Var != null && g1Var.isShowing()) {
            g1Var.d(true);
        }
    }

    @Override // fi.b9
    public boolean k(long j3, int i7, int i10, int i11, fi.c9 c9Var) {
        yn ynVar = (yn) ((org.telegram.ui.Cells.l6) this.b).T;
        ImageReceiver imageReceiver = ynVar.a;
        c9Var.c = imageReceiver;
        c9Var.l = imageReceiver;
        org.telegram.ui.Cells.l6 l6Var = ynVar.H;
        c9Var.m = l6Var;
        boolean z10 = l6Var.w;
        yn ynVar2 = ynVar.L.e;
        c9Var.a = ynVar2;
        c9Var.k = ynVar2.getAlpha();
        c9Var.h = 0.0f;
        c9Var.i = org.telegram.messenger.g0.q.y;
        c9Var.g = (View) ynVar.getParent();
        return true;
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        long j3;
        sx sxVar = (sx) this.b;
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        ox oxVar = sxVar.c;
        ty tyVar = sxVar.G;
        Object obj3 = o41Var.H;
        if (obj3 instanceof TLRPC.StickerSetCovered) {
            mx mxVar = (mx) o41Var.I;
            long j10 = sxVar.d;
            stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
            long j11 = stickerSet.id;
            if (j10 == j11) {
                sxVar.d = 0L;
                stickerSet = null;
            } else {
                sxVar.d = j11;
                sxVar.f = mxVar.d;
                sxVar.e = stickerSet;
            }
        } else {
            if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                long j12 = sxVar.d;
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                long j13 = stickerSet2.id;
                if (j12 == j13) {
                    sxVar.d = 0L;
                } else {
                    sxVar.d = j13;
                    sxVar.f = tL_messages_stickerSet.documents;
                    sxVar.e = stickerSet2;
                    stickerSet = stickerSet2;
                }
            }
            stickerSet = null;
        }
        int childCount = oxVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ph.b bVar = (ph.b) oxVar.getChildAt(i7);
            if (bVar != view) {
                bVar.a(false, true);
            }
        }
        if (sxVar.d == 0 || sxVar.f.size() >= sxVar.e.count) {
            j3 = 0;
        } else {
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(tyVar.d1);
            TLRPC.StickerSet stickerSet3 = sxVar.e;
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            j3 = 0;
            tL_inputStickerSetID.id = stickerSet3.id;
            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
            TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_inputStickerSetID, false);
            if (o02 != null) {
                sxVar.f = o02.documents;
            }
        }
        TLObject tLObject = (TLObject) o41Var.H;
        TLRPC.Document document = null;
        TLRPC.StickerSet stickerSet4 = stickerSet;
        ph.a aVar = tyVar.M;
        te.a aVar2 = tyVar.b;
        ArrayList arrayList = sxVar.f;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) sxVar.f.get(0);
        }
        tyVar.K(aVar, tLObject, stickerSet4, document, true, aVar2.e > 0.0f);
        ((ph.b) view).a(sxVar.d != j3, true);
        aVar2.a(sxVar.d != j3, true);
        sxVar.f();
        tyVar.W.b();
        if (sxVar.d != j3) {
            oxVar.L1(view);
        }
    }

    @Override // wh.a
    public void m(Canvas canvas, int i7) {
        ((lb) this.b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 11:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new x((v6) obj, 2));
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
        f6 f6Var = (f6) this.b;
        f6Var.b();
        f6Var.f();
    }

    @Override // org.telegram.ui.Components.rb0
    public void n(tb0 tb0Var, int i7) {
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) this.b;
        try {
            if (i7 == 0) {
                x3Var.setText(org.telegram.messenger.hd.N0(2131751422, null));
            } else {
                x3Var.setText(org.telegram.messenger.hd.N0(2131745344, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.ff ffVar;
        xl xlVar = (xl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xlVar.e;
        ui uiVar = chatAttachAlertPhotoLayout.b;
        if (xlVar.a == null || uiVar.Q1 || chatAttachAlertPhotoLayout.Q == null) {
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
                ffVar = new org.telegram.messenger.ff(i12, xlVar.a.getAbsolutePath(), 0, true, i11, i10);
                ffVar.E = (int) (j3 / 1000.0f);
                ffVar.c = str;
                if (uiVar.O2 != 0) {
                    org.telegram.messenger.xe xeVar = new org.telegram.messenger.xe();
                    ffVar.A = xeVar;
                    xeVar.l = true;
                    xeVar.u = false;
                    xeVar.v = 1.0f;
                }
                chatAttachAlertPhotoLayout.m0(ffVar, false, false);
            }
        } catch (Exception unused2) {
            i7 = 0;
        }
        int i112 = i7;
        int i122 = ChatAttachAlertPhotoLayout.v1;
        ChatAttachAlertPhotoLayout.v1 = i122 - 1;
        ffVar = new org.telegram.messenger.ff(i122, xlVar.a.getAbsolutePath(), 0, true, i112, i10);
        ffVar.E = (int) (j3 / 1000.0f);
        ffVar.c = str;
        if (uiVar.O2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
            org.telegram.messenger.xe xeVar2 = new org.telegram.messenger.xe();
            ffVar.A = xeVar2;
            xeVar2.l = true;
            xeVar2.u = false;
            xeVar2.v = 1.0f;
        }
        chatAttachAlertPhotoLayout.m0(ffVar, false, false);
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

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
