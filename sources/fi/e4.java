package fi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.wu0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class e4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public h5 e;
    public final /* synthetic */ f4 f;

    public e4(f4 f4Var) {
        this.f = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(f4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        f4 f4Var = this.f;
        ArrayList arrayList = f4Var.F;
        if (i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        this.e = (h5) arrayList.get(i7);
        boolean z10 = f4Var.w;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.P();
        }
        h5 h5Var = this.e;
        TL_stories.StoryItem storyItem = h5Var.a;
        if (storyItem != null) {
            i7.x(imageReceiver, storyItem);
        } else {
            o6 o6Var = h5Var.b;
            p10[] p10VarArr = i7.a;
            if (o6Var.c.K) {
                imageReceiver.r0(fc.g(o6Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.r0(fc.g(o6Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        f4 f4Var = this.f;
        if (storyItem != null) {
            f4.a(f4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i7 = (int) (f4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = wu0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            f4.a(f4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = wu0.c(spannableStringBuilder2, textPaint, (int) (f4Var.K + 1.0f), alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
