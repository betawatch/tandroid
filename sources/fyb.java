// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class fyb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qyb b;

    public /* synthetic */ fyb(qyb qybVar, byte b) {
        this.a = b;
        this.b = qybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qyb qybVar = this.b;
        switch (b) {
            case 0:
                jn7 f = jn7.f(qybVar.currentAccount);
                int i = uc7.r5;
                f.k(2, 512);
                break;
            default:
                qybVar.a.b();
                qybVar.b.b();
                qybVar.d.clear();
                SharedPreferences.Editor edit = qybVar.getUserConfig().j().edit();
                for (String str : qybVar.getUserConfig().j().getAll().keySet()) {
                    if (str.startsWith("topics_load_offset_message_id_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_load_offset_date_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_load_offset_topic_id_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_end_reached_")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                break;
        }
    }
}
