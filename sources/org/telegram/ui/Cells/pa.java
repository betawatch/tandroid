package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pa extends FrameLayout {
    public final org.telegram.ui.Components.o9 a;
    public final TextView b;
    public TLRPC.TL_forumTopic c;
    public boolean d;

    public pa(Context context) {
        super(context);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.a = o9Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.l0.q(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(o9Var, g7.e6.d(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, g7.e6.d(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
        } else {
            addView(o9Var, g7.e6.d(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, g7.e6.d(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.b6) null));
        }
        org.telegram.ui.Components.o9 o9Var = this.a;
        vf.c.p(o9Var, tL_forumTopic, false, false, null);
        if (o9Var == null || o9Var.getImageReceiver() == null || !(o9Var.getImageReceiver().getDrawable() instanceof vf.b)) {
            return;
        }
        ((vf.b) o9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.c9, false));
    }
}
