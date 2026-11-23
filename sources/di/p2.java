package di;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.a70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bn;
import org.telegram.ui.vf;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements y10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p2(f6 f6Var, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var, bi.e2 e2Var, long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.d = f6Var;
        this.e = zArr;
        this.b = t1Var;
        this.f = e2Var;
        this.c = j3;
        this.g = stargiftdepositpayload;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    @Override // org.telegram.messenger.y10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z10;
        int i7;
        AlertDialog$Builder alertDialog$Builder;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.d;
                boolean[] zArr = (boolean[]) this.e;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.b;
                bi.e2 e2Var = (bi.e2) this.f;
                long j3 = this.c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.g;
                Long l10 = (Long) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    t1Var.dismiss();
                    if (f6Var.isShowing() && e2Var.isShowing()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749896, f6Var.E1(), j3 >= 0 ? p10.l(np.u1(f6Var.a).c2(Long.valueOf(j3))) : org.telegram.messenger.n5.s(f6Var.a, j3))));
                        if (l10.longValue() > 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n").append(hd.V(null, null, 2131742825, org.telegram.ui.Wallet.u0.x(l10.longValue(), false)));
                        }
                        f6Var.k2(j3, 0L, spannableStringBuilder, false, new bi.d8(f6Var, j3, stargiftdepositpayload, l10, e2Var));
                        break;
                    }
                }
                break;
            case 1:
                final np npVar = (np) this.d;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.b;
                bn bnVar = (bn) this.e;
                final vf vfVar = (vf) this.f;
                final long j10 = this.c;
                final zd zdVar = (zd) this.g;
                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                if (t1Var2 != null) {
                    t1Var2.c(200L);
                }
                Context parentActivity = bnVar.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.g0.W(LaunchActivity.H1);
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                final org.telegram.ui.ActionBar.h6 resourceProvider = T == null ? null : T.getResourceProvider();
                final boolean[] zArr2 = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                boolean z11 = ((org.telegram.messenger.h0) npVar.A7.m.b).c && !TextUtils.isEmpty(npVar.x6);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                if (!z11) {
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, parentActivity, resourceProvider);
                        d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                        d2Var.e(hd.N0(2131748289, null), "", zArr2[0], false, false);
                        z10 = z11;
                        d2Var.setPadding(hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                        frameLayout.addView(d2Var, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        i7 = 1;
                        d2Var.setOnClickListener(new org.telegram.messenger.b9(zArr2, 1));
                        final boolean[] zArr3 = new boolean[i7];
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                        alertDialog$Builder2.a.S = hd.N0(2131748284, null);
                        alertDialog$Builder2.a.U = hd.N0(!z12 ? 2131748286 : 2131748287, null);
                        alertDialog$Builder2.o(frameLayout);
                        alertDialog$Builder2.a.H = 9;
                        alertDialog$Builder2.h(hd.N0(!z12 ? 2131748285 : 2131752577, null), null);
                        alertDialog$Builder2.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.nm
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                if (zArr3[0]) {
                                    return;
                                }
                                vfVar.run();
                            }
                        });
                        if (z12) {
                            final Context context = parentActivity;
                            alertDialog$Builder = alertDialog$Builder2;
                            final boolean z13 = z10;
                            alertDialog$Builder.k(hd.N0(2131748288, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.messenger.om
                                @Override // org.telegram.ui.ActionBar.q1
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var3, int i10) {
                                    TL_account.contentSettings contentsettings2;
                                    np npVar2 = np.this;
                                    boolean z14 = z13;
                                    long j11 = j10;
                                    boolean[] zArr4 = zArr3;
                                    org.telegram.ui.zd zdVar2 = zdVar;
                                    if (z14 || (zArr2[0] && (contentsettings2 = contentsettings) != null && contentsettings2.sensitive_can_change)) {
                                        ThemeActivity.H0(npVar2.currentAccount, context, new r00(npVar2, j11, zArr4, zdVar2, 2), resourceProvider);
                                        return;
                                    }
                                    npVar2.b8.add(Long.valueOf(j11));
                                    zArr4[0] = true;
                                    zdVar2.run();
                                }
                            });
                        } else {
                            alertDialog$Builder = alertDialog$Builder2;
                        }
                        alertDialog$Builder.p();
                        break;
                    }
                } else {
                    zArr2[0] = true;
                }
                i7 = 1;
                z10 = z11;
                final boolean[] zArr32 = new boolean[i7];
                AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(0, parentActivity, resourceProvider);
                alertDialog$Builder22.a.S = hd.N0(2131748284, null);
                alertDialog$Builder22.a.U = hd.N0(!z12 ? 2131748286 : 2131748287, null);
                alertDialog$Builder22.o(frameLayout);
                alertDialog$Builder22.a.H = 9;
                alertDialog$Builder22.h(hd.N0(!z12 ? 2131748285 : 2131752577, null), null);
                alertDialog$Builder22.a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.nm
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (zArr32[0]) {
                            return;
                        }
                        vfVar.run();
                    }
                });
                if (z12) {
                }
                alertDialog$Builder.p();
                break;
            case 2:
                org.telegram.messenger.g0.g3(new bg.i0((a60) this.d, (org.telegram.ui.ActionBar.t1) this.b, (Context) this.e, this.c, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.g, (TLRPC.ChannelParticipant) obj));
                break;
            default:
                org.telegram.messenger.g0.g3(new bg.i0((a21) this.d, (TLRPC.ChannelParticipant) obj, (org.telegram.ui.ActionBar.y0) this.e, (a70) this.b, this.c, (TLRPC.User) this.f, (TLRPC.Chat) this.g));
                break;
        }
    }

    public /* synthetic */ p2(np npVar, org.telegram.ui.ActionBar.t1 t1Var, bn bnVar, vf vfVar, long j3, zd zdVar) {
        this.d = npVar;
        this.b = t1Var;
        this.e = bnVar;
        this.f = vfVar;
        this.c = j3;
        this.g = zdVar;
    }

    public /* synthetic */ p2(a60 a60Var, org.telegram.ui.ActionBar.t1 t1Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.d = a60Var;
        this.b = t1Var;
        this.e = context;
        this.c = j3;
        this.f = tL_chatInviteExported;
        this.g = tL_chatInviteImporter;
    }

    public /* synthetic */ p2(a21 a21Var, org.telegram.ui.ActionBar.y0 y0Var, a70 a70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.d = a21Var;
        this.e = y0Var;
        this.b = a70Var;
        this.c = j3;
        this.f = user;
        this.g = chat;
    }
}
