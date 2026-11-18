package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c4 extends ClickableSpan {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;

    public c4(boolean[] zArr, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, String str, String str2) {
        this.a = zArr;
        this.b = i7;
        this.c = context;
        this.d = i6Var;
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
        j0 j0Var = new j0(zArr, i7, this.c, this.d, 1);
        long j3 = this.e;
        String str = this.f;
        if (j3 != 0) {
            j0Var.a(Long.valueOf(j3), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i7).sendRequest(getuniquestargift, new bi.k1(8, j0Var, str));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
