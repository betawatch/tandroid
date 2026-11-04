package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;
    public final /* synthetic */ int c;

    public /* synthetic */ dd(xd xdVar, int i3, int i10) {
        this.a = i10;
        this.b = xdVar;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.c;
        xd xdVar = this.b;
        switch (i3) {
            case 0:
                sf.c.t(xdVar.getContext(), org.telegram.messenger.bd.M0(i10, null));
                break;
            case 1:
                dd ddVar = xdVar.g1;
                ci.s sVar = xdVar.P0;
                org.telegram.ui.Components.ac.e();
                if (xdVar.E0.amount < org.telegram.messenger.hp.s1(i10).R5) {
                    xdVar.N0 = true;
                    xdVar.O0 = xdVar.E0.amount;
                } else {
                    xdVar.N0 = false;
                    xdVar.O0 = org.telegram.messenger.hp.s1(i10).R5;
                }
                xdVar.M0 = true;
                sVar.setText(Long.toString(xdVar.O0));
                sVar.setSelection(sVar.getText().length());
                xdVar.M0 = false;
                org.telegram.messenger.g0.r(ddVar);
                ddVar.run();
                break;
            default:
                dd ddVar2 = xdVar.g1;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                nd ndVar = xdVar.H0;
                ndVar.setEnabled(xdVar.O0 > 0 || xdVar.C0 > currentTime);
                if (currentTime >= xdVar.C0) {
                    ndVar.g(null, true);
                    ndVar.i(ci.wb.Y0(false, xdVar.N0 ? org.telegram.messenger.bd.M0(2131748376, null) : org.telegram.messenger.bd.H(' ', "MonetizationStarsWithdraw", (int) xdVar.O0), xdVar.I0), true, true);
                    break;
                } else {
                    ndVar.i(org.telegram.messenger.bd.M0(2131748375, null), true, true);
                    if (xdVar.f1 == null) {
                        xdVar.f1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_switch_lock, 0);
                        wpVar.n = 1;
                        xdVar.f1.setSpan(wpVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xdVar.f1).append((CharSequence) ci.v.w0(xdVar.C0 - currentTime));
                    ndVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.ac acVar = xdVar.Q0;
                    if (acVar != null) {
                        org.telegram.ui.Components.fb fbVar = acVar.e;
                        if ((fbVar instanceof org.telegram.ui.Components.ib) && fbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.r(null, null, 2131752952, new Object[]{ci.v.w0(xdVar.C0 - currentTime)}, ((org.telegram.ui.Components.ib) xdVar.Q0.e).b);
                        }
                    }
                    org.telegram.messenger.g0.r(ddVar2);
                    org.telegram.messenger.g0.i3(ddVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
