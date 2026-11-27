// default package

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class da4 {
    public final la4 a;
    public final int b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final lw3 e = new lw3((Object) this, (byte) 15);

    public da4(int i, String str) {
        this.b = i;
        this.c = ea4.i(i);
        this.a = new la4(new su3((byte) 21), str, this);
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        HashMap hashMap;
        hl.r(this.e);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        int i = 0;
        ea4.a(ea4.j.i(0, 0, elapsedRealtime, true));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ia4 ia4Var = (ia4) obj;
            TLRPC.InputPeer j = ea4.j(this.b, ia4Var.c, 0L, ia4Var.a, ia4Var.b);
            if (j != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(ia4Var.c);
                sb.append(j instanceof TLRPC.TL_inputPeerChannelFromMessage ? "/" + ia4Var.a + ":" + ia4Var.b : "");
                String sb2 = sb.toString();
                if (!linkedHashMap2.containsKey(sb2)) {
                    linkedHashMap2.put(sb2, new ArrayList());
                }
                ((ArrayList) linkedHashMap2.get(sb2)).add(ia4Var);
                hashMap2.put(sb2, j);
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
                for (ia4 ia4Var2 : (List) obj2) {
                    TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
                    int i6 = ia4Var2.e;
                    fa4 fa4Var = ia4Var2.j;
                    tL_inputMessageReadMetric.msg_id = i6;
                    Iterator it2 = it;
                    tL_inputMessageReadMetric.view_id = ia4Var2.d;
                    tL_inputMessageReadMetric.time_in_view_ms = ia4Var2.f;
                    tL_inputMessageReadMetric.active_time_in_view_ms = ia4Var2.g;
                    tL_inputMessageReadMetric.height_to_viewport_ratio_permille = ia4Var2.h;
                    tL_inputMessageReadMetric.seen_range_ratio_permille = ia4Var2.i;
                    tL_inputMessageReadMetric.flags = 24;
                    tL_inputMessageReadMetric.surface = ia4Var2.k;
                    tL_inputMessageReadMetric.event_time = ia4Var2.l;
                    if (fa4Var != null) {
                        String str2 = fa4Var.c;
                        int i7 = str2 != null ? 4 : 0;
                        Long l = fa4Var.a;
                        tL_inputMessageReadMetric.flags = 24 | i7 | (l != null ? 3 : 0);
                        long longValue = l != null ? l.longValue() : 0L;
                        linkedHashMap = linkedHashMap2;
                        hashMap = hashMap2;
                        tL_inputMessageReadMetric.recommendation_id = longValue;
                        tL_inputMessageReadMetric.recommendation_rank = fa4Var.b;
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
                ea4.k(this.c, this.b, tL_messages_reportReadMetrics, new xe2((byte) 0), elapsedRealtime + 3600);
                linkedHashMap2 = linkedHashMap2;
                hashMap2 = hashMap2;
                i = 0;
                it = it;
            }
        }
    }
}
