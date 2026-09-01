package oh;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.q20;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class j4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public m5 e;
    public final /* synthetic */ k4 f;

    public j4(k4 k4Var) {
        this.f = k4Var;
        ImageReceiver imageReceiver = new ImageReceiver(k4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        k4 k4Var = this.f;
        ArrayList arrayList = k4Var.B;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.e = (m5) arrayList.get(i10);
        boolean z4 = k4Var.v;
        ImageReceiver imageReceiver = this.a;
        if (z4) {
            imageReceiver.onAttachedToWindow();
        }
        m5 m5Var = this.e;
        TL_stories.StoryItem storyItem = m5Var.a;
        if (storyItem != null) {
            m7.x(imageReceiver, storyItem);
        } else {
            s6 s6Var = m5Var.b;
            q20[] q20VarArr = m7.a;
            if (s6Var.c.K) {
                imageReceiver.setImage(ImageLocation.getForPath(s6Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath(s6Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        k4 k4Var = this.f;
        if (storyItem != null) {
            k4.a(k4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i10 = (int) (k4Var.G + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c3 = lw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c3;
        if (c3.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            k4.a(k4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = lw0.c(spannableStringBuilder2, textPaint, (int) (k4Var.G + 1.0f), alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
