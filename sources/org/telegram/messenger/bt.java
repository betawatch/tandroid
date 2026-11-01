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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class bt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;

    public /* synthetic */ bt(pt ptVar, int i10) {
        this.a = i10;
        this.b = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i10 = 1;
        final int i11 = 0;
        switch (this.a) {
            case 0:
                pt ptVar = this.b;
                ptVar.getNotificationCenter().b(ptVar, at.Y1);
                break;
            case 1:
                pt ptVar2 = this.b;
                ArrayList arrayList = ptVar2.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    kj kjVar = (kj) arrayList.get(i12);
                    long B0 = kj.B0(kjVar.k);
                    TLRPC.Message message = kjVar.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !o5.C(B0) && (kjVar.k.peer_id.channel_id == 0 || kjVar.A4())) {
                        arrayList2.add(0, kjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !i0.p2(false) && !uz.C) {
                    i0.g3(new dt(ptVar2, arrayList2, i11));
                    break;
                }
                break;
            case 2:
                pt ptVar3 = this.b;
                ptVar3.getClass();
                int i13 = Calendar.getInstance().get(11);
                if (i13 < 11 || i13 > 22) {
                    ptVar3.R();
                    break;
                } else {
                    pt.l0.b(ptVar3.d0, null);
                    ptVar3.Z(true);
                    break;
                }
                break;
            case 3:
                pt ptVar4 = this.b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - ptVar4.W) <= 100) {
                        break;
                    } else {
                        ptVar4.W = SystemClock.elapsedRealtime();
                        if (ptVar4.X == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            ptVar4.X = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.jt
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
                        if (ptVar4.Z == 0 && !ptVar4.b0) {
                            ptVar4.b0 = true;
                            ptVar4.Z = ptVar4.X.load(w0.b, R.raw.sound_out, 1);
                        }
                        int i14 = ptVar4.Z;
                        if (i14 != 0) {
                            try {
                                ptVar4.X.play(i14, 1.0f, 1.0f, 1, 0, 1.0f);
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
                pt.c(this.b);
                break;
            case 6:
                pt ptVar5 = this.b;
                a0.h hVar = ptVar5.h;
                pt.l0.b(ptVar5.d0, null);
                ptVar5.n.b();
                while (i11 < hVar.m()) {
                    pt.l0.b(((Integer) hVar.n(i11)).intValue(), null);
                    i11++;
                }
                hVar.b();
                break;
            case 7:
                pt ptVar6 = this.b;
                ptVar6.S(ptVar6.z());
                break;
            case 8:
                pt ptVar7 = this.b;
                a0.h hVar2 = ptVar7.c;
                ArrayList arrayList3 = ptVar7.a;
                int i15 = 0;
                boolean z10 = false;
                while (i15 < arrayList3.size()) {
                    kj kjVar2 = (kj) arrayList3.get(i15);
                    if (kjVar2 != null && kjVar2.J) {
                        arrayList3.remove(i15);
                        i15--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(kj.B0(kjVar2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(kjVar2.f1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(kj.B0(kjVar2.k));
                        }
                        z10 = true;
                    }
                    i15++;
                }
                is messagesStorage = ptVar7.getMessagesStorage();
                messagesStorage.a.c(new cr(messagesStorage, 20));
                if (z10) {
                    ptVar7.Z(false);
                    break;
                }
                break;
            case 9:
                pt ptVar8 = this.b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (ptVar8.X == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            ptVar8.X = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.jt
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
                        if (ptVar8.Y == 0 && !ptVar8.a0) {
                            ptVar8.a0 = true;
                            ptVar8.Y = ptVar8.X.load(w0.b, R.raw.sound_in, 1);
                        }
                        int i16 = ptVar8.Y;
                        if (i16 != 0) {
                            try {
                                ptVar8.X.play(i16, 1.0f, 1.0f, 1, 0, 1.0f);
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
                pt.b(this.b);
                break;
            case 11:
                pt ptVar9 = this.b;
                ArrayList arrayList4 = ptVar9.D;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                ptVar9.E.b();
                is messagesStorage2 = ptVar9.getMessagesStorage();
                messagesStorage2.a.c(new cr(messagesStorage2, 16));
                if (!isEmpty) {
                    ptVar9.Z(false);
                    break;
                }
                break;
            case 12:
                pt ptVar10 = this.b;
                ArrayList arrayList5 = ptVar10.D;
                long currentTimeMillis = System.currentTimeMillis();
                int i17 = 0;
                boolean z11 = false;
                while (i17 < arrayList5.size()) {
                    ot otVar = (ot) arrayList5.get(i17);
                    Iterator it = otVar.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        int i18 = 4;
                        if (otVar.c.isEmpty()) {
                            is messagesStorage3 = ptVar10.getMessagesStorage();
                            messagesStorage3.a.c(new dq(messagesStorage3, otVar.a, i18));
                            arrayList5.remove(i17);
                            i17--;
                        } else {
                            is messagesStorage4 = ptVar10.getMessagesStorage();
                            messagesStorage4.a.c(new ir(i18, messagesStorage4, otVar));
                        }
                    }
                    i17++;
                }
                if (z11) {
                    ptVar10.Z(false);
                }
                ptVar10.d0();
                break;
            default:
                pt ptVar11 = this.b;
                PowerManager.WakeLock wakeLock = ptVar11.V;
                ArrayList arrayList6 = ptVar11.b;
                if (v2.a) {
                    f8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    ptVar11.Z(true);
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
