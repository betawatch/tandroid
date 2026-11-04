package org.telegram.ui;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class du0 implements Consumer {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ du0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        ProfileActivity profileActivity = this.a;
        HashSet hashSet = profileActivity.i5;
        ArrayList arrayList = new ArrayList((HashSet) obj);
        int i3 = 0;
        while (i3 < arrayList.size()) {
            if (profileActivity.getMessagesController().q7.f(profileActivity.f1, ((Integer) arrayList.get(i3)).intValue()) == null) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        hashSet.clear();
        hashSet.addAll(arrayList);
        profileActivity.F5(true);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
