package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z4 extends ClickableSpan {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;

    public z4(boolean[] zArr, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, String str, String str2) {
        this.a = zArr;
        this.b = i10;
        this.c = context;
        this.d = u6Var;
        this.e = j10;
        this.f = str;
        this.h = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i10 = this.b;
        v0 v0Var = new v0(zArr, i10, this.c, this.d, 1);
        long j10 = this.e;
        String str = this.f;
        if (j10 != 0) {
            v0Var.run(Long.valueOf(j10), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i10).sendRequest(getuniquestargift, new j(5, v0Var, str));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
