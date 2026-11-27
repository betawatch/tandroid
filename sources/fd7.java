// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class fd7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fd7(w68 w68Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.a = (byte) 27;
        this.b = w68Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e8 A[Catch: Exception -> 0x05c1, TryCatch #8 {Exception -> 0x05c1, blocks: (B:77:0x017a, B:81:0x0188, B:91:0x0196, B:93:0x01b1, B:97:0x01cd, B:98:0x01c4, B:101:0x01dd, B:102:0x01e4, B:104:0x01e8, B:106:0x01f2, B:108:0x0200, B:111:0x0203, B:113:0x020f, B:115:0x0220, B:116:0x0232, B:118:0x023c, B:120:0x0248, B:122:0x025c, B:124:0x0272, B:126:0x0278, B:129:0x0280, B:131:0x0225, B:133:0x022b, B:134:0x022d, B:138:0x028f, B:139:0x0297, B:141:0x029d, B:147:0x02c3, B:148:0x02c8, B:150:0x02ce, B:152:0x02d5, B:153:0x02de, B:155:0x02e4, B:157:0x02ee, B:158:0x02f5, B:164:0x030b, B:166:0x0319, B:172:0x0322, B:176:0x0325, B:175:0x0329, B:180:0x02d1, B:181:0x02c6, B:183:0x032c, B:185:0x0332, B:187:0x033e, B:189:0x0343, B:205:0x0382, B:215:0x03a9, B:218:0x03c3, B:285:0x04c8), top: B:76:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0203 A[EDGE_INSN: B:110:0x0203->B:111:0x0203 BREAK  A[LOOP:4: B:102:0x01e4->B:108:0x0200], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020f A[Catch: Exception -> 0x05c1, TryCatch #8 {Exception -> 0x05c1, blocks: (B:77:0x017a, B:81:0x0188, B:91:0x0196, B:93:0x01b1, B:97:0x01cd, B:98:0x01c4, B:101:0x01dd, B:102:0x01e4, B:104:0x01e8, B:106:0x01f2, B:108:0x0200, B:111:0x0203, B:113:0x020f, B:115:0x0220, B:116:0x0232, B:118:0x023c, B:120:0x0248, B:122:0x025c, B:124:0x0272, B:126:0x0278, B:129:0x0280, B:131:0x0225, B:133:0x022b, B:134:0x022d, B:138:0x028f, B:139:0x0297, B:141:0x029d, B:147:0x02c3, B:148:0x02c8, B:150:0x02ce, B:152:0x02d5, B:153:0x02de, B:155:0x02e4, B:157:0x02ee, B:158:0x02f5, B:164:0x030b, B:166:0x0319, B:172:0x0322, B:176:0x0325, B:175:0x0329, B:180:0x02d1, B:181:0x02c6, B:183:0x032c, B:185:0x0332, B:187:0x033e, B:189:0x0343, B:205:0x0382, B:215:0x03a9, B:218:0x03c3, B:285:0x04c8), top: B:76:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028f A[Catch: Exception -> 0x05c1, TryCatch #8 {Exception -> 0x05c1, blocks: (B:77:0x017a, B:81:0x0188, B:91:0x0196, B:93:0x01b1, B:97:0x01cd, B:98:0x01c4, B:101:0x01dd, B:102:0x01e4, B:104:0x01e8, B:106:0x01f2, B:108:0x0200, B:111:0x0203, B:113:0x020f, B:115:0x0220, B:116:0x0232, B:118:0x023c, B:120:0x0248, B:122:0x025c, B:124:0x0272, B:126:0x0278, B:129:0x0280, B:131:0x0225, B:133:0x022b, B:134:0x022d, B:138:0x028f, B:139:0x0297, B:141:0x029d, B:147:0x02c3, B:148:0x02c8, B:150:0x02ce, B:152:0x02d5, B:153:0x02de, B:155:0x02e4, B:157:0x02ee, B:158:0x02f5, B:164:0x030b, B:166:0x0319, B:172:0x0322, B:176:0x0325, B:175:0x0329, B:180:0x02d1, B:181:0x02c6, B:183:0x032c, B:185:0x0332, B:187:0x033e, B:189:0x0343, B:205:0x0382, B:215:0x03a9, B:218:0x03c3, B:285:0x04c8), top: B:76:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0332 A[Catch: Exception -> 0x05c1, TryCatch #8 {Exception -> 0x05c1, blocks: (B:77:0x017a, B:81:0x0188, B:91:0x0196, B:93:0x01b1, B:97:0x01cd, B:98:0x01c4, B:101:0x01dd, B:102:0x01e4, B:104:0x01e8, B:106:0x01f2, B:108:0x0200, B:111:0x0203, B:113:0x020f, B:115:0x0220, B:116:0x0232, B:118:0x023c, B:120:0x0248, B:122:0x025c, B:124:0x0272, B:126:0x0278, B:129:0x0280, B:131:0x0225, B:133:0x022b, B:134:0x022d, B:138:0x028f, B:139:0x0297, B:141:0x029d, B:147:0x02c3, B:148:0x02c8, B:150:0x02ce, B:152:0x02d5, B:153:0x02de, B:155:0x02e4, B:157:0x02ee, B:158:0x02f5, B:164:0x030b, B:166:0x0319, B:172:0x0322, B:176:0x0325, B:175:0x0329, B:180:0x02d1, B:181:0x02c6, B:183:0x032c, B:185:0x0332, B:187:0x033e, B:189:0x0343, B:205:0x0382, B:215:0x03a9, B:218:0x03c3, B:285:0x04c8), top: B:76:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033e A[Catch: Exception -> 0x05c1, TryCatch #8 {Exception -> 0x05c1, blocks: (B:77:0x017a, B:81:0x0188, B:91:0x0196, B:93:0x01b1, B:97:0x01cd, B:98:0x01c4, B:101:0x01dd, B:102:0x01e4, B:104:0x01e8, B:106:0x01f2, B:108:0x0200, B:111:0x0203, B:113:0x020f, B:115:0x0220, B:116:0x0232, B:118:0x023c, B:120:0x0248, B:122:0x025c, B:124:0x0272, B:126:0x0278, B:129:0x0280, B:131:0x0225, B:133:0x022b, B:134:0x022d, B:138:0x028f, B:139:0x0297, B:141:0x029d, B:147:0x02c3, B:148:0x02c8, B:150:0x02ce, B:152:0x02d5, B:153:0x02de, B:155:0x02e4, B:157:0x02ee, B:158:0x02f5, B:164:0x030b, B:166:0x0319, B:172:0x0322, B:176:0x0325, B:175:0x0329, B:180:0x02d1, B:181:0x02c6, B:183:0x032c, B:185:0x0332, B:187:0x033e, B:189:0x0343, B:205:0x0382, B:215:0x03a9, B:218:0x03c3, B:285:0x04c8), top: B:76:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0343 A[Catch: Exception -> 0x05c1, TRY_LEAVE, TryCatch #8 {Exception -> 0x05c1, blocks: (B:77:0x017a, B:81:0x0188, B:91:0x0196, B:93:0x01b1, B:97:0x01cd, B:98:0x01c4, B:101:0x01dd, B:102:0x01e4, B:104:0x01e8, B:106:0x01f2, B:108:0x0200, B:111:0x0203, B:113:0x020f, B:115:0x0220, B:116:0x0232, B:118:0x023c, B:120:0x0248, B:122:0x025c, B:124:0x0272, B:126:0x0278, B:129:0x0280, B:131:0x0225, B:133:0x022b, B:134:0x022d, B:138:0x028f, B:139:0x0297, B:141:0x029d, B:147:0x02c3, B:148:0x02c8, B:150:0x02ce, B:152:0x02d5, B:153:0x02de, B:155:0x02e4, B:157:0x02ee, B:158:0x02f5, B:164:0x030b, B:166:0x0319, B:172:0x0322, B:176:0x0325, B:175:0x0329, B:180:0x02d1, B:181:0x02c6, B:183:0x032c, B:185:0x0332, B:187:0x033e, B:189:0x0343, B:205:0x0382, B:215:0x03a9, B:218:0x03c3, B:285:0x04c8), top: B:76:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        boolean z;
        jf7 jf7Var;
        boolean z2;
        jf7 jf7Var2;
        TLRPC.TL_messages_dialogs E0;
        int i;
        int i2;
        SparseArray sparseArray;
        Runnable runnable;
        boolean z3;
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList arrayList;
        HashMap hashMap3;
        int i3;
        int i4;
        HashMap hashMap4;
        TLRPC.DialogFilter dialogFilter;
        HashMap hashMap5;
        ArrayList arrayList2;
        Long valueOf;
        boolean z4;
        boolean z5;
        ArrayList arrayList3;
        HashMap hashMap6;
        LinkedHashMap linkedHashMap;
        int size;
        int i5;
        LongSparseIntArray longSparseIntArray;
        int size2;
        int i6;
        LinkedHashMap linkedHashMap2;
        boolean z6;
        boolean z7;
        int i7;
        int i8;
        Long valueOf2;
        ArrayList arrayList4;
        jf7 jf7Var3 = (jf7) this.b;
        ArrayList arrayList5 = (ArrayList) this.c;
        Runnable runnable2 = (Runnable) this.d;
        try {
            SparseArray sparseArray2 = new SparseArray();
            int size3 = jf7Var3.I.size();
            for (int i9 = 0; i9 < size3; i9++) {
                ac7 ac7Var = (ac7) jf7Var3.I.get(i9);
                sparseArray2.put(ac7Var.a, ac7Var);
            }
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            HashMap hashMap7 = new HashMap();
            ArrayList arrayList8 = new ArrayList();
            HashMap hashMap8 = new HashMap();
            ArrayList arrayList9 = new ArrayList();
            final HashMap hashMap9 = new HashMap();
            final ArrayList arrayList10 = new ArrayList();
            HashMap hashMap10 = new HashMap();
            final HashSet hashSet = new HashSet();
            int size4 = arrayList5.size();
            int i10 = 0;
            while (i10 < size4) {
                try {
                    ArrayList arrayList11 = arrayList5;
                    TLRPC.DialogFilter dialogFilter2 = (TLRPC.DialogFilter) arrayList5.get(i10);
                    int i11 = size4;
                    arrayList6.add(Integer.valueOf(dialogFilter2.id));
                    if (dialogFilter2.contacts) {
                        int i12 = uc7.r5;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (dialogFilter2.non_contacts) {
                        int i13 = uc7.r5;
                        i |= 2;
                    }
                    if (dialogFilter2.groups) {
                        int i14 = uc7.r5;
                        i |= 4;
                    }
                    if (dialogFilter2.broadcasts) {
                        int i15 = uc7.r5;
                        i |= 8;
                    }
                    if (dialogFilter2.bots) {
                        int i16 = uc7.r5;
                        i |= 16;
                    }
                    if (dialogFilter2.exclude_muted) {
                        int i17 = uc7.r5;
                        i |= 32;
                    }
                    if (dialogFilter2.exclude_read) {
                        int i18 = uc7.r5;
                        i2 = i | 64;
                    } else {
                        i2 = i;
                    }
                    ArrayList arrayList12 = arrayList6;
                    if (dialogFilter2.exclude_archived) {
                        int i19 = uc7.r5;
                        i2 |= 128;
                    }
                    if (dialogFilter2 instanceof TLRPC.TL_dialogFilterChatlist) {
                        int i20 = uc7.r5;
                        i2 = dialogFilter2.has_my_invites ? i2 | 1536 : i2 | 512;
                    }
                    int i21 = i10;
                    ac7 ac7Var2 = (ac7) jf7Var3.J.get(dialogFilter2.id);
                    if (ac7Var2 != null) {
                        sparseArray2.remove(dialogFilter2.id);
                        sparseArray = sparseArray2;
                        if (TextUtils.equals(ac7Var2.b, dialogFilter2.title.text) && ls6.M(ac7Var2.c, dialogFilter2.title.entities)) {
                            z4 = false;
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = dialogFilter2.title;
                            ac7Var2.b = tL_textWithEntities.text;
                            ac7Var2.c = tL_textWithEntities.entities;
                            z4 = true;
                        }
                        boolean z8 = ac7Var2.n;
                        boolean z9 = z4;
                        boolean z10 = dialogFilter2.title_noanimate;
                        if (z8 != z10) {
                            ac7Var2.n = z10;
                            z9 = true;
                        }
                        int i22 = (dialogFilter2.flags & TLObject.FLAG_27) != 0 ? dialogFilter2.color : -1;
                        if (ac7Var2.m != i22) {
                            ac7Var2.m = i22;
                            z9 = true;
                        }
                        if (ac7Var2.g != i2) {
                            ac7Var2.g = i2;
                            z5 = true;
                            z9 = true;
                        } else {
                            z5 = false;
                        }
                        HashSet hashSet2 = new HashSet(ac7Var2.h);
                        hashSet2.addAll(ac7Var2.i);
                        HashSet hashSet3 = new HashSet();
                        boolean z11 = z5;
                        if (ac7Var2.j.size() != 0) {
                            ArrayList arrayList13 = new ArrayList();
                            runnable = runnable2;
                            int size5 = ac7Var2.j.size();
                            jf7Var = jf7Var3;
                            int i23 = 0;
                            boolean z12 = false;
                            while (i23 < size5) {
                                int i24 = size5;
                                try {
                                    long keyAt = ac7Var2.j.keyAt(i23);
                                    if (wf3.B(keyAt)) {
                                        z12 = true;
                                    }
                                    arrayList13.add(Long.valueOf(keyAt));
                                    i23++;
                                    size5 = i24;
                                } catch (Exception e) {
                                    e = e;
                                    jf7Var3 = jf7Var;
                                    z = true;
                                    jf7Var3.n(e, z);
                                    return;
                                }
                            }
                            if (z12) {
                                linkedHashMap = new LinkedHashMap();
                                arrayList3 = arrayList8;
                                hashMap6 = hashMap8;
                                Collections.sort(arrayList13, new le4(ac7Var2.j, (byte) 1));
                                int size6 = arrayList13.size();
                                int i25 = 0;
                                while (i25 < size6) {
                                    Long l = (Long) arrayList13.get(i25);
                                    if (wf3.B(l.longValue())) {
                                        arrayList4 = arrayList13;
                                        linkedHashMap.put(Integer.valueOf(i25), l);
                                    } else {
                                        arrayList4 = arrayList13;
                                    }
                                    i25++;
                                    arrayList13 = arrayList4;
                                }
                                size = ac7Var2.j.size();
                                i5 = 0;
                                while (true) {
                                    longSparseIntArray = ac7Var2.j;
                                    if (i5 < size) {
                                        break;
                                    }
                                    long keyAt2 = longSparseIntArray.keyAt(i5);
                                    if (!wf3.B(keyAt2)) {
                                        hashSet3.add(Long.valueOf(keyAt2));
                                        hashSet2.remove(Long.valueOf(keyAt2));
                                    }
                                    i5++;
                                }
                                longSparseIntArray.clear();
                                size2 = dialogFilter2.pinned_peers.size();
                                i6 = 0;
                                while (i6 < size2) {
                                    TLRPC.InputPeer inputPeer = dialogFilter2.pinned_peers.get(i6);
                                    int i26 = size2;
                                    int i27 = i6;
                                    long j = inputPeer.user_id;
                                    if (j != 0) {
                                        valueOf2 = Long.valueOf(j);
                                    } else {
                                        long j2 = inputPeer.chat_id;
                                        if (j2 == 0) {
                                            j2 = inputPeer.channel_id;
                                        }
                                        valueOf2 = Long.valueOf(-j2);
                                    }
                                    int size7 = ac7Var2.j.size();
                                    if (linkedHashMap != null) {
                                        while (true) {
                                            Long l2 = (Long) linkedHashMap.remove(Integer.valueOf(size7));
                                            if (l2 == null) {
                                                break;
                                            }
                                            ac7Var2.j.put(l2.longValue(), size7);
                                            size7++;
                                            linkedHashMap = linkedHashMap;
                                            hashSet = hashSet;
                                        }
                                    }
                                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                                    HashSet hashSet4 = hashSet;
                                    ac7Var2.j.put(valueOf2.longValue(), size7);
                                    hashSet2.remove(valueOf2);
                                    if (!hashSet3.remove(valueOf2)) {
                                        if (!hashMap9.containsKey(valueOf2)) {
                                            arrayList9.add(valueOf2);
                                            hashMap9.put(valueOf2, inputPeer);
                                        }
                                        z9 = true;
                                    }
                                    i6 = i27 + 1;
                                    size2 = i26;
                                    linkedHashMap = linkedHashMap3;
                                    hashSet = hashSet4;
                                }
                                linkedHashMap2 = linkedHashMap;
                                HashSet hashSet5 = hashSet;
                                if (linkedHashMap2 != null) {
                                    Iterator it = linkedHashMap2.entrySet().iterator();
                                    while (it.hasNext()) {
                                        ac7Var2.j.put(((Long) ((Map.Entry) it.next()).getValue()).longValue(), ac7Var2.j.size());
                                    }
                                }
                                z6 = z11;
                                z7 = z9;
                                i7 = 0;
                                while (i7 < 2) {
                                    ArrayList I1 = jf7.I1(i7 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers);
                                    ArrayList arrayList14 = i7 == 0 ? ac7Var2.h : ac7Var2.i;
                                    if (i7 == 0) {
                                        ArrayList I12 = jf7.I1(dialogFilter2.pinned_peers);
                                        i8 = i7;
                                        for (int i28 = 0; i28 < I12.size(); i28++) {
                                            I1.remove(I12.get(i28));
                                        }
                                        I1.addAll(0, I12);
                                    } else {
                                        i8 = i7;
                                    }
                                    int size8 = I1.size();
                                    boolean z13 = I1.size() != arrayList14.size();
                                    if (!z13) {
                                        int i29 = 0;
                                        while (true) {
                                            if (i29 >= size8) {
                                                break;
                                            }
                                            int i30 = size8;
                                            if (!arrayList14.contains(I1.get(i29))) {
                                                z13 = true;
                                                break;
                                            } else {
                                                i29++;
                                                size8 = i30;
                                            }
                                        }
                                    }
                                    if (z13) {
                                        if (i8 == 0) {
                                            ac7Var2.h = I1;
                                        } else {
                                            ac7Var2.i = I1;
                                        }
                                        z6 = true;
                                        z7 = true;
                                    }
                                    i7 = i8 + 1;
                                }
                                if (!hashSet3.isEmpty()) {
                                    hashMap10.put(Integer.valueOf(ac7Var2.a), hashSet3);
                                    z7 = true;
                                }
                                if (z7) {
                                    arrayList10.add(ac7Var2);
                                }
                                if (z6) {
                                    hashSet = hashSet5;
                                } else {
                                    hashSet = hashSet5;
                                    hashSet.add(Integer.valueOf(ac7Var2.a));
                                }
                                hashMap = hashMap7;
                                hashMap2 = hashMap10;
                                arrayList = arrayList3;
                                hashMap3 = hashMap6;
                            }
                        } else {
                            jf7Var = jf7Var3;
                            runnable = runnable2;
                        }
                        arrayList3 = arrayList8;
                        hashMap6 = hashMap8;
                        linkedHashMap = null;
                        size = ac7Var2.j.size();
                        i5 = 0;
                        while (true) {
                            longSparseIntArray = ac7Var2.j;
                            if (i5 < size) {
                            }
                            i5++;
                        }
                        longSparseIntArray.clear();
                        size2 = dialogFilter2.pinned_peers.size();
                        i6 = 0;
                        while (i6 < size2) {
                        }
                        linkedHashMap2 = linkedHashMap;
                        HashSet hashSet52 = hashSet;
                        if (linkedHashMap2 != null) {
                        }
                        z6 = z11;
                        z7 = z9;
                        i7 = 0;
                        while (i7 < 2) {
                        }
                        if (!hashSet3.isEmpty()) {
                        }
                        if (z7) {
                        }
                        if (z6) {
                        }
                        hashMap = hashMap7;
                        hashMap2 = hashMap10;
                        arrayList = arrayList3;
                        hashMap3 = hashMap6;
                    } else {
                        jf7Var = jf7Var3;
                        ArrayList arrayList15 = arrayList8;
                        HashMap hashMap11 = hashMap8;
                        sparseArray = sparseArray2;
                        runnable = runnable2;
                        try {
                            ac7 ac7Var3 = new ac7();
                            ac7Var3.a = dialogFilter2.id;
                            ac7Var3.g = i2;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = dialogFilter2.title;
                            ac7Var3.b = tL_textWithEntities2.text;
                            ac7Var3.c = tL_textWithEntities2.entities;
                            ac7Var3.n = dialogFilter2.title_noanimate;
                            ac7Var3.m = (dialogFilter2.flags & TLObject.FLAG_27) != 0 ? dialogFilter2.color : -1;
                            ac7Var3.e = -1;
                            int i31 = 0;
                            while (i31 < 2) {
                                if (i31 == 0) {
                                    int size9 = dialogFilter2.pinned_peers.size();
                                    int i32 = 0;
                                    while (i32 < size9) {
                                        TLRPC.InputPeer inputPeer2 = dialogFilter2.pinned_peers.get(i32);
                                        HashMap hashMap12 = hashMap7;
                                        long j3 = inputPeer2.user_id;
                                        if (j3 != 0) {
                                            valueOf = Long.valueOf(j3);
                                        } else {
                                            long j4 = inputPeer2.chat_id;
                                            if (j4 == 0) {
                                                j4 = inputPeer2.channel_id;
                                            }
                                            valueOf = Long.valueOf(-j4);
                                        }
                                        if (!ac7Var3.h.contains(valueOf)) {
                                            ac7Var3.h.add(valueOf);
                                        }
                                        HashMap hashMap13 = hashMap10;
                                        int i33 = i31;
                                        z3 = true;
                                        try {
                                            ac7Var3.j.put(valueOf.longValue(), ac7Var3.j.size() + 1);
                                            if (!hashMap9.containsKey(valueOf)) {
                                                arrayList9.add(valueOf);
                                                hashMap9.put(valueOf, inputPeer2);
                                            }
                                            i32++;
                                            hashMap10 = hashMap13;
                                            hashMap7 = hashMap12;
                                            i31 = i33;
                                        } catch (Exception e2) {
                                            e = e2;
                                            z = z3;
                                            jf7Var3 = jf7Var;
                                            jf7Var3.n(e, z);
                                            return;
                                        }
                                    }
                                }
                                int i34 = i31;
                                HashMap hashMap14 = hashMap7;
                                HashMap hashMap15 = hashMap10;
                                ArrayList<TLRPC.InputPeer> arrayList16 = i34 == 0 ? dialogFilter2.include_peers : dialogFilter2.exclude_peers;
                                ArrayList arrayList17 = i34 == 0 ? ac7Var3.h : ac7Var3.i;
                                int size10 = arrayList16.size();
                                int i35 = 0;
                                while (i35 < size10) {
                                    TLRPC.InputPeer inputPeer3 = arrayList16.get(i35);
                                    long j5 = inputPeer3.user_id;
                                    if (j5 != 0) {
                                        Long valueOf3 = Long.valueOf(j5);
                                        if (!arrayList17.contains(valueOf3)) {
                                            arrayList17.add(valueOf3);
                                        }
                                        hashMap4 = hashMap14;
                                        if (!hashMap4.containsKey(valueOf3)) {
                                            arrayList7.add(valueOf3);
                                            hashMap4.put(valueOf3, inputPeer3);
                                        }
                                        dialogFilter = dialogFilter2;
                                        i3 = size10;
                                        i4 = i35;
                                        arrayList2 = arrayList15;
                                        hashMap5 = hashMap11;
                                    } else {
                                        i3 = size10;
                                        i4 = i35;
                                        hashMap4 = hashMap14;
                                        long j6 = inputPeer3.chat_id;
                                        if (j6 == 0) {
                                            j6 = inputPeer3.channel_id;
                                        }
                                        dialogFilter = dialogFilter2;
                                        Long valueOf4 = Long.valueOf(j6);
                                        Long valueOf5 = Long.valueOf(-j6);
                                        if (!arrayList17.contains(valueOf5)) {
                                            arrayList17.add(valueOf5);
                                        }
                                        hashMap5 = hashMap11;
                                        if (hashMap5.containsKey(valueOf4)) {
                                            arrayList2 = arrayList15;
                                        } else {
                                            arrayList2 = arrayList15;
                                            arrayList2.add(valueOf4);
                                            hashMap5.put(valueOf4, inputPeer3);
                                        }
                                    }
                                    hashMap11 = hashMap5;
                                    arrayList15 = arrayList2;
                                    size10 = i3;
                                    i35 = i4 + 1;
                                    dialogFilter2 = dialogFilter;
                                    hashMap14 = hashMap4;
                                }
                                i31 = i34 + 1;
                                hashMap7 = hashMap14;
                                hashMap10 = hashMap15;
                            }
                            hashMap = hashMap7;
                            hashMap2 = hashMap10;
                            arrayList = arrayList15;
                            hashMap3 = hashMap11;
                            arrayList10.add(ac7Var3);
                        } catch (Exception e3) {
                            e = e3;
                            z3 = true;
                        }
                    }
                    arrayList8 = arrayList;
                    hashMap10 = hashMap2;
                    size4 = i11;
                    arrayList6 = arrayList12;
                    sparseArray2 = sparseArray;
                    runnable2 = runnable;
                    jf7Var3 = jf7Var;
                    hashMap8 = hashMap3;
                    hashMap7 = hashMap;
                    i10 = i21 + 1;
                    arrayList5 = arrayList11;
                } catch (Exception e4) {
                    e = e4;
                    z2 = true;
                    z = z2;
                    jf7Var3.n(e, z);
                    return;
                }
            }
            jf7Var = jf7Var3;
            final HashMap hashMap16 = hashMap7;
            final HashMap hashMap17 = hashMap8;
            final SparseArray sparseArray3 = sparseArray2;
            final ArrayList arrayList18 = arrayList6;
            final Runnable runnable3 = runnable2;
            z2 = true;
            ArrayList arrayList19 = arrayList8;
            final HashMap hashMap18 = hashMap10;
            String str = ",";
            if (arrayList9.isEmpty()) {
                jf7Var2 = jf7Var;
                try {
                    E0 = new TLRPC.TL_messages_dialogs();
                } catch (Exception e5) {
                    e = e5;
                    jf7Var3 = jf7Var2;
                    z = true;
                    jf7Var3.n(e, z);
                    return;
                }
            } else {
                try {
                    jf7Var2 = jf7Var;
                } catch (Exception e6) {
                    e = e6;
                    jf7Var2 = jf7Var;
                    jf7Var3 = jf7Var2;
                    z = z2;
                    jf7Var3.n(e, z);
                    return;
                }
                try {
                    E0 = jf7Var2.E0(arrayList7, arrayList19, new ArrayList(), TextUtils.join(",", arrayList9));
                    int size11 = E0.dialogs.size();
                    for (int i36 = 0; i36 < size11; i36++) {
                        hashMap9.remove(Long.valueOf(E0.dialogs.get(i36).id));
                    }
                } catch (Exception e7) {
                    e = e7;
                    jf7Var3 = jf7Var2;
                    z = z2;
                    jf7Var3.n(e, z);
                    return;
                }
            }
            final TLRPC.TL_messages_dialogs tL_messages_dialogs = E0;
            final ArrayList arrayList20 = new ArrayList();
            if (!arrayList7.isEmpty()) {
                jf7Var2.k0(arrayList7, arrayList20, false);
                int size12 = arrayList20.size();
                int i37 = 0;
                while (i37 < size12) {
                    String str2 = str;
                    hashMap16.remove(Long.valueOf(((TLRPC.User) arrayList20.get(i37)).id));
                    i37++;
                    str = str2;
                }
            }
            String str3 = str;
            final ArrayList arrayList21 = new ArrayList();
            if (!arrayList19.isEmpty()) {
                jf7Var2.P(TextUtils.join(str3, arrayList19), arrayList21);
                int size13 = arrayList21.size();
                for (int i38 = 0; i38 < size13; i38++) {
                    hashMap17.remove(Long.valueOf(((TLRPC.Chat) arrayList21.get(i38)).id));
                }
            }
            if (hashMap16.isEmpty() && hashMap17.isEmpty()) {
                if (hashMap9.isEmpty()) {
                    jf7Var3 = jf7Var2;
                    try {
                        jf7Var3.V0(tL_messages_dialogs, null, arrayList20, arrayList21, arrayList10, sparseArray3, arrayList18, hashMap18, hashSet, runnable3);
                        return;
                    } catch (Exception e8) {
                        e = e8;
                        z = z2;
                        jf7Var3.n(e, z);
                        return;
                    }
                }
            }
            jf7Var3 = jf7Var2;
            final uc7 messagesController = jf7Var3.getMessagesController();
            final TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
            messagesController.getClass();
            Utilities.d.c(new Runnable() { // from class: wa7
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    TLRPC.TL_users_getUsers tL_users_getUsers;
                    uc7 uc7Var;
                    TLRPC.TL_messages_dialogs tL_messages_dialogs3;
                    TLRPC.TL_messages_dialogs tL_messages_dialogs4;
                    ArrayList arrayList22;
                    ArrayList arrayList23;
                    ArrayList arrayList24;
                    SparseArray sparseArray4;
                    ArrayList arrayList25;
                    HashMap hashMap19;
                    HashSet hashSet6;
                    Runnable runnable4;
                    TLRPC.TL_channels_getChannels tL_channels_getChannels;
                    TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs;
                    uc7 uc7Var2;
                    TLRPC.TL_messages_dialogs tL_messages_dialogs5;
                    TLRPC.TL_messages_dialogs tL_messages_dialogs6;
                    TLRPC.TL_channels_getChannels tL_channels_getChannels2;
                    ArrayList arrayList26;
                    ArrayList arrayList27;
                    ArrayList arrayList28;
                    TLRPC.TL_inputChannel tL_inputChannel;
                    ArrayList arrayList29;
                    ArrayList arrayList30 = new ArrayList();
                    Iterator it2 = hashMap16.entrySet().iterator();
                    loop0: while (true) {
                        tL_users_getUsers = null;
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            uc7Var = uc7.this;
                            tL_messages_dialogs3 = tL_messages_dialogs;
                            tL_messages_dialogs4 = tL_messages_dialogs2;
                            arrayList22 = arrayList20;
                            arrayList23 = arrayList21;
                            arrayList24 = arrayList10;
                            sparseArray4 = sparseArray3;
                            arrayList25 = arrayList18;
                            hashMap19 = hashMap18;
                            hashSet6 = hashSet;
                            runnable4 = runnable3;
                            if (!hasNext) {
                                break loop0;
                            }
                            Map.Entry entry = (Map.Entry) it2.next();
                            if (tL_users_getUsers == null) {
                                tL_users_getUsers = new TLRPC.TL_users_getUsers();
                                arrayList30.add(tL_users_getUsers);
                            }
                            arrayList29 = arrayList30;
                            tL_users_getUsers.id.add(uc7Var.p1((TLRPC.InputPeer) entry.getValue()));
                            if (tL_users_getUsers.id.size() == 100) {
                                break;
                            } else {
                                arrayList30 = arrayList29;
                            }
                        }
                        arrayList30 = arrayList29;
                        uc7Var.N4(tL_users_getUsers, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap19, hashSet6, runnable4);
                    }
                    if (tL_users_getUsers != null) {
                        uc7Var.N4(tL_users_getUsers, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap19, hashSet6, runnable4);
                    }
                    TLRPC.TL_messages_getChats tL_messages_getChats = null;
                    loop2: while (true) {
                        tL_channels_getChannels = null;
                        for (Map.Entry entry2 : hashMap17.entrySet()) {
                            uc7Var2 = uc7Var;
                            TLRPC.InputPeer inputPeer4 = (TLRPC.InputPeer) entry2.getValue();
                            tL_messages_dialogs5 = tL_messages_dialogs3;
                            tL_messages_dialogs6 = tL_messages_dialogs4;
                            if (inputPeer4.chat_id != 0) {
                                if (tL_messages_getChats == null) {
                                    tL_messages_getChats = new TLRPC.TL_messages_getChats();
                                    arrayList30.add(tL_messages_getChats);
                                }
                                tL_messages_getChats.id.add((Long) entry2.getKey());
                                if (tL_messages_getChats.id.size() == 100) {
                                    tL_messages_dialogs3 = tL_messages_dialogs5;
                                    uc7Var = uc7Var2;
                                    tL_messages_dialogs4 = tL_messages_dialogs6;
                                    uc7Var.N4(tL_messages_getChats, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap19, hashSet6, runnable4);
                                    tL_messages_getChats = null;
                                } else {
                                    tL_messages_dialogs3 = tL_messages_dialogs5;
                                    uc7Var = uc7Var2;
                                    tL_messages_dialogs4 = tL_messages_dialogs6;
                                }
                            } else if (inputPeer4.channel_id != 0) {
                                if (tL_channels_getChannels == null) {
                                    tL_channels_getChannels2 = new TLRPC.TL_channels_getChannels();
                                    arrayList30.add(tL_channels_getChannels2);
                                } else {
                                    tL_channels_getChannels2 = tL_channels_getChannels;
                                }
                                ArrayList<TLRPC.InputChannel> arrayList31 = tL_channels_getChannels2.id;
                                arrayList26 = arrayList22;
                                if (inputPeer4.access_hash == 0) {
                                    arrayList27 = arrayList23;
                                    TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(inputPeer4.channel_id));
                                    if (M0 != null && M0.access_hash == 0 && M0.fromMessageId != 0 && M0.fromMessageDialogId != 0) {
                                        TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                                        arrayList28 = arrayList24;
                                        tL_inputChannelFromMessage.channel_id = inputPeer4.channel_id;
                                        tL_inputChannelFromMessage.peer = uc7.s1(yac.t0).j1(M0.fromMessageDialogId);
                                        tL_inputChannelFromMessage.msg_id = M0.fromMessageId;
                                        tL_inputChannel = tL_inputChannelFromMessage;
                                        arrayList31.add(tL_inputChannel);
                                        if (tL_channels_getChannels2.id.size() != 100) {
                                            break;
                                        }
                                        tL_messages_dialogs3 = tL_messages_dialogs5;
                                        uc7Var = uc7Var2;
                                        tL_messages_dialogs4 = tL_messages_dialogs6;
                                        arrayList24 = arrayList28;
                                        arrayList22 = arrayList26;
                                        arrayList23 = arrayList27;
                                        tL_channels_getChannels = tL_channels_getChannels2;
                                    }
                                } else {
                                    arrayList27 = arrayList23;
                                }
                                arrayList28 = arrayList24;
                                TLRPC.TL_inputChannel tL_inputChannel2 = new TLRPC.TL_inputChannel();
                                tL_inputChannel2.channel_id = inputPeer4.channel_id;
                                tL_inputChannel2.access_hash = inputPeer4.access_hash;
                                tL_inputChannel = tL_inputChannel2;
                                arrayList31.add(tL_inputChannel);
                                if (tL_channels_getChannels2.id.size() != 100) {
                                }
                            } else {
                                tL_messages_dialogs3 = tL_messages_dialogs5;
                                uc7Var = uc7Var2;
                                tL_messages_dialogs4 = tL_messages_dialogs6;
                            }
                        }
                        tL_messages_dialogs3 = tL_messages_dialogs5;
                        uc7Var = uc7Var2;
                        tL_messages_dialogs4 = tL_messages_dialogs6;
                        arrayList24 = arrayList28;
                        arrayList22 = arrayList26;
                        arrayList23 = arrayList27;
                        uc7Var.N4(tL_channels_getChannels2, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap19, hashSet6, runnable4);
                    }
                    if (tL_messages_getChats != null) {
                        uc7Var.N4(tL_messages_getChats, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap19, hashSet6, runnable4);
                    }
                    if (tL_channels_getChannels != null) {
                        uc7Var.N4(tL_channels_getChannels, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap19, hashSet6, runnable4);
                    }
                    uc7 uc7Var3 = uc7Var;
                    loop4: while (true) {
                        tL_messages_getPeerDialogs = null;
                        for (Map.Entry entry3 : hashMap9.entrySet()) {
                            if (tL_messages_getPeerDialogs == null) {
                                tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                                arrayList30.add(tL_messages_getPeerDialogs);
                            }
                            TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                            tL_inputDialogPeer.peer = (TLRPC.InputPeer) entry3.getValue();
                            tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                            if (tL_messages_getPeerDialogs.peers.size() == 100) {
                                break;
                            }
                        }
                        ArrayList arrayList32 = arrayList30;
                        TLRPC.TL_messages_dialogs tL_messages_dialogs7 = tL_messages_dialogs3;
                        TLRPC.TL_messages_dialogs tL_messages_dialogs8 = tL_messages_dialogs4;
                        ArrayList arrayList33 = arrayList22;
                        ArrayList arrayList34 = arrayList23;
                        ArrayList arrayList35 = arrayList24;
                        SparseArray sparseArray5 = sparseArray4;
                        ArrayList arrayList36 = arrayList25;
                        HashMap hashMap20 = hashMap19;
                        HashSet hashSet7 = hashSet6;
                        uc7Var3.N4(tL_messages_getPeerDialogs, arrayList32, tL_messages_dialogs7, tL_messages_dialogs8, arrayList33, arrayList34, arrayList35, sparseArray5, arrayList36, hashMap20, hashSet7, runnable4);
                        hashSet6 = hashSet7;
                        hashMap19 = hashMap20;
                        arrayList25 = arrayList36;
                        sparseArray4 = sparseArray5;
                        arrayList24 = arrayList35;
                        arrayList23 = arrayList34;
                        arrayList22 = arrayList33;
                        tL_messages_dialogs4 = tL_messages_dialogs8;
                        tL_messages_dialogs3 = tL_messages_dialogs7;
                        arrayList30 = arrayList32;
                    }
                    if (tL_messages_getPeerDialogs != null) {
                        uc7Var3.N4(tL_messages_getPeerDialogs, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap19, hashSet6, runnable4);
                    }
                }
            });
        } catch (Exception e9) {
            e = e9;
        }
    }

    private final void b() {
        int i;
        int i2;
        int i3;
        x08 x08Var = (x08) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TL_account.verifyPhone verifyphone = (TL_account.verifyPhone) this.d;
        int i4 = x08Var.M;
        b18 b18Var = x08Var.R;
        b18Var.A1();
        x08Var.K = false;
        if (tL_error == null) {
            x08Var.r();
            x08Var.q();
            b18Var.C1.c(b18Var.F, (String) b18Var.t1.get("phone"), null, null, null, null, null, null, null, null, new sz7(b18Var, (byte) 6), null);
            return;
        }
        x08Var.L = tL_error.text;
        if ((i4 == 3 && ((i3 = x08Var.N) == 4 || i3 == 2)) || ((i4 == 2 && ((i = x08Var.N) == 4 || i == 3)) || (i4 == 4 && x08Var.N == 2))) {
            x08Var.p();
        }
        if (i4 == 2) {
            hl.y3(true);
            jn7.e().a(x08Var, jn7.j4);
        } else if (i4 == 3) {
            hl.x3(true);
            jn7.e().a(x08Var, jn7.k4);
        }
        x08Var.J = true;
        if (i4 != 3) {
            i2 = ((e) b18Var).currentAccount;
            jj.c0(i2, tL_error, b18Var, verifyphone, new Object[0]);
        }
        b18Var.Q1(true, false);
        if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                x08Var.c(true);
                b18Var.N1(null, 0, true);
                return;
            }
            return;
        }
        int i5 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = x08Var.d;
            if (i5 >= editTextBoldCursorArr.length) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            } else {
                editTextBoldCursorArr[i5].setText("");
                i5++;
            }
        }
    }

    private final void c() {
        p pVar = (p) this.b;
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) this.c;
        pl7 pl7Var = (pl7) this.d;
        pVar.getClass();
        pVar.F0 = tL_payments_validatedRequestedInfo;
        pl7Var.run();
        pVar.J0(false);
        pVar.N0(true, false);
    }

    private final void d() {
        ((p) this.b).l0((TL_account.Password) this.c, (byte[]) this.d);
    }

    private final void e() {
        ((p) this.b).t0((TLRPC.TL_error) this.c, (TLRPC.TL_payments_sendPaymentForm) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Reaction reaction;
        ImageReceiver imageReceiver;
        TLRPC.TL_availableReaction tL_availableReaction2;
        wl wlVar;
        s58 s58Var = (s58) this.b;
        w49 w49Var = (w49) this.c;
        View view = (View) this.d;
        o68 o68Var = s58Var.a;
        o68Var.e3 = true;
        n68 n68Var = o68Var.y1;
        ImageReceiver imageReceiver2 = o68Var.V2;
        boolean[] zArr = {false};
        h6b h6bVar = o68Var.o0;
        h6bVar.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new vk(h6bVar, (byte) 2)).setDuration(150L).start();
        int L = hl.L(8.0f);
        h6b h6bVar2 = new h6b(o68Var.getContext(), o68Var.h1);
        o68Var.o0 = h6bVar2;
        h6bVar2.setPadding(L, L, L, L);
        o68Var.n0.addView(o68Var.o0, tre.e(40, 40, 3));
        wl wlVar2 = o68Var.Y2;
        if (wlVar2 != null) {
            wlVar2.o(o68Var);
            o68Var.Y2 = null;
        }
        yl ylVar = o68Var.W2;
        if (ylVar != null) {
            ylVar.d(o68Var);
            o68Var.W2 = null;
        }
        o68Var.Z2 = false;
        if (w49Var.g != 0) {
            o68Var.Z2 = true;
            wl wlVar3 = new wl(2, o68Var.m2, w49Var.g);
            o68Var.Y2 = wlVar3;
            wlVar3.b(o68Var);
        } else if (w49Var.f != null && (tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(o68Var.m2).r.get(w49Var.f)) != null) {
            o68Var.X2.Y(null, null, jn5.b(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
            reaction = null;
            imageReceiver2.d0(jn5.b(tL_availableReaction.around_animation), s49.a(), null, null, null, 0);
            if (imageReceiver2.y() != null) {
                imageReceiver2.y().I(0, false, true);
            }
            o68Var.o0.setReaction(w49Var);
            if (o68Var.n1) {
                TL_stories.StoryItem storyItem = n68Var.a;
                if (storyItem.sent_reaction == null) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryItem storyItem2 = n68Var.a;
                    TL_stories.StoryViews storyViews = storyItem2.views;
                    storyViews.reactions_count++;
                    z49.b(reaction, storyItem2.sent_reaction, storyViews);
                    o68Var.i1(true);
                }
            }
            if (w49Var.g != 0 && (wlVar = o68Var.o0.f) != null) {
                yl a = yl.a(wlVar, false, true);
                o68Var.W2 = a;
                a.f(o68Var);
            }
            o68Var.C1.i0(o68Var.l1, n68Var.a, w49Var);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            o68Var.getLocationInWindow(iArr2);
            o68Var.g3 = iArr[0] - iArr2[0];
            o68Var.h3 = iArr[1] - iArr2[1];
            o68Var.i3 = view.getMeasuredHeight();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            o68Var.f3 = 0.0f;
            o68Var.invalidate();
            h6b h6bVar3 = o68Var.o0;
            h6bVar3.setAllowDrawReaction(false);
            imageReceiver = h6bVar3.e;
            if (w49Var.g == 0 && (tL_availableReaction2 = (TLRPC.TL_availableReaction) ls6.d0(yac.t0).r.get(w49Var.f)) != null) {
                imageReceiver.d0(jn5.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                imageReceiver.M(0);
            }
            ofFloat.addUpdateListener(new nk(s58Var, ofFloat, zArr, (byte) 4));
            ofFloat.addListener(new j8(s58Var, zArr, h6bVar3, (byte) 10));
            ofFloat.setDuration(220L);
            ofFloat.start();
            o68Var.W0(false);
        }
        reaction = null;
        o68Var.o0.setReaction(w49Var);
        if (o68Var.n1) {
        }
        if (w49Var.g != 0) {
            yl a2 = yl.a(wlVar, false, true);
            o68Var.W2 = a2;
            a2.f(o68Var);
        }
        o68Var.C1.i0(o68Var.l1, n68Var.a, w49Var);
        int[] iArr3 = new int[2];
        view.getLocationInWindow(iArr3);
        int[] iArr22 = new int[2];
        o68Var.getLocationInWindow(iArr22);
        o68Var.g3 = iArr3[0] - iArr22[0];
        o68Var.h3 = iArr3[1] - iArr22[1];
        o68Var.i3 = view.getMeasuredHeight();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        o68Var.f3 = 0.0f;
        o68Var.invalidate();
        h6b h6bVar32 = o68Var.o0;
        h6bVar32.setAllowDrawReaction(false);
        imageReceiver = h6bVar32.e;
        if (w49Var.g == 0) {
            imageReceiver.d0(jn5.b(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
            imageReceiver.M(0);
        }
        ofFloat2.addUpdateListener(new nk(s58Var, ofFloat2, zArr, (byte) 4));
        ofFloat2.addListener(new j8(s58Var, zArr, h6bVar32, (byte) 10));
        ofFloat2.setDuration(220L);
        ofFloat2.start();
        o68Var.W0(false);
    }

    private final void g() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        o5b o5bVar = (o5b) this.b;
        TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.c;
        pcc pccVar = (pcc) this.d;
        for (int i = 0; i < o5bVar.i.size(); i++) {
            r47 r47Var = (r47) o5bVar.i.get(i);
            if (r47Var != null && (storyItem = r47Var.l) != null && (messageMedia = storyItem.media) != null && (document = storyItem2.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                pccVar.a(document2);
                return;
            }
        }
        pccVar.a(null);
    }

    private final void h() {
        j68 j68Var = (j68) this.b;
        x53 x53Var = (x53) this.c;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        o68 o68Var = j68Var.x;
        jj.P(o68Var.getContext(), null, x53Var, new o48((Object) j68Var, (Object) storyItem, (Object) x53Var, (byte) 1));
        j68 j68Var2 = o68Var.d1;
        if (j68Var2 != null) {
            j68Var2.a();
        }
    }

    private final void i() {
        w68 w68Var = (w68) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (tL_error == null) {
            w68Var.r1 = (TLRPC.TL_chatInviteExported) tLObject;
            TLRPC.ChatFull N0 = uc7.s1(w68Var.a).N0(w68Var.p1);
            if (N0 != null) {
                N0.exported_invite = w68Var.r1;
            }
            w68Var.o1.setLink(w68Var.r1.link);
        }
        w68Var.q1 = false;
    }

    private final void j() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        y98 y98Var = (y98) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        photoViewer.B4.f0(bitmap);
        photoViewer.s5.setUndoCutState(true);
        photoViewer.k2(true, true);
        hl.r(y98Var);
        hl.d3(y98Var, 800L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x0646, code lost:
    
        if (r11 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x081d, code lost:
    
        if (r3 != 0) goto L291;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SparseIntArray sparseIntArray;
        SQLiteCursor sQLiteCursor;
        Exception e;
        zh6 zh6Var;
        SQLitePreparedStatement sQLitePreparedStatement;
        int currentTime;
        int i;
        SQLitePreparedStatement executeFast;
        SQLiteCursor sQLiteCursor2;
        boolean z;
        SQLiteCursor sQLiteCursor3;
        NativeByteBuffer byteBufferValue;
        TL_ephemeral.EphemeralMessage U;
        int i2;
        TLRPC.User user;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity;
        int i3;
        TLRPC.Chat chat;
        String S0;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b = 15;
        long j = 0;
        int i9 = 2;
        boolean z4 = true;
        int i10 = 0;
        switch (this.a) {
            case 0:
                jf7 jf7Var = (jf7) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                m77 m77Var = (m77) this.d;
                jf7Var.getClass();
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                    long n = wf3.n(ephemeralMessage.peer_id);
                    long n2 = wf3.n(ephemeralMessage.from_id);
                    int i11 = ephemeralMessage.anchor_msg_id;
                    wz4 wz4Var = jf7Var.e0;
                    int i12 = ephemeralMessage.id;
                    zh6 zh6Var2 = (zh6) wz4Var.a;
                    SparseIntArray sparseIntArray2 = (SparseIntArray) zh6Var2.f(n);
                    long j2 = j;
                    if (sparseIntArray2 == null) {
                        sparseIntArray = new SparseIntArray();
                        zh6Var2.k(n, sparseIntArray);
                    } else {
                        sparseIntArray = sparseIntArray2;
                    }
                    sparseIntArray.put(i11, i12);
                    TLRPC.Message a0 = jf7Var.a0(n, i11);
                    if (a0 != null) {
                        ephemeralMessage.peer_id = a0.peer_id;
                        ephemeralMessage.from_id = a0.from_id;
                        ephemeralMessage.out = a0.out;
                        if (n2 > j2) {
                            ephemeralMessage.via_bot_id = n2;
                        }
                    }
                    j = j2;
                }
                jf7Var.d1(arrayList2, true);
                m77Var.run();
                return;
            case 1:
                jf7 jf7Var2 = (jf7) this.b;
                zh6 zh6Var3 = (zh6) this.c;
                zh6 zh6Var4 = (zh6) this.d;
                if (zh6Var3 != null) {
                    try {
                        int m = zh6Var3.m();
                        for (int i13 = 0; i13 < m; i13++) {
                            SQLiteDatabase sQLiteDatabase = jf7Var2.b;
                            Locale locale = Locale.US;
                            sQLiteDatabase.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) zh6Var3.n(i13)) + ") AND uid = " + zh6Var3.j(i13) + " AND media = 0").stepThis().dispose();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        sQLiteCursor = null;
                        try {
                            jf7Var2.n(e, true);
                            if (sQLiteCursor == null) {
                                sQLiteCursor.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = null;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                if (zh6Var4 != null) {
                    int m2 = zh6Var4.m();
                    for (int i14 = 0; i14 < m2; i14++) {
                        SQLiteDatabase sQLiteDatabase2 = jf7Var2.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) zh6Var4.n(i14)) + ") AND uid = " + zh6Var4.j(i14) + " AND media = 1").stepThis().dispose();
                    }
                }
                SQLiteCursor queryFinalized = jf7Var2.b.queryFinalized("SELECT mid, date, media, uid FROM enc_tasks_v4 WHERE date = (SELECT min(date) FROM enc_tasks_v4)", new Object[0]);
                int i15 = 0;
                zh6 zh6Var5 = null;
                zh6 zh6Var6 = null;
                while (queryFinalized.next()) {
                    try {
                        int intValue = queryFinalized.intValue(0);
                        i15 = queryFinalized.intValue(1);
                        int intValue2 = queryFinalized.intValue(2);
                        long longValue = queryFinalized.longValue(3);
                        if (intValue2 == -1) {
                            if (intValue > 0) {
                                if (zh6Var6 == null) {
                                    zh6Var6 = new zh6();
                                }
                                zh6Var = zh6Var6;
                            }
                            if (zh6Var5 == null) {
                                zh6Var5 = new zh6();
                            }
                            zh6Var = zh6Var5;
                        }
                        ArrayList arrayList3 = (ArrayList) zh6Var.f(longValue);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            zh6Var.k(longValue, arrayList3);
                        }
                        arrayList3.add(Integer.valueOf(intValue));
                    } catch (Exception e3) {
                        e = e3;
                        sQLiteCursor = queryFinalized;
                        jf7Var2.n(e, true);
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                uc7 messagesController = jf7Var2.getMessagesController();
                messagesController.getClass();
                Utilities.d.c(new y36((Object) messagesController, (Object) zh6Var5, (Object) zh6Var6, i15, (byte) 10));
                return;
            case 2:
                jf7 jf7Var3 = (jf7) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                try {
                    if (str2.length() != 0) {
                        SQLiteDatabase sQLiteDatabase3 = jf7Var3.b;
                        Locale locale3 = Locale.US;
                        sQLiteDatabase3.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
                    }
                    if (str3.length() != 0) {
                        SQLiteDatabase sQLiteDatabase4 = jf7Var3.b;
                        Locale locale4 = Locale.US;
                        sQLiteDatabase4.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str3 + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    jf7Var3.n(e4, true);
                    return;
                }
            case 3:
                jf7 jf7Var4 = (jf7) this.b;
                TLObject tLObject = (TLObject) this.c;
                String str4 = (String) this.d;
                try {
                    currentTime = jf7Var4.getConnectionsManager().getCurrentTime();
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = null;
                }
                try {
                    if (!(tLObject instanceof TLRPC.TL_messages_botCallbackAnswer)) {
                        if (tLObject instanceof TLRPC.TL_messages_botResults) {
                            i = ((TLRPC.TL_messages_botResults) tLObject).cache_time;
                        }
                        executeFast = jf7Var4.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject.getObjectSize());
                        tLObject.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str4);
                        executeFast.bindInteger(2, currentTime);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                        return;
                    }
                    i = ((TLRPC.TL_messages_botCallbackAnswer) tLObject).cache_time;
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject.getObjectSize());
                    tLObject.serializeToStream(nativeByteBuffer2);
                    executeFast.bindString(1, str4);
                    executeFast.bindInteger(2, currentTime);
                    executeFast.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer2.reuse();
                    return;
                } catch (Exception e6) {
                    e = e6;
                    sQLitePreparedStatement = executeFast;
                    try {
                        jf7Var4.n(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement = executeFast;
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                currentTime += i;
                executeFast = jf7Var4.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
            case 4:
                ((jf7) this.b).getNotificationCenter().k(50, Long.valueOf(r47.B0(((r47) this.d).k)), (ArrayList) this.c);
                return;
            case 5:
                int i16 = 2;
                jf7 jf7Var5 = (jf7) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                qo1 qo1Var = (qo1) this.d;
                long e7 = jf7Var5.getUserConfig().e();
                int size2 = arrayList4.size();
                int i17 = 0;
                while (i17 < size2) {
                    int i18 = i17 + 1;
                    r47 r47Var = (r47) arrayList4.get(i17);
                    if (r47Var.r1 || r47.a4(r47Var.k)) {
                        i17 = i18;
                    } else {
                        try {
                            SQLiteDatabase sQLiteDatabase5 = jf7Var5.b;
                            Long valueOf = Long.valueOf(r47.B0(r47Var.k));
                            Integer valueOf2 = Integer.valueOf(r47Var.e1());
                            Object[] objArr = new Object[i16];
                            objArr[0] = valueOf;
                            objArr[1] = valueOf2;
                            sQLiteCursor3 = sQLiteDatabase5.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", objArr);
                            try {
                                try {
                                    if (sQLiteCursor3.next() && (byteBufferValue = sQLiteCursor3.byteBufferValue(0)) != null) {
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        TLdeserialize.readAttachPath(byteBufferValue, e7);
                                        byteBufferValue.reuse();
                                        r47Var.k.attachPath = TLdeserialize.attachPath;
                                        r47Var.K(true);
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    z = true;
                                    cc4.g(e, z);
                                    break;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteCursor2 = sQLiteCursor3;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            z = true;
                            sQLiteCursor3 = null;
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteCursor2 = null;
                        }
                        sQLiteCursor3.dispose();
                        i17 = i18;
                        i16 = 2;
                    }
                }
                hl.c3(qo1Var);
                return;
            case 6:
                a();
                return;
            case 7:
                jf7 jf7Var6 = (jf7) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                l77 l77Var = (l77) this.d;
                jf7Var6.getClass();
                int size3 = arrayList5.size();
                int i19 = 0;
                while (i19 < size3) {
                    Object obj2 = arrayList5.get(i19);
                    i19++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage2 = (TL_ephemeral.EphemeralMessage) obj2;
                    if (ephemeralMessage2.top_msg_id == 0 && (U = jf7Var6.U(ephemeralMessage2.id, wf3.n(ephemeralMessage2.peer_id))) != null && (i2 = U.top_msg_id) != 0) {
                        ephemeralMessage2.top_msg_id = i2;
                        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage2.reply_to;
                        if (messageReplyHeader != null) {
                            messageReplyHeader.forum_topic = true;
                        }
                        ephemeralMessage2.flags |= 2;
                    }
                }
                jf7Var6.d1(arrayList5, true);
                l77Var.run();
                return;
            case 8:
                hl.c3(new pl7((v35) this.d, jf7.Y(((rl7) this.b).a).g0(((TLRPC.TL_contact) this.c).user_id), (byte) 0));
                return;
            case 9:
                rl7 rl7Var = (rl7) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                v35 v35Var = (v35) this.d;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    uc7.s1(rl7Var.a).j4(tL_contacts_resolvedPeer.users, false);
                    uc7.s1(rl7Var.a).c4(tL_contacts_resolvedPeer.chats, false);
                    long n3 = wf3.n(tL_contacts_resolvedPeer.peer);
                    if (n3 >= 0) {
                        user = uc7.s1(rl7Var.a).X1(Long.valueOf(n3));
                        v35Var.a(user);
                        return;
                    }
                }
                user = null;
                v35Var.a(user);
                return;
            case 10:
                lm7 lm7Var = (lm7) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_feed.TL_feed_setInterestCategories tL_feed_setInterestCategories = (TL_feed.TL_feed_setInterestCategories) this.d;
                HashSet hashSet = lm7Var.e;
                jm7[] jm7VarArr = lm7Var.b;
                if (lm7Var.h) {
                    return;
                }
                lm7Var.f = false;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    hashSet.clear();
                    hashSet.addAll(tL_feed_setInterestCategories.category_ids);
                    lm7Var.s = true;
                    for (int size4 = jm7VarArr[0].a.size() - 1; size4 >= 0; size4--) {
                        if (jm7VarArr[0].a.get(size4) instanceof TL_feed.TL_feedItemInterestCategories) {
                            jm7VarArr[0].a.remove(size4);
                        }
                    }
                    lm7.L0(jm7VarArr[0]);
                    v21 Q = d31.b0(lm7Var).Q(R.raw.contact_check, 36, ob6.M0(2131747987, null));
                    z11 z11Var = Q.e;
                    Q.l = true;
                    z11Var.pillStyle = true;
                    z11Var.f();
                    if (z11Var instanceof c21) {
                        int themedColor = lm7Var.getThemedColor(aob.yj);
                        ((c21) z11Var).a.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, Color.red(themedColor), 0.0f, 0.0f, 0.0f, 0.0f, Color.green(themedColor), 0.0f, 0.0f, 0.0f, 0.0f, Color.blue(themedColor), 0.33333334f, 0.33333334f, 0.33333334f, 0.0f, 0.0f}));
                    }
                    Q.j();
                } else {
                    xnb.x(null, 2131747988, d31.b0(lm7Var), null);
                }
                lm7Var.M0(true);
                return;
            case 11:
                lm7 lm7Var2 = (lm7) this.b;
                jm7 jm7Var = (jm7) this.c;
                r47 r47Var2 = (r47) this.d;
                if (lm7Var2.h || !jm7Var.a.remove(r47Var2)) {
                    return;
                }
                jm7Var.c.remove(r47Var2);
                lm7.L0(jm7Var);
                return;
            case 12:
                sp7 sp7Var = (sp7) this.b;
                String str5 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = sp7Var.n;
                String lowerCase = str5.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    hl.c3(new oy6(sp7Var, new ArrayList(), new ArrayList(), new ArrayList()));
                    return;
                }
                String S02 = ob6.D0().S0(lowerCase, true, false);
                if (lowerCase.equals(S02) || S02.length() == 0) {
                    S02 = null;
                }
                int i20 = (S02 != null ? 1 : 0) + 1;
                String[] strArr = new String[i20];
                strArr[0] = lowerCase;
                if (S02 != null) {
                    strArr[1] = S02;
                }
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                String[] strArr2 = new String[2];
                int i21 = 0;
                while (i21 < arrayList6.size()) {
                    vp7 vp7Var = (vp7) arrayList6.get(i21);
                    int i22 = i9;
                    if (wf3.B(vp7Var.d)) {
                        boolean z5 = z4;
                        TLRPC.EncryptedChat a1 = notificationsCustomSettingsActivity2.getMessagesController().a1(Integer.valueOf((int) (vp7Var.d & 4294967295L)));
                        if (a1 != null) {
                            z2 = z5;
                            TLRPC.User X1 = notificationsCustomSettingsActivity2.getMessagesController().X1(Long.valueOf(a1.user_id));
                            if (X1 != null) {
                                strArr2[0] = lv2.m(0, X1.first_name, X1.last_name);
                                strArr2[z2 ? 1 : 0] = lbc.p(X1);
                            }
                        } else {
                            z2 = z5;
                        }
                    } else {
                        z2 = z4;
                        if (wf3.D(vp7Var.d)) {
                            TLRPC.User X12 = notificationsCustomSettingsActivity2.getMessagesController().X1(Long.valueOf(vp7Var.d));
                            if (X12 != null && !X12.deleted) {
                                strArr2[0] = lv2.m(0, X12.first_name, X12.last_name);
                                strArr2[z2 ? 1 : 0] = lbc.p(X12);
                                z3 = false;
                                chat = X12;
                                String str6 = strArr2[z3 ? 1 : 0];
                                strArr2[z3 ? 1 : 0] = str6.toLowerCase();
                                i3 = i22;
                                notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                S0 = ob6.D0().S0(strArr2[z3 ? 1 : 0], z2, z3);
                                str = strArr2[z3 ? 1 : 0];
                                if (str != null && str.equals(S0)) {
                                    S0 = null;
                                }
                                i4 = z3 ? 1 : 0;
                                i5 = i4;
                                while (true) {
                                    if (i5 < i20) {
                                        boolean z6 = z3;
                                        String str7 = strArr[i5];
                                        arrayList = arrayList6;
                                        String str8 = strArr2[z6 ? 1 : 0];
                                        int i23 = i4;
                                        if ((str8 == null || !(str8.startsWith(str7) || uh9.t(" ", str7, strArr2[z6 ? 1 : 0]))) && (S0 == null || !(S0.startsWith(str7) || uh9.t(" ", str7, S0)))) {
                                            i6 = 1;
                                            String str9 = strArr2[1];
                                            i7 = (str9 == null || !str9.startsWith(str7)) ? i23 : i3;
                                        } else {
                                            i7 = 1;
                                            i6 = 1;
                                        }
                                        if (i7 != 0) {
                                            if (i7 == i6) {
                                                arrayList9.add(hl.r0(str6, null, str7));
                                            } else {
                                                arrayList9.add(hl.r0("@" + strArr2[i6], null, "@" + str7));
                                            }
                                            arrayList8.add(vp7Var);
                                            if (chat != null) {
                                                arrayList7.add(chat);
                                            }
                                        } else {
                                            i5++;
                                            i4 = i7;
                                            arrayList6 = arrayList;
                                            z3 = false;
                                        }
                                    } else {
                                        arrayList = arrayList6;
                                    }
                                }
                            }
                            arrayList = arrayList6;
                            notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                            i3 = i22;
                        } else {
                            TLRPC.Chat M0 = notificationsCustomSettingsActivity2.getMessagesController().M0(Long.valueOf(-vp7Var.d));
                            if (M0 != null) {
                                if (!M0.left && !M0.kicked && M0.migrated_to == null) {
                                    z3 = false;
                                    strArr2[0] = M0.title;
                                    strArr2[z2 ? 1 : 0] = xc2.K(M0, false);
                                    chat = M0;
                                    String str62 = strArr2[z3 ? 1 : 0];
                                    strArr2[z3 ? 1 : 0] = str62.toLowerCase();
                                    i3 = i22;
                                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                    S0 = ob6.D0().S0(strArr2[z3 ? 1 : 0], z2, z3);
                                    str = strArr2[z3 ? 1 : 0];
                                    if (str != null) {
                                        S0 = null;
                                    }
                                    i4 = z3 ? 1 : 0;
                                    i5 = i4;
                                    while (true) {
                                        if (i5 < i20) {
                                        }
                                        i5++;
                                        i4 = i7;
                                        arrayList6 = arrayList;
                                        z3 = false;
                                    }
                                }
                                arrayList = arrayList6;
                                notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                                i3 = i22;
                            }
                        }
                        i21++;
                        i9 = i3;
                        notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                        arrayList6 = arrayList;
                        z4 = true;
                    }
                    z3 = false;
                    chat = null;
                    String str622 = strArr2[z3 ? 1 : 0];
                    strArr2[z3 ? 1 : 0] = str622.toLowerCase();
                    i3 = i22;
                    notificationsCustomSettingsActivity = notificationsCustomSettingsActivity2;
                    S0 = ob6.D0().S0(strArr2[z3 ? 1 : 0], z2, z3);
                    str = strArr2[z3 ? 1 : 0];
                    if (str != null) {
                    }
                    i4 = z3 ? 1 : 0;
                    i5 = i4;
                    while (true) {
                        if (i5 < i20) {
                        }
                        i5++;
                        i4 = i7;
                        arrayList6 = arrayList;
                        z3 = false;
                    }
                    i21++;
                    i9 = i3;
                    notificationsCustomSettingsActivity2 = notificationsCustomSettingsActivity;
                    arrayList6 = arrayList;
                    z4 = true;
                }
                hl.c3(new oy6(sp7Var, arrayList8, arrayList9, arrayList7));
                return;
            case 13:
                ((NotificationsSettingsActivity) this.b).E0((ArrayList) this.c, (av2) this.d);
                return;
            case 14:
                boolean[] zArr = (boolean[]) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                pq7 pq7Var = (pq7) this.d;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                pq7Var.a(0L);
                return;
            case 15:
                boolean[] zArr2 = (boolean[]) this.b;
                l01 l01Var = (l01) this.c;
                id idVar = (id) this.d;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                l01Var.c(false);
                idVar.dismiss();
                return;
            case 16:
                ((vt7) this.b).g0((TLObject) this.d, (TLRPC.TL_error) this.c);
                return;
            case 17:
                b18 b18Var = (b18) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                b18Var.A1();
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        b18Var.P1(ob6.M0(R.string.AppName, null), tL_error.text);
                        return;
                    } else {
                        int intValue3 = Utilities.z(tL_error.text).intValue();
                        b18Var.P1(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue3 < 60 ? ob6.G(intValue3, "Seconds", new Object[0]) : ob6.G(intValue3 / 60, "Minutes", new Object[0])));
                        return;
                    }
                }
                TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject4;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b18Var.getParentActivity());
                alertDialog$Builder.a.U = ob6.a0("RestoreEmailSent", null, 2131745807, tL_auth_passwordRecovery.email_pattern);
                alertDialog$Builder.a.S = ob6.M0(2131745805, null);
                alertDialog$Builder.j(ob6.M0(2131747558, null), new rm6(b18Var, tL_auth_passwordRecovery, b));
                Dialog showDialog = b18Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 18:
                ((um4) this.b).Z(((TLRPC.TL_error) this.c).text, (String) this.d);
                return;
            case 19:
                r08 r08Var = (r08) this.b;
                byte[] bArr = (byte[]) this.c;
                String str10 = (String) this.d;
                SecureRandom secureRandom = Utilities.b;
                b18 b18Var2 = r08Var.e;
                secureRandom.setSeed(b18Var2.K.secure_random);
                TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
                TL_account.Password password = b18Var2.K;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    updatepasswordsettings.password = es9.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                }
                updatepasswordsettings.new_settings = new TL_account.passwordInputSettings();
                byte[] j1 = b18.j1();
                b18Var2.d1 = j1;
                b18Var2.c1 = Utilities.g(Utilities.o(32L, j1));
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = b18Var2.K.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m3 = Utilities.m(hl.g1(str10), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    b18Var2.f1 = m3;
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(m3, 0, bArr2, 0, 32);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(b18Var2.f1, 32, bArr3, 0, 16);
                    byte[] bArr4 = b18Var2.d1;
                    Utilities.b(bArr4, bArr2, bArr3, 0, bArr4.length, 0, 1);
                    updatepasswordsettings.new_settings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
                    TL_account.passwordInputSettings passwordinputsettings = updatepasswordsettings.new_settings;
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordinputsettings.new_secure_settings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = b18Var2.d1;
                    tL_secureSecretSettings.secure_secret_id = b18Var2.c1;
                    passwordinputsettings.flags |= 4;
                }
                i8 = ((e) b18Var2).currentAccount;
                ConnectionsManager.getInstance(i8).sendRequest(updatepasswordsettings, new o08(r08Var, false ? 1 : 0));
                return;
            case 20:
                b();
                return;
            case 21:
                c();
                return;
            case 22:
                d();
                return;
            case 23:
                e();
                return;
            case 24:
                f();
                return;
            case 25:
                g();
                return;
            case 26:
                h();
                return;
            case 27:
                i();
                return;
            case 28:
                j();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                mn5 mn5Var = (mn5) this.c;
                String str11 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.d9;
                mn5Var.a();
                if (str11.equals(photoViewer.B4.R)) {
                    photoViewer.v4 = (byte) 2;
                    photoViewer.w4 = str11;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ fd7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ fd7(Object obj, Object obj2, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = arrayList;
    }
}
