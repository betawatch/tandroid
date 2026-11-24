package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements x17, v27, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public y17 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        wm9 v = wm9.v(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) v.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(v.j(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(v.j(1));
        }
        v.y();
    }

    @Override // x17
    public final boolean a(c27 c27Var) {
        return this.a.q(c27Var, null, 0);
    }

    @Override // v27
    public final void b(y17 y17Var) {
        this.a = y17Var;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((c27) getAdapter().getItem(i));
    }
}
