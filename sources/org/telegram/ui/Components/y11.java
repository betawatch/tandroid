package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y11 {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public y11() {
    }

    public final void a(TextPaint textPaint) {
        Typeface b10 = b();
        if (b10 != null) {
            textPaint.setTypeface(b10);
        }
        if ((this.a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i10 = this.a;
        if ((i10 & 8) == 0 && (i10 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.R9, false);
        }
        int i11 = this.a;
        if ((i11 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q7, false));
        } else if ((i11 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false));
        }
    }

    public final Typeface b() {
        if (this.e) {
            return (this.a & 2) != 0 ? AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf") : AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
        int i10 = this.a;
        if ((i10 & 4) != 0 || (i10 & 2048) != 0) {
            return Typeface.MONOSPACE;
        }
        if ((i10 & 1) != 0 && (i10 & 2) != 0) {
            return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
        }
        if ((i10 & 1) != 0) {
            return AndroidUtilities.bold();
        }
        if ((i10 & 2) != 0) {
            return AndroidUtilities.getTypeface("fonts/ritalic.ttf");
        }
        return null;
    }

    public final void c(y11 y11Var) {
        TLRPC.MessageEntity messageEntity;
        this.a |= y11Var.a;
        if (this.d != null || (messageEntity = y11Var.d) == null) {
            return;
        }
        this.d = messageEntity;
    }

    public y11(y11 y11Var) {
        this.a = y11Var.a;
        this.b = y11Var.b;
        this.c = y11Var.c;
        this.d = y11Var.d;
        this.e = y11Var.e;
    }
}
