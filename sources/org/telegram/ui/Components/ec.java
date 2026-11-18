package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ec extends db implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public Runnable b;
    public Runnable c;
    public gc d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public ec(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        this.a = i6Var;
        int i7 = org.telegram.ui.ActionBar.n6.xj;
        int k10 = i6Var != null ? i6Var.k(i7) : org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.n6.h0((k10 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            i5.c.x(textView, 1, 14.0f);
            org.telegram.messenger.n10.r(textView, i7, i6Var, null, 2131743648);
            textView.setGravity(16);
            float f10 = z11 ? 34.0f : 12.0f;
            boolean z12 = org.telegram.messenger.gd.a0;
            c8.xa.a(textView, z12 ? 12.0f : f10, 8.0f, z12 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ma.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.n6.h0((k10 & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            c8.xa.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ma.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new n0(this, 4));
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.n6.xj;
            org.telegram.ui.ActionBar.i6 i6Var = this.a;
            int k10 = ((i6Var != null ? i6Var.k(i7) : org.telegram.ui.ActionBar.n6.x0(null, i7, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.n6.H1(drawable, k10, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.n6.H1(drawable2, k10, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public ec(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        this(context, i6Var, z10, !z10);
    }
}
