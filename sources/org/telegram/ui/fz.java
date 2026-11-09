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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fz extends rg.b {
    public final Context d;
    public final /* synthetic */ iz e;

    public fz(iz izVar, Context context) {
        this.e = izVar;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return (i7 == 3 || i7 == 0 || i7 == 2 || i7 == 5 || i7 == 9 || i7 == 11) ? false : true;
    }

    @Override // v4.g0
    public final int b() {
        return this.e.P.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        az azVar = (az) this.e.P.get(i7);
        if (azVar == null) {
            return 3;
        }
        return azVar.a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        iz izVar = this.e;
        ArrayList arrayList = izVar.P;
        az azVar = (az) arrayList.get(i7);
        if (azVar == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z9 = false;
        boolean z10 = (i11 >= arrayList.size() || (i10 = ((az) arrayList.get(i11)).a) == 3 || i10 == 6) ? false : true;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (azVar.f) {
                n4Var.setText(iz.E0(0, azVar.d, false));
                return;
            } else {
                n4Var.setText(azVar.d);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            String str = azVar.i;
            if (str != null) {
                paVar.d(str, azVar.d, null, z10);
                return;
            }
            long j3 = azVar.h;
            if (j3 > 0) {
                TLRPC.User a22 = izVar.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null) {
                    paVar.d(a22, null, a22.bot ? org.telegram.messenger.id.M0(2131753156, null) : a22.contact ? org.telegram.messenger.id.M0(2131750792, null) : org.telegram.messenger.id.M0(2131750721, null), z10);
                    return;
                }
                return;
            }
            TLRPC.Chat M0 = izVar.getMessagesController().M0(Long.valueOf(-j3));
            if (M0 != null) {
                paVar.d(M0, null, org.telegram.messenger.t3.Y(M0) ? org.telegram.messenger.id.M0(2131751990, null) : M0.participants_count != 0 ? org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.id.H(',', "Subscribers", M0.participants_count) : org.telegram.messenger.id.H(',', "Members", M0.participants_count) : !org.telegram.messenger.t3.t0(M0) ? (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.id.M0(2131748641, null) : org.telegram.messenger.id.M0(2131752329, null) : (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.id.M0(2131748638, null) : org.telegram.messenger.id.M0(2131752318, null), z10);
                return;
            }
            return;
        }
        if (i12 != 4) {
            switch (i12) {
                case 6:
                    ((org.telegram.ui.Cells.z8) view).setText(azVar.d);
                    break;
                case 7:
                    ((cz) view).e(azVar.m, z10);
                    break;
                case 8:
                    ty tyVar = (ty) view;
                    if (tyVar.c != z10) {
                        tyVar.c = z10;
                        tyVar.setWillNotDraw(!z10);
                        break;
                    }
                    break;
                case 9:
                    yy yyVar = (yy) view;
                    izVar.I = yyVar;
                    yyVar.e(org.telegram.ui.Components.r5.cloneSpans(izVar.x, -1, yyVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    izVar.I.d(izVar.getUserConfig().q() ? izVar.E : -1, false);
                    izVar.I.setText(org.telegram.messenger.id.M0(2131750622, null));
                    break;
                case 10:
                    gm0 gm0Var = (gm0) view;
                    gm0Var.setCloseAsLock(!izVar.getUserConfig().q());
                    gm0Var.a(izVar.getUserConfig().q() ? izVar.E : -1, false);
                    gm0Var.setOnColorClick(new org.telegram.ui.Components.fx(11, this, gm0Var));
                    break;
                case 11:
                    zy zyVar = (zy) view;
                    izVar.J = zyVar;
                    zyVar.setText(azVar.d);
                    org.telegram.ui.Cells.w3 w3Var = zyVar.r;
                    w3Var.setText(azVar.e);
                    w3Var.setOnClickListener(azVar.c);
                    break;
            }
            return;
        }
        ry ryVar = (ry) view;
        boolean z11 = azVar.l;
        ImageView imageView = ryVar.a;
        TextView textView = ryVar.b;
        org.telegram.ui.ActionBar.s6.s(imageView, z11 ? org.telegram.ui.ActionBar.l6.q7 : org.telegram.ui.ActionBar.l6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.s6.U(textView, z11 ? org.telegram.ui.ActionBar.l6.p7 : org.telegram.ui.ActionBar.l6.q6, null);
        int i13 = azVar.k;
        CharSequence charSequence = azVar.d;
        ImageView imageView2 = ryVar.a;
        int i14 = org.telegram.messenger.id.a0 ? -1 : 1;
        if (i13 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i13);
        }
        if (org.telegram.messenger.id.a0) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(i13 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i13 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z10 && i13 != 0) {
            z9 = true;
        }
        Boolean bool = ryVar.e;
        if (bool == null || bool.booleanValue() != z9) {
            ryVar.e = Boolean.valueOf(z9);
            if (ryVar.c == i13) {
                textView.clearAnimation();
                textView.animate().translationX(z9 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            } else {
                textView.setTranslationX(z9 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f);
            }
        }
        ryVar.d = z10;
        ryVar.setWillNotDraw(!z10);
        ryVar.c = i13;
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        Context context = this.d;
        iz izVar = this.e;
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
                org.telegram.ui.Components.tt0 tt0Var = (org.telegram.ui.Components.tt0) izVar.fragmentView;
                String M0 = org.telegram.messenger.id.M0(2131750732, null);
                g6Var = ((org.telegram.ui.ActionBar.f2) izVar).resourceProvider;
                dz dzVar = new dz(this.d, tt0Var, M0, false, 12, g6Var);
                izVar.K = dzVar;
                dzVar.r = false;
                dzVar.s = true;
                org.telegram.ui.Cells.f3 f3Var = dzVar.b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(izVar.getThemedColor(org.telegram.ui.ActionBar.l6.Ci)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(izVar.x);
                i10 = ((org.telegram.ui.ActionBar.f2) izVar).currentAccount;
                org.telegram.ui.Components.i5.r(i10, izVar.y);
                org.telegram.ui.Components.zs editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                view = dzVar;
                break;
            case 3:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                ry ryVar = new ry(context);
                ryVar.d = true;
                ryVar.e = null;
                ImageView imageView = new ImageView(context);
                ryVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                ryVar.addView(imageView, c8.ha.d(24, 24.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                ryVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z9 = org.telegram.messenger.id.a0;
                textView.setPadding(z9 ? 24 : 0, 0, z9 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
                boolean z10 = org.telegram.messenger.id.a0;
                ryVar.addView(textView, c8.ha.d(-1, -2.0f, 23, z10 ? 0.0f : 72.0f, 0.0f, z10 ? 72.0f : 0.0f, 0.0f));
                view = ryVar;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
                k0Var.b = dh0Var;
                dh0Var.f(R.raw.filter_new, 100, 100, null);
                dh0Var.setScaleType(ImageView.ScaleType.CENTER);
                dh0Var.d();
                k0Var.addView(dh0Var, c8.ha.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                dh0Var.setOnClickListener(new a(k0Var, 23));
                view = k0Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.f2) izVar).currentAccount;
                view = new ez(this, this.d, izVar, i11, izVar.r.a);
                break;
            case 8:
                view = new ty(context);
                break;
            case 9:
                view = new yy(izVar, context);
                break;
            case 10:
                Activity parentActivity = izVar.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.f2) izVar).currentAccount;
                g6Var2 = ((org.telegram.ui.ActionBar.f2) izVar).resourceProvider;
                view = new gm0(2, i12, parentActivity, g6Var2);
                break;
            case 11:
                g6Var3 = ((org.telegram.ui.ActionBar.f2) izVar).resourceProvider;
                view = new zy(context, g6Var3);
                break;
        }
        return new org.telegram.ui.Components.yi0(view);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 != 2 && i7 == 9) {
            yy yyVar = (yy) d1Var.a;
            iz izVar = this.e;
            yyVar.e(org.telegram.ui.Components.r5.cloneSpans(izVar.x, -1, izVar.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // v4.g0
    public final void z(v4.d1 d1Var) {
        if (d1Var.f == 2) {
            org.telegram.ui.Cells.h3 h3Var = (org.telegram.ui.Cells.h3) d1Var.a;
            h3Var.b.k(true);
            h3Var.b.d();
        }
    }
}
