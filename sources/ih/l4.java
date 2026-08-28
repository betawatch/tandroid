package ih;

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
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.z10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public n5 e;
    public final /* synthetic */ m4 f;

    public l4(m4 m4Var) {
        this.f = m4Var;
        ImageReceiver imageReceiver = new ImageReceiver(m4Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i9) {
        m4 m4Var = this.f;
        ArrayList arrayList = m4Var.A;
        if (i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        this.e = (n5) arrayList.get(i9);
        boolean z10 = m4Var.v;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
        }
        n5 n5Var = this.e;
        TL_stories.StoryItem storyItem = n5Var.a;
        if (storyItem != null) {
            p7.x(imageReceiver, storyItem);
        } else {
            u6 u6Var = n5Var.b;
            z10[] z10VarArr = p7.a;
            if (u6Var.c.K) {
                imageReceiver.setImage(ImageLocation.getForPath(u6Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath(u6Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        m4 m4Var = this.f;
        if (storyItem != null) {
            m4.a(m4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i9 = (int) (m4Var.F + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = rv0.c(spannableStringBuilder, textPaint, i9, alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            m4.a(m4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = rv0.c(spannableStringBuilder2, textPaint, (int) (m4Var.F + 1.0f), alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
