package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e01 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final l9 b;
    public final w70 c;
    public final w70 d;
    public int e;
    public int f;

    public e01(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.a = f6Var;
        setOrientation(1);
        l9 l9Var = new l9(context);
        this.b = l9Var;
        l9Var.getImageReceiver().X(1);
        l9Var.getImageReceiver().W(1);
        l9Var.setOnClickListener(new la0(this, 18));
        addView(l9Var, c8.ha.t(90, 90, 17, 0, 9, 0, 9));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setEmoji(int i7) {
        if (this.f != i7) {
            this.f = i7;
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            l9 l9Var = this.b;
            l9Var.setImageDrawable(zg0Var);
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
        w70 w70Var = this.d;
        w70Var.setText(charSequence);
        w70Var.setMaxWidth(fi.m3.a(charSequence, w70Var.getPaint()));
        w70Var.requestLayout();
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        w70 w70Var = this.c;
        w70Var.setTextColor(w02);
        int i10 = org.telegram.ui.ActionBar.k6.Uc;
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        if (w70Var.getVisibility() != 0) {
            i7 = org.telegram.ui.ActionBar.k6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        w70 w70Var2 = this.d;
        w70Var2.setTextColor(w03);
        w70Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        int i11 = this.e;
        this.b.setLayoutParams(c8.ha.t(i11, i11, 17, 0, w70Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }
}
