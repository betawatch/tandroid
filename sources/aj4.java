// default package

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
