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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements org.telegram.ui.ActionBar.q1, hj0, eb0, fb0, gb0, te.d, org.telegram.messenger.kc, r4, r0.m, wh.a, t0.e, ij0, CameraController.VideoTakeCallback, org.telegram.ui.Cells.o5, fi.e9, org.telegram.ui.ActionBar.l0, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 12:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new c6((o6) obj, 1));
                duration.start();
                break;
            default:
                i9 i9Var = (i9) obj;
                if (z10 && !z11) {
                    i9Var.a();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        ((c8) this.b).R0(i7 * 60, i7 == 0 ? 71 : 70);
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        ta taVar = (ta) this.b;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        sa saVar = taVar.a;
        if (saVar != null) {
            saVar.setPadding(I0.a, I0.b, I0.c, I0.d);
        }
        view.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        Object O;
        dk dkVar = (dk) this.b;
        v4.h0 adapter = dkVar.r.getAdapter();
        vj vjVar = dkVar.w;
        if (adapter == vjVar) {
            O = vjVar.E(i7);
        } else {
            ck ckVar = dkVar.E;
            O = ckVar.O(ckVar.S(i7), ckVar.Q(i7));
        }
        return dkVar.U(view, O);
    }

    @Override // te.d
    public void b0() {
        w5 w5Var = (w5) this.b;
        w5Var.b();
        w5Var.e();
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // fi.e9
    public void d(long j3, int i7, fi.g3 g3Var) {
        g3Var.run();
    }

    @Override // org.telegram.ui.Components.eb0
    public String e(int i7) {
        return ((String[]) this.b)[i7];
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
    @Override // org.telegram.ui.Components.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(float f10, float f11, int i7, View view) {
        boolean z10;
        ArrayList arrayList;
        f0 f0Var = (f0) this.b;
        b41 G = f0Var.T1.G(i7 - 1);
        if (G == null) {
            return;
        }
        int i10 = G.a;
        if (i10 == 41 || i10 == 35) {
            if (i10 == 41) {
                if (org.telegram.messenger.hd.a0) {
                }
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                if (!z10) {
                    c2Var.c(!c2Var.b(), true);
                }
                switch (G.d) {
                    case 2:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = f0Var.U1;
                            boolean b10 = c2Var.b();
                            tL_channelAdminLogEventsFilter.edit_rank = b10;
                            tL_channelAdminLogEventsFilter.leave = b10;
                            tL_channelAdminLogEventsFilter.join = b10;
                            tL_channelAdminLogEventsFilter.invite = b10;
                            tL_channelAdminLogEventsFilter.demote = b10;
                            tL_channelAdminLogEventsFilter.promote = b10;
                            if (f0Var.X1) {
                                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = f0Var.U1;
                                boolean b11 = c2Var.b();
                                tL_channelAdminLogEventsFilter2.unban = b11;
                                tL_channelAdminLogEventsFilter2.unkick = b11;
                                tL_channelAdminLogEventsFilter2.ban = b11;
                                tL_channelAdminLogEventsFilter2.kick = b11;
                                break;
                            }
                        } else {
                            f0Var.Z1 = !f0Var.Z1;
                            break;
                        }
                        break;
                    case 3:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter3 = f0Var.U1;
                        boolean b12 = c2Var.b();
                        tL_channelAdminLogEventsFilter3.demote = b12;
                        tL_channelAdminLogEventsFilter3.promote = b12;
                        break;
                    case 4:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter4 = f0Var.U1;
                        boolean b13 = c2Var.b();
                        tL_channelAdminLogEventsFilter4.unban = b13;
                        tL_channelAdminLogEventsFilter4.unkick = b13;
                        tL_channelAdminLogEventsFilter4.ban = b13;
                        tL_channelAdminLogEventsFilter4.kick = b13;
                        break;
                    case 5:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter5 = f0Var.U1;
                        boolean b14 = c2Var.b();
                        tL_channelAdminLogEventsFilter5.join = b14;
                        tL_channelAdminLogEventsFilter5.invite = b14;
                        break;
                    case 6:
                        f0Var.U1.leave = c2Var.b();
                        break;
                    case 7:
                        f0Var.U1.edit_rank = c2Var.b();
                        break;
                    case 8:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter6 = f0Var.U1;
                            boolean b15 = c2Var.b();
                            tL_channelAdminLogEventsFilter6.group_call = b15;
                            tL_channelAdminLogEventsFilter6.invites = b15;
                            tL_channelAdminLogEventsFilter6.settings = b15;
                            tL_channelAdminLogEventsFilter6.info = b15;
                            break;
                        } else {
                            f0Var.a2 = !f0Var.a2;
                            break;
                        }
                    case 9:
                        TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter7 = f0Var.U1;
                        boolean b16 = c2Var.b();
                        tL_channelAdminLogEventsFilter7.settings = b16;
                        tL_channelAdminLogEventsFilter7.info = b16;
                        break;
                    case 10:
                        f0Var.U1.invites = c2Var.b();
                        break;
                    case 11:
                        f0Var.U1.group_call = c2Var.b();
                        break;
                    case 12:
                        if (!z10) {
                            TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter8 = f0Var.U1;
                            boolean b17 = c2Var.b();
                            tL_channelAdminLogEventsFilter8.pinned = b17;
                            tL_channelAdminLogEventsFilter8.edit = b17;
                            tL_channelAdminLogEventsFilter8.delete = b17;
                            break;
                        } else {
                            f0Var.b2 = !f0Var.b2;
                            break;
                        }
                    case 13:
                        f0Var.U1.delete = c2Var.b();
                        break;
                    case 14:
                        f0Var.U1.edit = c2Var.b();
                        break;
                    case 15:
                        f0Var.U1.pinned = c2Var.b();
                        break;
                    case 16:
                        if (f0Var.W1 == null) {
                            f0Var.W1 = new a0.h();
                        }
                        f0Var.W1.b();
                        if (c2Var.b() && (arrayList = f0Var.V1) != null) {
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                long o4 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) obj).peer);
                                f0Var.W1.k(org.telegram.messenger.np.s1(f0Var.a).a2(Long.valueOf(o4)), o4);
                            }
                            break;
                        }
                        break;
                }
                f0Var.T1.O(true);
            }
            z10 = false;
            org.telegram.ui.Cells.c2 c2Var2 = (org.telegram.ui.Cells.c2) view;
            if (!z10) {
            }
            switch (G.d) {
            }
            f0Var.T1.O(true);
        }
        int i12 = G.d;
        if (i12 < 0) {
            org.telegram.ui.Cells.c2 c2Var3 = (org.telegram.ui.Cells.c2) view;
            int i13 = (-i12) - 1;
            if (i13 < 0 || i13 >= f0Var.V1.size()) {
                return;
            }
            long o10 = org.telegram.messenger.m5.o(((TLRPC.ChannelParticipant) f0Var.V1.get(i13)).peer);
            TLRPC.User a22 = org.telegram.messenger.np.s1(f0Var.a).a2(Long.valueOf(o10));
            if (f0Var.W1 == null) {
                f0Var.W1 = new a0.h();
            }
            if (f0Var.W1.d(o10)) {
                f0Var.W1.l(o10);
                c2Var3.c(false, true);
            } else {
                f0Var.W1.k(a22, o10);
                c2Var3.c(true, true);
            }
            f0Var.T1.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        ArrayList arrayList;
        String str;
        switch (this.a) {
            case 26:
                cq cqVar = ((dq) this.b).a;
                if (i7 != 1 && i7 != 2) {
                    if (i7 == 3) {
                        cqVar.b();
                        break;
                    }
                } else {
                    cqVar.a(i7 == 2);
                    break;
                }
                break;
            default:
                wu wuVar = (wu) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
                iu iuVar = wuVar.p1;
                if (iuVar != null && (arrayList = iuVar.b) != null && !arrayList.isEmpty()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) iuVar.b.get(0);
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet == null || !stickerSet.emojis) {
                        str = "https://" + org.telegram.messenger.np.s1(wuVar.a).V2 + "/addstickers/" + tL_messages_stickerSet.set.short_name;
                    } else {
                        str = "https://" + org.telegram.messenger.np.s1(wuVar.a).V2 + "/addemoji/" + tL_messages_stickerSet.set.short_name;
                    }
                    String str2 = str;
                    if (i7 == 1) {
                        Context parentActivity = e2Var != null ? e2Var.getParentActivity() : null;
                        if (parentActivity == null) {
                            parentActivity = wuVar.getContext();
                        }
                        lu luVar = new lu(wuVar, parentActivity, str2, str2, wuVar.J0);
                        if (e2Var == null) {
                            luVar.show();
                            break;
                        } else {
                            e2Var.showDialog(luVar);
                            break;
                        }
                    } else if (i7 == 2) {
                        try {
                            org.telegram.messenger.g0.g(str2);
                            new cc((FrameLayout) wuVar.b, wuVar.J0).k(false).j();
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
                y yVar = (y) this.b;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f2);
                ConnectionsManager.getInstance(yVar.a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(yVar, h, t1Var, 7));
                break;
            case 2:
                ((org.telegram.ui.ActionBar.m5) this.b).run();
                break;
            case 3:
                ((di.x2) this.b).run();
                break;
            case 4:
                ((bg.l0) this.b).run();
                break;
            case 5:
                ((p1) this.b).run();
                break;
            case 6:
                ((lr) this.b).run();
                break;
            case 8:
                ((i2) this.b).run();
                break;
            case 17:
                ((wf) this.b).a.V0.r();
                break;
            case 19:
                ((od) this.b).run();
                org.telegram.messenger.np.e1().edit().putBoolean("trimvoicehint", false).apply();
                break;
            case 23:
                ((jn) this.b).b.dismiss();
                break;
            case 24:
                ((pm) this.b).a.F.r();
                break;
            default:
                ((pt) this.b).a.d.r();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb0
    public void i(int i7) {
        o2 o2Var = (o2) this.b;
        if (i7 == 0) {
            o2Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) ((k.a) this.b).b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g1Var != null && g1Var.isShowing()) {
            g1Var.d(true);
        }
    }

    @Override // wh.a
    public void k(Canvas canvas, int i7) {
        ((cb) this.b).dispatchDrawImplBlur(canvas, i7);
    }

    @Override // fi.e9
    public boolean l(long j3, int i7, int i10, int i11, fi.f9 f9Var) {
        on onVar = (on) ((org.telegram.ui.Cells.j6) this.b).T;
        ImageReceiver imageReceiver = onVar.a;
        f9Var.c = imageReceiver;
        f9Var.l = imageReceiver;
        org.telegram.ui.Cells.j6 j6Var = onVar.H;
        f9Var.m = j6Var;
        boolean z10 = j6Var.w;
        on onVar2 = onVar.L.e;
        f9Var.a = onVar2;
        f9Var.k = onVar2.getAlpha();
        f9Var.h = 0.0f;
        f9Var.i = org.telegram.messenger.g0.q.y;
        f9Var.g = (View) onVar.getParent();
        return true;
    }

    @Override // org.telegram.ui.Components.gb0
    public void m(ib0 ib0Var, int i7) {
        org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) this.b;
        try {
            if (i7 == 0) {
                w3Var.setText(org.telegram.messenger.hd.M0(2131751434, null));
            } else {
                w3Var.setText(org.telegram.messenger.hd.M0(2131745540, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // t0.e
    public boolean o(ff ffVar, int i7, Bundle bundle) {
        bg bgVar = (bg) this.b;
        ChatActivityEnterView chatActivityEnterView = bgVar.f2;
        if (chatActivityEnterView.K6) {
            return true;
        }
        int i10 = n0.a.a;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                ((t0.h) ffVar.b).e();
            } catch (Exception unused) {
                return false;
            }
        }
        t0.h hVar = (t0.h) ffVar.b;
        if (!hVar.getDescription().hasMimeType("image/gif") && !org.telegram.messenger.ez.x0(hVar.c(), null)) {
            bgVar.J(hVar.c(), hVar.getDescription().getMimeType(0));
            return true;
        }
        if (chatActivityEnterView.c()) {
            t4.J(chatActivityEnterView.w3, chatActivityEnterView.x3.a(), new f1(9, bgVar, ffVar), chatActivityEnterView.E4);
            return true;
        }
        bgVar.L(ffVar, true, 0, 0);
        return true;
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        int i7;
        int i10;
        org.telegram.messenger.ff ffVar;
        ol olVar = (ol) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = olVar.e;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (olVar.a == null || kiVar.Q1 || chatAttachAlertPhotoLayout.Q == null) {
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
                ffVar = new org.telegram.messenger.ff(i12, olVar.a.getAbsolutePath(), 0, true, i11, i10);
                ffVar.E = (int) (j3 / 1000.0f);
                ffVar.c = str;
                if (kiVar.O2 != 0) {
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
        ffVar = new org.telegram.messenger.ff(i122, olVar.a.getAbsolutePath(), 0, true, i112, i10);
        ffVar.E = (int) (j3 / 1000.0f);
        ffVar.c = str;
        if (kiVar.O2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
            org.telegram.messenger.xe xeVar2 = new org.telegram.messenger.xe();
            ffVar.A = xeVar2;
            xeVar2.l = true;
            xeVar2.u = false;
            xeVar2.v = 1.0f;
        }
        chatAttachAlertPhotoLayout.m0(ffVar, false, false);
    }

    @Override // te.d
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean s(float f10) {
        return false;
    }

    private final /* synthetic */ void t(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void u(ImageReceiver imageReceiver) {
    }

    @Override // fi.e9
    public /* synthetic */ void c(boolean z10) {
    }

    @Override // te.d
    public /* synthetic */ void n(boolean z10) {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }

    @Override // te.d
    public /* synthetic */ void v() {
    }

    private final /* synthetic */ void p(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void r(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
