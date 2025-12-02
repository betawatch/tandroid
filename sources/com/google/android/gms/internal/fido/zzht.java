package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes.dex */
final class zzht {
    private final Deque zza = new ArrayDeque(16);

    private zzht(boolean z) {
    }

    public static zzht zza() {
        return new zzht(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j));
    }

    public final void zzb() {
        if (!this.zza.isEmpty()) {
            throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.zza.size()), Long.valueOf(zzh())));
        }
    }

    public final void zzc() {
        long zzh = zzh();
        if (zzh >= 0) {
            throw new IOException(String.format("expected indefinite length scope but found %s", Long.valueOf(zzh)));
        }
        if (zzh == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.zza.pop();
    }

    public final void zzd() {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh != -2) {
                return;
            } else {
                zzh = -2;
            }
        }
        throw new IOException(String.format("expected non-string scope but found %s", Long.valueOf(zzh)));
    }

    public final void zze(long j) {
        long zzh = zzh();
        if (zzh != j) {
            if (zzh != -1) {
                if (zzh != -2) {
                    return;
                } else {
                    zzh = -2;
                }
            }
            throw new IOException(String.format("expected non-string scope or scope %s but found %s", Long.valueOf(j), Long.valueOf(zzh)));
        }
    }

    public final void zzf() {
        long zzh = zzh();
        if (zzh == 1) {
            this.zza.pop();
            return;
        }
        if (zzh > 1) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5L);
        } else if (zzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j) {
        this.zza.push(Long.valueOf(j));
    }
}
