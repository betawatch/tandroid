package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;
    public final /* synthetic */ int c;

    public /* synthetic */ nd(le leVar, int i10, int i11) {
        this.a = i11;
        this.b = leVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        le leVar = this.b;
        switch (i10) {
            case 0:
                gf.f.r(leVar.getContext(), org.telegram.messenger.cd.L0(i11, null));
                break;
            case 1:
                nd ndVar = leVar.f1;
                zd zdVar = leVar.O0;
                org.telegram.ui.Components.wb.e();
                if (leVar.D0.amount < org.telegram.messenger.vp.r1(i11).S5) {
                    leVar.M0 = true;
                    leVar.N0 = leVar.D0.amount;
                } else {
                    leVar.M0 = false;
                    leVar.N0 = org.telegram.messenger.vp.r1(i11).S5;
                }
                leVar.L0 = true;
                zdVar.setText(Long.toString(leVar.N0));
                zdVar.setSelection(zdVar.getText().length());
                leVar.L0 = false;
                org.telegram.messenger.i0.r(ndVar);
                ndVar.run();
                break;
            default:
                nd ndVar2 = leVar.f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                be beVar = leVar.G0;
                beVar.setEnabled(leVar.N0 > 0 || leVar.B0 > currentTime);
                if (currentTime >= leVar.B0) {
                    beVar.g(null, true);
                    beVar.i(rh.h8.X0(false, leVar.M0 ? org.telegram.messenger.cd.L0(2131748383, null) : org.telegram.messenger.cd.H(' ', "MonetizationStarsWithdraw", (int) leVar.N0), leVar.H0), true, true);
                    break;
                } else {
                    beVar.i(org.telegram.messenger.cd.L0(2131748382, null), true, true);
                    if (leVar.e1 == null) {
                        leVar.e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.mini_switch_lock, 0);
                        dqVar.n = 1;
                        leVar.e1.setSpan(dqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) leVar.e1).append((CharSequence) rh.i.v0(leVar.B0 - currentTime));
                    beVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.wb wbVar = leVar.P0;
                    if (wbVar != null) {
                        org.telegram.ui.Components.bb bbVar = wbVar.e;
                        if ((bbVar instanceof org.telegram.ui.Components.eb) && bbVar.isAttachedToWindow()) {
                            org.telegram.messenger.m5.q(null, null, 2131752952, new Object[]{rh.i.v0(leVar.B0 - currentTime)}, ((org.telegram.ui.Components.eb) leVar.P0.e).b);
                        }
                    }
                    org.telegram.messenger.i0.r(ndVar2);
                    org.telegram.messenger.i0.h3(ndVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
