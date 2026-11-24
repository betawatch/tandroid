// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gj6 extends bf0 {
    public final /* synthetic */ ylb H;
    public final /* synthetic */ ij6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj6(ij6 ij6Var, Context context, ylb ylbVar) {
        super(context);
        this.I = ij6Var;
        this.H = ylbVar;
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        ij6 ij6Var = this.I;
        v4b v4bVar = ij6Var.O;
        if (ij6Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = gm.L(1.0f);
        v4bVar.F.set(L, L, getMeasuredWidth() - r2, getMeasuredHeight() - r2);
        v4bVar.a = false;
        v4bVar.b = false;
        v4bVar.v = true;
        v4bVar.o = false;
        v4bVar.J = this.H;
        TL_stories.StoryItem storyItem = ij6Var.r;
        v4bVar.d = storyItem;
        y4b.h(storyItem.dialogId, canvas, this.a, v4bVar);
    }
}
