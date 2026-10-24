package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class oc extends mb implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public Runnable b;
    public Runnable c;
    public qc d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public oc(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context);
        this.a = g6Var;
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        int g10 = g6Var != null ? g6Var.g(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.k6.g0((g10 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
            org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
            org.telegram.messenger.sl.m(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            w7.f6.a(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, w7.z5.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.g0((g10 & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            w7.f6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, w7.z5.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new f0(this, 5));
    }

    @Override // org.telegram.ui.Components.rb
    public final void c(qc qcVar) {
        this.d = qcVar;
    }

    @Override // org.telegram.ui.Components.rb
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
            qc qcVar = this.d;
            if (qcVar != null) {
                qcVar.b();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        Drawable drawable;
        try {
            int i10 = org.telegram.ui.ActionBar.k6.Gi;
            org.telegram.ui.ActionBar.g6 g6Var = this.a;
            int g10 = ((g6Var != null ? g6Var.g(i10) : org.telegram.ui.ActionBar.k6.x0(null, i10, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.k6.E1(drawable, g10, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.k6.E1(drawable2, g10, true);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public oc(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        this(context, g6Var, z10, !z10);
    }
}
