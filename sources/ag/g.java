package ag;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.FrameLayout;
import bi.d4;
import bi.w4;
import bi.y4;
import bi.z3;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.kh0;
import org.telegram.ui.lg;
import org.telegram.ui.ud1;
import rh.h8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bi.a aVar;
        w4 w4Var;
        org.telegram.ui.ActionBar.k2 Q;
        int i10 = this.a;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                j jVar = (j) obj;
                f6 f6Var = jVar.f;
                int i13 = jVar.a;
                boolean z10 = jVar.r;
                jVar.r = !z10;
                jVar.h.c(cd.L0(!z10 ? 2131753701 : 2131753698, null), true, true);
                f6Var.a();
                f6Var.c(cd.L0(jVar.r ? 2131753699 : 2131753700, null), true, true);
                if (jVar.r) {
                    jVar.x |= 1;
                } else {
                    jVar.x &= -2;
                }
                vp.r1(i13).e7.edit().putInt("dialog_botflags" + jVar.s, jVar.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = vp.r1(i13).i1(jVar.s);
                toggleconnectedbotpaused.paused = jVar.r;
                ConnectionsManager.getInstance(i13).sendRequest(toggleconnectedbotpaused, null);
                break;
            case 1:
                TL_account.TL_businessChatLink tL_businessChatLink = ((g0) obj).f;
                if (tL_businessChatLink != null) {
                    org.telegram.messenger.i0.g(tL_businessChatLink.link);
                    cc.a0(LaunchActivity.Q()).k(false).j();
                    break;
                }
                break;
            case 2:
                ((ai.c) obj).dismiss();
                break;
            case 3:
                ((androidx.mediarouter.app.g) obj).dismiss();
                break;
            case 4:
                bi.t tVar = (bi.t) obj;
                tVar.J(true, 0, 0, 0L, false);
                kh0 kh0Var = tVar.O;
                if (kh0Var != null) {
                    kh0Var.g(true);
                    tVar.O = null;
                    break;
                }
                break;
            case 5:
                bi.y0 y0Var = (bi.y0) obj;
                bi.l3 l3Var = y0Var.h;
                if (l3Var != null && (aVar = y0Var.f) != null) {
                    d4 d4Var = l3Var.a;
                    d4Var.getClass();
                    if (d4.A3(aVar)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                        bi.o2 o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        d4Var.f3.O(true);
                        bi.o2 o2Var2 = d4Var.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                            break;
                        }
                    }
                }
                break;
            case 6:
                y4 y4Var = (y4) obj;
                bi.a aVar2 = y4Var.a;
                if (aVar2 != null && (w4Var = y4Var.G) != null) {
                    ((z3) w4Var).a.o3.d0(aVar2);
                    break;
                }
                break;
            case 7:
                ((ig.u) obj).dismiss();
                break;
            case 8:
                ((lg) obj).run();
                break;
            case 9:
                ((o0) obj).run();
                break;
            case 10:
                ((jg.d3) obj).onBackPressed();
                break;
            case 11:
                ((p80) obj).performClick();
                break;
            case 12:
                PremiumPreviewFragment.t0();
                PremiumPreviewFragment.o0(((kg.v1) obj).l2, null, "profile", null);
                break;
            case 13:
                final mg.c1 c1Var = (mg.c1) obj;
                og.a aVar3 = c1Var.I2;
                if (!aVar3.a.Q) {
                    aVar3.b(true);
                    String str = c1Var.J2;
                    q20 q20Var = new q20() { // from class: mg.b1
                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj2) {
                            switch (i11) {
                                case 0:
                                    c1 c1Var2 = c1Var;
                                    c1Var2.I2.b(false);
                                    c1Var2.dismiss();
                                    org.telegram.messenger.i0.h3(new a1(c1Var2, 1), 200L);
                                    break;
                                default:
                                    c1 c1Var3 = c1Var;
                                    c1Var3.I2.b(false);
                                    p.c((TLRPC.TL_error) obj2, (FrameLayout) c1Var3.b, c1Var3.I0, new a1(c1Var3, 0));
                                    break;
                            }
                        }
                    };
                    q20 q20Var2 = new q20() { // from class: mg.b1
                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj2) {
                            switch (i12) {
                                case 0:
                                    c1 c1Var2 = c1Var;
                                    c1Var2.I2.b(false);
                                    c1Var2.dismiss();
                                    org.telegram.messenger.i0.h3(new a1(c1Var2, 1), 200L);
                                    break;
                                default:
                                    c1 c1Var3 = c1Var;
                                    c1Var3.I2.b(false);
                                    p.c((TLRPC.TL_error) obj2, (FrameLayout) c1Var3.b, c1Var3.I0, new a1(c1Var3, 0));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.s0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new mg.b0(q20Var2, q20Var, i11), 2);
                    break;
                }
                break;
            case 14:
                ((mg.f1) obj).dismiss();
                break;
            case 15:
                ((mg.x0) ((ng.f) obj)).r.dismiss();
                break;
            case 16:
                org.telegram.ui.ActionBar.y yVar = (org.telegram.ui.ActionBar.y) obj;
                org.telegram.ui.ActionBar.l lVar = yVar.b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) view;
                if (!t0Var.s()) {
                    if (!t0Var.u()) {
                        yVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        lVar.y(t0Var.T(true));
                        break;
                    }
                } else if (lVar.u0.a()) {
                    t0Var.U(null, null);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                break;
            case 18:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                z2Var.getClass();
                z2Var.N(((Integer) view.getTag()).intValue());
                break;
            case 19:
                l5 l5Var = (l5) obj;
                if (!l5Var.y.f) {
                    if (!l5Var.x.f) {
                        if (l5Var.c == k5.b) {
                            org.telegram.messenger.i0.F3(4.0f, l5Var, null);
                            break;
                        }
                    } else {
                        i5 i5Var = l5Var.a;
                        int i14 = l5Var.b;
                        org.telegram.ui.ActionBar.k kVar = i5Var.V;
                        if (kVar != null) {
                            kVar.b(i14);
                            break;
                        }
                    }
                }
                break;
            case 20:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                rVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 21:
                org.telegram.ui.Components.voip.e0 e0Var = (org.telegram.ui.Components.voip.e0) obj;
                if (!e0Var.a) {
                    if (e0Var.y != 0 || !e0Var.D) {
                        e0Var.b(false, true);
                        break;
                    } else {
                        ((Activity) e0Var.getContext()).startActivityForResult(((MediaProjectionManager) e0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 22:
                ud1 ud1Var = (ud1) obj;
                if (!ud1Var.a) {
                    if (ud1Var.x != 0) {
                        ud1Var.a(false, true);
                        break;
                    } else {
                        ((Activity) ud1Var.getContext()).startActivityForResult(((MediaProjectionManager) ud1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        break;
                    }
                }
                break;
            case 23:
                Context context = (Context) obj;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(TLObject.FLAG_28);
                    }
                    context.startActivity(action);
                    org.telegram.ui.Components.voip.s0.b();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jVar2.getContext());
                String L0 = cd.L0(2131742940, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131742941, null);
                alertDialog$Builder.k(cd.L0(2131747847, null), new org.telegram.ui.web.a(jVar2));
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                alertDialog$Builder.p();
                break;
            case 25:
                ((ph.c) obj).dismiss();
                break;
            case 26:
                ((ph.d0) obj).dismiss();
                break;
            case 27:
                if (((ph.l1) obj).W1.f > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    Q.showAsSheet(new h8(), i2Var);
                    break;
                }
                break;
            case 28:
                Runnable runnable = ((qg.c) obj).e;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                ((qh.n) obj).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                break;
        }
    }
}
