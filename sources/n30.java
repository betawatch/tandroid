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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class n30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n30(Object obj, long j, long j2, Object obj2, byte b) {
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
    /* JADX WARN: Removed duplicated region for block: B:226:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135 A[Catch: all -> 0x0154, TryCatch #2 {all -> 0x0154, blocks: (B:49:0x012b, B:51:0x0135, B:52:0x0149), top: B:48:0x012b }] */
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
        xl3 xl3Var;
        long[] jArr;
        long[] jArr2;
        int i4;
        xl3 xl3Var2;
        int i5;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        switch (this.a) {
            case 0:
                tg2 tg2Var = (tg2) this.d;
                String str = (String) this.e;
                long j2 = this.b;
                long j3 = this.c;
                o30 o30Var = (o30) tg2Var.c;
                String str2 = g8c.a;
                l93 l93Var = ((t54) o30Var).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1008, new jz2(U, str, j3, j2, (byte) 15));
                return;
            case 1:
                ((yb2) this.d).e(this.b, this.c, (HashSet) this.e);
                return;
            case 2:
                cj3 cj3Var = (cj3) this.d;
                long j4 = this.b;
                long j5 = this.c;
                qvb qvbVar = (qvb) this.e;
                if (cj3Var.E2 == null) {
                    cj3Var.finishFragment();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(zc7.a(j4, j5));
                cj3Var.E2.r(cj3Var, arrayList2, null, false, cj3Var.L2, cj3Var.M2, cj3Var.N2, qvbVar);
                if (cj3Var.k2) {
                    cj3Var.E2 = null;
                    return;
                }
                return;
            case 3:
                qb4 qb4Var = (qb4) this.d;
                Float f = (Float) this.e;
                long j6 = this.b;
                long j7 = this.c;
                boolean[] zArr = qb4Var.R;
                if (f != null && qb4Var.G != 0 && j6 == 0) {
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
                                qb4Var.G = (long) (j7 / f.floatValue());
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
                if (qb4Var.G == 0 || j6 == 0) {
                    j = 0;
                } else {
                    qb4Var.G = 0L;
                    qb4Var.t = j6;
                    qb4Var.a();
                    if (!qb4Var.P && qb4Var.J) {
                        qb4Var.f();
                    }
                    j = 0;
                }
                if (j6 <= j) {
                    j6 = j7;
                }
                qb4Var.O = j6;
                if (qb4Var.K < qb4Var.e) {
                    qb4Var.d();
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
                mu1 mu1Var = (mu1) this.e;
                String str3 = LaunchActivity.C1;
                TLRPC.TL_forumTopic f2 = na7.q1(launchActivity.P).g4.f(j8, j9);
                StringBuilder o = ug8.o(j8, "LaunchActivity openForum after load ", " ");
                o.append(j9);
                o.append(" TL_forumTopic ");
                o.append(f2);
                fa4.b(o.toString());
                if (launchActivity.p0 != null) {
                    mm4.a(mu1Var, zc7.a(-j8, j9));
                    ((ActionBarLayout) launchActivity.N()).S(mu1Var);
                    return;
                }
                return;
            case 6:
                ((k76) this.d).m(this.b, (TLRPC.TL_textWithEntities) this.e, this.c);
                return;
            case 7:
                hq6 hq6Var = (hq6) this.d;
                long j10 = this.b;
                long j11 = this.c;
                TLRPC.Message message = (TLRPC.Message) this.e;
                vf6 vf6Var = hq6Var.v1;
                vf6 vf6Var2 = (vf6) hq6Var.u1.f(j10);
                TLRPC.DraftMessage draftMessage = vf6Var2 != null ? (TLRPC.DraftMessage) vf6Var2.f(j11) : null;
                if (draftMessage == null || (inputReplyTo = draftMessage.reply_to) == null || inputReplyTo.reply_to_msg_id != message.id) {
                    return;
                }
                vf6 vf6Var3 = (vf6) vf6Var.f(j10);
                vf6 vf6Var4 = vf6Var3;
                if (vf6Var3 == null) {
                    vf6 vf6Var5 = new vf6();
                    vf6Var.k(vf6Var5, j10);
                    vf6Var4 = vf6Var5;
                }
                vf6Var4.k(message, j11);
                SerializedData serializedData = new SerializedData(message.getObjectSize());
                message.serializeToStream(serializedData);
                SharedPreferences.Editor edit = hq6Var.w1.edit();
                if (j11 == 0) {
                    sb = ls6.n(j10, "r_");
                } else {
                    StringBuilder o2 = ug8.o(j10, "rt_", "_");
                    o2.append(j11);
                    sb = o2.toString();
                }
                edit.putString(sb, Utilities.f(serializedData.toByteArray())).commit();
                hq6Var.getNotificationCenter().k(85, Long.valueOf(j10));
                serializedData.cleanup();
                return;
            case 8:
                ((hq6) this.d).R0(this.b, this.c, (ArrayList) this.e, false);
                return;
            case 9:
                ((ad7) this.d).getMessagesController().W(null, null, null, this.b, true, 1, false, this.c, (TLRPC.TL_messages_deleteScheduledMessages) this.e, 0);
                return;
            case 10:
                ((ad7) this.d).getMessagesController().m3(this.b, (TLRPC.InputPeer) this.e, this.c);
                return;
            case 11:
                ad7 ad7Var = (ad7) this.d;
                long j12 = this.b;
                long j13 = this.c;
                an1 an1Var = (an1) this.e;
                try {
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
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
                            gl.c3(new sm3((Object) an1Var, intValue, (byte) 28));
                        } catch (Exception e) {
                            e = e;
                            z4 = true;
                            ad7Var.n(e, z4);
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
                wm7 wm7Var = (wm7) this.d;
                long j14 = this.b;
                long j15 = this.c;
                TLRPC.PeerNotifySettings peerNotifySettings = (TLRPC.PeerNotifySettings) this.e;
                String p = im7.p(j14, j15, true);
                int i10 = wm7Var.a;
                na7 q1 = na7.q1(i10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                ad7 Y = ad7.Y(i10);
                im7 n = im7.n(i10);
                int g = ls6.g("notify2_", p, wm7Var.b(), -1);
                int g2 = ls6.g("notifyuntil_", p, wm7Var.b(), 0);
                SharedPreferences.Editor edit2 = wm7Var.b().edit();
                if ((peerNotifySettings.flags & 2) != 0) {
                    edit2.putBoolean(b00.h("silent_", p), peerNotifySettings.silent);
                } else {
                    edit2.remove("silent_" + p);
                }
                if ((peerNotifySettings.flags & 64) != 0) {
                    edit2.putBoolean(b00.h("stories_", p), !peerNotifySettings.stories_muted);
                } else {
                    edit2.remove("stories_" + p);
                }
                TLRPC.Dialog dialog = j15 == 0 ? (TLRPC.Dialog) q1.R.f(j14) : null;
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
                        Y.B1(j14, 0L);
                    }
                }
                wm7Var.a(peerNotifySettings.android_sound, edit2, j14, j15, 0);
                edit2.apply();
                if (z5) {
                    gl.c3(new vl6(wm7Var, (byte) 26));
                    return;
                }
                return;
            case 13:
                ul9 ul9Var = (ul9) this.d;
                ql9 ql9Var = (ql9) this.e;
                long j16 = this.b;
                long j17 = this.c;
                synchronized (ul9Var.g) {
                    if (ql9Var.d || ql9Var.e) {
                        return;
                    }
                    ((lgb) ul9Var.e).a(ql9Var.a, ql9Var.b, j16, j17);
                    return;
                }
            case 14:
                Object obj = null;
                bu9 bu9Var = (bu9) this.d;
                long j18 = this.b;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.e;
                long j19 = this.c;
                try {
                    if (encryptedChat.admin_id == bu9Var.getUserConfig().e() && (j18 & 1) == 0) {
                        j18++;
                    }
                    if (j18 <= j19) {
                        int i11 = (int) j18;
                        int i12 = (int) j19;
                        SQLiteDatabase sQLiteDatabase2 = bu9Var.getMessagesStorage().b;
                        Locale locale3 = Locale.US;
                        SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + encryptedChat.id + " AND ((seq_out_start >= " + i11 + " AND " + i11 + " <= seq_out_end) OR (seq_out_start >= " + i12 + " AND " + i12 + " <= seq_out_end))", new Object[0]);
                        boolean next = queryFinalized2.next();
                        queryFinalized2.dispose();
                        if (next) {
                            return;
                        }
                        long E = cf3.E(encryptedChat.id);
                        SparseArray sparseArray2 = new SparseArray();
                        ArrayList arrayList3 = new ArrayList();
                        while (j18 <= j19) {
                            sparseArray2.put((int) j18, obj);
                            j18 += 2;
                            obj = null;
                        }
                        SQLiteDatabase sQLiteDatabase3 = bu9Var.getMessagesStorage().b;
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
                                TLdeserialize.readAttachPath(byteBufferValue, bu9Var.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.random_id = j20;
                                TLdeserialize.dialog_id = E;
                                TLdeserialize.seq_in = intValue2;
                                TLdeserialize.seq_out = intValue3;
                                TLdeserialize.ttl = queryFinalized3.intValue(4);
                                c = TLdeserialize;
                                bu9Var = bu9Var;
                                arrayList = arrayList3;
                                sparseArray = sparseArray3;
                            } else {
                                sparseArray = sparseArray3;
                                arrayList = arrayList3;
                                c = bu9Var.c(intValue4, intValue3, intValue2, j20, encryptedChat);
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
                                arrayList4.add(bu9Var.c(bu9Var.getUserConfig().i(), keyAt, keyAt + 1, Utilities.b.nextLong(), encryptedChat));
                            }
                            bu9Var.getUserConfig().u(false);
                        }
                        Collections.sort(arrayList4, new fx7((byte) 18));
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(encryptedChat);
                        gl.c3(new zt9(bu9Var, arrayList4, (byte) 0));
                        z3a sendMessagesHelper = bu9Var.getSendMessagesHelper();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        sendMessagesHelper.getClass();
                        gl.c3(new e57((Object) sendMessagesHelper, (Object) arrayList6, (Object) arrayList7, (Object) arrayList5, (Object) arrayList4, (Object) null, (byte) 1));
                        SQLiteDatabase sQLiteDatabase4 = bu9Var.getMessagesStorage().b;
                        Locale locale5 = Locale.US;
                        sQLiteDatabase4.executeFast("REPLACE INTO requested_holes VALUES(" + encryptedChat.id + ", " + i11 + ", " + i12 + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 15:
                vqa vqaVar = (vqa) this.d;
                zua zuaVar = new zua(vqaVar.getContext(), vqaVar.J0, this.b, 11, null, new mx8((Object) vqaVar, (Object) new boolean[]{false}, this.c, this.e, (byte) 5), 0L);
                zuaVar.setOnDismissListener(new qoa(vqaVar, (byte) 1));
                zuaVar.show();
                return;
            case 16:
                u3b u3bVar = (u3b) this.d;
                long j21 = this.b;
                long j22 = this.c;
                s3b s3bVar = (s3b) this.e;
                try {
                    jArr = new long[]{j21};
                    jArr2 = u3b.y;
                    i4 = 0;
                    xl3Var2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    xl3Var = null;
                }
                while (i4 < i7) {
                    try {
                        long j23 = jArr2[i4];
                        int i14 = (j22 <= j21 || j22 > (j21 + j23) + 500) ? i9 : i8;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long[] jArr3 = jArr;
                        float[] b = u3bVar.b(s3bVar, j21, i14 != 0 ? j22 : j21 + j23, jArr3);
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
                        if (b != null && !u3bVar.h) {
                            vl3[] vl3VarArr = DictationAsr.a;
                            DictationLid.a(a.b);
                            xl3 V = DictationAsr.V(null);
                            if (V == null || b.length == 0 || (xl3Var2 = DictationAsr.q(b, V)) == V) {
                                xl3Var2 = null;
                            }
                            if (xl3Var2 == null && i14 == 0 && b.length / 16 >= j23 - 2000) {
                                i4++;
                                jArr = jArr3;
                                i9 = i5;
                                i7 = 2;
                                i8 = 1;
                            }
                        }
                        xl3Var = xl3Var2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("captions: ");
                        sb3.append(xl3Var == null ? "can be made, " + xl3Var : "can't be made (no speech in a language with a model)");
                        Log.d("Dictation", sb3.toString());
                    } catch (Throwable th4) {
                        th = th4;
                        xl3Var = xl3Var2;
                        Log.e("Dictation", "captions: can't hear the video", th);
                        fa4.g(th, true);
                        gl.c3(new iya(u3bVar, xl3Var, (byte) 23));
                        return;
                    }
                    gl.c3(new iya(u3bVar, xl3Var, (byte) 23));
                    return;
                }
                xl3Var = xl3Var2;
                StringBuilder sb32 = new StringBuilder();
                sb32.append("captions: ");
                if (xl3Var == null) {
                }
                sb32.append(xl3Var == null ? "can be made, " + xl3Var : "can't be made (no speech in a language with a model)");
                Log.d("Dictation", sb32.toString());
                gl.c3(new iya(u3bVar, xl3Var, (byte) 23));
                return;
            default:
                v8b v8bVar = (v8b) this.d;
                String str4 = (String) this.e;
                long j24 = this.b;
                long j25 = this.c;
                xbc xbcVar = (xbc) v8bVar.c;
                String str5 = g8c.a;
                l93 l93Var2 = ((t54) xbcVar).a.s;
                tj U2 = l93Var2.U();
                l93Var2.V(U2, 1016, new jz2(U2, str4, j25, j24, (byte) 28));
                return;
        }
    }

    public /* synthetic */ n30(Object obj, long j, TLObject tLObject, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.e = tLObject;
        this.c = j2;
    }

    public /* synthetic */ n30(Object obj, Object obj2, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
        this.c = j2;
    }
}
