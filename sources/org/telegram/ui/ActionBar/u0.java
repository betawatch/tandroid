package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.oh;
import org.telegram.ui.qh;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u0 {
    public final int a;
    public int b;
    public int c;
    public Drawable d;
    public CharSequence e;
    public boolean f;
    public View g;
    public qh h;
    public int i;
    public View j;
    public oh k;
    public int l = 0;
    public int m = 0;
    public Integer n;
    public Integer o;

    public u0(int i10) {
        this.a = i10;
    }

    public final void a(int i10, int i11) {
        Integer num = this.n;
        if (num == null || this.o == null || num.intValue() != i10 || this.o.intValue() != i11) {
            this.n = Integer.valueOf(i10);
            this.o = Integer.valueOf(i11);
            View view = this.j;
            if (view instanceof g1) {
                ((g1) view).d(i10, i11);
            }
        }
    }

    public final void b(int i10) {
        if (i10 != this.c) {
            this.c = i10;
            View view = this.j;
            if (view instanceof g1) {
                ((g1) view).setIcon(i10);
            }
        }
    }

    public final void c(oh ohVar) {
        this.k = ohVar;
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(ohVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.j;
        if (view instanceof g1) {
            ((g1) view).setText(charSequence);
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
