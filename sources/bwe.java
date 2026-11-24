// default package

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class bwe {
    public static kp a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        kp kpVar;
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        byte b = 3;
        Object obj = null;
        int i2 = 0;
        if (attributeValue != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new kp(obj, obj, typedValue.data, b);
            }
            try {
                kpVar = kp.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                kpVar = null;
            }
            if (kpVar != null) {
                return kpVar;
            }
        }
        return new kp(obj, obj, i2, b);
    }

    public static String b(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
