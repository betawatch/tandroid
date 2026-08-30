package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mf0 extends rl0 {
    public final Context c;
    public final /* synthetic */ nf0 d;

    public mf0(nf0 nf0Var, Context context) {
        this.d = nf0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.C;
    }

    @Override // f2.o0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.o0
    public final int j(int i10) {
        nf0 nf0Var = this.d;
        return (i10 == nf0Var.y || i10 == nf0Var.B) ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        nf0 nf0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.setTag(Integer.valueOf(i10));
            if (i10 == nf0Var.y) {
                u5Var.a(nf0Var.K, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == nf0Var.B) {
                    u5Var.a(nf0Var.L, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == nf0Var.b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, nf0Var.D);
            return;
        }
        if (i10 == nf0Var.r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, nf0Var.M);
            return;
        }
        if (i10 == nf0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, nf0Var.F);
            return;
        }
        if (i10 == nf0Var.c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, nf0Var.E);
            return;
        }
        if (i10 == nf0Var.f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, nf0Var.G);
            return;
        }
        if (i10 == nf0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, nf0Var.H);
            return;
        }
        if (i10 == nf0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, nf0Var.O);
            return;
        }
        if (i10 == nf0Var.s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, nf0Var.N);
            return;
        }
        if (i10 == nf0Var.w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, nf0Var.P);
            return;
        }
        if (i10 == nf0Var.x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, nf0Var.R);
        } else if (i10 == nf0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, nf0Var.I);
        } else if (i10 == nf0Var.n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, nf0Var.J);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f6 f6Var = this.d.F0;
            org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context);
            v5Var.e = new m2.b(v5Var, 7);
            TextView textView = new TextView(context);
            v5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            v5Var.addView(textView, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            v5Var.b = textView2;
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.zf, f6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            v5Var.addView(textView2, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            af0 af0Var = new af0(context);
            Paint paint = new Paint();
            af0Var.a = paint;
            Paint paint2 = new Paint(1);
            af0Var.b = paint2;
            af0Var.c = AndroidUtilities.dp(16.0f);
            af0Var.d = 0;
            af0Var.e = 0.0f;
            af0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            v5Var.c = af0Var;
            v5Var.addView(af0Var, k7.b6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            v5Var.setSeekBarDelegate(new fv(this, 10));
            u5Var = v5Var;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new z70(this, 6));
            u5Var = u5Var2;
        }
        return new el0(u5Var);
    }
}
