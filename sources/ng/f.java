package ng;

import ag.l;
import ag.t0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import mh.k;
import og.e0;
import og.f0;
import og.s;
import og.v;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sk0;
import s4.c1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class f extends sk0 {
    public final p6 c;
    public boolean d;
    public k2 e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public p2 n;

    public f(p6 p6Var) {
        this.c = p6Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(c1 c1Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override // s4.g0
    public final int b() {
        return 5;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        return 5;
                    }
                }
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0346  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(c1 c1Var, int i10) {
        int i11;
        char c10;
        String G;
        e0 e0Var;
        int i12 = c1Var.f;
        View view = c1Var.a;
        final int i13 = 0;
        if (i12 == 0) {
            s sVar = (s) view;
            if (this.d) {
                sVar.c.setText(cd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                sVar.d.setText(i0.W2(cd.a0("BoostingLinkAllows", null, 2131753343, new Object[0])));
            } else {
                sVar.c.setText(cd.a0("BoostingUsedGiftLink", null, 2131753173, new Object[0]));
                sVar.d.setText(i0.W2(cd.a0("BoostingLinkUsed", null, 2131753339, new Object[0])));
            }
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = this.f;
            if (tL_payments_checkedGiftCode.boost != null) {
                long j10 = tL_payments_checkedGiftCode.to_id;
                final l lVar = new l(this, 22);
                sVar.c.setText(cd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                SpannableStringBuilder W2 = i0.W2(cd.L0(2131753341, null));
                final TLRPC.User Z1 = vp.r1(d20.s0).Z1(Long.valueOf(j10));
                final int i14 = 0;
                sVar.d.setText(i0.J2(W2, i0.R2("**" + h20.p(Z1) + "**", t6.Uc, 2, new Runnable() { // from class: og.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                lVar.a(Z1);
                                break;
                            default:
                                lVar.a(Z1);
                                break;
                        }
                    }
                }, sVar.e), "%1$s"));
            }
            if (this.f.to_id == -1) {
                sVar.c.setText(cd.a0("BoostingGiftLink", null, 2131753500, new Object[0]));
                sVar.d.setText(i0.W2(cd.a0("BoostingLinkAllowsAnyone", null, 2131753342, new Object[0])));
                return;
            }
            return;
        }
        int i15 = 1;
        if (i12 == 1) {
            v vVar = (v) view;
            vVar.setSlug(this.h);
            if (this.f.boost != null && this.h == null) {
                vVar.a(new c(this, 0));
            }
            String str = this.h;
            if ((str == null || str.isEmpty()) && this.f.to_id == -1) {
                vVar.a(new c(this, 0));
                return;
            }
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    return;
                }
                og.a aVar = (og.a) view;
                aVar.setOkStyle(this.d);
                aVar.setOnClickListener(new t0(11, this, aVar));
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode2 = this.f;
                if (tL_payments_checkedGiftCode2.boost != null || tL_payments_checkedGiftCode2.flags == -1) {
                    aVar.e = false;
                    vh.d dVar = aVar.a;
                    dVar.setShowZero(false);
                    dVar.setEnabled(true);
                    dVar.i(cd.a0("Close", null, 2131752041, new Object[0]), false, true);
                    aVar.setOnClickListener(new ag.g(this, 15));
                    return;
                }
                return;
            }
            f0 f0Var = (f0) view;
            f0Var.setTextGravity(17);
            a7.V(f0Var.getTextView(), t6.G6, null);
            f0Var.setTopPadding(14);
            f0Var.setBottomPadding(15);
            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode3 = this.f;
            if (tL_payments_checkedGiftCode3.boost == null) {
                if (this.d) {
                    f0Var.setText(i0.R2(tL_payments_checkedGiftCode3.to_id == -1 ? cd.L0(2131753271, null) : cd.L0(2131753270, null), t6.Uc, 0, new c(this, i15), this.c));
                    return;
                } else {
                    Date date = new Date(this.f.used_date * 1000);
                    f0Var.setText(cd.a0("BoostingUsedLinkDate", null, 2131753172, cd.a0("formatDateAtTime", null, 2131742808, cd.D0().B0().format(date), cd.D0().o0().format(date))));
                    return;
                }
            }
            String str2 = this.h;
            if (str2 == null || str2.isEmpty()) {
                f0Var.setText(cd.L0(2131753340, null));
                return;
            } else {
                f0Var.setFixedSize(14);
                f0Var.setText(null);
                return;
            }
        }
        e0 e0Var2 = (e0) view;
        final TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode4 = this.f;
        final l lVar2 = new l(this, 22);
        g9 g9Var = e0Var2.h;
        FrameLayout frameLayout = e0Var2.x;
        g9 g9Var2 = e0Var2.f;
        TextView textView = e0Var2.a;
        TextView textView2 = e0Var2.b;
        p6 p6Var = e0Var2.n;
        Date date2 = new Date(tL_payments_checkedGiftCode4.date * 1000);
        e0Var2.e.setText(cd.a0("formatDateAtTime", null, 2131742808, cd.D0().B0().format(date2), cd.D0().o0().format(date2)));
        TextView textView3 = e0Var2.d;
        a7.V(textView3, tL_payments_checkedGiftCode4.via_giveaway ? t6.m5 : t6.j5, p6Var);
        TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(-o5.o(tL_payments_checkedGiftCode4.from_id)));
        boolean V = w3.V(L0);
        if (tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "**");
            spannableStringBuilder.append((CharSequence) cd.L0(2131753492, null));
            spannableStringBuilder.append((CharSequence) "**");
            textView3.setText(i0.R2(spannableStringBuilder.toString(), t6.Uc, 0, new Runnable() { // from class: og.b0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            lVar2.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            lVar2.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, p6Var));
            textView3.setOnClickListener(new t0(13, lVar2, tL_payments_checkedGiftCode4));
        } else {
            textView3.setText(cd.L0(V ? 2131753165 : 2131753164, null));
            textView3.setOnClickListener(null);
        }
        int i16 = tL_payments_checkedGiftCode4.months;
        if (i16 == 12) {
            i11 = 1;
            G = cd.G(1, "Years", new Object[0]);
            c10 = 0;
        } else {
            i11 = 1;
            c10 = 0;
            G = cd.G(i16, "Months", new Object[0]);
        }
        TextView textView4 = e0Var2.c;
        Object[] objArr = new Object[i11];
        objArr[c10] = G;
        textView4.setText(cd.a0("BoostingTelegramPremiumFor", null, 2131753180, objArr));
        if (L0 != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "**");
            spannableStringBuilder2.append((CharSequence) L0.title);
            spannableStringBuilder2.append((CharSequence) "**");
            textView.setText(k6.m(i0.R2(spannableStringBuilder2.toString(), t6.Uc, 0, new k(7, lVar2, L0), p6Var), textView.getPaint().getFontMetricsInt(), false, null, 0));
            g9Var2.e(L0, new r8(L0));
            frameLayout.setOnClickListener(new t0(14, lVar2, L0));
        } else {
            final TLRPC.User Z12 = vp.r1(d20.s0).Z1(Long.valueOf(tL_payments_checkedGiftCode4.from_id.user_id));
            final int i17 = 0;
            textView.setText(k6.m(h20.j(Z12, true), textView.getPaint().getFontMetricsInt(), false, null, 0));
            g9Var2.e(Z12, new r8(0, Z12));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: og.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i17) {
                        case 0:
                            lVar2.a(Z12);
                            break;
                        default:
                            lVar2.a(Z12);
                            break;
                    }
                }
            });
        }
        if (tL_payments_checkedGiftCode4.to_id == -1 && tL_payments_checkedGiftCode4.via_giveaway) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) "**");
            spannableStringBuilder3.append((CharSequence) cd.L0(2131753345, null));
            spannableStringBuilder3.append((CharSequence) "**");
            final int i18 = 1;
            textView3.setText(i0.R2(spannableStringBuilder3.toString(), t6.Uc, 0, new Runnable() { // from class: og.b0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i18) {
                        case 0:
                            lVar2.a(tL_payments_checkedGiftCode4);
                            break;
                        default:
                            lVar2.a(tL_payments_checkedGiftCode4);
                            break;
                    }
                }
            }, p6Var));
            textView2.setText(cd.L0(2131753335, null));
            a7.V(textView2, t6.j5, p6Var);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = 0;
            g9Var.setVisibility(8);
        } else {
            final TLRPC.User Z13 = vp.r1(d20.s0).Z1(Long.valueOf(tL_payments_checkedGiftCode4.to_id));
            if (Z13 != null) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                spannableStringBuilder4.append((CharSequence) "**");
                final int i19 = 1;
                spannableStringBuilder4.append((CharSequence) h20.j(Z13, true));
                spannableStringBuilder4.append((CharSequence) "**");
                textView2.setText(k6.m(i0.R2(spannableStringBuilder4.toString(), t6.Uc, 0, new Runnable() { // from class: og.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                lVar2.a(Z13);
                                break;
                            default:
                                lVar2.a(Z13);
                                break;
                        }
                    }
                }, p6Var), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                g9Var.e(Z13, new r8(0, Z13));
                e0Var = e0Var2;
                e0Var.y.setOnClickListener(new View.OnClickListener() { // from class: og.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                lVar2.a(Z13);
                                break;
                            default:
                                lVar2.a(Z13);
                                break;
                        }
                    }
                });
                if (tL_payments_checkedGiftCode4.boost == null) {
                    e0Var.D.setVisibility(8);
                    return;
                }
                return;
            }
        }
        e0Var = e0Var2;
        if (tL_payments_checkedGiftCode4.boost == null) {
        }
    }

    @Override // s4.g0
    public final c1 w(ViewGroup viewGroup, int i10) {
        View vVar;
        Context context = viewGroup.getContext();
        p6 p6Var = this.c;
        if (i10 == 1) {
            vVar = new v(context, p6Var);
        } else if (i10 == 2) {
            vVar = new e0(context, p6Var);
        } else if (i10 == 3) {
            vVar = new f0(context, p6Var);
        } else if (i10 != 4) {
            vVar = i10 != 5 ? new s(context, p6Var) : new View(context);
        } else {
            vVar = new og.a(context, p6Var);
            vVar.setPadding(0, 0, 0, i0.L(14.0f));
        }
        return sc.e.o(vVar, vVar, -1, -2);
    }
}
