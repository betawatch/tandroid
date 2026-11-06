package bi;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.af;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ q3(KeyEvent.Callback callback, Object obj, Object obj2, long j3, TLObject tLObject, TLObject tLObject2, int i7) {
        this.a = i7;
        this.c = callback;
        this.d = obj;
        this.e = obj2;
        this.b = j3;
        this.f = tLObject;
        this.g = tLObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z9;
        int i7;
        AlertDialog$Builder alertDialog$Builder;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                vf.b bVar = (vf.b) this.d;
                wg.f1 f1Var = (wg.f1) this.e;
                long j3 = this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (org.telegram.ui.Wallet.n0.x(k7Var.a).v() < stargiftdepositpayload.amount) {
                    bVar.b();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
                    alertDialog$Builder2.a.R = org.telegram.messenger.hd.M0(2131743067, null);
                    alertDialog$Builder2.a.T = org.telegram.messenger.hd.V(null, null, 2131743066, org.telegram.ui.Wallet.n0.n(stargiftdepositpayload.amount, false));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131743065, null), null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131742991, null), new ab.g(5, k7Var, f1Var));
                    alertDialog$Builder2.p();
                    break;
                } else {
                    TLRPC.User a22 = j3 > 0 ? qp.s1(k7Var.a).a2(Long.valueOf(j3)) : null;
                    long e10 = p10.i(k7Var.a).e();
                    TLRPC.Document document = tL_starGiftUnique.getDocument();
                    int i10 = k7Var.a;
                    org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i10);
                    e4 e4Var = new e4(k7Var, bVar, f1Var, 0);
                    f4 f4Var = j3 != e10 ? null : new f4(i10, e10, document);
                    try {
                        x10.d0(a22, stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? org.telegram.ui.Wallet.n0.V(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address, 0L, null, null, nftitem, null, e4Var, f4Var == null ? null : new org.telegram.ui.Wallet.t(1, x10, f4Var), org.telegram.ui.Wallet.n0.h(stargiftdepositpayload));
                        break;
                    } catch (Exception e11) {
                        org.telegram.ui.Wallet.n0.k("depositNFT: invalid payload", e11);
                        e4Var.a(e11.getMessage() == null ? "NULL_ERROR" : e11.getMessage());
                        return;
                    }
                }
            case 1:
                final qp qpVar = (qp) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                an anVar = (an) this.e;
                final af afVar = (af) this.f;
                final long j10 = this.b;
                final org.telegram.ui.ae aeVar = (org.telegram.ui.ae) this.g;
                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                if (u1Var != null) {
                    u1Var.c(200L);
                }
                Context parentActivity = anVar.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.g0.W(LaunchActivity.G1);
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                final org.telegram.ui.ActionBar.f6 resourceProvider = T == null ? null : T.getResourceProvider();
                final boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                boolean z10 = ((org.telegram.messenger.h0) qpVar.x7.m.b).c && !TextUtils.isEmpty(qpVar.u6);
                boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                if (!z10) {
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, resourceProvider);
                        c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                        c2Var.e(org.telegram.messenger.hd.M0(2131748481, null), "", zArr[0], false, false);
                        z9 = z10;
                        c2Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                        frameLayout.addView(c2Var, c8.ha.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        i7 = 1;
                        c2Var.setOnClickListener(new org.telegram.messenger.b9(zArr, 1));
                        final boolean[] zArr2 = new boolean[i7];
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                        alertDialog$Builder3.a.R = org.telegram.messenger.hd.M0(2131748476, null);
                        alertDialog$Builder3.a.T = org.telegram.messenger.hd.M0(!z11 ? 2131748478 : 2131748479, null);
                        alertDialog$Builder3.o(frameLayout);
                        alertDialog$Builder3.a.G = 9;
                        alertDialog$Builder3.h(org.telegram.messenger.hd.M0(!z11 ? 2131748477 : 2131752589, null), null);
                        alertDialog$Builder3.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.tm
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                if (zArr2[0]) {
                                    return;
                                }
                                afVar.run();
                            }
                        });
                        if (z11) {
                            final Context context = parentActivity;
                            alertDialog$Builder = alertDialog$Builder3;
                            final boolean z12 = z9;
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748480, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.messenger.um
                                @Override // org.telegram.ui.ActionBar.r1
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i11) {
                                    TL_account.contentSettings contentsettings2;
                                    qp qpVar2 = qp.this;
                                    boolean z13 = z12;
                                    long j11 = j10;
                                    boolean[] zArr3 = zArr2;
                                    org.telegram.ui.ae aeVar2 = aeVar;
                                    if (z13 || (zArr[0] && (contentsettings2 = contentsettings) != null && contentsettings2.sensitive_can_change)) {
                                        ThemeActivity.H0(qpVar2.currentAccount, context, new w00(qpVar2, j11, zArr3, aeVar2, 2), resourceProvider);
                                        return;
                                    }
                                    qpVar2.V7.add(Long.valueOf(j11));
                                    zArr3[0] = true;
                                    aeVar2.run();
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
                i7 = 1;
                z9 = z10;
                final boolean[] zArr22 = new boolean[i7];
                AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                alertDialog$Builder32.a.R = org.telegram.messenger.hd.M0(2131748476, null);
                alertDialog$Builder32.a.T = org.telegram.messenger.hd.M0(!z11 ? 2131748478 : 2131748479, null);
                alertDialog$Builder32.o(frameLayout);
                alertDialog$Builder32.a.G = 9;
                alertDialog$Builder32.h(org.telegram.messenger.hd.M0(!z11 ? 2131748477 : 2131752589, null), null);
                alertDialog$Builder32.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.tm
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (zArr22[0]) {
                            return;
                        }
                        afVar.run();
                    }
                });
                if (z11) {
                }
                alertDialog$Builder.p();
                break;
            case 2:
                org.telegram.messenger.g0.h3(new bg.h0((m50) this.c, (org.telegram.ui.ActionBar.u1) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
            default:
                org.telegram.messenger.g0.h3(new bg.h0((m11) this.c, (TLRPC.ChannelParticipant) obj, (org.telegram.ui.ActionBar.z0) this.d, (k60) this.e, this.b, (TLRPC.User) this.f, (TLRPC.Chat) this.g));
                break;
        }
    }

    public /* synthetic */ q3(qp qpVar, org.telegram.ui.ActionBar.u1 u1Var, an anVar, af afVar, long j3, org.telegram.ui.ae aeVar) {
        this.a = 1;
        this.c = qpVar;
        this.d = u1Var;
        this.e = anVar;
        this.f = afVar;
        this.b = j3;
        this.g = aeVar;
    }
}
