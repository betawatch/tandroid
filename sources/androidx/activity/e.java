package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.i0;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements w4.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // w4.d
    public final Bundle c() {
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                Bundle bundle = new Bundle();
                h hVar = lVar.x;
                hVar.getClass();
                HashMap hashMap = hVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.g.clone());
                return bundle;
            case 1:
                androidx.fragment.app.u uVar = (androidx.fragment.app.u) this.b;
                while (androidx.fragment.app.u.t(uVar.s())) {
                }
                uVar.K.e(androidx.lifecycle.m.ON_STOP);
                return new Bundle();
            case 2:
                return ((i0) this.b).Y();
            default:
                return androidx.lifecycle.i0.a((androidx.lifecycle.i0) this.b);
        }
    }
}
