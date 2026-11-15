package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
    public final e6 a;
    public final TextView b;

    public f(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        q6.h(j6.e7, this, e6Var);
        TextView textView = new TextView(getContext());
        this.b = textView;
        i5.c.v(textView, 1, 14.0f);
        q6.U(textView, j6.f7, e6Var);
        textView.setGravity((hd.a0 ? 5 : 3) | 16);
        addView(textView, ja.d(-1, -1.0f, (hd.a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(32.0f), TLObject.FLAG_30));
    }

    public void setLetter(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        q6.U(this.b, i7, this.a);
    }
}
