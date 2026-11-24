// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class kwb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qwb b;

    public /* synthetic */ kwb(qwb qwbVar, byte b) {
        this.a = b;
        this.b = qwbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qwb qwbVar = this.b;
        switch (b) {
            case 0:
                nm7 f = nm7.f(qwbVar.currentAccount);
                int i = oc7.s5;
                f.k(2, 512);
                break;
            default:
                qwbVar.a.b();
                qwbVar.b.b();
                qwbVar.d.clear();
                SharedPreferences.Editor edit = qwbVar.getUserConfig().j().edit();
                for (String str : qwbVar.getUserConfig().j().getAll().keySet()) {
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
