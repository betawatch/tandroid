package nh;

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
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.p20;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h4 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public l5 e;
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
        ArrayList arrayList = i4Var.B;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.e = (l5) arrayList.get(i10);
        boolean z4 = i4Var.v;
        ImageReceiver imageReceiver = this.a;
        if (z4) {
            imageReceiver.onAttachedToWindow();
        }
        l5 l5Var = this.e;
        TL_stories.StoryItem storyItem = l5Var.a;
        if (storyItem != null) {
            m7.x(imageReceiver, storyItem);
        } else {
            s6 s6Var = l5Var.b;
            p20[] p20VarArr = m7.a;
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
        i4 i4Var = this.f;
        if (storyItem != null) {
            i4.a(i4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        int i10 = (int) (i4Var.G + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c3 = kw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c3;
        if (c3.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            i4.a(i4Var, spannableStringBuilder2, this.e.a.views, true);
            this.c = kw0.c(spannableStringBuilder2, textPaint, (int) (i4Var.G + 1.0f), alignment, 0.0f, false, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
