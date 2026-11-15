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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ez extends rg.b {
    public final Context d;
    public final /* synthetic */ hz e;

    public ez(hz hzVar, Context context) {
        this.e = hzVar;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return (i7 == 3 || i7 == 0 || i7 == 2 || i7 == 5 || i7 == 9 || i7 == 11) ? false : true;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.Q.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        zy zyVar = (zy) this.e.Q.get(i7);
        if (zyVar == null) {
            return 3;
        }
        return zyVar.a;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        hz hzVar = this.e;
        ArrayList arrayList = hzVar.Q;
        zy zyVar = (zy) arrayList.get(i7);
        if (zyVar == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z10 = false;
        boolean z11 = (i11 >= arrayList.size() || (i10 = ((zy) arrayList.get(i11)).a) == 3 || i10 == 6) ? false : true;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (zyVar.f) {
                n4Var.setText(hz.E0(0, zyVar.d, false));
                return;
            } else {
                n4Var.setText(zyVar.d);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            String str = zyVar.i;
            if (str != null) {
                paVar.d(str, zyVar.d, null, z11);
                return;
            }
            long j3 = zyVar.h;
            if (j3 > 0) {
                TLRPC.User a22 = hzVar.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null) {
                    paVar.d(a22, null, a22.bot ? org.telegram.messenger.hd.M0(2131753156, null) : a22.contact ? org.telegram.messenger.hd.M0(2131750792, null) : org.telegram.messenger.hd.M0(2131750721, null), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat M0 = hzVar.getMessagesController().M0(Long.valueOf(-j3));
            if (M0 != null) {
                paVar.d(M0, null, org.telegram.messenger.t3.Y(M0) ? org.telegram.messenger.hd.M0(2131751990, null) : M0.participants_count != 0 ? org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.hd.H(',', "Subscribers", M0.participants_count) : org.telegram.messenger.hd.H(',', "Members", M0.participants_count) : !org.telegram.messenger.t3.t0(M0) ? (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.hd.M0(2131748641, null) : org.telegram.messenger.hd.M0(2131752329, null) : (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.hd.M0(2131748638, null) : org.telegram.messenger.hd.M0(2131752318, null), z11);
                return;
            }
            return;
        }
        if (i12 != 4) {
            switch (i12) {
                case 6:
                    ((org.telegram.ui.Cells.y8) view).setText(zyVar.d);
                    break;
                case 7:
                    ((bz) view).e(zyVar.m, z11);
                    break;
                case 8:
                    sy syVar = (sy) view;
                    if (syVar.c != z11) {
                        syVar.c = z11;
                        syVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    xy xyVar = (xy) view;
                    hzVar.J = xyVar;
                    xyVar.e(org.telegram.ui.Components.p5.cloneSpans(hzVar.x, -1, xyVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    hzVar.J.d(hzVar.getUserConfig().q() ? hzVar.F : -1, false);
                    hzVar.J.setText(org.telegram.messenger.hd.M0(2131750622, null));
                    break;
                case 10:
                    fm0 fm0Var = (fm0) view;
                    fm0Var.setCloseAsLock(!hzVar.getUserConfig().q());
                    fm0Var.a(hzVar.getUserConfig().q() ? hzVar.F : -1, false);
                    fm0Var.setOnColorClick(new org.telegram.ui.Components.gh(16, this, fm0Var));
                    break;
                case 11:
                    yy yyVar = (yy) view;
                    hzVar.K = yyVar;
                    yyVar.setText(zyVar.d);
                    org.telegram.ui.Cells.w3 w3Var = yyVar.r;
                    w3Var.setText(zyVar.e);
                    w3Var.setOnClickListener(zyVar.c);
                    break;
            }
            return;
        }
        qy qyVar = (qy) view;
        boolean z12 = zyVar.l;
        ImageView imageView = qyVar.a;
        TextView textView = qyVar.b;
        org.telegram.ui.ActionBar.q6.s(imageView, z12 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.q6.U(textView, z12 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.q6, null);
        int i13 = zyVar.k;
        CharSequence charSequence = zyVar.d;
        ImageView imageView2 = qyVar.a;
        int i14 = org.telegram.messenger.hd.a0 ? -1 : 1;
        if (i13 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i13);
        }
        if (org.telegram.messenger.hd.a0) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(i13 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i13 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i13 != 0) {
            z10 = true;
        }
        Boolean bool = qyVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            qyVar.e = Boolean.valueOf(z10);
            if (qyVar.c == i13) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.er.h).start();
            } else {
                textView.setTranslationX(z10 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f);
            }
        }
        qyVar.d = z11;
        qyVar.setWillNotDraw(!z11);
        qyVar.c = i13;
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        Context context = this.d;
        hz hzVar = this.e;
        switch (i7) {
            case 0:
                view = new org.telegram.ui.Cells.n4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                paVar.setSelfAsSavedMessages(true);
                view = paVar;
                break;
            case 2:
                org.telegram.ui.Components.st0 st0Var = (org.telegram.ui.Components.st0) hzVar.fragmentView;
                String M0 = org.telegram.messenger.hd.M0(2131750732, null);
                e6Var = ((org.telegram.ui.ActionBar.e2) hzVar).resourceProvider;
                cz czVar = new cz(this.d, st0Var, M0, false, 12, e6Var);
                hzVar.L = czVar;
                czVar.r = false;
                czVar.s = true;
                org.telegram.ui.Cells.f3 f3Var = czVar.b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(hzVar.getThemedColor(org.telegram.ui.ActionBar.j6.Fi)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(hzVar.x);
                i10 = ((org.telegram.ui.ActionBar.e2) hzVar).currentAccount;
                org.telegram.ui.Components.g5.r(i10, hzVar.y);
                org.telegram.ui.Components.ft editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                view = czVar;
                break;
            case 3:
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 4:
                qy qyVar = new qy(context);
                qyVar.d = true;
                qyVar.e = null;
                ImageView imageView = new ImageView(context);
                qyVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                qyVar.addView(imageView, c8.ja.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                qyVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.hd.a0;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                boolean z11 = org.telegram.messenger.hd.a0;
                qyVar.addView(textView, c8.ja.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = qyVar;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
                k0Var.b = fh0Var;
                fh0Var.f(R.raw.filter_new, 100, 100, null);
                fh0Var.setScaleType(ImageView.ScaleType.CENTER);
                fh0Var.d();
                k0Var.addView(fh0Var, c8.ja.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                fh0Var.setOnClickListener(new a(k0Var, 23));
                view = k0Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.y8(context);
                break;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.e2) hzVar).currentAccount;
                view = new dz(this, this.d, hzVar, i11, hzVar.r.a);
                break;
            case 8:
                view = new sy(context);
                break;
            case 9:
                view = new xy(hzVar, context);
                break;
            case 10:
                Activity parentActivity = hzVar.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.e2) hzVar).currentAccount;
                e6Var2 = ((org.telegram.ui.ActionBar.e2) hzVar).resourceProvider;
                view = new fm0(2, i12, parentActivity, e6Var2);
                break;
            case 11:
                e6Var3 = ((org.telegram.ui.ActionBar.e2) hzVar).resourceProvider;
                view = new yy(context, e6Var3);
                break;
        }
        return new org.telegram.ui.Components.cj0(view);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        int i7 = e1Var.f;
        if (i7 != 2 && i7 == 9) {
            xy xyVar = (xy) e1Var.a;
            hz hzVar = this.e;
            xyVar.e(org.telegram.ui.Components.p5.cloneSpans(hzVar.x, -1, hzVar.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // v4.h0
    public final void z(v4.e1 e1Var) {
        if (e1Var.f == 2) {
            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) e1Var.a;
            h3Var.b.k(true);
            h3Var.b.d();
        }
    }
}
