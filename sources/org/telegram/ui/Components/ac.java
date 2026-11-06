package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ac extends ya implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public Runnable b;
    public Runnable c;
    public cc d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public ac(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context);
        this.a = f6Var;
        int i7 = org.telegram.ui.ActionBar.k6.uj;
        int h = f6Var != null ? f6Var.h(i7) : org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        if (z9) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.k6.h0((h & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
            org.telegram.messenger.camera.q.o(textView, i7, f6Var, null, 2131743886);
            textView.setGravity(16);
            float f10 = z10 ? 34.0f : 12.0f;
            boolean z11 = org.telegram.messenger.hd.a0;
            c8.ra.a(textView, z11 ? 12.0f : f10, 8.0f, z11 ? f10 : 12.0f, 8.0f);
            addView(textView, c8.ha.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z10) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
            if (!z9) {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.h0((h & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            c8.ra.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, c8.ha.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new h0(this, 4));
    }

    @Override // org.telegram.ui.Components.db
    public final void c(cc ccVar) {
        this.d = ccVar;
    }

    @Override // org.telegram.ui.Components.db
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
            cc ccVar = this.d;
            if (ccVar != null) {
                ccVar.b();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        Drawable drawable;
        try {
            int i7 = org.telegram.ui.ActionBar.k6.uj;
            org.telegram.ui.ActionBar.f6 f6Var = this.a;
            int h = ((f6Var != null ? f6Var.h(i7) : org.telegram.ui.ActionBar.k6.x0(null, i7, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.k6.H1(drawable, h, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.k6.H1(drawable2, h, true);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public ac(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this(context, f6Var, z9, !z9);
    }
}
