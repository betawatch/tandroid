package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.st;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d3 extends FrameLayout {
    public boolean a;
    public final b3 b;
    public final int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final org.telegram.ui.Components.f5 r;
    public int s;
    public final org.telegram.ui.Components.n6 v;
    public boolean w;

    public d3(Context context, hv0 hv0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = -1;
        this.n = true;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.v = n6Var;
        n6Var.k(0.2f, 160L, jr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.b = 5;
        this.c = i10;
        b3 b3Var = new b3(this, context, hv0Var, c6Var, z10);
        this.b = b3Var;
        st editText = b3Var.getEditText();
        editText.setDelegate(new oc.i(this, editText, false, 3));
        b3Var.setWillNotDraw(false);
        this.r = new org.telegram.ui.Components.f5(b3Var);
        n6Var.setCallback(b3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        editText.setBackground(null);
        if (z10) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), AndroidUtilities.dp(0.0f), editText.getPaddingBottom());
        editText.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editText.setInputType((z10 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        editText.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new c3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.s2(this, 1));
        addView(b3Var, i7.f6.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.p5.g();
    }

    public final void c() {
        int i10;
        b3 b3Var = this.b;
        if (b3Var == null || b3Var.getEditText() == null) {
            return;
        }
        this.s = this.c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f || this.h) && ((i10 = this.e) == -1 || this.s <= i10))) {
            str = "" + this.s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.w) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDivider(boolean z10) {
        this.w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        b3 b3Var = this.b;
        b3Var.setText(charSequence);
        b3Var.setSelection(b3Var.getText().length());
        this.a = false;
    }

    public void b() {
    }
}
