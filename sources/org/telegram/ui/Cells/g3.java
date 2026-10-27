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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class g3 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public int b;
    public boolean c;
    public final e3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final org.telegram.ui.Components.j5 v;
    public int w;
    public final org.telegram.ui.Components.r6 x;
    public boolean y;

    public g3(Context context, String str, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = -1;
        this.v = new org.telegram.ui.Components.j5(this);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.x = r6Var;
        r6Var.n(0.2f, 160L, ds.h);
        r6Var.w(AndroidUtilities.dp(15.33f));
        r6Var.b = 5;
        this.e = i10;
        e3 e3Var = new e3(this, context, u6Var, i10, u6Var, z11);
        this.d = e3Var;
        r6Var.setCallback(e3Var);
        e3Var.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.f7.E(e3Var, org.telegram.ui.ActionBar.y6.H6, u6Var);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(e3Var, i11, u6Var);
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
        this.a = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        this.b = w02;
        e3Var.setCursorColor(w02);
        e3Var.setCursorSize(AndroidUtilities.dp(19.0f));
        e3Var.setCursorWidth(1.5f);
        e3Var.addTextChangedListener(new f3(this, i10, z10));
        e3Var.setOnFocusChangeListener(new m.r2(this, 2));
        addView(e3Var, kb1.i(-1, -1, 48));
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

    public final void d(Runnable runnable) {
        e3 e3Var = this.d;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new m.s2(runnable, 2));
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
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
        e3 e3Var = this.d;
        e3Var.setText(charSequence);
        e3Var.setSelection(e3Var.getText().length());
        this.c = false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        e3 e3Var = this.d;
        if (e3Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.a);
            if (w02 != this.b) {
                this.b = w02;
                e3Var.setCursorColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.c = true;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false);
        e3 e3Var = this.d;
        e3Var.setText(formatTextWithEntities);
        e3Var.setSelection(e3Var.getText().length());
        this.c = false;
    }

    public void a(boolean z10) {
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
