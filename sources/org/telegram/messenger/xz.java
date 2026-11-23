package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class xz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d00 b;

    public /* synthetic */ xz(d00 d00Var, int i7) {
        this.a = i7;
        this.b = d00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        d00 d00Var = this.b;
        switch (i7) {
            case 0:
                ks f10 = ks.f(d00Var.currentAccount);
                int i10 = mp.I8;
                f10.k(2, 512);
                break;
            default:
                d00Var.a.b();
                d00Var.b.b();
                d00Var.d.clear();
                SharedPreferences.Editor edit = d00Var.getUserConfig().k().edit();
                for (String str : d00Var.getUserConfig().k().getAll().keySet()) {
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
