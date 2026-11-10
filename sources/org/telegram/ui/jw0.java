package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jw0 extends View {
    public int a;
    public int b;
    public final /* synthetic */ mw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw0(mw0 mw0Var, Context context) {
        super(context);
        this.c = mw0Var;
        this.a = 0;
        this.b = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.b;
        ProfileActivity profileActivity = this.c.e;
        if (i11 != profileActivity.a.getMeasuredHeight()) {
            this.a = 0;
        }
        this.b = profileActivity.a.getMeasuredHeight();
        int childCount = profileActivity.a.getChildCount();
        if (childCount != profileActivity.d.e.M2) {
            setMeasuredDimension(profileActivity.a.getMeasuredWidth(), this.a);
            return;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = profileActivity.a.getChildAt(i13);
            profileActivity.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0 && R != profileActivity.B3) {
                i12 += profileActivity.a.getChildAt(i13).getMeasuredHeight();
            }
        }
        View view = profileActivity.fragmentView;
        int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m) - i12;
        if (measuredHeight > profileActivity.j4()) {
            measuredHeight = 0;
        }
        int i14 = measuredHeight > 0 ? measuredHeight : 0;
        int measuredWidth = profileActivity.a.getMeasuredWidth();
        this.a = i14;
        setMeasuredDimension(measuredWidth, i14);
    }
}
