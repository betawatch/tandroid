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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class df0 extends il0 {
    public final Context c;
    public final /* synthetic */ ef0 d;

    public df0(ef0 ef0Var, Context context) {
        this.d = ef0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.B;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ef0 ef0Var = this.d;
        return (i10 == ef0Var.y || i10 == ef0Var.A) ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        ef0 ef0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.setTag(Integer.valueOf(i10));
            if (i10 == ef0Var.y) {
                s5Var.a(ef0Var.J, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == ef0Var.A) {
                    s5Var.a(ef0Var.K, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        t5Var.setTag(Integer.valueOf(i10));
        if (i10 == ef0Var.b) {
            t5Var.a(LocaleController.getString(R.string.Enhance), 0, ef0Var.C);
            return;
        }
        if (i10 == ef0Var.r) {
            t5Var.a(LocaleController.getString(R.string.Highlights), -100, ef0Var.L);
            return;
        }
        if (i10 == ef0Var.d) {
            t5Var.a(LocaleController.getString(R.string.Contrast), -100, ef0Var.E);
            return;
        }
        if (i10 == ef0Var.c) {
            t5Var.a(LocaleController.getString(R.string.Exposure), -100, ef0Var.D);
            return;
        }
        if (i10 == ef0Var.f) {
            t5Var.a(LocaleController.getString(R.string.Warmth), -100, ef0Var.F);
            return;
        }
        if (i10 == ef0Var.e) {
            t5Var.a(LocaleController.getString(R.string.Saturation), -100, ef0Var.G);
            return;
        }
        if (i10 == ef0Var.v) {
            t5Var.a(LocaleController.getString(R.string.Vignette), 0, ef0Var.N);
            return;
        }
        if (i10 == ef0Var.s) {
            t5Var.a(LocaleController.getString(R.string.Shadows), -100, ef0Var.M);
            return;
        }
        if (i10 == ef0Var.w) {
            t5Var.a(LocaleController.getString(R.string.Grain), 0, ef0Var.O);
            return;
        }
        if (i10 == ef0Var.x) {
            t5Var.a(LocaleController.getString(R.string.Sharpen), 0, ef0Var.Q);
        } else if (i10 == ef0Var.h) {
            t5Var.a(LocaleController.getString(R.string.Fade), 0, ef0Var.H);
        } else if (i10 == ef0Var.n) {
            t5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, ef0Var.I);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s5 s5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.c6 c6Var = this.d.E0;
            org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context);
            t5Var.e = new lh.m7(t5Var, 8);
            TextView textView = new TextView(context);
            t5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            t5Var.addView(textView, i7.f6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            t5Var.b = textView2;
            org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.zf, c6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            t5Var.addView(textView2, i7.f6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            re0 re0Var = new re0(context);
            Paint paint = new Paint();
            re0Var.a = paint;
            Paint paint2 = new Paint(1);
            re0Var.b = paint2;
            re0Var.c = AndroidUtilities.dp(16.0f);
            re0Var.d = 0;
            re0Var.e = 0.0f;
            re0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            t5Var.c = re0Var;
            t5Var.addView(re0Var, i7.f6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            t5Var.setSeekBarDelegate(new cv(this, 10));
            s5Var = t5Var;
        } else {
            org.telegram.ui.Cells.s5 s5Var2 = new org.telegram.ui.Cells.s5(context);
            s5Var2.setOnClickListener(new u70(this, 6));
            s5Var = s5Var2;
        }
        return new vk0(s5Var);
    }
}
