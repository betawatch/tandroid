package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p3 {
    public boolean a;
    public StaticLayout b;
    public StaticLayout c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(q1 q1Var) {
        TLRPC.Message message;
        String str;
        SpannableStringBuilder e = th.w5.e(new Object[0], 2131750875, false);
        jj messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User Z1 = vp.r1(q1Var.Y5).Z1(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                String str2 = Z1 == null ? "DELETED" : Z1.first_name;
                int Q0 = (int) ((org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.Q0() : q1Var.getParentWidth()) * 0.4f);
                String L0 = cd.L0(2131750517, null);
                TextPaint textPaint = org.telegram.ui.ActionBar.t6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(L0 + " "));
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) TextUtils.ellipsize(str2.replace('\n', ' '), org.telegram.ui.ActionBar.t6.Y2, Q0 - ceil, TextUtils.TruncateAt.END);
                String L02 = cd.L0(2131750513, null);
                int indexOf = L02.indexOf("%1$s");
                String format = String.format(L02, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), indexOf, str3.length() + indexOf, 33);
                    str = spannableStringBuilder;
                } else {
                    str = format;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.Z2;
                int L = org.telegram.messenger.i0.L(10.0f) + ((int) (textPaint2.measureText(e, 0, e.length()) + 1.0f));
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.b = new StaticLayout(e, textPaint2, L, alignment, 1.0f, 0.0f, false);
                this.c = new StaticLayout(str, textPaint2, org.telegram.messenger.i0.L(10.0f) + ((int) (textPaint2.measureText((CharSequence) str, 0, str.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = org.telegram.messenger.i0.L(4.0f);
                this.i = org.telegram.messenger.i0.L(12.0f);
                this.e = (int) sc.e.d(this.h, 2.0f, org.telegram.messenger.i0.L(4.0f) + this.c.getHeight() + org.telegram.messenger.i0.L(2.0f) + this.b.getHeight() + org.telegram.messenger.i0.L(4.0f), this.e);
                this.d = q1Var.getExtraTextX() + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(12.0f) + Math.max(this.b.getWidth(), this.c.getWidth());
                return;
            }
        }
        this.h = org.telegram.messenger.i0.L(4.0f);
        this.i = org.telegram.messenger.i0.L(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
