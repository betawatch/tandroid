package di;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ou0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public s5 e;
    public final /* synthetic */ p4 f;

    public o4(p4 p4Var) {
        this.f = p4Var;
        ImageReceiver imageReceiver = new ImageReceiver(p4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.z1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        p4 p4Var = this.f;
        ArrayList arrayList = p4Var.E;
        if (i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.e = (s5) arrayList.get(i7);
        boolean z9 = p4Var.w;
        ImageReceiver imageReceiver = this.a;
        if (z9) {
            imageReceiver.P();
        }
        s5 s5Var = this.e;
        TL_stories.StoryItem storyItem = s5Var.a;
        if (storyItem != null) {
            s7.x(imageReceiver, storyItem);
        } else {
            y6 y6Var = s5Var.b;
            f10[] f10VarArr = s7.a;
            if (y6Var.c.K) {
                imageReceiver.r0(hc.g(y6Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.r0(hc.g(y6Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        p4 p4Var = this.f;
        if (storyItem != null) {
            p4.a(p4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i7 = (int) (p4Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = ou0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            p4.a(p4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = ou0.c(spannableStringBuilder2, textPaint, (int) (p4Var.J + 1.0f), alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
