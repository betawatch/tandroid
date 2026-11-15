package di;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.p50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.an;
import org.telegram.ui.uf;
import org.telegram.ui.x21;
import org.telegram.ui.yd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w2(KeyEvent.Callback callback, Object obj, Object obj2, long j3, TLObject tLObject, TLObject tLObject2, int i7) {
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
    @Override // org.telegram.messenger.z10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z10;
        int i7;
        AlertDialog$Builder alertDialog$Builder;
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.c;
                vf.b bVar = (vf.b) this.d;
                wg.c1 c1Var = (wg.c1) this.e;
                long j3 = this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (org.telegram.ui.Wallet.l0.x(c6Var.a).v() < stargiftdepositpayload.amount) {
                    bVar.b();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
                    alertDialog$Builder2.a.S = hd.M0(2131743066, null);
                    alertDialog$Builder2.a.U = hd.V(null, null, 2131743065, org.telegram.ui.Wallet.l0.n(stargiftdepositpayload.amount, false));
                    alertDialog$Builder2.h(hd.M0(2131743064, null), null);
                    alertDialog$Builder2.k(hd.M0(2131742990, null), new ab.g(16, c6Var, c1Var));
                    alertDialog$Builder2.p();
                    break;
                } else {
                    TLRPC.User a22 = j3 > 0 ? np.s1(c6Var.a).a2(Long.valueOf(j3)) : null;
                    long e10 = m10.i(c6Var.a).e();
                    TLRPC.Document document = tL_starGiftUnique.getDocument();
                    int i10 = c6Var.a;
                    org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i10);
                    g3 g3Var = new g3(c6Var, bVar, c1Var, 0);
                    h3 h3Var = j3 != e10 ? null : new h3(i10, e10, document);
                    try {
                        x10.d0(a22, stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? org.telegram.ui.Wallet.l0.V(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address, 0L, null, null, nftitem, null, g3Var, h3Var == null ? null : new x21(6, x10, h3Var), org.telegram.ui.Wallet.l0.h(stargiftdepositpayload));
                        break;
                    } catch (Exception e11) {
                        org.telegram.ui.Wallet.l0.k("depositNFT: invalid payload", e11);
                        g3Var.a(e11.getMessage() == null ? "NULL_ERROR" : e11.getMessage());
                        return;
                    }
                }
            case 1:
                final np npVar = (np) this.c;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
                an anVar = (an) this.e;
                final uf ufVar = (uf) this.f;
                final long j10 = this.b;
                final yd ydVar = (yd) this.g;
                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                if (t1Var != null) {
                    t1Var.c(200L);
                }
                Context parentActivity = anVar.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.g0.W(LaunchActivity.H1);
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                final org.telegram.ui.ActionBar.e6 resourceProvider = T == null ? null : T.getResourceProvider();
                final boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                boolean z11 = ((org.telegram.messenger.h0) npVar.y7.m.b).c && !TextUtils.isEmpty(npVar.v6);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                if (!z11) {
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, resourceProvider);
                        c2Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                        c2Var.e(hd.M0(2131748482, null), "", zArr[0], false, false);
                        z10 = z11;
                        c2Var.setPadding(hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                        frameLayout.addView(c2Var, c8.ja.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        i7 = 1;
                        c2Var.setOnClickListener(new org.telegram.messenger.a9(zArr, 1));
                        final boolean[] zArr2 = new boolean[i7];
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                        alertDialog$Builder3.a.S = hd.M0(2131748477, null);
                        alertDialog$Builder3.a.U = hd.M0(!z12 ? 2131748479 : 2131748480, null);
                        alertDialog$Builder3.o(frameLayout);
                        alertDialog$Builder3.a.H = 9;
                        alertDialog$Builder3.h(hd.M0(!z12 ? 2131748478 : 2131752589, null), null);
                        alertDialog$Builder3.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.qm
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                if (zArr2[0]) {
                                    return;
                                }
                                ufVar.run();
                            }
                        });
                        if (z12) {
                            final Context context = parentActivity;
                            alertDialog$Builder = alertDialog$Builder3;
                            final boolean z13 = z10;
                            alertDialog$Builder.k(hd.M0(2131748481, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.messenger.rm
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i11) {
                                    TL_account.contentSettings contentsettings2;
                                    np npVar2 = np.this;
                                    boolean z14 = z13;
                                    long j11 = j10;
                                    boolean[] zArr3 = zArr2;
                                    org.telegram.ui.yd ydVar2 = ydVar;
                                    if (z14 || (zArr[0] && (contentsettings2 = contentsettings) != null && contentsettings2.sensitive_can_change)) {
                                        ThemeActivity.H0(npVar2.currentAccount, context, new t00(npVar2, j11, zArr3, ydVar2, 2), resourceProvider);
                                        return;
                                    }
                                    npVar2.W7.add(Long.valueOf(j11));
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
                i7 = 1;
                z10 = z11;
                final boolean[] zArr22 = new boolean[i7];
                AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                alertDialog$Builder32.a.S = hd.M0(2131748477, null);
                alertDialog$Builder32.a.U = hd.M0(!z12 ? 2131748479 : 2131748480, null);
                alertDialog$Builder32.o(frameLayout);
                alertDialog$Builder32.a.H = 9;
                alertDialog$Builder32.h(hd.M0(!z12 ? 2131748478 : 2131752589, null), null);
                alertDialog$Builder32.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.qm
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (zArr22[0]) {
                            return;
                        }
                        ufVar.run();
                    }
                });
                if (z12) {
                }
                alertDialog$Builder.p();
                break;
            case 2:
                org.telegram.messenger.g0.h3(new bg.h0((p50) this.c, (org.telegram.ui.ActionBar.t1) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
            default:
                org.telegram.messenger.g0.h3(new bg.h0((p11) this.c, (TLRPC.ChannelParticipant) obj, (org.telegram.ui.ActionBar.z0) this.d, (m60) this.e, this.b, (TLRPC.User) this.f, (TLRPC.Chat) this.g));
                break;
        }
    }

    public /* synthetic */ w2(np npVar, org.telegram.ui.ActionBar.t1 t1Var, an anVar, uf ufVar, long j3, yd ydVar) {
        this.a = 1;
        this.c = npVar;
        this.d = t1Var;
        this.e = anVar;
        this.f = ufVar;
        this.b = j3;
        this.g = ydVar;
    }
}
