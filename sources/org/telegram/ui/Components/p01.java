package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p01 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final q9 b;
    public final m80 c;
    public final m80 d;
    public int e;
    public int f;

    public p01(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.e = 90;
        this.a = h6Var;
        setOrientation(1);
        q9 q9Var = new q9(context);
        this.b = q9Var;
        q9Var.getImageReceiver().X(1);
        q9Var.getImageReceiver().W(1);
        q9Var.setOnClickListener(new j70(this, 20));
        addView(q9Var, c8.ma.t(90, 90, 17, 0, 9, 0, 9));
        m80 m80Var = new m80(context, null);
        this.c = m80Var;
        m80Var.setTextSize(1, 20.0f);
        m80Var.setGravity(17);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        m80Var.setTextAlignment(4);
        addView(m80Var, c8.ma.t(-1, -2, 17, 48, 0, 48, 10));
        m80 m80Var2 = new m80(context, null);
        this.d = m80Var2;
        m80Var2.setTextSize(1, 14.0f);
        m80Var2.setGravity(17);
        m80Var2.setTextAlignment(4);
        addView(m80Var2, c8.ma.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        m80 m80Var = this.c;
        m80Var.setText(charSequence);
        m80Var.setVisibility(0);
        m80 m80Var2 = this.d;
        m80Var2.setText(charSequence2);
        m80Var2.setMaxWidth(hi.l3.a(charSequence2, m80Var2.getPaint()));
        m80Var2.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setEmoji(int i7) {
        if (this.f != i7) {
            this.f = i7;
            oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            q9 q9Var = this.b;
            q9Var.setImageDrawable(oh0Var);
            q9Var.getImageReceiver().W(2);
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
            q9 q9Var = this.b;
            q9Var.b();
            this.f = i7;
            q9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        m80 m80Var = this.d;
        m80Var.setText(charSequence);
        m80Var.setMaxWidth(hi.l3.a(charSequence, m80Var.getPaint()));
        m80Var.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        m80 m80Var = this.c;
        m80Var.setTextColor(w02);
        int i10 = org.telegram.ui.ActionBar.m6.Xc;
        m80Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        if (m80Var.getVisibility() != 0) {
            i7 = org.telegram.ui.ActionBar.m6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        m80 m80Var2 = this.d;
        m80Var2.setTextColor(w03);
        m80Var2.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        int i11 = this.e;
        this.b.setLayoutParams(c8.ma.t(i11, i11, 17, 0, m80Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }
}
