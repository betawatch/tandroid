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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class is implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;

    public /* synthetic */ is(us usVar, int i3) {
        this.a = i3;
        this.b = usVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i3 = 1;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                us usVar = this.b;
                ArrayList arrayList = usVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    zi ziVar = (zi) arrayList.get(i11);
                    long B0 = zi.B0(ziVar.k);
                    TLRPC.Message message = ziVar.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && (ziVar.k.peer_id.channel_id == 0 || ziVar.B4())) {
                        arrayList2.add(0, ziVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !az.C) {
                    g0.h3(new ks(usVar, arrayList2, i10));
                    break;
                }
                break;
            case 1:
                us usVar2 = this.b;
                usVar2.getClass();
                int i12 = Calendar.getInstance().get(11);
                if (i12 < 11 || i12 > 22) {
                    usVar2.R();
                    break;
                } else {
                    us.m0.b(usVar2.e0, null);
                    usVar2.Z(true);
                    break;
                }
                break;
            case 2:
                us usVar3 = this.b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - usVar3.X) <= 100) {
                        break;
                    } else {
                        usVar3.X = SystemClock.elapsedRealtime();
                        if (usVar3.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            usVar3.Y = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ps
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
                        if (usVar3.a0 == 0 && !usVar3.c0) {
                            usVar3.c0 = true;
                            usVar3.a0 = usVar3.Y.load(t0.b, R.raw.sound_out, 1);
                        }
                        int i13 = usVar3.a0;
                        if (i13 != 0) {
                            try {
                                usVar3.Y.play(i13, 1.0f, 1.0f, 1, 0, 1.0f);
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
                us.c(this.b);
                break;
            case 5:
                us usVar4 = this.b;
                a0.h hVar = usVar4.h;
                us.m0.b(usVar4.e0, null);
                usVar4.n.b();
                while (i10 < hVar.m()) {
                    us.m0.b(((Integer) hVar.n(i10)).intValue(), null);
                    i10++;
                }
                hVar.b();
                break;
            case 6:
                us usVar5 = this.b;
                a0.h hVar2 = usVar5.c;
                ArrayList arrayList3 = usVar5.a;
                int i14 = 0;
                boolean z10 = false;
                while (i14 < arrayList3.size()) {
                    zi ziVar2 = (zi) arrayList3.get(i14);
                    if (ziVar2 != null && ziVar2.J) {
                        arrayList3.remove(i14);
                        i14--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(zi.B0(ziVar2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(ziVar2.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(zi.B0(ziVar2.k));
                        }
                        z10 = true;
                    }
                    i14++;
                }
                qr messagesStorage = usVar5.getMessagesStorage();
                messagesStorage.a.c(new hq(messagesStorage, 18));
                if (z10) {
                    usVar5.Z(false);
                    break;
                }
                break;
            case 7:
                us usVar6 = this.b;
                usVar6.S(usVar6.z());
                break;
            case 8:
                us usVar7 = this.b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (usVar7.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            usVar7.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ps
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool22, int i132, int i142) {
                                    switch (i3) {
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
                        if (usVar7.Z == 0 && !usVar7.b0) {
                            usVar7.b0 = true;
                            usVar7.Z = usVar7.Y.load(t0.b, R.raw.sound_in, 1);
                        }
                        int i15 = usVar7.Z;
                        if (i15 != 0) {
                            try {
                                usVar7.Y.play(i15, 1.0f, 1.0f, 1, 0, 1.0f);
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
                us.b(this.b);
                break;
            case 10:
                us usVar8 = this.b;
                ArrayList arrayList4 = usVar8.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                usVar8.F.b();
                qr messagesStorage2 = usVar8.getMessagesStorage();
                messagesStorage2.a.c(new hq(messagesStorage2, 15));
                if (!isEmpty) {
                    usVar8.Z(false);
                    break;
                }
                break;
            case 11:
                us usVar9 = this.b;
                ArrayList arrayList5 = usVar9.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i16 = 0;
                boolean z11 = false;
                while (i16 < arrayList5.size()) {
                    ts tsVar = (ts) arrayList5.get(i16);
                    Iterator it = tsVar.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (tsVar.c.isEmpty()) {
                            qr messagesStorage3 = usVar9.getMessagesStorage();
                            messagesStorage3.a.c(new op(messagesStorage3, tsVar.a, 4));
                            arrayList5.remove(i16);
                            i16--;
                        } else {
                            qr messagesStorage4 = usVar9.getMessagesStorage();
                            messagesStorage4.a.c(new pq(5, messagesStorage4, tsVar));
                        }
                    }
                    i16++;
                }
                if (z11) {
                    usVar9.Z(false);
                }
                usVar9.d0();
                break;
            case 12:
                us usVar10 = this.b;
                PowerManager.WakeLock wakeLock = usVar10.W;
                ArrayList arrayList6 = usVar10.b;
                if (r2.a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    usVar10.Z(true);
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
                us usVar11 = this.b;
                usVar11.getNotificationCenter().b(usVar11, hs.Y1);
                break;
        }
    }
}
