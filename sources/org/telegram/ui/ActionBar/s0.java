package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.mh;
import org.telegram.ui.oh;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class s0 {
    public final int a;
    public int b;
    public int c;
    public Drawable d;
    public CharSequence e;
    public boolean f;
    public View g;
    public oh h;
    public int i;
    public View j;
    public mh k;
    public int l = 0;
    public int m = 0;
    public Integer n;
    public Integer o;

    public s0(int i10) {
        this.a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.n;
        if (num == null || this.o == null || num.intValue() != i10 || this.o.intValue() != i11) {
            this.n = Integer.valueOf(i10);
            this.o = Integer.valueOf(i11);
            View view = this.j;
            if (view instanceof e1) {
                ((e1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.c) {
            this.c = i10;
            View view = this.j;
            if (view instanceof e1) {
                ((e1) view).setIcon(i10);
            }
        }
    }

    public final void c(mh mhVar) {
        this.k = mhVar;
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(mhVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.j;
        if (view instanceof e1) {
            ((e1) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i10) {
        this.l = i10;
        View view = this.j;
        if (view != null) {
            view.setVisibility(i10);
        }
    }
}
