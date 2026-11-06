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
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ys;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class h3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public boolean a;
    public final f3 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final org.telegram.ui.Components.z4 w;
    public int x;
    public final org.telegram.ui.Components.i6 y;

    public h3(Context context, rt0 rt0Var, String str, boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = -1;
        this.r = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.y = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.b = 5;
        this.d = i7;
        f3 f3Var = new f3(this, context, rt0Var, f6Var, z9);
        this.b = f3Var;
        ys editText = f3Var.getEditText();
        editText.setDelegate(new m4.d0(this, editText, false));
        f3Var.setWillNotDraw(false);
        this.w = new org.telegram.ui.Components.z4(f3Var);
        i6Var.setCallback(f3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.H6, f6Var);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editText, i10, f6Var);
        editText.setBackground(null);
        if (z9) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((hd.a0 ? 5 : 3) | 48);
        editText.setInputType((z9 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.r6.m(editText, 30, i10, f6Var);
        this.c = f6Var;
        editText.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new g3(this, i7, editText, z9));
        editText.setOnFocusChangeListener(new fi.v6(this, 2));
        addView(f3Var, c8.ha.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.i5.f();
    }

    public final void c() {
        int i7;
        f3 f3Var = this.b;
        if (f3Var == null || f3Var.getEditText() == null) {
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
        if (this.D) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setDivider(boolean z9) {
        this.D = z9;
        setWillNotDraw(!z9);
    }

    public void setEmojiViewCacheType(int i7) {
        this.b.setEmojiViewCacheType(i7);
    }

    public void setShowLimitOnFocus(boolean z9) {
        this.h = z9;
    }

    public void setShowLimitWhenEmpty(boolean z9) {
        this.e = z9;
        if (z9) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.f = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        f3 f3Var = this.b;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.a = false;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        f3 f3Var = this.b;
        if (f3Var != null) {
            try {
                if (f3Var.getEditText() != null) {
                    f3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.c));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
