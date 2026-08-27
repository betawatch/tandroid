package k2;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import g7.w7;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class a {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03a3, code lost:
    
        r2 = new android.animation.Animator[r10.size()];
        r3 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03ae, code lost:
    
        if (r1 >= r3) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03b0, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03be, code lost:
    
        if (r32 != 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03c0, code lost:
    
        r31.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03c4, code lost:
    
        r31.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x039f, code lost:
    
        if (r31 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03a1, code lost:
    
        if (r10 == null) goto L213;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10) {
        int i11;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i12;
        String str;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        float fraction;
        int i13;
        int i14;
        int i15;
        String str2;
        Keyframe ofFloat;
        Resources.Theme theme2;
        int i16;
        AttributeSet attributeSet3;
        Resources resources2;
        XmlPullParser xmlPullParser2;
        ValueAnimator valueAnimator;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i17 = 3;
            boolean z10 = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i18 = 1;
            if (next == 1) {
                break;
            }
            int i19 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = d(context, resources, theme, attributeSet, null, xmlPullParser);
                } else {
                    Resources resources3 = resources;
                    Resources.Theme theme3 = theme;
                    XmlPullParser xmlPullParser3 = xmlPullParser;
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray f10 = h0.b.f(resources3, theme3, attributeSet, h);
                        if (xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null) {
                            theme2 = theme3;
                            i16 = f10.getInt(0, 0);
                            attributeSet3 = attributeSet;
                            xmlPullParser2 = xmlPullParser3;
                            resources2 = resources3;
                        } else {
                            theme2 = theme3;
                            i16 = 0;
                            attributeSet3 = attributeSet;
                            resources2 = resources3;
                            xmlPullParser2 = xmlPullParser3;
                        }
                        a(context, resources2, theme2, xmlPullParser2, attributeSet3, animatorSet2, i16);
                        valueAnimator2 = animatorSet2;
                        f10.recycle();
                        i11 = depth;
                        if (animatorSet != null && !z10) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i11;
                    } else {
                        String str3 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser3);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlPullParser3.getEventType();
                            if (eventType == i17 || eventType == i18) {
                                break;
                            }
                            if (eventType != i19) {
                                xmlPullParser3.next();
                            } else {
                                if (xmlPullParser3.getName().equals(str3)) {
                                    TypedArray f11 = h0.b.f(resources3, theme3, asAttributeSet, i);
                                    String b10 = h0.b.b(f11, xmlPullParser3, "propertyName", i17);
                                    int i20 = xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? f11.getInt(i19, 4) : 4;
                                    attributeSet2 = asAttributeSet;
                                    int i21 = i20;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlPullParser3.next();
                                        i12 = depth;
                                        if (next2 == 3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlPullParser3.getName().equals("keyframe")) {
                                            int[] iArr = j;
                                            str2 = str3;
                                            if (i21 == 4) {
                                                TypedArray f12 = h0.b.f(resources3, theme3, Xml.asAttributeSet(xmlPullParser3), iArr);
                                                TypedValue peekValue = !h0.b.c(xmlPullParser3, "value") ? null : f12.peekValue(0);
                                                int i22 = (peekValue == null || !c(peekValue.type)) ? 0 : 3;
                                                f12.recycle();
                                                i21 = i22;
                                            }
                                            TypedArray f13 = h0.b.f(resources3, theme3, Xml.asAttributeSet(xmlPullParser3), iArr);
                                            float f14 = h0.b.c(xmlPullParser3, "fraction") ? f13.getFloat(3, -1.0f) : -1.0f;
                                            TypedValue peekValue2 = !h0.b.c(xmlPullParser3, "value") ? null : f13.peekValue(0);
                                            boolean z11 = peekValue2 != null;
                                            int i23 = i21 == 4 ? (z11 && c(peekValue2.type)) ? 3 : 0 : i21;
                                            if (!z11) {
                                                ofFloat = i23 == 0 ? Keyframe.ofFloat(f14) : Keyframe.ofInt(f14);
                                            } else if (i23 == 0) {
                                                ofFloat = Keyframe.ofFloat(f14, xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f13.getFloat(0, 0.0f) : 0.0f);
                                            } else if (i23 == 1 || i23 == 3) {
                                                ofFloat = Keyframe.ofInt(f14, xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f13.getInt(0, 0) : 0);
                                            } else {
                                                ofFloat = null;
                                            }
                                            int resourceId = xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? f13.getResourceId(1, 0) : 0;
                                            if (resourceId > 0) {
                                                ofFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                            }
                                            f13.recycle();
                                            if (ofFloat != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(ofFloat);
                                            }
                                            xmlPullParser3.next();
                                        } else {
                                            str2 = str3;
                                        }
                                        resources3 = resources;
                                        theme3 = theme;
                                        depth = i12;
                                        str3 = str2;
                                    }
                                    str = str3;
                                    if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                        propertyValuesHolder = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                        float fraction2 = keyframe2.getFraction();
                                        int i24 = size;
                                        Class cls = Integer.TYPE;
                                        Class cls2 = Float.TYPE;
                                        if (fraction2 < 1.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList3.add(arrayList3.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                i24++;
                                                fraction = keyframe.getFraction();
                                                if (fraction != 0.0f) {
                                                    if (fraction < 0.0f) {
                                                        keyframe.setFraction(0.0f);
                                                    } else {
                                                        arrayList3.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                        i24++;
                                                    }
                                                }
                                                i13 = i24;
                                                Keyframe[] keyframeArr = new Keyframe[i13];
                                                arrayList3.toArray(keyframeArr);
                                                i14 = 0;
                                                while (i14 < i13) {
                                                    Keyframe keyframe3 = keyframeArr[i14];
                                                    if (keyframe3.getFraction() < 0.0f) {
                                                        if (i14 == 0) {
                                                            keyframe3.setFraction(0.0f);
                                                        } else {
                                                            int i25 = i13 - 1;
                                                            if (i14 == i25) {
                                                                keyframe3.setFraction(1.0f);
                                                            } else {
                                                                int i26 = i14;
                                                                for (int i27 = i14 + 1; i27 < i25 && keyframeArr[i27].getFraction() < 0.0f; i27++) {
                                                                    i26 = i27;
                                                                }
                                                                float fraction3 = (keyframeArr[i26 + 1].getFraction() - keyframeArr[i14 - 1].getFraction()) / ((i26 - i14) + 2);
                                                                int i28 = i14;
                                                                while (i28 <= i26) {
                                                                    keyframeArr[i28].setFraction(keyframeArr[i28 - 1].getFraction() + fraction3);
                                                                    i28++;
                                                                    i13 = i13;
                                                                }
                                                                i15 = i13;
                                                                i14++;
                                                                i13 = i15;
                                                            }
                                                        }
                                                    }
                                                    i15 = i13;
                                                    i14++;
                                                    i13 = i15;
                                                }
                                                propertyValuesHolder = PropertyValuesHolder.ofKeyframe(b10, keyframeArr);
                                                if (i21 == 3) {
                                                    propertyValuesHolder.setEvaluator(f.a);
                                                }
                                            }
                                        }
                                        fraction = keyframe.getFraction();
                                        if (fraction != 0.0f) {
                                        }
                                        i13 = i24;
                                        Keyframe[] keyframeArr2 = new Keyframe[i13];
                                        arrayList3.toArray(keyframeArr2);
                                        i14 = 0;
                                        while (i14 < i13) {
                                        }
                                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(b10, keyframeArr2);
                                        if (i21 == 3) {
                                        }
                                    }
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = b(f11, i20, 0, 1, b10);
                                    }
                                    if (propertyValuesHolder != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolder);
                                    }
                                    f11.recycle();
                                } else {
                                    attributeSet2 = asAttributeSet;
                                    i12 = depth;
                                    str = str3;
                                }
                                xmlPullParser.next();
                                resources3 = resources;
                                theme3 = theme;
                                xmlPullParser3 = xmlPullParser;
                                asAttributeSet = attributeSet2;
                                depth = i12;
                                str3 = str;
                                i17 = 3;
                                i18 = 1;
                                i19 = 2;
                            }
                        }
                        i11 = depth;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i29 = 0; i29 < size2; i29++) {
                                propertyValuesHolderArr[i29] = (PropertyValuesHolder) arrayList2.get(i29);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator2 instanceof ValueAnimator)) {
                            valueAnimator2.setValues(propertyValuesHolderArr);
                        }
                        z10 = true;
                        if (animatorSet != null) {
                            if (arrayList == null) {
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i11;
                    }
                }
                valueAnimator2 = valueAnimator;
                i11 = depth;
                if (animatorSet != null) {
                }
                depth = i11;
            }
        }
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i13 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i14 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && c(i13)) || (z11 && c(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            i0.e[] c10 = w7.c(string);
            i0.e[] c11 = w7.c(string2);
            if (c10 != null || c11 != null) {
                if (c10 != null) {
                    e eVar = new e();
                    if (c11 == null) {
                        return PropertyValuesHolder.ofObject(str, eVar, c10);
                    }
                    if (w7.a(c10, c11)) {
                        return PropertyValuesHolder.ofObject(str, eVar, c10, c11);
                    }
                    throw new InflateException(i0.a.n(" Can't morph from ", string, " to ", string2));
                }
                if (c11 != null) {
                    return PropertyValuesHolder.ofObject(str, new e(), c11);
                }
            }
            return null;
        }
        f fVar = i10 == 3 ? f.a : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            if (z11) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z11) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i10;
        int resourceId;
        ValueAnimator valueAnimator2;
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, g);
        TypedArray f11 = h0.b.f(resources, theme, attributeSet, k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j10 = h0.b.c(xmlPullParser, "duration") ? f10.getInt(1, 300) : 300;
        boolean z10 = false;
        long j11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? f10.getInt(2, 0) : 0;
        int i11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? f10.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i11 == 4) {
                TypedValue peekValue = f10.peekValue(5);
                boolean z11 = peekValue != null;
                int i12 = z11 ? peekValue.type : 0;
                TypedValue peekValue2 = f10.peekValue(6);
                boolean z12 = peekValue2 != null;
                i11 = ((z11 && c(i12)) || (z12 && c(z12 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder b10 = b(f10, i11, 5, 6, "");
            if (b10 != null) {
                valueAnimator3.setValues(b10);
            }
        }
        valueAnimator3.setDuration(j10);
        valueAnimator3.setStartDelay(j11);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? f10.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? f10.getInt(4, 1) : 1);
        if (f11 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String b11 = h0.b.b(f11, xmlPullParser, "pathData", 1);
            if (b11 == null) {
                valueAnimator = valueAnimator3;
                i10 = 0;
                objectAnimator2.setPropertyName(h0.b.b(f11, xmlPullParser, "propertyName", 0));
                resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") == null ? f10.getResourceId(i10, i10) : 0;
                if (resourceId <= 0) {
                    valueAnimator2 = valueAnimator;
                    valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                } else {
                    valueAnimator2 = valueAnimator;
                }
                f10.recycle();
                if (f11 != null) {
                    f11.recycle();
                }
                return valueAnimator2;
            }
            String b12 = h0.b.b(f11, xmlPullParser, "propertyXName", 2);
            String b13 = h0.b.b(f11, xmlPullParser, "propertyYName", 3);
            if (i11 != 2) {
            }
            if (b12 == null && b13 == null) {
                throw new InflateException(f11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            Path d10 = w7.d(b11);
            PathMeasure pathMeasure = new PathMeasure(d10, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Float.valueOf(0.0f));
            float f12 = 0.0f;
            while (true) {
                f12 += pathMeasure.getLength();
                arrayList.add(Float.valueOf(f12));
                if (!pathMeasure.nextContour()) {
                    break;
                }
                z10 = false;
            }
            PathMeasure pathMeasure2 = new PathMeasure(d10, z10);
            int min = Math.min(100, ((int) (f12 / 0.5f)) + 1);
            float[] fArr = new float[min];
            float[] fArr2 = new float[min];
            float[] fArr3 = new float[2];
            float f13 = f12 / (min - 1);
            valueAnimator = valueAnimator3;
            float f14 = 0.0f;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 >= min) {
                    break;
                }
                int i15 = min;
                pathMeasure2.getPosTan(f14 - ((Float) arrayList.get(i14)).floatValue(), fArr3, null);
                fArr[i13] = fArr3[0];
                fArr2[i13] = fArr3[1];
                int i16 = i14 + 1;
                f14 += f13;
                if (i16 < arrayList.size() && f14 > ((Float) arrayList.get(i16)).floatValue()) {
                    pathMeasure2.nextContour();
                    i14 = i16;
                }
                i13++;
                min = i15;
            }
            PropertyValuesHolder ofFloat = b12 != null ? PropertyValuesHolder.ofFloat(b12, fArr) : null;
            PropertyValuesHolder ofFloat2 = b13 != null ? PropertyValuesHolder.ofFloat(b13, fArr2) : null;
            if (ofFloat == null) {
                objectAnimator2.setValues(ofFloat2);
            } else if (ofFloat2 == null) {
                objectAnimator2.setValues(ofFloat);
            } else {
                objectAnimator2.setValues(ofFloat, ofFloat2);
            }
        } else {
            valueAnimator = valueAnimator3;
        }
        i10 = 0;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") == null) {
        }
        if (resourceId <= 0) {
        }
        f10.recycle();
        if (f11 != null) {
        }
        return valueAnimator2;
    }
}
