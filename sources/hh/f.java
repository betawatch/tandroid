package hh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.y5;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
