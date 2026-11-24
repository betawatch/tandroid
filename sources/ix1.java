// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ix1 extends j47 {
    public final /* synthetic */ yic E0;
    public final /* synthetic */ ChatActivityEnterView F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar, yic yicVar) {
        super(context, wjbVar);
        this.F0 = chatActivityEnterView;
        this.E0 = yicVar;
    }

    @Override // j47
    public final void m(long j) {
        this.F0.setEffectId(j);
        yic yicVar = this.E0;
        if (yicVar != null) {
            yicVar.invalidate();
        }
    }
}
