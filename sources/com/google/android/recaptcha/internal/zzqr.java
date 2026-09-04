package com.google.android.recaptcha.internal;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
final class zzqr implements zzuf {
    private final zzqq zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzqr(zzqq zzqqVar) {
        byte[] bArr = zzsv.zzb;
        this.zza = zzqqVar;
        zzqqVar.zzd = this;
    }

    private final void zzP(Object obj, zzug zzugVar, zzry zzryVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzugVar.zzh(obj, this, zzryVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzsx("Failed to parse the message.");
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzug zzugVar, zzry zzryVar) {
        zzqq zzqqVar = this.zza;
        int zzn = zzqqVar.zzn();
        zzqqVar.zzI();
        int zze = zzqqVar.zze(zzn);
        zzqqVar.zza++;
        zzugVar.zzh(obj, this, zzryVar);
        zzqqVar.zzz(0);
        zzqqVar.zza--;
        zzqqVar.zzA(zze);
    }

    private final void zzR(int i10) {
        if (this.zza.zzd() != i10) {
            throw new zzsx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzS(int i10) {
        if ((this.zzb & 7) != i10) {
            throw new zzsw("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzT(int i10) {
        if ((i10 & 3) != 0) {
            throw new zzsx("Failed to parse the message.");
        }
    }

    private static final void zzU(int i10) {
        if ((i10 & 7) != 0) {
            throw new zzsx("Failed to parse the message.");
        }
    }

    public static zzqr zzq(zzqq zzqqVar) {
        zzqr zzqrVar = zzqqVar.zzd;
        return zzqrVar != null ? zzqrVar : new zzqr(zzqqVar);
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzA(List list) {
        int zzm;
        int i10;
        if (list instanceof zzth) {
            zzth zzthVar = (zzth) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzn = zzqqVar.zzn();
                zzU(zzn);
                int zzd = zzqqVar.zzd() + zzn;
                do {
                    zzthVar.zzg(zzqqVar.zzo());
                } while (zzqqVar.zzd() < zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzthVar.zzg(zzqqVar2.zzo());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzn2 = zzqqVar3.zzn();
                zzU(zzn2);
                int zzd2 = zzqqVar3.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(zzqqVar3.zzo()));
                } while (zzqqVar3.zzd() < zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Long.valueOf(zzqqVar4.zzo()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzB(List list) {
        int zzm;
        int i10;
        if (list instanceof zzsf) {
            zzsf zzsfVar = (zzsf) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zzqq zzqqVar = this.zza;
                int zzn = zzqqVar.zzn();
                zzT(zzn);
                int zzd = zzqqVar.zzd() + zzn;
                do {
                    zzsfVar.zzf(zzqqVar.zzc());
                } while (zzqqVar.zzd() < zzd);
                return;
            }
            if (i11 != 5) {
                throw new zzsw("Protocol message tag had invalid wire type.");
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzsfVar.zzf(zzqqVar2.zzc());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                zzqq zzqqVar3 = this.zza;
                int zzn2 = zzqqVar3.zzn();
                zzT(zzn2);
                int zzd2 = zzqqVar3.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(zzqqVar3.zzc()));
                } while (zzqqVar3.zzd() < zzd2);
                return;
            }
            if (i12 != 5) {
                throw new zzsw("Protocol message tag had invalid wire type.");
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Float.valueOf(zzqqVar4.zzc()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    @Deprecated
    public final void zzC(List list, zzug zzugVar, zzry zzryVar) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw new zzsw("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzugVar.zze();
            zzP(zze, zzugVar, zzryVar);
            zzugVar.zzf(zze);
            list.add(zze);
            zzqq zzqqVar = this.zza;
            if (zzqqVar.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = zzqqVar.zzm();
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzD(List list) {
        int zzm;
        int i10;
        if (list instanceof zzso) {
            zzso zzsoVar = (zzso) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzd = zzqqVar.zzd() + zzqqVar.zzn();
                do {
                    zzsoVar.zzh(zzqqVar.zzh());
                } while (zzqqVar.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzsoVar.zzh(zzqqVar2.zzh());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzqqVar3.zzh()));
                } while (zzqqVar3.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Integer.valueOf(zzqqVar4.zzh()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzE(List list) {
        int zzm;
        int i10;
        if (list instanceof zzth) {
            zzth zzthVar = (zzth) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzd = zzqqVar.zzd() + zzqqVar.zzn();
                do {
                    zzthVar.zzg(zzqqVar.zzp());
                } while (zzqqVar.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzthVar.zzg(zzqqVar2.zzp());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
                do {
                    list.add(Long.valueOf(zzqqVar3.zzp()));
                } while (zzqqVar3.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Long.valueOf(zzqqVar4.zzp()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzF(List list, zzug zzugVar, zzry zzryVar) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw new zzsw("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzugVar.zze();
            zzQ(zze, zzugVar, zzryVar);
            zzugVar.zzf(zze);
            list.add(zze);
            zzqq zzqqVar = this.zza;
            if (zzqqVar.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = zzqqVar.zzm();
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzG(List list) {
        int zzm;
        int i10;
        if (list instanceof zzso) {
            zzso zzsoVar = (zzso) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zzqq zzqqVar = this.zza;
                int zzn = zzqqVar.zzn();
                zzT(zzn);
                int zzd = zzqqVar.zzd() + zzn;
                do {
                    zzsoVar.zzh(zzqqVar.zzk());
                } while (zzqqVar.zzd() < zzd);
                return;
            }
            if (i11 != 5) {
                throw new zzsw("Protocol message tag had invalid wire type.");
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzsoVar.zzh(zzqqVar2.zzk());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                zzqq zzqqVar3 = this.zza;
                int zzn2 = zzqqVar3.zzn();
                zzT(zzn2);
                int zzd2 = zzqqVar3.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(zzqqVar3.zzk()));
                } while (zzqqVar3.zzd() < zzd2);
                return;
            }
            if (i12 != 5) {
                throw new zzsw("Protocol message tag had invalid wire type.");
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Integer.valueOf(zzqqVar4.zzk()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzH(List list) {
        int zzm;
        int i10;
        if (list instanceof zzth) {
            zzth zzthVar = (zzth) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzn = zzqqVar.zzn();
                zzU(zzn);
                int zzd = zzqqVar.zzd() + zzn;
                do {
                    zzthVar.zzg(zzqqVar.zzt());
                } while (zzqqVar.zzd() < zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzthVar.zzg(zzqqVar2.zzt());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzn2 = zzqqVar3.zzn();
                zzU(zzn2);
                int zzd2 = zzqqVar3.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(zzqqVar3.zzt()));
                } while (zzqqVar3.zzd() < zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Long.valueOf(zzqqVar4.zzt()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzI(List list) {
        int zzm;
        int i10;
        if (list instanceof zzso) {
            zzso zzsoVar = (zzso) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzd = zzqqVar.zzd() + zzqqVar.zzn();
                do {
                    zzsoVar.zzh(zzqqVar.zzl());
                } while (zzqqVar.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzsoVar.zzh(zzqqVar2.zzl());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzqqVar3.zzl()));
                } while (zzqqVar3.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Integer.valueOf(zzqqVar4.zzl()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzJ(List list) {
        int zzm;
        int i10;
        if (list instanceof zzth) {
            zzth zzthVar = (zzth) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzd = zzqqVar.zzd() + zzqqVar.zzn();
                do {
                    zzthVar.zzg(zzqqVar.zzu());
                } while (zzqqVar.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzthVar.zzg(zzqqVar2.zzu());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
                do {
                    list.add(Long.valueOf(zzqqVar3.zzu()));
                } while (zzqqVar3.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Long.valueOf(zzqqVar4.zzu()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    public final void zzK(List list, boolean z10) {
        int zzm;
        int i10;
        if ((this.zzb & 7) != 2) {
            throw new zzsw("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzte) && !z10) {
            zzte zzteVar = (zzte) list;
            do {
                zzp();
                zzteVar.zzb();
                zzqq zzqqVar = this.zza;
                if (zzqqVar.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            do {
                list.add(z10 ? zzs() : zzr());
                zzqq zzqqVar2 = this.zza;
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar2.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzL(List list) {
        int zzm;
        int i10;
        if (list instanceof zzso) {
            zzso zzsoVar = (zzso) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzd = zzqqVar.zzd() + zzqqVar.zzn();
                do {
                    zzsoVar.zzh(zzqqVar.zzn());
                } while (zzqqVar.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzsoVar.zzh(zzqqVar2.zzn());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzqqVar3.zzn()));
                } while (zzqqVar3.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Integer.valueOf(zzqqVar4.zzn()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzM(List list) {
        int zzm;
        int i10;
        if (list instanceof zzth) {
            zzth zzthVar = (zzth) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzd = zzqqVar.zzd() + zzqqVar.zzn();
                do {
                    zzthVar.zzg(zzqqVar.zzv());
                } while (zzqqVar.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzthVar.zzg(zzqqVar2.zzv());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
                do {
                    list.add(Long.valueOf(zzqqVar3.zzv()));
                } while (zzqqVar3.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Long.valueOf(zzqqVar4.zzv()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final boolean zzO() {
        int i10;
        zzqq zzqqVar = this.zza;
        if (zzqqVar.zzC() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return zzqqVar.zzE(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        return (i10 == 0 || i10 == this.zzc) ? ConnectionsManager.DEFAULT_DATACENTER_ID : i10 >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final zzqm zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzt(Object obj, zzug zzugVar, zzry zzryVar) {
        zzS(3);
        zzP(obj, zzugVar, zzryVar);
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzu(Object obj, zzug zzugVar, zzry zzryVar) {
        zzS(2);
        zzQ(obj, zzugVar, zzryVar);
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzv(List list) {
        int zzm;
        int i10;
        if (list instanceof zzqd) {
            zzqd zzqdVar = (zzqd) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzd = zzqqVar.zzd() + zzqqVar.zzn();
                do {
                    zzqdVar.zze(zzqqVar.zzD());
                } while (zzqqVar.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzqdVar.zze(zzqqVar2.zzD());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
                do {
                    list.add(Boolean.valueOf(zzqqVar3.zzD()));
                } while (zzqqVar3.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Boolean.valueOf(zzqqVar4.zzD()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw new zzsw("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            zzqq zzqqVar = this.zza;
            if (zzqqVar.zzC()) {
                return;
            } else {
                zzm = zzqqVar.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzx(List list) {
        int zzm;
        int i10;
        if (list instanceof zzrs) {
            zzrs zzrsVar = (zzrs) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzn = zzqqVar.zzn();
                zzU(zzn);
                int zzd = zzqqVar.zzd() + zzn;
                do {
                    zzrsVar.zzf(zzqqVar.zzb());
                } while (zzqqVar.zzd() < zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzrsVar.zzf(zzqqVar2.zzb());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzn2 = zzqqVar3.zzn();
                zzU(zzn2);
                int zzd2 = zzqqVar3.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(zzqqVar3.zzb()));
                } while (zzqqVar3.zzd() < zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Double.valueOf(zzqqVar4.zzb()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzy(List list) {
        int zzm;
        int i10;
        if (list instanceof zzso) {
            zzso zzsoVar = (zzso) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar = this.zza;
                int zzd = zzqqVar.zzd() + zzqqVar.zzn();
                do {
                    zzsoVar.zzh(zzqqVar.zzf());
                } while (zzqqVar.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzsoVar.zzh(zzqqVar2.zzf());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzsw("Protocol message tag had invalid wire type.");
                }
                zzqq zzqqVar3 = this.zza;
                int zzd2 = zzqqVar3.zzd() + zzqqVar3.zzn();
                do {
                    list.add(Integer.valueOf(zzqqVar3.zzf()));
                } while (zzqqVar3.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Integer.valueOf(zzqqVar4.zzf()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzuf
    public final void zzz(List list) {
        int zzm;
        int i10;
        if (list instanceof zzso) {
            zzso zzsoVar = (zzso) list;
            int i11 = this.zzb & 7;
            if (i11 == 2) {
                zzqq zzqqVar = this.zza;
                int zzn = zzqqVar.zzn();
                zzT(zzn);
                int zzd = zzqqVar.zzd() + zzn;
                do {
                    zzsoVar.zzh(zzqqVar.zzg());
                } while (zzqqVar.zzd() < zzd);
                return;
            }
            if (i11 != 5) {
                throw new zzsw("Protocol message tag had invalid wire type.");
            }
            do {
                zzqq zzqqVar2 = this.zza;
                zzsoVar.zzh(zzqqVar2.zzg());
                if (zzqqVar2.zzC()) {
                    return;
                } else {
                    i10 = zzqqVar2.zzm();
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 == 2) {
                zzqq zzqqVar3 = this.zza;
                int zzn2 = zzqqVar3.zzn();
                zzT(zzn2);
                int zzd2 = zzqqVar3.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(zzqqVar3.zzg()));
                } while (zzqqVar3.zzd() < zzd2);
                return;
            }
            if (i12 != 5) {
                throw new zzsw("Protocol message tag had invalid wire type.");
            }
            do {
                zzqq zzqqVar4 = this.zza;
                list.add(Integer.valueOf(zzqqVar4.zzg()));
                if (zzqqVar4.zzC()) {
                    return;
                } else {
                    zzm = zzqqVar4.zzm();
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }
}
