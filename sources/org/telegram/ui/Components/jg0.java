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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jg0 extends pm0 {
    public final Context c;
    public final /* synthetic */ kg0 d;

    public jg0(kg0 kg0Var, Context context) {
        this.d = kg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.F;
    }

    @Override // s4.i0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.i0
    public final int j(int i10) {
        kg0 kg0Var = this.d;
        return (i10 == kg0Var.y || i10 == kg0Var.E) ? 1 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f;
        View view = d1Var.a;
        kg0 kg0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.setTag(Integer.valueOf(i10));
            if (i10 == kg0Var.y) {
                u5Var.a(kg0Var.N, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == kg0Var.E) {
                    u5Var.a(kg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == kg0Var.b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, kg0Var.G);
            return;
        }
        if (i10 == kg0Var.r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, kg0Var.P);
            return;
        }
        if (i10 == kg0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, kg0Var.I);
            return;
        }
        if (i10 == kg0Var.c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, kg0Var.H);
            return;
        }
        if (i10 == kg0Var.f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, kg0Var.J);
            return;
        }
        if (i10 == kg0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, kg0Var.K);
            return;
        }
        if (i10 == kg0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, kg0Var.R);
            return;
        }
        if (i10 == kg0Var.s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, kg0Var.Q);
            return;
        }
        if (i10 == kg0Var.w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, kg0Var.S);
            return;
        }
        if (i10 == kg0Var.x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, kg0Var.U);
        } else if (i10 == kg0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, kg0Var.L);
        } else if (i10 == kg0Var.n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, kg0Var.M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.e6 e6Var = this.d.I0;
            org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context);
            v5Var.e = new ai.r4(v5Var, 29);
            TextView textView = new TextView(context);
            v5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            v5Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            TextView textView2 = new TextView(context);
            v5Var.b = textView2;
            org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.zf, e6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            v5Var.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            xf0 xf0Var = new xf0(context);
            Paint paint = new Paint();
            xf0Var.a = paint;
            Paint paint2 = new Paint(1);
            xf0Var.b = paint2;
            xf0Var.c = AndroidUtilities.dp(16.0f);
            xf0Var.d = 0;
            xf0Var.e = 0.0f;
            xf0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            v5Var.c = xf0Var;
            v5Var.addView(xf0Var, w7.x5.a(40.0f, 96.0f, 0.0f, 24.0f, 0.0f, -1, 19));
            v5Var.setSeekBarDelegate(new bw(this, 11));
            u5Var = v5Var;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new b90(this, 5));
            u5Var = u5Var2;
        }
        return new am0(u5Var);
    }
}
