// default package

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h68 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ d88 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ h68(PhotoViewer photoViewer, View view, d88 d88Var, float f, float f2, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = d88Var;
        this.d = f;
        this.e = f2;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.f9;
        View view = this.b;
        d88 d88Var = this.c;
        view.setOutlineProvider(d88Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(d88Var);
        photoViewer.x3.setClipToOutline(true);
        j98 j98Var = photoViewer.F2;
        if (j98Var != null) {
            j98Var.setOutlineProvider(d88Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f = this.e;
        view.setTranslationY(f);
        j98 j98Var2 = photoViewer.F2;
        if (j98Var2 != null) {
            j98Var2.setTranslationY(f);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f0.invalidate();
        this.f.start();
    }
}
