package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j31 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final y9 b;
    public final z90 c;
    public final z90 d;
    public int e;
    public int f;

    public j31(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = 90;
        this.a = u6Var;
        setOrientation(1);
        y9 y9Var = new y9(context);
        this.b = y9Var;
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        y9Var.getImageReceiver().setAutoRepeat(1);
        y9Var.setOnClickListener(new w80(this, 20));
        addView(y9Var, gb1.x(90, 90, 17, 0, 9, 0, 9));
        z90 z90Var = new z90(context, null);
        this.c = z90Var;
        z90Var.setTextSize(1, 20.0f);
        z90Var.setGravity(17);
        z90Var.setTypeface(AndroidUtilities.bold());
        z90Var.setTextAlignment(4);
        addView(z90Var, gb1.x(-1, -2, 17, 48, 0, 48, 10));
        z90 z90Var2 = new z90(context, null);
        this.d = z90Var2;
        z90Var2.setTextSize(1, 14.0f);
        z90Var2.setGravity(17);
        z90Var2.setTextAlignment(4);
        addView(z90Var2, gb1.x(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        z90 z90Var = this.c;
        z90Var.setText(charSequence);
        z90Var.setVisibility(0);
        z90 z90Var2 = this.d;
        z90Var2.setText(charSequence2);
        z90Var2.setMaxWidth(fi.v3.a(charSequence2, z90Var2.getPaint()));
        z90Var2.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setEmoji(int i10) {
        if (this.f != i10) {
            this.f = i10;
            xj0 xj0Var = new xj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            y9 y9Var = this.b;
            y9Var.setImageDrawable(xj0Var);
            y9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            updateColors();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f != i10) {
            y9 y9Var = this.b;
            y9Var.b();
            this.f = i10;
            y9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        z90 z90Var = this.d;
        z90Var.setText(charSequence);
        z90Var.setMaxWidth(fi.v3.a(charSequence, z90Var.getPaint()));
        z90Var.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        z90 z90Var = this.c;
        z90Var.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.y6.gc;
        z90Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        if (z90Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.y6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        z90 z90Var2 = this.d;
        z90Var2.setTextColor(w03);
        z90Var2.setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        int i12 = this.e;
        this.b.setLayoutParams(gb1.x(i12, i12, 17, 0, z90Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }
}
