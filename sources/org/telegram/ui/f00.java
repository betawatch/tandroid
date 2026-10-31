package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f00 extends hg.c {
    public final Context d;
    public final /* synthetic */ i00 e;

    public f00(i00 i00Var, Context context) {
        this.e = i00Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 11) ? false : true;
    }

    @Override // s4.g0
    public final int b() {
        return this.e.P.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        a00 a00Var = (a00) this.e.P.get(i10);
        if (a00Var == null) {
            return 3;
        }
        return a00Var.a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        i00 i00Var = this.e;
        ArrayList arrayList = i00Var.P;
        a00 a00Var = (a00) arrayList.get(i10);
        if (a00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((a00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (a00Var.f) {
                p4Var.setText(i00.D0(0, a00Var.d, false));
                return;
            } else {
                p4Var.setText(a00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            String str = a00Var.i;
            if (str != null) {
                paVar.d(str, a00Var.d, null, z11);
                return;
            }
            long j10 = a00Var.h;
            if (j10 > 0) {
                TLRPC.User Z1 = i00Var.getMessagesController().Z1(Long.valueOf(j10));
                if (Z1 != null) {
                    paVar.d(Z1, null, Z1.bot ? org.telegram.messenger.cd.L0(2131753156, null) : Z1.contact ? org.telegram.messenger.cd.L0(2131750793, null) : org.telegram.messenger.cd.L0(2131750722, null), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat L0 = i00Var.getMessagesController().L0(Long.valueOf(-j10));
            if (L0 != null) {
                paVar.d(L0, null, org.telegram.messenger.w3.Y(L0) ? org.telegram.messenger.cd.L0(2131751990, null) : L0.participants_count != 0 ? org.telegram.messenger.w3.V(L0) ? org.telegram.messenger.cd.H(',', "Subscribers", L0.participants_count) : org.telegram.messenger.cd.H(',', "Members", L0.participants_count) : !org.telegram.messenger.w3.t0(L0) ? (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? org.telegram.messenger.cd.L0(2131748656, null) : org.telegram.messenger.cd.L0(2131752329, null) : (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? org.telegram.messenger.cd.L0(2131748653, null) : org.telegram.messenger.cd.L0(2131752318, null), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.b9) view).setText(a00Var.d);
                    break;
                case 7:
                    ((c00) view).e(a00Var.m, z11);
                    break;
                case 8:
                    sz szVar = (sz) view;
                    if (szVar.c != z11) {
                        szVar.c = z11;
                        szVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    yz yzVar = (yz) view;
                    i00Var.I = yzVar;
                    yzVar.e(org.telegram.ui.Components.o5.cloneSpans(i00Var.x, -1, yzVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    i00Var.I.d(i00Var.getUserConfig().q() ? i00Var.E : -1, false);
                    i00Var.I.setText(org.telegram.messenger.cd.L0(2131750623, null));
                    break;
                case 10:
                    qn0 qn0Var = (qn0) view;
                    qn0Var.setCloseAsLock(!i00Var.getUserConfig().q());
                    qn0Var.a(i00Var.getUserConfig().q() ? i00Var.E : -1, false);
                    qn0Var.setOnColorClick(new org.telegram.ui.Components.vg(17, this, qn0Var));
                    break;
                case 11:
                    zz zzVar = (zz) view;
                    i00Var.J = zzVar;
                    zzVar.setText(a00Var.d);
                    org.telegram.ui.Cells.y3 y3Var = zzVar.r;
                    y3Var.setText(a00Var.e);
                    y3Var.setOnClickListener(a00Var.c);
                    break;
            }
            return;
        }
        qz qzVar = (qz) view;
        boolean z12 = a00Var.l;
        ImageView imageView = qzVar.a;
        TextView textView = qzVar.b;
        org.telegram.ui.ActionBar.a7.t(imageView, z12 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.a7.V(textView, z12 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.q6, null);
        int i14 = a00Var.k;
        CharSequence charSequence = a00Var.d;
        ImageView imageView2 = qzVar.a;
        int i15 = org.telegram.messenger.cd.X ? -1 : 1;
        if (i14 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i14);
        }
        if (org.telegram.messenger.cd.X) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(i14 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(i14 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i14 != 0) {
            z10 = true;
        }
        Boolean bool = qzVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            qzVar.e = Boolean.valueOf(z10);
            if (qzVar.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? org.telegram.messenger.i0.L(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            } else {
                textView.setTranslationX(z10 ? org.telegram.messenger.i0.L(i15 * (-7)) : 0.0f);
            }
        }
        qzVar.d = z11;
        qzVar.setWillNotDraw(!z11);
        qzVar.c = i14;
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        Context context = this.d;
        i00 i00Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.p4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                paVar.setSelfAsSavedMessages(true);
                view = paVar;
                break;
            case 2:
                org.telegram.ui.Components.uu0 uu0Var = (org.telegram.ui.Components.uu0) i00Var.fragmentView;
                String L0 = org.telegram.messenger.cd.L0(2131750733, null);
                p6Var = ((org.telegram.ui.ActionBar.k2) i00Var).resourceProvider;
                d00 d00Var = new d00(this.d, uu0Var, L0, false, 12, p6Var);
                i00Var.K = d00Var;
                d00Var.r = false;
                d00Var.s = true;
                org.telegram.ui.Cells.h3 h3Var = d00Var.b;
                h3Var.getEditText().setEmojiColor(Integer.valueOf(i00Var.getThemedColor(org.telegram.ui.ActionBar.t6.Ci)));
                h3Var.setEmojiViewCacheType(25);
                h3Var.setText(i00Var.x);
                i11 = ((org.telegram.ui.ActionBar.k2) i00Var).currentAccount;
                org.telegram.ui.Components.f5.r(i11, i00Var.y);
                org.telegram.ui.Components.mt editText = h3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.l3());
                editText.addTextChangedListener(new n0(this, 7));
                editText.setPadding(org.telegram.messenger.i0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                h3Var.getEditText().setImeOptions(268435462);
                view = d00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                qz qzVar = new qz(context);
                qzVar.d = true;
                qzVar.e = null;
                ImageView imageView = new ImageView(context);
                qzVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                qzVar.addView(imageView, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                qzVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.cd.X;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
                boolean z11 = org.telegram.messenger.cd.X;
                qzVar.addView(textView, w7.b6.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = qzVar;
                break;
            case 5:
                l0 l0Var = new l0(context, 8);
                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
                l0Var.b = ei0Var;
                ei0Var.f(R.raw.filter_new, 100, 100, null);
                ei0Var.setScaleType(ImageView.ScaleType.CENTER);
                ei0Var.d();
                l0Var.addView(ei0Var, w7.b6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                ei0Var.setOnClickListener(new a(l0Var, 23));
                view = l0Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.k2) i00Var).currentAccount;
                view = new e00(this, this.d, i00Var, i12, i00Var.r.a);
                break;
            case 8:
                view = new sz(context);
                break;
            case 9:
                view = new yz(i00Var, context);
                break;
            case 10:
                Activity parentActivity = i00Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.k2) i00Var).currentAccount;
                p6Var2 = ((org.telegram.ui.ActionBar.k2) i00Var).resourceProvider;
                view = new qn0(2, i13, parentActivity, p6Var2);
                break;
            case 11:
                p6Var3 = ((org.telegram.ui.ActionBar.k2) i00Var).resourceProvider;
                view = new zz(context, p6Var3);
                break;
        }
        return new org.telegram.ui.Components.ck0(view);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 2 && i10 == 9) {
            yz yzVar = (yz) c1Var.a;
            i00 i00Var = this.e;
            yzVar.e(org.telegram.ui.Components.o5.cloneSpans(i00Var.x, -1, i00Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // s4.g0
    public final void z(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) c1Var.a;
            j3Var.b.k(true);
            j3Var.b.d();
        }
    }
}
