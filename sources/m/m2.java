package m;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m2 {
    public final /* synthetic */ int a;

    public /* synthetic */ m2(int i10) {
        this.a = i10;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) m2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
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
                } catch (Exception e6) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e6);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    k2.d dVar = new k2.d(context);
                    dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e10) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    k2.p pVar = new k2.p();
                    pVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e11) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e11);
                    return null;
                }
        }
        return null;
    }
}
