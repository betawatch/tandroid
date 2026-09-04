package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.xh;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class t0 {
    public final int a;
    public int b;
    public int c;
    public Drawable d;
    public CharSequence e;
    public boolean f;
    public View g;
    public int h;
    public View i;
    public xh j;
    public int k = 0;
    public int l = 0;
    public Integer m;
    public Integer n;

    public t0(int i10) {
        this.a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.m;
        if (num == null || this.n == null || num.intValue() != i10 || this.n.intValue() != i11) {
            this.m = Integer.valueOf(i10);
            this.n = Integer.valueOf(i11);
            View view = this.i;
            if (view instanceof f1) {
                ((f1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.c) {
            this.c = i10;
            View view = this.i;
            if (view instanceof f1) {
                ((f1) view).setIcon(i10);
            }
        }
    }

    public final void c(xh xhVar) {
        this.j = xhVar;
        View view = this.i;
        if (view != null) {
            view.setOnClickListener(xhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.i;
        if (view instanceof f1) {
            ((f1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.k = i10;
        View view = this.i;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
