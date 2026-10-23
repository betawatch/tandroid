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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class gg0 extends lm0 {
    public final Context c;
    public final /* synthetic */ hg0 d;

    public gg0(hg0 hg0Var, Context context) {
        this.d = hg0Var;
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
        hg0 hg0Var = this.d;
        return (i10 == hg0Var.y || i10 == hg0Var.E) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        hg0 hg0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.setTag(Integer.valueOf(i10));
            if (i10 == hg0Var.y) {
                t5Var.a(hg0Var.N, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == hg0Var.E) {
                    t5Var.a(hg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == hg0Var.b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, hg0Var.G);
            return;
        }
        if (i10 == hg0Var.r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, hg0Var.P);
            return;
        }
        if (i10 == hg0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, hg0Var.I);
            return;
        }
        if (i10 == hg0Var.c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, hg0Var.H);
            return;
        }
        if (i10 == hg0Var.f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, hg0Var.J);
            return;
        }
        if (i10 == hg0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, hg0Var.K);
            return;
        }
        if (i10 == hg0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, hg0Var.R);
            return;
        }
        if (i10 == hg0Var.s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, hg0Var.Q);
            return;
        }
        if (i10 == hg0Var.w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, hg0Var.S);
            return;
        }
        if (i10 == hg0Var.x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, hg0Var.U);
        } else if (i10 == hg0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, hg0Var.L);
        } else if (i10 == hg0Var.n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, hg0Var.M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t5 t5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.g6 g6Var = this.d.I0;
            org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context);
            v5Var.e = new org.telegram.ui.Cells.u5(v5Var, 0);
            TextView textView = new TextView(context);
            v5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            v5Var.addView(textView, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            v5Var.b = textView2;
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.zf, g6Var);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            v5Var.addView(textView2, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            tf0 tf0Var = new tf0(context);
            Paint paint = new Paint();
            tf0Var.a = paint;
            Paint paint2 = new Paint(1);
            tf0Var.b = paint2;
            tf0Var.c = AndroidUtilities.dp(16.0f);
            tf0Var.d = 0;
            tf0Var.e = 0.0f;
            tf0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            v5Var.c = tf0Var;
            v5Var.addView(tf0Var, w7.z5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            v5Var.setSeekBarDelegate(new tv(this, 11));
            t5Var = v5Var;
        } else {
            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context);
            t5Var2.setOnClickListener(new v80(this, 5));
            t5Var = t5Var2;
        }
        return new wl0(t5Var);
    }
}
