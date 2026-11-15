package fi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.ou0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public j5 e;
    public final /* synthetic */ h4 f;

    public g4(h4 h4Var) {
        this.f = h4Var;
        ImageReceiver imageReceiver = new ImageReceiver(h4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        h4 h4Var = this.f;
        ArrayList arrayList = h4Var.F;
        if (i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.e = (j5) arrayList.get(i7);
        boolean z10 = h4Var.w;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.P();
        }
        j5 j5Var = this.e;
        TL_stories.StoryItem storyItem = j5Var.a;
        if (storyItem != null) {
            l7.x(imageReceiver, storyItem);
        } else {
            r6 r6Var = j5Var.b;
            i10[] i10VarArr = l7.a;
            if (r6Var.c.K) {
                imageReceiver.r0(gc.g(r6Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.r0(gc.g(r6Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        h4 h4Var = this.f;
        if (storyItem != null) {
            h4.a(h4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i7 = (int) (h4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = ou0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            h4.a(h4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = ou0.c(spannableStringBuilder2, textPaint, (int) (h4Var.K + 1.0f), alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
