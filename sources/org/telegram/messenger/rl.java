package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rl(vp vpVar, org.telegram.ui.ActionBar.x1 x1Var, org.telegram.ui.un unVar, org.telegram.ui.mf mfVar, long j10, org.telegram.ui.me meVar) {
        this.a = 0;
        this.d = vpVar;
        this.b = x1Var;
        this.e = unVar;
        this.f = mfVar;
        this.c = j10;
        this.g = meVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    @Override // org.telegram.messenger.q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i10;
        int i11 = 0;
        switch (this.a) {
            case 0:
                final vp vpVar = (vp) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.e;
                final org.telegram.ui.mf mfVar = (org.telegram.ui.mf) this.f;
                final long j10 = this.c;
                final org.telegram.ui.me meVar = (org.telegram.ui.me) this.g;
                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                if (x1Var != null) {
                    x1Var.c(200L);
                }
                Context parentActivity = unVar.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = i0.W(LaunchActivity.I1);
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity == null) {
                    parentActivity = w0.b;
                }
                final Context context = parentActivity;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                final org.telegram.ui.ActionBar.p6 resourceProvider = T == null ? null : T.getResourceProvider();
                final boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(context);
                final boolean z10 = ((j0) vpVar.y7.m.b).c && !TextUtils.isEmpty(vpVar.v6);
                boolean z11 = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                if (!z10) {
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, context, resourceProvider);
                        c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                        c2Var.e(cd.L0(2131748497, null), "", zArr[0], false, false);
                        c2Var.setPadding(cd.X ? i0.L(16.0f) : i0.L(8.0f), 0, cd.X ? i0.L(8.0f) : i0.L(16.0f), 0);
                        frameLayout.addView(c2Var, w7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        i10 = 1;
                        c2Var.setOnClickListener(new g9(zArr, 1));
                        final boolean[] zArr2 = new boolean[i10];
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, resourceProvider);
                        alertDialog$Builder.a.R = cd.L0(2131748492, null);
                        alertDialog$Builder.a.T = cd.L0(!z11 ? 2131748494 : 2131748495, null);
                        alertDialog$Builder.o(frameLayout);
                        alertDialog$Builder.a.G = 9;
                        alertDialog$Builder.h(cd.L0(!z11 ? 2131748493 : 2131752589, null), null);
                        alertDialog$Builder.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.qm
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                if (zArr2[0]) {
                                    return;
                                }
                                mfVar.run();
                            }
                        });
                        if (!z11) {
                            alertDialog$Builder.k(cd.L0(2131748496, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.messenger.rm
                                @Override // org.telegram.ui.ActionBar.u1
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                                    TL_account.contentSettings contentsettings2;
                                    vp vpVar2 = vp.this;
                                    boolean z12 = z10;
                                    long j11 = j10;
                                    boolean[] zArr3 = zArr2;
                                    org.telegram.ui.me meVar2 = meVar;
                                    if (z12 || (zArr[0] && (contentsettings2 = contentsettings) != null && contentsettings2.sensitive_can_change)) {
                                        ThemeActivity.G0(vpVar2.currentAccount, context, new k10(vpVar2, j11, zArr3, meVar2, 2), resourceProvider);
                                        return;
                                    }
                                    vpVar2.W7.add(Long.valueOf(j11));
                                    zArr3[0] = true;
                                    meVar2.run();
                                }
                            });
                        }
                        alertDialog$Builder.p();
                        break;
                    }
                } else {
                    zArr[0] = true;
                }
                i10 = 1;
                final boolean[] zArr22 = new boolean[i10];
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context, resourceProvider);
                alertDialog$Builder2.a.R = cd.L0(2131748492, null);
                alertDialog$Builder2.a.T = cd.L0(!z11 ? 2131748494 : 2131748495, null);
                alertDialog$Builder2.o(frameLayout);
                alertDialog$Builder2.a.G = 9;
                alertDialog$Builder2.h(cd.L0(!z11 ? 2131748493 : 2131752589, null), null);
                alertDialog$Builder2.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.qm
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (zArr22[0]) {
                            return;
                        }
                        mfVar.run();
                    }
                });
                if (!z11) {
                }
                alertDialog$Builder2.p();
                break;
            case 1:
                i0.g3(new org.telegram.messenger.voip.f((c60) this.d, (org.telegram.ui.ActionBar.x1) this.b, (Context) this.e, this.c, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
            default:
                rh.e4 e4Var = (rh.e4) this.d;
                gf.e eVar = (gf.e) this.b;
                mg.i2 i2Var = (mg.i2) this.e;
                long j11 = this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                if (org.telegram.ui.Wallet.k0.x(e4Var.a).v() < stargiftdepositpayload.amount) {
                    eVar.b();
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, e4Var.getContext(), e4Var.I0);
                    alertDialog$Builder3.a.R = cd.L0(2131743092, null);
                    alertDialog$Builder3.a.T = cd.V(null, null, 2131743091, org.telegram.ui.Wallet.k0.n(stargiftdepositpayload.amount, false));
                    alertDialog$Builder3.h(cd.L0(2131743090, null), null);
                    alertDialog$Builder3.k(cd.L0(2131743016, null), new org.telegram.ui.web.k0(14, e4Var, i2Var));
                    alertDialog$Builder3.p();
                    break;
                } else {
                    TLRPC.User Z1 = j11 > 0 ? vp.r1(e4Var.a).Z1(Long.valueOf(j11)) : null;
                    long e = d20.i(e4Var.a).e();
                    TLRPC.Document document = tL_starGiftUnique.getDocument();
                    int i12 = e4Var.a;
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i12);
                    rh.z1 z1Var = new rh.z1(e4Var, eVar, i2Var, i11);
                    org.telegram.ui.Components.zb zbVar = j11 != e ? null : new org.telegram.ui.Components.zb(i12, e, document);
                    try {
                        x10.d0(Z1, stargiftdepositpayload.nft_address.indexOf(58) >= 0 ? org.telegram.ui.Wallet.k0.V(stargiftdepositpayload.nft_address, true) : stargiftdepositpayload.nft_address, 0L, null, null, nftitem, null, z1Var, zbVar == null ? null : new f11(7, x10, zbVar), org.telegram.ui.Wallet.k0.h(stargiftdepositpayload));
                        break;
                    } catch (Exception e7) {
                        org.telegram.ui.Wallet.k0.k("depositNFT: invalid payload", e7);
                        z1Var.a(e7.getMessage() == null ? "NULL_ERROR" : e7.getMessage());
                    }
                }
        }
    }

    public /* synthetic */ rl(org.telegram.ui.ActionBar.z2 z2Var, Object obj, Object obj2, long j10, TLObject tLObject, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = z2Var;
        this.b = obj;
        this.e = obj2;
        this.c = j10;
        this.f = tLObject;
        this.g = tLObject2;
    }
}
