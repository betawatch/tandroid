package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p21 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final v9 b;
    public final n90 c;
    public final n90 d;
    public int e;
    public int f;

    public p21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.a = f6Var;
        setOrientation(1);
        v9 v9Var = new v9(context);
        this.b = v9Var;
        v9Var.getImageReceiver().setAutoRepeatCount(1);
        v9Var.getImageReceiver().setAutoRepeat(1);
        v9Var.setOnClickListener(new i80(this, 22));
        addView(v9Var, w7.y5.t(90, 90, 17, 0, 9, 0, 9));
        n90 n90Var = new n90(context, null);
        this.c = n90Var;
        n90Var.setTextSize(1, 20.0f);
        n90Var.setGravity(17);
        n90Var.setTypeface(AndroidUtilities.bold());
        n90Var.setTextAlignment(4);
        addView(n90Var, w7.y5.t(-1, -2, 17, 48, 0, 48, 10));
        n90 n90Var2 = new n90(context, null);
        this.d = n90Var2;
        n90Var2.setTextSize(1, 14.0f);
        n90Var2.setGravity(17);
        n90Var2.setTextAlignment(4);
        addView(n90Var2, w7.y5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        n90 n90Var = this.c;
        n90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (n90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        n90 n90Var2 = this.d;
        n90Var2.setTextColor(v03);
        n90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = this.e;
        this.b.setLayoutParams(w7.y5.t(i12, i12, 17, 0, n90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
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
            v9 v9Var = this.b;
            v9Var.setImageDrawable(kj0Var);
            v9Var.getImageReceiver().setAutoRepeat(2);
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
            v9 v9Var = this.b;
            v9Var.b();
            this.f = i10;
            v9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        n90 n90Var = this.d;
        n90Var.setText(charSequence);
        n90Var.setMaxWidth(ci.f4.a(charSequence, n90Var.getPaint()));
        n90Var.requestLayout();
        e();
    }
}
