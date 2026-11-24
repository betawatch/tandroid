// default package

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class a8d implements Continuation, z0c, ahf {
    public static final /* synthetic */ a8d a = new a8d();

    @Override // z0c
    public final Object apply(Object obj) {
        return ((wqe) obj).a();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new ok2(intent);
        }
        return null;
    }
}
