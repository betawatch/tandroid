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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e00 extends hg.c {
    public final Context d;
    public final /* synthetic */ h00 e;

    public e00(h00 h00Var, Context context) {
        this.e = h00Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.tk0
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
        zz zzVar = (zz) this.e.P.get(i10);
        if (zzVar == null) {
            return 3;
        }
        return zzVar.a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        h00 h00Var = this.e;
        ArrayList arrayList = h00Var.P;
        zz zzVar = (zz) arrayList.get(i10);
        if (zzVar == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((zz) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (zzVar.f) {
                p4Var.setText(h00.E0(0, zzVar.d, false));
                return;
            } else {
                p4Var.setText(zzVar.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            String str = zzVar.i;
            if (str != null) {
                paVar.d(str, zzVar.d, null, z11);
                return;
            }
            long j10 = zzVar.h;
            if (j10 > 0) {
                TLRPC.User Z1 = h00Var.getMessagesController().Z1(Long.valueOf(j10));
                if (Z1 != null) {
                    paVar.d(Z1, null, Z1.bot ? org.telegram.messenger.dd.L0(2131753156, null) : Z1.contact ? org.telegram.messenger.dd.L0(2131750793, null) : org.telegram.messenger.dd.L0(2131750722, null), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat L0 = h00Var.getMessagesController().L0(Long.valueOf(-j10));
            if (L0 != null) {
                paVar.d(L0, null, org.telegram.messenger.w3.Y(L0) ? org.telegram.messenger.dd.L0(2131751990, null) : L0.participants_count != 0 ? org.telegram.messenger.w3.V(L0) ? org.telegram.messenger.dd.H(',', "Subscribers", L0.participants_count) : org.telegram.messenger.dd.H(',', "Members", L0.participants_count) : !org.telegram.messenger.w3.t0(L0) ? (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? org.telegram.messenger.dd.L0(2131748656, null) : org.telegram.messenger.dd.L0(2131752329, null) : (!org.telegram.messenger.w3.T(L0) || L0.megagroup) ? org.telegram.messenger.dd.L0(2131748653, null) : org.telegram.messenger.dd.L0(2131752318, null), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.b9) view).setText(zzVar.d);
                    break;
                case 7:
                    ((b00) view).e(zzVar.m, z11);
                    break;
                case 8:
                    rz rzVar = (rz) view;
                    if (rzVar.c != z11) {
                        rzVar.c = z11;
                        rzVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    xz xzVar = (xz) view;
                    h00Var.I = xzVar;
                    xzVar.e(org.telegram.ui.Components.o5.cloneSpans(h00Var.x, -1, xzVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    h00Var.I.d(h00Var.getUserConfig().q() ? h00Var.E : -1, false);
                    h00Var.I.setText(org.telegram.messenger.dd.L0(2131750623, null));
                    break;
                case 10:
                    on0 on0Var = (on0) view;
                    on0Var.setCloseAsLock(!h00Var.getUserConfig().q());
                    on0Var.a(h00Var.getUserConfig().q() ? h00Var.E : -1, false);
                    on0Var.setOnColorClick(new org.telegram.ui.Components.vg(18, this, on0Var));
                    break;
                case 11:
                    yz yzVar = (yz) view;
                    h00Var.J = yzVar;
                    yzVar.setText(zzVar.d);
                    org.telegram.ui.Cells.y3 y3Var = yzVar.r;
                    y3Var.setText(zzVar.e);
                    y3Var.setOnClickListener(zzVar.c);
                    break;
            }
            return;
        }
        pz pzVar = (pz) view;
        boolean z12 = zzVar.l;
        ImageView imageView = pzVar.a;
        TextView textView = pzVar.b;
        org.telegram.ui.ActionBar.a7.t(imageView, z12 ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.a7.V(textView, z12 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.q6, null);
        int i14 = zzVar.k;
        CharSequence charSequence = zzVar.d;
        ImageView imageView2 = pzVar.a;
        int i15 = org.telegram.messenger.dd.X ? -1 : 1;
        if (i14 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i14);
        }
        if (org.telegram.messenger.dd.X) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(i14 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(i14 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i14 != 0) {
            z10 = true;
        }
        Boolean bool = pzVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            pzVar.e = Boolean.valueOf(z10);
            if (pzVar.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? org.telegram.messenger.i0.L(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            } else {
                textView.setTranslationX(z10 ? org.telegram.messenger.i0.L(i15 * (-7)) : 0.0f);
            }
        }
        pzVar.d = z11;
        pzVar.setWillNotDraw(!z11);
        pzVar.c = i14;
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
        h00 h00Var = this.e;
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
                org.telegram.ui.Components.vu0 vu0Var = (org.telegram.ui.Components.vu0) h00Var.fragmentView;
                String L0 = org.telegram.messenger.dd.L0(2131750733, null);
                p6Var = ((org.telegram.ui.ActionBar.k2) h00Var).resourceProvider;
                c00 c00Var = new c00(this.d, vu0Var, L0, false, 12, p6Var);
                h00Var.K = c00Var;
                c00Var.r = false;
                c00Var.s = true;
                org.telegram.ui.Cells.h3 h3Var = c00Var.b;
                h3Var.getEditText().setEmojiColor(Integer.valueOf(h00Var.getThemedColor(org.telegram.ui.ActionBar.t6.Ci)));
                h3Var.setEmojiViewCacheType(25);
                h3Var.setText(h00Var.x);
                i11 = ((org.telegram.ui.ActionBar.k2) h00Var).currentAccount;
                org.telegram.ui.Components.f5.r(i11, h00Var.y);
                org.telegram.ui.Components.mt editText = h3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.l3());
                editText.addTextChangedListener(new n0(this, 7));
                editText.setPadding(org.telegram.messenger.i0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                h3Var.getEditText().setImeOptions(268435462);
                view = c00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                pz pzVar = new pz(context);
                pzVar.d = true;
                pzVar.e = null;
                ImageView imageView = new ImageView(context);
                pzVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                pzVar.addView(imageView, w7.b6.d(24, 24.0f, (org.telegram.messenger.dd.X ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                pzVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.dd.X;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.dd.X ? 5 : 3);
                boolean z11 = org.telegram.messenger.dd.X;
                pzVar.addView(textView, w7.b6.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = pzVar;
                break;
            case 5:
                l0 l0Var = new l0(context, 8);
                org.telegram.ui.Components.fi0 fi0Var = new org.telegram.ui.Components.fi0(context);
                l0Var.b = fi0Var;
                fi0Var.f(R.raw.filter_new, 100, 100, null);
                fi0Var.setScaleType(ImageView.ScaleType.CENTER);
                fi0Var.d();
                l0Var.addView(fi0Var, w7.b6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                fi0Var.setOnClickListener(new a(l0Var, 23));
                view = l0Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.k2) h00Var).currentAccount;
                view = new d00(this, this.d, h00Var, i12, h00Var.r.a);
                break;
            case 8:
                view = new rz(context);
                break;
            case 9:
                view = new xz(h00Var, context);
                break;
            case 10:
                Activity parentActivity = h00Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.k2) h00Var).currentAccount;
                p6Var2 = ((org.telegram.ui.ActionBar.k2) h00Var).resourceProvider;
                view = new on0(2, i13, parentActivity, p6Var2);
                break;
            case 11:
                p6Var3 = ((org.telegram.ui.ActionBar.k2) h00Var).resourceProvider;
                view = new yz(context, p6Var3);
                break;
        }
        return new org.telegram.ui.Components.dk0(view);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 2 && i10 == 9) {
            xz xzVar = (xz) c1Var.a;
            h00 h00Var = this.e;
            xzVar.e(org.telegram.ui.Components.o5.cloneSpans(h00Var.x, -1, h00Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
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
