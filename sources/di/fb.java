package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class fb extends org.telegram.ui.Components.sa implements fs {
    public final long T1;
    public final ah.a U1;
    public final FrameLayout V1;
    public final uz W1;
    public Runnable X1;
    public final TLRPC.InputPeer Y1;
    public final boolean Z1;
    public z41 a2;
    public boolean b2;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
    
        if (((r8 == null || r8.startsWith("LOC_ERR")) ? null : r8) == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fb(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, int i7, String str, Runnable runnable, long j10) {
        super(context, null, false, false, i6Var);
        String str2;
        String str3;
        this.v1 = 0.2f;
        this.X1 = runnable;
        TLRPC.InputPeer l1 = j10 == 0 ? null : mp.u1(this.a).l1(j10);
        this.Y1 = l1;
        boolean k10 = (l1 == null || !((org.telegram.messenger.h0) mp.u1(x8.y(this.a, false).a).A7.n0.b).c) ? true : org.telegram.messenger.r1.i().k();
        this.Z1 = k10;
        O();
        ck0 ck0Var = this.o1;
        int i10 = this.u0;
        ck0Var.setPadding(i10, 0, i10, 0);
        this.o1.setOnItemClickListener(new bi.i8(this, 4));
        this.o1.r1();
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.n6.i5);
        this.T1 = j3;
        ah.a aVar = new ah.a(this.a, context, i6Var);
        TextView textView = (TextView) aVar.e;
        this.U1 = aVar;
        ((TextView) aVar.d).setText(gd.G((int) Math.max(0L, j3 - x8.y(this.a, false).p().amount), "StarsNeededTitle", new Object[0]));
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
                        String N0 = gd.N0(str3);
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
            String a02 = gd.a0(str3, null, 0, str);
            a02 = (a02 == null || a02.startsWith("LOC_ERR")) ? null : a02;
            textView.setText(org.telegram.messenger.g0.W2(a02 == null ? gd.N0(str3) : a02));
            textView.setMaxWidth(hi.m3.a(textView.getText(), textView.getPaint()));
        }
        this.p1.setTitle(P0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        k80 k80Var = new k80(context, i6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        k80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.B6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        if (k10) {
            k80Var.setText(org.telegram.messenger.g0.T2(gd.M0(2131744732, null), new ca.r(this, 28)));
        } else {
            k80Var.setText(org.telegram.messenger.g0.W2(gd.M0(2131744814, null)));
        }
        k80Var.setGravity(17);
        k80Var.setMaxWidth(hi.m3.a(k80Var.getText(), k80Var.getPaint()));
        frameLayout.addView(k80Var, c8.ma.e(-2, -1, 17));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, i6Var);
        uz uzVar = new uz(getContext());
        this.W1 = uzVar;
        this.b.addView(uzVar, c8.ma.c(-1.0f, -1));
        z41 z41Var = this.a2;
        if (z41Var != null) {
            z41Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        ks.f(this.a).n(this, ks.x3);
        ks.f(this.a).n(this, ks.A3);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.o1, getContext(), this.a, 0, true, new bi.b(this, 20), this.J0);
        this.a2 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        ah.a aVar = this.U1;
        if (aVar == null) {
            return null;
        }
        return ((TextView) aVar.d).getText();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        Runnable runnable;
        if (i7 == ks.x3 || i7 == ks.A3) {
            z41 z41Var = this.a2;
            if (z41Var != null) {
                z41Var.O(true);
            }
            long j3 = x8.y(this.a, false).p().amount;
            TextView textView = (TextView) this.U1.d;
            long j10 = this.T1;
            textView.setText(gd.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.na naVar = this.p1;
            if (naVar != null) {
                naVar.setTitle(P0());
            }
            if (j3 < j10 || (runnable = this.X1) == null) {
                return;
            }
            runnable.run();
            this.X1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        ah.a aVar = this.U1;
        if (aVar != null) {
            ((vg.m) aVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        rj rjVar;
        if (!this.Z1) {
            org.telegram.messenger.f3.n(null, 2131747204, new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(getContext()), this.J0), R.raw.stars_topup, 36);
            return;
        }
        if (x8.y(this.a, false).p().amount >= this.T1) {
            Runnable runnable = this.X1;
            if (runnable != null) {
                runnable.run();
                this.X1 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.a0) != null) {
                rjVar.U();
            }
        }
        super.show();
        ks.f(this.a).c(this, ks.x3);
        ks.f(this.a).c(this, ks.A3);
    }
}
