package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes.dex */
public final class SpringAnimation extends DynamicAnimation {
    private boolean mEndRequested;
    private float mPendingPosition;
    private SpringForce mSpring;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
    }

    public SpringAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        super(obj, floatPropertyCompat);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
    }

    public SpringAnimation(Object obj, FloatPropertyCompat floatPropertyCompat, float f) {
        super(obj, floatPropertyCompat);
        this.mSpring = null;
        this.mPendingPosition = Float.MAX_VALUE;
        this.mEndRequested = false;
        this.mSpring = new SpringForce(f);
    }

    private void sanityCheck() {
        SpringForce springForce = this.mSpring;
        if (springForce == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double finalPosition = springForce.getFinalPosition();
        if (finalPosition > this.mMaxValue) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (finalPosition < this.mMinValue) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public SpringForce getSpring() {
        return this.mSpring;
    }

    boolean isAtEquilibrium(float f, float f2) {
        return this.mSpring.isAtEquilibrium(f, f2);
    }

    public SpringAnimation setSpring(SpringForce springForce) {
        this.mSpring = springForce;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    void setValueThreshold(float f) {
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void start() {
        sanityCheck();
        this.mSpring.setValueThreshold(getValueThreshold());
        super.start();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean updateValueAndVelocity(long j) {
        SpringForce springForce;
        double d;
        double d2;
        long j2;
        if (this.mEndRequested) {
            float f = this.mPendingPosition;
            if (f != Float.MAX_VALUE) {
                this.mSpring.setFinalPosition(f);
                this.mPendingPosition = Float.MAX_VALUE;
            }
            this.mValue = this.mSpring.getFinalPosition();
            this.mVelocity = 0.0f;
            this.mEndRequested = false;
            return true;
        }
        if (this.mPendingPosition != Float.MAX_VALUE) {
            this.mSpring.getFinalPosition();
            j2 = j / 2;
            DynamicAnimation.MassState updateValues = this.mSpring.updateValues(this.mValue, this.mVelocity, j2);
            this.mSpring.setFinalPosition(this.mPendingPosition);
            this.mPendingPosition = Float.MAX_VALUE;
            springForce = this.mSpring;
            d = updateValues.mValue;
            d2 = updateValues.mVelocity;
        } else {
            springForce = this.mSpring;
            d = this.mValue;
            d2 = this.mVelocity;
            j2 = j;
        }
        DynamicAnimation.MassState updateValues2 = springForce.updateValues(d, d2, j2);
        this.mValue = updateValues2.mValue;
        this.mVelocity = updateValues2.mVelocity;
        float max = Math.max(this.mValue, this.mMinValue);
        this.mValue = max;
        float min = Math.min(max, this.mMaxValue);
        this.mValue = min;
        if (!isAtEquilibrium(min, this.mVelocity)) {
            return false;
        }
        this.mValue = this.mSpring.getFinalPosition();
        this.mVelocity = 0.0f;
        return true;
    }
}
