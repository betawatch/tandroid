package androidx.car.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class AppInfo {
    public static final String MIN_API_LEVEL_METADATA_KEY = "androidx.car.app.minCarApiLevel";
    private final int mLatestCarAppApiLevel;
    private final String mLibraryVersion;
    private final int mMinCarAppApiLevel;

    public AppInfo(int i10, int i11, String str) {
        this.mMinCarAppApiLevel = i10;
        this.mLibraryVersion = str;
        this.mLatestCarAppApiLevel = i11;
    }

    public static AppInfo create(Context context) {
        int retrieveMinCarAppApiLevel = retrieveMinCarAppApiLevel(context);
        if (retrieveMinCarAppApiLevel >= 1 && retrieveMinCarAppApiLevel <= z.a.a()) {
            return new AppInfo(retrieveMinCarAppApiLevel, z.a.a(), context.getResources().getString(R.string.car_app_library_version));
        }
        StringBuilder l4 = i2.g.l(retrieveMinCarAppApiLevel, "Min API level (androidx.car.app.minCarApiLevel=", ") is out of range (1-");
        l4.append(z.a.a());
        l4.append(")");
        throw new IllegalArgumentException(l4.toString());
    }

    public static int retrieveMinCarAppApiLevel(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int i10 = bundle != null ? bundle.getInt(MIN_API_LEVEL_METADATA_KEY, 0) : 0;
            if (i10 != 0) {
                return i10;
            }
            throw new IllegalArgumentException("Min API level not declared in manifest (androidx.car.app.minCarApiLevel)");
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalArgumentException("Unable to read min API level from manifest");
        }
    }

    public int getLatestCarAppApiLevel() {
        return this.mLatestCarAppApiLevel;
    }

    public String getLibraryDisplayVersion() {
        String str = this.mLibraryVersion;
        Objects.requireNonNull(str);
        return str;
    }

    public int getMinCarAppApiLevel() {
        return this.mMinCarAppApiLevel;
    }

    public String toString() {
        return "Library version: [" + getLibraryDisplayVersion() + "] Min Car Api Level: [" + getMinCarAppApiLevel() + "] Latest Car App Api Level: [" + getLatestCarAppApiLevel() + "]";
    }

    private AppInfo() {
        this.mMinCarAppApiLevel = 0;
        this.mLibraryVersion = null;
        this.mLatestCarAppApiLevel = 0;
    }
}
