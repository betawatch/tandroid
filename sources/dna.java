// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dna extends FrameLayout {
    public final zma a;
    public final View b;

    public dna(Context context, vnb vnbVar) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, tre.o(-1, -1));
        yob.h(aob.h5, vnbVar, view);
        zma zmaVar = new zma(context, vnbVar);
        this.a = zmaVar;
        addView(zmaVar, tre.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        yob.Z(this, getContext(), R.drawable.greydivider_top, aob.b7);
    }

    public void setCallBack(yma ymaVar) {
        this.a.setCallback(ymaVar);
    }
}
