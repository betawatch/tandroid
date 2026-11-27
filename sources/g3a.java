// default package

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class g3a {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public f4a e;
    public final /* synthetic */ h3a f;

    public g3a(h3a h3aVar) {
        this.f = h3aVar;
        ImageReceiver imageReceiver = new ImageReceiver(h3aVar);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.q0(hl.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(hl.L(13.0f));
    }

    public final void a(int i) {
        h3a h3aVar = this.f;
        ArrayList arrayList = h3aVar.F;
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        this.e = (f4a) arrayList.get(i);
        boolean z = h3aVar.w;
        ImageReceiver imageReceiver = this.a;
        if (z) {
            imageReceiver.I();
        }
        f4a f4aVar = this.e;
        TL_stories.StoryItem storyItem = f4aVar.a;
        if (storyItem != null) {
            t6b.x(imageReceiver, storyItem);
        } else {
            b6b b6bVar = f4aVar.b;
            o15[] o15VarArr = t6b.a;
            if (b6bVar.c.K) {
                imageReceiver.Z(jn5.g(b6bVar.f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.Z(jn5.g(b6bVar.e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        if (storyItem != null) {
            h3a.a(spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        h3a h3aVar = this.f;
        int i = (int) (h3aVar.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c = o0b.c(spannableStringBuilder, textPaint, i, alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        this.c = c;
        if (c.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            h3a.a(spannableStringBuilder2, this.e.a.views, true);
            this.c = o0b.c(spannableStringBuilder2, textPaint, (int) (h3aVar.K + 1.0f), alignment, 0.0f, null, ConnectionsManager.DEFAULT_DATACENTER_ID, 2, true);
        }
    }
}
