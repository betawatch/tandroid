package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class y11 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final w9 b;
    public final d90 c;
    public final d90 d;
    public int e;
    public int f;

    public y11(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 90;
        this.a = d6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new y70(this, 22));
        addView(w9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
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
        e();
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        d90 d90Var = this.c;
        d90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        if (d90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.h6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        d90 d90Var2 = this.d;
        d90Var2.setTextColor(v03);
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
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
            yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.b;
            w9Var.setImageDrawable(yi0Var);
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
        d90 d90Var = this.d;
        d90Var.setText(charSequence);
        d90Var.setMaxWidth(ci.e4.a(charSequence, d90Var.getPaint()));
        d90Var.requestLayout();
        e();
    }
}
