package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bb extends org.telegram.ui.Components.ja implements is {
    public final long T1;
    public final ah.a U1;
    public final FrameLayout V1;
    public final nz W1;
    public Runnable X1;
    public final TLRPC.InputPeer Y1;
    public final boolean Z1;
    public p41 a2;
    public boolean b2;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
    
        if (((r8 == null || r8.startsWith("LOC_ERR")) ? null : r8) == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bb(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, int i7, String str, Runnable runnable, long j10) {
        super(context, null, false, false, e6Var);
        String str2;
        String str3;
        this.v1 = 0.2f;
        this.X1 = runnable;
        TLRPC.InputPeer j12 = j10 == 0 ? null : np.s1(this.a).j1(j10);
        this.Y1 = j12;
        boolean k10 = (j12 == null || !((org.telegram.messenger.h0) np.s1(u8.y(this.a, false).a).y7.h0.b).c) ? true : org.telegram.messenger.r1.i().k();
        this.Z1 = k10;
        O();
        uj0 uj0Var = this.o1;
        int i10 = this.u0;
        uj0Var.setPadding(i10, 0, i10, 0);
        this.o1.setOnItemClickListener(new bi.b6(this, 4));
        this.o1.r1();
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.j6.i5);
        this.T1 = j3;
        ah.a aVar = new ah.a(this.a, context, e6Var);
        TextView textView = (TextView) aVar.e;
        this.U1 = aVar;
        ((TextView) aVar.d).setText(hd.G((int) Math.max(0L, j3 - u8.y(this.a, false).p().amount), "StarsNeededTitle", new Object[0]));
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
                        String N0 = hd.N0(str3);
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
            String a02 = hd.a0(str3, null, 0, str);
            a02 = (a02 == null || a02.startsWith("LOC_ERR")) ? null : a02;
            textView.setText(org.telegram.messenger.g0.X2(a02 == null ? hd.N0(str3) : a02));
            textView.setMaxWidth(hi.l3.a(textView.getText(), textView.getPaint()));
        }
        this.p1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        z70 z70Var = new z70(context, e6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        z70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.B6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        if (k10) {
            z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(2131744967, null), new ch.w(this, 24)));
        } else {
            z70Var.setText(org.telegram.messenger.g0.X2(hd.M0(2131745049, null)));
        }
        z70Var.setGravity(17);
        z70Var.setMaxWidth(hi.l3.a(z70Var.getText(), z70Var.getPaint()));
        frameLayout.addView(z70Var, c8.ja.e(-2, -1, 17));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, frameLayout, e6Var);
        nz nzVar = new nz(getContext());
        this.W1 = nzVar;
        this.b.addView(nzVar, c8.ja.c(-1.0f, -1));
        p41 p41Var = this.a2;
        if (p41Var != null) {
            p41Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        ns.f(this.a).n(this, ns.v3);
        ns.f(this.a).n(this, ns.y3);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.o1, getContext(), this.a, 0, true, new bi.b(this, 21), this.J0);
        this.a2 = p41Var;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        ah.a aVar = this.U1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ns.v3 || i7 == ns.y3) {
            p41 p41Var = this.a2;
            if (p41Var != null) {
                p41Var.O(true);
            }
            long j3 = u8.y(this.a, false).p().amount;
            TextView textView = (TextView) this.U1.d;
            long j10 = this.T1;
            textView.setText(hd.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.fa faVar = this.p1;
            if (faVar != null) {
                faVar.setTitle(O0());
            }
            if (j3 < j10 || (runnable = this.X1) == null) {
                return;
            }
            runnable.run();
            this.X1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        ah.a aVar = this.U1;
        if (aVar != null) {
            ((vg.m) aVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        qj qjVar;
        if (!this.Z1) {
            org.telegram.messenger.k5.n(null, 2131747397, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(getContext()), this.J0), R.raw.stars_topup, 36);
            return;
        }
        if (u8.y(this.a, false).p().amount >= this.T1) {
            Runnable runnable = this.X1;
            if (runnable != null) {
                runnable.run();
                this.X1 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.V9() && (qjVar = anVar.a0) != null) {
                qjVar.S();
            }
        }
        super.show();
        ns.f(this.a).c(this, ns.v3);
        ns.f(this.a).c(this, ns.y3);
    }
}
