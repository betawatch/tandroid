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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pe0 extends vk0 {
    public final Context c;
    public final /* synthetic */ qe0 d;

    public pe0(qe0 qe0Var, Context context) {
        this.d = qe0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.B;
    }

    @Override // f2.r0
    public final long i(int i9) {
        return i9;
    }

    @Override // f2.r0
    public final int j(int i9) {
        qe0 qe0Var = this.d;
        return (i9 == qe0Var.y || i9 == qe0Var.A) ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        qe0 qe0Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.setTag(Integer.valueOf(i9));
            if (i9 == qe0Var.y) {
                u5Var.a(qe0Var.J, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i9 == qe0Var.A) {
                    u5Var.a(qe0Var.K, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i9));
        if (i9 == qe0Var.b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, qe0Var.C);
            return;
        }
        if (i9 == qe0Var.r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, qe0Var.L);
            return;
        }
        if (i9 == qe0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, qe0Var.E);
            return;
        }
        if (i9 == qe0Var.c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, qe0Var.D);
            return;
        }
        if (i9 == qe0Var.f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, qe0Var.F);
            return;
        }
        if (i9 == qe0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, qe0Var.G);
            return;
        }
        if (i9 == qe0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, qe0Var.N);
            return;
        }
        if (i9 == qe0Var.s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, qe0Var.M);
            return;
        }
        if (i9 == qe0Var.w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, qe0Var.O);
            return;
        }
        if (i9 == qe0Var.x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, qe0Var.Q);
        } else if (i9 == qe0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, qe0Var.H);
        } else if (i9 == qe0Var.n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, qe0Var.I);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.c;
        if (i9 == 0) {
            org.telegram.ui.ActionBar.b6 b6Var = this.d.E0;
            org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context);
            v5Var.e = new m.i3(v5Var, 5);
            TextView textView = new TextView(context);
            v5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            v5Var.addView(textView, g7.e6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            v5Var.b = textView2;
            org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.zf, b6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            v5Var.addView(textView2, g7.e6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            de0 de0Var = new de0(context);
            Paint paint = new Paint();
            de0Var.a = paint;
            Paint paint2 = new Paint(1);
            de0Var.b = paint2;
            de0Var.c = AndroidUtilities.dp(16.0f);
            de0Var.d = 0;
            de0Var.e = 0.0f;
            de0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            v5Var.c = de0Var;
            v5Var.addView(de0Var, g7.e6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            v5Var.setSeekBarDelegate(new wu(this, 10));
            u5Var = v5Var;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new h70(this, 6));
            u5Var = u5Var2;
        }
        return new ik0(u5Var);
    }
}
