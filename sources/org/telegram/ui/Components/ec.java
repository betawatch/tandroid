package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ec extends db implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public Runnable b;
    public Runnable c;
    public gc d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public ec(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context);
        this.a = h6Var;
        int i7 = org.telegram.ui.ActionBar.m6.xj;
        int k10 = h6Var != null ? h6Var.k(i7) : org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.m6.h0((k10 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            i5.c.x(textView, 1, 14.0f);
            org.telegram.messenger.o10.r(textView, i7, h6Var, null, 2131743640);
            textView.setGravity(16);
            float f10 = z11 ? 34.0f : 12.0f;
            boolean z12 = org.telegram.messenger.hd.a0;
            c8.xa.a(textView, z12 ? 12.0f : f10, 8.0f, z12 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ma.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.m6.h0((k10 & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            c8.xa.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ma.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new o0(this, 4));
    }

    @Override // org.telegram.ui.Components.ib
    public final void c(gc gcVar) {
        this.d = gcVar;
    }

    @Override // org.telegram.ui.Components.ib
    public final void d() {
        this.d = null;
        Runnable runnable = this.c;
        if (runnable == null || this.f) {
            return;
        }
        runnable.run();
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.d != null) {
            this.f = true;
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
            gc gcVar = this.d;
            if (gcVar != null) {
                gcVar.b();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.m6.xj;
            org.telegram.ui.ActionBar.h6 h6Var = this.a;
            int k10 = ((h6Var != null ? h6Var.k(i7) : org.telegram.ui.ActionBar.m6.x0(null, i7, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.m6.H1(drawable, k10, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.m6.H1(drawable2, k10, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public ec(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        this(context, h6Var, z10, !z10);
    }
}
