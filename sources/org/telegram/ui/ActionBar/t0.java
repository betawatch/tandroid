package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.vh;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
    public vh j;
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

    public final void c(vh vhVar) {
        this.j = vhVar;
        View view = this.i;
        if (view != null) {
            view.setOnClickListener(vhVar);
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
