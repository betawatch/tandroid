package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ub extends sa implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public Runnable b;
    public Runnable c;
    public wb d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public ub(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.a = p6Var;
        int i10 = org.telegram.ui.ActionBar.t6.uj;
        int h = p6Var != null ? p6Var.h(i10) : org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.t6.h0((h & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            sc.e.t(textView, 1, 14.0f);
            org.telegram.messenger.z20.p(textView, i10, p6Var, null, 2131743910);
            textView.setGravity(16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = org.telegram.messenger.cd.X;
            w7.i6.a(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, w7.b6.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.t6.h0((h & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            w7.i6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, w7.b6.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new h0(this, 4));
    }

    @Override // org.telegram.ui.Components.xa
    public final void c(wb wbVar) {
        this.d = wbVar;
    }

    @Override // org.telegram.ui.Components.xa
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
            wb wbVar = this.d;
            if (wbVar != null) {
                wbVar.b();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        Drawable drawable;
        try {
            int i10 = org.telegram.ui.ActionBar.t6.uj;
            org.telegram.ui.ActionBar.p6 p6Var = this.a;
            int h = ((p6Var != null ? p6Var.h(i10) : org.telegram.ui.ActionBar.t6.x0(null, i10, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.t6.H1(drawable, h, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.t6.H1(drawable2, h, true);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public ub(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this(context, p6Var, z10, !z10);
    }
}
