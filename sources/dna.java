// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
