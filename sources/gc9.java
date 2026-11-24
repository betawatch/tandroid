// default package

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gc9 {
    public final /* synthetic */ byte a;

    public /* synthetic */ gc9(byte b) {
        this.a = b;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) gc9.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        lq2.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                        break;
                    } catch (Exception e) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                    break;
                } catch (Exception e2) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    mo moVar = new mo(context);
                    moVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e3) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    sbc sbcVar = new sbc();
                    sbcVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
        return null;
    }
}
