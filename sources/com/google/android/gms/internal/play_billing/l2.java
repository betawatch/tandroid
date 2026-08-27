package com.google.android.gms.internal.play_billing;

import g7.e6;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class l2 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
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
            k1 k1Var = k1.c;
            sb2.append(e6.a(new k1(((String) obj).getBytes(z1.a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof k1) {
            sb2.append(": \"");
            sb2.append(e6.a((k1) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof u1) {
            sb2.append(" {");
            c((u1) obj, sb2, i10 + 2);
            sb2.append("\n");
            b(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb2, i12, "key", entry.getKey());
        a(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        b(i10, sb2);
        sb2.append("}");
    }

    public static void b(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(a, 0, i11);
            i10 -= i11;
        }
    }

    public static void c(u1 u1Var, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = u1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
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
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null) {
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i10, substring.substring(0, substring.length() - 4), u1.i(method2, u1Var, new Object[0]));
                    i11 = 3;
                }
            }
            if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i10, substring.substring(0, substring.length() - 3), u1.i(method, u1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i13 = u1.i(method4, u1Var, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) u1.i(method5, u1Var, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i10, substring, i13);
                    } else if (i13 instanceof Boolean) {
                        if (!((Boolean) i13).booleanValue()) {
                        }
                        a(sb2, i10, substring, i13);
                    } else if (i13 instanceof Integer) {
                        if (((Integer) i13).intValue() == 0) {
                        }
                        a(sb2, i10, substring, i13);
                    } else if (i13 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) i13).floatValue()) == 0) {
                        }
                        a(sb2, i10, substring, i13);
                    } else if (i13 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) i13).doubleValue()) == 0) {
                        }
                        a(sb2, i10, substring, i13);
                    } else {
                        if (i13 instanceof String) {
                            equals = i13.equals("");
                        } else if (i13 instanceof k1) {
                            equals = i13.equals(k1.c);
                        } else if (i13 instanceof e1) {
                            if (i13 == ((u1) ((u1) ((e1) i13)).d(6))) {
                            }
                            a(sb2, i10, substring, i13);
                        } else {
                            if ((i13 instanceof Enum) && ((Enum) i13).ordinal() == 0) {
                            }
                            a(sb2, i10, substring, i13);
                        }
                        if (equals) {
                        }
                        a(sb2, i10, substring, i13);
                    }
                }
            }
            i11 = 3;
        }
        w2 w2Var = u1Var.zzc;
        if (w2Var != null) {
            for (int i14 = 0; i14 < w2Var.a; i14++) {
                a(sb2, i10, String.valueOf(w2Var.b[i14] >>> 3), w2Var.c[i14]);
            }
        }
    }
}
