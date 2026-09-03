package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s01 {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public s01() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            typeface = (this.a & 2) != 0 ? AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf") : AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        } else {
            int i10 = this.a;
            if ((i10 & 4) == 0 && (i10 & 2048) == 0) {
                int i11 = i10 & 1;
                typeface = (i11 == 0 || (i10 & 2) == 0) ? i11 != 0 ? AndroidUtilities.bold() : (i10 & 2) != 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : null : AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
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
        if ((i12 & 8) == 0 && (i12 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.R9, false);
        }
        int i13 = this.a;
        if ((i13 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
        } else if ((i13 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        }
    }

    public final void b(s01 s01Var) {
        TLRPC.MessageEntity messageEntity;
        this.a |= s01Var.a;
        if (this.d != null || (messageEntity = s01Var.d) == null) {
            return;
        }
        this.d = messageEntity;
    }

    public s01(s01 s01Var) {
        this.a = s01Var.a;
        this.b = s01Var.b;
        this.c = s01Var.c;
        this.d = s01Var.d;
        this.e = s01Var.e;
    }
}
