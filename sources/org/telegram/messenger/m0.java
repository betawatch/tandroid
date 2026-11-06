package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class m0 implements k0 {
    public Set b = Collections.EMPTY_SET;
    public final String a = "agent_bot_ids";

    @Override // org.telegram.messenger.k0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (jSONValue instanceof TLRPC.TL_jsonArray) {
            TLRPC.TL_jsonArray tL_jsonArray = (TLRPC.TL_jsonArray) jSONValue;
            HashSet hashSet = new HashSet();
            int size = tL_jsonArray.value.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.JSONValue jSONValue2 = tL_jsonArray.value.get(i7);
                if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                    hashSet.add(Long.valueOf((long) ((TLRPC.TL_jsonNumber) jSONValue2).value));
                } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                    try {
                        hashSet.add(Long.valueOf(Long.parseLong(((TLRPC.TL_jsonString) jSONValue2).value)));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if (!hashSet.equals(this.b)) {
                this.b = hashSet;
                HashSet hashSet2 = new HashSet();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    hashSet2.add(Long.toString(((Long) it.next()).longValue()));
                }
                editor.putStringSet(this.a, hashSet2);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.k0
    public final void b(SharedPreferences sharedPreferences) {
        Set<String> stringSet = sharedPreferences.getStringSet(this.a, null);
        HashSet hashSet = new HashSet();
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(Long.valueOf(Long.parseLong(it.next())));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.b = hashSet;
    }
}
