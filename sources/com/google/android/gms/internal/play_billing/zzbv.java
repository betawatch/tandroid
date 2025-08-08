package com.google.android.gms.internal.play_billing;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Supplier;
import j$.util.stream.Collector;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class zzbv {
    private static final Collector zza = Collector.-CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbj
        @Override // j$.util.function.Supplier
        public final Object get() {
            return new zzck(4);
        }
    }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbm
        @Override // j$.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((zzck) obj).zzd(obj2);
        }

        @Override // j$.util.function.BiConsumer
        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer.-CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbn
        @Override // j$.util.function.BiFunction
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction.-CC.$default$andThen(this, function);
        }

        @Override // j$.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            zzck zzckVar = (zzck) obj;
            zzck zzckVar2 = (zzck) obj2;
            zzckVar.zzb(zzckVar2.zza, zzckVar2.zzb);
            return zzckVar;
        }
    }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbo
        @Override // j$.util.function.Function
        public /* synthetic */ Function andThen(Function function) {
            return Function.-CC.$default$andThen(this, function);
        }

        @Override // j$.util.function.Function
        public final Object apply(Object obj) {
            return ((zzck) obj).zze();
        }

        @Override // j$.util.function.Function
        public /* synthetic */ Function compose(Function function) {
            return Function.-CC.$default$compose(this, function);
        }
    }, new Collector.Characteristics[0]);

    static {
        Collector.-CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbp
            @Override // j$.util.function.Supplier
            public final Object get() {
                return new zzcu();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbq
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((zzcu) obj).zzd(obj2);
            }

            @Override // j$.util.function.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbr
            @Override // j$.util.function.BiFunction
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.-CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                zzcu zzcuVar = (zzcu) obj;
                zzcu zzcuVar2 = (zzcu) obj2;
                zzcuVar.zzb(zzcuVar2.zza, zzcuVar2.zzb);
                return zzcuVar;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbs
            @Override // j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return Function.-CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return Function.-CC.$default$compose(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                zzcv zzl;
                zzcu zzcuVar = (zzcu) obj;
                int i = zzcuVar.zzb;
                if (i == 0) {
                    return zzdq.zza;
                }
                if (i == 1) {
                    Object obj2 = zzcuVar.zza[0];
                    Objects.requireNonNull(obj2);
                    return new zzdt(obj2);
                }
                zzl = zzcv.zzl(i, zzcuVar.zza);
                zzcuVar.zzb = zzl.size();
                zzcuVar.zzc = true;
                return zzl;
            }
        }, new Collector.Characteristics[0]);
        Collector.-CC.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbt
            @Override // j$.util.function.Supplier
            public final Object get() {
                return new zzcs();
            }
        }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbu
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((zzcs) obj).zza((zzdh) obj2);
            }

            @Override // j$.util.function.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbk
            @Override // j$.util.function.BiFunction
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction.-CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzb((zzcs) obj2);
                return zzcsVar;
            }
        }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbl
            @Override // j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return Function.-CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return ((zzcs) obj).zzc();
            }

            @Override // j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return Function.-CC.$default$compose(this, function);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector zza() {
        return zza;
    }
}
