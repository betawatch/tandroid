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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qf0 extends ul0 {
    public final Context c;
    public final /* synthetic */ rf0 d;

    public qf0(rf0 rf0Var, Context context) {
        this.d = rf0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
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
        rf0 rf0Var = this.d;
        return (i10 == rf0Var.y || i10 == rf0Var.E) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        rf0 rf0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
            v5Var.setTag(Integer.valueOf(i10));
            if (i10 == rf0Var.y) {
                v5Var.a(rf0Var.N, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == rf0Var.E) {
                    v5Var.a(rf0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) view;
        w5Var.setTag(Integer.valueOf(i10));
        if (i10 == rf0Var.b) {
            w5Var.a(LocaleController.getString(R.string.Enhance), 0, rf0Var.G);
            return;
        }
        if (i10 == rf0Var.r) {
            w5Var.a(LocaleController.getString(R.string.Highlights), -100, rf0Var.P);
            return;
        }
        if (i10 == rf0Var.d) {
            w5Var.a(LocaleController.getString(R.string.Contrast), -100, rf0Var.I);
            return;
        }
        if (i10 == rf0Var.c) {
            w5Var.a(LocaleController.getString(R.string.Exposure), -100, rf0Var.H);
            return;
        }
        if (i10 == rf0Var.f) {
            w5Var.a(LocaleController.getString(R.string.Warmth), -100, rf0Var.J);
            return;
        }
        if (i10 == rf0Var.e) {
            w5Var.a(LocaleController.getString(R.string.Saturation), -100, rf0Var.K);
            return;
        }
        if (i10 == rf0Var.v) {
            w5Var.a(LocaleController.getString(R.string.Vignette), 0, rf0Var.R);
            return;
        }
        if (i10 == rf0Var.s) {
            w5Var.a(LocaleController.getString(R.string.Shadows), -100, rf0Var.Q);
            return;
        }
        if (i10 == rf0Var.w) {
            w5Var.a(LocaleController.getString(R.string.Grain), 0, rf0Var.S);
            return;
        }
        if (i10 == rf0Var.x) {
            w5Var.a(LocaleController.getString(R.string.Sharpen), 0, rf0Var.U);
        } else if (i10 == rf0Var.h) {
            w5Var.a(LocaleController.getString(R.string.Fade), 0, rf0Var.L);
        } else if (i10 == rf0Var.n) {
            w5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, rf0Var.M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v5 v5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f6 f6Var = this.d.I0;
            org.telegram.ui.Cells.w5 w5Var = new org.telegram.ui.Cells.w5(context);
            w5Var.e = new ai.q4(w5Var, 29);
            TextView textView = new TextView(context);
            w5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            w5Var.addView(textView, w7.y5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            w5Var.b = textView2;
            org.telegram.messenger.rk.n(org.telegram.ui.ActionBar.j6.zf, f6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            w5Var.addView(textView2, w7.y5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ef0 ef0Var = new ef0(context);
            Paint paint = new Paint();
            ef0Var.a = paint;
            Paint paint2 = new Paint(1);
            ef0Var.b = paint2;
            ef0Var.c = AndroidUtilities.dp(16.0f);
            ef0Var.d = 0;
            ef0Var.e = 0.0f;
            ef0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            w5Var.c = ef0Var;
            w5Var.addView(ef0Var, w7.y5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            w5Var.setSeekBarDelegate(new mv(this, 11));
            v5Var = w5Var;
        } else {
            org.telegram.ui.Cells.v5 v5Var2 = new org.telegram.ui.Cells.v5(context);
            v5Var2.setOnClickListener(new f80(this, 6));
            v5Var = v5Var2;
        }
        return new fl0(v5Var);
    }
}
