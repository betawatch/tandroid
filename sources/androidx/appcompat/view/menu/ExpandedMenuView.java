package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j9.a;
import l.a0;
import l.k;
import l.l;
import l.n;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, a0, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public l a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a G = a.G(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) G.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(G.y(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(G.y(1));
        }
        G.I();
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
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((n) getAdapter().getItem(i10));
    }
}
