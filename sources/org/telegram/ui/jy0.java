package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jy0 extends TextView implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ ProfileActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.a = profileActivity;
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.a.z0));
    }
}
