package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class oc extends mb {
    public Runnable a;
    public Runnable b;
    public qc c;
    public final TextView d;
    public boolean e;

    public oc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        int i10 = org.telegram.ui.ActionBar.j6.Gi;
        int G0 = f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.j6.f0((G0 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(G0);
            org.telegram.messenger.wl.k(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            w7.d6.a(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, w7.x5.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.MULTIPLY));
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0((G0 & 16777215) | 419430400, 1, -1));
            }
            w7.d6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, w7.x5.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new g0(this, 6));
    }

    @Override // org.telegram.ui.Components.rb
    public final void a(qc qcVar) {
        this.c = qcVar;
    }

    @Override // org.telegram.ui.Components.rb
    public final void b() {
        this.c = null;
        Runnable runnable = this.b;
        if (runnable == null || this.e) {
            return;
        }
        runnable.run();
    }

    public final void e(CharSequence charSequence) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void f() {
        if (this.c != null) {
            this.e = true;
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
            }
            qc qcVar = this.c;
            if (qcVar != null) {
                qcVar.b();
            }
        }
    }

    public oc(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(context, f6Var, z10, !z10);
    }
}
