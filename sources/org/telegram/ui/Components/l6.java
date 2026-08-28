package org.telegram.ui.Components;

import android.util.Property;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class l6 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(String str, int i9) {
        super(Float.class, str);
        this.a = i9;
        switch (i9) {
            case 1:
                super(Integer.class, str);
                break;
            default:
                break;
        }
    }

    public abstract void a(int i9, Object obj);

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
