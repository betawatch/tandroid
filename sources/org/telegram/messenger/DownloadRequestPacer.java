package org.telegram.messenger;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
