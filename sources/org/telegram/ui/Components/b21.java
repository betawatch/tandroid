package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b21 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final p9 b;
    public final e90 c;
    public final e90 d;
    public int e;
    public int f;

    public b21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.a = f6Var;
        setOrientation(1);
        p9 p9Var = new p9(context);
        this.b = p9Var;
        p9Var.getImageReceiver().setAutoRepeatCount(1);
        p9Var.getImageReceiver().setAutoRepeat(1);
        p9Var.setOnClickListener(new z70(this, 22));
        addView(p9Var, k7.b6.t(90, 90, 17, 0, 9, 0, 9));
        e90 e90Var = new e90(context, null);
        this.c = e90Var;
        e90Var.setTextSize(1, 20.0f);
        e90Var.setGravity(17);
        e90Var.setTypeface(AndroidUtilities.bold());
        e90Var.setTextAlignment(4);
        addView(e90Var, k7.b6.t(-1, -2, 17, 48, 0, 48, 10));
        e90 e90Var2 = new e90(context, null);
        this.d = e90Var2;
        e90Var2.setTextSize(1, 14.0f);
        e90Var2.setGravity(17);
        e90Var2.setTextAlignment(4);
        addView(e90Var2, k7.b6.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        e90 e90Var = this.c;
        e90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (e90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        e90 e90Var2 = this.d;
        e90Var2.setTextColor(v03);
        e90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = this.e;
        this.b.setLayoutParams(k7.b6.t(i12, i12, 17, 0, e90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
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
            gj0 gj0Var = new gj0(i10, AndroidUtilities.dp(90.0f), kh.a2.j(i10, ""), AndroidUtilities.dp(90.0f));
            p9 p9Var = this.b;
            p9Var.setImageDrawable(gj0Var);
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
        e90 e90Var = this.d;
        e90Var.setText(charSequence);
        e90Var.setMaxWidth(ph.f3.a(charSequence, e90Var.getPaint()));
        e90Var.requestLayout();
        e();
    }
}
