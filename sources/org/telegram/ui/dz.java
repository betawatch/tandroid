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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dz extends rg.b {
    public final Context d;
    public final /* synthetic */ gz e;

    public dz(gz gzVar, Context context) {
        this.e = gzVar;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.oj0
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
        yy yyVar = (yy) this.e.P.get(i7);
        if (yyVar == null) {
            return 3;
        }
        return yyVar.a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        gz gzVar = this.e;
        ArrayList arrayList = gzVar.P;
        yy yyVar = (yy) arrayList.get(i7);
        if (yyVar == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z9 = false;
        boolean z10 = (i11 >= arrayList.size() || (i10 = ((yy) arrayList.get(i11)).a) == 3 || i10 == 6) ? false : true;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (yyVar.f) {
                n4Var.setText(gz.E0(0, yyVar.d, false));
                return;
            } else {
                n4Var.setText(yyVar.d);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            String str = yyVar.i;
            if (str != null) {
                paVar.d(str, yyVar.d, null, z10);
                return;
            }
            long j3 = yyVar.h;
            if (j3 > 0) {
                TLRPC.User a22 = gzVar.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null) {
                    paVar.d(a22, null, a22.bot ? org.telegram.messenger.hd.M0(2131753156, null) : a22.contact ? org.telegram.messenger.hd.M0(2131750793, null) : org.telegram.messenger.hd.M0(2131750722, null), z10);
                    return;
                }
                return;
            }
            TLRPC.Chat M0 = gzVar.getMessagesController().M0(Long.valueOf(-j3));
            if (M0 != null) {
                paVar.d(M0, null, org.telegram.messenger.t3.Y(M0) ? org.telegram.messenger.hd.M0(2131751990, null) : M0.participants_count != 0 ? org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.hd.H(',', "Subscribers", M0.participants_count) : org.telegram.messenger.hd.H(',', "Members", M0.participants_count) : !org.telegram.messenger.t3.t0(M0) ? (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.hd.M0(2131748640, null) : org.telegram.messenger.hd.M0(2131752329, null) : (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.hd.M0(2131748637, null) : org.telegram.messenger.hd.M0(2131752318, null), z10);
                return;
            }
            return;
        }
        if (i12 != 4) {
            switch (i12) {
                case 6:
                    ((org.telegram.ui.Cells.z8) view).setText(yyVar.d);
                    break;
                case 7:
                    ((az) view).e(yyVar.m, z10);
                    break;
                case 8:
                    ry ryVar = (ry) view;
                    if (ryVar.c != z10) {
                        ryVar.c = z10;
                        ryVar.setWillNotDraw(!z10);
                        break;
                    }
                    break;
                case 9:
                    wy wyVar = (wy) view;
                    gzVar.I = wyVar;
                    wyVar.e(org.telegram.ui.Components.r5.cloneSpans(gzVar.x, -1, wyVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    gzVar.I.d(gzVar.getUserConfig().q() ? gzVar.E : -1, false);
                    gzVar.I.setText(org.telegram.messenger.hd.M0(2131750623, null));
                    break;
                case 10:
                    em0 em0Var = (em0) view;
                    em0Var.setCloseAsLock(!gzVar.getUserConfig().q());
                    em0Var.a(gzVar.getUserConfig().q() ? gzVar.E : -1, false);
                    em0Var.setOnColorClick(new org.telegram.ui.Components.ex(11, this, em0Var));
                    break;
                case 11:
                    xy xyVar = (xy) view;
                    gzVar.J = xyVar;
                    xyVar.setText(yyVar.d);
                    org.telegram.ui.Cells.w3 w3Var = xyVar.r;
                    w3Var.setText(yyVar.e);
                    w3Var.setOnClickListener(yyVar.c);
                    break;
            }
            return;
        }
        py pyVar = (py) view;
        boolean z11 = yyVar.l;
        ImageView imageView = pyVar.a;
        TextView textView = pyVar.b;
        org.telegram.ui.ActionBar.r6.t(imageView, z11 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.r6.V(textView, z11 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.q6, null);
        int i13 = yyVar.k;
        CharSequence charSequence = yyVar.d;
        ImageView imageView2 = pyVar.a;
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
        if (!z10 && i13 != 0) {
            z9 = true;
        }
        Boolean bool = pyVar.e;
        if (bool == null || bool.booleanValue() != z9) {
            pyVar.e = Boolean.valueOf(z9);
            if (pyVar.c == i13) {
                textView.clearAnimation();
                textView.animate().translationX(z9 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            } else {
                textView.setTranslationX(z9 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f);
            }
        }
        pyVar.d = z10;
        pyVar.setWillNotDraw(!z10);
        pyVar.c = i13;
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        Context context = this.d;
        gz gzVar = this.e;
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
                org.telegram.ui.Components.rt0 rt0Var = (org.telegram.ui.Components.rt0) gzVar.fragmentView;
                String M0 = org.telegram.messenger.hd.M0(2131750733, null);
                f6Var = ((org.telegram.ui.ActionBar.f2) gzVar).resourceProvider;
                bz bzVar = new bz(this.d, rt0Var, M0, false, 12, f6Var);
                gzVar.K = bzVar;
                bzVar.r = false;
                bzVar.s = true;
                org.telegram.ui.Cells.f3 f3Var = bzVar.b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(gzVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ci)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(gzVar.x);
                i10 = ((org.telegram.ui.ActionBar.f2) gzVar).currentAccount;
                org.telegram.ui.Components.i5.r(i10, gzVar.y);
                org.telegram.ui.Components.ys editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                view = bzVar;
                break;
            case 3:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                py pyVar = new py(context);
                pyVar.d = true;
                pyVar.e = null;
                ImageView imageView = new ImageView(context);
                pyVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                pyVar.addView(imageView, c8.ha.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                pyVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z9 = org.telegram.messenger.hd.a0;
                textView.setPadding(z9 ? 24 : 0, 0, z9 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                boolean z10 = org.telegram.messenger.hd.a0;
                pyVar.addView(textView, c8.ha.d(-1, -2.0f, 23, z10 ? 0.0f : 72.0f, 0.0f, z10 ? 72.0f : 0.0f, 0.0f));
                view = pyVar;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
                k0Var.b = ch0Var;
                ch0Var.f(R.raw.filter_new, 100, 100, null);
                ch0Var.setScaleType(ImageView.ScaleType.CENTER);
                ch0Var.d();
                k0Var.addView(ch0Var, c8.ha.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                ch0Var.setOnClickListener(new a(k0Var, 23));
                view = k0Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.f2) gzVar).currentAccount;
                view = new cz(this, this.d, gzVar, i11, gzVar.r.a);
                break;
            case 8:
                view = new ry(context);
                break;
            case 9:
                view = new wy(gzVar, context);
                break;
            case 10:
                Activity parentActivity = gzVar.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.f2) gzVar).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.f2) gzVar).resourceProvider;
                view = new em0(2, i12, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.f2) gzVar).resourceProvider;
                view = new xy(context, f6Var3);
                break;
        }
        return new org.telegram.ui.Components.xi0(view);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 != 2 && i7 == 9) {
            wy wyVar = (wy) d1Var.a;
            gz gzVar = this.e;
            wyVar.e(org.telegram.ui.Components.r5.cloneSpans(gzVar.x, -1, gzVar.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
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
