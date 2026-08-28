package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.lh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public lh j;
    public int k = 0;
    public int l = 0;
    public Integer m;
    public Integer n;

    public u0(int i9) {
        this.a = i9;
    }

    public final void a(int i9, int i10) {
        Integer num = this.m;
        if (num == null || this.n == null || num.intValue() != i9 || this.n.intValue() != i10) {
            this.m = Integer.valueOf(i9);
            this.n = Integer.valueOf(i10);
            View view = this.i;
            if (view instanceof g1) {
                ((g1) view).c(i9, i10);
            }
        }
    }

    public final void b(int i9) {
        if (i9 != this.c) {
            this.c = i9;
            View view = this.i;
            if (view instanceof g1) {
                ((g1) view).setIcon(i9);
            }
        }
    }

    public final void c(lh lhVar) {
        this.j = lhVar;
        View view = this.i;
        if (view != null) {
            view.setOnClickListener(lhVar);
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

    public final void e(int i9) {
        this.k = i9;
        View view = this.i;
        if (view != null) {
            view.setVisibility(i9);
        }
    }
}
