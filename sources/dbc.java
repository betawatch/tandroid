// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dbc extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new dbc());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ebc ebcVar = (ebc) view;
        int i = b8cVar.k;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        boolean z2 = b8cVar.r;
        boolean z3 = b8cVar.s;
        int i2 = b8cVar.A;
        TextView textView = ebcVar.e;
        ebcVar.h = z2;
        ebcVar.n = z3;
        ebcVar.b.setImageResource(i);
        ImageView imageView = ebcVar.f;
        if (i2 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i2);
        } else {
            imageView.setVisibility(8);
        }
        ebcVar.d.setText(charSequence);
        textView.setText(charSequence2);
        textView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int L = hl.L(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        ebcVar.c.setPadding(0, L, 0, L);
        ebcVar.updateColors();
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ebc(context, vnbVar);
    }
}
