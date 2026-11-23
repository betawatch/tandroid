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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.tz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fb extends org.telegram.ui.Components.ra implements fs {
    public final long T1;
    public final ah.a U1;
    public final FrameLayout V1;
    public final tz W1;
    public Runnable X1;
    public final TLRPC.InputPeer Y1;
    public final boolean Z1;
    public b51 a2;
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
        boolean k10 = (l1 == null || !((org.telegram.messenger.h0) mp.u1(y8.y(this.a, false).a).A7.n0.b).c) ? true : org.telegram.messenger.r1.i().k();
        this.Z1 = k10;
        O();
        ek0 ek0Var = this.o1;
        int i10 = this.u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        this.o1.setOnItemClickListener(new bi.n8(this, 4));
        this.o1.r1();
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.o1.setItemAnimator(lVar);
        w0(org.telegram.ui.ActionBar.n6.i5);
        this.T1 = j3;
        ah.a aVar = new ah.a(this.a, context, i6Var);
        TextView textView = (TextView) aVar.e;
        this.U1 = aVar;
        ((TextView) aVar.d).setText(gd.G((int) Math.max(0L, j3 - y8.y(this.a, false).p().amount), "StarsNeededTitle", new Object[0]));
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
                        String O0 = gd.O0(str3);
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
            textView.setText(org.telegram.messenger.g0.W2(a02 == null ? gd.O0(str3) : a02));
            textView.setMaxWidth(hi.u3.a(textView.getText(), textView.getPaint()));
        }
        this.p1.setTitle(P0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        j80 j80Var = new j80(context, i6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        j80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.B6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        if (k10) {
            j80Var.setText(org.telegram.messenger.g0.T2(gd.N0(2131744726, null), new ca.r(this, 27)));
        } else {
            j80Var.setText(org.telegram.messenger.g0.W2(gd.N0(2131744808, null)));
        }
        j80Var.setGravity(17);
        j80Var.setMaxWidth(hi.u3.a(j80Var.getText(), j80Var.getPaint()));
        frameLayout.addView(j80Var, c8.na.e(-2, -1, 17));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout, i6Var);
        tz tzVar = new tz(getContext());
        this.W1 = tzVar;
        this.b.addView(tzVar, c8.na.c(-1.0f, -1));
        b51 b51Var = this.a2;
        if (b51Var != null) {
            b51Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        ks.f(this.a).n(this, ks.x3);
        ks.f(this.a).n(this, ks.A3);
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.o1, getContext(), this.a, 0, true, new bi.b(this, 20), this.J0);
        this.a2 = b51Var;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
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
            b51 b51Var = this.a2;
            if (b51Var != null) {
                b51Var.O(true);
            }
            long j3 = y8.y(this.a, false).p().amount;
            TextView textView = (TextView) this.U1.d;
            long j10 = this.T1;
            textView.setText(gd.H(',', "StarsNeededTitle", (int) (j10 - j3)));
            org.telegram.ui.Components.ma maVar = this.p1;
            if (maVar != null) {
                maVar.setTitle(P0());
            }
            if (j3 < j10 || (runnable = this.X1) == null) {
                return;
            }
            runnable.run();
            this.X1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        ah.a aVar = this.U1;
        if (aVar != null) {
            ((vg.m) aVar.b).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        rj rjVar;
        if (!this.Z1) {
            org.telegram.messenger.f3.n(null, 2131747203, new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(getContext()), this.J0), R.raw.stars_topup, 36);
            return;
        }
        if (y8.y(this.a, false).p().amount >= this.T1) {
            Runnable runnable = this.X1;
            if (runnable != null) {
                runnable.run();
                this.X1 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
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
