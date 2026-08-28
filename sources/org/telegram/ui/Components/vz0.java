package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vz0 {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public vz0() {
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        if (this.e) {
            typeface = (this.a & 2) != 0 ? AndroidUtilities.getTypeface("fonts/mw_bolditalic.ttf") : AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        } else {
            int i9 = this.a;
            if ((i9 & 4) == 0 && (i9 & 2048) == 0) {
                int i10 = i9 & 1;
                typeface = (i10 == 0 || (i9 & 2) == 0) ? i10 != 0 ? AndroidUtilities.bold() : (i9 & 2) != 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : null : AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
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
        if ((i11 & 8) == 0 && (i11 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.R9, false);
        }
        int i12 = this.a;
        if ((i12 & 8192) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        } else if ((i12 & 4096) != 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false));
        }
    }

    public final void b(vz0 vz0Var) {
        TLRPC.MessageEntity messageEntity;
        this.a |= vz0Var.a;
        if (this.d != null || (messageEntity = vz0Var.d) == null) {
            return;
        }
        this.d = messageEntity;
    }

    public vz0(vz0 vz0Var) {
        this.a = vz0Var.a;
        this.b = vz0Var.b;
        this.c = vz0Var.c;
        this.d = vz0Var.d;
        this.e = vz0Var.e;
    }
}
