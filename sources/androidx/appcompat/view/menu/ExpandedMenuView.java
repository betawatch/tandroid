package androidx.appcompat.view.menu;

import aa.a;
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

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        a y3 = a.y(context, attributeSet, b, i10);
        TypedArray typedArray = (TypedArray) y3.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(y3.r(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(y3.r(1));
        }
        y3.A();
    }
}
