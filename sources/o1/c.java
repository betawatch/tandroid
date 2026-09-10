package o1;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c extends i {
    public final /* synthetic */ int a;

    @Override // o1.i
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

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((View) obj).setAlpha(f7);
                break;
            case 1:
                ((View) obj).setTranslationX(f7);
                break;
            case 2:
                ((View) obj).setTranslationY(f7);
                break;
            case 3:
                ((View) obj).setScaleX(f7);
                break;
            case 4:
                ((View) obj).setScaleY(f7);
                break;
            case 5:
                ((View) obj).setRotation(f7);
                break;
            case 6:
                ((View) obj).setRotationX(f7);
                break;
            default:
                ((View) obj).setRotationY(f7);
                break;
        }
    }
}
