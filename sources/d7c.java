// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d7c extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new d7c());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        e7c e7cVar = (e7c) view;
        int i = c4cVar.k;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        boolean z2 = c4cVar.r;
        boolean z3 = c4cVar.s;
        int i2 = c4cVar.A;
        TextView textView = e7cVar.e;
        e7cVar.h = z2;
        e7cVar.n = z3;
        e7cVar.b.setImageResource(i);
        ImageView imageView = e7cVar.f;
        if (i2 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i2);
        } else {
            imageView.setVisibility(8);
        }
        e7cVar.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = gl.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        e7cVar.c.setPadding(0, L, 0, L);
        e7cVar.updateColors();
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new e7c(context, wjbVar);
    }
}
