package h2;

import a0.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class d {
    public static volatile ArrayList a;
    public static final Object b = new Object();

    public static String a(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue(null, str) : attributeValue;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static a0.f c(File file, Context context) {
        f f10;
        a0.f fVar = new a0.f(0);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                if (file.exists()) {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(fileInputStream, "UTF_8");
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2 && newPullParser.getName().equals("target") && (f10 = f(newPullParser, context)) != null) {
                            fVar.put(f10.c.b, f10);
                        }
                    }
                }
                fileInputStream.close();
                return fVar;
            } finally {
            }
        } catch (Exception e9) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e9);
            return fVar;
        }
    }

    public static c d(XmlResourceParser xmlResourceParser) {
        String a2 = a(xmlResourceParser, "targetClass");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlResourceParser.getName().equals("share-target")) {
                        break;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    name.getClass();
                    if (name.equals("data")) {
                        a(xmlResourceParser, "scheme");
                        a(xmlResourceParser, "host");
                        a(xmlResourceParser, "port");
                        a(xmlResourceParser, "path");
                        a(xmlResourceParser, "pathPattern");
                        a(xmlResourceParser, "pathPrefix");
                        arrayList.add(new b(a(xmlResourceParser, "mimeType")));
                    } else if (name.equals("category")) {
                        arrayList2.add(a(xmlResourceParser, "name"));
                    }
                }
            } else {
                break;
            }
        }
        if (arrayList.isEmpty() || a2 == null || arrayList2.isEmpty()) {
            return null;
        }
        return new c((b[]) arrayList.toArray(new b[arrayList.size()]), a2, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
    }

    public static ArrayList e(Context context) {
        c d;
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                Bundle bundle = activityInfo.metaData;
                if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                    ArrayList arrayList2 = new ArrayList();
                    XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                    if (loadXmlMetaData == null) {
                        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
                    }
                    while (true) {
                        try {
                            int next = loadXmlMetaData.next();
                            if (next == 1) {
                                break;
                            }
                            if (next == 2 && loadXmlMetaData.getName().equals("share-target") && (d = d(loadXmlMetaData)) != null) {
                                arrayList2.add(d);
                            }
                        } catch (Exception e9) {
                            Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e9);
                        }
                    }
                    loadXmlMetaData.close();
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public static f f(XmlPullParser xmlPullParser, Context context) {
        Intent intent;
        if (!xmlPullParser.getName().equals("target")) {
            return null;
        }
        String b10 = b(xmlPullParser, "id");
        String b11 = b(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(b10) || TextUtils.isEmpty(b11)) {
            return null;
        }
        int parseInt = Integer.parseInt(b(xmlPullParser, "rank"));
        String b12 = b(xmlPullParser, "long_label");
        String b13 = b(xmlPullParser, "disabled_message");
        String b14 = b(xmlPullParser, "component");
        ComponentName unflattenFromString = TextUtils.isEmpty(b14) ? null : ComponentName.unflattenFromString(b14);
        String b15 = b(xmlPullParser, "icon_resource_name");
        String b16 = b(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next != 2) {
                    if (next == 3 && xmlPullParser.getName().equals("target")) {
                        break;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (name.equals("intent")) {
                        String b17 = b(xmlPullParser, "action");
                        String b18 = b(xmlPullParser, "targetPackage");
                        String b19 = b(xmlPullParser, "targetClass");
                        if (b17 == null) {
                            intent = null;
                        } else {
                            intent = new Intent(b17);
                            if (!TextUtils.isEmpty(b18) && !TextUtils.isEmpty(b19)) {
                                intent.setClassName(b18, b19);
                            }
                        }
                        if (intent != null) {
                            arrayList.add(intent);
                        }
                    } else if (name.equals("categories")) {
                        String b20 = b(xmlPullParser, "name");
                        if (!TextUtils.isEmpty(b20)) {
                            hashSet.add(b20);
                        }
                    }
                }
            } else {
                break;
            }
        }
        g0.c cVar = new g0.c();
        cVar.a = context;
        cVar.b = b10;
        cVar.e = b11;
        cVar.m = parseInt;
        if (!TextUtils.isEmpty(b12)) {
            cVar.f = b12;
        }
        if (!TextUtils.isEmpty(b13)) {
            cVar.g = b13;
        }
        if (unflattenFromString != null) {
            cVar.d = unflattenFromString;
        }
        if (!arrayList.isEmpty()) {
            cVar.c = (Intent[]) arrayList.toArray(new Intent[0]);
        }
        if (!hashSet.isEmpty()) {
            g gVar = new g(0);
            gVar.addAll(hashSet);
            cVar.j = gVar;
        }
        if (TextUtils.isEmpty(cVar.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = cVar.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return new f(cVar, b15, b16);
    }

    public static void g(XmlSerializer xmlSerializer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void h(XmlSerializer xmlSerializer, f fVar) {
        xmlSerializer.startTag(null, "target");
        g0.c cVar = fVar.c;
        String str = fVar.b;
        String str2 = fVar.a;
        g(xmlSerializer, "id", cVar.b);
        g(xmlSerializer, "short_label", cVar.e.toString());
        g(xmlSerializer, "rank", Integer.toString(cVar.m));
        if (!TextUtils.isEmpty(cVar.f)) {
            g(xmlSerializer, "long_label", cVar.f.toString());
        }
        if (!TextUtils.isEmpty(cVar.g)) {
            g(xmlSerializer, "disabled_message", cVar.g.toString());
        }
        ComponentName componentName = cVar.d;
        if (componentName != null) {
            g(xmlSerializer, "component", componentName.flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            g(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            g(xmlSerializer, "icon_bitmap_path", str);
        }
        Intent[] intentArr = cVar.c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr, intentArr.length)) {
            xmlSerializer.startTag(null, "intent");
            g(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                g(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                g(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : cVar.j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                g(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
