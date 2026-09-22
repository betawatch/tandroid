package hh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final jh.f a;

    public f(Context context) {
        super(context);
        jh.f fVar = new jh.f(context);
        this.a = fVar;
        addView(fVar, x5.g());
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
