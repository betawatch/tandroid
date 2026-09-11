package com.google.android.recaptcha.internal;

import gd.i;
import id.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import jd.a;
import kd.j;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.q;
import rd.p;
import v7.t7;
import zd.b0;
import zd.c0;
import zd.f1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    @Override // kd.a
    public final c create(Object obj, c cVar) {
        zzin zzinVar = new zzin(this.zza, this.zzb, this.zzc, cVar);
        zzinVar.zzd = obj;
        return zzinVar;
    }

    @Override // rd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((c0) obj, (c) obj2)).invokeSuspend(i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        zzys zzysVar;
        String str;
        a aVar = a.a;
        t7.b(obj);
        c0 c0Var = (c0) this.zzd;
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
                    xd.j.i(simpleName, enclosingMethod.getName() + '$', simpleName);
                } else {
                    Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        xd.j.i(simpleName, enclosingConstructor.getName() + '$', simpleName);
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
        f1 f1Var = (f1) c0Var.c().get(b0.b);
        if (f1Var != null ? f1Var.isActive() : true) {
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
