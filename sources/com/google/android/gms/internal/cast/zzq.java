package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class zzq {
    private final String zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final long zze;
    private long zzf;

    public zzq(zzp zzpVar) {
        String str;
        long j;
        int i;
        long j2;
        long j3;
        str = zzpVar.zza;
        this.zza = str;
        j = zzpVar.zzb;
        this.zzb = j;
        i = zzpVar.zzc;
        this.zzc = i;
        j2 = zzpVar.zzd;
        this.zzd = j2;
        j3 = zzpVar.zze;
        this.zze = j3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zznq zza() {
        char c;
        String str = this.zza;
        zznp zza = zznq.zza();
        int i = 11;
        switch (str.hashCode()) {
            case -1189611734:
                if (str.equals("queueInsert")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1109843021:
                if (str.equals("launch")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -940430091:
                if (str.equals("queueRemove")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -936597225:
                if (str.equals("queueFetchItems")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -930425472:
                if (str.equals("setPlaybackDevices")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -921113364:
                if (str.equals("volume-mute")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -900560382:
                if (str.equals("skipAd")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -892481550:
                if (str.equals("status")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -844665542:
                if (str.equals("queueUpdate")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -810883302:
                if (str.equals("volume")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -402284771:
                if (str.equals("setPlaybackRate")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 3327206:
                if (str.equals("load")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3363353:
                if (str.equals("mute")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3443508:
                if (str.equals("play")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3526264:
                if (str.equals("seek")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3540994:
                if (str.equals("stop")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 106440182:
                if (str.equals("pause")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 525402049:
                if (str.equals("queueFetchItemRange")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 913357482:
                if (str.equals("queueReorder")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1148867366:
                if (str.equals("trackStyle")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1451542318:
                if (str.equals("activeTracks")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1873161788:
                if (str.equals("queueFetchItemIds")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case '\b':
                i = 10;
                break;
            case '\t':
                break;
            case '\n':
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case '\f':
                i = 14;
                break;
            case '\r':
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            default:
                i = 1;
                break;
        }
        zza.zze(i);
        zza.zzb((int) this.zzb);
        zza.zzd(this.zzc);
        zza.zzc((int) (this.zzd - this.zzf));
        zza.zza((int) (this.zze - this.zzf));
        return (zznq) zza.zzq();
    }

    public final void zzb(long j) {
        this.zzf = j;
    }
}
