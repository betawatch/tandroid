package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd b;
    public final /* synthetic */ int c;

    public /* synthetic */ ed(zd zdVar, int i7, int i10) {
        this.a = i10;
        this.b = zdVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        zd zdVar = this.b;
        switch (i7) {
            case 0:
                vf.c.t(zdVar.getContext(), org.telegram.messenger.id.M0(i10, null));
                break;
            case 1:
                ed edVar = zdVar.f1;
                bi.v vVar = zdVar.O0;
                org.telegram.ui.Components.bc.e();
                if (zdVar.D0.amount < org.telegram.messenger.qp.s1(i10).R5) {
                    zdVar.M0 = true;
                    zdVar.N0 = zdVar.D0.amount;
                } else {
                    zdVar.M0 = false;
                    zdVar.N0 = org.telegram.messenger.qp.s1(i10).R5;
                }
                zdVar.L0 = true;
                vVar.setText(Long.toString(zdVar.N0));
                vVar.setSelection(vVar.getText().length());
                zdVar.L0 = false;
                org.telegram.messenger.g0.r(edVar);
                edVar.run();
                break;
            default:
                ed edVar2 = zdVar.f1;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                pd pdVar = zdVar.G0;
                pdVar.setEnabled(zdVar.N0 > 0 || zdVar.B0 > currentTime);
                if (currentTime >= zdVar.B0) {
                    pdVar.g(null, true);
                    pdVar.i(bi.dd.Y0(false, zdVar.M0 ? org.telegram.messenger.id.M0(2131748368, null) : org.telegram.messenger.id.H(' ', "MonetizationStarsWithdraw", (int) zdVar.N0), zdVar.H0), true, true);
                    break;
                } else {
                    pdVar.i(org.telegram.messenger.id.M0(2131748367, null), true, true);
                    if (zdVar.e1 == null) {
                        zdVar.e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_switch_lock, 0);
                        wpVar.n = 1;
                        zdVar.e1.setSpan(wpVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) zdVar.e1).append((CharSequence) bi.z.w0(zdVar.B0 - currentTime));
                    pdVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.bc bcVar = zdVar.P0;
                    if (bcVar != null) {
                        org.telegram.ui.Components.fb fbVar = bcVar.e;
                        if ((fbVar instanceof org.telegram.ui.Components.jb) && fbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.r(null, null, 2131752952, new Object[]{bi.z.w0(zdVar.B0 - currentTime)}, ((org.telegram.ui.Components.jb) zdVar.P0.e).b);
                        }
                    }
                    org.telegram.messenger.g0.r(edVar2);
                    org.telegram.messenger.g0.i3(edVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
