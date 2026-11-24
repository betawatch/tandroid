// default package

import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ny1 extends Property {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny1(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 1:
                return Float.valueOf(((rc2) obj).wd);
            case 2:
                return Float.valueOf(((vb8) obj).a);
            case 3:
                return Float.valueOf(((v29) obj).w);
            default:
                return Float.valueOf(((vob) obj).h);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                break;
            case 1:
                ((rc2) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                break;
            case 2:
                ((vb8) obj).b(((Float) obj2).floatValue());
                break;
            case 3:
                ((v29) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            default:
                vob vobVar = (vob) obj;
                vobVar.h = ((Float) obj2).floatValue();
                vobVar.invalidate();
                break;
        }
    }
}
