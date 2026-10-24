package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class h3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public int b;
    public boolean c;
    public final f3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final org.telegram.ui.Components.i5 v;
    public int w;
    public final org.telegram.ui.Components.p6 x;
    public boolean y;

    public h3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = -1;
        this.v = new org.telegram.ui.Components.i5(this);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        this.x = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.b = 5;
        this.e = i10;
        f3 f3Var = new f3(this, context, g6Var, i10, g6Var, z11);
        this.d = f3Var;
        p6Var.setCallback(f3Var);
        f3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.F(f3Var, org.telegram.ui.ActionBar.k6.H6, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(f3Var, i11, g6Var);
        f3Var.setBackground(null);
        if (z10) {
            f3Var.setMaxLines(5);
            f3Var.setSingleLine(false);
        } else {
            f3Var.setMaxLines(1);
            f3Var.setSingleLine(true);
        }
        f3Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp((i10 > 0 ? 42 : 0) + 21), AndroidUtilities.dp(15.0f));
        f3Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        f3Var.setInputType((z10 ? 131072 : 0) | 573441);
        f3Var.setRawInputType((z10 ? 131072 : 0) | 573441);
        f3Var.setHint(str);
        this.a = g6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        this.b = w02;
        f3Var.setCursorColor(w02);
        f3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        f3Var.setCursorWidth(1.5f);
        f3Var.addTextChangedListener(new g3(this, i10, z10));
        f3Var.setOnFocusChangeListener(new m.s2(this, 2));
        addView(f3Var, w7.z5.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i10;
        if (this.d == null) {
            return;
        }
        this.w = this.e - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.f) && ((!this.n || (this.s && !this.r)) && ((i10 = this.h) == -1 || this.w <= i10))) {
            str = "" + this.w;
        }
        this.x.t(str, true, true);
    }

    public CharSequence getText() {
        return this.d.getText();
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
        if (this.y) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    public void setDivider(boolean z10) {
        this.y = z10;
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
        f3 f3Var = this.d;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.c = false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        f3 f3Var = this.d;
        if (f3Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.a);
            if (w02 != this.b) {
                this.b = w02;
                f3Var.setCursorColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.c = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        f3 f3Var = this.d;
        f3Var.setText(formatTextWithEntities);
        f3Var.setSelection(f3Var.getText().length());
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
