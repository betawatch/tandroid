package kg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public e(Context context, p6 p6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        sc.e.t(textView, 1, 15.0f);
        a7.V(textView, t6.G6, p6Var);
        addView(textView, b6.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        a7.V(textView2, t6.y6, p6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, b6.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, p6Var);
        this.c = limitPreviewView;
        addView(limitPreviewView, b6.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.a.setText(dVar.a);
        this.b.setText(dVar.b);
        LimitPreviewView limitPreviewView = this.c;
        limitPreviewView.w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.x.setText(String.format("%d", Integer.valueOf(dVar.c)));
    }
}
