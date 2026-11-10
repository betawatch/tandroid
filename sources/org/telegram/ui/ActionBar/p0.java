package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.eh;
import org.telegram.ui.gh;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p0 {
    public final int a;
    public int b;
    public int c;
    public Drawable d;
    public CharSequence e;
    public boolean f;
    public View g;
    public gh h;
    public int i;
    public View j;
    public eh k;
    public int l = 0;
    public int m = 0;
    public Integer n;
    public Integer o;

    public p0(int i7) {
        this.a = i7;
    }

    public final void a(int i7, int i10) {
        Integer num = this.n;
        if (num == null || this.o == null || num.intValue() != i7 || this.o.intValue() != i10) {
            this.n = Integer.valueOf(i7);
            this.o = Integer.valueOf(i10);
            View view = this.j;
            if (view instanceof z0) {
                ((z0) view).d(i7, i10);
            }
        }
    }

    public final void b(int i7) {
        if (i7 != this.c) {
            this.c = i7;
            View view = this.j;
            if (view instanceof z0) {
                ((z0) view).setIcon(i7);
            }
        }
    }

    public final void c(eh ehVar) {
        this.k = ehVar;
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(ehVar);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.j;
        if (view instanceof z0) {
            ((z0) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.l = i7;
        View view = this.j;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
