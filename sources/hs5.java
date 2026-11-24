// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hs5 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hs5(oc7 oc7Var, he heVar, yv1 yv1Var, ho1 ho1Var, long j, mz mzVar) {
        this.a = (byte) 1;
        this.d = oc7Var;
        this.b = heVar;
        this.e = yv1Var;
        this.f = ho1Var;
        this.c = j;
        this.g = mzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d2  */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                gm.c3(new rr6(this.d, this.b, this.e, this.c, this.f, this.g, obj, (byte) 2));
                break;
            case 1:
                final oc7 oc7Var = (oc7) this.d;
                he heVar = (he) this.b;
                yv1 yv1Var = (yv1) this.e;
                ho1 ho1Var = (ho1) this.f;
                final long j = this.c;
                final mz mzVar = (mz) this.g;
                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                if (heVar != null) {
                    heVar.b(200L);
                }
                Context parentActivity = yv1Var.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = gm.W(LaunchActivity.H1);
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity == null) {
                    parentActivity = a.b;
                }
                final Context context = parentActivity;
                d S = LaunchActivity.S();
                final ylb resourceProvider = S == null ? null : S.getResourceProvider();
                final boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(context);
                boolean z = oc7Var.l4.l.f && !TextUtils.isEmpty(oc7Var.l4.P2.f);
                boolean z2 = (contentsettings == null || !contentsettings.sensitive_can_change) && z;
                if (!z) {
                    if (contentsettings != null && contentsettings.sensitive_can_change) {
                        oh2 oh2Var = new oh2(1, resourceProvider, context);
                        oh2Var.setBackground(cmb.L0(false));
                        oh2Var.e(jb6.M0(2131748239, null), "", zArr[0], false, false);
                        oh2Var.setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                        frameLayout.addView(oh2Var, qoe.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                        oh2Var.setOnClickListener(new gf(zArr, (byte) 10));
                        i = 1;
                        final boolean[] zArr2 = new boolean[i];
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, resourceProvider, context);
                        alertDialog$Builder.a.S = jb6.M0(2131748234, null);
                        alertDialog$Builder.a.U = jb6.M0(!z2 ? 2131748236 : 2131748237, null);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.a.H = (byte) 9;
                        alertDialog$Builder.g(jb6.M0(!z2 ? 2131748235 : 2131752542, null), null);
                        alertDialog$Builder.a.setOnDismissListener(new dg(zArr2, ho1Var, (byte) 12));
                        if (!z2) {
                            final boolean z3 = z;
                            alertDialog$Builder.j(jb6.M0(2131748238, null), new ee() { // from class: z97
                                @Override // ee
                                public final void r(he heVar2, int i2) {
                                    TL_account.contentSettings contentsettings2;
                                    oc7 oc7Var2 = oc7.this;
                                    boolean z4 = z3;
                                    long j2 = j;
                                    boolean[] zArr3 = zArr2;
                                    mz mzVar2 = mzVar;
                                    if (z4 || (zArr[0] && (contentsettings2 = contentsettings) != null && contentsettings2.sensitive_can_change)) {
                                        ThemeActivity.H0(oc7Var2.currentAccount, resourceProvider, new s2c(oc7Var2, j2, zArr3, mzVar2, (byte) 6), context);
                                        return;
                                    }
                                    oc7Var2.L4.add(Long.valueOf(j2));
                                    zArr3[0] = true;
                                    mzVar2.run();
                                }
                            });
                        }
                        alertDialog$Builder.o();
                        break;
                    }
                } else {
                    zArr[0] = true;
                }
                i = 1;
                final boolean[] zArr22 = new boolean[i];
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, resourceProvider, context);
                alertDialog$Builder2.a.S = jb6.M0(2131748234, null);
                alertDialog$Builder2.a.U = jb6.M0(!z2 ? 2131748236 : 2131748237, null);
                alertDialog$Builder2.n(frameLayout);
                alertDialog$Builder2.a.H = (byte) 9;
                alertDialog$Builder2.g(jb6.M0(!z2 ? 2131748235 : 2131752542, null), null);
                alertDialog$Builder2.a.setOnDismissListener(new dg(zArr22, ho1Var, (byte) 12));
                if (!z2) {
                }
                alertDialog$Builder2.o();
                break;
            case 2:
                wsa wsaVar = (wsa) this.d;
                boolean[] zArr3 = (boolean[]) this.e;
                he heVar2 = (he) this.b;
                yw4 yw4Var = (yw4) this.f;
                long j2 = this.c;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) this.g;
                Long l = (Long) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    heVar2.dismiss();
                    if (wsaVar.isShowing() && yw4Var.isShowing()) {
                        int i2 = wsaVar.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.a0(null, null, 2131749846, wsaVar.s1(), j2 >= 0 ? m9c.l(oc7.r1(i2).W1(Long.valueOf(j2))) : pg3.r(i2, j2))));
                        if (l.longValue() > 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n").append(jb6.V(null, null, 2131742754, c.w(l.longValue(), false)));
                        }
                        wsaVar.b2(j2, 0L, spannableStringBuilder, false, new c28(wsaVar, j2, stargiftdepositpayload, l, yw4Var));
                        break;
                    }
                }
                break;
            default:
                gm.c3(new rr6(this.d, obj, this.b, this.e, this.c, this.f, this.g, (byte) 6));
                break;
        }
    }

    public /* synthetic */ hs5(wsa wsaVar, boolean[] zArr, he heVar, yw4 yw4Var, long j, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        this.a = (byte) 2;
        this.d = wsaVar;
        this.e = zArr;
        this.b = heVar;
        this.f = yw4Var;
        this.c = j;
        this.g = stargiftdepositpayload;
    }

    public /* synthetic */ hs5(KeyEvent.Callback callback, Object obj, Object obj2, long j, TLObject tLObject, TLObject tLObject2, byte b) {
        this.a = b;
        this.d = callback;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.f = tLObject;
        this.g = tLObject2;
    }
}
