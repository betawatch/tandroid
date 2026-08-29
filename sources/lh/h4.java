package lh;

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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.k20;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public k5 e;
    public final /* synthetic */ i4 f;

    public h4(i4 i4Var) {
        this.f = i4Var;
        ImageReceiver imageReceiver = new ImageReceiver(i4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        i4 i4Var = this.f;
        ArrayList arrayList = i4Var.A;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.e = (k5) arrayList.get(i10);
        boolean z10 = i4Var.v;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
        }
        k5 k5Var = this.e;
        TL_stories.StoryItem storyItem = k5Var.a;
        if (storyItem != null) {
            l7.x(imageReceiver, storyItem);
        } else {
            r6 r6Var = k5Var.b;
            k20[] k20VarArr = l7.a;
            if (r6Var.c.K) {
                imageReceiver.setImage(ImageLocation.getForPath(r6Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath(r6Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        i4 i4Var = this.f;
        if (storyItem != null) {
            i4.a(i4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i10 = (int) (i4Var.F + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c3 = bw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c3;
        if (c3.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            i4.a(i4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = bw0.c(spannableStringBuilder2, textPaint, (int) (i4Var.F + 1.0f), alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
