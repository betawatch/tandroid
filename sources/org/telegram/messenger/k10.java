package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k10 {
    public final int a;
    public final LruCache b = new LruCache(100);
    public final HashMap c = new HashMap();

    public k10(int i3) {
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k7 a(String str, String str2, u10 u10Var) {
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername;
        if (TextUtils.isEmpty(str2)) {
            LruCache lruCache = this.b;
            j10 j10Var = (j10) lruCache.get(str);
            if (j10Var != null) {
                long j10 = j10Var.a;
                if (System.currentTimeMillis() - j10Var.b < 3600000) {
                    u10Var.a(Long.valueOf(j10));
                    a8.b("resolve username from cache " + str + " " + j10);
                    return null;
                }
                lruCache.remove(str);
            }
        }
        HashMap hashMap = this.c;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.add(u10Var);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(u10Var);
        hashMap.put(str, arrayList2);
        Typeface typeface = g0.a;
        try {
            Double.parseDouble(str);
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = str;
            tL_contacts_resolveUsername = tL_contacts_resolvePhone;
        } catch (NumberFormatException unused) {
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername2 = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername2.username = str;
            if (!TextUtils.isEmpty(str2)) {
                tL_contacts_resolveUsername2.flags |= 1;
                tL_contacts_resolveUsername2.referer = str2;
            }
            tL_contacts_resolveUsername = tL_contacts_resolveUsername2;
        }
        return new k7(this, str, ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_resolveUsername, new s4(10, this, str)), 23);
    }

    public final void b(TLRPC.User user, TLRPC.User user2) {
        String str;
        if (user == null || user2 == null || (str = user.username) == null || TextUtils.equals(str, user2.username)) {
            return;
        }
        String str2 = user.username;
        LruCache lruCache = this.b;
        lruCache.remove(str2);
        String str3 = user2.username;
        if (str3 != null) {
            lruCache.put(str3, new j10(user2.id));
        }
    }
}
