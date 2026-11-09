package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f01 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final l9 b;
    public final x70 c;
    public final x70 d;
    public int e;
    public int f;

    public f01(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 90;
        this.a = g6Var;
        setOrientation(1);
        l9 l9Var = new l9(context);
        this.b = l9Var;
        l9Var.getImageReceiver().X(1);
        l9Var.getImageReceiver().W(1);
        l9Var.setOnClickListener(new ma0(this, 18));
        addView(l9Var, c8.ha.t(90, 90, 17, 0, 9, 0, 9));
        x70 x70Var = new x70(context, null);
        this.c = x70Var;
        x70Var.setTextSize(1, 20.0f);
        x70Var.setGravity(17);
        x70Var.setTypeface(org.telegram.messenger.g0.o());
        x70Var.setTextAlignment(4);
        addView(x70Var, c8.ha.t(-1, -2, 17, 48, 0, 48, 10));
        x70 x70Var2 = new x70(context, null);
        this.d = x70Var2;
        x70Var2.setTextSize(1, 14.0f);
        x70Var2.setGravity(17);
        x70Var2.setTextAlignment(4);
        addView(x70Var2, c8.ha.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        x70 x70Var = this.c;
        x70Var.setText(charSequence);
        x70Var.setVisibility(0);
        x70 x70Var2 = this.d;
        x70Var2.setText(charSequence2);
        x70Var2.setMaxWidth(fi.m3.a(charSequence2, x70Var2.getPaint()));
        x70Var2.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setEmoji(int i7) {
        if (this.f != i7) {
            this.f = i7;
            ah0 ah0Var = new ah0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            l9 l9Var = this.b;
            l9Var.setImageDrawable(ah0Var);
            l9Var.getImageReceiver().W(2);
        }
    }

    public void setEmojiSize(int i7) {
        if (this.e != i7) {
            this.e = i7;
            updateColors();
        }
    }

    public void setEmojiStatic(int i7) {
        if (this.f != i7) {
            l9 l9Var = this.b;
            l9Var.b();
            this.f = i7;
            l9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        x70 x70Var = this.d;
        x70Var.setText(charSequence);
        x70Var.setMaxWidth(fi.m3.a(charSequence, x70Var.getPaint()));
        x70Var.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        x70 x70Var = this.c;
        x70Var.setTextColor(w02);
        int i10 = org.telegram.ui.ActionBar.l6.Uc;
        x70Var.setLinkTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        if (x70Var.getVisibility() != 0) {
            i7 = org.telegram.ui.ActionBar.l6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        x70 x70Var2 = this.d;
        x70Var2.setTextColor(w03);
        x70Var2.setLinkTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        int i11 = this.e;
        this.b.setLayoutParams(c8.ha.t(i11, i11, 17, 0, x70Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }
}
