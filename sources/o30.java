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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(3:7|8|9)|(19:11|12|(1:68)(1:16)|17|(1:19)(1:67)|20|21|(1:(2:23|(1:25)(1:26))(2:65|66))|27|(1:29)(1:64)|30|(3:34|(1:61)|(1:45))|47|48|49|(1:51)(1:56)|52|53|54)|72|47|48|49|(0)(0)|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[Catch: all -> 0x0152, TryCatch #2 {all -> 0x0152, blocks: (B:49:0x0129, B:51:0x0133, B:52:0x0147), top: B:48:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
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
        SparseArray sparseArray;
        ArrayList arrayList;
        TLRPC.TL_messageService c;
        pm3 pm3Var;
        long[] jArr;
        long[] jArr2;
        int i4;
        pm3 pm3Var2;
        int i5;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        switch (this.a) {
            case 0:
                lh2 lh2Var = (lh2) this.d;
                String str = (String) this.e;
                long j2 = this.b;
                long j3 = this.c;
                p30 p30Var = (p30) lh2Var.c;
                String str2 = gcc.a;
                ea3 ea3Var = ((n64) p30Var).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1008, new uy2(U, str, j3, j2));
                return;
            case 1:
                ((oc2) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 2:
                uj3 uj3Var = (uj3) this.d;
                long j4 = this.b;
                long j5 = this.c;
                tzb tzbVar = (tzb) this.e;
                if (uj3Var.E2 == null) {
                    uj3Var.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(jf7.a(j4, j5));
                uj3Var.E2.q(uj3Var, arrayList2, null, false, uj3Var.L2, uj3Var.M2, uj3Var.N2, tzbVar);
                if (uj3Var.k2) {
                    uj3Var.E2 = null;
                    return;
                }
                return;
            case 3:
                nd4 nd4Var = (nd4) this.d;
                Float f = (Float) this.e;
                long j6 = this.b;
                long j7 = this.c;
                boolean[] zArr = nd4Var.R;
                if (f != null && nd4Var.G != 0 && j6 == 0) {
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
                                nd4Var.G = (long) (j7 / f.floatValue());
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
                if (nd4Var.G == 0 || j6 == 0) {
                    j = 0;
                } else {
                    nd4Var.G = 0L;
                    nd4Var.t = j6;
                    nd4Var.a();
                    if (!nd4Var.P && nd4Var.J) {
                        nd4Var.f();
                    }
                    j = 0;
                }
                if (j6 <= j) {
                    j6 = j7;
                }
                nd4Var.O = j6;
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
                long j8 = this.b;
                long j9 = this.c;
                zu1 zu1Var = (zu1) this.e;
                String str3 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f2 = uc7.s1(launchActivity.P).h4.f(j8, j9);
                StringBuilder o = ik8.o(j8, "LaunchActivity openForum after load ", " ");
                o.append(j9);
                o.append(" TL_forumTopic ");
                o.append(f2);
                cc4.b(o.toString());
                if (launchActivity.p0 != null) {
                    ro4.a(zu1Var, jf7.a(-j8, j9));
                    ((ActionBarLayout) launchActivity.N()).S(zu1Var);
                    return;
                }
                return;
            case 6:
                ((o96) this.d).m(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 7:
                ls6 ls6Var = (ls6) this.d;
                long j10 = this.b;
                long j11 = this.c;
                TLRPC.Message message = (TLRPC.Message) this.e;
                zh6 zh6Var = ls6Var.v1;
                zh6 zh6Var2 = (zh6) ls6Var.u1.f(j10);
                TLRPC.DraftMessage draftMessage = zh6Var2 != null ? (TLRPC.DraftMessage) zh6Var2.f(j11) : null;
                if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
                    return;
                }
                zh6 zh6Var3 = (zh6) zh6Var.f(j10);
                zh6 zh6Var4 = zh6Var3;
                if (zh6Var3 == null) {
                    zh6 zh6Var5 = new zh6();
                    zh6Var.k(j10, zh6Var5);
                    zh6Var4 = zh6Var5;
                }
                zh6Var4.k(j11, message);
                SerializedData serializedData = new SerializedData(message.getObjectSize());
                message.serializeToStream(serializedData);
                SharedPreferences.Editor edit = ls6Var.w1.edit();
                if (j11 == 0) {
                    sb = qu6.n(j10, "r_");
                } else {
                    StringBuilder o2 = ik8.o(j10, "rt_", "_");
                    o2.append(j11);
                    sb = o2.toString();
                }
                edit.putString(sb, Utilities.f(serializedData.toByteArray())).commit();
                ls6Var.getNotificationCenter().k(86, Long.valueOf(j10));
                serializedData.cleanup();
                return;
            case 8:
                ((ls6) this.d).R0(this.b, this.c, (ArrayList) this.e, false);
                return;
            case 9:
                ((kf7) this.d).getMessagesController().Y(null, null, null, this.b, true, 1, false, this.c, (TLRPC.TL_messages_deleteScheduledMessages) this.e, 0);
                return;
            case 10:
                ((kf7) this.d).getMessagesController().s3(this.b, (TLRPC.InputPeer) this.e, this.c);
                return;
            case 11:
                kf7 kf7Var = (kf7) this.d;
                long j12 = this.b;
                long j13 = this.c;
                cn1 cn1Var = (cn1) this.e;
                try {
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    if (j12 != 0) {
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(+mid) FROM messages_topics WHERE uid = " + j13 + " AND topic_id = " + j12 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                        i = 0;
                    } else {
                        Locale locale2 = Locale.US;
                        i = 0;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(+mid) FROM messages_v2 WHERE uid = " + j13 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                    }
                    sQLiteCursor = queryFinalized;
                    try {
                        try {
                            int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(i) : 0;
                            sQLiteCursor.dispose();
                            hl.c3(new oe7((Object) cn1Var, intValue, (byte) 0));
                        } catch (Exception e) {
                            e = e;
                            z4 = true;
                            kf7Var.p(e, z4);
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
                long j14 = this.b;
                long j15 = this.c;
                TLRPC.PeerNotifySettings peerNotifySettings = (TLRPC.PeerNotifySettings) this.e;
                String p = ip7.p(j14, j15, true);
                int i10 = wp7Var.a;
                uc7 s1 = uc7.s1(i10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                kf7 a0 = kf7.a0(i10);
                ip7 n = ip7.n(i10);
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
                TLRPC.Dialog dialog = j15 == 0 ? (TLRPC.Dialog) s1.R.f(j14) : null;
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
                    if (j15 == 0) {
                        a0.G1(j14, 0L);
                    }
                } else if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime()) {
                    if (peerNotifySettings.mute_until > connectionsManager.getCurrentTime() + 31536000) {
                        if (g != 2) {
                            edit2.putInt("notify2_" + p, 2);
                            if (dialog != null) {
                                dialog.notify_settings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        i3 = 0;
                    } else {
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
                    }
                    if (j15 == 0) {
                        a0.G1(j14, (i3 << 32) | 1);
                        n.N(j14);
                    }
                } else {
                    if (g == 0 || g == 1) {
                        z5 = false;
                    } else {
                        if (dialog != null) {
                            TLRPC.PeerNotifySettings peerNotifySettings2 = dialog.notify_settings;
                            i2 = 0;
                            peerNotifySettings2.mute_until = 0;
                        } else {
                            i2 = 0;
                        }
                        edit2.putInt("notify2_" + p, i2);
                        z5 = true;
                    }
                    if (j15 == 0) {
                        a0.G1(j14, 0L);
                    }
                }
                wp7Var.a(peerNotifySettings.android_sound, edit2, j14, j15, 0);
                edit2.apply();
                if (z5) {
                    hl.c3(new ge7(wp7Var, (byte) 11));
                    return;
                }
                return;
            case 13:
                jp9 jp9Var = (jp9) this.d;
                fp9 fp9Var = (fp9) this.e;
                long j16 = this.b;
                long j17 = this.c;
                synchronized (jp9Var.g) {
                    if (fp9Var.d || fp9Var.e) {
                        return;
                    }
                    ((hkb) jp9Var.e).a(fp9Var.a, fp9Var.b, j16, j17);
                    return;
                }
            case 14:
                Object obj = null;
                wx9 wx9Var = (wx9) this.d;
                long j18 = this.b;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.e;
                long j19 = this.c;
                try {
                    if (encryptedChat.admin_id == wx9Var.getUserConfig().e() && (j18 & 1) == 0) {
                        j18++;
                    }
                    if (j18 <= j19) {
                        int i11 = (int) j18;
                        int i12 = (int) j19;
                        SQLiteDatabase sQLiteDatabase2 = wx9Var.getMessagesStorage().b;
                        Locale locale3 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + encryptedChat.id + " AND ((seq_out_start >= " + i11 + " AND " + i11 + " <= seq_out_end) OR (seq_out_start >= " + i12 + " AND " + i12 + " <= seq_out_end))", new Object[0]);
                        boolean next = queryFinalized2.next();
                        queryFinalized2.dispose();
                        if (next) {
                            return;
                        }
                        long E = wf3.E(encryptedChat.id);
                        SparseArray sparseArray2 = new SparseArray();
                        ArrayList arrayList3 = new ArrayList();
                        while (j18 <= j19) {
                            sparseArray2.put((int) j18, obj);
                            j18 += 2;
                            obj = null;
                        }
                        SQLiteDatabase sQLiteDatabase3 = wx9Var.getMessagesStorage().b;
                        Locale locale4 = Locale.US;
                        SQLiteCursor queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT m.data, r.random_id, s.seq_in, s.seq_out, m.ttl, s.mid FROM messages_seq as s LEFT JOIN randoms_v2 as r ON r.mid = s.mid LEFT JOIN messages_v2 as m ON m.mid = s.mid WHERE m.uid = " + E + " AND m.out = 1 AND s.seq_out >= " + i11 + " AND s.seq_out <= " + i12 + " ORDER BY seq_out ASC", new Object[0]);
                        while (queryFinalized3.next()) {
                            long longValue = queryFinalized3.longValue(1);
                            if (longValue == 0) {
                                longValue = Utilities.b.nextLong();
                            }
                            long j20 = longValue;
                            SparseArray sparseArray3 = sparseArray2;
                            int intValue2 = queryFinalized3.intValue(2);
                            int intValue3 = queryFinalized3.intValue(i6);
                            int intValue4 = queryFinalized3.intValue(5);
                            NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, wx9Var.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.random_id = j20;
                                TLdeserialize.dialog_id = E;
                                TLdeserialize.seq_in = intValue2;
                                TLdeserialize.seq_out = intValue3;
                                TLdeserialize.ttl = queryFinalized3.intValue(4);
                                c = TLdeserialize;
                                wx9Var = wx9Var;
                                arrayList = arrayList3;
                                sparseArray = sparseArray3;
                            } else {
                                sparseArray = sparseArray3;
                                arrayList = arrayList3;
                                c = wx9Var.c(intValue4, intValue3, intValue2, j20, encryptedChat);
                            }
                            arrayList.add(c);
                            sparseArray.remove(intValue3);
                            sparseArray2 = sparseArray;
                            arrayList3 = arrayList;
                            i6 = 3;
                        }
                        SparseArray sparseArray4 = sparseArray2;
                        ArrayList arrayList4 = arrayList3;
                        queryFinalized3.dispose();
                        if (sparseArray4.size() != 0) {
                            for (int i13 = 0; i13 < sparseArray4.size(); i13++) {
                                int keyAt = sparseArray4.keyAt(i13);
                                arrayList4.add(wx9Var.c(wx9Var.getUserConfig().i(), keyAt, keyAt + 1, Utilities.b.nextLong(), encryptedChat));
                            }
                            wx9Var.getUserConfig().u(false);
                        }
                        Collections.sort(arrayList4, new qq7((byte) 20));
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(encryptedChat);
                        hl.c3(new tx9(wx9Var, arrayList4, (byte) 0));
                        r7a sendMessagesHelper = wx9Var.getSendMessagesHelper();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        sendMessagesHelper.getClass();
                        hl.c3(new z87((Object) sendMessagesHelper, (Object) arrayList6, (Object) arrayList7, (Object) arrayList5, (Object) arrayList4, (Object) null, (byte) 1));
                        SQLiteDatabase sQLiteDatabase4 = wx9Var.getMessagesStorage().b;
                        Locale locale5 = Locale.US;
                        sQLiteDatabase4.executeFast("REPLACE INTO requested_holes VALUES(" + encryptedChat.id + ", " + i11 + ", " + i12 + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 15:
                wua wuaVar = (wua) this.d;
                dza dzaVar = new dza(wuaVar.getContext(), wuaVar.J0, this.b, 11, null, new z09((Object) wuaVar, (Object) new boolean[]{false}, this.c, this.e, (byte) 5), 0L);
                dzaVar.setOnDismissListener(new rsa(wuaVar, (byte) 1));
                dzaVar.show();
                return;
            case 16:
                r7b r7bVar = (r7b) this.d;
                long j21 = this.b;
                long j22 = this.c;
                p7b p7bVar = (p7b) this.e;
                try {
                    jArr = new long[]{j21};
                    jArr2 = r7b.y;
                    i4 = 0;
                    pm3Var2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    pm3Var = null;
                }
                while (i4 < i7) {
                    try {
                        long j23 = jArr2[i4];
                        int i14 = (j22 <= j21 || j22 > (j21 + j23) + 500) ? i9 : i8;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long[] jArr3 = jArr;
                        float[] b = r7bVar.b(p7bVar, j21, i14 != 0 ? j22 : j21 + j23, jArr3);
                        int i15 = i9;
                        float f3 = 0.0f;
                        while (true) {
                            if (b != null) {
                                i5 = i9;
                                if (i15 < b.length) {
                                    f3 = Math.max(f3, Math.abs(b[i15]));
                                    i15 += 7;
                                    i9 = i5;
                                }
                            } else {
                                i5 = i9;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("captions: ");
                        sb2.append(b == null ? "no audio" : (b.length / 16) + " ms of audio (peak " + Math.round(f3 * 100.0f) + "%)");
                        sb2.append(" from ");
                        sb2.append(j21);
                        sb2.append(" ms, decoded in ");
                        sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        sb2.append(" ms");
                        Log.d("Dictation", sb2.toString());
                        if (b != null && !r7bVar.h) {
                            nm3[] nm3VarArr = DictationAsr.a;
                            DictationLid.a(a.b);
                            pm3 X = DictationAsr.X(null);
                            if (X == null || b.length == 0 || (pm3Var2 = DictationAsr.r(b, X)) == X) {
                                pm3Var2 = null;
                            }
                            if (pm3Var2 == null && i14 == 0 && b.length / 16 >= j23 - 2000) {
                                i4++;
                                jArr = jArr3;
                                i9 = i5;
                                i7 = 2;
                                i8 = 1;
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
                        hl.c3(new n3b(r7bVar, pm3Var, (byte) 21));
                        return;
                    }
                    hl.c3(new n3b(r7bVar, pm3Var, (byte) 21));
                    return;
                }
                pm3Var = pm3Var2;
                StringBuilder sb32 = new StringBuilder();
                sb32.append("captions: ");
                if (pm3Var == null) {
                }
                sb32.append(pm3Var == null ? "can be made, " + pm3Var : "can't be made (no speech in a language with a model)");
                Log.d("Dictation", sb32.toString());
                hl.c3(new n3b(r7bVar, pm3Var, (byte) 21));
                return;
            default:
                k7b k7bVar = (k7b) this.d;
                String str4 = (String) this.e;
                long j24 = this.b;
                long j25 = this.c;
                vfc vfcVar = (vfc) k7bVar.c;
                String str5 = gcc.a;
                ea3 ea3Var2 = ((n64) vfcVar).a.s;
                uj U2 = ea3Var2.U();
                ea3Var2.V(U2, 1016, new aa3(U2, str4, j25, j24));
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
