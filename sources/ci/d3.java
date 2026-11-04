package ci;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.i50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.e51;
import org.telegram.ui.wm;
import org.telegram.ui.xe;
import org.telegram.ui.yd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d3(KeyEvent.Callback callback, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i3) {
        this.a = i3;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.f = tLObject;
        this.g = tLObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z10;
        int i3;
        AlertDialog$Builder alertDialog$Builder;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.c;
                sf.b bVar = (sf.b) this.d;
                xg.e1 e1Var = (xg.e1) this.e;
                long j10 = this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (org.telegram.ui.Wallet.k0.x(l6Var.a).v() < stargiftdepositpayload.amount) {
                    bVar.b();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
                    alertDialog$Builder2.a.S = bd.M0(2131743076, null);
                    alertDialog$Builder2.a.U = bd.V(null, null, 2131743075, org.telegram.ui.Wallet.k0.n(stargiftdepositpayload.amount, false));
                    alertDialog$Builder2.h(bd.M0(2131743074, null), null);
                    alertDialog$Builder2.k(bd.M0(2131743000, null), new ai.n(10, l6Var, e1Var));
                    alertDialog$Builder2.p();
                    break;
                } else {
                    TLRPC.User a22 = j10 > 0 ? hp.s1(l6Var.a).a2(Long.valueOf(j10)) : null;
                    long e10 = h10.i(l6Var.a).e();
                    TLRPC.Document document = tL_starGiftUnique.getDocument();
                    int i10 = l6Var.a;
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                    p3 p3Var = new p3(l6Var, bVar, e1Var, 0);
                    q3 q3Var = j10 != e10 ? null : new q3(i10, e10, document);
                    try {
                        x10.d0(a22, stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? org.telegram.ui.Wallet.k0.V(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address, 0L, null, null, nftitem, null, p3Var, q3Var == null ? null : new e51(4, x10, q3Var), org.telegram.ui.Wallet.k0.h(stargiftdepositpayload));
                        break;
                    } catch (Exception e11) {
                        org.telegram.ui.Wallet.k0.k("depositNFT: invalid payload", e11);
                        p3Var.a(e11.getMessage() == null ? "NULL_ERROR" : e11.getMessage());
                        return;
                    }
                }
            case 1:
                final hp hpVar = (hp) this.c;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
                wm wmVar = (wm) this.e;
                final xe xeVar = (xe) this.f;
                final long j11 = this.b;
                final yd ydVar = (yd) this.g;
                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                if (s1Var != null) {
                    s1Var.c(200L);
                }
                Context parentActivity = wmVar.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.g0.W(LaunchActivity.K1);
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.K1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                final org.telegram.ui.ActionBar.e6 resourceProvider = T == null ? null : T.getResourceProvider();
                final boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                boolean z11 = ((org.telegram.messenger.h0) hpVar.x7.m.b).c && !TextUtils.isEmpty(hpVar.u6);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                if (!z11) {
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, resourceProvider);
                        c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                        c2Var.e(bd.M0(2131748490, null), "", zArr[0], false, false);
                        z10 = z11;
                        c2Var.setPadding(bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                        frameLayout.addView(c2Var, mf.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        i3 = 1;
                        c2Var.setOnClickListener(new org.telegram.messenger.a9(zArr, 1));
                        final boolean[] zArr2 = new boolean[i3];
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                        alertDialog$Builder3.a.S = bd.M0(2131748485, null);
                        alertDialog$Builder3.a.U = bd.M0(!z12 ? 2131748487 : 2131748488, null);
                        alertDialog$Builder3.o(frameLayout);
                        alertDialog$Builder3.a.H = 9;
                        alertDialog$Builder3.h(bd.M0(!z12 ? 2131748486 : 2131752589, null), null);
                        alertDialog$Builder3.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.jm
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                if (zArr2[0]) {
                                    return;
                                }
                                xeVar.run();
                            }
                        });
                        if (z12) {
                            final Context context = parentActivity;
                            alertDialog$Builder = alertDialog$Builder3;
                            final boolean z13 = z10;
                            alertDialog$Builder.k(bd.M0(2131748489, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.messenger.km
                                @Override // org.telegram.ui.ActionBar.p1
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i11) {
                                    TL_account.contentSettings contentsettings2;
                                    hp hpVar2 = hp.this;
                                    boolean z14 = z13;
                                    long j12 = j11;
                                    boolean[] zArr3 = zArr2;
                                    org.telegram.ui.yd ydVar2 = ydVar;
                                    if (z14 || (zArr[0] && (contentsettings2 = contentsettings) != null && contentsettings2.sensitive_can_change)) {
                                        ThemeActivity.H0(hpVar2.currentAccount, context, new o00(hpVar2, j12, zArr3, ydVar2, 2), resourceProvider);
                                        return;
                                    }
                                    hpVar2.V7.add(Long.valueOf(j12));
                                    zArr3[0] = true;
                                    ydVar2.run();
                                }
                            });
                        } else {
                            alertDialog$Builder = alertDialog$Builder3;
                        }
                        alertDialog$Builder.p();
                        break;
                    }
                } else {
                    zArr[0] = true;
                }
                i3 = 1;
                z10 = z11;
                final boolean[] zArr22 = new boolean[i3];
                AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                alertDialog$Builder32.a.S = bd.M0(2131748485, null);
                alertDialog$Builder32.a.U = bd.M0(!z12 ? 2131748487 : 2131748488, null);
                alertDialog$Builder32.o(frameLayout);
                alertDialog$Builder32.a.H = 9;
                alertDialog$Builder32.h(bd.M0(!z12 ? 2131748486 : 2131752589, null), null);
                alertDialog$Builder32.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.jm
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (zArr22[0]) {
                            return;
                        }
                        xeVar.run();
                    }
                });
                if (z12) {
                }
                alertDialog$Builder.p();
                break;
            case 2:
                org.telegram.messenger.g0.h3(new cg.g0((i50) this.c, (org.telegram.ui.ActionBar.s1) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
            default:
                org.telegram.messenger.g0.h3(new cg.g0((g11) this.c, (TLRPC.ChannelParticipant) obj, (org.telegram.ui.ActionBar.y0) this.d, (f60) this.e, this.b, (TLRPC.User) this.f, (TLRPC.Chat) this.g));
                break;
        }
    }

    public /* synthetic */ d3(hp hpVar, org.telegram.ui.ActionBar.s1 s1Var, wm wmVar, xe xeVar, long j10, yd ydVar) {
        this.a = 1;
        this.c = hpVar;
        this.d = s1Var;
        this.e = wmVar;
        this.f = xeVar;
        this.b = j10;
        this.g = ydVar;
    }
}
