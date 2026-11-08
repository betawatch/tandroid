package org.telegram.messenger;

import android.media.SoundPool;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;

    public /* synthetic */ rs(dt dtVar, int i7) {
        this.a = i7;
        this.b = dtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i7 = 1;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                dt dtVar = this.b;
                ArrayList arrayList = dtVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ij ijVar = (ij) arrayList.get(i11);
                    long B0 = ij.B0(ijVar.k);
                    TLRPC.Message message = ijVar.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && (ijVar.k.peer_id.channel_id == 0 || ijVar.B4())) {
                        arrayList2.add(0, ijVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !iz.C) {
                    g0.h3(new ts(dtVar, arrayList2, i10));
                    break;
                }
                break;
            case 1:
                dt dtVar2 = this.b;
                dtVar2.getClass();
                int i12 = Calendar.getInstance().get(11);
                if (i12 < 11 || i12 > 22) {
                    dtVar2.R();
                    break;
                } else {
                    dt.l0.b(dtVar2.d0, null);
                    dtVar2.Z(true);
                    break;
                }
                break;
            case 2:
                dt dtVar3 = this.b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - dtVar3.W) <= 100) {
                        break;
                    } else {
                        dtVar3.W = SystemClock.elapsedRealtime();
                        if (dtVar3.X == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            dtVar3.X = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ys
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool2, int i13, int i14) {
                                    switch (i10) {
                                        case 0:
                                            if (i14 == 0) {
                                                try {
                                                    soundPool2.play(i13, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e10) {
                                                    a8.g(e10, true);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            if (i14 == 0) {
                                                try {
                                                    soundPool2.play(i13, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        if (dtVar3.Z == 0 && !dtVar3.b0) {
                            dtVar3.b0 = true;
                            dtVar3.Z = dtVar3.X.load(t0.b, R.raw.sound_out, 1);
                        }
                        int i13 = dtVar3.Z;
                        if (i13 != 0) {
                            try {
                                dtVar3.X.play(i13, 1.0f, 1.0f, 1, 0, 1.0f);
                                break;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return;
                            }
                        }
                    }
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
                break;
            case 3:
                this.b.Z(false);
                break;
            case 4:
                dt.c(this.b);
                break;
            case 5:
                dt dtVar4 = this.b;
                a0.h hVar = dtVar4.h;
                dt.l0.b(dtVar4.d0, null);
                dtVar4.n.b();
                while (i10 < hVar.m()) {
                    dt.l0.b(((Integer) hVar.n(i10)).intValue(), null);
                    i10++;
                }
                hVar.b();
                break;
            case 6:
                dt dtVar5 = this.b;
                a0.h hVar2 = dtVar5.c;
                ArrayList arrayList3 = dtVar5.a;
                int i14 = 0;
                boolean z9 = false;
                while (i14 < arrayList3.size()) {
                    ij ijVar2 = (ij) arrayList3.get(i14);
                    if (ijVar2 != null && ijVar2.J) {
                        arrayList3.remove(i14);
                        i14--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(ij.B0(ijVar2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(ijVar2.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(ij.B0(ijVar2.k));
                        }
                        z9 = true;
                    }
                    i14++;
                }
                yr messagesStorage = dtVar5.getMessagesStorage();
                messagesStorage.a.c(new rq(messagesStorage, 17));
                if (z9) {
                    dtVar5.Z(false);
                    break;
                }
                break;
            case 7:
                dt dtVar6 = this.b;
                dtVar6.S(dtVar6.z());
                break;
            case 8:
                dt dtVar7 = this.b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (dtVar7.X == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            dtVar7.X = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ys
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool22, int i132, int i142) {
                                    switch (i7) {
                                        case 0:
                                            if (i142 == 0) {
                                                try {
                                                    soundPool22.play(i132, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e102) {
                                                    a8.g(e102, true);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            if (i142 == 0) {
                                                try {
                                                    soundPool22.play(i132, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e112) {
                                                    a8.g(e112, true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        if (dtVar7.Y == 0 && !dtVar7.a0) {
                            dtVar7.a0 = true;
                            dtVar7.Y = dtVar7.X.load(t0.b, R.raw.sound_in, 1);
                        }
                        int i15 = dtVar7.Y;
                        if (i15 != 0) {
                            try {
                                dtVar7.X.play(i15, 1.0f, 1.0f, 1, 0, 1.0f);
                                break;
                            } catch (Exception e12) {
                                a8.g(e12, true);
                                return;
                            }
                        }
                    } catch (Exception e13) {
                        a8.g(e13, true);
                        return;
                    }
                }
                break;
            case 9:
                dt.b(this.b);
                break;
            case 10:
                dt dtVar8 = this.b;
                ArrayList arrayList4 = dtVar8.D;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                dtVar8.E.b();
                yr messagesStorage2 = dtVar8.getMessagesStorage();
                messagesStorage2.a.c(new rq(messagesStorage2, 14));
                if (!isEmpty) {
                    dtVar8.Z(false);
                    break;
                }
                break;
            case 11:
                dt dtVar9 = this.b;
                ArrayList arrayList5 = dtVar9.D;
                long currentTimeMillis = System.currentTimeMillis();
                int i16 = 0;
                boolean z10 = false;
                while (i16 < arrayList5.size()) {
                    ct ctVar = (ct) arrayList5.get(i16);
                    Iterator it = ctVar.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z10 = true;
                        }
                    }
                    if (z10) {
                        if (ctVar.c.isEmpty()) {
                            yr messagesStorage3 = dtVar9.getMessagesStorage();
                            messagesStorage3.a.c(new xp(messagesStorage3, ctVar.a, 4));
                            arrayList5.remove(i16);
                            i16--;
                        } else {
                            yr messagesStorage4 = dtVar9.getMessagesStorage();
                            messagesStorage4.a.c(new zq(5, messagesStorage4, ctVar));
                        }
                    }
                    i16++;
                }
                if (z10) {
                    dtVar9.Z(false);
                }
                dtVar9.d0();
                break;
            case 12:
                dt dtVar10 = this.b;
                PowerManager.WakeLock wakeLock = dtVar10.V;
                ArrayList arrayList6 = dtVar10.b;
                if (r2.a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    dtVar10.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        break;
                    }
                } catch (Exception e14) {
                    a8.g(e14, true);
                    return;
                }
                break;
            default:
                dt dtVar11 = this.b;
                dtVar11.getNotificationCenter().b(dtVar11, qs.Y1);
                break;
        }
    }
}
