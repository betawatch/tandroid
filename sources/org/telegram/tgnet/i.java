package org.telegram.tgnet;

import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i7) {
        this.a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$doInBackground$0;
        int lambda$doInBackground$02;
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.a) {
            case 0:
                lambda$doInBackground$0 = ConnectionsManager.GoogleDnsLoadTask.lambda$doInBackground$0(str, str2);
                return lambda$doInBackground$0;
            default:
                lambda$doInBackground$02 = ConnectionsManager.MozillaDnsLoadTask.lambda$doInBackground$0(str, str2);
                return lambda$doInBackground$02;
        }
    }
}
