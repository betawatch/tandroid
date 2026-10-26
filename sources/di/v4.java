package di;

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
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.z20;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public a6 e;
    public final /* synthetic */ w4 f;

    public v4(w4 w4Var) {
        this.f = w4Var;
        ImageReceiver imageReceiver = new ImageReceiver(w4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        w4 w4Var = this.f;
        ArrayList arrayList = w4Var.E;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.e = (a6) arrayList.get(i10);
        boolean z10 = w4Var.v;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
        }
        a6 a6Var = this.e;
        TL_stories.StoryItem storyItem = a6Var.a;
        if (storyItem != null) {
            a8.x(imageReceiver, storyItem);
        } else {
            g7 g7Var = a6Var.b;
            z20[] z20VarArr = a8.a;
            if (g7Var.c.K) {
                imageReceiver.setImage(ImageLocation.getForPath(g7Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath(g7Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        w4 w4Var = this.f;
        if (storyItem != null) {
            w4.a(w4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i10 = (int) (w4Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = px0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            w4.a(w4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = px0.c(spannableStringBuilder2, textPaint, (int) (w4Var.J + 1.0f), alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
