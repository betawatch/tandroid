package org.telegram.ui.Components;

import android.util.Property;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class m6 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(String str, int i10) {
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

    public abstract void a(int i10, Object obj);

    public abstract void b(Object obj, float f10);

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b(obj, ((Float) obj2).floatValue());
                break;
            default:
                a(((Integer) obj2).intValue(), obj);
                break;
        }
    }
}
