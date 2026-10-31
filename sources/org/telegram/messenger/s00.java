package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x00 b;

    public /* synthetic */ s00(x00 x00Var, int i10) {
        this.a = i10;
        this.b = x00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        x00 x00Var = this.b;
        switch (i10) {
            case 0:
                zs f7 = zs.f(x00Var.currentAccount);
                int i11 = vp.D8;
                f7.k(2, 512);
                break;
            default:
                x00Var.a.b();
                x00Var.b.b();
                x00Var.d.clear();
                SharedPreferences.Editor edit = x00Var.getUserConfig().k().edit();
                for (String str : x00Var.getUserConfig().k().getAll().keySet()) {
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
