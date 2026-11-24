// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lla extends FrameLayout {
    public final hla a;
    public final View b;

    public lla(Context context, ylb ylbVar) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, qoe.o(-1, -1));
        anb.h(cmb.g5, ylbVar, view);
        hla hlaVar = new hla(context, ylbVar);
        this.a = hlaVar;
        addView(hlaVar, qoe.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        anb.Z(this, getContext(), R.drawable.greydivider_top, cmb.a7);
    }

    public void setCallBack(gla glaVar) {
        this.a.setCallback(glaVar);
    }
}
