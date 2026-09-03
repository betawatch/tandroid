package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import j7.r7;
import java.io.IOException;
import l.n;
import m.m1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i10;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        g gVar = new g(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z10 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = gVar.a;
            if (eventType != i10) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z10 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        gVar.b = 0;
                        gVar.c = 0;
                        gVar.d = 0;
                        gVar.e = 0;
                        gVar.f = true;
                        gVar.g = true;
                    } else if (name2.equals("item")) {
                        if (!gVar.h) {
                            n nVar = gVar.z;
                            if (nVar == null || !nVar.a.hasSubMenu()) {
                                gVar.h = true;
                                gVar.b(menu2.add(gVar.b, gVar.i, gVar.j, gVar.k));
                            } else {
                                gVar.h = true;
                                gVar.b(menu2.addSubMenu(gVar.b, gVar.i, gVar.j, gVar.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z4 = true;
                    }
                    eventType = xmlPullParser2.next();
                    i10 = 2;
                }
                xmlPullParser2 = xmlPullParser;
                eventType = xmlPullParser2.next();
                i10 = 2;
            } else {
                if (!z10) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.p);
                        gVar.b = obtainStyledAttributes.getResourceId(1, 0);
                        gVar.c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f = obtainStyledAttributes.getBoolean(2, true);
                        gVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.q);
                            gVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.j = (obtainStyledAttributes2.getInt(5, gVar.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.k = obtainStyledAttributes2.getText(7);
                            gVar.l = obtainStyledAttributes2.getText(8);
                            gVar.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            gVar.n = string == null ? (char) 0 : string.charAt(0);
                            gVar.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            gVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                            gVar.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.r = gVar.e;
                            }
                            gVar.s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.t = obtainStyledAttributes2.getBoolean(4, gVar.f);
                            gVar.u = obtainStyledAttributes2.getBoolean(1, gVar.g);
                            gVar.v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.y = obtainStyledAttributes2.getString(12);
                            gVar.w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z11 = string3 != null;
                            if (z11 && gVar.w == 0 && gVar.x == null) {
                                gVar.z = (n) gVar.a(string3, f, this.b);
                            } else {
                                if (z11) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.z = null;
                            }
                            gVar.A = obtainStyledAttributes2.getText(17);
                            gVar.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.D = m1.b(obtainStyledAttributes2.getInt(19, -1), gVar.D);
                            } else {
                                gVar.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = r7.a(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.C = colorStateList;
                            } else {
                                gVar.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            gVar.h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(gVar.b, gVar.i, gVar.j, gVar.k);
                            gVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i10 = 2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                eventType = xmlPullParser2.next();
                i10 = 2;
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof l.k)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i10);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e6) {
                    throw new InflateException("Error inflating menu XML", e6);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
