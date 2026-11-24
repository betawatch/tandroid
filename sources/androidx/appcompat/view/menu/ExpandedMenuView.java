package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements xz6, v07, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public yz6 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        vk9 v = vk9.v(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) v.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(v.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(v.n(1));
        }
        v.y();
    }

    @Override // xz6
    public final boolean a(c07 c07Var) {
        return this.a.q(c07Var, null, 0);
    }

    @Override // v07
    public final void b(yz6 yz6Var) {
        this.a = yz6Var;
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
        a((c07) getAdapter().getItem(i));
    }
}
