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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nf0 extends ql0 {
    public final Context c;
    public final /* synthetic */ of0 d;

    public nf0(of0 of0Var, Context context) {
        this.d = of0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.C;
    }

    @Override // f2.o0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.o0
    public final int j(int i10) {
        of0 of0Var = this.d;
        return (i10 == of0Var.y || i10 == of0Var.B) ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        of0 of0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.setTag(Integer.valueOf(i10));
            if (i10 == of0Var.y) {
                t5Var.a(of0Var.K, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == of0Var.B) {
                    t5Var.a(of0Var.L, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
        u5Var.setTag(Integer.valueOf(i10));
        if (i10 == of0Var.b) {
            u5Var.a(LocaleController.getString(R.string.Enhance), 0, of0Var.D);
            return;
        }
        if (i10 == of0Var.r) {
            u5Var.a(LocaleController.getString(R.string.Highlights), -100, of0Var.M);
            return;
        }
        if (i10 == of0Var.d) {
            u5Var.a(LocaleController.getString(R.string.Contrast), -100, of0Var.F);
            return;
        }
        if (i10 == of0Var.c) {
            u5Var.a(LocaleController.getString(R.string.Exposure), -100, of0Var.E);
            return;
        }
        if (i10 == of0Var.f) {
            u5Var.a(LocaleController.getString(R.string.Warmth), -100, of0Var.G);
            return;
        }
        if (i10 == of0Var.e) {
            u5Var.a(LocaleController.getString(R.string.Saturation), -100, of0Var.H);
            return;
        }
        if (i10 == of0Var.v) {
            u5Var.a(LocaleController.getString(R.string.Vignette), 0, of0Var.O);
            return;
        }
        if (i10 == of0Var.s) {
            u5Var.a(LocaleController.getString(R.string.Shadows), -100, of0Var.N);
            return;
        }
        if (i10 == of0Var.w) {
            u5Var.a(LocaleController.getString(R.string.Grain), 0, of0Var.P);
            return;
        }
        if (i10 == of0Var.x) {
            u5Var.a(LocaleController.getString(R.string.Sharpen), 0, of0Var.R);
        } else if (i10 == of0Var.h) {
            u5Var.a(LocaleController.getString(R.string.Fade), 0, of0Var.I);
        } else if (i10 == of0Var.n) {
            u5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, of0Var.J);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t5 t5Var;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f6 f6Var = this.d.F0;
            org.telegram.ui.Cells.u5 u5Var = new org.telegram.ui.Cells.u5(context);
            u5Var.e = new m2.b(u5Var, 7);
            TextView textView = new TextView(context);
            u5Var.a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            u5Var.addView(textView, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            u5Var.b = textView2;
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.zf, f6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            u5Var.addView(textView2, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            bf0 bf0Var = new bf0(context);
            Paint paint = new Paint();
            bf0Var.a = paint;
            Paint paint2 = new Paint(1);
            bf0Var.b = paint2;
            bf0Var.c = AndroidUtilities.dp(16.0f);
            bf0Var.d = 0;
            bf0Var.e = 0.0f;
            bf0Var.f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            u5Var.c = bf0Var;
            u5Var.addView(bf0Var, k7.b6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            u5Var.setSeekBarDelegate(new ev(this, 10));
            t5Var = u5Var;
        } else {
            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context);
            t5Var2.setOnClickListener(new a80(this, 6));
            t5Var = t5Var2;
        }
        return new dl0(t5Var);
    }
}
