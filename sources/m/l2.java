package m;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                } catch (Exception e7) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e7);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    x4.d dVar = new x4.d(context);
                    dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e10) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    x4.p pVar = new x4.p();
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
