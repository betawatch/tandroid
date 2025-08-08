package com.google.android.gms.internal.cast;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class zzuz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzux zzuxVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzuxVar, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzvx.zza(new zzsr(((String) obj).getBytes(zzty.zzb))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzsu) {
            sb.append(": \"");
            sb.append(zzvx.zza((zzsu) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zztp) {
            sb.append(" {");
            zzd((zztp) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzux zzuxVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzuxVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, substring.substring(0, substring.length() - 4), zztp.zzD(method2, zzuxVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zztp.zzD(method, zzuxVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzD = zztp.zzD(method4, zzuxVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zztp.zzD(method5, zzuxVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzD);
                    } else if (zzD instanceof Boolean) {
                        if (!((Boolean) zzD).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzD);
                    } else if (zzD instanceof Integer) {
                        if (((Integer) zzD).intValue() == 0) {
                        }
                        zzb(sb, i, substring, zzD);
                    } else if (zzD instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzD).floatValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzD);
                    } else if (zzD instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzD).doubleValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzD);
                    } else {
                        if (zzD instanceof String) {
                            equals = zzD.equals("");
                        } else if (zzD instanceof zzsu) {
                            equals = zzD.equals(zzsu.zzb);
                        } else if (zzD instanceof zzux) {
                            if (zzD == ((zzux) zzD).zzt()) {
                            }
                            zzb(sb, i, substring, zzD);
                        } else {
                            if ((zzD instanceof Enum) && ((Enum) zzD).ordinal() == 0) {
                            }
                            zzb(sb, i, substring, zzD);
                        }
                        if (equals) {
                        }
                        zzb(sb, i, substring, zzD);
                    }
                }
            }
            i2 = 3;
        }
        zzwa zzwaVar = ((zztp) zzuxVar).zzc;
        if (zzwaVar != null) {
            zzwaVar.zzg(sb, i);
        }
    }
}
