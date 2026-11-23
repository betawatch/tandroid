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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gz extends rg.b {
    public final Context d;
    public final /* synthetic */ jz e;

    public gz(jz jzVar, Context context) {
        this.e = jzVar;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return (i7 == 3 || i7 == 0 || i7 == 2 || i7 == 5 || i7 == 9 || i7 == 11) ? false : true;
    }

    @Override // v4.i0
    public final int b() {
        return this.e.Q.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        bz bzVar = (bz) this.e.Q.get(i7);
        if (bzVar == null) {
            return 3;
        }
        return bzVar.a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        jz jzVar = this.e;
        ArrayList arrayList = jzVar.Q;
        bz bzVar = (bz) arrayList.get(i7);
        if (bzVar == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z10 = false;
        boolean z11 = (i11 >= arrayList.size() || (i10 = ((bz) arrayList.get(i11)).a) == 3 || i10 == 6) ? false : true;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            if (bzVar.f) {
                o4Var.setText(jz.E0(0, bzVar.d, false));
                return;
            } else {
                o4Var.setText(bzVar.d);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            String str = bzVar.i;
            if (str != null) {
                saVar.d(str, bzVar.d, null, z11);
                return;
            }
            long j3 = bzVar.h;
            if (j3 > 0) {
                TLRPC.User c22 = jzVar.getMessagesController().c2(Long.valueOf(j3));
                if (c22 != null) {
                    saVar.d(c22, null, c22.bot ? org.telegram.messenger.gd.N0(2131753153, null) : c22.contact ? org.telegram.messenger.gd.N0(2131750780, null) : org.telegram.messenger.gd.N0(2131750707, null), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat O0 = jzVar.getMessagesController().O0(Long.valueOf(-j3));
            if (O0 != null) {
                saVar.d(O0, null, org.telegram.messenger.v3.Y(O0) ? org.telegram.messenger.gd.N0(2131751978, null) : O0.participants_count != 0 ? org.telegram.messenger.v3.V(O0) ? org.telegram.messenger.gd.H(',', "Subscribers", O0.participants_count) : org.telegram.messenger.gd.H(',', "Members", O0.participants_count) : !org.telegram.messenger.v3.t0(O0) ? (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? org.telegram.messenger.gd.N0(2131748448, null) : org.telegram.messenger.gd.N0(2131752317, null) : (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? org.telegram.messenger.gd.N0(2131748445, null) : org.telegram.messenger.gd.N0(2131752306, null), z11);
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
                    ((dz) view).e(bzVar.m, z11);
                    break;
                case 8:
                    uy uyVar = (uy) view;
                    if (uyVar.c != z11) {
                        uyVar.c = z11;
                        uyVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    zy zyVar = (zy) view;
                    jzVar.J = zyVar;
                    zyVar.e(org.telegram.ui.Components.x5.cloneSpans(jzVar.x, -1, zyVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    jzVar.J.d(jzVar.getUserConfig().q() ? jzVar.F : -1, false);
                    jzVar.J.setText(org.telegram.messenger.gd.N0(2131750605, null));
                    break;
                case 10:
                    gm0 gm0Var = (gm0) view;
                    gm0Var.setCloseAsLock(!jzVar.getUserConfig().q());
                    gm0Var.a(jzVar.getUserConfig().q() ? jzVar.F : -1, false);
                    gm0Var.setOnColorClick(new org.telegram.ui.Components.ph(16, this, gm0Var));
                    break;
                case 11:
                    az azVar = (az) view;
                    jzVar.K = azVar;
                    azVar.setText(bzVar.d);
                    org.telegram.ui.Cells.x3 x3Var = azVar.r;
                    x3Var.setText(bzVar.e);
                    x3Var.setOnClickListener(bzVar.c);
                    break;
            }
            return;
        }
        sy syVar = (sy) view;
        boolean z12 = bzVar.l;
        ImageView imageView = syVar.a;
        TextView textView = syVar.b;
        org.telegram.ui.ActionBar.u6.s(imageView, z12 ? org.telegram.ui.ActionBar.n6.q7 : org.telegram.ui.ActionBar.n6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.u6.U(textView, z12 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.q6, null);
        int i13 = bzVar.k;
        CharSequence charSequence = bzVar.d;
        ImageView imageView2 = syVar.a;
        int i14 = org.telegram.messenger.gd.a0 ? -1 : 1;
        if (i13 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i13);
        }
        if (org.telegram.messenger.gd.a0) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(i13 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i13 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i13 != 0) {
            z10 = true;
        }
        Boolean bool = syVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            syVar.e = Boolean.valueOf(z10);
            if (syVar.c == i13) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.kr.h).start();
            } else {
                textView.setTranslationX(z10 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f);
            }
        }
        syVar.d = z11;
        syVar.setWillNotDraw(!z11);
        syVar.c = i13;
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        Context context = this.d;
        jz jzVar = this.e;
        switch (i7) {
            case 0:
                view = new org.telegram.ui.Cells.o4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                saVar.setSelfAsSavedMessages(true);
                view = saVar;
                break;
            case 2:
                org.telegram.ui.Components.cu0 cu0Var = (org.telegram.ui.Components.cu0) jzVar.fragmentView;
                String N0 = org.telegram.messenger.gd.N0(2131750720, null);
                i6Var = ((org.telegram.ui.ActionBar.g2) jzVar).resourceProvider;
                ez ezVar = new ez(this.d, cu0Var, N0, false, 12, i6Var);
                jzVar.L = ezVar;
                ezVar.r = false;
                ezVar.s = true;
                org.telegram.ui.Cells.g3 g3Var = ezVar.b;
                g3Var.getEditText().setEmojiColor(Integer.valueOf(jzVar.getThemedColor(org.telegram.ui.ActionBar.n6.Fi)));
                g3Var.setEmojiViewCacheType(25);
                g3Var.setText(jzVar.x);
                i10 = ((org.telegram.ui.ActionBar.g2) jzVar).currentAccount;
                org.telegram.ui.Components.o5.r(i10, jzVar.y);
                org.telegram.ui.Components.mt editText = g3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.k3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                g3Var.getEditText().setImeOptions(268435462);
                view = ezVar;
                break;
            case 3:
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                sy syVar = new sy(context);
                syVar.d = true;
                syVar.e = null;
                ImageView imageView = new ImageView(context);
                syVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                syVar.addView(imageView, c8.na.d(24, 24.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                syVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.gd.a0;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.gd.a0 ? 5 : 3);
                boolean z11 = org.telegram.messenger.gd.a0;
                syVar.addView(textView, c8.na.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = syVar;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(context);
                k0Var.b = qh0Var;
                qh0Var.f(R.raw.filter_new, 100, 100, null);
                qh0Var.setScaleType(ImageView.ScaleType.CENTER);
                qh0Var.d();
                k0Var.addView(qh0Var, c8.na.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                qh0Var.setOnClickListener(new a(k0Var, 23));
                view = k0Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.g2) jzVar).currentAccount;
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
                i12 = ((org.telegram.ui.ActionBar.g2) jzVar).currentAccount;
                i6Var2 = ((org.telegram.ui.ActionBar.g2) jzVar).resourceProvider;
                view = new gm0(2, i12, parentActivity, i6Var2);
                break;
            case 11:
                i6Var3 = ((org.telegram.ui.ActionBar.g2) jzVar).resourceProvider;
                view = new az(context, i6Var3);
                break;
        }
        return new org.telegram.ui.Components.mj0(view);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f;
        if (i7 != 2 && i7 == 9) {
            zy zyVar = (zy) f1Var.a;
            jz jzVar = this.e;
            zyVar.e(org.telegram.ui.Components.x5.cloneSpans(jzVar.x, -1, jzVar.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // v4.i0
    public final void z(v4.f1 f1Var) {
        if (f1Var.f == 2) {
            org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) f1Var.a;
            i3Var.b.k(true);
            i3Var.b.d();
        }
    }
}
