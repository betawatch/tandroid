package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c6 extends r1.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.e
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.b).Q1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((r1.f) this.b).a;
        }
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                ArrayList arrayList = animatedPhoneNumberEditText.Q1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    break;
                }
                break;
            default:
                ((r1.f) this.b).a = f10;
                break;
        }
    }
}
