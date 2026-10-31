package org.telegram.messenger;

import j$.util.Base64;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public long c;
    public boolean d;
    public boolean e;
    public final ArrayList b = new ArrayList();
    public int f = -1;
    public long g = 0;

    public e(int i10) {
        this.a = i10;
    }

    public final void a() {
        this.g = 0L;
        if (this.d) {
            b();
        }
    }

    public final void b() {
        ArrayList arrayList = this.b;
        boolean z10 = this.e;
        int i10 = this.a;
        if (!z10) {
            this.e = true;
            try {
                String string = vp.r1(i10).f7.getString("ai_styles", null);
                if (string != null) {
                    SerializedData serializedData = new SerializedData(Base64.getDecoder().decode(string));
                    TL_aicompose.Tones TLdeserialize = TL_aicompose.Tones.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    if (TLdeserialize instanceof TL_aicompose.TL_tones) {
                        this.c = ((TL_aicompose.TL_tones) TLdeserialize).hash;
                        arrayList.clear();
                        arrayList.addAll(((TL_aicompose.TL_tones) TLdeserialize).tones);
                    }
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        if (this.f < 0 && System.currentTimeMillis() - this.g >= 1800000) {
            TL_aicompose.getTones gettones = new TL_aicompose.getTones();
            gettones.hash = this.c;
            this.f = ConnectionsManager.getInstance(i10).sendRequestTyped(gettones, new a3.b(1), new d(this, 0));
        }
    }

    public final void c() {
        zs.f(this.a).k(zs.Y3, this);
    }

    public final void d() {
        TL_aicompose.TL_tones tL_tones = new TL_aicompose.TL_tones();
        tL_tones.hash = this.c;
        tL_tones.tones.addAll(this.b);
        SerializedData serializedData = new SerializedData(tL_tones.getObjectSize());
        tL_tones.serializeToStream(serializedData);
        vp.r1(this.a).f7.edit().putString("ai_styles", Base64.getEncoder().encodeToString(serializedData.toByteArray())).apply();
    }
}
