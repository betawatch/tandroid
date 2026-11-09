package org.telegram.ui.Cells;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n3 {
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
        SpannableStringBuilder e10 = di.s7.e(new Object[0], 2131750874, false);
        ij messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User a22 = qp.s1(q1Var.Z5).a2(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                String str2 = a22 == null ? "DELETED" : a22.first_name;
                int Q0 = (int) ((org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() : q1Var.getParentWidth()) * 0.4f);
                String M0 = id.M0(2131750508, null);
                TextPaint textPaint = org.telegram.ui.ActionBar.l6.X2;
                int ceil = (int) Math.ceil(textPaint.measureText(M0 + " "));
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) TextUtils.ellipsize(str2.replace('\n', ' '), org.telegram.ui.ActionBar.l6.Y2, Q0 - ceil, TextUtils.TruncateAt.END);
                String M02 = id.M0(2131750504, null);
                int indexOf = M02.indexOf("%1$s");
                String format = String.format(M02, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), indexOf, str3.length() + indexOf, 33);
                    str = spannableStringBuilder;
                } else {
                    str = format;
                }
                TextPaint textPaint2 = org.telegram.ui.ActionBar.l6.Z2;
                int L = org.telegram.messenger.g0.L(10.0f) + ((int) (textPaint2.measureText(e10, 0, e10.length()) + 1.0f));
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.b = new StaticLayout(e10, textPaint2, L, alignment, 1.0f, 0.0f, false);
                this.c = new StaticLayout(str, textPaint2, org.telegram.messenger.g0.L(10.0f) + ((int) (textPaint2.measureText((CharSequence) str, 0, str.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = org.telegram.messenger.g0.L(4.0f);
                this.i = org.telegram.messenger.g0.L(12.0f);
                this.e = (int) rf.b.d(this.h, 2.0f, org.telegram.messenger.g0.L(4.0f) + this.c.getHeight() + org.telegram.messenger.g0.L(2.0f) + this.b.getHeight() + org.telegram.messenger.g0.L(4.0f), this.e);
                this.d = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f) + Math.max(this.b.getWidth(), this.c.getWidth());
                return;
            }
        }
        this.h = org.telegram.messenger.g0.L(4.0f);
        this.i = org.telegram.messenger.g0.L(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
