package ai;

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
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.p20;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class l6 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public r7 e;
    public final /* synthetic */ m6 f;

    public l6(m6 m6Var) {
        this.f = m6Var;
        ImageReceiver imageReceiver = new ImageReceiver(m6Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        m6 m6Var = this.f;
        ArrayList arrayList = m6Var.E;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.e = (r7) arrayList.get(i10);
        boolean z10 = m6Var.v;
        ImageReceiver imageReceiver = this.a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
        }
        r7 r7Var = this.e;
        TL_stories.StoryItem storyItem = r7Var.a;
        if (storyItem != null) {
            ia.x(imageReceiver, storyItem);
        } else {
            k9 k9Var = r7Var.b;
            p20[] p20VarArr = ia.a;
            if (k9Var.c.K) {
                imageReceiver.setImage(ImageLocation.getForPath(k9Var.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath(k9Var.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        m6 m6Var = this.f;
        if (storyItem != null) {
            m6.a(m6Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i10 = (int) (m6Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = jw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            m6.a(m6Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = jw0.c(spannableStringBuilder2, textPaint, (int) (m6Var.J + 1.0f), alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
