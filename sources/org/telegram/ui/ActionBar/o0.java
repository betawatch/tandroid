package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ah;
import org.telegram.ui.yg;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o0 {
    public final int a;
    public int b;
    public int c;
    public Drawable d;
    public CharSequence e;
    public boolean f;
    public View g;
    public ah h;
    public int i;
    public View j;
    public yg k;
    public int l = 0;
    public int m = 0;
    public Integer n;
    public Integer o;

    public o0(int i3) {
        this.a = i3;
    }

    public final void a(int i3, int i10) {
        Integer num = this.n;
        if (num == null || this.o == null || num.intValue() != i3 || this.o.intValue() != i10) {
            this.n = Integer.valueOf(i3);
            this.o = Integer.valueOf(i10);
            View view = this.j;
            if (view instanceof y0) {
                ((y0) view).d(i3, i10);
            }
        }
    }

    public final void b(int i3) {
        if (i3 != this.c) {
            this.c = i3;
            View view = this.j;
            if (view instanceof y0) {
                ((y0) view).setIcon(i3);
            }
        }
    }

    public final void c(yg ygVar) {
        this.k = ygVar;
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(ygVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.j;
        if (view instanceof y0) {
            ((y0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i3) {
        this.l = i3;
        View view = this.j;
        if (view != null) {
            view.setVisibility(i3);
        }
    }
}
