package com.google.android.exoplayer2.ext.mediasession;

import ab.e;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.d0;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import j3.c2;
import j3.q2;
import j3.r2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class TimelineQueueNavigator implements MediaSessionConnector.QueueNavigator {
    public static final int DEFAULT_MAX_QUEUE_SIZE = 10;
    private long activeQueueItemId;
    private final int maxQueueSize;
    private final d0 mediaSession;
    private final q2 window;

    public TimelineQueueNavigator(d0 d0Var) {
        this(d0Var, 10);
    }

    private void publishFloatingQueueWindow(c2 c2Var) {
        r2 A = c2Var.A();
        if (A.p()) {
            this.mediaSession.g(Collections.EMPTY_LIST);
            this.activeQueueItemId = -1L;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int min = Math.min(this.maxQueueSize, A.o());
        int x4 = c2Var.x();
        long j10 = x4;
        arrayDeque.add(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, x4), j10));
        boolean C = c2Var.C();
        int i10 = x4;
        while (true) {
            if ((x4 != -1 || i10 != -1) && arrayDeque.size() < min) {
                if (i10 != -1 && (i10 = A.e(i10, 0, C)) != -1) {
                    arrayDeque.add(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, i10), i10));
                }
                if (x4 != -1 && arrayDeque.size() < min && (x4 = A.k(x4, 0, C)) != -1) {
                    arrayDeque.addFirst(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, x4), x4));
                }
            }
        }
        this.mediaSession.g(new ArrayList(arrayDeque));
        this.activeQueueItemId = j10;
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public final long getActiveQueueItemId(c2 c2Var) {
        return this.activeQueueItemId;
    }

    public abstract MediaDescriptionCompat getMediaDescription(c2 c2Var, int i10);

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public long getSupportedQueueNavigatorActions(c2 c2Var) {
        boolean z10;
        boolean z11;
        r2 A = c2Var.A();
        if (A.p() || c2Var.c()) {
            z10 = false;
            z11 = false;
        } else {
            A.n(c2Var.x(), this.window);
            boolean z12 = A.o() > 1;
            e eVar = (e) c2Var;
            z11 = eVar.H(5) || !this.window.a() || eVar.H(6);
            z10 = (this.window.a() && this.window.r) || eVar.H(8);
            r2 = z12;
        }
        long j10 = r2 ? 4096L : 0L;
        if (z11) {
            j10 |= 16;
        }
        return z10 ? j10 | 32 : j10;
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.CommandReceiver
    public boolean onCommand(c2 c2Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        return false;
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public final void onCurrentMediaItemIndexChanged(c2 c2Var) {
        if (this.activeQueueItemId == -1 || c2Var.A().o() > this.maxQueueSize) {
            publishFloatingQueueWindow(c2Var);
        } else {
            if (c2Var.A().p()) {
                return;
            }
            this.activeQueueItemId = c2Var.x();
        }
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public void onSkipToNext(c2 c2Var) {
        int e10;
        int e11;
        e eVar = (e) c2Var;
        if (eVar.A().p() || eVar.c()) {
            return;
        }
        r2 A = eVar.A();
        if (A.p()) {
            e10 = -1;
        } else {
            int x4 = eVar.x();
            int g10 = eVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            e10 = A.e(x4, g10, eVar.C());
        }
        if (!(e10 != -1)) {
            if (eVar.J() && eVar.I()) {
                eVar.O(-9223372036854775807L, eVar.x(), 9, false);
                return;
            }
            return;
        }
        r2 A2 = eVar.A();
        if (A2.p()) {
            e11 = -1;
        } else {
            int x10 = eVar.x();
            int g11 = eVar.g();
            e11 = A2.e(x10, g11 != 1 ? g11 : 0, eVar.C());
        }
        if (e11 == -1) {
            return;
        }
        if (e11 == eVar.x()) {
            eVar.O(-9223372036854775807L, eVar.x(), 9, true);
        } else {
            eVar.O(-9223372036854775807L, e11, 9, false);
        }
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public void onSkipToPrevious(c2 c2Var) {
        int k9;
        int k10;
        int k11;
        e eVar = (e) c2Var;
        if (eVar.A().p() || eVar.c()) {
            return;
        }
        r2 A = eVar.A();
        if (A.p()) {
            k9 = -1;
        } else {
            int x4 = eVar.x();
            int g10 = eVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k9 = A.k(x4, g10, eVar.C());
        }
        boolean z10 = k9 != -1;
        if (eVar.J()) {
            r2 A2 = eVar.A();
            if (!(!A2.p() && A2.m(eVar.x(), (q2) eVar.a, 0L).n)) {
                if (z10) {
                    r2 A3 = eVar.A();
                    if (A3.p()) {
                        k11 = -1;
                    } else {
                        int x10 = eVar.x();
                        int g11 = eVar.g();
                        k11 = A3.k(x10, g11 != 1 ? g11 : 0, eVar.C());
                    }
                    if (k11 == -1) {
                        return;
                    }
                    if (k11 == eVar.x()) {
                        eVar.O(-9223372036854775807L, eVar.x(), 7, true);
                        return;
                    } else {
                        eVar.O(-9223372036854775807L, k11, 7, false);
                        return;
                    }
                }
                return;
            }
        }
        if (z10) {
            long D = eVar.D();
            eVar.j();
            if (D <= 3000) {
                r2 A4 = eVar.A();
                if (A4.p()) {
                    k10 = -1;
                } else {
                    int x11 = eVar.x();
                    int g12 = eVar.g();
                    k10 = A4.k(x11, g12 != 1 ? g12 : 0, eVar.C());
                }
                if (k10 == -1) {
                    return;
                }
                if (k10 == eVar.x()) {
                    eVar.O(-9223372036854775807L, eVar.x(), 7, true);
                    return;
                } else {
                    eVar.O(-9223372036854775807L, k10, 7, false);
                    return;
                }
            }
        }
        eVar.P(7, 0L);
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public void onSkipToQueueItem(c2 c2Var, long j10) {
        int i10;
        r2 A = c2Var.A();
        if (A.p() || c2Var.c() || (i10 = (int) j10) < 0 || i10 >= A.o()) {
            return;
        }
        ((e) c2Var).O(-9223372036854775807L, i10, 10, false);
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public final void onTimelineChanged(c2 c2Var) {
        publishFloatingQueueWindow(c2Var);
    }

    public TimelineQueueNavigator(d0 d0Var, int i10) {
        f5.a.i(i10 > 0);
        this.mediaSession = d0Var;
        this.maxQueueSize = i10;
        this.activeQueueItemId = -1L;
        this.window = new q2();
    }
}
