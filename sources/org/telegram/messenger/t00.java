package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class t00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;

    public /* synthetic */ t00(y00 y00Var, int i10) {
        this.a = i10;
        this.b = y00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        y00 y00Var = this.b;
        switch (i10) {
            case 0:
                at f7 = at.f(y00Var.currentAccount);
                int i11 = wp.D8;
                f7.k(2, 512);
                break;
            default:
                y00Var.a.b();
                y00Var.b.b();
                y00Var.d.clear();
                SharedPreferences.Editor edit = y00Var.getUserConfig().k().edit();
                for (String str : y00Var.getUserConfig().k().getAll().keySet()) {
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
