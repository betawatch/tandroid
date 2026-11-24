// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hwe {
    public static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    public static qt b(File file, Context context) {
        wia c;
        qt qtVar = new qt(0);
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
                        if (next == 2 && newPullParser.getName().equals("target") && (c = c(newPullParser, context)) != null) {
                            qtVar.put(c.c.b, c);
                        }
                    }
                }
                fileInputStream.close();
                return qtVar;
            } finally {
            }
        } catch (Exception e) {
            file.delete();
            Log.e("ShortcutInfoCompatSaver", "Failed to load saved values from file " + file.getAbsolutePath() + ". Old state removed, new added", e);
            return qtVar;
        }
    }

    public static wia c(XmlPullParser xmlPullParser, Context context) {
        wia wiaVar;
        Intent intent;
        if (!xmlPullParser.getName().equals("target")) {
            return null;
        }
        String a = a(xmlPullParser, "id");
        String a2 = a(xmlPullParser, "short_label");
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
            return null;
        }
        int parseInt = Integer.parseInt(a(xmlPullParser, "rank"));
        String a3 = a(xmlPullParser, "long_label");
        String a4 = a(xmlPullParser, "disabled_message");
        String a5 = a(xmlPullParser, "component");
        ComponentName unflattenFromString = TextUtils.isEmpty(a5) ? null : ComponentName.unflattenFromString(a5);
        String a6 = a(xmlPullParser, "icon_resource_name");
        String a7 = a(xmlPullParser, "icon_bitmap_path");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                wiaVar = null;
                break;
            }
            if (next != 2) {
                wiaVar = null;
                if (next == 3 && xmlPullParser.getName().equals("target")) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("intent")) {
                    String a8 = a(xmlPullParser, "action");
                    String a9 = a(xmlPullParser, "targetPackage");
                    String a10 = a(xmlPullParser, "targetClass");
                    if (a8 == null) {
                        intent = null;
                    } else {
                        intent = new Intent(a8);
                        if (!TextUtils.isEmpty(a9) && !TextUtils.isEmpty(a10)) {
                            intent.setClassName(a9, a10);
                        }
                    }
                    if (intent != null) {
                        arrayList.add(intent);
                    }
                } else if (name.equals("categories")) {
                    String a11 = a(xmlPullParser, "name");
                    if (!TextUtils.isEmpty(a11)) {
                        hashSet.add(a11);
                    }
                }
            }
        }
        qia qiaVar = new qia();
        qiaVar.a = context;
        qiaVar.b = a;
        qiaVar.e = a2;
        qiaVar.m = parseInt;
        if (!TextUtils.isEmpty(a3)) {
            qiaVar.f = a3;
        }
        if (!TextUtils.isEmpty(a4)) {
            qiaVar.g = a4;
        }
        if (unflattenFromString != null) {
            qiaVar.d = unflattenFromString;
        }
        if (!arrayList.isEmpty()) {
            qiaVar.c = (Intent[]) arrayList.toArray(new Intent[0]);
        }
        if (!hashSet.isEmpty()) {
            st stVar = new st(0);
            stVar.addAll(hashSet);
            qiaVar.j = stVar;
        }
        if (TextUtils.isEmpty(qiaVar.e)) {
            u36.j("Shortcut must have a non-empty label");
            return wiaVar;
        }
        Intent[] intentArr = qiaVar.c;
        if (intentArr != null && intentArr.length != 0) {
            return new wia(qiaVar, a6, a7);
        }
        u36.j("Shortcut must have an intent");
        return wiaVar;
    }

    public static void d(XmlSerializer xmlSerializer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        xmlSerializer.attribute(null, str, str2);
    }

    public static void e(XmlSerializer xmlSerializer, wia wiaVar) {
        xmlSerializer.startTag(null, "target");
        qia qiaVar = wiaVar.c;
        String str = wiaVar.b;
        String str2 = wiaVar.a;
        d(xmlSerializer, "id", qiaVar.b);
        d(xmlSerializer, "short_label", qiaVar.e.toString());
        d(xmlSerializer, "rank", Integer.toString(qiaVar.m));
        if (!TextUtils.isEmpty(qiaVar.f)) {
            d(xmlSerializer, "long_label", qiaVar.f.toString());
        }
        if (!TextUtils.isEmpty(qiaVar.g)) {
            d(xmlSerializer, "disabled_message", qiaVar.g.toString());
        }
        ComponentName componentName = qiaVar.d;
        if (componentName != null) {
            d(xmlSerializer, "component", componentName.flattenToString());
        }
        if (!TextUtils.isEmpty(str2)) {
            d(xmlSerializer, "icon_resource_name", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            d(xmlSerializer, "icon_bitmap_path", str);
        }
        Intent[] intentArr = qiaVar.c;
        for (Intent intent : (Intent[]) Arrays.copyOf(intentArr, intentArr.length)) {
            xmlSerializer.startTag(null, "intent");
            d(xmlSerializer, "action", intent.getAction());
            if (intent.getComponent() != null) {
                d(xmlSerializer, "targetPackage", intent.getComponent().getPackageName());
                d(xmlSerializer, "targetClass", intent.getComponent().getClassName());
            }
            xmlSerializer.endTag(null, "intent");
        }
        for (String str3 : qiaVar.j) {
            if (!TextUtils.isEmpty(str3)) {
                xmlSerializer.startTag(null, "categories");
                d(xmlSerializer, "name", str3);
                xmlSerializer.endTag(null, "categories");
            }
        }
        xmlSerializer.endTag(null, "target");
    }
}
