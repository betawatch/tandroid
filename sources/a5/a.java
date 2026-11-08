package a5;

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
import c8.i0;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
    
        if (r1 >= r3) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03b0, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03be, code lost:
    
        if (r33 != 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03c0, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03c4, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x039f, code lost:
    
        if (r32 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03a1, code lost:
    
        if (r10 == null) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i7) {
        int i10;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i16;
        String str2;
        Keyframe ofFloat;
        Resources.Theme theme2;
        int i17;
        AttributeSet attributeSet3;
        Resources resources2;
        XmlPullParser xmlPullParser2;
        ValueAnimator valueAnimator;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i18 = 3;
            int i19 = 0;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i20 = 1;
            if (next == 1) {
                break;
            }
            int i21 = 2;
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
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray f10 = h0.b.f(resources3, theme3, attributeSet, h);
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null) {
                            theme2 = theme3;
                            i17 = f10.getInt(0, 0);
                            attributeSet3 = attributeSet;
                            xmlPullParser2 = xmlPullParser;
                            resources2 = resources3;
                        } else {
                            theme2 = theme3;
                            i17 = 0;
                            attributeSet3 = attributeSet;
                            resources2 = resources3;
                            xmlPullParser2 = xmlPullParser;
                        }
                        a(context, resources2, theme2, xmlPullParser2, attributeSet3, animatorSet2, i17);
                        valueAnimator2 = animatorSet2;
                        f10.recycle();
                        i10 = depth;
                        if (animatorSet != null && i19 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i10;
                    } else {
                        String str3 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlPullParser.getEventType();
                            if (eventType == i18 || eventType == i20) {
                                break;
                            }
                            if (eventType != i21) {
                                xmlPullParser.next();
                            } else {
                                if (xmlPullParser.getName().equals(str3)) {
                                    TypedArray f11 = h0.b.f(resources3, theme3, asAttributeSet, i);
                                    String b10 = h0.b.b(f11, xmlPullParser, "propertyName", i18);
                                    int i22 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? f11.getInt(i21, 4) : 4;
                                    attributeSet2 = asAttributeSet;
                                    int i23 = i22;
                                    i12 = i21;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlPullParser.next();
                                        i13 = depth;
                                        if (next2 == 3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlPullParser.getName().equals("keyframe")) {
                                            int[] iArr = j;
                                            str2 = str3;
                                            if (i23 == 4) {
                                                TypedArray f12 = h0.b.f(resources3, theme3, Xml.asAttributeSet(xmlPullParser), iArr);
                                                TypedValue peekValue = !h0.b.c(xmlPullParser, "value") ? null : f12.peekValue(0);
                                                int i24 = (peekValue == null || !c(peekValue.type)) ? 0 : 3;
                                                f12.recycle();
                                                i23 = i24;
                                            }
                                            TypedArray f13 = h0.b.f(resources3, theme3, Xml.asAttributeSet(xmlPullParser), iArr);
                                            float f14 = h0.b.c(xmlPullParser, "fraction") ? f13.getFloat(3, -1.0f) : -1.0f;
                                            TypedValue peekValue2 = !h0.b.c(xmlPullParser, "value") ? null : f13.peekValue(0);
                                            boolean z9 = peekValue2 != null;
                                            int i25 = i23 == 4 ? (z9 && c(peekValue2.type)) ? 3 : 0 : i23;
                                            if (!z9) {
                                                ofFloat = i25 == 0 ? Keyframe.ofFloat(f14) : Keyframe.ofInt(f14);
                                            } else if (i25 == 0) {
                                                ofFloat = Keyframe.ofFloat(f14, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f13.getFloat(0, 0.0f) : 0.0f);
                                            } else if (i25 == 1 || i25 == 3) {
                                                ofFloat = Keyframe.ofInt(f14, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f13.getInt(0, 0) : 0);
                                            } else {
                                                ofFloat = null;
                                            }
                                            int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? f13.getResourceId(1, 0) : 0;
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
                                            xmlPullParser.next();
                                        } else {
                                            str2 = str3;
                                        }
                                        resources3 = resources;
                                        theme3 = theme;
                                        depth = i13;
                                        str3 = str2;
                                    }
                                    str = str3;
                                    if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                        i15 = 3;
                                        propertyValuesHolder = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        int i26 = size;
                                        Class cls = Integer.TYPE;
                                        Class cls2 = Float.TYPE;
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList3.add(arrayList3.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                i26++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                arrayList3.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                i26++;
                                            }
                                        }
                                        int i27 = i26;
                                        Keyframe[] keyframeArr = new Keyframe[i27];
                                        arrayList3.toArray(keyframeArr);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            Keyframe keyframe3 = keyframeArr[i28];
                                            if (keyframe3.getFraction() < 0.0f) {
                                                if (i28 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    int i29 = i27 - 1;
                                                    if (i28 == i29) {
                                                        keyframe3.setFraction(1.0f);
                                                        i16 = i27;
                                                    } else {
                                                        int i30 = i28;
                                                        for (int i31 = i28 + 1; i31 < i29 && keyframeArr[i31].getFraction() < 0.0f; i31++) {
                                                            i30 = i31;
                                                        }
                                                        float fraction3 = (keyframeArr[i30 + 1].getFraction() - keyframeArr[i28 - 1].getFraction()) / ((i30 - i28) + 2);
                                                        int i32 = i28;
                                                        while (i32 <= i30) {
                                                            float f15 = fraction3;
                                                            keyframeArr[i32].setFraction(keyframeArr[i32 - 1].getFraction() + f15);
                                                            i32++;
                                                            i27 = i27;
                                                            fraction3 = f15;
                                                        }
                                                        i16 = i27;
                                                    }
                                                    i28++;
                                                    i27 = i16;
                                                }
                                            }
                                            i16 = i27;
                                            i28++;
                                            i27 = i16;
                                        }
                                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(b10, keyframeArr);
                                        i15 = 3;
                                        if (i23 == 3) {
                                            propertyValuesHolder.setEvaluator(g.a);
                                        }
                                    }
                                    i14 = 0;
                                    i11 = 1;
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = b(f11, i22, 0, 1, b10);
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
                                    i11 = i20;
                                    i12 = i21;
                                    i13 = depth;
                                    i14 = i19;
                                    str = str3;
                                    i15 = i18;
                                }
                                xmlPullParser.next();
                                resources3 = resources;
                                i19 = i14;
                                i20 = i11;
                                i18 = i15;
                                i21 = i12;
                                asAttributeSet = attributeSet2;
                                depth = i13;
                                str3 = str;
                                theme3 = theme;
                            }
                        }
                        int i33 = i20;
                        i10 = depth;
                        int i34 = i19;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i35 = i34; i35 < size2; i35++) {
                                propertyValuesHolderArr[i35] = (PropertyValuesHolder) arrayList2.get(i35);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator2 instanceof ValueAnimator)) {
                            valueAnimator2.setValues(propertyValuesHolderArr);
                        }
                        i19 = i33;
                        if (animatorSet != null) {
                            if (arrayList == null) {
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i10;
                    }
                }
                valueAnimator2 = valueAnimator;
                i10 = depth;
                if (animatorSet != null) {
                }
                depth = i10;
            }
        }
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i7, int i10, int i11, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z9 = peekValue != null;
        int i12 = z9 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i11);
        boolean z10 = peekValue2 != null;
        int i13 = z10 ? peekValue2.type : 0;
        if (i7 == 4) {
            i7 = ((z9 && c(i12)) || (z10 && c(i13))) ? 3 : 0;
        }
        boolean z11 = i7 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i7 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            i0.d[] c10 = i0.c(string);
            i0.d[] c11 = i0.c(string2);
            if (c10 != null || c11 != null) {
                if (c10 != null) {
                    f fVar = new f();
                    if (c11 == null) {
                        return PropertyValuesHolder.ofObject(str, fVar, c10);
                    }
                    if (i0.a(c10, c11)) {
                        return PropertyValuesHolder.ofObject(str, fVar, c10, c11);
                    }
                    throw new InflateException(com.google.android.recaptcha.internal.a.l(" Can't morph from ", string, " to ", string2));
                }
                if (c11 != null) {
                    return PropertyValuesHolder.ofObject(str, new f(), c11);
                }
            }
            return null;
        }
        g gVar = i7 == 3 ? g.a : null;
        if (z11) {
            if (z9) {
                float dimension = i12 == 5 ? typedArray.getDimension(i10, 0.0f) : typedArray.getFloat(i10, 0.0f);
                if (z10) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z9) {
            int dimension2 = i12 == 5 ? (int) typedArray.getDimension(i10, 0.0f) : c(i12) ? typedArray.getColor(i10, 0) : typedArray.getInt(i10, 0);
            if (z10) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z10) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0));
        }
        if (propertyValuesHolder != null && gVar != null) {
            propertyValuesHolder.setEvaluator(gVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i7) {
        return i7 >= 28 && i7 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i7;
        ValueAnimator valueAnimator2;
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, g);
        TypedArray f11 = h0.b.f(resources, theme, attributeSet, k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        boolean c10 = h0.b.c(xmlPullParser, "duration");
        int i10 = qs.X4;
        if (c10) {
            i10 = f10.getInt(1, qs.X4);
        }
        long j3 = i10;
        long j10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? f10.getInt(2, 0) : 0;
        int i11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? f10.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i11 == 4) {
                TypedValue peekValue = f10.peekValue(5);
                boolean z9 = peekValue != null;
                int i12 = z9 ? peekValue.type : 0;
                TypedValue peekValue2 = f10.peekValue(6);
                boolean z10 = peekValue2 != null;
                i11 = ((z9 && c(i12)) || (z10 && c(z10 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder b10 = b(f10, i11, 5, 6, "");
            if (b10 != null) {
                valueAnimator3.setValues(b10);
            }
        }
        valueAnimator3.setDuration(j3);
        valueAnimator3.setStartDelay(j10);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? f10.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? f10.getInt(4, 1) : 1);
        if (f11 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String b11 = h0.b.b(f11, xmlPullParser, "pathData", 1);
            if (b11 != null) {
                String b12 = h0.b.b(f11, xmlPullParser, "propertyXName", 2);
                String b13 = h0.b.b(f11, xmlPullParser, "propertyYName", 3);
                if (i11 != 2) {
                }
                if (b12 == null && b13 == null) {
                    throw new InflateException(f11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d2 = i0.d(b11);
                PathMeasure pathMeasure = new PathMeasure(d2, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f12 = 0.0f;
                do {
                    f12 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f12));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d2, false);
                int min = Math.min(100, ((int) (f12 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f13 = f12 / (min - 1);
                int i13 = 0;
                valueAnimator = valueAnimator3;
                float f14 = 0.0f;
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
                i7 = 0;
            } else {
                valueAnimator = valueAnimator3;
                i7 = 0;
                objectAnimator2.setPropertyName(h0.b.b(f11, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i7 = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? f10.getResourceId(i7, i7) : i7;
        if (resourceId > 0) {
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
}
