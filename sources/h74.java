// default package

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h74 {
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
    public final void a(wb2 wb2Var) {
        TLRPC.Message message;
        String str;
        SpannableStringBuilder e = t6b.e(new Object[0], 2131750839, false);
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User X1 = uc7.s1(wb2Var.a6).X1(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                String str2 = X1 == null ? "DELETED" : X1.first_name;
                int P0 = (int) ((hl.O1() ? hl.P0() : wb2Var.getParentWidth()) * 0.4f);
                int ceil = (int) Math.ceil(aob.X2.measureText(ob6.M0(2131750469, null).concat(" ")));
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) TextUtils.ellipsize(str2.replace('\n', ' '), aob.Y2, P0 - ceil, TextUtils.TruncateAt.END);
                String M0 = ob6.M0(2131750465, null);
                int indexOf = M0.indexOf("%1$s");
                String format = String.format(M0, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new y7c(hl.o()), indexOf, str3.length() + indexOf, 33);
                    str = spannableStringBuilder;
                } else {
                    str = format;
                }
                TextPaint textPaint = aob.Z2;
                int L = hl.L(10.0f) + ((int) (textPaint.measureText(e, 0, e.length()) + 1.0f));
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.b = new StaticLayout(e, textPaint, L, alignment, 1.0f, 0.0f, false);
                this.c = new StaticLayout(str, textPaint, hl.L(10.0f) + ((int) (textPaint.measureText((CharSequence) str, 0, str.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = hl.L(4.0f);
                this.i = hl.L(12.0f);
                this.e = (int) bs2.i(this.h, 2.0f, hl.L(4.0f) + this.c.getHeight() + hl.L(2.0f) + this.b.getHeight() + hl.L(4.0f), this.e);
                this.d = wb2Var.getExtraTextX() + hl.L(20.0f) + hl.L(12.0f) + Math.max(this.b.getWidth(), this.c.getWidth());
                return;
            }
        }
        this.h = hl.L(4.0f);
        this.i = hl.L(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
