// default package

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class h68 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ c88 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ h68(PhotoViewer photoViewer, View view, c88 c88Var, float f, float f2, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = c88Var;
        this.d = f;
        this.e = f2;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.d9;
        View view = this.b;
        c88 c88Var = this.c;
        view.setOutlineProvider(c88Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(c88Var);
        photoViewer.x3.setClipToOutline(true);
        j98 j98Var = photoViewer.F2;
        if (j98Var != null) {
            j98Var.setOutlineProvider(c88Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f = this.e;
        view.setTranslationY(f);
        j98 j98Var2 = photoViewer.F2;
        if (j98Var2 != null) {
            j98Var2.setTranslationY(f);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f0.invalidate();
        this.f.start();
    }
}
