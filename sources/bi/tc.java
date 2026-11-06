package bi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class tc extends org.telegram.ui.Components.na implements ls {
    public final long P1;
    public final ah.a Q1;
    public final FrameLayout R1;
    public final jz S1;
    public Runnable T1;
    public final TLRPC.InputPeer U1;
    public final boolean V1;
    public f41 W1;
    public boolean X1;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
    
        if (((r8 == null || r8.startsWith("LOC_ERR")) ? null : r8) == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tc(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, int i7, String str, Runnable runnable, long j10) {
        super(context, null, false, false, f6Var);
        String str2;
        String str3;
        this.r1 = 0.2f;
        this.T1 = runnable;
        TLRPC.InputPeer j12 = j10 == 0 ? null : qp.s1(this.a).j1(j10);
        this.U1 = j12;
        boolean k10 = (j12 == null || !((org.telegram.messenger.h0) qp.s1(ea.y(this.a, false).a).x7.h0.b).c) ? true : org.telegram.messenger.r1.i().k();
        this.V1 = k10;
        N();
        pj0 pj0Var = this.k1;
        int i10 = this.t0;
        pj0Var.setPadding(i10, 0, i10, 0);
        this.k1.setOnItemClickListener(new ai.k(this, 3));
        this.k1.r1();
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.k6.i5);
        this.P1 = j3;
        ah.a aVar = new ah.a(this.a, context, f6Var);
        TextView textView = (TextView) aVar.e;
        this.Q1 = aVar;
        ((TextView) aVar.d).setText(org.telegram.messenger.hd.G((int) Math.max(0L, j3 - ea.y(this.a, false).p().amount), "StarsNeededTitle", new Object[0]));
        if (i7 == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            if (i7 != 2) {
                if (i7 == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i7 == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        str2 = "StarsNeededTextLink";
                        if (str == null) {
                            str3 = "StarsNeededTextLink";
                        } else {
                            str3 = "StarsNeededTextLink_" + str.toLowerCase();
                        }
                        String N0 = org.telegram.messenger.hd.N0(str3);
                    } else {
                        str2 = i7 == 5 ? "StarsNeededTextReactions" : i7 == 6 ? "StarsNeededTextGift" : i7 == 12 ? "StarsNeededTextGiftChannel" : i7 == 13 ? "StarsNeededTextPrivateMessage" : i7 == 10 ? "StarsNeededTextGiftUpgrade" : i7 == 11 ? "StarsNeededTextGiftTransfer" : i7 == 9 ? "StarsNeededBizText" : i7 == 14 ? "StarsNeededTextGiftBuyResale" : i7 == 15 ? "StarsNeededTextSearch" : i7 == 16 ? "StarsNeededRemoveGiftDescription" : i7 == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
                    }
                }
            }
            str2 = "StarsNeededTextKeepSubscription";
        }
        str3 = str2;
        if (TextUtils.isEmpty(str3)) {
            textView.setText("");
        } else {
            String a02 = org.telegram.messenger.hd.a0(str3, null, 0, str);
            a02 = (a02 == null || a02.startsWith("LOC_ERR")) ? null : a02;
            textView.setText(org.telegram.messenger.g0.X2(a02 == null ? org.telegram.messenger.hd.N0(str3) : a02));
            textView.setMaxWidth(fi.m3.a(textView.getText(), textView.getPaint()));
        }
        this.l1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.R1 = frameLayout;
        w70 w70Var = new w70(context, f6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.B6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        if (k10) {
            w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131744968, null), new ab(this, 3)));
        } else {
            w70Var.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131745050, null)));
        }
        w70Var.setGravity(17);
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()));
        frameLayout.addView(w70Var, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, f6Var);
        jz jzVar = new jz(getContext());
        this.S1 = jzVar;
        this.b.addView(jzVar, c8.ha.c(-1.0f, -1));
        f41 f41Var = this.W1;
        if (f41Var != null) {
            f41Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        qs.f(this.a).n(this, qs.v3);
        qs.f(this.a).n(this, qs.y3);
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        f41 f41Var = new f41(this.k1, getContext(), this.a, 0, true, new ai.e(this, 10), this.I0);
        this.W1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        ah.a aVar = this.Q1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == qs.v3 || i7 == qs.y3) {
            f41 f41Var = this.W1;
            if (f41Var != null) {
                f41Var.O(true);
            }
            long j3 = ea.y(this.a, false).p().amount;
            TextView textView = (TextView) this.Q1.d;
            long j10 = this.P1;
            textView.setText(org.telegram.messenger.hd.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.ja jaVar = this.l1;
            if (jaVar != null) {
                jaVar.setTitle(O0());
            }
            if (j3 < j10 || (runnable = this.T1) == null) {
                return;
            }
            runnable.run();
            this.T1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        ah.a aVar = this.Q1;
        if (aVar != null) {
            ((vg.m) aVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        qj qjVar;
        if (!this.V1) {
            org.telegram.messenger.k5.o(null, 2131747396, new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(getContext()), this.I0), R.raw.stars_topup, 36);
            return;
        }
        if (ea.y(this.a, false).p().amount >= this.P1) {
            Runnable runnable = this.T1;
            if (runnable != null) {
                runnable.run();
                this.T1 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.T9() && (qjVar = anVar.Z) != null) {
                qjVar.L();
            }
        }
        super.show();
        qs.f(this.a).c(this, qs.v3);
        qs.f(this.a).c(this, qs.y3);
    }
}
