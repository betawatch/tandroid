// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e13 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new e13());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ghb ghbVar = (ghb) view;
        ghbVar.c(c4cVar.m, c4cVar.o, !c4cVar.j);
        wla wlaVar = ghbVar.a;
        if (c4cVar.m instanceof SpannableStringBuilder) {
            wlaVar.setTextSize(1, 13.0f);
            wlaVar.setTranslationY(gl.L(2.0f));
            wlaVar.setTypeface(gl.n1("fonts/rmono.ttf"));
        }
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        ghb ghbVar = new ghb(wjbVar, context, true);
        zkb.h(bkb.c6, wjbVar, ghbVar);
        Drawable mutate = context.getDrawable(R.drawable.msg_copy).mutate();
        zkb.x(ghbVar, mutate, bkb.K6, wjbVar, PorterDuff.Mode.MULTIPLY);
        ghbVar.setImage(mutate);
        ghbVar.setImageClickListener(new kb1(this, context, ghbVar));
        return ghbVar;
    }
}
