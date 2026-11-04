package ci;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mj;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mb extends org.telegram.ui.Components.ma implements cs {
    public final long Q1;
    public final bh.a R1;
    public final FrameLayout S1;
    public final gz T1;
    public Runnable U1;
    public final TLRPC.InputPeer V1;
    public final boolean W1;
    public f41 X1;
    public boolean Y1;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010e, code lost:
    
        if (((r9 == null || r9.startsWith("LOC_ERR")) ? null : r9) == null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mb(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, int i3, String str, Runnable runnable, long j11) {
        super(context, null, false, false, e6Var);
        String str2;
        String str3;
        this.s1 = 0.2f;
        this.U1 = runnable;
        TLRPC.InputPeer j12 = j11 == 0 ? null : hp.s1(this.a).j1(j11);
        this.V1 = j12;
        boolean k10 = (j12 == null || !((org.telegram.messenger.h0) hp.s1(e9.y(this.a, false).a).x7.h0.b).c) ? true : org.telegram.messenger.r1.i().k();
        this.W1 = k10;
        N();
        tj0 tj0Var = this.l1;
        int i10 = this.u0;
        tj0Var.setPadding(i10, 0, i10, 0);
        this.l1.setOnItemClickListener(new ai.j6(this, 4));
        this.l1.r1();
        u4.k kVar = new u4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.l1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.k6.i5);
        this.Q1 = j10;
        bh.a aVar = new bh.a(this.a, context, e6Var);
        TextView textView = (TextView) aVar.e;
        this.R1 = aVar;
        ((TextView) aVar.d).setText(bd.G((int) Math.max(0L, j10 - e9.y(this.a, false).p().amount), "StarsNeededTitle", new Object[0]));
        int i11 = 13;
        if (i3 == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            if (i3 != 2) {
                if (i3 == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i3 == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        str2 = "StarsNeededTextLink";
                        if (str == null) {
                            str3 = "StarsNeededTextLink";
                        } else {
                            str3 = "StarsNeededTextLink_" + str.toLowerCase();
                        }
                        String N0 = bd.N0(str3);
                    } else {
                        str2 = i3 == 5 ? "StarsNeededTextReactions" : i3 == 6 ? "StarsNeededTextGift" : i3 == 12 ? "StarsNeededTextGiftChannel" : i3 == 13 ? "StarsNeededTextPrivateMessage" : i3 == 10 ? "StarsNeededTextGiftUpgrade" : i3 == 11 ? "StarsNeededTextGiftTransfer" : i3 == 9 ? "StarsNeededBizText" : i3 == 14 ? "StarsNeededTextGiftBuyResale" : i3 == 15 ? "StarsNeededTextSearch" : i3 == 16 ? "StarsNeededRemoveGiftDescription" : i3 == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
                    }
                }
            }
            str2 = "StarsNeededTextKeepSubscription";
        }
        str3 = str2;
        if (TextUtils.isEmpty(str3)) {
            textView.setText("");
        } else {
            String a02 = bd.a0(str3, null, 0, str);
            a02 = (a02 == null || a02.startsWith("LOC_ERR")) ? null : a02;
            textView.setText(org.telegram.messenger.g0.X2(a02 == null ? bd.N0(str3) : a02));
            textView.setMaxWidth(gi.l3.a(textView.getText(), textView.getPaint()));
        }
        this.m1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        s70 s70Var = new s70(context, e6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        s70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.B6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        if (k10) {
            s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(2131744977, null), new d1(this, i11)));
        } else {
            s70Var.setText(org.telegram.messenger.g0.X2(bd.M0(2131745059, null)));
        }
        s70Var.setGravity(17);
        s70Var.setMaxWidth(gi.l3.a(s70Var.getText(), s70Var.getPaint()));
        frameLayout.addView(s70Var, mf.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout, e6Var);
        gz gzVar = new gz(getContext());
        this.T1 = gzVar;
        this.b.addView(gzVar, mf.c(-1.0f, -1));
        f41 f41Var = this.X1;
        if (f41Var != null) {
            f41Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        hs.f(this.a).n(this, hs.v3);
        hs.f(this.a).n(this, hs.y3);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.l1, getContext(), this.a, 0, true, new ai.c(this, 20), this.J0);
        this.X1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        bh.a aVar = this.R1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Runnable runnable;
        if (i3 == hs.v3 || i3 == hs.y3) {
            f41 f41Var = this.X1;
            if (f41Var != null) {
                f41Var.O(true);
            }
            long j10 = e9.y(this.a, false).p().amount;
            TextView textView = (TextView) this.R1.d;
            long j11 = this.Q1;
            textView.setText(bd.H(',', "StarsNeededTitle", (int) (j11 - j10)));
            org.telegram.ui.Components.ia iaVar = this.m1;
            if (iaVar != null) {
                iaVar.setTitle(O0());
            }
            if (j10 < j11 || (runnable = this.U1) == null) {
                return;
            }
            runnable.run();
            this.U1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        bh.a aVar = this.R1;
        if (aVar != null) {
            ((wg.m) aVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        mj mjVar;
        if (!this.W1) {
            org.telegram.messenger.k5.o(null, 2131747405, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(getContext()), this.J0), R.raw.stars_topup, 36);
            return;
        }
        if (e9.y(this.a, false).p().amount >= this.Q1) {
            Runnable runnable = this.U1;
            if (runnable != null) {
                runnable.run();
                this.U1 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q instanceof wm) {
            wm wmVar = (wm) Q;
            if (wmVar.T9() && (mjVar = wmVar.a0) != null) {
                mjVar.L();
            }
        }
        super.show();
        hs.f(this.a).c(this, hs.v3);
        hs.f(this.a).c(this, hs.y3);
    }
}
