package com.google.android.gms.internal.play_billing;

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

/* loaded from: classes.dex */
abstract class zzgn {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzgl zzglVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzglVar, sb, 0);
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
            zzei zzeiVar = zzei.zzb;
            sb.append(zzhf.zza(new zzeg(((String) obj).getBytes(zzfo.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzei) {
            sb.append(": \"");
            sb.append(zzhf.zza((zzei) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzfi) {
            sb.append(" {");
            zzd((zzfi) obj, sb, i + 2);
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

    private static void zzd(zzgl zzglVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzglVar.getClass().getDeclaredMethods();
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
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzfi.zzs(method2, zzglVar, new Object[0]));
            } else if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzfi.zzs(method, zzglVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzs = zzfi.zzs(method4, zzglVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzfi.zzs(method5, zzglVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzs);
                    } else if (zzs instanceof Boolean) {
                        if (!((Boolean) zzs).booleanValue()) {
                        }
                        zzb(sb, i, substring, zzs);
                    } else if (zzs instanceof Integer) {
                        if (((Integer) zzs).intValue() == 0) {
                        }
                        zzb(sb, i, substring, zzs);
                    } else if (zzs instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzs).floatValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzs);
                    } else if (zzs instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzs).doubleValue()) == 0) {
                        }
                        zzb(sb, i, substring, zzs);
                    } else {
                        if (zzs instanceof String) {
                            equals = zzs.equals("");
                        } else if (zzs instanceof zzei) {
                            equals = zzs.equals(zzei.zzb);
                        } else if (zzs instanceof zzgl) {
                            if (zzs == ((zzgl) zzs).zzh()) {
                            }
                            zzb(sb, i, substring, zzs);
                        } else {
                            if ((zzs instanceof Enum) && ((Enum) zzs).ordinal() == 0) {
                            }
                            zzb(sb, i, substring, zzs);
                        }
                        if (equals) {
                        }
                        zzb(sb, i, substring, zzs);
                    }
                }
            }
            i2 = 3;
        }
        zzhi zzhiVar = ((zzfi) zzglVar).zzc;
        if (zzhiVar != null) {
            zzhiVar.zzi(sb, i);
        }
    }
}
