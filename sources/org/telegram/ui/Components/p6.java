package org.telegram.ui.Components;

import android.util.Property;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class p6 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(String str, int i7) {
        super(Float.class, str);
        this.a = i7;
        switch (i7) {
            case 1:
                super(Integer.class, str);
                break;
            default:
                break;
        }
    }

    public void a(Object obj, Float f10) {
        c(obj, f10.floatValue());
    }

    public abstract void b(int i7, Object obj);

    public abstract void c(Object obj, float f10);

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
