package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e01 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final k9 b;
    public final w70 c;
    public final w70 d;
    public int e;
    public int f;

    public e01(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.e = 90;
        this.a = h6Var;
        setOrientation(1);
        k9 k9Var = new k9(context);
        this.b = k9Var;
        k9Var.getImageReceiver().X(1);
        k9Var.getImageReceiver().W(1);
        k9Var.setOnClickListener(new la0(this, 18));
        addView(k9Var, c8.ha.t(90, 90, 17, 0, 9, 0, 9));
        w70 w70Var = new w70(context, null);
        this.c = w70Var;
        w70Var.setTextSize(1, 20.0f);
        w70Var.setGravity(17);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        w70Var.setTextAlignment(4);
        addView(w70Var, c8.ha.t(-1, -2, 17, 48, 0, 48, 10));
        w70 w70Var2 = new w70(context, null);
        this.d = w70Var2;
        w70Var2.setTextSize(1, 14.0f);
        w70Var2.setGravity(17);
        w70Var2.setTextAlignment(4);
        addView(w70Var2, c8.ha.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        w70 w70Var = this.c;
        w70Var.setText(charSequence);
        w70Var.setVisibility(0);
        w70 w70Var2 = this.d;
        w70Var2.setText(charSequence2);
        w70Var2.setMaxWidth(fi.m3.a(charSequence2, w70Var2.getPaint()));
        w70Var2.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setEmoji(int i7) {
        if (this.f != i7) {
            this.f = i7;
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            k9 k9Var = this.b;
            k9Var.setImageDrawable(zg0Var);
            k9Var.getImageReceiver().W(2);
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
            k9 k9Var = this.b;
            k9Var.b();
            this.f = i7;
            k9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.c.setVisibility(8);
        w70 w70Var = this.d;
        w70Var.setText(charSequence);
        w70Var.setMaxWidth(fi.m3.a(charSequence, w70Var.getPaint()));
        w70Var.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        w70 w70Var = this.c;
        w70Var.setTextColor(w02);
        int i10 = org.telegram.ui.ActionBar.m6.Uc;
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        if (w70Var.getVisibility() != 0) {
            i7 = org.telegram.ui.ActionBar.m6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        w70 w70Var2 = this.d;
        w70Var2.setTextColor(w03);
        w70Var2.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        int i11 = this.e;
        this.b.setLayoutParams(c8.ha.t(i11, i11, 17, 0, w70Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }
}
