// default package

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bta extends ClickableSpan {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;

    public bta(boolean[] zArr, int i, Context context, vnb vnbVar, long j, String str, String str2) {
        this.a = zArr;
        this.b = i;
        this.c = context;
        this.d = vnbVar;
        this.e = j;
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
        int i = this.b;
        f fVar = new f(zArr, i, this.c, this.d, (byte) 9);
        long j = this.e;
        String str = this.f;
        if (j != 0) {
            fVar.a(Long.valueOf(j), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i).sendRequest(getuniquestargift, new isa(fVar, str, (byte) 1));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
