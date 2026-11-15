package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vb extends ua implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public Runnable b;
    public Runnable c;
    public xb d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public vb(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.a = e6Var;
        int i7 = org.telegram.ui.ActionBar.j6.xj;
        int h = e6Var != null ? e6Var.h(i7) : org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.j6.h0((h & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            i5.c.v(textView, 1, 14.0f);
            org.telegram.messenger.i20.q(textView, i7, e6Var, null, 2131743885);
            textView.setGravity(16);
            float f10 = z11 ? 34.0f : 12.0f;
            boolean z12 = org.telegram.messenger.hd.a0;
            c8.va.a(textView, z12 ? 12.0f : f10, 8.0f, z12 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ja.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.j6.h0((h & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            c8.va.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ja.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new e0(this, 4));
    }

    @Override // org.telegram.ui.Components.za
    public final void c(xb xbVar) {
        this.d = xbVar;
    }

    @Override // org.telegram.ui.Components.za
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
            xb xbVar = this.d;
            if (xbVar != null) {
                xbVar.b();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.j6.xj;
            org.telegram.ui.ActionBar.e6 e6Var = this.a;
            int h = ((e6Var != null ? e6Var.h(i7) : org.telegram.ui.ActionBar.j6.x0(null, i7, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.j6.H1(drawable, h, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.j6.H1(drawable2, h, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public vb(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(context, e6Var, z10, !z10);
    }
}
