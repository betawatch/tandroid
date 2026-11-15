package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a4 extends ClickableSpan {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;

    public a4(boolean[] zArr, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, String str2) {
        this.a = zArr;
        this.b = i7;
        this.c = context;
        this.d = e6Var;
        this.e = j3;
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
        int i7 = this.b;
        k0 k0Var = new k0(zArr, i7, this.c, this.d, 1);
        long j3 = this.e;
        String str = this.f;
        if (j3 != 0) {
            k0Var.a(Long.valueOf(j3), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i7).sendRequest(getuniquestargift, new bi.v2(7, k0Var, str));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
