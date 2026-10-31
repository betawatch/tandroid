package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yz0 {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public yz0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            typeface = (this.a & 2) != 0 ? org.telegram.messenger.i0.o1("fonts/mw_bolditalic.ttf") : org.telegram.messenger.i0.o1("fonts/mw_bold.ttf");
        } else {
            int i10 = this.a;
            if ((i10 & 4) == 0 && (i10 & 2048) == 0) {
                int i11 = i10 & 1;
                typeface = (i11 == 0 || (i10 & 2) == 0) ? i11 != 0 ? org.telegram.messenger.i0.o() : (i10 & 2) != 0 ? org.telegram.messenger.i0.o1("fonts/ritalic.ttf") : null : org.telegram.messenger.i0.o1("fonts/rmediumitalic.ttf");
            } else {
                typeface = Typeface.MONOSPACE;
            }
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        if ((this.a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i12 = this.a;
        if ((i12 & 8) == 0 && (i12 & TLObject.FLAG_13) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R9, false);
        }
        int i13 = this.a;
        if ((i13 & TLObject.FLAG_13) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q7, false));
        } else if ((i13 & TLObject.FLAG_12) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        }
    }

    public final void b(yz0 yz0Var) {
        TLRPC.MessageEntity messageEntity;
        this.a |= yz0Var.a;
        if (this.d != null || (messageEntity = yz0Var.d) == null) {
            return;
        }
        this.d = messageEntity;
    }

    public yz0(yz0 yz0Var) {
        this.a = yz0Var.a;
        this.b = yz0Var.b;
        this.c = yz0Var.c;
        this.d = yz0Var.d;
        this.e = yz0Var.e;
    }
}
