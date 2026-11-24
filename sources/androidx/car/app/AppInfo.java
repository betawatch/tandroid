package androidx.car.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class AppInfo {
    public static final String MIN_API_LEVEL_METADATA_KEY = "androidx.car.app.minCarApiLevel";
    private final int mLatestCarAppApiLevel;
    private final String mLibraryVersion;
    private final int mMinCarAppApiLevel;

    private AppInfo() {
        this.mMinCarAppApiLevel = 0;
        this.mLibraryVersion = null;
        this.mLatestCarAppApiLevel = 0;
    }

    public static AppInfo create(Context context) {
        int retrieveMinCarAppApiLevel = retrieveMinCarAppApiLevel(context);
        if (retrieveMinCarAppApiLevel >= 1 && retrieveMinCarAppApiLevel <= ld1.b()) {
            return new AppInfo(retrieveMinCarAppApiLevel, ld1.b(), context.getResources().getString(R.string.car_app_library_version));
        }
        StringBuilder l = hg9.l(retrieveMinCarAppApiLevel, "Min API level (androidx.car.app.minCarApiLevel=", ") is out of range (1-");
        l.append(ld1.b());
        l.append(")");
        throw new IllegalArgumentException(l.toString());
    }

    public static int retrieveMinCarAppApiLevel(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int i = bundle != null ? bundle.getInt(MIN_API_LEVEL_METADATA_KEY, 0) : 0;
            if (i != 0) {
                return i;
            }
            throw new IllegalArgumentException("Min API level not declared in manifest (androidx.car.app.minCarApiLevel)");
        } catch (PackageManager.NameNotFoundException unused) {
            u36.j("Unable to read min API level from manifest");
            return 0;
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

    public AppInfo(int i, int i2, String str) {
        this.mMinCarAppApiLevel = i;
        this.mLibraryVersion = str;
        this.mLatestCarAppApiLevel = i2;
    }
}
