// default package

import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ax1 extends Property {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax1(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 1:
                return Float.valueOf(((gb2) obj).wd);
            case 2:
                return Float.valueOf(((u98) obj).a);
            case 3:
                return Float.valueOf(((t09) obj).w);
            default:
                return Float.valueOf(((umb) obj).h);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                break;
            case 1:
                ((gb2) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                break;
            case 2:
                ((u98) obj).b(((Float) obj2).floatValue());
                break;
            case 3:
                ((t09) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            default:
                umb umbVar = (umb) obj;
                umbVar.h = ((Float) obj2).floatValue();
                umbVar.invalidate();
                break;
        }
    }
}
