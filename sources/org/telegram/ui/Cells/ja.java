package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ja extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.g9 a;
    public final TextView b;
    public TLRPC.TL_forumTopic c;
    public boolean d;

    public ja(Context context) {
        super(context);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.G6, null, 1, 16.0f);
        if (cd.X) {
            addView(g9Var, w7.b6.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, w7.b6.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
        } else {
            addView(g9Var, w7.b6.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, w7.b6.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = org.telegram.messenger.i0.L(56.0f);
            if (cd.X) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), TLObject.FLAG_30));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.b;
        if (isEmpty) {
            textView.setText(org.telegram.messenger.i0.D2(tL_forumTopic.title));
        } else {
            textView.setText(org.telegram.messenger.i0.w1(org.telegram.messenger.i0.D2(tL_forumTopic.title), tL_forumTopic.searchQuery, null));
        }
        org.telegram.ui.Components.g9 g9Var = this.a;
        gg.e.p(g9Var, tL_forumTopic, false, false, null);
        if (g9Var == null || g9Var.getImageReceiver() == null || !(g9Var.getImageReceiver().t() instanceof gg.d)) {
            return;
        }
        ((gg.d) g9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.c9, false));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Components.g9 g9Var = this.a;
        if (g9Var != null) {
            try {
                if (g9Var.getImageReceiver() == null || !(g9Var.getImageReceiver().t() instanceof gg.d)) {
                    return;
                }
                ((gg.d) g9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.c9, false));
                g9Var.invalidate();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
