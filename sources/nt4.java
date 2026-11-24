// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class nt4 extends n39 {
    public final wjb c;
    public boolean d;
    public d e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public ww0 n;

    public nt4(wjb wjbVar) {
        this.c = wjbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // w39
    public final int b() {
        return 5;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 5 : 4;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        boolean z;
        String G;
        meb mebVar;
        int i2 = s49Var.f;
        View view = s49Var.a;
        final byte b = 0;
        if (i2 == 0) {
            kd5 kd5Var = (kd5) view;
            if (this.d) {
                kd5Var.c.setText(k96.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                kd5Var.d.setText(gl.T2(k96.a0("BoostingLinkAllows", null, 2131753340, new Object[0])));
            } else {
                kd5Var.c.setText(k96.a0("BoostingUsedGiftLink", null, 2131753170, new Object[0]));
                kd5Var.d.setText(gl.T2(k96.a0("BoostingLinkUsed", null, 2131753336, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j = tL_payments_checkedGiftCode.to_id;
                final hj3 hj3Var = new hj3(this, (byte) 11);
                kd5Var.c.setText(k96.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                SpannableStringBuilder T2 = gl.T2(k96.M0(2131753338, null));
                final TLRPC.User V1 = na7.q1(y6c.t0).V1(Long.valueOf(j));
                final byte b2 = 0;
                kd5Var.d.setText(gl.H2(T2, gl.O2("**" + l7c.q(V1) + "**", bkb.Wc, 2, new Runnable() { // from class: gd5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.User user = V1;
                        hj3 hj3Var2 = hj3Var;
                        switch (b3) {
                            case 0:
                                hj3Var2.a(user);
                                break;
                            default:
                                hj3Var2.a(user);
                                break;
                        }
                    }
                }, kd5Var.e), "%1$s"));
            }
            if (this.f.to_id == -1) {
                kd5Var.c.setText(k96.a0("BoostingGiftLink", null, 2131753497, new Object[0]));
                kd5Var.d.setText(gl.T2(k96.a0("BoostingLinkAllowsAnyone", null, 2131753339, new Object[0])));
                return;
            }
            return;
        }
        byte b3 = 1;
        if (i2 == 1) {
            h36 h36Var = (h36) view;
            h36Var.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                h36Var.a(new lt4(this, (byte) 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                h36Var.a(new lt4(this, (byte) 0));
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    n8 n8Var = (n8) view;
                    n8Var.setOkStyle(this.d);
                    n8Var.setOnClickListener(new xf3((Object) this, (Object) n8Var, (byte) 16));
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                    if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                        n8Var.e = false;
                        u41 u41Var = n8Var.a;
                        u41Var.setShowZero(false);
                        u41Var.setEnabled(true);
                        u41Var.i(k96.a0("Close", null, 2131752029, new Object[0]), false, true);
                        n8Var.setOnClickListener(new yj3(this, (byte) 21));
                        return;
                    }
                    return;
                }
                return;
            }
            lhb lhbVar = (lhb) view;
            lhbVar.setTextGravity(17);
            zkb.X(lhbVar.getTextView(), bkb.F6, null);
            lhbVar.setTopPadding(14);
            lhbVar.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    lhbVar.setText(gl.O2(tL_payments_checkedGiftCode3.to_id == -1 ? k96.M0(2131753268, null) : k96.M0(2131753267, null), bkb.Wc, 0, new lt4(this, b3), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    lhbVar.setText(k96.a0("BoostingUsedLinkDate", null, 2131753169, k96.a0("formatDateAtTime", null, 2131742520, k96.D0().B0().format(date), k96.D0().o0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                lhbVar.setText(k96.M0(2131753337, null));
                return;
            } else {
                lhbVar.setFixedSize(14);
                lhbVar.setText(null);
                return;
            }
        }
        meb mebVar2 = (meb) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final hj3 hj3Var2 = new hj3(this, (byte) 11);
        be0 be0Var = mebVar2.h;
        FrameLayout frameLayout = mebVar2.x;
        be0 be0Var2 = mebVar2.f;
        TextView textView = mebVar2.a;
        TextView textView2 = mebVar2.b;
        wjb wjbVar = mebVar2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        mebVar2.e.setText(k96.a0("formatDateAtTime", null, 2131742520, k96.D0().B0().format(date2), k96.D0().o0().format(date2)));
        TextView textView3 = mebVar2.d;
        zkb.X(textView3, tL_payments_checkedGiftCode4.via_giveaway ? bkb.l5 : bkb.i5, wjbVar);
        TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(-cf3.n(tL_payments_checkedGiftCode4.from_id)));
        boolean V = hc2.V(K0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) k96.M0(2131753489, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(gl.O2(spannableStringBuilder.toString(), bkb.Wc, 0, new Runnable() { // from class: ieb
                @Override // java.lang.Runnable
                public final void run() {
                    byte b4 = b;
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode5 = tL_payments_checkedGiftCode4;
                    hj3 hj3Var3 = hj3Var2;
                    switch (b4) {
                        case 0:
                            hj3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                        default:
                            hj3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                    }
                }
            }, wjbVar));
            textView3.setOnClickListener(new b99(hj3Var2, tL_payments_checkedGiftCode4, (byte) 24));
        } else {
            textView3.setText(k96.M0(V ? 2131753162 : 2131753161, null));
            textView3.setOnClickListener(null);
        }
        int i3 = tL_payments_checkedGiftCode4.months;
        if (i3 == 12) {
            z = false;
            G = k96.G(1, "Years", new Object[0]);
        } else {
            z = false;
            G = k96.G(i3, "Months", new Object[0]);
        }
        TextView textView4 = mebVar2.c;
        boolean z2 = z;
        Object[] objArr = new Object[1];
        objArr[z2 ? 1 : 0] = G;
        textView4.setText(k96.a0("BoostingTelegramPremiumFor", null, 2131753177, objArr));
        if (K0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) K0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(vu3.m(gl.O2(spannableStringBuilder2.toString(), bkb.Wc, 0, new a5b(hj3Var2, K0, (byte) 5), wjbVar), textView.getPaint().getFontMetricsInt(), false, null, 0));
            be0Var2.f(K0, new pb0(K0));
            frameLayout.setOnClickListener(new b99(hj3Var2, K0, (byte) 25));
        } else {
            final TLRPC.User V12 = na7.q1(y6c.t0).V1(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final byte b4 = 0;
            textView.setText(vu3.m(l7c.k(V12, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            be0Var2.f(V12, new pb0(0, V12));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: jeb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b5 = b4;
                    TLRPC.User user = V12;
                    hj3 hj3Var3 = hj3Var2;
                    switch (b5) {
                        case 0:
                            hj3Var3.a(user);
                            break;
                        default:
                            hj3Var3.a(user);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) k96.M0(2131753342, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final byte b5 = 1;
            textView3.setText(gl.O2(spannableStringBuilder3.toString(), bkb.Wc, 0, new Runnable() { // from class: ieb
                @Override // java.lang.Runnable
                public final void run() {
                    byte b42 = b5;
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode5 = tL_payments_checkedGiftCode4;
                    hj3 hj3Var3 = hj3Var2;
                    switch (b42) {
                        case 0:
                            hj3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                        default:
                            hj3Var3.a(tL_payments_checkedGiftCode5);
                            break;
                    }
                }
            }, wjbVar));
            textView2.setText(k96.M0(2131753332, null));
            zkb.X(textView2, bkb.i5, wjbVar);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            be0Var.setVisibility(8);
        } else {
            final TLRPC.User V13 = na7.q1(y6c.t0).V1(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (V13 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final byte b6 = 1;
                spannableStringBuilder4.append((CharSequence) l7c.k(V13, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(vu3.m(gl.O2(spannableStringBuilder4.toString(), bkb.Wc, 0, new Runnable() { // from class: gd5
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b6;
                        TLRPC.User user = V13;
                        hj3 hj3Var22 = hj3Var2;
                        switch (b32) {
                            case 0:
                                hj3Var22.a(user);
                                break;
                            default:
                                hj3Var22.a(user);
                                break;
                        }
                    }
                }, wjbVar), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                be0Var.f(V13, new pb0(0, V13));
                mebVar = mebVar2;
                mebVar.y.setOnClickListener(new View.OnClickListener() { // from class: jeb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b52 = b6;
                        TLRPC.User user = V13;
                        hj3 hj3Var3 = hj3Var2;
                        switch (b52) {
                            case 0:
                                hj3Var3.a(user);
                                break;
                            default:
                                hj3Var3.a(user);
                                break;
                        }
                    }
                });
                if (tL_payments_checkedGiftCode4.boost == null) {
                    mebVar.E.setVisibility(8);
                    return;
                }
                return;
            }
        }
        mebVar = mebVar2;
        if (tL_payments_checkedGiftCode4.boost == null) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View h36Var;
        Context context = viewGroup.getContext();
        wjb wjbVar = this.c;
        if (i == 1) {
            h36Var = new h36(context, wjbVar);
        } else if (i == 2) {
            h36Var = new meb(context, wjbVar);
        } else if (i == 3) {
            h36Var = new lhb(context, wjbVar);
        } else if (i != 4) {
            h36Var = i != 5 ? new kd5(context, wjbVar) : new View(context);
        } else {
            h36Var = new n8(context, wjbVar);
            h36Var.setPadding(0, 0, 0, gl.L(14.0f));
        }
        return ls6.h(h36Var, h36Var, -1, -2);
    }
}
