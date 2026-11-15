package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class d9 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ org.telegram.ui.r3 a;

    public /* synthetic */ d9(org.telegram.ui.r3 r3Var) {
        this.a = r3Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        a8.g(exc, true);
        this.a.a(Collections.EMPTY_LIST);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (db.c cVar : (List) obj) {
            if (cVar.c == 1) {
                arrayList.add(cVar);
            }
        }
        this.a.a(arrayList);
    }
}
