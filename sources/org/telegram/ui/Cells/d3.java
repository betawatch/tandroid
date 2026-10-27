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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class d3 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean a;
    public final b3 b;
    public final org.telegram.ui.ActionBar.u6 c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final org.telegram.ui.Components.j5 s;
    public int v;
    public final org.telegram.ui.Components.r6 w;
    public boolean x;

    public d3(Context context, ww0 ww0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f = -1;
        this.r = true;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.w = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.b = 5;
        this.d = i10;
        b3 b3Var = new b3(this, context, ww0Var, u6Var, z10);
        this.b = b3Var;
        ju editText = b3Var.getEditText();
        editText.setDelegate(new m4.w1(this, editText, false, 10));
        b3Var.setWillNotDraw(false);
        this.s = new org.telegram.ui.Components.j5(b3Var);
        r6Var.setCallback(b3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.f7.E(editText, org.telegram.ui.ActionBar.y6.H6, u6Var);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editText, i11, u6Var);
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
        org.telegram.ui.ActionBar.f7.m(editText, 30, i11, u6Var);
        this.c = u6Var;
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new c3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(b3Var, kb1.i(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.t5.g();
    }

    public final void c() {
        int i10;
        b3 b3Var = this.b;
        if (b3Var == null || b3Var.getEditText() == null) {
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
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
        b3 b3Var = this.b;
        b3Var.setText(charSequence);
        b3Var.setSelection(b3Var.getText().length());
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        b3 b3Var = this.b;
        if (b3Var != null) {
            try {
                if (b3Var.getEditText() != null) {
                    b3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.c));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
