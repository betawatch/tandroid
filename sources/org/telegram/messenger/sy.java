package org.telegram.messenger;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jj0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class sy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ sy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05ca A[Catch: all -> 0x05d0, TRY_LEAVE, TryCatch #0 {all -> 0x05d0, blocks: (B:292:0x05c2, B:294:0x05ca), top: B:291:0x05c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0204  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        boolean z10;
        boolean E;
        boolean z11;
        ArrayList arrayList;
        LongSparseIntArray longSparseIntArray;
        int i10;
        a0.h hVar;
        a0.h hVar2;
        ArrayList arrayList2;
        boolean z12;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i11;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i12;
        long j10;
        jj jjVar;
        int i13;
        ArrayList arrayList7;
        long j11;
        int i14;
        ArrayList arrayList8;
        int i15;
        a0.h hVar3;
        a0.h hVar4;
        switch (this.a) {
            case 0:
                qz qzVar = (qz) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.f;
                String str = (String) this.h;
                boolean z13 = this.b;
                if (tLObject == null) {
                    org.telegram.ui.Components.s4.p0(unVar, str, false, z13);
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    jj0.b(false, qzVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, null);
                    return;
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    jj0.b(false, qzVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.s4.p0(unVar, str, false, z13);
                        return;
                    }
                    return;
                }
            case 1:
                i5 i5Var = (i5) this.c;
                boolean z14 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                ArrayList arrayList10 = (ArrayList) this.h;
                if (z14) {
                    int size = arrayList9.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        TLRPC.User Z1 = i5Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) arrayList9.get(i16)).user_id));
                        if (Z1 != null && !TextUtils.isEmpty(Z1.phone)) {
                            f5 f5Var = (f5) hashMap.get(Z1.phone.substring(Math.max(0, r9.length() - 7)));
                            if (f5Var == null) {
                                String a2 = f5.a(Z1.first_name, Z1.last_name);
                                ArrayList arrayList11 = (ArrayList) hashMap2.get(a2);
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                    hashMap2.put(a2, arrayList11);
                                    arrayList10.add(a2);
                                }
                                arrayList11.add(Z1);
                            } else if (f5Var.m == null) {
                                f5Var.m = Z1;
                            }
                        }
                    }
                }
                Collator u10 = i5.u();
                Iterator it = hashMap2.values().iterator();
                while (it.hasNext()) {
                    Collections.sort((ArrayList) it.next(), new x4(u10, 2));
                }
                Collections.sort(arrayList10, new x4(u10, 3));
                i0.g3(new y4(i5Var, arrayList10, hashMap, hashMap2));
                return;
            case 2:
                int i17 = 2;
                m7 m7Var = (m7) this.c;
                File file2 = (File) this.d;
                File file3 = (File) this.e;
                File file4 = (File) this.f;
                File file5 = (File) this.h;
                boolean z15 = this.b;
                if (file2 != null) {
                    file2.delete();
                }
                if (file3 != null) {
                    file3.delete();
                }
                if (file4 != null) {
                    file4.delete();
                }
                if (file5 != null) {
                    if (m7Var.a1) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file5));
                            b8.o(gZIPInputStream, m7Var.K0);
                            gZIPInputStream.close();
                            file5.delete();
                            file = m7Var.K0;
                            z10 = false;
                            try {
                                m7Var.a1 = false;
                            } catch (ZipException unused) {
                                file5 = file;
                                m7Var.a1 = z10;
                                if (m7Var.a1) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Typeface typeface = i0.a;
                                f8.g(th, !((th instanceof FileNotFoundException) || (th instanceof EOFException)));
                                if (v2.a) {
                                    f8.d("unable to ungzip temp = " + file5 + " to final = " + m7Var.L0);
                                }
                                file5 = file;
                                if (m7Var.a1) {
                                }
                            }
                        } catch (ZipException unused2) {
                            z10 = false;
                        } catch (Throwable th3) {
                            th = th3;
                            file = file5;
                        }
                        file5 = file;
                    }
                    if (m7Var.a1) {
                        Utilities.d.c(new b7(m7Var, 6));
                        return;
                    }
                    if (m7Var.p0 instanceof TLRPC.TL_theme) {
                        try {
                            E = i0.E(file5, m7Var.L0);
                        } catch (Exception e) {
                            f8.g(e, true);
                            z11 = false;
                            if (!z11) {
                            }
                            if (z11) {
                            }
                            Utilities.d.c(new h7(m7Var, z15, i17));
                            return;
                        }
                    } else {
                        try {
                            if (m7Var.c1 != null) {
                                synchronized (m7.m1) {
                                    try {
                                        m7Var.L0 = new File(m7Var.T0, m7Var.s);
                                        int i18 = 1;
                                        while (m7Var.L0.exists()) {
                                            int lastIndexOf = m7Var.s.lastIndexOf(46);
                                            m7Var.L0 = new File(m7Var.T0, lastIndexOf > 0 ? m7Var.s.substring(0, lastIndexOf) + " (" + i18 + ")" + m7Var.s.substring(lastIndexOf) : m7Var.s + " (" + i18 + ")");
                                            i18++;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            E = file5.renameTo(m7Var.L0);
                        } catch (Exception e7) {
                            f8.g(e7, true);
                            z11 = false;
                            if (!z11) {
                                try {
                                    z11 = i0.E(file5, m7Var.L0);
                                    if (z11) {
                                    }
                                } catch (Throwable th4) {
                                    f8.g(th4, true);
                                }
                            }
                            if (z11) {
                            }
                            Utilities.d.c(new h7(m7Var, z15, i17));
                            return;
                        }
                    }
                    z11 = E;
                    if (!z11 && m7Var.m0 == 3) {
                        z11 = i0.E(file5, m7Var.L0);
                        if (z11) {
                            m7Var.L0.delete();
                        }
                    }
                    if (z11) {
                        m7Var.O0 = true;
                        if (m7Var.c1 != null && m7Var.L0.exists()) {
                            z7 z7Var = m7Var.g0;
                            j4.w wVar = m7Var.c1;
                            File file6 = m7Var.L0;
                            k8 k8Var = z7Var.e.d;
                            long j12 = wVar.b;
                            int i19 = wVar.c;
                            int i20 = wVar.d;
                            String file7 = file6 != null ? file6.toString() : null;
                            k8Var.getClass();
                            k8Var.h(new i8(k8Var, j12, i19, i20, file7, 0));
                        }
                    } else {
                        if (v2.a) {
                            f8.d("unable to rename temp = " + file5 + " to final = " + m7Var.L0 + " retry = " + m7Var.m0);
                        }
                        int i21 = m7Var.m0 + 1;
                        m7Var.m0 = i21;
                        if (i21 < 3) {
                            m7Var.Y = 1;
                            Utilities.d.d(new h7(m7Var, z15, 0), 200L);
                            return;
                        } else {
                            m7Var.L0 = file5;
                            m7Var.O0 = false;
                        }
                    }
                }
                Utilities.d.c(new h7(m7Var, z15, i17));
                return;
            default:
                vp vpVar = (vp) this.c;
                TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) this.d;
                a0.h hVar5 = (a0.h) this.e;
                a0.h hVar6 = (a0.h) this.f;
                boolean z16 = this.b;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.h;
                ArrayList arrayList12 = vpVar.y;
                SparseIntArray sparseIntArray = vpVar.Z1;
                a0.h hVar7 = vpVar.R;
                a0.h hVar8 = vpVar.S;
                SparseArray sparseArray = vpVar.U;
                t10 t10Var = vpVar.t7;
                a0.h hVar9 = vpVar.Q;
                long j13 = 0;
                vpVar.V3(tL_messages_dialogs.users, true);
                vpVar.P3(tL_messages_dialogs.chats, true);
                int i22 = 0;
                while (i22 < hVar5.m()) {
                    long j14 = hVar5.j(i22);
                    if (v2.a) {
                        longSparseIntArray = longSparseIntArray2;
                        f8.b("processDialogsUpdate " + j14);
                    } else {
                        longSparseIntArray = longSparseIntArray2;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) hVar5.n(i22);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar9.f(j14);
                    boolean z17 = z16;
                    ArrayList arrayList13 = (ArrayList) hVar6.f(dialog.id);
                    if (dialog2 == null) {
                        if (v2.a) {
                            f8.b("processDialogsUpdate dialog null");
                        }
                        i10 = i22;
                        sparseIntArray.put(dialog.folder_id, sparseIntArray.get(dialog.folder_id, 0) + 1);
                        hVar9.k(dialog, j14);
                        hVar7.k(arrayList13, j14);
                        if (arrayList13 == null || arrayList13.size() <= 0) {
                            hVar = hVar5;
                            hVar2 = hVar6;
                            if (z17) {
                                vpVar.L(dialog, null, j13);
                            }
                            if (v2.a) {
                                f8.b("processDialogsUpdate new message is null");
                            }
                        } else {
                            int i23 = 0;
                            while (i23 < arrayList13.size()) {
                                jj jjVar2 = (jj) arrayList13.get(i23);
                                if (jjVar2 != null) {
                                    hVar3 = hVar5;
                                    hVar4 = hVar6;
                                    if (jjVar2.k.peer_id.channel_id == j13) {
                                        sparseArray.put(jjVar2.f1(), jjVar2);
                                        vpVar.N = Math.min(vpVar.N, jjVar2.k.date);
                                        long j15 = jjVar2.k.random_id;
                                        if (j15 != j13) {
                                            hVar8.k(jjVar2, j15);
                                        }
                                    }
                                } else {
                                    hVar3 = hVar5;
                                    hVar4 = hVar6;
                                }
                                i23++;
                                hVar5 = hVar3;
                                hVar6 = hVar4;
                            }
                            hVar = hVar5;
                            hVar2 = hVar6;
                            if (v2.a) {
                                f8.b("processDialogsUpdate new message not null");
                            }
                        }
                        if (t10Var.v(j14)) {
                            t10Var.e(j14);
                        }
                    } else {
                        i10 = i22;
                        hVar = hVar5;
                        hVar2 = hVar6;
                        if (v2.a) {
                            f8.b("processDialogsUpdate dialog not null");
                        }
                        dialog2.unread_count = dialog.unread_count;
                        int i24 = dialog2.unread_mentions_count;
                        int i25 = dialog.unread_mentions_count;
                        if (i24 != i25) {
                            dialog2.unread_mentions_count = i25;
                            if (vpVar.w0.contains(Long.valueOf(dialog2.id))) {
                                vpVar.getNotificationCenter().k(93, Long.valueOf(dialog2.id), 0L, Integer.valueOf(dialog2.unread_mentions_count));
                            }
                        }
                        int i26 = dialog2.unread_reactions_count;
                        int i27 = dialog.unread_reactions_count;
                        if (i26 != i27) {
                            dialog2.unread_reactions_count = i27;
                            arrayList2 = arrayList13;
                            vpVar.getNotificationCenter().k(zs.Y4, Long.valueOf(dialog2.id), 0L, Integer.valueOf(dialog2.unread_reactions_count), null);
                        } else {
                            arrayList2 = arrayList13;
                        }
                        int i28 = dialog2.unread_poll_votes_count;
                        int i29 = dialog.unread_poll_votes_count;
                        if (i28 != i29) {
                            dialog2.unread_poll_votes_count = i29;
                            vpVar.getNotificationCenter().k(zs.Z4, Long.valueOf(dialog2.id), 0L, Integer.valueOf(dialog2.unread_poll_votes_count), null);
                        }
                        ArrayList arrayList14 = (ArrayList) hVar7.f(j14);
                        for (int i30 = 0; arrayList14 != null && i30 < arrayList14.size(); i30++) {
                            if (arrayList14.get(i30) != null && ((jj) arrayList14.get(i30)).Z) {
                                z12 = true;
                                if (v2.a) {
                                    StringBuilder sb2 = new StringBuilder("processDialogsUpdate oldMsgs (count = ");
                                    sb2.append(arrayList14 == null ? "null" : Integer.valueOf(arrayList14.size()));
                                    sb2.append(") old top_message = ");
                                    sb2.append(dialog2.top_message);
                                    sb2.append(" new top_message = ");
                                    sb2.append(dialog.top_message);
                                    sb2.append("  unread_count =");
                                    sb2.append(dialog2.unread_count);
                                    sb2.append(" fromCache=");
                                    sb2.append(z17);
                                    f8.b(sb2.toString());
                                    f8.b("processDialogsUpdate oldMsgDeleted " + z12);
                                }
                                if (arrayList14 != null || dialog2.top_message > 0) {
                                    arrayList3 = arrayList12;
                                    arrayList4 = arrayList2;
                                    if (!z12 && dialog.top_message <= dialog2.top_message) {
                                        if ((arrayList14 != null) == (arrayList4 != null) && (arrayList14 == null || arrayList4 == null || arrayList14.size() == arrayList4.size())) {
                                            arrayList5 = arrayList3;
                                            if (z17 && arrayList4 == null) {
                                                j11 = 0;
                                                vpVar.L(dialog, null, 0L);
                                                if (!v2.a) {
                                                    f8.b("processDialogsUpdate new messages are null");
                                                }
                                                i22 = i10 + 1;
                                                j13 = j11;
                                                longSparseIntArray2 = longSparseIntArray;
                                                z16 = z17;
                                                arrayList12 = arrayList5;
                                                hVar5 = hVar;
                                                hVar6 = hVar2;
                                            }
                                        }
                                    }
                                    hVar9.k(dialog, j14);
                                    hVar7.k(arrayList4, j14);
                                    i11 = 0;
                                    while (arrayList14 != null && i11 < arrayList14.size()) {
                                        jjVar = (jj) arrayList14.get(i11);
                                        if (jjVar == null) {
                                            i13 = i11;
                                            arrayList7 = arrayList3;
                                            if (jjVar.k.peer_id.channel_id == 0) {
                                                sparseArray.remove(jjVar.f1());
                                                long j16 = jjVar.k.random_id;
                                                if (j16 != 0) {
                                                    hVar8.l(j16);
                                                }
                                            }
                                        } else {
                                            i13 = i11;
                                            arrayList7 = arrayList3;
                                        }
                                        i11 = i13 + 1;
                                        arrayList3 = arrayList7;
                                    }
                                    arrayList5 = arrayList3;
                                    if (arrayList4 != null) {
                                        int i31 = 0;
                                        while (i31 < arrayList4.size()) {
                                            jj jjVar3 = (jj) arrayList4.get(i31);
                                            int i32 = 0;
                                            while (arrayList14 != null && i32 < arrayList14.size()) {
                                                jj jjVar4 = (jj) arrayList14.get(i32);
                                                arrayList6 = arrayList14;
                                                if (jjVar4 != null) {
                                                    i12 = i31;
                                                    if (jjVar4.f1() == jjVar3.f1()) {
                                                        jjVar3.Z = jjVar4.Z;
                                                        if (jjVar3 != null && jjVar3.k.peer_id.channel_id == 0) {
                                                            sparseArray.put(jjVar3.f1(), jjVar3);
                                                            vpVar.N = Math.min(vpVar.N, jjVar3.k.date);
                                                            j10 = jjVar3.k.random_id;
                                                            if (j10 == 0) {
                                                                hVar8.k(jjVar3, j10);
                                                            }
                                                        }
                                                        i31 = i12 + 1;
                                                        arrayList14 = arrayList6;
                                                    }
                                                } else {
                                                    i12 = i31;
                                                }
                                                i32++;
                                                arrayList14 = arrayList6;
                                                i31 = i12;
                                            }
                                            arrayList6 = arrayList14;
                                            i12 = i31;
                                            if (jjVar3 != null) {
                                                sparseArray.put(jjVar3.f1(), jjVar3);
                                                vpVar.N = Math.min(vpVar.N, jjVar3.k.date);
                                                j10 = jjVar3.k.random_id;
                                                if (j10 == 0) {
                                                }
                                            }
                                            i31 = i12 + 1;
                                            arrayList14 = arrayList6;
                                        }
                                    }
                                    if (t10Var.v(j14)) {
                                        t10Var.e(j14);
                                    }
                                    if (z17) {
                                        j11 = 0;
                                        vpVar.L(dialog, null, 0L);
                                        if (!v2.a) {
                                        }
                                        i22 = i10 + 1;
                                        j13 = j11;
                                        longSparseIntArray2 = longSparseIntArray;
                                        z16 = z17;
                                        arrayList12 = arrayList5;
                                        hVar5 = hVar;
                                        hVar6 = hVar2;
                                    }
                                } else if (z12 || vp.s3(arrayList2) > vp.s3(arrayList14)) {
                                    hVar9.k(dialog, j14);
                                    ArrayList arrayList15 = arrayList2;
                                    hVar7.k(arrayList15, j14);
                                    for (int i33 = 0; i33 < arrayList14.size(); i33++) {
                                        jj jjVar5 = (jj) arrayList14.get(i33);
                                        if (jjVar5 != null && jjVar5.k.peer_id.channel_id == 0) {
                                            sparseArray.remove(jjVar5.f1());
                                        }
                                    }
                                    if (arrayList15 != null) {
                                        int i34 = 0;
                                        while (i34 < arrayList15.size()) {
                                            jj jjVar6 = (jj) arrayList15.get(i34);
                                            int i35 = 0;
                                            while (true) {
                                                if (i35 < arrayList14.size()) {
                                                    jj jjVar7 = (jj) arrayList14.get(i35);
                                                    i14 = i34;
                                                    if (jjVar7 != null) {
                                                        i15 = i35;
                                                        if (jjVar7.f1() == jjVar6.f1()) {
                                                            jjVar6.Z = jjVar7.Z;
                                                        }
                                                    } else {
                                                        i15 = i35;
                                                    }
                                                    i35 = i15 + 1;
                                                    i34 = i14;
                                                } else {
                                                    i14 = i34;
                                                }
                                            }
                                            if (jjVar6 != null) {
                                                arrayList8 = arrayList12;
                                                if (jjVar6.k.peer_id.channel_id == 0) {
                                                    sparseArray.put(jjVar6.f1(), jjVar6);
                                                    vpVar.N = Math.min(vpVar.N, jjVar6.k.date);
                                                    long j17 = jjVar6.k.random_id;
                                                    if (j17 != 0) {
                                                        hVar8.k(jjVar6, j17);
                                                    }
                                                }
                                            } else {
                                                arrayList8 = arrayList12;
                                            }
                                            i34 = i14 + 1;
                                            arrayList12 = arrayList8;
                                        }
                                    }
                                    ArrayList arrayList16 = arrayList12;
                                    for (int i36 = 0; i36 < arrayList14.size(); i36++) {
                                        long j18 = ((jj) arrayList14.get(i36)).k.random_id;
                                        if (j18 != 0) {
                                            hVar8.l(j18);
                                        }
                                    }
                                    if (t10Var.v(j14)) {
                                        t10Var.e(j14);
                                    }
                                    arrayList5 = arrayList16;
                                }
                                j11 = 0;
                                i22 = i10 + 1;
                                j13 = j11;
                                longSparseIntArray2 = longSparseIntArray;
                                z16 = z17;
                                arrayList12 = arrayList5;
                                hVar5 = hVar;
                                hVar6 = hVar2;
                            }
                        }
                        z12 = false;
                        if (v2.a) {
                        }
                        if (arrayList14 != null) {
                        }
                        arrayList3 = arrayList12;
                        arrayList4 = arrayList2;
                        if (!z12) {
                            if ((arrayList14 != null) == (arrayList4 != null)) {
                                arrayList5 = arrayList3;
                                if (z17) {
                                }
                                j11 = 0;
                                i22 = i10 + 1;
                                j13 = j11;
                                longSparseIntArray2 = longSparseIntArray;
                                z16 = z17;
                                arrayList12 = arrayList5;
                                hVar5 = hVar;
                                hVar6 = hVar2;
                            }
                        }
                        hVar9.k(dialog, j14);
                        hVar7.k(arrayList4, j14);
                        i11 = 0;
                        while (arrayList14 != null) {
                            jjVar = (jj) arrayList14.get(i11);
                            if (jjVar == null) {
                            }
                            i11 = i13 + 1;
                            arrayList3 = arrayList7;
                        }
                        arrayList5 = arrayList3;
                        if (arrayList4 != null) {
                        }
                        if (t10Var.v(j14)) {
                        }
                        if (z17) {
                        }
                        j11 = 0;
                        i22 = i10 + 1;
                        j13 = j11;
                        longSparseIntArray2 = longSparseIntArray;
                        z16 = z17;
                        arrayList12 = arrayList5;
                        hVar5 = hVar;
                        hVar6 = hVar2;
                    }
                    arrayList5 = arrayList12;
                    j11 = 0;
                    i22 = i10 + 1;
                    j13 = j11;
                    longSparseIntArray2 = longSparseIntArray;
                    z16 = z17;
                    arrayList12 = arrayList5;
                    hVar5 = hVar;
                    hVar6 = hVar2;
                }
                LongSparseIntArray longSparseIntArray3 = longSparseIntArray2;
                ArrayList arrayList17 = arrayList12;
                arrayList17.clear();
                int m10 = hVar9.m();
                int i37 = 0;
                while (i37 < m10) {
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar9.n(i37);
                    if (vpVar.D0.h(dialog3.id) >= 0) {
                        arrayList = arrayList17;
                    } else {
                        arrayList = arrayList17;
                        arrayList.add(dialog3);
                    }
                    i37++;
                    arrayList17 = arrayList;
                }
                vpVar.Q4(null);
                vpVar.getNotificationCenter().k(3, new Object[0]);
                vpVar.getNotificationsController().J(longSparseIntArray3);
                return;
        }
    }

    public /* synthetic */ sy(i5 i5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 1;
        this.c = i5Var;
        this.b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ sy(vp vpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.a = 3;
        this.c = vpVar;
        this.d = tL_messages_dialogs;
        this.e = hVar;
        this.f = hVar2;
        this.b = z10;
        this.h = longSparseIntArray;
    }
}
