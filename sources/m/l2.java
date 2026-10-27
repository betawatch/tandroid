package m;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l2 {
    public final /* synthetic */ int a;

    public /* synthetic */ l2(int i10) {
        this.a = i10;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) l2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        j.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
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
                } catch (Exception e10) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    y4.d dVar = new y4.d(context);
                    dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e11) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e11);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    y4.o oVar = new y4.o();
                    oVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e12) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e12);
                    return null;
                }
        }
        return null;
    }
}
