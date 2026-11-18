package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ka extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.q9 a;
    public final TextView b;
    public TLRPC.TL_forumTopic c;
    public boolean d;

    public ka(Context context) {
        super(context);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.G6, null, 1, 16.0f);
        if (gd.a0) {
            addView(q9Var, c8.ma.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, c8.ma.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
        } else {
            addView(q9Var, c8.ma.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, c8.ma.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = org.telegram.messenger.g0.L(56.0f);
            if (gd.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.b;
        if (isEmpty) {
            textView.setText(org.telegram.messenger.g0.D2(tL_forumTopic.title));
        } else {
            textView.setText(org.telegram.messenger.g0.w1(org.telegram.messenger.g0.D2(tL_forumTopic.title), tL_forumTopic.searchQuery, null));
        }
        org.telegram.ui.Components.q9 q9Var = this.a;
        qg.c.q(q9Var, tL_forumTopic, false, false, null);
        if (q9Var == null || q9Var.getImageReceiver() == null || !(q9Var.getImageReceiver().t() instanceof qg.b)) {
            return;
        }
        ((qg.b) q9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.c9, false));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.q9 q9Var = this.a;
        if (q9Var != null) {
            try {
                if (q9Var.getImageReceiver() == null || !(q9Var.getImageReceiver().t() instanceof qg.b)) {
                    return;
                }
                ((qg.b) q9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.c9, false));
                q9Var.invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
