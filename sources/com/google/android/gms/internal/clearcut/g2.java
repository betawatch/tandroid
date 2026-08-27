package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class g2 {
    public static HashMap f;
    public static Object k;
    public static boolean l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    public static final HashMap g = new HashMap();
    public static final HashMap h = new HashMap();
    public static final HashMap i = new HashMap();
    public static final HashMap j = new HashMap();
    public static final String[] m = new String[0];

    public static Object a(HashMap hashMap, String str, Object obj) {
        synchronized (g2.class) {
            try {
                if (!hashMap.containsKey(str)) {
                    return null;
                }
                Object obj2 = hashMap.get(str);
                if (obj2 != null) {
                    obj = obj2;
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static String b(ContentResolver contentResolver, String str) {
        String str2;
        synchronized (g2.class) {
            try {
                c(contentResolver);
                Object obj = k;
                if (f.containsKey(str)) {
                    String str3 = (String) f.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : m) {
                    if (str.startsWith(str4)) {
                        if (!l || f.isEmpty()) {
                            String[] strArr = m;
                            HashMap hashMap = f;
                            Cursor query = contentResolver.query(b, null, null, strArr, null);
                            TreeMap treeMap = new TreeMap();
                            if (query != null) {
                                while (query.moveToNext()) {
                                    try {
                                        treeMap.put(query.getString(0), query.getString(1));
                                    } finally {
                                        query.close();
                                    }
                                }
                            }
                            hashMap.putAll(treeMap);
                            l = true;
                            if (f.containsKey(str) && (str2 = (String) f.get(str)) != null) {
                                r3 = str2;
                            }
                        }
                        return r3;
                    }
                }
                Cursor query2 = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query2 != null) {
                    try {
                        if (query2.moveToFirst()) {
                            String string = query2.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            d(obj, str, string);
                            r3 = string != null ? string : null;
                            query2.close();
                            return r3;
                        }
                    } catch (Throwable th) {
                        if (query2 == null) {
                            throw th;
                        }
                        query2.close();
                        throw th;
                    }
                }
                d(obj, str, null);
                if (query2 != null) {
                    query2.close();
                }
                return null;
            } finally {
            }
        }
    }

    public static void c(ContentResolver contentResolver) {
        HashMap hashMap = f;
        AtomicBoolean atomicBoolean = e;
        if (hashMap == null) {
            atomicBoolean.set(false);
            f = new HashMap();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new h2(null, 0));
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    public static void d(Object obj, String str, String str2) {
        synchronized (g2.class) {
            try {
                if (obj == k) {
                    f.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (g2.class) {
            try {
                if (obj == k) {
                    hashMap.put(str, obj2);
                    f.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
