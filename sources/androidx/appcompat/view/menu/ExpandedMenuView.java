package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e27, c37, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public f27 a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ko9 v = ko9.v(context, attributeSet, b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) v.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(v.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(v.n(1));
        }
        v.y();
    }

    @Override // e27
    public final boolean a(j27 j27Var) {
        return this.a.q(j27Var, null, 0);
    }

    @Override // c37
    public final void b(f27 f27Var) {
        this.a = f27Var;
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
        a((j27) getAdapter().getItem(i));
    }
}
