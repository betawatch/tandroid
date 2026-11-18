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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ls implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs b;

    public /* synthetic */ ls(xs xsVar, int i7) {
        this.a = i7;
        this.b = xsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i7 = 1;
        final int i10 = 0;
        switch (this.a) {
            case 0:
                xs xsVar = this.b;
                ArrayList arrayList = xsVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    fj fjVar = (fj) arrayList.get(i11);
                    long B0 = fj.B0(fjVar.k);
                    TLRPC.Message message = fjVar.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !n5.C(B0) && (fjVar.k.peer_id.channel_id == 0 || fjVar.A4())) {
                        arrayList2.add(0, fjVar);
                    }
                }
                if (!arrayList2.isEmpty() && !g0.p2(false) && !bz.C) {
                    g0.g3(new ns(xsVar, arrayList2, i10));
                    break;
                }
                break;
            case 1:
                xs xsVar2 = this.b;
                xsVar2.getClass();
                int i12 = Calendar.getInstance().get(11);
                if (i12 < 11 || i12 > 22) {
                    xsVar2.R();
                    break;
                } else {
                    xs.m0.b(xsVar2.e0, null);
                    xsVar2.Z(true);
                    break;
                }
                break;
            case 2:
                xs xsVar3 = this.b;
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - xsVar3.X) <= 100) {
                        break;
                    } else {
                        xsVar3.X = SystemClock.elapsedRealtime();
                        if (xsVar3.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            xsVar3.Y = soundPool;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ss
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
                        if (xsVar3.a0 == 0 && !xsVar3.c0) {
                            xsVar3.c0 = true;
                            xsVar3.a0 = xsVar3.Y.load(t0.b, R.raw.sound_out, 1);
                        }
                        int i13 = xsVar3.a0;
                        if (i13 != 0) {
                            try {
                                xsVar3.Y.play(i13, 1.0f, 1.0f, 1, 0, 1.0f);
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
                xs.c(this.b);
                break;
            case 5:
                xs xsVar4 = this.b;
                a0.h hVar = xsVar4.h;
                xs.m0.b(xsVar4.e0, null);
                xsVar4.n.b();
                while (i10 < hVar.m()) {
                    xs.m0.b(((Integer) hVar.n(i10)).intValue(), null);
                    i10++;
                }
                hVar.b();
                break;
            case 6:
                xs xsVar5 = this.b;
                a0.h hVar2 = xsVar5.c;
                ArrayList arrayList3 = xsVar5.a;
                int i14 = 0;
                boolean z10 = false;
                while (i14 < arrayList3.size()) {
                    fj fjVar2 = (fj) arrayList3.get(i14);
                    if (fjVar2 != null && fjVar2.J) {
                        arrayList3.remove(i14);
                        i14--;
                        SparseArray sparseArray = (SparseArray) hVar2.f(fj.B0(fjVar2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(fjVar2.e1());
                        }
                        if (sparseArray != null && sparseArray.size() <= 0) {
                            hVar2.l(fj.B0(fjVar2.k));
                        }
                        z10 = true;
                    }
                    i14++;
                }
                tr messagesStorage = xsVar5.getMessagesStorage();
                messagesStorage.a.c(new pq(messagesStorage, 19));
                if (z10) {
                    xsVar5.Z(false);
                    break;
                }
                break;
            case 7:
                xs xsVar6 = this.b;
                xsVar6.S(xsVar6.z());
                break;
            case 8:
                xs xsVar7 = this.b;
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (xsVar7.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            xsVar7.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.telegram.messenger.ss
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
                        if (xsVar7.Z == 0 && !xsVar7.b0) {
                            xsVar7.b0 = true;
                            xsVar7.Z = xsVar7.Y.load(t0.b, R.raw.sound_in, 1);
                        }
                        int i15 = xsVar7.Z;
                        if (i15 != 0) {
                            try {
                                xsVar7.Y.play(i15, 1.0f, 1.0f, 1, 0, 1.0f);
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
                xs.b(this.b);
                break;
            case 10:
                xs xsVar8 = this.b;
                ArrayList arrayList4 = xsVar8.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                xsVar8.F.b();
                tr messagesStorage2 = xsVar8.getMessagesStorage();
                messagesStorage2.a.c(new pq(messagesStorage2, 14));
                if (!isEmpty) {
                    xsVar8.Z(false);
                    break;
                }
                break;
            case 11:
                xs xsVar9 = this.b;
                ArrayList arrayList5 = xsVar9.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i16 = 0;
                boolean z11 = false;
                while (i16 < arrayList5.size()) {
                    ws wsVar = (ws) arrayList5.get(i16);
                    Iterator it = wsVar.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (wsVar.c.isEmpty()) {
                            tr messagesStorage3 = xsVar9.getMessagesStorage();
                            messagesStorage3.a.c(new pp(messagesStorage3, wsVar.a, 4));
                            arrayList5.remove(i16);
                            i16--;
                        } else {
                            tr messagesStorage4 = xsVar9.getMessagesStorage();
                            messagesStorage4.a.c(new rq(9, messagesStorage4, wsVar));
                        }
                    }
                    i16++;
                }
                if (z11) {
                    xsVar9.Z(false);
                }
                xsVar9.d0();
                break;
            case 12:
                xs xsVar10 = this.b;
                PowerManager.WakeLock wakeLock = xsVar10.W;
                ArrayList arrayList6 = xsVar10.b;
                if (s2.a) {
                    a8.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    xsVar10.Z(true);
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
                xs xsVar11 = this.b;
                xsVar11.getNotificationCenter().b(xsVar11, ks.Y1);
                break;
        }
    }
}
