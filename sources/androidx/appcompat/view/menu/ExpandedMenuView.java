package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j4.c;
import l.j;
import l.k;
import l.m;
import l.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j10) {
        a((m) getAdapter().getItem(i9));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c E = c.E(context, attributeSet, b, i9);
        TypedArray typedArray = (TypedArray) E.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(E.w(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(E.w(1));
        }
        E.G();
    }
}
