package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class j3 extends FrameLayout {
    public boolean a;
    public final h3 b;
    public final int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final org.telegram.ui.Components.b5 r;
    public int s;
    public final org.telegram.ui.Components.i6 v;
    public boolean w;

    public j3(Context context, String str, boolean z10, boolean z11, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.e = -1;
        this.r = new org.telegram.ui.Components.b5(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.v = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.b = 5;
        this.c = i9;
        h3 h3Var = new h3(this, context, b6Var, i9, b6Var, z11);
        this.b = h3Var;
        i6Var.setCallback(h3Var);
        h3Var.setTextSize(1, 17.0f);
        h3Var.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.H6, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        h3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        h3Var.setBackground(null);
        if (z10) {
            h3Var.setMaxLines(5);
            h3Var.setSingleLine(false);
        } else {
            h3Var.setMaxLines(1);
            h3Var.setSingleLine(true);
        }
        h3Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp((i9 > 0 ? 42 : 0) + 21), AndroidUtilities.dp(15.0f));
        h3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        h3Var.setInputType((z10 ? 131072 : 0) | 573441);
        h3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        h3Var.setHint(str);
        h3Var.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        h3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        h3Var.setCursorWidth(1.5f);
        h3Var.addTextChangedListener(new i3(this, i9, z10));
        h3Var.setOnFocusChangeListener(new m.s2(this, 2));
        addView(h3Var, g7.e6.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i9;
        if (this.b == null) {
            return;
        }
        this.s = this.c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f || (this.n && !this.h)) && ((i9 = this.e) == -1 || this.s <= i9))) {
            str = "" + this.s;
        }
        this.v.q(str, true, true);
    }

    public CharSequence getText() {
        return this.b.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.w) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    public void setDivider(boolean z10) {
        this.w = z10;
        setWillNotDraw(!z10);
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

    public void setShowLimitWhenNear(int i9) {
        this.e = i9;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        h3 h3Var = this.b;
        h3Var.setText(charSequence);
        h3Var.setSelection(h3Var.getText().length());
        this.a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        h3 h3Var = this.b;
        h3Var.setText(formatTextWithEntities);
        h3Var.setSelection(h3Var.getText().length());
        this.a = false;
    }

    public void a(boolean z10) {
    }

    public void b(Editable editable) {
    }
}
