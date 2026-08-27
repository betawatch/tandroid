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
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class g3 extends FrameLayout {
    public boolean a;
    public final e3 b;
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

    public g3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = -1;
        this.r = new org.telegram.ui.Components.b5(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.v = i6Var;
        i6Var.k(0.2f, 160L, er.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.b = 5;
        this.c = i10;
        e3 e3Var = new e3(this, context, c6Var, i10, c6Var, z11);
        this.b = e3Var;
        i6Var.setCallback(e3Var);
        e3Var.setTextSize(1, 17.0f);
        e3Var.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        e3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        e3Var.setBackground(null);
        if (z10) {
            e3Var.setMaxLines(5);
            e3Var.setSingleLine(false);
        } else {
            e3Var.setMaxLines(1);
            e3Var.setSingleLine(true);
        }
        e3Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp((i10 > 0 ? 42 : 0) + 21), AndroidUtilities.dp(15.0f));
        e3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        e3Var.setInputType((z10 ? 131072 : 0) | 573441);
        e3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        e3Var.setHint(str);
        e3Var.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        e3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        e3Var.setCursorWidth(1.5f);
        e3Var.addTextChangedListener(new f3(this, i10, z10));
        e3Var.setOnFocusChangeListener(new m.s2(this, 2));
        addView(e3Var, h7.z5.e(-1, -1, 48));
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
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
        e3 e3Var = this.b;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        e3 e3Var = this.b;
        e3Var.setText(formatTextWithEntities);
        e3Var.setSelection(e3Var.getText().length());
        this.a = false;
    }

    public void a(boolean z10) {
    }

    public void b(Editable editable) {
    }
}
