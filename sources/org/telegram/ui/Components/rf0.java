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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class rf0 extends vl0 {
    public final Context c;
    public final /* synthetic */ sf0 d;

    public rf0(sf0 sf0Var, Context context) {
        this.d = sf0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.F;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        sf0 sf0Var = this.d;
        return (i10 == sf0Var.y || i10 == sf0Var.E) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        sf0 sf0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.setTag(Integer.valueOf(i10));
            if (i10 == sf0Var.y) {
                u5Var.a(sf0Var.N, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == sf0Var.E) {
                    u5Var.a(sf0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == sf0Var.b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, sf0Var.G);
            return;
        }
        if (i10 == sf0Var.r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, sf0Var.P);
            return;
        }
        if (i10 == sf0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, sf0Var.I);
            return;
        }
        if (i10 == sf0Var.c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, sf0Var.H);
            return;
        }
        if (i10 == sf0Var.f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, sf0Var.J);
            return;
        }
        if (i10 == sf0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, sf0Var.K);
            return;
        }
        if (i10 == sf0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, sf0Var.R);
            return;
        }
        if (i10 == sf0Var.s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, sf0Var.Q);
            return;
        }
        if (i10 == sf0Var.w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, sf0Var.S);
            return;
        }
        if (i10 == sf0Var.x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, sf0Var.U);
        } else if (i10 == sf0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, sf0Var.L);
        } else if (i10 == sf0Var.n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, sf0Var.M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.e6 e6Var = this.d.I0;
            org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context);
            v5Var.e = new ai.q4(v5Var, 29);
            TextView textView = new TextView(context);
            v5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            v5Var.addView(textView, w7.y5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            v5Var.b = textView2;
            org.telegram.messenger.wh.m(org.telegram.ui.ActionBar.j6.zf, e6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            v5Var.addView(textView2, w7.y5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ff0 ff0Var = new ff0(context);
            Paint paint = new Paint();
            ff0Var.a = paint;
            Paint paint2 = new Paint(1);
            ff0Var.b = paint2;
            ff0Var.c = AndroidUtilities.dp(16.0f);
            ff0Var.d = 0;
            ff0Var.e = 0.0f;
            ff0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            v5Var.c = ff0Var;
            v5Var.addView(ff0Var, w7.y5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            v5Var.setSeekBarDelegate(new lv(this, 10));
            u5Var = v5Var;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new g80(this, 6));
            u5Var = u5Var2;
        }
        return new gl0(u5Var);
    }
}
