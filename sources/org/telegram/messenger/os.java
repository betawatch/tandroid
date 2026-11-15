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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class os implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;

    public /* synthetic */ os(at atVar, int i7) {
        this.a = i7;
        this.b = atVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i7 = 1;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                at atVar = this.b;
                ArrayList arrayList = atVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    gj gjVar = (gj) arrayList.get(i11);
                    long B0 = gj.B0(gjVar.k);
                    TLRPC.Message message = gjVar.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && (gjVar.k.peer_id.channel_id == 0 || gjVar.A4())) {
                        arrayList2.add(0, gjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !gz.C) {
                    g0.h3(new qs(atVar, arrayList2, i10));
                    break;
                }
                break;
            case 1:
                at atVar2 = this.b;
                atVar2.getClass();
                int i12 = Calendar.getInstance().get(11);
                if (i12 < 11 || i12 > 22) {
                    atVar2.R();
                    break;
                } else {
                    at.m0.b(atVar2.e0, null);
                    atVar2.Z(true);
                    break;
                }
                break;
            case 2:
                at atVar3 = this.b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - atVar3.X) <= 100) {
                        break;
                    } else {
                        atVar3.X = SystemClock.elapsedRealtime();
                        if (atVar3.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            atVar3.Y = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.vs
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
                        if (atVar3.a0 == 0 && !atVar3.c0) {
                            atVar3.c0 = true;
                            atVar3.a0 = atVar3.Y.load(t0.b, R.raw.sound_out, 1);
                        }
                        int i13 = atVar3.a0;
                        if (i13 != 0) {
                            try {
                                atVar3.Y.play(i13, 1.0f, 1.0f, 1, 0, 1.0f);
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
                at.c(this.b);
                break;
            case 5:
                at atVar4 = this.b;
                a0.h hVar = atVar4.h;
                at.m0.b(atVar4.e0, null);
                atVar4.n.b();
                while (i10 < hVar.m()) {
                    at.m0.b(((Integer) hVar.n(i10)).intValue(), null);
                    i10++;
                }
                hVar.b();
                break;
            case 6:
                at atVar5 = this.b;
                a0.h hVar2 = atVar5.c;
                ArrayList arrayList3 = atVar5.a;
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
                vr messagesStorage = atVar5.getMessagesStorage();
                messagesStorage.a.c(new oq(messagesStorage, 17));
                if (z10) {
                    atVar5.Z(false);
                    break;
                }
                break;
            case 7:
                at atVar6 = this.b;
                atVar6.S(atVar6.z());
                break;
            case 8:
                at atVar7 = this.b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (atVar7.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            atVar7.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.vs
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
                        if (atVar7.Z == 0 && !atVar7.b0) {
                            atVar7.b0 = true;
                            atVar7.Z = atVar7.Y.load(t0.b, R.raw.sound_in, 1);
                        }
                        int i15 = atVar7.Z;
                        if (i15 != 0) {
                            try {
                                atVar7.Y.play(i15, 1.0f, 1.0f, 1, 0, 1.0f);
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
                at.b(this.b);
                break;
            case 10:
                at atVar8 = this.b;
                ArrayList arrayList4 = atVar8.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                atVar8.F.b();
                vr messagesStorage2 = atVar8.getMessagesStorage();
                messagesStorage2.a.c(new oq(messagesStorage2, 14));
                if (!isEmpty) {
                    atVar8.Z(false);
                    break;
                }
                break;
            case 11:
                at atVar9 = this.b;
                ArrayList arrayList5 = atVar9.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i16 = 0;
                boolean z11 = false;
                while (i16 < arrayList5.size()) {
                    zs zsVar = (zs) arrayList5.get(i16);
                    Iterator it = zsVar.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (zsVar.c.isEmpty()) {
                            vr messagesStorage3 = atVar9.getMessagesStorage();
                            messagesStorage3.a.c(new up(messagesStorage3, zsVar.a, 4));
                            arrayList5.remove(i16);
                            i16--;
                        } else {
                            vr messagesStorage4 = atVar9.getMessagesStorage();
                            messagesStorage4.a.c(new wq(5, messagesStorage4, zsVar));
                        }
                    }
                    i16++;
                }
                if (z11) {
                    atVar9.Z(false);
                }
                atVar9.d0();
                break;
            case 12:
                at atVar10 = this.b;
                PowerManager.WakeLock wakeLock = atVar10.W;
                ArrayList arrayList6 = atVar10.b;
                if (r2.a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    atVar10.Z(true);
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
                at atVar11 = this.b;
                atVar11.getNotificationCenter().b(atVar11, ns.Y1);
                break;
        }
    }
}
