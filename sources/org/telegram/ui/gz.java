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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gz extends rg.b {
    public final Context d;
    public final /* synthetic */ jz e;

    public gz(jz jzVar, Context context) {
        this.e = jzVar;
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
        bz bzVar = (bz) this.e.P.get(i7);
        if (bzVar == null) {
            return 3;
        }
        return bzVar.a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        jz jzVar = this.e;
        ArrayList arrayList = jzVar.P;
        bz bzVar = (bz) arrayList.get(i7);
        if (bzVar == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z9 = false;
        boolean z10 = (i11 >= arrayList.size() || (i10 = ((bz) arrayList.get(i11)).a) == 3 || i10 == 6) ? false : true;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (bzVar.f) {
                n4Var.setText(jz.E0(0, bzVar.d, false));
                return;
            } else {
                n4Var.setText(bzVar.d);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            String str = bzVar.i;
            if (str != null) {
                paVar.d(str, bzVar.d, null, z10);
                return;
            }
            long j3 = bzVar.h;
            if (j3 > 0) {
                TLRPC.User a22 = jzVar.getMessagesController().a2(Long.valueOf(j3));
                if (a22 != null) {
                    paVar.d(a22, null, a22.bot ? org.telegram.messenger.id.M0(2131753156, null) : a22.contact ? org.telegram.messenger.id.M0(2131750792, null) : org.telegram.messenger.id.M0(2131750721, null), z10);
                    return;
                }
                return;
            }
            TLRPC.Chat M0 = jzVar.getMessagesController().M0(Long.valueOf(-j3));
            if (M0 != null) {
                paVar.d(M0, null, org.telegram.messenger.t3.Y(M0) ? org.telegram.messenger.id.M0(2131751990, null) : M0.participants_count != 0 ? org.telegram.messenger.t3.V(M0) ? org.telegram.messenger.id.H(',', "Subscribers", M0.participants_count) : org.telegram.messenger.id.H(',', "Members", M0.participants_count) : !org.telegram.messenger.t3.t0(M0) ? (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.id.M0(2131748641, null) : org.telegram.messenger.id.M0(2131752329, null) : (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? org.telegram.messenger.id.M0(2131748638, null) : org.telegram.messenger.id.M0(2131752318, null), z10);
                return;
            }
            return;
        }
        if (i12 != 4) {
            switch (i12) {
                case 6:
                    ((org.telegram.ui.Cells.z8) view).setText(bzVar.d);
                    break;
                case 7:
                    ((dz) view).e(bzVar.m, z10);
                    break;
                case 8:
                    uy uyVar = (uy) view;
                    if (uyVar.c != z10) {
                        uyVar.c = z10;
                        uyVar.setWillNotDraw(!z10);
                        break;
                    }
                    break;
                case 9:
                    zy zyVar = (zy) view;
                    jzVar.I = zyVar;
                    zyVar.e(org.telegram.ui.Components.q5.cloneSpans(jzVar.x, -1, zyVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    jzVar.I.d(jzVar.getUserConfig().q() ? jzVar.E : -1, false);
                    jzVar.I.setText(org.telegram.messenger.id.M0(2131750622, null));
                    break;
                case 10:
                    hm0 hm0Var = (hm0) view;
                    hm0Var.setCloseAsLock(!jzVar.getUserConfig().q());
                    hm0Var.a(jzVar.getUserConfig().q() ? jzVar.E : -1, false);
                    hm0Var.setOnColorClick(new org.telegram.ui.Components.ex(11, this, hm0Var));
                    break;
                case 11:
                    az azVar = (az) view;
                    jzVar.J = azVar;
                    azVar.setText(bzVar.d);
                    org.telegram.ui.Cells.w3 w3Var = azVar.r;
                    w3Var.setText(bzVar.e);
                    w3Var.setOnClickListener(bzVar.c);
                    break;
            }
            return;
        }
        sy syVar = (sy) view;
        boolean z11 = bzVar.l;
        ImageView imageView = syVar.a;
        TextView textView = syVar.b;
        org.telegram.ui.ActionBar.t6.s(imageView, z11 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.t6.U(textView, z11 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.q6, null);
        int i13 = bzVar.k;
        CharSequence charSequence = bzVar.d;
        ImageView imageView2 = syVar.a;
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
        Boolean bool = syVar.e;
        if (bool == null || bool.booleanValue() != z9) {
            syVar.e = Boolean.valueOf(z9);
            if (syVar.c == i13) {
                textView.clearAnimation();
                textView.animate().translationX(z9 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.wq.h).start();
            } else {
                textView.setTranslationX(z9 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f);
            }
        }
        syVar.d = z10;
        syVar.setWillNotDraw(!z10);
        syVar.c = i13;
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        Context context = this.d;
        jz jzVar = this.e;
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
                org.telegram.ui.Components.st0 st0Var = (org.telegram.ui.Components.st0) jzVar.fragmentView;
                String M0 = org.telegram.messenger.id.M0(2131750732, null);
                h6Var = ((org.telegram.ui.ActionBar.f2) jzVar).resourceProvider;
                ez ezVar = new ez(this.d, st0Var, M0, false, 12, h6Var);
                jzVar.K = ezVar;
                ezVar.r = false;
                ezVar.s = true;
                org.telegram.ui.Cells.f3 f3Var = ezVar.b;
                f3Var.getEditText().setEmojiColor(Integer.valueOf(jzVar.getThemedColor(org.telegram.ui.ActionBar.m6.Ci)));
                f3Var.setEmojiViewCacheType(25);
                f3Var.setText(jzVar.x);
                i10 = ((org.telegram.ui.ActionBar.f2) jzVar).currentAccount;
                org.telegram.ui.Components.h5.r(i10, jzVar.y);
                org.telegram.ui.Components.ys editText = f3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.j3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                f3Var.getEditText().setImeOptions(268435462);
                view = ezVar;
                break;
            case 3:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                sy syVar = new sy(context);
                syVar.d = true;
                syVar.e = null;
                ImageView imageView = new ImageView(context);
                syVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                syVar.addView(imageView, c8.ha.d(24, 24.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                syVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z9 = org.telegram.messenger.id.a0;
                textView.setPadding(z9 ? 24 : 0, 0, z9 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.id.a0 ? 5 : 3);
                boolean z10 = org.telegram.messenger.id.a0;
                syVar.addView(textView, c8.ha.d(-1, -2.0f, 23, z10 ? 0.0f : 72.0f, 0.0f, z10 ? 72.0f : 0.0f, 0.0f));
                view = syVar;
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
                i11 = ((org.telegram.ui.ActionBar.f2) jzVar).currentAccount;
                view = new fz(this, this.d, jzVar, i11, jzVar.r.a);
                break;
            case 8:
                view = new uy(context);
                break;
            case 9:
                view = new zy(jzVar, context);
                break;
            case 10:
                Activity parentActivity = jzVar.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.f2) jzVar).currentAccount;
                h6Var2 = ((org.telegram.ui.ActionBar.f2) jzVar).resourceProvider;
                view = new hm0(2, i12, parentActivity, h6Var2);
                break;
            case 11:
                h6Var3 = ((org.telegram.ui.ActionBar.f2) jzVar).resourceProvider;
                view = new az(context, h6Var3);
                break;
        }
        return new org.telegram.ui.Components.xi0(view);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 != 2 && i7 == 9) {
            zy zyVar = (zy) d1Var.a;
            jz jzVar = this.e;
            zyVar.e(org.telegram.ui.Components.q5.cloneSpans(jzVar.x, -1, jzVar.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
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
