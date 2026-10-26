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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oc extends mb implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public Runnable b;
    public Runnable c;
    public qc d;
    public final TextView e;
    public boolean f;
    public final Drawable h;
    public final Drawable n;

    public oc(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        this.a = u6Var;
        int i10 = org.telegram.ui.ActionBar.y6.Gi;
        int g7 = u6Var != null ? u6Var.g(i10) : org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.e = textView;
            textView.setBackground(org.telegram.ui.ActionBar.y6.g0((g7 & 16777215) | 419430400, 7, -1));
            this.h = textView.getBackground();
            ic.a.o(14.0f, 1, textView);
            org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
            org.telegram.messenger.vh.k(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            gb1.U(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, gb1.m(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.y6.g0((g7 & 16777215) | 419430400, 1, -1));
                this.n = imageView.getBackground();
            }
            gb1.U(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, gb1.l(56.0f, 48.0f, 16));
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        Drawable drawable;
        try {
            int i10 = org.telegram.ui.ActionBar.y6.Gi;
            org.telegram.ui.ActionBar.u6 u6Var = this.a;
            int g7 = ((u6Var != null ? u6Var.g(i10) : org.telegram.ui.ActionBar.y6.x0(null, i10, false)) & 16777215) | 419430400;
            TextView textView = this.e;
            if (textView != null && (drawable = this.h) != null && textView.getBackground() == drawable) {
                org.telegram.ui.ActionBar.y6.E1(drawable, g7, true);
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                org.telegram.ui.ActionBar.y6.E1(drawable2, g7, true);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public oc(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this(context, u6Var, z10, !z10);
    }
}
