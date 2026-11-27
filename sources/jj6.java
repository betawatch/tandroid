// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jj6 extends de0 {
    public final /* synthetic */ vnb H;
    public final /* synthetic */ lj6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj6(lj6 lj6Var, Context context, vnb vnbVar) {
        super(context);
        this.I = lj6Var;
        this.H = vnbVar;
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        lj6 lj6Var = this.I;
        q6b q6bVar = lj6Var.O;
        if (lj6Var.r == null) {
            super.onDraw(canvas);
            return;
        }
        float L = hl.L(1.0f);
        q6bVar.F.set(L, L, getMeasuredWidth() - r2, getMeasuredHeight() - r2);
        q6bVar.a = false;
        q6bVar.b = false;
        q6bVar.v = true;
        q6bVar.o = false;
        q6bVar.J = this.H;
        TL_stories.StoryItem storyItem = lj6Var.r;
        q6bVar.d = storyItem;
        t6b.h(storyItem.dialogId, canvas, this.a, q6bVar);
    }
}
