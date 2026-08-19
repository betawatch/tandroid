package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class AppCompatTextHelper {
    private boolean mAsyncFontPending;
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    AppCompatTextHelper(TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void loadFromAttributes(AttributeSet attributeSet, int i) {
        String str;
        ColorStateList colorStateList;
        String str2;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        Typeface typeface;
        TintTypedArray obtainStyledAttributes;
        int i3;
        int i4;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int[] autoSizeTextAvailableSizes;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        int[] iArr = R$styleable.AppCompatTextHelper;
        TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, 0);
        TextView textView = this.mView;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes2.getWrappedTypeArray(), i, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(R$styleable.AppCompatTextHelper_android_textAppearance, -1);
        int i5 = R$styleable.AppCompatTextHelper_android_drawableLeft;
        if (obtainStyledAttributes2.hasValue(i5)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(i5, 0));
        }
        int i6 = R$styleable.AppCompatTextHelper_android_drawableTop;
        if (obtainStyledAttributes2.hasValue(i6)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(i6, 0));
        }
        int i7 = R$styleable.AppCompatTextHelper_android_drawableRight;
        if (obtainStyledAttributes2.hasValue(i7)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(i7, 0));
        }
        int i8 = R$styleable.AppCompatTextHelper_android_drawableBottom;
        if (obtainStyledAttributes2.hasValue(i8)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(i8, 0));
        }
        int i9 = Build.VERSION.SDK_INT;
        int i10 = R$styleable.AppCompatTextHelper_android_drawableStart;
        if (obtainStyledAttributes2.hasValue(i10)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(i10, 0));
        }
        int i11 = R$styleable.AppCompatTextHelper_android_drawableEnd;
        if (obtainStyledAttributes2.hasValue(i11)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(i11, 0));
        }
        obtainStyledAttributes2.recycle();
        boolean z5 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            TintTypedArray obtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, resourceId, R$styleable.TextAppearance);
            if (!z5) {
                int i12 = R$styleable.TextAppearance_textAllCaps;
                if (obtainStyledAttributes3.hasValue(i12)) {
                    z = obtainStyledAttributes3.getBoolean(i12, false);
                    z2 = true;
                    updateTypefaceAndStyle(context, obtainStyledAttributes3);
                    if (i9 >= 23) {
                        int i13 = R$styleable.TextAppearance_android_textColor;
                        colorStateList2 = obtainStyledAttributes3.hasValue(i13) ? obtainStyledAttributes3.getColorStateList(i13) : null;
                        int i14 = R$styleable.TextAppearance_android_textColorHint;
                        colorStateList3 = obtainStyledAttributes3.hasValue(i14) ? obtainStyledAttributes3.getColorStateList(i14) : null;
                        int i15 = R$styleable.TextAppearance_android_textColorLink;
                        colorStateList = obtainStyledAttributes3.hasValue(i15) ? obtainStyledAttributes3.getColorStateList(i15) : null;
                    } else {
                        colorStateList = null;
                        colorStateList2 = null;
                        colorStateList3 = null;
                    }
                    int i16 = R$styleable.TextAppearance_textLocale;
                    str2 = !obtainStyledAttributes3.hasValue(i16) ? obtainStyledAttributes3.getString(i16) : null;
                    if (i9 >= 26) {
                        int i17 = R$styleable.TextAppearance_fontVariationSettings;
                        if (obtainStyledAttributes3.hasValue(i17)) {
                            str = obtainStyledAttributes3.getString(i17);
                            obtainStyledAttributes3.recycle();
                        }
                    }
                    str = null;
                    obtainStyledAttributes3.recycle();
                }
            }
            z = false;
            z2 = false;
            updateTypefaceAndStyle(context, obtainStyledAttributes3);
            if (i9 >= 23) {
            }
            int i162 = R$styleable.TextAppearance_textLocale;
            if (!obtainStyledAttributes3.hasValue(i162)) {
            }
            if (i9 >= 26) {
            }
            str = null;
            obtainStyledAttributes3.recycle();
        } else {
            str = null;
            colorStateList = null;
            str2 = null;
            colorStateList2 = null;
            colorStateList3 = null;
            z = false;
            z2 = false;
        }
        TintTypedArray obtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.TextAppearance, i, 0);
        if (!z5) {
            int i18 = R$styleable.TextAppearance_textAllCaps;
            if (obtainStyledAttributes4.hasValue(i18)) {
                z3 = z5;
                z = obtainStyledAttributes4.getBoolean(i18, false);
                z2 = true;
                if (i9 < 23) {
                    int i19 = R$styleable.TextAppearance_android_textColor;
                    if (obtainStyledAttributes4.hasValue(i19)) {
                        colorStateList2 = obtainStyledAttributes4.getColorStateList(i19);
                    }
                    int i20 = R$styleable.TextAppearance_android_textColorHint;
                    if (obtainStyledAttributes4.hasValue(i20)) {
                        colorStateList3 = obtainStyledAttributes4.getColorStateList(i20);
                    }
                    int i21 = R$styleable.TextAppearance_android_textColorLink;
                    if (obtainStyledAttributes4.hasValue(i21)) {
                        colorStateList = obtainStyledAttributes4.getColorStateList(i21);
                    }
                }
                i2 = R$styleable.TextAppearance_textLocale;
                if (obtainStyledAttributes4.hasValue(i2)) {
                    str2 = obtainStyledAttributes4.getString(i2);
                }
                if (i9 >= 26) {
                    int i22 = R$styleable.TextAppearance_fontVariationSettings;
                    if (obtainStyledAttributes4.hasValue(i22)) {
                        str = obtainStyledAttributes4.getString(i22);
                    }
                }
                if (i9 >= 28) {
                    int i23 = R$styleable.TextAppearance_android_textSize;
                    if (obtainStyledAttributes4.hasValue(i23) && obtainStyledAttributes4.getDimensionPixelSize(i23, -1) == 0) {
                        z4 = z2;
                        this.mView.setTextSize(0, 0.0f);
                        updateTypefaceAndStyle(context, obtainStyledAttributes4);
                        obtainStyledAttributes4.recycle();
                        if (colorStateList2 != null) {
                            this.mView.setTextColor(colorStateList2);
                        }
                        if (colorStateList3 != null) {
                            this.mView.setHintTextColor(colorStateList3);
                        }
                        if (colorStateList != null) {
                            this.mView.setLinkTextColor(colorStateList);
                        }
                        if (!z3 && z4) {
                            setAllCaps(z);
                        }
                        typeface = this.mFontTypeface;
                        if (typeface != null) {
                            if (this.mFontWeight == -1) {
                                this.mView.setTypeface(typeface, this.mStyle);
                            } else {
                                this.mView.setTypeface(typeface);
                            }
                        }
                        if (str != null) {
                            Api26Impl.setFontVariationSettings(this.mView, str);
                        }
                        if (str2 != null) {
                            if (i9 >= 24) {
                                Api24Impl.setTextLocales(this.mView, Api24Impl.forLanguageTags(str2));
                            } else {
                                Api17Impl.setTextLocale(this.mView, Api21Impl.forLanguageTag(str2.split(",")[0]));
                            }
                        }
                        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
                        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
                            autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
                            if (autoSizeTextAvailableSizes.length > 0) {
                                if (Api26Impl.getAutoSizeStepGranularity(this.mView) != -1.0f) {
                                    Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(this.mView, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                                } else {
                                    Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(this.mView, autoSizeTextAvailableSizes, 0);
                                }
                            }
                        }
                        obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.AppCompatTextView);
                        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableLeftCompat, -1);
                        Drawable drawable = resourceId2 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId2) : null;
                        int resourceId3 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableTopCompat, -1);
                        Drawable drawable2 = resourceId3 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId3) : null;
                        int resourceId4 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableRightCompat, -1);
                        Drawable drawable3 = resourceId4 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId4) : null;
                        int resourceId5 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableBottomCompat, -1);
                        Drawable drawable4 = resourceId5 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId5) : null;
                        int resourceId6 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableStartCompat, -1);
                        Drawable drawable5 = resourceId6 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId6) : null;
                        int resourceId7 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableEndCompat, -1);
                        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId7) : null);
                        i3 = R$styleable.AppCompatTextView_drawableTint;
                        if (obtainStyledAttributes.hasValue(i3)) {
                            TextViewCompat.setCompoundDrawableTintList(this.mView, obtainStyledAttributes.getColorStateList(i3));
                        }
                        i4 = R$styleable.AppCompatTextView_drawableTintMode;
                        if (obtainStyledAttributes.hasValue(i4)) {
                            TextViewCompat.setCompoundDrawableTintMode(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i4, -1), null));
                        }
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
                        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
                        dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_lineHeight, -1);
                        obtainStyledAttributes.recycle();
                        if (dimensionPixelSize != -1) {
                            TextViewCompat.setFirstBaselineToTopHeight(this.mView, dimensionPixelSize);
                        }
                        if (dimensionPixelSize2 != -1) {
                            TextViewCompat.setLastBaselineToBottomHeight(this.mView, dimensionPixelSize2);
                        }
                        if (dimensionPixelSize3 != -1) {
                            TextViewCompat.setLineHeight(this.mView, dimensionPixelSize3);
                            return;
                        }
                        return;
                    }
                }
                z4 = z2;
                updateTypefaceAndStyle(context, obtainStyledAttributes4);
                obtainStyledAttributes4.recycle();
                if (colorStateList2 != null) {
                }
                if (colorStateList3 != null) {
                }
                if (colorStateList != null) {
                }
                if (!z3) {
                    setAllCaps(z);
                }
                typeface = this.mFontTypeface;
                if (typeface != null) {
                }
                if (str != null) {
                }
                if (str2 != null) {
                }
                this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
                if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
                    autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
                    if (autoSizeTextAvailableSizes.length > 0) {
                    }
                }
                obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.AppCompatTextView);
                int resourceId22 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableLeftCompat, -1);
                if (resourceId22 != -1) {
                }
                int resourceId32 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableTopCompat, -1);
                if (resourceId32 != -1) {
                }
                int resourceId42 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableRightCompat, -1);
                if (resourceId42 != -1) {
                }
                int resourceId52 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableBottomCompat, -1);
                if (resourceId52 != -1) {
                }
                int resourceId62 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableStartCompat, -1);
                if (resourceId62 != -1) {
                }
                int resourceId72 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableEndCompat, -1);
                setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId72 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId72) : null);
                i3 = R$styleable.AppCompatTextView_drawableTint;
                if (obtainStyledAttributes.hasValue(i3)) {
                }
                i4 = R$styleable.AppCompatTextView_drawableTintMode;
                if (obtainStyledAttributes.hasValue(i4)) {
                }
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
                dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
                dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_lineHeight, -1);
                obtainStyledAttributes.recycle();
                if (dimensionPixelSize != -1) {
                }
                if (dimensionPixelSize2 != -1) {
                }
                if (dimensionPixelSize3 != -1) {
                }
            }
        }
        z3 = z5;
        if (i9 < 23) {
        }
        i2 = R$styleable.TextAppearance_textLocale;
        if (obtainStyledAttributes4.hasValue(i2)) {
        }
        if (i9 >= 26) {
        }
        if (i9 >= 28) {
        }
        z4 = z2;
        updateTypefaceAndStyle(context, obtainStyledAttributes4);
        obtainStyledAttributes4.recycle();
        if (colorStateList2 != null) {
        }
        if (colorStateList3 != null) {
        }
        if (colorStateList != null) {
        }
        if (!z3) {
        }
        typeface = this.mFontTypeface;
        if (typeface != null) {
        }
        if (str != null) {
        }
        if (str2 != null) {
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
        }
        obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.AppCompatTextView);
        int resourceId222 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableLeftCompat, -1);
        if (resourceId222 != -1) {
        }
        int resourceId322 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableTopCompat, -1);
        if (resourceId322 != -1) {
        }
        int resourceId422 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableRightCompat, -1);
        if (resourceId422 != -1) {
        }
        int resourceId522 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableBottomCompat, -1);
        if (resourceId522 != -1) {
        }
        int resourceId622 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableStartCompat, -1);
        if (resourceId622 != -1) {
        }
        int resourceId722 = obtainStyledAttributes.getResourceId(R$styleable.AppCompatTextView_drawableEndCompat, -1);
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId722 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId722) : null);
        i3 = R$styleable.AppCompatTextView_drawableTint;
        if (obtainStyledAttributes.hasValue(i3)) {
        }
        i4 = R$styleable.AppCompatTextView_drawableTintMode;
        if (obtainStyledAttributes.hasValue(i4)) {
        }
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AppCompatTextView_lineHeight, -1);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (dimensionPixelSize3 != -1) {
        }
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.mStyle = tintTypedArray.getInt(R$styleable.TextAppearance_android_textStyle, this.mStyle);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = tintTypedArray.getInt(R$styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i2;
            if (i2 != -1) {
                this.mStyle &= 2;
            }
        }
        int i3 = R$styleable.TextAppearance_android_fontFamily;
        if (tintTypedArray.hasValue(i3) || tintTypedArray.hasValue(R$styleable.TextAppearance_fontFamily)) {
            this.mFontTypeface = null;
            int i4 = R$styleable.TextAppearance_fontFamily;
            if (tintTypedArray.hasValue(i4)) {
                i3 = i4;
            }
            final int i5 = this.mFontWeight;
            final int i6 = this.mStyle;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.mView);
                try {
                    Typeface font = tintTypedArray.getFont(i3, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                        public void onFontRetrievalFailed(int i7) {
                        }

                        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                        public void onFontRetrieved(Typeface typeface) {
                            int i7;
                            if (Build.VERSION.SDK_INT >= 28 && (i7 = i5) != -1) {
                                typeface = Api28Impl.create(typeface, i7, (i6 & 2) != 0);
                            }
                            AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                        }
                    });
                    if (font != null) {
                        if (i >= 28 && this.mFontWeight != -1) {
                            this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                        } else {
                            this.mFontTypeface = font;
                        }
                    }
                    this.mAsyncFontPending = this.mFontTypeface == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.mFontTypeface != null || (string = tintTypedArray.getString(i3)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                this.mFontTypeface = Api28Impl.create(Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                return;
            } else {
                this.mFontTypeface = Typeface.create(string, this.mStyle);
                return;
            }
        }
        int i7 = R$styleable.TextAppearance_android_typeface;
        if (tintTypedArray.hasValue(i7)) {
            this.mAsyncFontPending = false;
            int i8 = tintTypedArray.getInt(i7, 1);
            if (i8 == 1) {
                this.mFontTypeface = Typeface.SANS_SERIF;
            } else if (i8 == 2) {
                this.mFontTypeface = Typeface.SERIF;
            } else {
                if (i8 != 3) {
                    return;
                }
                this.mFontTypeface = Typeface.MONOSPACE;
            }
        }
    }

    void onAsyncTypefaceReceived(WeakReference weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (ViewCompat.isAttachedToWindow(textView)) {
                    final int i = this.mStyle;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                } else {
                    textView.setTypeface(typeface, this.mStyle);
                }
            }
        }
    }

    void onSetTextAppearance(Context context, int i) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, R$styleable.TextAppearance);
        int i2 = R$styleable.TextAppearance_textAllCaps;
        if (obtainStyledAttributes.hasValue(i2)) {
            setAllCaps(obtainStyledAttributes.getBoolean(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = R$styleable.TextAppearance_android_textColor;
            if (obtainStyledAttributes.hasValue(i4) && (colorStateList3 = obtainStyledAttributes.getColorStateList(i4)) != null) {
                this.mView.setTextColor(colorStateList3);
            }
            int i5 = R$styleable.TextAppearance_android_textColorLink;
            if (obtainStyledAttributes.hasValue(i5) && (colorStateList2 = obtainStyledAttributes.getColorStateList(i5)) != null) {
                this.mView.setLinkTextColor(colorStateList2);
            }
            int i6 = R$styleable.TextAppearance_android_textColorHint;
            if (obtainStyledAttributes.hasValue(i6) && (colorStateList = obtainStyledAttributes.getColorStateList(i6)) != null) {
                this.mView.setHintTextColor(colorStateList);
            }
        }
        int i7 = R$styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i7) && obtainStyledAttributes.getDimensionPixelSize(i7, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes);
        if (i3 >= 26) {
            int i8 = R$styleable.TextAppearance_fontVariationSettings;
            if (obtainStyledAttributes.hasValue(i8) && (string = obtainStyledAttributes.getString(i8)) != null) {
                Api26Impl.setFontVariationSettings(this.mView, string);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = Api17Impl.getCompoundDrawablesRelative(this.mView);
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    void setTextSize(int i, float f) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i, f);
    }

    void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    private void setTextSizeInternal(int i, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i, f);
    }

    void setAutoSizeTextTypeWithDefaults(int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    void setCompoundDrawableTintList(ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    void setCompoundDrawableTintMode(PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = Api17Impl.getCompoundDrawablesRelative(this.mView);
            TextView textView = this.mView;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = Api17Impl.getCompoundDrawablesRelative(this.mView);
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.mView;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
        TextView textView3 = this.mView;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    void populateSurroundingTextIfNeeded(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    static class Api26Impl {
        static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }

        static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    static class Api24Impl {
        static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }

        static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class Api17Impl {
        static void setTextLocale(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }

        static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        static Drawable[] getCompoundDrawablesRelative(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    static class Api21Impl {
        static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class Api28Impl {
        static Typeface create(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }
}
