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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bz extends sg.b {
    public final Context d;
    public final /* synthetic */ ez e;

    public bz(ez ezVar, Context context) {
        this.e = ezVar;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return (i3 == 3 || i3 == 0 || i3 == 2 || i3 == 5 || i3 == 9 || i3 == 11) ? false : true;
    }

    @Override // u4.h0
    public final int b() {
        return this.e.Q.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        vy vyVar = (vy) this.e.Q.get(i3);
        if (vyVar == null) {
            return 3;
        }
        return vyVar.a;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        ez ezVar = this.e;
        ArrayList arrayList = ezVar.Q;
        vy vyVar = (vy) arrayList.get(i3);
        if (vyVar == null) {
            return;
        }
        int i11 = i3 + 1;
        boolean z10 = false;
        boolean z11 = (i11 >= arrayList.size() || (i10 = ((vy) arrayList.get(i11)).a) == 3 || i10 == 6) ? false : true;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (vyVar.f) {
                n4Var.setText(ez.E0(0, vyVar.d, false));
                return;
            } else {
                n4Var.setText(vyVar.d);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            String str = vyVar.i;
            if (str != null) {
                paVar.d(str, vyVar.d, null, z11);
                return;
            }
            long j10 = vyVar.h;
            if (j10 > 0) {
                TLRPC.User a22 = ezVar.getMessagesController().a2(Long.valueOf(j10));
                if (a22 != null) {
                    paVar.d(a22, null, a22.bot ? org.telegram.messenger.bd.M0(2131753156, null) : a22.contact ? org.telegram.messenger.bd.M0(2131750793, null) : org.telegram.messenger.bd.M0(2131750722, null), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat M0 = ezVar.getMessagesController().M0(Long.valueOf(-j10));
            if (M0 != null) {
                paVar.d(M0, null, org.telegram.messenger.t3.Y(M0) ? org.telegram.messenger.bd.M0(2131751990, null) : M0.participants_count != 0 ? org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.bd.H(',', "Subscribers", M0.participants_count) : org.telegram.messenger.bd.H(',', "Members", M0.participants_count) : !org.telegram.messenger.t3.t0(M0) ? (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.bd.M0(2131748649, null) : org.telegram.messenger.bd.M0(2131752329, null) : (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.bd.M0(2131748646, null) : org.telegram.messenger.bd.M0(2131752318, null), z11);
                return;
            }
            return;
        }
        if (i12 != 4) {
            switch (i12) {
                case 6:
                    ((org.telegram.ui.Cells.y8) view).setText(vyVar.d);
                    break;
                case 7:
                    ((yy) view).e(vyVar.m, z11);
                    break;
                case 8:
                    oy oyVar = (oy) view;
                    if (oyVar.c != z11) {
                        oyVar.c = z11;
                        oyVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    ty tyVar = (ty) view;
                    ezVar.J = tyVar;
                    tyVar.e(org.telegram.ui.Components.p5.cloneSpans(ezVar.x, -1, tyVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    ezVar.J.d(ezVar.getUserConfig().q() ? ezVar.F : -1, false);
                    ezVar.J.setText(org.telegram.messenger.bd.M0(2131750623, null));
                    break;
                case 10:
                    zl0 zl0Var = (zl0) view;
                    zl0Var.setCloseAsLock(!ezVar.getUserConfig().q());
                    zl0Var.a(ezVar.getUserConfig().q() ? ezVar.F : -1, false);
                    zl0Var.setOnColorClick(new org.telegram.ui.Components.ei(14, this, zl0Var));
                    break;
                case 11:
                    uy uyVar = (uy) view;
                    ezVar.K = uyVar;
                    uyVar.setText(vyVar.d);
                    org.telegram.ui.Cells.w3 w3Var = uyVar.r;
                    w3Var.setText(vyVar.e);
                    w3Var.setOnClickListener(vyVar.c);
                    break;
            }
            return;
        }
        my myVar = (my) view;
        boolean z12 = vyVar.l;
        ImageView imageView = myVar.a;
        TextView textView = myVar.b;
        org.telegram.ui.ActionBar.r6.t(imageView, z12 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.r6.V(textView, z12 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.q6, null);
        int i13 = vyVar.k;
        CharSequence charSequence = vyVar.d;
        ImageView imageView2 = myVar.a;
        int i14 = org.telegram.messenger.bd.a0 ? -1 : 1;
        if (i13 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i13);
        }
        if (org.telegram.messenger.bd.a0) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(i13 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i13 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i13 != 0) {
            z10 = true;
        }
        Boolean bool = myVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            myVar.e = Boolean.valueOf(z10);
            if (myVar.c == i13) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            } else {
                textView.setTranslationX(z10 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f);
            }
        }
        myVar.d = z11;
        myVar.setWillNotDraw(!z11);
        myVar.c = i13;
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.d;
        ez ezVar = this.e;
        switch (i3) {
            case 0:
                view = new org.telegram.ui.Cells.n4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                paVar.setSelfAsSavedMessages(true);
                view = paVar;
                break;
            case 2:
                org.telegram.ui.Components.qt0 qt0Var = (org.telegram.ui.Components.qt0) ezVar.fragmentView;
                String M0 = org.telegram.messenger.bd.M0(2131750733, null);
                e6Var = ((org.telegram.ui.ActionBar.d2) ezVar).resourceProvider;
                zy zyVar = new zy(this.d, qt0Var, M0, false, 12, e6Var);
                ezVar.L = zyVar;
                zyVar.r = false;
                zyVar.s = true;
                org.telegram.ui.Cells.f3 f3Var = zyVar.b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(ezVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ci)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(ezVar.x);
                i10 = ((org.telegram.ui.ActionBar.d2) ezVar).currentAccount;
                org.telegram.ui.Components.g5.r(i10, ezVar.y);
                org.telegram.ui.Components.xs editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new n0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                view = zyVar;
                break;
            case 3:
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                my myVar = new my(context);
                myVar.d = true;
                myVar.e = null;
                ImageView imageView = new ImageView(context);
                myVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                myVar.addView(imageView, b8.mf.d(24, 24.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                myVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.bd.a0;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
                boolean z11 = org.telegram.messenger.bd.a0;
                myVar.addView(textView, b8.mf.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = myVar;
                break;
            case 5:
                l0 l0Var = new l0(context, 8);
                org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
                l0Var.b = fh0Var;
                fh0Var.f(R.raw.filter_new, 100, 100, null);
                fh0Var.setScaleType(ImageView.ScaleType.CENTER);
                fh0Var.d();
                l0Var.addView(fh0Var, b8.mf.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                fh0Var.setOnClickListener(new a(l0Var, 23));
                view = l0Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.d2) ezVar).currentAccount;
                view = new az(this, this.d, ezVar, i11, ezVar.r.a);
                break;
            case 8:
                view = new oy(context);
                break;
            case 9:
                view = new ty(ezVar, context);
                break;
            case 10:
                Activity parentActivity = ezVar.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.d2) ezVar).currentAccount;
                e6Var2 = ((org.telegram.ui.ActionBar.d2) ezVar).resourceProvider;
                view = new zl0(2, i12, parentActivity, e6Var2);
                break;
            case 11:
                e6Var3 = ((org.telegram.ui.ActionBar.d2) ezVar).resourceProvider;
                view = new uy(context, e6Var3);
                break;
        }
        return new org.telegram.ui.Components.bj0(view);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        int i3 = d1Var.f;
        if (i3 != 2 && i3 == 9) {
            ty tyVar = (ty) d1Var.a;
            ez ezVar = this.e;
            tyVar.e(org.telegram.ui.Components.p5.cloneSpans(ezVar.x, -1, ezVar.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // u4.h0
    public final void z(u4.d1 d1Var) {
        if (d1Var.f == 2) {
            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) d1Var.a;
            h3Var.b.k(true);
            h3Var.b.d();
        }
    }
}
