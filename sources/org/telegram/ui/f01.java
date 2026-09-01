package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f01 extends View {
    public int a;
    public int b;
    public final /* synthetic */ i01 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f01(i01 i01Var, Context context) {
        super(context);
        this.c = i01Var;
        this.a = 0;
        this.b = 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.b;
        ProfileActivity profileActivity = this.c.e;
        if (i12 != profileActivity.a.getMeasuredHeight()) {
            this.a = 0;
        }
        this.b = profileActivity.a.getMeasuredHeight();
        int childCount = profileActivity.a.getChildCount();
        if (childCount != profileActivity.d.e.K2) {
            setMeasuredDimension(profileActivity.a.getMeasuredWidth(), this.a);
            return;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = profileActivity.a.getChildAt(i14);
            profileActivity.a.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0 && R != profileActivity.z3) {
                i13 += profileActivity.a.getChildAt(i14).getMeasuredHeight();
            }
        }
        View view = profileActivity.fragmentView;
        int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i13;
        if (measuredHeight > profileActivity.T3()) {
            measuredHeight = 0;
        }
        int i15 = measuredHeight > 0 ? measuredHeight : 0;
        int measuredWidth = profileActivity.a.getMeasuredWidth();
        this.a = i15;
        setMeasuredDimension(measuredWidth, i15);
    }
}
