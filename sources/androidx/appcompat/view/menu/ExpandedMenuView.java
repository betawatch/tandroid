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
import l7.w0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        a((n) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 y10 = w0.y(context, attributeSet, b, i10);
        TypedArray typedArray = (TypedArray) y10.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(y10.s(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(y10.s(1));
        }
        y10.A();
    }
}
