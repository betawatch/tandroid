// default package

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o30(Object obj, long j, long j2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
        this.e = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(3:7|8|9)|(19:11|12|(1:69)(1:16)|17|(1:19)(1:68)|20|21|(1:(2:23|(1:25)(1:26))(2:66|67))|27|(1:29)(1:65)|30|(3:34|(1:62)(1:40)|(1:46))|48|49|50|(1:52)(1:57)|53|54|55)|73|48|49|50|(0)(0)|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c A[Catch: all -> 0x016b, TryCatch #6 {all -> 0x016b, blocks: (B:50:0x0142, B:52:0x014c, B:53:0x0160), top: B:49:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        TLRPC.InputReplyTo inputReplyTo;
        String sb;
        SQLiteCursor sQLiteCursor;
        boolean z4;
        int i;
        SQLiteCursor queryFinalized;
        boolean z5;
        int i2;
        int i3;
        boolean z6;
        wx9 wx9Var;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.EncryptedChat encryptedChat2;
        int i4;
        int i5;
        TLRPC.Message c;
        int i6;
        pm3 pm3Var;
        long[] jArr;
        long[] jArr2;
        int i7;
        pm3 pm3Var2;
        long j2;
        int i8;
        long j3;
        int i9;
        pm3 r;
        int i10 = 3;
        byte b = 1;
        int i11 = 0;
        switch (this.a) {
            case 0:
                lh2 lh2Var = (lh2) this.d;
                String str = (String) this.e;
                long j4 = this.b;
                long j5 = this.c;
                p30 p30Var = (p30) lh2Var.c;
                String str2 = gcc.a;
                ea3 ea3Var = ((n64) p30Var).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1008, new uy2(U, str, j5, j4));
                return;
            case 1:
                ((oc2) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 2:
                uj3 uj3Var = (uj3) this.d;
                long j6 = this.b;
                long j7 = this.c;
                tzb tzbVar = (tzb) this.e;
                if (uj3Var.E2 == null) {
                    uj3Var.finishFragment();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(if7.a(j6, j7));
                uj3Var.E2.q(uj3Var, arrayList, null, false, uj3Var.L2, uj3Var.M2, uj3Var.N2, tzbVar);
                if (uj3Var.k2) {
                    uj3Var.E2 = null;
                    return;
                }
                return;
            case 3:
                nd4 nd4Var = (nd4) this.d;
                Float f = (Float) this.e;
                long j8 = this.b;
                long j9 = this.c;
                boolean[] zArr = nd4Var.R;
                if (f != null && nd4Var.G != 0 && j8 == 0) {
                    if (f.floatValue() > 0.75f) {
                        z = true;
                        z = true;
                        if (!zArr[0]) {
                            zArr[0] = true;
                            z2 = true;
                            if (f.floatValue() > 0.95f || zArr[z ? 1 : 0]) {
                                z3 = z2;
                            } else {
                                zArr[z ? 1 : 0] = z;
                                z3 = z ? 1 : 0;
                            }
                            if (z3) {
                                nd4Var.G = (long) (j9 / f.floatValue());
                            }
                        }
                    } else {
                        z = true;
                    }
                    z2 = false;
                    if (f.floatValue() > 0.95f) {
                    }
                    z3 = z2;
                    if (z3) {
                    }
                }
                if (nd4Var.G == 0 || j8 == 0) {
                    j = 0;
                } else {
                    nd4Var.G = 0L;
                    nd4Var.t = j8;
                    nd4Var.a();
                    if (!nd4Var.P && nd4Var.J) {
                        nd4Var.f();
                    }
                    j = 0;
                }
                if (j8 <= j) {
                    j8 = j9;
                }
                nd4Var.O = j8;
                if (nd4Var.K < nd4Var.e) {
                    nd4Var.d();
                    return;
                }
                return;
            case 4:
                ((GroupCallMessagesController) this.d).lambda$processUpdate$3(this.b, this.c, (byte[]) this.e);
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                long j10 = this.b;
                long j11 = this.c;
                zu1 zu1Var = (zu1) this.e;
                String str3 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f2 = uc7.s1(launchActivity.P).g4.f(j10, j11);
                StringBuilder o = ik8.o(j10, "LaunchActivity openForum after load ", " ");
                o.append(j11);
                o.append(" TL_forumTopic ");
                o.append(f2);
                cc4.b(o.toString());
                if (launchActivity.p0 != null) {
                    ro4.a(zu1Var, if7.a(-j10, j11));
                    ((ActionBarLayout) launchActivity.N()).S(zu1Var);
                    return;
                }
                return;
            case 6:
                ((o96) this.d).m(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 7:
                ls6 ls6Var = (ls6) this.d;
                long j12 = this.b;
                long j13 = this.c;
                TLRPC.Message message = (TLRPC.Message) this.e;
                zh6 zh6Var = ls6Var.v1;
                zh6 zh6Var2 = (zh6) ls6Var.u1.f(j12);
                TLRPC.DraftMessage draftMessage = zh6Var2 != null ? (TLRPC.DraftMessage) zh6Var2.f(j13) : null;
                if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
                    return;
                }
                zh6 zh6Var3 = (zh6) zh6Var.f(j12);
                zh6 zh6Var4 = zh6Var3;
                if (zh6Var3 == null) {
                    zh6 zh6Var5 = new zh6();
                    zh6Var.k(j12, zh6Var5);
                    zh6Var4 = zh6Var5;
                }
                zh6Var4.k(j13, message);
                SerializedData serializedData = new SerializedData(message.getObjectSize());
                message.serializeToStream(serializedData);
                SharedPreferences.Editor edit = ls6Var.w1.edit();
                if (j13 == 0) {
                    sb = qu6.n(j12, "r_");
                } else {
                    StringBuilder o2 = ik8.o(j12, "rt_", "_");
                    o2.append(j13);
                    sb = o2.toString();
                }
                edit.putString(sb, Utilities.f(serializedData.toByteArray())).commit();
                ls6Var.getNotificationCenter().k(86, Long.valueOf(j12));
                serializedData.cleanup();
                return;
            case 8:
                ((ls6) this.d).R0(this.b, this.c, (ArrayList) this.e, false);
                return;
            case 9:
                ((jf7) this.d).getMessagesController().Y(null, null, null, this.b, true, 1, false, this.c, (TLRPC.TL_messages_deleteScheduledMessages) this.e, 0);
                return;
            case 10:
                ((jf7) this.d).getMessagesController().s3(this.b, (TLRPC.InputPeer) this.e, this.c);
                return;
            case 11:
                jf7 jf7Var = (jf7) this.d;
                long j14 = this.b;
                long j15 = this.c;
                cn1 cn1Var = (cn1) this.e;
                try {
                    SQLiteDatabase sQLiteDatabase = jf7Var.b;
                    if (j14 != 0) {
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(mid) FROM messages_topics WHERE uid = " + j15 + " AND topic_id = " + j14 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                        i = 0;
                    } else {
                        Locale locale2 = Locale.US;
                        i = 0;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(mid) FROM messages_v2 WHERE uid = " + j15 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                    }
                    sQLiteCursor = queryFinalized;
                    try {
                        try {
                            int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(i) : 0;
                            sQLiteCursor.dispose();
                            hl.c3(new me7((Object) cn1Var, intValue, (byte) 0));
                        } catch (Exception e) {
                            e = e;
                            z4 = true;
                            jf7Var.n(e, z4);
                            if (sQLiteCursor == null) {
                                return;
                            }
                            sQLiteCursor.dispose();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z4 = true;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
                sQLiteCursor.dispose();
                return;
            case 12:
                wp7 wp7Var = (wp7) this.d;
                long j16 = this.b;
                long j17 = this.c;
                TLRPC.PeerNotifySettings peerNotifySettings = (TLRPC.PeerNotifySettings) this.e;
                String p = ip7.p(j16, j17, true);
                int i12 = wp7Var.a;
                uc7 s1 = uc7.s1(i12);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                jf7 Y = jf7.Y(i12);
                ip7 n = ip7.n(i12);
                int g = qu6.g("notify2_", p, wp7Var.b(), -1);
                int g2 = qu6.g("notifyuntil_", p, wp7Var.b(), 0);
                SharedPreferences.Editor edit2 = wp7Var.b().edit();
                if ((peerNotifySettings.flags & 2) != 0) {
                    edit2.putBoolean(c00.i("silent_", p), peerNotifySettings.silent);
                } else {
                    edit2.remove("silent_" + p);
                }
                if ((peerNotifySettings.flags & 64) != 0) {
                    edit2.putBoolean(c00.i("stories_", p), !peerNotifySettings.stories_muted);
                } else {
                    edit2.remove("stories_" + p);
                }
                TLRPC.Dialog dialog = j17 == 0 ? (TLRPC.Dialog) s1.R.f(j16) : null;
                if (dialog != null) {
                    dialog.notify_settings = peerNotifySettings;
                }
                if ((peerNotifySettings.flags & 4) == 0) {
                    if (g != -1) {
                        if (dialog != null) {
                            dialog.notify_settings.mute_until = 0;
                        }
                        edit2.remove("notify2_" + p);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (j17 == 0) {
                        Y.B1(j16, 0L);
                    }
                } else if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                    if (peerNotifySettings.mute_until <= connectionsManager.getCurrentTime() + 31536000) {
                        if (g == 3 && g2 == peerNotifySettings.mute_until) {
                            z5 = false;
                        } else {
                            edit2.putInt("notify2_" + p, 3);
                            edit2.putInt("notifyuntil_" + p, peerNotifySettings.mute_until);
                            if (dialog != null) {
                                dialog.notify_settings.mute_until = 0;
                            }
                            z5 = true;
                        }
                        i3 = peerNotifySettings.mute_until;
                    } else if (g != 2) {
                        edit2.putInt("notify2_" + p, 2);
                        if (dialog != null) {
                            dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        i3 = 0;
                        z5 = true;
                    } else {
                        i3 = 0;
                        z5 = false;
                    }
                    if (j17 == 0) {
                        Y.B1(j16, (i3 << 32) | 1);
                        n.N(j16);
                    }
                } else {
                    if (g == 0 || g == 1) {
                        z5 = false;
                    } else {
                        if (dialog != null) {
                            i2 = 0;
                            dialog.notify_settings.mute_until = 0;
                        } else {
                            i2 = 0;
                        }
                        edit2.putInt("notify2_" + p, i2);
                        z5 = true;
                    }
                    if (j17 == 0) {
                        Y.B1(j16, 0L);
                    }
                }
                wp7Var.a(peerNotifySettings.android_sound, edit2, j16, j17, 0);
                edit2.apply();
                if (z5) {
                    hl.c3(new fe7(wp7Var, (byte) 11));
                    return;
                }
                return;
            case 13:
                jp9 jp9Var = (jp9) this.d;
                fp9 fp9Var = (fp9) this.e;
                long j18 = this.b;
                long j19 = this.c;
                synchronized (jp9Var.g) {
                    if (fp9Var.d || fp9Var.e) {
                        return;
                    }
                    ((hkb) jp9Var.e).a(fp9Var.a, fp9Var.b, j18, j19);
                    return;
                }
            case 14:
                Object obj = null;
                wx9 wx9Var2 = (wx9) this.d;
                long j20 = this.b;
                TLRPC.EncryptedChat encryptedChat3 = (TLRPC.EncryptedChat) this.e;
                long j21 = this.c;
                try {
                    if (encryptedChat3.admin_id == wx9Var2.getUserConfig().e() && (j20 & 1) == 0) {
                        j20++;
                    }
                    if (j20 <= j21) {
                        int i13 = (int) j20;
                        int i14 = (int) j21;
                        SQLiteDatabase sQLiteDatabase2 = wx9Var2.getMessagesStorage().b;
                        Locale locale3 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + encryptedChat3.id + " AND ((seq_out_start >= " + i13 + " AND " + i13 + " <= seq_out_end) OR (seq_out_start >= " + i14 + " AND " + i14 + " <= seq_out_end))", new Object[0]);
                        boolean next = queryFinalized2.next();
                        queryFinalized2.dispose();
                        if (next) {
                            return;
                        }
                        long E = wf3.E(encryptedChat3.id);
                        SparseArray sparseArray = new SparseArray();
                        ArrayList arrayList2 = new ArrayList();
                        while (j20 <= j21) {
                            try {
                                sparseArray.put((int) j20, obj);
                                j20 += 2;
                                obj = null;
                            } catch (Exception e3) {
                                e = e3;
                                z6 = b;
                                cc4.g(e, z6);
                                return;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase3 = wx9Var2.getMessagesStorage().b;
                        Locale locale4 = Locale.US;
                        SQLiteCursor queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT m.data, r.random_id, s.seq_in, s.seq_out, m.ttl, s.mid FROM messages_seq as s LEFT JOIN randoms_v2 as r ON r.mid = s.mid LEFT JOIN messages_v2 as m ON m.mid = s.mid WHERE m.uid = " + E + " AND m.out = 1 AND s.seq_out >= " + i13 + " AND s.seq_out <= " + i14 + " ORDER BY seq_out ASC", new Object[0]);
                        while (queryFinalized3.next()) {
                            long longValue = queryFinalized3.longValue(b);
                            if (longValue == 0) {
                                longValue = Utilities.b.nextLong();
                            }
                            int intValue2 = queryFinalized3.intValue(2);
                            int intValue3 = queryFinalized3.intValue(i10);
                            int intValue4 = queryFinalized3.intValue(5);
                            NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                c = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                i4 = i13;
                                i5 = i14;
                                c.readAttachPath(byteBufferValue, wx9Var2.getUserConfig().n);
                                byteBufferValue.reuse();
                                c.random_id = longValue;
                                c.dialog_id = E;
                                c.seq_in = intValue2;
                                c.seq_out = intValue3;
                                c.ttl = queryFinalized3.intValue(4);
                                encryptedChat2 = encryptedChat3;
                                i6 = intValue3;
                            } else {
                                encryptedChat2 = encryptedChat3;
                                i4 = i13;
                                i5 = i14;
                                c = wx9Var2.c(intValue4, intValue3, intValue2, longValue, encryptedChat2);
                                i6 = intValue3;
                            }
                            arrayList2.add(c);
                            sparseArray.remove(i6);
                            i13 = i4;
                            encryptedChat3 = encryptedChat2;
                            i14 = i5;
                            i10 = 3;
                            b = 1;
                        }
                        TLRPC.EncryptedChat encryptedChat4 = encryptedChat3;
                        int i15 = i13;
                        int i16 = i14;
                        queryFinalized3.dispose();
                        if (sparseArray.size() != 0) {
                            int i17 = 0;
                            while (i17 < sparseArray.size()) {
                                int keyAt = sparseArray.keyAt(i17);
                                arrayList2.add(wx9Var2.c(wx9Var2.getUserConfig().i(), keyAt, keyAt + 1, Utilities.b.nextLong(), encryptedChat4));
                                i17++;
                                wx9Var2 = wx9Var2;
                                encryptedChat4 = encryptedChat4;
                            }
                            wx9Var = wx9Var2;
                            encryptedChat = encryptedChat4;
                            wx9Var.getUserConfig().u(false);
                        } else {
                            wx9Var = wx9Var2;
                            encryptedChat = encryptedChat4;
                        }
                        Collections.sort(arrayList2, new qq7((byte) 20));
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(encryptedChat);
                        hl.c3(new tx9(wx9Var, arrayList2, (byte) 0));
                        r7a sendMessagesHelper = wx9Var.getSendMessagesHelper();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        sendMessagesHelper.getClass();
                        hl.c3(new z87((Object) sendMessagesHelper, (Object) arrayList4, (Object) arrayList5, (Object) arrayList3, (Object) arrayList2, (Object) null, (byte) 1));
                        SQLiteDatabase sQLiteDatabase4 = wx9Var.getMessagesStorage().b;
                        Locale locale5 = Locale.US;
                        sQLiteDatabase4.executeFast("REPLACE INTO requested_holes VALUES(" + encryptedChat.id + ", " + i15 + ", " + i16 + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    e = e4;
                    z6 = 1;
                }
                break;
            case 15:
                wua wuaVar = (wua) this.d;
                dza dzaVar = new dza(wuaVar.getContext(), wuaVar.J0, this.b, 11, null, new y09((Object) wuaVar, (Object) new boolean[]{false}, this.c, this.e, (byte) 5), 0L);
                dzaVar.setOnDismissListener(new rsa(wuaVar, b));
                dzaVar.show();
                return;
            case 16:
                r7b r7bVar = (r7b) this.d;
                long j22 = this.b;
                long j23 = this.c;
                p7b p7bVar = (p7b) this.e;
                try {
                    jArr = new long[]{j22};
                    jArr2 = r7b.y;
                    i7 = 0;
                    pm3Var2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    pm3Var = null;
                }
                for (int i18 = 2; i7 < i18; i18 = 2) {
                    try {
                        long j24 = jArr2[i7];
                        int i19 = (j23 <= j22 || j23 > (j22 + j24) + 500) ? i11 : 1;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (i19 != 0) {
                            long j25 = j22;
                            i8 = i7;
                            j3 = j25;
                            j2 = j23;
                        } else {
                            j2 = j22 + j24;
                            long j26 = j22;
                            i8 = i7;
                            j3 = j26;
                        }
                        long[] jArr3 = jArr;
                        float[] b2 = r7bVar.b(p7bVar, j3, j2, jArr3);
                        p7b p7bVar2 = p7bVar;
                        long j27 = j3;
                        int i20 = i11;
                        float f3 = 0.0f;
                        while (true) {
                            if (b2 != null) {
                                i9 = i11;
                                if (i20 < b2.length) {
                                    f3 = Math.max(f3, Math.abs(b2[i20]));
                                    i20 += 7;
                                    i11 = i9;
                                }
                            } else {
                                i9 = i11;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("captions: ");
                        sb2.append(b2 == null ? "no audio" : (b2.length / 16) + " ms of audio (peak " + Math.round(f3 * 100.0f) + "%)");
                        sb2.append(" from ");
                        sb2.append(j27);
                        sb2.append(" ms, decoded in ");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        sb2.append(" ms");
                        Log.d("Dictation", sb2.toString());
                        if (b2 != null && !r7bVar.h) {
                            nm3[] nm3VarArr = DictationAsr.a;
                            DictationLid.a(a.b);
                            pm3 X = DictationAsr.X(null);
                            pm3Var2 = (X == null || b2.length == 0 || (r = DictationAsr.r(b2, X)) == X) ? null : r;
                            if (pm3Var2 == null && i19 == 0 && b2.length / 16 >= j24 - 2000) {
                                i7 = i8 + 1;
                                j22 = j27;
                                p7bVar = p7bVar2;
                                i11 = i9;
                                jArr = jArr3;
                            }
                        }
                        pm3Var = pm3Var2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("captions: ");
                        sb3.append(pm3Var == null ? "can be made, " + pm3Var : "can't be made (no speech in a language with a model)");
                        Log.d("Dictation", sb3.toString());
                    } catch (Throwable th4) {
                        th = th4;
                        pm3Var = pm3Var2;
                        Log.e("Dictation", "captions: can't hear the video", th);
                        cc4.g(th, true);
                        hl.c3(new z3b(r7bVar, pm3Var, (byte) 20));
                        return;
                    }
                    hl.c3(new z3b(r7bVar, pm3Var, (byte) 20));
                    return;
                }
                pm3Var = pm3Var2;
                StringBuilder sb32 = new StringBuilder();
                sb32.append("captions: ");
                if (pm3Var == null) {
                }
                sb32.append(pm3Var == null ? "can be made, " + pm3Var : "can't be made (no speech in a language with a model)");
                Log.d("Dictation", sb32.toString());
                hl.c3(new z3b(r7bVar, pm3Var, (byte) 20));
                return;
            default:
                k7b k7bVar = (k7b) this.d;
                String str4 = (String) this.e;
                long j28 = this.b;
                long j29 = this.c;
                vfc vfcVar = (vfc) k7bVar.c;
                String str5 = gcc.a;
                ea3 ea3Var2 = ((n64) vfcVar).a.s;
                uj U2 = ea3Var2.U();
                ea3Var2.V(U2, 1016, new aa3(U2, str4, j29, j28));
                return;
        }
    }

    public /* synthetic */ o30(Object obj, long j, TLObject tLObject, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = tLObject;
        this.c = j2;
    }

    public /* synthetic */ o30(Object obj, Object obj2, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = j2;
    }
}
