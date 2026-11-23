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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class hz extends rg.b {
    public final Context d;
    public final /* synthetic */ kz e;

    public hz(kz kzVar, Context context) {
        this.e = kzVar;
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
        cz czVar = (cz) this.e.Q.get(i7);
        if (czVar == null) {
            return 3;
        }
        return czVar.a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        kz kzVar = this.e;
        ArrayList arrayList = kzVar.Q;
        cz czVar = (cz) arrayList.get(i7);
        if (czVar == null) {
            return;
        }
        int i11 = i7 + 1;
        boolean z10 = false;
        boolean z11 = (i11 >= arrayList.size() || (i10 = ((cz) arrayList.get(i11)).a) == 3 || i10 == 6) ? false : true;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            if (czVar.f) {
                o4Var.setText(kz.E0(0, czVar.d, false));
                return;
            } else {
                o4Var.setText(czVar.d);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            String str = czVar.i;
            if (str != null) {
                raVar.d(str, czVar.d, null, z11);
                return;
            }
            long j3 = czVar.h;
            if (j3 > 0) {
                TLRPC.User c22 = kzVar.getMessagesController().c2(Long.valueOf(j3));
                if (c22 != null) {
                    raVar.d(c22, null, c22.bot ? org.telegram.messenger.hd.N0(2131753153, null) : c22.contact ? org.telegram.messenger.hd.N0(2131750780, null) : org.telegram.messenger.hd.N0(2131750707, null), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat O0 = kzVar.getMessagesController().O0(Long.valueOf(-j3));
            if (O0 != null) {
                raVar.d(O0, null, org.telegram.messenger.v3.Y(O0) ? org.telegram.messenger.hd.N0(2131751978, null) : O0.participants_count != 0 ? org.telegram.messenger.v3.V(O0) ? org.telegram.messenger.hd.H(',', "Subscribers", O0.participants_count) : org.telegram.messenger.hd.H(',', "Members", O0.participants_count) : !org.telegram.messenger.v3.t0(O0) ? (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? org.telegram.messenger.hd.N0(2131748448, null) : org.telegram.messenger.hd.N0(2131752317, null) : (!org.telegram.messenger.v3.T(O0) || O0.megagroup) ? org.telegram.messenger.hd.N0(2131748445, null) : org.telegram.messenger.hd.N0(2131752306, null), z11);
                return;
            }
            return;
        }
        if (i12 != 4) {
            switch (i12) {
                case 6:
                    ((org.telegram.ui.Cells.a9) view).setText(czVar.d);
                    break;
                case 7:
                    ((ez) view).e(czVar.m, z11);
                    break;
                case 8:
                    vy vyVar = (vy) view;
                    if (vyVar.c != z11) {
                        vyVar.c = z11;
                        vyVar.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    az azVar = (az) view;
                    kzVar.J = azVar;
                    azVar.e(org.telegram.ui.Components.y5.cloneSpans(kzVar.x, -1, azVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    kzVar.J.d(kzVar.getUserConfig().q() ? kzVar.F : -1, false);
                    kzVar.J.setText(org.telegram.messenger.hd.N0(2131750605, null));
                    break;
                case 10:
                    im0 im0Var = (im0) view;
                    im0Var.setCloseAsLock(!kzVar.getUserConfig().q());
                    im0Var.a(kzVar.getUserConfig().q() ? kzVar.F : -1, false);
                    im0Var.setOnColorClick(new org.telegram.ui.Components.rh(15, this, im0Var));
                    break;
                case 11:
                    bz bzVar = (bz) view;
                    kzVar.K = bzVar;
                    bzVar.setText(czVar.d);
                    org.telegram.ui.Cells.x3 x3Var = bzVar.r;
                    x3Var.setText(czVar.e);
                    x3Var.setOnClickListener(czVar.c);
                    break;
            }
            return;
        }
        ty tyVar = (ty) view;
        boolean z12 = czVar.l;
        ImageView imageView = tyVar.a;
        TextView textView = tyVar.b;
        org.telegram.ui.ActionBar.t6.s(imageView, z12 ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.o6, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.ActionBar.t6.U(textView, z12 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.q6, null);
        int i13 = czVar.k;
        CharSequence charSequence = czVar.d;
        ImageView imageView2 = tyVar.a;
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
        Boolean bool = tyVar.e;
        if (bool == null || bool.booleanValue() != z10) {
            tyVar.e = Boolean.valueOf(z10);
            if (tyVar.c == i13) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.nr.h).start();
            } else {
                textView.setTranslationX(z10 ? org.telegram.messenger.g0.L(i14 * (-7)) : 0.0f);
            }
        }
        tyVar.d = z11;
        tyVar.setWillNotDraw(!z11);
        tyVar.c = i13;
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        Context context = this.d;
        kz kzVar = this.e;
        switch (i7) {
            case 0:
                view = new org.telegram.ui.Cells.o4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(context, 6, 0, false);
                raVar.setSelfAsSavedMessages(true);
                view = raVar;
                break;
            case 2:
                org.telegram.ui.Components.du0 du0Var = (org.telegram.ui.Components.du0) kzVar.fragmentView;
                String N0 = org.telegram.messenger.hd.N0(2131750720, null);
                h6Var = ((org.telegram.ui.ActionBar.g2) kzVar).resourceProvider;
                fz fzVar = new fz(this.d, du0Var, N0, false, 12, h6Var);
                kzVar.L = fzVar;
                fzVar.r = false;
                fzVar.s = true;
                org.telegram.ui.Cells.g3 g3Var = fzVar.b;
                g3Var.getEditText().setEmojiColor(Integer.valueOf(kzVar.getThemedColor(org.telegram.ui.ActionBar.m6.Fi)));
                g3Var.setEmojiViewCacheType(25);
                g3Var.setText(kzVar.x);
                i10 = ((org.telegram.ui.ActionBar.g2) kzVar).currentAccount;
                org.telegram.ui.Components.p5.r(i10, kzVar.y);
                org.telegram.ui.Components.ot editText = g3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.k3());
                editText.addTextChangedListener(new m0(this, 7));
                editText.setPadding(org.telegram.messenger.g0.L(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                g3Var.getEditText().setImeOptions(268435462);
                view = fzVar;
                break;
            case 3:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                ty tyVar = new ty(context);
                tyVar.d = true;
                tyVar.e = null;
                ImageView imageView = new ImageView(context);
                tyVar.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                tyVar.addView(imageView, c8.ma.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                tyVar.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = org.telegram.messenger.hd.a0;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                boolean z11 = org.telegram.messenger.hd.a0;
                tyVar.addView(textView, c8.ma.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = tyVar;
                break;
            case 5:
                k0 k0Var = new k0(context, 8);
                org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
                k0Var.b = rh0Var;
                rh0Var.f(R.raw.filter_new, 100, 100, null);
                rh0Var.setScaleType(ImageView.ScaleType.CENTER);
                rh0Var.d();
                k0Var.addView(rh0Var, c8.ma.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                rh0Var.setOnClickListener(new a(k0Var, 23));
                view = k0Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 7:
                i11 = ((org.telegram.ui.ActionBar.g2) kzVar).currentAccount;
                view = new gz(this, this.d, kzVar, i11, kzVar.r.a);
                break;
            case 8:
                view = new vy(context);
                break;
            case 9:
                view = new az(kzVar, context);
                break;
            case 10:
                Activity parentActivity = kzVar.getParentActivity();
                i12 = ((org.telegram.ui.ActionBar.g2) kzVar).currentAccount;
                h6Var2 = ((org.telegram.ui.ActionBar.g2) kzVar).resourceProvider;
                view = new im0(2, i12, parentActivity, h6Var2);
                break;
            case 11:
                h6Var3 = ((org.telegram.ui.ActionBar.g2) kzVar).resourceProvider;
                view = new bz(context, h6Var3);
                break;
        }
        return new org.telegram.ui.Components.mj0(view);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        int i7 = f1Var.f;
        if (i7 != 2 && i7 == 9) {
            az azVar = (az) f1Var.a;
            kz kzVar = this.e;
            azVar.e(org.telegram.ui.Components.y5.cloneSpans(kzVar.x, -1, kzVar.J.s.getPaint().getFontMetricsInt(), 0.5f), true);
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
