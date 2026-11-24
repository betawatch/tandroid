// default package

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n64 {
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
    public final void a(gb2 gb2Var) {
        TLRPC.Message message;
        String str;
        SpannableStringBuilder e = x2b.e(new Object[0], 2131750862, false);
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User V1 = na7.q1(gb2Var.a6).V1(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                String str2 = V1 == null ? "DELETED" : V1.first_name;
                int P0 = (int) ((gl.O1() ? gl.P0() : gb2Var.getParentWidth()) * 0.4f);
                int ceil = (int) Math.ceil(bkb.W2.measureText(k96.M0(2131750492, null).concat(" ")));
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) TextUtils.ellipsize(str2.replace('\n', ' '), bkb.X2, P0 - ceil, TextUtils.TruncateAt.END);
                String M0 = k96.M0(2131750488, null);
                int indexOf = M0.indexOf("%1$s");
                String format = String.format(M0, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new z3c(gl.o()), indexOf, str3.length() + indexOf, 33);
                    str = spannableStringBuilder;
                } else {
                    str = format;
                }
                TextPaint textPaint = bkb.Y2;
                int L = gl.L(10.0f) + ((int) (textPaint.measureText(e, 0, e.length()) + 1.0f));
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.b = new StaticLayout(e, textPaint, L, alignment, 1.0f, 0.0f, false);
                this.c = new StaticLayout(str, textPaint, gl.L(10.0f) + ((int) (textPaint.measureText((CharSequence) str, 0, str.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = gl.L(4.0f);
                this.i = gl.L(12.0f);
                this.e = (int) ir2.i(this.h, 2.0f, gl.L(4.0f) + this.c.getHeight() + gl.L(2.0f) + this.b.getHeight() + gl.L(4.0f), this.e);
                this.d = gb2Var.getExtraTextX() + gl.L(20.0f) + gl.L(12.0f) + Math.max(this.b.getWidth(), this.c.getWidth());
                return;
            }
        }
        this.h = gl.L(4.0f);
        this.i = gl.L(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
