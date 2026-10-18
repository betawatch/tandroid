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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class bg0 extends hm0 {
    public final Context c;
    public final /* synthetic */ cg0 d;

    public bg0(cg0 cg0Var, Context context) {
        this.d = cg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
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
        cg0 cg0Var = this.d;
        return (i10 == cg0Var.y || i10 == cg0Var.E) ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        cg0 cg0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.setTag(Integer.valueOf(i10));
            if (i10 == cg0Var.y) {
                t5Var.a(cg0Var.N, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == cg0Var.E) {
                    t5Var.a(cg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
        u5Var.setTag(Integer.valueOf(i10));
        if (i10 == cg0Var.b) {
            u5Var.a(LocaleController.getString(R.string.Enhance), 0, cg0Var.G);
            return;
        }
        if (i10 == cg0Var.r) {
            u5Var.a(LocaleController.getString(R.string.Highlights), -100, cg0Var.P);
            return;
        }
        if (i10 == cg0Var.d) {
            u5Var.a(LocaleController.getString(R.string.Contrast), -100, cg0Var.I);
            return;
        }
        if (i10 == cg0Var.c) {
            u5Var.a(LocaleController.getString(R.string.Exposure), -100, cg0Var.H);
            return;
        }
        if (i10 == cg0Var.f) {
            u5Var.a(LocaleController.getString(R.string.Warmth), -100, cg0Var.J);
            return;
        }
        if (i10 == cg0Var.e) {
            u5Var.a(LocaleController.getString(R.string.Saturation), -100, cg0Var.K);
            return;
        }
        if (i10 == cg0Var.v) {
            u5Var.a(LocaleController.getString(R.string.Vignette), 0, cg0Var.R);
            return;
        }
        if (i10 == cg0Var.s) {
            u5Var.a(LocaleController.getString(R.string.Shadows), -100, cg0Var.Q);
            return;
        }
        if (i10 == cg0Var.w) {
            u5Var.a(LocaleController.getString(R.string.Grain), 0, cg0Var.S);
            return;
        }
        if (i10 == cg0Var.x) {
            u5Var.a(LocaleController.getString(R.string.Sharpen), 0, cg0Var.U);
        } else if (i10 == cg0Var.h) {
            u5Var.a(LocaleController.getString(R.string.Fade), 0, cg0Var.L);
        } else if (i10 == cg0Var.n) {
            u5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, cg0Var.M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t5 t5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.d6 d6Var = this.d.I0;
            org.telegram.ui.Cells.u5 u5Var = new org.telegram.ui.Cells.u5(context);
            u5Var.e = new androidx.activity.i(u5Var, 28);
            TextView textView = new TextView(context);
            u5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            u5Var.addView(textView, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            u5Var.b = textView2;
            org.telegram.messenger.lk.o(org.telegram.ui.ActionBar.h6.zf, d6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            u5Var.addView(textView2, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            pf0 pf0Var = new pf0(context);
            Paint paint = new Paint();
            pf0Var.a = paint;
            Paint paint2 = new Paint(1);
            pf0Var.b = paint2;
            pf0Var.c = AndroidUtilities.dp(16.0f);
            pf0Var.d = 0;
            pf0Var.e = 0.0f;
            pf0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            u5Var.c = pf0Var;
            u5Var.addView(pf0Var, w7.z5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            u5Var.setSeekBarDelegate(new tv(this, 11));
            t5Var = u5Var;
        } else {
            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context);
            t5Var2.setOnClickListener(new u80(this, 5));
            t5Var = t5Var2;
        }
        return new sl0(t5Var);
    }
}
