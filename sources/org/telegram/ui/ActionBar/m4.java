package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m4 extends ActionBarLayout {
    public final /* synthetic */ org.telegram.tgnet.u z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(Activity activity, org.telegram.tgnet.u uVar) {
        super(activity, false);
        this.z1 = uVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.r4
    public final w2 getBottomSheet() {
        return ((w2[]) this.z1.b)[0];
    }
}
