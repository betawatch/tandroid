package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.zh;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u0 {
    public final int a;
    public int b;
    public int c;
    public Drawable d;
    public CharSequence e;
    public boolean f;
    public View g;
    public int h;
    public View i;
    public zh j;
    public int k = 0;
    public int l = 0;
    public Integer m;
    public Integer n;

    public u0(int i10) {
        this.a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.m;
        if (num == null || this.n == null || num.intValue() != i10 || this.n.intValue() != i11) {
            this.m = Integer.valueOf(i10);
            this.n = Integer.valueOf(i11);
            View view = this.i;
            if (view instanceof g1) {
                ((g1) view).c(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.c) {
            this.c = i10;
            View view = this.i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(zh zhVar) {
        this.j = zhVar;
        View view = this.i;
        if (view != null) {
            view.setOnClickListener(zhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.i;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
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
