package org.telegram.ui.Components;

import android.util.Property;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class s6 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(String str, int i10) {
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

    public abstract void b(Object obj, float f7);

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
