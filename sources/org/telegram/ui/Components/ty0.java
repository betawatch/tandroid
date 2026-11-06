package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ty0 {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public ty0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            typeface = (this.a & 2) != 0 ? org.telegram.messenger.g0.o1("fonts/mw_bolditalic.ttf") : org.telegram.messenger.g0.o1("fonts/mw_bold.ttf");
        } else {
            int i7 = this.a;
            if ((i7 & 4) == 0 && (i7 & 2048) == 0) {
                int i10 = i7 & 1;
                typeface = (i10 == 0 || (i7 & 2) == 0) ? i10 != 0 ? org.telegram.messenger.g0.o() : (i7 & 2) != 0 ? org.telegram.messenger.g0.o1("fonts/ritalic.ttf") : null : org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf");
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
        int i11 = this.a;
        if ((i11 & 8) == 0 && (i11 & TLObject.FLAG_13) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R9, false);
        }
        int i12 = this.a;
        if ((i12 & TLObject.FLAG_13) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false));
        } else if ((i12 & TLObject.FLAG_12) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        }
    }

    public final void b(ty0 ty0Var) {
        TLRPC.MessageEntity messageEntity;
        this.a |= ty0Var.a;
        if (this.d != null || (messageEntity = ty0Var.d) == null) {
            return;
        }
        this.d = messageEntity;
    }

    public ty0(ty0 ty0Var) {
        this.a = ty0Var.a;
        this.b = ty0Var.b;
        this.c = ty0Var.c;
        this.d = ty0Var.d;
        this.e = ty0Var.e;
    }
}
