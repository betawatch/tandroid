// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class eh6 extends be0 {
    public final /* synthetic */ wjb H;
    public final /* synthetic */ gh6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh6(gh6 gh6Var, Context context, wjb wjbVar) {
        super(context);
        this.I = gh6Var;
        this.H = wjbVar;
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        gh6 gh6Var = this.I;
        u2b u2bVar = gh6Var.O;
        if (gh6Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = gl.L(1.0f);
        u2bVar.F.set(L, L, getMeasuredWidth() - r2, getMeasuredHeight() - r2);
        u2bVar.a = false;
        u2bVar.b = false;
        u2bVar.v = true;
        u2bVar.o = false;
        u2bVar.J = this.H;
        TL_stories.StoryItem storyItem = gh6Var.r;
        u2bVar.d = storyItem;
        x2b.h(storyItem.dialogId, canvas, this.a, u2bVar);
    }
}
