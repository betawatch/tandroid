package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class pc extends nb {
    public Runnable a;
    public Runnable b;
    public rc c;
    public final TextView d;
    public boolean e;

    public pc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        int i10 = org.telegram.ui.ActionBar.i6.Gi;
        int H0 = d6Var != null ? d6Var.H0(i10) : org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        if (z10) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setBackground(org.telegram.ui.ActionBar.i6.f0((H0 & 16777215) | 419430400, 7, -1));
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(H0);
            org.telegram.messenger.bi.k(R.string.UndoNoCaps, textView, 16);
            float f7 = z11 ? 34.0f : 12.0f;
            boolean z12 = LocaleController.isRTL;
            w7.f6.a(textView, z12 ? 12.0f : f7, 8.0f, z12 ? f7 : 12.0f, 8.0f);
            addView(textView, w7.z5.i(-2.0f, -2.0f, 16, 8.0f, 0.0f, 8.0f, 0.0f));
        }
        if (z11) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.chats_undo);
            imageView.setColorFilter(new PorterDuffColorFilter(H0, PorterDuff.Mode.MULTIPLY));
            if (!z10) {
                imageView.setBackground(org.telegram.ui.ActionBar.i6.f0((H0 & 16777215) | 419430400, 1, -1));
            }
            w7.f6.a(imageView, 0.0f, 12.0f, 0.0f, 12.0f);
            addView(imageView, w7.z5.h(56.0f, 48.0f, 16));
        }
        setOnClickListener(new f0(this, 6));
    }

    @Override // org.telegram.ui.Components.sb
    public final void a(rc rcVar) {
        this.c = rcVar;
    }

    @Override // org.telegram.ui.Components.sb
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
            rc rcVar = this.c;
            if (rcVar != null) {
                rcVar.b();
            }
        }
    }

    public pc(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        this(context, d6Var, z10, !z10);
    }
}
