package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class e3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean a;
    public final c3 b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final org.telegram.ui.Components.i5 s;
    public int v;
    public final org.telegram.ui.Components.p6 w;
    public boolean x;

    public e3(Context context, ow0 ow0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = -1;
        this.r = true;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        this.w = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.b = 5;
        this.d = i10;
        c3 c3Var = new c3(this, context, ow0Var, g6Var, z10);
        this.b = c3Var;
        iu editText = c3Var.getEditText();
        editText.setDelegate(new n2.e(this, editText, false, 6));
        c3Var.setWillNotDraw(false);
        this.s = new org.telegram.ui.Components.i5(c3Var);
        p6Var.setCallback(c3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.F(editText, org.telegram.ui.ActionBar.k6.H6, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(editText, i11, g6Var);
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
        org.telegram.ui.ActionBar.r6.m(editText, 30, i11, g6Var);
        this.c = g6Var;
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new d3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.s2(this, 1));
        addView(c3Var, w7.z5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.r5.g();
    }

    public final void c() {
        int i10;
        c3 c3Var = this.b;
        if (c3Var == null || c3Var.getEditText() == null) {
            return;
        }
        this.v = this.d - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.e) && ((!this.h || this.n) && ((i10 = this.f) == -1 || this.v <= i10))) {
            str = "" + this.v;
        }
        this.w.t(str, true, true);
    }

    public CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.x) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDivider(boolean z10) {
        this.x = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.h = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.e = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        c3 c3Var = this.b;
        c3Var.setText(charSequence);
        c3Var.setSelection(c3Var.getText().length());
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        c3 c3Var = this.b;
        if (c3Var != null) {
            try {
                if (c3Var.getEditText() != null) {
                    c3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.c));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
