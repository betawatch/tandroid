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
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.mu0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public r5 e;
    public final /* synthetic */ o4 f;

    public n4(o4 o4Var) {
        this.f = o4Var;
        ImageReceiver imageReceiver = new ImageReceiver(o4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.z1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        o4 o4Var = this.f;
        ArrayList arrayList = o4Var.E;
        if (i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.e = (r5) arrayList.get(i7);
        boolean z9 = o4Var.w;
        ImageReceiver imageReceiver = this.a;
        if (z9) {
            imageReceiver.P();
        }
        r5 r5Var = this.e;
        TL_stories.StoryItem storyItem = r5Var.a;
        if (storyItem != null) {
            r7.x(imageReceiver, storyItem);
        } else {
            x6 x6Var = r5Var.b;
            e10[] e10VarArr = r7.a;
            if (x6Var.c.K) {
                imageReceiver.r0(hc.g(x6Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.r0(hc.g(x6Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        o4 o4Var = this.f;
        if (storyItem != null) {
            o4.a(o4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i7 = (int) (o4Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = mu0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            o4.a(o4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = mu0.c(spannableStringBuilder2, textPaint, (int) (o4Var.J + 1.0f), alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
