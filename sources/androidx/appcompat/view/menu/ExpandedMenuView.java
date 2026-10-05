package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.j;
import l.k;
import l.m;
import l.z;
import la.h;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements j, z, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public k a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // l.j
    public final boolean a(m mVar) {
        return this.a.q(mVar, null, 0);
    }

    @Override // l.z
    public final void b(k kVar) {
        this.a = kVar;
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
        a((m) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        h Q = h.Q(context, attributeSet, b, i10);
        TypedArray typedArray = (TypedArray) Q.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(Q.A(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(Q.A(1));
        }
        Q.R();
    }
}
