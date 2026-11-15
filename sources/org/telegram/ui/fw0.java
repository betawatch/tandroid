package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fw0 extends View {
    public int a;
    public int b;
    public final /* synthetic */ iw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw0(iw0 iw0Var, Context context) {
        super(context);
        this.c = iw0Var;
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
        if (childCount != profileActivity.d.e.O2) {
            setMeasuredDimension(profileActivity.a.getMeasuredWidth(), this.a);
            return;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = profileActivity.a.getChildAt(i13);
            profileActivity.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0 && R != profileActivity.D3) {
                i12 += profileActivity.a.getChildAt(i13).getMeasuredHeight();
            }
        }
        View view = profileActivity.fragmentView;
        int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.m) - i12;
        if (measuredHeight > profileActivity.i4()) {
            measuredHeight = 0;
        }
        int i14 = measuredHeight > 0 ? measuredHeight : 0;
        int measuredWidth = profileActivity.a.getMeasuredWidth();
        this.a = i14;
        setMeasuredDimension(measuredWidth, i14);
    }
}
