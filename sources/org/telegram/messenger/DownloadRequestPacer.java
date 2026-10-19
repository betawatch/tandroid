package org.telegram.messenger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
