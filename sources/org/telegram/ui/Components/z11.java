package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z11 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final u9 b;
    public final c90 c;
    public final c90 d;
    public int e;
    public int f;

    public z11(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 90;
        this.a = e6Var;
        setOrientation(1);
        u9 u9Var = new u9(context);
        this.b = u9Var;
        u9Var.getImageReceiver().setAutoRepeatCount(1);
        u9Var.getImageReceiver().setAutoRepeat(1);
        u9Var.setOnClickListener(new x70(this, 22));
        addView(u9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        c90 c90Var = new c90(context, null);
        this.c = c90Var;
        c90Var.setTextSize(1, 20.0f);
        c90Var.setGravity(17);
        c90Var.setTypeface(AndroidUtilities.bold());
        c90Var.setTextAlignment(4);
        addView(c90Var, w7.x5.t(-1, -2, 17, 48, 0, 48, 10));
        c90 c90Var2 = new c90(context, null);
        this.d = c90Var2;
        c90Var2.setTextSize(1, 14.0f);
        c90Var2.setGravity(17);
        c90Var2.setTextAlignment(4);
        addView(c90Var2, w7.x5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        c90 c90Var = this.c;
        c90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.i6.gc;
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        if (c90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.i6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        c90 c90Var2 = this.d;
        c90Var2.setTextColor(v03);
        c90Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        int i12 = this.e;
        this.b.setLayoutParams(w7.x5.t(i12, i12, 17, 0, c90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
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
            xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            u9 u9Var = this.b;
            u9Var.setImageDrawable(xi0Var);
            u9Var.getImageReceiver().setAutoRepeat(2);
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
            u9 u9Var = this.b;
            u9Var.b();
            this.f = i10;
            u9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        c90 c90Var = this.d;
        c90Var.setText(charSequence);
        c90Var.setMaxWidth(ci.f4.a(charSequence, c90Var.getPaint()));
        c90Var.requestLayout();
        e();
    }
}
