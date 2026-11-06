package org.telegram.tgnet;

import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
