package gh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final ih.f a;

    public f(Context context) {
        super(context);
        ih.f fVar = new ih.f(context);
        this.a = fVar;
        addView(fVar, a6.g());
    }

    public final void a(zg.a aVar, ch.e eVar) {
        ih.f fVar = this.a;
        fVar.b(aVar, eVar);
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
