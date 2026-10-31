package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class m3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public final org.telegram.ui.ActionBar.p6 a;
    public int b;
    public boolean c;
    public final k3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final org.telegram.ui.Components.w4 w;
    public int x;
    public final org.telegram.ui.Components.e6 y;

    public m3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = -1;
        this.w = new org.telegram.ui.Components.w4(this);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.y = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.b = 5;
        this.e = i10;
        k3 k3Var = new k3(this, context, p6Var, i10, p6Var, z11);
        this.d = k3Var;
        e6Var.setCallback(k3Var);
        k3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.a7.E(k3Var, org.telegram.ui.ActionBar.t6.H6, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(k3Var, i11, p6Var);
        k3Var.setBackground(null);
        if (z10) {
            k3Var.setMaxLines(5);
            k3Var.setSingleLine(false);
        } else {
            k3Var.setMaxLines(1);
            k3Var.setSingleLine(true);
        }
        k3Var.setPadding(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L((i10 > 0 ? 42 : 0) + 21), org.telegram.messenger.i0.L(15.0f));
        k3Var.setGravity((cd.X ? 5 : 3) | 48);
        k3Var.setInputType((z10 ? 131072 : 0) | 573441);
        k3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        k3Var.setHint(str);
        this.a = p6Var;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        this.b = w02;
        k3Var.setCursorColor(w02);
        k3Var.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        k3Var.setCursorWidth(1.5f);
        k3Var.addTextChangedListener(new l3(this, i10, z10));
        k3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(k3Var, w7.b6.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.d == null) {
            return;
        }
        this.x = this.e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f) && ((!this.n || (this.s && !this.r)) && ((i10 = this.h) == -1 || this.x <= i10))) {
            str = "" + this.x;
        }
        this.y.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = ui.b0(d20.s0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.D) {
            canvas.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    public void setDivider(boolean z10) {
        this.D = z10;
        setWillNotDraw(!z10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.n = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.h = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.c = true;
        k3 k3Var = this.d;
        k3Var.setText(charSequence);
        k3Var.setSelection(k3Var.getText().length());
        this.c = false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        k3 k3Var = this.d;
        if (k3Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.a);
            if (w02 != this.b) {
                this.b = w02;
                k3Var.setCursorColor(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.c = true;
        Spannable h02 = jj.h0(tL_textWithEntities, false);
        k3 k3Var = this.d;
        k3Var.setText(h02);
        k3Var.setSelection(k3Var.getText().length());
        this.c = false;
    }

    public void a(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
