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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dg0 extends lm0 {
    public final Context c;
    public final /* synthetic */ eg0 d;

    public dg0(eg0 eg0Var, Context context) {
        this.d = eg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
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
        eg0 eg0Var = this.d;
        return (i10 == eg0Var.y || i10 == eg0Var.E) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        eg0 eg0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
            y5Var.setTag(Integer.valueOf(i10));
            if (i10 == eg0Var.y) {
                y5Var.a(eg0Var.N, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == eg0Var.E) {
                    y5Var.a(eg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
        z5Var.setTag(Integer.valueOf(i10));
        if (i10 == eg0Var.b) {
            z5Var.a(LocaleController.getString(R.string.Enhance), 0, eg0Var.G);
            return;
        }
        if (i10 == eg0Var.r) {
            z5Var.a(LocaleController.getString(R.string.Highlights), -100, eg0Var.P);
            return;
        }
        if (i10 == eg0Var.d) {
            z5Var.a(LocaleController.getString(R.string.Contrast), -100, eg0Var.I);
            return;
        }
        if (i10 == eg0Var.c) {
            z5Var.a(LocaleController.getString(R.string.Exposure), -100, eg0Var.H);
            return;
        }
        if (i10 == eg0Var.f) {
            z5Var.a(LocaleController.getString(R.string.Warmth), -100, eg0Var.J);
            return;
        }
        if (i10 == eg0Var.e) {
            z5Var.a(LocaleController.getString(R.string.Saturation), -100, eg0Var.K);
            return;
        }
        if (i10 == eg0Var.v) {
            z5Var.a(LocaleController.getString(R.string.Vignette), 0, eg0Var.R);
            return;
        }
        if (i10 == eg0Var.s) {
            z5Var.a(LocaleController.getString(R.string.Shadows), -100, eg0Var.Q);
            return;
        }
        if (i10 == eg0Var.w) {
            z5Var.a(LocaleController.getString(R.string.Grain), 0, eg0Var.S);
            return;
        }
        if (i10 == eg0Var.x) {
            z5Var.a(LocaleController.getString(R.string.Sharpen), 0, eg0Var.U);
        } else if (i10 == eg0Var.h) {
            z5Var.a(LocaleController.getString(R.string.Fade), 0, eg0Var.L);
        } else if (i10 == eg0Var.n) {
            z5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, eg0Var.M);
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
            z5Var.addView(textView, gb1.h(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            z5Var.b = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.zf, u6Var);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            z5Var.addView(textView2, gb1.h(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            qf0 qf0Var = new qf0(context);
            Paint paint = new Paint();
            qf0Var.a = paint;
            Paint paint2 = new Paint(1);
            qf0Var.b = paint2;
            qf0Var.c = AndroidUtilities.dp(16.0f);
            qf0Var.d = 0;
            qf0Var.e = 0.0f;
            qf0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            z5Var.c = qf0Var;
            z5Var.addView(qf0Var, gb1.h(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            z5Var.setSeekBarDelegate(new tv(this, 12));
            y5Var = z5Var;
        } else {
            org.telegram.ui.Cells.y5 y5Var2 = new org.telegram.ui.Cells.y5(context);
            y5Var2.setOnClickListener(new w80(this, 4));
            y5Var = y5Var2;
        }
        return new vl0(y5Var);
    }
}
