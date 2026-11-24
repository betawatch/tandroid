// default package

import android.content.Context;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kr3 extends gf0 {
    public final jia s;
    public TLObject w;

    public kr3(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.c.setVisibility(8);
        jia jiaVar = this.e;
        int i = bkb.A6;
        zkb.W(jiaVar, i, wjbVar);
        jia jiaVar2 = new jia(context);
        this.s = jiaVar2;
        jiaVar2.setTextSize(16);
        zkb.W(jiaVar2, i, wjbVar);
        jiaVar2.setGravity(k96.a0 ? 3 : 5);
        addView(jiaVar2);
        boolean z = k96.a0;
        jiaVar2.setLayoutParams(nme.d(-1, -2.0f, (z ? 3 : 5) | 16, z ? 20.0f : 0.0f, 0.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    @Override // gf0
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
