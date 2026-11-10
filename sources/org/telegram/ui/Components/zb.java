package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zb extends xa implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public Runnable b;
    public Runnable c;
    public bc d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public zb(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context);
        this.a = h6Var;
        int i7 = org.telegram.ui.ActionBar.m6.uj;
        int h = h6Var != null ? h6Var.h(i7) : org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        if (z9) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.m6.h0((h & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
            org.telegram.messenger.camera.q.o(textView, i7, h6Var, null, 2131743885);
            textView.setGravity(16);
            float f10 = z10 ? 34.0f : 12.0f;
            boolean z11 = org.telegram.messenger.id.a0;
            c8.sa.a(textView, z11 ? 12.0f : f10, 8.0f, z11 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ha.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z10) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
            if (!z9) {
                imageView.setBackground(org.telegram.ui.ActionBar.m6.h0((h & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            c8.sa.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ha.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new g0(this, 4));
    }

    @Override // org.telegram.ui.Components.cb
    public final void c(bc bcVar) {
        this.d = bcVar;
    }

    @Override // org.telegram.ui.Components.cb
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
            bc bcVar = this.d;
            if (bcVar != null) {
                bcVar.b();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.m6.uj;
            org.telegram.ui.ActionBar.h6 h6Var = this.a;
            int h = ((h6Var != null ? h6Var.h(i7) : org.telegram.ui.ActionBar.m6.x0(null, i7, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.m6.H1(drawable, h, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.m6.H1(drawable2, h, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public zb(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        this(context, h6Var, z9, !z9);
    }
}
