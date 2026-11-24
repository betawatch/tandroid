// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kja extends FrameLayout {
    public final fja a;
    public final View b;

    public kja(Context context, wjb wjbVar) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, nme.o(-1, -1));
        zkb.h(bkb.g5, wjbVar, view);
        fja fjaVar = new fja(context, wjbVar);
        this.a = fjaVar;
        addView(fjaVar, nme.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        zkb.Z(this, getContext(), R.drawable.greydivider_top, bkb.a7);
    }

    public void setCallBack(eja ejaVar) {
        this.a.setCallback(ejaVar);
    }
}
