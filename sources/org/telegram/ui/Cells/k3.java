package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class k3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public final org.telegram.ui.ActionBar.f6 a;
    public int b;
    public boolean c;
    public final i3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final org.telegram.ui.Components.z4 w;
    public int x;
    public final org.telegram.ui.Components.i6 y;

    public k3(Context context, String str, boolean z9, boolean z10, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = -1;
        this.w = new org.telegram.ui.Components.z4(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.y = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.b = 5;
        this.e = i7;
        i3 i3Var = new i3(this, context, f6Var, i7, f6Var, z10);
        this.d = i3Var;
        i6Var.setCallback(i3Var);
        i3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(i3Var, org.telegram.ui.ActionBar.k6.H6, f6Var);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(i3Var, i10, f6Var);
        i3Var.setBackground(null);
        if (z9) {
            i3Var.setMaxLines(5);
            i3Var.setSingleLine(false);
        } else {
            i3Var.setMaxLines(1);
            i3Var.setSingleLine(true);
        }
        i3Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L((i7 > 0 ? 42 : 0) + 21), org.telegram.messenger.g0.L(15.0f));
        i3Var.setGravity((hd.a0 ? 5 : 3) | 48);
        i3Var.setInputType((z9 ? 131072 : 0) | 573441);
        i3Var.setRawInputType((z9 ? 131072 : 0) | 573441);
        i3Var.setHint(str);
        this.a = f6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        this.b = w02;
        i3Var.setCursorColor(w02);
        i3Var.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        i3Var.setCursorWidth(1.5f);
        i3Var.addTextChangedListener(new j3(this, i7, z9));
        i3Var.setOnFocusChangeListener(new fi.v6(this, 3));
        addView(i3Var, c8.ha.e(-1, -1, 48));
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
        tL_textWithEntities.entities = ui.b0(p10.s0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.D) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    public void setDivider(boolean z9) {
        this.D = z9;
        setWillNotDraw(!z9);
    }

    public void setShowLimitOnFocus(boolean z9) {
        this.n = z9;
    }

    public void setShowLimitWhenEmpty(boolean z9) {
        this.f = z9;
        if (z9) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.h = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.c = true;
        i3 i3Var = this.d;
        i3Var.setText(charSequence);
        i3Var.setSelection(i3Var.getText().length());
        this.c = false;
    }

    @Override // org.telegram.ui.ActionBar.a6
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
        CharSequence h02 = ij.h0(tL_textWithEntities, false);
        i3 i3Var = this.d;
        i3Var.setText(h02);
        i3Var.setSelection(i3Var.getText().length());
        this.c = false;
    }

    public void a(boolean z9) {
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
