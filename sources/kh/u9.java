package kh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class u9 extends View {
    public static final /* synthetic */ int a = 0;

    public static void a(int i9, a8 a8Var) {
        r9 r9Var;
        if (a8Var == null) {
            return;
        }
        try {
            String string = MessagesController.getInstance(i9).getMainSettings().getString("story_privacy2", null);
            if (string == null) {
                r9Var = new r9();
            } else {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                r9Var = b(serializedData);
                serializedData.cleanup();
                if (r9Var.f.isEmpty() && r9Var.b.isEmpty()) {
                    r9Var = new r9();
                } else {
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(r9Var.c);
                    Iterator it = r9Var.d.values().iterator();
                    while (it.hasNext()) {
                        hashSet.addAll((ArrayList) it.next());
                    }
                    if (!hashSet.isEmpty()) {
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
                        messagesStorage.getStorageQueue().postRunnable(new d5.i(messagesStorage, hashSet, i9, 14));
                    }
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            r9Var = new r9();
        }
        a8Var.E0 = r9Var;
        a8Var.F0.clear();
        a8Var.F0.addAll(a8Var.E0.b);
        if (UserConfig.getInstance(i9).isPremium()) {
            a8Var.I0 = MessagesController.getInstance(i9).getMainSettings().getInt("story_period", 86400);
        } else {
            a8Var.I0 = 86400;
        }
    }

    public static r9 b(SerializedData serializedData) {
        int readInt32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
        }
        int readInt322 = serializedData.readInt32(true);
        ArrayList arrayList = new ArrayList(readInt322);
        for (int i9 = 0; i9 < readInt322; i9++) {
            arrayList.add(TLRPC.InputUser.TLdeserialize(serializedData, serializedData.readInt32(true), true));
        }
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        int readInt323 = serializedData.readInt32(true);
        ArrayList arrayList2 = new ArrayList(readInt323);
        for (int i10 = 0; i10 < readInt323; i10++) {
            arrayList2.add(Long.valueOf(serializedData.readInt64(true)));
        }
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
        }
        int readInt324 = serializedData.readInt32(true);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < readInt324; i11++) {
            long readInt64 = serializedData.readInt64(true);
            if (serializedData.readInt32(true) != 481674261) {
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (4)");
            }
            int readInt325 = serializedData.readInt32(true);
            ArrayList arrayList3 = new ArrayList(readInt325);
            for (int i12 = 0; i12 < readInt325; i12++) {
                arrayList3.add(Long.valueOf(serializedData.readInt64(true)));
            }
            hashMap.put(Long.valueOf(readInt64), arrayList3);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList2);
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll((ArrayList) it.next());
        }
        r9 r9Var = new r9(readInt32, arrayList, 0);
        ArrayList arrayList4 = r9Var.c;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        HashMap hashMap2 = r9Var.d;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        return r9Var;
    }

    public static void c(SerializedData serializedData, r9 r9Var) {
        int i9 = r9Var.a;
        HashMap hashMap = r9Var.d;
        ArrayList arrayList = r9Var.c;
        serializedData.writeInt32(i9);
        serializedData.writeInt32(Vector.constructor);
        ArrayList arrayList2 = r9Var.e;
        serializedData.writeInt32(arrayList2.size());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((TLRPC.InputUser) obj).serializeToStream(serializedData);
        }
        serializedData.writeInt32(Vector.constructor);
        serializedData.writeInt32(arrayList.size());
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            serializedData.writeInt64(((Long) obj2).longValue());
        }
        serializedData.writeInt32(Vector.constructor);
        serializedData.writeInt32(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            serializedData.writeInt64(((Long) entry.getKey()).longValue());
            serializedData.writeInt32(Vector.constructor);
            serializedData.writeInt32(((ArrayList) entry.getValue()).size());
            ArrayList arrayList3 = (ArrayList) entry.getValue();
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                serializedData.writeInt64(((Long) obj3).longValue());
            }
        }
    }
}
