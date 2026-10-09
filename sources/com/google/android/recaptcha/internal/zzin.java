package com.google.android.recaptcha.internal;

import ae.c0;
import ae.d0;
import ae.h1;
import hd.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import jd.c;
import kd.a;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.q;
import ld.j;
import sd.p;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
final class zzin extends j implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zziz zzb;
    final /* synthetic */ zzip zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(Exception exc, zziz zzizVar, zzip zzipVar, c cVar) {
        super(2, cVar);
        this.zza = exc;
        this.zzb = zzizVar;
        this.zzc = zzipVar;
    }

    @Override // ld.a
    public final c create(Object obj, c cVar) {
        zzin zzinVar = new zzin(this.zza, this.zzb, this.zzc, cVar);
        zzinVar.zzd = obj;
        return zzinVar;
    }

    @Override // sd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((d0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        zzys zzysVar;
        String str;
        a aVar = a.a;
        a8.b(obj);
        d0 d0Var = (d0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzdm) {
            zzysVar = ((zzdm) exc).zza();
            zzysVar.zze(this.zzb.zza());
        } else {
            zziz zzizVar = this.zzb;
            zzys zzf = zzyt.zzf();
            zzf.zze(zzizVar.zza());
            zzf.zzr(2);
            zzf.zzq(2);
            zzysVar = zzf;
        }
        zzyt zzytVar = (zzyt) zzysVar.zzk();
        zzytVar.zzl();
        zzytVar.zzk();
        d a2 = q.a(exc.getClass());
        LinkedHashMap linkedHashMap = d.c;
        Class jClass = a2.a;
        kotlin.jvm.internal.i.e(jClass, "jClass");
        if (!jClass.isAnonymousClass()) {
            if (jClass.isLocalClass()) {
                String simpleName = jClass.getSimpleName();
                Method enclosingMethod = jClass.getEnclosingMethod();
                if (enclosingMethod != null) {
                    yd.j.i(simpleName, enclosingMethod.getName() + '$', simpleName);
                } else {
                    Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        yd.j.i(simpleName, enclosingConstructor.getName() + '$', simpleName);
                    } else {
                        int indexOf = simpleName.indexOf(36, 0);
                        if (indexOf != -1) {
                            kotlin.jvm.internal.i.d(simpleName.substring(indexOf + 1, simpleName.length()), "substring(...)");
                        }
                    }
                }
            } else if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                    str.concat("Array");
                }
            }
        }
        exc.getMessage();
        zziz zzizVar2 = this.zzb;
        zzcs zzb = zzizVar2.zzb();
        zzcs zzcsVar = zzizVar2.zza;
        if (zzcsVar == null) {
            zzcsVar = null;
        }
        zzww zza = zzhd.zza(zzb, zzcsVar);
        String zzd = zzizVar2.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        h1 h1Var = (h1) d0Var.c().get(c0.b);
        if (h1Var != null ? h1Var.isActive() : true) {
            zzip zzipVar = this.zzc;
            zzpp zzh = zzpp.zzh();
            byte[] zzd2 = zzytVar.zzd();
            String zzi = zzh.zzi(zzd2, 0, zzd2.length);
            zzpp zzh2 = zzpp.zzh();
            byte[] zzd3 = zza.zzd();
            zzipVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzi, zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return i.a;
    }
}
