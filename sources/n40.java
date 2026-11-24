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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class n40 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n40(Object obj, long j, long j2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
        this.e = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(3:7|8|9)|(19:11|12|(1:68)(1:16)|17|(1:19)(1:67)|20|21|(1:(2:23|(1:25)(1:26))(2:65|66))|27|(1:29)(1:64)|30|(3:34|(1:61)|(1:45))|47|48|49|(1:51)(1:56)|52|53|54)|72|47|48|49|(0)(0)|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0154, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135 A[Catch: all -> 0x0154, TryCatch #1 {all -> 0x0154, blocks: (B:49:0x012b, B:51:0x0135, B:52:0x0149), top: B:48:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
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
        in3 in3Var;
        long[] jArr;
        long[] jArr2;
        int i4;
        in3 in3Var2;
        int i5;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        switch (this.a) {
            case 0:
                lx6 lx6Var = (lx6) this.d;
                String str = (String) this.e;
                long j2 = this.b;
                long j3 = this.c;
                o40 o40Var = (o40) lx6Var.c;
                String str2 = hac.a;
                xa3 xa3Var = ((c74) o40Var).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1008, new u03(U, str, j3, j2, (byte) 16));
                return;
            case 1:
                ((jd2) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 2:
                nk3 nk3Var = (nk3) this.d;
                long j4 = this.b;
                long j5 = this.c;
                sxb sxbVar = (sxb) this.e;
                if (nk3Var.E2 == null) {
                    nk3Var.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bf7.a(j4, j5));
                nk3Var.E2.q(nk3Var, arrayList2, null, false, nk3Var.L2, nk3Var.M2, nk3Var.N2, sxbVar);
                if (nk3Var.k2) {
                    nk3Var.E2 = null;
                    return;
                }
                return;
            case 3:
                qd4 qd4Var = (qd4) this.d;
                Float f = (Float) this.e;
                long j6 = this.b;
                long j7 = this.c;
                boolean[] zArr = qd4Var.R;
                if (f != null && qd4Var.G != 0 && j6 == 0) {
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
                                qd4Var.G = (long) (j7 / f.floatValue());
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
                if (qd4Var.G == 0 || j6 == 0) {
                    j = 0;
                } else {
                    qd4Var.G = 0L;
                    qd4Var.t = j6;
                    qd4Var.a();
                    if (!qd4Var.P && qd4Var.J) {
                        qd4Var.f();
                    }
                    j = 0;
                }
                if (j6 <= j) {
                    j6 = j7;
                }
                qd4Var.O = j6;
                if (qd4Var.K < qd4Var.e) {
                    qd4Var.d();
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
                yv1 yv1Var = (yv1) this.e;
                String str3 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f2 = oc7.r1(launchActivity.P).g4.f(j8, j9);
                StringBuilder o = wi8.o(j8, "LaunchActivity openForum after load ", " ");
                o.append(j9);
                o.append(" TL_forumTopic ");
                o.append(f2);
                fc4.b(o.toString());
                if (launchActivity.p0 != null) {
                    no4.a(yv1Var, bf7.a(-j8, j9));
                    ((ActionBarLayout) launchActivity.N()).S(yv1Var);
                    return;
                }
                return;
            case 6:
                ((k96) this.d).m(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 7:
                hs6 hs6Var = (hs6) this.d;
                long j10 = this.b;
                long j11 = this.c;
                TLRPC.Message message = (TLRPC.Message) this.e;
                vh6 vh6Var = hs6Var.v1;
                vh6 vh6Var2 = (vh6) hs6Var.u1.f(j10);
                TLRPC.DraftMessage draftMessage = vh6Var2 != null ? (TLRPC.DraftMessage) vh6Var2.f(j11) : null;
                if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
                    return;
                }
                vh6 vh6Var3 = (vh6) vh6Var.f(j10);
                vh6 vh6Var4 = vh6Var3;
                if (vh6Var3 == null) {
                    vh6 vh6Var5 = new vh6();
                    vh6Var.k(vh6Var5, j10);
                    vh6Var4 = vh6Var5;
                }
                vh6Var4.k(message, j11);
                SerializedData serializedData = new SerializedData(message.getObjectSize());
                message.serializeToStream(serializedData);
                SharedPreferences.Editor edit = hs6Var.w1.edit();
                if (j11 == 0) {
                    sb = kt6.n(j10, "r_");
                } else {
                    StringBuilder o2 = wi8.o(j10, "rt_", "_");
                    o2.append(j11);
                    sb = o2.toString();
                }
                edit.putString(sb, Utilities.f(serializedData.toByteArray())).commit();
                hs6Var.getNotificationCenter().k(86, Long.valueOf(j10));
                serializedData.cleanup();
                return;
            case 8:
                ((hs6) this.d).R0(this.b, this.c, (ArrayList) this.e, false);
                return;
            case 9:
                ((cf7) this.d).getMessagesController().W(null, null, null, this.b, true, 1, false, this.c, (TLRPC.TL_messages_deleteScheduledMessages) this.e, 0);
                return;
            case 10:
                ((cf7) this.d).getMessagesController().o3(this.b, (TLRPC.InputPeer) this.e, this.c);
                return;
            case 11:
                cf7 cf7Var = (cf7) this.d;
                long j12 = this.b;
                long j13 = this.c;
                oo1 oo1Var = (oo1) this.e;
                try {
                    SQLiteDatabase sQLiteDatabase = cf7Var.b;
                    if (j12 != 0) {
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(mid) FROM messages_topics WHERE uid = " + j13 + " AND topic_id = " + j12 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                        i = 0;
                    } else {
                        Locale locale2 = Locale.US;
                        i = 0;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT MIN(mid) FROM messages_v2 WHERE uid = " + j13 + " AND mention = 1 AND read_state IN(0, 1)", new Object[0]);
                    }
                    sQLiteCursor = queryFinalized;
                    try {
                        try {
                            int intValue = sQLiteCursor.next() ? sQLiteCursor.intValue(i) : 0;
                            sQLiteCursor.dispose();
                            gm.c3(new ge7((Object) oo1Var, intValue, (byte) 0));
                        } catch (Exception e) {
                            e = e;
                            z4 = true;
                            cf7Var.n(e, z4);
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
                ap7 ap7Var = (ap7) this.d;
                long j14 = this.b;
                long j15 = this.c;
                TLRPC.PeerNotifySettings peerNotifySettings = (TLRPC.PeerNotifySettings) this.e;
                String p = lo7.p(j14, j15, true);
                int i10 = ap7Var.a;
                oc7 r1 = oc7.r1(i10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                cf7 Y = cf7.Y(i10);
                lo7 n = lo7.n(i10);
                int g = kt6.g("notify2_", p, ap7Var.b(), -1);
                int g2 = kt6.g("notifyuntil_", p, ap7Var.b(), 0);
                SharedPreferences.Editor edit2 = ap7Var.b().edit();
                if ((peerNotifySettings.flags & 2) != 0) {
                    edit2.putBoolean(b10.h("silent_", p), peerNotifySettings.silent);
                } else {
                    edit2.remove("silent_" + p);
                }
                if ((peerNotifySettings.flags & 64) != 0) {
                    edit2.putBoolean(b10.h("stories_", p), !peerNotifySettings.stories_muted);
                } else {
                    edit2.remove("stories_" + p);
                }
                TLRPC.Dialog dialog = j15 == 0 ? (TLRPC.Dialog) r1.R.f(j14) : null;
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
                        Y.B1(j14, 0L);
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
                        Y.B1(j14, (i3 << 32) | 1);
                        n.N(j14);
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
                    if (j15 == 0) {
                        Y.B1(j14, 0L);
                    }
                }
                ap7Var.a(peerNotifySettings.android_sound, edit2, j14, j15, 0);
                edit2.apply();
                if (z5) {
                    gm.c3(new kl7(ap7Var, (byte) 3));
                    return;
                }
                return;
            case 13:
                un9 un9Var = (un9) this.d;
                qn9 qn9Var = (qn9) this.e;
                long j16 = this.b;
                long j17 = this.c;
                synchronized (un9Var.g) {
                    if (qn9Var.d || qn9Var.e) {
                        return;
                    }
                    ((mib) un9Var.e).a(qn9Var.a, qn9Var.b, j16, j17);
                    return;
                }
            case 14:
                Object obj = null;
                dw9 dw9Var = (dw9) this.d;
                long j18 = this.b;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.e;
                long j19 = this.c;
                try {
                    if (encryptedChat.admin_id == dw9Var.getUserConfig().e() && (j18 & 1) == 0) {
                        j18++;
                    }
                    if (j18 <= j19) {
                        int i11 = (int) j18;
                        int i12 = (int) j19;
                        SQLiteDatabase sQLiteDatabase2 = dw9Var.getMessagesStorage().b;
                        Locale locale3 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + encryptedChat.id + " AND ((seq_out_start >= " + i11 + " AND " + i11 + " <= seq_out_end) OR (seq_out_start >= " + i12 + " AND " + i12 + " <= seq_out_end))", new Object[0]);
                        boolean next = queryFinalized2.next();
                        queryFinalized2.dispose();
                        if (next) {
                            return;
                        }
                        long E = pg3.E(encryptedChat.id);
                        SparseArray sparseArray2 = new SparseArray();
                        ArrayList arrayList3 = new ArrayList();
                        while (j18 <= j19) {
                            sparseArray2.put((int) j18, obj);
                            j18 += 2;
                            obj = null;
                        }
                        SQLiteDatabase sQLiteDatabase3 = dw9Var.getMessagesStorage().b;
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
                                TLdeserialize.readAttachPath(byteBufferValue, dw9Var.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.random_id = j20;
                                TLdeserialize.dialog_id = E;
                                TLdeserialize.seq_in = intValue2;
                                TLdeserialize.seq_out = intValue3;
                                TLdeserialize.ttl = queryFinalized3.intValue(4);
                                c = TLdeserialize;
                                dw9Var = dw9Var;
                                arrayList = arrayList3;
                                sparseArray = sparseArray3;
                            } else {
                                sparseArray = sparseArray3;
                                arrayList = arrayList3;
                                c = dw9Var.c(intValue4, intValue3, intValue2, j20, encryptedChat);
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
                                arrayList4.add(dw9Var.c(dw9Var.getUserConfig().i(), keyAt, keyAt + 1, Utilities.b.nextLong(), encryptedChat));
                            }
                            dw9Var.getUserConfig().u(false);
                        }
                        Collections.sort(arrayList4, new qx7((byte) 19));
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(encryptedChat);
                        gm.c3(new bw9(dw9Var, arrayList4, (byte) 0));
                        a6a sendMessagesHelper = dw9Var.getSendMessagesHelper();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        sendMessagesHelper.getClass();
                        gm.c3(new e77((Object) sendMessagesHelper, (Object) arrayList6, (Object) arrayList7, (Object) arrayList5, (Object) arrayList4, (Object) null, (byte) 1));
                        SQLiteDatabase sQLiteDatabase4 = dw9Var.getMessagesStorage().b;
                        Locale locale5 = Locale.US;
                        sQLiteDatabase4.executeFast("REPLACE INTO requested_holes VALUES(" + encryptedChat.id + ", " + i11 + ", " + i12 + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            case 15:
                wsa wsaVar = (wsa) this.d;
                dxa dxaVar = new dxa(wsaVar.getContext(), wsaVar.J0, this.b, 11, null, new nz8((Object) wsaVar, (Object) new boolean[]{false}, this.c, this.e, (byte) 5), 0L);
                dxaVar.setOnDismissListener(new qqa(wsaVar, (byte) 1));
                dxaVar.show();
                return;
            case 16:
                v5b v5bVar = (v5b) this.d;
                long j21 = this.b;
                long j22 = this.c;
                t5b t5bVar = (t5b) this.e;
                try {
                    jArr = new long[]{j21};
                    jArr2 = v5b.y;
                    i4 = 0;
                    in3Var2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    in3Var = null;
                }
                while (i4 < i7) {
                    try {
                        long j23 = jArr2[i4];
                        int i14 = (j22 <= j21 || j22 > (j21 + j23) + 500) ? i9 : i8;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long[] jArr3 = jArr;
                        float[] b = v5bVar.b(t5bVar, j21, i14 != 0 ? j22 : j21 + j23, jArr3);
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
                        if (b != null && !v5bVar.h) {
                            gn3[] gn3VarArr = DictationAsr.a;
                            DictationLid.a(a.b);
                            in3 V = DictationAsr.V(null);
                            if (V == null || b.length == 0 || (in3Var2 = DictationAsr.q(b, V)) == V) {
                                in3Var2 = null;
                            }
                            if (in3Var2 == null && i14 == 0 && b.length / 16 >= j23 - 2000) {
                                i4++;
                                jArr = jArr3;
                                i9 = i5;
                                i7 = 2;
                                i8 = 1;
                            }
                        }
                        in3Var = in3Var2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("captions: ");
                        sb3.append(in3Var == null ? "can be made, " + in3Var : "can't be made (no speech in a language with a model)");
                        Log.d("Dictation", sb3.toString());
                    } catch (Throwable th4) {
                        th = th4;
                        in3Var = in3Var2;
                        Log.e("Dictation", "captions: can't hear the video", th);
                        fc4.g(th, true);
                        gm.c3(new uva(v5bVar, in3Var, (byte) 25));
                        return;
                    }
                    gm.c3(new uva(v5bVar, in3Var, (byte) 25));
                    return;
                }
                in3Var = in3Var2;
                StringBuilder sb32 = new StringBuilder();
                sb32.append("captions: ");
                if (in3Var == null) {
                }
                sb32.append(in3Var == null ? "can be made, " + in3Var : "can't be made (no speech in a language with a model)");
                Log.d("Dictation", sb32.toString());
                gm.c3(new uva(v5bVar, in3Var, (byte) 25));
                return;
            default:
                xab xabVar = (xab) this.d;
                String str4 = (String) this.e;
                long j24 = this.b;
                long j25 = this.c;
                ydc ydcVar = (ydc) xabVar.c;
                String str5 = hac.a;
                xa3 xa3Var2 = ((c74) ydcVar).a.s;
                tk U2 = xa3Var2.U();
                xa3Var2.V(U2, 1016, new u03(U2, str4, j25, j24, (byte) 29));
                return;
        }
    }

    public /* synthetic */ n40(Object obj, long j, TLObject tLObject, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = tLObject;
        this.c = j2;
    }

    public /* synthetic */ n40(Object obj, Object obj2, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = j2;
    }
}
