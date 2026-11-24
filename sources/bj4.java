// default package

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bj4 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ sk3 a;

    public /* synthetic */ bj4(sk3 sk3Var) {
        this.a = sk3Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        fc4.g(exc, true);
        this.a.a(Collections.EMPTY_LIST);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (wbc wbcVar : (List) obj) {
            if (wbcVar.c == 1) {
                arrayList.add(wbcVar);
            }
        }
        this.a.a(arrayList);
    }
}
