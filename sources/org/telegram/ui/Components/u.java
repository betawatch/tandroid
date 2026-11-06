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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements org.telegram.ui.ActionBar.r1, cj0, db0, eb0, fb0, te.d, org.telegram.messenger.lc, t4, r0.m, wh.a, t0.e, dj0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, di.l9, org.telegram.ui.ActionBar.m0, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.d
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean B(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        ((f8) this.b).X0(i7 * 60, i7 == 0 ? 71 : 70);
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        xa xaVar = (xa) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        wa waVar = xaVar.a;
        if (waVar != null) {
            waVar.setPadding(I0.a, I0.b, I0.c, I0.d);
        }
        view.requestLayout();
        return r0.k1.b;
    }

    @Override // te.d
    public void Y0() {
        y5 y5Var = (y5) this.b;
        y5Var.b();
        y5Var.e();
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        Object O;
        vj vjVar = (vj) this.b;
        v4.g0 adapter = vjVar.r.getAdapter();
        oj ojVar = vjVar.w;
        if (adapter == ojVar) {
            O = ojVar.E(i7);
        } else {
            uj ujVar = vjVar.D;
            O = ujVar.O(ujVar.S(i7), ujVar.Q(i7));
        }
        return vjVar.T(view, O);
    }

    @Override // org.telegram.ui.Components.eb0
    public void d(int i7) {
        p2 p2Var = (p2) this.b;
        if (i7 == 0) {
            p2Var.run();
        }
    }

    @Override // di.l9
    public void e(long j3, int i7, di.l3 l3Var) {
        l3Var.run();
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
    @Override // org.telegram.ui.Components.cj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        boolean z9;
        ArrayList arrayList;
        i0 i0Var = (i0) this.b;
        x31 G = i0Var.P1.G(i7 - 1);
        if (G == null) {
            return;
        }
        int i10 = G.a;
        if (i10 == 41 || i10 == 35) {
            if (i10 == 41) {
                if (org.telegram.messenger.hd.a0) {
                }
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (!z9) {
                    c2Var.c(!c2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z9) {
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
                        if (!z9) {
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
                        if (!z9) {
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
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                long o4 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) obj).peer);
                                i0Var.S1.k(org.telegram.messenger.qp.s1(i0Var.a).a2(Long.valueOf(o4)), o4);
                            }
                            break;
                        }
                        break;
                }
                i0Var.P1.O(true);
            }
            z9 = false;
            org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
            if (!z9) {
            }
            switch (G.d) {
            }
            i0Var.P1.O(true);
        }
        int i12 = G.d;
        if (i12 < 0) {
            org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
            int i13 = (-i12) - 1;
            if (i13 < 0 || i13 >= i0Var.R1.size()) {
                return;
            }
            long o10 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) i0Var.R1.get(i13)).peer);
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i0Var.a).a2(Long.valueOf(o10));
            if (i0Var.S1 == null) {
                i0Var.S1 = new a0.h();
            }
            if (i0Var.S1.d(o10)) {
                i0Var.S1.l(o10);
                c2Var3.c(false, true);
            } else {
                i0Var.S1.k(a22, o10);
                c2Var3.c(true, true);
            }
            i0Var.P1.O(true);
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new e6((q6) obj, 1));
                duration.start();
                break;
            default:
                l9 l9Var = (l9) obj;
                if (z9 && !z10) {
                    l9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(a0Var.b2);
                ConnectionsManager.getInstance(a0Var.a).sendRequestTyped(deletetone, new d3.b(1), new bi.t0(a0Var, h, u1Var, 5));
                break;
            case 2:
                ((org.telegram.ui.m6) this.b).run();
                break;
            case 3:
                ((bi.r3) this.b).run();
                break;
            case 4:
                ((bg.l0) this.b).run();
                break;
            case 5:
                ((r1) this.b).run();
                break;
            case 6:
                ((er) this.b).run();
                break;
            case 8:
                ((j2) this.b).run();
                break;
            case 17:
                ((pf) this.b).a.U0.r();
                break;
            case 19:
                ((f) this.b).run();
                org.telegram.messenger.qp.e1().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((bn) this.b).b.dismiss();
                break;
            case 24:
                ((hm) this.b).a.E.r();
                break;
            default:
                ((ht) this.b).a.d.r();
                break;
        }
    }

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        return ((String[]) this.b)[i7];
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        ArrayList arrayList;
        String str;
        switch (this.a) {
            case 26:
                up upVar = ((vp) this.b).a;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        upVar.b();
                        break;
                    }
                } else {
                    upVar.a(i7 == 2);
                    break;
                }
                break;
            default:
                qu quVar = (qu) this.b;
                org.telegram.ui.ActionBar.f2 f2Var = quVar.j1;
                cu cuVar = quVar.l1;
                if (cuVar != null && (arrayList = cuVar.b) != null && !arrayList.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) cuVar.b.get(0);
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet == null || !stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.qp.s1(quVar.a).U2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.qp.s1(quVar.a).U2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        Context parentActivity = f2Var != null ? f2Var.getParentActivity() : null;
                        if (parentActivity == null) {
                            parentActivity = quVar.getContext();
                        }
                        fu fuVar = new fu(quVar, parentActivity, str2, str2, quVar.I0);
                        if (f2Var == null) {
                            fuVar.show();
                            break;
                        } else {
                            f2Var.showDialog(fuVar);
                            break;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new hc((FrameLayout) quVar.b, quVar.I0).k(false).j();
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g1Var != null && g1Var.isShowing()) {
            g1Var.d(true);
        }
    }

    @Override // t0.e
    public boolean k(qt qtVar, int i7, Bundle bundle) {
        vf vfVar = (vf) this.b;
        ChatActivityEnterView chatActivityEnterView = vfVar.Z1;
        if (chatActivityEnterView.p5) {
            return true;
        }
        int i10 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) qtVar.b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) qtVar.b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.gz.x0(hVar.c(), null)) {
            vfVar.I(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            v4.J(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new f2(5, vfVar, qtVar), chatActivityEnterView.W3);
            return true;
        }
        vfVar.K(qtVar, true, 0, 0);
        return true;
    }

    @Override // wh.a
    public void m(Canvas canvas, int i7) {
        ((gb) this.b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override // org.telegram.ui.Components.fb0
    public void n(hb0 hb0Var, int i7) {
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.b;
        try {
            if (i7 == 0) {
                w3Var.setText(org.telegram.messenger.hd.M0(2131751435, null));
            } else {
                w3Var.setText(org.telegram.messenger.hd.M0(2131745541, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // di.l9
    public boolean o(long j3, int i7, int i10, int i11, di.m9 m9Var) {
        gn gnVar = (gn) ((org.telegram.ui.Cells.k6) this.b).T;
        ImageReceiver imageReceiver = gnVar.a;
        m9Var.c = imageReceiver;
        m9Var.l = imageReceiver;
        org.telegram.ui.Cells.k6 k6Var = gnVar.G;
        m9Var.m = k6Var;
        boolean z9 = k6Var.w;
        gn gnVar2 = gnVar.K.e;
        m9Var.a = gnVar2;
        m9Var.k = gnVar2.getAlpha();
        m9Var.h = 0.0f;
        m9Var.i = org.telegram.messenger.g0.q.y;
        m9Var.g = (View) gnVar.getParent();
        return true;
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.gf gfVar;
        hl hlVar = (hl) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hlVar.e;
        di diVar = chatAttachAlertPhotoLayout.b;
        if (hlVar.a == null || diVar.M1 || chatAttachAlertPhotoLayout.P == null) {
            return;
        }
        ChatAttachAlertPhotoLayout.q1 = false;
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
                int i12 = ChatAttachAlertPhotoLayout.u1;
                ChatAttachAlertPhotoLayout.u1 = i12 - 1;
                gfVar = new org.telegram.messenger.gf(i12, hlVar.a.getAbsolutePath(), 0, true, i11, i10);
                gfVar.E = (int) (j3 / 1000.0f);
                gfVar.c = str;
                if (diVar.K2 != 0) {
                    org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye();
                    gfVar.A = yeVar;
                    yeVar.l = true;
                    yeVar.u = false;
                    yeVar.v = 1.0f;
                }
                chatAttachAlertPhotoLayout.m0(gfVar, false, false);
            }
        } catch (Exception unused2) {
            i7 = 0;
        }
        int i112 = i7;
        int i122 = ChatAttachAlertPhotoLayout.u1;
        ChatAttachAlertPhotoLayout.u1 = i122 - 1;
        gfVar = new org.telegram.messenger.gf(i122, hlVar.a.getAbsolutePath(), 0, true, i112, i10);
        gfVar.E = (int) (j3 / 1000.0f);
        gfVar.c = str;
        if (diVar.K2 != 0 && chatAttachAlertPhotoLayout.P.isFrontface()) {
            org.telegram.messenger.ye yeVar2 = new org.telegram.messenger.ye();
            gfVar.A = yeVar2;
            yeVar2.l = true;
            yeVar2.u = false;
            yeVar2.v = 1.0f;
        }
        chatAttachAlertPhotoLayout.m0(gfVar, false, false);
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    private final /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void s(ImageReceiver imageReceiver) {
    }

    @Override // di.l9
    public /* synthetic */ void b(boolean z9) {
    }

    @Override // te.d
    public /* synthetic */ void l(boolean z9) {
    }

    @Override // te.d
    public /* synthetic */ void D() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }

    private final /* synthetic */ void p(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void q(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
