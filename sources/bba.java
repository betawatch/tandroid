// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bba extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public bba(Context context, hg9 hg9Var) {
        super(context);
        this.c = true;
        this.d = true;
        this.a = 12;
        int i = this.b;
        if (i == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i);
        }
    }

    private int getBackgroundResId() {
        boolean z = this.c;
        boolean z2 = this.d;
        return z ? z2 ? R.drawable.greydivider : R.drawable.greydivider_bottom : z2 ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(this.a), TLObject.FLAG_30));
    }

    public void setSize(int i) {
        this.a = i;
    }

    public bba(Context context, Object obj) {
        this(context, (hg9) null);
    }

    public bba(Context context) {
        this(context, (hg9) null);
    }

    public bba(Context context, int i, int i2) {
        super(context);
        this.c = true;
        this.d = true;
        this.b = i;
        this.a = 12;
        if (i == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i);
        }
    }
}
