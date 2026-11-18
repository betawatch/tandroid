package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o01 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final q9 b;
    public final k80 c;
    public final k80 d;
    public int e;
    public int f;

    public o01(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.e = 90;
        this.a = i6Var;
        setOrientation(1);
        q9 q9Var = new q9(context);
        this.b = q9Var;
        q9Var.getImageReceiver().X(1);
        q9Var.getImageReceiver().W(1);
        q9Var.setOnClickListener(new h70(this, 19));
        addView(q9Var, c8.ma.t(90, 90, 17, 0, 9, 0, 9));
        k80 k80Var = new k80(context, null);
        this.c = k80Var;
        k80Var.setTextSize(1, 20.0f);
        k80Var.setGravity(17);
        k80Var.setTypeface(org.telegram.messenger.g0.o());
        k80Var.setTextAlignment(4);
        addView(k80Var, c8.ma.t(-1, -2, 17, 48, 0, 48, 10));
        k80 k80Var2 = new k80(context, null);
        this.d = k80Var2;
        k80Var2.setTextSize(1, 14.0f);
        k80Var2.setGravity(17);
        k80Var2.setTextAlignment(4);
        addView(k80Var2, c8.ma.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        k80 k80Var = this.c;
        k80Var.setText(charSequence);
        k80Var.setVisibility(0);
        k80 k80Var2 = this.d;
        k80Var2.setText(charSequence2);
        k80Var2.setMaxWidth(hi.m3.a(charSequence2, k80Var2.getPaint()));
        k80Var2.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setEmoji(int i7) {
        if (this.f != i7) {
            this.f = i7;
            mh0 mh0Var = new mh0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            q9 q9Var = this.b;
            q9Var.setImageDrawable(mh0Var);
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
        k80 k80Var = this.d;
        k80Var.setText(charSequence);
        k80Var.setMaxWidth(hi.m3.a(charSequence, k80Var.getPaint()));
        k80Var.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        k80 k80Var = this.c;
        k80Var.setTextColor(w02);
        int i10 = org.telegram.ui.ActionBar.n6.Xc;
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        if (k80Var.getVisibility() != 0) {
            i7 = org.telegram.ui.ActionBar.n6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        k80 k80Var2 = this.d;
        k80Var2.setTextColor(w03);
        k80Var2.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        int i11 = this.e;
        this.b.setLayoutParams(c8.ma.t(i11, i11, 17, 0, k80Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }
}
