package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class c00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;

    public /* synthetic */ c00(h00 h00Var, int i7) {
        this.a = i7;
        this.b = h00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        h00 h00Var = this.b;
        switch (i7) {
            case 0:
                ns f10 = ns.f(h00Var.currentAccount);
                int i10 = np.D8;
                f10.k(2, 512);
                break;
            default:
                h00Var.a.b();
                h00Var.b.b();
                h00Var.d.clear();
                SharedPreferences.Editor edit = h00Var.getUserConfig().k().edit();
                for (String str : h00Var.getUserConfig().k().getAll().keySet()) {
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
