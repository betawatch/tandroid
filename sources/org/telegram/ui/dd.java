package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd b;
    public final /* synthetic */ int c;

    public /* synthetic */ dd(xd xdVar, int i7, int i10) {
        this.a = i10;
        this.b = xdVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        xd xdVar = this.b;
        switch (i7) {
            case 0:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.gd.N0(i10, null));
                break;
            case 1:
                dd ddVar = xdVar.g1;
                di.q qVar = xdVar.P0;
                org.telegram.ui.Components.gc.e();
                if (xdVar.E0.amount < org.telegram.messenger.mp.u1(i10).U5) {
                    xdVar.N0 = true;
                    xdVar.O0 = xdVar.E0.amount;
                } else {
                    xdVar.N0 = false;
                    xdVar.O0 = org.telegram.messenger.mp.u1(i10).U5;
                }
                xdVar.M0 = true;
                qVar.setText(Long.toString(xdVar.O0));
                qVar.setSelection(qVar.getText().length());
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
                    ndVar.i(di.pb.Z0(false, xdVar.N0 ? org.telegram.messenger.gd.N0(2131748175, null) : org.telegram.messenger.gd.H(' ', "MonetizationStarsWithdraw", (int) xdVar.O0), xdVar.I0), true, true);
                    break;
                } else {
                    ndVar.i(org.telegram.messenger.gd.N0(2131748174, null), true, true);
                    if (xdVar.f1 == null) {
                        xdVar.f1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_switch_lock, 0);
                        nqVar.n = 1;
                        xdVar.f1.setSpan(nqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xdVar.f1).append((CharSequence) di.t.x0(xdVar.C0 - currentTime));
                    ndVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.gc gcVar = xdVar.Q0;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.e;
                        if ((lbVar instanceof org.telegram.ui.Components.ob) && lbVar.isAttachedToWindow()) {
                            org.telegram.messenger.f3.q(null, null, 2131752940, new Object[]{di.t.x0(xdVar.C0 - currentTime)}, ((org.telegram.ui.Components.ob) xdVar.Q0.e).b);
                        }
                    }
                    org.telegram.messenger.g0.r(ddVar2);
                    org.telegram.messenger.g0.h3(ddVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
