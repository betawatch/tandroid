// default package

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aj4 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ zj3 a;

    public /* synthetic */ aj4(zj3 zj3Var) {
        this.a = zj3Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        cc4.g(exc, true);
        this.a.a(Collections.EMPTY_LIST);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (vdc vdcVar : (List) obj) {
            if (vdcVar.c == 1) {
                arrayList.add(vdcVar);
            }
        }
        this.a.a(arrayList);
    }
}
