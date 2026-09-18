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
import lf.i;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
