package androidx.car.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import j$.util.Objects;
import j3.r0;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class AppInfo {
    public static final String MIN_API_LEVEL_METADATA_KEY = "androidx.car.app.minCarApiLevel";
    private final int mLatestCarAppApiLevel;
    private final String mLibraryVersion;
    private final int mMinCarAppApiLevel;

    public AppInfo(int i9, int i10, String str) {
        this.mMinCarAppApiLevel = i9;
        this.mLibraryVersion = str;
        this.mLatestCarAppApiLevel = i10;
    }

    public static AppInfo create(Context context) {
        int retrieveMinCarAppApiLevel = retrieveMinCarAppApiLevel(context);
        if (retrieveMinCarAppApiLevel >= 1 && retrieveMinCarAppApiLevel <= z.a.a()) {
            return new AppInfo(retrieveMinCarAppApiLevel, z.a.a(), context.getResources().getString(R.string.car_app_library_version));
        }
        StringBuilder p6 = r0.p(retrieveMinCarAppApiLevel, "Min API level (androidx.car.app.minCarApiLevel=", ") is out of range (1-");
        p6.append(z.a.a());
        p6.append(")");
        throw new IllegalArgumentException(p6.toString());
    }

    public static int retrieveMinCarAppApiLevel(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int i9 = bundle != null ? bundle.getInt(MIN_API_LEVEL_METADATA_KEY, 0) : 0;
            if (i9 != 0) {
                return i9;
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
