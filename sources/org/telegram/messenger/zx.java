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
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ zx(int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.a = i3;
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
        int i3;
        a0.h hVar;
        a0.h hVar2;
        ArrayList arrayList2;
        boolean z12;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i10;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i11;
        long j10;
        zi ziVar;
        int i12;
        ArrayList arrayList7;
        long j11;
        int i13;
        ArrayList arrayList8;
        int i14;
        a0.h hVar3;
        a0.h hVar4;
        switch (this.a) {
            case 0:
                yy yyVar = (yy) this.c;
                TLObject tLObject = (TLObject) this.d;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.f;
                String str = (String) this.h;
                boolean z13 = this.b;
                if (tLObject == null) {
                    org.telegram.ui.Components.t4.p0(wmVar, str, false, z13);
                    return;
                }
                if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
                    yh0.b(false, yyVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, null);
                    return;
                } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                    yh0.b(false, yyVar.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, null);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.t4.p0(wmVar, str, false, z13);
                        return;
                    }
                    return;
                }
            case 1:
                g5 g5Var = (g5) this.c;
                boolean z14 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                HashMap hashMap2 = (HashMap) this.f;
                ArrayList arrayList10 = (ArrayList) this.h;
                if (z14) {
                    int size = arrayList9.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        TLRPC.User a22 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList9.get(i15)).user_id));
                        if (a22 != null && !TextUtils.isEmpty(a22.phone)) {
                            d5 d5Var = (d5) hashMap.get(a22.phone.substring(Math.max(0, r9.length() - 7)));
                            if (d5Var == null) {
                                String a10 = d5.a(a22.first_name, a22.last_name);
                                ArrayList arrayList11 = (ArrayList) hashMap2.get(a10);
                                if (arrayList11 == null) {
                                    arrayList11 = new ArrayList();
                                    hashMap2.put(a10, arrayList11);
                                    arrayList10.add(a10);
                                }
                                arrayList11.add(a22);
                            } else if (d5Var.m == null) {
                                d5Var.m = a22;
                            }
                        }
                    }
                }
                Collator u10 = g5.u();
                Iterator it = hashMap2.values().iterator();
                while (it.hasNext()) {
                    Collections.sort((ArrayList) it.next(), new u4(u10, 2));
                }
                Collections.sort(arrayList10, new u4(u10, 3));
                g0.h3(new v4(g5Var, arrayList10, hashMap, hashMap2));
                return;
            case 2:
                int i16 = 2;
                i7 i7Var = (i7) this.c;
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
                    if (i7Var.a1) {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file5));
                            w7.o(gZIPInputStream, i7Var.K0);
                            gZIPInputStream.close();
                            file5.delete();
                            file = i7Var.K0;
                            z10 = false;
                            try {
                                i7Var.a1 = false;
                            } catch (ZipException unused) {
                                file5 = file;
                                i7Var.a1 = z10;
                                if (i7Var.a1) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Typeface typeface = g0.a;
                                a8.g(th, !((th instanceof FileNotFoundException) || (th instanceof EOFException)));
                                if (r2.a) {
                                    a8.d("unable to ungzip temp = " + file5 + " to final = " + i7Var.L0);
                                }
                                file5 = file;
                                if (i7Var.a1) {
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
                    if (i7Var.a1) {
                        Utilities.d.c(new y6(i7Var, 6));
                        return;
                    }
                    if (i7Var.p0 instanceof TLRPC.TL_theme) {
                        try {
                            E = g0.E(file5, i7Var.L0);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            z11 = false;
                            if (!z11) {
                            }
                            if (z11) {
                            }
                            Utilities.d.c(new d7(i7Var, z15, i16));
                            return;
                        }
                    } else {
                        try {
                            if (i7Var.c1 != null) {
                                synchronized (i7.m1) {
                                    try {
                                        i7Var.L0 = new File(i7Var.T0, i7Var.s);
                                        int i17 = 1;
                                        while (i7Var.L0.exists()) {
                                            int lastIndexOf = i7Var.s.lastIndexOf(46);
                                            i7Var.L0 = new File(i7Var.T0, lastIndexOf > 0 ? i7Var.s.substring(0, lastIndexOf) + " (" + i17 + ")" + i7Var.s.substring(lastIndexOf) : i7Var.s + " (" + i17 + ")");
                                            i17++;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            E = file5.renameTo(i7Var.L0);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                            z11 = false;
                            if (!z11) {
                                try {
                                    z11 = g0.E(file5, i7Var.L0);
                                    if (z11) {
                                    }
                                } catch (Throwable th4) {
                                    a8.g(th4, true);
                                }
                            }
                            if (z11) {
                            }
                            Utilities.d.c(new d7(i7Var, z15, i16));
                            return;
                        }
                    }
                    z11 = E;
                    if (!z11 && i7Var.m0 == 3) {
                        z11 = g0.E(file5, i7Var.L0);
                        if (z11) {
                            i7Var.L0.delete();
                        }
                    }
                    if (z11) {
                        i7Var.O0 = true;
                        if (i7Var.c1 != null && i7Var.L0.exists()) {
                            u7 u7Var = i7Var.g0;
                            ei.t6 t6Var = i7Var.c1;
                            File file6 = i7Var.L0;
                            f8 f8Var = u7Var.e.d;
                            long j12 = t6Var.c;
                            int i18 = t6Var.b;
                            int i19 = t6Var.d;
                            String file7 = file6 != null ? file6.toString() : null;
                            f8Var.getClass();
                            f8Var.h(new d8(f8Var, j12, i18, i19, file7, 0));
                        }
                    } else {
                        if (r2.a) {
                            a8.d("unable to rename temp = " + file5 + " to final = " + i7Var.L0 + " retry = " + i7Var.m0);
                        }
                        int i20 = i7Var.m0 + 1;
                        i7Var.m0 = i20;
                        if (i20 < 3) {
                            i7Var.Y = 1;
                            Utilities.d.e(new d7(i7Var, z15, 0), 200L);
                            return;
                        } else {
                            i7Var.L0 = file5;
                            i7Var.O0 = false;
                        }
                    }
                }
                Utilities.d.c(new d7(i7Var, z15, i16));
                return;
            default:
                hp hpVar = (hp) this.c;
                TLRPC.TL_messages_dialogs tL_messages_dialogs = (TLRPC.TL_messages_dialogs) this.d;
                a0.h hVar5 = (a0.h) this.e;
                a0.h hVar6 = (a0.h) this.f;
                boolean z16 = this.b;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.h;
                ArrayList arrayList12 = hpVar.y;
                SparseIntArray sparseIntArray = hpVar.a2;
                a0.h hVar7 = hpVar.S;
                a0.h hVar8 = hpVar.T;
                SparseArray sparseArray = hpVar.V;
                x00 x00Var = hpVar.s7;
                a0.h hVar9 = hpVar.R;
                long j13 = 0;
                hpVar.Y3(tL_messages_dialogs.users, true);
                hpVar.S3(tL_messages_dialogs.chats, true);
                int i21 = 0;
                while (i21 < hVar5.m()) {
                    long j14 = hVar5.j(i21);
                    if (r2.a) {
                        longSparseIntArray = longSparseIntArray2;
                        a8.b("processDialogsUpdate " + j14);
                    } else {
                        longSparseIntArray = longSparseIntArray2;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) hVar5.n(i21);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar9.f(j14);
                    boolean z17 = z16;
                    ArrayList arrayList13 = (ArrayList) hVar6.f(dialog.id);
                    if (dialog2 == null) {
                        if (r2.a) {
                            a8.b("processDialogsUpdate dialog null");
                        }
                        i3 = i21;
                        sparseIntArray.put(dialog.folder_id, sparseIntArray.get(dialog.folder_id, 0) + 1);
                        hVar9.k(dialog, j14);
                        hVar7.k(arrayList13, j14);
                        if (arrayList13 == null || arrayList13.size() <= 0) {
                            hVar = hVar5;
                            hVar2 = hVar6;
                            if (z17) {
                                hpVar.L(dialog, null, j13);
                            }
                            if (r2.a) {
                                a8.b("processDialogsUpdate new message is null");
                            }
                        } else {
                            int i22 = 0;
                            while (i22 < arrayList13.size()) {
                                zi ziVar2 = (zi) arrayList13.get(i22);
                                if (ziVar2 != null) {
                                    hVar3 = hVar5;
                                    hVar4 = hVar6;
                                    if (ziVar2.k.peer_id.channel_id == j13) {
                                        sparseArray.put(ziVar2.f1(), ziVar2);
                                        hpVar.O = Math.min(hpVar.O, ziVar2.k.date);
                                        long j15 = ziVar2.k.random_id;
                                        if (j15 != j13) {
                                            hVar8.k(ziVar2, j15);
                                        }
                                    }
                                } else {
                                    hVar3 = hVar5;
                                    hVar4 = hVar6;
                                }
                                i22++;
                                hVar5 = hVar3;
                                hVar6 = hVar4;
                            }
                            hVar = hVar5;
                            hVar2 = hVar6;
                            if (r2.a) {
                                a8.b("processDialogsUpdate new message not null");
                            }
                        }
                        if (x00Var.v(j14)) {
                            x00Var.e(j14);
                        }
                    } else {
                        i3 = i21;
                        hVar = hVar5;
                        hVar2 = hVar6;
                        if (r2.a) {
                            a8.b("processDialogsUpdate dialog not null");
                        }
                        dialog2.unread_count = dialog.unread_count;
                        int i23 = dialog2.unread_mentions_count;
                        int i24 = dialog.unread_mentions_count;
                        if (i23 != i24) {
                            dialog2.unread_mentions_count = i24;
                            if (hpVar.x0.contains(Long.valueOf(dialog2.id))) {
                                hpVar.getNotificationCenter().k(93, Long.valueOf(dialog2.id), 0L, Integer.valueOf(dialog2.unread_mentions_count));
                            }
                        }
                        int i25 = dialog2.unread_reactions_count;
                        int i26 = dialog.unread_reactions_count;
                        if (i25 != i26) {
                            dialog2.unread_reactions_count = i26;
                            arrayList2 = arrayList13;
                            hpVar.getNotificationCenter().k(hs.Y4, Long.valueOf(dialog2.id), 0L, Integer.valueOf(dialog2.unread_reactions_count), null);
                        } else {
                            arrayList2 = arrayList13;
                        }
                        int i27 = dialog2.unread_poll_votes_count;
                        int i28 = dialog.unread_poll_votes_count;
                        if (i27 != i28) {
                            dialog2.unread_poll_votes_count = i28;
                            hpVar.getNotificationCenter().k(hs.Z4, Long.valueOf(dialog2.id), 0L, Integer.valueOf(dialog2.unread_poll_votes_count), null);
                        }
                        ArrayList arrayList14 = (ArrayList) hVar7.f(j14);
                        for (int i29 = 0; arrayList14 != null && i29 < arrayList14.size(); i29++) {
                            if (arrayList14.get(i29) != null && ((zi) arrayList14.get(i29)).Z) {
                                z12 = true;
                                if (r2.a) {
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
                                    a8.b(sb2.toString());
                                    a8.b("processDialogsUpdate oldMsgDeleted " + z12);
                                }
                                if (arrayList14 != null || dialog2.top_message > 0) {
                                    arrayList3 = arrayList12;
                                    arrayList4 = arrayList2;
                                    if (!z12 && dialog.top_message <= dialog2.top_message) {
                                        if ((arrayList14 != null) == (arrayList4 != null) && (arrayList14 == null || arrayList4 == null || arrayList14.size() == arrayList4.size())) {
                                            arrayList5 = arrayList3;
                                            if (z17 && arrayList4 == null) {
                                                j11 = 0;
                                                hpVar.L(dialog, null, 0L);
                                                if (!r2.a) {
                                                    a8.b("processDialogsUpdate new messages are null");
                                                }
                                                i21 = i3 + 1;
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
                                    i10 = 0;
                                    while (arrayList14 != null && i10 < arrayList14.size()) {
                                        ziVar = (zi) arrayList14.get(i10);
                                        if (ziVar == null) {
                                            i12 = i10;
                                            arrayList7 = arrayList3;
                                            if (ziVar.k.peer_id.channel_id == 0) {
                                                sparseArray.remove(ziVar.f1());
                                                long j16 = ziVar.k.random_id;
                                                if (j16 != 0) {
                                                    hVar8.l(j16);
                                                }
                                            }
                                        } else {
                                            i12 = i10;
                                            arrayList7 = arrayList3;
                                        }
                                        i10 = i12 + 1;
                                        arrayList3 = arrayList7;
                                    }
                                    arrayList5 = arrayList3;
                                    if (arrayList4 != null) {
                                        int i30 = 0;
                                        while (i30 < arrayList4.size()) {
                                            zi ziVar3 = (zi) arrayList4.get(i30);
                                            int i31 = 0;
                                            while (arrayList14 != null && i31 < arrayList14.size()) {
                                                zi ziVar4 = (zi) arrayList14.get(i31);
                                                arrayList6 = arrayList14;
                                                if (ziVar4 != null) {
                                                    i11 = i30;
                                                    if (ziVar4.f1() == ziVar3.f1()) {
                                                        ziVar3.Z = ziVar4.Z;
                                                        if (ziVar3 != null && ziVar3.k.peer_id.channel_id == 0) {
                                                            sparseArray.put(ziVar3.f1(), ziVar3);
                                                            hpVar.O = Math.min(hpVar.O, ziVar3.k.date);
                                                            j10 = ziVar3.k.random_id;
                                                            if (j10 == 0) {
                                                                hVar8.k(ziVar3, j10);
                                                            }
                                                        }
                                                        i30 = i11 + 1;
                                                        arrayList14 = arrayList6;
                                                    }
                                                } else {
                                                    i11 = i30;
                                                }
                                                i31++;
                                                arrayList14 = arrayList6;
                                                i30 = i11;
                                            }
                                            arrayList6 = arrayList14;
                                            i11 = i30;
                                            if (ziVar3 != null) {
                                                sparseArray.put(ziVar3.f1(), ziVar3);
                                                hpVar.O = Math.min(hpVar.O, ziVar3.k.date);
                                                j10 = ziVar3.k.random_id;
                                                if (j10 == 0) {
                                                }
                                            }
                                            i30 = i11 + 1;
                                            arrayList14 = arrayList6;
                                        }
                                    }
                                    if (x00Var.v(j14)) {
                                        x00Var.e(j14);
                                    }
                                    if (z17) {
                                        j11 = 0;
                                        hpVar.L(dialog, null, 0L);
                                        if (!r2.a) {
                                        }
                                        i21 = i3 + 1;
                                        j13 = j11;
                                        longSparseIntArray2 = longSparseIntArray;
                                        z16 = z17;
                                        arrayList12 = arrayList5;
                                        hVar5 = hVar;
                                        hVar6 = hVar2;
                                    }
                                } else if (z12 || hp.v3(arrayList2) > hp.v3(arrayList14)) {
                                    hVar9.k(dialog, j14);
                                    ArrayList arrayList15 = arrayList2;
                                    hVar7.k(arrayList15, j14);
                                    for (int i32 = 0; i32 < arrayList14.size(); i32++) {
                                        zi ziVar5 = (zi) arrayList14.get(i32);
                                        if (ziVar5 != null && ziVar5.k.peer_id.channel_id == 0) {
                                            sparseArray.remove(ziVar5.f1());
                                        }
                                    }
                                    if (arrayList15 != null) {
                                        int i33 = 0;
                                        while (i33 < arrayList15.size()) {
                                            zi ziVar6 = (zi) arrayList15.get(i33);
                                            int i34 = 0;
                                            while (true) {
                                                if (i34 < arrayList14.size()) {
                                                    zi ziVar7 = (zi) arrayList14.get(i34);
                                                    i13 = i33;
                                                    if (ziVar7 != null) {
                                                        i14 = i34;
                                                        if (ziVar7.f1() == ziVar6.f1()) {
                                                            ziVar6.Z = ziVar7.Z;
                                                        }
                                                    } else {
                                                        i14 = i34;
                                                    }
                                                    i34 = i14 + 1;
                                                    i33 = i13;
                                                } else {
                                                    i13 = i33;
                                                }
                                            }
                                            if (ziVar6 != null) {
                                                arrayList8 = arrayList12;
                                                if (ziVar6.k.peer_id.channel_id == 0) {
                                                    sparseArray.put(ziVar6.f1(), ziVar6);
                                                    hpVar.O = Math.min(hpVar.O, ziVar6.k.date);
                                                    long j17 = ziVar6.k.random_id;
                                                    if (j17 != 0) {
                                                        hVar8.k(ziVar6, j17);
                                                    }
                                                }
                                            } else {
                                                arrayList8 = arrayList12;
                                            }
                                            i33 = i13 + 1;
                                            arrayList12 = arrayList8;
                                        }
                                    }
                                    ArrayList arrayList16 = arrayList12;
                                    for (int i35 = 0; i35 < arrayList14.size(); i35++) {
                                        long j18 = ((zi) arrayList14.get(i35)).k.random_id;
                                        if (j18 != 0) {
                                            hVar8.l(j18);
                                        }
                                    }
                                    if (x00Var.v(j14)) {
                                        x00Var.e(j14);
                                    }
                                    arrayList5 = arrayList16;
                                }
                                j11 = 0;
                                i21 = i3 + 1;
                                j13 = j11;
                                longSparseIntArray2 = longSparseIntArray;
                                z16 = z17;
                                arrayList12 = arrayList5;
                                hVar5 = hVar;
                                hVar6 = hVar2;
                            }
                        }
                        z12 = false;
                        if (r2.a) {
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
                                i21 = i3 + 1;
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
                        i10 = 0;
                        while (arrayList14 != null) {
                            ziVar = (zi) arrayList14.get(i10);
                            if (ziVar == null) {
                            }
                            i10 = i12 + 1;
                            arrayList3 = arrayList7;
                        }
                        arrayList5 = arrayList3;
                        if (arrayList4 != null) {
                        }
                        if (x00Var.v(j14)) {
                        }
                        if (z17) {
                        }
                        j11 = 0;
                        i21 = i3 + 1;
                        j13 = j11;
                        longSparseIntArray2 = longSparseIntArray;
                        z16 = z17;
                        arrayList12 = arrayList5;
                        hVar5 = hVar;
                        hVar6 = hVar2;
                    }
                    arrayList5 = arrayList12;
                    j11 = 0;
                    i21 = i3 + 1;
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
                int i36 = 0;
                while (i36 < m10) {
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar9.n(i36);
                    if (hpVar.E0.h(dialog3.id) >= 0) {
                        arrayList = arrayList17;
                    } else {
                        arrayList = arrayList17;
                        arrayList.add(dialog3);
                    }
                    i36++;
                    arrayList17 = arrayList;
                }
                hpVar.T4(null);
                hpVar.getNotificationCenter().k(3, new Object[0]);
                hpVar.getNotificationsController().J(longSparseIntArray3);
                return;
        }
    }

    public /* synthetic */ zx(g5 g5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.a = 1;
        this.c = g5Var;
        this.b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f = hashMap2;
        this.h = arrayList2;
    }

    public /* synthetic */ zx(hp hpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.a = 3;
        this.c = hpVar;
        this.d = tL_messages_dialogs;
        this.e = hVar;
        this.f = hVar2;
        this.b = z10;
        this.h = longSparseIntArray;
    }
}
