package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b21 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final p9 b;
    public final g90 c;
    public final g90 d;
    public int e;
    public int f;

    public b21(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 90;
        this.a = g6Var;
        setOrientation(1);
        p9 p9Var = new p9(context);
        this.b = p9Var;
        p9Var.getImageReceiver().setAutoRepeatCount(1);
        p9Var.getImageReceiver().setAutoRepeat(1);
        p9Var.setOnClickListener(new b80(this, 22));
        addView(p9Var, k7.c6.t(90, 90, 17, 0, 9, 0, 9));
        g90 g90Var = new g90(context, null);
        this.c = g90Var;
        g90Var.setTextSize(1, 20.0f);
        g90Var.setGravity(17);
        g90Var.setTypeface(AndroidUtilities.bold());
        g90Var.setTextAlignment(4);
        addView(g90Var, k7.c6.t(-1, -2, 17, 48, 0, 48, 10));
        g90 g90Var2 = new g90(context, null);
        this.d = g90Var2;
        g90Var2.setTextSize(1, 14.0f);
        g90Var2.setGravity(17);
        g90Var2.setTextAlignment(4);
        addView(g90Var2, k7.c6.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        g90 g90Var = this.c;
        g90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.k6.gc;
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        if (g90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.k6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        g90 g90Var2 = this.d;
        g90Var2.setTextColor(v03);
        g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        int i12 = this.e;
        this.b.setLayoutParams(k7.c6.t(i12, i12, 17, 0, g90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setEmoji(int i10) {
        if (this.f != i10) {
            this.f = i10;
            hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            p9 p9Var = this.b;
            p9Var.setImageDrawable(hj0Var);
            p9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f != i10) {
            p9 p9Var = this.b;
            p9Var.b();
            this.f = i10;
            p9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        g90 g90Var = this.d;
        g90Var.setText(charSequence);
        g90Var.setMaxWidth(qh.e3.a(charSequence, g90Var.getPaint()));
        g90Var.requestLayout();
        e();
    }
}
