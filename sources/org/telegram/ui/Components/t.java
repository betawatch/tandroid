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
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements org.telegram.ui.ActionBar.u1, hk0, wb0, xb0, yb0, fe.g, org.telegram.messenger.mc, q4, r0.m, mh.a, t0.e, ik0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.t5, th.k7, org.telegram.ui.ActionBar.o0, org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        ((a8) this.b).Y0(i10 * 60, i10 == 0 ? 71 : 70);
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        ra raVar = (ra) this.b;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        qa qaVar = raVar.a;
        if (qaVar != null) {
            qaVar.setPadding(I0.a, I0.b, I0.c, I0.d);
        }
        view.requestLayout();
        return r0.j1.b;
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
    @Override // org.telegram.ui.Components.hk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f7, float f10, int i10, View view) {
        boolean z10;
        ArrayList arrayList;
        i0 i0Var = (i0) this.b;
        a51 G = i0Var.P1.G(i10 - 1);
        if (G == null) {
            return;
        }
        int i11 = G.a;
        if (i11 == 41 || i11 == 35) {
            if (i11 == 41) {
                if (org.telegram.messenger.cd.X) {
                }
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (!z10) {
                    c2Var.c(!c2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = i0Var.Q1;
                            boolean b10 = c2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (i0Var.T1) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = i0Var.Q1;
                                boolean b11 = c2Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            i0Var.V1 = !i0Var.V1;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = i0Var.Q1;
                        boolean b12 = c2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = i0Var.Q1;
                        boolean b13 = c2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = i0Var.Q1;
                        boolean b14 = c2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        i0Var.Q1.leave = c2Var.b();
                        break;
                    case 7:
                        i0Var.Q1.edit_rank = c2Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = i0Var.Q1;
                            boolean b15 = c2Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            i0Var.W1 = !i0Var.W1;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = i0Var.Q1;
                        boolean b16 = c2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        i0Var.Q1.invites = c2Var.b();
                        break;
                    case 11:
                        i0Var.Q1.group_call = c2Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = i0Var.Q1;
                            boolean b17 = c2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            i0Var.X1 = !i0Var.X1;
                            break;
                        }
                    case 13:
                        i0Var.Q1.delete = c2Var.b();
                        break;
                    case 14:
                        i0Var.Q1.edit = c2Var.b();
                        break;
                    case 15:
                        i0Var.Q1.pinned = c2Var.b();
                        break;
                    case 16:
                        if (i0Var.S1 == null) {
                            i0Var.S1 = new a0.h();
                        }
                        i0Var.S1.b();
                        if (c2Var.b() && (arrayList = i0Var.R1) != null) {
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                long o10 = org.telegram.messenger.o5.o(((TLRPC.ChannelParticipant) obj).peer);
                                i0Var.S1.k(org.telegram.messenger.vp.r1(i0Var.a).Z1(Long.valueOf(o10)), o10);
                            }
                            break;
                        }
                        break;
                }
                i0Var.P1.O(true);
            }
            z10 = false;
            org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            i0Var.P1.O(true);
        }
        int i13 = G.d;
        if (i13 < 0) {
            org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
            int i14 = (-i13) - 1;
            if (i14 < 0 || i14 >= i0Var.R1.size()) {
                return;
            }
            long o11 = org.telegram.messenger.o5.o(((TLRPC.ChannelParticipant) i0Var.R1.get(i14)).peer);
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i0Var.a).Z1(Long.valueOf(o11));
            if (i0Var.S1 == null) {
                i0Var.S1 = new a0.h();
            }
            if (i0Var.S1.d(o11)) {
                i0Var.S1.l(o11);
                c2Var3.c(false, true);
            } else {
                i0Var.S1.k(Z1, o11);
                c2Var3.c(true, true);
            }
            i0Var.P1.O(true);
        }
    }

    @Override // th.k7
    public void d(long j10, int i10, th.i2 i2Var) {
        i2Var.run();
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        return ((String[]) this.b)[i10];
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        Object O;
        xj xjVar = (xj) this.b;
        s4.g0 adapter = xjVar.r.getAdapter();
        pj pjVar = xjVar.w;
        if (adapter == pjVar) {
            O = pjVar.E(i10);
        } else {
            wj wjVar = xjVar.D;
            O = wjVar.O(wjVar.S(i10), wjVar.Q(i10));
        }
        return xjVar.S(view, O);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                gf.e h = x1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.b2);
                ConnectionsManager.getInstance(zVar.a).sendRequestTyped(deletetone, new a3.b(1), new org.telegram.tgnet.e(zVar, h, x1Var, 3));
                break;
            case 2:
                ((org.telegram.ui.fp) this.b).run();
                break;
            case 3:
                ((bi.e) this.b).run();
                break;
            case 4:
                ((m4.a1) this.b).run();
                break;
            case 5:
                ((q1) this.b).run();
                break;
            case 6:
                ((or) this.b).run();
                break;
            case 8:
                ((k2) this.b).run();
                break;
            case 17:
                ((lf) this.b).a.U0.r();
                break;
            case 19:
                ((cd) this.b).run();
                org.telegram.messenger.vp.d1().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((jn) this.b).b.dismiss();
                break;
            case 24:
                ((pm) this.b).a.E.r();
                break;
            default:
                ((ut) this.b).a.d.r();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xb0
    public void i(int i10) {
        p2 p2Var = (p2) this.b;
        if (i10 == 0) {
            p2Var.run();
        }
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k(int i10) {
        ArrayList arrayList;
        String str;
        switch (this.a) {
            case 26:
                bq bqVar = ((cq) this.b).a;
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        bqVar.b();
                        break;
                    }
                } else {
                    bqVar.a(i10 == 2);
                    break;
                }
                break;
            default:
                cv cvVar = (cv) this.b;
                org.telegram.ui.ActionBar.k2 k2Var = cvVar.j1;
                ou ouVar = cvVar.l1;
                if (ouVar != null && (arrayList = ouVar.b) != null && !arrayList.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ouVar.b.get(0);
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet == null || !stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.vp.r1(cvVar.a).U2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.vp.r1(cvVar.a).U2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i10 == 1) {
                        Context parentActivity = k2Var != null ? k2Var.getParentActivity() : null;
                        if (parentActivity == null) {
                            parentActivity = cvVar.getContext();
                        }
                        ru ruVar = new ru(cvVar, parentActivity, str2, str2, cvVar.I0);
                        if (k2Var == null) {
                            ruVar.show();
                            break;
                        } else {
                            k2Var.showDialog(ruVar);
                            break;
                        }
                    } else if (i10 == 2) {
                        try {
                            org.telegram.messenger.i0.g(str2);
                            new cc((FrameLayout) cvVar.b, cvVar.I0).k(false).j();
                            break;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                }
                break;
        }
    }

    @Override // fe.g
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // fe.g
    public /* synthetic */ boolean m(float f7) {
        return false;
    }

    @Override // org.telegram.messenger.mc
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new a6((m6) obj, 1));
                duration.start();
                break;
            default:
                g9 g9Var = (g9) obj;
                if (z10 && !z11) {
                    g9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        int i10;
        int i11;
        org.telegram.messenger.ef efVar;
        nl nlVar = (nl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.e;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (nlVar.a == null || biVar.M1 || chatAttachAlertPhotoLayout.P == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.q1 = false;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i10 = options.outWidth;
            try {
                i11 = options.outHeight;
            } catch (Exception unused) {
                i11 = 0;
                int i12 = i10;
                int i13 = ChatAttachAlertPhotoLayout.u1;
                ChatAttachAlertPhotoLayout.u1 = i13 - 1;
                efVar = new org.telegram.messenger.ef(i13, nlVar.a.getAbsolutePath(), 0, true, i12, i11);
                efVar.E = (int) (j10 / 1000.0f);
                efVar.c = str;
                if (biVar.K2 != 0) {
                    org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye();
                    efVar.A = yeVar;
                    yeVar.l = true;
                    yeVar.u = false;
                    yeVar.v = 1.0f;
                }
                chatAttachAlertPhotoLayout.k0(efVar, false, false);
            }
        } catch (Exception unused2) {
            i10 = 0;
        }
        int i122 = i10;
        int i132 = ChatAttachAlertPhotoLayout.u1;
        ChatAttachAlertPhotoLayout.u1 = i132 - 1;
        efVar = new org.telegram.messenger.ef(i132, nlVar.a.getAbsolutePath(), 0, true, i122, i11);
        efVar.E = (int) (j10 / 1000.0f);
        efVar.c = str;
        if (biVar.K2 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            org.telegram.messenger.ye yeVar2 = new org.telegram.messenger.ye();
            efVar.A = yeVar2;
            yeVar2.l = true;
            yeVar2.u = false;
            yeVar2.v = 1.0f;
        }
        chatAttachAlertPhotoLayout.k0(efVar, false, false);
    }

    @Override // t0.e
    public boolean p(m2.t tVar, int i10, Bundle bundle) {
        rf rfVar = (rf) this.b;
        ChatActivityEnterView chatActivityEnterView = rfVar.Z1;
        if (chatActivityEnterView.p5) {
            return true;
        }
        int i11 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                ((t0.h) tVar.b).c();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) tVar.b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.qz.x0(hVar.a(), null)) {
            rfVar.I(hVar.a(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            s4.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new f2(5, rfVar, tVar), chatActivityEnterView.W3);
            return true;
        }
        rfVar.K(tVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.messenger.mc
    public /* synthetic */ void q(int i10, Drawable drawable) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var = (org.telegram.ui.ActionBar.k1) ((k.a) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && k1Var != null && k1Var.isShowing()) {
            k1Var.d(true);
        }
    }

    @Override // mh.a
    public void s(Canvas canvas, int i10) {
        ((bb) this.b).dispatchDrawImplBlur(canvas, i10);
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) this.b;
        try {
            if (i10 == 0) {
                y3Var.setText(org.telegram.messenger.cd.L0(2131751435, null));
            } else {
                y3Var.setText(org.telegram.messenger.cd.L0(2131745557, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // th.k7
    public boolean v(long j10, int i10, int i11, int i12, th.l7 l7Var) {
        on onVar = (on) ((org.telegram.ui.Cells.o6) this.b).T;
        ImageReceiver imageReceiver = onVar.a;
        l7Var.c = imageReceiver;
        l7Var.l = imageReceiver;
        org.telegram.ui.Cells.o6 o6Var = onVar.G;
        l7Var.m = o6Var;
        boolean z10 = o6Var.w;
        on onVar2 = onVar.K.e;
        l7Var.a = onVar2;
        l7Var.k = onVar2.getAlpha();
        l7Var.h = 0.0f;
        l7Var.i = org.telegram.messenger.i0.q.y;
        l7Var.g = (View) onVar.getParent();
        return true;
    }

    @Override // fe.g
    public void z() {
        v5 v5Var = (v5) this.b;
        v5Var.b();
        v5Var.e();
    }

    private final /* synthetic */ void x(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void y(ImageReceiver imageReceiver) {
    }

    @Override // th.k7
    public /* synthetic */ void c(boolean z10) {
    }

    @Override // fe.g
    public /* synthetic */ void g(boolean z10) {
    }

    @Override // fe.g
    public /* synthetic */ void a() {
    }

    @Override // fe.g
    public /* synthetic */ void n() {
    }

    private final /* synthetic */ void u(int i10, Drawable drawable) {
    }

    private final /* synthetic */ void w(int i10, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
