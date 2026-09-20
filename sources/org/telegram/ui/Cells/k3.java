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
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class k3 extends FrameLayout {
    public boolean a;
    public final i3 b;
    public final int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final org.telegram.ui.Components.g5 r;
    public int s;
    public final org.telegram.ui.Components.n6 v;
    public boolean w;

    public k3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.r = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.v = n6Var;
        n6Var.k(0.2f, 160L, qr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.b = 5;
        this.c = i10;
        i3 i3Var = new i3(this, context, f6Var, i10, f6Var, z11);
        this.b = i3Var;
        n6Var.setCallback(i3Var);
        i3Var.setTextSize(1, 17.0f);
        i3Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        i3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        i3Var.setBackground(null);
        if (z10) {
            i3Var.setMaxLines(5);
            i3Var.setSingleLine(false);
        } else {
            i3Var.setMaxLines(1);
            i3Var.setSingleLine(true);
        }
        i3Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp((i10 > 0 ? 42 : 0) + 21), AndroidUtilities.dp(15.0f));
        i3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        i3Var.setInputType((z10 ? 131072 : 0) | 573441);
        i3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        i3Var.setHint(str);
        i3Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        i3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        i3Var.setCursorWidth(1.5f);
        i3Var.addTextChangedListener(new j3(this, i10, z10));
        i3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(i3Var, w7.y5.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.b == null) {
            return;
        }
        this.s = this.c - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f || (this.n && !this.h)) && ((i10 = this.e) == -1 || this.s <= i10))) {
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
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

    public void setShowLimitWhenNear(int i10) {
        this.e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        i3 i3Var = this.b;
        i3Var.setText(charSequence);
        i3Var.setSelection(i3Var.getText().length());
        this.a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        i3 i3Var = this.b;
        i3Var.setText(formatTextWithEntities);
        i3Var.setSelection(i3Var.getText().length());
        this.a = false;
    }

    public void a(boolean z10) {
    }

    public void b(Editable editable) {
    }
}
