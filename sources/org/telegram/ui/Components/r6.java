package org.telegram.ui.Components;

import android.util.Property;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class r6 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(String str, int i10) {
        super(Float.class, str);
        this.a = i10;
        switch (i10) {
            case 1:
                super(Integer.class, str);
                break;
            default:
                break;
        }
    }

    public void a(Object obj, Float f7) {
        c(obj, f7.floatValue());
    }

    public abstract void b(int i10, Object obj);

    public abstract void c(Object obj, float f7);

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c(obj, ((Float) obj2).floatValue());
                break;
            default:
                b(((Integer) obj2).intValue(), obj);
                break;
        }
    }
}
