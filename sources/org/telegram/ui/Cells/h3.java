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
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class h3 extends FrameLayout {
    public boolean a;
    public final f3 b;
    public final int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final org.telegram.ui.Components.c5 r;
    public int s;
    public final org.telegram.ui.Components.j6 v;
    public boolean w;

    public h3(Context context, String str, boolean z4, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.r = new org.telegram.ui.Components.c5(this);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.v = j6Var;
        j6Var.k(0.2f, 160L, mr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.b = 5;
        this.c = i10;
        f3 f3Var = new f3(this, context, f6Var, i10, f6Var, z10);
        this.b = f3Var;
        j6Var.setCallback(f3Var);
        f3Var.setTextSize(1, 17.0f);
        f3Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        f3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        f3Var.setBackground(null);
        if (z4) {
            f3Var.setMaxLines(5);
            f3Var.setSingleLine(false);
        } else {
            f3Var.setMaxLines(1);
            f3Var.setSingleLine(true);
        }
        f3Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp((i10 > 0 ? 42 : 0) + 21), AndroidUtilities.dp(15.0f));
        f3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        f3Var.setInputType((z4 ? 131072 : 0) | 573441);
        f3Var.setRawInputType((z4 ? 131072 : 0) | 573441);
        f3Var.setHint(str);
        f3Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        f3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        f3Var.setCursorWidth(1.5f);
        f3Var.addTextChangedListener(new g3(this, i10, z4));
        f3Var.setOnFocusChangeListener(new m.s2(this, 2));
        addView(f3Var, k7.b6.e(-1, -1, 48));
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

    public void setDivider(boolean z4) {
        this.w = z4;
        setWillNotDraw(!z4);
    }

    public void setShowLimitOnFocus(boolean z4) {
        this.f = z4;
    }

    public void setShowLimitWhenEmpty(boolean z4) {
        this.d = z4;
        if (z4) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        f3 f3Var = this.b;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.a = false;
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        f3 f3Var = this.b;
        f3Var.setText(formatTextWithEntities);
        f3Var.setSelection(f3Var.getText().length());
        this.a = false;
    }

    public void a(boolean z4) {
    }

    public void b(Editable editable) {
    }
}
