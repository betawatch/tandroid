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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ms implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys b;

    public /* synthetic */ ms(ys ysVar, int i7) {
        this.a = i7;
        this.b = ysVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i7 = 1;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                ys ysVar = this.b;
                ArrayList arrayList = ysVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    gj gjVar = (gj) arrayList.get(i11);
                    long B0 = gj.B0(gjVar.k);
                    TLRPC.Message message = gjVar.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !n5.C(B0) && (gjVar.k.peer_id.channel_id == 0 || gjVar.A4())) {
                        arrayList2.add(0, gjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !cz.C) {
                    g0.g3(new os(ysVar, arrayList2, i10));
                    break;
                }
                break;
            case 1:
                ys ysVar2 = this.b;
                ysVar2.getClass();
                int i12 = Calendar.getInstance().get(11);
                if (i12 < 11 || i12 > 22) {
                    ysVar2.R();
                    break;
                } else {
                    ys.m0.b(ysVar2.e0, null);
                    ysVar2.Z(true);
                    break;
                }
                break;
            case 2:
                ys ysVar3 = this.b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - ysVar3.X) <= 100) {
                        break;
                    } else {
                        ysVar3.X = SystemClock.elapsedRealtime();
                        if (ysVar3.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            ysVar3.Y = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ts
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
                        if (ysVar3.a0 == 0 && !ysVar3.c0) {
                            ysVar3.c0 = true;
                            ysVar3.a0 = ysVar3.Y.load(t0.b, R.raw.sound_out, 1);
                        }
                        int i13 = ysVar3.a0;
                        if (i13 != 0) {
                            try {
                                ysVar3.Y.play(i13, 1.0f, 1.0f, 1, 0, 1.0f);
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
                ys.c(this.b);
                break;
            case 5:
                ys ysVar4 = this.b;
                a0.h hVar = ysVar4.h;
                ys.m0.b(ysVar4.e0, null);
                ysVar4.n.b();
                while (i10 < hVar.m()) {
                    ys.m0.b(((Integer) hVar.n(i10)).intValue(), null);
                    i10++;
                }
                hVar.b();
                break;
            case 6:
                ys ysVar5 = this.b;
                a0.h hVar2 = ysVar5.c;
                ArrayList arrayList3 = ysVar5.a;
                int i14 = 0;
                boolean z10 = false;
                while (i14 < arrayList3.size()) {
                    gj gjVar2 = (gj) arrayList3.get(i14);
                    if (gjVar2 != null && gjVar2.J) {
                        arrayList3.remove(i14);
                        i14--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(gj.B0(gjVar2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(gjVar2.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(gj.B0(gjVar2.k));
                        }
                        z10 = true;
                    }
                    i14++;
                }
                ur messagesStorage = ysVar5.getMessagesStorage();
                messagesStorage.a.c(new qq(messagesStorage, 19));
                if (z10) {
                    ysVar5.Z(false);
                    break;
                }
                break;
            case 7:
                ys ysVar6 = this.b;
                ysVar6.S(ysVar6.z());
                break;
            case 8:
                ys ysVar7 = this.b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (ysVar7.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            ysVar7.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ts
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
                        if (ysVar7.Z == 0 && !ysVar7.b0) {
                            ysVar7.b0 = true;
                            ysVar7.Z = ysVar7.Y.load(t0.b, R.raw.sound_in, 1);
                        }
                        int i15 = ysVar7.Z;
                        if (i15 != 0) {
                            try {
                                ysVar7.Y.play(i15, 1.0f, 1.0f, 1, 0, 1.0f);
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
                ys.b(this.b);
                break;
            case 10:
                ys ysVar8 = this.b;
                ArrayList arrayList4 = ysVar8.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                ysVar8.F.b();
                ur messagesStorage2 = ysVar8.getMessagesStorage();
                messagesStorage2.a.c(new qq(messagesStorage2, 14));
                if (!isEmpty) {
                    ysVar8.Z(false);
                    break;
                }
                break;
            case 11:
                ys ysVar9 = this.b;
                ArrayList arrayList5 = ysVar9.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i16 = 0;
                boolean z11 = false;
                while (i16 < arrayList5.size()) {
                    xs xsVar = (xs) arrayList5.get(i16);
                    Iterator it = xsVar.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (xsVar.c.isEmpty()) {
                            ur messagesStorage3 = ysVar9.getMessagesStorage();
                            messagesStorage3.a.c(new qp(messagesStorage3, xsVar.a, 4));
                            arrayList5.remove(i16);
                            i16--;
                        } else {
                            ur messagesStorage4 = ysVar9.getMessagesStorage();
                            messagesStorage4.a.c(new sq(9, messagesStorage4, xsVar));
                        }
                    }
                    i16++;
                }
                if (z11) {
                    ysVar9.Z(false);
                }
                ysVar9.d0();
                break;
            case 12:
                ys ysVar10 = this.b;
                PowerManager.WakeLock wakeLock = ysVar10.W;
                ArrayList arrayList6 = ysVar10.b;
                if (s2.a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    ysVar10.Z(true);
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
                ys ysVar11 = this.b;
                ysVar11.getNotificationCenter().b(ysVar11, ls.Y1);
                break;
        }
    }
}
