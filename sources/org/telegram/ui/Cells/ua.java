package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ua extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.y9 a;
    public final TextView b;
    public TLRPC.TL_forumTopic c;
    public boolean d;

    public ua(Context context) {
        super(context);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.a = y9Var;
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.G6, null, 1, 16.0f);
        if (LocaleController.isRTL) {
            addView(y9Var, gb1.h(30, 30.0f, 21, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, gb1.h(-1, -2.0f, 21, 12.0f, 0.0f, 56.0f, 0.0f));
        } else {
            addView(y9Var, gb1.h(30, 30.0f, 16, 12.0f, 0.0f, 12.0f, 0.0f));
            addView(textView, gb1.h(-1, -2.0f, 16, 56.0f, 0.0f, 12.0f, 0.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            int dp = AndroidUtilities.dp(56.0f);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
            } else {
                canvas.drawLine(dp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
            }
        }
    }

    public TLRPC.TL_forumTopic getTopic() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    public void setTopic(TLRPC.TL_forumTopic tL_forumTopic) {
        this.c = tL_forumTopic;
        boolean isEmpty = TextUtils.isEmpty(tL_forumTopic.searchQuery);
        TextView textView = this.b;
        if (isEmpty) {
            textView.setText(AndroidUtilities.removeDiacritics(tL_forumTopic.title));
        } else {
            textView.setText(AndroidUtilities.highlightText(AndroidUtilities.removeDiacritics(tL_forumTopic.title), tL_forumTopic.searchQuery, (org.telegram.ui.ActionBar.u6) null));
        }
        org.telegram.ui.Components.y9 y9Var = this.a;
        pg.d.p(y9Var, tL_forumTopic, false, false, null);
        if (y9Var == null || y9Var.getImageReceiver() == null || !(y9Var.getImageReceiver().getDrawable() instanceof pg.c)) {
            return;
        }
        ((pg.c) y9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.c9, false));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Components.y9 y9Var = this.a;
        if (y9Var != null) {
            try {
                if (y9Var.getImageReceiver() == null || !(y9Var.getImageReceiver().getDrawable() instanceof pg.c)) {
                    return;
                }
                ((pg.c) y9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.c9, false));
                y9Var.invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
