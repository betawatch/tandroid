package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n21 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final w9 b;
    public final m90 c;
    public final m90 d;
    public int e;
    public int f;

    public n21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.a = f6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new g80(this, 22));
        addView(w9Var, w7.a6.t(90, 90, 17, 0, 9, 0, 9));
        m90 m90Var = new m90(context, null);
        this.c = m90Var;
        m90Var.setTextSize(1, 20.0f);
        m90Var.setGravity(17);
        m90Var.setTypeface(AndroidUtilities.bold());
        m90Var.setTextAlignment(4);
        addView(m90Var, w7.a6.t(-1, -2, 17, 48, 0, 48, 10));
        m90 m90Var2 = new m90(context, null);
        this.d = m90Var2;
        m90Var2.setTextSize(1, 14.0f);
        m90Var2.setGravity(17);
        m90Var2.setTextAlignment(4);
        addView(m90Var2, w7.a6.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        m90 m90Var = this.c;
        m90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (m90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        m90 m90Var2 = this.d;
        m90Var2.setTextColor(v03);
        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = this.e;
        this.b.setLayoutParams(w7.a6.t(i12, i12, 17, 0, m90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
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
            w9 w9Var = this.b;
            w9Var.setImageDrawable(hj0Var);
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
        m90 m90Var = this.d;
        m90Var.setText(charSequence);
        m90Var.setMaxWidth(bi.x4.a(charSequence, m90Var.getPaint()));
        m90Var.requestLayout();
        e();
    }
}
