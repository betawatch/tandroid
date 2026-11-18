package org.telegram.messenger.camera;

import a8.p0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class Size {
    public final int mHeight;
    public final int mWidth;

    public Size(int i7, int i10) {
        this.mWidth = i7;
        this.mHeight = i10;
    }

    private static NumberFormatException invalidSize(String str) {
        throw new NumberFormatException(p0.p("Invalid Size: \"", str, "\""));
    }

    public static Size parseSize(String str) {
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf < 0) {
            throw invalidSize(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (NumberFormatException unused) {
            throw invalidSize(str);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.mWidth == size.mWidth && this.mHeight == size.mHeight) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        int i7 = this.mHeight;
        int i10 = this.mWidth;
        return i7 ^ ((i10 >>> 16) | (i10 << 16));
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
