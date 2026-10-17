package org.telegram.messenger;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
final class DownloadRequestPacer {
    private double intervalMs = 50.0d;
    private long nextRequestAt;

    public void onRequestSent(long j10) {
        this.nextRequestAt = j10 + ((long) Math.ceil(this.intervalMs));
        this.intervalMs = Math.max(3.0d, this.intervalMs * 0.8d);
    }

    public long remainingDelay(long j10) {
        return Math.max(0L, this.nextRequestAt - j10);
    }
}
