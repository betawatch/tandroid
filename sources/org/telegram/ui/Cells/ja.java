package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ja extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.k9 a;
    public final TextView b;
    public TLRPC.TL_forumTopic c;
    public boolean d;

    public ja(Context context) {
        super(context);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.m6.G6, null, 1, 16.0f);
        if (id.a0) {
            addView(k9Var, c8.ha.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, c8.ha.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
        } else {
            addView(k9Var, c8.ha.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, c8.ha.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int L = org.telegram.messenger.g0.L(56.0f);
            if (id.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
            } else {
                canvas.drawLine(L, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
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
        org.telegram.ui.Components.k9 k9Var = this.a;
        qg.d.p(k9Var, tL_forumTopic, false, false, null);
        if (k9Var == null || k9Var.getImageReceiver() == null || !(k9Var.getImageReceiver().t() instanceof qg.c)) {
            return;
        }
        ((qg.c) k9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.c9, false));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.k9 k9Var = this.a;
        if (k9Var != null) {
            try {
                if (k9Var.getImageReceiver() == null || !(k9Var.getImageReceiver().t() instanceof qg.c)) {
                    return;
                }
                ((qg.c) k9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.c9, false));
                k9Var.invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
