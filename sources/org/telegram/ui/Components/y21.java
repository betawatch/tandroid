package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class y21 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final w9 b;
    public final q90 c;
    public final q90 d;
    public int e;
    public int f;

    public y21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 90;
        this.a = d6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new l80(this, 22));
        addView(w9Var, w7.z5.t(90, 90, 17, 0, 9, 0, 9));
        q90 q90Var = new q90(context, null);
        this.c = q90Var;
        q90Var.setTextSize(1, 20.0f);
        q90Var.setGravity(17);
        q90Var.setTypeface(AndroidUtilities.bold());
        q90Var.setTextAlignment(4);
        addView(q90Var, w7.z5.t(-1, -2, 17, 48, 0, 48, 10));
        q90 q90Var2 = new q90(context, null);
        this.d = q90Var2;
        q90Var2.setTextSize(1, 14.0f);
        q90Var2.setGravity(17);
        q90Var2.setTextAlignment(4);
        addView(q90Var2, w7.z5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        q90 q90Var = this.c;
        q90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.i6.gc;
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        if (q90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.i6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        q90 q90Var2 = this.d;
        q90Var2.setTextColor(v03);
        q90Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        int i12 = this.e;
        this.b.setLayoutParams(w7.z5.t(i12, i12, 17, 0, q90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
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
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.b;
            w9Var.setImageDrawable(kj0Var);
            w9Var.getImageReceiver().setAutoRepeat(2);
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
            w9 w9Var = this.b;
            w9Var.b();
            this.f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        q90 q90Var = this.d;
        q90Var.setText(charSequence);
        q90Var.setMaxWidth(ci.e4.a(charSequence, q90Var.getPaint()));
        q90Var.requestLayout();
        e();
    }
}
