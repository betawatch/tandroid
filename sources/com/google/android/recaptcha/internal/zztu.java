package com.google.android.recaptcha.internal;

import j3.r0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;
import ta.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zztu {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzts zztsVar, String str) {
        StringBuilder e10 = b.e("# ", str);
        zzd(zztsVar, e10, 0);
        return e10.toString();
    }

    public static void zzb(StringBuilder sb2, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzc(i9, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            zzqm zzqmVar = zzqm.zzb;
            sb2.append(zzuq.zza(new zzqk(((String) obj).getBytes(zzsv.zza))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzqm) {
            sb2.append(": \"");
            sb2.append(zzuq.zza((zzqm) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzsn) {
            sb2.append(" {");
            zzd((zzsn) obj, sb2, i9 + 2);
            sb2.append("\n");
            zzc(i9, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i11 = i9 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i11, "key", entry.getKey());
        zzb(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        zzc(i9, sb2);
        sb2.append("}");
    }

    private static void zzc(int i9, StringBuilder sb2) {
        while (i9 > 0) {
            int i10 = 80;
            if (i9 <= 80) {
                i10 = i9;
            }
            sb2.append(zza, 0, i10);
            i9 -= i10;
        }
    }

    private static void zzd(zzts zztsVar, StringBuilder sb2, int i9) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zztsVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i9, substring.substring(0, substring.length() - 4), zzsn.zzE(method2, zztsVar, new Object[0]));
            } else if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i9, substring.substring(0, substring.length() - 3), zzsn.zzE(method, zztsVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzE = zzsn.zzE(method4, zztsVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzsn.zzE(method5, zztsVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i9, substring, zzE);
                    } else if (zzE instanceof Boolean) {
                        if (!((Boolean) zzE).booleanValue()) {
                        }
                        zzb(sb2, i9, substring, zzE);
                    } else if (zzE instanceof Integer) {
                        if (((Integer) zzE).intValue() == 0) {
                        }
                        zzb(sb2, i9, substring, zzE);
                    } else if (zzE instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzE).floatValue()) == 0) {
                        }
                        zzb(sb2, i9, substring, zzE);
                    } else if (zzE instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzE).doubleValue()) == 0) {
                        }
                        zzb(sb2, i9, substring, zzE);
                    } else {
                        if (zzE instanceof String) {
                            equals = zzE.equals("");
                        } else if (zzE instanceof zzqm) {
                            equals = zzE.equals(zzqm.zzb);
                        } else if (zzE instanceof zzts) {
                            if (zzE == ((zzts) zzE).zzm()) {
                            }
                            zzb(sb2, i9, substring, zzE);
                        } else {
                            if ((zzE instanceof Enum) && ((Enum) zzE).ordinal() == 0) {
                            }
                            zzb(sb2, i9, substring, zzE);
                        }
                        if (equals) {
                        }
                        zzb(sb2, i9, substring, zzE);
                    }
                }
            }
            i10 = 3;
        }
        if (zztsVar instanceof zzsk) {
            Iterator zzf = ((zzsk) zztsVar).zzb.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb2, i9, r0.m(((zzsl) entry2.getKey()).zza, "[", "]"), entry2.getValue());
            }
        }
        zzuw zzuwVar = ((zzsn) zztsVar).zzc;
        if (zzuwVar != null) {
            zzuwVar.zzi(sb2, i9);
        }
    }
}
