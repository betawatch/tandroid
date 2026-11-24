// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class dya extends FrameLayout {
    public final /* synthetic */ float a;
    public final /* synthetic */ eya b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dya(eya eyaVar, Context context, float f) {
        super(context);
        this.b = eyaVar;
        this.a = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m21.a(this.b.c, new s10(this, (byte) 18));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m21.h(this.b.c);
    }
}
