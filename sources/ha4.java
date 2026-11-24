// default package

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ha4 {
    public final pa4 a;
    public final int b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final a14 e = new a14((Object) this, (byte) 9);

    public ha4(int i, String str) {
        this.b = i;
        this.c = ia4.f(i);
        this.a = new pa4(new h64((byte) 11), str, this);
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        HashMap hashMap;
        gm.r(this.e);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        int i = 0;
        ia4.a(ia4.i.d(0, 0, elapsedRealtime, true));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ma4 ma4Var = (ma4) obj;
            TLRPC.InputPeer g = ia4.g(this.b, ma4Var.c, 0L, ma4Var.a, ma4Var.b);
            if (g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(ma4Var.c);
                sb.append(g instanceof TLRPC.TL_inputPeerChannelFromMessage ? "/" + ma4Var.a + ":" + ma4Var.b : "");
                String sb2 = sb.toString();
                if (!linkedHashMap2.containsKey(sb2)) {
                    linkedHashMap2.put(sb2, new ArrayList());
                }
                ((ArrayList) linkedHashMap2.get(sb2)).add(ma4Var);
                hashMap2.put(sb2, g);
            }
        }
        arrayList.clear();
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = (List) linkedHashMap2.get(str);
            ArrayList arrayList2 = new ArrayList();
            int i3 = i;
            while (i3 < list.size()) {
                int i4 = i3 + 100;
                arrayList2.add(list.subList(i3, Math.min(list.size(), i4)));
                i3 = i4;
            }
            int size2 = arrayList2.size();
            int i5 = i;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
                tL_messages_reportReadMetrics.peer = (TLRPC.InputPeer) hashMap2.get(str);
                tL_messages_reportReadMetrics.metrics = new ArrayList<>();
                for (ma4 ma4Var2 : (List) obj2) {
                    TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
                    int i6 = ma4Var2.e;
                    ja4 ja4Var = ma4Var2.j;
                    tL_inputMessageReadMetric.msg_id = i6;
                    Iterator it2 = it;
                    tL_inputMessageReadMetric.view_id = ma4Var2.d;
                    tL_inputMessageReadMetric.time_in_view_ms = ma4Var2.f;
                    tL_inputMessageReadMetric.active_time_in_view_ms = ma4Var2.g;
                    tL_inputMessageReadMetric.height_to_viewport_ratio_permille = ma4Var2.h;
                    tL_inputMessageReadMetric.seen_range_ratio_permille = ma4Var2.i;
                    tL_inputMessageReadMetric.flags = 24;
                    tL_inputMessageReadMetric.surface = ma4Var2.k;
                    tL_inputMessageReadMetric.event_time = ma4Var2.l;
                    if (ja4Var != null) {
                        String str2 = ja4Var.c;
                        int i7 = str2 != null ? 4 : 0;
                        Long l = ja4Var.a;
                        tL_inputMessageReadMetric.flags = 24 | i7 | (l != null ? 3 : 0);
                        long longValue = l != null ? l.longValue() : 0L;
                        linkedHashMap = linkedHashMap2;
                        hashMap = hashMap2;
                        tL_inputMessageReadMetric.recommendation_id = longValue;
                        tL_inputMessageReadMetric.recommendation_rank = ja4Var.b;
                        tL_inputMessageReadMetric.recommendation_role = str2;
                    } else {
                        linkedHashMap = linkedHashMap2;
                        hashMap = hashMap2;
                    }
                    tL_messages_reportReadMetrics.metrics.add(tL_inputMessageReadMetric);
                    linkedHashMap2 = linkedHashMap;
                    hashMap2 = hashMap;
                    it = it2;
                }
                ia4.h(this.c, this.b, tL_messages_reportReadMetrics, new nf2((byte) 0), elapsedRealtime + 3600);
                linkedHashMap2 = linkedHashMap2;
                hashMap2 = hashMap2;
                i = 0;
                it = it;
            }
        }
    }
}
