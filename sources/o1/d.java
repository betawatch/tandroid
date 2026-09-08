package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d extends i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((j) this.b).a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.b).w;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((j) this.b).a = f7;
                break;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                ArrayList arrayList = animatedPhoneNumberEditText.w;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f7 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    break;
                }
                break;
        }
    }
}
