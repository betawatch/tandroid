package com.google.android.exoplayer2.ext.mediasession;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.d0;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import h3.c2;
import h3.r2;
import h3.s2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class TimelineQueueNavigator implements MediaSessionConnector.QueueNavigator {
    public static final int DEFAULT_MAX_QUEUE_SIZE = 10;
    private long activeQueueItemId;
    private final int maxQueueSize;
    private final d0 mediaSession;
    private final r2 window;

    public TimelineQueueNavigator(d0 d0Var) {
        this(d0Var, 10);
    }

    private void publishFloatingQueueWindow(c2 c2Var) {
        s2 A = c2Var.A();
        if (A.p()) {
            this.mediaSession.g(Collections.EMPTY_LIST);
            this.activeQueueItemId = -1L;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int min = Math.min(this.maxQueueSize, A.o());
        int x8 = c2Var.x();
        long j10 = x8;
        arrayDeque.add(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, x8), j10));
        boolean C = c2Var.C();
        int i10 = x8;
        while (true) {
            if ((x8 != -1 || i10 != -1) && arrayDeque.size() < min) {
                if (i10 != -1 && (i10 = A.e(i10, 0, C)) != -1) {
                    arrayDeque.add(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, i10), i10));
                }
                if (x8 != -1 && arrayDeque.size() < min && (x8 = A.k(x8, 0, C)) != -1) {
                    arrayDeque.addFirst(new MediaSessionCompat$QueueItem(null, getMediaDescription(c2Var, x8), x8));
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
        s2 A = c2Var.A();
        if (A.p() || c2Var.c()) {
            z10 = false;
            z11 = false;
        } else {
            A.n(c2Var.x(), this.window);
            boolean z12 = A.o() > 1;
            b8.a aVar = (b8.a) c2Var;
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
        int e9;
        int e10;
        b8.a aVar = (b8.a) c2Var;
        if (aVar.A().p() || aVar.c()) {
            return;
        }
        s2 A = aVar.A();
        if (A.p()) {
            e9 = -1;
        } else {
            int x8 = aVar.x();
            int g10 = aVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            e9 = A.e(x8, g10, aVar.C());
        }
        if (!(e9 != -1)) {
            if (aVar.J() && aVar.I()) {
                aVar.O(-9223372036854775807L, aVar.x(), 9, false);
                return;
            }
            return;
        }
        s2 A2 = aVar.A();
        if (A2.p()) {
            e10 = -1;
        } else {
            int x10 = aVar.x();
            int g11 = aVar.g();
            e10 = A2.e(x10, g11 != 1 ? g11 : 0, aVar.C());
        }
        if (e10 == -1) {
            return;
        }
        if (e10 == aVar.x()) {
            aVar.O(-9223372036854775807L, aVar.x(), 9, true);
        } else {
            aVar.O(-9223372036854775807L, e10, 9, false);
        }
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public void onSkipToPrevious(c2 c2Var) {
        int k10;
        int k11;
        int k12;
        b8.a aVar = (b8.a) c2Var;
        if (aVar.A().p() || aVar.c()) {
            return;
        }
        s2 A = aVar.A();
        if (A.p()) {
            k10 = -1;
        } else {
            int x8 = aVar.x();
            int g10 = aVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k10 = A.k(x8, g10, aVar.C());
        }
        boolean z10 = k10 != -1;
        if (aVar.J()) {
            s2 A2 = aVar.A();
            if (!(!A2.p() && A2.m(aVar.x(), (r2) aVar.a, 0L).n)) {
                if (z10) {
                    s2 A3 = aVar.A();
                    if (A3.p()) {
                        k12 = -1;
                    } else {
                        int x10 = aVar.x();
                        int g11 = aVar.g();
                        k12 = A3.k(x10, g11 != 1 ? g11 : 0, aVar.C());
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
                s2 A4 = aVar.A();
                if (A4.p()) {
                    k11 = -1;
                } else {
                    int x11 = aVar.x();
                    int g12 = aVar.g();
                    k11 = A4.k(x11, g12 != 1 ? g12 : 0, aVar.C());
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
        int i10;
        s2 A = c2Var.A();
        if (A.p() || c2Var.c() || (i10 = (int) j10) < 0 || i10 >= A.o()) {
            return;
        }
        ((b8.a) c2Var).O(-9223372036854775807L, i10, 10, false);
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    public final void onTimelineChanged(c2 c2Var) {
        publishFloatingQueueWindow(c2Var);
    }

    public TimelineQueueNavigator(d0 d0Var, int i10) {
        d5.a.i(i10 > 0);
        this.mediaSession = d0Var;
        this.maxQueueSize = i10;
        this.activeQueueItemId = -1L;
        this.window = new r2();
    }
}
