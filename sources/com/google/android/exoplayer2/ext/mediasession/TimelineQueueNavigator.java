package com.google.android.exoplayer2.ext.mediasession;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.d0;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import h3.c2;
import h3.q2;
import h3.r2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int x10 = c2Var.x();
        long j10 = x10;
        arrayDeque.add(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, x10), j10));
        boolean C = c2Var.C();
        int i9 = x10;
        while (true) {
            if ((x10 != -1 || i9 != -1) && arrayDeque.size() < min) {
                if (i9 != -1 && (i9 = A.e(i9, 0, C)) != -1) {
                    arrayDeque.add(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, i9), i9));
                }
                if (x10 != -1 && arrayDeque.size() < min && (x10 = A.k(x10, 0, C)) != -1) {
                    arrayDeque.addFirst(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, x10), x10));
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

    public abstract MediaDescriptionCompat getMediaDescription(c2 c2Var, int i9);

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
            a8.a aVar = (a8.a) c2Var;
            z11 = aVar.H(5) || !this.window.a() || aVar.H(6);
            z10 = (this.window.a() && this.window.r) || aVar.H(8);
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
        a8.a aVar = (a8.a) c2Var;
        if (aVar.A().p() || aVar.c()) {
            return;
        }
        r2 A = aVar.A();
        if (A.p()) {
            e10 = -1;
        } else {
            int x10 = aVar.x();
            int g10 = aVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            e10 = A.e(x10, g10, aVar.C());
        }
        if (!(e10 != -1)) {
            if (aVar.J() && aVar.I()) {
                aVar.O(-9223372036854775807L, aVar.x(), 9, false);
                return;
            }
            return;
        }
        r2 A2 = aVar.A();
        if (A2.p()) {
            e11 = -1;
        } else {
            int x11 = aVar.x();
            int g11 = aVar.g();
            e11 = A2.e(x11, g11 != 1 ? g11 : 0, aVar.C());
        }
        if (e11 == -1) {
            return;
        }
        if (e11 == aVar.x()) {
            aVar.O(-9223372036854775807L, aVar.x(), 9, true);
        } else {
            aVar.O(-9223372036854775807L, e11, 9, false);
        }
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public void onSkipToPrevious(c2 c2Var) {
        int k10;
        int k11;
        int k12;
        a8.a aVar = (a8.a) c2Var;
        if (aVar.A().p() || aVar.c()) {
            return;
        }
        r2 A = aVar.A();
        if (A.p()) {
            k10 = -1;
        } else {
            int x10 = aVar.x();
            int g10 = aVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k10 = A.k(x10, g10, aVar.C());
        }
        boolean z10 = k10 != -1;
        if (aVar.J()) {
            r2 A2 = aVar.A();
            if (!(!A2.p() && A2.m(aVar.x(), (q2) aVar.a, 0L).n)) {
                if (z10) {
                    r2 A3 = aVar.A();
                    if (A3.p()) {
                        k12 = -1;
                    } else {
                        int x11 = aVar.x();
                        int g11 = aVar.g();
                        k12 = A3.k(x11, g11 != 1 ? g11 : 0, aVar.C());
                    }
                    if (k12 == -1) {
                        return;
                    }
                    if (k12 == aVar.x()) {
                        aVar.O(-9223372036854775807L, aVar.x(), 7, true);
                        return;
                    } else {
                        aVar.O(-9223372036854775807L, k12, 7, false);
                        return;
                    }
                }
                return;
            }
        }
        if (z10) {
            long D = aVar.D();
            aVar.j();
            if (D <= 3000) {
                r2 A4 = aVar.A();
                if (A4.p()) {
                    k11 = -1;
                } else {
                    int x12 = aVar.x();
                    int g12 = aVar.g();
                    k11 = A4.k(x12, g12 != 1 ? g12 : 0, aVar.C());
                }
                if (k11 == -1) {
                    return;
                }
                if (k11 == aVar.x()) {
                    aVar.O(-9223372036854775807L, aVar.x(), 7, true);
                    return;
                } else {
                    aVar.O(-9223372036854775807L, k11, 7, false);
                    return;
                }
            }
        }
        aVar.P(7, 0L);
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public void onSkipToQueueItem(c2 c2Var, long j10) {
        int i9;
        r2 A = c2Var.A();
        if (A.p() || c2Var.c() || (i9 = (int) j10) < 0 || i9 >= A.o()) {
            return;
        }
        ((a8.a) c2Var).O(-9223372036854775807L, i9, 10, false);
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public final void onTimelineChanged(c2 c2Var) {
        publishFloatingQueueWindow(c2Var);
    }

    public TimelineQueueNavigator(d0 d0Var, int i9) {
        d5.a.i(i9 > 0);
        this.mediaSession = d0Var;
        this.maxQueueSize = i9;
        this.activeQueueItemId = -1L;
        this.window = new q2();
    }
}
