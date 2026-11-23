package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class i3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public boolean a;
    public final g3 b;
    public final org.telegram.ui.ActionBar.h6 c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final org.telegram.ui.Components.g5 w;
    public int x;
    public final org.telegram.ui.Components.n6 y;

    public i3(Context context, du0 du0Var, String str, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f = -1;
        this.r = true;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.y = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.b = 5;
        this.d = i7;
        g3 g3Var = new g3(this, context, du0Var, h6Var, z10);
        this.b = g3Var;
        ot editText = g3Var.getEditText();
        editText.setDelegate(new k8.a(14, this, editText));
        g3Var.setWillNotDraw(false);
        this.w = new org.telegram.ui.Components.g5(g3Var);
        n6Var.setCallback(g3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.t6.D(editText, org.telegram.ui.ActionBar.m6.H6, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editText, i10, h6Var);
        editText.setBackground(null);
        if (z10) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((hd.a0 ? 5 : 3) | 48);
        editText.setInputType((z10 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.t6.l(editText, 30, i10, h6Var);
        this.c = h6Var;
        editText.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new h3(this, i7, editText, z10));
        editText.setOnFocusChangeListener(new hi.t6(this, 2));
        addView(g3Var, c8.ma.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.p5.f();
    }

    public final void c() {
        int i7;
        g3 g3Var = this.b;
        if (g3Var == null || g3Var.getEditText() == null) {
            return;
        }
        this.x = this.d - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.e) && ((!this.h || this.n) && ((i7 = this.f) == -1 || this.x <= i7))) {
            str = "" + this.x;
        }
        this.y.t(str, true, true);
    }

    public CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setDivider(boolean z10) {
        this.E = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i7) {
        this.b.setEmojiViewCacheType(i7);
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

    public void setShowLimitWhenNear(int i7) {
        this.f = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        g3 g3Var = this.b;
        g3Var.setText(charSequence);
        g3Var.setSelection(g3Var.getText().length());
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        g3 g3Var = this.b;
        if (g3Var != null) {
            try {
                if (g3Var.getEditText() != null) {
                    g3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.c));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
