package com.google.firebase.sessions;

/* loaded from: classes.dex */
public final class WallClock implements TimeProvider {
    public static final WallClock INSTANCE = new WallClock();

    private WallClock() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
        return System.currentTimeMillis() * 1000;
    }
}
