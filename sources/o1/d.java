package o1;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends j {
    public final /* synthetic */ int a;

    @Override // o1.j
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getTranslationX();
            case 2:
                return ((View) obj).getTranslationY();
            case 3:
                return ((View) obj).getScaleX();
            case 4:
                return ((View) obj).getScaleY();
            case 5:
                return ((View) obj).getRotation();
            case 6:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // o1.j
    public final void b(Object obj, float f9) {
        switch (this.a) {
            case 0:
                ((View) obj).setAlpha(f9);
                break;
            case 1:
                ((View) obj).setTranslationX(f9);
                break;
            case 2:
                ((View) obj).setTranslationY(f9);
                break;
            case 3:
                ((View) obj).setScaleX(f9);
                break;
            case 4:
                ((View) obj).setScaleY(f9);
                break;
            case 5:
                ((View) obj).setRotation(f9);
                break;
            case 6:
                ((View) obj).setRotationX(f9);
                break;
            default:
                ((View) obj).setRotationY(f9);
                break;
        }
    }
}
