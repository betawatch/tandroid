package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final kh.f a;

    public f(Context context) {
        super(context);
        kh.f fVar = new kh.f(context);
        this.a = fVar;
        addView(fVar, x5.g());
    }

    public final void a(bh.b bVar, eh.e eVar) {
        kh.f fVar = this.a;
        fVar.b(bVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.a);
    }
}
