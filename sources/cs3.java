// default package

import android.content.Context;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cs3 extends if0 {
    public final ema s;
    public TLObject w;

    public cs3(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.c.setVisibility(8);
        ema emaVar = this.e;
        int i = aob.B6;
        yob.W(emaVar, i, vnbVar);
        ema emaVar2 = new ema(context);
        this.s = emaVar2;
        emaVar2.setTextSize(16);
        yob.W(emaVar2, i, vnbVar);
        emaVar2.setGravity(ob6.a0 ? 3 : 5);
        addView(emaVar2);
        boolean z = ob6.a0;
        emaVar2.setLayoutParams(tre.d(-1, -2.0f, (z ? 3 : 5) | 16, z ? 20.0f : 0.0f, 0.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    @Override // if0
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
