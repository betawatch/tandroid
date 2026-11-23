package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class zz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f00 b;

    public /* synthetic */ zz(f00 f00Var, int i7) {
        this.a = i7;
        this.b = f00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        f00 f00Var = this.b;
        switch (i7) {
            case 0:
                ls f10 = ls.f(f00Var.currentAccount);
                int i10 = np.I8;
                f10.k(2, 512);
                break;
            default:
                f00Var.a.b();
                f00Var.b.b();
                f00Var.d.clear();
                SharedPreferences.Editor edit = f00Var.getUserConfig().k().edit();
                for (String str : f00Var.getUserConfig().k().getAll().keySet()) {
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
