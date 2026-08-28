package org.telegram.messenger.camera;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class Size {
    public final int mHeight;
    public final int mWidth;

    public Size(int i9, int i10) {
        this.mWidth = i9;
        this.mHeight = i10;
    }

    private static NumberFormatException invalidSize(String str) {
        throw new NumberFormatException(aa.d.o("Invalid Size: \"", str, "\""));
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
        int i9 = this.mHeight;
        int i10 = this.mWidth;
        return i9 ^ ((i10 >>> 16) | (i10 << 16));
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
