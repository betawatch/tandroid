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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ig0 extends lm0 {
    public final Context c;
    public final /* synthetic */ jg0 d;

    public ig0(jg0 jg0Var, Context context) {
        this.d = jg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.F;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int j(int i10) {
        jg0 jg0Var = this.d;
        return (i10 == jg0Var.y || i10 == jg0Var.E) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        jg0 jg0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.setTag(Integer.valueOf(i10));
            if (i10 == jg0Var.y) {
                u5Var.a(jg0Var.N, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == jg0Var.E) {
                    u5Var.a(jg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == jg0Var.b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, jg0Var.G);
            return;
        }
        if (i10 == jg0Var.r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, jg0Var.P);
            return;
        }
        if (i10 == jg0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, jg0Var.I);
            return;
        }
        if (i10 == jg0Var.c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, jg0Var.H);
            return;
        }
        if (i10 == jg0Var.f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, jg0Var.J);
            return;
        }
        if (i10 == jg0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, jg0Var.K);
            return;
        }
        if (i10 == jg0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, jg0Var.R);
            return;
        }
        if (i10 == jg0Var.s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, jg0Var.Q);
            return;
        }
        if (i10 == jg0Var.w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, jg0Var.S);
            return;
        }
        if (i10 == jg0Var.x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, jg0Var.U);
        } else if (i10 == jg0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, jg0Var.L);
        } else if (i10 == jg0Var.n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, jg0Var.M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.c6 c6Var = this.d.I0;
            org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context);
            v5Var.e = new androidx.activity.i(v5Var, 28);
            TextView textView = new TextView(context);
            v5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            v5Var.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            TextView textView2 = new TextView(context);
            v5Var.b = textView2;
            org.telegram.messenger.sk.o(org.telegram.ui.ActionBar.g6.zf, c6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            v5Var.addView(textView2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            wf0 wf0Var = new wf0(context);
            Paint paint = new Paint();
            wf0Var.a = paint;
            Paint paint2 = new Paint(1);
            wf0Var.b = paint2;
            wf0Var.c = AndroidUtilities.dp(16.0f);
            wf0Var.d = 0;
            wf0Var.e = 0.0f;
            wf0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            v5Var.c = wf0Var;
            v5Var.addView(wf0Var, w7.z5.a(40.0f, 96.0f, 0.0f, 24.0f, 0.0f, -1, 19));
            v5Var.setSeekBarDelegate(new xv(this, 11));
            u5Var = v5Var;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new y80(this, 5));
            u5Var = u5Var2;
        }
        return new wl0(u5Var);
    }
}
