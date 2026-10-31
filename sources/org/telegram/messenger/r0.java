package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r0 implements m0 {
    public final String a;
    public final HashSet b;
    public HashSet c;

    public r0(String str, Set set) {
        this.a = str;
        this.b = set == null ? null : new HashSet(set);
    }

    @Override // org.telegram.messenger.m0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i10);
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

    @Override // org.telegram.messenger.m0
    public final void b(SharedPreferences sharedPreferences) {
        Set<String> stringSet = sharedPreferences.getStringSet(this.a, this.b);
        this.c = stringSet == null ? null : new HashSet(stringSet);
    }
}
