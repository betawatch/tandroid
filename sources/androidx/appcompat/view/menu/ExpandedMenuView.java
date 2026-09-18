package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.a0;
import l.k;
import l.l;
import l.n;
import lf.i;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, a0, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public l a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // l.k
    public final boolean a(n nVar) {
        return this.a.q(nVar, null, 0);
    }

    @Override // l.a0
    public final void b(l lVar) {
        this.a = lVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        a((n) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        i Q = i.Q(context, attributeSet, b, i10);
        TypedArray typedArray = (TypedArray) Q.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(Q.F(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(Q.F(1));
        }
        Q.R();
    }
}
