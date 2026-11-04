package ei;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.lu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public r5 e;
    public final /* synthetic */ p4 f;

    public o4(p4 p4Var) {
        this.f = p4Var;
        ImageReceiver imageReceiver = new ImageReceiver(p4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i3) {
        p4 p4Var = this.f;
        ArrayList arrayList = p4Var.F;
        if (i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        this.e = (r5) arrayList.get(i3);
        boolean z10 = p4Var.w;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.P();
        }
        r5 r5Var = this.e;
        TL_stories.StoryItem storyItem = r5Var.a;
        if (storyItem != null) {
            s7.x(imageReceiver, storyItem);
        } else {
            y6 y6Var = r5Var.b;
            b10[] b10VarArr = s7.a;
            if (y6Var.c.K) {
                imageReceiver.r0(ac.g(y6Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.r0(ac.g(y6Var.e), "320_180", null, null, null, 0L, null, null, 0);
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
        int i3 = (int) (p4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c2 = lu0.c(spannableStringBuilder, textPaint, i3, alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c2;
        if (c2.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            p4.a(p4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = lu0.c(spannableStringBuilder2, textPaint, (int) (p4Var.K + 1.0f), alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
