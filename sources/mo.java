// default package

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mo extends jq2 implements Animatable {
    public final Context d;
    public final jo e = new jo(this, (byte) 0);
    public final ko c = new ko();

    public mo(Context context) {
        this.d = context;
    }

    @Override // jq2, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        ko koVar = this.c;
        koVar.a.draw(canvas);
        if (koVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getAlpha() : this.c.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.c.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getColorFilter() : this.c.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.b) == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new lo(((Drawable) this.b).getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.c.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.c.a.getIntrinsicWidth();
    }

    @Override // jq2, android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getOpacity() : this.c.a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x012b, code lost:
    
        r0 = r8.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x012d, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x012f, code lost:
    
        r0 = new android.animation.AnimatorSet();
        r8.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0136, code lost:
    
        r0.playTogether(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x013b, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator a;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            ko koVar = this.c;
            if (eventType == i || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray d = dye.d(resources, theme, attributeSet, pe0.f);
                    int resourceId = d.getResourceId(0, 0);
                    if (resourceId != 0) {
                        sbc c = sbc.c(resources, resourceId, theme);
                        c.h = false;
                        c.setCallback(this.e);
                        sbc sbcVar = koVar.a;
                        if (sbcVar != null) {
                            sbcVar.setCallback(null);
                        }
                        koVar.a = c;
                    }
                    d.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, pe0.g);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i, 0);
                    if (resourceId2 != 0) {
                        Context context = this.d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            dq9.m("Context can't be null when inflating animators");
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            a = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    a = znd.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e) {
                                    e = e;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e2) {
                                    e = e2;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                e = e3;
                            } catch (XmlPullParserException e4) {
                                e = e4;
                            }
                        }
                        a.setTarget(koVar.a.c.b.o.get(string));
                        if (koVar.c == null) {
                            koVar.c = new ArrayList();
                            koVar.d = new qt(0);
                        }
                        koVar.c.add(a);
                        koVar.d.put(a, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
            i = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.isAutoMirrored() : this.c.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.c.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.isStateful() : this.c.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.c.a.setBounds(rect);
        }
    }

    @Override // jq2, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.setLevel(i) : this.c.a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.setState(iArr) : this.c.a.setState(iArr);
    }

    @Override // jq2, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.c.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.a.setAutoMirrored(z);
        }
    }

    @Override // jq2, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.c.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.c.a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.c.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.c.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.c.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        ko koVar = this.c;
        if (koVar.b.isStarted()) {
            return;
        }
        koVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.c.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
