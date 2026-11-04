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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements org.telegram.ui.ActionBar.p1, gj0, ya0, za0, ab0, qe.d, org.telegram.messenger.ec, r4, r0.m, xh.a, t0.e, hj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, ei.n9, org.telegram.ui.ActionBar.l0, org.telegram.ui.ActionBar.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
        int i3 = this.a;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        ((d8) this.b).W0(i3 * 60, i3 == 0 ? 71 : 70);
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        wa waVar = (wa) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        va vaVar = waVar.a;
        if (vaVar != null) {
            vaVar.setPadding(I0.a, I0.b, I0.c, I0.d);
        }
        view.requestLayout();
        return r0.k1.b;
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
    @Override // org.telegram.ui.Components.gj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(float f10, float f11, int i3, View view) {
        boolean z10;
        ArrayList arrayList;
        g0 g0Var = (g0) this.b;
        r31 G = g0Var.Q1.G(i3 - 1);
        if (G == null) {
            return;
        }
        int i10 = G.a;
        if (i10 == 41 || i10 == 35) {
            if (i10 == 41) {
                if (org.telegram.messenger.bd.a0) {
                }
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (!z10) {
                    c2Var.c(!c2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = g0Var.R1;
                            boolean b10 = c2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (g0Var.U1) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = g0Var.R1;
                                boolean b11 = c2Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            g0Var.W1 = !g0Var.W1;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = g0Var.R1;
                        boolean b12 = c2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = g0Var.R1;
                        boolean b13 = c2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = g0Var.R1;
                        boolean b14 = c2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        g0Var.R1.leave = c2Var.b();
                        break;
                    case 7:
                        g0Var.R1.edit_rank = c2Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = g0Var.R1;
                            boolean b15 = c2Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            g0Var.X1 = !g0Var.X1;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = g0Var.R1;
                        boolean b16 = c2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        g0Var.R1.invites = c2Var.b();
                        break;
                    case 11:
                        g0Var.R1.group_call = c2Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = g0Var.R1;
                            boolean b17 = c2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            g0Var.Y1 = !g0Var.Y1;
                            break;
                        }
                    case 13:
                        g0Var.R1.delete = c2Var.b();
                        break;
                    case 14:
                        g0Var.R1.edit = c2Var.b();
                        break;
                    case 15:
                        g0Var.R1.pinned = c2Var.b();
                        break;
                    case 16:
                        if (g0Var.T1 == null) {
                            g0Var.T1 = new a0.h();
                        }
                        g0Var.T1.b();
                        if (c2Var.b() && (arrayList = g0Var.S1) != null) {
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                long o10 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) obj).peer);
                                g0Var.T1.k(org.telegram.messenger.hp.s1(g0Var.a).a2(Long.valueOf(o10)), o10);
                            }
                            break;
                        }
                        break;
                }
                g0Var.Q1.O(true);
            }
            z10 = false;
            org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            g0Var.Q1.O(true);
        }
        int i12 = G.d;
        if (i12 < 0) {
            org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
            int i13 = (-i12) - 1;
            if (i13 < 0 || i13 >= g0Var.S1.size()) {
                return;
            }
            long o11 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) g0Var.S1.get(i13)).peer);
            TLRPC.User a22 = org.telegram.messenger.hp.s1(g0Var.a).a2(Long.valueOf(o11));
            if (g0Var.T1 == null) {
                g0Var.T1 = new a0.h();
            }
            if (g0Var.T1.d(o11)) {
                g0Var.T1.l(o11);
                c2Var3.c(false, true);
            } else {
                g0Var.T1.k(a22, o11);
                c2Var3.c(true, true);
            }
            g0Var.Q1.O(true);
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.za0
    public void d(int i3) {
        m2 m2Var = (m2) this.b;
        if (i3 == 0) {
            m2Var.run();
        }
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        return ((String[]) this.b)[i3];
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        Object O;
        uj ujVar = (uj) this.b;
        u4.h0 adapter = ujVar.r.getAdapter();
        nj njVar = ujVar.w;
        if (adapter == njVar) {
            O = njVar.E(i3);
        } else {
            tj tjVar = ujVar.E;
            O = tjVar.O(tjVar.S(i3), tjVar.Q(i3));
        }
        return ujVar.T(view, O);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                sf.b h = s1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.c2);
                ConnectionsManager.getInstance(zVar.a).sendRequestTyped(deletetone, new c3.b(1), new ai.n0(zVar, h, s1Var, 7));
                break;
            case 2:
                ((o4.b1) this.b).run();
                break;
            case 3:
                ((ci.e3) this.b).run();
                break;
            case 4:
                ((cg.k0) this.b).run();
                break;
            case 5:
                ((q1) this.b).run();
                break;
            case 6:
                ((er) this.b).run();
                break;
            case 8:
                ((h2) this.b).run();
                break;
            case 17:
                ((nf) this.b).a.V0.r();
                break;
            case 19:
                ((org.telegram.ui.lo) this.b).run();
                org.telegram.messenger.hp.e1().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((an) this.b).b.dismiss();
                break;
            case 24:
                ((gm) this.b).a.F.r();
                break;
            default:
                ((gt) this.b).a.d.r();
                break;
        }
    }

    @Override // xh.a
    public void h(Canvas canvas, int i3) {
        ((fb) this.b).dispatchDrawImplBlur(canvas, i3);
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        ArrayList arrayList;
        String str;
        switch (this.a) {
            case 26:
                up upVar = ((vp) this.b).a;
                if (i3 != 1 && i3 != 2) {
                    if (i3 == 3) {
                        upVar.b();
                        break;
                    }
                } else {
                    upVar.a(i3 == 2);
                    break;
                }
                break;
            default:
                pu puVar = (pu) this.b;
                org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
                bu buVar = puVar.m1;
                if (buVar != null && (arrayList = buVar.b) != null && !arrayList.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) buVar.b.get(0);
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet == null || !stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.hp.s1(puVar.a).V2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.hp.s1(puVar.a).V2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i3 == 1) {
                        Context parentActivity = d2Var != null ? d2Var.getParentActivity() : null;
                        if (parentActivity == null) {
                            parentActivity = puVar.getContext();
                        }
                        eu euVar = new eu(puVar, parentActivity, str2, str2, puVar.J0);
                        if (d2Var == null) {
                            euVar.show();
                            break;
                        } else {
                            d2Var.showDialog(euVar);
                            break;
                        }
                    } else if (i3 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new fc((FrameLayout) puVar.b, puVar.J0).k(false).j();
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                }
                break;
        }
    }

    @Override // ei.n9
    public boolean j(long j10, int i3, int i10, int i11, ei.o9 o9Var) {
        fn fnVar = (fn) ((org.telegram.ui.Cells.j6) this.b).T;
        ImageReceiver imageReceiver = fnVar.a;
        o9Var.c = imageReceiver;
        o9Var.l = imageReceiver;
        org.telegram.ui.Cells.j6 j6Var = fnVar.H;
        o9Var.m = j6Var;
        boolean z10 = j6Var.w;
        fn fnVar2 = fnVar.L.e;
        o9Var.a = fnVar2;
        o9Var.k = fnVar2.getAlpha();
        o9Var.h = 0.0f;
        o9Var.i = org.telegram.messenger.g0.q.y;
        o9Var.g = (View) fnVar.getParent();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) ((k.a) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && f1Var != null && f1Var.isShowing()) {
            f1Var.d(true);
        }
    }

    @Override // org.telegram.ui.Components.ab0
    public void l(cb0 cb0Var, int i3) {
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.b;
        try {
            if (i3 == 0) {
                w3Var.setText(org.telegram.messenger.bd.M0(2131751435, null));
            } else {
                w3Var.setText(org.telegram.messenger.bd.M0(2131745550, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new c6((o6) obj, 1));
                duration.start();
                break;
            default:
                k9 k9Var = (k9) obj;
                if (z10 && !z11) {
                    k9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // t0.e
    public boolean m(y00 y00Var, int i3, Bundle bundle) {
        tf tfVar = (tf) this.b;
        ChatActivityEnterView chatActivityEnterView = tfVar.a2;
        if (chatActivityEnterView.q5) {
            return true;
        }
        int i10 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i3 & 1) != 0) {
            try {
                ((t0.h) y00Var.a).b();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) y00Var.a;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.yy.x0(hVar.a(), null)) {
            tfVar.I(hVar.a(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            t4.L(chatActivityEnterView.P2, chatActivityEnterView.Q2.a(), new org.telegram.ui.jo(15, tfVar, y00Var), chatActivityEnterView.X3);
            return true;
        }
        tfVar.K(y00Var, true, 0, 0);
        return true;
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        int i3;
        int i10;
        org.telegram.messenger.ye yeVar;
        gl glVar = (gl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = glVar.e;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (glVar.a == null || biVar.N1 || chatAttachAlertPhotoLayout.Q == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.r1 = false;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
            i3 = options.outWidth;
            try {
                i10 = options.outHeight;
            } catch (Exception unused) {
                i10 = 0;
                int i11 = i3;
                int i12 = ChatAttachAlertPhotoLayout.v1;
                ChatAttachAlertPhotoLayout.v1 = i12 - 1;
                yeVar = new org.telegram.messenger.ye(i12, glVar.a.getAbsolutePath(), 0, true, i11, i10);
                yeVar.E = (int) (j10 / 1000.0f);
                yeVar.c = str;
                if (biVar.L2 != 0) {
                    org.telegram.messenger.re reVar = new org.telegram.messenger.re();
                    yeVar.A = reVar;
                    reVar.l = true;
                    reVar.u = false;
                    reVar.v = 1.0f;
                }
                chatAttachAlertPhotoLayout.m0(yeVar, false, false);
            }
        } catch (Exception unused2) {
            i3 = 0;
        }
        int i112 = i3;
        int i122 = ChatAttachAlertPhotoLayout.v1;
        ChatAttachAlertPhotoLayout.v1 = i122 - 1;
        yeVar = new org.telegram.messenger.ye(i122, glVar.a.getAbsolutePath(), 0, true, i112, i10);
        yeVar.E = (int) (j10 / 1000.0f);
        yeVar.c = str;
        if (biVar.L2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
            org.telegram.messenger.re reVar2 = new org.telegram.messenger.re();
            yeVar.A = reVar2;
            reVar2.l = true;
            reVar2.u = false;
            reVar2.v = 1.0f;
        }
        chatAttachAlertPhotoLayout.m0(yeVar, false, false);
    }

    @Override // ei.n9
    public void r(long j10, int i3, ei.o3 o3Var) {
        o3Var.run();
    }

    @Override // qe.d
    public void s1() {
        w5 w5Var = (w5) this.b;
        w5Var.b();
        w5Var.e();
    }

    @Override // qe.d
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // qe.d
    public /* synthetic */ boolean x(float f10) {
        return false;
    }

    private final /* synthetic */ void q(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void s(ImageReceiver imageReceiver) {
    }

    @Override // ei.n9
    public /* synthetic */ void c(boolean z10) {
    }

    @Override // qe.d
    public /* synthetic */ void o(boolean z10) {
    }

    @Override // qe.d
    public /* synthetic */ void G() {
    }

    @Override // qe.d
    public /* synthetic */ void a() {
    }

    private final /* synthetic */ void n(int i3, Drawable drawable) {
    }

    private final /* synthetic */ void p(int i3, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
