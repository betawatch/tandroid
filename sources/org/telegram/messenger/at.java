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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;

    public /* synthetic */ at(ot otVar, int i10) {
        this.a = i10;
        this.b = otVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i10 = 1;
        final int i11 = 0;
        switch (this.a) {
            case 0:
                ot otVar = this.b;
                otVar.getNotificationCenter().b(otVar, zs.Y1);
                break;
            case 1:
                ot otVar2 = this.b;
                ArrayList arrayList = otVar2.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    jj jjVar = (jj) arrayList.get(i12);
                    long B0 = jj.B0(jjVar.k);
                    TLRPC.Message message = jjVar.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !o5.C(B0) && (jjVar.k.peer_id.channel_id == 0 || jjVar.A4())) {
                        arrayList2.add(0, jjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !i0.p2(false) && !tz.C) {
                    i0.g3(new ct(otVar2, arrayList2, i11));
                    break;
                }
                break;
            case 2:
                ot otVar3 = this.b;
                otVar3.getClass();
                int i13 = Calendar.getInstance().get(11);
                if (i13 < 11 || i13 > 22) {
                    otVar3.R();
                    break;
                } else {
                    ot.l0.b(otVar3.d0, null);
                    otVar3.Z(true);
                    break;
                }
                break;
            case 3:
                ot otVar4 = this.b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - otVar4.W) <= 100) {
                        break;
                    } else {
                        otVar4.W = SystemClock.elapsedRealtime();
                        if (otVar4.X == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            otVar4.X = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ht
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool2, int i14, int i15) {
                                    switch (i11) {
                                        case 0:
                                            if (i15 == 0) {
                                                try {
                                                    soundPool2.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e) {
                                                    f8.g(e, true);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            if (i15 == 0) {
                                                try {
                                                    soundPool2.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e7) {
                                                    f8.g(e7, true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        if (otVar4.Z == 0 && !otVar4.b0) {
                            otVar4.b0 = true;
                            otVar4.Z = otVar4.X.load(w0.b, R.raw.sound_out, 1);
                        }
                        int i14 = otVar4.Z;
                        if (i14 != 0) {
                            try {
                                otVar4.X.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
                                break;
                            } catch (Exception e) {
                                f8.g(e, true);
                                return;
                            }
                        }
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
                break;
            case 4:
                this.b.Z(false);
                break;
            case 5:
                ot.c(this.b);
                break;
            case 6:
                ot otVar5 = this.b;
                a0.h hVar = otVar5.h;
                ot.l0.b(otVar5.d0, null);
                otVar5.n.b();
                while (i11 < hVar.m()) {
                    ot.l0.b(((Integer) hVar.n(i11)).intValue(), null);
                    i11++;
                }
                hVar.b();
                break;
            case 7:
                ot otVar6 = this.b;
                otVar6.S(otVar6.z());
                break;
            case 8:
                ot otVar7 = this.b;
                a0.h hVar2 = otVar7.c;
                ArrayList arrayList3 = otVar7.a;
                int i15 = 0;
                boolean z10 = false;
                while (i15 < arrayList3.size()) {
                    jj jjVar2 = (jj) arrayList3.get(i15);
                    if (jjVar2 != null && jjVar2.J) {
                        arrayList3.remove(i15);
                        i15--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(jj.B0(jjVar2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(jjVar2.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(jj.B0(jjVar2.k));
                        }
                        z10 = true;
                    }
                    i15++;
                }
                hs messagesStorage = otVar7.getMessagesStorage();
                messagesStorage.a.c(new br(messagesStorage, 20));
                if (z10) {
                    otVar7.Z(false);
                    break;
                }
                break;
            case 9:
                ot otVar8 = this.b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (otVar8.X == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            otVar8.X = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ht
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool22, int i142, int i152) {
                                    switch (i10) {
                                        case 0:
                                            if (i152 == 0) {
                                                try {
                                                    soundPool22.play(i142, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e10) {
                                                    f8.g(e10, true);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            if (i152 == 0) {
                                                try {
                                                    soundPool22.play(i142, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e72) {
                                                    f8.g(e72, true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        if (otVar8.Y == 0 && !otVar8.a0) {
                            otVar8.a0 = true;
                            otVar8.Y = otVar8.X.load(w0.b, R.raw.sound_in, 1);
                        }
                        int i16 = otVar8.Y;
                        if (i16 != 0) {
                            try {
                                otVar8.X.play(i16, 1.0f, 1.0f, 1, 0, 1.0f);
                                break;
                            } catch (Exception e10) {
                                f8.g(e10, true);
                                return;
                            }
                        }
                    } catch (Exception e11) {
                        f8.g(e11, true);
                        return;
                    }
                }
                break;
            case 10:
                ot.b(this.b);
                break;
            case 11:
                ot otVar9 = this.b;
                ArrayList arrayList4 = otVar9.D;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                otVar9.E.b();
                hs messagesStorage2 = otVar9.getMessagesStorage();
                messagesStorage2.a.c(new br(messagesStorage2, 16));
                if (!isEmpty) {
                    otVar9.Z(false);
                    break;
                }
                break;
            case 12:
                ot otVar10 = this.b;
                ArrayList arrayList5 = otVar10.D;
                long currentTimeMillis = System.currentTimeMillis();
                int i17 = 0;
                boolean z11 = false;
                while (i17 < arrayList5.size()) {
                    nt ntVar = (nt) arrayList5.get(i17);
                    Iterator it = ntVar.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        int i18 = 4;
                        if (ntVar.c.isEmpty()) {
                            hs messagesStorage3 = otVar10.getMessagesStorage();
                            messagesStorage3.a.c(new cq(messagesStorage3, ntVar.a, i18));
                            arrayList5.remove(i17);
                            i17--;
                        } else {
                            hs messagesStorage4 = otVar10.getMessagesStorage();
                            messagesStorage4.a.c(new hr(i18, messagesStorage4, ntVar));
                        }
                    }
                    i17++;
                }
                if (z11) {
                    otVar10.Z(false);
                }
                otVar10.d0();
                break;
            default:
                ot otVar11 = this.b;
                PowerManager.WakeLock wakeLock = otVar11.V;
                ArrayList arrayList6 = otVar11.b;
                if (v2.a) {
                    f8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    otVar11.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        break;
                    }
                } catch (Exception e12) {
                    f8.g(e12, true);
                }
                break;
        }
    }
}
