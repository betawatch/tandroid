package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k00 b;

    public /* synthetic */ f00(k00 k00Var, int i7) {
        this.a = i7;
        this.b = k00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k00 k00Var = this.b;
        switch (i7) {
            case 0:
                qs f10 = qs.f(k00Var.currentAccount);
                int i10 = qp.C8;
                f10.k(2, 512);
                break;
            default:
                k00Var.a.b();
                k00Var.b.b();
                k00Var.d.clear();
                SharedPreferences.Editor edit = k00Var.getUserConfig().k().edit();
                for (String str : k00Var.getUserConfig().k().getAll().keySet()) {
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
