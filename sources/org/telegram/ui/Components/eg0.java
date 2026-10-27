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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class eg0 extends mm0 {
    public final Context c;
    public final /* synthetic */ fg0 d;

    public eg0(fg0 fg0Var, Context context) {
        this.d = fg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
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
        fg0 fg0Var = this.d;
        return (i10 == fg0Var.y || i10 == fg0Var.E) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        fg0 fg0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
            y5Var.setTag(Integer.valueOf(i10));
            if (i10 == fg0Var.y) {
                y5Var.a(fg0Var.N, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == fg0Var.E) {
                    y5Var.a(fg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
        z5Var.setTag(Integer.valueOf(i10));
        if (i10 == fg0Var.b) {
            z5Var.a(LocaleController.getString(R.string.Enhance), 0, fg0Var.G);
            return;
        }
        if (i10 == fg0Var.r) {
            z5Var.a(LocaleController.getString(R.string.Highlights), -100, fg0Var.P);
            return;
        }
        if (i10 == fg0Var.d) {
            z5Var.a(LocaleController.getString(R.string.Contrast), -100, fg0Var.I);
            return;
        }
        if (i10 == fg0Var.c) {
            z5Var.a(LocaleController.getString(R.string.Exposure), -100, fg0Var.H);
            return;
        }
        if (i10 == fg0Var.f) {
            z5Var.a(LocaleController.getString(R.string.Warmth), -100, fg0Var.J);
            return;
        }
        if (i10 == fg0Var.e) {
            z5Var.a(LocaleController.getString(R.string.Saturation), -100, fg0Var.K);
            return;
        }
        if (i10 == fg0Var.v) {
            z5Var.a(LocaleController.getString(R.string.Vignette), 0, fg0Var.R);
            return;
        }
        if (i10 == fg0Var.s) {
            z5Var.a(LocaleController.getString(R.string.Shadows), -100, fg0Var.Q);
            return;
        }
        if (i10 == fg0Var.w) {
            z5Var.a(LocaleController.getString(R.string.Grain), 0, fg0Var.S);
            return;
        }
        if (i10 == fg0Var.x) {
            z5Var.a(LocaleController.getString(R.string.Sharpen), 0, fg0Var.U);
        } else if (i10 == fg0Var.h) {
            z5Var.a(LocaleController.getString(R.string.Fade), 0, fg0Var.L);
        } else if (i10 == fg0Var.n) {
            z5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, fg0Var.M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y5 y5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.u6 u6Var = this.d.I0;
            org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context);
            z5Var.e = new m.g3(z5Var, 4);
            TextView textView = new TextView(context);
            z5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            z5Var.addView(textView, kb1.h(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            z5Var.b = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.zf, u6Var);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            z5Var.addView(textView2, kb1.h(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            rf0 rf0Var = new rf0(context);
            Paint paint = new Paint();
            rf0Var.a = paint;
            Paint paint2 = new Paint(1);
            rf0Var.b = paint2;
            rf0Var.c = AndroidUtilities.dp(16.0f);
            rf0Var.d = 0;
            rf0Var.e = 0.0f;
            rf0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            z5Var.c = rf0Var;
            z5Var.addView(rf0Var, kb1.h(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            z5Var.setSeekBarDelegate(new tv(this, 12));
            y5Var = z5Var;
        } else {
            org.telegram.ui.Cells.y5 y5Var2 = new org.telegram.ui.Cells.y5(context);
            y5Var2.setOnClickListener(new x80(this, 4));
            y5Var = y5Var2;
        }
        return new wl0(y5Var);
    }
}
