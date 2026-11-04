package bh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final e6 a;
    public final TextView b;

    public e(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        r6.i(k6.e7, this, e6Var);
        TextView textView = new TextView(getContext());
        this.b = textView;
        p1.t(textView, 1, 14.0f);
        r6.V(textView, k6.f7, e6Var);
        textView.setGravity((bd.a0 ? 5 : 3) | 16);
        addView(textView, mf.d(-1, -1.0f, (bd.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i3) {
        r6.V(this.b, i3, this.a);
    }
}
