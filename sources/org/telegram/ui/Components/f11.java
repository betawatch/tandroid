package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f11 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 a;
    public final o9 b;
    public final l80 c;
    public final l80 d;
    public int e;
    public int f;

    public f11(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.e = 90;
        this.a = b6Var;
        setOrientation(1);
        o9 o9Var = new o9(context);
        this.b = o9Var;
        o9Var.getImageReceiver().setAutoRepeatCount(1);
        o9Var.getImageReceiver().setAutoRepeat(1);
        o9Var.setOnClickListener(new h70(this, 22));
        addView(o9Var, g7.e6.t(90, 90, 17, 0, 9, 0, 9));
        l80 l80Var = new l80(context, null);
        this.c = l80Var;
        l80Var.setTextSize(1, 20.0f);
        l80Var.setGravity(17);
        l80Var.setTypeface(AndroidUtilities.bold());
        l80Var.setTextAlignment(4);
        addView(l80Var, g7.e6.t(-1, -2, 17, 48, 0, 48, 10));
        l80 l80Var2 = new l80(context, null);
        this.d = l80Var2;
        l80Var2.setTextSize(1, 14.0f);
        l80Var2.setGravity(17);
        l80Var2.setTextAlignment(4);
        addView(l80Var2, g7.e6.t(-1, -2, 17, 48, 0, 48, 17));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        l80 l80Var = this.c;
        l80Var.setTextColor(v02);
        int i10 = org.telegram.ui.ActionBar.f6.gc;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        if (l80Var.getVisibility() != 0) {
            i9 = org.telegram.ui.ActionBar.f6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        l80 l80Var2 = this.d;
        l80Var2.setTextColor(v03);
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        int i11 = this.e;
        this.b.setLayoutParams(g7.e6.t(i11, i11, 17, 0, l80Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
    }

    public void setEmoji(int i9) {
        if (this.f != i9) {
            this.f = i9;
            mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(90.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(90.0f));
            o9 o9Var = this.b;
            o9Var.setImageDrawable(mi0Var);
            o9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i9) {
        if (this.e != i9) {
            this.e = i9;
            d();
        }
    }

    public void setEmojiStatic(int i9) {
        if (this.f != i9) {
            o9 o9Var = this.b;
            o9Var.b();
            this.f = i9;
            o9Var.setImageResource(i9);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        l80 l80Var = this.d;
        l80Var.setText(charSequence);
        l80Var.setMaxWidth(kh.x3.a(charSequence, l80Var.getPaint()));
        l80Var.requestLayout();
        d();
    }
}
