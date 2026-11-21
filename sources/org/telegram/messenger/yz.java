package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class yz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ yz(e00 e00Var, int i7) {
        this.a = i7;
        this.b = e00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        e00 e00Var = this.b;
        switch (i7) {
            case 0:
                ks f10 = ks.f(e00Var.currentAccount);
                int i10 = mp.I8;
                f10.k(2, 512);
                break;
            default:
                e00Var.a.b();
                e00Var.b.b();
                e00Var.d.clear();
                SharedPreferences.Editor edit = e00Var.getUserConfig().k().edit();
                for (String str : e00Var.getUserConfig().k().getAll().keySet()) {
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
