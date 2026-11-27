// default package

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dza extends ny0 implements fn7 {
    public final long S1;
    public final dr0 T1;
    public final FrameLayout U1;
    public final tj4 V1;
    public Runnable W1;
    public final TLRPC.InputPeer X1;
    public final boolean Y1;
    public l9c Z1;
    public boolean a2;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        if ((r8.startsWith("LOC_ERR") ? null : r8) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dza(Context context, vnb vnbVar, long j, int i, String str, Runnable runnable, long j2) {
        super(context, null, false, false, vnbVar);
        String str2;
        this.u1 = 0.2f;
        this.W1 = runnable;
        TLRPC.InputPeer j1 = j2 == 0 ? null : uc7.s1(this.a).j1(j2);
        this.X1 = j1;
        boolean j3 = (j1 == null || !uc7.s1(jxa.v(this.a, false).a).l4.t0.f) ? true : di0.h().j();
        this.Y1 = j3;
        J();
        d79 d79Var = this.n1;
        int i2 = this.u0;
        d79Var.setPadding(i2, 0, i2, 0);
        this.n1.setOnItemClickListener(new t39(this, (byte) 13));
        this.n1.s1();
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        t0(aob.i5);
        this.S1 = j;
        dr0 dr0Var = new dr0(this.a, vnbVar, context);
        TextView textView = (TextView) dr0Var.e;
        this.T1 = dr0Var;
        ((TextView) dr0Var.b).setText(ob6.G((int) Math.max(0L, j - jxa.v(this.a, false).m().amount), "StarsNeededTitle", new Object[0]));
        if (i == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            String str3 = "StarsNeededTextKeepSubscription";
            if (i != 2) {
                if (i == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i != 3) {
                    if (i == 4) {
                        str2 = "StarsNeededTextLink";
                        if (str == null) {
                            str3 = "StarsNeededTextLink";
                        } else {
                            str3 = "StarsNeededTextLink_" + str.toLowerCase();
                        }
                        String N0 = ob6.N0(str3);
                    } else {
                        str2 = i == 5 ? "StarsNeededTextReactions" : i == 6 ? "StarsNeededTextGift" : i == 12 ? "StarsNeededTextGiftChannel" : i == 13 ? "StarsNeededTextPrivateMessage" : i == 10 ? "StarsNeededTextGiftUpgrade" : i == 11 ? "StarsNeededTextGiftTransfer" : i == 9 ? "StarsNeededBizText" : i == 14 ? "StarsNeededTextGiftBuyResale" : i == 15 ? "StarsNeededTextSearch" : i == 16 ? "StarsNeededRemoveGiftDescription" : i == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
                    }
                }
            }
            str2 = str3;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText("");
        } else {
            String a0 = ob6.a0(str2, null, 0, str);
            a0 = a0.startsWith("LOC_ERR") ? null : a0;
            textView.setText(hl.S2(a0 == null ? ob6.N0(str2) : a0));
            textView.setMaxWidth(kg5.a(textView.getText(), textView.getPaint()));
        }
        this.o1.setTitle(K0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        p66 p66Var = new p66(context, vnbVar);
        frameLayout.setPadding(0, hl.L(11.0f), 0, hl.L(11.0f));
        p66Var.setTextSize(1, 12.0f);
        yob.X(p66Var, aob.B6, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        if (j3) {
            p66Var.setText(hl.N2(ob6.M0(2131744624, null), -1, 0, new uoa((Object) this, (byte) 13), null));
        } else {
            p66Var.setText(hl.S2(ob6.M0(2131744706, null)));
        }
        p66Var.setGravity(17);
        p66Var.setMaxWidth(kg5.a(p66Var.getText(), p66Var.getPaint()));
        frameLayout.addView(p66Var, tre.e(-2, -1, 17));
        yob.h(aob.h5, vnbVar, frameLayout);
        tj4 tj4Var = new tj4(getContext());
        this.V1 = tj4Var;
        this.b.addView(tj4Var, tre.c(-1.0f, -1));
        l9c l9cVar = this.Z1;
        if (l9cVar != null) {
            l9cVar.O(false);
        }
    }

    @Override // nx0
    public final void H() {
        super.H();
        jn7.f(this.a).n(this, jn7.x3);
        jn7.f(this.a).n(this, jn7.A3);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new hj8(this, (byte) 26), this.J0);
        this.Z1 = l9cVar;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        dr0 dr0Var = this.T1;
        if (dr0Var == null) {
            return null;
        }
        return ((TextView) dr0Var.b).getText();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == jn7.x3 || i == jn7.A3) {
            l9c l9cVar = this.Z1;
            if (l9cVar != null) {
                l9cVar.O(true);
            }
            long j = jxa.v(this.a, false).m().amount;
            TextView textView = (TextView) this.T1.b;
            long j2 = this.S1;
            textView.setText(ob6.H(',', "StarsNeededTitle", (int) (j2 - j)));
            jy0 jy0Var = this.o1;
            if (jy0Var != null) {
                jy0Var.setTitle(K0());
            }
            if (j < j2 || (runnable = this.W1) == null) {
                return;
            }
            runnable.run();
            this.W1 = null;
            dismiss();
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        dr0 dr0Var = this.T1;
        if (dr0Var != null) {
            ((it4) dr0Var.c).setPaused(true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        nr1 nr1Var;
        if (!this.Y1) {
            bs2.v(null, 2131747124, new d31(o11.a(getContext()), this.J0), R.raw.stars_topup, 36);
            return;
        }
        if (jxa.v(this.a, false).m().amount >= this.S1) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
                return;
            }
            return;
        }
        e Q = LaunchActivity.Q();
        if (Q instanceof zu1) {
            zu1 zu1Var = (zu1) Q;
            if (zu1Var.Y7() && (nr1Var = zu1Var.a0) != null) {
                nr1Var.U();
            }
        }
        super.show();
        jn7.f(this.a).b(this, jn7.x3);
        jn7.f(this.a).b(this, jn7.A3);
    }
}
