package androidx.dynamicanimation.animation;

/* loaded from: classes.dex */
public abstract class FloatPropertyCompat {
    final String mPropertyName;

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f);

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }
}
