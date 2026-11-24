// default package

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class a81 {
    public final long a;
    public HashMap b;
    public HashMap c;
    public HashMap d;

    public a81() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (j(pair.second)) {
            HashMap hashMap = this.b;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.b = hashMap;
            }
            hashMap.put(pair, obj);
        }
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i, Object obj, qac qacVar) {
        Pair pair = new Pair(Integer.valueOf(i), obj);
        HashMap hashMap = this.c;
        byte b = 10;
        if (hashMap != null && hashMap.get(pair) != null) {
            gm.c3(new tv0(this, pair, qacVar, b));
            return;
        }
        HashMap hashMap2 = this.b;
        Object obj2 = hashMap2 == null ? null : hashMap2.get(pair);
        if (obj2 != null && !i(pair)) {
            qacVar.a(obj2);
        } else {
            gm.c3(new tv0(this, pair, qacVar, b));
            e(i, obj, new e((Object) this, (Object) pair, obj, i, (byte) 4));
        }
    }

    public final void d(int i, Integer num) {
        if (this.d != null) {
            Pair pair = new Pair(Integer.valueOf(i), num);
            this.d.remove(pair);
            if (this instanceof ob7) {
                h(pair.hashCode(), 0L);
            }
        }
    }

    public void e(int i, Object obj, jac jacVar) {
        ((e) jacVar).a(0L, null);
    }

    public void f(int i, Object obj, long j, z71 z71Var) {
        TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
        tL_messages_searchCustomEmoji.emoticon = (String) obj;
        tL_messages_searchCustomEmoji.hash = j;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_searchCustomEmoji, new lb7(z71Var, (byte) 3));
    }

    public final boolean i(Pair pair) {
        HashMap hashMap = this.d;
        Long l = hashMap != null ? (Long) hashMap.get(pair) : null;
        if ((this instanceof ob7) && l == null) {
            int hashCode = pair.hashCode();
            l = Long.valueOf(((ob7) this).e.X3.getLong("effects_last_" + hashCode, 0L));
        }
        return l == null || System.currentTimeMillis() - l.longValue() >= this.a;
    }

    public boolean j(Object obj) {
        return true;
    }

    public a81(int i) {
        this.a = i;
    }

    public void h(int i, long j) {
    }

    public void g(int i, Object obj, Object obj2) {
    }
}
