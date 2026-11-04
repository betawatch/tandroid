package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class k3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public final org.telegram.ui.ActionBar.e6 a;
    public int b;
    public boolean c;
    public final i3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final org.telegram.ui.Components.x4 w;
    public int x;
    public final org.telegram.ui.Components.g6 y;

    public k3(Context context, String str, boolean z10, boolean z11, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = -1;
        this.w = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.y = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.b = 5;
        this.e = i3;
        i3 i3Var = new i3(this, context, e6Var, i3, e6Var, z11);
        this.d = i3Var;
        g6Var.setCallback(i3Var);
        i3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(i3Var, org.telegram.ui.ActionBar.k6.H6, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(i3Var, i10, e6Var);
        i3Var.setBackground(null);
        if (z10) {
            i3Var.setMaxLines(5);
            i3Var.setSingleLine(false);
        } else {
            i3Var.setMaxLines(1);
            i3Var.setSingleLine(true);
        }
        i3Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L((i3 > 0 ? 42 : 0) + 21), org.telegram.messenger.g0.L(15.0f));
        i3Var.setGravity((bd.a0 ? 5 : 3) | 48);
        i3Var.setInputType((z10 ? 131072 : 0) | 573441);
        i3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        i3Var.setHint(str);
        this.a = e6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        this.b = w02;
        i3Var.setCursorColor(w02);
        i3Var.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        i3Var.setCursorWidth(1.5f);
        i3Var.addTextChangedListener(new j3(this, i3, z10));
        i3Var.setOnFocusChangeListener(new gi.w6(this, 3));
        addView(i3Var, mf.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i3;
        if (this.d == null) {
            return;
        }
        this.x = this.e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f) && ((!this.n || (this.s && !this.r)) && ((i3 = this.h) == -1 || this.x <= i3))) {
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
        tL_textWithEntities.entities = li.b0(h10.t0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            canvas.drawLine(bd.a0 ? 0.0f : org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? org.telegram.messenger.g0.L(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
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

    public void setShowLimitWhenNear(int i3) {
        this.h = i3;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.c = true;
        i3 i3Var = this.d;
        i3Var.setText(charSequence);
        i3Var.setSelection(i3Var.getText().length());
        this.c = false;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        i3 i3Var = this.d;
        if (i3Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.a);
            if (w02 != this.b) {
                this.b = w02;
                i3Var.setCursorColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.c = true;
        CharSequence h02 = zi.h0(tL_textWithEntities, false);
        i3 i3Var = this.d;
        i3Var.setText(h02);
        i3Var.setSelection(i3Var.getText().length());
        this.c = false;
    }

    public void a(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
