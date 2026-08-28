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
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class y5 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        b(i9, sb2);
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
            sb2.append(f7.u5.a(new x4(((String) obj).getBytes(l5.a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof x4) {
            sb2.append(": \"");
            sb2.append(f7.u5.a((x4) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof f5) {
            sb2.append(" {");
            c((f5) obj, sb2, i9 + 2);
            sb2.append("\n");
            b(i9, sb2);
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
        a(sb2, i11, "key", entry.getKey());
        a(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        b(i9, sb2);
        sb2.append("}");
    }

    public static void b(int i9, StringBuilder sb2) {
        while (i9 > 0) {
            int i10 = 80;
            if (i9 <= 80) {
                i10 = i9;
            }
            sb2.append(a, 0, i10);
            i9 -= i10;
        }
    }

    public static void c(f5 f5Var, StringBuilder sb2, int i9) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = f5Var.getClass().getDeclaredMethods();
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
                a(sb2, i9, substring.substring(0, substring.length() - 4), f5.c(method2, f5Var, new Object[0]));
            } else if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i9, substring.substring(0, substring.length() - 3), f5.c(method, f5Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object c10 = f5.c(method4, f5Var, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) f5.c(method5, f5Var, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i9, substring, c10);
                    } else if (c10 instanceof Boolean) {
                        if (!((Boolean) c10).booleanValue()) {
                        }
                        a(sb2, i9, substring, c10);
                    } else if (c10 instanceof Integer) {
                        if (((Integer) c10).intValue() == 0) {
                        }
                        a(sb2, i9, substring, c10);
                    } else if (c10 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) c10).floatValue()) == 0) {
                        }
                        a(sb2, i9, substring, c10);
                    } else if (c10 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) c10).doubleValue()) == 0) {
                        }
                        a(sb2, i9, substring, c10);
                    } else {
                        if (c10 instanceof String) {
                            equals = c10.equals("");
                        } else if (c10 instanceof x4) {
                            equals = c10.equals(x4.c);
                        } else if (c10 instanceof t4) {
                            if (c10 == ((f5) ((f5) ((t4) c10)).h(6, null))) {
                            }
                            a(sb2, i9, substring, c10);
                        } else {
                            if ((c10 instanceof Enum) && ((Enum) c10).ordinal() == 0) {
                            }
                            a(sb2, i9, substring, c10);
                        }
                        if (equals) {
                        }
                        a(sb2, i9, substring, c10);
                    }
                }
            }
            i10 = 3;
        }
    }
}
