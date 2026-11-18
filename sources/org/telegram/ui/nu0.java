package org.telegram.ui;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu0 implements Consumer {
    public final /* synthetic */ ProfileActivity a;

    public /* synthetic */ nu0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        ProfileActivity profileActivity = this.a;
        HashSet hashSet = profileActivity.n5;
        ArrayList arrayList = new ArrayList((HashSet) obj);
        int i7 = 0;
        while (i7 < arrayList.size()) {
            if (profileActivity.getMessagesController().t7.f(profileActivity.f1, ((Integer) arrayList.get(i7)).intValue()) == null) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        hashSet.clear();
        hashSet.addAll(arrayList);
        profileActivity.J5(true);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
