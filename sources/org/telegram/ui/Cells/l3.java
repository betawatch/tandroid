package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class l3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public final org.telegram.ui.ActionBar.h6 a;
    public int b;
    public boolean c;
    public final j3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final org.telegram.ui.Components.g5 w;
    public int x;
    public final org.telegram.ui.Components.n6 y;

    public l3(Context context, String str, boolean z10, boolean z11, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = -1;
        this.w = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.y = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.b = 5;
        this.e = i7;
        j3 j3Var = new j3(this, context, h6Var, i7, h6Var, z11);
        this.d = j3Var;
        n6Var.setCallback(j3Var);
        j3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.t6.D(j3Var, org.telegram.ui.ActionBar.m6.H6, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(j3Var, i10, h6Var);
        j3Var.setBackground(null);
        if (z10) {
            j3Var.setMaxLines(5);
            j3Var.setSingleLine(false);
        } else {
            j3Var.setMaxLines(1);
            j3Var.setSingleLine(true);
        }
        j3Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L((i7 > 0 ? 42 : 0) + 21), org.telegram.messenger.g0.L(15.0f));
        j3Var.setGravity((gd.a0 ? 5 : 3) | 48);
        j3Var.setInputType((z10 ? 131072 : 0) | 573441);
        j3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        j3Var.setHint(str);
        this.a = h6Var;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        this.b = w02;
        j3Var.setCursorColor(w02);
        j3Var.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        j3Var.setCursorWidth(1.5f);
        j3Var.addTextChangedListener(new k3(this, i7, z10));
        j3Var.setOnFocusChangeListener(new hi.t6(this, 3));
        addView(j3Var, c8.ma.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i7;
        if (this.d == null) {
            return;
        }
        this.x = this.e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f) && ((!this.n || (this.s && !this.r)) && ((i7 = this.h) == -1 || this.x <= i7))) {
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
        tL_textWithEntities.entities = ri.d0(j10.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawLine(gd.a0 ? 0.0f : org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? org.telegram.messenger.g0.L(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
        }
    }

    public void setDivider(boolean z10) {
        this.E = z10;
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

    public void setShowLimitWhenNear(int i7) {
        this.h = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.c = true;
        j3 j3Var = this.d;
        j3Var.setText(charSequence);
        j3Var.setSelection(j3Var.getText().length());
        this.c = false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        j3 j3Var = this.d;
        if (j3Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.a);
            if (w02 != this.b) {
                this.b = w02;
                j3Var.setCursorColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.c = true;
        CharSequence h02 = fj.h0(tL_textWithEntities, false);
        j3 j3Var = this.d;
        j3Var.setText(h02);
        j3Var.setSelection(j3Var.getText().length());
        this.c = false;
    }

    public void a(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
