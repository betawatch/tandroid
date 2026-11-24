// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e9c extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new e9c());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        f9c f9cVar = (f9c) view;
        int i = c6cVar.k;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        boolean z2 = c6cVar.r;
        boolean z3 = c6cVar.s;
        int i2 = c6cVar.A;
        TextView textView = f9cVar.e;
        f9cVar.h = z2;
        f9cVar.n = z3;
        f9cVar.b.setImageResource(i);
        ImageView imageView = f9cVar.f;
        if (i2 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i2);
        } else {
            imageView.setVisibility(8);
        }
        f9cVar.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = gm.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        f9cVar.c.setPadding(0, L, 0, L);
        f9cVar.updateColors();
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new f9c(context, ylbVar);
    }
}
