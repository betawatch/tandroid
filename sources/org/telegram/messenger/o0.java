package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class o0 implements k0 {
    public final String a;
    public final HashSet b;
    public HashSet c;

    public o0(String str, Set set) {
        this.a = str;
        this.b = set == null ? null : new HashSet(set);
    }

    @Override // org.telegram.messenger.k0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i7);
                if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    hashSet.add(((TLRPC.TL_jsonString) jSONValue2).value);
                }
            }
            if (!hashSet.equals(this.c)) {
                this.c = hashSet;
                editor.putStringSet(this.a, new HashSet(this.c));
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.k0
    public final void b(SharedPreferences sharedPreferences) {
        Set<String> stringSet = sharedPreferences.getStringSet(this.a, this.b);
        this.c = stringSet == null ? null : new HashSet(stringSet);
    }
}
