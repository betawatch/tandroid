package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c00 b;

    public /* synthetic */ xz(c00 c00Var, int i3) {
        this.a = i3;
        this.b = c00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        c00 c00Var = this.b;
        switch (i3) {
            case 0:
                hs f10 = hs.f(c00Var.currentAccount);
                int i10 = hp.C8;
                f10.k(2, 512);
                break;
            default:
                c00Var.a.b();
                c00Var.b.b();
                c00Var.d.clear();
                SharedPreferences.Editor edit = c00Var.getUserConfig().k().edit();
                for (String str : c00Var.getUserConfig().k().getAll().keySet()) {
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
