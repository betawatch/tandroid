package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m11 extends TextView implements org.telegram.ui.ActionBar.z5 {
    public final /* synthetic */ ProfileActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m11(ProfileActivity profileActivity, Context context) {
        super(context);
        this.a = profileActivity;
        e();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.a.z0));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
