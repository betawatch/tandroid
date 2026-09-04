package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class y11 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final x9 b;
    public final d90 c;
    public final d90 d;
    public int e;
    public int f;

    public y11(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.a = f6Var;
        setOrientation(1);
        x9 x9Var = new x9(context);
        this.b = x9Var;
        x9Var.getImageReceiver().setAutoRepeatCount(1);
        x9Var.getImageReceiver().setAutoRepeat(1);
        x9Var.setOnClickListener(new x70(this, 22));
        addView(x9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        d90 d90Var = new d90(context, null);
        this.c = d90Var;
        d90Var.setTextSize(1, 20.0f);
        d90Var.setGravity(17);
        d90Var.setTypeface(AndroidUtilities.bold());
        d90Var.setTextAlignment(4);
        addView(d90Var, w7.x5.t(-1, -2, 17, 48, 0, 48, 10));
        d90 d90Var2 = new d90(context, null);
        this.d = d90Var2;
        d90Var2.setTextSize(1, 14.0f);
        d90Var2.setGravity(17);
        d90Var2.setTextAlignment(4);
        addView(d90Var2, w7.x5.t(-1, -2, 17, 48, 0, 48, 17));
        d();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        d90 d90Var = this.c;
        d90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (d90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        d90 d90Var2 = this.d;
        d90Var2.setTextColor(v03);
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = this.e;
        this.b.setLayoutParams(w7.x5.t(i12, i12, 17, 0, d90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
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
            x9 x9Var = this.b;
            x9Var.setImageDrawable(xi0Var);
            x9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            d();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f != i10) {
            x9 x9Var = this.b;
            x9Var.b();
            this.f = i10;
            x9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        d90 d90Var = this.d;
        d90Var.setText(charSequence);
        d90Var.setMaxWidth(di.f4.a(charSequence, d90Var.getPaint()));
        d90Var.requestLayout();
        d();
    }
}
