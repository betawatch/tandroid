package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b21 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final p9 b;
    public final f90 c;
    public final f90 d;
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
        p9Var.setOnClickListener(new a80(this, 22));
        addView(p9Var, k7.b6.t(90, 90, 17, 0, 9, 0, 9));
        f90 f90Var = new f90(context, null);
        this.c = f90Var;
        f90Var.setTextSize(1, 20.0f);
        f90Var.setGravity(17);
        f90Var.setTypeface(AndroidUtilities.bold());
        f90Var.setTextAlignment(4);
        addView(f90Var, k7.b6.t(-1, -2, 17, 48, 0, 48, 10));
        f90 f90Var2 = new f90(context, null);
        this.d = f90Var2;
        f90Var2.setTextSize(1, 14.0f);
        f90Var2.setGravity(17);
        f90Var2.setTextAlignment(4);
        addView(f90Var2, k7.b6.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        f90 f90Var = this.c;
        f90Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (f90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        f90 f90Var2 = this.d;
        f90Var2.setTextColor(v03);
        f90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int i12 = this.e;
        this.b.setLayoutParams(k7.b6.t(i12, i12, 17, 0, f90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
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
            gj0 gj0Var = new gj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
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
        f90 f90Var = this.d;
        f90Var.setText(charSequence);
        f90Var.setMaxWidth(ph.f3.a(charSequence, f90Var.getPaint()));
        f90Var.requestLayout();
        e();
    }
}
