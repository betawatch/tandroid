package hh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final jh.f a;

    public f(Context context) {
        super(context);
        jh.f fVar = new jh.f(context);
        this.a = fVar;
        addView(fVar, y5.g());
    }

    public final void a(ah.c cVar, dh.e eVar) {
        jh.f fVar = this.a;
        fVar.b(cVar, eVar);
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
